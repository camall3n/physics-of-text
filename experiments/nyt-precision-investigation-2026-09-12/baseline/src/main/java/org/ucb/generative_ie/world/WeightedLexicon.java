package org.ucb.generative_ie.world;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.Util;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;

/**
 * The WeightedLexicon class gives weights to Lexicon.
 * For example, the weights can be initialized using Dirichlet priors.
 */
public class WeightedLexicon {
    
    private final Lexicon lex;
    private double[] weights;
    
    public WeightedLexicon(Lexicon lex, double[] weights) {
        this.lex = lex;
        this.weights = weights;
    }

    public double getWeight(Trigger trig)
    {
        return this.weights[this.lex.indexOf(trig)]; //TODO Make this sublinear
    }

    /**
     * Sample a Trigger from Lexicon, according to the probability in the 
     * dictionary.
     * @param rng
     * @return 
     */
    public Trigger sample(Random rng) {
        NormalProbMap<Trigger> sampler = new NormalProbMap<>();

        for (int i = 0; i < weights.length; i++) {
            sampler.multiplyKey(lex.get(i), weights[i]);
        }

        return sampler.sample(rng);
    }

    /**
     * @return the lex
     */
    public Lexicon getLex() {
        return lex;
    }

    /**
     * @return the weights
     */
    public double[] getWeights() {
        return weights;
    }

    /**
     * @param weights the weights to set
     */
    public void setWeights(double[] weights) {
        if (Math.abs(Util.sum(weights) - 1) > 0.01)
        {
            throw new RuntimeException("weights don't add to 1");
        }
        this.weights = weights;
    }

    public Map<Trigger, Double> getTopTriggers(int k) {
        Map<Trigger, Double> results = Maps.newHashMap();

        for (int i = 0; i < weights.length; i++) {
            results.put(lex.get(i), weights[i]);
        }
        Ordering<Map.Entry<Trigger, Double>> entryOrdering = Ordering.natural()
            .onResultOf(new Function<Map.Entry<Trigger, Double>, Double>() {
                @Override
                public Double apply(Map.Entry<Trigger, Double> entry) {
                    return entry.getValue();
                }
            }).reverse();

        // Desired entries in desired order.  Put them in an ImmutableMap in this order.
        ImmutableMap.Builder<Trigger, Double> builder = ImmutableMap.builder();
        for (Map.Entry<Trigger, Double> entry : Iterables.limit(entryOrdering.sortedCopy(results.entrySet()), k)) {
            builder.put(entry.getKey(), entry.getValue());
        }

        return builder.build();
    }

    public List<Map.Entry<Trigger, Double>> getTopTriggersList(int k) {
        Map<Trigger, Double> results = Maps.newHashMap();

        for (int i = 0; i < weights.length; i++) {
            results.put(lex.get(i), weights[i]);
        }
        Ordering<Map.Entry<Trigger, Double>> entryOrdering = Ordering.natural()
            .onResultOf(new Function<Map.Entry<Trigger, Double>, Double>() {
                @Override
                public Double apply(Map.Entry<Trigger, Double> entry) {
                    return entry.getValue();
                }
            }).reverse();

        // Desired entries in desired order.  Put them in an ImmutableMap in this order.
        ImmutableList.Builder<Map.Entry<Trigger, Double>> builder = ImmutableList.builder();
        for (Map.Entry<Trigger, Double> entry : Iterables.limit(entryOrdering.sortedCopy(results.entrySet()), k)) {
            builder.add(entry);
        }

        return builder.build();
    }
}
