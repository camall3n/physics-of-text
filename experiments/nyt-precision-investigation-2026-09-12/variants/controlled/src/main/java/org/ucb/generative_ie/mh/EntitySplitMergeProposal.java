package org.ucb.generative_ie.mh;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.World;

/**
 * Split and Merge MH proposal for entity model
 *
 */
public class EntitySplitMergeProposal extends MHProposal {
    private boolean splitCase, mergeCase;
    Entity entity;
    Entity entity1, entity2;
    private List<Mention> mentionsEntity, mentionsEntity1, mentionsEntity2;
    Multiset <Noun> nhEntity, nhEntity1, nhEntity2;
    private int countMentions;
    private int countMentionsEntity1, countMentiosnEntity2;
    private int numEntities, newNumEntities;
    private int numNonEmptyEntities, newNumNonEmptyEntities;

    private final static Logger logger = LoggerFactory.getLogger(EntitySplitMergeProposal.class);
    
    public EntitySplitMergeProposal(World world){
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
        newNumEntities = numEntities;
        
        numNonEmptyEntities = world.getSentences().getNonEmptyEntitySize();
        newNumNonEmptyEntities = numNonEmptyEntities;                
    }
    
    @Override
    public void sample(Random rng) {
        logger.debug("---------------------------");
        logger.debug("Starting split/merge, numEntities: {}, numNonEmptyEntties: {}", numEntities, numNonEmptyEntities);
        if (rng.nextBoolean()) {
            splitCase = true;
        }
        else {
            mergeCase = true;
        }

        if (splitCase) {
            entity = world.getEntities().getRandomEntities().getRandom(rng);
            mentionsEntity = world.getSentences().getMentionsByEntity(entity);
            countMentions = mentionsEntity.size();

            countMentionsEntity1 = (countMentions==0 ? 0: rng.nextInt(countMentions)); // a random integer from 0 to N
            countMentiosnEntity2 = countMentions - countMentionsEntity1;
            
            if (countMentionsEntity1>0)
                mentionsEntity1 = RandomUtil.sample(mentionsEntity, countMentionsEntity1, rng);

            for (Mention mention : mentionsEntity) {
                if ( ! mentionsEntity1.contains(mention)){
                    mentionsEntity2.add(mention);
                }
            }
            newNumEntities += 1;
            newNumNonEmptyEntities += (1 - (countMentionsEntity1 ==0 || countMentiosnEntity2 ==0 ? 1 : 0));
        }
        else if (mergeCase) {
            entity1 = world.getEntities().getRandomEntities().getRandom(rng);
            do {
                entity2 = world.getEntities().getRandomEntities().getRandom(rng);
            } while(entity2==entity1);
            mentionsEntity1 = world.getSentences().getMentionsByEntity(entity1);
            mentionsEntity2 = world.getSentences().getMentionsByEntity(entity2);
            countMentionsEntity1 = mentionsEntity1.size();
            countMentiosnEntity2 = mentionsEntity2.size();
            countMentions = countMentionsEntity1 + countMentiosnEntity2;
            mentionsEntity.addAll(mentionsEntity1);
            mentionsEntity.addAll(mentionsEntity2);
            
            newNumEntities -= 1;
            newNumNonEmptyEntities -= (1 - (countMentionsEntity1 ==0 || countMentiosnEntity2 ==0 ? 1 : 0));
        }
        else {
            throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
        }
        logger.debug("split={} merge={}, newNumEntities={}, newNumNonEmptyEntities={}", splitCase, mergeCase, newNumEntities, newNumNonEmptyEntities);
        logger.debug("nE: {}, nE1: {}, nE2: {}", countMentions, countMentionsEntity1, countMentiosnEntity2);
        logger.debug("E1: {}", mentionsEntity1.toString());
        logger.debug("E2: {}", mentionsEntity2.toString());
        logger.debug("E: {}", mentionsEntity.toString());

        
    }

