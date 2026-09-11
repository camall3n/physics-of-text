package org.ucb.generative_ie.world;

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