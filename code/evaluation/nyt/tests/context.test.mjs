import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import {createCensusContext} from '../census.mjs';
import {createReporter} from '../reporter.mjs';
import {loadPredicateRegistry,predicateHash} from '../predicates.mjs';

function fixture(t,name='Alice') {
  const repoRoot=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-engine-context-'));
  t.after(()=>fs.rmSync(repoRoot,{recursive:true,force:true}));
  const studyRoot=path.join(repoRoot,'study');
  fs.mkdirSync(studyRoot);
  const census=createCensusContext({studyRoot,repoRoot,rejectRetiredEvaluations:true});
  const source=path.join(repoRoot,'input.tsv');
  fs.writeFileSync(source,'relation\tentity1\tentity2\targ1\targ2\tpath\n'+
    `rel_1\tEnt[ent_1]\tEnt[ent_2]\t${name}\tGroup\tdirect\n`);
  const entry=census.prepareCensus({source,audit_id:'audit_fixture'});
  const folder=path.join(studyRoot,entry.folder);
  const annotationFile=path.join(folder,'annotations/rel_1.json');
  const annotation=census.json(annotationFile);
  Object.assign(annotation,{predicate_id:'directs',label:'directs',
    definition:'Person directs group',scope_notes:'Explicit supplied relation'});
  Object.assign(annotation.facts[0],{judgment:'supported',reason:'Explicit fixture evidence',
    evidence_lines:[2],issue_tags:[],reviewer_question:'',provisional:false,
    review:{reviewer:'fixture grader',note:'Keep primary provenance verbatim'}});
  fs.writeFileSync(annotationFile,census.fmt(annotation));
  return {repoRoot,studyRoot,census,source,folder,annotationFile,
    reporter:createReporter({census,selection:'top-relations'})};
}

function snapshot(folder,prefix='') {
  return new Map(fs.readdirSync(folder,{withFileTypes:true}).flatMap(entry=>{
    const relative=path.join(prefix,entry.name),file=path.join(folder,entry.name);
    return entry.isDirectory()?[...snapshot(file,relative)]:[[relative,fs.readFileSync(file)]];
  }));
}

test('independent contexts retain their own roots and reject another campaign folder',t=>{
  const first=fixture(t,'Alice'),second=fixture(t,'Bob');
  assert.throws(()=>first.reporter.validateAudit(second.folder),/inside isolated census folder/);
  assert.throws(()=>second.census.within(first.folder),/inside isolated census folder/);
  const a=first.reporter.validateAudit(first.folder),b=second.reporter.validateAudit(second.folder);
  assert.equal(a.facts[0].evidence[0].arg1,'Alice');
  assert.equal(b.facts[0].evidence[0].arg1,'Bob');
  assert.notEqual(a.metadata.source_sha256,b.metadata.source_sha256);
});

test('scratch rendering preserves report bytes, source provenance and all campaign inputs',t=>{
  const f=fixture(t),original=f.reporter.writeAuditReport(f.folder),before=snapshot(f.folder);
  const outputDirectory=path.join(f.repoRoot,'scratch');
  const rendered=f.reporter.writeAuditReport(f.folder,{outputDirectory});
  assert.deepEqual(rendered,original);
  for(const [name,bytes] of snapshot(outputDirectory))assert(bytes.equals(before.get(name)),name);
  const after=snapshot(f.folder);
  assert.deepEqual([...after.keys()],[...before.keys()]);
  for(const [name,bytes] of before)assert(bytes.equals(after.get(name)),name);
  assert.equal(rendered.metadata.source_manifest.source,'input.tsv');
  assert.equal(rendered.facts[0].primary_judgment.review.note,'Keep primary provenance verbatim');
});

test('human overrides do not hide malformed primary judgments but may resolve provisional ones',t=>{
  const f=fixture(t),a=f.census.json(f.annotationFile);
  a.facts[0].provisional=true;
  a.facts[0].reason='';
  fs.writeFileSync(f.annotationFile,f.census.fmt(a));
  const humanFile=path.join(f.folder,'human_review.json'),human=f.census.json(humanFile);
  human.overrides.push({case_id:a.facts[0].case_id,judgment:'incorrect',reason:'Human correction',
    evidence_lines:[2],issue_tags:[],reviewer_question:'',reviewer:'Human reviewer'});
  fs.writeFileSync(humanFile,f.census.fmt(human));
  assert.throws(()=>f.reporter.validateAudit(f.folder),/Missing reason/);
  a.facts[0].reason='Provisional primary support';
  fs.writeFileSync(f.annotationFile,f.census.fmt(a));
  const result=f.reporter.validateAudit(f.folder);
  assert.deepEqual(result.counts,{N:1,S:0,E:1,A:0,human_overrides:1});
  assert.equal(result.facts[0].primary_judgment.provisional,true);
  assert.equal(result.facts[0].primary_judgment.judgment,'supported');
  assert.equal(result.facts[0].judgment_source,'human_override');
});

test('canonical registry distinguishes predicate changes, rubric changes and unrelated additions',t=>{
  const f=fixture(t),file=path.join(f.repoRoot,'catalogue.json');
  const predicate={id:'directs',version:1,label:'directs',definition:'Person directs group',scope_notes:'Direct paths'};
  const catalogue={common_rules:{supported:'Local evidence'},predicates:[predicate]};
  const save=()=>fs.writeFileSync(file,f.census.fmt(catalogue));
  save();
  const before=loadPredicateRegistry(file),hash=predicateHash(before.predicates.get('directs'));
  catalogue.predicates.push({...predicate,id:'another_predicate'});
  save();
  const added=loadPredicateRegistry(file);
  assert.equal(predicateHash(added.predicates.get('directs')),hash);
  assert.equal(added.common_rules_sha256,before.common_rules_sha256);
  assert.notEqual(added.catalogue_sha256,before.catalogue_sha256);
  catalogue.common_rules.supported='Changed common rubric';
  save();
  assert.notEqual(loadPredicateRegistry(file).common_rules_sha256,before.common_rules_sha256);
  predicate.version=2;
  assert.notEqual(predicateHash(predicate),hash);
  catalogue.predicates.push({...predicate});
  save();
  assert.throws(()=>loadPredicateRegistry(file),/Duplicate predicate ID/);
});

test('the selection protocol must be explicit and coverage must supply its frozen baseline context',t=>{
  const {census}=fixture(t);
  assert.throws(()=>createReporter({census,selection:'unknown'}),/Unknown census selection/);
  assert.throws(()=>createReporter({census,selection:'row-coverage'}),/coverage context/);
});
