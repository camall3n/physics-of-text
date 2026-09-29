# Complete fact evaluation at increasing row coverage

This evaluates four existing corrected β=0.001 NYT outputs at five coverage levels. It does not run new MCMC chains. The evaluated saved worlds, their parameters, and their output hashes are fixed; only the number of highest-frequency relations included in the assessment changes. All new files are confined to this directory.

## What the percentages mean

The request mentions both input rows and percentages of relations. We use **input-row coverage** throughout: 57%, 60%, 70%, 80%, and 90% of the same 8,516 extracted input rows. These percentages are neither the fraction of distinct relation IDs nor recall against gold facts. The 57% point explicitly enforces the requested minimum; the other four are separate nested evaluations.

For each saved world, rank its expressed relations by their number of assigned input rows, largest first. Break frequency ties by increasing numeric relation ID. If the ranked counts are n₁,…,n_R, choose

\[
k(c)=\min\{k:\;\sum_{j=1}^{k}n_j\ge c\cdot8516\}.
\]

Use all of the boundary relation, so actual coverage can exceed the target. No relation is included or excluded on the basis of its precision, interpretation, or ambiguity. Ties are deterministic but their internal order is arbitrary; the ordering is documented in each `coverage.json`. There is no partial boundary cluster and no per-relation fact sample.

For example, the fixed-name seed 20260912 needs k=98 relations to cover 4,868/8,516 rows (57.16%). The corrected latent seed 20260912 needs k=114 to cover 4,860 rows (57.07%). Taking 57% of relation IDs would answer a different question.

The input consists of argument–dependency-path triples, rather than a corpus of fully retained newspaper sentences. Repeated input rows count separately toward row coverage, as they did in inference. The 8,516 rows contain 7,732 distinct literal triples. They are not 8,516 distinct propositions.

## Evaluation unit and complete populations

A case is one **expressed ordered latent fact** (relation ID, first entity ID, second entity ID). All rows assigned to that same triple are its local evidence. Multiple rows do not give the fact multiple votes. A relation containing 100 distinct expressed facts contributes all 100, even if another relation contains only two. Micro precision therefore weights facts equally, not relations or rows.

For a selected prefix, N is its complete count of expressed facts. It is not the number of corpus rows, the number of all possible entity pairs, or a common constant across models. The same literal pair may produce separate facts in different relations or in fragmented latent entities. Those remain separate inferred facts. Facts with no assigned input row are outside this text-evidence assessment, even if the sampled world internally contains them.

The maximum 90% prefixes contain 8,488 run-specific cases across four runs: 2,468 and 2,542 in latent seeds 20260912 and 20260913; 1,732 and 1,746 in fixed-name seeds 20260912 and 20260913. Of these, 1,605 are exact preserved judgments from the previous complete top-20 censuses, and 6,883 are newly reviewed cases. Each smaller prefix is a subset of the same completed review, so a case's judgment cannot change merely because the cutoff changes. These are four distinct populations; 8,488 is a workload count, not a pooled precision denominator or a number of unique real-world facts.

## Fix the relation meaning before grading its cases

The earlier top-20 predicate definitions and complete S/E/A judgments are copied exactly with hashes and provenance. They are not reinterpreted to improve agreement with the expanded evaluation. For every additional relation, a reviewer reads the complete frequency dictionary and the literal argument roles, selects its most defensible coherent meaning, and freezes a declaration before entering case judgments.

The [predicate protocol](analysis/predicate_extension_protocol.md) specifies the selection rule. Prefer the dominant interpretable semantic family, then the highest-frequency clear individual path when families tie. Reuse the same canonical predicate when its actual scope matches. Specific chair, director, executive, founder, owner and general managerial predicates remain distinct. A broader office family is used only when warranted by the dictionary, with its breadth explicit. Interpret the entire dependency path and its direction; a word somewhere inside a long path does not establish a relation between the two extracted arguments.

New atomic meanings are centrally defined in the [append-only extensions](analysis/approved_predicate_extensions.json), alongside the [inherited catalogue](analysis/predicate_catalogue.json). Every relation declaration records its dictionary hash, chosen predicate and hash, rationale, and an unchanged snapshot showing its fact judgments were blank. Exact declarations are linked from the run index.

If the dictionary does not identify a coherent primary predicate without inventing a broad association or a disjunction of unrelated meanings, it is explicitly `unresolved_relation`. Every case then remains A with a specific question. These cases stay in N and are counted separately as relation-semantic indeterminacy. A low-quality dictionary is not automatically unresolved: a defensible specific primary meaning can be retained even when many of its facts fail it. Declaration judgments themselves remain a source of evaluator discretion; freezing them before grades reduces hindsight but does not make semantic interpretation objective.

## Supported, incorrect/unsupported, ambiguous

After fixing the meaning, an assistant reviewer reads every case and every supplied local evidence row. Review batches explicitly list case indices and reasons. The scripts record those judgments, preserve history, check completeness, render reports and calculate totals; they do not assign semantic judgments by keyword matching. These are assistant-authored manual assessments, not independent human annotations. The user can inspect and adjudicate them.

