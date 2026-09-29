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
        
        //sample the first argument, then the second
        sampleEntity(true, rng);
        sampleEntity(false, rng);

        return 1;
    }

    /** Existing facts that differ from the sentence's origin only in the source (or destination) entity. */
    private Map<Entity, Fact> candidateEntityFacts(boolean source) {
        Map<Entity, Fact> candidates = Maps.newHashMap();
        Collection<Fact> facts = source
                ? world.facts.factsWithRelEntPair(s.getOrigin().getRelEntPair())
                : world.facts.factsWithEntRelPair(s.getOrigin().getEntRelPair());
        for (Fact f : facts) {
            candidates.put(source ? f.getEnt1() : f.getEnt2(), f);
        }
        return candidates;
    }

    /**
     * Unnormalised log-weight of each entity the sentence's source (or destination)
     * argument could refer to, restricted to existing facts, with the entity's
     * Dirichlet(alpha) noun dictionary integrated out: (n_e(noun) + alpha) / (n_e + alpha V),
     * counted over the other sentences. Tests check it against WorldProb.
     */
    public Map<Entity, Double> entityLogWeights(boolean source) {
        Noun noun = source ? s.getArg1() : s.getArg2();
        Entity current = source ? s.getOrigin().getEnt1() : s.getOrigin().getEnt2();
        double alpha = world.getAlpha();
        int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();

        Map<Entity, Double> weights = Maps.newHashMap();
        for (Entity e : candidateEntityFacts(source).keySet()) {
            Multiset<Noun> others = HashMultiset.create(world.getSentences().nounHistogram(e));
            if (e.equals(current)) {
                others.remove(noun);
            }
            double prob = (others.count(noun) + alpha) / (alpha * numNouns + others.size());
            weights.put(e, Math.log(prob));
        }
        return weights;
    }

    private void sampleEntity(boolean source, Random rng) {
        Map<Entity, Fact> candidates = candidateEntityFacts(source);
        Map<Entity, Double> weights = entityLogWeights(source);
        if (weights.isEmpty()) {
            return;
        }
        LogProbMap<Entity> sampler = new LogProbMap<>();
        for (Map.Entry<Entity, Double> entry : weights.entrySet()) {
            sampler.multiplyLogKey(entry.getKey(), entry.getValue());
        }
        Entity chosen = sampler.sample(rng);
        Entity current = source ? s.getOrigin().getEnt1() : s.getOrigin().getEnt2();
        if (!chosen.equals(current)) {
            s.setOrigin(candidates.get(chosen));
        }
    }

    /**
     * Unnormalised log-weight of each relation this sentence could originate from
     * (a fact with the sentence's entity pair must exist for that relation), with
     * every other variable held fixed. This is what {@link #sample} draws from; tests
     * check it against the joint in {@link org.ucb.generative_ie.world.WorldProb}.
     */
    public Map<Relation, Double> relationLogWeights() {
        Map<Relation, Double> weights = Maps.newHashMap();
        for (Fact f : world.facts.factsWithEntityPair(s.getOrigin().getEntityPair())) {
            Relation r = f.getRel();
            Multiset<Trigger> others = HashMultiset.create(world.getSentences().triggerHistogram(r));
            if (r.equals(s.getOrigin().getRel())) {
                others.remove(s.getTrig());
            }
            weights.put(r, Math.log(probTrigGivenRelation(others)));
        }
        return weights;
    }

    /**
     * Predictive probability of this sentence's trigger under a relation whose
     * Dirichlet(beta) dictionary has been integrated out, given the relation's
     * other triggers: (n_t + beta) / (n + beta * T).
     */
    private double probTrigGivenRelation(Multiset<Trigger> otherTriggers) {
        double beta = world.getBeta();
        int numTrigs = world.getWeightedLexicons().getLex().size();
        int tCount = otherTriggers.count(s.getTrig());
        int otherCount = otherTriggers.size();
        return (tCount + beta) / (beta * numTrigs + otherCount);
    }

    public Relation sampleRelation(Collection<Relation> originRelations, Map<Relation, Multiset<Trigger>> otherSentenceTriggers, Random rng) {
        ProbMap<Relation> sampler = new LogProbMap<>();

        for (Relation originRelation : originRelations) {
            double probTrigGivenR = probTrigGivenRelation(otherSentenceTriggers.get(originRelation));
            sampler.multiplyKey(originRelation, probTrigGivenR);
        }

        if (sampler.size() == 0)
        {
            //throw new RuntimeException("No facts with the same entity pair");
            return this.s.getOrigin().getRel();
        }

        return sampler.sample(rng);
    }
}
