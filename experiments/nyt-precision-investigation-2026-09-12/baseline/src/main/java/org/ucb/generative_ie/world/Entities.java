package org.ucb.generative_ie.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.ucb.generative_ie.util.RandomAccessHashSet;

/**
 * All Entities in the world
 */
public class Entities implements Iterable <Entity>{
    private HashSet <Entity> entities;
    private RandomAccessHashSet <Entity> raEntities;
    private final int sizeDefault; // the default number of entities
    private int sizeCurrent; // the current number of entities
    private int sizeAll; // the number of all ever created entities
    private LogNormalDistribution logNormalEntity;
    
    public Entities(int numEntities) {
        this.sizeDefault = numEntities;
        this.sizeCurrent = numEntities;
        this.sizeAll = numEntities;
        this.entities = Sets.newHashSet();
        for (int i = 0; i < numEntities; i++) {
            Entity newEntity = new Entity(String.format("ent_%d", i));
            entities.add(newEntity);
        }
        this.raEntities = RandomAccessHashSet.copyof(entities);
        setLogNormalEntity();
    }
    
    public Entities(Set <Entity> entities ){
        this.entities = new HashSet(entities);
        this.raEntities = RandomAccessHashSet.copyof(entities);
        this.sizeDefault = entities.size();
        this.sizeCurrent = sizeDefault;
        this.sizeAll = sizeDefault;        
        setLogNormalEntity();
    }
    
    public Entities(Entities es) {
        this.entities = new HashSet(es.entities);
        this.raEntities = RandomAccessHashSet.copyof(es.entities);
        this.sizeDefault = es.sizeDefault;
        this.sizeCurrent = es.sizeCurrent;
        this.sizeAll = es.sizeAll;
        setLogNormalEntity();
    }
    
    public void setLogNormalEntity(){
        double variance = 1;
        double mean = Math.log(this.sizeDefault) - Math.pow(variance, 2)/2;
        this.logNormalEntity = new LogNormalDistribution(mean, variance);
    }
    
    public double getLogNormalEntityDensity(int K) {
        return this.logNormalEntity.density((double)K);
    }
    
    @Override
    public Iterator<Entity> iterator() {
        return entities.iterator();
    }
    
    public RandomAccessHashSet <Entity> getRandomEntities(){
        return raEntities;
    }
    
    public Set<Entity> asSet() {
    	return ImmutableSet.copyOf(entities);
    }

    public List<Entity> asList() {
    	return ImmutableList.copyOf(entities);
    }
    
    public static Entities defaultEntities(int numEntities) {
        Set<Entity> entities = Sets.newHashSet();
        for (int i = 0; i < numEntities; i++) {
            Entity newEntity = new Entity(String.format("ent_%d", i));
            //Entity newEntity = new Entity(String.format("%d", i));
            entities.add(newEntity);
        }
        return new Entities(entities);
    }

    /**
     * Add an entity to the entity sets
     * @param entity
     * @return 
     */
    public Entity addEntity(Entity entity) {
        sizeAll += 1;
        sizeCurrent +=1; 
        entities.add(entity);
        raEntities.add(entity);
        return entity;
    }
    
    /**
     * Create a new entity and add it to the entity world
     * @return 
     */
    public Entity addNewEntity() {
        Entity newEntity =  new Entity(String.format("ent_%d", sizeAll));
        //System.out.println(String.format("new entity added: %s", newEntity.toString()));
        return addEntity(newEntity);
    }
    
    /**
     * Remove an existing entity from the current entity world
     * @param entity 
     */
    public void removeEntity(Entity entity) {
        if (entities.contains(entity)) {
            entities.remove(entity);
            raEntities.remove(entity);
            sizeCurrent -= 1;
            //System.out.println(String.format("entity removed: %s", entity.toString()));
        }
    }
    
    public int sizeDefault() {
        return this.sizeDefault;
    }
    
    public int sizeCurrent() {
        return this.sizeCurrent;
    }
    
    public int sizeAll() {
        return this.sizeAll;
    }
    //private final ImmutableSet<EntityPerson> Person;
    //private Set<ObjectLocation> Location;
    //private Set<ObjectOrganization> Organization;
   
    //public class EntityPerson extends Entity{
    //
    //private String Title;
    //private String FirstName;
    //private String [] MiddleName;
    //private String Surname;
    //
    //void EntityPerson(){
    //    this.Type = "Person";
    //}
    //
    ////early test for simple case
    //void EntityPerson(String s){
    //    this.Type = "Person";
    //    this.name = s;
    //}
    //
    //void EntityPerson(String t, String f, String []m, String s){
    //    this.Type = "Person";
    //    this.Title = t;
    //    this.FirstName = f;
    //    this.MiddleName = m;
    //    this.Surname = s;
    //}
    //
    //void EntityPerson(EntityPerson p){
    //    this.Type = p.Type;
    //    this.Title = p.Title;
    //    this.FirstName = p.FirstName;
    //    this.MiddleName = p.MiddleName;
    //    this.Surname = p.Surname;
    //}
//}//
//
    //Set<EntityPerson> getPerson(){
    //    return this.Person;
    //}
}
