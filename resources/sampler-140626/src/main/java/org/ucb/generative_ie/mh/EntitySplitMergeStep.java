package org.ucb.generative_ie.mh;

import org.ucb.generative_ie.world.World;

/**
 *
 *
 */
public class EntitySplitMergeStep extends GeneralMHStep{
    public EntitySplitMergeStep(World world){
        super(world);
    }

    @Override
    public MHProposal createProposal() {
        return new EntitySplitMergeProposal(world);
    }

    @Override
    public String getStepKind() {
        return "Entity Split Merge Step";
    }
    
    
}
