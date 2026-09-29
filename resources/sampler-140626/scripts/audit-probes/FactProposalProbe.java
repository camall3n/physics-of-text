import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.mcmc.*;
import org.ucb.generative_ie.world.*;
public class FactProposalProbe {
  static final class DeathOnlyRandom extends Random {
    DeathOnlyRandom(long seed) { super(seed); }
    public boolean nextBoolean() { return false; }
  }
  public static void main(String[] args) {
    Entities ents=Entities.defaultEntities(4);
    Relations rels=Relations.defaultRelations(1);
    NounLexicon nouns=NounLexicon.defaultNounLexicon(1);
    Lexicon lex=Lexicon.defaultLexicon(1);
    World w=new WorldGenerator(new Random(4),ents,rels,nouns,lex,1,1,new ConstantSparsityGenerator(.5),0).emptyWorld();
    Relation rel=rels.asList().get(0);
    List<Entity> ee=ents.asList();
    for(int i=0;i<9;i++) {
      Fact f=new Fact(rel,ee.get(i/4),ee.get(i%4));
      w.getFacts().add(f);
      w.getSentences().add(new Sentence(f,lex.get(0),nouns.get(0),nouns.get(0)));
    }
    Fact added=new Fact(rel,ee.get(2),ee.get(1));
    FactBirthDeathStep step=new FactBirthDeathStep(w);
    double before=new WorldProb(w).logProb();
    double alphaBirth=Math.min(1,Math.exp(step.logAcceptBirth(added)));
    w.getFacts().add(added);
    double ratio=Math.exp(new WorldProb(w).logProb()-before);
    double alphaDeath=Math.min(1,Math.exp(step.logAcceptDeath(added)));
    int F=w.getFacts().size(),U=step.numUnreferenced(),R=F-U;
    double find=1-Math.pow((double)R/F,20);
    double qBirth=.5/16;
    double qDeath=.5*find/U;
    double forward=qBirth*alphaBirth;
    double reverseWeighted=ratio*qDeath*alphaDeath;
    System.out.printf(Locale.ROOT,"F=%d R=%d U=%d targetRatio=%.12f deathSearchSuccess=%.12f%n",F,R,U,ratio,find);
    System.out.printf(Locale.ROOT,"alphaBirth=%.12f alphaDeath=%.12f normalizedForwardFlux=%.12f normalizedReverseFlux=%.12f ratio=%.12f%n",alphaBirth,alphaDeath,forward,reverseWeighted,forward/reverseWeighted);
    if(!Double.isFinite(forward)||!Double.isFinite(reverseWeighted)
        ||Math.abs(forward-reverseWeighted)>1e-12)
      throw new AssertionError("Birth/death transition flows violate detailed balance");
    DeathOnlyRandom rng=new DeathOnlyRandom(987);
    int removed=0,n=200000;
    for(int i=0;i<n;i++) {
      step.sample(rng);
      if(!w.getFacts().exists(added)) { removed++;w.getFacts().add(added); }
    }
    double measured=(double)removed/n;
    double balancedDeath=Math.min(find,1/(16*ratio));
    System.out.printf(Locale.ROOT,"conditionalDeathMeasured=%.6f actualPrediction=%.6f jointBalancePrediction=%.6f%n",measured,find*alphaDeath,balancedDeath);
    if(!Double.isFinite(balancedDeath)||Math.abs(find*alphaDeath-balancedDeath)>1e-12)
      throw new AssertionError("Death probability differs from joint density and reverse birth proposal");
    if(Math.abs(measured-find*alphaDeath)>.003)throw new AssertionError("Monte Carlo differs from actual proposal derivation");
    if(Math.abs(measured-balancedDeath)>.003)throw new AssertionError("Monte Carlo differs from detailed balance");
    System.out.println("Corrected birth/death transition probabilities verified.");
  }
}
