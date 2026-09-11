package org.ucb.generative_ie.inference;

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
    
    public String getDescription(World world) {
         StringBuilder output = new StringBuilder();
         
         //for (Entity e : Util.asSortedList(world.getWeightedNounLexicons().keySet())) {
         for (Entity e : world.getEntities().asList()) {
             output.append(String.format("%-12s : %s\n", e, world.getWeightedNounLexicons().get(e)));
             
             Multiset <Noun> histogram = HashMultiset.create();
             //for (Sentence s : world.getSentences().sentencesWithSourceEntity(e)) {
             //    histogram.add(s.getArg1());
             //}
             //
             //for (Sentence s : world.getSentences().sentencesWithDestEntity(e)) {
             //    histogram.add(s.getArg2());
             //}
             
             for (Mention mention: world.getSentences().getMentionsByEntity(e)) {
                 histogram.add(mention.getNoun());
             }
             
             for (Noun noun : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                 int count = histogram.count(noun);
                 if  (count > 0) {
                     output.append(String.format("  %-80s : %d\n", noun, count));
                 }
             }
             output.append("\n");
             
              for (Noun noun : Multisets.copyHighestCountFirst(histogram).elementSet()) {
                  int count = histogram.count(noun);
                  if (count > 0) {
                     output.append(String.format("  %-80s : %d\n", noun, count));
                     Set <Fact> origins = Sets.newHashSet();
                     Set <Sentence> sentences = Sets.newHashSet();
                     for (Sentence s : world.getSentences()) {
                         if (origins.size() >= 10)  {//show the top 10
                             break;
                         }
                         
                         if (s.getArg1().equals(noun) && s.getOrigin().getEnt1().equals(e)) {
                             origins.add(s.getOrigin());
                             sentences.add(s);
                         }
                         
                         if (s.getArg2().equals(noun) && s.getOrigin().getEnt2().equals(e)) {
                             origins.add(s.getOrigin());
                             sentences.add(s);
                         }
                     }
                     
                     //for (Fact origin : origins) {
                     //    output.append(String.format("       %s\n", origin));
                     //}
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
