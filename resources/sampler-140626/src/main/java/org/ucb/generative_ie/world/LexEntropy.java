package org.ucb.generative_ie.world;

import java.util.List;

import com.google.common.collect.Lists;

public class LexEntropy {

    public static double entropy(World world) {
        List<double[]> weights = Lists.newArrayList();

        for (WeightedLexicon lex : world.getWeightedLexicons().values()) {
            weights.add(lex.getWeights());
        }

        return entropy(weights);
    }

    public static double entropy(List<double[]> weights)
    {
        double[][] arr = new double[weights.size()][weights.get(0).length];
        weights.toArray(arr);
        return entropy(arr);
    }

    public static double entropy(double[]... weights)
    {
        int numRelations = weights.length;

        double totalEntropy = 0;

        // Assumes that a relation is picked at random
        for (int k = 0; k < weights[0].length; k++) {
            double totalWeight = 0;

            for (int r = 0; r < weights.length; r++) {
                totalWeight += weights[r][k];
            }

            double wordWeight = totalWeight / numRelations;

            double entropy = 0;
            for (int r = 0; r < weights.length; r++) {
                double v_k = weights[r][k] / totalWeight;
                if (v_k > 0) {
                    entropy -= v_k * log2(v_k);
                }
            }

            totalEntropy += wordWeight * entropy;
        }

        return totalEntropy;
    }

    private static double log2(double n) {
        return Math.log(n) / Math.log(2);
    }


}
