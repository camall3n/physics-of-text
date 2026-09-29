import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {sampler, parseArgs, extract, parseRows, observedCorpusHash, sha256, jsonText, methodText} from './audit_nyt_rerun.mjs';

const read = file => JSON.parse(fs.readFileSync(file, 'utf8'));
const allowed = new Set(['supported', 'incorrect', 'ambiguous']);
const text = value => typeof value === 'string' && value.trim().length > 0;
const md = value => String(value ?? '').replaceAll('&', '&amp;').replaceAll('<', '&lt;').replaceAll('>', '&gt;').replaceAll('|', '&#124;').replaceAll('\n', ' ');
const pct = value => Number.isFinite(value) ? (100 * value).toFixed(1) + '%' : '—';
const range = s => `${pct(s.lower)}–${pct(s.upper)}`;
const href = value => encodeURI(value.split(path.sep).join('/')).replaceAll('(', '%28').replaceAll(')', '%29');
const notesText = value => typeof value === 'string' ? value : JSON.stringify(value);

function stats(cases) {
  const n = cases.length, supported = cases.filter(c => c.judgment === 'supported').length;
  const incorrect = cases.filter(c => c.judgment === 'incorrect').length;
  const ambiguous = cases.filter(c => c.judgment === 'ambiguous').length;
  if (n !== supported + incorrect + ambiguous) throw Error('Attempted to score unreviewed cases');
  return {n, supported, incorrect, ambiguous, lower: n ? supported / n : null,
    upper: n ? (supported + ambiguous) / n : null,
    decided_precision: supported + incorrect ? supported / (supported + incorrect) : null,
    decided_coverage: n ? (supported + incorrect) / n : null,
    human_overrides: cases.filter(c => c.judgment_source === 'human').length};
}

function checkLines(lines, c, label) {
  if (!Array.isArray(lines) || !lines.length || new Set(lines).size !== lines.length
      || lines.some(line => !Number.isSafeInteger(line) || !c.source_lines.includes(line)))
    throw Error(`Invalid ${label} evidence lines: ${c.case_id}`);
}

function comparePrior(file, current, currentRowsHash, out) {
  const prior = read(file);
  if (!prior.metadata?.top20 || !Array.isArray(prior.facts) || !prior.top20) throw Error('Invalid prior evaluation: ' + file);
  const facts = prior.facts.filter(c => prior.metadata.top20.includes(c.relation));
  if (new Set(facts.map(c => c.case_id)).size !== facts.length) throw Error('Duplicate prior cases: ' + file);
  const priorStats = stats(facts);
  for (const key of ['n', 'supported', 'incorrect', 'ambiguous', 'human_overrides'])
    if (priorStats[key] !== prior.top20[key]) throw Error(`Prior ${key} disagrees with its saved fact judgments: ${file}`);
  const source = path.resolve(path.dirname(file), prior.metadata.source);
  const raw = fs.readFileSync(source);
  if (sha256(raw) !== prior.metadata.source_sha256) throw Error('Prior source checksum mismatch: ' + file);
  const rows = parseRows(raw);
  return {evaluation: path.relative(out, file), source_sha256: prior.metadata.source_sha256,
    corpus_sentences: rows.length, same_observed_corpus: observedCorpusHash(rows) === currentRowsHash,
    top20_sentences: rows.filter(r => prior.metadata.top20.includes(r.relation)).length,
    top20: priorStats, paired: false, cluster_ids_are_semantic_matches: false,
    supported_share_difference_percentage_points: 100 * (current.lower - priorStats.lower),
    note: 'Unpaired descriptive comparison of separately selected top-20 populations and evaluator-defined predicates; not a causal estimate, confidence interval, or matched-cluster accuracy comparison.'};
}

