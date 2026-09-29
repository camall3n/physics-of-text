import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import crypto from 'node:crypto';
import { fileURLToPath } from 'node:url';

// Read-only analysis of existing human-readable manual labels; never relabels facts.
const here = path.dirname(fileURLToPath(import.meta.url));
const experiment = path.dirname(here);
const repository = path.resolve(experiment, '../..');
const input = path.join(repository, 'resources/sampler-140626/results/nyt-2026-fixed-400/evaluation/evaluations.json');
const raw = fs.readFileSync(input, 'utf8');
const data = JSON.parse(raw);
const all = data.facts;
const facts = all.filter(c => c.rank >= 1 && c.rank <= 20);
assert.equal(facts.length, 1066);
assert(facts.every(c => c.audited && ['supported', 'incorrect', 'ambiguous'].includes(c.judgment)));
assert.equal(new Set(facts.map(c => c.case_id)).size, facts.length);
const sum = xs => xs.reduce((a, b) => a + b, 0);
const tags = c => c.assistant?.issue_tags ?? [];
function tally(cs, weight = () => 1) {
  const s = { n: cs.length, weight: sum(cs.map(weight)), supported: 0, incorrect: 0, ambiguous: 0 };
  for (const c of cs) s[c.judgment] += weight(c);
  assert.equal(s.supported + s.incorrect + s.ambiguous, s.weight);
  s.lower = s.supported / s.weight;
  s.upper = (s.supported + s.ambiguous) / s.weight;
  s.decided_precision = s.supported / (s.supported + s.incorrect);
  return s;
}
const entities = new Map();
for (const c of all) for (const row of c.evidence) {
  for (const [id, name] of [[row.entity1, row.arg1], [row.entity2, row.arg2]]) {
    if (!entities.has(id)) entities.set(id, new Set());
    entities.get(id).add(name);
  }
}
const multiName = c => entities.get(c.entity1).size > 1 || entities.get(c.entity2).size > 1;
const rowTriples = all.flatMap(c => c.evidence.map(e => JSON.stringify([e.arg1, e.arg2, e.dependency_path])));
const byRelation = data.relations.filter(r => r.rank <= 20).map(r => ({
  relation: r.relation, rank: r.rank, label: r.label,
  ...tally(facts.filter(c => c.relation === r.relation))
}));
const frequency = [1,2,3,5,10,15,20].map(minimum => ({minimum_rows: minimum,
  ...tally(facts.filter(c => c.sentence_count >= minimum))}));
const tagCounts = Object.fromEntries([...new Set(facts.flatMap(tags))].sort().map(t => [t, tally(facts.filter(c => tags(c).includes(t)))]));
const rankByFacts = [...data.relations].sort((a,b) => b.n - a.n || Number(a.relation.slice(4))-Number(b.relation.slice(4))).slice(0,20);
const reviewedByFactRank = facts.filter(c => rankByFacts.some(r => r.relation === c.relation));
const unreviewedByFactRank = all.filter(c => rankByFacts.some(r => r.relation === c.relation) && !c.audited);
const counterfactual = (key, predicate) => {
  const affected = facts.filter(c => c.judgment !== 'supported' && predicate(c));
  return {key, affected_nonsupported: affected.length,
    fraction_if_every_affected_became_supported: (tally(facts).supported + affected.length) / facts.length,
    note: 'Arithmetic ceiling for this tagged subset only; not an estimate of any intervention or a re-evaluation.'};
};
const logRising = (x,n) => sum(Array.from({length:n},(_,i)=>Math.log(x+i)));
const N = 1199, M = 17032, A = .001*1199;
const logPrior = n => -Math.log(n) - .5*(Math.log(n)-(Math.log(N)-.5))**2;
const nounMerge = [1,2,5,10].map(n => ({mentions_per_entity:n,
  log_noun_bayes_factor: logRising(A,n)-logRising(A+n,n),
  noun_bayes_factor: Math.exp(logRising(A,n)-logRising(A+n,n))}));
