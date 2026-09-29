package org.ucb.generative_ie.mh;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.*;

/** Independent finite-world checks for the two active entity split/merge kernels. */
public class EntityProposalRegressionTest {
    private static final double TOL = 1e-10;

    private static class MoveRandom extends Random {
        private final boolean split;
        private boolean first = true;
        MoveRandom(boolean split, long seed) { super(seed); this.split = split; }
        @Override public boolean nextBoolean() {
            if (first) { first = false; return split; }
            return super.nextBoolean();
        }
    }

    private static class ProperSplitRandom extends Random {
        private int call;
        @Override public boolean nextBoolean() { return call++ < 2; }
    }

    private static World world(double alpha, double beta, int[][] counts) {
        int vocabulary = counts[0].length;
        World w = new WorldGenerator(new Random(1), Entities.defaultEntities(counts.length),
                Relations.defaultRelations(1), NounLexicon.defaultNounLexicon(vocabulary),
                Lexicon.defaultLexicon(2), alpha, beta, new ConstantSparsityGenerator(0.1), 0).emptyWorld();
        List<Entity> entities = w.getEntities().asList();
        List<Entity> mentionEntities = new ArrayList<Entity>();
        List<Noun> mentionNouns = new ArrayList<Noun>();
        NounLexicon nouns = w.getWeightedNounLexicons().getNounLexicon();
        for (int e = 0; e < counts.length; e++) {
            for (int n = 0; n < vocabulary; n++) {
                for (int i = 0; i < counts[e][n]; i++) {
                    mentionEntities.add(entities.get(e));
                    mentionNouns.add(nouns.get(n));
                }
            }
        }
        assertEquals("A sentence has two mentions", 0, mentionEntities.size() % 2);
        for (int i = 0; i < mentionEntities.size(); i += 2) {
            Fact f = new Fact(w.getRelations().asList().get(0), mentionEntities.get(i), mentionEntities.get(i + 1));
            w.getFacts().add(f);
            w.getSentences().add(new Sentence(f, w.getWeightedLexicons().getLex().get(0),
                    mentionNouns.get(i), mentionNouns.get(i + 1)));
        }
        return w;
    }

    private static MHProposal proposal(World w, boolean smartSplit) {
        return (smartSplit ? new EntitySmartSplitStep(w) : new EntitySmartMergeStep(w)).createProposal();
    }

    private static Object field(MHProposal p, String name) throws Exception {
        Field f = p.getClass().getDeclaredField(name);
        f.setAccessible(true);
        return f.get(p);
    }

    private static int[] histogram(World w, Entity e) {
        NounLexicon vocabulary = w.getWeightedNounLexicons().getNounLexicon();
        int[] counts = new int[vocabulary.size()];
        for (int n = 0; n < counts.length; n++) counts[n] = w.getSentences().nounHistogram(e).count(vocabulary.get(n));
        return counts;
    }

    private static int[] histogram(World w, List<Mention> mentions) {
        NounLexicon vocabulary = w.getWeightedNounLexicons().getNounLexicon();
        int[] counts = new int[vocabulary.size()];
        for (Mention m : mentions) counts[vocabulary.indexOf(m.getNoun())]++;
        return counts;
    }

    private static int[] add(int[] a, int[] b) {
        int[] result = a.clone();
        for (int i = 0; i < result.length; i++) result[i] += b[i];
        return result;
    }

    /** Direct sequential Dirichlet predictive product; no production log-beta helper. */
    private static double likelihood(int[] counts, double alpha) {
        double result = 1;
        int seen = 0;
        for (int n = 0; n < counts.length; n++) {
            for (int k = 0; k < counts[n]; k++) result *= (alpha + k) / (alpha * counts.length + seen++);
        }
        return result;
    }

    private static double selectionProbability(List<int[]> entities, int selected, double alpha, boolean inverse) {
        double sum = 0;
        for (int[] hist : entities) {
            double weight = likelihood(hist, alpha);
            sum += inverse ? 1 / weight : weight;
        }
        double weight = likelihood(entities.get(selected), alpha);
        return (inverse ? 1 / weight : weight) / sum;
    }

    /** Sum the two explicitly ordered ways to select this merge pair. */
    private static double smartMergeProbability(List<int[]> entities, int first, int second, double alpha) {
        double result = 0;
        for (int[] order : new int[][] {{first, second}, {second, first}}) {
            double normalizer = 0;
            for (int candidate = 0; candidate < entities.size(); candidate++) {
                if (candidate != order[0]) normalizer += likelihood(add(entities.get(order[0]), entities.get(candidate)), alpha);
            }
            result += selectionProbability(entities, order[0], alpha, false)
                    * likelihood(add(entities.get(order[0]), entities.get(order[1])), alpha) / normalizer;
        }
        return result;
    }

