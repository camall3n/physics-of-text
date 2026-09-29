import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,fmt,sha,pct,esc} from '../common.mjs';

const labels=['supported','incorrect','ambiguous'];
const signature=c=>c.evidence.map(e=>[e.line,e.arg1,e.arg2,e.dependency_path]);
const counts=facts=>({N:facts.length,S:facts.filter(f=>f.judgment==='supported').length,E:facts.filter(f=>f.judgment==='incorrect').length,A:facts.filter(f=>f.judgment==='ambiguous').length});
const endpoints=c=>({lower:c.N?c.S/c.N:null,upper:c.N?(c.S+c.A)/c.N:null});

// Pure arithmetic on individually supplied old/new judgments. No semantic labels are inferred.
export function comparePriorCases({result,priorCases,priorAnnotations,priorHuman=null}){
 assert.equal(priorCases.metadata.source_sha256,result.metadata.source_sha256,'Prior comparison source differs');
 const current=new Map(result.facts.map(f=>[f.case_id,f]));
 const originals=priorCases.cases??priorCases.relations.flatMap(r=>r.facts);
 const oldCases=new Map();for(const f of originals){assert(!oldCases.has(f.case_id),'Duplicate prior evidence case');oldCases.set(f.case_id,f);}
 const oldByRelation=new Map();for(const a of priorAnnotations){assert(!oldByRelation.has(a.relation),'Duplicate prior relation');oldByRelation.set(a.relation,a);}
 const human=new Map();for(const h of priorHuman?.overrides??priorHuman?.reviews??[]){if(!h.judgment)continue;assert(labels.includes(h.judgment),'Invalid prior human judgment');assert(!human.has(h.case_id),'Duplicate prior human judgment');assert(oldCases.has(h.case_id),'Foreign prior human judgment');human.set(h.case_id,h);}
 const matched=[],strata=[];let oldLower=0,oldUpper=0,newLower=0,newUpper=0;
 for(const s of result.strata){const old=oldByRelation.get(s.relation);assert(old,`No prior declaration for ${s.relation}`);const seen=new Set();const local=[];
  for(const original of old.facts){assert(!seen.has(original.case_id),'Duplicate prior annotation case');seen.add(original.case_id);const c=current.get(original.case_id);assert(c,`Prior label outside the current relation census: ${original.case_id}`);assert.equal(c.relation,s.relation,'Prior case in foreign relation');const evidence=oldCases.get(c.case_id);assert(evidence,'Prior label has no evidence');assert.deepEqual(signature(evidence),signature(c),'Prior comparison evidence differs');
   const chosen=human.get(c.case_id)??original;assert(labels.includes(chosen.judgment),'Missing prior judgment');
   const prior={judgment:chosen.judgment,reason:chosen.reason??chosen.notes??'',issue_tags:chosen.issue_tags??[],reviewer_question:chosen.reviewer_question??chosen.question??'',judgment_source:human.has(c.case_id)?'prior_human_override':'prior_annotation',annotation_judgment:original.judgment};
   const entry={case_id:c.case_id,relation:s.relation,names:c.names,source_lines:c.source_lines,predicate_id:s.predicate_id,prior,current:{judgment:c.judgment,reason:c.reason,issue_tags:c.issue_tags,reviewer_question:c.reviewer_question,judgment_source:c.judgment_source},label_changed:prior.judgment!==c.judgment};matched.push(entry);local.push(entry);
  }
  assert(local.length>0,`No prior cases for ${s.relation}`);assert(local.length<=s.N);assert.equal(local.length,originals.filter(f=>f.relation===s.relation).length,`Missing prior case judgment in ${s.relation}`);
  const oldCount=counts(local.map(f=>f.prior)),newCount=counts(local.map(f=>f.current)),weight=s.N/result.counts.N;
  oldLower+=weight*oldCount.S/local.length;oldUpper+=weight*(oldCount.S+oldCount.A)/local.length;
  newLower+=weight*newCount.S/local.length;newUpper+=weight*(newCount.S+newCount.A)/local.length;
  const declaration={prior:{label:old.label,definition:old.definition,scope_notes:old.scope_notes},current:{label:s.label,definition:s.definition,scope_notes:s.scope_notes}};
  strata.push({relation:s.relation,predicate_id:s.predicate_id,population_facts:s.N,previously_reviewed:local.length,newly_reviewed:s.N-local.length,weight,old_counts:oldCount,current_counts_on_same_cases:newCount,label_changes:local.filter(f=>f.label_changed).length,declaration_text_changed:['label','definition','scope_notes'].some(k=>declaration.prior[k]!==declaration.current[k]),declaration});
 }
 const sampled=matched.length<result.counts.N,matchedIds=new Set(matched.map(f=>f.case_id));
 const oldCount=counts(matched.map(f=>f.prior)),sameCount=counts(matched.map(f=>f.current)),added=counts(result.facts.filter(f=>!matchedIds.has(f.case_id)));
 if(!sampled){oldLower=oldCount.S/oldCount.N;oldUpper=(oldCount.S+oldCount.A)/oldCount.N;newLower=sameCount.S/sameCount.N;newUpper=(sameCount.S+sameCount.A)/sameCount.N;}
 assert.equal(oldCount.N+added.N,result.counts.N);const transitions=Object.fromEntries(labels.map(a=>[a,Object.fromEntries(labels.map(b=>[b,matched.filter(f=>f.prior.judgment===a&&f.current.judgment===b).length]))]));
 return {audit_id:result.metadata.audit_id,source_sha256:result.metadata.source_sha256,prior_kind:sampled?'stratified_sample':'complete_top20_census',previously_reviewed:oldCount.N,newly_reviewed:added.N,old_counts_on_prior_cases:oldCount,current_counts_on_same_cases:sameCount,new_case_census:{...added,...endpoints(added)},old_estimator:{lower:oldLower,upper:oldUpper},harmonized_estimator_on_identical_prior_cases:{lower:newLower,upper:newUpper},complete_census:{...result.counts,...result.precision},decomposition:{same_case_revision_lower:newLower-oldLower,same_case_revision_upper:newUpper-oldUpper,coverage_expansion_lower:result.precision.lower-newLower,coverage_expansion_upper:result.precision.upper-newUpper,total_change_lower:result.precision.lower-oldLower,total_change_upper:result.precision.upper-oldUpper},label_changes:matched.filter(f=>f.label_changed).length,transitions,strata,cases:matched};
}

