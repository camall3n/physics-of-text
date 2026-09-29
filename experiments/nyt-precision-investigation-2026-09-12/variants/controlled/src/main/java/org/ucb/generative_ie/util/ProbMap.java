package org.ucb.generative_ie.util;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Random;

public abstract class ProbMap<K> {
    protected HashMap<K, Double> data;
    protected double norm;
    protected boolean normalized;
    
    public ProbMap() {
        // Research harness: enum identity hash codes differ across JVM processes.
        // Insertion order fixes the CDF order without changing its probabilities.
        this.data = new java.util.LinkedHashMap<>();
        this.norm = 0.0;
        this.normalized = false;
    }
    
    public abstract void multiplyKey(K key, double val);
    
    public abstract void normalize();
    
    public K sample(Random rng) {
        if(normalized) {
            return normalizedSample(rng);
        }
        else {
            return nonNormalizedSample(rng);
        }
    }
    
    public abstract  K normalizedSample(Random rng);
    
    public abstract  K nonNormalizedSample(Random rng);
    
    public abstract int size();
    
    public double probKey(K key){
        return data.get(key);
    }
    
    public double getNorm() {
        return norm;
    }
}
