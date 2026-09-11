package org.ucb.generative_ie.world;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class LexEntropyTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArr() {
        double[] a = {0, 0.1, 0.3, 0.6};
        double[] b = {0.6, 0.1, 0.3, 0};

        assertEquals(0.4, LexEntropy.entropy(a, b), 1e-6);
	}

	@Test
	public void testList() {
        double[] a = {0, 0.1, 0.3, 0.6};
        double[] b = {0.6, 0.1, 0.3, 0};

        List<double[]> weights = Lists.newArrayList(a, b);

        assertEquals(0.4, LexEntropy.entropy(weights), 1e-6);
	}

}
