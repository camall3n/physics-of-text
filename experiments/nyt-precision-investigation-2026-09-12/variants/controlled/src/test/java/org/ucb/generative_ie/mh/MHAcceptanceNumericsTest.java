package org.ucb.generative_ie.mh;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class MHAcceptanceNumericsTest {
    private static class Proposal extends MHProposal {
        final double target, proposal;
        boolean applied;
        Proposal(double target, double proposal) { super(null); this.target=target; this.proposal=proposal; }
        public void sample(Random rng) { }
        public double stateRatio() { return Math.exp(target); }
        public double proposalRatio() { return Math.exp(proposal); }
        public double logStateRatio() { return target; }
        public double logProposalRatio() { return proposal; }
        public void applyProposal() { applied=true; }
    }
    private static double sample(final Proposal proposal, final double uniform) {
        GeneralMHStep step = new GeneralMHStep(null) {
            public MHProposal createProposal() { return proposal; }
            public String getStepKind() { return "numeric regression"; }
        };
        return step.sample(new Random(5) { @Override public double nextDouble() { return uniform; } });
    }
    @Test public void reciprocalExtremeRatiosAcceptWithoutZeroTimesInfinity() {
        for (int sign : new int[]{-1,1}) {
            Proposal p = new Proposal(sign*1000,-sign*1000);
            assertEquals(1,sample(p,.7),0); assertTrue(p.applied);
        }
    }
    @Test public void finiteAcceptanceAndImpossibleMovesRespectCdfBoundary() {
        Proposal accepted = new Proposal(-1000,1000+Math.log(.25));
        assertEquals(.25,sample(accepted,.1),1e-13); assertTrue(accepted.applied);
        Proposal rejected = new Proposal(-1000,1000+Math.log(.25));
        sample(rejected,.5); assertFalse(rejected.applied);
        Proposal zero = new Proposal(Double.NEGATIVE_INFINITY,0);
        assertEquals(0,sample(zero,0),0); assertFalse(zero.applied);
    }
    @Test(expected=IllegalStateException.class) public void nanAcceptanceIsNotASilentRejection() {
        sample(new Proposal(Double.NaN,0),.5);
    }
    @Test public void nullProposalCannotMutateWorld() {
        Proposal p = new Proposal(1000,1000); p.setNull();
        assertEquals(0,sample(p,.1),0); assertFalse(p.applied);
    }
}
