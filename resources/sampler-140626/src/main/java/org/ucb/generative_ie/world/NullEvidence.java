package org.ucb.generative_ie.world;

public class NullEvidence implements Evidence {

	@Override
	public boolean acceptWorld(World world) {
		// Always return true
		return true;
	}

}
