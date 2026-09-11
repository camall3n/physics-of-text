package org.ucb.generative_ie.mh;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

/**
 * Restricted Gibbs Merge Split Jain & Neal 2004
 * Applied to the symbol-based entity resolution model
 */
public class EntityRGMSStep extends GeneralMHStep {
    private int nInterGibbs;
    private int nCompleteGibbs;
    private static int numSplitProposed;
    private static int numSplitAccepted;
    private static int numMergeProposed;
    private static int numMergeAccepted;
    
    public EntityRGMSStep(World world, int nGibbs, int nCompleteGibbs){
        super(world);
        this.nInterGibbs = nGibbs;
        this.nCompleteGibbs = nCompleteGibbs;
    }
    
    public EntityRGMSStep(World world){
        super(world);
        this.nInterGibbs = 5; // default value
        this.nCompleteGibbs = 1; // default value
    }

    @Override
    public MHProposal createProposal() {
        return new EntityRGMSProposal(world, nInterGibbs);
    }

    @Override
    public String getStepKind() {
        return "Entity Resolution - Restricted Gibbs Merge Split";
    }
    
    @Override
    public double sample(Random rng) {
        super.sample(rng);
        for (int iC = 0; iC < nCompleteGibbs; iC ++) {
            logger.debug("complete gibbs");
                sampleCompleteGibbs(rng);
        }
        //logger.info("acceptance ratio: {}", acceptanceRatio());
        //logger.info("acceptance ratio for split: {}", acceptanceRatioSplit());        
        //logger.info("acceptance ratio for merge: {}", acceptanceRatioMerge());

        return 0;
    }
    
    public static double acceptanceRatio(){
        if (numMergeProposed + numSplitProposed >0) {
            return (double)(numMergeAccepted + numSplitAccepted)/(numMergeProposed + numSplitProposed);
        }
        else
            return 0.0;
    }
    
    public static double acceptanceRatioSplit() {
        if (numSplitProposed >0) {
            return (double)(numSplitAccepted)/(numSplitProposed);
        }
        else
            return 0.0;
    }
    
    public static double acceptanceRatioMerge() {
        if (numMergeProposed>0) {
            return (double)(numMergeAccepted)/(numMergeProposed);
        }
        else
            return 0.0;
    }
    
    public void sampleCompleteGibbs(Random rng){
            List <Mention> mentions = world.getSentences().getMentions();
            
            for(int im = 0; im< mentions.size(); im++){
                Mention mention = mentions.get(im);
                HashSet <Entity> otherEntities = Sets.newHashSet();
                Map <Entity, Multiset <Noun>> otherNounLexicon = Maps.newHashMap();
                
                for (Entity e : world.getEntities()) {
                    otherEntities.add(e);
                    otherNounLexicon.put(e, HashMultiset.create(world.getSentences().nounHistogram(e)));
                }
                
                logger.trace("Ignoring mention {} with noun: {}", mention.toString(), mention.getNoun());
                otherNounLexicon.get(mention.getEntity()).remove(mention.getNoun());
                                
                LogProbMap <Entity> sampler = new LogProbMap <Entity>() {};
                //System.out.println("sampling");
                //double logProb0 = mentions.logProb();
                for (Entity entity: world.getEntities()) {
                    
                    if (! world.getWeightedLexicons().containsKey(entity)) {
                        
                        Multiset <Noun> nouns = world.getSentences().nounHistogram(entity);
                        double [] alphas = world.getWeightedNounLexicons().convertToWeights(nouns, world.getAlpha());
                        double [] newweights = DirichletDistr.dirichlet(alphas);
                        
                        world.getWeightedNounLexicons().put(entity, new WeightedNounLexicon(world.getWeightedNounLexicons().getNounLexicon(), newweights));
                        //world.getWeightedNounLexicons().get(entity).setWeights(newweights);
                        //wnlex.setWeights(newweights);
                    }
                    WeightedNounLexicon wnlex = world.getWeightedNounLexicons().get(entity);
                    
                    int nCount = otherNounLexicon.get(entity).count(mention.getNoun());
                    int nAllCount = otherNounLexicon.get(entity).size();
                    double alpha = world.getAlpha();
                    int numNouns = wnlex.getNounLexicon().size();
                    //otherNounLexicon.get(entity).sizeCurrent();
                    //System.out.println(String.format("nCount %d, nAll, %d", nCount, nAllCount));
                    
                    double probNounGivenEntity = (nCount + alpha) / (alpha * numNouns + nAllCount);
                    //double probNounGivenEntity;
                    //if (nCount == 0) {
                    //    probNounGivenEntity = (alpha) / (alpha * numNouns + nAllCount);
                    //}
                    //else {
                    //    probNounGivenEntity = (nCount) / (alpha * numNouns + nAllCount);
                    //}
                    
                    
                    //the probability of this given entity
                    //double probEntityGivenNoun;
                    //probEntityGivenNoun = probNounGivenEntity * mentions.probEntity(entity);
                    
                    sampler.multiplyKey(entity, probNounGivenEntity);
                    //sampler.multiplyKey(entity, probEntityGivenNoun);
                    
                    //double probNounGivenE = (nCount + alpha) / (alpha * numNouns + nAllCount);
                    
                    //sampler.multiplyKey(entity, probNounGivenE);
                    
                    //show the probabilities of each posssible entity
                    //System.out.println(String.format("Entity %s Nouns %s Prob %f", entity, mention.getNoun(), probNounGivenE));
                    //sampler.multiplyKey(entity, 0.5);
                }
                Entity e;
                e = sampler.sample(rng);
                //System.out.println(String.format("New sampled entity %s for String %s", e, mention.getNoun()));
                //or (int i=0;i<100;i++) {
                //   Entity e;
                //   e =  sampler.sample(rng);
                //   System.out.println(e);
                //
                Entity oldEntity = mention.getEntity();
                mention.setEntity(e);
                logger.trace("current mentions: \n {}", world.getSentences().showMentions());
                logger.trace("MentionRV: mentions updated");
                logger.trace("Mention size of the previous entity: {}", world.getSentences().getMentionsByEntity(oldEntity).size());
                
                //the part is commented since we should allow empty entities in entity world, so that the entity number does not change in gibbs sampling
                if (world.getSentences().getMentionsByEntity(oldEntity).size()<1) {
                    world.getEntities().removeEntity(oldEntity);
                    world.getSentences().cleanEntity(oldEntity);
                }
                logger.trace("current mentions: \n {}", world.getSentences().showMentions());
                logger.trace("MentionRV: mentions cleaned");
                //mentions.add(mention);
            }
    }
    
