package org.ucb.generative_ie.inference;

import org.ucb.generative_ie.world.UnorderedSentencePair;
import org.ucb.generative_ie.world.World;

public class SentenceSameRelationQuery extends Query {

    private final UnorderedSentencePair pair;

    public SentenceSameRelationQuery(UnorderedSentencePair pair) {
        this.pair = pair;
    }

    @Override
    public boolean isTrue(World world) {
        return pair.getS1().getOrigin().getRel().equals(pair.getS2().getOrigin().getRel());
    }

    /**
     * @return the pair
     */
    public UnorderedSentencePair getPair() {
        return pair;
    }

}
