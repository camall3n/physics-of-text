package org.ucb.generative_ie.mcmc;
 
import java.util.Iterator;  
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.World;

/**
 * MCMCSteps is a class of a collection of MCMCStep, sampling random variables for each of them.
 */
public class MCMCSteps implements Iterable <MCMCStep> {
    protected int numSteps;
    protected World world;
   
    public MCMCSteps(World world, SentenceEvidence evidence, int numSteps){
        this.numSteps = numSteps;
        this.world = world;
    }

    public MCMCSteps(World world, SentenceEvidence evidence) {
         this(world, evidence, 1); //default number of steps
    }
    
    @Override
    public Iterator<MCMCStep> iterator() {
        return new RandomIterator();
    }
    
    class RandomIterator implements Iterator <MCMCStep> {
        private int currentIteration;
        //private final Random rng;
       // private final ProbMap<StepKind> stepSampler;

        public RandomIterator() {
            this.currentIteration = 0;
            //this.rng = new Random();
            //this.stepSampler = new NormalProbMap<>();
        }
                
        @Override
        public boolean hasNext() {
            return currentIteration < numSteps;
        }

        @Override
        public MCMCStep next() {
            currentIteration++;
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
        
    }
}