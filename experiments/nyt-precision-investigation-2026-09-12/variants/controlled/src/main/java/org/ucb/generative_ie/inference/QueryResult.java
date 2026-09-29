package org.ucb.generative_ie.inference;

import java.util.HashMap;
import java.util.Set;

import org.ucb.generative_ie.util.BooleanCounter;

import com.google.common.collect.Sets;

public class QueryResult extends HashMap<Query, BooleanCounter> {

	/**
	 *
	 */
	private static final long serialVersionUID = 2183995462973617304L;

    public Set<Query> thresholdedQueries(double percentTrue) {
        Set<Query> filtered = Sets.newHashSet();
        for (Query q : this.keySet()) {
            if (this.get(q).percentTrue() > percentTrue) {
                filtered.add(q);
            }
        }

        return filtered;
    }

}
