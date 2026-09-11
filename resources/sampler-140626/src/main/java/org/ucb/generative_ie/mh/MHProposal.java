package org.ucb.generative_ie.mh;

import java.util.Random;

import org.ucb.generative_ie.world.World;

/**
 * This allows the model to accept or reject a Metropolis-Hasting proposal.
 */
abstract class MHProposal {
    
    protected World world;
    private boolean isNull = false;
    
    public MHProposal(World world) {
        this.world = world;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull() {
        isNull = true;
    }

    public abstract void sample(Random rng);

    public abstract double stateRatio();

    public abstract double proposalRatio();

    public abstract void applyProposal();

    public void dontApplyProposal() {

    }
}
