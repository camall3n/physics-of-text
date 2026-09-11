/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucb.dpm;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.Util;

/**
 *
 * @author wei
 */
public class BernoulliExperimentTest {
    
    private final static Logger logger = LoggerFactory.getLogger(BernoulliExperimentTest.class);
    
    public BernoulliExperimentTest() {
    }
    
    @Test
    public void testSomeMethod() {
        Random rng = new Random();
        //String mdfile="/home/wei/Work/PLUIE/Experiments/ExperimentPackages/entity_resolution/seperated_model/split_merge/evaluation-sm/Neal2004/mixtures_distributions/mixture-dist-c5-d6.json";
        String mdfile="/home/wei/Work/PLUIE/Experiments/ExperimentPackages/entity_resolution/seperated_model/split_merge/evaluation-sm/Neal2004/mixtures_distributions/mixture-dist-c5-d15.json";
        MixtureDistributions mDists = new MixtureDistributions(mdfile);
        MixtureWorld mworld = new MixtureWorld(mDists, rng, 1000, 0.1, 0.001);
        for (int i : mworld.comonentSet()){
            logger.debug("{}: {}", i, mworld.countComponent(i));
        }
        logger.debug("{}", Math.exp(mworld.worldPrior()));
        //mDists.generateDataSets(rng);
        logger.debug("{}", mworld.showMixtureWorld());
        //logger.debug("{}", mDists.getMixtureDataSet().toString());
        
        //int a = 1;
        //int b = 1;
        //logger.debug("{}", Util.deltaFunction(1, 2));
        //logger.debug("{}", Util.deltaFunction(a, b));
        for (int id : mworld.getMixtureDataSet().keySet()) {
            logger.debug("id: {}, size: {}", id, mworld.countComponent(id));
        }
        logger.debug("{}", mworld.countMatch(1, 2, 0));
        logger.debug("{}", mworld.countMatch(1, 2, 1));
        logger.debug("{}", mworld.countMatch(2, 3, 0));
        logger.debug("{}", mworld.countMatch(2, 3, 1));
        
        mworld.worldLikelihood();
        logger.debug("distribution of components: {}",         mworld.distributionComponents().toString());

        //LogProbMap <Integer> test = new LogProbMap<>();
        //test.multiplyLogKey(1, -100000);
        //test.multiplyLogKey(2, -2000);
        //
        //test.normalize();
        //test.sample(rng);
        
        MixtureInference mInf = new MixtureInference(mworld, 100, rng);
        mInf.run(5);

    }
}