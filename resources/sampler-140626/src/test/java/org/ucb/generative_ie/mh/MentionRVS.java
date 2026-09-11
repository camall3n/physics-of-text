package org.ucb.generative_ie.mh;


import com.google.common.collect.HashMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import org.ucb.generative_ie.mcmc.MCMCStep;
import org.ucb.generative_ie.mh.MHStep;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

public class MentionRVS implements MCMCStep{
    private final World world;
    //private final Entity entity;
    //private final NounLexicon nounLexicon;
    private final Mention mention;
    
    //public MentionRV(WeightedNounLexicons mentions, Mention mention, Entity entity, NounLexicon nounLexicon) {
    public MentionRVS (World world, Mention mention) {
        this.world = world;
        this.mention = mention;
        //this.entity = entity;
        //this.nounLexicon = nounLexicon;
    }
    
    
    @Override
    public double sample(Random rng) {
        
        HashSet <Entity> otherEntities = Sets.newHashSet();
        Map <Entity, Multiset <Noun>> otherNounLexicon = Maps.newHashMap();
        //Mentions otherMentions = new WeightedNounLexicons(mentions);
        //otherMentions.remove(mention);
        
        //mentions.remove(mention);
        //System.out.println(mentions.size());
        //for (Entity e: mentions.getEntities()) {
        //    otherEntities.add(e);
        //    otherNounLexicon.put(e, HashMultiset.create(mentions.nounHistogram(e)));
        //}
        
        for (Entity e : world.getEntities()) {
            otherEntities.add(e);
            otherNounLexicon.put(e, HashMultiset.create(world.getSentences().nounHistogram(e)));
        }
        
        for (Mention m : world.getSentences().getMentions()) {
            Entity e = m.getEntity();
            //System.out.println(String.format("Add entity %s", e));
            if (m.equals(mention)) {
                //System.out.println(String.format("Ignoring entity %s", e));
                //System.out.println(String.format("Ignoring noun %s", m.getNoun()));
                //System.out.println(String.format("current nouns %s", otherNounLexicon.get(e)));
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
        //System.out.println(String.format("sampling for ... %s ...", mention.getNoun()));
        //System.out.println(mentions.asList());
        
        Entity e0, e1;
        double logProb0, logProb1;
        e0 = mention.getEntity();
        //logProb0 = mentions.logProb();
        
        for (Entity entity: world.getEntities()) {
            WeightedNounLexicon wnlex = world.getWeightedNounLexicons().get(entity);
            int nCount = otherNounLexicon.get(entity).count(mention.getNoun());
            int nAllCount = otherNounLexicon.get(entity).size();
            double alpha = 0.0001;
            int numNouns = wnlex.getNounLexicon().size();
            //otherNounLexicon.get(entity).size();
            //System.out.println(String.format("nCount %d, nAll, %d", nCount, nAllCount));
            
            double probNounGivenEntity = (nCount + alpha) / (alpha * numNouns + nAllCount);
            //the probability of this given entity
            //double probEntityGivenNoun;
            //probEntityGivenNoun = probNounGivenEntity * mentions.probEntity(entity);

            
            sampler.multiplyKey(entity, probNounGivenEntity);
            //sampler.multiplyKey(entity, probEntityGivenNoun);
            //show the probabilities of each posssible entity
            //System.out.println(String.format("Entity %s Nouns %s Prob %f %f %f", entity, mention.getNoun(), probNounGivenEntity,mentions.probEntity(entity),probEntityGivenNoun ));
            //sampler.multiplyKey(entity, 0.5);
        }
        
        
        e1 = sampler.sample(rng);
        //System.out.println(String.format("New sampled entity %s for String %s", e, mention.getNoun()));
        //or (int i=0;i<100;i++) {
        //   Entity e;
        //   e =  sampler.sample(rng);
        //   System.out.println(e);
        //

        mention.setEntity(e1);
        //logProb1 = mentions.logProb();
        //if (logProb1 < logProb0 ) {
            mention.setEntity(e0);
        //}
        //mentions.add(mention);
        return 1;
    }
    
   // public WeightedNounLexicons getMentions(){
   //     //System.out.println("this mentions");
   //     //System.out.println(this.mentions);
   //     return this.mentions;
   // }

    @Override
    public String getStepKind() {
        return "MentionRVS";
    }
}
