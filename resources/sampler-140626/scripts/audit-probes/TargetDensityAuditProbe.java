import java.util.List;
import java.util.Locale;
import java.util.Random;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.ucb.generative_ie.generator.ConstantSparsityGenerator;
import org.ucb.generative_ie.generator.WorldGenerator;
import org.ucb.generative_ie.inference.ModelFunctions;
import org.ucb.generative_ie.world.*;

/** Enumerate the unchanged target and verify trigger helpers use the relation prior. */
public class TargetDensityAuditProbe {
    static World empty(int entities, int relations, double alpha, double beta) {
        return new WorldGenerator(new Random(123), Entities.defaultEntities(entities),
            Relations.defaultRelations(relations), NounLexicon.defaultNounLexicon(2),
            Lexicon.defaultLexicon(2), alpha, beta, new ConstantSparsityGenerator(.1), 0).emptyWorld();
    }
    public static void main(String[] args) {
        World w=empty(1,4,.001,.1);
        w.setSparsityPrior(1,1);
        w.setRelationPriorMean(2);
        Entity e=w.getEntities().asList().get(0);
        List<Relation> rs=w.getRelations().asList();
        double[] actual=new double[5], barePriorMass=new double[5];
        for(int mask=0;mask<16;mask++) {
            w.getFacts().clear();
            for(int r=0;r<4;r++) if((mask&(1<<r))!=0) w.getFacts().add(new Fact(rs.get(r),e,e));
            actual[Integer.bitCount(mask)]+=Math.exp(new WorldProb(w).logProb());
        }
        double aSum=0,iSum=0;
        for(int k=1;k<=4;k++) { aSum+=actual[k]; barePriorMass[k]=Math.exp(WorldProb.logLogNormal(k,2)); iSum+=barePriorMass[k]; }
        System.out.println("K,actual_normalized_mass,bare_lognormal_normalized_mass");
        for(int k=1;k<=4;k++) System.out.printf(Locale.ROOT,"%d,%.12f,%.12f%n",k,actual[k]/aSum,barePriorMass[k]/iSum);
        // Four labelled slots each have occupancy .5 here. Exact enumeration must
        // equal the binomial multiplicity times the additional lognormal factor.
        int[] choose={1,4,6,4,1}; double z=0;
        for(int k=1;k<=4;k++) z+=choose[k]*barePriorMass[k];
        for(int k=1;k<=4;k++) if(!Double.isFinite(actual[k]/aSum)
                ||Math.abs(actual[k]/aSum-choose[k]*barePriorMass[k]/z)>1e-10)
            throw new AssertionError("Density derivation mismatch");

        Multiset<Trigger> source=HashMultiset.create(),dest=HashMultiset.create(),moved=HashMultiset.create();
        Trigger t0=w.getWeightedLexicons().getLex().get(0),t1=w.getWeightedLexicons().getLex().get(1);
        source.add(t0,3); source.add(t1,1); dest.add(t1,2); moved.add(t0);
        double helper=ModelFunctions.logMoveTriggersRatio(source,dest,moved,w);
        double betaCorrect=ModelFunctions.logMoveTriggersRatio(source,dest,moved,w.getBeta(),2);
        Multiset<Trigger> sourceAfter=HashMultiset.create(source),destAfter=HashMultiset.create(dest);
        for(Multiset.Entry<Trigger> entry:moved.entrySet()) sourceAfter.remove(entry.getElement(),entry.getCount());
        destAfter.addAll(moved);
        double jointDelta=ModelFunctions.logBetaProb(sourceAfter,w.getBeta(),2)
                +ModelFunctions.logBetaProb(destAfter,w.getBeta(),2)
                -ModelFunctions.logBetaProb(source,w.getBeta(),2)
                -ModelFunctions.logBetaProb(dest,w.getBeta(),2);
        System.out.printf(Locale.ROOT,"world_trigger_helper_log_ratio=%.12f explicit_beta_log_ratio=%.12f joint_trigger_delta=%.12f%n",helper,betaCorrect,jointDelta);
        if(!Double.isFinite(helper)||!Double.isFinite(betaCorrect)||!Double.isFinite(jointDelta)
                ||Math.abs(helper-jointDelta)>1e-10||Math.abs(betaCorrect-jointDelta)>1e-10)
            throw new AssertionError("Trigger helper does not match collapsed relation likelihood at beta");
        System.out.println("Unchanged density enumeration and corrected trigger helper verified.");
    }
}
