package org.ucb.generative_ie.mh;

import org.ucb.generative_ie.world.World;

/**
 *
 *
 */
public class EntityRandomMixStep extends GeneralMHStep{
    public EntityRandomMixStep(World world){
        super(world);
    }

    @Override
    public MHProposal createProposal() {
        return new EntityRandomMixProposal(world);
    }

    @Override
    public String getStepKind() {
        return "Entity Random Mix Step";
    }
}
