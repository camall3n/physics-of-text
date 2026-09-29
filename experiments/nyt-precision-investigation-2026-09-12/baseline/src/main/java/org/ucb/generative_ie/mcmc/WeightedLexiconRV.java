package org.ucb.generative_ie.mcmc;

import java.util.Random;

import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.WeightedLexicon;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Multiset;

/**
 * Sample a random Relation from the world.
 */
public class WeightedLexiconRV implements MCMCStep {

    private final World world;
    private final Relation relation;
    private final WeightedLexicon weightedLexicon;

    /**
     * @param world
     * @param weightedLexicon
     */
    public WeightedLexiconRV(World world, Relation relation, WeightedLexicon weightedLexicon) {
        this.world = world;
        this.weightedLexicon = weightedLexicon;
        this.relation = relation;
    }

    @Override
    public String getStepKind() {
        return "WeightedLexiconRV";
    }
     
    @Override
    public double sample(Random rng) {
        Multiset<Trigger> t1 = world.getSentences().triggerHistogram(relation);

        double[] betas = world.getWeightedLexicons().convertToWeights(t1, world.getBeta());

        double newWeights[] = DirichletDistr.dirichlet(betas);

        this.weightedLexicon.setWeights(newWeights);

        return 1;
    }

}
