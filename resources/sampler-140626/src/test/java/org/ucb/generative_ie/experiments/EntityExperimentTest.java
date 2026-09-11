package org.ucb.generative_ie.experiments;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.junit.Test;

import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.EntityInferer;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.ObserveProb;
import org.ucb.generative_ie.inference.RelationTriggersObserver;
import org.ucb.generative_ie.inference.WorldObserver;
import org.ucb.generative_ie.mh.MHSteps;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.LNouns;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class EntityExperimentTest {

    @Test
    public void test(){
        //throw new RuntimeException("Unimplemented");
        Random rng = new Random();
        
        int numIterations = 10000;
        int numEntities = 37;
        boolean toy = true;
        if (toy) {
            numIterations = 50;
            numEntities = 4;
        }
        
        Entities ents = Entities.defaultEntities(numEntities);
        //for(Entity e:ents){
        //    System.out.println(e);
        //}
        
        LNouns lNouns = new LNouns();
        Nouns nouns = new Nouns();
       
        if (toy) {            
           // toy test
            List <String> toyRef = Lists.newArrayList();
            
            toyRef.add("Obama");
            toyRef.add("Obama");
            toyRef.add("Obama");
            toyRef.add("Gates");
            toyRef.add("Gates");
            toyRef.add("Gates");
            toyRef.add("Gates");
            toyRef.add("Foo");
            //toyRef.add("Foo");
            //toyRef.add("Foo");
            //toyRef.add("Bar");
            toyRef.add("Bar");
            //toyRef.add("X");
            //toyRef.add("Y");
            
            List <Noun> listNoun = Lists.newArrayList();
            for (String s: toyRef){
                listNoun.add(new Noun(s));
                nouns.add(new Noun(s));
            }
            
            lNouns = new LNouns(listNoun);
        }
        else {
        //String filename="/home/wei/Work/PLUIE/Experiments/pluie/bootstrap_inference/sampler/data/Umass-sub-corpus-06-12/pluieTriples_2013_06_12_3.json";
        
            //String filename = "/home/wei/Work/PLUIE/Experiments/pluie/bootstrap_inference/sampler/data/06-19/pluieTriples_fgreptest4.json";
            String filename = "/home/wei/Work/PLUIE/Experiments/pluie/bootstrap_inference/sampler/data/06-19/pluieTriples-3.json";
            EntityCorpusParser entityParser = new EntityCorpusParser(filename);
            lNouns = entityParser.getLNouns();
            nouns = entityParser.getNouns();
        }
        System.out.println(lNouns.size());
        System.out.println(nouns.size());

        
        ////Mentions initialAssignment = new WeightedNounLexicons(ents, lNouns);
        ////initialAssignment.randomAssignment();   
        
        
        //System.out.println(initialAssignment);
        //for (Entity e: initialAssignment.getEntities()) {
        //    //sampledMentions.mentionsWithEntity(e);
        //    System.out.println(String.format("%s %s", e, initialAssignment.nounsWithEntity(e)));
        //}
        //for (Mention m:initialAssignment){
        //    System.out.println(m);
        //}
        
        //System.out.println(initialAssignment);
        
        ////EntityInferer entityInferer = new EntityInferer(numIterations, initialAssignment);
                
        //for (WeightedNounLexicons mentions:entityInferer){
        //    System.out.println(mentions);
        //}
        
        ////entityInferer.run();
        
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

        return ;
    }
  
    public void runExp(String filename) {
        Random rng = new Random();
        
        int numIterations = 1000;

        SparsityGenerator sparsityGen = new ConstantSparsityGenerator(0.0001);
        double alpha = 0.1;

        CorpusParser parser = new CorpusParser(filename);
        Relations rels = Relations.defaultRelations(100);
        SentenceEvidence evidence = parser.getEvidence();
        Nouns nouns = parser.getNouns();
        Lexicon lexicon = parser.getLexicon();

        int numSentences = evidence.numSentences();

        System.out.println("Random: " + rng);
        System.out.println("Nouns: " + nouns.size());
        System.out.println("Lexicon: " + lexicon.size());
        System.out.println("Arg Pairs: " + evidence.uniqueArgs().size());
        System.out.println("Sentences: " + numSentences);


        ////WorldGenerator generator = new WorldGenerator(rng, nouns, rels, lexicon, sparsityGen, alpha, numSentences);

        ////World initialWorld = generator.sampleWorld(false);
        ////evidence.makeWorldPossible(initialWorld);
////
        ////WorldObserver printTrigger = new RelationTriggersObserver();
        ////ObserveProb observeProb = new ObserveProb("output/alpha1-rel100/");
////
        ////MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence, new MHSteps(initialWorld, evidence, true));
        //////mcmcInferer.addWorldObserver(printTrigger);
        ////mcmcInferer.addWorldObserver(observeProb);
        ////mcmcInferer.run();

        return;
    }

    public static void main( String[] args) {
        if (args[0] == null){
            System.out.println("Error: please type a string");
        }
        else {
            long startTime = System.nanoTime();
                     
            
            String filename = args[0];
            EntityExperimentTest nytExp = new EntityExperimentTest();
            System.out.println("extacting based on the file: " + filename);
            nytExp.runExp(filename);
            
            long elapsedTime = System.nanoTime() - startTime;
            float elapsedTimeSeconds = (float)elapsedTime/1000000000; // convert nano time to seconds
            System.out.println("Elapsed time was: " + elapsedTimeSeconds + " seconds");
        }
    }
}

