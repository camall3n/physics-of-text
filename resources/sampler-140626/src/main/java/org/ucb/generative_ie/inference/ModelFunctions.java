package org.ucb.generative_ie.inference;

import org.apache.commons.math3.special.Gamma;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;

public class ModelFunctions {

    public static double logMoveTriggersRatio(Multiset<Trigger> sourceHist, Multiset<Trigger> destHist, Multiset<Trigger> movedToDest, Multiset<Trigger> movedToSource, World w) {
        Multiset<Trigger> movedOnlyToSource = Multisets.difference(movedToSource, movedToDest);
        Multiset<Trigger> movedOnlyToDest = Multisets.difference(movedToDest, movedToSource);

        assert Multisets.containsOccurrences(sourceHist, movedOnlyToDest);
        assert Multisets.containsOccurrences(destHist, movedOnlyToSource);

        assert Sets.intersection(movedOnlyToSource.elementSet(), movedOnlyToDest.elementSet()).size() == 0;

        // Something is moved
        double ratio = 0;

        for (Multiset.Entry<Trigger> entry : movedOnlyToDest.entrySet()) {
            int movedCount = entry.getCount();
            Trigger movedTrig = entry.getElement();

            double sourceAlpha = sourceHist.count(movedTrig) + w.getAlpha();
            double destAlpha = destHist.count(movedTrig) + w.getAlpha();

            ratio += logGammaTmp(sourceAlpha, -movedCount);
            ratio += logGammaTmp(destAlpha, movedCount);
        }

        for (Multiset.Entry<Trigger> entry : movedOnlyToSource.entrySet()) {
            int movedCount = entry.getCount();
            Trigger movedTrig = entry.getElement();

            double sourceAlpha = sourceHist.count(movedTrig) + w.getAlpha();
            double destAlpha = destHist.count(movedTrig) + w.getAlpha();

            ratio += logGammaTmp(sourceAlpha, movedCount);
            ratio += logGammaTmp(destAlpha, -movedCount);
        }

        int numTrigs = w.getWeightedLexicons().getLex().size();
        int netChange = movedOnlyToDest.size() - movedOnlyToSource.size();

        ratio -= logGammaTmp(sourceHist.size() + w.getAlpha() * numTrigs, -netChange);
        ratio -= logGammaTmp(destHist.size() + w.getAlpha() * numTrigs, netChange);

        assert !Double.isNaN(Math.exp(ratio));
        return ratio;
    }

    public static double denom_tmp(double alpha, int moved) {
        double result = 1;
        while (moved > 0) {
            result *= alpha - moved;
            moved--;
        }

        return result;
    }

    public static double num_tmp(double alpha, int moved) {
        double result = 1;
        while (moved > 0) {
            result *= alpha + (moved - 1);
            moved--;
        }

        return result;
    }

    /**
     * Gamma Function in log
     * @param base
     * @param extra
     * @return 
     */
    public static double logGammaTmp(double base, int extra) {
        if (base + extra <= 0) {
            throw new RuntimeException("extra + base is less than 0");
        }

        if (extra == 0) {
            return 0;
        }
        else {
            if (extra > 0) {
                double total = 0;
                for (int i = 0; i <= extra - 1; i++) {
                    total += Math.log(base + i);
                }

                assert !Double.isNaN(total);
                return total;
            }
            else {
                extra = -extra;

                double total = 0;

                for (int i = 1; i <= extra; i++) {
                    total += Math.log(base - i);
                }

                assert !Double.isNaN(total);
                return -total;
            }
        }
    }

    public static double gammaTmp(double base, int extra) {
    	return Math.exp(logGammaTmp(base, extra));
    }


    public static double logMoveTriggersRatio(Multiset<Trigger> sourceHist, Multiset<Trigger> destHist, Multiset<Trigger> movedHist, World world) {
        return logMoveTriggersRatio(sourceHist, destHist, movedHist, world.getAlpha(), world.getWeightedLexicons().getLex().size());
    }

    public static double logMoveTriggersRatio(Multiset<Trigger> sourceHist, Multiset<Trigger> destHist, Multiset<Trigger> movedHist, double alpha, int numTrigs) {
        double logRatio = 0;

        for (Multiset.Entry<Trigger> entry : movedHist.entrySet()) {
            int movedCount = entry.getCount();
            Trigger movedTrig = entry.getElement();

            double sourceRelAlpha = sourceHist.count(movedTrig) + alpha;
            double destRelAlpha = destHist.count(movedTrig) + alpha;

            logRatio += logGammaTmp(sourceRelAlpha, -movedCount);
            logRatio += logGammaTmp(destRelAlpha, movedCount);
        }

        double sourceOldTotalAlphas = sourceHist.size() + alpha * numTrigs;
        double destOldTotalAlphas = destHist.size() + alpha * numTrigs;

        logRatio -= logGammaTmp(sourceOldTotalAlphas, -movedHist.size());
        logRatio -= logGammaTmp(destOldTotalAlphas, movedHist.size());

        return logRatio;
    }

