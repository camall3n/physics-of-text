package org.ucb.dpm;

import cern.jet.stat.tdouble.Gamma;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.util.Util;

/**
 * Different sampling for inference
 * 
 */
public class MixtureInference {
    MixtureWorld mworld;
    int iteration;
    Random rng;
    int c_i;
    int c_j;
    ArrayList <MixtureDistributions.MixtureData> c_sm; //for split or merge
    ArrayList <MixtureDistributions.MixtureData> c_sm_i; //for split or merge
    ArrayList <MixtureDistributions.MixtureData> c_sm_j; //for split or merge
    boolean split;
    double probSplit;
    double probMerge;
    
    int appSplitMerge; // number of applied proposals in JN 2004 split-merge 
    int appSmartSplit; // number of applied split proposals in Smart Split 
    int appDumpMerge; // number of applied merge proposals in Smart Split 
    int appDumpSplit; // number of applied split proposals in Smart Merge
    int appSmartMerge; // number of applied merge proposals in Smart Merge
    int propSmartSplit; // number of split proposals in Smart Split 
    int propDumpMerge; // number of merge proposals in Smart Split 
    int propDumpSplit; // number of split proposals in Smart Merge
    int propSmartMerge; // number of merge proposals in Smart Merge
    
    private final static Logger logger = LoggerFactory.getLogger(MixtureInference.class);

    public MixtureInference(MixtureWorld mworld, int interation, Random rng){
        this.mworld = mworld;
        this.iteration = interation;
        this.rng = rng;
        c_i = 0;
        c_j = 0;
        c_sm = Lists.newArrayList(); 
        c_sm_i = Lists.newArrayList(); 
        c_sm_j = Lists.newArrayList();
        split = true;
        probSplit = 0.0;
        probMerge = 0.0;
        
        appSplitMerge = 0;
        appSmartSplit = 0; 
        appDumpMerge = 0; 
        appDumpSplit = 0; 
        appSmartMerge = 0; 
    }
    
    public void run(int sampleVersion) {
        
        String fileDir = "output-d" + mworld.getDimension() + "-n" + mworld.getDataSize() + "-v" + sampleVersion 
                + "-a" + mworld.getAlpha() + "-b" + mworld.getBeta() +"-i" + iteration +"/";
        MixtureObsever mObs = new MixtureObsever(fileDir);
        mObs.observe(mworld);

        float totalTime = 0;
        for(int i =0; i<iteration; i++) {
            logger.debug("current world: {}", mworld.showMixtureWorld());
            
            long startTime = System.nanoTime();
            //int sampleVersion = 1;
            //run sampling
            
            switch (sampleVersion){
                case 1:
                    sampleCompleteGibbs(rng);
                    break;
                case 2:
                    sampleSplitMerge(rng, 5);
                    sampleCompleteGibbs(rng);
                    break;
                case 3:
                    if(rng.nextBoolean())
                        sampleSmartSplitDumpMerge(rng);
                    else
                        sampleSmartMergeDumpSplit(rng);
                    break;
                case 4:
                    if(rng.nextBoolean())
                        sampleSmartSplitDumpMerge(rng);
                    else
                        sampleSmartMergeDumpSplit(rng);
                    sampleRandomGibbs(rng);
                    break;
                case 5:
                    double p = rng.nextDouble();
                    if (p < 1.0/3)
                        sampleSmartSplitDumpMerge(rng);
                    else if (p < 2.0/3)
                        sampleSmartMergeDumpSplit(rng);
                    else
                        sampleComponentGibbs(rng);
                    break;
                case 6:
                     sampleSmartSplitDumpMerge(rng);
                     sampleSmartMergeDumpSplit(rng);
                     sampleComponentGibbs(rng);
            }
            //logger.debug("distribution of components: {}", mworld.distributionComponents().toString());
            //sampleSplitMerge(rng, 5);
            //sampleGibbs(rng);
            
            
            //end of sampling
            long elapsedTime = System.nanoTime() - startTime;
            float milliSecondsPI = (float)elapsedTime/1000000;
            totalTime += milliSecondsPI;
            mObs.observe(mworld);
        }
        
        System.out.println("Time per iteration (ms) : " + totalTime/iteration);
        if(appSplitMerge != 0)
            System.out.println("acceptance rate - SplitMerge JN: " + (double)appSplitMerge/iteration);
        
        int appSD = appSmartMerge + appDumpSplit + appDumpMerge + appSmartSplit;
        int propSmartS = propSmartSplit + propDumpMerge;
        int propSmartM = propSmartMerge + propDumpSplit;
        
        if (appSD != 0) {
            System.out.println("acceptance rate - SmartDump-ALL: " + (double)(appSD)/iteration);
        
            System.out.println("acceptance rate - SmartSplit-DumpMerge: " + (double)(appSmartSplit+ appDumpMerge)/propSmartS);
            System.out.println("acceptance rate - SmartMerge-DumpSplit: " + (double)(appDumpSplit+ appSmartMerge)/propSmartM);

            System.out.println("acceptance rate - SmartSplit: " + (double)appSmartSplit/propSmartSplit);
            System.out.println("acceptance rate - DumpMerge: " + (double)appDumpMerge/propDumpMerge);
            
            System.out.println("acceptance rate - SmartMerge: " + (double)appSmartMerge/propSmartMerge);
            System.out.println("acceptance rate - DumpSplit: " + (double)appDumpSplit/propDumpSplit);
        }


    }
    
