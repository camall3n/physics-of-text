package org.ucb.generative_ie.inference;

import java.util.Map;
import java.util.Set;

import org.ucb.generative_ie.world.ArgPair;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;

import com.google.common.base.Function;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class TriggerRelationQuery extends WorldObserver {

    private Trigger trig;
    private double threshold;

    private int numWorldsPassingThreshold;
    private Multiset<ArgPair> counts;

    /**
     * @param noun1
     * @param noun2
     */
    public TriggerRelationQuery(Trigger trig, double threshold) {
        this.trig = trig;
        this.threshold = threshold;
        this.numWorldsPassingThreshold = 0;
        this.counts = HashMultiset.create();
    }

    @Override
    public void observe(World world, int iteration) {
        if (iteration > 500) {
            Set<Relation> relations = world.getWeightedLexicons().getRelations(trig, threshold);

            Set<ArgPair> argpairs = Sets.newHashSet();

            if (relations.size() > 0) {
                numWorldsPassingThreshold++;

                for (Fact f : world.getFacts()) {
                    if (relations.contains(f.getRel())) {
////                        argpairs.add(f.getArgPair());
                    }
                }
            }

            for (ArgPair pair : argpairs) {
                counts.add(pair);
            }
        }
    }

    public void print() {
        Ordering<Multiset.Entry<ArgPair>> entryOrdering = Ordering.natural()
            .onResultOf(new Function<Multiset.Entry<ArgPair>, Integer>() {
                @Override
                public Integer apply(Multiset.Entry<ArgPair> entry) {
                    return entry.getCount();
                }
            }).reverse();

        int k = 50;

        // Desired entries in desired order.  Put them in an ImmutableMap in this order.
        ImmutableMap.Builder<ArgPair, Integer> builder = ImmutableMap.builder();
        for (Multiset.Entry<ArgPair> entry : Iterables.limit(entryOrdering.sortedCopy(counts.entrySet()), k)) {
            builder.put(entry.getElement(), entry.getCount());
        }

        System.out.println("Print query results: " );
        for (Map.Entry<ArgPair, Integer> entry : builder.build().entrySet()) {
            ArgPair argpair = entry.getKey();
            int count = entry.getValue();
            String message = String.format("%100s : %f (%d / %d)",
                                           argpair,
                                           (double) count / numWorldsPassingThreshold,
                                           count,
                                           numWorldsPassingThreshold);
            System.out.println(message);
        }
    }
}
