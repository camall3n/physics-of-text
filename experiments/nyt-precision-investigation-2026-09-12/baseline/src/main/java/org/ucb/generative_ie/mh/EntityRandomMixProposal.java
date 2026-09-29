package org.ucb.generative_ie.mh;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import java.util.List;
import java.util.Random;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.World;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Random Mix MH proposal for entity model
 */
public class EntityRandomMixProposal extends MHProposal{
    
    private Entity entity1, entity2;
    private List<Mention> mentionsEntity, mentionsEntity1, mentionsEntity2;
    private List<Mention> newMentionsEntity1, newMentionsEntity2;
    private int countMentionsEntity1, countMentionsEntity2, countMentions;
    private int splitPoint;
    private boolean splitCase, mergeCase; 
    private int numEntities, newNumEntities;
    private int numNonEmptyEntities, newNumNonEmptyEntities;
    private boolean chooseDistN;
            
    public EntityRandomMixProposal(World world){
        super(world);
        
        /* 
         * splitCase and mergeCase are both false by default. If both of them
         * are true, it means that only one entity is chosen and no changes will
         * be applied.
         * */
        splitCase = false;
        mergeCase = false;
        mentionsEntity = Lists.newArrayList();
        mentionsEntity1 = Lists.newArrayList();
        mentionsEntity2 = Lists.newArrayList();
        newMentionsEntity1 = Lists.newArrayList();
        newMentionsEntity2 = Lists.newArrayList();
        //countMentions = 1;
        //countMentionsEntity1 =1;
        //countMentionsEntity2 = 1;
        
        numEntities = world.getEntities().sizeCurrent();
        numNonEmptyEntities = world.getSentences().getNonEmptyEntitySize();
        newNumEntities = numEntities;
        newNumNonEmptyEntities = numNonEmptyEntities;
        
        chooseDistN = true;
    }
    
    private final static Logger logger = LoggerFactory.getLogger(EntityRandomMixProposal.class);
    
    @Override
    public void sample(Random rng) {
        
        entity1 = world.getEntities().getRandomEntities().getRandom(rng);
        entity2 = world.getEntities().getRandomEntities().getRandom(rng);
        
        //debug the split case
        //if (logger.isTraceEnabled()){
        //    entity2 = entity1;
        //}
        
        mentionsEntity1 = world.getSentences().getMentionsByEntity(entity1);
        mentionsEntity2 = world.getSentences().getMentionsByEntity(entity2);
        
        countMentionsEntity1 = mentionsEntity1.size();
        countMentionsEntity2 = mentionsEntity2.size();

        mentionsEntity.addAll(mentionsEntity1);
        //mentionsEntity = mentionsEntity1;
        if (entity1 == entity2){
            splitCase = true;
            countMentions = countMentionsEntity1;
        }
        else {
            mentionsEntity.addAll(mentionsEntity2);
            countMentions = countMentionsEntity1 + countMentionsEntity2;
        }
        
        logger.debug("\nnew Entity Random Mix proposal");
        logger.debug("current mentions: \n {}", world.getSentences().showMentionsLazily());
        logger.debug("Entity size: {}", world.getNumEntities());
        logger.debug("Entities chosen: {} {}", entity1.toString(), entity2.toString());
        logger.debug("Mention size: {} and {} in {}", countMentionsEntity1, countMentionsEntity2, countMentions);
        
        if (countMentions < 2) {
            logger.info("No mentions are pointing to the chosen entities !");
            return;
        }
        
        if (chooseDistN) {
            //prob(mergeCase=true)=0.5
            mergeCase = rng.nextBoolean();
                 
            if (mergeCase) {
                splitPoint = (rng.nextBoolean() ? 0: countMentions);
            }
            else {
                splitPoint = 1 + rng.nextInt(countMentions-1); // [1 ,N-1]
            }
        
            logger.debug("Split point: choose {} from {}", splitPoint, countMentions);
        }
        else{
            //prob(splitPoint=n)=1/(N+1)
            logger.debug("{}", countMentions);
            splitPoint = rng.nextInt(countMentions);
            logger.debug("Split point: choose {} from {}", splitPoint, countMentions);
            
            if (splitPoint == countMentions || splitPoint ==0) {
                mergeCase = true;
            }
        }
        newMentionsEntity1 = RandomUtil.sample(mentionsEntity, splitPoint, rng);
        //for (int i =0; i<splitPoint; i++) {
        //    newMentionsEntity1.add(RandomUtil.choice(mentionsEntity, rng));
        //}
        
        //System.out.println("\nThe distribution of mentions:\n");
        for (Mention mention : mentionsEntity) {
            if ( ! newMentionsEntity1.contains(mention)){
                //System.out.print(String.format("Mention in the 2nd part: %s\n", mention.toString()));
                newMentionsEntity2.add(mention);
            }
            //else {
            //    System.out.print(String.format("Mention in the 1st part: %s\n", mention.toString()));
            //}
        }

        //for (Mention mention : mentionsEntity) {
        //    if ( !newMentionsEntity1.contains(mention) && ! newMentionsEntity2.contains(mention))
        //        System.out.println("MISSING");
        //}
        
        //world.showMentions();
        logger.debug("split:{} merge:{}", splitCase, mergeCase);
        
        if (splitCase && !mergeCase){
            newNumEntities +=1;
            newNumNonEmptyEntities +=1;
            logger.debug("+1: new numEntities {}, new numNonemptyEntities {}", newNumEntities, newNumNonEmptyEntities);
        }
        else if ( !splitCase && mergeCase) {
            newNumEntities -= 1;
            newNumNonEmptyEntities -= (1-((countMentionsEntity1==0 || countMentionsEntity2==0) ?1:0));
            logger.debug("-1: new numEntities {}, new numNonemptyEntities {}", newNumEntities, newNumNonEmptyEntities);
        }
        else if (!splitCase && !mergeCase){
            //entityDistRatio = 0;
            newNumNonEmptyEntities += ((countMentionsEntity1==0 || countMentionsEntity2==0) ?1:0);
        }
    }

