package org.ucb.generative_ie.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.mh.EntitySmartSplitStep;

public class LogProbMap<K> extends ProbMap<K> {

    public final static Logger logger = LoggerFactory.getLogger(LogProbMap.class);
    public LogProbMap() {
        super();
    }

    @Override
    public void multiplyKey(K key, double val) {
        multiplyLogKey(key, Math.log(val));
    }

    public void multiplyKey(K key, double val, double exp) {
        multiplyLogKey(key, exp * Math.log(val));
    }

    public void multiplyLogKey(K key, double val) {
        if (Double.isInfinite(val)) {
            throw new RuntimeException("Infinite value");
        }

        if (data.containsKey(key))
        {
            data.put(key, data.get(key) + val);
        }
        else
        {
            data.put(key,  val);
        }
    }

    @Override
    public void normalize() {
        assert data.size() > 0;
        norm = 0;
        Collection<Double> values = data.values();
        for (Double d: values) {
            if (norm == 0) {
                norm = d;
            }
            else {
                norm = Util.logAdd(norm, d);
            }
        }
        for (K key : data.keySet()) {
            double valNorm = data.get(key) - norm;
            data.put(key, valNorm);
            logger.debug("valNorm: {}, norm: {}, value: {}", valNorm, norm, data.get(key));
        }
        normalized = true;
    }
    
    @Override
    public K normalizedSample(Random rng) {
        assert data.size() > 0;
        double sampledDouble = Math.log(rng.nextDouble());
        double tmp = 0;
        for (K key : data.keySet())
        {
            double current = data.get(key);
            if (tmp == 0)
            {
                tmp = current;
            }
            else
            {
                tmp = Util.logAdd(tmp, current);
            }

            if (sampledDouble <= tmp)
            {
                return key;
            }
        }

        throw new RuntimeException("sample error");
    }

        
    @Override
    public K nonNormalizedSample(Random rng) {
        assert data.size() > 0;
        Collection<Double> values = data.values();

        double totalProb = 0;

        for (Double d : values)
        {
            if (totalProb == 0)
            {
                totalProb = d;
            }
            else
            {
                totalProb = Util.logAdd(totalProb, d);
            }
        }

        double sampledDouble = Math.log(rng.nextDouble());
        double tmp = 0;
        for (K key : data.keySet())
        {
            double current = data.get(key) - totalProb;
            if (tmp == 0)
            {
                tmp = current;
            }
            else
            {
                tmp = Util.logAdd(tmp, current);
            }

            if (sampledDouble <= tmp)
            {
                return key;
            }
        }

        throw new RuntimeException("sample error");
    }
    
    @Override
    public int size() {
        return data.size();
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
}
