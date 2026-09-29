package org.ucb.generative_ie.world;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

/**
 * The class WeightedLexicons is a HasMap that makes the link between Relation
 * and WeightedLexicon.
 * Each Relation has its WeightedLexicon, i.e. dictionary of lexicon for
 * a given relation.
 */
public class WeightedLexicons extends HashMap<Relation, WeightedLexicon> {
    
    private Lexicon lex;

    public WeightedLexicons(Lexicon lex) {
        this.lex = lex;
    }

    /**
     *
     */
    private static final long serialVersionUID = -7033790310353456741L;

    public double getWeight(Relation r, Trigger trig) {
        return this.get(r).getWeight(trig);
    }

    public Relation getMaxRelation(Trigger trig) {
        Relation maxRelation = null;
        double maxWeight = 0;
        for (Relation r : this.keySet()) {
            double currentWeight = getWeight(r, trig);
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                maxRelation = r;
            }
        }

        return maxRelation;
    }

    public Set<Relation> getRelations(Trigger trig, double threshold) {
        Set<Relation> result = Sets.newHashSet();

        for (Relation r : this.keySet()) {
            double currentWeight = getWeight(r, trig);
            if (currentWeight > threshold) {
                result.add(r);
            }
        }
        return result;
    }

    /**
     * Add the counts from Multiset to the prior
     * @param histogram: the counts of Lexicons for each relation
     * @param alpha:  the Dirichlet priors
     * @return 
     */
    public double[] convertToWeights(Multiset<Trigger> histogram, double beta) {
        double betas[] = new double[lex.size()];
        Arrays.fill(betas, beta);

        for (Multiset.Entry<Trigger> entry : histogram.entrySet()) {
            Trigger t = entry.getElement();
            int count = entry.getCount();
            betas[lex.indexOf(t)] += count;
        }

        return betas;
    }

    /**
     * @return the lex
     */
    public Lexicon getLex() {
        return lex;
    }

}
