package org.ucb.generative_ie.generator;

import java.util.Random;

import org.ucb.generative_ie.random.DirichletDistr;

public class BetaSparsityGenerator implements SparsityGenerator {

    private double alpha, beta;


    /**
     * @param alpha
     * @param beta
     */
    public BetaSparsityGenerator(double alpha, double beta) {
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double sampleSparsity(Random rng) {
        double params[] = {alpha, beta};
        double result[] = DirichletDistr.dirichlet(params);
        return result[0];
    }

}
