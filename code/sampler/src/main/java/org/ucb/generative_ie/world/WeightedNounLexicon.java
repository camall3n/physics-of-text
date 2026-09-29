package org.ucb.generative_ie.world;

import java.util.Random;
import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.Util;

/**
 * The WeightedNounLexicon class gives weights to nouns.
 *
 */
public class WeightedNounLexicon {
    private final NounLexicon nounLexicon;
    private double [] weights;
    
    public WeightedNounLexicon(NounLexicon nounLexicon, double [] weights){
        this.nounLexicon = nounLexicon;
        this.weights = weights;
    }
        
    /**
     * @return the NounLexicon
     */
    public NounLexicon getNounLexicon() {
        return nounLexicon;
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
    
    public double getWeight(Noun noun)
    {
        return this.weights[this.nounLexicon.indexOf(noun)]; //TODO Make this sublinear
    }

    /**
     * Sample a Noun from NounLexicon, according to the probability in the 
     * dictionary.
     * @param rng
     * @return 
     */
    public Noun sample(Random rng) {
        NormalProbMap<Noun> sampler = new NormalProbMap<>();

        for (int i = 0; i < weights.length; i++) {
            sampler.multiplyKey(nounLexicon.get(i), weights[i]);
        }

        return sampler.sample(rng);
    }
}
