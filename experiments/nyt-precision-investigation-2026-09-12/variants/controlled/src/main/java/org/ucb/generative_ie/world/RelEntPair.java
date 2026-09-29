package org.ucb.generative_ie.world;

/**
 * A pair of Relation and the second Entity
 */
public class RelEntPair {
    public Relation rel;
    public Entity ent;
    
    public RelEntPair(Relation rel, Entity ent) {
        super();
        this.rel = rel;
        this.ent = ent;
    }
    
    @Override
    public String toString() {
        return "RelEntPair [rel=" + rel + ", ent=" + ent + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rel == null) ? 0 : rel.hashCode());
        result = prime * result + ((ent == null) ? 0 : ent.hashCode());
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
        RelEntPair other = (RelEntPair) obj;
        if (rel == null) {
            if (other.rel != null)
                return false;
        } else if (!rel.equals(other.rel))
            return false;
        if (ent == null) {
            if (other.ent != null)
                return false;
        } else if (!ent.equals(other.ent))
            return false;
        return true;
    }
}