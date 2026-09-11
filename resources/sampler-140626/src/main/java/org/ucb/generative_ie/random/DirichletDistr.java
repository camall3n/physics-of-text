package org.ucb.generative_ie.random;

import cern.jet.random.tdouble.Gamma;

public class DirichletDistr {

    /**
     * return the Dirichlet density with given parameters (see the relation between Gamma distribution and Dirichlet Distribution)
     * @param params
     * @return 
     */
    public static double[] dirichlet(double[] params) {
        int n = params.length;

        double[] p = new double[n];
        double cum = 0.00d;
        for (int i = 0; i < n; i++) {
            //gamma(mean, variance)
            p[i] = Gamma.staticNextDouble(params[i], 1);
            cum = cum + p[i];
        }
        for (int i = 0; i < n; i++) {
            p[i] = p[i]/cum;
        }
        return(p);
    }

    public static double pdf(double[] params, double[] x) {
        double product = 1;

        for (int i = 0; i < params.length; i++) {
            product *= Math.pow(x[i], params[i] - 1);
        }

        return 1.0 / coef(params) * product;
    }

    public static double coef(double[] params) {
        double num = 1;
        double totalAlpha = 0;
        for (double alpha_i : params) {
            num *= org.apache.commons.math3.special.Gamma.gamma(alpha_i);
            totalAlpha += alpha_i;
        }

        return num / org.apache.commons.math3.special.Gamma.gamma(totalAlpha);
    }

    // x is not in log space
    public static double logPdf(double[] params, double[] x) {
        double logProduct = 0;
        for (int i = 0; i < params.length; i++) {
            logProduct += (params[i] - 1) * Math.log(x[i]);
        }

        return logProduct - logBeta(params);
    }

    public static double logBeta(double[] params) {
        double num = 0;
        double totalAlpha = 0;

        for (double alpha_i : params) {
            num += org.apache.commons.math3.special.Gamma.logGamma(alpha_i);
            totalAlpha += alpha_i;
        }

        return num - org.apache.commons.math3.special.Gamma.logGamma(totalAlpha);
    }


}
