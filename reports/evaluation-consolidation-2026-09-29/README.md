# Evaluation consolidation — 2026-09-29

Authorized scope: consolidate NYT evaluation mechanics, separate campaign calling configuration from evaluators, retain distinct Figure 1 semantics, document selections and prove result equivalence.

Start with [maintained evaluation code and commands](../../code/evaluation/README.md). Existing experiment folders remain the authoritative evidence/judgment/result locations.

## Work record

1. Captured original implementation/documentation sources, hashes of 14,592 existing files, baseline tests and freshly recomputed census objects before source changes. Later source-only scope additions were hash-verified before editing, extending the final baseline to 14,593 paths and 112 archived source/documentation files.
2. Moved the common parser, predicate loader, judgment validator, census scoring loop and report generation into `code/evaluation/nyt/`. Existing callers bind their explicit study roots and frozen-record protocol.
3. Added named campaign presets and a separate central CLI. Read-only checks compare fresh complete assessments with saved objects. Scratch rendering keeps original report bytes and copies navigation companions.
4. Consolidated historical sampled reviews in an explicitly separate mode. Their sample selection, original schema, weighted estimator and uncertainty calculations remain unchanged.
5. Consolidated Figure 1 plotting/transformations under `code/evaluation/figure1/`, separately from NYT.
6. Replaced two semantic checkers with one validated diagnostic reporting both primary and effective labels, explicit reference populations and full predicate versions. New v2 output does not overwrite old diagnostics.
7. Relocated active preparation, review and artifact-verification helpers; old paths remain compatibility callers. One-time historical amendments remain documented provenance.

## What is preserved

No inference reruns, new grading decisions, predicate changes, fact-population changes or scientific report rewrites. Fixed/latent models receive the same complete-census rule. Known buggy runs remain retired from evaluations. Original frozen manifests and the previously proposed legacy-integrity patch remain untouched.

The only intentional output behavior change is the **new semantic diagnostic schema/validation** and new central CLI navigation/provenance. Existing scientific assessment objects, Markdown reports, threshold views, synthetic curves and plots are checked against the originals.

Source changes covered by the existing maintenance manifests receive exact old-to-new hash accounting only; no broad exemptions or data-deletion exceptions are introduced. The earlier unapproved legacy-integrity patch is not applied.

## Validation evidence

[Validation scope and commands](VALIDATION.md) describe the checks. Structured records are saved here:

- `before_tests.json`: 95 original JavaScript + 12 original Python tests.
- `before_censuses.json`, `after_censuses.json`: full-object assessment equality for ten full-NYT top-20 runs, the archive-250 supplement, four coverage runs and all 20 coverage views.
- `after_sampled.json`: both historical sampled campaigns, 1,000 saved reviewed facts.
- `after_figure1.json`: identical numeric artifacts and four saved PNGs.
- `after_preservation.json`: byte-level preservation with source/documentation changes listed separately.
- `before_sources.tar.gz`: original source recovery snapshot; it is not another maintained implementation.

The top-20 and coverage populations overlap. Their fact counts must not be added as independent observations.

## Navigation and selection changes

See [registered presets](../../code/evaluation/README.md#run-and-browse), [selection definitions](../../code/evaluation/README.md#selection-is-separate-from-scoring), [historical sampled mode](../../code/evaluation/nyt/SAMPLED.md), [consistency diagnostic](../../code/evaluation/nyt/CONSISTENCY.md) and [Figure 1](../../code/evaluation/figure1/README.md).

## Completed verification

- **129/129 JavaScript tests and 12/12 Figure 1 tests passed** (141 total; 95 JavaScript tests pre-existed, 34 are new).
- All **25 saved NYT audit assessments** reproduce exactly: 15 censuses and 10 historical samples. All 20 coverage views retain their exact fact populations, evidence, judgments, counts and precision.
- CLI scratch rendering compared **1,449 assessment/report/view files byte-for-byte** and checked generated browse links. Further checks cover sampled navigation, review helpers, archive inventory, dictionaries and diagnostics.
- Figure 1 numerical artifacts and all four saved PNGs match. Existing saved scientific files were not rewritten.
- **14,480 protected files remain byte-identical**. The two current maintenance-aware preservation checks pass. [Exact maintenance accounting](maintenance_transitions.json) contains 36 source/documentation transitions, no new data or deletion exceptions.
- Both judgment layers still show **zero semantic disagreements**: 6,905 top-20 cases; 8,488 coverage cases plus 5,300 nonduplicate reference cases.
- New regressions cover context isolation, override validation, complete predicate versions/rubrics, current/reference deduplication, explicit current-only results, malformed population manifests, output isolation and preserved manual-recording behavior.

See [final test record](after_tests.json), [CLI/render verification](after_integration_tests.json), [data preservation](after_preservation.json) and [final source inventory](after_source_manifest.json). The source inventory records the exact new maintained implementation and compatible callers used for these checks; historical manifests remain unchanged.

The two old, unmodified study integrity scripts still flag earlier cleanup changes. Their previously proposed patch remains unapplied; this is a pre-existing limitation, separate from the passing current preservation and refactor checks. No unresolved new evaluation-test failures remain.
