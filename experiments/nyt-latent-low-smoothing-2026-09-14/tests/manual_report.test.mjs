import test from 'node:test';
import assert from 'node:assert/strict';
import {finitePopulationBounds,summarizeStrata} from '../scripts/report_manual_samples.mjs';

const choose=(n,k)=>{if(k<0||k>n)return 0;let x=1;for(let i=1;i<=k;i++)x*=((n-k+i)/i);return x;};
test('finite-population census has zero sampling uncertainty',()=>{
  assert.deepEqual(finitePopulationBounds(12,12,7),{lower_count:7,upper_count:7,lower:7/12,upper:7/12});
});
test('exact finite-population bounds match small hand-enumerable cases',()=>{
  assert.deepEqual(finitePopulationBounds(10,5,0),{lower_count:0,upper_count:3,lower:0,upper:.3});
  assert.deepEqual(finitePopulationBounds(10,5,5),{lower_count:7,upper_count:10,lower:.7,upper:1});
});
test('enumerated sampling coverage is at least the declared confidence for every true count',()=>{
  const N=12,n=5;
  for(let K=0;K<=N;K++) {
    let coverage=0;
    for(let k=Math.max(0,n-(N-K));k<=Math.min(n,K);k++) {
      const ci=finitePopulationBounds(N,n,k);
      const p=choose(K,k)*choose(N-K,n-k)/choose(N,n);
      if(ci.lower_count<=K&&K<=ci.upper_count)coverage+=p;
    }
    assert(coverage>=.95-1e-12,`K=${K}: coverage ${coverage}`);
  }
});
test('weighted micro estimates differ from macro and retain ambiguity endpoints',()=>{
  const s=summarizeStrata([
    {population_facts:90,sample_facts:5,supported:1,incorrect:3,ambiguous:1},
    {population_facts:10,sample_facts:5,supported:4,incorrect:1,ambiguous:0}]);
  assert(Math.abs(s.micro.lower-.26)<1e-12);assert(Math.abs(s.micro.upper-.44)<1e-12);
  assert.equal(s.macro.lower,.5);assert(Math.abs(s.macro.upper-.6)<1e-12);
  assert(s.conservative_sampling_bounds.strict_lower<=s.micro.lower);
  assert(s.conservative_sampling_bounds.optimistic_upper>=s.micro.upper);
});
test('all successes in five samples still leave substantial uncertainty',()=>{
  const s=summarizeStrata([{population_facts:100,sample_facts:5,supported:5,incorrect:0,ambiguous:0}]);
  assert.equal(s.micro.lower,1);assert.equal(s.exploratory_design_se.lower,0);
  assert(s.conservative_sampling_bounds.strict_lower<.6);
  assert.equal(s.conservative_sampling_bounds.strict_upper,1);
});
test('invalid or missing count mass is rejected',()=>{
  assert.throws(()=>summarizeStrata([{population_facts:10,sample_facts:5,supported:3,incorrect:1,ambiguous:0}]));
  assert.throws(()=>finitePopulationBounds(10,11,5));
});
