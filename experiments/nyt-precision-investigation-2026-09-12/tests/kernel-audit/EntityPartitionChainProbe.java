package org.ucb.generative_ie.mh;

import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.mcmc.MentionRV;
import org.ucb.generative_ie.world.*;

/** Exact 38-state chain, four distinct mentions with unequal noun observations, N<=4. */
public final class EntityPartitionChainProbe {
    static final double ALPHA=.3;
    static final List<int[]> PARTITIONS=new ArrayList<>();
    static final List<int[]> STATES=new ArrayList<>();
    static final Map<String,Integer> INDEX=new HashMap<>();
    static int[] observed={0,0,1,1};
    static void partitions(int[] a,int i,int max) {
        if(i==a.length) {PARTITIONS.add(a.clone());return;}
        for(int v=0;v<=max+1;v++) {a[i]=v;partitions(a,i+1,Math.max(max,v));}
    }
    static World world(int[] state) {
        int n=state[0]; Entities es=new Entities(2);
        while(es.sizeCurrent()<n)es.addNewEntity();while(es.sizeCurrent()>n)es.removeEntity(es.asList().get(es.sizeCurrent()-1));
        World w=new WorldGenerator(new Random(9),es,Relations.defaultRelations(1),NounLexicon.defaultNounLexicon(2),Lexicon.defaultLexicon(1),ALPHA,.3,new ConstantSparsityGenerator(.1),0).emptyWorld();
        List<Entity> entities=es.asList();
        for(int i=0;i<2;i++) {
            Fact f=new Fact(w.getRelations().asList().get(0),entities.get(state[1+2*i]),entities.get(state[2+2*i]));
            if(!w.getFacts().exists(f))w.getFacts().add(f);
            w.getSentences().add(new Sentence(f,w.getWeightedLexicons().getLex().get(0),w.getWeightedNounLexicons().getNounLexicon().get(observed[2*i]),w.getWeightedNounLexicons().getNounLexicon().get(observed[2*i+1])));
        }
        return w;
    }
    static String key(World w) {
        Map<Entity,Integer> blocks=new HashMap<>();int[] state=new int[5];state[0]=w.getNumEntities();int i=1;
        for(Mention m:w.getSentences().getMentions()) {if(!blocks.containsKey(m.getEntity()))blocks.put(m.getEntity(),blocks.size());state[i++]=blocks.get(m.getEntity());}
        return Arrays.toString(state);
    }
    static int noun(World w,Noun x) {return x.equals(w.getWeightedNounLexicons().getNounLexicon().get(0))?0:1;}
    static int[] counts(World w,Entity e) {int[] c=new int[2];for(Mention m:w.getSentences().getMentions())if(m.getEntity().equals(e))c[noun(w,m.getNoun())]++;return c;}
    static double rising(double a,int n) {double x=0;for(int i=0;i<n;i++)x+=Math.log(a+i);return x;}
    static double logDictionary(int[] c) {return rising(ALPHA,c[0])+rising(ALPHA,c[1])-rising(2*ALPHA,c[0]+c[1]);}
    static HashMap<Entity,Double> selection(World w,boolean inverse) {
        HashMap<Entity,Double> weights=new HashMap<>();
        for(Entity e:w.getEntities())weights.put(e,Math.exp((inverse?-1:1)*logDictionary(counts(w,e))));return weights;
    }
    static double probability(HashMap<Entity,Double> weights,Entity e) {double s=0;for(double v:weights.values())s+=v;return weights.get(e)/s;}
    static double midpoint(HashMap<Entity,Double> weights,Entity e) {double total=0,previous=0;for(double v:weights.values())total+=v;for(Map.Entry<Entity,Double> x:weights.entrySet()){if(x.getKey().equals(e))return(previous+x.getValue()/2)/total;previous+=x.getValue();}throw new AssertionError();}
    static double[][] kernel(boolean smartSplit,boolean correction) {
        int size=STATES.size();double[][] p=new double[size][size];
        for(int from=0;from<size;from++) {
            int[] state=STATES.get(from);World original=world(state);int n=state[0];
            HashMap<Entity,Double> parentWeights=selection(original,smartSplit);
            List<Entity> entities=original.getEntities().asList();
            for(Entity parent:entities) {
                List<Mention> ms=new ArrayList<>(original.getSentences().getMentionsByEntity(parent));Collections.sort(ms);int m=ms.size();
                for(int mask=0;mask<(1<<m);mask++) {
                    boolean[] bs=new boolean[m+1];bs[0]=true;double[] ds=new double[m+1];ds[0]=midpoint(parentWeights,parent);
                    int[] first=new int[2],second=new int[2];int totalFirst=0,totalSecond=0;double allocation=1;
                    int[] all=counts(original,parent);int distinct=(all[0]>0?1:0)+(all[1]>0?1:0);
                    for(int j=0;j<m;j++) {
                        int noun=noun(original,ms.get(j).getNoun());boolean toFirst=(mask&(1<<j))!=0;bs[j+1]=toFirst;
                        double pf=(10*ALPHA+first[noun])/(distinct*10*ALPHA+totalFirst);
                        double ps=(10*ALPHA+second[noun])/(distinct*10*ALPHA+totalSecond);double pFirst=pf/(pf+ps);
                        ds[j+1]=toFirst?pFirst/2:pFirst+(1-pFirst)/2;
                        allocation*=smartSplit?(toFirst?pFirst:1-pFirst):.5;
                        if(toFirst){first[noun]++;totalFirst++;}else{second[noun]++;totalSecond++;}
                    }
                    transition(p,from,world(state),smartSplit,correction,new EntityProjectedChainProbe.Draws(bs,ds,new int[0]),.5*probability(parentWeights,parent)*allocation);
                }
            }
            if(n==1){p[from][from]+=.5;continue;}
            List<Entity> randomOrder=original.getEntities().getRandomEntities().asList();
            HashMap<Entity,Double> firstWeights=selection(original,false);
            for(Entity first:entities)for(Entity second:entities)if(!first.equals(second)) {
                HashMap<Entity,Double> secondWeights=new HashMap<>();int[] cf=counts(original,first);
                for(Entity e:entities)if(!e.equals(first)){int[] c=counts(original,e);secondWeights.put(e,Math.exp(logDictionary(new int[]{cf[0]+c[0],cf[1]+c[1]})));}
                double q=smartSplit?.5/n/(n-1):.5*probability(firstWeights,first)*probability(secondWeights,second);
                EntityProjectedChainProbe.Draws rng=new EntityProjectedChainProbe.Draws(new boolean[]{false},new double[]{midpoint(firstWeights,first),midpoint(secondWeights,second)},new int[]{randomOrder.indexOf(first),randomOrder.indexOf(second)});
                transition(p,from,world(state),smartSplit,correction,rng,q);
            }
        }
        checkRows(p);return p;
    }
    static void transition(double[][] p,int from,World w,boolean smartSplit,boolean correction,Random rng,double q) {
        int old=w.getNumEntities();MHProposal proposal=smartSplit?new EntitySmartSplitStep(w).createProposal():new EntitySmartMergeStep(w).createProposal();
        proposal.sample(rng);if(proposal.isNull()){p[from][from]+=q;return;}
        double log=proposal.logStateRatio()+proposal.logProposalRatio();proposal.applyProposal();Integer to=INDEX.get(key(w));
        if(to==null){p[from][from]+=q;return;}
        if(correction)log+=w.getNumEntities()>old?Math.log(old+1):-Math.log(old);
        double a=Math.exp(Math.min(0,log));p[from][to]+=q*a;p[from][from]+=q*(1-a);
    }
    static double[][] gibbs() {
        double[][] p=new double[STATES.size()][STATES.size()];
        for(int from=0;from<STATES.size();from++)for(int m=0;m<4;m++){
            World original=world(STATES.get(from));Mention mention=original.getSentences().getMentions().get(m);int word=noun(original,mention.getNoun());
            HashMap<Entity,Double> weights=new HashMap<>();
            for(Entity e:original.getEntities()){int[] c=counts(original,e);if(e.equals(mention.getEntity()))c[word]--;weights.put(e,(c[word]+ALPHA)/(c[0]+c[1]+2*ALPHA));}
            for(Entity e:original.getEntities()){
                World w=world(STATES.get(from));new MentionRV(w,w.getSentences().getMentions().get(m)).sample(new EntityProjectedChainProbe.Draws(new boolean[0],new double[]{midpoint(weights,e)},new int[0]));
                p[from][INDEX.get(key(w))]+=.25*probability(weights,e);
            }
        }
        checkRows(p);return p;
    }
    static void checkRows(double[][] p){for(double[] row:p){double sum=0;for(double x:row)sum+=x;if(Math.abs(sum-1)>3e-13)throw new AssertionError("row mass "+sum);}}
    static double[] target(boolean divided){double[] p=new double[STATES.size()];double sum=0;for(int i=0;i<p.length;i++){World w=world(STATES.get(i));int n=w.getNumEntities(),k=w.getSentences().getNonEmptyEntitySize();double log=Math.log(w.getEntities().getLogNormalEntityDensity(n))-4*Math.log(n);for(int j=0;j<k;j++)log+=Math.log(n-j);for(Entity e:w.getEntities())log+=logDictionary(counts(w,e));if(divided)for(int j=2;j<=n;j++)log-=Math.log(j);p[i]=Math.exp(log);sum+=p[i];}for(int i=0;i<p.length;i++)p[i]/=sum;return p;}
    static double balance(double[][] p,double[] pi){double residual=0;for(int i=0;i<pi.length;i++)for(int j=0;j<pi.length;j++)residual=Math.max(residual,Math.abs(pi[i]*p[i][j]-pi[j]*p[j][i]));return residual;}
    public static void main(String[] args) {
        partitions(new int[4],1,0);for(int[] part:PARTITIONS){int k=1;for(int v:part)k=Math.max(k,v+1);for(int n=k;n<=4;n++){int[] state=new int[5];state[0]=n;System.arraycopy(part,0,state,1,4);INDEX.put(Arrays.toString(state),STATES.size());STATES.add(state);}}
        if(STATES.size()!=38)throw new AssertionError("state enumeration "+STATES.size());
        boolean actualFix=args.length>0&&args[0].equals("--actual-fix");
        for(int[] words:new int[][]{{0,0,1,1},{0,1,0,1},{0,0,0,1}}){
            observed=words;double[] stated=target(false),implicit=target(true);double[][] g=gibbs();if(balance(g,stated)>3e-13)throw new AssertionError("Gibbs target mismatch");
            for(boolean smart:new boolean[]{true,false}){
                double[][] old=kernel(smart,false);double wrong=balance(old,stated),right=balance(old,implicit);
                if(actualFix){if(wrong>3e-13)throw new AssertionError("actual fix mismatch "+wrong);}
                else {if(right>3e-13)throw new AssertionError("implicit target mismatch "+right);if(wrong<1e-3)throw new AssertionError("missing expected baseline error");}
                double[][] fixed=actualFix?old:kernel(smart,true);double residual=balance(fixed,stated);if(residual>3e-13)throw new AssertionError("corrected target mismatch "+residual);
                System.out.println("PASS words="+Arrays.toString(words)+", kernel="+(smart?"smart-split":"smart-merge")+", source="+(actualFix?"actual isolated fix":"baseline")+", residual to stated="+wrong+", to pi/N!="+right+", corrected residual="+residual);
            }
        }
        System.out.println("ALL PASS: 38 exact states per vocabulary observation pattern, every parent/allocation/ordered merge/Gibbs outcome, normalized transition rows, all empty-object transitions, both actual proposal classes.");
    }
}
