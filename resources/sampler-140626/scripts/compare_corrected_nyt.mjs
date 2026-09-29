import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
const sampler=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const before=path.join(sampler,'results/nyt-2026');
const after=path.resolve(sampler,process.argv[2]??'results/nyt-2026-fixed-400');
const read=p=>JSON.parse(fs.readFileSync(p,'utf8'));
const tsv=dir=>fs.readFileSync(path.join(dir,'map_world_sentences.tsv'),'utf8').trimEnd().split('\n').slice(1).map((s,i)=>{
 const [relation,entity1,entity2,arg1,arg2,dependency_path]=s.split('\t');return {relation,entity1,entity2,arg1,arg2,dependency_path,line:i+2};
});
const oldRows=tsv(before),newRows=tsv(after);
if(oldRows.length!==newRows.length||newRows.some((r,i)=>r.arg1!==oldRows[i].arg1||r.arg2!==oldRows[i].arg2||r.dependency_path!==oldRows[i].dependency_path))throw Error('Source triple sequence differs');
function summary(dir,rows){
 const config=read(path.join(dir,'config.json')),trace=read(path.join(dir,'logprobs.txt'));
 const mapIndex=trace.total.indexOf(Math.max(...trace.total)),get=k=>trace[k][mapIndex];
 const lengths=Object.values(trace).map(v=>v.length);
 if(!lengths.every(n=>n===trace.total.length)||trace.total.length!==config.numIterations-Math.round(config.numIterations*config.entityFraction))throw Error('Wrong trace length');
 const components=['facts','origin','collapsed_trigs','collapsed_nouns','entity_number','relation_number'];
 const maxSumError=Math.max(...trace.total.map((x,i)=>Math.abs(x-components.reduce((s,k)=>s+trace[k][i],0))));
 if(maxSumError>1e-7)throw Error('Trace joint components mismatch');
 const nouns=new Set(rows.flatMap(r=>[r.arg1,r.arg2])),paths=new Set(rows.map(r=>r.dependency_path));
 const count=(hist,group,key)=>{if(!hist.has(group))hist.set(group,new Map());const h=hist.get(group);h.set(key,(h.get(key)||0)+1);};
 const nounHist=new Map(),pathHist=new Map(),relRows=new Map(),facts=new Set();
 for(const r of rows){count(nounHist,r.entity1,r.arg1);count(nounHist,r.entity2,r.arg2);count(pathHist,r.relation,r.dependency_path);if(!relRows.has(r.relation))relRows.set(r.relation,[]);relRows.get(r.relation).push(r);facts.add([r.relation,r.entity1,r.entity2].join('\t'));}
 const logLikelihood=(hist,a,v)=>{let answer=0;for(const h of hist.values()){let total=0;for(const n of h.values()){for(let j=0;j<n;j++)answer+=Math.log(a+j);total+=n;}for(let j=0;j<total;j++)answer-=Math.log(a*v+j);}return answer;};
 const triggerError=logLikelihood(pathHist,config.beta,paths.size)-get('collapsed_trigs');
 const nounError=logLikelihood(nounHist,config.alpha,nouns.size)-get('collapsed_nouns');
 if(Math.max(Math.abs(triggerError),Math.abs(nounError))>1e-6)throw Error('MAP TSV does not match maximum trace likelihood');
 const factCount=Math.round(Math.exp(-get('origin')/rows.length));
 let bestN=0,error=Infinity;for(let n=1;n<10000;n++){const logp=-Math.log(n)-.5*Math.log(2*Math.PI)-.5*(Math.log(n)-Math.log(config.numEnts)+.5)**2;const err=Math.abs(logp-get('entity_number'));if(err<error){error=err;bestN=n;}}
 if(error>1e-9)throw Error('Could not recover integral entity count');
 const ranking=[...relRows].sort((a,b)=>b[1].length-a[1].length||Number(a[0].slice(4))-Number(b[0].slice(4))).map(([relation,rs],i)=>{
  const h=new Map();for(const r of rs)h.set(r.dependency_path,(h.get(r.dependency_path)||0)+1);
  return {rank:i+1,relation,sentences:rs.length,facts:new Set(rs.map(r=>r.entity1+'\t'+r.entity2)).size,paths:[...h].sort((a,b)=>b[1]-a[1]).map(([value,count])=>({value,count}))};
 });
 const final=i=>trace[i].at(-1);
 return {map_index:mapIndex,trace_iterations:trace.total.length,map_joint:get('total'),map_entity_count:bestN,expressed_entities:nounHist.size,
  map_facts:factCount,expressed_facts:facts.size,unexpressed_facts:factCount-facts.size,map_occupied_relations:get('relations_used'),map_expressed_relations:relRows.size,
  final_occupied_relations:final('relations_used'),final_expressed_relations:final('relations_with_sentences'),final_joint:final('total'),
  top20_sentences:ranking.slice(0,20).reduce((s,r)=>s+r.sentences,0),top20_facts:ranking.slice(0,20).reduce((s,r)=>s+r.facts,0),
  checks:{same_original_triples_in_same_order:true,trace_max_component_error:maxSumError,map_trigger_likelihood_error:triggerError,map_noun_likelihood_error:nounError},ranking};
}
const previous=summary(before,oldRows),current=summary(after,newRows);
const overlap=current.ranking.slice(0,20).map(r=>{
 const counts=new Map();for(let i=0;i<newRows.length;i++)if(newRows[i].relation===r.relation)counts.set(oldRows[i].relation,(counts.get(oldRows[i].relation)||0)+1);
 return {relation:r.relation,rank:r.rank,sentences:r.sentences,previous_relations:[...counts].sort((a,b)=>b[1]-a[1]).map(([relation,shared_rows])=>({relation,shared_rows}))};
});
fs.writeFileSync(path.join(after,'comparison.json'),JSON.stringify({previous,current,overlap},null,2)+'\n');
let summaryText='Corrected NYT MAP: top 20 relations by assigned sentence count\n\n';
for(const r of current.ranking.slice(0,20))summaryText+=`${r.rank}. ${r.relation}: ${r.sentences} rows, ${r.facts} expressed latent facts\n`+r.paths.map(p=>`  ${p.count} ${p.value}`).join('\n')+'\n\n';
fs.writeFileSync(path.join(after,'summary.txt'),summaryText);
const entries=[['MAP entity count','map_entity_count'],['MAP occupied relations (facts)','map_occupied_relations'],['MAP expressed relations (sentences)','map_expressed_relations'],['MAP facts','map_facts'],['MAP expressed facts','expressed_facts'],['MAP unexpressed facts','unexpressed_facts'],['Top-20 assigned rows','top20_sentences'],['Top-20 expressed facts','top20_facts'],['MAP trace index (0-based)','map_index'],['Final occupied relations','final_occupied_relations'],['Final expressed relations','final_expressed_relations']];
let body='# Corrected NYT run compared with the saved replication\n\nThe corrected run retains the prior configuration, including `maxRels=400`. Source triples are identical and in the same order. This is one new stochastic run, not a paired-seed causal estimate; several RNGs remain unseeded. The pool-dependent prior is unchanged.\n\n| Quantity | Previous | Corrected |\n|---|---:|---:|\n'+entries.map(([label,k])=>`| ${label} | ${previous[k]} | ${current[k]} |`).join('\n')+'\n\nBoth MAP TSVs pass independent collapsed noun/path likelihood reconstruction against their maximum trace entries. Every trace total matches its components. See [comparison.json](comparison.json) for residuals, full rankings and sentence-overlap mappings. The full fact sets are not serialized; fact counts are inferred from the origin term.\n\n[New semantic assessment](evaluation/README.md) · [Previous semantic assessment](../nyt-2026/evaluation/README.md) · [Run provenance](run.json)\n';
const oldEval=path.join(before,'evaluation/evaluations.json'),newEval=path.join(after,'evaluation/evaluations.json');
if(fs.existsSync(newEval)){
 const getCases=p=>{const data=read(p);return Array.isArray(data)?data:(data.facts??data.cases);};
 const counts=cs=>{cs=cs.filter(c=>c.rank>=1&&c.rank<=20);const n=cs.length,s=cs.filter(c=>c.judgment==='supported').length,e=cs.filter(c=>c.judgment==='incorrect').length,a=cs.filter(c=>c.judgment==='ambiguous').length;return {n,s,e,a,lower:s/n,upper:(s+a)/n};};
 const a=counts(getCases(oldEval)),b=counts(getCases(newEval));
 body+='\n| Same operational rubric, different inferred fact populations | Previous | Corrected |\n|---|---:|---:|\n'+[['Facts','n'],['Supported','s'],['Incorrect','e'],['Ambiguous','a']].map(([label,k])=>`| ${label} | ${a[k]} | ${b[k]} |`).join('\n')+`\n| Support ambiguity range | ${(100*a.lower).toFixed(2)}–${(100*a.upper).toFixed(2)}% | ${(100*b.lower).toFixed(2)}–${(100*b.upper).toFixed(2)}% |\n\nThese are assistant corpus-evidence judgments under explicit cluster predicates. They are not independently verified historical accuracy, sentence purity, or a matched reproduction of the paper’s roughly 95% assessment. Changes in selected relations and predicate mix also affect the aggregate.\n`;
}
fs.writeFileSync(path.join(after,'comparison.md'),body);
console.log(JSON.stringify({previous:{...previous,ranking:undefined},current:{...current,ranking:undefined}},null,2));