    public void sampleCompleteGibbs(Random rng) {
        for (int k=0; k<mworld.getDataSize();k++) {
            //for (MixtureDistributions.MixtureData mdata : mworld.getMixtureDataList()) 
            MixtureDistributions.MixtureData mdata = mworld.getMixtureDataList().get(k);
            //MixtureDistributions.MixtureData mdata = mworld.getRandomMixtureData(rng);
            int c_id = mdata.getCid();
            
            LogProbMap <Integer> sampler = new LogProbMap<Integer>() {};
            double alpha = mworld.getAlpha();
            double beta = mworld.getBeta();
            int n = mworld.getDataSize();
            
            for (int j : mworld.getMixtureDataSet().keySet()) {
                double proba = 0.0;
                int n_cj  = mworld.countComponent(j) - ( j==c_id?1:0);
                if (n_cj == 0)
                    continue;
                proba += Math.log((double)n_cj/(n - 1 + alpha));
                
                for (int h = 0; h< mworld.getDimension(); h++) {
                    proba += Math.log((double)(mworld.countMatchGibbs(c_id, j, h, mdata) + beta)/ (n_cj + beta*2));
                }
                sampler.multiplyLogKey(j, proba);
            }
            int newComponent = mworld.newComponent();
            double proba = Math.log(alpha/(n-1+alpha));
            for (int h = 0; h< mworld.getDimension(); h++) {
                proba += Math.log((double)(beta)/(beta*2));
            }
            sampler.multiplyLogKey(newComponent, proba);
            sampler.normalize();
            
            int component = sampler.sample(rng);
            mworld.updataMixtureData(mdata, component);
            //mdata.setCid(component);
        }
    }
    
    public void sampleComponentGibbs(Random rng) {
        int c_id = mworld.getRandomMixtureComponent(rng);
        //logger.info("c_id {} {}", c_id, mworld.countComponent(c_id));
        List <MixtureDistributions.MixtureData> mdList = mworld.getMixtureDataSet().get(c_id);
        for (int i = 0; i < mdList.size(); i++) {
            sampleSingleGibbs(rng, mdList.get(i));
        }
    }
    
    public void sampleRandomGibbs(Random rng) {
        MixtureDistributions.MixtureData mdata = mworld.getRandomMixtureData(rng);
        sampleSingleGibbs(rng, mdata);
    }
    
    public void sampleSingleGibbs(Random rng, MixtureDistributions.MixtureData mdata) {
            //for (MixtureDistributions.MixtureData mdata : mworld.getMixtureDataList()) 
            //MixtureDistributions.MixtureData mdata = mworld.getMixtureDataList().get(k);
            //MixtureDistributions.MixtureData mdata = mworld.getRandomMixtureData(rng);
            int c_id = mdata.getCid();
            
            LogProbMap <Integer> sampler = new LogProbMap<Integer>() {};
            double alpha = mworld.getAlpha();
            double beta = mworld.getBeta();
            int n = mworld.getDataSize();
            
            for (int j : mworld.getMixtureDataSet().keySet()) {
                double proba = 0.0;
                int n_cj  = mworld.countComponent(j) - ( j==c_id?1:0);
                if (n_cj == 0)
                    continue;
                proba += Math.log((double)n_cj/(n - 1 + alpha));
                
                for (int h = 0; h< mworld.getDimension(); h++) {
                    proba += Math.log((double)(mworld.countMatchGibbs(c_id, j, h, mdata) + beta)/ (n_cj + beta*2));
                }
                sampler.multiplyLogKey(j, proba);
            }
            int newComponent = mworld.newComponent();
            double proba = Math.log(alpha/(n-1+alpha));
            for (int h = 0; h< mworld.getDimension(); h++) {
                proba += Math.log((double)(beta)/(beta*2));
            }
            sampler.multiplyLogKey(newComponent, proba);
            sampler.normalize();
            
            int component = sampler.sample(rng);
            mworld.updataMixtureData(mdata, component);
            //mdata.setCid(component);
    }
    
