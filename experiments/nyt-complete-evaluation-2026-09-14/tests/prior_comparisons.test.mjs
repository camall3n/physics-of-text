import test from 'node:test';
import assert from 'node:assert/strict';
import {comparePriorCases} from '../scripts/prior_comparisons.mjs';

function fixture(){
 const labels=['supported','incorrect','supported','supported','incorrect','ambiguous','supported','incorrect'];
 const facts=labels.map((judgment,i)=>({case_id:'c'+i,relation:i<6?'rel_1':'rel_2',names:[{value:'X'+i+' → Y'}],source_lines:[i+1],evidence:[{line:i+1,arg1:'X'+i,arg2:'Y',dependency_path:'path'}],judgment,reason:'Current individual review '+i,issue_tags:[],reviewer_question:judgment==='ambiguous'?'Which entity?':'',judgment_source:'primary'}));
 const strata=[6,2].map((N,i)=>({relation:'rel_'+(i+1),predicate_id:'p',label:'Current',definition:'Current coherent definition',scope_notes:'Current declared scope',N}));
 const selected=[facts[0],facts[1],facts[6],facts[7]];
 const priorAnnotations=strata.map((s,i)=>({relation:s.relation,label:'Prior',definition:'Prior coherent definition',scope_notes:'Prior scope',facts:selected.filter(f=>f.relation===s.relation).map(f=>({case_id:f.case_id,judgment:i?'incorrect':'supported',reason:'Prior individual review'}))}));
 return {result:{metadata:{audit_id:'audit_test',source_sha256:'same'},counts:{N:8,S:4,E:3,A:1,human_overrides:0},precision:{lower:.5,upper:.625},strata,facts},priorCases:{metadata:{source_sha256:'same'},relations:[{facts:selected}]},priorAnnotations};
}
test('prior comparison retains stratified population weights, not raw 100-case proportions',()=>{
 const c=comparePriorCases(fixture());assert.equal(c.old_estimator.lower,.75);assert.equal(c.harmonized_estimator_on_identical_prior_cases.lower,.5);assert.equal(c.old_counts_on_prior_cases.S/c.previously_reviewed,.5);assert.equal(c.prior_kind,'stratified_sample');
 assert.equal(c.label_changes,2);assert.deepEqual(c.new_case_census,{N:4,S:2,E:1,A:1,lower:.5,upper:.75});assert.equal(c.decomposition.same_case_revision_lower,-.25);assert.equal(c.decomposition.coverage_expansion_lower,0);
});
test('same-case revision and population expansion telescope for both ambiguity endpoints',()=>{
 const c=comparePriorCases(fixture());for(const endpoint of ['lower','upper'])assert.equal(c.decomposition['same_case_revision_'+endpoint]+c.decomposition['coverage_expansion_'+endpoint],c.decomposition['total_change_'+endpoint]);
 assert.equal(c.decomposition.coverage_expansion_upper,.125);assert.equal(c.transitions.supported.incorrect,1);assert.equal(c.transitions.incorrect.supported,1);
});
test('old complete census includes all selected cases and has no expansion effect',()=>{
 const f=fixture();f.priorCases={metadata:{source_sha256:'same'},cases:f.result.facts};f.priorAnnotations=f.result.strata.map(s=>({...s,facts:f.result.facts.filter(c=>c.relation===s.relation)}));const c=comparePriorCases(f);assert.equal(c.prior_kind,'complete_top20_census');assert.equal(c.newly_reviewed,0);assert.equal(c.label_changes,0);assert.equal(c.old_estimator.lower,.5);assert.equal(c.old_estimator.upper,.625);assert.equal(c.new_case_census.lower,null);
});
test('nonblank previous human override is compared while original annotation remains visible',()=>{
 const f=fixture();f.priorHuman={reviews:[{case_id:'c0',judgment:'incorrect',notes:'Human correction'}]};const c=comparePriorCases(f);assert.equal(c.old_estimator.lower,.375);assert.equal(c.cases[0].prior.judgment,'incorrect');assert.equal(c.cases[0].prior.annotation_judgment,'supported');assert.equal(c.cases[0].prior.reason,'Human correction');assert.equal(c.cases[0].prior.judgment_source,'prior_human_override');
});
test('prior comparison rejects source and full evidence mismatches, duplicate labels and undefined prior scope',()=>{
 let f=fixture();f.priorCases.metadata.source_sha256='different';assert.throws(()=>comparePriorCases(f),/source differs/);
 f=fixture();f.priorCases=structuredClone(f.priorCases);f.priorCases.relations[0].facts[0].evidence[0].arg2='Other';assert.throws(()=>comparePriorCases(f),/evidence differs/);
 f=fixture();f.priorAnnotations[0].facts.push(f.priorAnnotations[0].facts[0]);assert.throws(()=>comparePriorCases(f),/Duplicate prior annotation/);
 f=fixture();f.priorAnnotations.pop();assert.throws(()=>comparePriorCases(f),/No prior declaration/);
});
test('declaration wording change is recorded without automatically causing a label change',()=>{
 const c=comparePriorCases(fixture());assert(c.strata.every(s=>s.declaration_text_changed));assert.equal(c.label_changes,2);assert.equal(c.cases.length,4);assert(!('scope_caused_changes' in c));
});
test('prior comparison never silently drops an old selected case or accepts a foreign one',()=>{
 let f=fixture();f.priorAnnotations[0].facts.pop();assert.throws(()=>comparePriorCases(f),/Missing prior case judgment/);
 f=fixture();f.priorAnnotations[0].facts[0].case_id='foreign';assert.throws(()=>comparePriorCases(f),/outside the current relation census/);
});
