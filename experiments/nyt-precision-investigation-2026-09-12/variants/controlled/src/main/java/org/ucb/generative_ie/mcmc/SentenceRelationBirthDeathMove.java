package org.ucb.generative_ie.mcmc;

import java.util.List;
import java.util.Random;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

/**
 * An additional MH proposal, not a change to the posterior and not a bug fix.
 * Picks a sentence uniformly and a relation uniformly from the fixed pool. Moves
 * only that sentence; creates its target fact when absent and removes its former
 * fact iff the sentence was its last reference. Existing unreferenced targets are
 * rejected, which keeps the unreferenced fact set unchanged and makes this exact
 * deterministic transformation its own reverse when the old relation is chosen.
 * Both proposal directions have probability 1/(number of sentences * pool size).
 * This bridges facts shared by several meanings without waiting for a uniform
 * proposal over all N^2 * pool-size possible facts to create the needed target.
 */
public final class SentenceRelationBirthDeathMove implements MCMCStep {
    private final World world;
    private final List<Relation> relations;
    private long proposed, accepted, blockedUnreferenced;

    public SentenceRelationBirthDeathMove(World world) {
        this.world=world;
        this.relations=world.getRelations().asList();
    }
    @Override public String getStepKind() { return "SentenceRelationBirthDeathMove"; }

    public boolean canMove(Sentence s, Relation target) {
        if(target.equals(s.getOrigin().getRel())) return false;
        Fact candidate=new Fact(target,s.getOrigin().getEnt1(),s.getOrigin().getEnt2());
        return !world.getFacts().exists(candidate) || !world.getSentences().sentencesWithOrigin(candidate).isEmpty();
    }

    /** log pi(proposed)/pi(current); q cancels. */
    public double logAcceptance(Sentence s, Relation target) {
        if(!canMove(s,target)) return Double.NEGATIVE_INFINITY;
        Fact old=s.getOrigin();
        Fact candidate=new Fact(target,old.getEnt1(),old.getEnt2());
        boolean create=!world.getFacts().exists(candidate);
        boolean remove=world.getSentences().sentencesWithOrigin(old).size()==1;
        int sourceFacts=world.getFacts().factsWithRelation(old.getRel()).size();
        int targetFacts=world.getFacts().factsWithRelation(target).size();
        int total=world.getFacts().size();
        int after=total+(create?1:0)-(remove?1:0);

        Multiset<Trigger> moved=HashMultiset.create(); moved.add(s.getTrig());
        double delta=ModelFunctions.logMoveTriggersRatio(
                world.getSentences().triggerHistogram(old.getRel()),
                world.getSentences().triggerHistogram(target),moved,
                world.getBeta(),world.getWeightedLexicons().getLex().size());
        WorldProb wp=new WorldProb(world);
        if(remove) delta+=wp.logFactTerm(sourceFacts-1)-wp.logFactTerm(sourceFacts);
        if(create) delta+=wp.logFactTerm(targetFacts+1)-wp.logFactTerm(targetFacts);
        int occupied=world.numOccupiedRelations();
        int occupiedAfter=occupied-(remove&&sourceFacts==1?1:0)+(create&&targetFacts==0?1:0);
        delta+=WorldProb.logLogNormal(occupiedAfter,world.getRelationPriorMean())
                -WorldProb.logLogNormal(occupied,world.getRelationPriorMean());
        delta+=world.getSentences().size()*(Math.log(total)-Math.log(after));
        return delta;
    }

    public void apply(Sentence s, Relation target) {
        if(!canMove(s,target)) throw new IllegalArgumentException("Move is null or targets an unreferenced fact");
        Fact old=s.getOrigin();
        boolean remove=world.getSentences().sentencesWithOrigin(old).size()==1;
        Fact candidate=new Fact(target,old.getEnt1(),old.getEnt2());
        if(!world.getFacts().exists(candidate)) world.getFacts().add(candidate);
        s.setOrigin(world.getFacts().getCanonical(candidate));
        if(remove) world.getFacts().remove(old);
    }

    @Override public double sample(Random rng) {
        if(world.getSentences().size()==0 || relations.isEmpty()) return 0;
        Sentence s=world.getSentences().get(rng.nextInt(world.getSentences().size()));
        Relation target=relations.get(rng.nextInt(relations.size()));
        if(target.equals(s.getOrigin().getRel())) return 0;
        if(!canMove(s,target)) { blockedUnreferenced++; return 0; }
        proposed++;
        double logAcceptance=logAcceptance(s,target);
        if(Math.log(rng.nextDouble())<logAcceptance) { apply(s,target); accepted++; }
        return Math.exp(Math.min(0,logAcceptance));
    }

    public String acceptanceReport() {
        return "sentence relation bridge "+accepted+"/"+proposed+" accepted; "+blockedUnreferenced+" unreferenced targets blocked";
    }
}
