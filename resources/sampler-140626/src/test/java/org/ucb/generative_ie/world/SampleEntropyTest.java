import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.SparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.inference.ObserveProb;
import org.ucb.generative_ie.inference.PrecisionRecallCurve;
import org.ucb.generative_ie.inference.QueryResult;
import org.ucb.generative_ie.inference.SentenceSameRelationQuery;
import org.ucb.generative_ie.inference.SentenceSameRelations;
import org.ucb.generative_ie.util.Util;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class SampleEntropyTest {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@Test
//	public void test() {
//        int numSamples = 5000;
//
//        Random rng = new Random();
//
//        SparsityGenerator sparsityGen = new ConstantSparsityGenerator(0.3);
//        double alpha = 0.5;
//        int numSentences = 60;
//
//        Nouns nouns = Nouns.defaultNouns(10);
//        Relations rels = Relations.defaultRelations(2);
//        Lexicon lexicon = Lexicon.defaultLexicon(5);
//
//        WorldGenerator generator = new WorldGenerator(rng, nouns, rels, lexicon, sparsityGen, alpha, numSentences);
//
//        SampleEntropy sampler = new SampleEntropy(generator, numSamples);
//
//        Map<Double, List<SingleRun>> allResults = Maps.newHashMap();
//
//        for (double entropy : Lists.newArrayList(0.1, 0.3, 0.5, 0.7, 0.9)) {
//            double minRange = entropy;
//            double maxRange = entropy + 0.05;
//
//            List<SingleRun> multipleRuns = Lists.newArrayList();
//
//            for (World godWorld : Iterables.limit(sampler.getEntropySubset(minRange, maxRange), 8)) {
//                assertTrue(LexEntropy.entropy(godWorld) >= minRange && LexEntropy.entropy(godWorld) < maxRange);
//
//                SentenceSameRelations sameRelations = new SentenceSameRelations(godWorld);
//                System.out.println(sameRelations.allPairs().size());
//                System.out.println(sameRelations.truePairs().size());
//
//                int numIterations = 5000;
//
//                SentenceEvidence evidence = new SentenceEvidence(godWorld);
//
//                World initialWorld = generator.sampleWorld();
//                evidence.makeWorldPossible(initialWorld);
//
//                MCMCInferer mcmcInferer = new MCMCInferer(numIterations, initialWorld, evidence);
//
//                mcmcInferer.addWorldObserver(new ObserveProb());
//
//                Set<SentenceSameRelationQuery> queries = Sets.newHashSet();
//
//                Set<UnorderedSentencePair> queryPairs = Sets.newHashSet();
//                for (Sentence s1 : initialWorld.getSentences()) {
//                    for (Sentence s2 : initialWorld.getSentences()) {
//                        queryPairs.add(new UnorderedSentencePair(s1, s2));
//                    }
//                }
//
//                for (UnorderedSentencePair pair : queryPairs) {
//                    SentenceSameRelationQuery q = new SentenceSameRelationQuery(pair);
//                    mcmcInferer.addQuery(q);
//                    queries.add(q);
//                }
//
//                QueryResult mcmcResults = mcmcInferer.run(numIterations / 4);
//
//                PrecisionRecallCurve prcurve = new PrecisionRecallCurve(sameRelations.truePairs().size());
//
//                for (SentenceSameRelationQuery q : queries) {
//                    prcurve.add(sameRelations.contains(q.getPair()), mcmcResults.get(q).percentTrue());
//                }
//
//                SingleRun single = new SingleRun();
//                single.precisions = prcurve.precision();
//                single.recalls = prcurve.recall();
//
//                multipleRuns.add(single);
//            }
//
//            allResults.put(entropy, multipleRuns);
//        }
//
//        Util.writeJsonToFile("prec_recall.out", allResults);
//	}
}

class SingleRun {
    public List<Double> precisions;
    public List<Double> recalls;
}
