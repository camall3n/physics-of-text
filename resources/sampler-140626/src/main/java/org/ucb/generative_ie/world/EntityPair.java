package org.ucb.generative_ie.world;

/**
 * A pair of entities
 */
public class EntityPair {
    public Entity ent1;
    public Entity ent2;
    
    public EntityPair(Entity ent1, Entity ent2) {
        super();
        this.ent1 = ent1;
        this.ent2 = ent2;
    }
    
    @Override
    public String toString() {
        return "EntityPair [ent1=" + ent1 + ", ent2=" + ent2 + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ent1 == null) ? 0 : ent1.hashCode());
        result = prime * result + ((ent2 == null) ? 0 : ent2.hashCode());
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
        EntityPair other = (EntityPair) obj;
        if (ent1 == null) {
            if (other.ent1 != null)
                return false;
        } else if (!ent1.equals(other.ent1))
            return false;
        if (ent2 == null) {
            if (other.ent2 != null)
                return false;
        } else if (!ent2.equals(other.ent2))
            return false;
        return true;
    }
}