    /**
     * Split-Merge sampler described by Jain & Neal 2000, algorithm 2
     * @param rng 
     * @param t : number of intermediate Gibbs sampling
     */
    public void sampleSplitMerge(Random rng, int t) {
        //choose two random data
        MixtureDistributions.MixtureData md1 = mworld.getRandomMixtureData(rng);
        MixtureDistributions.MixtureData md2 = mworld.getRandomMixtureData(rng);
        while(md1 == md2){
            md2 =  mworld.getRandomMixtureData(rng);
        }
        split =true;
        if (md1.getCid() != md2.getCid()) {
            split = false;
        }
        //ArrayList <MixtureDistributions.MixtureData> c_sm = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_i = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_j = Lists.newArrayList(); //for split or merge
        //initilize the split merge components
        c_sm.clear();
        c_sm_j.clear();
        c_sm_i.clear();
        
        //prepare the launch state
        ArrayList <MixtureDistributions.MixtureData> c_launch = Lists.newArrayList(); //launch state
        
        c_sm.addAll(mworld.getMixtureDataSet().get(md1.getCid()));
        
        if (!split)
            c_sm.addAll(mworld.getMixtureDataSet().get(md2.getCid()));
        
        for (MixtureDistributions.MixtureData md : c_sm) {
            MixtureDistributions.MixtureData launch_md = new MixtureDistributions.MixtureData(md);
            c_launch.add(launch_md);
        }
        
        ArrayList <MixtureDistributions.MixtureData> c_launch_i = Lists.newArrayList();
        ArrayList <MixtureDistributions.MixtureData> c_launch_j = Lists.newArrayList();
        

        if (split) {
            c_i = mworld.newComponent();
            c_j = md1.getCid();
            logger.debug("spliting cid: {} to {} {},", c_j, c_j, c_i);
        }        
        else {
            c_i = md1.getCid();
            c_j = md2.getCid();
            logger.debug("merging cid: {} {}", c_i, c_j);
        }
        for (MixtureDistributions.MixtureData md : c_launch) {
            if (md == md1) {
                c_launch_i.add(md);
            }
            else if (md == md2) {
                c_launch_j.add(md);
            } else {
                if (rng.nextBoolean()) {
                    md.setCid(c_i);
                    c_launch_i.add(md);
                    
                }
                else{
                    md.setCid(c_j);
                    c_launch_j.add(md);
                }
            }
        }
        logger.debug("md1: {}:{}, md2: {}:{}", md1.getCid(), md1.getEid(), md2.getCid(), md2.getEid());
        logger.debug("c_launch_i: {}", c_launch_i.toString());
        logger.debug("c_launch_j: {}", c_launch_j.toString());
        
        //for (Map.Entry<Integer, MixtureDistributions.MixtureData> entry : c_launch_i.entries()) {
        //    entry.getValue().setCid(1);
        //}
        //logger.debug("c_launch_i: {}", c_launch_i.toString());
        logger.debug("c_launch: {}", c_launch.toString());
        logger.debug("c_sm: {}", c_sm.toString());
        
        //restricted Gibbs sampling
        double alpha = mworld.getAlpha();
        double beta = mworld.getBeta();
        int n_launch = c_launch.size();

        logger.debug("{} data chosen", n_launch);
        for (int i = 0; i<t; i++){ // t is the number of complete Gibbs sampling
            for (int k=0; k<n_launch; k ++) {
                int n_launch_i = c_launch_i.size();
                int n_launch_j = c_launch_j.size();
                logger.debug("n_i: {}, n_j: {}" , n_launch_i, n_launch_j);
                MixtureDistributions.MixtureData mdata = c_launch.get(k);
                int c_id = mdata.getCid();
                logger.debug("updating data n{} with cid {}", mdata.getEid(), mdata.getCid());

                LogProbMap <Integer> sampler = new LogProbMap<Integer>() {};

                double proba1 = 0.0;
                int n_i = n_launch_i - (c_i == c_id ?1:0);
                logger.debug("n_i: {}", n_i);
                if (n_i != 0) {
                    proba1 += Math.log(((double)n_i)/(n_launch - 1 + alpha));
                    //logger.debug("proba1: {}", proba1);
                    for (int h = 0; h<mworld.getDimension(); h++){
                        proba1 += Math.log((double)(mworld.countMatchGibbs(c_id, c_i, h, mdata, c_launch) + beta) / (n_i + beta *2));
                        //logger.debug("{}", (double)(mworld.countMatchGibbs(c_id, c_i, h, mdata, c_launch) + beta) / (n_i + beta *2));
                    }
                    logger.debug("proba1: {}", proba1);
                    sampler.multiplyLogKey(c_i, proba1);
                }
                
                double proba2 = 0.0;
                int n_j = n_launch_j - (c_j == c_id ?1:0);
                logger.debug("n_j: {}", n_j);
                if (n_j != 0){
                    proba2 += Math.log(((double)n_j)/(n_launch - 1 + alpha));
                    //logger.debug("proba2: {}", proba2);
                    for (int h = 0; h<mworld.getDimension(); h++){
                        proba2 += Math.log((double)(mworld.countMatchGibbs(c_id, c_j, h, mdata, c_launch) + beta) / (n_j + beta *2));
                    }
                    logger.debug("proba2: {}", proba2);
                    sampler.multiplyLogKey(c_j, proba2);
                }
                
                sampler.normalize();
                int component = sampler.sample(rng);
                logger.debug("new component sampled: {}", component);
                if (component != c_id) {
                    mdata.setCid(component);
                    if (c_id == c_i){
                        c_launch_i.remove(mdata);
                        c_launch_j.add(mdata);
                    }
                    else if (c_id == c_j) {
                        c_launch_j.remove(mdata);
                        c_launch_i.add(mdata);
                    }

                }
                //logger.debug("c_launch: {}", c_launch.toString());
            }
            logger.debug("c_i: {}, c_j: {}", c_i, c_j);
            logger.debug("c_launch_i: {}", c_launch_i.toString());
            logger.debug("c_launch_j: {}", c_launch_j.toString());
        }
        
        //split and merge by one final Gibbs sampling from launch state
        //ArrayList <MixtureDistributions.MixtureData> c_sm_i = Lists.newArrayList();
        //ArrayList <MixtureDistributions.MixtureData> c_sm_j = Lists.newArrayList();
        probSplit = 0.0;
        probMerge = 0.0;
        
        if (split) { //the split case
            //propose the split from launch state and calculate the split probability
            for (int k = 0; k < n_launch; k++) {
                MixtureDistributions.MixtureData md = c_launch.get(k);
                MixtureDistributions.MixtureData md_sm = c_sm.get(k);
                if (md_sm == md1) { // c_sm_i
                    c_sm_i.add(md_sm);
                    //md.setCid(c_i);
                }
                else if (md_sm == md2) { //c_sm_j
                    c_sm_j.add(md_sm);
                    //md.setCid(c_j);
                }
                else {
                    int c_id = md.getCid();
                    //md.getEid();
                    int n_launch_i = c_launch_i.size();
                    int n_launch_j = c_launch_j.size();
                    //logger.debug("updating data n{} with cid {}", md.getEid(), md.getCid());
                    
                    LogProbMap <Integer> sampler = new LogProbMap<Integer>() {};
                    
                    double proba1 = 0.0;
                    int n_i = n_launch_i - (c_i == c_id ?1:0);
                    //logger.debug("n_i: {}", n_i);
                    if (n_i != 0) {
                        proba1 += Math.log(((double)n_i)/(n_launch - 1 + alpha));
                        //logger.debug("proba1: {}", proba1);
                        for (int h = 0; h<mworld.getDimension(); h++){
                            proba1 += Math.log((double)(mworld.countMatchGibbs(c_id, c_i, h, md, c_launch) + beta) / (n_i + beta *2));
                            //logger.debug("{}", (double)(mworld.countMatchGibbs(c_id, c_i, h, mdata, c_launch) + beta) / (n_i + beta *2));
                        }
                    }
                    else {
                        proba1 += Math.log(alpha/(c_launch.size() -1+alpha));
                        for (int h = 0; h< mworld.getDimension(); h++) {
                            proba1 += Math.log((double)(beta)/(beta*2));
                        }
                    }
                    //logger.debug("proba1: {}", proba1);
                    sampler.multiplyLogKey(c_i, proba1);
                    
                    double proba2 = 0.0;
                    int n_j = n_launch_j - (c_j == c_id ?1:0);
                    //logger.debug("n_j: {}", n_j);
                    if (n_j != 0){
                        proba2 += Math.log(((double)n_j)/(n_launch - 1 + alpha));
                        //logger.debug("proba2: {}", proba2);
                        for (int h = 0; h<mworld.getDimension(); h++){
                            proba2 += Math.log((double)(mworld.countMatchGibbs(c_id, c_j, h, md, c_launch) + beta) / (n_j + beta *2));
                        }
                    }
                    else {
                        proba2 += Math.log(alpha/(c_launch.size() -1+alpha));
                        for (int h = 0; h< mworld.getDimension(); h++) {
                            proba2 += Math.log((double)(beta)/(beta*2));
                        }
                    }
                    //logger.debug("proba2: {}", proba2);
                    sampler.multiplyLogKey(c_j, proba2);
                    
                    sampler.normalize();
                    int component = sampler.sample(rng);
                    //logger.debug("new component sampled: {}", component);
                    if (component != c_id) {
                        md.setCid(component);
                        if (c_id == c_i){
                            c_launch_i.remove(md);
                            c_launch_j.add(md);
                        }
                        else if (c_id == c_j) {
                            c_launch_j.remove(md);
                            c_launch_i.add(md);
                        }
                    }
                    probSplit += sampler.probKey(component);
                    if (component == c_i) {
                        c_sm_i.add(md_sm);
                    }
                    else if (component == c_j) {
                        c_sm_j.add(md_sm);
                    }
                }
            }
            //calculate the inverse merge probability in the split case
            //probMerge = 0;
        }
        else { // the merge case
            //probMerge = 0;
            //propose the split from launch state and calculate the split probability
            for (int k = 0; k < n_launch; k++) {
                MixtureDistributions.MixtureData md = c_launch.get(k);
                MixtureDistributions.MixtureData md_sm = c_sm.get(k);
                if (md_sm == md1 || md_sm == md2) { // c_sm_i
                    continue;
                }
                int c_id = md.getCid();
                int n_launch_i = c_launch_i.size();
                int n_launch_j = c_launch_j.size();
                logger.debug("updating data n{} with cid {}", md.getEid(), md.getCid());
                    
                LogProbMap <Integer> sampler = new LogProbMap<Integer>() {};
                
                double proba1 = 0.0;
                int n_i = n_launch_i - (c_i == c_id ?1:0);
                logger.debug("n_i: {}", n_i);
                if (n_i != 0) {
                    proba1 += Math.log(((double)n_i)/(n_launch - 1 + alpha));
                    //logger.debug("proba1: {}", proba1);
                    for (int h = 0; h<mworld.getDimension(); h++){
                        proba1 += Math.log((double)(mworld.countMatchGibbs(c_id, c_i, h, md, c_launch) + beta) / (n_i + beta *2));
                        //logger.debug("{}", (double)(mworld.countMatchGibbs(c_id, c_i, h, mdata, c_launch) + beta) / (n_i + beta *2));
                    }
                  
                }
                else {
                    proba1 += Math.log(alpha/(c_launch.size() -1+alpha));
                    for (int h = 0; h< mworld.getDimension(); h++) {
                        proba1 += Math.log((double)(beta)/(beta*2));
                    }
                }
                logger.debug("proba1: {}", proba1);
                sampler.multiplyLogKey(c_i, proba1);
                    
                double proba2 = 0.0;
                int n_j = n_launch_j - (c_j == c_id ?1:0);
                logger.debug("n_j: {}", n_j);
                if (n_j != 0){
                    proba2 += Math.log(((double)n_j)/(n_launch - 1 + alpha));
                    
                    //logger.debug("proba2: {}", proba2);
                    for (int h = 0; h<mworld.getDimension(); h++){
                        proba2 += Math.log((double)(mworld.countMatchGibbs(c_id, c_j, h, md, c_launch) + beta) / (n_j + beta *2));
                    }
                }
                else {
                    proba2 += Math.log(alpha/(c_launch.size() -1+alpha));
                    for (int h = 0; h< mworld.getDimension(); h++) {
                        proba2 += Math.log((double)(beta)/(beta*2));
                    }
                }
                logger.debug("proba2: {}", proba2);
                sampler.multiplyLogKey(c_j, proba2);
                
                
                sampler.normalize();
                //int component = sampler.sample(rng);
                int component = md_sm.getCid();
                //logger.debug("new component sampled: {}", component);
                if (component != c_id) {
                    md.setCid(component);
                    if (c_id == c_i){
                        c_launch_i.remove(md);
                        c_launch_j.add(md);
                    }
                    else if (c_id == c_j) {
                        c_launch_j.remove(md);
                        c_launch_i.add(md);
                    }
                }
                probSplit += sampler.probKey(component);
            }
        }
        
        //calculater the acceptance ratio
        double acceptanceRatio = 0.0;
        if (split) {
            //prior ratio
            acceptanceRatio += (Math.log(alpha) + Util.logFactorial(c_sm_i.size() -1) + Util.logFactorial(c_sm_j.size() -1) - Util.logFactorial(c_sm.size() -1));
            //likelihood ratio
            double likelihoodS = 0;
            likelihoodS += mworld.componentLikelihood(c_i, c_launch_i);
            likelihoodS += mworld.componentLikelihood(c_j, c_launch_j);
            double likelihoodM = mworld.componentLikelihood(c_j);
            
            acceptanceRatio += (likelihoodS - likelihoodM); 
            acceptanceRatio -= probSplit;
        }
        else {
            //prior ratio
            acceptanceRatio -= (Math.log(alpha) + Util.logFactorial(c_sm_i.size() -1) + Util.logFactorial(c_sm_j.size() -1) - Util.logFactorial(c_sm.size() -1));
            //likelihood ratio
            double likelihoodS = 0;
            likelihoodS += mworld.componentLikelihood(c_i);
            likelihoodS += mworld.componentLikelihood(c_j);
            double likelihoodM = mworld.componentLikelihood(c_j, c_launch);
            
            acceptanceRatio += (likelihoodM - likelihoodS); 
            acceptanceRatio += probSplit;
        }
        
        //apply the proposal
        // if (rng.nextDouble() < Math.exp(acceptanceRatio)) {
        //    if(split) {
        //        logger.debug("split accepted");
        //        for (MixtureDistributions.MixtureData md: c_sm_i) {
        //            mworld.updataMixtureData(md, c_i);
        //        }
        //        for (MixtureDistributions.MixtureData md: c_sm_j) {
        //            mworld.updataMixtureData(md, c_j);
        //        }
        //    }
        //    else {
        //        logger.debug("merge accepted");
        //        for (MixtureDistributions.MixtureData md : c_sm) {
        //            mworld.updataMixtureData(md, c_j);
        //        }
        //    }
        //}
        //else {
        //    logger.debug("proposal rejected");
        //}
        if(applyProposal(rng, acceptanceRatio)){ //;//, c_sm, c_sm_i, c_sm_j);
            appSplitMerge += 1;
        }
    }
    
