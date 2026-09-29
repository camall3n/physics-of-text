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
        return "Entity Smart Merge and Dumb Split";
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

        private Double cachedLogProposalRatio;
        
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
                    setNull();
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
                    setNull();
                    return;
                }
                //entity1 = world.getEntities().getRandomEntities().getRandom(rng);
                //do {
                //entity2 = world.getEntities().getRandomEntities().getRandom(rng);
                //} while(entity2==entity1);
                logger.debug("current map E1: {}", mergeSamplerE1.toString());
                entity1 = mergeSamplerE1.sample(rng);
                
                double probMergeE1 = mergeSamplerE1.probKey(entity1);
                nhEntity1 = HashMultiset.create(world.getSentences().nounHistogram(entity1));
                mentionsEntity1 = Lists.newArrayList(world.getSentences().getMentionsByEntity(entity1));
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
               
                nhEntity2 = HashMultiset.create(world.getSentences().nounHistogram(entity2));
                mentionsEntity2 = Lists.newArrayList(world.getSentences().getMentionsByEntity(entity2));
                mentionsEntity.addAll(mentionsEntity2);
                countMentionsEntity2 = mentionsEntity2.size();
                countMentions = countMentionsEntity1 + countMentionsEntity2;
                // Its reverse would split an empty entity, which is a null proposal.
                if (countMentions == 0) {
                    setNull();
                    return;
                }
                
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
            return Math.exp(logStateRatio());
        }

        @Override
        public double logStateRatio() {
            if (isNull()) return 0;
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
            // This proposal uses partitions with anonymous empty entities. Its
            // original acceptance preserves pi_partition / N!, not the stated
            // entity-world target. Restore the missing count factorial: every
            // split multiplies the ratio by N+1; every merge divides by N.
            // See analysis/entity_multiplicity.md and exact partition-chain tests.
            rState += splitCase ? Math.log(newNumEntities) : -Math.log(numEntities);
            logger.debug("state ratio: {}", Math.exp(rState));
            return rState;
        }

        @Override
        public double proposalRatio() {
            return Math.exp(logProposalRatio());
        }

        @Override
        public double logProposalRatio() {
            if (isNull()) return Double.NEGATIVE_INFINITY;
            if (cachedLogProposalRatio != null) return cachedLogProposalRatio;

            // The two complementary assignments represent the same partition.
            double splitLogProbability = logSplitProposal + (1 - countMentions) * Math.log(2);
            double mergeLogProbability = logMergeProposal;
            int vocabulary = world.getWeightedNounLexicons().getNounLexicon().size();
            double mergedWeight = ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), vocabulary);

            if (splitCase) {
                double firstWeight = ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), vocabulary);
                double secondWeight = ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), vocabulary);
                double firstNormalizer = Util.logAdd(firstWeight, secondWeight);
                // Each conditional merge has the opposite child as a real candidate.
                // Start with that candidate, not log(1), including when N was one.
                double secondGivenFirstNormalizer = mergedWeight;
                double firstGivenSecondNormalizer = mergedWeight;
                for (Entity e : world.getEntities()) {
                    if (e.equals(entity)) continue;
                    Multiset<Noun> other = world.getSentences().nounHistogram(e);
                    firstNormalizer = Util.logAdd(firstNormalizer,
                            ModelFunctions.logBetaProb(other, world.getAlpha(), vocabulary));
                    Multiset<Noun> withFirst = HashMultiset.create(nhEntity1);
                    withFirst.addAll(other);
                    secondGivenFirstNormalizer = Util.logAdd(secondGivenFirstNormalizer,
                            ModelFunctions.logBetaProb(withFirst, world.getAlpha(), vocabulary));
                    Multiset<Noun> withSecond = HashMultiset.create(nhEntity2);
                    withSecond.addAll(other);
                    firstGivenSecondNormalizer = Util.logAdd(firstGivenSecondNormalizer,
                            ModelFunctions.logBetaProb(withSecond, world.getAlpha(), vocabulary));
                }
                mergeLogProbability = Util.logAdd(
                        firstWeight - firstNormalizer + mergedWeight - secondGivenFirstNormalizer,
                        secondWeight - firstNormalizer + mergedWeight - firstGivenSecondNormalizer);
            } else {
                // The reverse dumb split still selects its parent by noun likelihood.
                double normalizer = mergedWeight;
                for (Entity e : world.getEntities()) {
                    if (e.equals(entity1) || e.equals(entity2)) continue;
                    normalizer = Util.logAdd(normalizer, ModelFunctions.logBetaProb(
                            world.getSentences().nounHistogram(e), world.getAlpha(), vocabulary));
                }
                splitLogProbability += mergedWeight - normalizer;
            }
            cachedLogProposalRatio = splitCase
                    ? mergeLogProbability - splitLogProbability
                    : splitLogProbability - mergeLogProbability;
            return cachedLogProposalRatio;
        }

        @Override
        public void applyProposal() {
            if (isNull()) return;
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
                
                for (Mention mention : mentionsEntity2) {
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
