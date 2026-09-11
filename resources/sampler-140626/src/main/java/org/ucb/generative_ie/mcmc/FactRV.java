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
    
    @Override
    public double sample(Random rng) {
        Collection<Sentence> references = world.getSentences().sentencesWithOrigin(fact);

        // If something is pointing to it, then the fact must exist, and
        // will continue to exist with probability 1.0. No point in
        // sampling the existance of the fact.
        if (references.size() == 0)
        {
            // Flip coin based on sparsity
            LogProbMap<Boolean> sampler = new LogProbMap<>();
            sampler.multiplyKey(true, world.getSparsity());
            sampler.multiplyKey(false, 1 - world.getSparsity());

            int didExist = world.facts.exists(fact)? 1 : 0;

            // Factor in the SentenceOriginRV (raised to the power for the number of sentences)
            sampler.multiplyKey(true, 1.0 / (world.facts.size() - didExist + 1), world.getSentences().size());
            sampler.multiplyKey(false, 1.0 / (world.facts.size() - didExist), world.getSentences().size());

            boolean makeExist = sampler.sample(rng);

            world.facts.setFact(fact, makeExist);
        }

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
