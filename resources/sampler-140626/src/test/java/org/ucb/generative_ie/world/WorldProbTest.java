package org.ucb.generative_ie.world;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WorldProbTest {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@Test
//	public void test() {
//        Nouns nouns = Nouns.nounsWithNames("A", "B", "C", "D", "E");
//        Relations relations = Relations.defaultRelations(4);
//        double sparsity = 0.1;
//        World testWorld = new World(new Facts(), nouns, null, null, relations, 1, sparsity);
//
//        Relation sampledRelation = relations.asList().get(0);
//        testWorld.facts.add(new Fact(sampledRelation, nouns.get("A"), nouns.get("B")));
//        testWorld.facts.add(new Fact(sampledRelation, nouns.get("B"), nouns.get("B")));
//
//        WorldProb worldProb = new WorldProb(testWorld);
//
//        double logProb = worldProb.logProbFacts();
//
//        double truth = Math.pow(sparsity, 2) * Math.pow(1 - sparsity, 100 - 2);
//
//        assertEquals(truth, Math.exp(logProb), 0.0001);
//	}
//
}
