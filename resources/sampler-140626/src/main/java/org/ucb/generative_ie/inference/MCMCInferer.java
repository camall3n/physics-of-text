package org.ucb.generative_ie.inference;

import java.util.Iterator;
import java.util.Random;
import org.ucb.generative_ie.mcmc.MCMCStep;
import org.ucb.generative_ie.mcmc.MCMCSteps;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class MCMCInferer extends Inferer {

    private final World initialWorld;
    private final SentenceEvidence evidence;
    private final Random rng;
    private MCMCSteps mcmcSteps;

    /**
     * @param numIterations
     * @param initialWorld
     * @param evidence
     */
    public MCMCInferer(int numIterations, World initialWorld, SentenceEvidence evidence, Random rng) {
        this(numIterations, initialWorld, evidence, rng, new MCMCSteps(initialWorld, evidence));
    }

    /**
     * @param numIterations
     * @param initialWorld
     * @param evidence
     * @param mhSteps
     */
    public MCMCInferer(int numIterations, World initialWorld, SentenceEvidence evidence, Random rng, MCMCSteps mcmcSteps) {
        super(numIterations); // call the constructor of parent class Infer(int numIterations)
        this.initialWorld = initialWorld;
        this.evidence = evidence;
        this.mcmcSteps = mcmcSteps;
        this.rng = rng;
    }

    ///**
    // * @param numIterations
    // * @param initialWorld
    // * @param evidence
    // * @param mhSteps
    // */
    //public MCMCInferer(int numIterations, World initialWorld, SentenceEvidence evidence, MHSteps mhSteps) {
    //    super(numIterations); // call the constructor of parent class Infer(int numIterations)
    //    this.initialWorld = initialWorld;
    //    this.evidence = evidence;
    //    this.mhSteps = mhSteps;
    //    this.rng = new Random();
    //}

    public class MCMCInfererIterator implements Iterator<World>
    {
        private int currentIteration;
        private final World currentWorld;

        public MCMCInfererIterator() {
            this.currentIteration = 0;
            this.currentWorld = initialWorld; //TODO Mutates initial world (Implement copy)
        }

        @Override
        public boolean hasNext() {
            return currentIteration < numIterations;
        }

        @Override
        public World next() {
            if (currentIteration % (numIterations / 10) == 0)
            {
                System.err.print(String.format("++Iteration: (%d / %d)\n", currentIteration, numIterations));
            }

            for (MCMCStep mcmcStep : mcmcSteps)
            {
                mcmcStep.sample(rng);
                //if (currentIteration % (numIterations ) == 0)
                //{
                //    System.out.println(mcmcStep.getStepKind());
                //}
            }

            currentIteration++;
            return this.currentWorld;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    @Override
    public Iterator<World> iterator() {
        return new MCMCInfererIterator();
    }
}
