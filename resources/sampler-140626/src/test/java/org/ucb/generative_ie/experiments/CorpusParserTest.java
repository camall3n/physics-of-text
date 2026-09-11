package org.ucb.generative_ie.experiments;

import java.io.File;
import org.ucb.generative_ie.world.Nouns;

import org.junit.Before;
import org.junit.Test;

//import gems.cli.CliParserImpl;

public class CorpusParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
            //CorpusParser parser = new CorpusParser("/home/wei/Work/PLUIE/Experiments/pluie/bootstrap_inference/sampler/data/Umass-sub-corpus/pluieTriples_2013_01_06_2.json");
	    ////CorpusParser parser = new CorpusParser("/Users/Justin/Documents/pluieTriples_2013_01_06_2.json");
//
            //parser.getLexicon();
            //Nouns nouns = parser.getNouns();
            System.out.println("OK");
            String filename="output/d1/d2";
            boolean success = (new File(filename)).mkdirs();
            if (success) {
                System.out.println("Directory: " + filename + "created");
            }
            else {
                System.out.println("Directory not created");
            }
        }  

}
