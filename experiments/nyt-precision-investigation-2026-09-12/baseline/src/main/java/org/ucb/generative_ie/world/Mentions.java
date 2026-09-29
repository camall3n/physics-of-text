package org.ucb.generative_ie.world;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.ucb.generative_ie.random.DirichletDistr;

public class Mentions implements Iterable <Mention> {
    
    private final ArrayList<Mention> mentionList;
    private final ArrayListMultimap<Entity, Mention> mentionsToEntity;
    private final ArrayListMultimap<Entity, Noun> nounsToEntity;
    private final Entities entities;
    private final LNouns lNouns;
    //private NounLexicon nounLexicon;
    private Random rng;
    private final Map <Entity, Multiset <Noun>> nounHistograms;
    private final Map <Entity, Double> probEntity;
    
    public Mentions(Entities entities, LNouns lNouns) {
        this.mentionList = Lists.newArrayList();
        this.mentionsToEntity = ArrayListMultimap.create();
        this.nounsToEntity = ArrayListMultimap.create();
        this.entities = entities;
        this.lNouns = lNouns;
        this.rng = new Random();
        this.nounHistograms = Maps.newHashMap();
        this.probEntity = Maps.newHashMap();
        createHistograms();
    }
    
    public Mentions(Mentions m) {
        //this.mentionList = Lists.newArrayList(m.mentionList);
        this.mentionList = new ArrayList(m.mentionList);
        //Collections.copy(this.mentionsToEntity, m.mentionsToEntity);
        //this.mentionsToEntity = (ArrayListMultimap <Entity, Mention>) m.mentionsToEntity.clone();
        this.mentionsToEntity = ArrayListMultimap.create(m.mentionsToEntity);
        this.nounsToEntity =  ArrayListMultimap.create(m.nounsToEntity);
        this.entities = new Entities(m.entities);
        this.lNouns = new LNouns(m.lNouns);
        this.rng = new Random();
        this.nounHistograms = new HashMap<>(m.nounHistograms);
        this.probEntity = new HashMap<>(m.probEntity);
    }
    
    public void createHistograms() {
        for (Entity e:entities) {
            Multiset<Noun> hist = HashMultiset.create();
            nounHistograms.put(e, hist);
        }

        //Multiset<Noun> hist = HashMultiset.create();
        //nounHistograms.put(null, hist);
    }
    
    public void randomAssignment(){
        //References newRefs = new Mentions(entities, lNouns);
        for (Noun n: lNouns.getLNouns()){
            Entity e = entities.getRandomEntities().getRandom(rng);
            add(new Mention(e,n));
        }
        //for (Entity e : entities) {
        //    Multiset <Noun> ns = nounHistograms.get(e);
        //    for (Noun n: ns)
        //        System.out.println(n);
        //}
        //return newRefs;
    }
    public Entities getEntities(){
        return this.entities;
    }
    
    public NounLexicon getNounLexicon() {
        NounLexicon nLex = new NounLexicon();
        for (Noun n : lNouns.getLNouns()) {
            nLex.add(n);
        }
        return nLex;
    }
    
    public void add(Mention m) {
        if (m == null) {
            throw new RuntimeException("null value is not allowed");
        }
    
        mentionList.add(m);
        m.setDelegate(this);
        mentionsToEntity.put(m.getEntity(), m);
        nounsToEntity.put(m.getEntity(), m.getNoun());
        //nounLexicon.add(m.getNoun());
        nounHistograms.get(m.getEntity()).add(m.getNoun());
        //System.out.println(nounHistograms.get(m.getEntity()).sizeCurrent());
    }
    
    public void remove(Mention m) {
        if (m == null) {
            throw new RuntimeException("null value is not allowed");
        }
    
        mentionList.remove(m);
        m.setDelegate(this);
        mentionsToEntity.remove(m.getEntity(), m);
        nounsToEntity.remove(m.getEntity(), m.getNoun());
        nounHistograms.get(m.getEntity()).remove(m.getNoun());
    }
    
    public void update(Mention m, Entity oldEntity) {
        mentionsToEntity.remove(oldEntity, m);
        mentionsToEntity.put(m.getEntity(), m);
        
        nounsToEntity.remove(oldEntity, m.getNoun());
        nounsToEntity.put(m.getEntity(), m.getNoun());
        
        nounHistograms.get(oldEntity).remove(m.getNoun());
        nounHistograms.get(m.getEntity()).add(m.getNoun());
    }
    
    public void clear(){
        mentionList.clear();
        mentionsToEntity.clear();
        nounsToEntity.clear();
        nounHistograms.clear();
        createHistograms();
    }
     
    
    public Collection<Mention> mentionsWithEntity(Entity e){
        return ImmutableList.copyOf(mentionsToEntity.get(e));
    }

    public Collection <Noun> nounsWithEntity(Entity e) {
        return ImmutableList.copyOf(nounsToEntity.get(e));
    }
    
    public double[] nounCounts(Entity e, NounLexicon nounLex) {
        return nounCounts(e, nounLex, 0);
    }

    public double[] nounCounts(Entity e, NounLexicon nounLex, double alpha) {
        double[] alphas = new double[nounLex.size()];
        Arrays.fill(alphas, alpha);
        
        for (Mention reference: mentionsWithEntity(e)){
            int i = nounLex.indexOf(reference.getNoun());
            alphas[i] += 1;
        }

        return alphas;
    }
   
    public Multiset<Noun> nounHistogram(Entity e) {
        return nounHistograms.get(e);
    }
    
    public Mention get(int index) {
        return mentionList.get(index);
    }

    public int size() {
        return mentionList.size();
    }

    public List<Mention> asList() {
        return mentionList;
    }
    
    @Override
    public Iterator<Mention> iterator() {
        return mentionList.iterator();
    }
    
    @Override
    public String toString(){
        String stringRefs = new String();
        for (Mention m: mentionList){
            //stringRefs += m.toString()+ " ";
            //stringRefs += m.getEntity().toString()+ " ";
            stringRefs += m.getNoun().toString() + ":" + m.getEntity().toString() +  " " ;
        }
        return "EntityWorld: [" + stringRefs + "]";
    }
    
      public double logProb(){
        double logProb = 0;
        double alpha = 0.0001;
        //the probability of this count
        logProb += this.logProbCountE();
        
        NounLexicon nLex  = this.getNounLexicon();
        double[] alphas = new double[nLex.size()];
        Arrays.fill(alphas, alpha);
        //double beta0 = DirichletDistr.coef(alphas);
        double logBeta0 = DirichletDistr.logBeta(alphas);
        for (Entity e : this.entities) {
            //the probability of observations given the specific count
            double [] alphasCount = this.nounCounts(e, nLex, alpha);
            double probE;
            probE = DirichletDistr.logBeta(alphasCount)-logBeta0;
            probE = Math.exp(probE);
            probEntity.put(e, probE);
            logProb += DirichletDistr.logBeta(alphas);
        }

        return logProb;
    }
      
      public double logProbCountE() {
          double logProbCountE = 0;
          int tCount = this.size();
          for (Entity e: this.entities){
              int eCount = mentionsWithEntity(e).size();
              double logC = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(tCount, eCount);
              logProbCountE += logC;
              //System.out.println(String.format("%d %d %f", tCount, eCount, logC));
              tCount -= eCount;
          }
          
          return logProbCountE;
      }

      public double probEntity(Entity e) {
          return (probEntity.get(e));
      }
}
