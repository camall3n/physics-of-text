package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.world.*;

/** Checks actual Gibbs draws against an independently evaluated full joint. */
public class SentenceSamplingRegressionTest {
    private void verify(boolean unequal) {
        Entities entities = Entities.defaultEntities(1);
        Relations relations = Relations.defaultRelations(3);
        NounLexicon nouns = NounLexicon.defaultNounLexicon(1);
        Lexicon lexicon = Lexicon.defaultLexicon(2);
        World world = new WorldGenerator(new Random(7), entities, relations, nouns,
                lexicon, .23, unequal ? .71 : 1,
                new ConstantSparsityGenerator(.5), 0).emptyWorld();
        Entity entity = entities.asList().get(0);
        List<Fact> facts = new ArrayList<>();
        for (Relation relation : relations) {
            Fact fact = new Fact(relation, entity, entity);
            facts.add(fact); world.getFacts().add(fact);
        }
        if (unequal) {
            for (int relation = 0; relation < 3; relation++) {
                for (int j = 0; j < 3 * relation; j++) {
                    world.getSentences().add(new Sentence(facts.get(relation),
                            lexicon.get(relation == 1 ? 0 : 1), nouns.get(0), nouns.get(0)));
                }
            }
        }
        Sentence sentence = new Sentence(facts.get(0), lexicon.get(0), nouns.get(0), nouns.get(0));
        world.getSentences().add(sentence);
        WorldProb joint = new WorldProb(world);
        double[] probabilities = new double[3];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < 3; i++) {
            sentence.setOrigin(facts.get(i));
            probabilities[i] = joint.logProb(); max = Math.max(max, probabilities[i]);
        }
        double total = 0;
        for (int i = 0; i < 3; i++) { probabilities[i] = Math.exp(probabilities[i] - max); total += probabilities[i]; }
        double normalizedSum = 0;
        for (int i = 0; i < 3; i++) { probabilities[i] /= total; normalizedSum += probabilities[i]; }
        assertEquals(1, normalizedSum, 1e-14);
        if (!unequal) for (double p : probabilities) assertEquals(1.0/3, p, 1e-14);
        int draws = 30000;
        int[] counts = new int[3]; Random rng = new Random(4242);
        SentenceOriginRV step = new SentenceOriginRV(world, sentence);
        for (int i = 0; i < draws; i++) {
            assertEquals(1, step.sample(rng), 0);
            counts[facts.indexOf(sentence.getOrigin())]++;
        }
        for (int i = 0; i < 3; i++) {
            double expected = draws * probabilities[i];
            // Six standard deviations plus a small discrete-count allowance.
            double tolerance = 6 * Math.sqrt(expected * (1 - probabilities[i])) + 5;
            assertEquals("Gibbs frequency for relation " + i, expected, counts[i], tolerance);
        }
        assertTrue(joint.consistencyProblems().toString(), joint.consistencyProblems().isEmpty());
    }

    @Test public void threeEqualRelationsRemainEquallyLikelyInActualGibbsDraws() { verify(false); }
    @Test public void unequalRelationsFollowNormalizedFullJointProbabilities() { verify(true); }
}
