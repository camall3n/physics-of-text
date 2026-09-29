package org.ucb.generative_ie.mcmc;

import java.util.*;
import org.ucb.generative_ie.generator.*;
import org.ucb.generative_ie.world.*;
import com.google.common.collect.Multiset;

/** Independent small-state oracle. Intentionally does not call WorldProb or ModelFunctions. */
public final class KernelAuditProbe {
    static long assertions = 0;
    static double worstError = 0;
    static void close(String message, double expected, double actual, double tolerance) {
        assertions++;
        if (expected == actual) return;
        double error = Math.abs(expected - actual); worstError = Math.max(worstError, error);
        if (!Double.isFinite(actual) || error > tolerance)
            throw new AssertionError(message + ": expected=" + expected + ", actual=" + actual);
    }
    static World empty(int entities, int relations, boolean betaPrior) {
        World w = new WorldGenerator(new Random(11), Entities.defaultEntities(entities),
                Relations.defaultRelations(relations), NounLexicon.defaultNounLexicon(2),
                Lexicon.defaultLexicon(2), .37, .23, new ConstantSparsityGenerator(.19), 0).emptyWorld();
        w.setRelationPriorMean(2);
        if (betaPrior) w.setSparsityPrior(.8, 3.1);
        return w;
    }
    static List<Fact> potential(World w) {
        List<Fact> fs = new ArrayList<>();
        for (Relation r : w.getRelations()) for (Entity a : w.getEntities()) for (Entity b : w.getEntities()) fs.add(new Fact(r,a,b));
        return fs;
    }
    static Sentence sentence(World w, Fact f, int t, int a, int b) {
        Sentence s = new Sentence(f, w.getWeightedLexicons().getLex().get(t),
                w.getWeightedNounLexicons().getNounLexicon().get(a),
                w.getWeightedNounLexicons().getNounLexicon().get(b));
        w.getSentences().add(s); return s;
    }
    static double rising(double a, int n) { double x=0; for(int i=0;i<n;i++) x+=Math.log(a+i); return x; }
    static <T> double dictionary(Map<T,Integer> counts, double alpha, int vocabulary) {
        double x=0; int n=0; for(int c:counts.values()) { x+=rising(alpha,c); n+=c; }
        return x-rising(alpha*vocabulary,n);
    }
    static <T> void add(Map<T,Integer> counts,T key) { counts.put(key,counts.getOrDefault(key,0)+1); }
    static double countFactor(int k,int centre) {
        if(k==0) return Double.NEGATIVE_INFINITY;
        double z=Math.log(k)-Math.log(centre)+.5;
        return -Math.log(k)-.5*z*z; // constant cancels
    }
    static double density(World w) {
        int occupied=0, nf=w.getFacts().size(); double answer=0;
        int p=(int) w.numPotentialFactsPerRelation();
        for(Relation r:w.getRelations()) {
            int n=0; for(Fact f:w.getFacts()) if(f.getRel().equals(r)) n++;
            if(n>0) occupied++;
            if(w.hasSparsityPrior()) answer+=rising(w.getSparsityA(),n)+rising(w.getSparsityB(),p-n)-rising(w.getSparsityA()+w.getSparsityB(),p);
            else answer+=n*Math.log(w.getSparsity())+(p-n)*Math.log1p(-w.getSparsity());
            Map<Trigger,Integer> counts=new HashMap<>();
            for(Sentence s:w.getSentences()) if(s.getOrigin().getRel().equals(r)) add(counts,s.getTrig());
            answer+=dictionary(counts,w.getBeta(),2);
        }
        for(Entity e:w.getEntities()) {
            Map<Noun,Integer> counts=new HashMap<>();
            for(Sentence s:w.getSentences()) {
                if(s.getOrigin().getEnt1().equals(e)) add(counts,s.getArg1());
                if(s.getOrigin().getEnt2().equals(e)) add(counts,s.getArg2());
            }
            answer+=dictionary(counts,w.getAlpha(),2);
        }
        answer+=countFactor(occupied,w.getRelationPriorMean());
        if(w.getSentences().size()>0) answer-=w.getSentences().size()*Math.log(nf);
        return answer;
    }
    static void indexes(World w) {
        int referenced=0;
        for(Fact f:w.getFacts()) {
            List<Sentence> rows=new ArrayList<>();
            for(Sentence s:w.getSentences()) if(s.getOrigin().equals(f)) rows.add(s);
            close("fact index",rows.size(),w.getSentences().sentencesWithOrigin(f).size(),0);
            if(!rows.isEmpty()) referenced++;
            if(!w.getFacts().factsWithEntityPair(f.getEntityPair()).contains(f) || !w.getFacts().factsWithEntRelPair(f.getEntRelPair()).contains(f) || !w.getFacts().factsWithRelEntPair(f.getRelEntPair()).contains(f)) throw new AssertionError("missing fact index");
        }
        close("referenced fact count",referenced,w.getSentences().numReferencedFacts(),0);
        for(Relation r:w.getRelations()) {
            Map<Trigger,Integer> counts=new HashMap<>();
            for(Sentence s:w.getSentences()) if(s.getOrigin().getRel().equals(r)) add(counts,s.getTrig());
            for(int j=0;j<2;j++) { Trigger t=w.getWeightedLexicons().getLex().get(j); close("trigger count",counts.getOrDefault(t,0),w.getSentences().triggerHistogram(r).count(t),0); }
        }
        for(Entity e:w.getEntities()) {
            Map<Noun,Integer> counts=new HashMap<>(); int mentions=0;
            for(Sentence s:w.getSentences()) {
                if(s.getOrigin().getEnt1().equals(e)) { add(counts,s.getArg1()); mentions++; }
                if(s.getOrigin().getEnt2().equals(e)) { add(counts,s.getArg2()); mentions++; }
                if(!s.getSourceMention().getEntity().equals(s.getOrigin().getEnt1()) || !s.getDestMention().getEntity().equals(s.getOrigin().getEnt2())) throw new AssertionError("stale mention entity");
            }
            close("mention index",mentions,w.getSentences().getMentionsByEntity(e).size(),0);
            for(int j=0;j<2;j++) { Noun n=w.getWeightedNounLexicons().getNounLexicon().get(j); close("noun histogram",counts.getOrDefault(n,0),w.getSentences().nounHistogram(e).count(n),0); }
        }
    }
    static void factConditionals() {
        int states=0, pairs=0;
        for(boolean prior:new boolean[]{false,true}) for(int mask=1;mask<256;mask++) for(boolean data:new boolean[]{false,true}) {
            World w=empty(2,2,prior); List<Fact> fs=potential(w);
            for(int i=0;i<8;i++) if((mask&(1<<i))!=0) w.getFacts().add(fs.get(i));
            if(data) { Fact f=w.getFacts().iterator().next(); sentence(w,f,0,0,1); sentence(w,f,1,1,0); }
            FactBirthDeathStep birth=new FactBirthDeathStep(w);
            for(Fact f:fs) {
                boolean exists=w.getFacts().exists(f);
                if(!w.getSentences().sentencesWithOrigin(f).isEmpty()) continue;
                Double odds=new FactRV(w,f).logOddsExists();
                w.getFacts().setFact(f,false); double absent=density(w);
                w.getFacts().setFact(f,true); double present=density(w);
                close("fact conditional",present-absent,odds,2e-12);
                int u=birth.numUnreferenced(), total=w.getFacts().size();
                double qDeath=.5*(1-Math.pow(1-(double)u/total,20))/u;
                double death=birth.logAcceptDeath(f);
                w.getFacts().remove(f); double add=birth.logAcceptBirth(f);
                close("birth/death reciprocal",-death,add,2e-12);
                double lhs=absent+Math.log(.5/8)+Math.min(0,add);
                double rhs=present+Math.log(qDeath)+Math.min(0,death);
                close("birth/death detailed balance",lhs,rhs,2e-12);
                w.getFacts().setFact(f,exists); pairs++;
            }
            indexes(w); states++;
        }
        System.out.println("PASS fact conditionals and birth/death balance: "+states+" worlds, "+pairs+" toggles (including zero-sentence and overlap states)");
    }
    static void sentenceConditionals() {
        int checked=0;
        for(int config=0;config<512;config++) {
            World w=empty(2,2,true); List<Fact> fs=potential(w); for(Fact f:fs) w.getFacts().add(f);
            int code=config;
            for(int i=0;i<3;i++) { sentence(w,fs.get(code%8),i%2,i%2,(i+1)%2); code/=8; }
            for(Sentence s:w.getSentences()) {
                Fact old=s.getOrigin(); SentenceOriginRV step=new SentenceOriginRV(w,s); double base=density(w);
                Map<Relation,Double> rel=step.relationLogWeights();
                for(Fact f:fs) if(f.getEntityPair().equals(old.getEntityPair())) {
                    s.setOrigin(f); close("relation conditional oracle",density(w)-base,rel.get(f.getRel())-rel.get(old.getRel()),2e-12); s.setOrigin(old); checked++;
                }
                for(boolean source:new boolean[]{false,true}) {
                    Map<Entity,Double> weights=step.entityLogWeights(source); Entity current=source?old.getEnt1():old.getEnt2();
                    for(Fact f:fs) if(f.getRel().equals(old.getRel()) && (source?f.getEnt2().equals(old.getEnt2()):f.getEnt1().equals(old.getEnt1()))) {
                        Entity candidate=source?f.getEnt1():f.getEnt2();
                        s.setOrigin(f); close("argument conditional oracle",density(w)-base,weights.get(candidate)-weights.get(current),2e-12); s.setOrigin(old); checked++;
                    }
                }
            }
            indexes(w);
        }
        System.out.println("PASS sentence conditional oracle: 512 worlds, "+checked+" alternatives (both arguments, self-entity pairs, repeated nouns)");
    }
    static World partition(int code,boolean prior) {
        World w=empty(2,3,prior); List<Entity> es=w.getEntities().asList(); List<Relation> rs=w.getRelations().asList();
        for(int i=0;i<3;i++) {
            Fact f=new Fact(rs.get(code%3),es.get(i/2),es.get(i%2)); code/=3; w.getFacts().add(f);
            sentence(w,f,i%2,0,1); if(i==0) sentence(w,f,1,0,1);
        }
        return w;
    }
    static int partitionCode(World w) {
        int code=0,scale=1; List<Entity> es=w.getEntities().asList(); List<Relation> rs=w.getRelations().asList();
        for(int i=0;i<3;i++) {
            for(Fact f:w.getFacts()) if(f.getEnt1().equals(es.get(i/2))&&f.getEnt2().equals(es.get(i%2))) code+=scale*rs.indexOf(f.getRel());
            scale*=3;
        }
        return code;
    }
    static void factMovesAndSplits() {
        int moves=0, splits=0;
        for(boolean prior:new boolean[]{false,true}) for(int code=0;code<27;code++) {
            World w=partition(code,prior); FactRelationMoveStep move=new FactRelationMoveStep(w);
            for(Fact f:w.getFacts().asListCopy()) for(Relation r:move.missingRelations(f)) {
                double before=density(w), ratio=move.logAcceptance(f,r); int forwardChoices=move.missingRelations(f).size();
                move.apply(f,r); Fact moved=new Fact(r,f.getEnt1(),f.getEnt2());
                close("fact move oracle",density(w)-before,ratio,2e-12);
                close("fact move proposal symmetry",forwardChoices,move.missingRelations(moved).size(),0);
                close("reverse fact move oracle",-ratio,move.logAcceptance(moved,f.getRel()),2e-12);
                indexes(w); move.apply(moved,f.getRel()); close("restored density",before,density(w),2e-12); moves++;
            }
            RelationSplitMergeStep split=new RelationSplitMergeStep(w,true);
            for(Relation src:w.getRelations()) for(Relation dst:w.getRelations()) if(w.getFacts().factsWithRelation(dst).isEmpty()) {
                List<Fact> facts=new ArrayList<>(w.getFacts().factsWithRelation(src));
                for(int mask=1;mask<(1<<facts.size())-1;mask++) {
                    Set<Fact> moved=new HashSet<>(); for(int i=0;i<facts.size();i++) if((mask&(1<<i))!=0) moved.add(facts.get(i));
                    double before=density(w), delta=split.logJointDelta(src,dst,moved);
                    split.applySplit(src,dst,moved); close("split oracle",density(w)-before,delta,2e-12); indexes(w);
                    close("merge oracle",delta,split.logJointDelta(src,dst,new HashSet<>(w.getFacts().factsWithRelation(dst))),2e-12);
                    split.applyMerge(src,dst); close("split restored density",before,density(w),2e-12); splits++;
                }
            }
        }
        System.out.println("PASS fact-move/split independent target ratios: "+moves+" moves, "+splits+" splits and reverses");
    }
    static void empiricalSplitBalance() {
        final int draws=1200000;
        for(boolean smart:new boolean[]{false,true}) {
            World w=partition(0,true); RelationSplitMergeStep kernel=new RelationSplitMergeStep(w,smart);
            double[] p=new double[27]; double total=0;
            for(int i=0;i<27;i++) { p[i]=Math.exp(density(partition(i,true))); total+=p[i]; }
            for(int i=0;i<27;i++) p[i]/=total;
            int[] counts=new int[27]; long[][] transitions=new long[27][27]; Random rng=new Random(smart?912:913);
            for(int i=0;i<10000;i++) kernel.sample(rng);
            int previous=partitionCode(w);
            for(int i=0;i<draws;i++) { kernel.sample(rng); int current=partitionCode(w); counts[current]++; transitions[previous][current]++; previous=current; if(i%10000==0) indexes(w); }
            double maxAbsolute=0,totalVariation=0;
            for(int i=0;i<27;i++) { double d=Math.abs((double)counts[i]/draws-p[i]); maxAbsolute=Math.max(maxAbsolute,d); totalVariation+=d/2; }
            // This is a conservative mixing smoke test, not an IID standard-error claim.
            if(totalVariation>.025) throw new AssertionError("large split stationary deviation "+totalVariation);
            System.out.println("PASS actual "+(smart?"smart-split/dumb-merge":"dumb-split/smart-merge")+" draws="+draws+", total variation from exact 27-state posterior="+totalVariation+", maximum state discrepancy="+maxAbsolute);
        }
    }
    public static void main(String[] args) {
        factConditionals(); sentenceConditionals(); factMovesAndSplits(); empiricalSplitBalance();
        System.out.println("ALL PASS: "+assertions+" deterministic numerical/index assertions; largest deterministic error="+worstError);
    }
}
