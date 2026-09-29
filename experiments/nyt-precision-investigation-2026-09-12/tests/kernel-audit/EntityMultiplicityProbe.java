package org.ucb.generative_ie.mh;

import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.world.*;

/** Executable counterexample, intentionally documenting an unfixed discrepancy. */
public final class EntityMultiplicityProbe {
    static final class ForceProperSplit extends Random {
        int doubles=0;
        @Override public boolean nextBoolean() { return true; }
        @Override public double nextDouble() { return new double[]{.1,.1,.9}[doubles++]; }
    }
    public static void main(String[] args) {
        World w=new WorldGenerator(new Random(1),Entities.defaultEntities(1),Relations.defaultRelations(1),
            NounLexicon.defaultNounLexicon(1),Lexicon.defaultLexicon(1),.3,.3,new ConstantSparsityGenerator(.1),0).emptyWorld();
        Entity e=w.getEntities().asList().get(0); Fact f=new Fact(w.getRelations().asList().get(0),e,e); w.getFacts().add(f);
        w.getSentences().add(new Sentence(f,w.getWeightedLexicons().getLex().get(0),w.getWeightedNounLexicons().getNounLexicon().get(0),w.getWeightedNounLexicons().getNounLexicon().get(0)));
        EntitySmartSplitStep step=new EntitySmartSplitStep(w); MHProposal p=step.createProposal();
        ForceProperSplit rng=new ForceProperSplit(); p.sample(rng);
        double stated=p.logStateRatio(), proposal=p.logProposalRatio();
        double before=new WorldProb(w).logProbEntityWorld(); p.applyProposal(); double after=new WorldProb(w).logProbEntityWorld();
        if(w.getNumEntities()!=2||w.getSentences().getNonEmptyEntitySize()!=2) throw new AssertionError("fixture did not split into two occupied entities");
        double expectedProposal=Math.log(.5/.25);
        if(Math.abs(proposal-expectedProposal)>1e-12) throw new AssertionError("unexpected aggregate proposal probability");
        if(Math.abs((after-before)-stated-Math.log(2))>1e-12) throw new AssertionError("expected multiplicity discrepancy absent");
        System.out.println("COUNTEREXAMPLE CONFIRMED: one sentence/two mentions, one noun, N=1 K=1 -> N=2 K=2");
        System.out.println("Actual quotient-state q(split)=1/4, q(merge)=1/2, reported log proposal ratio="+proposal);
        System.out.println("Reported log target ratio="+stated+"; logProbEntityWorld ratio="+(after-before));
        System.out.println("Missing log target factor="+((after-before)-stated)+" = log(2)");
        System.out.println("Reported acceptance="+Math.exp(Math.min(0,stated+proposal))+"; acceptance for stated unlabeled target="+Math.exp(Math.min(0,after-before+proposal)));
        System.out.println("This is an unfixed entity-phase target/partition-multiplicity discrepancy, not a relation-phase defect. Additional empty-entity bookkeeping must be derived before patching.");
    }
}
