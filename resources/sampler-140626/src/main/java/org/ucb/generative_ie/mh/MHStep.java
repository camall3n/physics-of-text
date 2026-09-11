package org.ucb.generative_ie.mh;

import java.util.Random;

public interface MHStep {
    public double sample(Random rng);
}
