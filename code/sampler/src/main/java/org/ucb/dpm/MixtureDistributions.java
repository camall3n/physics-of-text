package org.ucb.dpm;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The mixture distributions created from given configuration file
 */
public class MixtureDistributions {
    
    private Map <Integer, Mixture> mixtureDists;
    private ArrayListMultimap <Integer, MixtureData> mixtureDataSet;
    private ArrayList <MixtureData> mixtureDataList ;
    private int sizeMixture;
    private int dimension;
    
    private final static Logger logger = LoggerFactory.getLogger(MixtureDistributions.class);
        
    public MixtureDistributions(String mdFile){
        mixtureDists = Maps.newHashMap();
        mixtureDataSet = ArrayListMultimap.create();
        mixtureDataList = Lists.newArrayList();
        sizeMixture = 0;
        loadMDFile(mdFile);
    }
    
    public void loadMDFile(String mdFile) {
        FileReader reader;
        
        try {
            reader = new FileReader(mdFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        Gson configGson = new Gson();
        Mixtures mDists = configGson.fromJson(reader, Mixtures.class);
        
        for (Mixture md : mDists.mixtures) {
            mixtureDists.put(md.id, md);
            sizeMixture += 1;
            logger.debug("{}", md.id);
            logger.debug("{}", md.prob);
            logger.debug("{}", md.dist);
            
            if ( sizeMixture == 1 ) 
                dimension = md.dist.length;
        }
    }
    
    public void generateDataSets(int size, Random rng) {
        for (int i =0; i<size; i++) {
            //boolean randomMixture = false;
            //int id = rng.nextInt(sizeMixture) + 1;
            //
            int sizeComponenet = size/sizeMixture;
            int id = (int)Math.ceil((i+1.0)/sizeComponenet);
            //logger.debug("id: {}", id);
            //mixtureDists.get(id);
            //logger.debug("{}", mixtureDists.get(id));
            logger.debug("id: {}, i: {}", id, i);
            
            boolean bestWorld = false;
            if (bestWorld){
                MixtureData mData = new MixtureData(mixtureDists.get(id), id, i, rng);
                mixtureDataSet.put(id, mData);
                mixtureDataList.add(mData);
            }
            else{
                MixtureData mData = new MixtureData(mixtureDists.get(id), 1, i, rng);            
                mixtureDataSet.put(1, mData);
                mixtureDataList.add(mData);
            }
            //
            //logger.debug("{}", mData);

        }
        
        logger.debug("Datasets generated");
        logger.debug("{} vector", mixtureDataSet.size());
        for (int i : mixtureDataSet.keySet()) {
            logger.debug("id : {} : size : {}", i, mixtureDataSet.get(i).size());
        }
    }
    
    public ArrayListMultimap <Integer, MixtureData> getMixtureDataSet() {
        return this.mixtureDataSet;
    }
    
    public ArrayList <MixtureData> getMixtureDataList (){
        return this.mixtureDataList;
    }
    
    public StringBuilder showMixtureData() {
        StringBuilder sMD = new StringBuilder();
        sMD.append("\n");
        for (Map.Entry<Integer, MixtureData> entry : mixtureDataSet.entries()) {
            sMD.append(entry.getKey());
            sMD.append(", id:");
            sMD.append(entry.getValue().id);
            sMD.append(", eid:");
            sMD.append(entry.getValue().eid);
            sMD.append(", data:");
            sMD.append(entry.getValue().benoulli.toString());
            sMD.append("\n");
        }
        return sMD;
    }
    
    public class Mixtures {
        public Mixture [] mixtures;
    }
    
    public class Mixture {
        public int id;
        public double prob;
        public double [] dist;
      
        public Mixture (Mixture m) {
            this.id = m.id ;
            this.prob = m.prob;
            this.dist = m.dist;
        }
        
        @Override
        public String toString() {
            return "m:" + Integer.toString(id) + ":" + dist.toString();
        }
    }
    
    public static class MixtureData implements Comparable<MixtureData>{
        private int id;  // the mixture id
        private int cid; // the assigned component id
        private int eid; // the evidence id
        private ArrayList <Integer> benoulli;

        public MixtureData(Mixture m, int cid, int eid, Random rng) {
            this.id = m.id;
            this.cid = cid;
            this.eid = eid;
            
            this.benoulli = new ArrayList<>();
            
            for (double dProb : m.dist) {
                if (rng.nextDouble() < dProb){
                    this.benoulli.add(1);
                    logger.debug("prob: {}, 1", dProb);
                }
                else{
                    this.benoulli.add(0);
                    logger.debug("prob: {}, 0", dProb);
                }
            }
        }
        
        public MixtureData(MixtureData md) {
            this.id = md.id;
            this.cid = md.cid;
            this.eid = md.eid;
            this.benoulli = Lists.newArrayList(md.benoulli);
        }
        
        public int getId() {
            return this.id;
        }
        
        public int getCid() {
            return this.cid;
        }
        
        public int getEid() {
            return this.eid;
        }
        
        public void setCid(int cid) {
            this.cid = cid;
        }
        
        public int getDataPoint(int position) {
            return benoulli.get(position);
        }
        
        public ArrayList getData() {
            return benoulli;
        }
        
        @Override
        public String toString() {
            return Integer.toString(cid) + "(n" + Integer.toString(eid)+":" +Integer.toString(id)+")";
        }
        
        @Override
        public int compareTo(MixtureData md) {
            return Integer.compare(eid, md.eid); 
        }
    }
    
    public int getSize() {
        return this.sizeMixture;
    }
    
    public int getDimension() {
        return this.dimension;
    }
}