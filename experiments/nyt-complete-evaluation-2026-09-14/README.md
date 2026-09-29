# Complete NYT precision evaluation

**Evaluation code — 2026-09-29:** maintained algorithms now live in [code/evaluation](../../code/evaluation/README.md); this campaign's scripts are compatible callers. Use preset `nyt-top20` for read-only checks or a separate rendered review folder. [Selection rules and commands](../../code/evaluation/README.md#selection-is-separate-from-scoring) · [Equivalence evidence](../../reports/evaluation-consolidation-2026-09-29/README.md). Saved judgments and results are unchanged.

The five-facts-per-relation assessment was an assistant-chosen screening shortcut. It was not required by the paper. This folder retains complete coverage for **10 full-NYT runs: 6,905 facts across 200 run-specific top-20 relations**, with a shared rubric and explicit predicate definitions. Four active-defect evaluations and the original subsidiary supplement were retired; raw experiment outputs, bug documentation and regression tests remain. [Cleanup record](../../reports/buggy-evaluation-cleanup-2026-09-28/README.md). No inference was rerun and no model parameter changed.

**Start with [the comparison table](comparison.md).** Each run links to its assessment; each relation in that assessment links to a report containing **every fact, its S/E/A judgment, the reason, all supplied evidence, and a question for each ambiguity**. The reports are assistant assessments for your inspection, not independent human gold labels.

The specific September 14 assessment you asked about, previously `manual_review/audit_af30702564`, corresponds to **[this complete 436-fact assessment](census/audit_e318fe663470/assessment.md)**. Its other seed has **[421 facts](census/audit_dcb746fa83d6/assessment.md)**. Neither is limited to five facts per relation.

The run names retain their historical spelling: `beta0001` means numeric **β = 0.001**, not 0.0001. Seeds `20260912` and `20260913` identify the two random runs. `verbatim` denotes fixed name identities; `entityfix_latent` keeps entity inference enabled with its additional sampling correction. Original parameter/fix details remain in the [September 12 investigation](../nyt-precision-investigation-2026-09-12/README.md) and [September 14 follow-up](../nyt-latent-low-smoothing-2026-09-14/README.md).

## What is equivalent

- Every run uses its saved MAP world on the same 8,516 input dependency triples.
- Relations are ranked by assigned row count; the top 20 are selected, with numeric relation ID breaking ties.
- **Every expressed ordered latent fact in those relations is evaluated.** Repeated rows for one `(relation, entity1, entity2)` count as one fact. Different latent facts with the same displayed names remain separate.
- Every fact is checked against its declared directional predicate using all its local names and paths. Common predicate families use the same frozen definition across runs. The original full censuses were also re-read under these conventions.
- The primary fractions are exact `S/N` and `(S+A)/N`, with `N=S+E+A`. The endpoints express unresolved judgments; they are not confidence intervals. There are no sampled-fact weights or sampling estimates in the new primary table.

This is a **full top-20 census**, matching the earlier evaluation scope. It does not grade every relation outside the top 20, or unexpressed model facts absent from the saved sentence partition. Different runs infer different partitions and predicates, so their selected populations still differ. Row coverage is reported because changing that coverage can change apparent precision; it is not recall.

**S** means the supplied text supports the declared fact. **E** means unsupported under that predicate (stored as `incorrect`), not necessarily historically false. **A** means the evidence leaves a material identity, attachment, or interpretation unresolved. One supporting row can suffice even when other rows express something else; this is fact support, not purity of sentence clusters. See [METHOD.md](METHOD.md) for the complete rules and limits.

## Files for inspection