    public boolean applyProposal(Random rng, double acceptanceRatio){//, ArrayList<MixtureDistributions.MixtureData> c_sm, ArrayList<MixtureDistributions.MixtureData> c_sm_i, ArrayList<MixtureDistributions.MixtureData> c_sm_j) {
        if (rng.nextDouble() < Math.exp(acceptanceRatio)) {
            if(split) {
                logger.debug("split accepted");
                for (MixtureDistributions.MixtureData md: c_sm_i) {
                    mworld.updataMixtureData(md, c_i);
                }
                for (MixtureDistributions.MixtureData md: c_sm_j) {
                    mworld.updataMixtureData(md, c_j);
                }
            }
            else {
                logger.debug("merge accepted");
                for (MixtureDistributions.MixtureData md : c_sm) {
                    mworld.updataMixtureData(md, c_j);
                }
            }
            return true;
        }
        else {
            logger.debug("proposal rejected");
            return false;
        }
    }
    
    public void sampleSmartSplitDumpMerge(Random rng) {
        double alpha = mworld.getAlpha();
        double beta = mworld.getBeta();
        //double beta = mworld.getBeta()/mworld.getDimension();déboucheur
        int numComponent = mworld.getMixtureDataSet().keySet().size();
        c_sm.clear();
        c_sm_i.clear();
        c_sm_j.clear();
        //ArrayList <MixtureDistributions.MixtureData> c_sm = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_i = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_j = Lists.newArrayList(); //for split or merge
        //initilize the split merge components
        probSplit = 0.0;
        probMerge = 0.0;
        split = true;
        if(rng.nextBoolean()) {
            split =false;
        }
        
        if (split) {
            logger.debug("proposing a smart split");
            //choose one component to split
            LogProbMap <Integer> cSampler = new LogProbMap<>();
            for (int cid: mworld.getMixtureDataSet().keySet()){
                double probCid = - mworld.componentLikelihood(cid);
                logger.debug("cid: {}, likelihood: {}", cid, probCid);
                cSampler.multiplyLogKey(cid, probCid);
            }
            cSampler.normalize();
            
            c_j = cSampler.sample(rng);
            c_i = mworld.newComponent();
            
            logger.debug("component {} sampled", c_j);
            c_sm.addAll(mworld.getMixtureDataSet().get(c_j));
            Collections.sort(c_sm);
            probSplit += cSampler.probKey(c_j);
            
            
            //ArrayList <MixtureDistributions.MixtureData> c_launch = Lists.newArrayList();
            //
            //for(MixtureDistributions.MixtureData md: c_sm) {
            //    c_launch.add(new MixtureDistributions.MixtureData(md));
            //}
            
            for (MixtureDistributions.MixtureData md: c_sm) {
                double prob1 = 1.0; // the probability to split elements in c_sm to c_i or c_j
                double prob2 = 1.0; 
                for (int h = 0; h < mworld.getDimension(); h ++){
                    prob1 *= ((double)(mworld.countMatch(h, md, c_sm_i) + beta)/(c_sm_i.size() + beta *2));
                    prob2 *= ((double)(mworld.countMatch(h, md, c_sm_j) + beta)/(c_sm_j.size() + beta *2));
                }
                logger.debug("splitting,  prob1:{}, prob2: {}", prob1, prob2);
                double prob1Norm = prob1/(prob1 + prob2);
                double prob2Norm = prob2/(prob1 + prob2);
                logger.debug("prob1, prob2: {} {}", prob1Norm, prob2Norm);
                if(rng.nextDouble() <= prob1Norm) {
                    c_sm_i.add(md);
                    probSplit += Math.log(prob1Norm);
                }
                else {
                    c_sm_j.add(md);
                    probSplit += Math.log(prob2Norm);
                }
            }
            
            //the inverse merge
            probMerge += (Math.log(2) - Math.log(numComponent) - Math.log(numComponent+1));
            
        }
        else { //merge case
            if (numComponent < 2) {
                logger.debug("Only one component exists so no merge can be applied!");
                return;
            }
            logger.debug("proposing a dump merge");
            c_i = mworld.getRandomMixtureComponent(rng);
            do{
                c_j = mworld.getRandomMixtureComponent(rng);
            }while(c_i == c_j);
            
            //c_sm_i.addAll(mworld.getMixtureDataSet().get(c_i));
            //c_sm_j.addAll(mworld.getMixtureDataSet().get(c_j));
            
            c_sm.addAll(mworld.getMixtureDataSet().get(c_i));
            c_sm.addAll(mworld.getMixtureDataSet().get(c_j));
            
            Collections.sort(c_sm);
            
            probMerge += (Math.log(2) - Math.log(numComponent) - Math.log(numComponent-1));
            
            //the inverse split
            
            LogProbMap <Integer> cSampler = new LogProbMap<>();
            for (int cid: mworld.getMixtureDataSet().keySet()){
                if (cid == c_i || cid == c_j)
                    continue;
                double probCid = -mworld.componentLikelihood(cid);
                cSampler.multiplyLogKey(cid, probCid);
            }
            double probCid_s = -mworld.componentLikelihood(c_j, c_sm);
            cSampler.multiplyLogKey(c_j, probCid_s);
            cSampler.normalize();
            
            probSplit += cSampler.probKey(c_j);
            
           
            
            for(MixtureDistributions.MixtureData md : c_sm) {
                double prob1 = 1.0; // the probability to split elements in c_sm to c_i or c_j
                double prob2 = 1.0;
            
                for (int h = 0; h < mworld.getDimension(); h ++){
                    prob1 *= ((double)(mworld.countMatch(h, md, c_sm_i) + beta)/(c_sm_i.size() + beta *2));
                    prob2 *= ((double)(mworld.countMatch(h, md, c_sm_j) + beta)/(c_sm_j.size() + beta *2));
                }
                double prob1Norm = prob1/(prob1 + prob2);
                double prob2Norm = prob2/(prob1 + prob2);
                
                if(md.getCid() == c_i) {
                    c_sm_i.add(md);
                    probSplit += Math.log(prob1Norm);
                }
                else if (md.getCid() == c_j){
                    c_sm_j.add(md);
                    probSplit += Math.log(prob2Norm);
                }
            }
        }
        
        double acceptanceRatio = acceptanceRatio();//c_sm, c_sm_i, c_sm_j);
        logger.debug("c_sm: {}", c_sm.toString());
        logger.debug("c_sm_i: {}", c_sm_i.toString());
        logger.debug("c_sm_j: {}", c_sm_j.toString());
        //apply the proposal
        //applyProposal(rng, acceptanceRatio);//, c_sm, c_sm_i, c_sm_j);
        if(applyProposal(rng, acceptanceRatio)){
            if(split){
                propSmartSplit += 1;
                appSmartSplit += 1;
            }
            else{
                propDumpMerge += 1;
                appDumpMerge += 1;
            }
        }
        else {
            if(split){
                propSmartSplit += 1;
            }
            else{
                propDumpMerge += 1;
            }
        }
    }
    
