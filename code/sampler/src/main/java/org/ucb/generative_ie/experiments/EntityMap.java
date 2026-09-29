package org.ucb.generative_ie.experiments;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.EntityMentionsObserver;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.ObserveProb;
import org.ucb.generative_ie.inference.WorldObserver;
import org.ucb.generative_ie.mcmc.EntityInferSteps;
import org.ucb.generative_ie.mcmc.MCMCSteps;
import org.ucb.generative_ie.mh.EntityRGMSStep;
import org.ucb.generative_ie.mh.EntitySmartMergeStep;
import org.ucb.generative_ie.mh.EntitySmartSplitStep;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mentions;
import org.ucb.generative_ie.world.LNouns;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class EntityMap extends Experiment {

    @Override
    public Result run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void runExp(String configfile, String evidencefile){
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
        
        Entities ents = Entities.defaultEntities(numEnts);
        Relations rels = Relations.defaultRelations(numRels);
         
        CorpusParser parser = new CorpusParser(evidencefile);
        SentenceEvidence evidence = parser.getEvidence();
        Nouns nouns = parser.getNouns();
        Lexicon lexicon = parser.getLexicon();
        NounLexicon nounLexicon = parser.getNounLexicon();
        LNouns lNouns = new LNouns(evidence.getNounList());
        
        int numSentences = evidence.numSentences();
        int numNouns = evidence.numNounList();

        parser.show();
        //String filename = "/home/wei/Work/PLUIE/Experiments/pluie/bootstrap_inference/sampler/data/06-19/pluieTriples-3.json";
        //EntityCorpusParser entityParser = new EntityCorpusParser(evidencefile);
        //lNouns = entityParser.getLNouns();
        //nouns = entityParser.getNouns();
       
        //System.out.println(lNouns.sizeCurrent());
        //System.out.println(nouns.sizeCurrent());
        WorldGenerator generator = new WorldGenerator(rng, ents, rels, nounLexicon, lexicon, alpha, beta, sparsityGen, numSentences);

        World initialWorld = generator.sampleWorld(false);
        //show the initial world
        //initialWorld.show();
        evidence.evidenceToWorld(initialWorld);
        initialWorld.show();
        
        //WorldObserver printTrigger = new RelationTriggersObserver("output/");
        WorldObserver printMentions = new EntityMentionsObserver("output-m"+Integer.toString(numSentences*2) + "-i" +numIterations+"/");
        ObserveProb observeProb = new ObserveProb("output-m"+ Integer.toString(numSentences*2) + "-i" +numIterations+"/");

        //MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence, new MHSteps(initialWorld, evidence, true));
        int numSteps = 1;
        
        long startTimeIteration = System.nanoTime();

        MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence, rng, new EntityInferSteps(initialWorld, evidence, numSteps));
        mcmcInferer.addWorldObserver(printMentions);
        //mcmcInferer.addWorldObserver(printTrigger);
        mcmcInferer.addWorldObserver(observeProb);
        mcmcInferer.run();
        
        long runningTime = System.nanoTime() - startTimeIteration;
        float msecondsPerIteration = (float)(runningTime/1000000)/numIterations; // convert nano time to milliseconds
        
        System.out.println("Inference time per iteration is: " + msecondsPerIteration + " milliseconds");
        //Mentions initialAssignment = new Mentions(ents, lNouns);
        //initialAssignment.randomAssignment();
        //System.out.println("Initial Assignment");
        //System.out.println(initialAssignment);
        //for (Entity e: initialAssignment.getEntities()) {
        //    //sampledMentions.mentionsWithEntity(e);
        //    System.out.println(String.format("%s %s", e, initialAssignment.nounsWithEntity(e)));
        //}
        ////for (Mention m:initialAssignment){
        ////    System.out.println(m);
        ////}
        //
        ////System.out.println(initialAssignment);
        //EntityObserveProb eObserveProb = new EntityObserveProb("output/entity_resolution/MapExp");
        //
        //EntityInferer entityInferer = new EntityInferer(numIterations, initialAssignment);
        //        
        ////for (WeightedNounLexicons mentions:entityInferer){
        ////    System.out.println(mentions);
        ////}
       //
        //entityInferer.addEntityObserver(eObserveProb);
        //entityInferer.run();
        
        //WorldGenerator generator = new WorldGenerator(rng, nouns, rels, lexicon, sparsityGen, alpha, numSentences);
//
        //World initialWorld = generator.sampleWorld(false);
        //evidence.makeWorldPossible(initialWorld);
//
        //WorldObserver printTrigger = new RelationTriggersObserver();
        //ObserveProb observeProb = new ObserveProb("output/alpha1-rel100/");
//
        //MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence, new MHSteps(initialWorld, evidence, true));
        ////mcmcInferer.addWorldObserver(printTrigger);
        //mcmcInferer.addWorldObserver(observeProb);
        //mcmcInferer.run();
        
        //System.out.println("initial Assigement");
        //System.out.println(initialAssignment);
        //for (Entity e: initialAssignment.getEntities()) {
        //    //sampledMentions.mentionsWithEntity(e);
        //    System.out.println(String.format("%s %s", e, initialAssignment.nounsWithEntity(e)));
        //}
        //return;
    }
  
    public static void main( String[] args) {
        
         if (args.length <2){
            System.out.println("Error: please type the configuration filename and the evidence filename");
         }
        else {
            long startTime = System.nanoTime();
            
            String configFile = args[0];
            String evidenceFile = args[1];
            
            EntityMap eMapExp = new EntityMap();
            System.out.println("================================================================");
            System.out.println("configuration based on the file: " + configFile);
            System.out.println("extacting based on the file: " + evidenceFile);
            System.out.println("================================================================");
            
            eMapExp.runExp(configFile, evidenceFile);
            
            long elapsedTime = System.nanoTime() - startTime;
            float elapsedTimeSeconds = (float)elapsedTime/1000000000; // convert nano time to seconds
            
            System.out.println("RGMS Acceptance Ratio: " + EntityRGMSStep.acceptanceRatio());
            System.out.println("RGMS Acceptance Ratio for Split: " + EntityRGMSStep.acceptanceRatioSplit());
            System.out.println("RGMS Acceptance Ratio for Merge: " + EntityRGMSStep.acceptanceRatioMerge());
            
            System.out.println("SmartSplit DumbMerge Acceptance Ratio: " + EntitySmartSplitStep.acceptanceRatio());
            System.out.println("SmartSplit DumbMerge Acceptance Ratio for Split: " + EntitySmartSplitStep.acceptanceRatioSplit());
            System.out.println("SmartSplit DumbMerge Acceptance Ratio for Merge: " + EntitySmartSplitStep.acceptanceRatioMerge());
            
            System.out.println("SmartMerge DumbSplit Acceptance Ratio: " + EntitySmartMergeStep.acceptanceRatio());
            System.out.println("SmartMerge DumbSplit Acceptance Ratio for Split: " + EntitySmartMergeStep.acceptanceRatioSplit());
            System.out.println("SmartMerge DumbSplit Acceptance Ratio for Merge: " + EntitySmartMergeStep.acceptanceRatioMerge());
            
            System.out.println("Elapsed time was: " + elapsedTimeSeconds + " seconds");
            System.out.println("================================================================");
        }
    }    
}