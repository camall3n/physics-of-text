package org.ucb.generative_ie.inference;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.ucb.generative_ie.util.BooleanCounter;
import org.ucb.generative_ie.world.World;

public class InfererBurninTest {
    private static class Draws extends Inferer {
        int current;
        int observed;
        final List<Integer> counted = new ArrayList<Integer>();
        final Query query = new Query() {
            @Override public boolean isTrue(World world) {
                counted.add(current);
                return current % 2 == 0;
            }
        };

        Draws(int count) {
            super(count);
            addQuery(query);
            addWorldObserver(new WorldObserver() {
                @Override public void observe(World world, int iteration) { observed++; }
            });
        }

        @Override public Iterator<World> iterator() {
            return new Iterator<World>() {
                int next;
                @Override public boolean hasNext() { return next < numIterations; }
                @Override public World next() { current = next++; return null; }
                @Override public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    }

    @Test public void oneDrawWithoutBurninProducesOneQuerySample() {
        Draws draws = new Draws(1);
        BooleanCounter result = draws.run(0).get(draws.query);
        assertEquals(1, result.total());
        assertEquals(1.0, result.percentTrue(), 0);
        assertEquals(Arrays.asList(0), draws.counted);
        assertEquals(1, draws.observed);
    }

    @Test public void burninDiscardsExactlyTheRequestedNumberOfDraws() {
        Draws draws = new Draws(10);
        BooleanCounter result = draws.run(3).get(draws.query);
        assertEquals(7, result.total());
        assertEquals(Arrays.asList(3, 4, 5, 6, 7, 8, 9), draws.counted);
        assertEquals(10, draws.observed);
    }

    @Test public void allBurninAndEmptyRunsHaveNoQuerySamples() {
        Draws draws = new Draws(10);
        assertEquals(0, draws.run(10).get(draws.query).total());
        assertTrue(draws.counted.isEmpty());
        assertEquals(10, draws.observed);
        Draws empty = new Draws(0);
        assertEquals(0, empty.run(0).get(empty.query).total());
        assertEquals(0, empty.observed);
    }

    @Test public void invalidBurninIsRejectedBeforeSampling() {
        for (int burnin : new int[]{-1, 11}) {
            Draws draws = new Draws(10);
            try {
                draws.run(burnin);
                fail("invalid burnin " + burnin + " should be rejected");
            } catch (IllegalArgumentException expected) {
                assertEquals(0, draws.observed);
                assertTrue(draws.counted.isEmpty());
            }
        }
    }
}
