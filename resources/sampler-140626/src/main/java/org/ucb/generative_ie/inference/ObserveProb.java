package org.ucb.generative_ie.inference;

import java.io.File;

import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.World;
import org.ucb.generative_ie.world.WorldProb;

import com.google.common.collect.ArrayListMultimap;

public class ObserveProb extends WorldObserver {

    public ArrayListMultimap<String, Double> logProbs;
    private String filename;

    private double bestLogProb;

    public ObserveProb() {
        logProbs = ArrayListMultimap.create();
        this.filename = null;
    }
    
    public ObserveProb(String filename) {
        logProbs = ArrayListMultimap.create();
        this.filename = filename;
        bestLogProb = Double.NEGATIVE_INFINITY;
    }
    
    @Override
    public void observe(World world, int iteration) {
        WorldProb probber = new WorldProb(world);
        
        boolean success = (new File(filename)).mkdirs();
        if (success) {
            System.out.println("Directory: " + filename + " created");
        }
        
        if (iteration % 1 == 0 && this.filename != null) {
            double nextLogProb = probber.logProb();
            logProbs.put("total", nextLogProb);
            logProbs.put("facts", probber.logProbFacts());
            logProbs.put("origin", probber.logSentencesOrigin());
            logProbs.put("args", probber.logSentencesArgs());
            logProbs.put("collapsed_trigs", probber.logCollapsedTriggers());
            Util.writeJsonToFile(Util.joinPath(filename, "logprobs.txt"), logProbs.asMap());
            
            if (nextLogProb > bestLogProb) {
                RelationTriggersObserver observer = new RelationTriggersObserver();
                String description = observer.getDescription(world);
                String total = nextLogProb + "\n" + description;
                Util.writeToFile(Util.joinPath(filename, "map_world.txt"), total);
                
                EntityMentionsObserver moberserver = new EntityMentionsObserver();
                String mentionsDescription = moberserver.getDescription(world);
                String totalMentions = nextLogProb + "\n" + mentionsDescription;
                Util.writeToFile(Util.joinPath(filename, "map_world_mentions.txt"), totalMentions);
                
                bestLogProb = nextLogProb;
            }
        }
    }
    
}
