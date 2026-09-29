package org.ucb.generative_ie.mh;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.random.RandomUtil;
import org.ucb.generative_ie.world.ArgPair;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import org.ucb.generative_ie.mh.MHProposal;


class RadicalProposal extends MHProposal {
    
    private Relation r1, r2;
    
    private Set<ArgPair> newR1Pairs;
    private Set<ArgPair> newR2Pairs;
    
    private Set<ArgPair> oldR1Pairs;
    private Set<ArgPair> oldR2Pairs;
    private final double thetaParam;
    
    /**
     * @param r1
     * @param r2
     * @param newR1Pairs
     * @param newR2Pairs
     * @param oldR1Pairs
     * @param oldR2Pairs
     */
    public RadicalProposal(World world) {
        super(world);
        this.thetaParam = 0.1;
    }
    
    public boolean intersecting(Relation r1, Relation r2) {
        Multiset<Trigger> r1Hist = world.getSentences().triggerHistogram(r1);
        Multiset<Trigger> r2Hist = world.getSentences().triggerHistogram(r2);
        
        return Multisets.intersection(r1Hist, r2Hist).size() > 10;
    }
    
    public List<RelationPair> intersectingPairs() {
        // Make more unique
        List<RelationPair> pairs = Lists.newArrayList();
        for (Relation r1 : world.getRelations()) {
            for (Relation r2 : world.getRelations()) {
                if (r1.equals(r2)) {
                    continue;
                }
                
                if (intersecting(r1, r2)) {
                    pairs.add(new RelationPair(r1, r2));
                }
            }
        }
        
        return pairs;
    }
    
    public RelationPair sampleRelationPair(Random rng) {
        List<Relation> selection = RandomUtil.sample(world.getRelations()
                .asList(), 2, rng);
        return new RelationPair(selection.get(0), selection.get(1));
    }
    
    /**
    @Override
    public void sample(Random rng) {
        this.oldR1Pairs = Sets.newHashSet();
        this.oldR2Pairs = Sets.newHashSet();
        this.newR1Pairs = Sets.newHashSet();
        this.newR2Pairs = Sets.newHashSet();
        
        RelationPair relations = sampleRelationPair(rng);
        
        if (relations == null) {
            setNull();
            return;
        }
        
        this.r1 = relations.r1;
        this.r2 = relations.r2;
        
        for (Fact f : world.getFacts().factsWithRelation(r1)) {
            oldR1Pairs.add(f.getArgPair());
        }
        
        for (Fact f : world.getFacts().factsWithRelation(r2)) {
            oldR2Pairs.add(f.getArgPair());
        }
        
        Set<ArgPair> commonPairs = Sets.intersection(oldR1Pairs, oldR2Pairs);
        Set<ArgPair> uncommonPairs = Sets.symmetricDifference(oldR1Pairs,
                oldR2Pairs);
        
        double params[] = { thetaParam, thetaParam };
        double theta = DirichletDistr.dirichlet(params)[0];
        
        for (ArgPair pair : uncommonPairs) {
            if (RandomUtil.binarySample(theta, rng)) {
                newR1Pairs.add(pair);
            } else {
                newR2Pairs.add(pair);
            }
        }
        
        for (ArgPair pair : commonPairs) {
            newR1Pairs.add(pair);
            newR2Pairs.add(pair);
        }
    }
    
    @Override
    public double stateRatio() {
        Set<ArgPair> addR1 = Sets.difference(newR1Pairs, oldR1Pairs);
        Set<ArgPair> addR2 = Sets.difference(newR2Pairs, oldR2Pairs);
        
        Multiset<Trigger> movedToR1 = HashMultiset.create();
        for (ArgPair pair : addR1) {
            for (Sentence s : world.getSentences().sentencesWithOrigin(
                    new Fact(r2, pair))) {
                movedToR1.add(s.getTrig());
            }
        }
        
        Multiset<Trigger> movedToR2 = HashMultiset.create();
        for (ArgPair pair : addR2) {
            for (Sentence s : world.getSentences().sentencesWithOrigin(
                    new Fact(r1, pair))) {
                movedToR2.add(s.getTrig());
            }
        }
        
        Multiset<Trigger> sourceHist = ImmutableMultiset.copyOf(world.getSentences().triggerHistogram(r1));
        Multiset<Trigger> destHist = ImmutableMultiset.copyOf(world.getSentences().triggerHistogram(r2));
        
        double ratio = ModelFunctions.logMoveTriggersRatio(sourceHist, destHist, movedToR2, movedToR1, world);
        
        assert !Double.isNaN(Math.exp(ratio));
        return Math.exp(ratio);
    }
    
    @Override
    public double proposalRatio() {
        double logRatio = 0;
        logRatio += ModelFunctions.logGammaTmp(newR1Pairs.size() + thetaParam,
                oldR1Pairs.size() - newR1Pairs.size());
        logRatio += ModelFunctions.logGammaTmp(newR2Pairs.size() + thetaParam,
                oldR2Pairs.size() - newR2Pairs.size());
        
        assert !Double.isNaN(Math.exp(logRatio));
        return Math.exp(logRatio);
    }
    
    @Override
    public void applyProposal() {
        Set<ArgPair> addR1 = Sets.difference(newR1Pairs, oldR1Pairs);
        Set<ArgPair> removeR1 = Sets.difference(oldR1Pairs, newR1Pairs);
        
        Set<ArgPair> addR2 = Sets.difference(newR2Pairs, oldR2Pairs);
        Set<ArgPair> removeR2 = Sets.difference(oldR2Pairs, newR2Pairs);
        
        assert addR1.equals(removeR2);
        assert addR2.equals(removeR1);
        
        assert Sets.intersection(addR1, addR2).size() == 0;
        
        for (ArgPair pair : addR1) {
            // Remove fact from r2
            world.getFacts().remove(new Fact(r2, pair));
            // Add fact to r1
            Fact newFact = new Fact(r1, pair);
            
            if (world.getFacts().exists(newFact)) {
                throw new RuntimeException("message");
            }
            
            Collection<Sentence> changedSentences = world.getSentences()
                    .sentencesWithOrigin(new Fact(r2, pair));
            
            for (Sentence s : changedSentences) {
                s.setOrigin(newFact);
            }
            
            world.getFacts().add(newFact);
        }
        
        for (ArgPair pair : addR2) {
            // Remove fact from r1
            world.getFacts().remove(new Fact(r1, pair));
            // Add fact to r2
            Fact newFact = new Fact(r2, pair);
            
            if (world.getFacts().exists(newFact)) {
                throw new RuntimeException("message");
            }
            
            for (Sentence s : world.getSentences().sentencesWithOrigin(
                    new Fact(r1, pair))) {
                s.setOrigin(newFact);
            }
            
            world.getFacts().add(newFact);
        }
    }
    **/
    @Override
    public void dontApplyProposal() {
    }

    @Override
    public void sample(Random rng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double stateRatio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double proposalRatio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void applyProposal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class RelationPair {
	public Relation r1, r2;

	/**
	 * @param r1
	 * @param r2
	 */
	public RelationPair(Relation r1, Relation r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
}
