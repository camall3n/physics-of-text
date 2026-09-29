package org.ucb.generative_ie.util;

import static org.junit.Assert.*;
import java.util.LinkedHashMap;
import java.util.Random;
import org.junit.Test;

/** Distribution checks, rather than comparisons with another copy of the sampler. */
public class ProbabilityNormalizationTest {
    private static class OrderedLog extends LogProbMap<Integer> {
        OrderedLog() { data = new LinkedHashMap<Integer, Double>(); }
    }
    private static class OrderedNormal extends NormalProbMap<Integer> {
        OrderedNormal() { data = new LinkedHashMap<Integer, Double>(); }
    }
    private static Random quantile(final double q) {
        return new Random(1) { @Override public double nextDouble() { return q; } };
    }
    private static void invalid(Runnable operation) {
        try { operation.run(); fail("Invalid distribution should be rejected"); }
        catch (IllegalArgumentException expected) { }
        catch (IllegalStateException expected) { }
    }
    private static void verify(double[] weights) {
        OrderedLog log = new OrderedLog();
        OrderedNormal normal = new OrderedNormal();
        double total = 0;
        for (int i = 0; i < weights.length; i++) {
            total += weights[i];
            log.multiplyKey(i, weights[i]);
            normal.multiplyKey(i, weights[i]);
        }
        double cdf = 0;
        for (int i = 0; i < weights.length; i++) if (weights[i] > 0) {
            double p = weights[i] / total, middle = cdf + p / 2;
            assertEquals(Integer.valueOf(i), log.sample(quantile(middle)));
            assertEquals(Integer.valueOf(i), normal.sample(quantile(middle)));
            cdf += p;
        }
        log.normalize(); normal.normalize();
        double ls = 0, ns = 0;
        cdf = 0;
        for (int i = 0; i < weights.length; i++) {
            double expected = weights[i] / total;
            assertEquals(expected, Math.exp(log.probKey(i)), 2e-14);
            assertEquals(expected, normal.probKey(i), 2e-14);
            ls += Math.exp(log.probKey(i)); ns += normal.probKey(i);
            if (expected > 0) {
                double middle = cdf + expected / 2;
                assertEquals(Integer.valueOf(i), log.sample(quantile(middle)));
                assertEquals(Integer.valueOf(i), normal.sample(quantile(middle)));
                cdf += expected;
            }
        }
        assertEquals(1, ls, 2e-14); assertEquals(1, ns, 2e-14);
        double ln = log.getNorm(), nn = normal.getNorm();
        log.normalize(); normal.normalize();
        assertEquals(ln, log.getNorm(), 0); assertEquals(nn, normal.getNorm(), 0);
    }

    @Test public void exactUnitAndPartialUnitSumsAreNotSentinels() {
        verify(new double[]{1, 1});
        verify(new double[]{.5, .5, .5});
        verify(new double[]{.25, .75, 2, 0});
        verify(new double[]{0, 1, 0, 0});
    }

    @Test public void variedWeightedChoicesSumToOneAndMatchTheirCdf() {
        Random r = new Random(91827);
        for (int round = 0; round < 500; round++) {
            double[] weights = new double[1 + r.nextInt(30)];
            for (int i = 0; i < weights.length; i++) weights[i] = r.nextInt(16) * .25;
            weights[r.nextInt(weights.length)] += 1;
            verify(weights);
        }
    }

    @Test public void equalWeightSamplingActuallyExploresEveryChoice() {
        for (boolean normalized : new boolean[]{false, true}) {
            OrderedLog map = new OrderedLog();
            for (int i = 0; i < 3; i++) map.multiplyKey(i, .5);
            if (normalized) map.normalize();
            int[] counts = new int[3]; Random r = new Random(4282);
            for (int i = 0; i < 30000; i++) counts[map.sample(r)]++;
            for (int count : counts) assertEquals(10000, count, 350);
        }
    }

    @Test public void zeroMassCannotWinAtRandomZeroOrAnExactBoundary() {
        for (boolean normalized : new boolean[]{false, true}) {
            OrderedLog log = new OrderedLog(); OrderedNormal normal = new OrderedNormal();
            double[] w = {0, 1, 0, 1, 0};
            for (int i = 0; i < w.length; i++) { log.multiplyKey(i,w[i]); normal.multiplyKey(i,w[i]); }
            if (normalized) { log.normalize(); normal.normalize(); }
            for (ProbMap<Integer> map : new ProbMap[]{log,normal}) {
                assertEquals(Integer.valueOf(1),map.sample(quantile(0)));
                assertEquals(Integer.valueOf(3),map.sample(quantile(.5)));
                assertEquals(Integer.valueOf(3),map.sample(quantile(Math.nextDown(1.0))));
            }
        }
    }

