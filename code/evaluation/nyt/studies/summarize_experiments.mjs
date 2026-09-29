// Historical campaign trace/comparison rendering; shared judgments are computed by sampled.mjs.
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
export function summarizeInvestigation(root, {outputDirectory=root}={}) {
root=path.resolve(root);outputDirectory=path.resolve(outputDirectory);fs.mkdirSync(path.join(outputDirectory,'analysis'),{recursive:true});
const read=p=>JSON.parse(fs.readFileSync(path.join(root,p),'utf8'));
const tsv=p=>fs.readFileSync(path.join(root,p),'utf8').trimEnd().split('\n').slice(1).map(l=>l.split('\t'));
const mean=a=>a.reduce((s,x)=>s+x,0)/a.length;
const sha=p=>crypto.createHash('sha256').update(fs.readFileSync(p)).digest('hex');
const audits=read('manual_review/unblinding.json').audits;
const results=[];
for(const id of fs.readdirSync(path.join(root,'runs')).sort()){
 if(['latent_beta01_seed20260912','latent_beta01_seed20260913'].includes(id))continue; // Confirmed-bug evaluations retired.
 const p='runs/'+id; if(!fs.existsSync(path.join(root,p,'run.json')))continue;
 const run=read(p+'/run.json');if(run.status!=='complete')continue;
 const trace=read(p+'/logprobs.txt'), summary=read(p+'/summary.json'), checkpoints=read(p+'/checkpoints.json');
 const rows=tsv(p+'/map_world_sentences.tsv'),initial=tsv(p+'/initial_world_sentences.tsv');
 assert.equal(rows.length,8516);assert.equal(initial.length,rows.length);
 const rels=new Map(),entities=new Map(),facts=new Map(),literalPairs=new Map();let drift=0;
 for(let i=0;i<rows.length;i++){
  const r=rows[i];assert.equal(r.length,6);assert.deepEqual(r.slice(3),initial[i].slice(3));
  for(let j=1;j<=2;j++){drift+=r[j]!==initial[i][j]?1:0;if(!entities.has(r[j]))entities.set(r[j],new Set());entities.get(r[j]).add(r[j+2]);}
  if(!rels.has(r[0]))rels.set(r[0],{relation:r[0],rows:0,facts:new Set(),paths:new Set()});const rel=rels.get(r[0]);rel.rows++;rel.paths.add(r[5]);
  const key=r.slice(0,3).join('\t'),lp=r.slice(3,5).join('\t');rel.facts.add(key);
  if(!facts.has(key))facts.set(key,new Set());facts.get(key).add(lp);
  if(!literalPairs.has(lp))literalPairs.set(lp,new Set());literalPairs.get(lp).add(r[0]);
 }
 const top=[...rels.values()].sort((a,b)=>b.rows-a.rows||a.relation.localeCompare(b.relation,undefined,{numeric:true})).slice(0,20);
 const best=Math.max(...trace.total),idx=trace.total.indexOf(best),mapHeader=Number(fs.readFileSync(path.join(root,p,'map_world.txt'),'utf8').split('\n')[0]);assert.ok(Math.abs(best-mapHeader)<1e-7);
 const totalFacts=Math.round(Math.exp(-trace.origin[idx]/rows.length));assert.ok(Math.abs(Math.exp(-trace.origin[idx]/rows.length)-totalFacts)<1e-6);
 assert.equal(trace.relations_with_sentences[idx],rels.size);assert.ok(totalFacts>=facts.size);
 const audit=audits.find(a=>a.source===p+'/map_world_sentences.tsv');let assessment=null;
 if(audit){assert.equal(audit.source_sha256,sha(path.join(root,audit.source)));assert.equal(audit.population_facts,top.reduce((s,r)=>s+r.facts.size,0));if(fs.existsSync(path.join(root,'manual_review',audit.audit_id,'assessment.json')))assessment=read('manual_review/'+audit.audit_id+'/assessment.json');}
 if(run.config.freezeArgumentEntities){assert.equal(drift,0);assert.ok([...entities.values()].every(s=>s.size===1));}
 assert.equal(summary.relation_proposals,1960000);assert.equal(summary.entity_proposals,run.config.freezeArgumentEntities?0:40000);
 const result={id,arm:id.replace(/_seed\d+$/,''),seed:run.config.seed,config:run.config,corpus_sha256:run.corpus_sha256,elapsed_seconds:run.elapsed_seconds,map:{iteration:idx+1,log_joint:best,available_entities:checkpoints[0].entities,expressed_entities:entities.size,mixed_name_entity_ids:[...entities.values()].filter(s=>s.size>1).length,changed_argument_mentions:drift,total_facts:totalFacts,expressed_facts:facts.size,facts_with_multiple_literal_pairs:[...facts.values()].filter(s=>s.size>1).length,occupied_relations:trace.relations_used[idx],expressed_relations:rels.size,top20_facts:top.reduce((s,r)=>s+r.facts.size,0),top20_rows:top.reduce((s,r)=>s+r.rows,0),literal_pairs:literalPairs.size,mean_relations_per_literal_pair:mean([...literalPairs.values()].map(s=>s.size))},trace:{last_checkpoint:checkpoints.at(-1),last100_mean_joint:mean(trace.total.slice(-100)),previous100_mean_joint:mean(trace.total.slice(-200,-100)),last100_minus_previous100:mean(trace.total.slice(-100))-mean(trace.total.slice(-200,-100)),last100_at_capacity:trace.relations_used.slice(-100).filter(n=>n===run.config.maxRels).length,last100_at_least_capacity_minus_one:trace.relations_used.slice(-100).filter(n=>n>=run.config.maxRels-1).length},summary,audit_id:audit?.audit_id??null,assessment:assessment?{sampled_facts:assessment.sampled_facts,sample_counts:assessment.sample_counts,micro:assessment.micro,macro:assessment.macro,conservative_sampling_bounds:assessment.conservative_sampling_bounds}:null};results.push(result);
}
assert.equal(new Set(results.map(r=>r.corpus_sha256)).size,1);
fs.writeFileSync(path.join(outputDirectory,'analysis/experiment_results.json'),JSON.stringify({generated_at:new Date().toISOString(),note:'MAP counts, not final counts. Manual estimates are stratified screens, not censuses; ambiguity endpoints are not confidence bounds. Different models have incomparable log-joint values.',results},null,2)+'\n');
const pct=x=>(100*x).toFixed(1)+'%';
let md='# Controlled NYT experiment results\n\nAll counts below describe the saved MAP world. Each run uses all 8,516 unchanged rows. Seed suffix 12/13 means 20260912/20260913. This evaluation index includes retained runs only; the two confirmed-bug latent baselines have retired evaluations and preserved raw outputs. Manual precision is a relation-size-weighted estimate from five facts per top-20 relation; endpoints count ambiguous cases as incorrect/correct. They are **not confidence intervals**, and none of these screens is a full census. See each linked assessment for individual judgments and the deliberately conservative finite-population sampling bounds.\n\n| Run | Entities (available) | Relations (expressed) | Facts (expressed) | Top-20 facts | Top-20 rows | Sample precision | Audit |\n|---|---:|---:|---:|---:|---:|---|---|\n';
for(const r of results)md+=`| ${r.id} | ${r.map.available_entities} | ${r.map.expressed_relations} | ${r.map.expressed_facts} | ${r.map.top20_facts} | ${r.map.top20_rows} (${pct(r.map.top20_rows/8516)}) | ${r.assessment?pct(r.assessment.micro.lower)+'–'+pct(r.assessment.micro.upper):'review pending'} | ${r.audit_id?'[review](../manual_review/'+r.audit_id+'/assessment.md)':'pending'} |\n`;
md+='\n## Identity drift and finite-run behavior\n\nA mixed-name entity ID is a diagnostic flag, not a proven error: aliases can be legitimate. Changed mention counts compare implementation IDs with initialization and likewise do not measure identity accuracy. No run has demonstrated convergence. The positive last-block differences are consistent with continued movement toward higher-density regions; they do not establish convergence or prove nonstationarity. Log-joint comparisons are meaningful only within the same target; do not rank beta or entity models by these numbers.\n\n| Run | MAP iteration / 980 | Changed argument mentions / 17,032 | Mixed-name IDs | Mean log-joint improvement: final 100 vs prior 100 | Iterations at >=399 relations in final 100 |\n|---|---:|---:|---:|---:|---:|\n';
for(const r of results)md+=`| ${r.id} | ${r.map.iteration} | ${r.map.changed_argument_mentions} | ${r.map.mixed_name_entity_ids} | ${r.trace.last100_minus_previous100.toFixed(1)} | ${r.trace.last100_at_least_capacity_minus_one} |\n`;
md+='\n## Recompute\n\nRun `node scripts/summarize_experiments.mjs` from this investigation directory. It independently parses MAP assignments, checks unchanged observed rows, verifies MAP scores against the trace, derives total true facts from the uniform-reporting term, verifies the top-20 population against the blind sample manifest, and checks frozen-identity invariants and proposal budgets. Exact inputs, source snapshots and output hashes are in each run’s `run.json`. Machine-readable details are in [experiment_results.json](experiment_results.json).\n';
fs.writeFileSync(path.join(outputDirectory,'analysis/experiment_results.md'),md);return md;

}
