package org.ucb.generative_ie.util;

import org.apache.commons.math3.special.Gamma;

/**
 * lgamma(k + offset) for non-negative integer k, memoised. The collapsed Dirichlet
 * terms only ever need lgamma at a count plus a fixed concentration, and computing
 * lgamma dominated the smart-merge proposal at corpus scale.
 */
public final class LogGammaTable {

    private final double offset;
    private double[] table = new double[1024];
    private int filled = 0;

    public LogGammaTable(double offset) {
        if (!(offset > 0)) {
            throw new IllegalArgumentException("offset must be positive");
        }
        this.offset = offset;
    }

    public double get(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("negative count");
        }
        if (k >= table.length) {
            int size = table.length;
            while (size <= k) {
                size *= 2;
            }
            table = java.util.Arrays.copyOf(table, size);
        }
        while (filled <= k) {
            table[filled] = Gamma.logGamma(filled + offset);
            filled++;
        }
        return table[k];
    }

    public double offset() {
        return offset;
    }
}
