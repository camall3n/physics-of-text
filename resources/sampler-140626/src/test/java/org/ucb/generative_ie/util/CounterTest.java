package org.ucb.generative_ie.util;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import static org.junit.Assert.*;

public class CounterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Multiset<String> c1 = HashMultiset.create();
        c1.add("A", 5);
        c1.add("B", 2);
        c1.add("C", 20);

		Multiset<String> c2 = HashMultiset.create();
        c2.add("A", 6);
        c2.add("B", 3);
        c2.add("C", 2);

        Multiset<String> c1Copy = HashMultiset.create(c1);
        Multiset<String> c2Copy = HashMultiset.create(c2);

        Multiset<String> truth = HashMultiset.create();
        truth.add("A", 11);
        truth.add("B", 5);
        truth.add("C", 22);

        assertEquals(truth, Counter.sum(c1Copy, c2Copy));
        assertEquals(c1, c1Copy);
        assertEquals(c2, c2Copy);
    }

	@Test
	public void testDifference() {
		Multiset<String> c1 = HashMultiset.create();
        c1.add("A", 5);
        c1.add("B", 2);
        c1.add("C", 20);

		Multiset<String> c2 = HashMultiset.create();
        c2.add("A", 3);
        c2.add("B", 1);
        c2.add("C", 2);

        Multiset<String> truth = HashMultiset.create();
        truth.add("A", 2);
        truth.add("B", 1);
        truth.add("C", 18);

        assertEquals(truth, Counter.difference(c1, c2));
    }

}
