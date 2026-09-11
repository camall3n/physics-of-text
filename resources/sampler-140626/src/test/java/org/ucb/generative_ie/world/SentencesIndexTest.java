package org.ucb.generative_ie.world;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;
import org.ucb.generative_ie.experiments.CorpusParser;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.MCMCInferer;
import org.ucb.generative_ie.mcmc.EntityInferSteps;
import org.ucb.generative_ie.mcmc.WorldInferSteps;

/**
 * The secondary indexes kept by {@link Sentences} (per-relation sentence lists,
 * trigger histograms, noun histograms, mentions) must stay in step with the
 * sentence list through both inference phases of EntityResolution.
 */
public class SentencesIndexTest {

    private static void assertIndexesConsistent(String when, World w) {
        Sentences sents = w.getSentences();
        int n = sents.size();

        int byRelation = 0, trigHist = 0;
        for (Relation r : w.getRelations()) {
            byRelation += sents.sentencesWithRelation(r).size();
            trigHist += sents.triggerHistogram(r).size();
        }
        assertEquals(when + ": sentencesWithRelation totals", n, byRelation);
        assertEquals(when + ": triggerHistogram totals", n, trigHist);

        int nounHist = 0, bySource = 0, byDest = 0, mentionsByEntity = 0;
        for (Entity e : w.getEntities()) {
            nounHist += sents.nounHistogram(e).size();
            bySource += sents.sentencesWithSourceEntity(e).size();
            byDest += sents.sentencesWithDestEntity(e).size();
            mentionsByEntity += sents.getMentionsByEntity(e).size();
        }
        assertEquals(when + ": nounHistogram totals", 2 * n, nounHist);
        assertEquals(when + ": sentencesWithSourceEntity totals", n, bySource);
        assertEquals(when + ": sentencesWithDestEntity totals", n, byDest);
        assertEquals(when + ": mentions", 2 * n, sents.getMentions().size());
        assertEquals(when + ": mentionsByEntity totals", 2 * n, mentionsByEntity);

        for (Sentence s : sents) {
            assertEquals(when + ": source mention entity", s.getOrigin().getEnt1(), s.getSourceMention().getEntity());
            assertEquals(when + ": dest mention entity", s.getOrigin().getEnt2(), s.getDestMention().getEntity());
            assertTrue(when + ": source mention indexed", sents.getMentionsByEntity(s.getOrigin().getEnt1()).contains(s.getSourceMention()));
            assertTrue(when + ": dest mention indexed", sents.getMentionsByEntity(s.getOrigin().getEnt2()).contains(s.getDestMention()));
        }

        int byFact = 0;
        for (Fact f : w.getFacts()) {
            byFact += sents.sentencesWithOrigin(f).size();
        }
        assertEquals(when + ": sentencesWithOrigin totals", n, byFact);
    }

    @Test
    public void nounAwareInitialisationIsConsistent() {
        Random rng = new Random(3);
        CorpusParser parser = new CorpusParser("data/06-19/pluieTriples-2.json");   // 125 sentences
        SentenceEvidence evidence = parser.getEvidence();
        WorldGenerator generator = new WorldGenerator(rng, Entities.defaultEntities(300), Relations.defaultRelations(20),
                parser.getNounLexicon(), parser.getLexicon(), 0.01, 0.1, new ConstantSparsityGenerator(0.001), evidence.numSentences());
        World world = generator.emptyWorld();
        assertEquals(0, world.getFacts().size());
        evidence.evidenceToWorldByNoun(world, rng);

        assertEquals(evidence.numSentences(), world.getSentences().size());
        assertIndexesConsistent("after noun-aware initialisation", world);
        assertTrue(new WorldProb(world).consistencyProblems().isEmpty());
        assertEquals(parser.getNouns().size(), world.getSentences().getNonEmptyEntitySize());   // one entity per noun
        java.util.Map<Noun, Entity> seen = new java.util.HashMap<Noun, Entity>();
        for (Sentence s : world.getSentences()) {
            for (Mention m : new Mention[] {s.getSourceMention(), s.getDestMention()}) {
                Entity prev = seen.put(m.getNoun(), m.getEntity());
                assertTrue("same noun, same entity", prev == null || prev.equals(m.getEntity()));
            }
        }
        new WorldProb(world).logProb();   // finite and consistent

        new MCMCInferer(20, world, evidence, rng, new WorldInferSteps(world, evidence, 20)).run();
        assertIndexesConsistent("after relation steps", world);
    }

    @Test
    public void indexesSurviveBothPhasesOnToyCorpus() {
        Random rng = new Random(7);
        CorpusParser parser = new CorpusParser("data/06-19/toyTriples.json");
        SentenceEvidence evidence = parser.getEvidence();
        int numSentences = evidence.numSentences();

        WorldGenerator generator = new WorldGenerator(rng, Entities.defaultEntities(8), Relations.defaultRelations(2),
                parser.getNounLexicon(), parser.getLexicon(), 0.01, 0.01, new ConstantSparsityGenerator(0.1), numSentences);
        World world = generator.sampleWorld();
        evidence.evidenceToWorld(world);
        assertEquals(numSentences, world.getSentences().size());
        assertIndexesConsistent("after loading evidence", world);

        new MCMCInferer(40, world, evidence, rng, new EntityInferSteps(world, evidence, 20)).run();
        assertIndexesConsistent("after entity phase", world);

        world.syncFacts();
        assertIndexesConsistent("after syncFacts", world);

        new MCMCInferer(40, world, evidence, rng, new WorldInferSteps(world, evidence, 20)).run();
        assertIndexesConsistent("after relation phase", world);
    }
}
