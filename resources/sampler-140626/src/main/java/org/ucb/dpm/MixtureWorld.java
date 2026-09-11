package org.ucb.dpm;

import cern.jet.stat.tdouble.Gamma;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.Util;

/**
 * This MixtureWorld contains the assignment of vectors to components and provides different ways of sampling
 */
public class MixtureWorld {
    private ArrayListMultimap <Integer, MixtureDistributions.MixtureData> mixtureDataSet;
    private ArrayList <MixtureDistributions.MixtureData> mixtureDataList;
    private MixtureDistributions mDistribution;
    private double alpha;
    private double beta;
    private int dimension;
    private int dataSize;
    //private Set <Integer> componentIds;
   
    private final static Logger logger = LoggerFactory.getLogger(MixtureWorld.class);

    public MixtureWorld(MixtureDistributions mdist, Random rng, int size, double alpha, double beta){
        this.mDistribution = mdist;
        this.dataSize = size;
        this.dimension = mdist.getDimension();
        this.mDistribution.generateDataSets(dataSize, rng);
        this.mixtureDataSet = this.mDistribution.getMixtureDataSet();
        this.mixtureDataList = this.mDistribution.getMixtureDataList();
        this.alpha = alpha;
        this.beta = beta;
    }
        
    public Set<Integer> comonentSet () {
        return mixtureDataSet.keySet();
    }
    
    /**
     * The number of data in one component
     * @param id
     * @return 
     */
    public int countComponent(int id) {
        if (!mixtureDataSet.containsKey(id))
            throw new UnsupportedOperationException(String.format("id doest exist!"));
        
        return mixtureDataSet.keys().count(id);
    }
    
    /**
     * For one component c_j and one position of the dimension h, count for the number of 
     * data that is in the same component and in the same time has the same value 
     * in the same position
     * Sigma_k {delta(c_k, c_j) * delta(y_kh, y_ih)}
     * 
     * In component j, the number of value y_ih in position h
     * @param j: component j
     * @param h: position h
     * @param y_ih: current value
     * @return 
     */
    public int countMatch(int j, int h, int y_ih){
        int count = 0;
        for (Map.Entry<Integer, MixtureDistributions.MixtureData> entry : mixtureDataSet.entries()) {
            //logger.debug("first part: {}", Util.deltaFunction(entry.getKey(), j));
            //logger.debug("second part: {}", Util.deltaFunction(entry.getValue().getDataPoint(h), y_ih));
            count += Util.deltaFunction(entry.getKey(), j) *  Util.deltaFunction(entry.getValue().getDataPoint(h), y_ih);
        }
        return count;
    }
    /**
     * restricted Count for a given data list rather than the whole world
     * @param j
     * @param h
     * @param y_ih
     * @param mdList
     * @return 
     */
    public int countMatch(int j, int h, int y_ih, ArrayList<MixtureDistributions.MixtureData> mdList) {
        int count = 0;
        //for (MixtureDistributions.MixtureData md: mdList) {
            //logger.debug("{}: {}", md.getCid(), md.getData().toString());
        //}
        for (MixtureDistributions.MixtureData md : mdList) {
            count += Util.deltaFunction(md.getCid(), j) * Util.deltaFunction(md.getDataPoint(h), y_ih);
        }
        //logger.debug("count: {}", count);
        return count;
    }

    public int countMatchGibbs(int i, int j, int h, MixtureDistributions.MixtureData md) {
        int count = 0;
        
        count += countMatch(j, h, md.getDataPoint(h));
        
        if ( j == i) {
            count -= 1;
        }
        
        return count;
    }
    
    public int countMatchGibbs(int i, int j, int h, MixtureDistributions.MixtureData md, ArrayList<MixtureDistributions.MixtureData> mdList ) {
        int count = 0;
        count += countMatch(j, h, md.getDataPoint(h), mdList);
        if (j == i) {
            count -= 1;
        }
        return count;
    }
    
    /**
     * for position h in given mixture data, count the number of common value in mdList
     * @param h
     * @param mdata
     * @param mdList
     * @return 
     */
    public int countMatch(int h, MixtureDistributions.MixtureData mdata, ArrayList<MixtureDistributions.MixtureData> mdList) {
        int count = 0;
        for (MixtureDistributions.MixtureData md : mdList) {
            count += Util.deltaFunction(md.getDataPoint(h), mdata.getDataPoint(h));
        }
        return count;
    }
    
    /**
     * for the position h, count the number of value y_h in mdList
     * @param h
     * @param y_h
     * @param mdList
     * @return 
     */
    public int countMatch(int h, int y_h, ArrayList<MixtureDistributions.MixtureData> mdList) {
        int count = 0;
        for  (MixtureDistributions.MixtureData md : mdList) {
            count += Util.deltaFunction(md.getDataPoint(h), y_h);
        }
        return count;
    }
    
    public double worldPrior() {
        double prior = 0.0;
        prior += (this.mDistribution.getSize() * Math.log(alpha));
        logger.debug("prior: {}", Math.exp(prior));
        for (int id : mixtureDataSet.keySet()) {
            //logger.debug("{} {}", id, countComponent(id));
            prior += Util.logFactorial(countComponent(id) -1);
        }
        logger.debug("prior: {}", Math.exp(prior));
        for (int k =1; k<= mixtureDataSet.size(); k++) {
            //logger.debug("{}", k);
            prior -= Math.log(alpha + k -1);
        }
        logger.debug("prior: {}", Math.exp(prior));
        return prior;
    }
    
