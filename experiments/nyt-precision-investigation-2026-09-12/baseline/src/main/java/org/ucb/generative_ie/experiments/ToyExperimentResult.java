package org.ucb.generative_ie.experiments;

public class ToyExperimentResult extends Result {
	public ToyExperimentResult(double same, double diff) {
		super();
		this.same = same;
		this.diff = diff;
	}

	public double same;
	public double diff;
}
