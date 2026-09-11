package org.ucb.generative_ie.world;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.math3.special.Gamma;
import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.mcmc.FactRV;
import org.ucb.generative_ie.mcmc.SentenceOriginRV;

import com.google.common.collect.Maps;

/**
 * Checks the joint in {@link WorldProb} against hand calculations, and checks
 * that the relation-phase Gibbs steps ({@link FactRV}, {@link SentenceOriginRV})
 * condition on exactly that joint: their log-odds must equal differences of
 * WorldProb.logProb() between the two states.
 */
public class WorldProbTest {

    private static final double TOL = 1e-7;

    /** A small world sampled from the generative model itself, so every invariant holds. */
    private static World sampleWorld(long seed, int numEntities, int numRelations, int numTriggers,
            int numNouns, double sparsity, int numSentences) {
        Random rng = new Random(seed);
        WorldGenerator gen = new WorldGenerator(rng,
                Entities.defaultEntities(numEntities), Relations.defaultRelations(numRelations),
                NounLexicon.defaultNounLexicon(numNouns), Lexicon.defaultLexicon(numTriggers),
                0.5, 0.1, new ConstantSparsityGenerator(sparsity), numSentences);
        World w = gen.sampleWorld(true);
        assertTrue("sampled world needs at least one fact", w.getFacts().size() > 0);
        assertTrue(new WorldProb(w).consistencyProblems().isEmpty());
        return w;
    }

    @Test
    public void logProbFactsCountsEveryPotentialFact() {
        World w = sampleWorld(1, 3, 2, 4, 5, 0.1, 0);
        w.facts.clear();
        List<Entity> ents = w.getEntities().asList();
        List<Relation> rels = w.getRelations().asList();
        w.facts.add(new Fact(rels.get(0), ents.get(0), ents.get(1)));
        w.facts.add(new Fact(rels.get(1), ents.get(2), ents.get(2)));

        double expected = 2 * Math.log(0.1) + (3 * 3 * 2 - 2) * Math.log(0.9);
        assertEquals(expected, new WorldProb(w).logProbFacts(), TOL);
    }

    @Test
    public void logCollapsedTriggersIsDirichletMultinomial() {
        World w = sampleWorld(2, 2, 1, 3, 4, 0.9, 0);
        Fact f = w.facts.iterator().next();
        Lexicon lex = w.getWeightedLexicons().getLex();
        Noun noun = w.getWeightedNounLexicons().getNounLexicon().get(0);
        // three sentences for the single relation, triggers t0, t0, t1
        w.getSentences().add(new Sentence(f, lex.get(0), noun, noun));
        w.getSentences().add(new Sentence(f, lex.get(0), noun, noun));
        w.getSentences().add(new Sentence(f, lex.get(1), noun, noun));

        double beta = w.getBeta();
        double expected = Gamma.logGamma(3 * beta) - Gamma.logGamma(3 * beta + 3)
                + (Gamma.logGamma(beta + 2) - Gamma.logGamma(beta))
                + (Gamma.logGamma(beta + 1) - Gamma.logGamma(beta));
        assertEquals(expected, new WorldProb(w).logCollapsedTriggers(), TOL);
    }

    @Test
    public void logSentencesOriginIsUniformOverFacts() {
        World w = sampleWorld(3, 3, 2, 4, 5, 0.5, 12);
        double expected = -12 * Math.log(w.getFacts().size());
        assertEquals(expected, new WorldProb(w).logSentencesOrigin(), TOL);
    }

