package org.ucb.generative_ie.inference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;


public class PrecisionRecallCurve {
	private final int totalRelevant;

    private final ArrayListMultimap<Boolean, Double> data;

    public PrecisionRecallCurve(int totalRelevant) {
    	this.totalRelevant = totalRelevant;
        data = ArrayListMultimap.create();
    }

	public void add(boolean isRelevant, double score) {
        data.put(isRelevant, score);
	}

    public List<Boolean> store() {
        Ordering<Map.Entry<Boolean, Double>> entryOrdering = Ordering.natural()
            .onResultOf(new Function<Map.Entry<Boolean, Double>, Double>() {
                @Override
				public Double apply(Map.Entry<Boolean, Double> entry) {
                    return entry.getValue();
                }
            }).reverse();

        Collection<Map.Entry<Boolean, Double>> test = entryOrdering.sortedCopy(data.entries());

        ArrayList<Boolean> relevants = Lists.newArrayList();

        for (Map.Entry<Boolean, Double> entry : test)
        {
            relevants.add(entry.getKey());
        }

        return relevants;
    }

    public List<Double> precision() {
        List<Boolean> relevants = store();

        int tp = 0;
        int fp = 0;

        List<Double> precision = Lists.newArrayList();
        List<Double> recall = Lists.newArrayList();

        for (Boolean current : relevants) {
            if (current) {
                tp += 1;
            }
            else {
                fp += 1;
            }

            precision.add((double) tp / (tp + fp));
            recall.add((double) tp / totalRelevant);
        }

        return precision;
    }

    public List<Double> recall() {
        List<Boolean> relevants = store();

        int tp = 0;
        int fp = 0;

        List<Double> precision = Lists.newArrayList();
        List<Double> recall = Lists.newArrayList();

        for (Boolean current : relevants) {
            if (current) {
                tp += 1;
            }
            else {
                fp += 1;
            }

            precision.add((double) tp / (tp + fp));
            recall.add((double) tp / totalRelevant);
        }

        return recall;
    }
}
