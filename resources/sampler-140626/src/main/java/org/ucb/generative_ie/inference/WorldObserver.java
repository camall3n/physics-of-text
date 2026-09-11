package org.ucb.generative_ie.inference;

import org.ucb.generative_ie.world.World;

public abstract class WorldObserver {
	public abstract void observe(World world, int iteration);
}