    /**
     * sampling combining a smart merge with a dump split
     */
    public void sampleSmartMergeDumpSplit(Random rng) {
        double alpha = mworld.getAlpha();
        double beta = mworld.getBeta();
        int numComponent = mworld.getMixtureDataSet().keySet().size();
        c_sm.clear();
        c_sm_i.clear();
        c_sm_j.clear();
        //ArrayList <MixtureDistributions.MixtureData> c_sm = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_i = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_j = Lists.newArrayList(); //for split or merge
        //initilize the split merge components
        probSplit = 0.0;
        probMerge = 0.0;
        split = true;
        if(rng.nextBoolean()) {
            split =false;
        }
        
        if (split) {
            logger.debug("proposing a dump split");
            //choose one component to split
            c_j = mworld.getRandomMixtureComponent(rng);
            c_i = mworld.newComponent();
            
            c_sm.addAll(mworld.getMixtureDataSet().get(c_j));
            //Collections.sort(c_sm);
            
            for (MixtureDistributions.MixtureData md: c_sm) {
                if(rng.nextBoolean()) {
                    c_sm_i.add(md);
                }
                else{
                    c_sm_j.add(md);
                }
            }
            probSplit -= Math.log(numComponent);
            probSplit -=  c_sm.size() * Math.log(2);
            
            //the inverse merge
            
            //choose the first component by their likilihood
            //LogProbMap <Integer> cSampler_1 = new LogProbMap<>();
            //for (int cid: mworld.getMixtureDataSet().keySet()){
            //    if (cid == c_j)
            //        continue;
            //    double probCid_i = mworld.componentLikelihood(cid);
            //    cSampler_1.multiplyLogKey(cid, probCid_i);
            //}
            //cSampler_1.multiplyLogKey(c_i, mworld.componentLikelihood(c_sm_i));
            //cSampler_1.multiplyLogKey(c_j, mworld.componentLikelihood(c_sm_j));
            //cSampler_1.normalize();
            //
            //double probM1 = cSampler_1.probKey(c_i);
            //double probM2 = cSampler_1.probKey(c_j);
            
            LogProbMap <Integer> cSampler_ij = new LogProbMap<>();
            LogProbMap <Integer> cSampler_ji = new LogProbMap<>();
            for(int cid: mworld.getMixtureDataSet().keySet()){
                if (cid == c_j)
                    continue;
                ArrayList <MixtureDistributions.MixtureData> mergeC_ij = Lists.newArrayList(c_sm_i);
                mergeC_ij.addAll(mworld.getMixtureDataSet().get(cid));
                double probCid_ij = mworld.componentLikelihood(mergeC_ij);
                cSampler_ij.multiplyLogKey(cid, probCid_ij);
                
                ArrayList <MixtureDistributions.MixtureData> mergeC_ji = Lists.newArrayList(c_sm_j);
                mergeC_ji.addAll(mworld.getMixtureDataSet().get(cid));
                double probCid_ji = mworld.componentLikelihood(mergeC_ji);
                cSampler_ji.multiplyLogKey(cid, probCid_ji);
            }
            cSampler_ij.multiplyLogKey(c_j, mworld.componentLikelihood(c_sm));
            cSampler_ij.normalize();
            double probM1 = cSampler_ij.probKey(c_j);
            
            cSampler_ji.multiplyLogKey(c_i, mworld.componentLikelihood(c_sm));
            cSampler_ji.normalize();
            double probM2 = cSampler_ji.probKey(c_i);
            
            probMerge -= Math.log(numComponent+1);
            probMerge += Util.logAdd(probM1, probM2);
            
            //probMerge += Math.log(2) - Math.log(numComponent) - Math.log(numComponent+1);
            
        }
        else { //merge case
            if (numComponent < 2) {
                logger.debug("Only one component exists so no merge can be applied!");
                return;
            }
            logger.debug("proposing a smart merge");
            
            //LogProbMap <Integer> cSampler_i = new LogProbMap<>();
            //for (int cid: mworld.getMixtureDataSet().keySet()){
            //    double probCid_i = mworld.componentLikelihood(cid);
            //    cSampler_i.multiplyLogKey(cid, probCid_i);
            //}
            //cSampler_i.normalize();
            //c_i = cSampler_i.sample(rng);
            
            c_i = mworld.getRandomMixtureComponent(rng);
            c_sm_i.addAll(mworld.getMixtureDataSet().get(c_i));
            
            LogProbMap <Integer> cSampler_j = new LogProbMap<>();
            for(int cid: mworld.getMixtureDataSet().keySet()){
                if (cid == c_i)
                    continue;
                ArrayList <MixtureDistributions.MixtureData> mergeC = Lists.newArrayList(c_sm_i);
                mergeC.addAll(mworld.getMixtureDataSet().get(cid));
                double probCid_j = mworld.componentLikelihood(mergeC);
                cSampler_j.multiplyLogKey(cid, probCid_j);
            }
            logger.debug("c_i: {}", c_i);
            logger.debug("{}", cSampler_j.toString());
            cSampler_j.normalize();
            logger.debug("{}", cSampler_j.toString());
            
            c_j = cSampler_j.sample(rng);
            c_sm_j.addAll(mworld.getMixtureDataSet().get(c_j));
            //c_sm_i.addAll(mworld.getMixtureDataSet().get(c_i));
            //c_sm_j.addAll(mworld.getMixtureDataSet().get(c_j));
            
            c_sm.addAll(mworld.getMixtureDataSet().get(c_i));
            c_sm.addAll(mworld.getMixtureDataSet().get(c_j));

            //the same merge but c_j sampled first
            LogProbMap <Integer> cSampler_i = new LogProbMap<>();
            for(int cid: mworld.getMixtureDataSet().keySet()){
                if (cid == c_j)
                    continue;
                ArrayList <MixtureDistributions.MixtureData> mergeC = Lists.newArrayList(c_sm_j);
                mergeC.addAll(mworld.getMixtureDataSet().get(cid));
                double probCid_i = mworld.componentLikelihood(mergeC);
                cSampler_i.multiplyLogKey(cid, probCid_i);
            }
            cSampler_i.normalize();
           
            probMerge -= Math.log(numComponent);
            probMerge += Util.logAdd(cSampler_j.probKey(c_j), cSampler_i.probKey(c_i));
            
            //the inverse split
            probSplit -= Math.log(numComponent-1);
            probSplit -=  c_sm.size() * Math.log(2);
        }
        
        double acceptanceRatio = acceptanceRatio();//c_sm, c_sm_i, c_sm_j);
        logger.debug("c_sm: {}", c_sm.toString());
        logger.debug("c_sm_i: {}", c_sm_i.toString());
        logger.debug("c_sm_j: {}", c_sm_j.toString());
        
        //apply the proposal
        //applyProposal(rng, acceptanceRatio);//, c_sm, c_sm_i, c_sm_j);
        
        if(applyProposal(rng, acceptanceRatio)){
            if(split){
                propDumpSplit += 1;
                appDumpSplit += 1;
            }
            else{
                propSmartMerge += 1;
                appSmartMerge += 1;
            }
        }
        else {
            if(split){
                propDumpSplit += 1;
            }
            else{
                propSmartMerge += 1;
            }
        }
    }
    
