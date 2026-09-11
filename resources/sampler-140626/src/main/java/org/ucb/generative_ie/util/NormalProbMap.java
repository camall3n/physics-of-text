package org.ucb.generative_ie.util;

import java.util.Collection;
import java.util.Random;


public class NormalProbMap<K> extends ProbMap<K> {

    //private HashMap<K, Double> data;
    //private double norm;

    public NormalProbMap() {
       super();
       normalized =false;
    }

    @Override
    public void multiplyKey(K key, double val)
    {
        if (data.containsKey(key)){
            data.put(key, data.get(key) * val);
        }
        else {
            data.put(key,  val);
        }
    }

    @Override
    public void normalize()
    {
        assert data.size() > 0;
        norm = 0;
        Collection<Double> values = data.values();
        for (Double d: values) {
            norm += d;
        }
        for (K key : data.keySet()) {
            double valNorm = data.get(key)/norm;
            data.put(key, valNorm);
        }
        normalized = true;
    }

    @Override
    public K normalizedSample(Random rng) {
        assert data.size() > 0;
        if (norm == 0){
            throw new RuntimeException("Total Probability of all values is 0");
        }
        double sampledDouble = rng.nextDouble();
        double tmp = 0;
        for (K key : data.keySet())
        {
            tmp += data.get(key);
            if (sampledDouble <= tmp)
            {
                return key;
            }
        }
        throw new RuntimeException(String.format("sample error, current Map: %s\n", data.toString()));
    }
    
    @Override
    public K nonNormalizedSample(Random rng)
    {
        assert data.size() > 0;
        double totalProb = 0;
        Collection<Double> values = data.values();
        for (Double d : values)
        {
            totalProb += d;
        }

        if (totalProb == 0)
        {
            throw new RuntimeException("Total Probability of all values is 0");
        }

        double sampledDouble = rng.nextDouble() * totalProb;
        double tmp = 0;
        for (K key : data.keySet())
        {
            tmp += data.get(key);
            if (sampledDouble <= tmp)
            {
                return key;
            }
        }
        throw new RuntimeException(String.format("sample error, current Map: %s\n", data.toString()));
    }

    @Override
    public int size() {
        return data.size();
    }
    
    @Override
    public String toString(){
        String stringRef = new String();
        for (K key : data.keySet()) {
            stringRef += " "+ key.toString() + ":" + data.get(key).toString()+ " ";
        }
        
        return "NormalProbMap: [" + stringRef + "]";
    }
}
