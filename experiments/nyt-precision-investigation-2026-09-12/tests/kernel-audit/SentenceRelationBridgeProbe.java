package org.ucb.generative_ie.mcmc;

import java.util.*;
import org.ucb.generative_ie.world.*;
import static org.ucb.generative_ie.mcmc.KernelAuditProbe.*;

/** Enumerates all nonempty subsets of eight possible facts and every origin for two sentences. */
public final class SentenceRelationBridgeProbe {
    static String state(World w) {
        List<String> fs=new ArrayList<>(); for(Fact f:w.getFacts()) fs.add(f.toString()); Collections.sort(fs);
        String answer=fs.toString(); for(Sentence s:w.getSentences()) answer+="|"+s.getOrigin(); return answer;
    }
    static Set<Fact> unreferenced(World w) {
        Set<Fact> out=new HashSet<>(); for(Fact f:w.getFacts()) if(w.getSentences().sentencesWithOrigin(f).isEmpty()) out.add(f); return out;
    }
    public static void main(String[] args) {
        int states=0, moves=0, blocked=0; int[][] combinations=new int[2][2];
        for(boolean prior:new boolean[]{false,true}) for(int mask=1;mask<256;mask++) for(int first=0;first<8;first++) if((mask&(1<<first))!=0)
            for(int second=0;second<8;second++) if((mask&(1<<second))!=0) {
                World w=empty(2,2,prior); List<Fact> fs=potential(w);
                for(int i=0;i<8;i++) if((mask&(1<<i))!=0) w.getFacts().add(fs.get(i));
                sentence(w,fs.get(first),0,0,1); sentence(w,fs.get(second),1,1,0);
                SentenceRelationBirthDeathMove bridge=new SentenceRelationBirthDeathMove(w);
                String before=state(w); Set<Fact> unused=unreferenced(w); double beforeDensity=density(w);
                double actualMass=0, nullMass=0;
                for(Sentence s:w.getSentences()) for(Relation target:w.getRelations()) {
                    double q=.25;
                    if(target.equals(s.getOrigin().getRel())) { nullMass+=q; continue; }
                    Fact candidate=new Fact(target,s.getOrigin().getEnt1(),s.getOrigin().getEnt2());
                    if(w.getFacts().exists(candidate)&&w.getSentences().sentencesWithOrigin(candidate).isEmpty()) {
                        if(bridge.canMove(s,target)) throw new AssertionError("unreferenced target allowed");
                        close("unreferenced target log probability",Double.NEGATIVE_INFINITY,bridge.logAcceptance(s,target),0);
                        try { bridge.apply(s,target); throw new AssertionError("unsafe apply did not throw"); } catch(IllegalArgumentException expected) {}
                        if(!before.equals(state(w))) throw new AssertionError("rejected bridge mutated state");
                        blocked++; nullMass+=q; continue;
                    }
                    Relation old=s.getOrigin().getRel();
                    combinations[w.getSentences().sentencesWithOrigin(s.getOrigin()).size()==1?1:0][w.getFacts().exists(candidate)?0:1]++;
                    double delta=bridge.logAcceptance(s,target);
                    double wpBefore=new WorldProb(w).logProb();
                    bridge.apply(s,target); double afterDensity=density(w);
                    close("bridge independent target ratio",afterDensity-beforeDensity,delta,3e-12);
                    close("bridge WorldProb target ratio",new WorldProb(w).logProb()-wpBefore,delta,3e-12);
                    if(!unused.equals(unreferenced(w))) throw new AssertionError("bridge changed unreferenced set");
                    if(!bridge.canMove(s,old)) throw new AssertionError("no exact reverse");
                    double reverse=bridge.logAcceptance(s,old);
                    close("bridge reverse ratio",-delta,reverse,3e-12);
                    close("bridge detailed balance",beforeDensity+Math.log(q)+Math.min(0,delta),afterDensity+Math.log(q)+Math.min(0,reverse),3e-12);
                    indexes(w);
                    bridge.apply(s,old); if(!before.equals(state(w))) throw new AssertionError("reverse does not restore world");
                    indexes(w);
                    actualMass+=q*Math.exp(Math.min(0,delta)); nullMass+=q*(-Math.expm1(Math.min(0,delta))); moves++;
                }
                close("full proposal+accept/reject probability sums to one",1,actualMass+nullMass,2e-15);
                states++;
            }
        for(boolean prior:new boolean[]{false,true}) {
            World w=empty(2,2,prior); List<Entity> es=w.getEntities().asList(); List<Relation> rs=w.getRelations().asList();
            Fact a=new Fact(rs.get(0),es.get(0),es.get(1)), b=new Fact(rs.get(1),es.get(0),es.get(1));
            w.getFacts().add(a); w.getFacts().add(b);
            Sentence s=sentence(w,a,0,0,1); sentence(w,a,1,0,1); sentence(w,b,0,0,1);
            SentenceRelationBirthDeathMove bridge=new SentenceRelationBirthDeathMove(w);
            String old=state(w); double before=density(w), delta=bridge.logAcceptance(s,b.getRel());
            bridge.apply(s,b.getRel()); close("source remains/target exists oracle",density(w)-before,delta,3e-12);
            close("source remains/target exists reverse",-delta,bridge.logAcceptance(s,a.getRel()),3e-12);
            indexes(w); bridge.apply(s,a.getRel()); if(!old.equals(state(w))) throw new AssertionError("three-sentence reverse did not restore state");
            indexes(w); combinations[0][0]++; moves++;
        }
        System.out.println("PASS exhaustive bridge: "+states+" exhaustive states plus 2 three-sentence fixtures, "+moves+" allowed proposals/reverses, "+blocked+" forbidden unreferenced-target cases");
        System.out.println("Four cases [old remains/new present, old remains/new created; old removed/new present, old removed/new created]="+Arrays.deepToString(combinations));
        System.out.println("PASS full transition probability normalization in every state, independent target density, WorldProb, exact reversal, unchanged unreferenced set, indexes");
        System.out.println("ALL PASS: "+assertions+" numerical/index assertions; largest deterministic error="+worstError);
    }
}
