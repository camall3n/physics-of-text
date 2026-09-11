package org.ucb.generative_ie.world;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.RandomAccessHashSet;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;

public class Facts implements Iterable<Fact> {
    //private final ArrayListMultimap<ArgPair, Fact> argpairIndex;
    private final HashMultimap<EntityPair, Fact> entPairIndex;
    private final HashMultimap<EntRelPair, Fact> entRelPairIndex;
    private final HashMultimap<RelEntPair, Fact> relEntPairIndex;
    private final HashMultimap<Relation, Fact> relationIndex;
    private final RandomAccessHashSet<Fact> raFacts;

    public Facts() {
        //this.argpairIndex = ArrayListMultimap.create();
        this.entPairIndex = HashMultimap.create();
        this.entRelPairIndex = HashMultimap.create();
        this.relEntPairIndex = HashMultimap.create();
        this.relationIndex = HashMultimap.create();
        this.raFacts = new RandomAccessHashSet<>();
    }

    public Facts(Facts facts) {
        //this.argpairIndex = ArrayListMultimap.create(facts.argpairIndex);
        this.entPairIndex = HashMultimap.create(facts.entPairIndex);
        this.entRelPairIndex = HashMultimap.create(facts.entRelPairIndex);
        this.relEntPairIndex = HashMultimap.create(facts.relEntPairIndex);
        this.relationIndex = HashMultimap.create(facts.relationIndex);
        this.raFacts = new RandomAccessHashSet<>(facts.raFacts);
    }


    public boolean exists(Fact f) {
        //return argpairIndex.get(f.getArgPair()).contains(f);
        //return entPairIndex.get(f.getEntityPair()).contains(f);
        return raFacts.contains(f);
    }

    public boolean exists(Entity arg1, Entity arg2, Relation r) {
        return exists(new Fact(r, arg1, arg2));
    }

    public void add(Fact f) {
        if (exists(f)) {
            throw new RuntimeException("Fact " + f + " already exists");
        }

        raFacts.add(f);
        this.entPairIndex.get(f.getEntityPair()).add(f);
        this.entRelPairIndex.get(f.getEntRelPair()).add(f);
        this.relEntPairIndex.get(f.getRelEntPair()).add(f);
        this.relationIndex.get(f.getRel()).add(f);
    }

    public void remove(Fact f) {
        if (!exists(f)) {
            throw new RuntimeException("Trying to remove Fact " + f + " , which doesn't exists");
        }

        raFacts.remove(f);
        relationIndex.get(f.getRel()).remove(f);
        entPairIndex.get(f.getEntityPair()).remove(f);
        entRelPairIndex.get(f.getEntRelPair()).remove(f);
        relEntPairIndex.get(f.getRelEntPair()).remove(f);
        //argpairIndex.get(f.getArgPair()).remove(f);
    }

    public void clear() {
        //argpairIndex.clear();
        entPairIndex.clear();
        relationIndex.clear();
        entRelPairIndex.clear();
        relEntPairIndex.clear();
        raFacts.clear();
    }

    public Fact sampleAll(Random rng) {
        if (raFacts.size() > 0) {
            return raFacts.getRandom(rng);
        }
        throw new RuntimeException("No facts to sample from");
    }

    /**
     * Sample a Fact from all existing facts with the same argument pairs in current world.
     * @param argPair
     * @param rng
     * @return 
     */
    //public Fact sampleWithArgPair(ArgPair argPair, Random rng) {
    //    List<Fact> tmp = argpairIndex.get(argPair);
    //    if (tmp.size() > 0) {
    //        return RandomUtil.choice(tmp, rng);
    //    }
//
    //    return null;
    //}

    /**
     * Sample a Fact from all existing facts with the same entity pairs in current world.
     * @param entPair
     * @param rng
     * @return 
     */
    public Fact sampleWithEntityPair(EntityPair entPair, Random rng) {
        Set <Fact> tmp = entPairIndex.get(entPair);
        if (tmp.size() > 0) {
            return RandomUtil.choice(tmp, rng);
        }

        return null;
    }
    
    //public List<Fact> factsWithArgPair(ArgPair argPair) {
    //    return argpairIndex.get(argPair);
    //}
    
    public Set <Fact> factsWithEntityPair(EntityPair entPair) {
        return entPairIndex.get(entPair);
    }
    
    //public Set <Fact> factsWithEntity1(Entity ent) {
    //    return ent1Index.get(ent);
    //}
    //
    //public Set <Fact> factsWithEntity2(Entity ent) {
    //    return ent2Index.get(ent);
    //}

    public Set<Fact> factsWithRelation(Relation relation) {
        return relationIndex.get(relation);
    }

    public Set<Fact> factsWithEntRelPair(EntRelPair entrelpair) {
        return entRelPairIndex.get(entrelpair);
    }
    
    public Set<Fact> factsWithRelEntPair(RelEntPair relentpair) {
        return relEntPairIndex.get(relentpair);
    }
    
    public void setFact(Fact f, boolean e)
    {
        boolean originalExistance = exists(f);

        if (originalExistance && !e)
        {
            remove(f);
        }
        else if (!originalExistance && e)
        {
            add(f);
        }
    }

    @Override
    public String toString() {
        String output = "";
        //for (ArgPair argPair : argpairIndex.keySet()) {
        //    output += argPair + "\n";
        //    for (Fact f : factsWithArgPair(argPair)) {
        //        output += "    " + f + "\n";
        //    }
        //}
        for (EntityPair entPair : entPairIndex.keySet()) {
            output += entPair + "\n";
            for (Fact f : factsWithEntityPair(entPair)) {
                output += "    " + f + "\n";
            }
        }
        return output;
    }

    public int size() {
        return raFacts.size();
    }

    @Override
    public Iterator<Fact> iterator() {
        return raFacts.asList().iterator();
    }

    public Fact getCanonical(Fact f) {
        return raFacts.getCanonical(f);
    }
}
