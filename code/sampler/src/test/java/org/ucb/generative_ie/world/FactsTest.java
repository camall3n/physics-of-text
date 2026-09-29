package org.ucb.generative_ie.world;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Facts;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Relation;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

public class FactsTest {

//    private Facts facts;
//    private Fact f1, f2, f3, f4;
//    private Random rng;
//
//	@Before
//	public void setUp() throws Exception {
//        this.facts = new Facts();
//
//        Noun n1 = new Noun("n1");
//        Noun n2 = new Noun("n2");
//
//        Relation r1 = new Relation("r1");
//        Relation r2 = new Relation("r2");
//
//        f1 = new Fact(r1, n1, n2);
//        f2 = new Fact(r2, n1, n2);
//        f3 = new Fact(r1, n1, n2);
//        f4 = new Fact(r1, n1, n1);
//
//        rng = new Random(0);
//	}
//
//	@Test
//	public void testStorage() {
//        facts.add(f1);
//        facts.add(f2);
//
//        assertTrue(Sets.newHashSet(facts.factsWithArgPair(f1.getArgPair())).equals(Sets.newHashSet(f1, f2)));
//
//        facts.add(f4);
//
//        assertTrue(Sets.newHashSet(facts.factsWithArgPair(f1.getArgPair())).equals(Sets.newHashSet(f1, f2)));
//        assertTrue(Sets.newHashSet(facts.factsWithArgPair(f4.getArgPair())).equals(Sets.newHashSet(f4)));
//	}
//
//	@Test
//	public void testSampling() {
//		facts.add(f1);
//		facts.add(f2);
//
//		Multiset<Fact> samples = HashMultiset.create();
//
//        for (int i = 0; i < 100000; i++)
//        {
//            samples.add(facts.sampleWithArgPair(f1.getArgPair(), rng));
//        }
//
//        assertEquals((double) samples.count(f1) / samples.size(), 0.5, 0.01);
//        assertEquals((double) samples.count(f2) / samples.size(), 0.5, 0.01);
//	}
//
//    @Test
//    public void testCollisions()
//    {
//        facts.add(f1);
//
//        assertTrue(facts.exists(f3));
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void testDuplicateAdd()
//    {
//        facts.add(f1);
//        facts.add(f3);
//    }
}