    public static double logHistRatio(Multiset<Trigger> oldHist, Multiset<Trigger> newHist, World world) {
        return logHistRatio(oldHist, newHist, world.getAlpha(), world.getWeightedLexicons().getLex().size());
    }

    public static double logHistRatio(Multiset<Trigger> oldHist, Multiset<Trigger> newHist, double alpha, int numTrigs) {
        double logRatio = 0;

        for (Multiset.Entry<Trigger> entry : Multisets.difference(newHist, oldHist).entrySet()) {
            int movedCount = entry.getCount();
            Trigger movedTrig = entry.getElement();

            logRatio += logGammaTmp(oldHist.count(movedTrig) + alpha, movedCount);
        }

        for (Multiset.Entry<Trigger> entry : Multisets.difference(oldHist, newHist).entrySet()) {
            int movedCount = entry.getCount();
            Trigger movedTrig = entry.getElement();

            logRatio += logGammaTmp(oldHist.count(movedTrig) + alpha, -movedCount);
        }

        logRatio += logGammaTmp(newHist.size() + alpha * numTrigs, oldHist.size() - newHist.size());

        return logRatio;
    }

    public static double logBetaCoef(Multiset<Trigger> hist, double alpha, int numTrigs) {
        if (alpha <= 0) {
            throw new RuntimeException("alpha must be greater an 0");
        }
        if (numTrigs < hist.elementSet().size()) {
            throw new RuntimeException("numTrigs is greater than number of unique elements in hist");
        }

        double total = 0;

        for (Multiset.Entry<Trigger> entry : hist.entrySet()) {
            total += Gamma.logGamma(entry.getCount() + alpha);
        }

        total += (numTrigs - hist.elementSet().size()) * Gamma.logGamma(alpha);
        total -= Gamma.logGamma(hist.size() +  alpha * numTrigs);

        return total;
    }
    
    /**
     * return Beta(alpha + N)
     * @param hist
     * @param alpha
     * @param numTotal
     * @return 
     */
    public static double logBeta(Multiset<?> hist, double alpha, int numTotal){
        if (alpha <= 0) {
            throw new RuntimeException("alpha must be greater an 0");
        }
        if (numTotal < hist.elementSet().size()) {
            throw new RuntimeException("numTrigs is greater than number of unique elements in hist");
        }
        
        double total = 0;
        
        for (Multiset.Entry <?> entry : hist.entrySet()){
            total += Gamma.logGamma(entry.getCount() + alpha);
        }

        total += (numTotal - hist.elementSet().size()) * Gamma.logGamma(alpha);
        total -= Gamma.logGamma(hist.size() +  alpha * numTotal);
        
        return total;
    }
    
    
    /**
     * return Beta(alpha + N) / Beta(alpha)
     * @param hist
     * @param alpha
     * @param numTotal
     * @return 
     */
    public static double logBetaProb(Multiset<?> hist, double alpha, int numTotal){
        if (hist == null || hist.size() == 0) {
            return 0;
        }
        if (alpha <= 0) {
            throw new RuntimeException("alpha must be greater an 0");
        }
        if (numTotal < hist.elementSet().size()) {
            throw new RuntimeException("numTrigs is greater than number of unique elements in hist");
        }
        
        double total = 0;
        
        for (Multiset.Entry <?> entry : hist.entrySet()){
            total += (Gamma.logGamma(entry.getCount() + alpha)-Gamma.logGamma(alpha));
        }

        total -= Gamma.logGamma(hist.size() +  alpha * numTotal);
        total += Gamma.logGamma(alpha * numTotal);
        
        return total;
    }
    
    /**
     * return Beta(alpha)
     * @param alpha
     * @param numTotal
     * @return 
     */
    public static double logBetaPrior(double alpha, int numTotal) {
        if (alpha <= 0) {
            throw new RuntimeException("alpha must be greater an 0");
        }
        
        double total = 0;
        
        for (int i=0; i<numTotal; i++){
            total += Gamma.logGamma(alpha);
        }

        total -= Gamma.logGamma(alpha * numTotal);
        
        return total;
    }
}