| File | Purpose |
|---|---|
| [comparison.md](comparison.md) | All 10 retained complete runs, exact counts, precision endpoints, coverage, and links to every assessment |
| [prior_comparison.md](prior_comparison.md) | Separates changed judgments on the same old cases from the effect of evaluating all previously omitted cases |
| [judgment_changes.md](judgment_changes.md) | Changed prior labels for retained runs, with old/new reasons, declarations, and evidence links |
| [census_manifest.json](census_manifest.json) | Run names, original result paths, source hashes, and mapping to new audit folders |
| [corpus equivalence](analysis/corpus_equivalence.json) | Independent confirmation that retained MAP exports contain the same 8,516 input triples in the same order |
| [predicate catalogue](analysis/predicate_catalogue.md) | Shared mathematical/semantic scope of each predicate and adjudicated scope differences |
| [relation assignments](analysis/relation_assignments.json) | Frozen run-specific relation-to-predicate mapping |
| [why the five-case screens were insufficient](analysis/why_the_previous_samples_were_not_equivalent.md) | Explanation of the earlier protocol change |
| [archive scope](analysis/archive_scope.md) | Which earlier archives contain complete evidence and which do not |
| [preservation verification](analysis/preservation_verification.json) | SHA-256 verification against protected files and recorded authorized maintenance |
| [report verification](analysis/report_artifact_verification.json) | Checks every printed fact, judgment, and evidence row against the complete structured population |
| [archive review QC](analysis/archive250_qc.md) | A second assistant's complete read of the 223-fact supplemental archive and remaining scope caveats |

Within each `census/audit_…/` folder, open `assessment.md`, then the links to `reports/rel_….md`. Those reports put judgments directly alongside facts. `annotations/rel_….json` is the primary decision record; `assessment.json` is the full structured result. `cases.json` and `raw_map.tsv` preserve every case and source row. The `relations/` files are the original evidence worksheets; **use `reports/` for the evaluated version**.

Retained evaluations keep their earlier decisions and frozen protocols. Their exact snapshots are also preserved as `prior_annotations/`, `prior_cases.json`, and related provenance files. Differences from the old sample or census should be inspected as both a coverage change and a possible judgment/scope change; the old figures have not been silently overwritten.

## Additional archived material

[The separate 250-row archive assessment](supplemental/audit_archive250/assessment.md) covers all **223 facts in all 15 relations**. Its dictionaries were inspected before grading and evaluated under the shared broad `managerial_office_in` predicate. It is a different corpus and does not establish that 15 distinct, precise title-specific relations were learned. Its counts are **140 S, 54 E, 29 A**, giving **62.78%–75.78%** under that broad-role interpretation. It is excluded from the main full-NYT table.

The original extra subsidiary evaluation was retired with its defective parent run. The separate archive-250 census remains, with [source verification](supplemental/source_verification.json).

Some older printed outputs omit facts or their evidence. A complete equivalent evaluation cannot be recovered from those files. The [archive appendix](analysis/archive_scope.md) records the exact missing material; it does not invent labels or treat a printed subset as a census.

## Correct a judgment and rebuild

Edit the relevant audit's `human_review.json`. Each override must contain `case_id`, `judgment` (`supported`, `incorrect`, or `ambiguous`), `reason`, `evidence_lines` from that case's local `raw_map.tsv`, `issue_tags`, `reviewer`, and `reviewer_question` (required and nonempty for A). Leave `overrides` empty to retain the primary assessment. Overrides preserve the original assistant decision.

Run from this folder:

```sh
node scripts/report_censuses.mjs
node --test tests/*.test.mjs
node scripts/check_semantic_consistency.mjs
node scripts/verify_preservation.mjs
node scripts/verify_supplemental_sources.mjs
node scripts/verify_report_artifacts.mjs
```

The reporter validates all 10 retained populations before producing the comparison and per-fact reports. It rejects missing or duplicate cases, foreign citations, changed sources, unconfirmed provisional judgments, and changes to frozen predicate assignments. `check_semantic_consistency.mjs` flags differing primary labels for identical complete local evidence under the same predicate; it never changes judgments automatically. Different entity partitions can give the same names different evidence, so a name-pair match alone is insufficient.

For one audit, pass its folder to the reporter, for example:

```sh
node scripts/report_censuses.mjs census/audit_e318fe663470
node scripts/report_censuses.mjs supplemental/audit_archive250
```

`node scripts/prepare_censuses.mjs` reconstructs retained manifest evidence copies without overwriting existing annotations or human overrides. The retained supplemental preparation script is `prepare_archive250.mjs`. No Python environment or sampler build is needed for this evaluation environment.
