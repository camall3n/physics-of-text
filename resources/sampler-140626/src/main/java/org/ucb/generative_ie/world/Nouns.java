package org.ucb.generative_ie.world;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import com.google.common.collect.Maps;

public class Nouns implements Iterable<Noun> {
	private final Map<String, Noun> nouns;

	public Nouns()
	{
		super();
		this.nouns = Maps.newHashMap();
	}

    public Nouns(Collection<? extends Noun> toAdd)
    {
		super();
		this.nouns = Maps.newHashMap();
        for (Noun n : toAdd) {
            add(n);
        }
    }

	@Override
	public Iterator<Noun> iterator() {
		return nouns.values().iterator();
	}

    public int size() {
        return nouns.size();
    }


    public boolean contains(Noun n) {
        return nouns.containsKey(n.getName()) && nouns.containsValue(n);
    }


	public void add(Noun n)
	{
		nouns.put(n.getName(), n);
	}

	public Noun get(String name)
	{
		return nouns.get(name);
	}

	public static Nouns defaultNouns(int numNouns)
	{
		Nouns nouns = new Nouns();
		for (int i = 0; i < numNouns; i++) {
			Noun newNoun = new Noun(String.format("noun_%d", i));
			nouns.add(newNoun);
		}

		return nouns;
	}

	public static Nouns nounsWithNames(String... names)
	{
		Nouns nouns = new Nouns();
		for (String name : names)
		{
			Noun newNoun = new Noun(name);
			nouns.add(newNoun);
		}

		return nouns;
	}
}
