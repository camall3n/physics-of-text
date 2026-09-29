import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,sha} from './common.mjs';
import {validateJudgment,nonempty} from './judgments.mjs';
import {scoreFacts} from './scoring.mjs';
import {loadTopRelationsProtocol,loadRowCoverageProtocol} from './protocols.mjs';

function readOverrides(absolute,source,relations) {
  const allCases=new Map(relations.flatMap(r=>r.facts.map(c=>[c.case_id,c])));
  const human=json(path.join(absolute,'human_review.json'));
  assert.equal(human.source_sha256,source.source_sha256,'Human override source hash mismatch');
  assert(Array.isArray(human.overrides),'Overrides must be an array');
  const overrides=new Map(),seen=new Set();
  for(const override of human.overrides) {
    assert(allCases.has(override.case_id),`Foreign human case: ${override.case_id}`);
    assert(!seen.has(override.case_id),`Duplicate human case: ${override.case_id}`);
    seen.add(override.case_id);
    if(override.judgment) {
      validateJudgment(override,allCases.get(override.case_id),{human:true});
      overrides.set(override.case_id,override);
    } else {
      assert(override.judgment===''||override.judgment==null,'Invalid blank override');
    }
  }
  return overrides;
}

function matchAnnotations(annotation,relation) {
  assert(Array.isArray(annotation.facts));
  const expectedIds=new Set(relation.facts.map(c=>c.case_id)),byId=new Map();
  for(const fact of annotation.facts) {
    assert(expectedIds.has(fact.case_id),`Foreign case in ${relation.relation}: ${fact.case_id}`);
    assert(!byId.has(fact.case_id),`Duplicate case: ${fact.case_id}`);
    byId.set(fact.case_id,fact);
  }
  assert.equal(byId.size,relation.facts.length,`Missing cases in ${relation.relation}`);
  return byId;
}

function evaluateFact(c,primary,override,annotation,relation,protocol) {
  // A human override does not conceal a malformed nonblank primary annotation.
  if(primary.judgment)validateJudgment(primary,c);
  if(!override)assert(primary.provisional!==true,`Unconfirmed provisional judgment: ${c.case_id}`);
  const chosen=override??primary;
  validateJudgment(chosen,c,{human:!!override});
  protocol.validateFact(c,primary,chosen,annotation,relation);
  return {
    ...c,predicate_id:annotation.predicate_id,label:annotation.label,
    judgment:chosen.judgment,reason:chosen.reason,evidence_lines:chosen.evidence_lines,
    issue_tags:chosen.issue_tags,reviewer_question:chosen.reviewer_question,
    judgment_source:override?'human_override':'primary',
    reviewer:chosen.reviewer??chosen.review?.reviewer??annotation.reviewer??'',
    primary_judgment:primary,override:override??null
  };
}

