package org.ucb.generative_ie.mcmc;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.WeightedLexicon;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;


/**
 * WorldInferSteps class extends MCMCSteps, providing a specific setting of sampling random
 * variables for the whole IE model.
 */
public class WorldInferSteps extends MCMCSteps{
    private final Map<StepKind, MCMCStep> stepMap;
    private final List<FactRV> factRVs;
    private final List<SentenceOriginRV> sentenceOriginRVs;
    private final List<WeightedNounLexiconRV> weightedNounLexiconRVs;
    private final List<WeightedLexiconRV> weightedLexiconRVs;
    
    public WorldInferSteps(World world, SentenceEvidence evidence, int numSteps){
        //this.world = world;
        //this.evidence = evidence;
        super(world, evidence, numSteps);
        
        this.stepMap = Maps.newHashMap();
        factRVs = Lists.newArrayList();
        sentenceOriginRVs = Lists.newArrayList();
        weightedNounLexiconRVs = Lists.newArrayList();
        weightedLexiconRVs = Lists.newArrayList();
        
        for (Entity arg1 : world.getEntities()) {
                for (Entity arg2 : world.getEntities()) {
                    for (Relation rel : world.getRelations()) {
                        //if (RandomUtil.binarySample(world.getSparsity(), world.rng)){
                            factRVs.add(new FactRV(world, new Fact(rel, arg1, arg2)));
                        //}
                    }
                }
        }
        
        for (Sentence s : world.getSentences())
        {
            sentenceOriginRVs.add(new SentenceOriginRV(world, s));
        }
        
        for (Map.Entry<Entity, WeightedNounLexicon> entry : world.getWeightedNounLexicons().entrySet())
        {
            Entity ent = entry.getKey();
            WeightedNounLexicon nlex = entry.getValue();

            weightedNounLexiconRVs.add(new WeightedNounLexiconRV(world, ent, nlex));
        }
        
        for (Map.Entry<Relation, WeightedLexicon> entry : world.getWeightedLexicons().entrySet())
        {
            Relation rel = entry.getKey();
            WeightedLexicon lex = entry.getValue();

            weightedLexiconRVs.add(new WeightedLexiconRV(world, rel, lex));
        }
    }

    public WorldInferSteps(World world, SentenceEvidence evidence) {
         this(world, evidence, 100); //default number of steps
    }
    
    @Override
    public Iterator<MCMCStep> iterator() {
        return new RandomIterator();
    }
    
    class RandomIterator implements Iterator <MCMCStep> {
        private int currentIteration;
        private final Random rng;
        private final ProbMap<StepKind> stepSampler;

        public RandomIterator() {
            this.currentIteration = 0;
            this.rng = new Random();
            this.stepSampler = new NormalProbMap<>();
            
            this.stepSampler.multiplyKey(StepKind.ALL_FACT, 1);
            this.stepSampler.multiplyKey(StepKind.SENTENCE_ORIGIN, 1);
            this.stepSampler.multiplyKey(StepKind.MENTION, 0);
            //this.stepSampler.multiplyKey(StepKind.WEIGHTED_LEXICON, 0);
        }
                
        @Override
        public boolean hasNext() {
            return currentIteration < numSteps;
        }

        @Override
        public MCMCStep next() {
            StepKind kind = stepSampler.sample(rng);

            MCMCStep nextStep = null;
            
            switch (kind) {                
                case ALL_FACT:
                    if (factRVs.size() == 0) {
                        throw new RuntimeException("WEIRD FACTSRV size");
                    }
                    nextStep = RandomUtil.choice(factRVs, rng);
                    break;
                case SENTENCE_ORIGIN:
                    nextStep = RandomUtil.choice(sentenceOriginRVs, rng);
                    break;
                case MENTION:
                    //nextStep = RandomUtil.choice(weightedNounLexiconRVs, rng);
                    break;
                case WEIGHTED_LEXICON:
                    //nextStep = RandomUtil.choice(weightedLexiconRVs, rng);
                    break;
                default:
                    if (stepMap.containsKey(kind)) {
                        nextStep = stepMap.get(kind);
                    }
                    else {
                        throw new RuntimeException("Unhandled StepKind case" + kind);
                    }
            }

            currentIteration++;
            return nextStep;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}

enum StepKind {
    ALL_FACT, SENTENCE_ORIGIN, MENTION, WEIGHTED_LEXICON
}
