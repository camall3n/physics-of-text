package org.ucb.generative_ie.world;
/**
 * SentenceConstraint is how Triples appear in Evidence.
 */
public class SentenceConstraint {
	public SentenceConstraint(Noun arg1, Noun arg2, Trigger trigger) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.trigger = trigger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arg1 == null) ? 0 : arg1.hashCode());
		result = prime * result + ((arg2 == null) ? 0 : arg2.hashCode());
		result = prime * result + ((trigger == null) ? 0 : trigger.hashCode());
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
		SentenceConstraint other = (SentenceConstraint) obj;
		if (arg1 == null) {
			if (other.arg1 != null)
				return false;
		} else if (!arg1.equals(other.arg1))
			return false;
		if (arg2 == null) {
			if (other.arg2 != null)
				return false;
		} else if (!arg2.equals(other.arg2))
			return false;
		if (trigger == null) {
			if (other.trigger != null)
				return false;
		} else if (!trigger.equals(other.trigger))
			return false;
		return true;
	}

	public Noun arg1;
	public Noun arg2;
	public Trigger trigger;


}
