package org.ucb.generative_ie.mcmc;

/**
 *MCStepKind of MCMC procedure
 */
public class MCStepKind {
    private final int name;
    
    private MCStepKind(int name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return Integer.toString(name) ;
    }
    
    public static final MCStepKind ALL_FACT = new MCStepKind(0);
    public static final MCStepKind SENTENCE_ORIGIN = new MCStepKind(1);
    public static final MCStepKind MENTION = new MCStepKind(2);
    public static final MCStepKind WEIGHTED_LEXICON = new MCStepKind(3);
}
