// Copied without semantic changes from experiments/nyt-precision-investigation-2026-09-12/scripts/prepare_manual_samples.mjs; source remains read-only.
import assert from 'node:assert/strict';
const add=(map,key,value=1)=>map.set(key,(map.get(key)??0)+value);
const ordered=map=>[...map].map(([value,count])=>({value,count})).sort((a,b)=>b.count-a.count||a.value.localeCompare(b.value));
const relationNumber=id=>Number(id.replace(/^rel_/,''));

export function parseMap(raw) {
  const lines = raw.trimEnd().split(/\r?\n/);
  assert.equal(lines[0], 'relation\tentity1\tentity2\targ1\targ2\tpath', 'Unexpected MAP header');
  const facts = new Map(), relations = new Map();
  for(let i=1;i<lines.length;i++) {
    const fields=lines[i].split('\t');
    assert.equal(fields.length,6,`Line ${i+1} is not a six-column TSV row`);
    const [relation,entity1,entity2,arg1,arg2,dependency_path]=fields;
    assert(/^rel_\d+$/.test(relation));
    assert(/^Ent\[ent_\d+\]$/.test(entity1)&&/^Ent\[ent_\d+\]$/.test(entity2));
    const id=[relation,entity1.slice(4,-1),entity2.slice(4,-1)].join('__');
    if(!facts.has(id)) facts.set(id,{case_id:id,relation,entity1,entity2,first_line:i+1,evidence:[],names:new Map(),paths:new Map()});
    const fact=facts.get(id);
    fact.evidence.push({line:i+1,relation,entity1,entity2,arg1,arg2,dependency_path,original_row:lines[i]});
    add(fact.names,`${arg1} → ${arg2}`);add(fact.paths,dependency_path);
    if(!relations.has(relation)) relations.set(relation,{relation,sentence_count:0,facts:[],paths:new Map()});
    const r=relations.get(relation);r.sentence_count++;add(r.paths,dependency_path);
  }
  for(const c of facts.values()) {
    c.sentence_count=c.evidence.length;
    c.names=ordered(c.names);c.paths=ordered(c.paths);
    c.source_lines=c.evidence.map(e=>e.line);
    relations.get(c.relation).facts.push(c);
  }
  const ranked=[...relations.values()].sort((a,b)=>b.sentence_count-a.sentence_count||relationNumber(a.relation)-relationNumber(b.relation));
  ranked.forEach((r,i)=>{
    r.rank=i+1;r.paths=ordered(r.paths);
    r.facts.sort((a,b)=>b.sentence_count-a.sentence_count||a.first_line-b.first_line);
    r.facts.forEach((c,j)=>{c.relation_rank=r.rank;c.fact_rank_by_rows=j+1;});
  });
  assert.equal([...facts.values()].reduce((n,c)=>n+c.sentence_count,0),lines.length-1);
  return {sentence_count:lines.length-1,fact_count:facts.size,relation_count:ranked.length,relations:ranked};
}

