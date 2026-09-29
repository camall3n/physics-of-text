import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {parseMap} from './parse_map.mjs';
import {sha,json,fmt,pct,esc} from './common.mjs';

export function censusFromRaw(raw,{topRelations=20}={}){
  assert(Number.isInteger(topRelations)&&topRelations>0);const parsed=parseMap(raw);const top=parsed.relations.slice(0,topRelations);const n=top.reduce((s,r)=>s+r.facts.length,0);assert(n>0,'Empty census');
  return {metadata:{schema_version:1,source_sha256:sha(raw),selection:'Every expressed ordered latent fact in the top relations; no sampling',ranking:'Descending assigned sentence rows; numeric relation ID breaks ties',unit:'Expressed ordered latent fact (relation ID, entity1 ID, entity2 ID)',top_relations_requested:topRelations,top_relations:top.length,corpus_sentences:parsed.sentence_count,total_expressed_relations:parsed.relation_count,total_expressed_facts:parsed.fact_count,population_facts:n,top_relation_rows:top.reduce((s,r)=>s+r.sentence_count,0),primary_estimator:'S/N; (S+A)/N; ambiguity endpoints, not confidence intervals'},relations:top.map(r=>({...r,population_facts:r.facts.length,micro_weight:r.facts.length/n}))};
}
export function factMarkdown(c,prefix='../raw_map.tsv'){
 return [`### ${c.case_id}`,'',`**All observed names:** ${c.names.map(n=>`${esc(n.value)} (${n.count})`).join('; ')}`,'',`Ordered IDs: ${c.entity1} → ${c.entity2}; ${c.sentence_count} rows.`,'','| Source line | First argument | Second argument | Full dependency path |','|---:|---|---|---|',...c.evidence.map(e=>`| [${e.line}](${prefix}:${e.line}) | ${esc(e.arg1)} | ${esc(e.arg2)} | ${esc(e.dependency_path)} |`),''];
}
export function dictionaryMarkdown(r){return ['## Full relation dictionary','','| Count | Dependency path |','|---:|---|',...r.paths.map(p=>`| ${p.count} | ${esc(p.value)} |`),''];}
const evidenceSignature=c=>c.evidence.map(e=>[e.line,e.arg1,e.arg2,e.dependency_path]);
export function loadPrior(priorDir,sourceHash,review){
 if(!priorDir)return null;const p=path.resolve(priorDir),cases=json(path.join(p,'cases.json'));
 assert.equal(cases.metadata.source_sha256,sourceHash,'Prior source hash does not match this MAP');
 const oldFacts=new Map((cases.cases??cases.relations.flatMap(r=>r.facts)).map(c=>[c.case_id,c]));
 const annotations=new Map(),references=[];
 for(const file of fs.readdirSync(path.join(p,'annotations')).filter(x=>x.endsWith('.json')).sort()){
  const raw=fs.readFileSync(path.join(p,'annotations',file),'utf8'),d=JSON.parse(raw);
  assert(!annotations.has(d.relation),'Duplicate prior relation');annotations.set(d.relation,d);references.push({file,sha256:sha(raw),content:raw});
 }
 for(const r of review.relations){const a=annotations.get(r.relation);if(!a)continue;const seen=new Set();for(const f of a.facts){assert(!seen.has(f.case_id),'Duplicate prior case');seen.add(f.case_id);const c=r.facts.find(x=>x.case_id===f.case_id);if(c){const old=oldFacts.get(f.case_id);assert(old,'Prior annotation lacks matching evidence');assert.deepEqual(evidenceSignature(old),evidenceSignature(c),'Prior case evidence differs despite matching source');}}}
 return {directory:p,cases_sha256:sha(fs.readFileSync(path.join(p,'cases.json'))),annotations,references};
}
// These saved worlds are retained as raw bug evidence; their evaluations were retired.
export const RETIRED_AUDIT_IDS=new Set(['audit_27d5f11626f1','audit_45b8dfbac29a','audit_1f78d7eb1e88','audit_7d6acecc7ec0','audit_original_subsidiary']);
export const RETIRED_SOURCES=new Set([
 'resources/sampler-140626/results/nyt-2026/map_world_sentences.tsv',
 'resources/sampler-140626/results/nyt-2026-fixed-400/map_world_sentences.tsv',
 'experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260912/map_world_sentences.tsv',
 'experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260913/map_world_sentences.tsv',
 'experiments/nyt-complete-evaluation-2026-09-14/supplemental/original_subsidiary_rel80.tsv'
]);

