package org.ucb.generative_ie.experiments;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * The configuration of the model
 */
public final class ConfigParser {
    public int numEnts;
    public int numRels;
    public double alpha;
    public double beta;
    public double sparsity;
    public int numIterations;
    
    public ConfigParser(String configFile){
        FileReader reader;
        try {
            reader = new FileReader(configFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        load(reader);
    }
    
    public void load(FileReader reader) {
        Gson configGson = new Gson();
        Configuration config = configGson.fromJson(reader, Configuration.class);
        
        this.numEnts = config.numEnts;
        this.numRels =  config.numRels;
        this.alpha = config.alpha;
        this.beta = config.beta;
        this.sparsity = config.sparsity;
        this.numIterations = config.numIterations;
    }
    
    public void showConfig() {
        StringBuilder output = new StringBuilder();
        
        output.append("The configuration:\n");
        output.append(String.format("  Number of Entity: %d\n", this.numEnts));
        output.append(String.format("  Number of Relations: %d\n", this.numRels));
        output.append(String.format("  Prior for Entities: %f\n", this.alpha));
        output.append(String.format("  Prior for Relation: %f\n", this.beta));
        output.append(String.format("  Sparsity of facts: %f\n", this.sparsity));
        output.append(String.format("  Number of Iterations: %d\n", this.numIterations));
        
        output.append("================================================================\n");
        
        System.out.print(output);
    }
    
    class Configuration {
        public int numEnts;
        public int numRels;
        public int numIterations;
        public double alpha;
        public double beta;
        public double sparsity;
    }
}
