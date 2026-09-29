package org.ucb.generative_ie.util;

import cern.jet.random.tdouble.Poisson;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;
import org.apache.commons.math3.distribution.AbstractIntegerDistribution;
import org.apache.commons.math3.distribution.AbstractRealDistribution;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *
 */
public class MathTest {
    private static Logger logger = LoggerFactory.getLogger("Tests");
            
    @Test
    public void test() {
        
        PoissonDistribution p = new PoissonDistribution(10);
        double probP = p.probability(5);
        logger.debug("{}", probP);

        int numEntities = 2;
        int numEntitiesDefault =5;
        int numMentions = 8;
              
        double entityDistRatio = Math.log((double)numEntitiesDefault/(numEntities+1)) + numMentions * Math.log((double)numEntities/(numEntities+1));
        
        logger.debug("{}", entityDistRatio);
        
        ArrayList <Integer> myIntList = Lists.newArrayList();
        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(3);
        logger.debug("{}", Util.combination(myIntList));
        logger.debug(" {} {} ", Util.logCombination(myIntList), Math.exp(Util.logCombination(myIntList)));
      
        //double standardDeviation = (double)Math.pow(numEntitiesDefault, 1);
        //double logMeanEntities = 2 * Math.log(numEntitiesDefault)- 0.5 * Math.log(standardDeviation + Math.pow(numEntitiesDefault, 2));
        //double logSD = Math.sqrt(Math.log(1+ standardDeviation/Math.pow(numEntitiesDefault, 2)));
        double lNdelta = 1;
        double mu = Math.log(numEntitiesDefault) - Math.pow(lNdelta, 2)/2;
        LogNormalDistribution lNormal = new LogNormalDistribution(mu, lNdelta);
        //LogNormalDistribution lNormal = new LogNormalDistribution(numEntitiesDefault, standardDeviation);
        
        //logger.debug("{} {} {} {}", numEntitiesDefault, standardDeviation, logMeanEntities, logSD);
        //logger.debug("{} {} {} {}", lNormal.density((logMeanEntities)), lNormal.density(2), lNormal.density(3), lNormal.density(5));
        logger.debug("{} {} {} ", numEntitiesDefault, mu, lNdelta);
        logger.debug("{} {} {} {} {}", lNormal.density((numEntitiesDefault)), lNormal.density(numEntitiesDefault/Math.E), lNormal.density(numEntitiesDefault*Math.E), lNormal.density(2), lNormal.density(3), lNormal.density(5));
        double p1, p2;

        p1 = Math.log(lNormal.density(1)) + Math.pow(0.5, 8);
        p2 = Math.log(lNormal.density(2)) + Math.pow(1, 8);
        logger.debug("{} {}", p1, p2);
        //logger.debug("{} {}", 200*Math.log(1.0/8), 200*Math.log(1.0/13));
        
        double k = Math.exp(Util.logPermutation(5, 3));
        logger.debug("{}", k);
    }
    
    
    
}
