package org.ucb.generative_ie.mcmc;
 
import com.google.common.collect.Multiset;
import java.util.Random;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.world.Entity; 
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.WeightedNounLexicon;
import org.ucb.generative_ie.world.World;

/**
 * Sample a random Entity from the world.
 */
public class WeightedNounLexiconRV implements MCMCStep{
    
    private final World world;
    private final Entity entity;
    private final WeightedNounLexicon weightedNounLexicon;
    
    public WeightedNounLexiconRV(World world, Entity entity, WeightedNounLexicon weightedNounLexicon) {
        this.world = world;
        this.entity = entity;
        this.weightedNounLexicon = weightedNounLexicon;
    }
    
    @Override
    public String getStepKind() {
        return "WeightedNounLexiconRV";
    }
     
    @Override
    public double sample(Random rng) {
        Multiset <Noun> nouns = world.getSentences().nounHistogram(entity);
        
        double [] alphas = world.getWeightedNounLexicons().convertToWeights(nouns, world.getAlpha());
        
        double [] newweights = DirichletDistr.dirichlet(alphas);
        
        this.weightedNounLexicon.setWeights(newweights);
        
        return 1;
    }
   
}
