package org.ucb.generative_ie.experiments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;

import org.ucb.generative_ie.world.Lexicon;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Nouns;
import org.ucb.generative_ie.world.SentenceEvidence;
import org.ucb.generative_ie.world.Trigger;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import org.ucb.generative_ie.world.NounLexicon;


public class CorpusParser {

    private Lexicon lexicon;
    private NounLexicon nounLexicon;
    private Nouns nouns;
    private SentenceEvidence evidence;
    
    public CorpusParser(String str) {
        FileReader reader;
        try {
            reader = new FileReader(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        load(reader);
    }
    
    public CorpusParser(FileReader reader) {
        load(reader);
    }
    
    /**
     * Load from file the Nouns, Lexicon and SentenceEvidence
     * @param reader
     */
    private void load(FileReader reader)
    {
        Gson gson = new Gson();
        
        Wrapper wrapper = gson.fromJson(reader, Wrapper.class);
        
        evidence = new SentenceEvidence();
        
        Set<Noun> nounSet = Sets.newHashSet();
        Set<Trigger> trigSet = Sets.newHashSet();
        for (Tuple t : wrapper.sentences) {
            nounSet.add(new Noun(t.source));
            nounSet.add(new Noun(t.dest));
            
            trigSet.add(new Trigger(t.depPath));
        }
        
        lexicon = new Lexicon(trigSet);
        nounLexicon = new NounLexicon(nounSet);
        nouns = new Nouns(nounSet);
        
        for (Tuple t : wrapper.sentences) {
            evidence.addConstraint(nouns.get(t.source), nouns.get(t.dest), lexicon.getCanonical(t.depPath));
        }
    }
    
    public Lexicon getLexicon()
    {
        return lexicon;
    }
    
    public NounLexicon getNounLexicon()
    {
        return nounLexicon;
    }
    
    public Nouns getNouns()
    {
        return nouns;
    }
    
    public SentenceEvidence getEvidence()
    {
        return evidence;
    }
    
    public void show(){
        StringBuilder output = new StringBuilder();
        
        output.append("The evidence in corpus:\n");
        output.append(String.format("  Size of nouns: %d\n", this.nouns.size()));
        output.append(String.format("  Size of lexicons: %d\n", this.lexicon.size()));
        output.append(String.format("  Number of argument pairs: %d\n", this.evidence.uniqueArgs().size()));
        output.append(String.format("  Number of sentences: %d\n", this.evidence.numSentences()));
       
        output.append("================================================================\n");
        
        System.out.print(output);
    }
}

class Wrapper {
    public Tuple[] sentences;
}

class Tuple {
    public String source;
    public String dest;
    public String depPath;
}
