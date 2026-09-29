import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import {createManualReview} from '../review/record.mjs';
import {createGradeAdapter} from '../review/grade_adapter.mjs';
import {createScopeRecorder} from '../review/scope_record.mjs';
const hash=s=>crypto.createHash('sha256').update(s).digest('hex');
const groups=[[[0],'supported','explicit support'],[[1],'ambiguous','identity unclear',[],'Which entity?']];
function fixture(t,{population='census',kind='declared_before_case_grading'}={}){
 const root=fs.mkdtempSync(path.join(os.tmpdir(),'manual-record-fixture-'));
 t.after(()=>fs.rmSync(root,{recursive:true,force:true}));
 const folder=path.join(root,population,'audit_fixture');
 for(const p of ['annotations','declarations'])fs.mkdirSync(path.join(folder,p),{recursive:true});
 const facts=[0,1].map(i=>({case_id:'rel_1__ent_'+i+'__ent_9',names:[{value:'a'+i+' → B'}],source_lines:[i+2]}));
 fs.writeFileSync(path.join(folder,'cases.json'),JSON.stringify({relations:[{relation:'rel_1',rank:21,paths:[{value:'path',count:2}],facts}]}));
 const declaration=JSON.stringify({kind});fs.writeFileSync(path.join(folder,'declarations/rel_1.json'),declaration);
 const file=path.join(folder,'annotations/rel_1.json');
 fs.writeFileSync(file,JSON.stringify({relation:'rel_1',predicate_declaration_sha256:hash(declaration),facts:facts.map(c=>({case_id:c.case_id,judgment:'supported',original:'keep'}))}));
 return {root,folder,file};
}
test('preparing a manual record preserves supplied judgments/citations and performs no write',t=>{
 const {root,file}=fixture(t);const before=fs.readFileSync(file,'utf8');
 const evaluator=createManualReview({root,reviewer:'root',now:()=>new Date('2026-01-01T00:00:00Z')});
 const plan=evaluator.prepareRecord('audit_fixture','rel_1',groups,{mixed:[0],broad:[1],identity:[1],reviewer:'ignored'});
 assert.equal(fs.readFileSync(file,'utf8'),before);
 assert(!fs.existsSync(path.join(root,'analysis')));
 assert.deepEqual(plan.annotation.facts.map(f=>f.judgment),['supported','ambiguous']);
 assert.deepEqual(plan.annotation.facts.map(f=>f.evidence_lines),[[2],[3]]);
 assert.deepEqual(plan.annotation.facts[0].issue_tags,['mixed_evidence']);
 assert.deepEqual(plan.annotation.facts[1].issue_tags,['broad_predicate']);
 assert.equal(plan.annotation.facts[0].original,'keep');
 assert.equal(plan.annotation.facts[0].review.reviewer,'root');
});
test('incomplete, repeated and ambiguous-without-question records are rejected before writing',t=>{
 const {root,file}=fixture(t),before=fs.readFileSync(file,'utf8'),{record}=createManualReview({root});
 assert.throws(()=>record('audit_fixture','rel_1',groups.slice(0,1)),/every case/);
 assert.throws(()=>record('audit_fixture','rel_1',[groups[0],groups[0]]),/Repeated/);
 assert.throws(()=>record('audit_fixture','rel_1',[[[0,1],'ambiguous','unclear']]));
 assert.equal(fs.readFileSync(file,'utf8'),before);
});
test('coverage recording retains history, supplied reviewer, identity tags and declaration hash',t=>{
 const {root,folder,file}=fixture(t),before=fs.readFileSync(file,'utf8');
 const evaluator=createManualReview({root,reviewer:'runner',allowReviewerOverride:true,identityTags:true,
 requireDeclaration:true,preserveHistory:true,historyStamp:()=>12345});
 evaluator.record('audit_fixture','rel_1',groups,{identity:[1],reviewer:'named-reviewer'});
 assert.equal(fs.readFileSync(path.join(folder,'annotation_history/rel_1/12345.json'),'utf8'),before);
 const actual=JSON.parse(fs.readFileSync(file));assert.equal(actual.facts[0].review.reviewer,'named-reviewer');
 assert.deepEqual(actual.facts[1].issue_tags,['identity_ambiguity']);
 const log=JSON.parse(fs.readFileSync(path.join(root,'analysis/manual_records/audit_fixture__rel_1.json')));
 assert.equal(log.predicate_declaration_sha256,actual.predicate_declaration_sha256);assert.deepEqual(log.identity,[1]);
});
test('coverage recording refuses carried-forward declarations and changed declaration bytes',t=>{
 const f=fixture(t,{kind:'carried_forward_from_prior_top20'}),e=createManualReview({root:f.root,requireDeclaration:true});
 assert.throws(()=>e.prepareRecord('audit_fixture','rel_1',groups),/Prior top20/);
 fs.writeFileSync(path.join(f.folder,'declarations/rel_1.json'),JSON.stringify({kind:'declared_before_case_grading'}));
 assert.throws(()=>e.prepareRecord('audit_fixture','rel_1',groups),/Declaration hash mismatch/);
});
test('supplemental recording uses its configured population and explicit reviewer',t=>{
 const {root}=fixture(t,{population:'supplemental'});
 const plan=createManualReview({root,population:'supplemental',reviewer:'nyt_kernel_audit'}).prepareRecord('audit_fixture','rel_1',groups);
 assert(plan.folder.includes(path.sep+'supplemental'+path.sep));assert.equal(plan.manualRecord.reviewer,'nyt_kernel_audit');
});
test('S/E/A adapter forwards explicit decisions and preserves caller override precedence',()=>{
 let actual;const R=createGradeAdapter((...args)=>{actual=args;},{audit:'chosen-audit',reviewer:'runner'});
 R('rel_1',[[[0],'S','text'],[[1],'A','text',[],'question']],{reviewer:'other'});
 assert.deepEqual(actual,['chosen-audit','rel_1',[[[0],'supported','text'],[[1],'ambiguous','text',[],'question']],{reviewer:'other'}]);
});
test('scope recorder validates dictionary indices and prevents duplicate declarations',t=>{
 const {root}=fixture(t);fs.mkdirSync(path.join(root,'analysis'));
 const {add}=createScopeRecorder(root,{audit:'audit_fixture',reviewer:'runner',fileName:'scopes.json'});
 assert.throws(()=>add([['rel_1','p',[2],'rationale']]));
 add([['rel_1','p',[0],'rationale']]);
 const before=fs.readFileSync(path.join(root,'analysis/scopes.json'),'utf8');
 assert.throws(()=>add([['rel_1','p',[0],'repeat']]),/Repeated scope/);
 assert.equal(fs.readFileSync(path.join(root,'analysis/scopes.json'),'utf8'),before);
});
