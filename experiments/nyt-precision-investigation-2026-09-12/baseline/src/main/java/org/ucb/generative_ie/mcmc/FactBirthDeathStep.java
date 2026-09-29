package org.ucb.generative_ie.mcmc;

import java.util.List;
import java.util.Random;

import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.World;

/**
 * Metropolis-Hastings birth/death of facts that no sentence reports.
 *
 * Gibbs sampling every potential fact (the original WorldInferSteps allocated one
 * FactRV per entity pair per relation) is exact but hopeless at corpus scale: with
 * N entities and K relations there are N^2 K potential facts and only a few thousand
 * actual ones, so a uniformly chosen potential fact is almost never an existing one
 * and existing unreferenced facts are never revisited. This step instead proposes,
 * with probability 1/2 each, the birth of a uniformly chosen potential fact or the
 * death found by a bounded search through existing facts. Conditional on finding
 * an unreferenced fact the choice is uniform; the acceptance ratio also accounts
 * for the search's probability of success. The target conditional is the same
 * one {@link FactRV} samples.
 */
public class FactBirthDeathStep implements MCMCStep {

    private static final int DEATH_PICK_TRIES = 20;

    private final World world;
    private final List<Relation> relations;
    private static int proposed, accepted;

    public FactBirthDeathStep(World world) {
        this.world = world;
        this.relations = world.getRelations().asList();
    }

    @Override
    public String getStepKind() {
        return "FactBirthDeath";
    }

    @Override
    public double sample(Random rng) {
        if (rng.nextBoolean()) {
            return birth(rng);
        }
        return death(rng);
    }

    private double birth(Random rng) {
        List<Entity> entities = world.getEntities().asList();
        if (relations.isEmpty() || entities.isEmpty()) {
            return 0;
        }
        Fact f = new Fact(RandomUtil.choice(relations, rng), RandomUtil.choice(entities, rng), RandomUtil.choice(entities, rng));
        if (world.getFacts().exists(f)) {
            return 0;
        }
        proposed++;
        double logAccept = logAcceptBirth(f);
        if (Math.log(rng.nextDouble()) < logAccept) {
            world.getFacts().add(f);
            accepted++;
        }
        return Math.min(1, Math.exp(logAccept));
    }

    private double death(Random rng) {
        if (numUnreferenced() == 0) {
            return 0;
        }
        Fact f = null;
        for (int i = 0; i < DEATH_PICK_TRIES; i++) {
            Fact candidate = world.getFacts().sampleAll(rng);
            if (world.getSentences().sentencesWithOrigin(candidate).isEmpty()) {
                f = candidate;
                break;
            }
        }
        if (f == null) {
            return 0;
        }
        proposed++;
        double logAccept = logAcceptDeath(f);
        if (Math.log(rng.nextDouble()) < logAccept) {
            world.getFacts().remove(f);
            accepted++;
        }
        return Math.min(1, Math.exp(logAccept));
    }

    /** Facts no sentence reports: the only ones this step may remove. */
    public int numUnreferenced() {
        return world.getFacts().size() - world.getSentences().numReferencedFacts();
    }

    private double logNumPotentialFacts() {
        return Math.log(world.numPotentialFactsPerRelation()) + Math.log(relations.size());
    }

    /**
     * Log probability that the bounded death search finds any unreferenced fact:
     * log(1 - (1 - U/F)^tries). The log1p/expm1 form retains accuracy when U/F is
     * tiny, including ratios for which subtracting U/F from 1 rounds to 1.
     */
    static double logDeathSearchSuccess(long numFacts, long unreferenced) {
        if (numFacts < 0 || unreferenced < 0 || unreferenced > numFacts) {
            throw new IllegalArgumentException("Expected 0 <= unreferenced <= numFacts");
        }
        if (unreferenced == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        if (unreferenced == numFacts) {
            return 0;
        }
        double logFailure = DEATH_PICK_TRIES * Math.log1p(-(double) unreferenced / numFacts);
        return Math.log(-Math.expm1(logFailure));
    }

    /**
     * log acceptance of adding the (currently absent, unreferenced) fact {@code f}:
     * the Gibbs log-odds of its existence, times the proposal ratio
     * (s(F + 1, U + 1) / (U + 1)) / (1 / (N^2 K)), where U is the number of
     * unreferenced facts and s is the probability that the reverse death search
     * succeeds. The common 1/2 birth/death choice cancels.
     */
    public double logAcceptBirth(Fact f) {
        if (world.getFacts().exists(f)) {
            return Double.NEGATIVE_INFINITY;
        }
        Double logOdds = new FactRV(world, f).logOddsExists();
        if (logOdds == null) {
            return Double.NEGATIVE_INFINITY;
        }
        long unreferencedAfter = numUnreferenced() + 1L;
        return logOdds + logNumPotentialFacts() - Math.log(unreferencedAfter)
                + logDeathSearchSuccess(world.getFacts().size() + 1L, unreferencedAfter);
    }

    /** log acceptance of removing the existing, unreferenced fact {@code f}. */
    public double logAcceptDeath(Fact f) {
        if (!world.getFacts().exists(f)) {
            return Double.NEGATIVE_INFINITY;
        }
        Double logOdds = new FactRV(world, f).logOddsExists();
        if (logOdds == null) {
            return Double.NEGATIVE_INFINITY;
        }
        int unreferenced = numUnreferenced();
        return -logOdds + Math.log(unreferenced) - logNumPotentialFacts()
                - logDeathSearchSuccess(world.getFacts().size(), unreferenced);
    }

    public static double acceptanceRatio() {
        return proposed == 0 ? 0 : (double) accepted / proposed;
    }
}
