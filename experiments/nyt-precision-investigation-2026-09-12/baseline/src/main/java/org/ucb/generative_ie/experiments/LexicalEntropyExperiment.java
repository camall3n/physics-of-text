package org.ucb.generative_ie.experiments;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.PrecisionRecallCurve;
import org.ucb.generative_ie.inference.QueryResult;
import org.ucb.generative_ie.inference.SentenceSameRelationQuery;
import org.ucb.generative_ie.mcmc.WorldInferSteps;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.LexEntropy;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SampleEntropy;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.UnorderedSentencePair;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Figure 1 of the paper: precision/recall of "do these two sentences express the same
 * relation" as a function of the lexical entropy of the relations' dictionaries.
 *
 * Port of the commented-out SampleEntropyTest (2013) to the current model. Worlds are
 * sampled from the generative model with two relations and five dependency paths;
 * those whose dictionaries have lexical entropy in [e, e + 0.05) for e in
 * 0.1, 0.3, 0.5, 0.7, 0.9 are used as ground truth, eight per bin. For each, inference
 * runs on the sentences alone and the posterior probability that each pair of
 * sentences shares a relation is scored against the truth.
 *
 * Usage: LexicalEntropyExperiment out.json [worldsPerBin=8] [iterations=2000] [stepsPerIteration=10]
 * Plot with scripts/graph_precision_recall.py (or plot_precision_recall.py, python3).
 */
public class LexicalEntropyExperiment {

    static class SingleRun {
        public double entropy;
        public List<Double> precisions;
        public List<Double> recalls;
    }

    public static void main(String[] args) {
        String outFile = args.length > 0 ? args[0] : "prec_recall.out";
        int worldsPerBin = args.length > 1 ? Integer.parseInt(args[1]) : 8;
        int numIterations = args.length > 2 ? Integer.parseInt(args[2]) : 2000;
        int stepsPerIteration = args.length > 3 ? Integer.parseInt(args[3]) : 10;
        double[] entropies = {0.1, 0.3, 0.5, 0.7, 0.9};

        Random rng = new Random(20130601);
        int numEntities = 10, numRelations = 2, numTriggers = 5, numSentences = 60;
        double sparsity = 0.3, alpha = 0.01, beta = 0.5;
        // identity nouns: each entity is named by one noun, as in the original experiment
        // where the arguments were the objects themselves; alpha only matters for inference.
        WorldGenerator generator = new WorldGenerator(rng, Entities.defaultEntities(numEntities),
                Relations.defaultRelations(numRelations), NounLexicon.defaultNounLexicon(numEntities),
                Lexicon.defaultLexicon(numTriggers), alpha, beta, new ConstantSparsityGenerator(sparsity), numSentences)
                .withIdentityNouns();

        System.out.println("Sampling worlds and binning by lexical entropy...");
        SampleEntropy sampler = new SampleEntropy(generator, 5000);

        Map<String, List<SingleRun>> allResults = Maps.newLinkedHashMap();
        for (double entropy : entropies) {
            Collection<World> bin = sampler.getEntropySubset(entropy, entropy + 0.05);
            List<SingleRun> runs = Lists.newArrayList();
            for (World godWorld : Iterables.limit(bin, worldsPerBin)) {
                SingleRun run = infer(godWorld, generator, rng, numIterations, stepsPerIteration);
                runs.add(run);
                System.out.println(String.format("entropy bin %.1f (actual %.3f): %d sentences, precision at last point %.3f",
                        entropy, run.entropy, godWorld.getSentences().size(), run.precisions.get(run.precisions.size() - 1)));
            }
            System.out.println(String.format("entropy bin %.1f: %d of %d candidate worlds used", entropy, runs.size(), bin.size()));
            allResults.put(String.valueOf(entropy), runs);
        }
        Util.writeJsonToFile(outFile, allResults);
        System.out.println("Wrote " + outFile);
    }

    static SingleRun infer(World godWorld, WorldGenerator generator, Random rng, int numIterations, int stepsPerIteration) {
        SentenceEvidence evidence = new SentenceEvidence(godWorld);
        World world = generator.emptyWorld();
        evidence.evidenceToWorldByNoun(world, rng);

        // truth by sentence index: evidenceToWorldByNoun adds sentences in evidence order
        List<Sentence> godSentences = godWorld.getSentences().asList();
        List<Sentence> sentences = world.getSentences().asList();
        int n = sentences.size();

        MCMCInferer inferer = new MCMCInferer(numIterations, world, evidence, rng, new WorldInferSteps(world, evidence, stepsPerIteration));
        List<SentenceSameRelationQuery> queries = Lists.newArrayList();
        List<Boolean> truths = Lists.newArrayList();
        int numRelevant = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                queries.add(new SentenceSameRelationQuery(new UnorderedSentencePair(sentences.get(i), sentences.get(j))));
                boolean same = godSentences.get(i).getOrigin().getRel().equals(godSentences.get(j).getOrigin().getRel());
                truths.add(same);
                if (same) {
                    numRelevant++;
                }
            }
        }
        inferer.addQueries(queries);
        QueryResult results = inferer.run(numIterations / 4);

        PrecisionRecallCurve curve = new PrecisionRecallCurve(numRelevant);
        for (int k = 0; k < queries.size(); k++) {
            curve.add(truths.get(k), results.get(queries.get(k)).percentTrue());
        }
        SingleRun run = new SingleRun();
        run.entropy = LexEntropy.entropy(godWorld);
        run.precisions = curve.precision();
        run.recalls = curve.recall();
        return run;
    }
}
