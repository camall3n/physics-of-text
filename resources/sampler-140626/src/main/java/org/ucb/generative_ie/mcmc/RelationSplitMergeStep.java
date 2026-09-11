package org.ucb.generative_ie.mcmc;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.EntityPair;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

/**
 * Split-merge Metropolis-Hastings moves over relations, in the smart-dumb/dumb-smart
 * style of Wang and Russell (UAI 2015) that the entity phase uses for entities.
 *
 * A split takes a relation with at least two facts and an empty slot of the relation
 * pool and divides the facts (each carrying its sentences) between them. A merge moves
 * every fact of one non-empty relation into another; it is rejected when the two
 * relations share an entity pair, which is exactly the case a split can never produce,
 * so the pair of moves is reversible.
 *
 * Two kernels, chosen by {@code smartSplit}:
 * <ul>
 * <li>smart split / dumb merge: facts are allocated one at a time, in a random order,
 *     with probability proportional to the collapsed Dirichlet predictive of the fact's
 *     dependency paths on each side; the merge picks an ordered pair of non-empty
 *     relations uniformly;</li>
 * <li>dumb split / smart merge: the split picks a uniformly random non-empty proper
 *     subset; the merge picks an ordered pair with probability proportional to the
 *     gain in collapsed trigger likelihood from merging them.</li>
 * </ul>
 * The random fact order used by the smart allocation is an auxiliary variable drawn
 * afresh, with the same distribution, in both directions; the merge computes the
 * probability that the smart split would have produced the current partition under
 * that order. Detailed balance then holds for each order and hence on average.
 *
 * The acceptance ratio is exposed as {@link #logJointDelta} (checked against
 * {@link WorldProb} in RelationSplitMergeTest) plus a log proposal ratio.
 */
public class RelationSplitMergeStep implements MCMCStep {

    private final World world;
    private final boolean smartSplit;
    private final List<Relation> relations;
    private static int splitsProposed, splitsAccepted, mergesProposed, mergesAccepted;

    public RelationSplitMergeStep(World world, boolean smartSplit) {
        this.world = world;
        this.smartSplit = smartSplit;
        this.relations = world.getRelations().asList();
    }

    @Override
    public String getStepKind() {
        return smartSplit ? "RelationSmartSplitDumbMerge" : "RelationDumbSplitSmartMerge";
    }

    @Override
    public double sample(Random rng) {
        if (rng.nextBoolean()) {
            return split(rng);
        }
        return merge(rng);
    }

    // ------------------------------------------------------------------ split

    private double split(Random rng) {
        List<Relation> splittable = relationsWithAtLeast(2);
        List<Relation> empty = relationsWithAtLeast(0, 0);
        if (splittable.isEmpty() || empty.isEmpty()) {
            return 0;
        }
        Relation source = RandomUtil.choice(splittable, rng);
        Relation target = RandomUtil.choice(empty, rng);
        List<Fact> facts = Lists.newArrayList(world.getFacts().factsWithRelation(source));
        int n = facts.size();

        Set<Fact> toTarget;
        double logProposalRatio;
        if (smartSplit) {
            List<Fact> order = Lists.newArrayList(facts);
            Collections.shuffle(order, rng);
            Map<Fact, Boolean> allocation = Maps.newHashMap();
            double logAlloc = smartAllocate(order, allocation, rng);
            toTarget = Sets.newHashSet();
            for (Map.Entry<Fact, Boolean> e : allocation.entrySet()) {
                if (e.getValue()) {
                    toTarget.add(e.getKey());
                }
            }
            if (toTarget.isEmpty()) {
                return 0;   // the allocation kept everything: not a split
            }
            // reverse is a dumb merge of an ordered pair among the M+1 non-empty relations
            int nonEmptyAfter = relationsWithAtLeast(1).size() + 1;
            double logForward = -Math.log(splittable.size()) - Math.log(empty.size()) + logAlloc;
            double logReverse = -Math.log(nonEmptyAfter) - Math.log(nonEmptyAfter - 1);
            logProposalRatio = logReverse - logForward;
        }
        else {
            toTarget = randomProperSubset(facts, rng);
            double logForward = -Math.log(splittable.size()) - Math.log(empty.size()) - logNumProperSubsets(n);
            // reverse is a smart merge of (source, target) in the split state: score it there
            applySplit(source, target, toTarget);
            double logReverse = logSmartMergeProb(source, target);
            applyMerge(source, target);
            logProposalRatio = logReverse - logForward;
        }

        double logAccept = logJointDeltaSplit(source, target, toTarget) + logProposalRatio;
        splitsProposed++;
        if (Math.log(rng.nextDouble()) < logAccept) {
            applySplit(source, target, toTarget);
            splitsAccepted++;
        }
        return Math.min(1, Math.exp(logAccept));
    }

