package org.ucb.dpm;

import java.util.Random;
import org.ucb.generative_ie.experiments.ConfigParser;

/**
 * This class implement the split-merge algorithm proposed in Neal 2004 paper for Bernoulli data sets
 *
 */
public class BernoulliExperiment {
    public BernoulliExperiment(){
        
    }
    
    public static void main(String [] args) {
        if (args.length < 6){
            System.out.println("Error: please type the mixture distribution filename");
            System.out.println("distribution-filename datasize sampleVersion alpha beta iterations");
         }
        else {
            String mdfile = args[0];
            //String configfile = args[1];
            int datasize = Integer.parseInt(args[1]);
            int sampleVersion = Integer.parseInt(args[2]);
            double alpha = Double.parseDouble(args[3]);
            double beta = Double.parseDouble(args[4]);
            int iterations = Integer.parseInt(args[5]);
            //String 
            
            System.out.println("================================================================");
            System.out.println("Inference based on the mixture distribution: " + mdfile);
            System.out.println("================================================================");
            System.out.println("datasize: " + datasize );
            System.out.println("sample version: " + sampleVersion);
            System.out.println("alpha: " + alpha + ", beta: " + beta);
            System.out.println("iterations: " + iterations);
            
            MixtureDistributions mDists = new MixtureDistributions(mdfile);
            //ConfigParser config = new ConfigParser(configfile);
            //config.showConfig();
            //
            ////int numRels = config.numRels;
            ////int numEnts = config.numEnts;
            //int sampleVersion = config.numRels;
            //int datasize = config.numEnts;
            //int iterations = config.numIterations;
            //double alpha = config.alpha;
            //double beta = config.beta;
            
            Random rng = new Random();
            //int datasize = 100;
            //double alpha = 1.0;
            //double beta = 1.0;
            //int iterations = 200;
            
            MixtureWorld mworld = new MixtureWorld(mDists, rng, datasize, alpha, beta); // datasize, alpha, beta
            MixtureInference mInf = new MixtureInference(mworld, iterations, rng);
            
            long startTime = System.nanoTime();
            mInf.run(sampleVersion);
            long elapsedTime = System.nanoTime() - startTime;
            float elapsedTimeSeconds = (float)elapsedTime/1000000000; // convert nano time to seconds
            System.out.println("Elapsed time was: " + elapsedTimeSeconds + " seconds");
            //float timePerIteration = (elapsedTimeSeconds/iterations)*1000;
            //System.out.println("Time per iteration is: " + timePerIteration + " milliseconds");
            
            System.out.println("================================================================");
        }
    }
}
