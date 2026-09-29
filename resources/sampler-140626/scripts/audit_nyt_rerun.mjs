import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';

export const sampler = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
export const sha256 = value => crypto.createHash('sha256').update(value).digest('hex');
export const frequency = values => [...values.reduce((m, v) => m.set(v, (m.get(v) || 0) + 1), new Map())]
  .sort((a, b) => b[1] - a[1] || a[0].localeCompare(b[0], 'en'))
  .map(([value, count]) => ({value, count}));
export const jsonText = value => JSON.stringify(value, null, 2) + '\n';

export function parseArgs(args, allowPrior = false) {
  if (!args.length) throw Error(`Usage: node scripts/${allowPrior ? 'report' : 'audit'}_nyt_rerun.mjs RESULT_DIR [--expected-rows N]${allowPrior ? ' [--prior EVALUATIONS_JSON ...]' : ''}`);
  const resultDir = path.resolve(args[0]);
  let expectedRows = 8516;
  const priors = [];
  for (let i = 1; i < args.length; i++) {
    if (args[i] === '--expected-rows' && args[i + 1]) expectedRows = Number(args[++i]);
    else if (allowPrior && args[i] === '--prior' && args[i + 1]) priors.push(path.resolve(args[++i]));
    else throw Error('Unknown or incomplete argument: ' + args[i]);
  }
  if (!Number.isSafeInteger(expectedRows) || expectedRows < 1) throw Error('Expected rows must be a positive integer');
  return {resultDir, expectedRows, priors};
}

export function parseRows(raw) {
  const lines = raw.toString('utf8').split(/\r?\n/);
  while (lines.at(-1) === '') lines.pop();
  if (lines.shift() !== 'relation\tentity1\tentity2\targ1\targ2\tpath') throw Error('Unexpected TSV header');
  return lines.map((line, i) => {
    const columns = line.split('\t');
    if (columns.length !== 6) throw Error(`Malformed TSV row ${i + 2}`);
    const [relation, entity1, entity2, arg1, arg2, dependency_path] = columns;
    if (!/^rel_\d+$/.test(relation) || !/^Ent\[[A-Za-z0-9_-]+\]$/.test(entity1) || !/^Ent\[[A-Za-z0-9_-]+\]$/.test(entity2))
      throw Error(`Unexpected relation/entity identifier at row ${i + 2}`);
    return {relation, entity1, entity2, arg1, arg2, dependency_path, line: i + 2};
  });
}

// Ignore inferred relation/entity IDs, retain multiplicity, and ignore row order.
export const observedCorpusHash = rows => sha256(JSON.stringify(rows.map(r => JSON.stringify([r.arg1, r.arg2, r.dependency_path])).sort()));

export function extract(resultDir, expectedRows = 8516) {
  const raw = fs.readFileSync(path.join(resultDir, 'map_world_sentences.tsv'));
  const rows = parseRows(raw);
  if (rows.length !== expectedRows) throw Error(`Expected ${expectedRows} sentence rows, found ${rows.length}; wait for a complete MAP TSV or explicitly set --expected-rows`);
  const groups = new Map();
  for (const row of rows) {
    if (!groups.has(row.relation)) groups.set(row.relation, []);
    groups.get(row.relation).push(row);
  }
  const ranking = [...groups].sort((a, b) => b[1].length - a[1].length || Number(a[0].slice(4)) - Number(b[0].slice(4)));
  const top20 = ranking.slice(0, 20).map(([relation]) => relation);
  const cases = [], relations = [];
  for (const [index, [relation, relationRows]] of ranking.entries()) {
    const facts = new Map();
    for (const row of relationRows) {
      const key = row.entity1 + '\t' + row.entity2;
      if (!facts.has(key)) facts.set(key, []);
      facts.get(key).push(row);
    }
    const factGroups = [...facts.values()].sort((a, b) => b.length - a.length || a[0].line - b[0].line);
    for (const [factIndex, factRows] of factGroups.entries()) {
      const {entity1, entity2} = factRows[0];
      cases.push({
        case_id: `${relation}__${entity1.slice(4, -1)}__${entity2.slice(4, -1)}`,
        relation, rank: index < 20 ? index + 1 : null, relation_rank: index + 1, fact_rank: factIndex + 1,
        entity1, entity2, sentence_count: factRows.length,
        names: frequency(factRows.map(r => `${r.arg1} → ${r.arg2}`)),
        paths: frequency(factRows.map(r => r.dependency_path)),
        source_lines: factRows.map(r => r.line), evidence: factRows,
      });
    }
    relations.push({relation, rank: index + 1, selected: index < 20, sentences: relationRows.length,
      facts: facts.size, paths: frequency(relationRows.map(r => r.dependency_path))});
  }
  const metadata = {
    source: '../map_world_sentences.tsv', source_sha256: sha256(raw), observed_triples_sha256: observedCorpusHash(rows),
    corpus_sentences: rows.length, expected_corpus_sentences: expectedRows,
    total_expressed_relations: relations.length, total_expressed_facts: cases.length,
    unit: 'One expressed latent fact: (relation, entity1 ID, entity2 ID).',
    selection: 'Top 20 relations ranked by MAP sentence count; no additional relations enter the audit.',
    ordering: 'Relations by descending sentence count, numeric relation ID for ties; facts by descending sentence count, first source line for ties.',
    top20, top20_sentences: relations.filter(r => r.selected).reduce((n, r) => n + r.sentences, 0),
    top20_facts: cases.filter(c => c.rank !== null).length,
  };
  return {metadata, cases, relations};
}