const modelExamples = {
  noun_total_concentration:A, noun_merge_distinct_pure_names: nounMerge,
  singleton_merge_all_entities_occupied: {
    N, total_mentions:M,
    noun_bayes_factor:A/(A+1),
    uniform_entity_origin_factor: Math.exp(M*Math.log(N/(N-1))),
    unlabelled_factor:1/N,
    count_prior_ratio:Math.exp(logPrior(N-1)-logPrior(N)),
    total_target_ratio: Math.exp(logPrior(N-1)-logPrior(N)+M*Math.log(N/(N-1))-Math.log(N)+Math.log(A/(A+1)))
  }
};
const result = {
  source: path.relative(experiment,input), source_sha256:crypto.createHash('sha256').update(raw).digest('hex'),
  provenance:'Only aggregations of completed manual fact judgments; no semantic relabeling, fresh sampling, or user overrides.',
  micro:tally(facts),
  macro: {relations:20,lower:sum(byRelation.map(r=>r.lower))/20,upper:sum(byRelation.map(r=>r.upper))/20},
  sentence_weighted_fact_labels:tally(facts,c=>c.sentence_count),
  unique_triple_weighted_fact_labels:tally(facts,c=>new Set(c.evidence.map(e=>JSON.stringify([e.arg1,e.arg2,e.dependency_path]))).size),
  frequency, by_relation:byRelation,
  rank_subsets:[1,5,10,15,20].map(n=>({top_n:n,...tally(facts.filter(c=>c.rank<=n))})),
  alternative_rank_by_expressed_facts:{selected_relations:rankByFacts.map(r=>r.relation),
    removed:data.relations.filter(r=>r.rank<=20&&!rankByFacts.some(x=>x.relation===r.relation)).map(r=>r.relation),
    added:rankByFacts.filter(r=>r.rank>20).map(r=>({relation:r.relation,n:r.n,old_sentence_rank:r.rank})),
    reviewed:tally(reviewedByFactRank),unreviewed:unreviewedByFactRank.length,
    lower_full_set:tally(reviewedByFactRank).supported/(reviewedByFactRank.length+unreviewedByFactRank.length),
    upper_full_set:(tally(reviewedByFactRank).supported+tally(reviewedByFactRank).ambiguous+unreviewedByFactRank.length)/(reviewedByFactRank.length+unreviewedByFactRank.length)},
  issue_tags:tagCounts,
  identity_subsets:{single_literal_pair_within_fact:tally(facts.filter(c=>c.names.length===1)),
    multiple_literal_pairs_within_fact:tally(facts.filter(c=>c.names.length>1)),
    both_entities_globally_one_literal_name:tally(facts.filter(c=>!multiName(c))),
    at_least_one_entity_globally_multiple_literal_names:tally(facts.filter(multiName)),
    entity_identity_tagged:tally(facts.filter(c=>tags(c).includes('entity_identity'))),
    no_entity_identity_tag:tally(facts.filter(c=>!tags(c).includes('entity_identity')))},
  tag_counterfactuals:[counterfactual('entity_identity',c=>tags(c).includes('entity_identity')),
    counterfactual('entity_identity_or_attachment_or_malformed_path',c=>tags(c).some(t=>['entity_identity','attachment','malformed_path'].includes(t)))],
  raw_corpus:{rows:rowTriples.length,unique_literal_triples:new Set(rowTriples).size,
    repeated_literal_triple_rows:rowTriples.length-new Set(rowTriples).size,
    expressed_entities:entities.size,multiple_name_entities:[...entities.values()].filter(v=>v.size>1).length,
    literal_nouns:new Set([...entities.values()].flatMap(v=>[...v])).size,
    dependency_paths:new Set(all.flatMap(c=>c.evidence.map(e=>e.dependency_path))).size},
  model_examples:modelExamples,
};
const pct = n => `${(100*n).toFixed(2)}%`;
const range = s => `${pct(s.lower)}–${pct(s.upper)}`;
const row = (label,s) => `| ${label} | ${s.n} | ${s.supported}/${s.incorrect}/${s.ambiguous} | ${range(s)} |`;
const lines = [
 '# Evaluation sensitivity of the saved corrected NYT run', '',
 '[Model and paper analysis](paper_model_choices.md) · [Structured numbers](evaluation_sensitivity.json) · [Original audit](../../../resources/sampler-140626/results/nyt-2026-fixed-400/evaluation/README.md)', '',
 'This file changes no judgments. It aggregates the completed 1,066-fact audit of the 20 relations with most assigned sentence rows. Supported (S) means the stored text supports the specified predicate; incorrect (E) means it does not; ambiguous (A) remains unresolved. The lower–upper ranges count A first as incorrect, then as supported. They are ambiguity bounds, **not confidence intervals**.', '',
 '## Aggregation does not explain the 95% claim', '',
 '| Statistic | Lower–upper | Meaning |','|---|---:|---|',
 `| Micro fact precision | ${range(result.micro)} | Every expressed latent tuple gets one vote. |`,
 `| Macro relation precision | ${range(result.macro)} | Each of the 20 relations gets equal weight. |`,
 `| Sentence-weighted fact labels | ${range(result.sentence_weighted_fact_labels)} | Each fact label is repeated for all assigned rows. This is not sentence precision or purity. |`,
 `| Unique-triple-weighted fact labels | ${range(result.unique_triple_weighted_fact_labels)} | Within each fact, repeated identical literal argument/path triples count once. Still not sentence precision. |`, '',
 `Among supported facts, ${facts.filter(c=>c.judgment==='supported'&&tags(c).includes('mixed_evidence')).length} have a mixed_evidence flag: some assigned rows need not support the fact. Therefore weighting every row of a supported fact as supported is optimistic for sentence-level correctness.`, '',
 '## Frequency filtering changes the task', '',
 '| Minimum assigned rows per fact | Facts retained | S/E/A | Precision bounds |','|---|---:|---:|---:|',
 ...frequency.map(s=>row(String(s.minimum_rows),s)), '',
 'These are nested subsets, not independent experiments. A fact-frequency threshold must be declared before evaluating a new run, and retained fraction must be reported. The paper says all facts of its selected relations were checked and documents no such threshold; selectively keeping frequent facts is not a reproduction of that claim.', '',
 '## Relation selection', '',
 '| Top relations by assigned rows | Facts | S/E/A | Precision bounds |','|---|---:|---:|---:|',
 ...result.rank_subsets.map(s=>row(String(s.top_n),s)), '',
 `Ranking by expressed **fact count** instead would remove ${result.alternative_rank_by_expressed_facts.removed.join(', ')} and add ${result.alternative_rank_by_expressed_facts.added.map(r=>`${r.relation} (${r.n} facts)`).join(', ')}. There are ${unreviewedByFactRank.length} unreviewed facts in that alternative population; existing judgments imply only ${pct(result.alternative_rank_by_expressed_facts.lower_full_set)}–${pct(result.alternative_rank_by_expressed_facts.upper_full_set)} bounds even if every newly selected fact were supported at the upper end. This ranking ambiguity alone cannot yield 95%.`, '',
 '## Entity identities and predicate errors', '',
 '| Subset | Facts | S/E/A | Precision bounds |','|---|---:|---:|---:|',
 ...Object.entries(result.identity_subsets).map(([k,s])=>row(k.replaceAll('_',' '),s)), '',
 'Multiple observed names are a structural flag, not a proven coreference mistake: aliases can be legitimate. Conversely, one name can denote multiple real-world entities. Annotation tags reflect the explicit case review; absence of a tag is not proof that a cause is absent.', '',
 '| Existing issue tag (overlapping) | Facts | S/E/A | Precision bounds |','|---|---:|---:|---:|',
 ...Object.entries(tagCounts).map(([k,s])=>row(k,s)), '',
 ...result.tag_counterfactuals.map(c=>`Even making every currently non-supported case tagged **${c.key}** supported would give ${pct(c.fraction_if_every_affected_became_supported)} strict precision. This is a bookkeeping scenario, not a prediction of the effect of fixing identities or parsing. Downstream relation changes could have wider effects.`), '',
 '## Corpus and reproducibility caveats', '',
 `The saved MAP contains ${result.raw_corpus.rows} rows but ${result.raw_corpus.unique_literal_triples} distinct literal (arg1, arg2, path) triples; ${result.raw_corpus.repeated_literal_triple_rows} rows duplicate such a triple. These may be legitimate repeated reports, duplicate source extraction, or repeated inclusion; the triples lack document/sentence provenance to decide. Deduplicating changes likelihood evidence and is a separately named data ablation, not a bug fix.`, '',
 `There are ${result.raw_corpus.expressed_entities} expressed entity IDs, of which ${result.raw_corpus.multiple_name_entities} emit more than one literal name; ${result.raw_corpus.literal_nouns} distinct literal names and ${result.raw_corpus.dependency_paths} dependency paths occur.`, '',
 'Reproduce with `node scripts/evaluation_sensitivity.mjs` from the experiment directory. The script reads the historical evaluation and writes only this experiment\'s analysis files. Source SHA-256 is stored in the JSON.', '',
 '## A fair manual comparison for the new ablations', '',
 '1. Fix the primary population before looking at scores: each run\'s top 20 relations by assigned rows, evaluated as expressed ordered latent tuples. Keep the existing relation meanings when identifiable. Record new or mixed predicate definitions before grading facts; do not widen a relation to absorb its errors.',
 '2. For a modest screening budget, draw 160 facts uniformly without replacement from that complete population using a recorded seed independent of the sampler seed. Shuffle case order and mask variant/run labels. Grade every sampled fact, preserving A and specific reviewer questions. Retain all evidence rows, not merely a favorable representative path. If a common literal-name unit is used instead, report it as a different endpoint.',
 '3. Report S/n and (S+A)/n and a sampling uncertainty interval for each endpoint. For a simple random sample, use a Wilson binomial interval as an approximate descriptive interval; finite-population hypergeometric inversion is preferable when the sampled fraction is material. Do not call the ambiguity range a 95% confidence interval.',
 '4. Alternative stratification: select eight facts independently within each of the 20 relations for 160 total. Estimate micro precision with weights n_r/N, not the unweighted sample average; that unweighted average estimates macro relation precision. Use a stratified design variance or bootstrap within each relation and retain A endpoints separately.',
 '5. A 160-case simple random sample has an approximate 95% margin of ±7.7 percentage points near 50% before finite-population correction. This is enough to screen a proposed change from about 50% to about 95%, but not to settle a small improvement. At 95%, 152/160 gives an approximate Wilson interval of 90.5%–97.4%. Multiple seed runs and multiple relations create additional dependence not captured by a simple fact-level interval.',
 '6. For a promising variant, review all facts of its top 20 and use at least three independently seeded runs. Report each run separately as well as the mean. Confidence intervals over stochastic runs answer a different question from sampled-fact intervals. Never choose the run with the best observed semantic score and present it as typical.', '',
];
fs.mkdirSync(path.join(experiment,'analysis'),{recursive:true});
fs.writeFileSync(path.join(experiment,'analysis/evaluation_sensitivity.json'),JSON.stringify(result,null,2)+'\n');
fs.writeFileSync(path.join(experiment,'analysis/evaluation_sensitivity.md'),lines.join('\n'));
console.log(JSON.stringify({micro:result.micro,macro:result.macro,frequency,raw_corpus:result.raw_corpus,identity_subsets:result.identity_subsets,model_examples:modelExamples},null,2));
