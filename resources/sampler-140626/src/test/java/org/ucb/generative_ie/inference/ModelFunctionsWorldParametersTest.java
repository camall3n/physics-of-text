package org.ucb.generative_ie.inference;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.world.*;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/** World-taking trigger helpers must condition on beta, independently of noun alpha. */
public class ModelFunctionsWorldParametersTest {
    static World world() {
        return new WorldGenerator(new Random(7), Entities.defaultEntities(1),
                Relations.defaultRelations(2), NounLexicon.defaultNounLexicon(1),
                Lexicon.defaultLexicon(3), 0.003, 0.7,
                new ConstantSparsityGenerator(0.5), 0).emptyWorld();
    }

    static void setCounts(World world, int[] source, int[] dest) {
        world.getSentences().clear();
        Entity entity = world.getEntities().asList().get(0);
        Noun noun = world.getWeightedNounLexicons().getNounLexicon().get(0);
        int[][] counts = {source, dest};
        for (int r = 0; r < counts.length; r++) {
            Fact fact = new Fact(world.getRelations().asList().get(r), entity, entity);
            world.getFacts().setFact(fact, true);
            for (int t = 0; t < counts[r].length; t++) {
                for (int n = 0; n < counts[r][t]; n++) {
                    world.getSentences().add(new Sentence(fact,
                            world.getWeightedLexicons().getLex().get(t), noun, noun));
                }
            }
        }
    }

    private Multiset<Trigger> hist(World world, int relation) {
        return HashMultiset.create(world.getSentences().triggerHistogram(
                world.getRelations().asList().get(relation)));
    }

    private Multiset<Trigger> counts(World world, int... values) {
        Multiset<Trigger> result = HashMultiset.create();
        for (int i = 0; i < values.length; i++) {
            result.add(world.getWeightedLexicons().getLex().get(i), values[i]);
        }
        return result;
    }

    @Test public void oneWayMoveMatchesCollapsedWorldProbability() {
        World world = world();
        setCounts(world, new int[]{4, 2, 0}, new int[]{0, 1, 3});
        double before = new WorldProb(world).logCollapsedTriggers();
        double ratio = ModelFunctions.logMoveTriggersRatio(hist(world, 0), hist(world, 1),
                counts(world, 2, 1, 0), world);
        setCounts(world, new int[]{2, 1, 0}, new int[]{2, 2, 3});
        assertEquals(new WorldProb(world).logCollapsedTriggers() - before, ratio, 1e-10);
    }

    @Test public void twoWayMoveWithCancellingCountsMatchesCollapsedWorldProbability() {
        World world = world();
        setCounts(world, new int[]{4, 2, 0}, new int[]{0, 1, 3});
        double before = new WorldProb(world).logCollapsedTriggers();
        double ratio = ModelFunctions.logMoveTriggersRatio(hist(world, 0), hist(world, 1),
                counts(world, 2, 1, 0), counts(world, 0, 1, 2), world);
        setCounts(world, new int[]{2, 2, 2}, new int[]{2, 1, 1});
        assertEquals(new WorldProb(world).logCollapsedTriggers() - before, ratio, 1e-10);
    }

    @Test public void histogramChangeMatchesCollapsedWorldProbability() {
        World world = world();
        setCounts(world, new int[]{4, 2, 0}, new int[]{0, 0, 0});
        double before = new WorldProb(world).logCollapsedTriggers();
        double ratio = ModelFunctions.logHistRatio(hist(world, 0), counts(world, 1, 0, 3), world);
        setCounts(world, new int[]{1, 0, 3}, new int[]{0, 0, 0});
        assertEquals(new WorldProb(world).logCollapsedTriggers() - before, ratio, 1e-10);
    }
}