export function methodText(metadata) {
  return `# NYT relation audit protocol

This is a provisional corpus-evidence audit prepared for human review. It does not independently verify historical propositions and is not the paper's original annotation set.

## Population and unit

The complete MAP TSV contains ${metadata.corpus_sentences} sentence rows, ${metadata.total_expressed_relations} expressed relations, and ${metadata.total_expressed_facts} expressed latent facts. Rank relations by sentence count and review **every expressed latent fact in the largest ${metadata.top20.length} relations**: ${metadata.top20_facts} facts represented by ${metadata.top20_sentences} rows. No additional relation is included in the aggregate. Cases outside the top 20 remain available for inspection and are marked not audited.

The unit is a distinct \`(relation, entity1 ID, entity2 ID)\` tuple. Keep surface-name pairs, latent facts, and sentence occurrences separate. Do not deduplicate different latent facts because their names match. Unexpressed facts are absent from the TSV and outside this audit. Case IDs retain the existing \`rel_ID__ent_ID__ent_ID\` format. The source checksum and all row references are recorded in cases.json.

## Relation meanings

Define a specific directional predicate from the dominant dependency patterns **before scoring its cases**. State inclusion and exclusion boundaries. Do not redefine a cluster as a vague topic to make unrelated facts pass. Record competing interpretations explicitly. Synonymous paths may support one predicate; shared topics or arguments alone do not establish synonymy. Changing a definition requires re-evaluating all that relation's facts, not merely changing its label.

## Fact judgments

- **supported**: at least one supplied triple clearly supports the chosen directional predicate for the displayed entities. Cite the supporting source line. This is textual support, not independent historical verification.
- **incorrect**: the available evidence clearly expresses a different predicate, reverses direction, or has incompatible entity roles, with no clear support for the predicate. This need not mean the original newspaper sentence was false.
- **ambiguous**: predicate, attachment, identity, negation/modality/time, or proper-name interpretation cannot be resolved confidently from the supplied triples. Include a concrete question for human review.

A supported fact may have unrelated assigned sentences; tag **mixed_evidence** separately. Fact validity is not sentence-assignment purity. Materially incompatible local names sharing an entity ID normally require an **entity_identity** ambiguity unless the inconsistency is clear. Do not infer present-day truth from historical facts.

Read every case and its complete path/name evidence. Automated extraction and arithmetic are permitted; keyword matching alone is not a semantic review. The TSV contains dependency triples, not full articles. Do not invent historical citations or claim to have read unavailable sentences.

## Annotation format

Each annotations/rel_ID.json contains \`relation\`, \`label\`, \`definition\`, \`scope_notes\`, and \`facts\`. Each fact has \`case_id\`, \`judgment\`, \`reason\`, \`evidence_lines\`, \`issue_tags\`, and \`reviewer_question\` (blank when none is needed). Allowed judgments are exactly supported, incorrect, ambiguous. Every cited line must belong to that case; every ambiguity needs a concrete question. Suggested tags: direction, other_predicate, entity_identity, attachment, modality_time, broad_predicate, mixed_evidence, insufficient_evidence.

Human decisions are separate in human_review.json. A blank decision retains the assistant judgment. A nonblank decision must include notes, reviewer, and reviewed_at (ISO date or timestamp). A human ambiguity also needs a question; an existing assistant ambiguity's question may be retained. Optional human evidence_lines must belong to the same case. Original assistant judgments remain visible. Generators preserve annotation files and review entries; regenerated Markdown is not an editable decision store.

## Results

For each audited relation and the top-20 aggregate report S supported, E incorrect, A ambiguous, and N=S+E+A. **S/N–(S+A)/N** is the operational ambiguity range, not a confidence interval or a bound on historical truth. Also report S/(S+E) decided-only precision and (S+E)/N decided coverage. Each fact has equal aggregate weight. Report human override counts separately. Sentence counts and path coverage are not semantic precision or recall; no gold-standard recall denominator exists.

The paper reports roughly 95% manual fact precision for its 20 most common relations, but does not supply the complete judgments or sufficient annotation detail to establish an identical rubric. Comparing saved evaluations is descriptive and unpaired: cluster IDs, entity IDs, selected populations, and predicate choices can change. Matching numeric IDs does not establish matching meanings. Differences cannot isolate a code fix's causal effect.

## Provenance and rebuilding

Source SHA-256: \`${metadata.source_sha256}\`. The reporter reconstructs the complete case population from the TSV, checks exact extraction equality, requires complete top-20 annotation coverage, and validates evidence lines and human overrides before writing reports. Re-extraction refuses to replace a changed source when annotations or human review already exist; use a fresh result directory and re-audit.

From the sampler directory:

\`\`\`sh
node scripts/audit_nyt_rerun.mjs results/RUN_DIRECTORY
node scripts/report_nyt_rerun.mjs results/RUN_DIRECTORY
\`\`\`

Both commands default to requiring all 8,516 NYT rows. \`--expected-rows N\` supports explicitly different corpora and small validation fixtures. The reporter accepts repeated \`--prior PATH_TO_EVALUATIONS_JSON\` arguments; otherwise it compares the original saved NYT evaluation when available.
`;
}

