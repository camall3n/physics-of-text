package org.ucb.dpm;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.util.Util;

/**
 *
 * Observe the Mixture data 
 */
public class MixtureObsever {
    
    private String filename;
    public MixtureObsever(String filename){
        this.filename = filename;
    }
    
    private final static Logger logger = LoggerFactory.getLogger(MixtureObsever.class);
    
    public void observe(MixtureWorld mworld) {
        boolean success = (new File(filename)).mkdirs();
        if (success) {
            System.out.println("Directory: " + filename + " created");
        }
        
        Util.updateFile(Util.joinPath(filename, "likelihood.txt"), String.format("%f ", mworld.worldLikelihood()));
        
        ArrayList <Double> numComponents = Lists.newArrayList();
        for (int cid: mworld.getMixtureDataSet().keySet()){
            numComponents.add((double)mworld.countComponent(cid)/mworld.getDataSize());
        }
        Collections.sort(numComponents, Collections.reverseOrder());
        Util.updateFile(Util.joinPath(filename, "JN-diagram-all.txt"), String.format("%s\n", numComponents.toString()));
        
        ArrayList <Double> numComponentsTOP = Lists.newArrayList();
        double cTop=0.0;
        for (double d:numComponents) {
            cTop += d;
            numComponentsTOP.add(cTop);
            if (numComponentsTOP.size()==5)
                break;
        }
        //logger.debug("{}", numComponentsTOP.toString());
        Util.updateFile(Util.joinPath(filename, "JN-diagram-top5.txt"), String.format("%s\n", numComponentsTOP.toString()));
        
        
    }
}
