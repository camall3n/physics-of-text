package org.ucb.generative_ie.inference;

import java.util.Collection;
import java.util.List;

import org.ucb.generative_ie.util.BooleanCounter;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Lists;

public abstract class Inferer implements Iterable<World> {

    private List<Query> queries;
    private List<WorldObserver> observers;
    protected final int numIterations;

    public Inferer(int numIterations) {
        this.numIterations = numIterations;
        this.queries = Lists.newArrayList();
        this.observers = Lists.newArrayList();
    }

    public void addQuery(Query query) {
        this.queries.add(query);
    }

    public void addQueries(Collection<? extends Query> queries) {
        for (Query q : queries) {
            addQuery(q);
        }
    }

    public void addWorldObserver(WorldObserver observer) {
        this.observers.add(observer);
    }

    public QueryResult run() {
        return run(0);
    }

    public QueryResult run(int burnin) {
        if (numIterations < burnin) {
            throw new RuntimeException("burnin can't be more than numIterations");
        }

        QueryResult results = new QueryResult();
        for (Query q : queries) {
            results.put(q, new BooleanCounter());
        }

        int i = 0; //TODO Make this better
        for (World sampledWorld : this)
        {
            if (i > burnin) {
                for (Query q : queries) {
                    results.get(q).add(q.isTrue(sampledWorld));
                }
            }

            for (WorldObserver o : observers) {
                o.observe(sampledWorld, i);
            }

            i++;
        }

        return results;
    }

}
