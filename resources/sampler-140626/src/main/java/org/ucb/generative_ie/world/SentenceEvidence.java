package org.ucb.generative_ie.world;

import com.google.common.collect.Maps;

import java.util.Map;

import java.util.List;
import java.util.Random;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;

/**
 * SentenceEvidence contains a list of triples read from file (SentenceConstraint)
 */
public class SentenceEvidence implements Evidence {
    
    public static int numSentencesEvidence;
    private final List<SentenceConstraint> constraints;
    private final List<Noun> nounList; 

    public SentenceEvidence() {
        this.constraints = Lists.newArrayList();
        this.nounList = Lists.newArrayList();
    }

    public SentenceEvidence(World world) {
        this();

        addConstraints(world);
    }

    public void addConstraints(World godWorld) {
        for (Sentence s : godWorld.getSentences()) {
            addConstraint(s.getArg1(), s.getArg2(), s.getTrig());
        }
    }


    public void addConstraint(Noun arg1, Noun arg2, Trigger trigger)
    {
        constraints.add(new SentenceConstraint(arg1, arg2, trigger));
    }

    public void addNoun(Noun arg) {
        nounList.add(arg);
    }
    
    @Override
    public boolean acceptWorld(World world) {
        List<SentenceConstraint> worldConstraints = Lists.newArrayList();
        for (Sentence s : world.getSentences())
        {
            if (s == null)
            {
                return false;
            }

            worldConstraints.add(new SentenceConstraint(s.getArg1(), s.getArg2(), s.getTrig()));
        }

        return constraints.equals(worldConstraints);
    }

    /**
     * The function makes sure that the sentences observed from evidence are in the world
     * @param world 
     */
    public void evidenceToWorld(World world) {
        world.getSentences().clear();
        Random rng = new Random();
        for (SentenceConstraint constraint : constraints) {
            Fact origin = world.facts.sampleAll(rng);
            //the Fact origin is the newFact generated above by linking argument pairs to a random Relation
            Sentence newSentence = new Sentence(origin, constraint.trigger, constraint.arg1, constraint.arg2);
            world.getSentences().add(newSentence);
        }
    }

    /**
     * Initialise a world from the evidence so that sentences with the same noun start
     * with the same entity: each distinct noun string gets its own entity (nouns are
     * spread over the entities at random if there are fewer entities than nouns), each
     * sentence gets a uniformly random relation, and the fact (relation, entity of
     * arg1, entity of arg2) is created as its origin. Existing facts and sentences are
     * discarded. Unlike {@link #evidenceToWorld}, this ignores whatever facts the world
     * had, so it does not need the initial world to have sampled its N^2 K facts.
     */
    public void evidenceToWorldByNoun(World world, Random rng) {
        world.getSentences().clear();
        world.facts.clear();

        List<Entity> entities = world.getEntities().asList();
        List<Relation> relations = world.getRelations().asList();
        Map<Noun, Entity> entityOf = Maps.newHashMap();
        int next = 0;
        for (SentenceConstraint c : constraints) {
            for (Noun noun : new Noun[] {c.arg1, c.arg2}) {
                if (!entityOf.containsKey(noun)) {
                    Entity e = next < entities.size() ? entities.get(next) : entities.get(rng.nextInt(entities.size()));
                    entityOf.put(noun, e);
                    next++;
                }
            }
        }

        for (SentenceConstraint c : constraints) {
            Relation r = relations.get(rng.nextInt(relations.size()));
            Fact origin = new Fact(r, entityOf.get(c.arg1), entityOf.get(c.arg2));
            if (!world.facts.exists(origin)) {
                world.facts.add(origin);
            }
            world.getSentences().add(new Sentence(world.facts.getCanonical(origin), c.trigger, c.arg1, c.arg2));
        }
    }

    public int numSentences() {
        return constraints.size();
    }

    public ImmutableSet<SentenceConstraint> getConstraints() {
        return ImmutableSet.copyOf(constraints);
    }

    public ImmutableSet<ArgPair> uniqueArgs() {
        ImmutableSet.Builder<ArgPair> builder = ImmutableSet.<ArgPair>builder();

        for (SentenceConstraint c : getConstraints()) {
            builder.add(new ArgPair(c.arg1, c.arg2));
        }

        return builder.build();
    }
    
    public int numNounList() {
        return nounList.size();
    }
    
    public List<Noun> getNounList () {
        return Lists.newArrayList(nounList);
    }
}