/**
 * Semantic consistency is a diagnostic, never a grader or score denominator.
 * Inputs must come from loadValidatedPopulation: evidence and judgments are
 * validated by the same census validator used for scientific scoring.
 */
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {sha,fmt} from './common.mjs';
import {loadPredicateRegistry,predicateHash} from './predicates.mjs';
export {loadPredicateRegistry,predicateHash} from './predicates.mjs';

const valid=new Set(['supported','incorrect','ambiguous']);
const read=file=>JSON.parse(fs.readFileSync(file,'utf8'));

export function semanticSignature(predicate,c) {
  const evidence=[...new Set(c.evidence.map(e=>JSON.stringify([e.arg1,e.arg2,e.dependency_path])))].sort();
  return JSON.stringify([predicateHash(predicate),c.entity1===c.entity2,evidence]);
}
export function effectiveJudgment(primary,override) {
  if(override?.judgment){assert(valid.has(override.judgment),'Invalid human override');return override;}
  return primary?.judgment&&!primary.provisional?primary:null;
}
export function findDisagreements(records) {
  const groups=new Map();
  for(const r of records){
    assert(valid.has(r.judgment),'Invalid diagnostic judgment');
    if(!groups.has(r.signature))groups.set(r.signature,[]);
    groups.get(r.signature).push(r);
  }
  const disagreements=[];let repeated=0;
  for(const [signature,cases] of groups){
    if(cases.length>1)repeated++;
    if(!cases.some(c=>c.origin==='current')||new Set(cases.map(c=>c.judgment)).size<2)continue;
    const [predicate_hash,self_entity,evidence]=JSON.parse(signature);
    disagreements.push({
      signature_sha256:sha(signature),predicate_id:cases[0].predicate_id,
      predicate_hash,self_entity,evidence:evidence.map(JSON.parse),
      cases:cases.map(({signature,...c})=>c)
    });
  }
  return {distinct_signatures:groups.size,repeated_signatures:repeated,
    disagreement_count:disagreements.length,disagreements};
}

/** Validate source, selection, predicates, every judgment and every override first. */
export function loadValidatedPopulation({id,root,audits,validateAudit,catalogueFile=path.join(root,'analysis/predicate_catalogue.json')}) {
  assert(typeof validateAudit==='function','A census validator is required');
  const registry=loadPredicateRegistry(catalogueFile),records=[],inputs=[];
  for(const a of audits){
    const folder=path.resolve(root,a.folder),result=validateAudit(folder);
    assert.equal(result.metadata.audit_id,a.audit_id,'Manifest audit identity differs');
    assert.equal(result.counts.N,result.facts.length,'Incomplete validated population');
    // Hash the judgment inputs, not a possibly stale generated assessment.
    const names=['cases.json','source.json','human_review.json',
      ...fs.readdirSync(path.join(folder,'annotations')).filter(f=>f.endsWith('.json')).sort().map(f=>'annotations/'+f)];
    inputs.push({audit:a.audit_id,source_sha256:result.metadata.source_sha256,
      validated_facts:result.counts.N,
      files:names.map(f=>({path:path.relative(root,path.join(folder,f)),sha256:sha(fs.readFileSync(path.join(folder,f)))}))});
    const strata=new Map(result.strata.map(s=>[s.relation,s]));
    for(const c of result.facts){
      const p=registry.predicates.get(c.predicate_id),s=strata.get(c.relation);
      assert(p,'Undefined validated predicate: '+c.predicate_id);
      for(const k of ['label','definition','scope_notes'])assert.equal(s[k],p[k],'Noncanonical validated predicate '+k);
      const primary=effectiveJudgment(c.primary_judgment,null);
      const effective=effectiveJudgment(c.primary_judgment,c.override);
      assert(effective&&effective.judgment===c.judgment,'Effective judgment differs from scored judgment');
      records.push({population:id,source_sha256:result.metadata.source_sha256,
        audit:a.audit_id,relation:c.relation,case_id:c.case_id,predicate_id:p.id,
        predicate_version:p.version??1,predicate_hash:predicateHash(p),
        signature:semanticSignature(p,c),
        report:path.join(root,a.folder,'reports',c.relation+'.md')+'#'+c.case_id,
        primary,effective,judgment_source:c.judgment_source});
    }
  }
  return {id,root,registry,records,inputs,validated:true};
}

