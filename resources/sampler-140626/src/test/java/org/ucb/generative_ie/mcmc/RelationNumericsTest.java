package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RelationNumericsTest {
    @Test
    public void complementaryLogProbabilityPreservesTinyNonzeroEvents() {
        // Construct log(1-p) independently, then recover log(p). This includes
        // subnormal probabilities and the former 1e-12 truncation boundary.
        for (double probability : new double[] {
                Double.MIN_VALUE, 1e-300, 1e-20, 1e-13, 1e-12, 1e-11,
                0.1, 0.5, 0.9, Math.nextDown(1.0)}) {
            double expected = Math.log(probability);
            assertEquals("complement probability " + probability, expected,
                    RelationSplitMergeStep.log1mExp(Math.log1p(-probability)),
                    4 * Math.ulp(expected));
        }
    }

    @Test
    public void complementaryLogProbabilityHandlesExactEndpoints() {
        assertEquals(Double.NEGATIVE_INFINITY, RelationSplitMergeStep.log1mExp(0), 0);
        assertEquals(Double.NEGATIVE_INFINITY, RelationSplitMergeStep.log1mExp(-0.0), 0);
        assertEquals(0, RelationSplitMergeStep.log1mExp(Double.NEGATIVE_INFINITY), 0);
    }
}