    // ------------------------------------------------------------------ merge

    private double merge(Random rng) {
        List<Relation> nonEmpty = relationsWithAtLeast(1);
        int m = nonEmpty.size();
        if (m < 2) {
            return 0;
        }
        Relation keep, absorb;
        double logForward;
        if (smartSplit) {
            // dumb merge: uniform ordered pair
            keep = RandomUtil.choice(nonEmpty, rng);
            do {
                absorb = RandomUtil.choice(nonEmpty, rng);
            } while (absorb.equals(keep));
            logForward = -Math.log(m) - Math.log(m - 1);
        }
        else {
            // smart merge: the absorbed relation uniformly, the keeper by trigger likelihood gain
            absorb = RandomUtil.choice(nonEmpty, rng);
            Map<Relation, Double> scores = smartKeepLogScores(nonEmpty, absorb);
            double logNorm = logSumExp(scores.values());
            keep = sampleLog(scores, logNorm, rng);
            logForward = -Math.log(m) + scores.get(keep) - logNorm;
        }
        if (sharesEntityPair(keep, absorb)) {
            return 0;
        }

        Set<Fact> absorbed = Sets.newHashSet(world.getFacts().factsWithRelation(absorb));
        int n = world.getFacts().factsWithRelation(keep).size() + absorbed.size();
        int splittableAfter = relationsWithAtLeast(2).size()
                + (world.getFacts().factsWithRelation(keep).size() >= 2 ? 0 : 1)
                - (absorbed.size() >= 2 ? 1 : 0);
        int emptyAfter = relationsWithAtLeast(0, 0).size() + 1;

        double logReverse;
        if (smartSplit) {
            // reverse is a smart split of the merged relation reproducing this partition
            List<Fact> order = Lists.newArrayList(world.getFacts().factsWithRelation(keep));
            order.addAll(absorbed);
            Collections.shuffle(order, rng);
            double logAlloc = logSmartAllocationOf(order, absorbed);
            if (Double.isInfinite(logAlloc)) {
                return 0;
            }
            logReverse = -Math.log(splittableAfter) - Math.log(emptyAfter) + logAlloc;
        }
        else {
            logReverse = -Math.log(splittableAfter) - Math.log(emptyAfter) - logNumProperSubsets(n);
        }

        double logAccept = -logJointDeltaSplit(keep, absorb, absorbed) + (logReverse - logForward);
        mergesProposed++;
        if (Math.log(rng.nextDouble()) < logAccept) {
            applyMerge(keep, absorb);
            mergesAccepted++;
        }
        return Math.min(1, Math.exp(logAccept));
    }

    // ------------------------------------------------------------------ joint

    /**
     * log pi(split state) - log pi(current state) for moving the facts {@code toTarget}
     * of {@code source} into the empty relation {@code target}: the change in the two
     * relations' collapsed trigger terms, their fact terms, and the prior on the number
     * of occupied relations. Origins and nouns are unchanged. Also used, negated, for
     * the merge of {@code target} back into {@code source}: then {@code toTarget} are
     * the facts of {@code target} and the histograms are read from the merged state.
     */
    public double logJointDelta(Relation source, Relation target, Set<Fact> toTarget) {
        return logJointDeltaSplit(source, target, toTarget);
    }

    private double logJointDeltaSplit(Relation source, Relation target, Set<Fact> toTarget) {
        WorldProb wp = new WorldProb(world);
        double beta = world.getBeta();
        int numTrigs = world.getWeightedLexicons().getLex().size();

        // histograms as they would be with all the facts in one relation
        Multiset<Trigger> all = HashMultiset.create(world.getSentences().triggerHistogram(source));
        all.addAll(world.getSentences().triggerHistogram(target));
        Multiset<Trigger> moved = HashMultiset.create();
        for (Fact f : toTarget) {
            moved.addAll(triggersOf(f));
        }
        Multiset<Trigger> kept = HashMultiset.create(all);
        for (Multiset.Entry<Trigger> e : moved.entrySet()) {
            kept.remove(e.getElement(), e.getCount());
        }
        double delta = ModelFunctions.logBetaProb(kept, beta, numTrigs)
                + ModelFunctions.logBetaProb(moved, beta, numTrigs)
                - ModelFunctions.logBetaProb(all, beta, numTrigs);

        int n = world.getFacts().factsWithRelation(source).size() + world.getFacts().factsWithRelation(target).size();
        int nMoved = toTarget.size();
        delta += wp.logFactTerm(n - nMoved) + wp.logFactTerm(nMoved) - wp.logFactTerm(n) - wp.logFactTerm(0);

        int occupiedMerged = world.numOccupiedRelations()
                - (world.getFacts().factsWithRelation(target).size() > 0 ? 1 : 0);
        int mean = world.getRelationPriorMean();
        delta += WorldProb.logLogNormal(occupiedMerged + 1, mean) - WorldProb.logLogNormal(occupiedMerged, mean);
        return delta;
    }

