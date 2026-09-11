package org.ucb.generative_ie.util;

import java.util.Random;
import org.junit.Test;

/**
 *
 *
 */
public class NormalProbMapTest {
    @Test
    public void test() {
        NormalProbMap <String> pMap = new NormalProbMap();
        
        pMap.multiplyKey("A", 0.0);
        //pMap.multiplyKey("B", 2);
        //pMap.multiplyKey("C", 3);
        //pMap.multiplyKey("C", 3);

        System.out.println(pMap.toString());
        
        for (int i=0; i<100; i++) {
            String s = pMap.sample(new Random());
            System.out.print(String.format("-----------------sampled : %s\n", s));
        }
    }
}
