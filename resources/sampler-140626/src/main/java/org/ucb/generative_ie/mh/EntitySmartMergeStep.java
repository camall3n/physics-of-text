package org.ucb.generative_ie.mh;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.World;

/**
 * Split and Merge proposal for entity model
 * Smart Merge and Dump Split
 */
public class EntitySmartMergeStep extends GeneralMHStep {
    private static int numSplitProposed;
    private static int numSplitAccepted;
    private static int numMergeProposed;
    private static int numMergeAccepted;
    
    public EntitySmartMergeStep(World world){
        super(world);
    }

    @Override
    public MHProposal createProposal() {
        return new EntitySmartMergeProposal(world);
    }

    @Override
    public String getStepKind() {
        return "Entity Smart Split and Dump Merge";
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
    
    private final static Logger logger = LoggerFactory.getLogger(org.ucb.generative_ie.mh.EntitySmartMergeStep.class);
    
    public class EntitySmartMergeProposal extends MHProposal {

        private Entity entity, entity1, entity2;
        private boolean splitCase, mergeCase; 
        
        private List<Mention> mentionsEntity, mentionsEntity1, mentionsEntity2;
        private int countMentionsEntity1, countMentionsEntity2, countMentions;
        
        Multiset <Noun> nhEntity, nhEntity1, nhEntity2;
        
        private int numEntities, newNumEntities;
        //private int numNonEmptyEntities, newNumNonEmptyEntities;
        
        
        //probability for split and merge proposal
        private double logSplitProposal;
        private double logMergeProposal;

        //the sum of the probability of mentions for all entities
        private double probLogMergeTotal;
        private double probLogSplitTotal;
        
        public EntitySmartMergeProposal (World world) {
            super(world);
            splitCase = false;
            mergeCase = false;
            
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
            
            logSplitProposal = 0;
            logMergeProposal = 0;
            
            probLogMergeTotal = 0;
            probLogSplitTotal = 0;
        }
        
        @Override
        public void sample(Random rng) {
            logger.debug("---------------------------");
            //logger.debug("Starting smart split, numEntities: {}, numNonEmptyEntties: {}", numEntities, numNonEmptyEntities);
            logger.debug("current mentions: \n {}", world.getSentences().showMentionsLazily());

            if(rng.nextBoolean()){
                splitCase = true;
                numSplitProposed ++;
            }
            else {
                mergeCase = true;
                numMergeProposed ++;
            }
            //splitCase =false;
            //mergeCase = true;
            //logger.debug("split={} merge={}, newNumEntities={}, newNumNonEmptyEntities={}", splitCase, mergeCase, newNumEntities, newNumNonEmptyEntities);            
            
            //check number of nouns for each entity
            int nounCount = 0;
            for (Entity e: world.getEntities()) {
                nounCount += world.getSentences().nounHistogram(e).size();
                logger.debug("current noun count e {}: {}", e.toString(), world.getSentences().nounHistogram(e).toString());
            }
            logger.debug("current noun count TOTAL: {}", nounCount);

            double alpha = world.getAlpha();
            int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
            
            //LogProbMap <Entity> splitSampler = new LogProbMap();
            LogProbMap <Entity> mergeSamplerE1 = new LogProbMap();
            
            for (Entity e: world.getEntities()) {
                Multiset <Noun> hist = world.getSentences().nounHistogram(e);
                double probMergeE1 = ModelFunctions.logBetaProb(hist, alpha, numNouns);

                //double probSplitE = - ModelFunctions.logBetaProb(hist, alpha, numNouns);
                
                //logger.debug("hist: {}", hist.toString());
                //logger.debug("probE_S, {} {}", probSplitE, e);
                //logger.debug("probE_M, {} {}", probMergeE1, e);

                //splitSampler.multiplyLogKey(e, probSplitE);
                mergeSamplerE1.multiplyLogKey(e, probMergeE1);
            }
            //logger.debug("current map: {}", splitSampler.toString());
            //splitSampler.normalize();
            //logger.debug("current map E1, unnormalized: {}", mergeSamplerE1.toString());
            mergeSamplerE1.normalize();
            //logger.debug("current map E1, normalized : {}", mergeSamplerE1.toString());
            //probLogSplitTotal = splitSampler.getNorm();
            probLogMergeTotal = mergeSamplerE1.getNorm();
            probLogSplitTotal = probLogMergeTotal;
            logger.debug("proLogSplitTotal : {}, proLogMergeTotal: {}", probLogSplitTotal, probLogMergeTotal);
            
            if (splitCase) {
                //sample a random e, to be updated
                //entity = world.getEntities().getRandomEntities().getRandom(rng);
                
                //sample from mergeSampler distribution, which means to choose the finest entity to split
                entity = mergeSamplerE1.sample(rng);
                logger.debug("Entity sampled for split: {}", entity.toString());
                
                double probSplitE = mergeSamplerE1.probKey(entity);
                logSplitProposal += probSplitE;
                
                mentionsEntity.addAll(world.getSentences().getMentionsByEntity(entity));
                countMentions = mentionsEntity.size();
                if (countMentions < 1){
                    return;
                }
                for (Mention mention : mentionsEntity) {
                    nhEntity.add(mention.getNoun());
                    if (rng.nextBoolean()) {
                        mentionsEntity1.add(mention);
                        nhEntity1.add(mention.getNoun());
                    }
                    else{
                        mentionsEntity2.add(mention);
                        nhEntity2.add(mention.getNoun());
                    }
                }
                countMentionsEntity1 = mentionsEntity1.size();
                countMentionsEntity2 = mentionsEntity2.size();
                //countMentionsEntity1 = rng.nextInt(countMentions);
                //countMentionsEntity2 = countMentions - countMentionsEntity1;
                logger.debug("split point: {} and {} in {}", countMentionsEntity1, countMentionsEntity2, countMentions);
                
                
                //mentionsEntity1 = RandomUtil.sample(mentionsEntity, countMentionsEntity1, rng);
                //for (Mention mention : mentionsEntity1) {
                //    nhEntity1.add(mention.getNoun());
                //}
                //for (Mention mention : mentionsEntity) {
                //    if ( ! mentionsEntity1.contains(mention)){
                //        //System.out.print(String.format("Mention in the 2nd part: %s\n", mention.toString()));
                //        mentionsEntity2.add(mention);
                //        nhEntity2.add(mention.getNoun());
                //    }
                //}
                
                
                newNumEntities += 1;
                //newNumNonEmptyEntities += (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
            }
            else if (mergeCase){
                if (numEntities < 2) {
                    return;
                }
                //entity1 = world.getEntities().getRandomEntities().getRandom(rng);
                //do {
                //entity2 = world.getEntities().getRandomEntities().getRandom(rng);
                //} while(entity2==entity1);
                logger.debug("current map E1: {}", mergeSamplerE1.toString());
                entity1 = mergeSamplerE1.sample(rng);
                
                double probMergeE1 = mergeSamplerE1.probKey(entity1);
                nhEntity1 = world.getSentences().nounHistogram(entity1);
                mentionsEntity1 = world.getSentences().getMentionsByEntity(entity1);
                mentionsEntity.addAll(mentionsEntity1);                
                countMentionsEntity1 = mentionsEntity1.size();
                logger.debug("probE1: {}", probMergeE1);
                LogProbMap <Entity> mergeSamplerE1E2 = new LogProbMap();
                                
                for (Entity e : world.getEntities()) {
                    if (e == entity1)
                        continue;
                    Multiset <Noun> histE2 = world.getSentences().nounHistogram(e);
                    Multiset <Noun> histTemp = HashMultiset.create();
                    histTemp.addAll(nhEntity1);
                    histTemp.addAll(histE2);
                    double probMergeE2m = ModelFunctions.logBetaProb(histTemp, alpha, numNouns);
                    mergeSamplerE1E2.multiplyLogKey(e, probMergeE2m);
                }
                mergeSamplerE1E2.normalize();
                logger.debug("current map E2 given E1: {}", mergeSamplerE1E2.toString());
                entity2 = mergeSamplerE1E2.sample(rng);
                logger.debug("Entities sampled for merge: {} and {}", entity1, entity2);
                double probMergeE1E2 = mergeSamplerE1E2.probKey(entity2);
                logger.debug("probE2 given E1: {}", probMergeE1E2);
               
                nhEntity2 = world.getSentences().nounHistogram(entity2);                
                mentionsEntity2 = world.getSentences().getMentionsByEntity(entity2);
                mentionsEntity.addAll(mentionsEntity2);
                countMentionsEntity2 = mentionsEntity2.size();
                countMentions = countMentionsEntity1 + countMentionsEntity2;
                
                for (Mention m:mentionsEntity) {
                    nhEntity.add(m.getNoun());
                }
                
                double p1 = probMergeE1 + probMergeE1E2; // p(E1)*P(E2|E1)
                
                logger.debug("prob of E1-E1E2: {}", p1);
                
                //if sampled in the other direction: entity2 first then entity1
                ////the inverse
                double probMergeE2 = mergeSamplerE1.probKey(entity2);
                //nhEntity2 =  world.getSentences().nounHistogram(entity2);
                logger.debug("probE2: {}", probMergeE2);
                LogProbMap <Entity> mergeSamplerE2E1 = new LogProbMap();
                                
                for (Entity e : world.getEntities()) {
                    if (e == entity2)
                        continue;
                    Multiset <Noun> histE1 = world.getSentences().nounHistogram(e);
                    Multiset <Noun> histTemp = HashMultiset.create();
                    histTemp.addAll(nhEntity2);
                    histTemp.addAll(histE1);
                    double probMergeE1m = ModelFunctions.logBetaProb(histTemp, alpha, numNouns);
                    mergeSamplerE2E1.multiplyLogKey(e, probMergeE1m);
                }
                mergeSamplerE2E1.normalize();
                logger.debug("current map E1 given E2: {}", mergeSamplerE2E1.toString());
                double probMergeE2E1 = mergeSamplerE2E1.probKey(entity1);
                logger.debug("prob of E1 given E2: {}", probMergeE2E1);
                double p2 = probMergeE2 + probMergeE2E1;
                logger.debug("prob of E2-E2E1: {}", p2);
                logMergeProposal = Util.logAdd(p1, p2);
                
                logger.debug("prob of merge proposal: {}", logMergeProposal);
                newNumEntities -= 1;
                //newNumNonEmptyEntities -= (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
            }
            else {
                throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
            }
            
            logger.debug("nE: {}, nE1: {}, nE2: {}", countMentions, countMentionsEntity1, countMentionsEntity2);
            logger.debug("E1: {}", mentionsEntity1.toString());
            logger.debug("E2: {}", mentionsEntity2.toString());
            logger.debug("E: {}", mentionsEntity.toString());
            
            logger.debug("split or merge to check:");
            logger.debug("E1: {}", nhEntity1.toString());
            logger.debug("E2: {}", nhEntity2.toString());
            logger.debug("E: {}", nhEntity.toString());
        }

        @Override
        public double stateRatio() {
            double rState = 0.0;
            int sizeMentionsAll = world.getSentences().getMentions().size();
        
            rState += (Math.log(world.getEntities().getLogNormalEntityDensity(newNumEntities)) - Math.log(world.getEntities().getLogNormalEntityDensity(numEntities)));
            logger.debug("state ratio part1: {}", Math.exp(rState));
            rState += ( sizeMentionsAll * Math.log((double)numEntities/newNumEntities));
            logger.debug("state ratio part2: {}", Math.exp(rState));
            //this part is ignored because it will be cancelled by the proposal ratio
            //logger.debug("state ratio part2: {}", Math.exp(rState));
            //rState += (Util.logPermutation(newNumEntities, newNumNonEmptyEntities) - Util.logPermutation(numEntities, numNonEmptyEntities));
        
            //the shape
            //if (splitCase) {
            //    rState += (Util.logFactorial(countMentions) - Util.logFactorial(countMentionsEntity1) - Util.logFactorial(countMentionsEntity2));
            //}
            //else if (mergeCase) {
            //    rState -= (Util.logFactorial(countMentions) - Util.logFactorial(countMentionsEntity1) - Util.logFactorial(countMentionsEntity2));
            //}
            //logger.debug("state ratio part shape: {}", Math.exp(rState));

            int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
            double oldState = 0.0, newState = 0.0;
        
            if (splitCase) {
                oldState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
            }
            else if (mergeCase) {
                //nhEntity1 = world.getSentences().nounHistogram(entity1);
                //nhEntity2 = world.getSentences().nounHistogram(entity2);
                oldState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
                oldState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
                newState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
            }
            else {
                throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
            }
        
            logger.debug("old state: {}, new state: {}", Math.exp(oldState), Math.exp(newState));
            rState += (newState - oldState);
            logger.debug("state ratio: {}", Math.exp(rState));
            return Math.exp(rState);
        }

        @Override
        public double proposalRatio() {
            logger.debug("---proposal ratio----");
            double rProposal = 1.0;
            logSplitProposal += Math.log(2);
            logSplitProposal -= countMentions * Math.log(2);
            //logSplitProposal += Math.log(1.0/(countMentions+1));
            //logSplitProposal -= Util.logCombination(countMentions, countMentionsEntity1);
            
            logger.debug("probMergeTotal: {}", probLogMergeTotal);
            int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
            double probE = ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
            double probE1 = ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
            double probE2 = ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
            logger.debug("probE: {}, probE1: {}, probE2: {}", probE, probE1, probE2);
            
            if (splitCase){
                //logSplitProposal -= Math.log(numEntities);
                
                //calculater the inverse proposal in splitCase
                probLogMergeTotal = Util.logSubtract(probLogMergeTotal, probE);
                logger.debug("probMergeTotal -pE: {}", probLogMergeTotal);
                probLogMergeTotal = Util.logAdd(probLogMergeTotal, probE1);
                logger.debug("probMergeTotal +pE1: {}", probLogMergeTotal);
                probLogMergeTotal = Util.logAdd(probLogMergeTotal, probE2);
                logger.debug("probMergeTotal +pE2: {}", probLogMergeTotal);
                
                double probMergeE1 = probE1 - probLogMergeTotal;
                double probMergeE2 = probE2 - probLogMergeTotal;
                
                logger.debug("probMergeE1: {}", probMergeE1);
                logger.debug("probMergeE2: {}", probMergeE2);
                
                double probLogMergeTotalE1_E2 = 0;
                for (Entity e: world.getEntities()) {
                    if (e == entity)
                        continue;
                    Multiset <Noun> histE2m = world.getSentences().nounHistogram(e);
                    Multiset <Noun> histTemp = HashMultiset.create();
                    histTemp.addAll(nhEntity1);
                    histTemp.addAll(histE2m);
                    double probMergeE2m = ModelFunctions.logBetaProb(histTemp, world.getAlpha(), numNouns);
                    logger.debug("probMerge2m: {}", probMergeE2m);
                    if (probLogMergeTotalE1_E2 ==0) {
                        probLogMergeTotalE1_E2 = probMergeE2m;
                    }
                    else{
                        probLogMergeTotalE1_E2 = Util.logAdd(probLogMergeTotalE1_E2, probMergeE2m);
                    }
                    logger.debug("probLogMergeTotalE1_E2: {}", probLogMergeTotalE1_E2);
                    //logger.debug("probLogMergeTotalE1_E2 add: {}", Util.logAdd(probLogMergeTotalE1_E2, probMergeE2m));
                }
                probLogMergeTotalE1_E2 = Util.logAdd(probLogMergeTotalE1_E2, probE);
                logger.debug("probLogMergeTotalE1_E2: {}", probLogMergeTotalE1_E2);
                
                double probLogMergeTotalE2_E1 = 0;
                for (Entity e: world.getEntities()) {
                    if (e == entity)
                        continue;
                    Multiset <Noun> histE1m = world.getSentences().nounHistogram(e);
                    Multiset <Noun> histTemp = HashMultiset.create();
                    histTemp.addAll(nhEntity2);
                    histTemp.addAll(histE1m);
                    double probMergeE1m = ModelFunctions.logBetaProb(histTemp, world.getAlpha(), numNouns);
                    logger.debug("probMergeE1m: {}", probMergeE1m);
                    if (probLogMergeTotalE2_E1 == 0) {
                        probLogMergeTotalE2_E1 = probMergeE1m;
                    }
                    else{
                        probLogMergeTotalE2_E1 = Util.logAdd(probLogMergeTotalE2_E1, probMergeE1m);
                    }
                    logger.debug("probLogMergeTotalE2_E1: {}", probLogMergeTotalE2_E1);
                }
                probLogMergeTotalE2_E1 = Util.logAdd(probLogMergeTotalE2_E1, probE);
                logger.debug("probLogMergeTotalE2_E1: {}", probLogMergeTotalE2_E1);
                 
                double pE1 = probMergeE1 + probE - probLogMergeTotalE1_E2;
                double pE2 = probMergeE2 + probE - probLogMergeTotalE2_E1;
                
                logger.debug("split, inverse merge: pE1: {}, pE1E2: {}", probMergeE1, probE - probLogMergeTotalE1_E2);
                logger.debug("split, inverse merge: pE2: {}, pE2E1: {}", probMergeE2, probE - probLogMergeTotalE2_E1);
                logMergeProposal = Util.logAdd(pE1, pE2);
                
                //logMergeProposal = Util.logAdd(probMergeE1, probMergeE2 ) - Math.log(newNumEntities-1);
                rProposal = Math.exp(logMergeProposal - logSplitProposal);
                //rProposal *= 1.0/(numEntities-1);
                //rProposal *= 1.0/Math.exp(logSplitProposal);
            }
            else if (mergeCase) {
                
                
                probLogSplitTotal = Util.logSubtract(probLogSplitTotal, probE1);
                probLogSplitTotal = Util.logSubtract(probLogSplitTotal, probE2);
                probLogSplitTotal = Util.logAdd(probLogSplitTotal, probE);
                
                logger.debug("probLogSplitTotal: {}", probLogSplitTotal);
                double pSplitE = probE - probLogSplitTotal;
                logger.debug("merge proposal, inverse split prob: {}", pSplitE);
                //logger.debug("pSplitE: {}", pSplitE);
                //logSplitProposal += pSplitE;
                //logSplitProposal += Math.log(2);
                //logSplitProposal -= Math.log(newNumEntities);
                logSplitProposal += pSplitE;
                rProposal = Math.exp(logSplitProposal - logMergeProposal);
                //rProposal *= (numEntities -1);
                //rProposal *= Math.exp(logSplitProposal);
            }
            else {
                 throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
            }
            logger.debug("splitProposal: {} , mergeProposal: {}", logSplitProposal, logMergeProposal);
            logger.debug("proposal ratio: {}", rProposal);
            return rProposal;
        }

        @Override
        public void applyProposal() {
            if (splitCase) {
                numSplitAccepted ++;
                Entity newEntity = world.getEntities().addNewEntity();
                for (Mention mention: mentionsEntity1)
                    mention.setEntity(newEntity);
            }
            else if (mergeCase) {
                numMergeAccepted ++;
                //logger.debug("hist e {}: {}", entity1.toString(), world.getSentences().nounHistogram(entity1));
                //logger.debug("hist e {}: {}", entity2.toString(), world.getSentences().nounHistogram(entity2));
                
                for (Mention mention : mentionsEntity) {
                    if (!mentionsEntity1.contains(mention))
                        mention.setEntity(entity1);
                }
                world.getEntities().removeEntity(entity2);
                world.getSentences().cleanEntity(entity2);
                
                //logger.debug("new hist e {}: {}", entity1.toString(), world.getSentences().nounHistogram(entity1));
                //logger.debug("new hist e {}: {}", entity2.toString(), world.getSentences().nounHistogram(entity2));
            }
            else
                throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
        }
    
    }
}
