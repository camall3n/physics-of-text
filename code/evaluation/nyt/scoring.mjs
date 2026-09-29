import assert from 'node:assert/strict';

/** Count supplied judgments only. Evidence rows never become extra grading units. */
export function scoreFacts(facts) {
  let S=0,E=0,A=0;
  for(const fact of facts) {
    if(fact.judgment==='supported')S++;
    else if(fact.judgment==='incorrect')E++;
    else if(fact.judgment==='ambiguous')A++;
    else throw Error('Unreviewed fact: '+fact.case_id);
  }
  const N=facts.length,unresolved=facts.filter(f=>f.predicate_id==='unresolved_relation');
  return {
    N,S,E,A,unresolved_predicate_facts:unresolved.length,
    unresolved_predicate_relations:new Set(unresolved.map(f=>f.relation)).size,
    lower:N?S/N:null,upper:N?(S+A)/N:null
  };
}

/** Prefix precision uses all selected facts; added-block scores start after the frozen baseline. */
export function scoreCoverage(result) {
  const baseK=result.coverage.reference_top20.k;
  const base=scoreFacts(result.facts.filter(f=>f.relation_rank<=baseK));
  for(const key of ['N','S','E','A']) {
    assert.equal(base[key],result.coverage.reference_top20.counts[key],'Prior top20 scores changed');
  }
  let previousK=baseK;
  const thresholds=result.coverage.targets.map(target=>{
    assert(target.k>=previousK,'Thresholds must nest above the baseline');
    const selected=result.facts.filter(f=>f.relation_rank<=target.k);
    const added=result.facts.filter(f=>f.relation_rank>previousK&&f.relation_rank<=target.k);
    const counts=scoreFacts(selected);
    assert.equal(counts.N,target.N,'Threshold fact denominator differs');
    const marginal={from_exclusive_rank:previousK,to_inclusive_rank:target.k,...scoreFacts(added)};
    previousK=target.k;
    return {...target,...counts,marginal};
  });
  return {
    reference_top20:{k:baseK,rows:result.coverage.reference_top20.rows,
      achieved_coverage:result.coverage.reference_top20.rows/result.metadata.corpus_sentences,...base},
    thresholds
  };
}
