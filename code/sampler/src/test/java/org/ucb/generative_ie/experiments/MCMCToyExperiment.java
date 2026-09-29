package org.ucb.generative_ie.experiments;

import java.util.Random;

import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.Query;
import org.ucb.generative_ie.inference.QueryResult;
import org.ucb.generative_ie.util.BooleanCounter;
import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.Relations;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

public class MCMCToyExperiment extends Experiment {

    @Override
    public Result run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//	@Override
//	public ToyExperimentResult run() {
//        Random rng = new Random();
//
//        int numIterations = 10000;
//        int numTriggers = 2;
//        SparsityGenerator sparsityGen = new ConstantSparsityGenerator(0.3);
//        double alpha = 0.2;
//        int numSentences = 2;
//
//        Nouns nouns = Nouns.nounsWithNames("A", "B");
//        Relations rels = Relations.authorshipRelations();
//        Lexicon lexicon = Lexicon.defaultLexicon(numTriggers);
//
//        WorldGenerator generator = new WorldGenerator(rng, nouns, rels, lexicon, sparsityGen, alpha, numSentences);
//        SentenceEvidence evidence = new SentenceEvidence();
//
//        evidence.addConstraint(nouns.get("A"), nouns.get("B"), lexicon.get(0));
//        evidence.addConstraint(nouns.get("A"), nouns.get("B"), lexicon.get(1));
//
//        Query sameQuery = new Query() {
//            @Override
//			public boolean isTrue(World world) {
//                Sentence s1 = world.getSentences().get(0);
//                Sentence s2 = world.getSentences().get(1);
//
//                return s1.getOrigin().equals(s2.getOrigin());
//            }
//        };
//
//        World initialWorld = generator.sampleWorld(false);
//        evidence.makeWorldPossible(initialWorld);
//
//        System.out.println(initialWorld.getSentences().size());
//
//        MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence);
//        mcmcInferer.addQuery(sameQuery);
//        QueryResult mcmcResults = mcmcInferer.run(numIterations / 4);
//
//        BooleanCounter sameResults = mcmcResults.get(sameQuery);
//        System.out.println(sameResults);
//
//        return new ToyExperimentResult(sameResults.percentTrue(), sameResults.percentFalse());
//	}

}