    @Test
    public void factGibbsConditionalMatchesJoint() {
        World w = sampleWorld(4, 4, 3, 5, 6, 0.3, 25);
        WorldProb wp = new WorldProb(w);

        int checked = 0;
        for (Entity a : w.getEntities()) {
            for (Entity b : w.getEntities()) {
                for (Relation r : w.getRelations()) {
                    Fact f = new Fact(r, a, b);
                    Double logOdds = new FactRV(w, f).logOddsExists();
                    if (logOdds == null) {
                        assertTrue("a referenced fact must exist", w.facts.exists(f));
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
    public void originRelationGibbsConditionalMatchesJoint() {
        World w = sampleWorld(5, 3, 3, 4, 5, 0.5, 30);
        WorldProb wp = new WorldProb(w);

        // give every sentence's entity pair a fact in every relation, so each has alternatives
        for (Sentence s : w.getSentences()) {
            for (Relation r : w.getRelations()) {
                w.facts.setFact(new Fact(r, s.getOrigin().getEnt1(), s.getOrigin().getEnt2()), true);
            }
        }

        int checked = 0;
        for (Sentence s : w.getSentences()) {
            Map<Relation, Double> weights = new SentenceOriginRV(w, s).relationLogWeights();
            assertEquals(w.getNumRelations(), weights.size());

            Fact original = s.getOrigin();
            Map<Relation, Double> joint = Maps.newHashMap();
            for (Relation r : weights.keySet()) {
                s.setOrigin(new Fact(r, original.getEnt1(), original.getEnt2()));
                joint.put(r, wp.logProb());
            }
            s.setOrigin(original);

            Relation ref = original.getRel();
            for (Relation r : weights.keySet()) {
                assertEquals("sentence " + s + " relation " + r,
                        joint.get(r) - joint.get(ref), weights.get(r) - weights.get(ref), TOL);
                checked++;
            }
        }
        assertTrue(checked > 0);
    }

    @Test
    public void originEntityGibbsConditionalMatchesJoint() {
        World w = sampleWorld(7, 4, 2, 4, 6, 0.4, 30);
        WorldProb wp = new WorldProb(w);

        // give every sentence alternatives for both arguments
        for (Sentence s : w.getSentences()) {
            Fact o = s.getOrigin();
            for (Entity e : w.getEntities()) {
                w.facts.setFact(new Fact(o.getRel(), e, o.getEnt2()), true);
                w.facts.setFact(new Fact(o.getRel(), o.getEnt1(), e), true);
            }
        }

        int checked = 0;
        for (boolean source : new boolean[] {true, false}) {
            for (Sentence s : w.getSentences()) {
                Map<Entity, Double> weights = new SentenceOriginRV(w, s).entityLogWeights(source);
                assertEquals(w.getNumEntities(), weights.size());

                Fact original = s.getOrigin();
                Map<Entity, Double> joint = Maps.newHashMap();
                for (Entity e : weights.keySet()) {
                    s.setOrigin(source ? new Fact(original.getRel(), e, original.getEnt2())
                                       : new Fact(original.getRel(), original.getEnt1(), e));
                    joint.put(e, wp.logProb());
                }
                s.setOrigin(original);

                Entity ref = source ? original.getEnt1() : original.getEnt2();
                for (Entity e : weights.keySet()) {
                    assertEquals("sentence " + s + " entity " + e + " source=" + source,
                            joint.get(e) - joint.get(ref), weights.get(e) - weights.get(ref), TOL);
                    checked++;
                }
            }
        }
        assertTrue(checked > 0);
    }

    @Test
    public void entityMovesKeepOriginsInFactsAndSyncFactsPrunesRemovedEntities() {
        World w = sampleWorld(6, 3, 2, 4, 5, 0.5, 10);
        WorldProb wp = new WorldProb(w);

        // Move every source mention of one entity to a fresh entity, as the entity samplers do.
        Entity old = w.getSentences().get(0).getOrigin().getEnt1();
        Entity fresh = w.getEntities().addNewEntity();
        for (Sentence s : w.getSentences()) {
            if (s.getOrigin().getEnt1().equals(old)) {
                s.getSourceMention().setEntity(fresh);
            }
            if (s.getOrigin().getEnt2().equals(old)) {
                s.getDestMention().setEntity(fresh);
            }
        }
        for (Sentence s : w.getSentences()) {
            assertTrue("origin must be a fact after a mention move: " + s, w.facts.exists(s.getOrigin()));
        }
        wp.logProb();   // must not throw

        // Remove the now-empty entity; its facts become stale until syncFacts().
        w.getEntities().removeEntity(old);
        w.getSentences().cleanEntity(old);
        List<String> problems = wp.consistencyProblems();
        assertFalse(problems.isEmpty());
        assertTrue(problems.get(0), problems.get(0).contains("removed entity"));

        assertTrue(w.syncFacts() > 0);
        assertTrue(wp.consistencyProblems().isEmpty());
        assertEquals(0, w.syncFacts());
    }
}
