package org.ucb.generative_ie.util;

//import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;
import org.junit.Test;
import org.ucb.generative_ie.random.RandomUtil;

/**
 *
 *
 */
public class UtilTest {
    
    @Test
    public void test() {
        
        int n = 100;
        BigInteger facto = Util.factorial(n);

        System.out.println(String.format("factorial of %d: %d", n, facto));

        int j = 40;
        BigInteger comb_j = Util.combination(n, j);
        System.out.println(String.format("Combination of %d chosen %d: %d", n, j, comb_j));
        
        int k = 26;
        BigInteger comb_k = Util.combination(n, k);
        System.out.println(String.format("Combination of %d chosen %d: %d", n, k, comb_k));

        double ratio = Util.logCombinationRatio(n, j, k);
        System.out.println(String.format("Combination of %d %d %d %f", n, j, k, ratio));
      
        Random rng = new Random();
        for(int i=0; i<10; i++)
            System.out.println(RandomUtil.nextIntDist(6, rng));
    }
}