    private final static Logger logger = LoggerFactory.getLogger(EntityRGMSStep.class);
    
    public class EntityRGMSProposal extends MHProposal {
        
        private int numIntermGibbs; // number of intermediate Gibbs sampling
        //private int numMHupdates; // number of MH updates
        //private int numGibbs; // number of complete Gibbs scans
        
        private Entity entity1, entity2;
        private Mention mention1, mention2;

        private boolean splitCase; 
        
        private List<Mention> mentionsEntity, mentionsEntity1, mentionsEntity2;
        //private int countMentionsEntity1, countMentionsEntity2, countMentions;
        
        Multiset <Noun> nhEntity, nhEntity1, nhEntity2;
        
        private int numEntities, newNumEntities;
        //private int numNonEmptyEntities, newNumNonEmptyEntities;
        
        
        //probability for split and merge proposal
        private double logSplitProposal;
        private double logMergeProposal;
        
        public EntityRGMSProposal(World world, int nGibbs){
            super(world);
            this.numIntermGibbs = nGibbs;
            splitCase = true;
            mentionsEntity = Lists.newArrayList();
            mentionsEntity1 = Lists.newArrayList();
            mentionsEntity2 = Lists.newArrayList();
            
            nhEntity = HashMultiset.create();
            nhEntity1 = HashMultiset.create();
            nhEntity2 = HashMultiset.create();
            
            numEntities = world.getNumEntities();
            //numNonEmptyEntities = world.getSentences().getNonEmptyEntitySize();
            
            newNumEntities = numEntities;
            //newNumNonEmptyEntities = numNonEmptyEntities;
            
            logSplitProposal = 0.0;
            logMergeProposal = 0.0;
        }

