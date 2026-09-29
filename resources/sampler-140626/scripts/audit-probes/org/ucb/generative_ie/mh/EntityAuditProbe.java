package org.ucb.generative_ie.mh;
import java.util.*;
import org.ucb.generative_ie.world.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.util.*;
public class EntityAuditProbe {
 static void check(boolean condition, String message) {
  if (!condition) throw new AssertionError(message);
 }
 static void close(double expected, double actual, String message) {
  if (!Double.isFinite(actual) || Math.abs(expected-actual)>1e-12)
   throw new AssertionError(message+": expected="+expected+", actual="+actual);
 }
 static class ModeRandom extends Random { final boolean split; ModeRandom(boolean s){super(17);split=s;} public boolean nextBoolean(){return split;} }
 static World empty(int n) {
  return new WorldGenerator(new Random(1),Entities.defaultEntities(n),Relations.defaultRelations(1),NounLexicon.defaultNounLexicon(2),Lexicon.defaultLexicon(1),0.1,0.1,new ConstantSparsityGenerator(0.1),0).emptyWorld();
 }
 static class ProperSplitRandom extends Random { int b=0; public boolean nextBoolean(){return b++<2;} }
 public static void main(String[] args) {
  LogProbMap<String> p=new LogProbMap<String>();p.multiplyLogKey("a",0);p.multiplyLogKey("b",0);p.normalize();
  double probabilitySum=Math.exp(p.probKey("a"))+Math.exp(p.probKey("b"));
  close(1,probabilitySum,"Normalized probabilities must sum to one");
  close(0.5,Math.exp(p.probKey("a")),"Equal weights must have equal probability");
  close(0.5,Math.exp(p.probKey("b")),"Equal weights must have equal probability");
  System.out.printf("LOGMAP two unit weights: norm=%s sum=%s expected=1%n",p.getNorm(),probabilitySum);
  for(boolean smartSplit:new boolean[]{true,false}) {
   World w=empty(2);MHProposal q=(smartSplit?new EntitySmartSplitStep(w):new EntitySmartMergeStep(w)).createProposal();q.sample(new ModeRandom(true));
   check(q.isNull(),"Splitting a selected empty entity must be null");
   double before=new WorldProb(w).logProbLabeledEntityWorld();double ratio=q.stateRatio(),proposal=q.proposalRatio();int oldN=w.getNumEntities();q.applyProposal();
   double actual=Math.exp(new WorldProb(w).logProbLabeledEntityWorld()-before);
   check(oldN==w.getNumEntities(),"A null split must not create an entity");
   close(1,ratio,"Null split stored state ratio");
   close(1,actual,"Null split must leave the entity target unchanged");
   close(0,proposal,"Null split proposal ratio");
   System.out.printf("EMPTY %s: null=%s N=%s->%s storedStateRatio=%s actualStateRatio=%s proposalRatio=%s%n",smartSplit?"smartSplit":"smartMerge",q.isNull(),oldN,w.getNumEntities(),ratio,actual,proposal);
  }
  World one=empty(1);Entity oe=one.getEntities().asList().get(0);Fact of=new Fact(one.getRelations().asList().get(0),oe,oe);one.getFacts().add(of);one.getSentences().add(new Sentence(of,one.getWeightedLexicons().getLex().get(0),one.getWeightedNounLexicons().getNounLexicon().get(0),one.getWeightedNounLexicons().getNounLexicon().get(1)));
  MHProposal proper=new EntitySmartMergeStep(one).createProposal();proper.sample(new ProperSplitRandom());
  check(!proper.isNull(),"A proper singleton-population split must be available");
  // The split has probability 1/2 and its only reverse merge has probability one.
  close(2,proper.proposalRatio(),"Proper split reverse smart-merge ratio");
  close(2,proper.proposalRatio(),"Repeated proposal ratio must be unchanged");
  System.out.printf("SMARTMERGE singleton-population proper split: codeProposalRatio=%.15f expected=2.0%n",proper.proposalRatio());
  World w=empty(2);List<Entity>
 es=w.getEntities().asList();Relation r=w.getRelations().asList().get(0);
  Fact f=new Fact(r,es.get(0),es.get(1));w.getFacts().add(f);w.getSentences().add(new Sentence(f,w.getWeightedLexicons().getLex().get(0),w.getWeightedNounLexicons().getNounLexicon().get(0),w.getWeightedNounLexicons().getNounLexicon().get(1)));
  EntitySmartSplitStep.EntitySmartSplitProposal q=new EntitySmartSplitStep(w).new EntitySmartSplitProposal(w);q.sample(new ModeRandom(false));
  check(!q.isNull(),"The two nonempty entities must be mergeable");
  // There is one possible merge; reverse A|B allocation has probability 2*(1/2)*(3/5).
  double ratio=q.proposalRatio();
  close(0.6,ratio,"Merge reverse inverse-likelihood split ratio");
  close(0.6,q.proposalRatio(),"Repeated proposal ratio must be unchanged");
  System.out.printf("MERGE inverse-sign: codeProposalRatio=%.15f expected=0.6 factor=%.15f%n",ratio,0.6/ratio);
  System.out.println("All current entity audit assertions passed.");
 }
}
