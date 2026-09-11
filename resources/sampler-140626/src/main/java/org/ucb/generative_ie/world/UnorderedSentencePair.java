package org.ucb.generative_ie.world;

import java.util.Set;

import com.google.common.collect.Sets;
/**
 * ??
 */
public class UnorderedSentencePair {
	private final Sentence s1;
	private final Sentence s2;

	private final Set<Sentence> pair;

	public Sentence getS1() {
		return s1;
	}

	public Sentence getS2() {
		return s2;
	}

	public UnorderedSentencePair(Sentence s1, Sentence s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.pair = Sets.newHashSet(s1, s2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pair == null) ? 0 : pair.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnorderedSentencePair other = (UnorderedSentencePair) obj;
		if (pair == null) {
			if (other.pair != null)
				return false;
		} else if (!pair.equals(other.pair))
			return false;
		return true;
	}
}
