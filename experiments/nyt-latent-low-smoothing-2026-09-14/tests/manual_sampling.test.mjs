import test from 'node:test';
import assert from 'node:assert/strict';
import {parseMap,selectReview} from '../scripts/prepare_manual_samples.mjs';

const header='relation\tentity1\tentity2\targ1\targ2\tpath';
function fixture() {
  const rows=[];
  // 4 unequal fact populations and unequal sentence frequencies, with known counts.
  for(let r=0;r<4;r++)for(let f=0;f<[2,5,9,14][r];f++)for(let n=0;n<(f===0?7:1);n++)
    rows.push([`rel_${r}`,`Ent[ent_${r*100+f}]`,'Ent[ent_999]',`name${r}_${f}`,'destination',`path${f}`].join('\t'));
  return header+'\n'+rows.join('\n')+'\n';
}
test('all MAP rows belong to exactly one expressed ordered fact',()=>{
  const data=parseMap(fixture());
  assert.equal(data.sentence_count,54);assert.equal(data.fact_count,30);
  const lines=data.relations.flatMap(r=>r.facts.flatMap(c=>c.source_lines));
  assert.equal(lines.length,new Set(lines).size);
  assert.deepEqual([...lines].sort((a,b)=>a-b),Array.from({length:54},(_,i)=>i+2));
});
test('selects every small stratum and exactly five cases from larger strata',()=>{
  const sample=selectReview(fixture());
  assert.equal(sample.metadata.population_facts,30);
  assert.equal(sample.metadata.sampled_facts,17);
  assert.deepEqual(sample.relations.map(r=>[r.population_facts,r.sample_facts]),[[14,5],[9,5],[5,5],[2,2]]);
  assert.equal(new Set(sample.relations.flatMap(r=>r.facts.map(c=>c.case_id))).size,17);
});
test('sampling is deterministic and ranking uses only registered hashes',()=>{
  const first=selectReview(fixture()),second=selectReview(fixture());
  assert.deepEqual(first,second);
  for(const r of first.relations) {
    const hashes=r.facts.map(c=>c.selection_hash);
    assert.deepEqual(hashes,[...hashes].sort());
    assert(r.facts.every(c=>c.selection_hash.length===64));
  }
});
test('stratum weights recover micro precision, not equal allocation average',()=>{
  const sample=selectReview(fixture());
  const weights=sample.relations.map(r=>r.micro_weight);
  assert(Math.abs(weights.reduce((a,b)=>a+b,0)-1)<1e-12);
  const hypothetical=new Map([[0,1],[1,1],[2,0],[3,0]]);
  const micro=sample.relations.reduce((a,r)=>a+r.micro_weight*hypothetical.get(Number(r.relation.slice(4))),0);
  assert(Math.abs(micro-7/30)<1e-12);
  const macro=sample.relations.reduce((a,r)=>a+r.macro_weight*hypothetical.get(Number(r.relation.slice(4))),0);
  assert.equal(macro,.5);
  assert.notEqual(micro,macro);
});
test('relation rank ties use numeric IDs; entity pair order is retained',()=>{
  const raw=header+'\n'+[
    'rel_10\tEnt[ent_1]\tEnt[ent_2]\tA\tB\tp',
    'rel_2\tEnt[ent_2]\tEnt[ent_1]\tB\tA\tp'].join('\n')+'\n';
  const parsed=parseMap(raw);
  assert.deepEqual(parsed.relations.map(r=>r.relation),['rel_2','rel_10']);
  assert.equal(parsed.relations[0].facts[0].entity1,'Ent[ent_2]');
});
test('ambiguous or malformed source input cannot silently change columns',()=>{
  assert.throws(()=>parseMap('wrong header\n'));
  assert.throws(()=>parseMap(header+'\nrel_1\tEnt[ent_1]\tEnt[ent_2]\tA\tB\tp\textra\n'));
});
