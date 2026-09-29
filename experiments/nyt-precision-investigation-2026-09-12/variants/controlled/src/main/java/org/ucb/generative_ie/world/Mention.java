package org.ucb.generative_ie.world;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ucb.generative_ie.world.Mentions;
import org.ucb.generative_ie.world.Noun;


/**
 * One Mention refers to how an Entity is expressed by a Noun
 */
public class Mention implements Comparable <Mention>{
    
    private Entity entity;
    private final Noun noun;
    private Mentions delegate;
    private Sentence sentence;
    private MentionPosition mentionPos;
    private int mentionId;
    
    private final static Logger logger = LoggerFactory.getLogger(Mention.class);
    public Mention(Entity entity, Noun noun){
        super();
        this.entity = entity;
        this.noun = noun;
    }
    
    public Mention(Mention mention) {
        this.entity = mention.entity;
        this.noun = mention.noun;
        this.mentionId = mention.mentionId;
    }
    
    /**
     * @return the delegate
     */
    public Object getDelegate(){
        return delegate;
    }
    
    /**
     * @param delegate the delegate to set
     */
    public void setDelegate(Mentions delegate) {
        this.delegate = delegate;
    }
    
    public Object getSentence() {
        return sentence;
    }
    
    public void setSentence(Sentence sentence, MentionPosition mentionPos) {
        this.sentence = sentence;
        this.mentionPos = mentionPos;
        this.mentionId =  sentence.getSentenceId() * 2 + (mentionPos == MentionPosition.SOURCE_ARG ? 0 :1);
        logger.debug("mentionID {} {}", this.mentionId, this.toString());
    }
    
    public Entity getEntity(){
        return entity;
    }  

    /** Record the entity this mention now refers to, without touching the sentence (used by Sentences.update). */
    void assignEntity(Entity entity) {
        this.entity = entity;
    }
    
    public void setEntity(Entity entity){
        //Entity oldEntity = this.entity;

        this.entity = entity;
        
        //if (delegate != null)
        //    delegate.update(this, oldEntity);
        
        if (sentence != null) {
            sentence.setMention(mentionPos, entity);
        }
    }
    
    public Noun getNoun(){
        return noun;
    }
    
    @Override
    public String toString() {
        //return noun.toString();
        return "Mention [Entity=" + entity + ", Nouns=" + noun + ", id=" + mentionId + "]";
    }
    
    public MentionPosition getMentionPosition() {
        return mentionPos;
    }
    
    public int getMentionId() {
        return mentionId;
    }
    //@Override
    //public int hashCode() {
    //    final int prime = 31;
    //    int result = 1;
    //    result = prime * result + ((entity== null) ? 0 : entity.hashCode());
    //    result = prime * result + ((noun == null) ? 0 : noun.hashCode());
    //    return result;
    //}
//
    //@Override
    //public boolean equals(Object obj) {
    //    if (this == obj)
    //        return true;
    //    if (obj == null)
    //        return false;
    //    if (getClass() != obj.getClass())
    //        return false;
    //    Mention other = (Mention) obj;
    //    if (entity == null) {
    //        if (other.entity != null)
    //            return false;
    //    } else if (!entity.equals(other.entity))
    //        return false;
    //    if (noun == null) {
    //        if (other.noun != null)
    //            return false;
    //    } else if (!noun.equals(other.noun))
    //        return false;
    //    return true;
    //}

    @Override
    public int compareTo(Mention t) {
        return this.mentionId - t.mentionId;
    }
}
enum MentionPosition {
    SOURCE_ARG, DEST_ARG
}