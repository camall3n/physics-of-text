import fs from 'node:fs';
import assert from 'node:assert/strict';
import {sha,fmt} from './common.mjs';

// Frozen declarations hash the entire record with its original property order.
// A declared version participates in the hash; older unversioned records mean v1.
export const predicateHash=predicate=>sha(fmt(predicate));

/** Load one canonical catalogue and its common grading rubric without rewriting it. */
export function loadPredicateRegistry(file) {
  const raw=fs.readFileSync(file),catalogue=JSON.parse(raw);
  assert(Array.isArray(catalogue.predicates),'Missing predicate records');
  const predicates=new Map();
  for(const p of catalogue.predicates){
    assert(typeof p.id==='string'&&p.id,'Missing predicate ID');
    assert(!predicates.has(p.id),'Duplicate predicate ID: '+p.id);
    assert(p.definition&&p.scope_notes,'Incomplete predicate: '+p.id);
    predicates.set(p.id,p);
  }
  return {predicates,catalogue_sha256:sha(raw),
    common_rules_sha256:sha(fmt(catalogue.common_rules??{}))};
}