/** One fact validator and scorer, with explicitly selected methodology checks. */
export function createAuditValidator({census,selection,coverage}) {
  assert(['top-relations','row-coverage'].includes(selection),'Unknown census selection protocol');
  assert(selection!=='row-coverage'||coverage,'Row coverage requires a coverage context');
  const {REPO,within,censusFromRaw}=census;
  const loadProtocol=selection==='row-coverage'
    ? options=>loadRowCoverageProtocol(census,coverage,options)
    : options=>loadTopRelationsProtocol(census,options);

  return function validateAudit(folder,{requirePredicateId=true,catalogueIds=null}={}) {
    const absolute=within(path.resolve(folder));
    const raw=fs.readFileSync(path.join(absolute,'raw_map.tsv'),'utf8');
    const d=json(path.join(absolute,'cases.json')),source=json(path.join(absolute,'source.json'));
    assert.equal(sha(raw),d.metadata.source_sha256,'Copied MAP source hash changed');
    assert.equal(source.source_sha256,d.metadata.source_sha256,'Source manifest hash mismatch');
    assert.equal(sha(fs.readFileSync(path.join(absolute,'cases.json'))),source.cases_sha256,'Cases file hash changed');
    assert.equal(sha(fs.readFileSync(path.resolve(REPO,source.source))),source.source_sha256,'Original MAP source changed');

    const expected=censusFromRaw(raw,{topRelations:d.metadata.top_relations_requested});
    for(const [key,value] of Object.entries(expected.metadata)) {
      assert.deepEqual(d.metadata[key],value,`Census metadata mismatch: ${key}`);
    }
    assert.deepEqual(d.relations,expected.relations,'Census incomplete, reordered or evidence changed');
    assert.equal(d.metadata.audit_id,source.audit_id,'Audit ID mismatch');
    for(const [file,hash] of Object.entries(source.prior_annotation_hashes??{})) {
      assert.equal(sha(fs.readFileSync(path.join(absolute,'prior_annotations',file))),hash,'Prior annotation snapshot changed');
    }
    if(source.prior_cases_sha256) {
      assert.equal(sha(fs.readFileSync(path.join(absolute,'prior_cases.json'))),source.prior_cases_sha256,'Prior cases snapshot changed');
    }

    const protocol=loadProtocol({absolute,raw,d,source,requirePredicateId});
    const overrides=readOverrides(absolute,source,d.relations);
    const names=fs.readdirSync(path.join(absolute,'annotations')).filter(f=>f.endsWith('.json')).sort();
    assert.deepEqual(names,d.relations.map(r=>r.relation+'.json').sort(),'Missing or foreign relation annotation file');
    const strata=[],facts=[];
    let totalOverrides=0;
    for(const r of d.relations) {
      const a=json(path.join(absolute,'annotations',r.relation+'.json'));
      assert.equal(a.relation,r.relation,'Wrong relation annotation');
      assert(nonempty(a.label)&&nonempty(a.definition)&&nonempty(a.scope_notes),`Undefined predicate for ${r.relation}`);
      protocol.validateRelation(r,a);
      if(requirePredicateId)assert(nonempty(a.predicate_id),`Missing predicate_id for ${r.relation}`);
      if(catalogueIds)assert(catalogueIds.has(a.predicate_id),`Undefined catalogue predicate ${a.predicate_id}`);

      const byId=matchAnnotations(a,r);
      const evaluated=r.facts.map(c=>evaluateFact(c,byId.get(c.case_id),overrides.get(c.case_id),a,r,protocol));
      for(const fact of evaluated)facts.push(fact);
      const {N,S,E,A}=scoreFacts(evaluated);
      const H=evaluated.filter(c=>c.judgment_source==='human_override').length;
      assert.equal(S+E+A,N);
      strata.push({
        relation:r.relation,predicate_id:a.predicate_id,label:a.label,
        definition:a.definition,scope_notes:a.scope_notes,rank:r.rank,rows:r.sentence_count,
        N,S,E,A,human_overrides:H,lower:S/N,upper:(S+A)/N,
        decided_precision:S+E?S/(S+E):null,decided_coverage:(S+E)/N
      });
      totalOverrides+=H;
    }

    const N=d.metadata.population_facts;
    const {S:totalS,E:totalE,A:totalA}=scoreFacts(facts);
    assert.equal(facts.length,N);
    assert.equal(totalS+totalE+totalA,N);
    // Property order is part of the preserved JSON report format.
    return {
      ...protocol.resultPrefix(facts),
      metadata:{
        ...d.metadata,method:'../../METHOD.md',source_manifest:source,census_complete:true,
        evaluation_unit:'Every expressed ordered latent fact in the selected top relations',
        limitations:'Exact descriptive census fractions conditional on predicate definitions and judgments; ambiguity endpoints are not confidence intervals. No sampling standard errors or sampling confidence intervals apply. Gold fact recall is unknown.'
      },
      counts:{N,S:totalS,E:totalE,A:totalA,human_overrides:totalOverrides},
      precision:{lower:totalS/N,upper:(totalS+totalA)/N,
        decided_precision:totalS+totalE?totalS/(totalS+totalE):null,
        decided_coverage:(totalS+totalE)/N},
      macro:{lower:strata.reduce((v,s)=>v+s.lower,0)/strata.length,
        upper:strata.reduce((v,s)=>v+s.upper,0)/strata.length},
      strata,facts
    };
  };
}
