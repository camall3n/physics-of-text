package org.ucb.generative_ie.mcmc;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.ucb.generative_ie.mh.EntityRGMSStep;
import org.ucb.generative_ie.mh.EntityRandomMixStep;
import org.ucb.generative_ie.mh.EntitySmartMergeStep;
import org.ucb.generative_ie.mh.EntitySmartSplitStep;
import org.ucb.generative_ie.mh.EntitySplitMergeHeuristicStep;
import org.ucb.generative_ie.mh.EntitySplitMergeHeuristicV2Step;
import org.ucb.generative_ie.mh.EntitySplitMergeStep;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

/**
 * EntityInferSteps class extends MCMCSteps, providing a specific setting of sampling random
 * variables for an independent entity resolution task.
 */
public class EntityInferSteps extends MCMCSteps{
    private final Map<EntityStepKind, MCMCStep> stepMap;
    private final List<FactRV> factRVs;
    private final List<SentenceOriginRV> sentenceOriginRVs;
    private final List<WeightedNounLexiconRV> weightedNounLexiconRVs;
    private final List<MentionRV> mentionRVs;
    
    public EntityInferSteps(World world, SentenceEvidence evidence, int numSteps){
        super(world, evidence, numSteps);
        
        this.stepMap = Maps.newHashMap(); 
        factRVs = Lists.newArrayList();
        sentenceOriginRVs = Lists.newArrayList();
        weightedNounLexiconRVs = Lists.newArrayList();
        mentionRVs = Lists.newArrayList();
        
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
        
        for (Mention m : world.getSentences().getMentions()) {
            mentionRVs.add(new MentionRV(world, m));
        }
    }

    public EntityInferSteps(World world, SentenceEvidence evidence) {
         this(world, evidence, 1); //default number of steps
    }
    
    @Override
    public Iterator<MCMCStep> iterator() {
        return new RandomIterator();
    }
    
    class RandomIterator implements Iterator <MCMCStep> {
        private int currentIteration;
        private final Random rng;
        private final ProbMap<EntityStepKind> stepSampler;

        public RandomIterator() {
            this.currentIteration = 0;
            this.rng = new Random();
            this.stepSampler = new NormalProbMap<>();
            this.stepSampler.multiplyKey(EntityStepKind.MENTION, 1);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_SPLIT_MERGE, 0.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_RANDOM_MIX, 0.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_S_M_HEURISTIC, 0.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_S_M_HEURISTIC_V2, 0.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_SMART_SPLIT, 1.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_SMART_MERGE, 1.0);
            this.stepSampler.multiplyKey(EntityStepKind.ENTITY_RGMS, 0);
            this.stepSampler.multiplyKey(EntityStepKind.WEIGHTED_NOUN_LEXICON, 0.0);
        }
        
        @Override
        public boolean hasNext() {
            return currentIteration < numSteps;
        }

        @Override
        public MCMCStep next() {
            EntityStepKind kind = stepSampler.sample(rng);

            MCMCStep nextStep = null;

            switch (kind) {
                case MENTION:
                    nextStep = RandomUtil.choice(mentionRVs, rng);
                    break;
                case ENTITY_SPLIT_MERGE:
                    nextStep = new EntitySplitMergeStep(world);
                    break;
                case ENTITY_RANDOM_MIX:
                    nextStep = new EntityRandomMixStep(world);
                    break;
                case ENTITY_S_M_HEURISTIC:
                    nextStep = new EntitySplitMergeHeuristicStep(world);
                    break;
                case ENTITY_S_M_HEURISTIC_V2:
                    nextStep = new EntitySplitMergeHeuristicV2Step(world);
                    break;
                case ENTITY_SMART_SPLIT:
                    nextStep = new EntitySmartSplitStep(world);
                    break;
                case ENTITY_SMART_MERGE:
                    nextStep = new EntitySmartMergeStep(world);
                    break;
                case ENTITY_RGMS:
                    nextStep = new EntityRGMSStep(world);
                    break;
                case WEIGHTED_NOUN_LEXICON:
                    nextStep = RandomUtil.choice(weightedNounLexiconRVs, rng);
                    break;
                default:
                    if (stepMap.containsKey(kind)) {
                        nextStep = stepMap.get(kind);
                    }
                    else {
                        throw new RuntimeException("Unhandled StepKind case" + kind);
                    }
            }
            //System.err.println(String.format("Step Kind: %s", nextStep.getStepKind()));
            currentIteration++;
            return nextStep;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

enum EntityStepKind {
    ALL_FACT, SENTENCE_ORIGIN, MENTION, WEIGHTED_NOUN_LEXICON, ENTITY_RANDOM_MIX, ENTITY_SPLIT_MERGE, ENTITY_S_M_HEURISTIC, ENTITY_S_M_HEURISTIC_V2, ENTITY_SMART_SPLIT, ENTITY_SMART_MERGE, ENTITY_RGMS;
}