package org.ucb.generative_ie.mcmc;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.LogProbMap;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.Multiset;

/**
 * Gibbs step on the entity one mention refers to, under the entity model with the
 * noun dictionaries integrated out: P(entity e) is proportional to the collapsed
 * predictive (n_e(noun) + alpha) / (n_e + alpha V) counted over the other mentions.
 *
 * The archived version sampled a fresh Dirichlet over all nouns for every entity on
 * every call (it tested the wrong map for an existing dictionary) and copied every
 * entity's histogram; at 1258 entities that was over a million gamma draws per step.
 */
public class MentionRV implements MCMCStep {

    private final World world;
    private final Mention mention;
    private final static Logger logger = LoggerFactory.getLogger(MentionRV.class);

    public MentionRV(World world, Mention mention) {
        this.world = world;
        this.mention = mention;
    }

    @Override
    public double sample(Random rng) {
        Noun noun = mention.getNoun();
        Entity current = mention.getEntity();
        double alpha = world.getAlpha();
        int numNouns = world.getWeightedNounLexicons().getNounLexicon().size();

        LogProbMap<Entity> sampler = new LogProbMap<>();
        for (Entity entity : world.getEntities()) {
            Multiset<Noun> hist = world.getSentences().nounHistogram(entity);
            int self = entity.equals(current) ? 1 : 0;      // leave this mention out of its own entity's counts
            int nCount = hist.count(noun) - self;
            int nAll = hist.size() - self;
            sampler.multiplyKey(entity, (nCount + alpha) / (alpha * numNouns + nAll));
        }

        Entity chosen = sampler.sample(rng);
        if (!chosen.equals(current)) {
            mention.setEntity(chosen);
            logger.trace("mention {} moved from {} to {}", mention, current, chosen);
        }
        return 1;
    }

    @Override
    public String getStepKind() {
        return "MentionRV";
    }
}
