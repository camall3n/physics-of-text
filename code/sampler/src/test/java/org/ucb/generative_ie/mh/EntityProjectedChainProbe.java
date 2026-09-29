package org.ucb.generative_ie.mh;

import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.mcmc.MentionRV;
import org.ucb.generative_ie.world.*;

/** Exact finite-state projection: two mentions, one noun, N<=4; enumerates actual proposal objects. */
public final class EntityProjectedChainProbe {
    static final int[][] STATES={{1,1},{2,1},{2,2},{3,1},{3,2},{4,1},{4,2}};
    static class Draws extends Random {
        boolean[] bs; double[] ds; int[] is; int b=0,d=0,i=0;
        Draws(boolean[] bs,double[] ds,int[] is) { this.bs=bs;this.ds=ds;this.is=is; }
        @Override public boolean nextBoolean() { return bs[b++]; }
        @Override public double nextDouble() { return ds[d++]; }
        @Override public int nextInt(int bound) { int x=is[i++]; if(x>=bound) throw new AssertionError("bad discrete draw"); return x; }
    }
    static World world(int n,int k) {
        Entities entities=new Entities(2); while(entities.sizeCurrent()<n) entities.addNewEntity();
        while(entities.sizeCurrent()>n) entities.removeEntity(entities.asList().get(entities.sizeCurrent()-1));
        World w=new WorldGenerator(new Random(1),entities,Relations.defaultRelations(1),NounLexicon.defaultNounLexicon(1),Lexicon.defaultLexicon(1),.3,.3,new ConstantSparsityGenerator(.1),0).emptyWorld();
        List<Entity> es=entities.asList(); Fact f=new Fact(w.getRelations().asList().get(0),es.get(0),es.get(k-1)); w.getFacts().add(f);
        w.getSentences().add(new Sentence(f,w.getWeightedLexicons().getLex().get(0),w.getWeightedNounLexicons().getNounLexicon().get(0),w.getWeightedNounLexicons().getNounLexicon().get(0))); return w;
    }
    static int index(World w) {
        for(int i=0;i<STATES.length;i++) if(STATES[i][0]==w.getNumEntities()&&STATES[i][1]==w.getSentences().getNonEmptyEntitySize()) return i;
        return -1;
    }
    static double[][] kernel(boolean smartSplit,boolean correction) {
        double[][] out=new double[7][7];
        for(int from=0;from<7;from++) {
            int n=STATES[from][0],k=STATES[from][1];
            for(int parent=0;parent<n;parent++) for(int mask=0;mask<4;mask++) {
                boolean x=(mask&1)!=0,y=(mask&2)!=0;
                Draws rng=new Draws(new boolean[]{true,x,y},new double[]{(parent+.5)/n,x?.75:.25,y?.75:.25},new int[0]);
                transition(out,from,world(n,k),smartSplit,correction,rng,.5/n/4);
            }
            if(n==1) out[from][from]+=.5;
            else for(int first=0;first<n;first++) for(int second=0;second<n;second++) if(first!=second) {
                int conditionalIndex=second<first?second:second-1;
                Draws rng=new Draws(new boolean[]{false},new double[]{(first+.5)/n,(conditionalIndex+.5)/(n-1)},new int[]{first,second});
                transition(out,from,world(n,k),smartSplit,correction,rng,.5/n/(n-1));
            }
        }
        checkRows(out); return out;
    }
    static void transition(double[][] out,int from,World w,boolean smartSplit,boolean correction,Random rng,double q) {
        MHProposal p=smartSplit?new EntitySmartSplitStep(w).createProposal():new EntitySmartMergeStep(w).createProposal();
        int oldN=w.getNumEntities(); p.sample(rng);
        if(p.isNull()) {out[from][from]+=q; return;}
        double ratio=p.logStateRatio()+p.logProposalRatio(); p.applyProposal();
        int to=index(w);
        if(to<0) {out[from][from]+=q;return;} // hard truncation N<=4, same for both directions
        if(correction) ratio+=w.getNumEntities()>oldN?Math.log(oldN+1):-Math.log(oldN);
        double a=Math.exp(Math.min(0,ratio)); out[from][to]+=q*a; out[from][from]+=q*(1-a);
    }
    static double[][] gibbs() {
        double[][] out=new double[7][7];
        for(int from=0;from<7;from++) {
            int n=STATES[from][0],k=STATES[from][1];
            for(int m=0;m<2;m++) for(int choice=0;choice<n;choice++) {
                World w=world(n,k);
                new MentionRV(w,w.getSentences().getMentions().get(m)).sample(new Draws(new boolean[0],new double[]{(choice+.5)/n},new int[0]));
                out[from][index(w)]+=1.0/(2*n);
            }
        }
        checkRows(out); return out;
    }
    static void checkRows(double[][] p) {for(double[] row:p) {double sum=0;for(double v:row)sum+=v;if(Math.abs(sum-1)>2e-14)throw new AssertionError("row mass "+sum);}}
    static double factorial(int n) {double f=1;for(int i=2;i<=n;i++)f*=i;return f;}
    static double[] target(boolean divideFactorial) {
        double[] pi=new double[7];double total=0;
        for(int i=0;i<7;i++) {int n=STATES[i][0],k=STATES[i][1];double multiplicity=k==1?n:n*(n-1);pi[i]=world(n,k).getEntities().getLogNormalEntityDensity(n)*multiplicity/(n*n);if(divideFactorial)pi[i]/=factorial(n);total+=pi[i];}
        for(int i=0;i<7;i++)pi[i]/=total;return pi;
    }
    static double balance(double[][] p,double[] pi) {double max=0;for(int i=0;i<7;i++)for(int j=0;j<7;j++)max=Math.max(max,Math.abs(pi[i]*p[i][j]-pi[j]*p[j][i]));return max;}
    static double[][] average(double[][]... ps) {double[][] p=new double[7][7];for(double[][] x:ps)for(int i=0;i<7;i++)for(int j=0;j<7;j++)p[i][j]+=x[i][j]/ps.length;return p;}
    public static void main(String[] args) {
        double[] stated=target(false),implicit=target(true); double[][] gibbs=gibbs();
        double[][] oldA=kernel(true,false),oldB=kernel(false,false),newA=kernel(true,true),newB=kernel(false,true);
        for(double[][] old:new double[][][]{oldA,oldB,average(oldA,oldB,gibbs)}) {
            double residual=balance(old,implicit);if(residual>2e-14)throw new AssertionError("old kernel not implicit target: "+residual);
            if(balance(old,stated)<1e-3)throw new AssertionError("expected old target violation absent");
        }
        for(double[][] fixed:new double[][][]{newA,newB,average(newA,newB,gibbs)}) if(balance(fixed,stated)>2e-14)throw new AssertionError("correction violates stated target");
        System.out.println("PASS exact 7-state projected matrices for BOTH actual split/merge proposal classes and MentionRV, N=1..4, J=2, vocabulary=1");
        System.out.println("States (N,K)="+Arrays.deepToString(STATES));
        System.out.println("Stated target normalized="+Arrays.toString(stated));
        System.out.println("Implicit target pi/N! normalized="+Arrays.toString(implicit));
        System.out.println("Old smart-split residual wrt stated="+balance(oldA,stated)+", wrt implicit="+balance(oldA,implicit));
        System.out.println("Old smart-merge residual wrt stated="+balance(oldB,stated)+", wrt implicit="+balance(oldB,implicit));
        System.out.println("Corrected smart-split residual="+balance(newA,stated)+", corrected smart-merge residual="+balance(newB,stated));
        System.out.println("Correction: add log(N+1) for a split; subtract log(N) for a merge. Null proposals and truncation remain null.");
        System.out.println("This test covers every empty-entity transition in the two-mention projection; a general proof and unequal-noun/higher-mention validation are still required before extending this result.");
    }
}
