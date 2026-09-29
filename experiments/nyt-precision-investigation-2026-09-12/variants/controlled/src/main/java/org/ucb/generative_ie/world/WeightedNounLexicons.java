package org.ucb.generative_ie.world;

import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * The class WeightedNounLexicons is a HasMap that makes the link between Entity
 * and WeightedNounLexicon. 
 * Each Entity has its WeightedNounLexicon, i.e. dictionary of nouns for
 * each given entity.
 */
public class WeightedNounLexicons extends HashMap<Entity, WeightedNounLexicon> {
    
    private NounLexicon nounLexicon;
    private static final long serialVersionUID = -7033790310353456741L;

    public WeightedNounLexicons(NounLexicon nounLexicon) {
        this.nounLexicon = nounLexicon;
    }

    public double getWeight(Entity e, Noun n) {
        return this.get(e).getWeight(n);
    }

    public Entity getMaxEntity(Noun n) {
        Entity maxEntity = null;
        double maxWeight = 0;
        for (Entity e : this.keySet()) {
            double currentWeight = getWeight(e, n);
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                maxEntity = e;
            }
        }

        return maxEntity;
    }

    public Set<Entity> getEntities(Noun n, double threshold) {
        Set<Entity> result = Sets.newHashSet();

        for (Entity e : this.keySet()) {
            double currentWeight = getWeight(e, n);
            if (currentWeight > threshold) {
                result.add(e);
            }
        }
        return result;
    }

    /**
     * Add the counts from Multiset to the prior
     * @param histogram: the counts of NounLexicons for each entity
     * @param alpha:  the Dirichlet priors
     * @return 
     */
    public double[] convertToWeights(Multiset<Noun> histogram, double alpha) {
        double alphas[] = new double[nounLexicon.size()];
        Arrays.fill(alphas, alpha);

        for (Multiset.Entry<Noun> entry : histogram.entrySet()) {
            Noun n = entry.getElement();
            int count = entry.getCount();
            alphas[nounLexicon.indexOf(n)] += count;
        }

        return alphas;
    }

    /**
     * @return the lex
     */
    public NounLexicon getNounLexicon() {
        return nounLexicon;
    }
}
