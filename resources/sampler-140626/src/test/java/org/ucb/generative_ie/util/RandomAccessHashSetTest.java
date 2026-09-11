package org.ucb.generative_ie.util;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

public class RandomAccessHashSetTest {

	@Test
	public void testAddRemove() {
		Set<String> truth = new HashSet<String>();
		RandomAccessHashSet<String> testSet = new RandomAccessHashSet<>();

		checkedAdd(truth, testSet, "A");
		checkedAdd(truth, testSet, "A");
		checkedAdd(truth, testSet, "B");
		checkedAdd(truth, testSet, "C");
		checkedContains(truth, testSet, "C");
		checkedContains(truth, testSet, "D");
		checkedRemove(truth, testSet, "C");
		checkedContains(truth, testSet, "C");
		checkedRemove(truth, testSet, "A");
		checkedAdd(truth, testSet, "B");
		checkedAdd(truth, testSet, "D");
		checkedContains(truth, testSet, "D");
		checkedContains(truth, testSet, "B");

		assertEquals(truth, testSet.values());
	}

	public void checkedAdd(Set<String> truth, RandomAccessHashSet<String> testSet, String value) {
		truth.add(value);
		testSet.add(value);
		assertEquals(truth, testSet.values());
	}

	public void checkedRemove(Set<String> truth, RandomAccessHashSet<String> testSet, String value) {
		truth.remove(value);
		testSet.remove(value);
		assertEquals(truth, testSet.values());
	}

	public void checkedContains(Set<String> truth, RandomAccessHashSet<String> testSet, String value) {
		assertEquals(truth.contains(value), testSet.contains(value));
		assertEquals(truth, testSet.values());
	}

	@Test
	public void testRandom() {
		RandomAccessHashSet<String> set = new RandomAccessHashSet<String>();

		Set<String> truth = Sets.newHashSet("A", "B", "C", "D");

		for (String t : truth) {
			set.add(t);
		}


		Random rng = new Random(0);

		Multiset<String> samples = HashMultiset.create();

		for (int i = 0; i < 1000000; i++)
		{
			samples.add(set.getRandom(rng));
		}

		for (String t : truth) {
			assertEquals(1.0 / truth.size(), (double) samples.count("A") / samples.size(), 0.001);
		}
		System.out.println(samples);
	}

}
