package org.ucb.generative_ie.experiments;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.google.gson.Gson;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.*;
import org.ucb.generative_ie.mcmc.*;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.world.*;

/** Isolated, deterministic NYT research entry point. No old output directory is used. */
public final class ControlledNYT {
    public static final class Options {
        public Long seed;
        public boolean freezeArgumentEntities = false;
        public int checkpointEvery = 100;
        public double sentenceRelationMoveWeight = 0;
    }

    private static void write(Path path, String value) {
        try { Files.write(path, value.getBytes(StandardCharsets.UTF_8)); }
        catch (IOException e) { throw new RuntimeException(e); }
    }

    public static int argumentDrift(World world, List<String> initial) {
        int changed = 0, i = 0;
        for (Sentence s : world.getSentences()) {
            if (!s.getOrigin().getEnt1().getName().equals(initial.get(i++))) changed++;
            if (!s.getOrigin().getEnt2().getName().equals(initial.get(i++))) changed++;
        }
        return changed;
    }

    private static List<String> arguments(World world) {
        List<String> result = new ArrayList<>();
        for (Sentence s : world.getSentences()) {
            result.add(s.getOrigin().getEnt1().getName());
            result.add(s.getOrigin().getEnt2().getName());
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 3) throw new IllegalArgumentException("config.json corpus.json output-directory");
        final ConfigParser config = new ConfigParser(args[0]);
        final Options options;
        try (FileReader reader = new FileReader(args[0])) {
            options = new Gson().fromJson(reader, Options.class);
        }
        if (options.seed == null) throw new IllegalArgumentException("Explicit seed is required");
        if (config.numEnts < 1 || config.numRels < 1 || config.maxRels < 1
                || config.numIterations < 1 || config.stepsPerIteration < 1
                || config.entityFraction < 0 || config.entityFraction >= 1 || options.checkpointEvery < 1)
            throw new IllegalArgumentException("Invalid counts, entityFraction, or checkpointEvery");
        final Path output = Paths.get(args[2]);
        Files.createDirectories(output);
        if (Files.exists(output.resolve("initial_world_sentences.tsv")))
            throw new IllegalArgumentException("Refusing to replace an existing experiment");

        // Independent streams prevent the entity phase from consuming relation RNG draws.
        final Random initializeRng = new Random(options.seed);
        final Random entityProposalRng = new Random(options.seed ^ 0x243f6a8885a308d3L);
        final Random entityScanRng = new Random(options.seed ^ 0x13198a2e03707344L);
        final Random relationProposalRng = new Random(options.seed ^ 0xa4093822299f31d0L);
        final Random relationScanRng = new Random(options.seed ^ 0x082efa98ec4e6c89L);
        DirichletDistr.setResearchSeed(options.seed ^ 0x452821e638d01377L);

        CorpusParser parser = new CorpusParser(args[1]);
        final SentenceEvidence evidence = parser.getEvidence();
        if (options.freezeArgumentEntities && config.numEnts < parser.getNounLexicon().size())
            throw new IllegalArgumentException("Frozen verbatim arguments require at least one entity per noun");
        WorldGenerator generator = new WorldGenerator(initializeRng,
            Entities.defaultEntities(config.numEnts), Relations.defaultRelations(config.maxRels),
            parser.getNounLexicon(), parser.getLexicon(), config.alpha, config.beta,
            new ConstantSparsityGenerator(config.sparsity), evidence.numSentences());
        final World world = generator.emptyWorld();
        world.rng = initializeRng;
        world.setRelationPriorMean(config.numRels);
        if (config.sparsityA > 0) world.setSparsityPrior(config.sparsityA, config.sparsityB);
        world.setFreezeArgumentEntities(options.freezeArgumentEntities);
        evidence.evidenceToWorldByNoun(world, initializeRng);
        final List<String> initialArguments = arguments(world);
        write(output.resolve("initial_world_sentences.tsv"), ObserveProb.sentencesTsv(world));
        config.showConfig();
        parser.show();
        final int configuredEntityIterations = (int)Math.round(config.numIterations * config.entityFraction);
        final int entityIterations = options.freezeArgumentEntities ? 0 : configuredEntityIterations;
        final int relationIterations = config.numIterations - configuredEntityIterations;
        if (entityIterations > 0) {
            MCMCInferer entity = new MCMCInferer(entityIterations, world, evidence, entityProposalRng,
                new EntityInferSteps(world, evidence, config.stepsPerIteration).withScanRng(entityScanRng));
            entity.addWorldObserver(new EntityMentionsObserver(output.toString()));
            entity.run();
        }
        int synchronizationChanges = world.syncFacts();
        write(output.resolve("post_entity_world_sentences.tsv"), ObserveProb.sentencesTsv(world));
        final int postEntityDrift = argumentDrift(world, initialArguments);
        final List<Map<String,Object>> checkpoints = new ArrayList<>();
        final Path checkpointFolder = output.resolve("checkpoints");
        Files.createDirectories(checkpointFolder);
        final WorldInferSteps relationSteps = new WorldInferSteps(world, evidence, config.stepsPerIteration)
            .withScanRng(relationScanRng).withSentenceRelationMoveWeight(options.sentenceRelationMoveWeight);
        MCMCInferer relation = new MCMCInferer(relationIterations, world, evidence, relationProposalRng, relationSteps);
        relation.addWorldObserver(new RelationTriggersObserver(output.toString()));
        relation.addWorldObserver(new ObserveProb(output.toString()));
        relation.addWorldObserver(new WorldObserver() {
            @Override public void observe(World sampled, int iteration) {
                int drift = argumentDrift(sampled, initialArguments);
                if (options.freezeArgumentEntities && drift != 0)
                    throw new IllegalStateException("Frozen argument assignment changed: " + drift);
                if ((iteration + 1) % options.checkpointEvery != 0 && iteration + 1 != relationIterations) return;
                Map<String,Object> item = new LinkedHashMap<>();
                item.put("relation_iteration", iteration + 1);
                item.put("changed_argument_mentions_from_initial", drift);
                item.put("entities", sampled.getNumEntities());
                item.put("facts", sampled.getFacts().size());
                item.put("expressed_facts", sampled.getSentences().numReferencedFacts());
                item.put("occupied_relations", sampled.numOccupiedRelations());
                item.put("expressed_relations", sampled.getSentences().numRelationsWithSentences());
                item.put("log_joint", new WorldProb(sampled).logProb());
                checkpoints.add(item);
                write(output.resolve("checkpoints.json"), new Gson().toJson(checkpoints));
                write(checkpointFolder.resolve(String.format("sentences_%06d.tsv", iteration + 1)), ObserveProb.sentencesTsv(sampled));
                List<String> facts = new ArrayList<>();
                for (Fact f : sampled.getFacts()) facts.add(f.toString());
                java.util.Collections.sort(facts);
                write(checkpointFolder.resolve(String.format("facts_%06d.json", iteration + 1)), new Gson().toJson(facts));
            }
        });
        relation.run();
        write(output.resolve("final_world_sentences.tsv"), ObserveProb.sentencesTsv(world));
        Map<String,Object> summary = new LinkedHashMap<>();
        summary.put("seed", options.seed);
        summary.put("freezeArgumentEntities", options.freezeArgumentEntities);
        summary.put("entity_iterations", entityIterations);
        summary.put("relation_iterations", relationIterations);
        summary.put("entity_proposals", (long)entityIterations * config.stepsPerIteration);
        summary.put("relation_proposals", (long)relationIterations * config.stepsPerIteration);
        summary.put("post_entity_changed_argument_mentions", postEntityDrift);
        summary.put("final_changed_argument_mentions", argumentDrift(world, initialArguments));
        summary.put("synchronization_changes", synchronizationChanges);
        summary.put("acceptance_report", RelationSplitMergeStep.acceptanceReport());
        summary.put("sentenceRelationMoveWeight", options.sentenceRelationMoveWeight);
        summary.put("sentence_relation_move_report", relationSteps.sentenceRelationMoveReport());
        write(output.resolve("summary.json"), new Gson().toJson(summary));
        System.out.println(new Gson().toJson(summary));
    }
}
