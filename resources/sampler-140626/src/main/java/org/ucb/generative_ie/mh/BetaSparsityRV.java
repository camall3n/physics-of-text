package org.ucb.generative_ie.mh;

import java.util.Random;

import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.world.World;
/**
 *  TODO
 */
public class BetaSparsityRV implements MHStep {

    private final World world;

    /**
     * @param world
     */
    public BetaSparsityRV(World world) {
        this.world = world;
    }

    @Override
    public double sample(Random rng) {
        double params[] = {1, 100}; //TODO Don't hard code this

        params[0] += world.getFacts().size();
        params[1] += world.getEntities().sizeCurrent() * world.getEntities().sizeCurrent() * world.getRelations().size() - world.getFacts().size();

        double result[] = DirichletDistr.dirichlet(params);

        world.setSparsity(result[0]);

        return 1;
    }

}