    public double acceptanceRatio(){// ArrayList<MixtureDistributions.MixtureData> c_sm, ArrayList<MixtureDistributions.MixtureData> c_sm_i, ArrayList<MixtureDistributions.MixtureData> c_sm_j) {

        double acceptanceRatio = 0.0;
        double alpha = mworld.getAlpha();
        if (split) {
            //prior ratio
            acceptanceRatio += (Math.log(alpha) + Util.logFactorial(c_sm_i.size() -1) + Util.logFactorial(c_sm_j.size() -1) - Util.logFactorial(c_sm.size() -1));
            logger.debug("prior ratio: {}", Math.exp(acceptanceRatio));
            //likelihood ratio
            double likelihoodS = 0;
            likelihoodS += mworld.componentLikelihood(c_sm_i);
            likelihoodS += mworld.componentLikelihood(c_sm_j);
            double likelihoodM = mworld.componentLikelihood(c_sm);
            
            acceptanceRatio += (likelihoodS - likelihoodM); 
            logger.debug("state ratio: {}", Math.exp(acceptanceRatio));
            logger.debug("proposal ratio ratio: {}", Math.exp(probMerge - probSplit));
            acceptanceRatio += (probMerge - probSplit);
        }
        else{
            //prior ratio
            acceptanceRatio -= (Math.log(alpha) + Util.logFactorial(c_sm_i.size() -1) + Util.logFactorial(c_sm_j.size() -1) - Util.logFactorial(c_sm.size() -1));
            logger.debug("prior ratio: {}", Math.exp(acceptanceRatio));
            //likelihood ratio
            double likelihoodS = 0;
            likelihoodS += mworld.componentLikelihood(c_i);
            likelihoodS += mworld.componentLikelihood(c_j);
            double likelihoodM = mworld.componentLikelihood(c_sm);
            
            acceptanceRatio += (likelihoodM - likelihoodS); 
            logger.debug("state ratio: {}", Math.exp(acceptanceRatio));
            logger.debug("proposal ratio ratio: {}", Math.exp(probSplit - probMerge));
            
            acceptanceRatio += (probSplit - probMerge);
        }
        logger.debug("acceptance ratio: {}", Math.exp(acceptanceRatio));

        return acceptanceRatio;
    }
    
