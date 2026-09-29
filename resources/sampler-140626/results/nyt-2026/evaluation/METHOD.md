# NYT relation audit protocol

This is a provisional, corpus-evidence audit of the saved replication, prepared for human review. It does not independently verify every historical proposition. It is not the paper's original annotation set.

## Population and unit

Rank the MAP world's relations by sentence count. Review **every expressed latent fact** in the top 20: a distinct `(relation, entity1 ID, entity2 ID)` tuple. The population contains 1,083 facts represented by 4,820 sentence rows. Review the additional 27 facts in `rel_80` separately because it overlaps the main subsidiary cluster, `rel_325` (52 facts). These extras do not enter the top-20 aggregate.

Keep surface name pairs, latent facts, and sentence occurrences separate. Do not deduplicate different latent facts because their names happen to match. Unexpressed facts are absent from the TSV and outside this audit. The source checksum and all row references are recorded in `cases.json`.

## Relation meanings

Define a directional predicate for each relation from its dominant dependency patterns before scoring its cases. State what counts as that predicate and which nearby predicates do not. Do not redefine a cluster as a vague topic to make unrelated facts pass. If several plausible meanings compete, record that ambiguity explicitly. Synonymous paths may support the same predicate; a mere shared topic or argument pair does not establish synonymy.

The subsidiary audit uses: **X is a subsidiary, division, or organizational unit of Y**. It includes organizational containment, not just legally incorporated subsidiaries. Geographic containment, employment, meetings, and reverse ownership do not qualify. Borderline affiliates, brands, agencies, and incomplete entity names require review when the triples do not settle the interpretation.

## Fact judgments

- **supported**: at least one supplied dependency triple clearly supports the chosen directional predicate for the displayed entities. State the supporting path or source line. This is textual support, not independent real-world verification.
- **incorrect**: the available evidence clearly expresses a different predicate, reverses the direction, or has incompatible entity roles, with no clear support for the chosen predicate. This describes a mismatch with the audit definition, not necessarily a false sentence in the original newspaper.
- **ambiguous**: the predicate, dependency attachment, entity identity, negation/modality/time, or proper-name interpretation cannot be resolved confidently from the supplied triples. Include a concrete question for the human reviewer.

A fact may be supported even when some of its assigned sentences express other relations. Flag mixed evidence separately; do not confuse fact validity with sentence-assignment purity. Inferred entity IDs may have multiple surface names. Treat materially incompatible local names as an entity-identity issue, using ambiguous unless the inconsistency is clear. Do not infer current-world truth from historical corpus facts.

Read each case and its full path/name evidence. Automated extraction and arithmetic are permitted, but keyword matching alone is not an independent semantic review. Do not create historical citations or claim to have read missing original sentences. The corpus contains dependency triples, not the full source articles.

## Results and unresolved cases

For each relation and for the top-20 aggregate, report counts S (supported), E (incorrect), A (ambiguous), and N=S+E+A. Report **S/N** and **(S+A)/N** as an ambiguity range for this operational audit. These are not statistical confidence intervals or bounds on independently verified historical precision. Also report S/(S+E) for decided cases and (S+E)/N review coverage; a high decided-only rate can hide many unresolved cases.

The aggregate weights each fact equally. A separate mean of per-relation rates may be reported with its different weighting stated. Do not turn sentence counts or selected dependency-pattern coverage into semantic precision or recall. No gold-standard recall denominator is available.

## Annotation format

Each file in `annotations/` contains one relation: `relation`, `label`, `definition`, `scope_notes`, and `facts`. Every fact record has `case_id`, `judgment`, `reason`, `evidence_lines`, `issue_tags`, and `reviewer_question` (blank when no clarification is needed). Allowed judgments are exactly supported, incorrect, ambiguous. Preserve case IDs and cite lines belonging to that case. All ambiguous cases need a question. Use issue tags such as direction, other_predicate, entity_identity, attachment, modality_time, broad_predicate, mixed_evidence, or insufficient_evidence where applicable.

Human decisions are stored separately in `human_review.json` so original assistant judgments and evidence remain available. Blank decisions are unresolved. Updated summaries must state which decisions are human overrides.

## Original paper and archive

The paper reports about 95% manual fact precision for the 20 most common relations, but gives neither the full judgment set nor enough annotation detail to establish an identical rubric. The current audit therefore tests a stated operational criterion and exposes ambiguous cases for review.

Archived files are historical comparison sources, not gold labels for the replication. Establish each file's input corpus, relation count, completeness, and annotation convention before comparing it. The user-attached `results/output.txt` names a different input subset. Report overlaps and differences without treating them as accuracy against ground truth.
