package org.ucb.generative_ie.mcmc;

import java.util.Iterator;
import java.util.Random;

import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

/**
 * The relation-discovery phase: a random scan over three kinds of move.
 *
 * <ul>
 * <li>{@link FactBirthDeathStep}: add or remove a fact that no sentence reports;</li>
 * <li>{@link SentenceOriginRV}: Gibbs-resample one sentence's origin fact (its relation
 *     and argument entities) among the existing facts;</li>
 * <li>{@link FactRelationMoveStep}: transfer a fact with all its sentences to another
 *     relation, which is how relations gain and lose their sentences.</li>
 * </ul>
 *
 * Moves are created on demand rather than preallocated per potential fact, so the
 * memory cost does not grow with N^2 K.
 */
public class WorldInferSteps extends MCMCSteps {

    private final FactBirthDeathStep factStep;
    private final FactRelationMoveStep moveStep;

    public WorldInferSteps(World world, SentenceEvidence evidence, int numSteps) {
        super(world, evidence, numSteps);
        this.factStep = new FactBirthDeathStep(world);
        this.moveStep = new FactRelationMoveStep(world);
    }

    public WorldInferSteps(World world, SentenceEvidence evidence) {
        this(world, evidence, 100); //default number of steps
    }

    @Override
    public Iterator<MCMCStep> iterator() {
        return new RandomIterator();
    }

    class RandomIterator implements Iterator<MCMCStep> {
        private int currentIteration;
        private final Random rng;
        private final ProbMap<StepKind> stepSampler;

        public RandomIterator() {
            this.currentIteration = 0;
            this.rng = new Random();
            this.stepSampler = new NormalProbMap<>();
            this.stepSampler.multiplyKey(StepKind.FACT_BIRTH_DEATH, 1);
            this.stepSampler.multiplyKey(StepKind.SENTENCE_ORIGIN, 1);
            this.stepSampler.multiplyKey(StepKind.FACT_RELATION_MOVE, 1);
        }

        @Override
        public boolean hasNext() {
            return currentIteration < numSteps;
        }

        @Override
        public MCMCStep next() {
            currentIteration++;
            switch (stepSampler.sample(rng)) {
                case FACT_BIRTH_DEATH:
                    return factStep;
                case SENTENCE_ORIGIN:
                    int n = world.getSentences().size();
                    return new SentenceOriginRV(world, world.getSentences().get(rng.nextInt(n)));
                case FACT_RELATION_MOVE:
                    return moveStep;
                default:
                    throw new IllegalStateException();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

enum StepKind {
    FACT_BIRTH_DEATH, SENTENCE_ORIGIN, FACT_RELATION_MOVE
}