    /**
     * Sequentially-Allocated Merge-Split (SAMS) sampler described in Dahl 2003 report
     * @param rng 
     */
    public void sampleSAMS(Random rng) {
        MixtureDistributions.MixtureData md1 = mworld.getRandomMixtureData(rng);
        MixtureDistributions.MixtureData md2 = mworld.getRandomMixtureData(rng);
        while(md1 == md2){
            md2 =  mworld.getRandomMixtureData(rng);
        }
        split =true;
        if (md1.getCid() != md2.getCid()) {
            split = false;
        }
        //ArrayList <MixtureDistributions.MixtureData> c_sm = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_i = Lists.newArrayList(); //for split or merge
        //ArrayList <MixtureDistributions.MixtureData> c_sm_j = Lists.newArrayList(); //for split or merge
        //initilize the split merge components
        
        c_sm.clear();
        c_sm_j.clear();
        c_sm_i.clear();
        probSplit = 0.0;
        probMerge = 0.0;
        
        //prepare the launch state
        ArrayList <MixtureDistributions.MixtureData> c_launch = Lists.newArrayList(); //launch state
        
        c_sm.addAll(mworld.getMixtureDataSet().get(md1.getCid()));
        
        if (!split)
            c_sm.addAll(mworld.getMixtureDataSet().get(md2.getCid()));
        
        double beta = mworld.getBeta();
        
        if (split) {
            c_sm_i.add(md1);
            c_sm_j.add(md2);

            Collections.shuffle(c_sm);
            for (MixtureDistributions.MixtureData md: c_sm) {
                if (md == md1 || md == md2) {
                    continue;
                }

                double prob1 = 1.0; // the probability to split elements in c_sm to c_i or c_j
                double prob2 = 1.0;
                for (int h = 0; h < mworld.getDimension(); h ++){
                    prob1 *= ((double)(mworld.countMatch(h, md, c_sm_i) + beta)/(c_sm_i.size() + beta *2));
                    prob2 *= ((double)(mworld.countMatch(h, md, c_sm_j) + beta)/(c_sm_j.size() + beta *2));
                }
                logger.debug("splitting,  prob1:{}, prob2: {}", prob1, prob2);
                double prob1Norm = prob1/(prob1 + prob2);
                double prob2Norm = prob2/(prob1 + prob2);
                logger.debug("prob1, prob2: {} {}", prob1Norm, prob2Norm);
                if(rng.nextDouble() <= prob1Norm) {
                    c_sm_i.add(md);
                    probSplit += Math.log(prob1Norm);
                }
                else {
                    c_sm_j.add(md);
                    probSplit += Math.log(prob2Norm);
                }
            }
        }
        else { //the merge case
            c_sm_i.add(md1);
            c_sm_j.add(md2);
            Collections.shuffle(c_sm);
            
            for(MixtureDistributions.MixtureData md : c_sm) {
                if (md == md1 || md == md2) {
                    continue;
                }
                double prob1 = 1.0; // the probability to split elements in c_sm to c_i or c_j
                double prob2 = 1.0;
            
                for (int h = 0; h < mworld.getDimension(); h ++){
                    prob1 *= ((double)(mworld.countMatch(h, md, c_sm_i) + beta)/(c_sm_i.size() + beta *2));
                    prob2 *= ((double)(mworld.countMatch(h, md, c_sm_j) + beta)/(c_sm_j.size() + beta *2));
                }
                double prob1Norm = prob1/(prob1 + prob2);
                double prob2Norm = prob2/(prob1 + prob2);
                
                if(md.getCid() == c_i) {
                    c_sm_i.add(md);
                    probSplit += Math.log(prob1Norm);
                }
                else if (md.getCid() == c_j){
                    c_sm_j.add(md);
                    probSplit += Math.log(prob2Norm);
                }
            } 
        }
        double acceptanceRatio = acceptanceRatio();
        
        if(applyProposal(rng, acceptanceRatio)){ //;//, c_sm, c_sm_i, c_sm_j);
            appSplitMerge += 1;
        }
    }
    
}
