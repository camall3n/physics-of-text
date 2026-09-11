package org.ucb.generative_ie.mcmc;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

/**
 * Metropolis-Hastings move that transfers one fact, together with every sentence
 * that reports it, to a relation that has no fact for that entity pair yet.
 *
 * This is the move that lets a sentence change relation at all: the Gibbs step on a
 * sentence's origin can only choose among facts that already exist for its entity
 * pair, and at corpus scale a pair almost never has more than one. It is a port of
 * Justin Uang's ChangeFactRelationProposal (2013) to the current model, adding the
 * fact-sparsity and relation-count terms that the old version did not have.
 *
 * The proposal picks a fact uniformly and a target uniformly among the relations
 * missing for the fact's entity pair; the reverse move has the same probabilities,
 * so the acceptance ratio is the ratio of the joint alone.
 */
public class FactRelationMoveStep implements MCMCStep {

    private final World world;
    private final List<Relation> relations;
    private static int proposed, accepted;

    public FactRelationMoveStep(World world) {
        this.world = world;
        this.relations = world.getRelations().asList();
    }

    @Override
    public String getStepKind() {
        return "FactRelationMove";
    }

    @Override
    public double sample(Random rng) {
        if (world.getFacts().size() == 0) {
            return 0;
        }
        Fact origin = world.getFacts().sampleAll(rng);
        List<Relation> missing = missingRelations(origin);
        if (missing.isEmpty()) {
            return 0;
        }
        Relation target = RandomUtil.choice(missing, rng);

        proposed++;
        double logAccept = logAcceptance(origin, target);
        if (Math.log(rng.nextDouble()) < logAccept) {
            apply(origin, target);
            accepted++;
        }
        return Math.min(1, Math.exp(logAccept));
    }

    /** Relations that have no fact with this fact's entity pair. */
    public List<Relation> missingRelations(Fact origin) {
        Set<Relation> present = Sets.newHashSet();
        for (Fact f : world.getFacts().factsWithEntityPair(origin.getEntityPair())) {
            present.add(f.getRel());
        }
        List<Relation> missing = Lists.newArrayList();
        for (Relation r : relations) {
            if (!present.contains(r)) {
                missing.add(r);
            }
        }
        return missing;
    }

    /**
     * log of the acceptance ratio for moving {@code origin} and its sentences to
     * {@code target}: the change in the collapsed trigger likelihood of the two
     * relations, in the two relations' fact terms, and in the prior on the number
     * of occupied relations. The origin and noun terms do not change.
     */
    public double logAcceptance(Fact origin, Relation target) {
        Relation source = origin.getRel();
        WorldProb wp = new WorldProb(world);

        Multiset<Trigger> moved = HashMultiset.create();
        for (Sentence s : world.getSentences().sentencesWithOrigin(origin)) {
            moved.add(s.getTrig());
        }
        int numTrigs = world.getWeightedLexicons().getLex().size();
        double logRatio = ModelFunctions.logMoveTriggersRatio(
                world.getSentences().triggerHistogram(source),
                world.getSentences().triggerHistogram(target),
                moved, world.getBeta(), numTrigs);

        int nSource = world.getFacts().factsWithRelation(source).size();
        int nTarget = world.getFacts().factsWithRelation(target).size();
        logRatio += wp.logFactTerm(nSource - 1) - wp.logFactTerm(nSource);
        logRatio += wp.logFactTerm(nTarget + 1) - wp.logFactTerm(nTarget);

        int occupied = world.numOccupiedRelations();
        int occupiedAfter = occupied - (nSource == 1 ? 1 : 0) + (nTarget == 0 ? 1 : 0);
        int mean = world.getRelationPriorMean();
        logRatio += WorldProb.logLogNormal(occupiedAfter, mean) - WorldProb.logLogNormal(occupied, mean);

        return logRatio;
    }

    /** Carry out the move. */
    public void apply(Fact origin, Relation target) {
        Fact moved = new Fact(target, origin.getEnt1(), origin.getEnt2());
        world.getFacts().add(moved);
        for (Sentence s : world.getSentences().sentencesWithOrigin(origin)) {
            s.setOrigin(moved);
        }
        world.getFacts().remove(origin);
    }

    public static double acceptanceRatio() {
        return proposed == 0 ? 0 : (double) accepted / proposed;
    }
}
