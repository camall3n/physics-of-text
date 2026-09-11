package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class RelationSplitMergeTest {

    private static final double TOL = 1e-7;

    private static World sampleWorld(long seed, boolean sparsityPrior) {
        Random rng = new Random(seed);
        WorldGenerator gen = new WorldGenerator(rng,
                Entities.defaultEntities(5), Relations.defaultRelations(6),
                NounLexicon.defaultNounLexicon(6), Lexicon.defaultLexicon(5),
                0.5, 0.1, new ConstantSparsityGenerator(0.2), 40);
        World w = gen.sampleWorld(true);
        w.setRelationPriorMean(2);
        if (sparsityPrior) {
            w.setSparsityPrior(1, 30);
        }
        // guarantee an empty relation: merge the last relation into the first one it does not collide with
        RelationSplitMergeStep step = new RelationSplitMergeStep(w, true);
        List<Relation> rels = w.getRelations().asList();
        boolean emptied = false;
        for (Relation absorb : rels) {
            for (Relation keep : rels) {
                if (!emptied && !keep.equals(absorb) && !step.sharesEntityPair(keep, absorb)) {
                    step.applyMerge(keep, absorb);
                    emptied = true;
                }
            }
        }
        assertTrue("could not empty a relation", emptied);
        assertTrue(splitCandidates(w) != null);
        return w;
    }

    /** A relation with >= 2 facts and an empty relation, or null. */
    private static Relation[] splitCandidates(World w) {
        Relation source = null, target = null;
        for (Relation r : w.getRelations()) {
            int n = w.getFacts().factsWithRelation(r).size();
            if (n >= 2 && source == null) {
                source = r;
            }
            if (n == 0 && target == null) {
                target = r;
            }
        }
        return source == null || target == null ? null : new Relation[] {source, target};
    }

    private static void checkJointDelta(World w) {
        WorldProb wp = new WorldProb(w);
        RelationSplitMergeStep step = new RelationSplitMergeStep(w, true);
        Relation[] c = splitCandidates(w);
        assertTrue("need a splittable and an empty relation", c != null);
        List<Fact> facts = Lists.newArrayList(w.getFacts().factsWithRelation(c[0]));
        int checked = 0;
        // every non-empty proper subset of the first few facts
        int n = Math.min(facts.size(), 4);
        for (int mask = 1; mask < (1 << n) - 1; mask++) {
            Set<Fact> toTarget = Sets.newHashSet();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    toTarget.add(facts.get(i));
                }
            }
            if (toTarget.size() == facts.size()) {
                continue;
            }
            double before = wp.logProb();
            double delta = step.logJointDelta(c[0], c[1], toTarget);
            step.applySplit(c[0], c[1], toTarget);
            double after = wp.logProb();
            // the merge back sees the split state: its delta must be the same number
            Set<Fact> targetFacts = Sets.newHashSet(w.getFacts().factsWithRelation(c[1]));
            double deltaFromSplitState = step.logJointDelta(c[0], c[1], targetFacts);
            step.applyMerge(c[0], c[1]);
            assertEquals(before, wp.logProb(), TOL);
            assertEquals("split delta", after - before, delta, TOL);
            assertEquals("merge delta", after - before, deltaFromSplitState, TOL);
            checked++;
        }
        assertTrue(checked > 0);
    }

    @Test
    public void splitJointDeltaMatchesWorldProbUnderBothSparsityModels() {
        checkJointDelta(sampleWorld(11, false));
        checkJointDelta(sampleWorld(12, true));
    }

    @Test
    public void mergeIsRefusedWhenRelationsShareAnEntityPair() {
        World w = sampleWorld(13, false);
        RelationSplitMergeStep step = new RelationSplitMergeStep(w, true);
        Relation[] c = splitCandidates(w);
        Fact f = w.getFacts().factsWithRelation(c[0]).iterator().next();
        assertFalse(step.sharesEntityPair(c[0], c[1]));
        w.getFacts().add(new Fact(c[1], f.getEnt1(), f.getEnt2()));
        assertTrue(step.sharesEntityPair(c[0], c[1]));
    }

    @Test
    public void smartMergeProbabilitiesSumToOne() {
        World w = sampleWorld(14, false);
        RelationSplitMergeStep step = new RelationSplitMergeStep(w, false);
        List<Relation> nonEmpty = Lists.newArrayList();
        for (Relation r : w.getRelations()) {
            if (w.getFacts().factsWithRelation(r).size() > 0) {
                nonEmpty.add(r);
            }
        }
        double total = 0;
        for (Relation a : nonEmpty) {
            for (Relation b : nonEmpty) {
                if (!a.equals(b)) {
                    total += Math.exp(step.logSmartMergeProb(a, b));
                }
            }
        }
        assertEquals(1.0, total, 1e-9);
    }

    @Test
    public void logNumProperSubsetsIsExactForSmallN() {
        assertEquals(Math.log(2), RelationSplitMergeStep.logNumProperSubsets(2), 1e-12);
        assertEquals(Math.log(14), RelationSplitMergeStep.logNumProperSubsets(4), 1e-12);
    }

    /**
     * Run both kernels for a while on a small world: the sampler must keep the world
     * consistent, keep every relation's entity pairs distinct, and actually accept
     * some splits and merges.
     */
    @Test
    public void kernelsRunAndKeepInvariants() {
        World w = sampleWorld(15, true);
        WorldProb wp = new WorldProb(w);
        Random rng = new Random(0);
        RelationSplitMergeStep smart = new RelationSplitMergeStep(w, true);
        RelationSplitMergeStep dumb = new RelationSplitMergeStep(w, false);
        for (int i = 0; i < 2000; i++) {
            (i % 2 == 0 ? smart : dumb).sample(rng);
            if (i % 100 == 0) {
                assertTrue(wp.consistencyProblems().isEmpty());
                wp.logProb();
                for (Relation r : w.getRelations()) {
                    Set<Object> pairs = Sets.newHashSet();
                    for (Fact f : w.getFacts().factsWithRelation(r)) {
                        assertTrue("duplicate entity pair in " + r, pairs.add(f.getEntityPair()));
                    }
                }
            }
        }
        String report = RelationSplitMergeStep.acceptanceReport();
        assertFalse(report, report.contains("splits 0/"));
        assertFalse(report, report.contains("merges 0/"));
    }
}
