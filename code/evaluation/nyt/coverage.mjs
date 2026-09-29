import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {parseMap} from './parse_map.mjs';
import {sha,json,fmt,esc} from './common.mjs';
import {loadPredicateRegistry,predicateHash} from './predicates.mjs';
export {predicateHash} from './predicates.mjs';

export const TARGETS=[0.57,0.60,0.70,0.80,0.90];
export const dictionaryHash=r=>sha(fmt(r.paths));
export function coveragePrefixes(parsed,targets=TARGETS){
 assert(parsed.sentence_count>0&&parsed.relations.length>0,'Empty ranking');
 assert(targets.length&&targets.every((t,i)=>Number.isFinite(t)&&t>0&&t<=1&&(i===0||t>targets[i-1])),'Targets must increase within (0,1]');
 let priorK=0,priorN=0,priorRows=0;
 return targets.map(target=>{let rows=0,N=0,k=0;while(rows<target*parsed.sentence_count){assert(k<parsed.relations.length,'Insufficient ranked rows');const r=parsed.relations[k++];rows+=r.sentence_count;N+=r.facts.length;}
  const d={target,selection:'Smallest prefix reaching the requested fraction of all source sentence rows',k,N,rows,total_rows:parsed.sentence_count,achieved_coverage:rows/parsed.sentence_count,previous_prefix_k:priorK,added_relations:k-priorK,added_N:N-priorN,added_rows:rows-priorRows};priorK=k;priorN=N;priorRows=rows;return d;});
}

