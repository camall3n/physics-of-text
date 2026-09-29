package org.ucb.generative_ie.inference;

import org.ucb.generative_ie.world.World;

public abstract class Query {
    abstract public boolean isTrue(World world);
}
