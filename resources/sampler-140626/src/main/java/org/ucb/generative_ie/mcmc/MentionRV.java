package org.ucb.generative_ie.mcmc;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

public class MentionRV implements MCMCStep {
    private final World world;
    private final Mention mention;

    
    public MentionRV(World world, Mention mention) {
        this.world = world;
        this.mention = mention;
    }
    
    private final static Logger logger = LoggerFactory.getLogger(MentionRV.class);
    
    @Override
    public double sample(Random rng) {
        
        HashSet <Entity> otherEntities = Sets.newHashSet();
        Map <Entity, Multiset <Noun>> otherNounLexicon = Maps.newHashMap();
        
        for (Entity e : world.getEntities()) {
            otherEntities.add(e);
            otherNounLexicon.put(e, HashMultiset.create(world.getSentences().nounHistogram(e)));
        }
        
        for (Mention m : world.getSentences().getMentions()) {
            Entity e = m.getEntity();
            //System.out.println(String.format("Add entity %s", e));
            if (m.equals(mention)) {
                logger.trace("Ignoring mention {}", m.toString());
                //System.out.println(String.format("Ignoring noun %s", m.getNoun()));
                //world.getSentences().showMentions();
                logger.trace("current nouns {}", otherNounLexicon.get(e));
                otherNounLexicon.get(e).remove(m.getNoun());
                //System.out.println(String.format("new Nouns %s", otherNounLexicon.get(e)));
            }
        }
        //for (Entity e: mentions.getEntities()) {
        //    System.out.println(String.format("Entity %s  Nouns %s", e, otherNounLexicon.get(e)));
        //}
                
        //System.out.println(String.format("other Entities %s", otherEntities));
        //System.out.println(String.format("other Nouns %s", otherNounLexicon));
        
        
        ProbMap <Entity> sampler = new LogProbMap<Entity>() {};
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
        //if (world.getSentences().getMentionsByEntity(oldEntity).size()<1) {
        //    world.getEntities().removeEntity(oldEntity);
        //    world.getSentences().cleanEntity(oldEntity);
        //}
        logger.trace("current mentions: \n {}", world.getSentences().showMentions());
        logger.trace("MentionRV: mentions cleaned");
        //mentions.add(mention);
        return 1;
    }
    
   // public WeightedNounLexicons getWeightedNounLexicons(){
   //     //System.out.println("this mentions");
   //     //System.out.println(this.mentions);
   //     return this.mentions;
   // }

    @Override
    public String getStepKind() {
        return "MentionRV";
    }
}