    // ------------------------------------------------------------------ proposals

    /**
     * Allocate facts in the given order: the first stays, each later one goes to the
     * new relation with probability proportional to the collapsed predictive of its
     * triggers given what is already on each side. Fills {@code allocation} (true =
     * moved) and returns the log probability of the allocation produced.
     */
    private double smartAllocate(List<Fact> order, Map<Fact, Boolean> allocation, Random rng) {
        Multiset<Trigger> keptHist = HashMultiset.create(), movedHist = HashMultiset.create();
        double logProb = 0;
        boolean first = true;
        for (Fact f : order) {
            Multiset<Trigger> trigs = triggersOf(f);
            boolean move;
            if (first) {
                move = false;
                first = false;
            }
            else {
                double logPMove = logMoveProbability(keptHist, movedHist, trigs);
                move = Math.log(rng.nextDouble()) < logPMove;
                logProb += move ? logPMove : log1mExp(logPMove);
            }
            allocation.put(f, move);
            (move ? movedHist : keptHist).addAll(trigs);
        }
        return logProb;
    }

    /** log probability that {@link #smartAllocate} with this order would move exactly {@code moved}. */
    private double logSmartAllocationOf(List<Fact> order, Set<Fact> moved) {
        Multiset<Trigger> keptHist = HashMultiset.create(), movedHist = HashMultiset.create();
        double logProb = 0;
        boolean first = true;
        for (Fact f : order) {
            Multiset<Trigger> trigs = triggersOf(f);
            boolean move = moved.contains(f);
            if (first) {
                if (move) {
                    return Double.NEGATIVE_INFINITY;   // the first fact always stays
                }
                first = false;
            }
            else {
                double logPMove = logMoveProbability(keptHist, movedHist, trigs);
                logProb += move ? logPMove : log1mExp(logPMove);
            }
            (move ? movedHist : keptHist).addAll(trigs);
        }
        return logProb;
    }

    /** log P(fact goes to the new side) under the collapsed trigger predictive on each side. */
    private double logMoveProbability(Multiset<Trigger> keptHist, Multiset<Trigger> movedHist, Multiset<Trigger> trigs) {
        double beta = world.getBeta();
        int numTrigs = world.getWeightedLexicons().getLex().size();
        double logKeep = logPredictive(keptHist, trigs, beta, numTrigs);
        double logMove = logPredictive(movedHist, trigs, beta, numTrigs);
        return logMove - logSumExp2(logKeep, logMove);
    }

    private static double logPredictive(Multiset<Trigger> hist, Multiset<Trigger> added, double beta, int numTrigs) {
        Multiset<Trigger> combined = HashMultiset.create(hist);
        combined.addAll(added);
        return ModelFunctions.logBetaProb(combined, beta, numTrigs) - ModelFunctions.logBetaProb(hist, beta, numTrigs);
    }

    /**
     * Unnormalised log score of each candidate keeper for absorbing {@code absorb}: the
     * gain in collapsed trigger likelihood from merging the two histograms. Linear in the
     * number of non-empty relations, so the smart merge stays cheap at a few hundred.
     */
    private Map<Relation, Double> smartKeepLogScores(List<Relation> nonEmpty, Relation absorb) {
        double beta = world.getBeta();
        int numTrigs = world.getWeightedLexicons().getLex().size();
        Multiset<Trigger> absorbHist = world.getSentences().triggerHistogram(absorb);
        double absorbAlone = ModelFunctions.logBetaProb(absorbHist, beta, numTrigs);
        Map<Relation, Double> scores = Maps.newHashMap();
        for (Relation keep : nonEmpty) {
            if (keep.equals(absorb)) {
                continue;
            }
            Multiset<Trigger> keepHist = world.getSentences().triggerHistogram(keep);
            Multiset<Trigger> merged = HashMultiset.create(keepHist);
            merged.addAll(absorbHist);
            double gain = ModelFunctions.logBetaProb(merged, beta, numTrigs)
                    - ModelFunctions.logBetaProb(keepHist, beta, numTrigs) - absorbAlone;
            scores.put(keep, gain);
        }
        return scores;
    }

