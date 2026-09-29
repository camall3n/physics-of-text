package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

public class WorldInferStepsEmptyCorpusTest {
    @Test
    public void emptySentenceCorpusRunsRemainingMovesAndPreservesTheWorld() {
        for (boolean betaPrior : new boolean[] {false, true}) {
            World w = new WorldGenerator(new Random(1), Entities.defaultEntities(3),
                    Relations.defaultRelations(5), NounLexicon.defaultNounLexicon(2),
                    Lexicon.defaultLexicon(2), 1, 1, new ConstantSparsityGenerator(0.2),
                    0).emptyWorld();
            if (betaPrior) w.setSparsityPrior(1, 20);

            // The corpus is empty, but the count prior requires at least one
            // occupied relation for a finite-density starting state.
            Entity entity = w.getEntities().asList().get(0);
            w.getFacts().add(new Fact(w.getRelations().asList().get(0), entity, entity));
            WorldProb probability = new WorldProb(w);
            Random rng = new Random(41);
            int sampled = 0;
            for (MCMCStep step : new WorldInferSteps(w, null, 400)) {
                assertFalse(step instanceof SentenceOriginRV);
                double acceptance = step.sample(rng);
                assertTrue("finite acceptance probability", acceptance >= 0 && acceptance <= 1);
                assertTrue("finite joint", Double.isFinite(probability.logProb()));
                assertTrue(probability.consistencyProblems().toString(),
                        probability.consistencyProblems().isEmpty());
                assertEquals(0, w.getSentences().size());
                sampled++;
            }
            assertEquals(400, sampled);
        }
    }
}
