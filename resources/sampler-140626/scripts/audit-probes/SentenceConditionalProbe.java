import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.mcmc.*;
import org.ucb.generative_ie.world.*;
public class SentenceConditionalProbe {
 public static void main(String[] args) {
  Entities ents=Entities.defaultEntities(1);Relations rels=Relations.defaultRelations(3);
  NounLexicon nouns=NounLexicon.defaultNounLexicon(1);Lexicon lex=Lexicon.defaultLexicon(2);
  World w=new WorldGenerator(new Random(7),ents,rels,nouns,lex,1,1,new ConstantSparsityGenerator(.5),0).emptyWorld();
  Entity e=ents.asList().get(0);List<Fact> facts=new ArrayList<>();
  for(Relation r:rels){Fact f=new Fact(r,e,e);facts.add(f);w.getFacts().add(f);}
  Sentence s=new Sentence(facts.get(0),lex.get(0),nouns.get(0),nouns.get(0));w.getSentences().add(s);
  SentenceOriginRV step=new SentenceOriginRV(w,s);System.out.println("weights="+step.relationLogWeights());
  for(Fact f:facts){s.setOrigin(f);System.out.println(f.getRel()+" joint="+new WorldProb(w).logProb());}
  Map<Relation,Integer> counts=new LinkedHashMap<>();for(Relation r:rels)counts.put(r,0);
  Random rng=new Random(4242);for(int i=0;i<30000;i++){step.sample(rng);Relation r=s.getOrigin().getRel();counts.put(r,counts.get(r)+1);}
  System.out.println("observed="+counts+"; expected approximately10000 each");
  for(int count:counts.values())if(Math.abs(count-10000)>500)throw new AssertionError("Equal joint probabilities must produce uniform draws: "+counts);
  System.out.println("All current sentence sampling assertions passed.");
 }
}
