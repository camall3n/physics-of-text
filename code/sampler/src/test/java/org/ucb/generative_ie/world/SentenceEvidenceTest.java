package org.ucb.generative_ie.world;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;

public class SentenceEvidenceTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        Nouns nouns = Nouns.nounsWithNames("A", "B", "C", "D");
        Lexicon lexicon = Lexicon.defaultLexicon(3);
        SentenceEvidence ev = new SentenceEvidence();
        ev.addConstraint(nouns.get("A"), nouns.get("B"), lexicon.get(0));
        ev.addConstraint(nouns.get("A"), nouns.get("B"), lexicon.get(1));
        ev.addConstraint(nouns.get("C"), nouns.get("D"), lexicon.get(1));

        Set<ArgPair> argPairs = ev.uniqueArgs();

        Set<ArgPair> truth = Sets.newHashSet();
        truth.add(new ArgPair(nouns.get("A"), nouns.get("B")));
        truth.add(new ArgPair(nouns.get("C"), nouns.get("D")));

        assertEquals(truth, argPairs);
    }

}
