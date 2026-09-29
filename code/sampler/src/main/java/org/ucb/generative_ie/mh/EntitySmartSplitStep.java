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
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.World;

/**
 * Split and Merge proposal for entity model
 * Smart Split and Dump Merge
 */
public class EntitySmartSplitStep extends GeneralMHStep {
    
    private static int numSplitProposed;
    private static int numSplitAccepted;
    private static int numMergeProposed;
    private static int numMergeAccepted;
    public EntitySmartSplitStep(World world){
        super(world);
    }

    @Override
    public MHProposal createProposal() {
        return new EntitySmartSplitProposal(world);
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
    private final static Logger logger = LoggerFactory.getLogger(EntitySmartSplitStep.class);
    
    public class EntitySmartSplitProposal extends MHProposal {

        private Entity entity, entity1, entity2;
        private boolean splitCase, mergeCase; 
        
        private List<Mention> mentionsEntity, mentionsEntity1, mentionsEntity2;
        private int countMentionsEntity1, countMentionsEntity2, countMentions;
        
        Multiset <Noun> nhEntity, nhEntity1, nhEntity2;
        
        private int numEntities, newNumEntities;
        //private int numNonEmptyEntities, newNumNonEmptyEntities; //this is not used since the state ratio come from this part will 
        //be cancelled by proposal ratio part
        
        
        //probability for split and merge proposal
        private double logSplitProposal;
        private double logMergeProposal;

        private Double cachedLogProposalRatio;
        
        public EntitySmartSplitProposal (World world) {
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
            //logger.debug("Starting smart merge, numEntities: {}, numNonEmptyEntties: {}", numEntities, numNonEmptyEntities);
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

            double alpha_split = world.getAlpha() * 10;
            int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
            
            LogProbMap <Entity> splitSampler = new LogProbMap();
            //LogProbMap <Entity> mergeSamplerE1 = new LogProbMap();
            
            for (Entity e: world.getEntities()) {
                Multiset <Noun> hist = world.getSentences().nounHistogram(e);
                //double probMergeE1 = ModelFunctions.logBetaProb(hist, alpha_split, numNouns);
                //logger.debug("probMergeE1: {}", probMergeE1);

                double probSplitE = - ModelFunctions.logBetaProb(hist, world.getAlpha(), numNouns);
                
                //logger.debug("hist: {}", hist.toString());
                //logger.debug("probE_S, {} {}", probSplitE, e);
                //logger.debug("probE_M, {} {}", probMergeE1, e);

                splitSampler.multiplyLogKey(e, probSplitE);
                //mergeSamplerE1.multiplyLogKey(e, probMergeE1);
            }
            logger.debug("current map: {}", splitSampler.toString());
            splitSampler.normalize();
            //mergeSamplerE1.normalize();
            
            if (splitCase) {
                //sample a random e, to be updated
                //entity = world.getEntities().getRandomEntities().getRandom(rng);
                logger.debug("current map: {}", splitSampler.toString());
                entity = splitSampler.sample(rng);
                logSplitProposal += splitSampler.probKey(entity);
                
                logger.debug("Entity sampled for split: {}", entity.toString());
                logger.debug("Entity prob key: {}", splitSampler.probKey(entity));
                
                mentionsEntity.addAll(world.getSentences().getMentionsByEntity(entity));
                //logger.debug("split- before sort: {}", mentionsEntity.toString());
                Collections.sort(mentionsEntity);
                //logger.debug("split- after sort: {}", mentionsEntity.toString());
                
                countMentions = mentionsEntity.size();
                if (countMentions < 1){
                    setNull();
                    return;
                }
                
                for (Mention mention : mentionsEntity) {
                    nhEntity.add(mention.getNoun());
                }
                
                int numElement = nhEntity.elementSet().size();
                
                double probE1, probE2;
                
                int nE1 = 0;
                int nE2 = 0;
                for (Mention mention:mentionsEntity) {
                    Noun noun = mention.getNoun();
                    probE1 = (alpha_split + nhEntity1.count(noun)) / (numElement * alpha_split + nE1);
                    probE2 = (alpha_split + nhEntity2.count(noun)) / (numElement * alpha_split + nE2);
                    //normalisation
                    double probE1norm = probE1/(probE1 + probE2);
                    double probE2norm = probE2/(probE1 + probE2);
                    if (rng.nextDouble() <= probE1norm) {
                        nhEntity1.add(noun);
                        logSplitProposal += Math.log(probE1norm);
                        mentionsEntity1.add(mention);
                        nE1 += 1;
                    }
                    else {
                        nhEntity2.add(noun);
                        logSplitProposal += Math.log(probE2norm);
                        mentionsEntity2.add(mention);
                        nE2 += 1;
                    }
                }
                
                //countMentionsEntity1 = mentionsEntity1.size();
                //countMentionsEntity2 = mentionsEntity2.size();
                newNumEntities += 1;
                //newNumNonEmptyEntities += (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
                logMergeProposal = Math.log(2)-Math.log(newNumEntities) - Math.log(newNumEntities-1);
                
            }
            else if (mergeCase){
                //sample two entities randomly, the "dump merge"
                if (numEntities < 2) {
                    setNull();
                    return;
                }
                entity1 = world.getEntities().getRandomEntities().getRandom(rng);
                do {
                    entity2 = world.getEntities().getRandomEntities().getRandom(rng);
                } while(entity2==entity1);
                //logger.debug("current map E1: {}", mergeSamplerE1.toString());
                
                //double probMergeE1 = mergeSamplerE1.probKey(entity1);
                //if sampled in the other direction: entity2 first then entity1
                //double probMergeE2 = mergeSamplerE1.probKey(entity2);
                
                //logMergeProposal = Util.logAdd(probMergeE1, probMergeE2) - Math.log(numEntities);
                logMergeProposal = Math.log(2)-Math.log(numEntities) - Math.log(numEntities-1);
                
                nhEntity1 = HashMultiset.create(world.getSentences().nounHistogram(entity1));
                nhEntity2 = HashMultiset.create(world.getSentences().nounHistogram(entity2));
                
                logger.debug("Entities sampled for merge: {} and {}", entity1, entity2);
                mentionsEntity1 = Lists.newArrayList(world.getSentences().getMentionsByEntity(entity1));
                mentionsEntity2 = Lists.newArrayList(world.getSentences().getMentionsByEntity(entity2));
                
                mentionsEntity.addAll(mentionsEntity1);
                mentionsEntity.addAll(mentionsEntity2);
                // Its reverse would split an empty entity, which is a null proposal.
                if (mentionsEntity.isEmpty()) {
                    setNull();
                    return;
                }
                
                //countMentionsEntity1 = mentionsEntity1.size();
                //countMentionsEntity2 = mentionsEntity2.size();
                //countMentions = countMentionsEntity1 + countMentionsEntity2;
                
                //calculater the inverse proposal
                Collections.sort(mentionsEntity);
                                
                for (Mention mention : mentionsEntity) {
                    nhEntity.add(mention.getNoun());
                }
                
                int numElement = nhEntity.elementSet().size();
                
                double probE1, probE2;
                int nE1 = 0;
                int nE2 = 0;
                
                Multiset <Noun> histTempE1 = HashMultiset.create();
                Multiset <Noun> histTempE2 = HashMultiset.create();
                
                for (Mention mention : mentionsEntity) {
                    Noun noun = mention.getNoun();
                    probE1 = (alpha_split + histTempE1.count(noun)) / (numElement * alpha_split + nE1);
                    probE2 = (alpha_split + histTempE2.count(noun)) / (numElement * alpha_split + nE2);
                    double probEnorm;
                    if (mentionsEntity1.contains(mention)) {
                        probEnorm = probE1/(probE1 + probE2);
                        logSplitProposal += Math.log(probEnorm);
                        histTempE1.add(noun);
                        nE1 += 1;
                    }
                    else if (mentionsEntity2.contains(mention)) {
                        probEnorm = probE2/(probE1 + probE2);
                        logSplitProposal += Math.log(probEnorm);
                        histTempE2.add(noun);
                        nE2 += 1;
                    }
                }
                
                newNumEntities -= 1;
                //newNumNonEmptyEntities -= (1 - (countMentionsEntity1 ==0 || countMentionsEntity2 ==0 ? 1 : 0));
            }
            else {
                throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
            }
            
            //logger.debug("nE: {}, nE1: {}, nE2: {}", countMentions, countMentionsEntity1, countMentionsEntity2);
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

            // Either labelling of the two split parts produces the same partition.
            // Keep the sampled probability immutable: callers may inspect it twice.
            double splitLogProbability = logSplitProposal + Math.log(2);
            if (mergeCase) {
                int vocabulary = world.getWeightedNounLexicons().getNounLexicon().size();
                // The reverse sampler selects entities by INVERSE noun likelihood,
                // exactly as the forward splitSampler does. Rebuild its normalizer
                // in the merged world instead of subtracting nearly equal sums.
                double mergedWeight = -ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), vocabulary);
                double normalizer = mergedWeight;
                for (Entity e : world.getEntities()) {
                    if (e.equals(entity1) || e.equals(entity2)) continue;
                    double weight = -ModelFunctions.logBetaProb(
                            world.getSentences().nounHistogram(e), world.getAlpha(), vocabulary);
                    normalizer = Util.logAdd(normalizer, weight);
                }
                splitLogProbability += mergedWeight - normalizer;
            }
            cachedLogProposalRatio = splitCase
                    ? logMergeProposal - splitLogProbability
                    : splitLogProbability - logMergeProposal;
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
