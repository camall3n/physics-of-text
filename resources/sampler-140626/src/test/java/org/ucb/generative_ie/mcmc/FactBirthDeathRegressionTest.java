package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

/** Checks actual proposal mass, including the bounded death search's no-op mass. */
public class FactBirthDeathRegressionTest {

    private static World world(int entities, int referenced, int unreferenced, double sparsity) {
        NounLexicon nouns = NounLexicon.defaultNounLexicon(1);
        Lexicon paths = Lexicon.defaultLexicon(1);
        World w = new WorldGenerator(new Random(1), Entities.defaultEntities(entities),
                Relations.defaultRelations(1), nouns, paths, 1, 1,
                new ConstantSparsityGenerator(sparsity), 0).emptyWorld();
        for (int i = 0; i < referenced + unreferenced; i++) {
            Fact fact = factAt(w, i);
            w.getFacts().add(fact);
            if (i < referenced) {
                w.getSentences().add(new Sentence(fact, paths.get(0), nouns.get(0), nouns.get(0)));
            }
        }
        return w;
    }

    private static Fact factAt(World w, int index) {
        List<Entity> entities = w.getEntities().asList();
        return new Fact(w.getRelations().asList().get(0),
                entities.get(index / entities.size()), entities.get(index % entities.size()));
    }

    private static void assertBirthDeathBalance(World w) {
        FactBirthDeathStep step = new FactBirthDeathStep(w);
        Fact added = factAt(w, w.getFacts().size());
        double before = new WorldProb(w).logProb();
        double logAcceptBirth = step.logAcceptBirth(added);
        double potential = (double) w.numPotentialFactsPerRelation() * w.getNumRelations();
        w.getFacts().add(added);
        double after = new WorldProb(w).logProb();
        double logAcceptDeath = step.logAcceptDeath(added);
        int total = w.getFacts().size();
        int unreferenced = step.numUnreferenced();

        // Independently sum the chance of selecting this particular fact on each
        // of the 20 attempts after all preceding attempts hit referenced facts.
        double previousFailures = 1;
        double conditionalDeathProposal = 0;
        for (int attempt = 0; attempt < 20; attempt++) {
            conditionalDeathProposal += previousFailures / total;
            previousFailures *= (double) (total - unreferenced) / total;
        }
        double logForwardFlow = Math.log(0.5 / potential) + Math.min(0, logAcceptBirth);
        double logReverseFlow = after - before + Math.log(0.5 * conditionalDeathProposal)
                + Math.min(0, logAcceptDeath);
        assertEquals("Detailed balance must include failed death searches (F=" + total
                + ", U=" + unreferenced + ")", logForwardFlow, logReverseFlow, 1e-8);
        assertEquals("Opposite acceptance ratios must be reciprocal", 0,
                logAcceptBirth + logAcceptDeath, 1e-10);
    }

    @Test
    public void transitionsBalanceWithConstantSparsityIncludingReferencedHeavyStates() {
        for (double sparsity : new double[] {0.001, 0.5, 0.999}) {
            assertBirthDeathBalance(world(4, 9, 0, sparsity));
            assertBirthDeathBalance(world(4, 9, 2, sparsity));
            assertBirthDeathBalance(world(4, 0, 3, sparsity));
            assertBirthDeathBalance(world(32, 999, 0, sparsity));
        }
    }

    @Test
    public void transitionsBalanceWithIntegratedBetaSparsity() {
        for (int unreferenced : new int[] {0, 1, 3}) {
            World w = world(4, 9, unreferenced, 0.5);
            w.setSparsityPrior(1, 20);
            assertBirthDeathBalance(w);
        }
        World w = world(32, 999, 0, 0.5);
        w.setSparsityPrior(0.1, 100);
        assertBirthDeathBalance(w);
    }

    @Test
    public void actualDeathFrequencyMatchesTheJointAndBirthProposal() {
        World w = world(4, 9, 0, 0.5);
        Fact unreferenced = factAt(w, 9);
        double without = new WorldProb(w).logProb();
        w.getFacts().add(unreferenced);
        double with = new WorldProb(w).logProb();

        // There is one possible removable fact. Detailed balance and MH clipping
        // imply this death probability conditional on choosing the death branch.
        double searchSuccess = 1 - Math.pow(9.0 / 10, 20);
        double expected = Math.min(searchSuccess,
                Math.exp(without - with) / w.numPotentialFactsPerRelation());
        FactBirthDeathStep step = new FactBirthDeathStep(w);
        Random rng = new Random(987) {
            @Override public boolean nextBoolean() { return false; }
        };
        int removed = 0;
        int attempts = 200000;
        for (int i = 0; i < attempts; i++) {
            step.sample(rng);
            if (!w.getFacts().exists(unreferenced)) {
                removed++;
                w.getFacts().add(unreferenced);
            }
        }
        // The old implementation produces about 0.142 instead of 0.161.
        assertEquals(expected, (double) removed / attempts, 0.003);
        assertEquals(9, w.getSentences().numReferencedFacts());
        assertEquals(10, w.getFacts().size());
    }

    @Test
    public void searchProbabilityRetainsTinyUnreferencedFractions() {
        double tiny = FactBirthDeathStep.logDeathSearchSuccess(Long.MAX_VALUE, 1);
        assertTrue(!Double.isInfinite(tiny) && !Double.isNaN(tiny));
        // The neglected relative correction is below 2e-18 at this scale.
        assertEquals(Math.log(20.0) - Math.log((double) Long.MAX_VALUE), tiny, 1e-13);
        assertEquals(Math.log1p(-Math.pow(0.5, 20)),
                FactBirthDeathStep.logDeathSearchSuccess(100, 50), 1e-16);
        assertEquals(0, FactBirthDeathStep.logDeathSearchSuccess(100, 100), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FactBirthDeathStep.logDeathSearchSuccess(100, 0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, FactBirthDeathStep.logDeathSearchSuccess(0, 0), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchProbabilityRejectsImpossibleCounts() {
        FactBirthDeathStep.logDeathSearchSuccess(1, 2);
    }

    @Test
    public void impossibleDirectMovesAreRejectedWithoutNaNOrUnboxingNull() {
        World w = world(4, 1, 1, 0.5);
        FactBirthDeathStep step = new FactBirthDeathStep(w);
        assertEquals(Double.NEGATIVE_INFINITY, step.logAcceptBirth(factAt(w, 0)), 0);
        assertEquals(Double.NEGATIVE_INFINITY, step.logAcceptBirth(factAt(w, 1)), 0);
        assertEquals(Double.NEGATIVE_INFINITY, step.logAcceptDeath(factAt(w, 0)), 0);
        assertEquals(Double.NEGATIVE_INFINITY, step.logAcceptDeath(factAt(w, 2)), 0);

        World onlyFact = world(4, 0, 1, 0.5);
        assertEquals(Double.NEGATIVE_INFINITY,
                new FactBirthDeathStep(onlyFact).logAcceptDeath(factAt(onlyFact, 0)), 0);
        World empty = world(4, 0, 0, 0.5);
        assertEquals(0, new FactBirthDeathStep(empty).sample(new Random(1) {
            @Override public boolean nextBoolean() { return false; }
        }), 0);
    }
}
