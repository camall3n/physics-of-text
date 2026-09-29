package org.ucb.generative_ie.mh;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.mcmc.MCMCStep;

import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

public abstract class GeneralMHStep implements MCMCStep {
    protected final World world;
    private static int accepted, rejected;
    private boolean debug;
    public GeneralMHStep(World world) {
        super();
        this.world = world;
        //this.debug = true;
        accepted = 0;
        rejected = 0;
    }

    public abstract MHProposal createProposal();

    private final static Logger logger = LoggerFactory.getLogger(GeneralMHStep.class);
    
    @Override
    public double sample(Random rng) {
        MHProposal proposal = createProposal();
        proposal.sample(rng);
        if (!proposal.isNull()) {
            double logStateRatio = proposal.logStateRatio();
            double logAcceptance = logStateRatio + proposal.logProposalRatio();
            if (Double.isNaN(logAcceptance)) {
                throw new IllegalStateException("Undefined MH acceptance ratio in " + getClass().getSimpleName());
            }
            logAcceptance = Math.min(0, logAcceptance);
            double acceptance = Math.exp(logAcceptance);
            logger.debug("Acceptance probability: {}", acceptance);
            
            if (debug) {
                System.out.println(this.getClass() + " Acceptance: " + acceptance);
            }
            
            if (Math.log(rng.nextDouble()) < logAcceptance) {
                logger.debug("Proposal accepted! ");
                if (debug) {
                    WorldProb probber = new WorldProb(world);
                    double oldProb = probber.logProb();
                    
                    proposal.applyProposal();
                    
                    double newProb = probber.logProb();
                    
                    double actualLogStateRatio = newProb - oldProb;
                    assert Util.almostEqual(actualLogStateRatio, logStateRatio, 1e-3)
                            : String.format("%f %f", actualLogStateRatio, logStateRatio);
                }
                else {
                    proposal.applyProposal();
                }
                accepted++;
            }
            else {
                logger.debug("Proposal rejected! ");
                proposal.dontApplyProposal();
                rejected++;
            }
            
            return acceptance;
        }
        else {
            rejected++;
            return 0;
        }
        
    }
    
    public int getAccepted() {
        return accepted;
    }
    
    public int getRejected() {
        return rejected;
    }
    
    public double getAcceptanceRatio() {
        return (double) getAccepted() / (getRejected() + getAccepted());
    }

}
