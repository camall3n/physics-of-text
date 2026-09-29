package org.ucb.generative_ie.mh;

import java.util.Random;

import org.ucb.generative_ie.world.World;

/**
 * 
 */
public class RadicalStep extends GeneralMHStep {

    public RadicalStep(World world) {
        super(world);
    }

    @Override
    public MHProposal createProposal() {
        return new RadicalProposal(world);
    }
    
    @Override
    public double sample(Random rng) {
        //System.out.println("Acceptance Ratio - Radical: " + getAcceptanceRatio());
        return super.sample(rng);
    }

    @Override
    public String getStepKind() {
        return "RadicalProposal";
    }
}
