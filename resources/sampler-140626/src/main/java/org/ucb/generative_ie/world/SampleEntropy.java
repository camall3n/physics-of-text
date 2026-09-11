package org.ucb.generative_ie.world;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import org.ucb.generative_ie.generator.WorldGenerator;

import com.google.common.collect.Lists;

public class SampleEntropy {

    private Map<World, Double> worldToEntropy;
    private NavigableMap<Double, World> entropyToWorld;

    public SampleEntropy(WorldGenerator gen, int numSamples) {
        worldToEntropy = new HashMap<>();
        for (int i = 0; i < numSamples; i++) {
            World sample = gen.sampleWorld();

            List<double[]> weights = Lists.newArrayList();

            for (WeightedLexicon lex : sample.getWeightedLexicons().values()) {
                weights.add(lex.getWeights());
            }

            double entropy = LexEntropy.entropy(weights);
            worldToEntropy.put(sample, entropy);
        }

        entropyToWorld = new TreeMap<>();

        for (Map.Entry<World, Double> entry : worldToEntropy.entrySet()) {
            World w = entry.getKey();
            double entropy = entry.getValue();

            entropyToWorld.put(entropy, w);
        }
    }

    public NavigableMap<Double, World> getEntropySubsetMap(double from, double to) {
        return entropyToWorld.subMap(from, true, to, false);
    }

    public Collection<World> getEntropySubset(double from, double to) {
        return entropyToWorld.subMap(from, true, to, false).values();
    }

}
