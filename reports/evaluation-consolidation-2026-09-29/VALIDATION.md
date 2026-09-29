# Evaluation equivalence validation

This refactor starts from the saved evaluations as they existed on 2026-09-29. No sampler runs or grading decisions are recreated. The data baseline contains hashes, not a second copy of annotation JSON or evaluation datasets.

## Before implementation changes

- `before_sources.tar.gz`: 112 original implementation, campaign documentation and protocol files, at their repository-relative paths. This is recovery evidence, not another maintained implementation. The experiment-summary navigation README was added before its link edit. Five analysis-directory helpers were added to the source archive after verifying their bytes still matched the original baseline hashes. Historical source includes existing one-time amendment scripts with their embedded decisions; no annotation JSON or evaluation data files were copied into the archive.
- `before_manifest.json`: SHA-256/size (or symlink target) inventory for 14,593 existing files across the four NYT evaluation campaigns, corrected Figure 1 result families, and evaluator sources. Frozen integrity controls and the existing maintenance ledger are included.
- `before_tests.json` and the referenced logs: 95 existing JavaScript tests and 12 Figure 1 Python tests passed before any source edits.
- `before_censuses.json`: all 15 original census evaluations were recalculated and compared with the complete saved assessment objects. This covers 6,905 facts in ten main top-20 runs, 223 facts in the historical archive-250 supplement, and 8,488 facts in four coverage runs. All 20 saved coverage views were also checked against the exact selected facts, strata, thresholds and counts.

The counts are evaluation populations, not distinct facts across all experiments. In particular, coverage evaluations include previously reviewed top-20 facts; their populations must not be added as independent observations.

## Reproducible checks

From the repository root:

```sh
node reports/evaluation-consolidation-2026-09-29/verify_baseline.mjs
node reports/evaluation-consolidation-2026-09-29/verify_saved_censuses.mjs
```

Both commands are thin compatibility callers. The maintained implementations are in code/evaluation/tests/migration/, with the report-data directory specified explicitly. Both default to read-only operation. The first checks all recorded files and lists permitted implementation/documentation changes separately. It requires saved evidence, annotations, predicate records, selection data, scores, reports and plots to remain byte-identical. Frozen sampled protocols, historical manifests, the shared preservation helper and the two still-unapproved legacy integrity scripts must also remain byte-identical. The hash-only maintenance ledger has an independently verified pre-refactor snapshot, before_maintenance_changes.json. Its only permitted extension is exact non-deletion source/documentation transitions: every original entry, previous hash and reason is retained; each new accepted hash must match an authorized refactored source/documentation file. No data exceptions or new deletion exceptions are permitted.

The second freshly invokes the campaign evaluator entry points and compares **entire** assessment objects with saved results, including metadata, ordered fact identities, full evidence, judgment provenance, denominators and exact numeric outputs. It does not merely compare rounded precision percentages.

An optional summary can be written beside these scripts:

```sh
node reports/evaluation-consolidation-2026-09-29/verify_baseline.mjs --output after_preservation.json
node reports/evaluation-consolidation-2026-09-29/verify_saved_censuses.mjs after_censuses.json
```

Post-refactor tests and any scratch-render comparisons are recorded separately. New semantic-consistency diagnostics intentionally gain validation and primary/effective-judgment separation; their new schema is not expected to equal the old diagnostics byte-for-byte. They must not modify the saved grading decisions or precision results.

## Post-refactor integration checks

The eight CLI integration tests in `code/evaluation/tests/equivalence_cli.test.mjs` pass. They call the public invocation layer, not internal evaluator functions:

- `list` exposes all five documented NYT presets.
- `check` recalculates and compares every saved assessment in each preset.
- `render` writes into a new temporary directory for every preset. Across 25 audit views, 1,449 required freshly generated assessment, relation-report and coverage-view artifacts match the original saved bytes exactly. Additional copied browsing companions are also compared where they have an original counterpart.
- Local links in generated indexes, assessments, relation reports, coverage views and copied evidence views resolve. The root render README is intentionally a new navigation index, so it is not compared with the original campaign README.
- Source/experiment output locations, nonempty output directories and symlink redirection into protected experiment directories are rejected. Unknown presets and undocumented selection overrides are rejected without writing an output directory.

Run:

```sh
node --test code/evaluation/tests/equivalence_cli.test.mjs
```

The test logs and compact outcomes are in `after_cli_integration.log` and `after_integration_tests.json`. `after_sampled.json` separately records all ten historical sampled screens with their exact result/Markdown hashes. Figure 1 validation is recorded separately, because its pairwise precision–recall protocol is not a NYT fact-support evaluator.

The final canonical implementation and compatible caller/test hashes are recorded in after_source_manifest.json. Add --final-sources to the baseline verifier to check that exact final source snapshot, including detecting added or removed canonical source files. This is an optional migration checkpoint; ordinary experiment data checks do not require source code to remain permanently frozen.

## Final regression and preservation results

The combined evaluator suite passed 129 JavaScript tests: the original 95 tests plus 34 tests for the consolidated implementation, validated semantic consistency, caller populations, recording helpers and CLI integration. The separate Figure 1 suite passed all 12 tests. Commands, file lists and exit codes are in after_tests.json, with full logs alongside it.

The current complete-census and coverage preservation checks passed in read-only --check mode over 8,055 and 9,721 original manifest entries, respectively. Their existing historical exceptions are retained; this refactor added exactly 36 source/documentation transitions and no data/deletion exceptions. The independent refactor baseline requires 14,480 preserved files to remain byte-identical and reports zero failures. The expanded baseline contains 14,593 paths in total, including sources and navigation documentation. See after_preservation_checks.json and after_preservation.json.