        @Override
        public void sample(Random rng) {
            mention1 = world.getSentences().getRandomMention(rng);
            do{
                mention2 = world.getSentences().getRandomMention(rng);
            }while(mention2 == mention1);
            
            entity1 = mention1.getEntity();
            entity2 = mention2.getEntity();
            
            if (entity1 != entity2) {
                splitCase = false;
            }

            logger.debug("propsing, split: {}", splitCase);
            Multiset <Noun> nhLaunch1 = HashMultiset.create();
            Multiset <Noun> nhLaunch2 = HashMultiset.create();

            //check number of nouns for each entity
            int nounCount = 0;
            for (Entity e: world.getEntities()) {
                nounCount += world.getSentences().nounHistogram(e).size();
                logger.debug("current noun count e {}: {}", e.toString(), world.getSentences().nounHistogram(e).toString());
            }
            logger.debug("current noun count TOTAL: {}", nounCount);
            
            if(splitCase) {
                numSplitProposed ++;
                mentionsEntity.addAll(world.getSentences().getMentionsByEntity(entity1));
                if (mentionsEntity.size() < 2){
                    return;
                }
            }
            else {//merge
                numMergeProposed ++;
                if (numEntities <2) {
                    return;
                }
                mentionsEntity1.addAll(world.getSentences().getMentionsByEntity(entity1));
                //mentionsEntity.addAll(world.getSentences().getMentionsByEntity(entity1));
                mentionsEntity.addAll(mentionsEntity1);
                //for(Mention mention : mentionsEntity1) {
                //    nhEntity1.add(mention.getNoun());
                //}
                
                mentionsEntity2.addAll(world.getSentences().getMentionsByEntity(entity2));
                //mentionsEntity.addAll(world.getSentences().getMentionsByEntity(entity2));
                mentionsEntity.addAll(mentionsEntity2);
                      
                //for(Mention mention : mentionsEntity2) {
                //    nhEntity2.add(mention.getNoun());
                //}          
                
                logger.debug("mentions1: {}", mentionsEntity1.toString());
                logger.debug("mentions2: {}", mentionsEntity2.toString());
            }
            
            logger.debug("mentions: {}", mentionsEntity.toString());
            
            //
            //preparing the launch state
            //
            //random assignment of mentions to two different entities, nouns in nhE1 and nhE2 respectively
            nhLaunch1.add(mention1.getNoun());
            nhLaunch2.add(mention2.getNoun());
            for (Mention mention: mentionsEntity) {
                nhEntity.add(mention.getNoun());
                if (mention == mention1 || mention == mention2) {
                    continue;
                }
                if(rng.nextBoolean()) {
                    nhLaunch1.add(mention.getNoun());
                }
                else{
                    nhLaunch2.add(mention.getNoun());
                }
            }

            //logger.debug("nh1: {}", nhEntity1.toString());
            //logger.debug("nh2: {}", nhEntity2.toString());
            //nhEntity.addAll(nhEntity1);
            //nhEntity.addAll(nhEntity2);
            
            
            //n Restricted Gibbs sampling
            double alpha_r = world.getAlpha();
            
            int nResElements = nhEntity.elementSet().size();
            
            logger.debug("nh: {}", nhEntity.toString());
            
            int iR = 0;
            do {
                Multiset<Noun> nhIter1 = HashMultiset.create(nhLaunch1);
                Multiset<Noun> nhIter2 = HashMultiset.create(nhLaunch2);
                
                //logger.debug("Restricted Gibbs sampling {}", iR);
                //logger.debug("nh1: {}", nhIter1.toString());
                //logger.debug("nh2: {}", nhIter2.toString());
                for (Noun noun : nhIter1) {
                    //logger.debug("1: noun {}", noun);
                    nhLaunch1.remove(noun);
                    sampleRestrictedGibbs(nhLaunch1, nhLaunch2, noun, nResElements, alpha_r, rng);
                    //logger.debug("new launch 1: {}", nhLaunch1.toString());
                    //logger.debug("new launch 2: {}", nhLaunch2.toString());
                }
                
                for (Noun noun : nhIter2) {
                    //logger.debug("2: noun {}", noun);
                    nhLaunch2.remove(noun);
                    sampleRestrictedGibbs(nhLaunch1, nhLaunch2, noun, nResElements, alpha_r, rng);
                    //logger.debug("new launch 1: {}", nhLaunch1.toString());
                    //logger.debug("new launch 2: {}", nhLaunch2.toString());
                }
            }while(iR++ < numIntermGibbs);
            
            //split and merge using launch state
            if (splitCase) {
                for (Mention mention : mentionsEntity) {
                    double prob1 = sampleFinalGibbs(nhLaunch1, nhLaunch2, mention.getNoun(), nResElements, alpha_r);
                    if (rng.nextDouble() < prob1) {
                        mentionsEntity1.add(mention);
                        nhEntity1.add(mention.getNoun());
                        logSplitProposal += Math.log(prob1);
                    }
                    else {
                        mentionsEntity2.add(mention);
                        nhEntity2.add(mention.getNoun());
                        logSplitProposal += Math.log((1-prob1));
                    }
                }
                //countMentionsEntity1 = mentionsEntity1.size();
                //countMentionsEntity2 = mentionsEntity2.size();
                newNumEntities += 1;
                //newNumNonEmptyEntities += (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
            }
            else{
                for (Mention mention: mentionsEntity) {
                    double prob1 = sampleFinalGibbs(nhLaunch1, nhLaunch2, mention.getNoun(), nResElements, alpha_r);
                    if (mentionsEntity1.contains(mention)) {
                        nhEntity1.add(mention.getNoun());
                        logSplitProposal += Math.log(prob1);
                    }
                    else if (mentionsEntity2.contains(mention)) {
                        nhEntity2.add(mention.getNoun());
                        logSplitProposal += Math.log((1-prob1));
                    }
                }
                //countMentionsEntity1 = mentionsEntity1.size();
                //countMentionsEntity2 = mentionsEntity2.size();
                newNumEntities -= 1;
                //newNumNonEmptyEntities -= (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
            }
            logger.debug("nh1: {}", nhEntity1.toString());
            logger.debug("nh2: {}", nhEntity2.toString());
            
            
            //split-merge procedure done
            
            //complete Gibbs sampling
            logger.debug("E1: {}", mentionsEntity1.toString());
            logger.debug("E2: {}", mentionsEntity2.toString());
            logger.debug("E: {}", mentionsEntity.toString());
            
            logger.debug("split or merge to check:");
            logger.debug("E1: {}", nhEntity1.toString());
            logger.debug("E2: {}", nhEntity2.toString());
            logger.debug("E: {}", nhEntity.toString());
           
             
        }
       