/** Coverage selection and declaration rules; priorRoot identifies the frozen baseline campaign. */
export function createCoverageContext({census,priorRoot}) {
 assert(census&&priorRoot,'Census context and explicit priorRoot are required');
 const {ROOT,REPO,stable,within,censusFromRaw,dictionaryMarkdown,factMarkdown}=census;
 const PRIOR_ROOT=path.resolve(priorRoot);
function loadCatalogue(){
 const file=path.join(ROOT,'analysis/predicate_catalogue.json');assert(fs.existsSync(file),'Frozen predicate catalogue missing');
 return loadPredicateRegistry(file).predicates;
}
function writeCoverageReadme(out,{complete=fs.existsSync(path.join(out,'assessment.json')),outputDirectory=out}={}){
 const d=json(path.join(out,'cases.json')),coverage=json(path.join(out,'coverage.json')),m=d.metadata,id=m.audit_id,old=coverage.reference_top20.N,additional=m.population_facts-old;
 fs.writeFileSync(path.join(outputDirectory,'README.md'),[`# Coverage census ${id}`,'','[**Evaluated threshold assessments**](assessment.md) · [**Every fact and judgment**](reports/) · [Human overrides](human_review.json)','',`Maximum requested prefix: ${m.top_relations} relations, ${m.population_facts} facts, ${m.top_relation_rows}/${m.corpus_sentences} sentence rows. Exactly ${old} prior top20 facts retained; ${additional} additional facts ${complete?'completely reviewed':'await complete review'}.`, '',...coverage.targets.map(t=>`- [${Math.round(t.target*100)}% coverage assessment](coverage_${Math.round(t.target*100)}.md): ranks 1–${t.k}, ${t.N} facts.`),'','[Threshold definitions](coverage.json) · [Full ranked saved output](ranked_cases.json) · [Complete selected evidence](cases.json) · [Immutable prior assessment](prior_assessment.md) · [Source hashes](source.json)','', '| Rank | Evaluated dictionary and every fact | N | Prepared evidence | Annotation | Frozen declaration |','|---:|---|---:|---|---|---|',...d.relations.map(r=>`| ${r.rank} | [${r.relation}](reports/${r.relation}.md) | ${r.population_facts} | [Evidence](relations/${r.relation}.md) | [JSON](annotations/${r.relation}.json) | [Predicate](declarations/${r.relation}.json) |`),''].join('\n'));
}
function prepareCoverage(entry,{outRoot=path.join(ROOT,'census'),targets=TARGETS,priorRoot=PRIOR_ROOT,catalogue=null}={}){
 const source=path.resolve(REPO,entry.source),raw=fs.readFileSync(source,'utf8'),hash=sha(raw);assert.equal(hash,entry.source_sha256,'Listed source hash differs');
 const parsed=parseMap(raw),thresholds=coveragePrefixes(parsed,targets),max=thresholds.at(-1),id=entry.audit_id;
 assert(/^audit_[A-Za-z0-9_-]+$/.test(id));const out=within(path.join(outRoot,id)),priorDir=path.join(priorRoot,entry.folder);
 for(const dir of ['relations','annotations','declarations','prior_annotations'])fs.mkdirSync(path.join(out,dir),{recursive:true});
 const priorCases=json(path.join(priorDir,'cases.json')),priorAssessment=json(path.join(priorDir,'assessment.json'));
 assert.equal(priorCases.metadata.source_sha256,hash,'Prior full census belongs to another source');assert.equal(priorAssessment.metadata.source_sha256,hash);assert(priorAssessment.metadata.census_complete);
 const priorById=new Map(priorAssessment.facts.map(c=>[c.case_id,c])),priorRelations=new Map(priorCases.relations.map(r=>[r.relation,r]));
 const review=censusFromRaw(raw,{topRelations:max.k});review.metadata.audit_id=id;review.metadata.copied_source='raw_map.tsv';
 const ranked=censusFromRaw(raw,{topRelations:parsed.relation_count});ranked.metadata.audit_id=id;ranked.metadata.copied_source='raw_map.tsv';
 const coverage={mode:'sentence_rows',ranking:'Descending assigned sentence rows; numeric relation ID breaks ties. Whole relations retained; no expansion of boundary ties.',targets:thresholds,reference_top20:{k:priorCases.metadata.top_relations,N:priorAssessment.counts.N,rows:priorCases.metadata.top_relation_rows,counts:priorAssessment.counts,precision:priorAssessment.precision},maximum_prefix_k:max.k,maximum_prefix_N:max.N,new_facts:max.N-priorAssessment.counts.N};
 stable(path.join(out,'raw_map.tsv'),raw);stable(path.join(out,'cases.json'),fmt(review));stable(path.join(out,'ranked_cases.json'),fmt(ranked));stable(path.join(out,'coverage.json'),fmt(coverage));
 const snapshots={};for(const [from,to] of [['cases.json','prior_cases.json'],['assessment.json','prior_assessment.json'],['assessment.md','prior_assessment.md'],['human_review.json','prior_human_review.json']]){const content=fs.readFileSync(path.join(priorDir,from));stable(path.join(out,to),content.toString());snapshots[to]=sha(content);}
 const annotationHashes={};for(const file of fs.readdirSync(path.join(priorDir,'annotations')).filter(f=>f.endsWith('.json')).sort()){const content=fs.readFileSync(path.join(priorDir,'annotations',file));stable(path.join(out,'prior_annotations',file),content.toString());snapshots['prior_annotations/'+file]=sha(content);annotationHashes[file]=sha(content);}
 const sourceManifest={audit_id:id,source:entry.source,source_sha256:hash,source_bytes:Buffer.byteLength(raw),cases_sha256:sha(fmt(review)),ranked_cases_sha256:sha(fmt(ranked)),coverage_sha256:sha(fmt(coverage)),prior_directory:path.relative(REPO,priorDir),prior_cases_sha256:snapshots['prior_cases.json'],prior_annotation_hashes:annotationHashes,snapshot_hashes:snapshots};stable(path.join(out,'source.json'),fmt(sourceManifest));
 const cat=catalogue??loadCatalogue();let inherited=0;
 for(const r of review.relations){const priorR=priorRelations.get(r.relation),file=path.join(out,'annotations',r.relation+'.json');let a={relation:r.relation,predicate_id:'',label:'',definition:'',scope_notes:'',facts:r.facts.map(c=>({case_id:c.case_id,judgment:'',reason:'',evidence_lines:[],issue_tags:[],reviewer_question:'',provisional:false}))};
  if(priorR){assert.deepEqual(r.facts,priorR.facts,'Prior top20 full case evidence/order changed');a=json(path.join(priorDir,'annotations',r.relation+'.json'));const p=cat.get(a.predicate_id);assert(p,'Prior predicate missing from frozen catalogue');for(const k of ['label','definition','scope_notes'])assert.equal(a[k],p[k],'Prior scope differs');a.predicate_hash=predicateHash(p);a.predicate_version=p.version??1;
   a.facts=a.facts.map(old=>{const selected=priorById.get(old.case_id);assert(selected,'Prior final assessment missing case');inherited++;return {...old,judgment:selected.judgment,reason:selected.reason,evidence_lines:selected.evidence_lines,issue_tags:selected.issue_tags,reviewer_question:selected.reviewer_question,provisional:false,provenance:{kind:'exact_complete_census_judgment',source_map_sha256:hash,source:'prior_assessment.json',assessment_sha256:snapshots['prior_assessment.json'],annotation_source:'prior_annotations/'+r.relation+'.json',annotation_sha256:annotationHashes[r.relation+'.json'],prior_judgment_source:selected.judgment_source}};});
   const declaration={relation:r.relation,predicate_id:p.id,predicate_version:p.version??1,predicate_hash:predicateHash(p),predicate:p,dictionary_sha256:dictionaryHash(r),kind:'inherited_frozen_complete_census',rationale:'Exact same source and complete relation evidence; preserve the prior complete-census predicate and final judgments without amendment.',reviewer:'prior complete-census reviewer',source_map_sha256:hash,prior_annotation_sha256:annotationHashes[r.relation+'.json'],prior_assessment_sha256:snapshots['prior_assessment.json']};stable(path.join(out,'declarations',r.relation+'.json'),fmt(declaration));
  }
  if(!fs.existsSync(file))fs.writeFileSync(file,fmt(a));
  stable(path.join(out,'relations',r.relation+'.md'),[`# ${id} — ${r.relation}`,'',`Rank ${r.rank}; ${r.sentence_count} rows; every ${r.population_facts} inferred ordered fact.`, '',priorR?`Frozen prior predicate: **${esc(a.label)}**. ${esc(a.definition)} ${esc(a.scope_notes)}`:'Declare one coherent predicate from the complete dictionary before grading any fact.', '',...dictionaryMarkdown(r),'## Every fact and all evidence','',...r.facts.flatMap(c=>factMarkdown(c))].join('\n'));
 }
 assert.equal(inherited,priorAssessment.counts.N,'Some old top20 cases were not exactly inherited');
 if(!fs.existsSync(path.join(out,'human_review.json')))fs.writeFileSync(path.join(out,'human_review.json'),fmt({source_sha256:hash,instructions:'Optional case-specific human overrides; preserve primary annotations. Required for nonblank judgment: case_id, judgment, reason, evidence_lines, issue_tags, reviewer_question, reviewer. Ambiguous judgments need a specific question. Prior top20 changes are rejected to preserve the baseline evaluation.',overrides:[]}));
 writeCoverageReadme(out);
 return {audit_id:id,folder:path.relative(ROOT,out),label:entry.label,source:entry.source,source_sha256:hash,population_facts:max.N,relations:max.k,inherited_exact_cases:inherited,thresholds};
}
function declarePredicate(folder,{relation,predicate_id,rationale,reviewer,declared_at=new Date().toISOString(),supporting_path_indices=[],competing_meanings=[],scope_limitations=[],argument_roles_inspected=true,complete_dictionary_read=true}){
 const out=within(path.resolve(folder)),cases=json(path.join(out,'cases.json')),r=cases.relations.find(r=>r.relation===relation);assert(r,'Relation outside selected prefix');
 assert(typeof rationale==='string'&&rationale.trim(),'Dictionary-selection rationale required');assert(typeof reviewer==='string'&&reviewer.trim(),'Reviewer required');
 const p=loadCatalogue().get(predicate_id);assert(p,'Predicate must be approved in the append-only catalogue first');for(const k of ['label','definition','scope_notes'])assert(typeof p[k]==='string'&&p[k].trim(),`Missing predicate ${k}`);
 const annFile=path.join(out,'annotations',relation+'.json'),declarationFile=path.join(out,'declarations',relation+'.json'),a=json(annFile);
 if(fs.existsSync(declarationFile)){const old=json(declarationFile);assert.equal(old.predicate_id,predicate_id,'Frozen predicate cannot change');assert.equal(old.predicate_hash,predicateHash(p),'Frozen predicate content changed');assert.equal(old.dictionary_sha256,dictionaryHash(r),'Frozen dictionary changed');return old;}
 assert(a.facts.length===r.facts.length&&a.facts.every(f=>!f.judgment),'Declare before any fact judgments');
 const human=json(path.join(out,'human_review.json'));assert(!human.overrides.some(f=>f.judgment&&r.facts.some(c=>c.case_id===f.case_id)),'Declare before any human judgments');
 const blankRaw=fs.readFileSync(annFile,'utf8'),blankFile=relation+'.before_grading.json';stable(path.join(out,'declarations',blankFile),blankRaw);
 assert(complete_dictionary_read&&argument_roles_inspected,'Full dictionary and ordered roles must be inspected');assert(Array.isArray(supporting_path_indices)&&supporting_path_indices.every(i=>Number.isInteger(i)&&i>=0&&i<r.paths.length),'Invalid supporting dictionary index');
 const d={relation,predicate_id,predicate_version:p.version??1,predicate_hash:predicateHash(p),predicate:p,dictionary_sha256:dictionaryHash(r),kind:'declared_before_case_grading',rationale,reviewer,declared_at,complete_dictionary_read,argument_roles_inspected,supporting_path_indices,competing_meanings,scope_limitations,source_map_sha256:cases.metadata.source_sha256,pregrading_annotation_file:blankFile,pregrading_annotation_sha256:sha(blankRaw)};
 stable(declarationFile,fmt(d));Object.assign(a,{predicate_id,label:p.label,definition:p.definition,scope_notes:p.scope_notes,predicate_hash:d.predicate_hash,predicate_version:d.predicate_version,predicate_declaration_sha256:sha(fmt(d))});fs.writeFileSync(annFile,fmt(a));return d;
}
 return {TARGETS,PRIOR_ROOT,predicateHash,dictionaryHash,coveragePrefixes,loadCatalogue,writeCoverageReadme,prepareCoverage,declarePredicate};
}
