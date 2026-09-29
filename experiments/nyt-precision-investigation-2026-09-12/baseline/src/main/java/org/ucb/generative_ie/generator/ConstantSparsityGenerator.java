package org.ucb.generative_ie.generator;

import java.util.Random;

public class ConstantSparsityGenerator implements SparsityGenerator {

	private final double sparsity;

	public ConstantSparsityGenerator(double sparsity) {
		super();
		this.sparsity = sparsity;
	}

	@Override
	public double sampleSparsity(Random rng) {
		return sparsity;
	}

}
