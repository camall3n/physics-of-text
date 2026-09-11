package org.ucb.generative_ie.inference;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.apache.commons.math3.special.Gamma;
import org.junit.Before;
import org.junit.Test;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Trigger;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

public class ModelFunctionsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogGammaTmp() {
        double alpha = 0.01;
        for (int base_add = 0; base_add < 100; base_add++) {
            for (int extra = 0; extra <= base_add; extra++) {
                double base = alpha + base_add;

                double expected = Gamma.gamma(base + extra) / Gamma.gamma(base);
                double actual = ModelFunctions.gammaTmp(base, extra);

                assertEquals(expected, actual, expected * 1e-10);
            }
        }
	}

    @Test
    public void testLogMoveTriggersRatio() {
        Multiset<Trigger> sourceHist = HashMultiset.create();
        Multiset<Trigger> destHist = HashMultiset.create();
        Multiset<Trigger> movedHist = HashMultiset.create();

        int numTriggers = 10;
        double alpha = 0.01;

        Lexicon lex = Lexicon.defaultLexicon(numTriggers);

        Random rng = new Random();

        for (int i = 0; i < 100; i++) {
            Trigger trig = lex.get(rng.nextInt(numTriggers));
            sourceHist.add(trig);

            if (rng.nextDouble() < 0.5) {
                movedHist.add(trig);
            }
        }

        for (int i = 0; i < 100; i++) {
            destHist.add(lex.get(rng.nextInt(numTriggers)));
        }

        double ratio = ModelFunctions.logMoveTriggersRatio(sourceHist, destHist, movedHist, alpha, numTriggers);

        double a = ModelFunctions.logBetaCoef(Multisets.difference(sourceHist, movedHist), alpha, numTriggers);
        double b = ModelFunctions.logBetaCoef(sourceHist, alpha, numTriggers);

        double c = ModelFunctions.logBetaCoef(Multisets.sum(destHist, movedHist), alpha, numTriggers);
        double d = ModelFunctions.logBetaCoef(destHist, alpha, numTriggers);

        double expectedRatio = (a - b) + (c - d);

        double secondCheck = ModelFunctions.logHistRatio(sourceHist, Multisets.difference(sourceHist, movedHist), alpha, numTriggers);
        secondCheck += ModelFunctions.logHistRatio(destHist, Multisets.sum(destHist, movedHist), alpha, numTriggers);

        assertEquals(expectedRatio, ratio, 1e-6);

        System.out.println(ratio);
        System.out.println(expectedRatio);
        System.out.println(secondCheck);
    }

    @Test
    public void testLogBetaCoef() {
        int numTriggers = 4;

        Lexicon lex = Lexicon.defaultLexicon(numTriggers);
        Multiset<Trigger> hist = HashMultiset.create();
        hist.add(lex.get(0));
        hist.add(lex.get(1));
        hist.add(lex.get(1));
        hist.add(lex.get(2));
        hist.add(lex.get(2));
        hist.add(lex.get(3));
        hist.add(lex.get(3));
        hist.add(lex.get(3));
        double log = ModelFunctions.logBetaCoef(hist, 0.1, numTriggers);

        double expected = -8.5135068573920591;
        assertEquals(expected, log, 1e-6);
    }

    @Test
    public void testTmp() {
        int numTriggers = 4;

        Lexicon lex = Lexicon.defaultLexicon(numTriggers);
        Multiset<Trigger> hist1 = HashMultiset.create();
        hist1.add(lex.get(0));
        hist1.add(lex.get(1));
        hist1.add(lex.get(2));
        hist1.add(lex.get(2));
        hist1.add(lex.get(3));
        hist1.add(lex.get(3));
        hist1.add(lex.get(3));

        Multiset<Trigger> hist2 = HashMultiset.create();
        hist2.add(lex.get(0));
        hist2.add(lex.get(0));
        hist2.add(lex.get(0));
        hist2.add(lex.get(3));
        hist2.add(lex.get(3));

        double a = ModelFunctions.logHistRatio(hist1, hist2, 0.1, numTriggers);

        double b = ModelFunctions.logBetaCoef(hist2, 0.1, numTriggers) - ModelFunctions.logBetaCoef(hist1, 0.1, numTriggers);

        assertEquals(b, a, 1e-6);
    }
}
