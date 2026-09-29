package org.ucb.generative_ie.inference;

import java.util.Map;
import java.util.Set;

import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.UnorderedSentencePair;
import org.ucb.generative_ie.world.World;

import com.google.common.base.Predicates;
import com.google.common.collect.Maps;

public class SentenceSameRelations {
    Map<UnorderedSentencePair, Boolean> sameRelation;

    public SentenceSameRelations(World world) {
        sameRelation = Maps.newHashMap();

        for (Sentence s1 : world.getSentences()) {
            for (Sentence s2 : world.getSentences()) {
                UnorderedSentencePair pair = new UnorderedSentencePair(s1, s2);

                if (!sameRelation.containsKey(pair)) {
                    sameRelation.put(pair, s1.getOrigin().getRel().equals(s2.getOrigin().getRel()));
                }
            }
        }
    }

    public Set<UnorderedSentencePair> allPairs() {
        return sameRelation.keySet();
    }

    public Set<UnorderedSentencePair> truePairs() {
        return Maps.filterValues(sameRelation, Predicates.equalTo(true)).keySet();
    }

    public boolean contains(UnorderedSentencePair pair) {
        if (sameRelation.containsKey(pair)) {
            return sameRelation.get(pair);
        }
        else {
            throw new RuntimeException(pair + " not in table");
        }

    }

}
