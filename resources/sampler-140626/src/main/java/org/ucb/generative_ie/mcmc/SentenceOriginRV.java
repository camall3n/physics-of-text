package org.ucb.generative_ie.mcmc;

import java.util.Collection;
import java.util.Map;
import java.util.Random;

import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.WeightedLexicon;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.WeightedNounLexicon;

public class SentenceOriginRV implements MCMCStep {

    private final World world;
    private final Sentence s;

    /**
     * @param world
     * @param s
     */
    public SentenceOriginRV(World world, Sentence s) {
        this.world = world;
        this.s = s;
    }

    @Override
    public String getStepKind() {
        return "SentenceRV";
    }
     
    @Override
    public double sample(Random rng) {
        
        //sample the relation
        Map<Relation, Fact> originRelations = Maps.newHashMap();
        Map<Relation, Multiset<Trigger>> otherSentenceTriggers = Maps.newHashMap();
        for (Fact f : world.facts.factsWithEntityPair(s.getOrigin().getEntityPair())) {
            Relation r = f.getRel();
            originRelations.put(r, f);
            otherSentenceTriggers.put(r, HashMultiset.create(world.getSentences().triggerHistogram(r)));
            if (r.equals(s.getOrigin().getRel())) {
                otherSentenceTriggers.get(r).remove(s.getTrig());
            }
        }

        Relation newOriginRelation = sampleRelation(originRelations.keySet(), otherSentenceTriggers, rng);
        
        if (newOriginRelation != this.s.getOrigin().getRel())
            s.setOrigin(originRelations.get(newOriginRelation));
        
        //sample the first argument
        Map<Entity, Fact> originSourceEntities = Maps.newHashMap();
        Map<Entity, Multiset<Noun>> otherSentenceSourceNouns = Maps.newHashMap();
        for (Fact f : world.facts.factsWithRelEntPair(s.getOrigin().getRelEntPair())) {
            Entity e = f.getEnt1();
            originSourceEntities.put(e, f);
            otherSentenceSourceNouns.put(e, HashMultiset.create(world.getSentences().nounHistogram(e)));
            if (e.equals(s.getOrigin().getEnt1())) {
                otherSentenceSourceNouns.get(e).remove(s.getArg1());
            }
        }
        
        Entity newSourceEntity = sampleEntityFact(originSourceEntities.keySet(), otherSentenceSourceNouns, 0, rng);
        
        if (newSourceEntity != this.s.getOrigin().getEnt1())
            s.setOrigin(originSourceEntities.get(newSourceEntity));
        
        //sample the second argument
        Map<Entity, Fact> originDestEntities = Maps.newHashMap();
        Map<Entity, Multiset<Noun>> otherSentenceDestNouns = Maps.newHashMap();
        for (Fact f : world.facts.factsWithEntRelPair(s.getOrigin().getEntRelPair())) {
            Entity e = f.getEnt2();
            originDestEntities.put(e, f);
            otherSentenceDestNouns.put(e, HashMultiset.create(world.getSentences().nounHistogram(e)));
            if (e.equals(s.getOrigin().getEnt2())) {
                otherSentenceDestNouns.get(e).remove(s.getArg2());
            }
        }
        
        Entity newDestEntity = sampleEntityFact(originDestEntities.keySet(), otherSentenceDestNouns, 1, rng);
        
        if (newDestEntity != this.s.getOrigin().getEnt2())
            s.setOrigin(originDestEntities.get(newDestEntity));
        
        return 1;
    }

    public Relation sampleRelation(Collection<Relation> originRelations, Map<Relation, Multiset<Trigger>> otherSentenceTriggers, Random rng) {
        ProbMap<Relation> sampler = new LogProbMap<>();

        for (Relation originRelation : originRelations) {
            WeightedLexicon lex = world.getWeightedLexicons().get(originRelation);
            //the count of this Trigger for this Relation
            int tCount = otherSentenceTriggers.get(originRelation).count(s.getTrig());
            //the count of all Triggers for this Relation
            int otherSentencesCount = otherSentenceTriggers.get(originRelation).size();

            double beta = world.getBeta();
            int numTrigs = lex.getLex().size();

            double probTrigGivenR = (tCount + beta) / (beta * numTrigs + otherSentencesCount);

            sampler.multiplyKey(originRelation, probTrigGivenR);
        }

        if (sampler.size() == 0)
        {
            //throw new RuntimeException("No facts with the same entity pair");
            return this.s.getOrigin().getRel();
        }

        return sampler.sample(rng);
    }
    
    /**
     * 
     * @param originEntities
     * @param otherSentenceNouns
     * @param nEntity: 0/1, source or dest
     * @param rng
     * @return 
     */
    public Entity sampleEntityFact(Collection<Entity> originEntities, Map<Entity, Multiset<Noun>> otherSentenceNouns, 
            int nEntity,Random rng) {
        ProbMap<Entity> sampler = new LogProbMap<>();
        
        for (Entity originEntity : originEntities) {
            WeightedNounLexicon nlex = world.getWeightedNounLexicons().get(originEntity);
            
            int nCount;
            Noun noun;
            if (nEntity == 0) {
                noun = s.getArg1();
            }
            else {
                noun = s.getArg2();
            }
           
            nCount = otherSentenceNouns.get(originEntity).count(noun);
           
            int otherSentencesCount = otherSentenceNouns.get(originEntity).size();
            
            double alpha = world.getAlpha();
            int numNouns = nlex.getNounLexicon().size();

            double probNounGivenE = (nCount + alpha) / (alpha * numNouns + otherSentencesCount);
            
            probNounGivenE *= probEntityName(originEntity, noun, alpha);
            sampler.multiplyKey(originEntity, probNounGivenE);
        }

        if (sampler.size() == 0)
        {
            //throw new RuntimeException("No facts sharing the same relation with this entity");
            if (nEntity == 0) {
                return s.getOrigin().getEnt1();
            }
            else {
                return s.getOrigin().getEnt2();
            }
        }

        return sampler.sample(rng);
    }
    
    public double probEntityName(Entity entity, Noun noun, double alpha) {
        double prob;
        Multiset<Noun> otherNouns =  world.getSentences().nounHistogram(entity);
        otherNouns.remove(noun);
        
        int nCount = otherNouns.count(noun);
        int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();
        int otherCounts = otherNouns.size();
        
        prob  = (nCount + alpha) / (alpha * numNouns + otherCounts);
        
        return prob;
    }
}
