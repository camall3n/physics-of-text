package org.ucb.generative_ie.util;

import java.util.Map;
import java.util.Random;

/** Categorical log weights; negative infinity represents zero mass. */
public class LogProbMap<K> extends ProbMap<K> {
    @Override
    public void multiplyKey(K key, double val) { multiplyKey(key, val, 1); }

    public void multiplyKey(K key, double val, double exponent) {
        if (!Double.isFinite(val) || val < 0 || !Double.isFinite(exponent)) {
            throw new IllegalArgumentException("Weights must be finite and nonnegative; exponent must be finite");
        }
        multiplyLogKey(key, exponent == 0 ? 0 : exponent * Math.log(val));
    }

    /** Multiplication uses the currently stored weights, even after normalization. */
    public void multiplyLogKey(K key, double val) {
        checkLogWeight(val);
        double updated = data.containsKey(key) ? data.get(key) + val : val;
        checkLogWeight(updated);
        data.put(key, updated);
        normalized = false;
    }

    private static void checkLogWeight(double val) {
        if (Double.isNaN(val) || val == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("Log weights must be finite or negative infinity");
        }
    }

    private double maximum() {
        double max = Double.NEGATIVE_INFINITY;
        for (double weight : data.values()) max = Math.max(max, weight);
        if (max == Double.NEGATIVE_INFINITY) {
            throw new IllegalStateException("A categorical distribution needs at least one positive weight");
        }
        return max;
    }

    private double scaledTotal(double max) {
        double total = 0;
        for (double weight : data.values()) total += Math.exp(weight - max);
        return total;
    }

    @Override
    public void normalize() {
        if (normalized) return;
        double max = maximum();
        double logTotal = Math.log(scaledTotal(max));
        norm = max + logTotal;
        // Subtract the offset first: weight - norm loses logTotal at large offsets.
        for (Map.Entry<K, Double> entry : data.entrySet()) {
            entry.setValue((entry.getValue() - max) - logTotal);
        }
        normalized = true;
    }

    @Override
    public K normalizedSample(Random rng) {
        if (!normalized) normalize();
        return draw(rng, 0, 1);
    }

    @Override
    public K nonNormalizedSample(Random rng) {
        double max = maximum();
        return draw(rng, max, scaledTotal(max));
    }

    private K draw(Random rng, double offset, double total) {
        double threshold = rng.nextDouble() * total, cumulative = 0;
        K lastPositive = null;
        for (Map.Entry<K, Double> entry : data.entrySet()) {
            double weight = Math.exp(entry.getValue() - offset);
            if (weight == 0) continue;
            lastPositive = entry.getKey();
            cumulative += weight;
            if (threshold < cumulative) return entry.getKey();
        }
        return lastPositive; // Only the last-bin rounding gap can remain.
    }

    @Override public int size() { return data.size(); }
    @Override public String toString() { return data.toString(); }
}
