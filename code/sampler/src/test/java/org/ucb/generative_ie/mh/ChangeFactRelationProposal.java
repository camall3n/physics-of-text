package org.ucb.generative_ie.mh;

import java.util.Random;
import java.util.Set;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

class ChangeFactRelationProposal extends MHProposal {

    protected Fact origin;
    protected Relation newRelation;
    private double stateRatio;

    public ChangeFactRelationProposal(World world) {
        super(world);
    }
    
    @Override
    public void sample(Random rng) {
        this.origin = world.getFacts().sampleAll(rng);
        
        //List<Fact> factsWithArgPair = world.getFacts().factsWithArgPair(this.origin.getArgPair());
        Set <Fact> factsWithArgPair = world.getFacts().factsWithEntityPair(this.origin.getEntityPair());

        Set<Relation> existingRelations = Sets.newHashSet();
        for (Fact f : factsWithArgPair) {
            existingRelations.add(f.getRel());
        }

        Set<Relation> missingRelations = Sets.difference(world.getRelations().asSet(), existingRelations);

        if (missingRelations.size() > 0) {
            this.newRelation = RandomUtil.choice(missingRelations, rng);
        }
        else {
            setNull();
        }
    }

    @Override
    public double stateRatio() {
        Multiset<Trigger> movedHist = HashMultiset.create();
        for (Sentence s : world.getSentences().sentencesWithOrigin(origin)) {
            movedHist.add(s.getTrig());
        }

        Multiset<Trigger> sourceHist = world.getSentences().triggerHistogram(origin.getRel());
        Multiset<Trigger> destHist = world.getSentences().triggerHistogram(newRelation);

        stateRatio = Math.exp(ModelFunctions.logMoveTriggersRatio(sourceHist, destHist, movedHist, world));

        return stateRatio;
    }

    @Override
    public double proposalRatio() {
        return 1;
    }

    @Override
    public void applyProposal() {
        // Have to do this since we are changing the hash.
        world.getFacts().remove(origin);
        
        Fact newFact = new Fact(newRelation, origin.getEnt1(), origin.getEnt2());
        
        for (Sentence s : world.getSentences().sentencesWithOrigin(origin)) {
            s.setOrigin(newFact);
        }
        
        world.getFacts().add(newFact);
    }
}