/** Bind preparation and output confinement to one campaign, without global paths. */
export function createCensusContext({studyRoot,repoRoot,rejectRetiredEvaluations=false}) {
 assert(studyRoot&&repoRoot,'Explicit studyRoot and repoRoot are required');
 const ROOT=path.resolve(studyRoot),REPO=path.resolve(repoRoot);
function within(file,base=ROOT){const absolute=path.resolve(file);assert(absolute.startsWith(base+path.sep),'Output must be inside isolated census folder');return absolute;}
function stable(file,content){within(file);if(fs.existsSync(file))assert.equal(fs.readFileSync(file,'utf8'),content,`Refusing to overwrite changed artifact: ${file}`);else fs.writeFileSync(file,content);}
function assertRetainedEvaluation(entry){
 assert(!RETIRED_AUDIT_IDS.has(entry.audit_id)&&!RETIRED_SOURCES.has(path.relative(REPO,path.resolve(entry.source))),'Evaluation retired for a confirmed buggy run; preserve raw output without recreating grading data');
}
function prepareCensus(entry,{outRoot=path.join(ROOT,'census')}={}){
 if(rejectRetiredEvaluations)assertRetainedEvaluation(entry);
 const source=path.resolve(entry.source),raw=fs.readFileSync(source,'utf8'),review=censusFromRaw(raw,{topRelations:entry.top_relations??20});
 const id=entry.audit_id??'audit_'+sha(path.relative(REPO,source)+'\0'+review.metadata.source_sha256).slice(0,12);
 assert(/^audit_[A-Za-z0-9_-]+$/.test(id));const out=within(path.join(outRoot,id));const prior=loadPrior(entry.prior,review.metadata.source_sha256,review);
 for(const d of ['relations','annotations','prior_annotations'])fs.mkdirSync(path.join(out,d),{recursive:true});
 review.metadata.audit_id=id;review.metadata.copied_source='raw_map.tsv';
 stable(path.join(out,'raw_map.tsv'),raw);stable(path.join(out,'cases.json'),fmt(review));
 const sourceManifest={audit_id:id,source:path.relative(REPO,source),source_sha256:review.metadata.source_sha256,source_bytes:Buffer.byteLength(raw),cases_sha256:sha(fmt(review)),prior_directory:prior?path.relative(REPO,prior.directory):null,prior_cases_sha256:prior?.cases_sha256??null,prior_annotation_hashes:prior?Object.fromEntries(prior.references.map(r=>[r.file,r.sha256])):{}};
 stable(path.join(out,'source.json'),fmt(sourceManifest));
 if(prior){for(const r of prior.references)stable(path.join(out,'prior_annotations',r.file),r.content);stable(path.join(out,'prior_cases.json'),fs.readFileSync(path.join(prior.directory,'cases.json'),'utf8'));if(fs.existsSync(path.join(prior.directory,'human_review.json'))){const humanRaw=fs.readFileSync(path.join(prior.directory,'human_review.json'),'utf8');stable(path.join(out,'prior_human_review.json'),humanRaw);stable(path.join(out,'prior_human_review.sha256'),sha(humanRaw)+'\n');}}
 let inherited=0;
 for(const r of review.relations){const a=prior?.annotations.get(r.relation),previous=new Map((a?.facts??[]).map(c=>[c.case_id,c]));
  const annotations={relation:r.relation,predicate_id:'',label:a?.label??'',definition:a?.definition??'',scope_notes:a?.scope_notes??'',predicate_provenance:a?{source:path.join('prior_annotations',r.relation+'.json'),source_sha256:sourceManifest.prior_annotation_hashes[r.relation+'.json'],status:'Reference declaration; reviewer must confirm shared-catalogue scope'}:null,facts:r.facts.map(c=>{const old=previous.get(c.case_id);if(old?.judgment){inherited++;return {...old,provisional:true,provenance:{kind:'exact_source_case_prior_judgment',source_map_sha256:review.metadata.source_sha256,source:path.join('prior_annotations',r.relation+'.json'),annotation_sha256:sourceManifest.prior_annotation_hashes[r.relation+'.json']}};}return {case_id:c.case_id,judgment:'',reason:'',evidence_lines:[],issue_tags:[],reviewer_question:'',provisional:false};})};
  const file=path.join(out,'annotations',r.relation+'.json');if(!fs.existsSync(file))fs.writeFileSync(file,fmt(annotations));
  const md=[`# ${id} — ${r.relation}`,'',`Rank ${r.rank}; ${r.sentence_count} sentence rows; **all ${r.population_facts} expressed facts**.`,'',a?`Prior predicate reference: **${esc(a.label)}**. ${esc(a.definition)} ${esc(a.scope_notes)}`:'Declare a coherent directional predicate from this complete dictionary before grading.','',...dictionaryMarkdown(r),'## Complete fact census','',...r.facts.flatMap(c=>factMarkdown(c))];stable(path.join(out,'relations',r.relation+'.md'),md.join('\n'));
 }
 const human={source_sha256:review.metadata.source_sha256,instructions:'Optional explicit human overrides. Leave judgment blank to retain the primary judgment. A nonblank override requires case_id, judgment, reason, valid evidence_lines, reviewer, and a reviewer_question if ambiguous. Never delete primary provenance. Reporter validates each override; preparation never overwrites this file.',overrides:[]};if(!fs.existsSync(path.join(out,'human_review.json')))fs.writeFileSync(path.join(out,'human_review.json'),fmt(human));
 const refs={audit_id:id,prior_directory:sourceManifest.prior_directory,source_map_sha256:review.metadata.source_sha256,inherited_exact_cases:inherited,note:'Inherited entries are provisional exact-source/case judgments, not extrapolations. Reviewers must verify shared predicate scope and local identity conventions before clearing provisional. Original entries remain in prior_annotations.'};stable(path.join(out,'prior_references.json'),fmt(refs));
 stable(path.join(out,'README.md'),[`# Complete census ${id}`,'',`**${review.metadata.population_facts} facts in ${review.metadata.top_relations} top relations**, covering ${review.metadata.top_relation_rows}/${review.metadata.corpus_sentences} source rows. No fact sampling.`,'','[**Evaluated assessment and counts**](assessment.md) · [**Every fact with judgments**](reports/) · [Human overrides](human_review.json)','','[Prepared evidence worksheet](cases.json) · [Source snapshot](raw_map.tsv) · [Source hashes](source.json) · [Prior references](prior_references.json)','','Every relation below includes its full dictionary and every fact with all evidence rows. Annotation files are editable; preparation never overwrites them. Imported judgments remain provisional until a reviewer verifies scope and identity conventions. Final reports require complete validated annotations.','','| Rank | Relation evidence | Facts | Prior predicate | Annotations |','|---:|---|---:|---|---|',...review.relations.map(r=>`| ${r.rank} | [${r.relation}](relations/${r.relation}.md) | ${r.population_facts} | ${esc(prior?.annotations.get(r.relation)?.label??'unassigned')} | [JSON](annotations/${r.relation}.json) |`),''].join('\n'));
 return {audit_id:id,folder:path.relative(ROOT,out),label:entry.label??path.basename(path.dirname(source)),source:sourceManifest.source,source_sha256:review.metadata.source_sha256,prior_directory:sourceManifest.prior_directory,population_facts:review.metadata.population_facts,relations:review.metadata.top_relations,inherited_exact_cases:inherited};
}
 return {ROOT,REPO,sha,json,fmt,pct,esc,within,stable,censusFromRaw,factMarkdown,dictionaryMarkdown,loadPrior,assertRetainedEvaluation,prepareCensus};
}
