package org.ucb.generative_ie.mcmc;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.world.*;

public class ControlledNYTRegressionTest {
    private World toy() {
        DirichletDistr.setResearchSeed(42);
        World world = new WorldGenerator(new Random(5), Entities.defaultEntities(3),
            Relations.defaultRelations(4), NounLexicon.defaultNounLexicon(3), Lexicon.defaultLexicon(3),
            .23, .71, new ConstantSparsityGenerator(.3), 0).emptyWorld();
        world.setSparsityPrior(1,9);
        world.setRelationPriorMean(2);
        List<Entity> entities=world.getEntities().asList();
        for (Relation r:world.getRelations()) for(Entity a:entities) for(Entity b:entities)
            world.getFacts().add(new Fact(r,a,b));
        for(int i=0;i<24;i++) {
            Fact fact=new Fact(world.getRelations().asList().get(i%4),entities.get(i%3),entities.get((i+1)%3));
            world.getSentences().add(new Sentence(world.getFacts().getCanonical(fact),
                world.getWeightedLexicons().getLex().get((i/3)%3),
                world.getWeightedNounLexicons().getNounLexicon().get(i%3),
                world.getWeightedNounLexicons().getNounLexicon().get((i+1)%3)));
        }
        return world;
    }

    @Test public void everyFrozenOriginDrawPreservesBothArgumentsWithAvailableAlternatives() {
        World world=toy(); world.setFreezeArgumentEntities(true);
        Sentence s=world.getSentences().get(0);
        Entity first=s.getOrigin().getEnt1(),second=s.getOrigin().getEnt2();
        Set<Relation> visited=new HashSet<>(); Random rng=new Random(1234);
        for(int i=0;i<10000;i++) {
            new SentenceOriginRV(world,s).sample(rng);
            assertEquals(first,s.getOrigin().getEnt1()); assertEquals(second,s.getOrigin().getEnt2());
            visited.add(s.getOrigin().getRel());
        }
        assertEquals(4,visited.size());
    }

    @Test public void frozenRelationConditionalMatchesFullJointAndSumsToOne() {
        World world=toy(); world.setFreezeArgumentEntities(true);
        Sentence s=world.getSentences().get(0); Fact original=s.getOrigin();
        Map<Relation,Double> logWeights=new SentenceOriginRV(world,s).relationLogWeights();
        double referenceJoint=Double.NaN,referenceWeight=Double.NaN, sum=0, max=Collections.max(logWeights.values());
        for(Map.Entry<Relation,Double> entry:logWeights.entrySet()) {
            s.setOrigin(world.getFacts().getCanonical(new Fact(entry.getKey(),original.getEnt1(),original.getEnt2())));
            double joint=new WorldProb(world).logProb();
            if(Double.isNaN(referenceJoint)) { referenceJoint=joint; referenceWeight=entry.getValue(); }
            assertEquals(joint-referenceJoint,entry.getValue()-referenceWeight,1e-10);
            sum+=Math.exp(entry.getValue()-max);
        }
        double normalizedSum=0;
        for(double weight:logWeights.values()) normalizedSum+=Math.exp(weight-max)/sum;
        assertEquals(1,normalizedSum,1e-14);
        s.setOrigin(original);
    }

    @Test public void allWorldKernelsPreserveFrozenArgumentAssignments() {
        World world=toy(); world.setFreezeArgumentEntities(true);
        List<EntityPair> initial=new ArrayList<>();
        for(Sentence s:world.getSentences()) initial.add(s.getOrigin().getEntityPair());
        Random rng=new Random(7331);
        WorldInferSteps steps=new WorldInferSteps(world,new SentenceEvidence(world),15000).withScanRng(new Random(4662));
        for(MCMCStep step:steps) {
            step.sample(rng); int i=0;
            for(Sentence s:world.getSentences()) assertEquals(initial.get(i++),s.getOrigin().getEntityPair());
        }
        assertTrue(new WorldProb(world).consistencyProblems().toString(),new WorldProb(world).consistencyProblems().isEmpty());
    }

    @Test public void nonFrozenOriginDrawsCanChangeArguments() {
        World world=toy(); Sentence s=world.getSentences().get(0);
        EntityPair initial=s.getOrigin().getEntityPair(); Random rng=new Random(6789); boolean changed=false;
        for(int i=0;i<10000;i++) {
            new SentenceOriginRV(world,s).sample(rng);
            changed|=!initial.equals(s.getOrigin().getEntityPair());
        }
        assertTrue(changed);
    }

    @Test public void seededGammaAndUnderflowFallbackReplayExactly() {
        double[][] parameters={{.001,.3,1,5},{1e-100,1e-100,1e-100}};
        for(double[] p:parameters) {
            DirichletDistr.setResearchSeed(717171); double[] first=DirichletDistr.dirichlet(p);
            DirichletDistr.setResearchSeed(717171); double[] second=DirichletDistr.dirichlet(p);
            assertArrayEquals(first,second,0); double sum=0; for(double x:first) sum+=x;
            assertEquals(1,sum,1e-14);
        }
    }
}
