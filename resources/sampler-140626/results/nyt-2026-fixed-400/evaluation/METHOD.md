# NYT relation audit protocol

This is a provisional corpus-evidence audit prepared for human review. It does not independently verify historical propositions and is not the paper's original annotation set.

## Population and unit

The complete MAP TSV contains 8516 sentence rows, 252 expressed relations, and 1918 expressed latent facts. Rank relations by sentence count and review **every expressed latent fact in the largest 20 relations**: 1066 facts represented by 5171 rows. No additional relation is included in the aggregate. Cases outside the top 20 remain available for inspection and are marked not audited.

The unit is a distinct `(relation, entity1 ID, entity2 ID)` tuple. Keep surface-name pairs, latent facts, and sentence occurrences separate. Do not deduplicate different latent facts because their names match. Unexpressed facts are absent from the TSV and outside this audit. Case IDs retain the existing `rel_ID__ent_ID__ent_ID` format. The source checksum and all row references are recorded in cases.json.

## Relation meanings

Define a specific directional predicate from the dominant dependency patterns **before scoring its cases**. State inclusion and exclusion boundaries. Do not redefine a cluster as a vague topic to make unrelated facts pass. Record competing interpretations explicitly. Synonymous paths may support one predicate; shared topics or arguments alone do not establish synonymy. Changing a definition requires re-evaluating all that relation's facts, not merely changing its label.

## Fact judgments

- **supported**: at least one supplied triple clearly supports the chosen directional predicate for the displayed entities. Cite the supporting source line. This is textual support, not independent historical verification.
- **incorrect**: the available evidence clearly expresses a different predicate, reverses direction, or has incompatible entity roles, with no clear support for the predicate. This need not mean the original newspaper sentence was false.
- **ambiguous**: predicate, attachment, identity, negation/modality/time, or proper-name interpretation cannot be resolved confidently from the supplied triples. Include a concrete question for human review.

A supported fact may have unrelated assigned sentences; tag **mixed_evidence** separately. Fact validity is not sentence-assignment purity. Materially incompatible local names sharing an entity ID normally require an **entity_identity** ambiguity unless the inconsistency is clear. Do not infer present-day truth from historical facts.

Read every case and its complete path/name evidence. Automated extraction and arithmetic are permitted; keyword matching alone is not a semantic review. The TSV contains dependency triples, not full articles. Do not invent historical citations or claim to have read unavailable sentences.

## Annotation format

Each annotations/rel_ID.json contains `relation`, `label`, `definition`, `scope_notes`, and `facts`. Each fact has `case_id`, `judgment`, `reason`, `evidence_lines`, `issue_tags`, and `reviewer_question` (blank when none is needed). Allowed judgments are exactly supported, incorrect, ambiguous. Every cited line must belong to that case; every ambiguity needs a concrete question. Suggested tags: direction, other_predicate, entity_identity, attachment, modality_time, broad_predicate, mixed_evidence, insufficient_evidence.

Human decisions are separate in human_review.json. A blank decision retains the assistant judgment. A nonblank decision must include notes, reviewer, and reviewed_at (ISO date or timestamp). A human ambiguity also needs a question; an existing assistant ambiguity's question may be retained. Optional human evidence_lines must belong to the same case. Original assistant judgments remain visible. Generators preserve annotation files and review entries; regenerated Markdown is not an editable decision store.

## Results

For each audited relation and the top-20 aggregate report S supported, E incorrect, A ambiguous, and N=S+E+A. **S/N–(S+A)/N** is the operational ambiguity range, not a confidence interval or a bound on historical truth. Also report S/(S+E) decided-only precision and (S+E)/N decided coverage. Each fact has equal aggregate weight. Report human override counts separately. Sentence counts and path coverage are not semantic precision or recall; no gold-standard recall denominator exists.

The paper reports roughly 95% manual fact precision for its 20 most common relations, but does not supply the complete judgments or sufficient annotation detail to establish an identical rubric. Comparing saved evaluations is descriptive and unpaired: cluster IDs, entity IDs, selected populations, and predicate choices can change. Matching numeric IDs does not establish matching meanings. Differences cannot isolate a code fix's causal effect.

## Provenance and rebuilding

Source SHA-256: `b9874a5166461518514bd1b1b6b1e6bc6f30b61e8bd0b50f2d34233620917a54`. The reporter reconstructs the complete case population from the TSV, checks exact extraction equality, requires complete top-20 annotation coverage, and validates evidence lines and human overrides before writing reports. Re-extraction refuses to replace a changed source when annotations or human review already exist; use a fresh result directory and re-audit.

From the sampler directory:

```sh
node scripts/audit_nyt_rerun.mjs results/RUN_DIRECTORY
node scripts/report_nyt_rerun.mjs results/RUN_DIRECTORY
```

Both commands default to requiring all 8,516 NYT rows. `--expected-rows N` supports explicitly different corpora and small validation fixtures. The reporter accepts repeated `--prior PATH_TO_EVALUATIONS_JSON` arguments; otherwise it compares the original saved NYT evaluation when available.
