package org.ucb.generative_ie.world;

import java.util.Random;
/**
 * The World describes what the world is and how facts in the worlds can be expressed.
 */
public class World {
    
    public Facts facts;
    private Entities entities;
    private Relations relations;
    private int nEntities;
    private int nRelations;

    //How to say
    private final Sentences sentences;
    private final WeightedNounLexicons weightedNounLexicons;
    private final WeightedLexicons weightedLexicons;
    
    private final double alpha;  // Dirichlet prior of Entities       
    private final double beta;  //Dirichlet prior for Relations
    private double sparsity;  // Sparsity of Fact between Entity pairs

    public Random rng;
    
    public World(Facts facts, Entities entities, Relations relations,
            Sentences sentences, WeightedNounLexicons weightedNounLexicons, WeightedLexicons weightedLexicons, 
            double alpha, double beta, double sparsity) {
        super();

        this.facts = facts;
        this.entities = entities;
        this.relations = relations;

        this.nEntities = entities.sizeCurrent();
        this.nRelations = relations.size();

        this.sentences = sentences;
        this.weightedNounLexicons = weightedNounLexicons;
        this.weightedLexicons = weightedLexicons;

        this.alpha = alpha;
        this.beta = beta;
        this.sparsity = sparsity;
        
        this.rng = new Random();
    }

    public World(World w) {
        this.facts = new Facts(w.facts);
        this.entities = w.entities;
        this.sentences = new Sentences(w.entities, w.relations);
        
        this.nEntities = w.nEntities;
        this.nRelations = w.nRelations;

        for (Sentence s : w.sentences) {
            Fact copiedFact = this.facts.getCanonical(s.getOrigin());
            this.sentences.add(new Sentence(copiedFact, s.getTrig(), s.getArg1(), s.getArg2()));
        }

        this.weightedNounLexicons = w.weightedNounLexicons;
        this.weightedLexicons = w.weightedLexicons;
        this.relations = w.relations;
        
        this.alpha = w.alpha;
        this.beta = w.beta;
        this.sparsity = w.sparsity;

        this.rng = new Random();
        
    }
    
    /**
     * @param sparsity the sparsity to set
     */
    public void setSparsity(double sparsity) {
        this.sparsity = sparsity;
    }
    
    /**
     * @return the facts
     */
    public Facts getFacts() {
        return facts;
    }

    /**
     * @return the entities
     */
    public Entities getEntities() {
        return entities;
    }

    /**
     * @return the relations
     */
    public Relations getRelations() {
        return relations;
    }

    /**
     * @return the entities
     */
    public int getNumEntities() {
        //return nEntities;
        return entities.sizeCurrent();
    }

    /**
     * @return the relations
     */
    public int getNumRelations() {
        //return nRelations;
        return relations.size();
    }

    /**
     * @return the sentences
     */
    public Sentences getSentences() {
        return sentences;
    }
  
    /**
     * @return the weightedNounLexicons
     */
    public WeightedNounLexicons getWeightedNounLexicons() {
        return weightedNounLexicons;
    }

    /**
     * @return the weightedLexicons
     */
    public WeightedLexicons getWeightedLexicons() {
        return weightedLexicons;
    }

    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }
    
    /**
     * 
     * @return the beta
     */
    public double getBeta() {
        return beta;
    }
    
    /**
     * @return the sparsity
     */
    public double getSparsity() {
        return sparsity;
    }
    
    public void show(){
        StringBuilder output = new StringBuilder();
        output.append("The current world:\n");
        output.append("All facts:\n");
        for (Fact f : facts) {
            output.append(String.format("%s\n", f.toString()));
        }
        output.append("\n");
        output.append("Sentences:\n");
        for (Sentence s : sentences) {
            output.append(String.format("%s\n",s.toString()));
        }
        output.append("\n");
        
        System.out.println(output);
    }
}