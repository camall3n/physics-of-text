import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import {
  semanticSignature,predicateHash,effectiveJudgment,
  compareValidatedPopulations,loadValidatedPopulation
} from '../nyt/consistency.mjs';

const predicate={id:'beats',version:1,label:'beat',definition:'X defeated Y in an asserted event.',scope_notes:'Directed and actual; any historical event suffices.'};
const evidence={entity1:'ent_(1)',entity2:'ent_(2)',evidence:[{line:2,arg1:'A',arg2:'B',dependency_path:'beat'}]};
const judgment=label=>({judgment:label,reason:'Fixture local evidence assessment.',evidence_lines:[2],issue_tags:[],reviewer_question:label==='ambiguous'?'Which event?':'',provisional:false});
function record({source='current-world',caseId='rel_1__1__2',p=predicate,primary='supported',override=null}={}){
  const original=primary?judgment(primary):null;
  const chosen=effectiveJudgment(original,override?judgment(override):null);
  return {population:'fixture',source_sha256:source,audit:'audit_fixture',relation:'rel_1',case_id:caseId,
    predicate_id:p.id,predicate_version:p.version??1,predicate_hash:predicateHash(p),
    signature:semanticSignature(p,evidence),primary:original,effective:chosen,
    judgment_source:override?'human_override':'primary',report:'fixture.md'};
}
function population(id,records,{p=predicate,rubric='same-rubric'}={}){
  return {id,root:'/fixture/'+id,validated:true,inputs:[],records,
    registry:{predicates:new Map([[p.id,p]]),catalogue_sha256:'catalogue',common_rules_sha256:rubric}};
}

test('primary and effective diagnostics expose overrides without changing primary or score inputs',()=>{
  const c=population('current',[record({primary:'supported',override:'incorrect'})]);
  const r=population('reference',[record({source:'reference-world',primary:'incorrect'})]);
  const before=JSON.stringify(c.records);
  const result=compareValidatedPopulations({current:c,references:[r]});
  assert.equal(result.modes.primary.with_prior_references.disagreement_count,1);
  assert.equal(result.modes.effective.with_prior_references.disagreement_count,0);
  assert.equal(result.modes.effective.reviewed,1);
  assert.equal(result.modes.effective.prior_references,1);
  assert.equal(JSON.stringify(c.records),before);
});

test('reference identity includes source hash; an equal run-local case ID is insufficient',()=>{
  const c=population('current',[record()]);
  const r=population('reference',[
    record({primary:'incorrect'}), // Exact current source/case is excluded.
    record({source:'different-world',primary:'incorrect'})
  ]);
  const result=compareValidatedPopulations({current:c,references:[r]});
  assert.equal(result.duplicate_reference_cases_skipped,1);
  assert.equal(result.modes.effective.prior_references,1);
  assert.equal(result.modes.effective.with_prior_references.disagreement_count,1);
});

test('reference predicate versions and full content must match, not only ID/definition/scope',()=>{
  for(const p of [{...predicate,version:2},{...predicate,excludes:['negated wins']}]){
    const c=population('current',[record()]);
    const r=population('reference',[record({source:'prior',p,primary:'incorrect'})],{p});
    const result=compareValidatedPopulations({current:c,references:[r]});
    assert.equal(result.prior_nonidentical_scopes_skipped,1);
    assert.equal(result.modes.effective.prior_references,0);
  }
});

test('a changed common rubric prevents cross-population consistency claims',()=>{
  const c=population('current',[record()]);
  const r=population('reference',[record({source:'prior',primary:'incorrect'})],{rubric:'different'});
  const result=compareValidatedPopulations({current:c,references:[r]});
  assert.equal(result.prior_nonidentical_scopes_skipped,1);
  assert.equal(result.modes.primary.prior_references,0);
});

test('current-only output explicitly distinguishes not-run reference checks from zero conflicts',()=>{
  const c=population('current',[record()]);
  const result=compareValidatedPopulations({current:c,includePrior:false});
  assert.equal(result.include_prior,false);
  assert.deepEqual(result.reference_populations,[]);
  assert.equal(result.modes.primary.with_prior_references,null);
  assert.equal(result.modes.effective.with_prior_references,null);
  assert.equal(result.modes.effective.current.disagreement_count,0);
});

test('blank primary with a valid override stays absent from primary diagnostic',()=>{
  const c=population('current',[record({primary:null,override:'supported'})]);
  const result=compareValidatedPopulations({current:c});
  assert.equal(result.modes.primary.reviewed,0);
  assert.equal(result.modes.primary.unreviewed,1);
  assert.equal(result.modes.effective.reviewed,1);
});

test('unvalidated current or reference populations cannot enter diagnostic',()=>{
  const p=population('current',[record()]);
  assert.throws(()=>compareValidatedPopulations({current:{...p,validated:false}}),/must be validated/);
  assert.throws(()=>compareValidatedPopulations({current:p,references:[{...p,validated:false}]}),/must be validated/);
});

test('population loader invokes live validation and ignores stale saved assessment labels',t=>{
  const root=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-consistency-live-'));
  t.after(()=>fs.rmSync(root,{recursive:true,force:true}));
  const dir=path.join(root,'census/audit_fixture');
  fs.mkdirSync(path.join(dir,'annotations'),{recursive:true});
  fs.mkdirSync(path.join(root,'analysis'));
  fs.writeFileSync(path.join(root,'analysis/predicate_catalogue.json'),JSON.stringify({common_rules:{unit:'fact'},predicates:[predicate]}));
  for(const file of ['cases.json','source.json','human_review.json'])fs.writeFileSync(path.join(dir,file),'{}');
  fs.writeFileSync(path.join(dir,'assessment.json'),JSON.stringify({facts:[{judgment:'incorrect'}]}));
  let calls=0;
  const options={id:'current',root,audits:[{audit_id:'audit_fixture',folder:'census/audit_fixture'}],
    validateAudit(folder){
      calls++;assert.equal(folder,dir);
      return {metadata:{audit_id:'audit_fixture',source_sha256:'live-source'},counts:{N:1},
        strata:[{relation:'rel_1',...predicate}],
        facts:[{...evidence,relation:'rel_1',case_id:'case1',predicate_id:predicate.id,
          primary_judgment:judgment('supported'),override:null,judgment:'supported',judgment_source:'primary'}]};
    }};
  const p=loadValidatedPopulation(options);
  assert.equal(calls,1);
  assert.equal(p.records[0].effective.judgment,'supported');
  assert.throws(()=>loadValidatedPopulation({...options,validateAudit(){throw Error('Invalid source/grade');}}),/Invalid source\/grade/);
});
