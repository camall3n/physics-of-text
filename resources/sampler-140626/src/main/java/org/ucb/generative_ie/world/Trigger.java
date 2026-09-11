package org.ucb.generative_ie.world;

public class Trigger {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((string == null) ? 0 : string.hashCode());
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
		Trigger other = (Trigger) obj;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trig[" + string + "]";
	}

	private final String string;

	public Trigger(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public static Trigger nullTrigger() {
		return new Trigger("#<null>#");
	}
}
