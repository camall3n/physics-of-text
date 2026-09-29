package org.ucb.generative_ie.world;

/**
 * A pair of first Entity and Relation
 */
public class EntRelPair {
    public Entity ent;
    public Relation rel;
    
    public EntRelPair(Entity ent, Relation rel) {
        super();
        this.ent = ent;
        this.rel = rel;
    }
    
    @Override
    public String toString() {
        return "EntRelPair [ent=" + ent + ", rel=" + rel + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ent == null) ? 0 : ent.hashCode());
        result = prime * result + ((rel == null) ? 0 : rel.hashCode());
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
        EntRelPair other = (EntRelPair) obj;
        if (ent == null) {
            if (other.ent != null)
                return false;
        } else if (!ent.equals(other.ent))
            return false;
        if (rel == null) {
            if (other.rel != null)
                return false;
        } else if (!rel.equals(other.rel))
            return false;
        return true;
    }
}
