package org.ucb.generative_ie.mh;

import org.ucb.generative_ie.mcmc.SentenceOriginRV;
import org.ucb.generative_ie.mcmc.FactRV;
import org.ucb.generative_ie.mcmc.WeightedLexiconRV;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.util.NormalProbMap;
import org.ucb.generative_ie.util.ProbMap;
import org.ucb.generative_ie.world.ArgPair;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.WeightedLexicon;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps; 
import org.ucb.generative_ie.mh.ChangeFactRelationStep;
import org.ucb.generative_ie.mh.MHStep;
import org.ucb.generative_ie.mh.RadicalStep; 


public class MHSteps implements Iterable<MHStep> {

    @Override
    public Iterator<MHStep> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    private final World world;
//    private final SentenceEvidence evidence;
//
//    private final List<FactRV> factRVs;
//    private final List<SentenceOriginRV> sentenceOriginRVs;
//    private final List<WeightedLexiconRV> weightedLexiconRVs;
//
//    private final List<MHStep> evidenceFactsRVs;
//    private final boolean onlyEvidenceFacts;
//
//    private final Map<StepKind, MHStep> stepMap;
//
//    /**
//     * @param world
//     */
//    public MHSteps(World world, SentenceEvidence evidence) {
//        this(world, evidence, false);
//    }
//
//    /**
//     * @param world
//     */
//    public MHSteps(World world, SentenceEvidence evidence, boolean onlyEvidenceFacts) {
//        this.world = world;
//        this.evidence = evidence;
//        this.onlyEvidenceFacts = onlyEvidenceFacts;
//
//        factRVs = Lists.newArrayList();
//        sentenceOriginRVs = Lists.newArrayList();
//        weightedLexiconRVs = Lists.newArrayList();
//        evidenceFactsRVs = Lists.newArrayList();
//
//        //Every possible relation can exist between each argument pair observed in evidence
//        for (ArgPair pair : evidence.uniqueArgs()) {
//            for (Relation rel : world.getRelations()) {
//                evidenceFactsRVs.add(new FactRV(world, new Fact(rel, pair.arg1, pair.arg2)));
//            }
//        }
//
//        //Every possible relation can exist between every possible argument pair
//        if (onlyEvidenceFacts == false) {
//            for (Noun arg1 : world.getNouns()) {
//                for (Noun arg2 : world.getNouns()) {
//                    for (Relation rel : world.getRelations()) {
//                        factRVs.add(new FactRV(world, new Fact(rel, arg1, arg2)));
//                    }
//                }
//            }
//        }
//
//        //For the initial world, Sentences contains only an empty list of Sentence?
//        for (Sentence s : world.getSentences())
//        {
//            sentenceOriginRVs.add(new SentenceOriginRV(world, s));
//        }
//
//
//        //For the initial world, WeightedLexicons are generated from Dirichlet priors
//        for (Map.Entry<Relation, WeightedLexicon> entry : world.getWeightedLexicons().entrySet())
//        {
//            Relation rel = entry.getKey();
//            WeightedLexicon lex = entry.getValue();
//
//            weightedLexiconRVs.add(new WeightedLexiconRV(world, lex, rel));
//        }
//
//        stepMap = Maps.newHashMap();
//        stepMap.put(StepKind.RADICAL, new RadicalStep(world));
//        stepMap.put(StepKind.CHANGE_FACT_RELATION, new ChangeFactRelationStep(world));
//    }
//
//    @Override
//    public Iterator<MHStep> iterator() {
//        //List<MHStep> sequentialSteps = Lists.newArrayList();
//        //sequentialSteps.addAll(factRVs);
//        //sequentialSteps.addAll(evidenceFactsRVs);
//        //sequentialSteps.addAll(sentenceOriginRVs);
//
//        //int originalSize = sequentialSteps.size();
//        //for (int i = 0; i < originalSize / 5; i++) {
//            //sequentialSteps.add(new ChangeFactRelationStep(world));
//            //sequentialSteps.add(new RadicalStep(world));
//            //sequentialSteps.add(new MoreRadicalStep(world));
//        //}
//
//        //sequentialSteps.addAll(weightedLexiconRVs);
//
//        //Collections.shuffle(sequentialSteps);
//
//        //return sequentialSteps.iterator();
//        return new RandomIterator();
//    }
//
//    class RandomIterator implements Iterator<MHStep> {
//
//        private int currentIteration;
//        private final ProbMap<StepKind> stepSampler;
//        private final Random rng;
//
//        public RandomIterator() {
//            this.currentIteration = 0;
//            this.rng = new Random();
//
//            this.stepSampler = new NormalProbMap<>();
//
//            if (onlyEvidenceFacts == false) {
//                this.stepSampler.multiplyKey(StepKind.ALL_FACT, 0.1);
//            }
//
//            this.stepSampler.multiplyKey(StepKind.EVIDENCE_FACT, 0.1);
//            this.stepSampler.multiplyKey(StepKind.SENTENCE_ORIGIN, 0.1);
//            this.stepSampler.multiplyKey(StepKind.CHANGE_FACT_RELATION, 1);
//            this.stepSampler.multiplyKey(StepKind.RADICAL, 1);
//        }
//
//        @Override
//        public boolean hasNext() {
//            return currentIteration < 100;
//        }
//
//        @Override
//        public MHStep next() {
//            StepKind kind = stepSampler.sample(rng);
//
//            MHStep nextStep = null;
//
//            switch (kind) {
//                case ALL_FACT:
//                    if (factRVs.size() == 0) {
//                        throw new RuntimeException("WEIRD FACTSRV size");
//                    }
//                    nextStep = RandomUtil.choice(factRVs, rng);
//                    break;
//                case EVIDENCE_FACT:
//                    nextStep = RandomUtil.choice(evidenceFactsRVs, rng);
//                    break;
//                case SENTENCE_ORIGIN:
//                    nextStep = RandomUtil.choice(sentenceOriginRVs, rng);
//                    break;
//                case WEIGHTED_LEXICON:
//                    nextStep = RandomUtil.choice(weightedLexiconRVs, rng);
//                    break;
//                default:
//                    if (stepMap.containsKey(kind)) {
//                        nextStep = stepMap.get(kind);
//                    }
//                    else {
//                        throw new RuntimeException("Unhandled StepKind case" + kind);
//                    }
//            }
//
//            currentIteration++;
//            return nextStep;
//        }
//
//        @Override
//        public void remove() {
//            throw new RuntimeException("Unsupported operation");
//        }
//
//    }
}
enum StepKind {
    ALL_FACT, EVIDENCE_FACT, SENTENCE_ORIGIN, WEIGHTED_LEXICON, CHANGE_FACT_RELATION, RADICAL, BETA, MORE_RADICAL
}