    @Override
    public double stateRatio() {
        //pi(w) = prob(K) (1/K)^N Permutation^I_K Product_k {Beta(alpha_k+N_k)/Beta(alpha_k)}
        
        //pi(y)/pi(x) = prob(K_y)/prob(K_x) (K_x/K_y)^N (Permutation^I_y _K_y/Permutation^I_x _K_x) 
        //              {Beta(alpha_e1 + N_e1)/ Beta(alpha_e1)} / {Beta(alpha_e1' + N_e1')/Beta(alpha_e1')}
        //              {Beta(alpha_e2 + N_e2)/ Beta(alpha_e2)} / {Beta(alpha_e2' + N_e2')/Beta(alpha_e2') }
        double stateRatio = 0;
        
        //oldState and newState contain only the partial entity world that is changed
        double oldState =0.0; 
        double newState = 0.0;

        int numEntitiesDefault = world.getEntities().sizeDefault();
        int numMentions = world.getSentences().getMentions().size();

        //the probability of entity number by LogNormal distribution
        double variance = 1;
        double mean = Math.log(numEntitiesDefault) - Math.pow(variance, 2)/2;
        LogNormalDistribution logNormalEntity = new LogNormalDistribution(mean, variance);

        double entityDistRatio;
        
        entityDistRatio = Math.log(logNormalEntity.density(newNumEntities)) - Math.log(logNormalEntity.density(numEntities));
        entityDistRatio += numMentions * Math.log((double)numEntities/(newNumEntities));
        entityDistRatio += Util.logPermutation(newNumEntities, newNumNonEmptyEntities) - Util.logPermutation(numEntities, numNonEmptyEntities);
        //the combination of entities
        //entityDistRatio += Util.logFactorial(countMentionsEntity1) + Util.logFactorial(countMentionsEntity2) - Util.logFactorial(splitPoint) - Util.logFactorial(countMentions - splitPoint);
        //double entityDistCombRatio; // the combination of entity assignment
        //entityDistCombRatio = (Util.logFactorial(countMentionsEntity1) + Util.logFactorial(countMentions - countMentionsEntity1))
        //        - (Util.logFactorial(splitPoint) + Util.logFactorial(countMentions-splitPoint));

        //logger.debug("new comb ratio {} {} {} ", Math.exp(entityDistCombRatio), entityDistCombRatio, Math.exp(newState-oldState+entityDistRatio + entityDistCombRatio));        
      
        logger.debug("entity dist ratio: e^{}  {}",   entityDistRatio, Math.exp(entityDistRatio));
        stateRatio += entityDistRatio;
        
        Multiset <Noun> nhEntity1, nhEntity2;
        nhEntity1 = world.getSentences().nounHistogram(entity1);
        nhEntity2 = world.getSentences().nounHistogram(entity2);
        
        int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
        
        oldState += ModelFunctions.logBetaProb(nhEntity1, world.getAlpha(), numNouns);
        logger.debug("old state 1: {}", Math.exp(oldState));
        if (!splitCase) {
            oldState += ModelFunctions.logBetaProb(nhEntity2, world.getAlpha(), numNouns);        
            logger.debug("old state 2: {}", Math.exp(oldState));
        }
        
        Multiset<Noun> newnhEntity1 = HashMultiset.create();
        
        if(newMentionsEntity1.size() > 0) {
            for (Mention mention: newMentionsEntity1) {
                newnhEntity1.add(mention.getNoun());
            }
            newState += ModelFunctions.logBetaProb(newnhEntity1, world.getAlpha(), numNouns);
            logger.debug("new state 1: {}, size : {}", Math.exp(newState), newMentionsEntity1.size());
        }
        if (newMentionsEntity2.size() >0) {
            Multiset<Noun> newnhEntity2 = HashMultiset.create();
            
            for (Mention mention: newMentionsEntity2) {
                newnhEntity2.add(mention.getNoun());
            }
        
            newState += ModelFunctions.logBetaProb(newnhEntity2, world.getAlpha(), numNouns);
            logger.debug("new state 2: {}, size : {}", Math.exp(newState), newMentionsEntity2.size());
        }
        
        stateRatio += (newState - oldState);
        logger.debug("state ratio: {}", Math.exp(stateRatio));
        //double logMeanEntities = 2 * Math.log(numEntitiesDefault)- 0.5 * Math.log(standardDeviation + Math.pow(numEntitiesDefault, 2));
        //double logSD = Math.sqrt(Math.log(1+ standardDeviation/Math.pow(numEntitiesDefault, 2)));
        
        //return Math.exp(newState-oldState+entityDistRatio+entityDistCombRatio);
        
        return Math.exp(stateRatio);
    }

