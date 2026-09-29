package org.ucb.generative_ie.experiments;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.LNouns;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

/**
 *
 *
 */
public class EntityNumberDistToy extends Experiment{
    public EntityNumberDistToy(){
        
    }
    
    private final static Logger logger = LoggerFactory.getLogger(EntityNumberDistToy.class);
    @Override
    public Result run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public StringBuilder showEntityWorld(World w) {
        StringBuilder output = new StringBuilder();
        for (Mention m: w.getSentences().getMentions()) {
            output.append(m.getEntity().toString());
        }
        output.append(":");
        for (Entity e: w.getEntities()) {
            List <Mention> eM = Lists.newArrayList();
            eM.addAll(w.getSentences().getMentionsByEntity(e));
            if (eM.isEmpty()) {
                output.append("{} ");
            }
            else {
                output.append("{");
                for (Mention m : eM) {
                    output.append(m.getNoun());
                    //output.append(m.getMentionId());
                    output.append(" ");
                }
                output.append("} ");
            }
        }
        return output;
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
        
        WorldGenerator generator = new WorldGenerator(rng, ents, rels, nounLexicon, lexicon, alpha, beta, sparsityGen, numSentences);

        World initialWorld = generator.sampleWorld(false);
        //show the initial world
        //initialWorld.show();
        evidence.evidenceToWorld(initialWorld);
        initialWorld.show();
        
        logger.debug("{}",showEntityWorld(initialWorld));
        

        List <Mention> mList1 = Lists.newArrayList();
        mList1.addAll(initialWorld.getSentences().getMentions());
        int i = 1;
        logger.debug("{} entities:", i);
        logger.debug("{}",showEntityWorld(initialWorld));
        

        WorldProb wp1 = new WorldProb(initialWorld);
        double logwp1 = wp1.logProbLabeledEntityWorld();
        double logProbTotal = logwp1;
        logger.debug("number: {}, pWolrd: {}", i, logwp1);
        
        Map <Integer, Double> numDistMap = Maps.newHashMap();
        //List <Double> numDist = Lists.newArrayList();
        numDistMap.put(i, logwp1);
        
        do {
            i += 1;
            int nWorld = 0;
            double pWorld = 0;
            logger.debug("{} entities:", i);
            initialWorld.getEntities().addNewEntity();
            for (Mention m1 : mList1) {
                for (Entity e1 : initialWorld.getEntities()) {
                    m1.setEntity(e1);

                    List <Mention> mList2 = Lists.newArrayList();
                    mList2.addAll(mList1);
                    mList2.remove(m1);
                    for (Mention m2 : mList2) {
                        for (Entity e2 : initialWorld.getEntities()) {
                            m2.setEntity(e2);
                            
                            List <Mention> mList3 = Lists.newArrayList();
                            mList3.addAll(mList2);
                            mList3.remove(m2);
                            for (Mention m3: mList3) {
                                for (Entity e3 : initialWorld.getEntities()) {
                                    m3.setEntity(e3);

                                    List <Mention> mList4 = Lists.newArrayList();
                                    mList4.addAll(mList3);
                                    mList4.remove(m3);
                                    for (Mention m4 : mList4) {
                                        for (Entity e4 : initialWorld.getEntities()) {
                                            m4.setEntity(e4);
                                            WorldProb wP = new WorldProb(initialWorld);
                                            pWorld = Util.logAdd(pWorld, wP.logProbLabeledEntityWorld());
                                            //logger.debug("{}:{} -> {}",showEntityWorld(initialWorld), wP.logProbLabeledEntityWorld(), pWorld);
                                            
                                            //for (Entity e: initialWorld.getEntities()) {
                                            //logger.debug(" {}", initialWorld.getSentences().nounHistogram(e));
                                            //}
                                            nWorld += 1;
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
            logger.debug("{} worlds generated ! ", nWorld);
            //pWorld = Util.logSubtract(pWorld, 1);
            logger.debug("number: {}, pWolrd: {}", i, pWorld);
            logProbTotal = Util.logAdd(logProbTotal, pWorld);
            numDistMap.put(i, pWorld);
        }while(i<50);
        logger.debug("logProTotal: {}", logProbTotal);
        
        logger.debug("The distribution of entity numbers:");
        for ( Integer num : numDistMap.keySet()) {
            double pNum = numDistMap.get(num) - logProbTotal;
            logger.debug("{} {} {}", num, pNum, Math.exp(pNum));
        }
    }
    
    public static void main(String [] args) {
        if (args.length <2){
            System.out.println("Error: please type the configuration filename and the evidence filename");
         }
        else {
            long startTime = System.nanoTime();
            
            String configFile = args[0];
            String evidenceFile = args[1];
            
            EntityNumberDistToy eNumExp = new EntityNumberDistToy();
            System.out.println("================================================================");
            System.out.println("configuration based on the file: " + configFile);
            System.out.println("extacting based on the file: " + evidenceFile);
            System.out.println("================================================================");
            
            eNumExp.runExp(configFile, evidenceFile);
            
            long elapsedTime = System.nanoTime() - startTime;
            float elapsedTimeSeconds = (float)elapsedTime/1000000000; // convert nano time to seconds

            System.out.println("Elapsed time was: " + elapsedTimeSeconds + " seconds");
            System.out.println("================================================================");
        }
    }
}