function diagnosticRecord(r,mode,origin) {
  const judgment=r[mode];
  if(!judgment)return null;
  assert(valid.has(judgment.judgment),'Invalid validated label');
  return {origin,signature:r.signature,population:r.population,
    source_sha256:r.source_sha256,predicate_id:r.predicate_id,predicate_version:r.predicate_version,
    audit:r.audit,relation:r.relation,case_id:r.case_id,
    judgment:judgment.judgment,reason:judgment.reason,evidence_lines:judgment.evidence_lines,
    judgment_source:mode==='primary'?'primary':r.judgment_source,report:r.report};
}

/** Current/reference facts are separate; references cannot affect any scores. */
export function compareValidatedPopulations({current,references=[],includePrior=true}) {
  assert.equal(current.validated,true,'Current population must be validated');
  for(const p of references)assert.equal(p.validated,true,'Reference population must be validated');
  const currentKeys=new Set(current.records.map(r=>r.source_sha256+':'+r.case_id));
  const seen=new Set(currentKeys),referenceRecords=[];
  let duplicateReferences=0,nonidenticalScopes=0;
  if(includePrior)for(const p of references)for(const r of p.records){
    const key=r.source_sha256+':'+r.case_id;
    if(seen.has(key)){duplicateReferences++;continue;}
    const predicate=current.registry.predicates.get(r.predicate_id);
    if(p.registry.common_rules_sha256!==current.registry.common_rules_sha256||
      !predicate||predicateHash(predicate)!==r.predicate_hash){nonidenticalScopes++;continue;}
    seen.add(key);referenceRecords.push(r);
  }
  const modes={};
  for(const mode of ['primary','effective']){
    const main=current.records.map(r=>diagnosticRecord(r,mode,'current')).filter(Boolean);
    const refs=referenceRecords.map(r=>diagnosticRecord(r,mode,'prior_reference')).filter(Boolean);
    modes[mode]={reviewed:main.length,unreviewed:current.records.length-main.length,
      prior_references:refs.length,current:findDisagreements(main),
      with_prior_references:includePrior?findDisagreements([...main,...refs]):null};
  }
  return {
    schema_version:2,diagnostic_only:true,
    method:'Validated complete evidence sets, full frozen predicate records (including declared version), and equality of ordered entity IDs. Duplicate rows and run-local numeric IDs are ignored. Flag only; never assign or propagate judgments.',
    include_prior:includePrior,
    current_population:current.id,reference_populations:includePrior?references.map(p=>p.id):[],
    reference_policy:'Exclude the same source SHA256 + case ID; require identical full predicate record and common rubric. References never enter current score denominators.',
    duplicate_reference_cases_skipped:duplicateReferences,prior_nonidentical_scopes_skipped:nonidenticalScopes,
    populations:[current,...(includePrior?references:[])].map(p=>({
      id:p.id,root:p.root,catalogue_sha256:p.registry.catalogue_sha256,
      common_rules_sha256:p.registry.common_rules_sha256,facts:p.records.length,
      predicate_versions:[...new Map(p.records.map(r=>[r.predicate_id,{
        id:r.predicate_id,version:r.predicate_version,sha256:r.predicate_hash
      }])).values()].sort((a,b)=>a.id.localeCompare(b.id)),inputs:p.inputs
    })),
    modes
  };
}

export function renderConsistency(report) {
  const md=['# Validated semantic consistency','','Diagnostic only; no annotations or scores changed.',
    '',`Current population: ${report.current_population}. References enabled: ${report.include_prior}.`,
    '', '| Judgment layer | Current reviewed | Current disagreements | Reference facts | Combined disagreements |',
    '|---|---:|---:|---:|---:|'];
  for(const [name,m] of Object.entries(report.modes))md.push(
    `| ${name} | ${m.reviewed} | ${m.current.disagreement_count} | ${m.prior_references} | ${m.with_prior_references?.disagreement_count??'not run'} |`);
  md.push('','Primary = confirmed original annotation. Effective = valid human override when present, otherwise primary.',
    '',report.reference_policy,'','The structured report includes predicate versions, input hashes and exact cases. Zero conflicts establishes repeatability of labels on matching evidence; it does not establish semantic correctness.','');
  for(const [mode,m] of Object.entries(report.modes)){
    for(const g of (m.with_prior_references??m.current).disagreements){
      md.push(`## ${mode}: ${g.predicate_id}`,'',`Signature: ${g.signature_sha256}`,'');
      for(const c of g.cases)md.push(`- **${c.judgment}** [${c.population}/${c.audit}/${c.case_id}](${c.report}) (${c.origin}): ${c.reason}`);
      md.push('');
    }
  }
  return md.join('\n');
}