    private static double smartAllocationProbability(World w, List<Mention> all, List<Mention> first) {
        List<Mention> order = new ArrayList<Mention>(all);
        java.util.Collections.sort(order);
        int[] allCounts = histogram(w, all), a = new int[allCounts.length], b = new int[allCounts.length];
        int distinct = 0, na = 0, nb = 0;
        for (int count : allCounts) if (count > 0) distinct++;
        double result = 1, alpha = 10 * w.getAlpha();
        for (Mention m : order) {
            int n = w.getWeightedNounLexicons().getNounLexicon().indexOf(m.getNoun());
            double pa = (alpha + a[n]) / (distinct * alpha + na);
            double pb = (alpha + b[n]) / (distinct * alpha + nb);
            if (first.contains(m)) { result *= pa / (pa + pb); a[n]++; na++; }
            else { result *= pb / (pa + pb); b[n]++; nb++; }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private static double expectedRatio(World w, MHProposal p, boolean smartSplit, boolean split) throws Exception {
        List<Entity> ids = w.getEntities().asList();
        List<int[]> before = new ArrayList<int[]>();
        for (Entity e : ids) before.add(histogram(w, e));
        List<Mention> all = (List<Mention>) field(p, "mentionsEntity");
        List<Mention> firstMentions = (List<Mention>) field(p, "mentionsEntity1");
        List<Mention> secondMentions = (List<Mention>) field(p, "mentionsEntity2");
        int[] merged = histogram(w, all), first = histogram(w, firstMentions), second = histogram(w, secondMentions);
        double allocation;
        if (smartSplit) {
            // Enumerate both labelled allocations; they are symmetric but checked separately.
            allocation = smartAllocationProbability(w, all, firstMentions)
                    + smartAllocationProbability(w, all, secondMentions);
        } else allocation = 2 * Math.pow(0.5, all.size());
        double alpha = w.getAlpha();
        if (split) {
            int parent = ids.indexOf((Entity) field(p, "entity"));
            List<int[]> after = new ArrayList<int[]>(before);
            after.set(parent, first);
            after.add(second);
            double forward = selectionProbability(before, parent, alpha, smartSplit) * allocation;
            double backward = smartSplit ? 2.0 / (after.size() * (after.size() - 1))
                    : smartMergeProbability(after, parent, after.size() - 1, alpha);
            return backward / forward;
        }
        int a = ids.indexOf((Entity) field(p, "entity1")), b = ids.indexOf((Entity) field(p, "entity2"));
        double forward = smartSplit ? 2.0 / (before.size() * (before.size() - 1))
                : smartMergeProbability(before, a, b, alpha);
        List<int[]> after = new ArrayList<int[]>();
        after.add(merged);
        for (int i = 0; i < before.size(); i++) if (i != a && i != b) after.add(before.get(i));
        return selectionProbability(after, 0, alpha, smartSplit) * allocation / forward;
    }

    private static void assertIndexes(World w) {
        NounLexicon nouns = w.getWeightedNounLexicons().getNounLexicon();
        for (Entity e : w.getEntities()) {
            int[] expected = new int[nouns.size()];
            int mentions = 0;
            for (Sentence s : w.getSentences()) {
                assertEquals(s.getOrigin().getEnt1(), s.getSourceMention().getEntity());
                assertEquals(s.getOrigin().getEnt2(), s.getDestMention().getEntity());
                if (s.getOrigin().getEnt1().equals(e)) { expected[nouns.indexOf(s.getArg1())]++; mentions++; }
                if (s.getOrigin().getEnt2().equals(e)) { expected[nouns.indexOf(s.getArg2())]++; mentions++; }
            }
            assertArrayEquals(expected, histogram(w, e));
            assertEquals(mentions, w.getSentences().getMentionsByEntity(e).size());
        }
    }

    @Test public void inverseSplitSelectionUsesNegativeLogLikelihood() {
        World w = world(0.1, 0.7, new int[][] {{1, 0}, {0, 1}});
        MHProposal p = proposal(w, true);
        p.sample(new MoveRandom(false, 17));
        // Only one parent exists after merging; split A|B has probability 2*(1/2)*(3/5).
        assertEquals(0.6, p.proposalRatio(), TOL);
        assertEquals(0.6, p.proposalRatio(), TOL);
    }

    @Test public void reverseSmartMergeHasNoPhantomCandidate() {
        World w = world(0.1, 0.7, new int[][] {{1, 1}});
        MHProposal p = proposal(w, false);
        p.sample(new ProperSplitRandom());
        // Split probability is 1/2; the only available reverse merge has probability one.
        assertEquals(2, p.proposalRatio(), TOL);
        assertEquals(2, p.proposalRatio(), TOL);
    }

    @Test public void nullMovesCannotCreateOrRemoveEntities() {
        for (boolean smartSplit : new boolean[] {false, true}) {
            for (boolean split : new boolean[] {false, true}) {
                World w = world(0.1, 0.7, new int[][] {{0, 0}, {0, 0}});
                MHProposal p = proposal(w, smartSplit);
                p.sample(new MoveRandom(split, 3));
                assertTrue(p.isNull());
                assertEquals(0, p.proposalRatio(), 0);
                p.applyProposal();
                assertEquals(2, w.getNumEntities());
            }
            World w = world(0.1, 0.7, new int[][] {{1, 1}});
            MHProposal p = proposal(w, smartSplit);
            p.sample(new MoveRandom(false, 5));
            assertTrue(p.isNull());
            p.applyProposal();
            assertEquals(1, w.getNumEntities());
        }
    }

    @Test public void proposalsMatchIndependentProbabilitiesAndEntityTarget() throws Exception {
        int checked = 0;
        for (double alpha : new double[] {0.07, 0.4}) {
            for (boolean smartSplit : new boolean[] {true, false}) {
                for (boolean split : new boolean[] {true, false}) {
                    for (int seed = 0; seed < 24; seed++) {
                        World w = world(alpha, 0.83, new int[][] {{2, 1, 0}, {1, 0, 2}, {0, 2, 0}, {0, 0, 0}});
                        MHProposal p = proposal(w, smartSplit);
                        p.sample(new MoveRandom(split, seed));
                        if (p.isNull()) continue;
                        double expected = expectedRatio(w, p, smartSplit, split);
                        double recorded = p.proposalRatio();
                        assertEquals(expected, recorded, TOL * Math.max(1, expected));
                        assertEquals(recorded, p.proposalRatio(), 0);
                        int beforeCount = w.getNumEntities();
                        double before = new WorldProb(w).logProbLabeledEntityWorld();
                        double stateRatio = p.stateRatio();
                        p.applyProposal();
                        double after = new WorldProb(w).logProbLabeledEntityWorld();
                        // The proposal acceptance now includes the missing N! density factor.
                        double countFactor = split ? Math.log(beforeCount + 1) : -Math.log(beforeCount);
                        assertEquals(after - before + countFactor, Math.log(stateRatio), TOL);
                        assertEquals("Proposal snapshots survive application", recorded, p.proposalRatio(), 0);
                        assertIndexes(w);
                        checked++;
                    }
                }
            }
        }
        assertTrue("Both kernels need many non-null checks", checked >= 100);
    }

    @Test public void properSplitAndReverseMergeHaveReciprocalRatios() {
        for (boolean smartSplit : new boolean[] {true, false}) {
            World w = world(0.1, 0.9, new int[][] {{1, 1}});
            MHProposal split = proposal(w, smartSplit);
            Random rng = smartSplit ? new Random(7) {
                int call;
                @Override public boolean nextBoolean() { return true; }
                @Override public double nextDouble() { return call++ < 2 ? 0.1 : 0.9; }
            } : new ProperSplitRandom();
            split.sample(rng);
            double forwardState = split.stateRatio(), forwardProposal = split.proposalRatio();
            split.applyProposal();
            for (Entity e : w.getEntities()) assertEquals(1, w.getSentences().getMentionsByEntity(e).size());
            MHProposal merge = proposal(w, smartSplit);
            merge.sample(new MoveRandom(false, 2));
            assertEquals(1, forwardState * merge.stateRatio(), TOL);
            assertEquals(1, forwardProposal * merge.proposalRatio(), TOL);
        }
    }

    @Test public void oneEmptyDaughterAndItsReverseMergeRemainAllowed() {
        for (boolean smartSplit : new boolean[] {true, false}) {
            World w = world(0.1, 0.9, new int[][] {{1, 1}});
            MHProposal split = proposal(w, smartSplit);
            split.sample(new Random(8) {
                @Override public boolean nextBoolean() { return true; }
                @Override public double nextDouble() { return 0.1; }
            });
            assertFalse(split.isNull());
            double forwardState = split.stateRatio(), forwardProposal = split.proposalRatio();
            split.applyProposal();
            assertEquals(2, w.getNumEntities());
            assertEquals(1, w.getSentences().getNonEmptyEntitySize());
            MHProposal merge = proposal(w, smartSplit);
            merge.sample(new MoveRandom(false, 2));
            assertFalse(merge.isNull());
            assertEquals(1, forwardState * merge.stateRatio(), TOL);
            assertEquals(1, forwardProposal * merge.proposalRatio(), TOL);
            merge.applyProposal();
            assertEquals(1, w.getNumEntities());
            assertIndexes(w);
        }
    }
}
