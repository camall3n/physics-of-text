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
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

/**
 * Every relation-phase move must be exact for the joint in {@link WorldProb}:
 * its log acceptance (or log-odds) equals the difference of logProb() between the
 * two states plus the log proposal ratio. Checked with constant sparsity and with
 * the Beta sparsity prior, since the two have different fact terms.
 */
public class RelationMovesTest {

    private static final double TOL = 1e-7;

    private static World sampleWorld(long seed, boolean sparsityPrior) {
        Random rng = new Random(seed);
        WorldGenerator gen = new WorldGenerator(rng,
                Entities.defaultEntities(4), Relations.defaultRelations(5),
                NounLexicon.defaultNounLexicon(6), Lexicon.defaultLexicon(5),
                0.5, 0.1, new ConstantSparsityGenerator(0.25), 30);
        World w = gen.sampleWorld(true);
        w.setRelationPriorMean(2);
        if (sparsityPrior) {
            w.setSparsityPrior(1, 20);
        }
        assertTrue(w.getFacts().size() > 0);
        return w;
    }

    private static void checkFactGibbs(World w) {
        WorldProb wp = new WorldProb(w);
        int checked = 0;
        for (Entity a : w.getEntities()) {
            for (Entity b : w.getEntities()) {
                for (Relation r : w.getRelations()) {
                    Fact f = new Fact(r, a, b);
                    Double logOdds = new FactRV(w, f).logOddsExists();
                    if (logOdds == null) {
                        continue;
                    }
                    boolean was = w.facts.exists(f);
                    w.facts.setFact(f, true);
                    double on = wp.logProb();
                    w.facts.setFact(f, false);
                    double off = wp.logProb();
                    w.facts.setFact(f, was);
                    assertEquals("fact " + f, on - off, logOdds, TOL);
                    checked++;
                }
            }
        }
        assertTrue(checked > 10);
    }

    @Test
    public void factGibbsMatchesJointUnderBothSparsityModels() {
        checkFactGibbs(sampleWorld(1, false));
        checkFactGibbs(sampleWorld(2, true));
    }

    private static void checkRelationMove(World w) {
        WorldProb wp = new WorldProb(w);
        FactRelationMoveStep step = new FactRelationMoveStep(w);
        int checked = 0;
        for (Fact origin : w.getFacts().asListCopy()) {
            List<Relation> missing = step.missingRelations(origin);
            for (Relation target : missing) {
                double before = wp.logProb();
                double logAccept = step.logAcceptance(origin, target);
                step.apply(origin, target);
                double after = wp.logProb();
                Fact moved = new Fact(target, origin.getEnt1(), origin.getEnt2());
                assertEquals(missing.size(), step.missingRelations(moved).size());   // symmetric proposal
                step.apply(moved, origin.getRel());                                   // move back
                assertEquals(before, wp.logProb(), TOL);
                assertEquals("move " + origin + " -> " + target, after - before, logAccept, TOL);
                checked++;
            }
        }
        assertTrue(checked > 10);
    }

    @Test
    public void factRelationMoveMatchesJointUnderBothSparsityModels() {
        checkRelationMove(sampleWorld(3, false));
        checkRelationMove(sampleWorld(4, true));
    }

    private static void checkBirthDeath(World w) {
        WorldProb wp = new WorldProb(w);
        FactBirthDeathStep step = new FactBirthDeathStep(w);
        double logPotential = Math.log(w.numPotentialFactsPerRelation()) + Math.log(w.getNumRelations());
        int births = 0, deaths = 0;
        for (Entity a : w.getEntities()) {
            for (Entity b : w.getEntities()) {
                for (Relation r : w.getRelations()) {
                    Fact f = new Fact(r, a, b);
                    if (!w.getSentences().sentencesWithOrigin(f).isEmpty()) {
                        continue;
                    }
                    if (!w.facts.exists(f)) {
                        int unreferenced = step.numUnreferenced();
                        double before = wp.logProb();
                        double logAccept = step.logAcceptBirth(f);
                        w.facts.add(f);
                        double after = wp.logProb();
                        w.facts.remove(f);
                        double logProposal = -Math.log(unreferenced + 1) + logPotential;
                        assertEquals("birth " + f, after - before + logProposal, logAccept, TOL);
                        births++;
                    }
                    else {
                        int unreferenced = step.numUnreferenced();
                        double before = wp.logProb();
                        double logAccept = step.logAcceptDeath(f);
                        w.facts.remove(f);
                        double after = wp.logProb();
                        w.facts.add(f);
                        double logProposal = Math.log(unreferenced) - logPotential;
                        assertEquals("death " + f, after - before + logProposal, logAccept, TOL);
                        deaths++;
                    }
                }
            }
        }
        assertTrue(births > 10);
        assertTrue(deaths > 0);
    }

    @Test
    public void factBirthDeathMatchesJointUnderBothSparsityModels() {
        checkBirthDeath(sampleWorld(5, false));
        checkBirthDeath(sampleWorld(6, true));
    }
}