    public double worldLikelihood() {
        double likelihood = 0.0;
        //loop on each component
        //logger.debug("likelihood:");
        for (int id : mixtureDataSet.keySet()) {
            //loop on each element in data vector
            //logger.debug("id: {}", id);
            likelihood += componentLikelihood(id);
        }
        logger.debug("likelihood: {}", Math.exp(likelihood));
        return likelihood;
    }
    
    /**
     * The likelihood for each component
     * @param cid
     * @return 
     */
    public double componentLikelihood(int cid) {
        double cLikelihood = 0.0;
        for (int h = 0; h< dimension; h++) {
                //logger.debug("counts for position {} :{} {}", h, countMatch(cid, h, 0), countMatch(cid, h, 1));
                
                cLikelihood += Gamma.logGamma(countMatch(cid, h, 0) + beta);
                cLikelihood -= Gamma.logGamma(beta);
                cLikelihood += Gamma.logGamma(countMatch(cid, h, 1) + beta);
                cLikelihood -= Gamma.logGamma(beta);

                cLikelihood -= Gamma.logGamma(countComponent(cid) + beta * 2);
                cLikelihood += Gamma.logGamma(beta * 2);
                
                //logger.debug("{}", Math.exp(cLikelihood));
            }
        return cLikelihood;
    }
    
    /**
     * The likelihood for a given set of mixture data 
     * @param cid
     * @param mdList: the only elements in mdList with cid are considered 
     * @return 
     */
    public double componentLikelihood(int cid, ArrayList<MixtureDistributions.MixtureData> mdList) {
        double cLikelihood = 0.0;
        for (int h = 0; h< dimension; h++) {
                cLikelihood += Gamma.logGamma(countMatch(cid, h, 0, mdList) + beta);
                cLikelihood -= Gamma.logGamma(beta);
                cLikelihood += Gamma.logGamma(countMatch(cid, h, 1, mdList) + beta);
                cLikelihood -= Gamma.logGamma(beta);
                
                cLikelihood -= Gamma.logGamma(mdList.size() + beta * 2);
                cLikelihood += Gamma.logGamma(beta * 2);
            }
        return  cLikelihood;
    }
    
    /**
     * The likelihood for a given set of mixture data
     * @param mdList
     * @return 
     */
    public double componentLikelihood(ArrayList<MixtureDistributions.MixtureData> mdList) {
        double cLikelihood = 0.0;
        for (int h = 0; h< dimension; h++) {
                cLikelihood += Gamma.logGamma(countMatch(h, 0, mdList) + beta);
                cLikelihood -= Gamma.logGamma(beta);
                cLikelihood += Gamma.logGamma(countMatch(h, 1, mdList) + beta);
                cLikelihood -= Gamma.logGamma(beta);
                
                cLikelihood -= Gamma.logGamma(mdList.size() + beta * 2);
                cLikelihood += Gamma.logGamma(beta * 2);
            }
        return  cLikelihood;
    }
    
    public double worldProb(){
        return this.worldPrior() + this.worldLikelihood();
    }
    
    public ArrayListMultimap <Integer, MixtureDistributions.MixtureData> getMixtureDataSet() {
        return this.mixtureDataSet;
    }
    
    public ArrayList <MixtureDistributions.MixtureData> getMixtureDataList() {
        return this.mixtureDataList;
    }
    
    public MixtureDistributions.MixtureData getRandomMixtureData(Random rng) {
        int i = rng.nextInt(dataSize);
        return this.mixtureDataList.get(i);
    }
    
    public int getRandomMixtureComponent(Random rng) {
        ArrayList <Integer> cids = Lists.newArrayList(mixtureDataSet.keySet());
        int item = rng.nextInt(cids.size());
        return cids.get(item);
        //int i = 0;
        //for (int cid : mixtureDataSet.keySet()){
        //    if (item == i){
        //        item = cid;
        //        break;
        //    }
        //    i+= 1;
        //}
        //return item;
    }
    
    public void updataMixtureData(MixtureDistributions.MixtureData mdata, int cid) {
        mixtureDataList.remove(mdata);
        mixtureDataSet.get(mdata.getCid()).remove(mdata);
        mdata.setCid(cid);
        mixtureDataList.add(mdata);
        mixtureDataSet.put(cid, mdata);
    }
            
    public StringBuilder showMixtureWorld() {
        return this.mDistribution.showMixtureData();
    }
    
    public double getAlpha() {
        return alpha;
    }
    
    public double getBeta() {
        return beta;
    }
    
    public int getDataSize() {
        return dataSize;
    }
    
    public int getDimension() {
        return dimension;
    }
    
    public int newComponent() {
        for (int i=1; ; i++) {
            if (!mixtureDataSet.keySet().contains(i))
                return i;
        }
    }
    
    public ArrayList <Double> distributionComponents() {
        ArrayList <Integer> componentSizeList = Lists.newArrayList();
        ArrayList <Double> disList = Lists.newArrayList();
        for (int cid : mixtureDataSet.keySet()) {
            componentSizeList.add(countComponent(cid));
        }
        int listSize = componentSizeList.size();
        //logger.debug("list Size: {}", listSize);
        double p = 0;
        for (int i = 0; i<listSize; i++) {
            int max = Collections.max(componentSizeList);
            p += (double)max/dataSize;
            disList.add(p);
            componentSizeList.remove(Collections.max(componentSizeList));
        }
        return disList;
    }
}