    @Test public void largeLogOffsetsRetainRelativeProbabilities() {
        for (double offset : new double[]{-1000,1000,-1e300,1e300}) {
            OrderedLog log = new OrderedLog();
            for (int i = 0; i < 3; i++) log.multiplyLogKey(i,offset);
            log.normalize();
            double sum = 0;
            for (int i = 0; i < 3; i++) { assertEquals(1.0/3,Math.exp(log.probKey(i)),1e-15); sum += Math.exp(log.probKey(i)); }
            assertEquals(1,sum,1e-15);
        }
        OrderedLog log = new OrderedLog(); log.multiplyLogKey(0,-1000); log.multiplyLogKey(1,-1001);
        log.normalize(); assertEquals(1/(1+Math.exp(-1)),Math.exp(log.probKey(0)),1e-15);
    }

    @Test public void veryLargeAndSubnormalLinearWeightsNormalize() {
        for (double value : new double[]{Double.MAX_VALUE,Double.MIN_VALUE}) {
            OrderedNormal normal = new OrderedNormal(); normal.multiplyKey(0,value); normal.multiplyKey(1,value);
            assertEquals(Integer.valueOf(1),normal.sample(quantile(.75)));
            normal.normalize(); assertEquals(.5,normal.probKey(0),0); assertEquals(.5,normal.probKey(1),0);
        }
    }

    @Test public void multiplicationInvalidatesNormalizedState() {
        OrderedLog log = new OrderedLog(); OrderedNormal normal = new OrderedNormal();
        for (ProbMap<Integer> map : new ProbMap[]{log,normal}) {
            map.multiplyKey(0,1); map.multiplyKey(1,1); map.normalize();
            map.multiplyKey(0,3);
            assertEquals(Integer.valueOf(0),map.sample(quantile(.7)));
            map.normalize();
        }
        assertEquals(.75,Math.exp(log.probKey(0)),1e-15);
        assertEquals(.75,normal.probKey(0),1e-15);
    }

    @Test public void invalidDistributionsFailInsteadOfProducingNanProbabilities() {
        for (final ProbMap<Integer> map : new ProbMap[]{new OrderedLog(),new OrderedNormal()}) {
            invalid(() -> map.normalize()); invalid(() -> map.sample(new Random(1)));
            map.multiplyKey(0,0); invalid(() -> map.normalize()); invalid(() -> map.sample(new Random(1)));
            for (final double bad : new double[]{-1,Double.NaN,Double.POSITIVE_INFINITY}) invalid(() -> map.multiplyKey(1,bad));
        }
        final OrderedLog log = new OrderedLog();
        invalid(() -> log.multiplyLogKey(0,Double.NaN));
        invalid(() -> log.multiplyLogKey(0,Double.POSITIVE_INFINITY));
        log.multiplyLogKey(0,Double.NEGATIVE_INFINITY); log.multiplyLogKey(1,0); log.normalize();
        assertEquals(0,Math.exp(log.probKey(0)),0); assertEquals(1,Math.exp(log.probKey(1)),0);
        OrderedLog zeroExponent = new OrderedLog(); zeroExponent.multiplyKey(0,0,0); zeroExponent.normalize();
        assertEquals(1,Math.exp(zeroExponent.probKey(0)),0);
    }

    @Test public void arrayNormalizationHandlesExtremeWeightsAndRejectsUndefinedMass() {
        double[] a = {Double.MAX_VALUE,Double.MAX_VALUE,0}; Util.normalize(a);
        assertArrayEquals(new double[]{.5,.5,0},a,0);
        double[] b = {Double.MIN_VALUE,Double.MIN_VALUE}; Util.normalize(b);
        assertArrayEquals(new double[]{.5,.5},b,0);
        invalid(() -> Util.normalize(new double[]{0,0}));
        invalid(() -> Util.normalize(new double[]{1,Double.NaN}));
        invalid(() -> Util.normalize(new double[]{-1,2}));
    }

    @Test public void logArithmeticHandlesZeroMassAndNearlyEqualSubtraction() {
        assertEquals(Double.NEGATIVE_INFINITY,Util.logAdd(Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY),0);
        assertEquals(0,Util.logAdd(Double.NEGATIVE_INFINITY,0),0);
        assertEquals(Math.log(2),Util.logAdd(0,0),1e-15);
        assertEquals(Double.NEGATIVE_INFINITY,Util.logSubtract(0,0),0);
        assertEquals(0,Util.logSubtract(0,Double.NEGATIVE_INFINITY),0);
        assertEquals(Math.log(1e-20),Util.logSubtract(0,-1e-20),1e-14);
        invalid(() -> Util.logSubtract(0,1)); invalid(() -> Util.logAdd(0,Double.NaN));
    }
}
