package org.ucb.generative_ie.inference;

import static org.junit.Assert.*;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.ucb.generative_ie.mcmc.MCMCStep;
import org.ucb.generative_ie.mcmc.MCMCSteps;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

public class InferenceOutputRegressionTest {
    @Rule public TemporaryFolder temporary = new TemporaryFolder();

    private String read(File dir, String name) throws Exception {
        return new String(Files.readAllBytes(new File(dir, name).toPath()), StandardCharsets.UTF_8);
    }

    @Test public void triggerObserverRetainsBestStateAfterLaterWorseState() throws Exception {
        World world = ModelFunctionsWorldParametersTest.world();
        File dir = temporary.newFolder();
        RelationTriggersObserver observer = new RelationTriggersObserver(dir.getPath());
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{2, 2, 0}, new int[]{0, 0, 0});
        observer.observe(world, 0);
        String first = read(dir, "relation_triggers.txt");
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{4, 0, 0}, new int[]{0, 0, 0});
        observer.observe(world, 1);
        String best = read(dir, "relation_triggers.txt");
        assertFalse(first.equals(best));
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{2, 2, 0}, new int[]{0, 0, 0});
        observer.observe(world, 2);
        assertEquals(best, read(dir, "relation_triggers.txt"));
    }

    @Test public void mapObserverStoresCompleteBestSnapshotAndEveryTraceEntry() throws Exception {
        World world = ModelFunctionsWorldParametersTest.world();
        File dir = temporary.newFolder();
        ObserveProb observer = new ObserveProb(dir.getPath());
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{7, 7, 0}, new int[]{0, 0, 0});
        observer.observe(world, 0);
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{14, 0, 0}, new int[]{0, 0, 0});
        double bestProb = new WorldProb(world).logProb();
        String best = ObserveProb.sentencesTsv(world);
        observer.observe(world, 1);
        ModelFunctionsWorldParametersTest.setCounts(world, new int[]{7, 7, 0}, new int[]{0, 0, 0});
        observer.observe(world, 2);
        assertEquals(3, observer.logProbs.get("total").size());
        assertEquals(bestProb, Collections.max(observer.logProbs.get("total")), 1e-10);
        assertEquals(best, read(dir, "map_world_sentences.tsv"));
        assertEquals(15, best.split("\n").length); // Header and all fourteen rows, beyond description's ten examples.
        assertTrue(read(dir, "map_world.txt").startsWith(Double.toString(bestProb) + "\n"));
    }

    @Test public void triggerObserverWithoutOutputDirectoryDoesNotAttemptFileWrites() {
        World world = ModelFunctionsWorldParametersTest.world();
        new RelationTriggersObserver().observe(world, 0);
    }

    @Test public void probabilityObserverWithoutOutputDirectoryDoesNotAttemptFileWrites() {
        World world = ModelFunctionsWorldParametersTest.world();
        ObserveProb observer = new ObserveProb();
        observer.observe(world, 0);
        assertTrue(observer.logProbs.isEmpty());
    }

    @Test public void entityObserverWithoutOutputDirectoryDoesNotAttemptFileWrites() {
        World world = ModelFunctionsWorldParametersTest.world();
        new EntityMentionsObserver().observe(world, 0);
    }

    @Test public void shortRunsExecuteEveryStepAndNotifyEveryObserver() {
        for (int iterations = 0; iterations < 10; iterations++) {
            World world = ModelFunctionsWorldParametersTest.world();
            SentenceEvidence evidence = new SentenceEvidence(world);
            final int[] calls = {0, 0};
            MCMCSteps steps = new MCMCSteps(world, evidence, 3) {
                @Override public Iterator<MCMCStep> iterator() {
                    MCMCStep step = new MCMCStep() {
                        @Override public double sample(Random rng) { calls[0]++; return 0; }
                        @Override public String getStepKind() { return "count"; }
                    };
                    return Collections.nCopies(3, step).iterator();
                }
            };
            MCMCInferer inferer = new MCMCInferer(iterations, world, evidence, new Random(5), steps);
            inferer.addWorldObserver(new WorldObserver() {
                @Override public void observe(World sampled, int iteration) {
                    assertEquals(calls[1], iteration);
                    calls[1]++;
                }
            });
            inferer.run();
            assertEquals(iterations * 3, calls[0]);
            assertEquals(iterations, calls[1]);
        }
    }
}
