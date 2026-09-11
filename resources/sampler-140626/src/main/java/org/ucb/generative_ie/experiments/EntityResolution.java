package org.ucb.generative_ie.experiments;

import java.util.Random;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.EntityMentionsObserver;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.ObserveProb;
import org.ucb.generative_ie.inference.RelationTriggersObserver;
import org.ucb.generative_ie.inference.WorldObserver;
import org.ucb.generative_ie.mcmc.EntityInferSteps;
import org.ucb.generative_ie.mcmc.WorldInferSteps;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class EntityResolution extends Experiment {
    @Override
    public Result run(){
        throw new RuntimeException("Unimplemented");
    }

    public void runExp(String configfile, String evidencefile) {
        
        Random rng = new Random();
        ConfigParser config = new ConfigParser(configfile);
        config.showConfig();
        
        int numRels = config.numRels;
        int numEnts = config.numEnts;
        int numIterations = config.numIterations;
        double alpha = config.alpha;
        double beta = config.beta;
        double sparsity = config.sparsity;
        
        SparsityGenerator sparsityGen = new ConstantSparsityGenerator(sparsity);

        Relations rels = Relations.defaultRelations(numRels);
        Entities ents = Entities.defaultEntities(numEnts);
        
        CorpusParser parser = new CorpusParser(evidencefile);
        SentenceEvidence evidence = parser.getEvidence();
        Nouns nouns = parser.getNouns();
        Lexicon lexicon = parser.getLexicon();
        NounLexicon nounLexicon = parser.getNounLexicon();

        int numSentences = evidence.numSentences();

        parser.show();

        WorldGenerator generator = new WorldGenerator(rng, ents, rels, nounLexicon, lexicon, alpha, beta, sparsityGen, numSentences);

        World initialWorld = generator.sampleWorld();
        //show the initial world
        //initialWorld.show();
        evidence.evidenceToWorld(initialWorld);
        initialWorld.show();
        
        WorldObserver printTrigger = new RelationTriggersObserver("output/");
        WorldObserver printMentions = new EntityMentionsObserver("output/");
        ObserveProb observeProb = new ObserveProb("output/");

        int numSteps = 50;
        int numIterEntity = numIterations/5;
        int numIterRelation = numIterations - numIterEntity;
        MCMCInferer entityInferer = new MCMCInferer(numIterEntity, initialWorld, evidence, rng, new EntityInferSteps(initialWorld, evidence, numSteps));
        entityInferer.addWorldObserver(printMentions);
        //mcmcInferer.addWorldObserver(printTrigger);
        //entityInferer.addWorldObserver(observeProb);
        entityInferer.run();
        
        initialWorld.show();
        
        MCMCInferer mcmcInferer = new MCMCInferer(numIterRelation, initialWorld, evidence, rng, new WorldInferSteps(initialWorld, evidence, numSteps));
        //mcmcInferer.addWorldObserver(printMentions);
        mcmcInferer.addWorldObserver(printTrigger);
        mcmcInferer.addWorldObserver(observeProb);
        initialWorld.show();
        mcmcInferer.run();

        initialWorld.show();
    }

    public static void main( String[] args) {
        if (args.length <2){
            System.out.println("Error: please type the configuration filename and the evidence filename");
        }
        else {
            long startTime = System.nanoTime();
            
            String configFile = args[0];
            String evidenceFile = args[1];
            
            EntityResolution nytExp = new EntityResolution();
            System.out.println("================================================================");
            System.out.println("configuration based on the file: " + configFile);
            System.out.println("extacting based on the file: " + evidenceFile);
            System.out.println("================================================================");
            nytExp.runExp(configFile, evidenceFile);
            
            long elapsedTime = System.nanoTime() - startTime;
            float elapsedTimeSeconds = (float)elapsedTime/1000000000; // convert nano time to seconds

            System.out.println("Elapsed time was: " + elapsedTimeSeconds + " seconds");
            System.out.println("================================================================");
        }
    }
}
