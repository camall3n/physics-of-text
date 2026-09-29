package org.ucb.generative_ie.experiments;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.ucb.generative_ie.experiments.MCMCToyExperiment;
import org.ucb.generative_ie.experiments.RSToyExperiment;
import org.ucb.generative_ie.experiments.ToyExperimentResult;
import org.ucb.generative_ie.util.Util;

import com.google.common.collect.Lists;

public class ToyExperimentTest {

//    @Test
//    public void testRS() {
//        RSToyExperiment exp = new RSToyExperiment();
//
//        List<Double> sames = Lists.newArrayList();
//        List<Double> diffs = Lists.newArrayList();
//
//        for (int i = 0; i < 4; i++)
//        {
//            ToyExperimentResult result = exp.run();
//            sames.add(result.same);
//            diffs.add(result.diff);
//        }
//
//        // Answer from simple_bootstrap.py file
//        double sameExactInference = 0.671246236978;
//        double diffExactInference = 0.328753763022;
//
//        System.out.println(String.format("Same: %f (StdDev: %f)", Util.average(sames), Util.stddev(sames)));
//        System.out.println(String.format("Diff: %f (StdDev: %f)", Util.average(diffs), Util.stddev(diffs)));
//
//        assertEquals("Same given Evidence", sameExactInference, Util.average(sames), 0.005);
//        assertEquals("Diff given Evidence", diffExactInference, Util.average(diffs), 0.005);
//    }
//
//    @Test
//    public void testMCMC() {
//        MCMCToyExperiment exp = new MCMCToyExperiment();
//
//        List<Double> sames = Lists.newArrayList();
//        List<Double> diffs = Lists.newArrayList();
//
//        for (int i = 0; i < 4; i++)
//        {
//            ToyExperimentResult result = exp.run();
//            sames.add(result.same);
//            diffs.add(result.diff);
//        }
//
//        // Answer from simple_bootstrap.py file
//        double sameExactInference = 0.671246236978;
//        double diffExactInference = 0.328753763022;
//
//        System.out.println(String.format("Same: %f (StdDev: %f)", Util.average(sames), Util.stddev(sames)));
//        System.out.println(String.format("Diff: %f (StdDev: %f)", Util.average(diffs), Util.stddev(diffs)));
//
//        assertEquals("Same given Evidence", sameExactInference, Util.average(sames), 0.005);
//        assertEquals("Diff given Evidence", diffExactInference, Util.average(diffs), 0.005);
//    }
}
