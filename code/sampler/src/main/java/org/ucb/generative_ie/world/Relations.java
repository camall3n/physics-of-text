package org.ucb.generative_ie.world;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * All Relations in the world
 */

public class Relations implements Iterable<Relation> {
	private final ImmutableSet<Relation> relations;

	public Relations(Set<Relation> relations)
	{
		this.relations = ImmutableSet.copyOf(relations);
	}

	@Override
	public Iterator<Relation> iterator() {
		return relations.iterator();
	}

    public Set<Relation> asSet() {
    	return ImmutableSet.copyOf(relations);
    }

    public List<Relation> asList() {
    	return ImmutableList.copyOf(relations);
    }

	public static Relations authorshipRelations() {
		return new Relations(Sets.newHashSet(new Relation("authorship"), new Relation("other")));
	}

	public static Relations defaultRelations(int numRelations) {
		Set<Relation> relations = Sets.newHashSet();
		for (int i = 0; i < numRelations; i++) {
			Relation newRelation = new Relation(String.format("rel_%d", i));
			relations.add(newRelation);
		}

		return new Relations(relations);
	}

    public int size() {
        return relations.size();
    }
}