export function readPriorComparison(folder,result){
 const source=json(path.join(folder,'source.json'));if(!source.prior_directory)return null;
 const priorRaw=fs.readFileSync(path.join(folder,'prior_cases.json'));assert.equal(sha(priorRaw),source.prior_cases_sha256,'Prior cases snapshot changed');
 const annotations=Object.entries(source.prior_annotation_hashes).map(([file,hash])=>{const raw=fs.readFileSync(path.join(folder,'prior_annotations',file));assert.equal(sha(raw),hash,'Prior annotation snapshot changed');return JSON.parse(raw);});
 const humanPath=path.join(folder,'prior_human_review.json');let human=null;if(fs.existsSync(humanPath)){const raw=fs.readFileSync(humanPath);assert.equal(sha(raw),fs.readFileSync(path.join(folder,'prior_human_review.sha256'),'utf8').trim(),'Prior human snapshot changed');human=JSON.parse(raw);}
 return {...comparePriorCases({result,priorCases:JSON.parse(priorRaw),priorAnnotations:annotations,priorHuman:human}),prior_directory:source.prior_directory};
}


export function createPriorComparisons({ROOT}) {
function writePriorComparisons(checked){
 const runs=checked.map(({a,result})=>{const c=readPriorComparison(path.join(ROOT,a.folder),result);return c?{...c,label:a.label,folder:a.folder}:null;}).filter(Boolean);
 const note='The old estimator and the harmonized estimator use exactly the same prior cases and the same relation-population weights N_r/N. For the 12 sampled runs this reconstructs the stratified estimator, not the unweighted success fraction among 100 cases. For the two old complete evaluations it is the exact top-20 census fraction; extra subsidiary cases are excluded. The full census uses every fact. Ambiguity endpoints are descriptive; no sampling confidence intervals are added here.';
 fs.writeFileSync(path.join(ROOT,'prior_comparison.json'),fmt({note,runs}));
 const md=['# Previous evaluations versus harmonized complete census','','[Method](METHOD.md) · [Complete current comparison](comparison.md) · [All matched prior/current judgments](prior_comparison.json) · [Every changed label](judgment_changes.md)','',note,'','Read each row left to right: first change the judgments/declared scope on the same previously reviewed cases, then expand to all cases while keeping the current scope fixed. The two differences are an arithmetic decomposition, not estimates of causal effects. Text differences between declarations do not prove a semantic scope change; changed-label reasons must be inspected. Newly evaluated facts were judged individually, with no label extrapolation.','','| Run | Prior / full N | Prior estimate | Current scope, identical prior cases | Complete current census | Same-case changed labels | New-case census S/E/A |','|---|---:|---:|---:|---:|---:|---|',...runs.map(r=>`| [${esc(r.label)}](${r.folder}/assessment.md) | ${r.previously_reviewed}/${r.complete_census.N} | ${pct(r.old_estimator.lower)}–${pct(r.old_estimator.upper)} | ${pct(r.harmonized_estimator_on_identical_prior_cases.lower)}–${pct(r.harmonized_estimator_on_identical_prior_cases.upper)} | ${pct(r.complete_census.lower)}–${pct(r.complete_census.upper)} | ${r.label_changes} | ${r.new_case_census.N?`${r.new_case_census.S}/${r.new_case_census.E}/${r.new_case_census.A} (N=${r.new_case_census.N})`:'none; already a census'} |`),'','The JSON also gives exact counts on the prior subset, transition matrices, per-relation declarations, and the two endpoint differences. Original annotations and any original human overrides remain in each audit’s prior snapshots. Current human overrides, if any, are included in the current results.',''];
 fs.writeFileSync(path.join(ROOT,'prior_comparison.md'),md.join('\n'));
 const changes=['# Every changed judgment on a previously reviewed fact','','[Comparison and interpretation](prior_comparison.md) · [Structured prior/current comparison](prior_comparison.json)','','Each entry is an exact-source, exact-case match. A changed label may reflect a clearer common predicate scope, an identity/attachment correction, or a reviewer reassessment. The report does not automatically assign a causal category. All dictionaries and every case row are available through the linked evaluated relation report.',''];
 for(const r of runs){changes.push(`## ${r.label}`,'',`${r.label_changes}/${r.previously_reviewed} previously reviewed labels changed; ${r.newly_reviewed} additional facts were evaluated.`,'');for(const s of r.strata){const items=r.cases.filter(c=>c.relation===s.relation&&c.label_changed);if(!items.length)continue;changes.push(`### ${s.relation} — ${s.predicate_id}`,'',`[Full dictionary and all evidence](${r.folder}/reports/${s.relation}.md) · [Prior annotation](${r.folder}/prior_annotations/${s.relation}.json)`,'',`Prior declaration: **${s.declaration.prior.label}**. ${s.declaration.prior.definition} ${s.declaration.prior.scope_notes}`,'',`Current declaration: **${s.declaration.current.label}**. ${s.declaration.current.definition} ${s.declaration.current.scope_notes}`,'');for(const c of items)changes.push(`- **${c.case_id}: ${c.prior.judgment} → ${c.current.judgment}.** ${c.names.map(n=>n.value).join('; ')}. Source lines: ${c.source_lines.map(n=>`[${n}](${r.folder}/raw_map.tsv:${n})`).join(', ')}.\n  - Prior reason (${c.prior.judgment_source}): ${c.prior.reason}\n  - Current reason (${c.current.judgment_source}): ${c.current.reason}${c.current.reviewer_question?'\n  - Current question: '+c.current.reviewer_question:''}`,'');}}
 fs.writeFileSync(path.join(ROOT,'judgment_changes.md'),changes.join('\n'));return runs;
}
 return {comparePriorCases,readPriorComparison,writePriorComparisons};
}
