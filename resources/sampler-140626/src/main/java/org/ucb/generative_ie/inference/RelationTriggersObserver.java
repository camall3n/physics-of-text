package org.ucb.generative_ie.inference;

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
    
    public String getDescription(World world) {
        StringBuilder output = new StringBuilder();
        for (Relation r : Util.asSortedList(world.getWeightedLexicons().keySet())) {
            output.append(String.format("%-12s : %s\n", r, world.getWeightedLexicons().get(r)));

            Multiset<Trigger> histogram = HashMultiset.create();

            for (Sentence s : world.getSentences().sentencesWithRelation(r)) {
                histogram.add(s.getTrig());
            }


            for (Trigger trigger : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                int count = histogram.count(trigger);
                if (count > 0) { //3
                    output.append(String.format("    %-80s : %d\n", trigger, count));
                }
            }
            output.append("\n");

            for (Trigger trigger : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                int count = histogram.count(trigger);
                if (count > 0) { //3
                    output.append(String.format("    %-80s : %d\n", trigger, count));

                    Set<Fact> origins = Sets.newHashSet();
                    Set <Sentence> sentences = Sets.newHashSet();
                    
                    for (Sentence s : world.getSentences()) {
                        if (origins.size() >= 10) { //top N facts
                            break;
                        }

                        if (s.getTrig().equals(trigger) && s.getOrigin().getRel().equals(r)) {
                            origins.add(s.getOrigin());
                            sentences.add(s);
                        }
                    }

                    for (Fact origin : origins) {
                        output.append(String.format("        %s\n", origin));
                    }
                    for (Sentence s : sentences) {
                         output.append(String.format("     %s\n", s));
                     }
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
