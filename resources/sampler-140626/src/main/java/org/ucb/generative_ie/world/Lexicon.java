package org.ucb.generative_ie.world;

import java.util.Collection;
import java.util.Random;

import org.ucb.generative_ie.util.RandomAccessHashSet;

/**
 * An object of Lexicon provides a HashSet of Triggers
 */
public class Lexicon {

    private RandomAccessHashSet<Trigger> set;

    public Lexicon()
    {
        super();
        set = new RandomAccessHashSet<Trigger>();
    }

    public Lexicon(Collection<? extends Trigger> c)
    {
        set = new RandomAccessHashSet<Trigger>();
        for (Trigger t : c) {
            add(t);
        }
    }

    public void add(Trigger trig) {
        set.add(trig);
    }

    public int indexOf(Trigger trig) {
        return set.indexOf(trig);
    }

    public Trigger getCanonical(String trigString)
    {
        int index = indexOf(new Trigger(trigString));

        if (index == -1) {
            throw new RuntimeException(String.format("%s does not exist as a trigger", trigString));
        }

        return set.asList().get(index);
    }

    public static Lexicon defaultLexicon(int numTriggers)
    {
        Lexicon lex = new Lexicon();
        for (int i = 0; i < numTriggers; i++)
        {
            Trigger newTrigger = new Trigger(String.format("trig_%d", i));
            lex.add(newTrigger);
        }

        return lex;
    }

    public int size() {
        return set.size();
    }

    public Trigger get(int i) {
        return set.asList().get(i);
    }

    public Trigger sample(Random rng) {
        return set.getRandom(rng);
    }
}
