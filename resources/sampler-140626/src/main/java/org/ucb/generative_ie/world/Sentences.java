package org.ucb.generative_ie.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sentences implements Iterable<Sentence> {

    private final ArrayList<Sentence> sentences;
    private final ArrayList<Mention> mentions;
    
    private final ArrayListMultimap<Fact, Sentence> sentencesToFact;
    private final ArrayListMultimap<Entity, Sentence> sentencesToSourceEntity;
    private final ArrayListMultimap<Entity, Sentence> sentencesToDestEntity;
    private final ArrayListMultimap<Relation, Sentence> sentencesToRelation;
    
    private final Entities entities;
    private final Map<Entity, Multiset <Noun>> nounHistograms;
    private final ArrayListMultimap<Entity, Mention> mentionsToEntity;
    
    private final Relations relations;
    private final Map<Relation, Multiset<Trigger>> triggerHistograms;

    private final static Logger logger = LoggerFactory.getLogger(Sentences.class);
    public Sentences(Entities entities, Relations relations) {
        this.entities = entities;
        this.relations = relations;
        
        sentences = Lists.newArrayList();
        sentencesToFact = ArrayListMultimap.create();
        sentencesToSourceEntity = ArrayListMultimap.create();
        sentencesToDestEntity = ArrayListMultimap.create();
        sentencesToRelation = ArrayListMultimap.create();
        mentionsToEntity = ArrayListMultimap.create();

        mentions = Lists.newArrayList();
        
        nounHistograms = Maps.newHashMap();
        triggerHistograms = Maps.newHashMap();
        createNounHistograms();
        createTriggerHistograms();
    }

    /**
     * Initialize the Noun histogram for each Entity.
     */
    private void createNounHistograms() {
        for (Entity e : entities) {
            Multiset <Noun> hist = HashMultiset.create();
            nounHistograms.put(e, hist);
        }
        
        //Multiset <Noun> hist = HashMultiset.create();
        //nounHistograms.put(null, hist);
    }
    
    /**
     * Initialize the Trigger histogram for each Relation.
     */
    private void createTriggerHistograms() {
        for (Relation r : relations) {
            Multiset<Trigger> hist = HashMultiset.create();
            triggerHistograms.put(r, hist);
        }

        //Multiset<Trigger> hist = HashMultiset.create();
        //triggerHistograms.put(null, hist);
    }
    
    /**
     * update the nounHistograms
     * @param nHistograms
     * @param entity
     * @param noun 
     */
    private void updateNounHistograms(Map <Entity, Multiset <Noun>> nHistograms, Entity entity, Noun noun) {
        if (!nHistograms.containsKey(entity)){
            Multiset <Noun> hist = HashMultiset.create();
            nHistograms.put(entity, hist);
        }
        nHistograms.get(entity).add(noun);
    }
    /**
     * ?? what are sentencePairs 
     * @return 
     */
    public Set<UnorderedSentencePair> sentencePairs() {
        Set<UnorderedSentencePair> result = Sets.newHashSet();

        for (Sentence s1 : sentences) {
            for (Sentence s2 : sentences) {
                result.add(new UnorderedSentencePair(s1, s2));
            }
        }

        return result;
    }

    public void add(Sentence s) {
        if (s == null) {
            throw new RuntimeException("null value is not allowed");
        }
        sentences.add(s);
        //s.setSentenceId();
        s.setDelegate(this);
        sentencesToFact.put(s.getOrigin(), s);
        sentencesToSourceEntity.put(s.getOrigin().getEnt1(), s);
        sentencesToDestEntity.put(s.getOrigin().getEnt2(), s);
        sentencesToRelation.put(s.getOrigin().getRel(), s);
        mentionsToEntity.put(s.getOrigin().getEnt1(), s.getSourceMention());
        mentionsToEntity.put(s.getOrigin().getEnt2(), s.getDestMention());
        
        mentions.add(s.getSourceMention());
        mentions.add(s.getDestMention());

        nounHistograms.get(s.getOrigin().getEnt1()).add(s.getArg1());
        nounHistograms.get(s.getOrigin().getEnt2()).add(s.getArg2());
        triggerHistograms.get(s.getOrigin().getRel()).add(s.getTrig());
    }

    public void update(Sentence s, Fact oldOrigin) {
        sentencesToFact.remove(oldOrigin, s);
        sentencesToFact.put(s.getOrigin(), s);

        sentencesToSourceEntity.remove(oldOrigin.getEnt1(), s);
        sentencesToDestEntity.remove(oldOrigin.getEnt2(), s);
        sentencesToSourceEntity.put(s.getOrigin().getEnt1(), s);
        sentencesToDestEntity.put(s.getOrigin().getEnt2(), s);
        
        sentencesToRelation.remove(oldOrigin.getRel(), s);
        sentencesToRelation.put(s.getOrigin().getRel(), s);

        nounHistograms.get(oldOrigin.getEnt1()).remove(s.getArg1());
        //System.out.println(String.format("fact %s\nsentence %s\nentity1 %s", s.getOrigin().toString(), s.toString(), s.getOrigin().getEnt1()));
        updateNounHistograms(nounHistograms, s.getOrigin().getEnt1(), s.getArg1());
        //nounHistograms.get(s.getOrigin().getEnt1()).add(s.getArg1());
        
        nounHistograms.get(oldOrigin.getEnt2()).remove(s.getArg2());
        //System.out.println(String.format("fact %s\nsentence %s\nentity2 %s", s.getOrigin().toString(), s.toString(), s.getOrigin().getEnt2()));
        updateNounHistograms(nounHistograms, s.getOrigin().getEnt2(), s.getArg2());
        //nounHistograms.get(s.getOrigin().getEnt2()).add(s.getArg2());
        
        triggerHistograms.get(oldOrigin.getRel()).remove(s.getTrig());
        triggerHistograms.get(s.getOrigin().getRel()).add(s.getTrig());
        
        //mentionsToEntity.get(oldOrigin.getEnt1()).remove(new Mention(oldOrigin.getEnt1(), s.getArg1()));
        //mentionsToEntity.get(oldOrigin.getEnt2()).remove(new Mention(oldOrigin.getEnt2(), s.getArg2()));
        //
        //mentionsToEntity.get(s.getOrigin().getEnt1()).add(s.getSourceMention());
        //mentionsToEntity.get(s.getOrigin().getEnt2()).add(s.getDestMention());
        //mentions.remove(new Mention(oldOrigin.getEnt1(), s.getArg1()));
        //mentions.remove(new Mention(oldOrigin.getEnt2(), s.getArg2()));
        //mentions.add(s.getSourceMention());
        //mentions.add(s.getDestMention());
    }
    
    public void updateMentions(Sentence newS, Sentence oldS) {
        //logger.debug("updating metions--------------------");
        mentionsToEntity.get(oldS.getOrigin().getEnt1()).remove(oldS.getSourceMention());
        mentionsToEntity.get(oldS.getOrigin().getEnt2()).remove(oldS.getDestMention());
        mentionsToEntity.get(newS.getOrigin().getEnt1()).add(oldS.getSourceMention());
        mentionsToEntity.get(newS.getOrigin().getEnt2()).add(oldS.getDestMention()); 
        mentions.remove(oldS.getSourceMention());
        mentions.remove(oldS.getDestMention());
        mentions.add(newS.getSourceMention());
        mentions.add(newS.getDestMention());
        
        //logger.debug("e: {} {}", oldS.getOrigin().getEnt1(), nounHistogram(oldS.getOrigin().getEnt1()));
        //logger.debug("e: {} {}", oldS.getOrigin().getEnt2(), nounHistogram(oldS.getOrigin().getEnt2()));
        //logger.debug("e: {} {}", newS.getOrigin().getEnt1(), nounHistogram(newS.getOrigin().getEnt1()));
        //logger.debug("e: {} {}", newS.getOrigin().getEnt2(), nounHistogram(newS.getOrigin().getEnt2()));
        //
        //nounHistograms.get(oldS.getOrigin().getEnt1()).remove(oldS.getSourceMention().getNoun());
        //logger.debug("removing {} {}", oldS.getOrigin().getEnt1().toString(), oldS.getSourceMention().getNoun().toString());
        //logger.debug("e: {} {}", oldS.getOrigin().getEnt1(), nounHistogram(oldS.getOrigin().getEnt1()));
//
        //updateNounHistograms(nounHistograms, newS.getOrigin().getEnt1(), newS.getSourceMention().getNoun());
        //logger.debug("adding {} {}", newS.getOrigin().getEnt1().toString(), newS.getSourceMention().getNoun().toString());
        //logger.debug("e: {} {}", newS.getOrigin().getEnt1(), nounHistogram(newS.getOrigin().getEnt1()));
        //
        //nounHistograms.get(oldS.getOrigin().getEnt2()).remove(oldS.getDestMention().getNoun());
        //logger.debug("removing {} {}", oldS.getOrigin().getEnt2().toString(), oldS.getDestMention().getNoun().toString());
        //logger.debug("e: {} {}", oldS.getOrigin().getEnt2(), nounHistogram(oldS.getOrigin().getEnt2()));
//
        //updateNounHistograms(nounHistograms, newS.getOrigin().getEnt2(), newS.getDestMention().getNoun());
        //logger.debug("adding {} {}", newS.getOrigin().getEnt2().toString(), newS.getDestMention().getNoun().toString());
        //logger.debug("e: {} {}", newS.getOrigin().getEnt2(), nounHistogram(newS.getOrigin().getEnt2()));
    }
    
    public void cleanEntity(Entity entity){
        mentionsToEntity.removeAll(entity);
        nounHistograms.remove(entity);
    }
    
    /**
     * Get the current number of non empty entities
     * @return 
     */
    public int getNonEmptyEntitySize() {
        int i = 0;
        for (Entity entity : entities.asList()) {
            if (mentionsToEntity.keys().contains(entity)) {
                i++;
            }
        }
        return i;
    }
    
    public void clear() {
        sentences.clear();
        mentions.clear();
        sentencesToFact.clear();
        sentencesToSourceEntity.clear();
        sentencesToDestEntity.clear();
        sentencesToRelation.clear();
        nounHistograms.clear();
        triggerHistograms.clear();
        createNounHistograms();
        createTriggerHistograms();
    }

    public Collection<Sentence> sentencesWithOrigin(Fact f) {
        return ImmutableList.copyOf(sentencesToFact.get(f));
    }

    public Collection<Sentence> sentencesWithSourceEntity(Entity e) {
        return ImmutableList.copyOf(sentencesToSourceEntity.get(e));
    }
    
    public Collection<Sentence> sentencesWithDestEntity(Entity e) {
        return ImmutableList.copyOf(sentencesToDestEntity.get(e));
    }
       
    public Collection<Sentence> sentencesWithRelation(Relation r) {
        return ImmutableList.copyOf(sentencesToRelation.get(r));
    }

    public double[] nounCounts(Entity e, NounLexicon nLex) {
        return nounCounts(e, nLex, 0);
    }

    public double[] nounCounts(Entity e, NounLexicon nLex, double alpha) {
        double[] alphas = new double[nLex.size()];
        Arrays.fill(alphas, alpha);

        for (Sentence sentence: sentencesWithSourceEntity(e))
        {
            int i = nLex.indexOf(sentence.getArg1());
            alphas[i] += 1;
        }
        
         for (Sentence sentence: sentencesWithDestEntity(e))
        {
            int j = nLex.indexOf(sentence.getArg2());
            alphas[j] += 1;
        }

        return alphas;
    }
    
    public Multiset<Noun> nounHistogram(Entity e) {
        if (nounHistograms.containsKey(e))
            return nounHistograms.get(e);
        else
            return HashMultiset.create();
    }
    
    public double[] triggerCounts(Relation r, Lexicon lex) {
        return triggerCounts(r, lex, 0);
    }

    public double[] triggerCounts(Relation r, Lexicon lex, double beta) {
        double[] betas = new double[lex.size()];
        Arrays.fill(betas, beta);

        for (Sentence sentence: sentencesWithRelation(r))
        {
            int i = lex.indexOf(sentence.getTrig());
            betas[i] += 1;
        }

        return betas;
    }

    public Multiset<Trigger> triggerHistogram(Relation r) {
        return triggerHistograms.get(r);
    }

    public List<Trigger> thresholdedTriggers(Multiset<Trigger> histogram, int threshold) {
        List<Trigger> thresholdedTrigs = Lists.newArrayList();
        for (Multiset.Entry<Trigger> entry : histogram.entrySet()) {
            int count = entry.getCount();
            if (count >= threshold) {
                thresholdedTrigs.add(entry.getElement());
            }
        }

        return thresholdedTrigs;
    }

    public List<Trigger> thresholdedTriggers(Relation r, int threshold) {
        return thresholdedTriggers(triggerHistogram(r), threshold);
    }

    public Sentence get(int index) {
        return sentences.get(index);
    }

    public int size() {
        return sentences.size();
    }

    @Override
    public Iterator<Sentence> iterator() {
        return sentences.iterator();
    }

    public List<Sentence> asList() {
        return sentences;
    }

    public List<Mention> getMentions() {
        return mentions;
    }
    
    public List<Mention> getMentionsByEntity(Entity entity) {
        return mentionsToEntity.get(entity);
    }
    
    public Mention getRandomMention(Random rng) {
        return mentions.get(rng.nextInt(mentions.size()));
    }
    
    /**
     * 
     * @return an ArrayList of the numbers of mentions for each entity
     */
    public ArrayList<Integer> getEntityDistribution () {
        ArrayList <Integer> entityDist= Lists.newArrayList();
        for (Entity e: this.entities) {
            int i = mentionsToEntity.get(e).size();
            if (i != 0){
                entityDist.add(i);
            }
        }
        return entityDist;
    }
    
    
    public StringBuilder showMentions() {
        StringBuilder output = new StringBuilder();
        output.append("The current mentions:\n");
        
        for (Entity entity : this.entities){
            output.append(String.format(" %s", entity.toString()));
            output.append(String.format("  %d mentions\n", getMentionsByEntity(entity).size()));
            for (Mention mention :getMentionsByEntity(entity)){
                output.append(String.format("   %s\n", mention.toString()));
                //output.append(String.format("       %s  Position: %s\n", mention.getSentence().toString(), mention.getMentionPosition().toString()));
            }
        }
        output.append("\n");
        //System.out.println(output);
        return output;
        
    }
}
