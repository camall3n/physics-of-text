package org.ucb.generative_ie.util;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class LogProbMapTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogAdd() {
        double test = Util.logAdd(Math.log(0.1), Math.log(0.15));
        test = Util.logAdd(test, Math.log(0.25));

        assertEquals(test, Math.log(0.5), 0.00001);
    }

	@Test
	public void testExp() {
        Random rng = new Random();
		LogProbMap<String> sampler = new LogProbMap<>();

        sampler.multiplyKey("a", 0.5, 2);
        sampler.multiplyKey("b", 0.75);

        Multiset<String> samples = HashMultiset.create();

        for (int i = 0; i < 100000; i++) {
            samples.add(sampler.sample(rng));
        }

        assertEquals(0.25, (double) samples.count("a") / samples.size(), 0.01);
        assertEquals(0.75, (double) samples.count("b") / samples.size(), 0.01);
    }

	@Test
	public void testSampling() {
        Random rng = new Random();
		LogProbMap<String> sampler = new LogProbMap<>();

        sampler.multiplyKey("a", 0.1);
        sampler.multiplyKey("b", 0.15);
        sampler.multiplyKey("c", 0.25);

        Multiset<String> samples = HashMultiset.create();

        for (int i = 0; i < 100000; i++) {
            samples.add(sampler.sample(rng));
        }

        assertEquals(0.2, (double) samples.count("a") / samples.size(), 0.01);
        assertEquals(0.3, (double) samples.count("b") / samples.size(), 0.01);
        assertEquals(0.5, (double) samples.count("c") / samples.size(), 0.01);
	}

    @Test
    public void testSandbox() {
        System.out.println(Math.log(0));
    }

}
