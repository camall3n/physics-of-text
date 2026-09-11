package org.ucb.generative_ie.experiments;

import java.util.Random;

import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.ObserveProb;
import org.ucb.generative_ie.inference.RelationTriggersObserver;
import org.ucb.generative_ie.inference.WorldObserver;
import org.ucb.generative_ie.mcmc.WorldInferSteps;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class NYTExperiment extends Experiment {

    public Result run(){
        throw new RuntimeException("Unimplemented");
    }
//
//    public void runExp(String filename) {
//        Random rng = new Random();
//
//        int numIterations = 10000;
//
//        SparsityGenerator sparsityGen = new ConstantSparsityGenerator(0.0001);
//        double alpha = 0.1;
//
//        CorpusParser parser = new CorpusParser(filename);
//        Relations rels = Relations.defaultRelations(100);
//        SentenceEvidence evidence = parser.getEvidence();
//        Nouns nouns = parser.getNouns();
//        Lexicon lexicon = parser.getLexicon();
//
//        int numSentences = evidence.numSentences();
//
//        System.out.println("Nouns: " + nouns.size());
//        System.out.println("Lexicon: " + lexicon.size());
//        System.out.println("Arg Pairs: " + evidence.uniqueArgs().size());
//        System.out.println("Sentences: " + numSentences);
//
//        WorldGenerator generator = new WorldGenerator(rng, nouns, rels, lexicon, sparsityGen, alpha, numSentences);
//
//        World initialWorld = generator.sampleWorld(false);
//        evidence.makeWorldPossible(initialWorld);
//
//        WorldObserver printTrigger = new RelationTriggersObserver();
//        ObserveProb observeProb = new ObserveProb("output/coach_naive/");
//
//        MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence, new MHSteps(initialWorld, evidence, true));
//        //mcmcInferer.addWorldObserver(printTrigger);
//        mcmcInferer.addWorldObserver(observeProb);
//        mcmcInferer.run();
//
//        return;
//    }
//
//    public static void main( String[] args) {
//        if (args[0] == null){
//            System.out.println("Error: please type a string");
//        }
//        else {
//
//            String filename = args[0];
//            NYTExperiment nytExp = new NYTExperiment();
//            System.out.println("extacting based on the file: " + filename);
//            nytExp.runExp(filename);
//        }
//    }
}
