package org.ucb.generative_ie.inference;

import com.google.common.collect.Maps;

import com.google.common.collect.Lists;

import java.util.Map;

import java.util.List;

import java.util.Set;

import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Fact;
import org.ucb.generative_ie.world.Relation;
import org.ucb.generative_ie.world.Sentence;
import org.ucb.generative_ie.world.Trigger;
import org.ucb.generative_ie.world.World;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import java.io.File;
import org.ucb.generative_ie.world.WorldProb;

public class RelationTriggersObserver extends WorldObserver{
    private String filename;
    double bestProb;
    
    public RelationTriggersObserver() {
        this.filename = null;
    }
    
    public RelationTriggersObserver(String filename) {
        this.filename = filename;
        this.bestProb = Double.NEGATIVE_INFINITY;
    }
    
    /**
     * Relations sorted by name, each with its dependency paths by count, and for each
     * path up to ten of the facts and sentences expressing it. One pass over the sentences.
     */
    public String getDescription(World world) {
        Map<Relation, Multiset<Trigger>> histograms = Maps.newHashMap();
        Map<Relation, Map<Trigger, List<Sentence>>> examples = Maps.newHashMap();
        for (Sentence s : world.getSentences()) {
            Relation r = s.getOrigin().getRel();
            if (!histograms.containsKey(r)) {
                histograms.put(r, HashMultiset.<Trigger>create());
                examples.put(r, Maps.<Trigger, List<Sentence>>newHashMap());
            }
            histograms.get(r).add(s.getTrig());
            List<Sentence> ex = examples.get(r).get(s.getTrig());
            if (ex == null) {
                ex = Lists.newArrayList();
                examples.get(r).put(s.getTrig(), ex);
            }
            if (ex.size() < 10) {
                ex.add(s);
            }
        }

        StringBuilder output = new StringBuilder();
        for (Relation r : Util.asSortedList(world.getWeightedLexicons().keySet())) {
            output.append(String.format("%-12s : %s\n", r, world.getWeightedLexicons().get(r)));
            Multiset<Trigger> histogram = histograms.containsKey(r) ? histograms.get(r) : HashMultiset.<Trigger>create();
            for (Trigger trigger : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                output.append(String.format("    %-80s : %d\n", trigger, histogram.count(trigger)));
            }
            output.append("\n");
            for (Trigger trigger : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                output.append(String.format("    %-80s : %d\n", trigger, histogram.count(trigger)));
                Set<Fact> origins = Sets.newLinkedHashSet();
                for (Sentence s : examples.get(r).get(trigger)) {
                    origins.add(s.getOrigin());
                }
                for (Fact origin : origins) {
                    output.append(String.format("        %s\n", origin));
                }
                for (Sentence s : examples.get(r).get(trigger)) {
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
        
        if (iteration % 1 == 0 && this.filename != null) {
            double nextProb = probber.logCollapsedTriggers();
            
            if ( nextProb > bestProb) {
                Util.writeToFile(Util.joinPath(filename, "relation_triggers.txt"), getDescription(world));
                //System.out.println(getDescription(world));
            }
        }
    }
}
