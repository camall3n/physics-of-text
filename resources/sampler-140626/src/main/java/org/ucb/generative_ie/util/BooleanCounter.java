package org.ucb.generative_ie.util;

/**
 * Count the True and False percent for a given event
 */
public class BooleanCounter {

	int numTrue = 0;
	int numFalse = 0;

	public void add(boolean b) {
		if (b)
			numTrue++;
		else
			numFalse++;
	}

	public int numTrue() {
		return numTrue;
	}

	public int numFalse() {
		return numFalse;
	}

    public int total() {
        return numTrue + numFalse;
    }

	public double percentTrue() {
		return (double) numTrue / total();
	}

	public double percentFalse() {
		return (double) numFalse / total();
	}

    public String toString() {
        return String.format("%f (%d / %d)", percentTrue(), numTrue(), total());

    }
}
