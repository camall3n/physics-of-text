package org.ucb.generative_ie.inference;

import com.google.common.collect.ArrayListMultimap;
import java.io.File;
import org.ucb.generative_ie.random.DirichletDistr;
import org.ucb.generative_ie.util.Util;
import org.ucb.generative_ie.world.Entity;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.NounLexicon;
import org.ucb.generative_ie.world.World;     

public class EntityObserveProb extends WorldObserver{
    public ArrayListMultimap<String, Double> logProbs;
    //public ArrayListMultimap<String, String> logMap;
    private String filename;

    private double bestLogProb;

    public EntityObserveProb() {
        logProbs = ArrayListMultimap.create();
        //logMap = ArrayListMultimap.create();
        this.filename = null;
    }

    public EntityObserveProb(String filename) {
        logProbs = ArrayListMultimap.create();
        //logMap = ArrayListMultimap.create();
        this.filename = filename;
        boolean success = (new File(filename)).mkdirs();
        if (success) {
            System.out.println("Directory: " + filename + " created");
        }
        else {
            System.out.println("Directory not created");
        }
        bestLogProb = Double.NEGATIVE_INFINITY;
	}

    @Override
    public void observe(World world, int iteration) {
    }
    /**
    public void observeEntity(World world, int iteration){
        //Logger logger = Logger.getLogger("MyLog");  
        //FileHandler fh = new FileHandler(filename + "logProbs.txt");
        //SimpleFormatter formatter = new SimpleFormatter();  
        //fh.setFormatter(formatter);  
        
        //FileOutputStream probFile = new FileOutputStream(filename + "logProbs.txt");
        
        
        if ( this.filename != null) {
            //double currentLogProb = logMentions(currentAssignment);
            double currentLogProb = logProb();
            //logger.info("log");
            logProbs.put("entity_world", currentLogProb);
            //probFile.write(currentLogProb);
            Util.writeJsonToFile(Util.joinPath(filename, "logprobs.txt"), logProbs.asMap());
             if (currentLogProb >= bestLogProb) {
                 
                 //ArrayListMultimap<String, String> logMap = ArrayListMultimap.create();
                 //RelationTriggersObserver observer = new RelationTriggersObserver();
                 //String description = observer.getDescription(world);
                 //String total = nextLogProb + "\n" + description;
                 String sMap = "The Map\n";
                 sMap = "The logProb of Map: " + currentLogProb + "\n"; 
                 for (Entity e: world.getEntities()) {
                     sMap += e.toString() + "\t" + currentAssignment.nounsWithEntity(e).toString() + '\n';
                     //logMap.put(e.toString(), currentAssignment.nounsWithEntity(e).toString());
                 }
                 Util.writeToFile(Util.joinPath(filename, "map_world.txt"), sMap);
                 bestLogProb = currentLogProb;
             }
        //System.out.println(String.format("Iteration %d\tlogProb: %f", iteration, logMentions(currentAssignment)));
        
        //if (iteration % 1 == 0 && this.filename != null) {
        //    double nextLogProb = probber.logProb();
       //
        //    logProbs.put("collapsed_trigs", probber.logCollapsedTriggers());
        //    Util.writeJsonToFile(Util.joinPath(filename, "logprobs.txt"), logProbs.asMap());
//
        //    if (nextLogProb > bestLogProb) {
        //        RelationTriggersObserver observer = new RelationTriggersObserver();
        //        String description = observer.getDescription(world);
        //        String total = nextLogProb + "\n" + description;
        //        Util.writeToFile(Util.joinPath(filename, "map_world.txt"), total);
//
        //        bestLogProb = nextLogProb;
        //    }
        }
    }
    
    public double logMentions(World world){
        double logProb = 0;
        double alpha = 0.0001;
        NounLexicon nLex  = world.getNounLexicon();
        for (Entity e : currentAssignment.getEntities()) {
            double [] alphas = currentAssignment.nounCounts(e, nLex, alpha);
            
            logProb += DirichletDistr.logBeta(alphas);
        }
        
        return logProb;
    }
**/
}
