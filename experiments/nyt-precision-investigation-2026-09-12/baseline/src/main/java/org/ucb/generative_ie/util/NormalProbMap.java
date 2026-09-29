package org.ucb.generative_ie.util;

import java.util.Map;
import java.util.Random;

/** Nonnegative categorical weights, normalized after scaling by their maximum. */
public class NormalProbMap<K> extends ProbMap<K> {
    /** Multiplication uses the currently stored weights, even after normalization. */
    @Override
    public void multiplyKey(K key, double val) {
        if (!Double.isFinite(val) || val < 0) {
            throw new IllegalArgumentException("Weights must be finite and nonnegative");
        }
        double updated = data.containsKey(key) ? data.get(key) * val : val;
        if (!Double.isFinite(updated)) {
            throw new IllegalArgumentException("Weight multiplication overflowed; use LogProbMap");
        }
        data.put(key, updated);
        normalized = false;
    }

    private double maximum() {
        double max = 0;
        for (double weight : data.values()) max = Math.max(max, weight);
        if (max == 0) {
            throw new IllegalStateException("A categorical distribution needs at least one positive weight");
        }
        return max;
    }

    private double scaledTotal(double max) {
        double total = 0;
        for (double weight : data.values()) total += weight / max;
        return total;
    }

    @Override
    public void normalize() {
        if (normalized) return;
        double max = maximum(), total = scaledTotal(max);
        norm = max * total; // May exceed double range; probabilities do not.
        for (Map.Entry<K, Double> entry : data.entrySet()) {
            entry.setValue((entry.getValue() / max) / total);
        }
        normalized = true;
    }

    @Override
    public K normalizedSample(Random rng) {
        if (!normalized) normalize();
        return draw(rng, 1, 1);
    }

    @Override
    public K nonNormalizedSample(Random rng) {
        double max = maximum();
        return draw(rng, max, scaledTotal(max));
    }

    private K draw(Random rng, double scale, double total) {
        double threshold = rng.nextDouble() * total, cumulative = 0;
        K lastPositive = null;
        for (Map.Entry<K, Double> entry : data.entrySet()) {
            double weight = entry.getValue() / scale;
            if (weight == 0) continue;
            lastPositive = entry.getKey();
            cumulative += weight;
            if (threshold < cumulative) return entry.getKey();
        }
        return lastPositive; // Roundoff at the last CDF boundary.
    }

    @Override public int size() { return data.size(); }
    @Override public String toString() { return "NormalProbMap: " + data; }
}
