package org.ucb.generative_ie.mcmc;

import java.util.Collection;
import java.util.Random;
import org.ucb.generative_ie.mh.MHStep;

import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.World;

/**
 * Sample a random fact from the world.
 */
public class FactRV implements MCMCStep {
    private final World world;
    private final Fact fact;

    /**
     * @param world
     * @param fact
     */
    public FactRV(World world, Fact fact) {
        this.world = world;
        this.fact = fact;
    }

    @Override
    public String getStepKind() {
        return "FactRV";
    }
    
    /**
     * log P(fact holds | everything else) - log P(fact absent | everything else).
     * Two terms survive: the sparsity prior, and the uniform choice of origin fact
     * made by every sentence (which depends on how many facts exist). The dictionary
     * terms cancel because no sentence references this fact.
     *
     * @return null when a sentence references the fact, in which case it must hold;
     *         +infinity when it is the only fact the sentences could originate from.
     */
    public Double logOddsExists() {
        Collection<Sentence> references = world.getSentences().sentencesWithOrigin(fact);
        if (references.size() > 0) {
            return null;
        }

        double sparsity = world.getSparsity();
        int numSentences = world.getSentences().size();
        int otherFacts = world.facts.size() - (world.facts.exists(fact) ? 1 : 0);

        double logOdds = Math.log(sparsity) - Math.log(1 - sparsity);
        if (numSentences > 0) {
            if (otherFacts == 0) {
                return Double.POSITIVE_INFINITY;
            }
            logOdds += numSentences * (Math.log(otherFacts) - Math.log(otherFacts + 1));
        }
        return logOdds;
    }

    @Override
    public double sample(Random rng) {
        Double logOdds = logOddsExists();
        if (logOdds == null) {
            // Referenced by a sentence: exists with probability 1, nothing to sample.
            return 1;
        }

        boolean makeExist;
        if (Double.isInfinite(logOdds)) {
            makeExist = logOdds > 0;
        }
        else {
            double probExists = 1.0 / (1.0 + Math.exp(-logOdds));
            makeExist = rng.nextDouble() < probExists;
        }

        world.facts.setFact(fact, makeExist);
        return 1;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fact == null) ? 0 : fact.hashCode());
        result = prime * result + ((world == null) ? 0 : world.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FactRV other = (FactRV) obj;
        if (fact == null) {
            if (other.fact != null)
                return false;
        } else if (!fact.equals(other.fact))
            return false;
        if (world == null) {
            if (other.world != null)
                return false;
        } else if (!world.equals(other.world))
            return false;
        return true;
    }
}