| Code | Stored judgment | Rule |
|---|---|---|
| S | `supported` | At least one local row clearly supports the declared predicate in the correct direction, with coherent argument identity. |
| E | `incorrect` | The retained local rows fail to support the declared predicate: wrong role/direction, another meaning, or a clearly excluded interpretation. This does not assert that the proposition is false in the world. |
| A | `ambiguous` | Relation meaning, argument identity, attachment, missing context, or modality prevents a defensible S/E decision. Every A has a reviewer question. |

Support in one inferred fact is not borrowed from another fact with similar names. Compatible local aliases can be accepted. If incompatible people or places are merged within a potentially supported fact, its identity uncertainty makes it A. Mere global reuse of an entity name is a diagnostic flag, not by itself proof that each local fact is wrong. Shortened names are assessed consistently with the preserved census; unresolved national adjectives and unnamed persons remain flagged.

When a coherent pair has a supporting row plus unrelated rows, the fact can still be S, with `mixed_evidence` recorded. Thus this is **existential fact support**, not the percentage of all sentence assignments that match the relation. A cluster can have supported facts and still contain many poorly assigned paths. `broad_predicate` records meaningful scope breadth or an accepted boundary reading; it does not create additional support.

Historical roles are allowed. Proposed appointments, omitted objects, place/institution metonymy, and indirect titles are handled under each predicate's explicit scope. No external biographies or history are imported to accept or reject a path. The dataset often omits qualifiers, negation, dates and surrounding sentence context, so even an unqualified supporting path is not proof of external truth. Every report exposes the actual supplied evidence for inspection.

## Precision ranges and interpretation

For every run and cutoff, N=S+E+A and the reported interval is

\[
\left[\frac{S}{N},\frac{S+A}{N}\right].
\]

The lower endpoint treats every ambiguous case as unsupported; the upper treats every ambiguous case as supported. These are **ambiguity bounds conditional on this rubric and its judgments**, not sampling confidence intervals, posterior intervals, or uncertainty bounds covering reviewer mistakes. In particular, treating every unresolved-relation case as correct can make the upper endpoint generous. Each cutoff reports how many A cases arise from an entirely unresolved predicate.

Run assessments additionally show decided-only precision S/(S+E), its decided fraction (S+E)/N, and equal-relation macro precision. These supplement, rather than replace, the complete-denominator interval. Marginal block scores assess only the newly added ranks since the previous cutoff; the first 57% block starts after the preserved top 20. A cumulative precision decrease can then be traced to particular added relations.

Two seeds are reported separately. They are different random initializations and sampling trajectories for the same model settings, not train/test splits or repeated annotation samples. No seed is chosen on the basis of observed precision. At a common row coverage the models can select different relations and different inferred fact populations. The resulting differences are descriptive and cannot by themselves establish a statistically reliable model advantage or direct equivalence to the paper's precision claim.

## Browse, correct and reproduce

Start at [comparison.md](comparison.md), select a run and a coverage level, then follow the relation links. Each evaluated relation report contains its definition, full frequency dictionary, every fact, all local rows, S/E/A judgment, reason, citations, issue tags and ambiguous-case question. The `relations/` directory holds preparation evidence; **`reports/` contains evaluated cases**. `assessment.json` is the complete machine-readable 90% review; the five coverage files contain the selected subsets.

For a new case, a human adjudication can be added to that run's `human_review.json` `overrides` array, retaining its source hash. Supply `case_id`, `judgment`, `reason`, `evidence_lines`, `issue_tags`, `reviewer_question`, and `reviewer`. Copy the case ID and valid line numbers from its report. An A judgment needs a nonempty question. Reports retain the primary judgment alongside an override. The historical top-20 judgments are deliberately protected: changing that reference requires a separately documented revision, rather than silently rewriting its reproduced scores. A new relation's declared meaning is also frozen; proposed scope changes need a separate explicit sensitivity analysis.

To regenerate derived reports and verify the evaluation from the repository root:

```sh
node experiments/nyt-beta-0p001-coverage-2026-09-14/scripts/report_censuses.mjs
node --test experiments/nyt-beta-0p001-coverage-2026-09-14/tests/*.test.mjs
node experiments/nyt-beta-0p001-coverage-2026-09-14/scripts/check_semantic_consistency.mjs
node experiments/nyt-beta-0p001-coverage-2026-09-14/scripts/verify_protected_files.mjs
```

The report generator rejects an incomplete maximum-prefix census, a changed source or predicate, missing/duplicate/foreign cases, invalid citations, and changes to preserved top-20 judgments. Coverage tests verify the smallest whole-relation prefix, deterministic ties, nesting, and complete fact populations. The semantic checker flags repeated complete evidence under the same predicate for manual consistency review; it is a diagnostic, not an automatic relabeler. Remaining semantic judgment limitations are documented with the consistency results.

See [model design](models/README.md) for the mathematical targets, active bug repairs, β and α, finite relation pool, entity restrictions, proposal schedule, MAP selection, exact seeds/configurations and source provenance. Those are properties of the saved inference runs. None is changed by selecting a larger evaluation prefix.