export function prepare({resultDir, expectedRows}) {
  const bundle = extract(resultDir, expectedRows);
  const out = path.join(resultDir, 'evaluation');
  const previousPath = path.join(out, 'cases.json');
  const annotationsDir = path.join(out, 'annotations');
  const hasAnnotations = fs.existsSync(annotationsDir) && fs.readdirSync(annotationsDir).some(name => name.endsWith('.json'));
  const hasReview = fs.existsSync(path.join(out, 'human_review.json'));
  if (hasAnnotations || hasReview) {
    if (!fs.existsSync(previousPath)) throw Error('Annotations/review exist without a source-bound cases.json; refusing to overwrite');
    const previous = JSON.parse(fs.readFileSync(previousPath, 'utf8'));
    if (previous.metadata.source_sha256 !== bundle.metadata.source_sha256)
      throw Error('Source changed while annotations/review exist. Preserve this audit and use a fresh result directory.');
  }
  for (const dir of ['cases', 'annotations']) fs.mkdirSync(path.join(out, dir), {recursive: true});
  fs.writeFileSync(previousPath, jsonText(bundle));
  fs.writeFileSync(path.join(out, 'METHOD.md'), methodText(bundle.metadata));
  fs.writeFileSync(path.join(out, 'relation_ranking.json'), jsonText(bundle.relations));
  for (const relation of bundle.relations) {
    const subset = bundle.cases.filter(c => c.relation === relation.relation);
    fs.writeFileSync(path.join(out, 'cases', relation.relation + '.json'), jsonText(subset));
    const compact = subset.map((c, i) => `${i + 1}. ${c.case_id} (${c.sentence_count} sentences; lines ${c.source_lines.join(',')})\nNames: ${c.names.map(n => `${n.value} [${n.count}]`).join('; ')}\n${c.paths.map(p => `  ${p.count} ${p.value}`).join('\n')}`).join('\n\n');
    fs.writeFileSync(path.join(out, 'cases', relation.relation + '.txt'), compact + '\n');
  }
  if (!fs.existsSync(path.join(out, 'README.md'))) fs.writeFileSync(path.join(out, 'README.md'), `# NYT rerun audit: cases prepared\n\nAll ${bundle.metadata.corpus_sentences} TSV rows and ${bundle.cases.length} expressed facts are extracted. The top ${bundle.metadata.top20.length} relations contain ${bundle.metadata.top20_facts} facts requiring individual review. Semantic results are pending.\n\nRead [METHOD.md](METHOD.md), define each predicate, and annotate every selected case in annotations/. Then run the reporting command described there. [Relation ranking](relation_ranking.json) lists every cluster and its paths.\n`);
  console.log(jsonText({metadata: bundle.metadata, top20: bundle.relations.filter(r => r.selected).map(({paths, ...r}) => r)}));
}

if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) {
  try { prepare(parseArgs(process.argv.slice(2))); }
  catch (error) { console.error(error.message); process.exitCode = 1; }
}
