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
 * death of a uniformly chosen unreferenced fact, and corrects for the asymmetric
 * proposal. The target conditional is the same one {@link FactRV} samples.
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
     * log acceptance of adding the (currently absent, unreferenced) fact {@code f}:
     * the Gibbs log-odds of its existence, times the proposal ratio
     * (1 / (U + 1)) / (1 / (N^2 K)) where U is the number of unreferenced facts.
     */
    public double logAcceptBirth(Fact f) {
        Double logOdds = new FactRV(world, f).logOddsExists();
        return logOdds + logNumPotentialFacts() - Math.log(numUnreferenced() + 1);
    }

    /** log acceptance of removing the existing, unreferenced fact {@code f}. */
    public double logAcceptDeath(Fact f) {
        Double logOdds = new FactRV(world, f).logOddsExists();
        return -logOdds + Math.log(numUnreferenced()) - logNumPotentialFacts();
    }

    public static double acceptanceRatio() {
        return proposed == 0 ? 0 : (double) accepted / proposed;
    }
}