    @Override
    public double proposalRatio() {
        double rProposal = 1.0;
        
        if (chooseDistN) {
            rProposal *= Math.pow(numEntities, 2)/(2*Math.pow(newNumEntities, 2));
            rProposal *= Math.exp(Util.logCombinationRatio(countMentions, splitPoint, countMentionsEntity1)); 
        }
        else{
            rProposal *= Math.pow(numEntities, 2)/Math.pow(newNumEntities, 2);
            rProposal *= Math.exp(Util.logCombinationRatio(countMentions, splitPoint, countMentionsEntity1));
        }
        //rProposal *= Util.combination(countMentions, splitPoint)/Util.combination(countMentions, countMentionsEntity1);
        logger.debug("proposal ratio: {}", rProposal);
        return rProposal;
    }
    
    @Override
    public void applyProposal() {
        //logger.debug("Mentions before proposal applied: \n  {}", world.getSentences().showMentionsLazily());
        
        
        logger.debug("Applying proposal:");

        if ( splitCase && mergeCase) {
            //nothing needs to be changed.
            logger.debug("Nothing needs to be changed !");
            return;
        }
        
        
        if ( splitCase && !mergeCase ) {
            //add one additional entity

            for (Mention mention: newMentionsEntity1) {
                logger.trace("old mentions for the 1st part :\n {} {}\n", mention.toString(), mention.getSentence().toString());
                mention.setEntity(entity1);
                logger.trace("New mentions with {}: \n  {} {}\n", entity1.toString(), mention.toString(), mention.getSentence().toString());
            }
            

            Entity newEntity = world.getEntities().addNewEntity();
            
            for (Mention mention: newMentionsEntity2) {
                logger.trace("old mentions for the 2nd part :\n {} {}\n", mention.toString(), mention.getSentence().toString());
                mention.setEntity(newEntity);
                logger.trace("New mentions with {}:\n {} {}\n", newEntity.toString(), mention.toString(), mention.getSentence().toString());
            }
        }
        else if (!splitCase && mergeCase) {
            //remove one entity
            for (Mention mention: mentionsEntity) {
                mention.setEntity(entity1);
            }
            
            world.getEntities().removeEntity(entity2);
            world.getSentences().cleanEntity(entity2);
        }
        else {
            //reassign the mentions by the two existing entities
            for (Mention mention: newMentionsEntity1) {
                mention.setEntity(entity1);
                logger.trace("New mentions with {} : {}\n", entity1.toString(), mention.toString());
            }
            
            for (Mention mention: newMentionsEntity2) {
                mention.setEntity(entity2);
                logger.trace("New mentions with {} : {}\n", entity2.toString(), mention.toString());
            }
        }
        logger.debug("Proposal applied!");
        logger.debug("Mentions after proposal applied: \n  {}", world.getSentences().showMentionsLazily());

        
        //this part is commented because that only the empty entity duing the merge proposal should be removed rather than all the empty entities
        //clear mentions
        //for (Entity entity : world.getEntities()) {
        //    if (world.getSentences().getMentionsByEntity(entity).size()<1) {
        //        world.getEntities().removeEntity(entity);
        //        world.getSentences().cleanEntity(entity);
        //    }
        //}
    }
}
