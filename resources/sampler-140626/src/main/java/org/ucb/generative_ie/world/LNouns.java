package org.ucb.generative_ie.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.ucb.generative_ie.world.Noun;

public class LNouns {
    private final List <Noun> lNouns;
        
    public LNouns() {
        this.lNouns = Lists.newArrayList();
    }
    
    public LNouns(LNouns ln){
        this.lNouns = ImmutableList.copyOf(ln.lNouns);
    }
    
    public LNouns(List<Noun> lNouns){
        this.lNouns = ImmutableList.copyOf(lNouns);
    }
    
    public List<Noun> getLNouns(){
        return lNouns;
    }
    
    public int size(){
        return lNouns.size();
    }
}
