package org.ucb.generative_ie.mcmc;

import java.util.Random;

/**
 * An interface for MCMC sampling step
 */
public interface MCMCStep {
    public double sample(Random rng);
    public String getStepKind();
}
