package org.ucb.generative_ie.world;

import java.util.List;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.util.Util;

import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The log probability of a world under the generative model of
 * Russell, Lassen, Uang and Wang, "The Physics of Text" (2016), Section 3,
 * as implemented by {@link org.ucb.generative_ie.generator.WorldGenerator}:
 *
 * <pre>
 *   N            ~ discrete log-normal (entity count; see {@link Entities})
 *   holds(r,x,y) ~ Bernoulli(sigma)          for every relation r and entity pair (x,y)
 *   D_r          ~ Dirichlet(beta, ..., beta)  dictionary over dependency paths, per relation
 *   L_e          ~ Dirichlet(alpha, ..., alpha) dictionary over nouns, per entity
 *   origin(s)    ~ Uniform(true facts)        for every sentence s
 *   trig(s)      ~ Categorical(D_{rel(origin(s))})
 *   arg1(s)      ~ Categorical(L_{ent1(origin(s))}),  arg2(s) likewise
 * </pre>
 *
 * The Dirichlet dictionaries are integrated out (collapsed), which is the form the
 * Gibbs steps in {@code org.ucb.generative_ie.mcmc} condition on. The sparsity sigma is
 * treated as fixed, as it is in {@code EntityResolution}.
 *
 * {@link #logProbEntityWorld()} is the older entity-only model used by the split-merge
 * samplers of Wang and Russell (UAI 2015): it replaces the fact and origin terms with
 * a uniform choice of entity per mention. It is kept for those samplers and their tests.
 */
public class WorldProb {

    private final World w;

    private final static Logger logger = LoggerFactory.getLogger(WorldProb.class);

    public WorldProb(World w) {
        this.w = w;
    }

    /**
     * Full joint of the fact-based model, dictionaries collapsed.
     * Throws if the world is inconsistent (a sentence originates from a fact
     * that does not exist); see {@link World#syncFacts()}.
     */
    public double logProb() {
        return logProbFactWorld();
    }

    public double logProbFactWorld() {
        for (Sentence s : w.getSentences()) {
            if (!w.getFacts().exists(s.getOrigin())) {
                throw new IllegalStateException("Sentence originates from a fact that does not exist"
                        + " (call World.syncFacts() after entity moves): " + s);
            }
        }

        // Entities are labelled objects in this model (facts are defined on them), so
        // there is no exchangeability factor; the Gibbs steps in the mcmc package are
        // exact for this joint (see WorldProbTest).
        double logProb = 0;
        logProb += logEntityNumber();
        logProb += logProbFacts();
        logProb += logSentencesOrigin();
        logProb += logCollapsedTriggers();
        logProb += logCollapsedNouns();
        return logProb;
    }

    /**
     * Sentences must originate from existing facts, and facts must refer to
     * entities that currently exist.
     */
    public List<String> consistencyProblems() {
        List<String> problems = Lists.newArrayList();
        for (Sentence s : w.getSentences()) {
            if (!w.getFacts().exists(s.getOrigin())) {
                problems.add("sentence origin not in facts: " + s);
            }
        }
        for (Fact f : w.getFacts()) {
            if (!w.getEntities().asSet().contains(f.getEnt1()) || !w.getEntities().asSet().contains(f.getEnt2())) {
                problems.add("fact refers to a removed entity: " + f);
            }
        }
        return problems;
    }

    // ------------------------------------------------------------------
    // Entity-only model (Wang & Russell 2015), retained for the entity phase.
    // ------------------------------------------------------------------

    public double logProbLabeledEntityWorld() {
        double logProbEntityWorld = 0;
        int numEntities = w.getNumEntities();
        int numMentions = w.getSentences().getMentions().size();

        logProbEntityWorld += logEntityNumber();
        // P(E): each mention picks its entity uniformly
        logProbEntityWorld += (numMentions * Math.log(1.0 / numEntities));
        logProbEntityWorld += logCollapsedNouns();
        return logProbEntityWorld;
    }

    /**
     * @return The probability of the Entity World
     */
    public double logProbEntityWorld() {
        return logProbLabeledEntityWorld() + logUnlabeledEntities();
    }

    // ------------------------------------------------------------------
    // Individual terms.
    // ------------------------------------------------------------------

    /** Discrete log-normal prior on the number of entities, centred on the configured count. */
    public double logEntityNumber() {
        int numEntitiesDefault = w.getEntities().sizeDefault();
        int numEntities = w.getNumEntities();

        double variance = 1;
        double mean = Math.log(numEntitiesDefault) - Math.pow(variance, 2) / 2;
        LogNormalDistribution logNormalEntity = new LogNormalDistribution(mean, variance);
        logger.debug("LogNormal, numEnt_default: {}, mean: {}, variance: {}, density: {}",
                numEntitiesDefault, mean, variance, logNormalEntity.density(numEntities));
        return Math.log(logNormalEntity.density(numEntities));
    }

    /** Combinatorial factor for unlabeled entities: the non-empty entities can be labelled in N!/(N-K)! ways. */
    public double logUnlabeledEntities() {
        int numEntities = w.getNumEntities();
        int numNonEmptyEntities = w.getSentences().getNonEmptyEntitySize();
        logger.debug("numEnt: {}, numEnt_nonEmpty: {}", numEntities, numNonEmptyEntities);
        return Util.logPermutation(numEntities, numNonEmptyEntities);
    }

    /** Each of the N^2 K potential facts holds independently with probability sigma. */
    public double logProbFacts() {
        long numPossibleFacts = (long) w.getNumEntities() * w.getNumEntities() * w.getNumRelations();
        int numFacts = w.getFacts().size();
        double sparsity = w.getSparsity();

        double factProb = 0;
        factProb += Math.log(sparsity) * numFacts;
        factProb += Math.log(1 - sparsity) * (numPossibleFacts - numFacts);
        return factProb;
    }

    /** Each sentence reports a fact chosen uniformly from the true facts. */
    public double logSentencesOrigin() {
        int numSentences = w.getSentences().size();
        int numFacts = w.getFacts().size();
        if (numSentences == 0) {
            return 0;
        }
        if (numFacts == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return -numSentences * Math.log(numFacts);
    }

    /**
     * Dirichlet-multinomial likelihood of the dependency paths of each relation's
     * sentences, with the relation's dictionary integrated out:
     * prod_r  B(beta + n_r) / B(beta).
     */
    public double logCollapsedTriggers() {
        int numTrigs = w.getWeightedLexicons().getLex().size();
        double total = 0;
        for (Relation r : w.getRelations()) {
            Multiset<Trigger> hist = w.getSentences().triggerHistogram(r);
            total += ModelFunctions.logBetaProb(hist, w.getBeta(), numTrigs);
        }
        return total;
    }

    /**
     * Dirichlet-multinomial likelihood of the nouns mentioning each entity,
     * with the entity's noun dictionary integrated out.
     */
    public double logCollapsedNouns() {
        double total = 0;
        int numNouns = w.getWeightedNounLexicons().getNounLexicon().size();
        for (Entity e : w.getEntities()) {
            Multiset<Noun> hist = w.getSentences().nounHistogram(e);
            total += ModelFunctions.logBetaProb(hist, w.getAlpha(), numNouns);
        }
        return total;
    }
}