    @Override
    public double stateRatio() {
        //pi(w) = prob(K) (1/K)^N Permutation^I_K Product_k {Beta(alpha_k+N_k)/Beta(alpha_k)}
        
        //split 
        // pi(y)/pi(x) = prob(K_y)/prob(K_x) (K_x/K_y)^N (Permutation^I_y _K_y/Permutation^I_x _K_x)
        //               * {Beta(alpha_e1 + N_e1)/ Beta(alpha_e1)} 
        //               * {Beta(alpha_e2 + N_e2)/ Beta(alpha_e2)}
        //               / {Beta(alpha_e + N_e)/ Beta(alpha_e)}
        
        //merge
        //pi(y)/pi(x) = prob(K_y)/prob(K_x) (K_x/K_y)^N (Permutation^I_y _K_y/Permutation^I_x _K_x)
        //               * {Beta(alpha_e + N_e)/ Beta(alpha_e)}
        //               / {Beta(alpha_e1 + N_e1)/ Beta(alpha_e1)} 
        //               / {Beta(alpha_e2 + N_e2)/ Beta(alpha_e2)}

        double rState = 0.0;
        int sizeMentionsAll = world.getSentences().getMentions().size();
        
        rState += (Math.log(world.getEntities().getLogNormalEntityDensity(newNumEntities)) - Math.log(world.getEntities().getLogNormalEntityDensity(numEntities)));
        logger.debug("state ratio part1: {}", Math.exp(rState));
        rState += ( sizeMentionsAll * Math.log((double)numEntities/newNumEntities));
        logger.debug("state ratio part2: {}", Math.exp(rState));
        rState += (Util.logPermutation(newNumEntities, newNumNonEmptyEntities) - Util.logPermutation(numEntities, numNonEmptyEntities));
        
        logger.debug("state ratio part3: {}", Math.exp(rState));
        int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
        double oldState = 0.0, newState = 0.0;
        
        if (splitCase) {
            nhEntity = world.getSentences().nounHistogram(entity);
            logger.debug("hist: {}", nhEntity.toString());
            oldState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
            
            for (Mention mention : mentionsEntity1) {
                nhEntity1.add(mention.getNoun());
            }
            newState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
            
            for (Mention mention : mentionsEntity2) {
                nhEntity2.add(mention.getNoun());
            }
            newState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
        }
        else if (mergeCase) {
           
            nhEntity1 = world.getSentences().nounHistogram(entity1);
            nhEntity2 = world.getSentences().nounHistogram(entity2);
            oldState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
            oldState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);
            
            for(Mention mention : mentionsEntity) {
                nhEntity.add(mention.getNoun());
            }
            
            newState += ModelFunctions.logBetaProb(nhEntity, world.getAlpha(), numNouns);
        }
        else {
            throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
        }
        
        rState += (newState - oldState);
        logger.debug("state ratio: {}", Math.exp(rState));
        return Math.exp(rState);
    }

    @Override
    public double proposalRatio() {
        double rProposal = 1.0;
        if (splitCase){
            rProposal = numEntities*(countMentions +1)*Math.exp(Util.logCombination(countMentions, countMentionsEntity1))/(newNumEntities * (newNumEntities-1));
        }
        else {
            rProposal = (numEntities * (numEntities-1))/(newNumEntities*(countMentions +1)*Math.exp(Util.logCombination(countMentions, countMentionsEntity1)));
        }
        logger.debug("proposal ratio: {}", rProposal);
        return rProposal;
    }

    @Override
    public void applyProposal() {
        if (splitCase) {
            Entity newEntity = world.getEntities().addNewEntity();
            for (Mention mention: mentionsEntity1)
                mention.setEntity(newEntity);
        }
        else if (mergeCase) {
            for (Mention mention : mentionsEntity) {
                mention.setEntity(entity1);
            }
            world.getEntities().removeEntity(entity2);
            world.getSentences().cleanEntity(entity2);
        }
        else
            throw new UnsupportedOperationException(String.format("Merge: %b and Split: %b!", splitCase, mergeCase));
    }
}
