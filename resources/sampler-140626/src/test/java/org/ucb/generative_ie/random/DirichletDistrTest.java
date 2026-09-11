package org.ucb.generative_ie.random;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.ucb.generative_ie.util.Util;

import com.google.common.collect.Lists;

public class DirichletDistrTest {

	@Test
	public void testDirichlet() throws Exception {

        List<List<Double>> output = Lists.newArrayList();
        double[] alphas = {0.5, 0.5, 0.5, 1.5};

        for (int i = 0; i < 100000; i++) {
            output.add(Arrays.asList(ArrayUtils.toObject(DirichletDistr.dirichlet(alphas))));
        }

        Util.writeJsonToFile("dirichlet.output", output);
	}

	@Test
	public void testBeta() {
		double[] params = {2,3,4};
		double beta = DirichletDistr.coef(params);

		assertEquals(12.0 / 40320.0, beta, 0.00001);
	}

	@Test
	public void testPdf() {
		double[] params = {2,3};
        double delta = 0.0001;
        double total = 0;
        for (double x_0 = 0; x_0 < 1; x_0 = x_0 + delta) {
            double[] x = {x_0, 1 - x_0};
            total += delta * DirichletDistr.pdf(params, x);
        }

        assertEquals(1.0, total, 0.0001);
	}

    @Test
    public void testLogPdf() {
		double[] params = {2,3, 100};
        double[] x = {0.7, 0.29, 0.01};
        assertEquals(DirichletDistr.pdf(params, x), Math.exp(DirichletDistr.logPdf(params, x)), 0.001);
    }

	@Test
	public void sandbox() {
		double[] params = {0.8, 0.8, 0.8};

        double[] x = {0.49, 0.49, 0.02};
        System.out.println(DirichletDistr.pdf(params, x));

        double[] y = {0.9999, 0.00005, 0.00005};
        System.out.println(DirichletDistr.pdf(params, y));
	}

}
