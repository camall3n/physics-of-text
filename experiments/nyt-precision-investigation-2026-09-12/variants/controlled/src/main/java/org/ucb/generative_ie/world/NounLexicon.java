package org.ucb.generative_ie.world;

import java.util.Collection;
import java.util.Random;
import org.ucb.generative_ie.util.RandomAccessHashSet;
import org.ucb.generative_ie.world.Noun;

/**
 * An object of Noun Lexicon which provides a RandomAccessHashSet of Nouns
 */

public class NounLexicon {
      private RandomAccessHashSet<Noun> set;

    public NounLexicon()
    {
        super();
        set = new RandomAccessHashSet<Noun>();
    }

    public NounLexicon(Collection<? extends Noun> c)
    {
        set = new RandomAccessHashSet<Noun>();
        for (Noun t : c) {
            add(t);
        }
    }

    public void add(Noun noun) {
        set.add(noun);
    }

    public int indexOf(Noun noun) {
        return set.indexOf(noun);
    }

    public Noun getCanonical(String nounString)
    {
        int index = indexOf(new Noun(nounString));

        if (index == -1) {
            throw new RuntimeException(String.format("%s does not exist as a trigger", nounString));
        }

        return set.asList().get(index);
    }

    public static NounLexicon defaultNounLexicon(int numNouns)
    {
        NounLexicon nounLex = new NounLexicon();
        for (int i = 0; i < numNouns; i++){
            Noun newNoun = new Noun(String.format("noun_%d", i));
            nounLex.add(newNoun);
        }
        
        return nounLex;
    }

    public int size() {
        return set.size();
    }

    public Noun get(int i) {
        return set.asList().get(i);
    }

    public Noun sample(Random rng) {
        return set.getRandom(rng);
    }
}
