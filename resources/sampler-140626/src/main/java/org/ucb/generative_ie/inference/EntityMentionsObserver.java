package org.ucb.generative_ie.inference;

import com.google.common.collect.Maps;

import com.google.common.collect.Lists;

import java.util.Map;

import java.util.List;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import java.io.File;
import java.util.Set;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Mention;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

/**
 * To observe the mentions of Entities
 */
public class EntityMentionsObserver extends WorldObserver{
    private String filename;
    double bestProb;
     
    public EntityMentionsObserver() {
        this.filename = null;
    }
    
    public EntityMentionsObserver(String filename) {
        this.filename = filename;
        this.bestProb = Double.NEGATIVE_INFINITY;
    }
    
    /** Entities with their nouns by count and up to ten example sentences per noun. One pass over the mentions. */
    public String getDescription(World world) {
        StringBuilder output = new StringBuilder();
        for (Entity e : world.getEntities().asList()) {
            output.append(String.format("%-12s : %s\n", e, world.getWeightedNounLexicons().get(e)));
            Multiset<Noun> histogram = HashMultiset.create();
            Map<Noun, List<Sentence>> examples = Maps.newHashMap();
            for (Mention mention : world.getSentences().getMentionsByEntity(e)) {
                histogram.add(mention.getNoun());
                List<Sentence> ex = examples.get(mention.getNoun());
                if (ex == null) {
                    ex = Lists.newArrayList();
                    examples.put(mention.getNoun(), ex);
                }
                if (ex.size() < 10 && mention.getSentence() instanceof Sentence) {
                    ex.add((Sentence) mention.getSentence());
                }
            }
            for (Noun noun : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                output.append(String.format("  %-80s : %d\n", noun, histogram.count(noun)));
            }
            output.append("\n");
            for (Noun noun : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                output.append(String.format("  %-80s : %d\n", noun, histogram.count(noun)));
                for (Sentence s : examples.get(noun)) {
                    output.append(String.format("     %s\n", s));
                }
            }
            output.append("\n\n");
        }
        output.append("================================================================================");
        return output.toString();
    }

    @Override
    public void observe(World world, int iteration) {
        
        WorldProb probber = new WorldProb(world);
        
        boolean success = (new File(filename)).mkdirs();
        if (success) {
            System.out.println("Directory: " + filename + " created");
        }
        
        //if (iteration % 1 == 0 && this.filename != null) {
        if (this.filename != null) {
            //double nextProbs = probber.logCollapsedNouns();
            double nextProbs = probber.logProbEntityWorld();
            Util.updateFile(Util.joinPath(filename, "number_Entities.txt"), String.format("%d ", world.getEntities().sizeCurrent()));
            Util.updateFile(Util.joinPath(filename, "likelihood.txt"), String.format("%f ",nextProbs));
            if (nextProbs > bestProb) {
                Util.writeToFile(Util.joinPath(filename, "entity_mentions.txt"), getDescription(world));
            //System.out.println(getDescription(world));
                bestProb = nextProbs;
            }
        }
    }
}
