package org.ucb.generative_ie.world;

public class Entity implements Comparable<Entity>{
    private final String name;
    //protected String Type;
    //protected ArrayList<String> Attributes;
    
    public Entity(String name){
        super();
        this.name = name;
    }
    
    public Entity(Entity e){
        this.name = e.name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return "Ent[" + name + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null )
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Entity other = (Entity) obj;
        if (name == null){
            if (other.name != null)
                return false;
        }
        else if(!name.equals(other.name)){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Entity e) {
        return name.compareTo(e.name);
    }
}
