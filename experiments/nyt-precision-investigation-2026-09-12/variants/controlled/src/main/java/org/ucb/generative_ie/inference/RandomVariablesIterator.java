package org.ucb.generative_ie.inference;

import java.util.Iterator;
import java.util.Set;

import org.ucb.generative_ie.mcmc.FactRV;
import org.ucb.generative_ie.mh.MHStep;
import org.ucb.generative_ie.mcmc.SentenceOriginRV;
import org.ucb.generative_ie.mcmc.WeightedLexiconRV;
import org.ucb.generative_ie.world.World;

public class RandomVariablesIterator implements Iterator<MHStep> {

    private World world;
    Set<FactRV> factRVs;
    Set<SentenceOriginRV> sentenceOriginRVs;
    Set<WeightedLexiconRV> weightedLexiconRVs;

    int samplesPerWorld;

    @Override
    public boolean hasNext() {
        // TODO Check for edge cases
        return true;
    }

    @Override
    public MHStep next() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
