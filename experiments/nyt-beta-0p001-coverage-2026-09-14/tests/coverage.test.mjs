import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import {ROOT,REPO,fmt,sha,json,censusFromRaw} from '../scripts/census_lib.mjs';
import {parseMap} from '../scripts/parse_map.mjs';
import {coveragePrefixes,prepareCoverage,loadCatalogue,predicateHash} from '../scripts/coverage_lib.mjs';
import {declarePredicate} from '../scripts/declare_predicate.mjs';
import {validateAudit,writeAuditReport} from '../scripts/report_censuses.mjs';
import {scoreCoverage,scoreFacts} from '../scripts/threshold_scores.mjs';
import {identityFlag} from '../scripts/evidence_diagnostics.mjs';
const header='relation\tentity1\tentity2\targ1\targ2\tpath\n';
function rawFor(sizes){let i=0;return header+sizes.flatMap(([id,n])=>Array.from({length:n},()=>{const j=++i;return `rel_${id}\tEnt[ent_${j}]\tEnt[ent_${1000+j}]\tPerson${j}\tOrganization${j}\t<-nsubj<-works->prep_for->`;})).join('\n')+'\n';}
test('minimal prefix uses all rows and includes the whole boundary relation',()=>{const d=coveragePrefixes(parseMap(rawFor([[2,6],[1,5],[4,4],[3,2]])),[.57,.6,.7,.8,.9]);assert.deepEqual(d.map(x=>x.k),[2,2,3,3,4]);assert.deepEqual(d.map(x=>x.rows),[11,11,15,15,17]);assert.equal(d[0].N,11);assert.equal(d[1].added_N,0);});
test('ties use numeric relation ID and do not expand every tied relation',()=>{const p=parseMap(rawFor([[12,2],[2,2],[1,3]]));assert.deepEqual(p.relations.map(r=>r.relation),['rel_1','rel_2','rel_12']);assert.equal(coveragePrefixes(p,[5/7])[0].k,2);});
test('targets must increase and remain valid fractions',()=>{const p=parseMap(rawFor([[1,2]]));for(const x of [[.8,.7],[0],[1.01],[],[NaN]])assert.throws(()=>coveragePrefixes(p,x));});
test('census includes seventeen distinct facts and repeated evidence without a five-case cap',()=>{let raw=rawFor([[1,17]]);raw+=raw.split('\n')[1]+'\n';const p=parseMap(raw),d=coveragePrefixes(p,[.9])[0];assert.equal(d.N,17);assert.equal(d.rows,18);assert.equal(p.relations[0].facts[0].evidence.length,2);});
function fixture(t){
 const dir=fs.mkdtempSync(path.join(ROOT,'tests','coverage-fixture-'));t.after(()=>fs.rmSync(dir,{recursive:true,force:true}));const prior=path.join(dir,'prior');fs.mkdirSync(path.join(prior,'annotations'),{recursive:true});
 const raw=rawFor([[1,6],[2,5],[3,4],[4,2]]),source=path.join(dir,'source.tsv');fs.writeFileSync(source,raw);const p=[...loadCatalogue().values()][0],old=censusFromRaw(raw,{topRelations:1});old.metadata.audit_id='audit_fixture';old.metadata.copied_source='raw_map.tsv';
 const facts=old.relations[0].facts.map(c=>({...c,predicate_id:p.id,label:p.label,judgment:'supported',reason:'Fixture clear local evidence.',evidence_lines:c.source_lines,issue_tags:[],reviewer_question:'',judgment_source:'primary'}));
 const ann={relation:'rel_1',predicate_id:p.id,label:p.label,definition:p.definition,scope_notes:p.scope_notes,facts:facts.map(c=>({case_id:c.case_id,judgment:c.judgment,reason:c.reason,evidence_lines:c.evidence_lines,issue_tags:[],reviewer_question:'',provisional:false}))};
 const assessment={metadata:{...old.metadata,census_complete:true},counts:{N:6,S:6,E:0,A:0,human_overrides:0},precision:{lower:1,upper:1},strata:[{relation:'rel_1',predicate_id:p.id}],facts};
 for(const [name,data]of [['cases.json',old],['assessment.json',assessment],['annotations/rel_1.json',ann],['human_review.json',{source_sha256:sha(raw),overrides:[]}]])fs.writeFileSync(path.join(prior,name),fmt(data));fs.writeFileSync(path.join(prior,'assessment.md'),'Prior fixture assessment\n');
 const entry={audit_id:'audit_fixture',folder:'prior',source:path.relative(REPO,source),source_sha256:sha(raw),label:'fixture'},options={outRoot:path.join(dir,'out'),priorRoot:dir,targets:[.57,.6,.7,.8,.9]};const item=prepareCoverage(entry,options),out=path.join(ROOT,item.folder),cases=json(path.join(out,'cases.json'));
 for(const r of cases.relations.slice(1)){declarePredicate(out,{relation:r.relation,predicate_id:p.id,rationale:'Fixture declaration before grading.',reviewer:'test'});const file=path.join(out,'annotations',r.relation+'.json'),a=json(file);for(const [i,f]of a.facts.entries())Object.assign(f,{judgment:'supported',reason:'Fixture local support.',evidence_lines:r.facts[i].source_lines,issue_tags:[],reviewer_question:''});fs.writeFileSync(file,fmt(a));}
 return {dir,out,source,entry,options,cases,p};
}
function change(f,file,edit){const location=path.join(f.out,file),d=json(location);edit(d);fs.writeFileSync(location,fmt(d));}
test('exact denominators, nested score prefixes, and preserved baseline',t=>{const f=fixture(t),r=validateAudit(f.out),scores=scoreCoverage(r);assert.equal(r.counts.N,17);assert.deepEqual(scores.thresholds.map(s=>s.N),[11,11,15,15,17]);assert.equal(scores.thresholds[0].marginal.N,5);assert.equal(scores.thresholds[1].marginal.N,0);assert.equal(scores.reference_top20.N,6);assert.equal(scores.thresholds.at(-1).lower,1);});
test('missing judgment fails strict validation',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts[0].judgment='');assert.throws(()=>validateAudit(f.out),/Missing\/invalid judgment/);});
test('invalid judgment fails strict validation',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts[0].judgment='probably');assert.throws(()=>validateAudit(f.out),/Missing\/invalid judgment/);});
test('missing case fails strict validation',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts.pop());assert.throws(()=>validateAudit(f.out),/Missing cases/);});
test('duplicate case fails strict validation',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts.push(a.facts[0]));assert.throws(()=>validateAudit(f.out),/Duplicate case/);});
test('foreign case fails strict validation',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts[0].case_id='foreign');assert.throws(()=>validateAudit(f.out),/Foreign case/);});
test('foreign citations cannot support a fact',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts[0].evidence_lines=[2]);assert.throws(()=>validateAudit(f.out),/Foreign\/invalid citation/);});
test('ambiguity requires a specific reviewer question',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.facts[0].judgment='ambiguous');assert.throws(()=>validateAudit(f.out),/specific question/);});
test('source mutation is rejected',t=>{const f=fixture(t);fs.appendFileSync(f.source,'x');assert.throws(()=>validateAudit(f.out),/Original MAP source changed/);});
test('copied source mutation is rejected',t=>{const f=fixture(t);fs.appendFileSync(path.join(f.out,'raw_map.tsv'),'x');assert.throws(()=>validateAudit(f.out),/Copied MAP source hash changed/);});
test('exact prior judgment provenance is required',t=>{const f=fixture(t);change(f,'annotations/rel_1.json',a=>a.facts[0].provenance.assessment_sha256='wrong');assert.throws(()=>validateAudit(f.out));});
test('prior full-census labels cannot be changed',t=>{const f=fixture(t);change(f,'annotations/rel_1.json',a=>a.facts[0].judgment='incorrect');assert.throws(()=>validateAudit(f.out),/Prior top20 assessment changed/);});
test('undefined or silently changed predicate is rejected',t=>{const f=fixture(t);change(f,'annotations/rel_2.json',a=>a.definition='Any association');assert.throws(()=>validateAudit(f.out),/Noncanonical predicate/);});
test('declaration is required and frozen before all case grading',t=>{const f=fixture(t);fs.unlinkSync(path.join(f.out,'declarations','rel_2.json'));assert.throws(()=>declarePredicate(f.out,{relation:'rel_2',predicate_id:f.p.id,rationale:'Late',reviewer:'test'}),/before any fact judgments/);assert.throws(()=>validateAudit(f.out));});
test('prior source-case equality required during import',t=>{const f=fixture(t);const file=path.join(f.dir,'prior','cases.json'),d=json(file);d.relations[0].facts[0].evidence[0].arg1='wrong';fs.writeFileSync(file,fmt(d));assert.throws(()=>prepareCoverage(f.entry,{...f.options,outRoot:path.join(f.dir,'other')}),/full case evidence\/order changed/);});
test('preparation preserves annotations and human overrides; override affects every containing prefix',t=>{const f=fixture(t),c=f.cases.relations[1].facts[0];change(f,'human_review.json',h=>h.overrides.push({case_id:c.case_id,judgment:'incorrect',reason:'Explicit human fixture correction.',evidence_lines:c.source_lines,issue_tags:[],reviewer_question:'',reviewer:'human'}));const before=fs.readFileSync(path.join(f.out,'human_review.json'),'utf8');prepareCoverage(f.entry,f.options);assert.equal(fs.readFileSync(path.join(f.out,'human_review.json'),'utf8'),before);const r=validateAudit(f.out),scores=scoreCoverage(r);assert.equal(r.counts.E,1);assert(scores.thresholds.every(t=>t.E===1));});
test('human override cannot silently alter prior top20 scores',t=>{const f=fixture(t),c=f.cases.relations[0].facts[0];change(f,'human_review.json',h=>h.overrides.push({case_id:c.case_id,judgment:'incorrect',reason:'Fixture correction.',evidence_lines:c.source_lines,issue_tags:[],reviewer_question:'',reviewer:'human'}));assert.throws(()=>validateAudit(f.out),/Prior top20 assessment changed/);});
test('readable reports include every case and every requested threshold',t=>{const f=fixture(t),r=writeAuditReport(f.out);const md=fs.readFileSync(path.join(f.out,'assessment.md'),'utf8');for(const target of ['57.00%','60.00%','70.00%','80.00%','90.00%'])assert(md.includes(target));for(const c of r.facts)assert(fs.readFileSync(path.join(f.out,'reports',c.relation+'.md'),'utf8').includes('### '+c.case_id));assert.equal(json(path.join(f.out,'assessment.json')).threshold_scores.thresholds.length,5);});
test('each cutoff gets a complete independent selected-prefix view and evaluated navigation',t=>{
 const f=fixture(t),r=writeAuditReport(f.out);
 for(const threshold of r.threshold_scores.thresholds){const stem='coverage_'+Math.round(threshold.target*100),d=json(path.join(f.out,stem+'.json')),md=fs.readFileSync(path.join(f.out,stem+'.md'),'utf8');assert.equal(d.strata.length,threshold.k);assert.equal(d.facts.length,threshold.N);assert(d.facts.every(c=>c.relation_rank<=threshold.k));assert.equal(d.counts.S+d.counts.E+d.counts.A,d.counts.N);for(const s of d.strata)assert(md.includes('(reports/'+s.relation+'.md)'));for(const s of r.strata.filter(s=>s.rank>threshold.k))assert(!md.includes('(reports/'+s.relation+'.md)'));}
 const readme=fs.readFileSync(path.join(f.out,'README.md'),'utf8');assert(readme.includes('additional facts completely reviewed'));assert(readme.includes('[rel_1](reports/rel_1.md)'));assert(readme.includes('(coverage_57.md)'));prepareCoverage(f.entry,f.options);assert.equal(fs.readFileSync(path.join(f.out,'README.md'),'utf8'),readme);
});
test('unresolved predicates retain every ambiguous fact in the exact denominator',()=>{
 const s=scoreFacts([{relation:'rel_1',predicate_id:'known_as',judgment:'supported'},{relation:'rel_2',predicate_id:'unresolved_relation',judgment:'ambiguous'},{relation:'rel_2',predicate_id:'unresolved_relation',judgment:'ambiguous'},{relation:'rel_3',predicate_id:'known_as',judgment:'incorrect'}]);
 assert.deepEqual([s.N,s.S,s.E,s.A],[4,1,1,2]);assert.equal(s.lower,.25);assert.equal(s.upper,.75);assert.equal(s.unresolved_predicate_facts,2);assert.equal(s.unresolved_predicate_relations,1);
});
test('per-predicate hashes freeze definitions without freezing unrelated catalogue additions',()=>{
 const p=structuredClone([...loadCatalogue().values()][0]),original=predicateHash(p),catalogue=[p];catalogue.push({id:'fixture_extension',definition:'Independent new scope'});assert.equal(predicateHash(catalogue[0]),original);p.definition+=' Silently widened.';assert.notEqual(predicateHash(p),original);
});
test('identity diagnostics flag same latent ID with different role names even without side multiplicity',()=>{
 const c={case_id:'case',entity1:'Ent[ent_1]',entity2:'Ent[ent_1]',source_lines:[2],evidence:[{arg1:'Boston Red Sox',arg2:'New York Yankees'}]},f=identityFlag(c);
 assert(f);assert.equal(f.left_names.length,1);assert.equal(f.right_names.length,1);assert.equal(f.same_entity_id_both_roles_with_different_literal_names,true);assert(!Object.hasOwn(f,'judgment'));
});
test('identity diagnostics preserve aliases as inspection flags and accept ordinary distinct entities',()=>{
 const c={case_id:'case',entity1:'Ent[ent_1]',entity2:'Ent[ent_2]',source_lines:[2],evidence:[{arg1:'IBM',arg2:'New York'}]};assert.equal(identityFlag(c),null);c.evidence.push({arg1:'International Business Machines',arg2:'New York'});assert.equal(identityFlag(c).same_entity_id_both_roles_with_different_literal_names,false);assert.equal(identityFlag(c).left_names.length,2);
});