        public void sampleRestrictedGibbs(Multiset<Noun> nh1, Multiset<Noun> nh2, Noun noun, int nResElements, double alpha, Random rng) {
            double prob1 = (nh1.count(noun) + alpha)/(nh1.size() + nResElements*alpha);
            double prob2 = (nh2.count(noun) + alpha)/(nh2.size() + nResElements*alpha);
            //logger.debug("prob1: {}, prob2: {}", prob1, prob2);
            
            if (rng.nextDouble() <= prob1/(prob1+prob2))
            {
                nh1.add(noun);
                //logger.debug("assignment to entity 1");
            }
            else{
                nh2.add(noun);
                //logger.debug("assignment to entity 2");
            }
        }
        
        public double sampleFinalGibbs(Multiset<Noun> nh1, Multiset<Noun> nh2, Noun noun, int nResElements, double alpha) {
            double prob1 = (nh1.count(noun) + alpha)/(nh1.size() + nResElements*alpha);
            double prob2 = (nh2.count(noun) + alpha)/(nh2.size() + nResElements*alpha);
            return prob1/(prob1+prob2);
        }
        
        @Override
        public double stateRatio() {
            double rState = 0.0;
            
            int sizeMentionsAll = world.getSentences().getMentions().size();
        
            rState += (Math.log(world.getEntities().getLogNormalEntityDensity(newNumEntities)) - Math.log(world.getEntities().getLogNormalEntityDensity(numEntities)));
            logger.debug("state ratio part1: {}", Math.exp(rState));
            rState += ( sizeMentionsAll * Math.log((double)numEntities/newNumEntities));
            logger.debug("state ratio part2: {}", Math.exp(rState));
            
            int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
            double oldState = 0.0, newState = 0.0;
        
            if (splitCase) {
                oldState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
            }
            else{
                //nhEntity1 = world.getSentences().nounHistogram(entity1);
                //nhEntity2 = world.getSentences().nounHistogram(entity2);
                oldState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
                oldState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
            }
           
            logger.debug("old state: {}, new state: {}", Math.exp(oldState), Math.exp(newState));
            rState += (newState - oldState);
            logger.debug("state ratio: {}", Math.exp(rState));
            return Math.exp(rState);
        }

        @Override
        public double proposalRatio() {
            double rProposal = Math.exp(logMergeProposal - logSplitProposal);
            logger.debug("splitProposal: {} , mergeProposal: {}", logSplitProposal, logMergeProposal);
            if (splitCase){
                logger.debug("proposal ratio: {}", rProposal);
                return rProposal;
            }
            else{
                logger.debug("proposal ratio: {}", 1.0/rProposal);
                return 1.0/rProposal;
            }
        }

        @Override
        public void applyProposal() {
            if (splitCase) {
                numSplitAccepted ++;
                Entity newEntity = world.getEntities().addNewEntity();
                for (Mention mention: mentionsEntity1)
                    mention.setEntity(newEntity);
            }
            else {
                numMergeAccepted ++;
                logger.debug("E1: {}", mentionsEntity1.toString());
                logger.debug("E2: {}", mentionsEntity2.toString());
                logger.debug("E: {}", mentionsEntity.toString());

                logger.debug("hist e {}: {}", entity1.toString(), world.getSentences().nounHistogram(entity1));
                logger.debug("hist e {}: {}", entity2.toString(), world.getSentences().nounHistogram(entity2));
                
                for (Mention mention : mentionsEntity) {
                    if (!mentionsEntity1.contains(mention))
                        mention.setEntity(entity1);
                }
                world.getEntities().removeEntity(entity2);
                world.getSentences().cleanEntity(entity2);
                
                logger.debug("new hist e {}: {}", entity1.toString(), world.getSentences().nounHistogram(entity1));
                logger.debug("new hist e {}: {}", entity2.toString(), world.getSentences().nounHistogram(entity2));
            }
           
            
        }
        
        
    }
}