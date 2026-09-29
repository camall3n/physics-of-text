package org.ucb.generative_ie.inference;

import com.google.common.collect.Lists; 
import java.util.Iterator;
import java.util.List;
import java.util.Random; 
import org.ucb.generative_ie.mh.MentionRVS; 
import org.ucb.generative_ie.world.Entities; 
import org.ucb.generative_ie.world.Mentions;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.WeightedNounLexicons;
import org.ucb.generative_ie.world.World;
/**
 * Old versions, abandoned.
 */
public class EntityInferer {
    /**
    private final int numIterations;
    private final Mentions initialAssignment;
    //private WeightedNounLexicons MapAssignment;
    private List <Query> queries;
    private List<EntityObserveProb> observers;
    private Entities entities;
    private Random rng;
    private int size;

    public EntityInferer(int numIterations, World initialWorld, SentenceEvidence evidence, Random rng) {
        this.numIterations = numIterations;
        this.initialAssignment = initialAssignment;
        this.observers = Lists.newArrayList();
        //this.MapAssignment = initialAssignment;
        //this.MapAssignment = new WeightedNounLexicons(initialAssignment);
        this.entities = initialAssignment.getEntities();
        this.size = initialAssignment.size();
    }

    public void addEntityObserver(EntityObserveProb entityObserver){
        this.observers.add(entityObserver);
    }
    
    public void run() {
        run(0);
    }
    
    public void run(int burnin) {
        if (numIterations < burnin) {
            throw new RuntimeException("burnin can't be more than numIterations");
        }

        //QueryResult results = new QueryResult();
        //for (Query q : queries) {
        //    results.put(q, new BooleanCounter());
        //}

        int i = 0; //TODO Make this better
        for (Mentions sampledMentions : this)
        {
            //System.out.println(sampledMentions);
            //if (i > burnin) {
            //    for (Query q : queries) {
            //        results.get(q).add(q.isTrue(sampledReferences));
            //    }
            //}
            

            for (EntityObserveProb o : observers) {
                o.observeEntity(sampledMentions, i);
            }

            i++;
            //if (MapAssignment == initialAssignment){
            //        System.out.println("YES!");
            //    }
            //if (i == numIterations) {
            //    System.out.println("The last assignment:");
            //    System.out.println(sampledMentions);
            //    for (Entity e: sampledMentions.getEntities()) {
            //        //sampledMentions.mentionsWithEntity(e);
            //        System.out.println(String.format("%s %s", e, sampledMentions.nounsWithEntity(e)));
            //    }
            //}
        }
       
        //System.out.println(MapAssignment);
        
        //System.out.println("The initial assignment:");
        //System.out.println(initialAssignment);
        //for (Entity e: this.entities) {
        //    //sampledMentions.mentionsWithEntity(e);
        //    System.out.println(String.format("%s %s", e, this.initialAssignment.nounsWithEntity(e)));
        //}
        //System.out.println("The MAP assignment:");
//
        //for (Entity e: MapAssignment.getEntities()) {
        //    //sampledMentions.mentionsWithEntity(e);
        //    System.out.println(String.format("%s %s", e, MapAssignment.nounsWithEntity(e)));
        //}
        //return results;
    }

    @Override
    public Iterator<World> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public class EntityInfererIterator implements Iterator <Mentions> {
        
        private int currentIteration;
        private WeightedNounLexicons currentAssignment;
        
        public EntityInfererIterator() {
            this.currentIteration = 0;
            this.currentAssignment = initialAssignment;
        }
        
        @Override
        public boolean hasNext() {
            return numIterations > currentIteration;
        }
        
        @Override
        public WeightedNounLexicons next() {
            if (currentIteration % (numIterations / 10) == 0)
            {
                System.out.print(String.format("++Iteration: (%d / %d)\r", currentIteration, numIterations));
                
                
            }
            //References newRefs = new WeightedNounLexicons(currentAssignment);
            //System.out.println(newRefs==currentAssignment);

            int indexAssignment = currentIteration % size;
            //System.out.println(indexAssignment);
            //Mention mention = new Mention(currentAssignment.get(indexAssignment));
            //
            MentionRV mh = new MentionRV(currentAssignment, currentAssignment.get(indexAssignment));
            //MentionRVS mh = new MentionRVS(currentAssignment, currentAssignment.get(indexAssignment));
            Random rng = new Random();
            
            
            mh.sample(rng); //entities.getRandomEntities().getRandom(rng);
            //currentAssignment = mh.getMentions();
            //currentAssignment.get(indexAssignment).setEntity(e);
            //for(Mention r:currentAssignment){
            //    Random rng = new Random();
            //    Entity e = entities.getRandomEntities().getRandom(rng);
            //    r.setEntity(e);
            //}
            
            //verity the value of current assignment
            //if (this.currentAssignment != initialAssignment){
            //    System.out.println("Yes");
            //}
            //System.out.println("currentAssignment");
            //System.out.println(currentAssignment);
            //for (Entity e: entities) {
            ////sampledMentions.mentionsWithEntity(e);
            //System.out.println(String.format("%s %s", e, currentAssignment.nounsWithEntity(e)));
            //}
                //System.out.println(initialAssignment);
            //currentReferences = new WeightedNounLexicons(newRefs);
            //System.out.println(currentAssignment);
            currentIteration++;
            return this.currentAssignment;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet for remove Mentions."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
           
    @Override
    public Iterator<WeightedNounLexicons> iterator() {
        return new EntityInfererIterator();
    }
    **/
}
