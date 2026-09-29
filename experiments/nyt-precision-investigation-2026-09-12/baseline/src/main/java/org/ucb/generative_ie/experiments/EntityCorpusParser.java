package org.ucb.generative_ie.experiments;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Set;
import org.ucb.generative_ie.world.LNouns;
import org.ucb.generative_ie.world.Noun;
import org.ucb.generative_ie.world.Nouns;

public class EntityCorpusParser {
    private LNouns lNouns;
    private Nouns nouns;

    public EntityCorpusParser(String str) {
        FileReader reader;
        try {
            reader = new FileReader(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        load(reader);
    }

    public EntityCorpusParser(FileReader reader) {
        load(reader);
    }

    /**
     * Load from file the Nouns, Lexicon and SentenceEvidence
     * @param reader 
     */
    private void load(FileReader reader) {
        Gson gson = new Gson();

        Wrapper wrapper = gson.fromJson(reader, Wrapper.class);

        List <Noun> nounList = Lists.newArrayList();
        Set<Noun> nounSet = Sets.newHashSet();
        for (Tuple t : wrapper.sentences) {
            nounList.add(new Noun(t.source));
            nounList.add(new Noun(t.dest));
            nounSet.add(new Noun(t.source));
            nounSet.add(new Noun(t.dest));
        }
        
        nouns = new Nouns(nounSet);
        //System.out.println(nouns);
        lNouns = new LNouns(nounList);
    }

    public LNouns getLNouns()
    {
        return lNouns;
    }
    
    public Nouns getNouns() {
        return nouns;
    }
}
