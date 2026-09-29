package org.ucb.generative_ie.world;

import java.util.List;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.util.Util;

import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.special.Gamma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The log probability of a world under the generative model of
 * Russell, Lassen, Uang and Wang, "The Physics of Text" (2016), Section 3,
 * as implemented by {@link org.ucb.generative_ie.generator.WorldGenerator}:
 *
 * <pre>
 *   N            ~ discrete log-normal (entity count; see {@link Entities})
 *   K_used       ~ discrete log-normal (number of relations with a fact, out of a fixed pool)
 *   sigma_r      ~ Beta(a, b)                 per relation, integrated out (or a constant)
 *   holds(r,x,y) ~ Bernoulli(sigma_r)        for every relation r and entity pair (x,y)
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
        logProb += logRelationNumber();
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

    /**
     * Log density of the discrete log-normal prior used for object counts (entities,
     * relations): log-scale variance 1, log-scale mean chosen so the mean is {@code centre}.
     * Zero probability at count 0.
     */
    public static double logLogNormal(int count, int centre) {
        if (count <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        double variance = 1;
        double mean = Math.log(centre) - Math.pow(variance, 2) / 2;
        return Math.log(new LogNormalDistribution(mean, variance).density(count));
    }

    /** Discrete log-normal prior on the number of entities, centred on the configured count. */
    public double logEntityNumber() {
        return logLogNormal(w.getNumEntities(), w.getEntities().sizeDefault());
    }

    /**
     * Discrete log-normal prior on the number of occupied relations (relations with at
     * least one fact), centred on the configured relation count. The relation pool
     * itself is a fixed upper bound; this is what makes the number of relations in use
     * a posterior quantity.
     */
    public double logRelationNumber() {
        return logLogNormal(w.numOccupiedRelations(), w.getRelationPriorMean());
    }

    private static double logBetaFn(double a, double b) {
        return Gamma.logGamma(a) + Gamma.logGamma(b) - Gamma.logGamma(a + b);
    }

    /**
     * Log probability of one relation having exactly {@code numFacts} of its N^2 potential
     * facts. With a Beta(a, b) prior on the relation's sparsity integrated out this is the
     * beta-binomial term B(a + n, b + N^2 - n) / B(a, b) (without the binomial coefficient,
     * since the facts are labelled); with constant sparsity it is sigma^n (1 - sigma)^(N^2 - n).
     */
    public double logFactTerm(int numFacts) {
        long potential = w.numPotentialFactsPerRelation();
        if (w.hasSparsityPrior()) {
            double a = w.getSparsityA(), b = w.getSparsityB();
            return logBetaFn(a + numFacts, b + potential - numFacts) - logBetaFn(a, b);
        }
        double sparsity = w.getSparsity();
        return Math.log(sparsity) * numFacts + Math.log(1 - sparsity) * (potential - numFacts);
    }

    /** Combinatorial factor for unlabeled entities: the non-empty entities can be labelled in N!/(N-K)! ways. */
    public double logUnlabeledEntities() {
        int numEntities = w.getNumEntities();
        int numNonEmptyEntities = w.getSentences().getNonEmptyEntitySize();
        logger.debug("numEnt: {}, numEnt_nonEmpty: {}", numEntities, numNonEmptyEntities);
        return Util.logPermutation(numEntities, numNonEmptyEntities);
    }

    /**
     * Probability of the fact set: per relation, each of the N^2 potential facts holds
     * with that relation's sparsity, which is either constant or Beta-distributed and
     * integrated out (see {@link #logFactTerm}).
     */
    public double logProbFacts() {
        double total = 0;
        for (Relation r : w.getRelations()) {
            total += logFactTerm(w.getFacts().factsWithRelation(r).size());
        }
        return total;
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
