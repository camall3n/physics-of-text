import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,sha} from './common.mjs';
import {parseMap} from './parse_map.mjs';
import {nonempty} from './judgments.mjs';
import {coveragePrefixes,dictionaryHash} from './coverage.mjs';
import {loadPredicateRegistry,predicateHash} from './predicates.mjs';

// Protocol adapters validate frozen methodology. They do not score or infer judgments.
export function loadTopRelationsProtocol(census,{absolute,source}) {
  const {ROOT}=census;
  if(fs.existsSync(path.join(absolute,'prior_human_review.json'))) {
    assert.equal(sha(fs.readFileSync(path.join(absolute,'prior_human_review.json'))),
      fs.readFileSync(path.join(absolute,'prior_human_review.sha256'),'utf8').trim(),
      'Prior human review snapshot changed');
  }
  let catalogue=null,assignment=null;
  const catalogueFile=path.join(ROOT,'analysis/predicate_catalogue.json');
  // Complete-census fixtures/supplements may live outside the registered main census.
  // This historical path condition is independent of requirePredicateId.
  if(absolute.startsWith(path.join(ROOT,'census')+path.sep)&&fs.existsSync(catalogueFile)) {
    const registry=loadPredicateRegistry(catalogueFile);
    catalogue=registry.predicates;
    const mapping=json(path.join(ROOT,'analysis/relation_assignments.json'));
    assert.equal(mapping.catalogue_sha256,registry.catalogue_sha256,'Catalogue assignment hash mismatch');
    assignment=new Map(mapping.assignments.filter(a=>a.audit_id===source.audit_id)
      .map(a=>[a.relation,a.predicate_id]));
  }
  return {
    validateRelation(r,a) {
      if(!catalogue)return;
      assert(catalogue.has(a.predicate_id),`Undefined catalogue predicate: ${a.predicate_id}`);
      assert.equal(a.predicate_id,assignment.get(r.relation),'Relation predicate differs from frozen assignment');
      const predicate=catalogue.get(a.predicate_id);
      for(const key of ['label','definition','scope_notes']) {
        assert.equal(a[key],predicate[key],`Noncanonical predicate ${key}: ${r.relation}`);
      }
    },
    validateFact() {},
    resultPrefix() { return {}; }
  };
}

