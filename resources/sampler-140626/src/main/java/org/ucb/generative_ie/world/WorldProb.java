package org.ucb.generative_ie.world;

import cern.jet.random.tdouble.Poisson;
import java.util.Arrays;

import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.random.DirichletDistr;
import org.apache.commons.math3.distribution.AbstractIntegerDistribution;

import com.google.common.collect.Multiset;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.Util;

/**
 * The probability of a given world.
 */
public class WorldProb {

    private World w;

    //static PoissonDistribution entityPoisson = new PoissonDistribution(w.getNumEntities());

    public WorldProb(World w) {
        this.w = w;
    }
    private final static Logger logger = LoggerFactory.getLogger(WorldProb.class);
    
    public double logProb() {
        double logProb = 0;
        //logProb += logProbFacts();
        //logProb += logLexicons();
        //logProb += logSentencesOrigin();
        //logProb += logEntityMentions();
        //logProb += logSentencesArgs();
        //logProb += logSentencesTrigs();
        //logProb += logCollapsedNouns();
        //logProb += logCollapsedTriggers();
        logProb += logProbEntityWorld();
        return logProb;
    }

    public double logProbLabeledEntityWorld() {
        double logProbEntityWorld = 0;
        int numEntitiesDefault = w.getEntities().sizeDefault();
        int numEntities = w.getNumEntities();
        int numMentions = w.getSentences().getMentions().size();
        
        //the probability of entity number by LogNormal distribution
        double variance = 1;
        double mean = Math.log(numEntitiesDefault) - Math.pow(variance, 2)/2;
        //double standardDeviation = (double)numEntitiesDefault/2;
        //double logMeanEntities = 2 * Math.log(numEntitiesDefault)- 0.5 * Math.log(standardDeviation + Math.pow(numEntitiesDefault, 2));
        //double logSD = Math.sqrt(Math.log(1+ standardDeviation/Math.pow(numEntitiesDefault, 2)));
        LogNormalDistribution logNormalEntity = new LogNormalDistribution(mean, variance);
        logger.debug("LogNormal, numEnt_default: {}, mean: {}, variance: {}, density: {}", numEntitiesDefault, mean, variance, logNormalEntity.density(numEntities));
        logProbEntityWorld += Math.log(logNormalEntity.density(numEntities));

        //PoissonDistribution entityPoisson = new PoissonDistribution(numEntitiesDefault);
        //logProbEntityWorld += Math.log(entityPoisson.probability(numEntities));
        
        //P(E)
        logProbEntityWorld += (numMentions * Math.log(1.0/numEntities));
        //the shape
        //logProbEntityWorld += Util.logCombination(w.getSentences().getEntityDistribution());
        
        logProbEntityWorld += logCollapsedNouns();
        return logProbEntityWorld;
    }
    
    /**
     * @return The probability of the Entity World
     */
    public double logProbEntityWorld() {
        double logProbEntityWorld = logProbLabeledEntityWorld();
        int numEntities = w.getNumEntities();
        int numNonEmptyEntities = w.getSentences().getNonEmptyEntitySize();

        //the combinatoric factor when the entities are unlabeled
        logger.debug(" numEnt: {}, numEnt_nonEmpty: {}", numEntities, numNonEmptyEntities);
        logProbEntityWorld += Util.logPermutation(numEntities, numNonEmptyEntities);
        logger.debug("numEnt: {}, numEnt_nonEmpty: {}, logPermutation: {}", numEntities, numNonEmptyEntities, Util.logPermutation(numEntities, numNonEmptyEntities));
        
        return logProbEntityWorld;
    }
    
    public double logCollapsedTriggers() {
        int numTrigs = w.getWeightedLexicons().getLex().size();

        double total = 0;

        for (Relation r : w.getRelations()) {
            Multiset<Trigger> hist = w.getSentences().triggerHistogram(r);

            for (Multiset.Entry<Trigger> entry : hist.entrySet()) {
                total += ModelFunctions.logGammaTmp(w.getBeta(), entry.getCount());
            }

            total -= ModelFunctions.logGammaTmp(w.getBeta() * numTrigs, hist.size());
        }

        return total;
    }
    
    public double logCollapsedNouns() {
        double total = 0;
        int numNouns = w.getWeightedNounLexicons().getNounLexicon().size();
        
        for (Entity e : w.getEntities()) {
            Multiset <Noun> hist = w.getSentences().nounHistogram(e);
            
            //for (Multiset.Entry <Noun> entry : hist.entrySet()) {
            //    total += ModelFunctions.logGammaTmp(w.getAlpha(), entry.getCount());
            //}
            //
            //total -= ModelFunctions.logGammaTmp(w.getAlpha() * numNouns, hist.sizeCurrent());
            
            total += ModelFunctions.logBetaProb(hist, w.getAlpha(), numNouns);
        }
        return total;
    }

    public double logProbFacts() {
        int numPossibleFacts = w.getNumEntities()* w.getNumEntities() * w.getNumRelations();

        double sparsity = w.getSparsity();

        double factProb = 0;
        factProb += Math.log(sparsity) * w.getFacts().size();
        factProb += Math.log(1 - sparsity) * (numPossibleFacts - w.getFacts().size());

        return factProb;
    }

    public double logLexicons() {
        double logProb = 0;

        WeightedLexicons weightedLexicons = w.getWeightedLexicons();

        for (WeightedLexicon weightedLex : weightedLexicons.values()) {
            double[] weights = weightedLex.getWeights();
            
            double[] betas = new double[weightedLex.getLex().size()];
            Arrays.fill(betas, w.getBeta());

            logProb += DirichletDistr.logPdf(betas, weights);
        }

        return logProb;
    }

    public double logSentencesOrigin() {
        double logProb = - w.getSentences().size() * Math.log(w.getFacts().size());

        for (Sentence s : w.getSentences())
        {
            //if (!w.getFacts().exists(s.getOrigin())) {
            //    throw new RuntimeException("Sentence origin doesn't exist in world");
            //}
        }

        return logProb;
    }

    public double logSentencesArgs() {
        //To be solved
        double logProb = 0;
        //for (Sentence s : w.getSentences()) {
        //    if (!s.getArgPair().equals(s.getOrigin().getArgPair())) {
        //        throw new RuntimeException("Sentence args don't match fact");
        //    }
        //}

        return logProb;
    }

    public double logEntityMentions() {
        double logProb = 0;
        WeightedNounLexicons mentions = w.getWeightedNounLexicons();
        
        for (WeightedNounLexicon wnLex : mentions.values()) {
            double[] weights = wnLex.getWeights();
            System.err.print(weights);
            double[] alphas = new double[wnLex.getNounLexicon().size()];
            System.err.println(alphas.toString());
            Arrays.fill(alphas, w.getAlpha());
            logProb += DirichletDistr.logPdf(alphas, weights);
            System.err.println(logProb);
        }
        System.err.println(logProb);
        return logProb;
    }
    
    public double logSentencesTrigs() {
        double logProb = 0;
        for (Sentence s : w.getSentences()) {
            WeightedLexicon wLex = w.getWeightedLexicons().get(s.getOrigin().getRel());
            logProb += Math.log(wLex.getWeight(s.getTrig()));
        }

        return logProb;
    }
}
