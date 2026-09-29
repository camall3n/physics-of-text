# Figure 1 evaluation cleanup — 2026-09-28

Retired the confirmed pre-fix Figure 1 grades while preserving the underlying experiment output and corrected-run numerical results. Scope was limited to `resources/sampler-140626/results/figure1-2026*` and the Figure 1 Python reporting/test scripts. The Figure 1 portion did not edit sampler code, bug documentation, the summary catalogue, or `HANDOFF.md`. Follow-up changes to the handoff and historical NYT run README are recorded separately in `records/handoff_changes.tsv`.

## Removed and replaced

- `resources/sampler-140626/results/figure1-2026-fixed/comparison.md`
- `resources/sampler-140626/results/figure1-2026-fixed/comparison_at_recall.csv`
- `resources/sampler-140626/results/figure1-2026-fixed/comparison_before_after.pdf`
- `resources/sampler-140626/results/figure1-2026-fixed/comparison_before_after.png`
- `resources/sampler-140626/results/figure1-2026-fixed/comparison_details.json`
- `resources/sampler-140626/results/figure1-2026-self-pairs-included/before-fixes/prec_recall.out`
- `resources/sampler-140626/results/figure1-2026-self-pairs-included/comparison_before_after_with_self_pairs.png`
- `resources/sampler-140626/results/figure1-2026-self-pairs-included/comparison_before_after_with_self_pairs.svg`
- `resources/sampler-140626/results/figure1-2026/pr_polysemy.png`

The fixed-run mixed comparison is replaced by `evaluation.md`, `precision_at_recall.csv`, and `evaluation_details.json`, containing corrected results only. In the self-pair variant, `comparison_details.json` and `comparison_at_recall.csv` now compare distinct-pair versus self-pair evaluation only for the corrected run. `metadata.json` contains its 40 corrected worlds, one corrected input, and refreshed output fingerprints. `pr_self_pairs.{png,svg}` replaces the before/after panels; `self_pair_effect.{png,svg}` now shows only corrected-world curves. README links and explanations reflect the retained scope.

## Preserved evidence and numerical verification

The original pre-fix `prec_recall.out` is the retained raw experiment output; the pre-fix `before-fixes/prec_recall.out` in the self-pair directory was a derived evaluation and was removed. Both original raw PR files, corrected transformed self-pair output, corrected distinct-pair PNG/PDF, corrected crossing-diagnostic PNG/SVG, run log, run metadata, and logging configuration match their pre-cleanup byte counts and SHA-256 hashes exactly.

The corrected subset of each mixed numerical report was projected before modification, then compared with the replacement report using canonical JSON hashes. Both match exactly, including every per-world precision, aggregate statistic, entropy, and checkpoint represented in those reports. No MCMC was run and no corrected result was recomputed with a different metric.

`run_metadata.json` retains its historical plotting command as run provenance. The updated README documents the current corrected-only invocation. The former positional before/after command and the self-pair `--before` option are rejected, so they cannot recreate the retired report through the old interface.

## Scripts and regression tests

`compare_figure1_runs.py` retains its historical name but now accepts `--after` and `--output`, defaulting to the corrected run and directory. It produces corrected-only plots and tables. `figure1_self_pairs.py` also defaults to the corrected run and no longer takes a before input. Both reject the known preserved pre-fix raw input as an evaluation target.

The eight general transformation/count-conservation tests and corrected high-entropy reference test remain; the stored pre-fix grading reference constants were removed. The all-80-world raw-count conservation test remains useful for reconstruction and input-integrity regression coverage and does not write before-fix evaluations. Three additional checks cover corrected-only self-pair output, corrected checkpoint equality against saved results and independently interpolated raw data, and rejection of the retired interfaces/input. All 12 tests passed in 3.616 seconds. Matplotlib emitted existing Pyparsing deprecation warnings; no test failed.

The two replacement plot types were visually checked. Links in the three active Figure 1 reports resolve, output metadata hashes validate, and the retained grading CSV/JSON/SVG files contain no before-fix version or grading fields.

## Audit files

- [Every affected/preserved file and before/after hash](records/figure1_changes.tsv)
- [Pre-cleanup inventory and corrected-only projection hashes](records/figure1_baseline.json)
- [Machine-readable verification results](records/figure1_validation.json)
- [Regression output](../../resources/sampler-140626/results/figure1-2026-self-pairs-included/regression_tests.txt)

Counts: 9 deleted, 11 modified, 5 added, 10 unchanged in the scoped inventory. Audit files themselves are outside that inventory. The audit retains filenames and hashes of retired artifacts, not their grading contents.
