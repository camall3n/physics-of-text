package org.ucb.generative_ie.world;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sentence is about how a Fact can be expressed by two arguments and one trigger in the World.
 */
public class Sentence {
    private Fact origin;
    private final Trigger trig;
    private final Noun arg1;
    private final Noun arg2;
    private final Mention sourceMention;
    private final Mention destMention;
    
    private Sentences delegate;
    private int sentenceId;
    
    private final static Logger logger = LoggerFactory.getLogger(Sentence.class);
    
    public Sentence(Fact origin, Trigger trig, Noun arg1, Noun arg2) {
        super();
        this.origin = origin;
        this.trig = trig;
        this.arg1 = arg1;
        this.arg2 = arg2;
        setSentenceId();
        this.sourceMention = new Mention(origin.getEnt1(), arg1);
        sourceMention.setSentence(this, MentionPosition.SOURCE_ARG);
        this.destMention = new Mention(origin.getEnt2(), arg2);
        destMention.setSentence(this, MentionPosition.DEST_ARG);
    }
    
    public Sentence(Sentence s) {
        super();
        this.origin = s.origin;
        this.trig = s.trig;
        this.arg1 = s.arg1;
        this.arg2 = s.arg2;
        this.sourceMention = s.sourceMention;
        this.destMention = s.destMention;
        this.sentenceId = sentenceId;
    }

    //@Override
    //public int hashCode() {
        //final int prime = 31;
        //int result = 1;
        //result = prime * result + ((arg1 == null) ? 0 : arg1.hashCode());
        //result = prime * result + ((arg2 == null) ? 0 : arg2.hashCode());
        //result = prime * result + ((trig == null) ? 0 : trig.hashCode());
        //return result;
    //}

    //@Override
    //public boolean equals(Object obj) {
        //if (this == obj)
            //return true;
        //if (obj == null)
            //return false;
        //if (getClass() != obj.getClass())
            //return false;
        //Sentence other = (Sentence) obj;
        //if (arg1 == null) {
            //if (other.arg1 != null)
                //return false;
        //} else if (!arg1.equals(other.arg1))
            //return false;
        //if (arg2 == null) {
            //if (other.arg2 != null)
                //return false;
        //} else if (!arg2.equals(other.arg2))
            //return false;
        //if (trig == null) {
            //if (other.trig != null)
                //return false;
        //} else if (!trig.equals(other.trig))
            //return false;
        //return true;
    //}

    public String getText() {
        //return String.format("%s %s %s", origin.getEnt1().getName(), this.trig.getString(), origin.getEnt2().getName());
        return String.format("%s %s %s", this.arg1.getName(), this.trig.getString(), this.arg2.getName());
    }

    @Override
    public String toString() {
        return "Sentence [origin=" + origin.toString() + ", arg1=" + arg1 + ", arg2=" + arg2 + ", trig=" + trig + "]";
    }

    /**
     * @return the origin
     */
    public Fact getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(Fact origin) {
        Fact oldOrigin = this.origin;       

        this.origin = origin;
        //this.sourceMention.setEntity(this.origin.getEnt1());
        //this.destMention.setEntity(this.origin.getEnt2());        

        if (delegate != null) {
            delegate.update(this, oldOrigin);            
        }
    }

    /**
     * @return the trig
     */
    public Trigger getTrig() {
        return trig;
    }

    /**
     * @return the arg1
     */
    public Noun getArg1() {
        return arg1;
    }

    /**
     * @return the arg2
     */
    public Noun getArg2() {
        return arg2;
    }

    /**
     * @return the delegate
     */
    public Object getDelegate() {
        return delegate;
    }

    /**
     * @param delegate the delegate to set
     */
    public void setDelegate(Sentences delegate) {
        this.delegate = delegate;
    }

    public ArgPair getArgPair() {
        return new ArgPair(arg1, arg2);
    }

    public static Sentence nullSentence() {
    	return new Sentence(new Fact(null, null, null), Trigger.nullTrigger(), null, null);
    }
    
    public void setSentenceId() {
        this.sentenceId = SentenceEvidence.numSentencesEvidence;
        SentenceEvidence.numSentencesEvidence += 1;
        logger.debug("sentenceID {} {}", this.sentenceId, this.toString());
    }
    
    public int getSentenceId() {
        return this.sentenceId;
    }
    
    public Mention getSourceMention() {
        //Mention m = new Mention(this.origin.getEnt1(), this.arg1);
        //m.setSentence(this, MentionPosition.SOURCE_ARG);
        return sourceMention;
    }
    
    public Mention getDestMention() {
        //Mention m = new Mention(this.origin.getEnt2(), this.arg2);
        //m.setSentence(this, MentionPosition.DEST_ARG);
        return destMention;
        //return m;
    }
    
    public void setMention (MentionPosition mentionPos, Entity entity) {
        Fact newFact = new Fact(this.origin);
        switch (mentionPos) {
            case SOURCE_ARG:
                //this.sourceMention.setEntity(entity);
                //this.origin.setEnt1(entity);
                newFact.setEnt1(entity);
                break;
            case DEST_ARG:
                //this.destMention.setEntity(entity);
                //this.origin.setEnt2(entity);
                newFact.setEnt2(entity);
                break;
            default:
                throw new RuntimeException("Unhandled Mention position case" + mentionPos);
        }
        setOrigin(newFact);
    }
}