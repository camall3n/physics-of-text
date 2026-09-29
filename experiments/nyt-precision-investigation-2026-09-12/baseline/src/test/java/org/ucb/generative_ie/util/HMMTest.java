/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucb.generative_ie.util;

import be.ac.ulg.montefiore.run.jahmm.*;
//import be.ac.ulg.montefiore.run.jahmm.apps.sample.SimpleExample.Attribute;
import be.ac.ulg.montefiore.run.jahmm.draw.GenericHmmDrawerDot;
import be.ac.ulg.montefiore.run.jahmm.learn.BaumWelchLearner;
import be.ac.ulg.montefiore.run.jahmm.toolbox.KullbackLeiblerDistanceCalculator;
import be.ac.ulg.montefiore.run.jahmm.toolbox.MarkovGenerator;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 *
 * @author wei
 */
public class HMMTest {
    public HMMTest(){
        
    }
    /* Possible packet reception status */

    public enum Attribute {
        FIRSTNAME, SURNAME;
        
        public ObservationDiscrete<Attribute> observation() {
            return new ObservationDiscrete<>(this);
        }
    };
    
    /* The HMM this example is based on */
    
    static Hmm<ObservationDiscrete<Attribute>> buildHmm() {
        Hmm<ObservationDiscrete<Attribute>> hmm;
        hmm = new Hmm<>(2, new OpdfDiscreteFactory<>(Attribute.class));
        
        hmm.setPi(0, 0.95);
        hmm.setPi(1, 0.05);
        
        hmm.setOpdf(0, new OpdfDiscrete<>(Attribute.class,
                new double[] { 0.95, 0.05 }));
        hmm.setOpdf(1, new OpdfDiscrete<>(Attribute.class,
                new double[] { 0.20, 0.80 }));
        
        hmm.setAij(0, 1, 0.05);
        hmm.setAij(0, 0, 0.95);
        hmm.setAij(1, 0, 0.10);
        hmm.setAij(1, 1, 0.90);
        
        return hmm;
    }
    
	
    /* Initial guess for the Baum-Welch algorithm */
    
    static Hmm<ObservationDiscrete<Attribute>> buildInitHmm()
    {
        Hmm<ObservationDiscrete<Attribute>> hmm;
        hmm = new Hmm<>(2,
              new OpdfDiscreteFactory<>(Attribute.class));
        
        hmm.setPi(0, 0.50);
        hmm.setPi(1, 0.50);
        
        hmm.setOpdf(0, new OpdfDiscrete<>(Attribute.class,
                new double[] { 0.8, 0.2 }));
        hmm.setOpdf(1, new OpdfDiscrete<>(Attribute.class,
                new double[] { 0.1, 0.9 }));
        
        hmm.setAij(0, 1, 0.2);
        hmm.setAij(0, 0, 0.8);
        hmm.setAij(1, 0, 0.2);
        hmm.setAij(1, 1, 0.8);
        
        return hmm;
    }
    
    
    /* Generate several observation sequences using a HMM */
    
    static <O extends Observation> List<List<O>>
            generateSequences(Hmm<O> hmm)
    {
        MarkovGenerator<O> mg = new MarkovGenerator<>(hmm);
        
        List<List<O>> sequences = new ArrayList<>();
        for (int i = 0; i < 200; i++)
            sequences.add(mg.observationSequence(100));
        
        return sequences;
    }
    
    @Test
    public void test()
            throws java.io.IOException{
        /* Build a HMM and generate observation sequences using this HMM */
        
        Hmm<ObservationDiscrete<Attribute>> hmm = buildHmm();
        
        List<List<ObservationDiscrete<Attribute>>> sequences;
        sequences = generateSequences(hmm);
        
        /* Baum-Welch learning */
        
        BaumWelchLearner bwl = new BaumWelchLearner();
        
        Hmm<ObservationDiscrete<Attribute>> learntHmm = buildInitHmm();
        
        // This object measures the distance between two HMMs
        KullbackLeiblerDistanceCalculator klc =
                new KullbackLeiblerDistanceCalculator();
        
        // Incrementally improve the solution
        for (int i = 0; i < 10; i++) {
            System.out.println("Distance at iteration " + i + ": " +
                    klc.distance(learntHmm, hmm));
            learntHmm = bwl.iterate(learntHmm, sequences);
        }
        
        System.out.println("Resulting HMM:\n" + learntHmm);
        
        /* Computing the probability of a sequence */
        
        ObservationDiscrete<Attribute> packetOk = Attribute.FIRSTNAME.observation();
        ObservationDiscrete<Attribute> packetLoss = Attribute.SURNAME.observation();
        
        List<ObservationDiscrete<Attribute>> testSequence =
                new ArrayList<ObservationDiscrete<Attribute>>();
        testSequence.add(packetOk);
        testSequence.add(packetOk);
        testSequence.add(packetLoss);
        
        System.out.println("Sequence probability: " +
                learntHmm.probability(testSequence));
        
        /* Write the final result to a 'dot' (graphviz) file. */
        
        (new GenericHmmDrawerDot()).write(learntHmm, "learntHmm.dot");
    }
}