export function loadRowCoverageProtocol(census,coverageContext,{absolute,raw,d,source,requirePredicateId}) {
  const {censusFromRaw}=census;
  const {loadCatalogue}=coverageContext;
  // Only declaration checks depend on this switch. Prior and unresolved-label checks do not.
  const catalogue=requirePredicateId?loadCatalogue():null;
  const coverage=json(path.join(absolute,'coverage.json'));
  const ranked=json(path.join(absolute,'ranked_cases.json'));
  assert.equal(sha(fs.readFileSync(path.join(absolute,'coverage.json'))),source.coverage_sha256,'Coverage selection changed');
  assert.equal(sha(fs.readFileSync(path.join(absolute,'ranked_cases.json'))),source.ranked_cases_sha256,'Full ranked evidence changed');
  assert.deepEqual(coverage.targets,coveragePrefixes(parseMap(raw),coverage.targets.map(t=>t.target)),
    'Coverage is not the minimal ranked prefix');
  assert.equal(d.metadata.top_relations,coverage.maximum_prefix_k);
  assert.equal(d.metadata.population_facts,coverage.maximum_prefix_N);
  const expectedRanked=censusFromRaw(raw,{topRelations:parseMap(raw).relation_count});
  assert.deepEqual(ranked.relations,expectedRanked.relations,'Full ranked evidence incomplete');
  for(const [file,hash] of Object.entries(source.snapshot_hashes)) {
    assert.equal(sha(fs.readFileSync(path.join(absolute,file))),hash,'Prior snapshot changed: '+file);
  }
  const prior=json(path.join(absolute,'prior_assessment.json'));
  const priorFacts=new Map(prior.facts.map(f=>[f.case_id,f]));
  return {
    validateRelation(r,a) {
      if(!catalogue)return;
      assert(catalogue.has(a.predicate_id),'Undefined catalogue predicate: '+a.predicate_id);
      const predicate=catalogue.get(a.predicate_id);
      const declarationFile=path.join(absolute,'declarations',r.relation+'.json');
      const declarationRaw=fs.readFileSync(declarationFile,'utf8'),decl=JSON.parse(declarationRaw);
      assert.equal(decl.relation,r.relation);
      assert.equal(decl.predicate_id,a.predicate_id,'Relation predicate differs from frozen declaration');
      assert.equal(decl.source_map_sha256,source.source_sha256);
      assert.equal(decl.dictionary_sha256,dictionaryHash(r),'Declared dictionary changed');
      assert.equal(decl.predicate_hash,predicateHash(predicate),'Approved frozen predicate content changed');
      assert.deepEqual(decl.predicate,predicate,'Declared predicate snapshot changed');
      assert.equal(a.predicate_hash,decl.predicate_hash);
      for(const key of ['label','definition','scope_notes']) {
        assert.equal(a[key],predicate[key],'Noncanonical predicate '+key+': '+r.relation);
      }
      if(decl.kind==='declared_before_case_grading') {
        assert(nonempty(decl.rationale)&&nonempty(decl.reviewer)&&nonempty(decl.declared_at),
          'Incomplete declaration provenance');
        assert.equal(a.predicate_declaration_sha256,sha(declarationRaw),'Annotation declaration hash mismatch');
        assert.equal(path.basename(decl.pregrading_annotation_file),decl.pregrading_annotation_file,
          'Invalid pregrading snapshot path');
        const preRaw=fs.readFileSync(path.join(absolute,'declarations',decl.pregrading_annotation_file),'utf8');
        assert.equal(sha(preRaw),decl.pregrading_annotation_sha256,'Pregrading snapshot changed');
        const pre=JSON.parse(preRaw);
        assert.equal(pre.relation,r.relation);
        assert.deepEqual(pre.facts.map(f=>f.case_id),r.facts.map(f=>f.case_id));
        assert(pre.facts.every(f=>!f.judgment),'Predicate was not declared before grading');
      } else {
        assert.equal(decl.kind,'inherited_frozen_complete_census');
        assert(prior.strata.some(s=>s.relation===r.relation),'New relation cannot claim inherited scope');
        assert.equal(decl.prior_assessment_sha256,source.snapshot_hashes['prior_assessment.json']);
      }
    },
    validateFact(c,primary,chosen,a,r) {
      if(priorFacts.has(c.case_id)) {
        const old=priorFacts.get(c.case_id);
        for(const key of ['judgment','reason','evidence_lines','issue_tags','reviewer_question']) {
          assert.deepEqual(chosen[key],old[key],'Prior top20 assessment changed: '+c.case_id+' '+key);
        }
        assert.equal(a.predicate_id,old.predicate_id,'Prior top20 predicate changed');
        assert.equal(primary.provenance?.kind,'exact_complete_census_judgment','Missing exact census provenance');
        assert.equal(primary.provenance.source_map_sha256,source.source_sha256);
        assert.equal(primary.provenance.assessment_sha256,source.snapshot_hashes['prior_assessment.json']);
        assert.equal(primary.provenance.annotation_sha256,source.prior_annotation_hashes[r.relation+'.json']);
      }
      if(a.predicate_id==='unresolved_relation') {
        assert.equal(chosen.judgment,'ambiguous','Unresolved relation facts must remain A: '+c.case_id);
        assert(chosen.issue_tags.includes('relation_semantic_indeterminacy'),
          'Unresolved relation lacks explicit semantic-indeterminacy tag: '+c.case_id);
      }
    },
    resultPrefix(facts) {
      const restored=facts.filter(f=>priorFacts.has(f.case_id));
      assert.equal(restored.length,prior.counts.N,'Prior top20 incomplete');
      return {coverage,prior_top20:prior.counts};
    }
  };
}
