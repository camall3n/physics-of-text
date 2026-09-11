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
    
    /** Every sentence of the world with its relation, entities and dependency path, one per line. */
    public static String sentencesTsv(World world) {
        StringBuilder sb = new StringBuilder("relation\tentity1\tentity2\targ1\targ2\tpath\n");
        for (org.ucb.generative_ie.world.Sentence s : world.getSentences()) {
            sb.append(s.getOrigin().getRel().getName()).append('\t')
              .append(s.getOrigin().getEnt1()).append('\t').append(s.getOrigin().getEnt2()).append('\t')
              .append(s.getArg1().getName()).append('\t').append(s.getArg2().getName()).append('\t')
              .append(s.getTrig().getString()).append('\n');
        }
        return sb.toString();
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
            logProbs.put("collapsed_trigs", probber.logCollapsedTriggers());
            logProbs.put("collapsed_nouns", probber.logCollapsedNouns());
            logProbs.put("entity_number", probber.logEntityNumber());
            logProbs.put("relation_number", probber.logRelationNumber());
            logProbs.put("relations_used", (double) world.numOccupiedRelations());
            logProbs.put("relations_with_sentences", (double) world.getSentences().numRelationsWithSentences());
            logProbs.put("entity_only", probber.logProbEntityWorld());
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
                Util.writeToFile(Util.joinPath(filename, "map_world_sentences.tsv"), sentencesTsv(world));
                
                bestLogProb = nextLogProb;
            }
        }
    }
    
}
