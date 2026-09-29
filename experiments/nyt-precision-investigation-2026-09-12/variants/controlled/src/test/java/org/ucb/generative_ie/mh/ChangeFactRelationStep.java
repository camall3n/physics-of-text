package org.ucb.generative_ie.mh;

import java.util.Set;

import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.World;

public class ChangeFactRelationStep extends GeneralMHStep {

	public ChangeFactRelationStep(World world) {
		super(world);
	}

	@Override
        public MHProposal createProposal() {
            return new ChangeFactRelationProposal(world);
	}

    @Override
    public String getStepKind() {
        return "ChangeFactRelation";
    }
}
