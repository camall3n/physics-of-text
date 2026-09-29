package org.ucb.generative_ie.world;

/*
 * Immutable Fact class, so can be used reliably as a key in a Hashmap/set
 */
public class Fact {
    private Entity ent1;
    private Entity ent2;
    private Relation rel;
   

    public Fact(Relation rel, Entity ent1, Entity ent2) {
        super();
        this.rel = rel;
        this.ent1 = ent1;
        this.ent2 = ent2;
    }

    public Fact(Fact f) {
        this.rel = f.getRel();
        this.ent1 = f.getEnt1();
        this.ent2 = f.getEnt2();
    }

    public Fact(Relation rel, EntityPair pair) {
        super();
        this.rel = rel;
        this.ent1 = pair.ent1;
        this.ent2 = pair.ent2;
    }

    public Entity getEnt1() {
        return ent1;
    }

    public Entity getEnt2() {
        return ent2;
    }

    public void setEnt1(Entity entity) {
        this.ent1 = entity;
    }
    
    public void setEnt2(Entity entity) {
        this.ent2 = entity;
    }
    
    public void setRelation(Relation relation) {
        this.rel = relation;
    }
    //public ArgPair getArgPair() {
    //    return new ArgPair(ent1, ent2);
    //}

    public EntityPair getEntityPair() {
        return new EntityPair(ent1, ent2);
    }
    
    public Relation getRel() {
        return rel;
    }
    
    public EntRelPair getEntRelPair() {
        return new EntRelPair(ent1, rel);
    }
    
    public RelEntPair getRelEntPair() {
        return new RelEntPair(rel, ent2);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ent1 == null) ? 0 : ent1.hashCode());
        result = prime * result + ((ent2 == null) ? 0 : ent2.hashCode());
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
        Fact other = (Fact) obj;
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
        if (rel == null) {
            if (other.rel != null)
                return false;
        } else if (!rel.equals(other.rel))
            return false;
        return true;
    }    
     
    @Override
    public String toString() {
        return "Fact[" + ent1 + ", " + ent2 + ", " + rel + "]";
    }
}