export function report({resultDir, expectedRows, priors}) {
  const out = path.join(resultDir, 'evaluation');
  const stored = read(path.join(out, 'cases.json'));
  const canonical = extract(resultDir, expectedRows);
  // Reconstruct all rows, IDs, memberships, rankings, counts, and evidence. A valid
  // source hash alone would not detect edits or omissions in cases.json itself.
  if (JSON.stringify(stored) !== JSON.stringify(canonical))
    throw Error('Extraction/source mismatch: cases.json must exactly match the current complete TSV; regenerate and re-audit affected cases.');
  const {metadata, cases, relations} = canonical;
  const byId = new Map(cases.map(c => [c.case_id, c]));
  if (byId.size !== cases.length) throw Error('Duplicate extracted case IDs');
  const selected = cases.filter(c => c.rank !== null);
  const annotations = [], factAnnotations = new Map();
  for (const relation of metadata.top20) {
    const file = path.join(out, 'annotations', relation + '.json');
    if (!fs.existsSync(file)) throw Error(`Incomplete audit: missing ${file}`);
    const annotation = read(file);
    if (annotation.relation !== relation || !text(annotation.label) || !text(annotation.definition)
        || !annotation.scope_notes || !text(notesText(annotation.scope_notes)) || !Array.isArray(annotation.facts))
      throw Error('Incomplete or mismatched predicate definition: ' + relation);
    if (annotation.source_sha256 && annotation.source_sha256 !== metadata.source_sha256)
      throw Error('Annotation source checksum mismatch: ' + relation);
    for (const fact of annotation.facts) {
      const c = byId.get(fact.case_id);
      if (!c || c.relation !== relation || factAnnotations.has(fact.case_id)) throw Error('Invalid/duplicate annotated case: ' + fact.case_id);
      if (!allowed.has(fact.judgment) || !text(fact.reason) || !Array.isArray(fact.issue_tags)
          || fact.issue_tags.some(tag => !text(tag)) || typeof fact.reviewer_question !== 'string')
        throw Error('Invalid annotation: ' + fact.case_id);
      checkLines(fact.evidence_lines, c, 'assistant');
      if (fact.judgment === 'ambiguous' && !text(fact.reviewer_question)) throw Error('Missing concrete reviewer question: ' + fact.case_id);
      factAnnotations.set(fact.case_id, {annotation, fact});
    }
    annotations.push(annotation);
  }
  if (factAnnotations.size !== selected.length) {
    const missing = selected.filter(c => !factAnnotations.has(c.case_id));
    throw Error(`Incomplete top-20 audit: ${factAnnotations.size}/${selected.length}; missing ${missing.slice(0, 5).map(c => c.case_id).join(', ')}`);
  }

  const reviewPath = path.join(out, 'human_review.json');
  const existing = fs.existsSync(reviewPath) ? read(reviewPath) : {reviews: []};
  if (!Array.isArray(existing.reviews)) throw Error('human_review.json needs a reviews array');
  if (existing.source_sha256 && existing.source_sha256 !== metadata.source_sha256) throw Error('Human review source checksum mismatch');
  const overrides = new Map();
  for (const review of existing.reviews) {
    const c = byId.get(review.case_id);
    if (!c || c.rank === null || overrides.has(review.case_id) || (review.relation && review.relation !== c.relation)
        || (review.judgment !== undefined && review.judgment !== '' && !allowed.has(review.judgment)))
      throw Error('Invalid/duplicate/out-of-scope human review: ' + review.case_id);
    if (review.evidence_lines !== undefined) checkLines(review.evidence_lines, c, 'human');
    if (review.judgment) {
      if (!text(review.notes) || !text(review.reviewer) || !text(review.reviewed_at)
          || !/^\d{4}-\d{2}-\d{2}(?:T.*)?$/.test(review.reviewed_at) || !Number.isFinite(Date.parse(review.reviewed_at)))
        throw Error('Human decision needs notes, reviewer and ISO reviewed_at: ' + review.case_id);
      const original = factAnnotations.get(review.case_id).fact;
      if (review.judgment === 'ambiguous' && !text(review.question) && !text(original.reviewer_question))
        throw Error('Human ambiguity needs a concrete question: ' + review.case_id);
    }
    overrides.set(review.case_id, review);
  }
  const joined = cases.map(c => {
    const original = factAnnotations.get(c.case_id), human = overrides.get(c.case_id);
    return {...c, audited: c.rank !== null, label: original?.annotation.label || null,
      definition: original?.annotation.definition || null, assistant: original?.fact || null, human: human || null,
      judgment: human?.judgment || original?.fact.judgment || null,
      judgment_source: human?.judgment ? 'human' : original ? 'assistant' : null};
  });
  const audited = joined.filter(c => c.audited), total = stats(audited);
  const perRelation = relations.map(r => {
    const annotation = annotations.find(a => a.relation === r.relation);
    const evaluation = r.selected ? stats(audited.filter(c => c.relation === r.relation)) : null;
    return {...r, label: annotation?.label || null, definition: annotation?.definition || null,
      scope_notes: annotation?.scope_notes || null,
      ...(evaluation || {n: r.facts, supported: null, incorrect: null, ambiguous: null,
        lower: null, upper: null, decided_precision: null, decided_coverage: null, human_overrides: 0}),
      evaluation};
  });
  const defaultPrior = path.join(sampler, 'results/nyt-2026/evaluation/evaluations.json');
  const priorFiles = priors.length ? priors : fs.existsSync(defaultPrior) ? [defaultPrior] : [];
  if (new Set(priorFiles).size !== priorFiles.length) throw Error('Duplicate prior evaluation paths');
  if (priorFiles.includes(path.join(out, 'evaluations.json'))) throw Error('A run cannot be its own prior comparison');
  const comparisons = priorFiles.map(file => comparePrior(file, total, metadata.observed_triples_sha256, out));
  const unresolved = audited.filter(c => c.judgment === 'ambiguous');
  const files = new Map();
  const write = (name, value) => files.set(name, value);
  const json = (name, value) => write(name, jsonText(value));
  const sourceLink = (line, nested) => `[TSV:${line}](${nested ? '../../' : '../'}map_world_sentences.tsv#L${line})`;
  const factSection = (c, nested = false, review = false) => {
    const original = c.assistant;
    const question = c.human?.question || original?.reviewer_question || '';
    return `### ${c.case_id}\n\n**${c.names.map(n => `${md(n.value)} (${n.count})`).join('; ')}**\n\n${c.audited ? `Predicate: ${md(c.definition)}\n\nJudgment: **${c.judgment}** (${c.judgment_source}).` : '**Not audited:** outside the top-20 population; no semantic judgment assigned.'} ${c.sentence_count} sentence rows.\n\n${original ? `**Assistant rationale (original judgment: ${original.judgment}):** ${md(original.reason)}\n\n${original.issue_tags.length ? `Issues: ${original.issue_tags.map(md).join(', ')}.\n\n` : ''}Assistant evidence: ${original.evidence_lines.map(l => sourceLink(l, nested)).join(', ')}.\n\n` : ''}${c.human?.judgment ? `**Human decision:** ${c.human.judgment}; ${md(c.human.notes)} (${md(c.human.reviewer)}, ${md(c.human.reviewed_at)}).\n\n${c.human.evidence_lines ? `Human evidence: ${c.human.evidence_lines.map(l => sourceLink(l, nested)).join(', ')}.\n\n` : ''}` : ''}${question ? `**Review question:** ${md(question)}\n\n` : ''}${review ? 'Human decision: __________  Notes: __________\n\n' : ''}<details>\n<summary>All assigned rows and dependency paths</summary>\n\n| TSV line | First entity name | Second entity name | Dependency path |\n|---:|---|---|---|\n${c.evidence.map(e => `| ${sourceLink(e.line, nested)} | ${md(e.arg1)} | ${md(e.arg2)} | ${md(e.dependency_path)} |`).join('\n')}\n\n</details>\n`;
  };

  write('METHOD.md', methodText(metadata));
  write('predicate_choices.md', `# Predicates used in this audit\n\n[Audit index](README.md) · [Method](METHOD.md)\n\nThese directional predicates are evaluator choices inferred from dominant paths, not sampler output labels or paper annotations. Review their boundaries before interpreting aggregate scores. Changing a predicate requires re-evaluating its cases. Numeric cluster IDs do not imply matching meanings across runs.\n\n${annotations.map(a => `## ${a.relation}: ${md(a.label)}\n\n**Predicate:** ${md(a.definition)}\n\n${md(notesText(a.scope_notes))}\n\n[Inspect every fact](relations/${a.relation}.md)\n`).join('\n')}`);
  for (const relation of perRelation) {
    const subset = joined.filter(c => c.relation === relation.relation), s = relation.evaluation;
    write(`relations/${relation.relation}.md`, `# ${relation.relation}${relation.label ? ': ' + md(relation.label) : ' (not audited)'}\n\n[Audit index](../README.md) · [Method](../METHOD.md)\n\nRank ${relation.rank}; ${relation.sentences} sentence rows; ${subset.length} expressed facts.\n\n${s ? `**Predicate:** ${md(relation.definition)}\n\n${md(notesText(relation.scope_notes))}\n\n${s.supported} supported, ${s.incorrect} incorrect, ${s.ambiguous} ambiguous. Operational ambiguity range: **${range(s)}**. Decided-only: ${pct(s.decided_precision)} at ${pct(s.decided_coverage)} coverage. Human decisions: ${s.human_overrides}.\n\nA supported fact may contain unrelated assigned sentences; these are corpus-evidence judgments, not independent historical verification.\n\n` : 'This cluster is outside the top 20. Its facts are available for inspection and excluded from all semantic evaluation denominators.\n\n'}${subset.map(c => factSection(c, true)).join('\n')}`);
  }
  write('ambiguous_cases.md', `# Cases needing human review\n\n[Audit index](README.md) · [Method](METHOD.md)\n\n${unresolved.length} unresolved top-20 facts. Each has a concrete reviewer question and complete assigned evidence.\n\nEdit decisions in [human_review.json](human_review.json), then rerun the reporter. This generated Markdown is replaced on regeneration. Every supported/incorrect case can also be overridden in the JSON. Outside-top-20 cases are unaudited, not counted as ambiguous.\n\n${unresolved.map(c => factSection(c, false, true)).join('\n')}`);
  const humanReviews = audited.map(c => ({case_id: c.case_id, relation: c.relation,
    names: c.names.map(n => n.value), judgment: '', notes: '', reviewer: '', reviewed_at: '',
    ...overrides.get(c.case_id), assistant_judgment: c.assistant.judgment,
    assistant_question: c.assistant.reviewer_question,
    question: overrides.get(c.case_id)?.question ?? c.assistant.reviewer_question}));
  json('human_review.json', {...existing, source_sha256: metadata.source_sha256,
    instructions: 'Blank judgment retains the original assistant decision. Nonblank judgment must be supported, incorrect or ambiguous and include notes, reviewer and ISO reviewed_at. Ambiguous decisions need a concrete question. Optional evidence_lines must belong to the case. Do not edit case_id. Rebuild with node scripts/report_nyt_rerun.mjs RESULT_DIR.', reviews: humanReviews});
  json('evaluations.json', {metadata, method: 'METHOD.md', completed_top20_audit: true, top20: total,
    unaudited_facts: joined.length - audited.length, relations: perRelation, facts: joined});
  json('comparison.json', {current_source_sha256: metadata.source_sha256, current_top20: total, priors: comparisons});
  const currentRow = `| Current run | ${metadata.top20_sentences} | ${total.n} | ${total.supported} | ${total.incorrect} | ${total.ambiguous} | ${range(total)} | ${pct(total.decided_precision)} | ${pct(total.decided_coverage)} |`;
  const priorRows = comparisons.map(c => `| [${md(path.basename(path.dirname(path.dirname(path.resolve(out, c.evaluation)))))}](${href(c.evaluation)}) | ${c.top20_sentences} | ${c.top20.n} | ${c.top20.supported} | ${c.top20.incorrect} | ${c.top20.ambiguous} | ${range(c.top20)} | ${pct(c.top20.decided_precision)} | ${pct(c.top20.decided_coverage)} |`).join('\n');
  write('comparison.md', `# Comparison with saved evaluations\n\n[Audit index](README.md) · [Machine-readable comparison](comparison.json)\n\nThese are **unpaired descriptive summaries**. Numeric relation/entity IDs can change meaning, top-20 membership and fact populations can differ, and predicates are selected anew. No matching of IDs or case IDs is used to claim matching propositions. The differences do not isolate the causal effect of sampler fixes.\n\n| Evaluation | Top-20 rows | Facts | Supported | Incorrect | Ambiguous | Ambiguity range | Decided-only | Decided coverage |\n|---|---:|---:|---:|---:|---:|---|---:|---:|\n${currentRow}\n${priorRows}\n\n${comparisons.length ? comparisons.map(c => `- [Prior snapshot](${href(c.evaluation)}): ${c.same_observed_corpus ? 'same observed triple multiset' : '**different observed triple multiset**'}; supported-share difference (current minus prior) ${c.supported_share_difference_percentage_points.toFixed(1)} percentage points. This uses all selected facts in each separate denominator.`).join('\n') : 'No prior evaluation snapshot was available.'}\n\nA high decided-only rate can hide unresolved cases. The ambiguity range is not a confidence interval. The paper\'s roughly 95% manual precision used unavailable original judgments and annotation details, so this operational audit does not establish an identical measure.\n`);
  const table = perRelation.filter(r => r.selected).map(r => {
    const s = r.evaluation;
    return `| ${r.rank} | [${r.relation}](relations/${r.relation}.md) | ${md(r.label)} | ${r.sentences} | ${s.n} | ${s.supported} | ${s.incorrect} | ${s.ambiguous} | ${range(s)} |`;
  }).join('\n');
  write('all_relations.md', `# Every expressed relation\n\n[Audit index](README.md)\n\nAll ${metadata.total_expressed_relations} relations and ${metadata.total_expressed_facts} facts are available. Only the first ${metadata.top20.length} relations are semantically audited.\n\n| Rank | Relation | Rows | Facts | Status |\n|---:|---|---:|---:|---|\n${perRelation.map(r => `| ${r.rank} | [${r.relation}](relations/${r.relation}.md) | ${r.sentences} | ${r.facts} | ${r.selected ? 'Audited' : 'Not audited'} |`).join('\n')}\n`);
  write('README.md', `# NYT rerun: complete top-20 corpus-evidence audit\n\nReviewed every **${total.n} expressed latent facts** in the largest ${metadata.top20.length} MAP relations, represented by ${metadata.top20_sentences} sentence rows. The full TSV contains ${metadata.corpus_sentences} rows and ${metadata.total_expressed_facts} expressed facts; ${joined.length - audited.length} facts outside the top 20 remain unaudited.\n\n**${total.supported} supported, ${total.incorrect} incorrect, ${total.ambiguous} ambiguous.** The fact-weighted operational ambiguity range is **${range(total)}**. Decided-only precision: **${pct(total.decided_precision)}**, at **${pct(total.decided_coverage)}** decided coverage. Human decisions applied: **${total.human_overrides}**.\n\nThese are judgments of supplied dependency triples under explicit directional predicates, not independent historical verification or an exact replication of the paper's roughly 95% manual precision. Predicate granularity affects scores. The range assigns ambiguities first to failures and then successes; it is not a confidence interval. No gold-standard recall or partition-distance score is available.\n\n## Inspect and correct\n\n- [Method and annotation rubric](METHOD.md)\n- [Predicate choices](predicate_choices.md)\n- [Every relation and every expressed fact](all_relations.md)\n- [Ambiguous cases with evidence](ambiguous_cases.md)\n- [Human decisions](human_review.json)\n- [Unpaired comparison with prior saved evaluations](comparison.md)\n- [Machine-readable judgments](evaluations.json) and [complete extracted cases](cases.json)\n\n## Top-20 results\n\n| Rank | Relation | Evaluator predicate label | Rows | Facts | Supported | Incorrect | Ambiguous | Ambiguity range |\n|---:|---|---|---:|---:|---:|---:|---:|---|\n${table}\n\n## Provenance\n\nSource: [MAP sentence TSV](../map_world_sentences.tsv). SHA-256: \`${metadata.source_sha256}\`. All source rows and extracted facts were reconstructed and checked before reporting; every top-20 fact has an annotation with valid case-local evidence. Semantic judgments were supplied in annotation files and are not inferred by these scripts.\n\nTo apply human decisions, edit human_review.json and rerun \`node scripts/report_nyt_rerun.mjs RESULT_DIR\` from the sampler directory. Annotation files and review entries are preserved; generated Markdown is replaced.\n`);

  // Only write after every source, annotation, comparison and review check passes.
  fs.mkdirSync(path.join(out, 'relations'), {recursive: true});
  for (const [name, value] of files) fs.writeFileSync(path.join(out, name), value);
  console.log(jsonText({validated_source_rows: metadata.corpus_sentences, extracted_facts: cases.length,
    validated_top20_facts: audited.length, top20: total, unaudited_facts: joined.length - audited.length,
    unresolved: unresolved.length, comparisons: comparisons.length}));
}

if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) {
  try { report(parseArgs(process.argv.slice(2), true)); }
  catch (error) { console.error(error.message); process.exitCode = 1; }
}
