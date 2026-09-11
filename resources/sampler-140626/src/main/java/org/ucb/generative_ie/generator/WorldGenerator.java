package org.ucb.generative_ie.generator;

import java.util.Arrays;
import java.util.Random;

import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.Entities;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Facts;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Mentions;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Sentences;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.WeightedLexicon;
import org.ucb.generative_ie.world.WeightedLexicons;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

public class WorldGenerator {
    
    private final Random rng;
    private final Entities entities;
    private final Relations relations;
    private final NounLexicon nounLexicon;
    private final Lexicon lexicon;
    private final SparsityGenerator sparsityGenerator;
    private final double alpha;
    private final double beta;
    private final int numSentences;

    public WorldGenerator(Random rng,  Entities entities, Relations relations,
            NounLexicon nounLexicon, Lexicon lexicon, 
            double alpha, double beta, 
            SparsityGenerator sparsityGenerator,  int numSentences) {
        super();
        this.rng = rng;
        this.entities = entities;
        this.relations = relations;
        this.nounLexicon = nounLexicon;
        this.lexicon = lexicon;
        this.sparsityGenerator = sparsityGenerator;
        this.alpha = alpha;
        this.beta = beta;
        this.numSentences = numSentences;
    }

    public World sampleWorld() {
        return sampleWorld(true);
    }

    public World sampleWorld(boolean fullWorld) {
        double sparsity = sparsityGenerator.sampleSparsity(rng);
        WeightedLexicons weightedLexicons = sampleWeightedLexicons();
        WeightedNounLexicons weightedNounLexicons = sampleWeightedNounLexicons();
        
        Sentences sentences;
        Facts facts;
        if (fullWorld)
        {
            facts = sampleFacts(sparsity);
            sentences = sampleSentences(facts, weightedNounLexicons, weightedLexicons);
        }
        else
        {
            //facts = new Facts();
            facts = sampleFacts(sparsity);
            sentences = new Sentences(entities, relations);
        }

        return new World(facts, entities, relations, sentences, weightedNounLexicons, weightedLexicons, alpha, beta, sparsity);
    }

    /**
     * Sample facts by a given sparsity.
     * All possible triples of <noun, relation, noun> will be browsed and the sparsity decide the probability of each possibility
     * @param sparsity
     * @return Facts
     */
    private Facts sampleFacts(double sparsity) {
        Facts facts = new Facts();

        for (Entity arg1 : entities)
        {
            for (Entity arg2 : entities)
            {
                for (Relation rel : relations)
                {
                    if (RandomUtil.binarySample(sparsity, rng))
                    {
                        Fact n = new Fact(rel, arg1, arg2);
                        facts.add(n);
                    }
                }
            }
        }

        return facts;
    }
    
    /**
     * This function initialize the dictionary of NounLexicon using Dirichlet
     * priors and establishes the HashMap between Entity and each dictionary
     * @return WeightedNounLexicons
     */
    private WeightedNounLexicons sampleWeightedNounLexicons() {
        WeightedNounLexicons weightedNounLexicons = new WeightedNounLexicons(nounLexicon);
        double alphas[] = new double[nounLexicon.size()];
        Arrays.fill(alphas, alpha);
        
        for (Entity ent : entities) {
            double newProbas [] = DirichletDistr.dirichlet(alphas);            
            WeightedNounLexicon wnLex = new WeightedNounLexicon(nounLexicon, newProbas);            
            weightedNounLexicons.put(ent, wnLex);
        }
        
        return weightedNounLexicons;
    }
    
    /**
     * This function initializes the dictionary of Lexicon using Dirichlet
     * priors and establishes the HashMap between Relation and each dictionary.
     * @return WeightedLexicons
     */
    private WeightedLexicons sampleWeightedLexicons() {
        WeightedLexicons weightedLexicons = new WeightedLexicons(lexicon);
        double betas[] = new double[lexicon.size()];
        Arrays.fill(betas, beta);
        
        for (Relation rel : relations) {
            double newProbs[] = DirichletDistr.dirichlet(betas);
            WeightedLexicon tmp = new WeightedLexicon(lexicon, newProbs);            
            weightedLexicons.put(rel, tmp);
        }

        return weightedLexicons;
    }

    private Sentences sampleSentences(Facts facts, WeightedNounLexicons weightedNounLexicons, WeightedLexicons weightedLexicons) {
        Sentences sentences = new Sentences(entities, relations);

        // the number of sentence samples is the same as the number of constraints
        for (int i = 0; i < numSentences; i++)
        {
            if (facts.size() > 0)
            {
                // sample a Fact
                Fact origin = facts.sampleAll(rng);

                // for the sampled Fact above, sample a Trigger according to the dictionary corresponding to this Relation
                Trigger trigger = weightedLexicons.get(origin.getRel()).sample(rng);
                // sample the pair of nouns corresponding to this entity pair
                Noun arg1 = weightedNounLexicons.get(origin.getEnt1()).sample(rng);
                Noun arg2 = weightedNounLexicons.get(origin.getEnt2()).sample(rng);
                
                // the arg1 and arg2 are deterministic functions of the origin(sentence) rv
                sentences.add(new Sentence(origin, trigger, arg1, arg2));
            }
            else {
                sentences.add(Sentence.nullSentence());
            }
        }

        return sentences;
    }
    
}