    /** log probability that the smart merge picks (keep, absorb) in the current state. */
    public double logSmartMergeProb(Relation keep, Relation absorb) {
        List<Relation> nonEmpty = relationsWithAtLeast(1);
        Map<Relation, Double> scores = smartKeepLogScores(nonEmpty, absorb);
        return -Math.log(nonEmpty.size()) + scores.get(keep) - logSumExp(scores.values());
    }

    private static Set<Fact> randomProperSubset(List<Fact> facts, Random rng) {
        Set<Fact> subset = Sets.newHashSet();
        do {
            subset.clear();
            for (Fact f : facts) {
                if (rng.nextBoolean()) {
                    subset.add(f);
                }
            }
        } while (subset.isEmpty() || subset.size() == facts.size());
        return subset;
    }

    /** log(2^n - 2): the number of non-empty proper subsets of n facts. */
    static double logNumProperSubsets(int n) {
        if (n < 40) {
            return Math.log(Math.pow(2, n) - 2);
        }
        return n * Math.log(2);
    }

    // ------------------------------------------------------------------ apply

    public void applySplit(Relation source, Relation target, Set<Fact> toTarget) {
        for (Fact f : toTarget) {
            moveFact(f, target);
        }
    }

    public void applyMerge(Relation keep, Relation absorb) {
        for (Fact f : Lists.newArrayList(world.getFacts().factsWithRelation(absorb))) {
            moveFact(f, keep);
        }
    }

    private void moveFact(Fact f, Relation target) {
        Fact moved = new Fact(target, f.getEnt1(), f.getEnt2());
        world.getFacts().add(moved);
        for (Sentence s : world.getSentences().sentencesWithOrigin(f)) {
            s.setOrigin(moved);
        }
        world.getFacts().remove(f);
    }

    // ------------------------------------------------------------------ helpers

    public boolean sharesEntityPair(Relation a, Relation b) {
        Set<EntityPair> pairs = Sets.newHashSet();
        for (Fact f : world.getFacts().factsWithRelation(a)) {
            pairs.add(f.getEntityPair());
        }
        for (Fact f : world.getFacts().factsWithRelation(b)) {
            if (pairs.contains(f.getEntityPair())) {
                return true;
            }
        }
        return false;
    }

    private List<Relation> relationsWithAtLeast(int minFacts) {
        return relationsWithAtLeast(minFacts, Integer.MAX_VALUE);
    }

    private List<Relation> relationsWithAtLeast(int minFacts, int maxFacts) {
        List<Relation> out = Lists.newArrayList();
        for (Relation r : relations) {
            int n = world.getFacts().factsWithRelation(r).size();
            if (n >= minFacts && n <= maxFacts) {
                out.add(r);
            }
        }
        return out;
    }

    private Multiset<Trigger> triggersOf(Fact f) {
        Multiset<Trigger> trigs = HashMultiset.create();
        for (Sentence s : world.getSentences().sentencesWithOrigin(f)) {
            trigs.add(s.getTrig());
        }
        return trigs;
    }

    private static double logSumExp2(double a, double b) {
        double m = Math.max(a, b);
        return m + Math.log(Math.exp(a - m) + Math.exp(b - m));
    }

    private static double logSumExp(Iterable<Double> values) {
        double m = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            m = Math.max(m, v);
        }
        double s = 0;
        for (double v : values) {
            s += Math.exp(v - m);
        }
        return m + Math.log(s);
    }

    /** log(1 - exp(x)) for x <= 0. */
    private static double log1mExp(double x) {
        if (x > -1e-12) {
            return Double.NEGATIVE_INFINITY;
        }
        return x > -0.693 ? Math.log(-Math.expm1(x)) : Math.log1p(-Math.exp(x));
    }

    private static Relation sampleLog(Map<Relation, Double> scores, double logNorm, Random rng) {
        double u = Math.log(rng.nextDouble());
        double acc = Double.NEGATIVE_INFINITY;
        Relation last = null;
        for (Map.Entry<Relation, Double> e : scores.entrySet()) {
            acc = logSumExp2(acc, e.getValue() - logNorm);
            last = e.getKey();
            if (u < acc) {
                return last;
            }
        }
        return last;
    }

    public static String acceptanceReport() {
        return String.format("relation splits %d/%d accepted, merges %d/%d accepted",
                splitsAccepted, splitsProposed, mergesAccepted, mergesProposed);
    }
}
