# β=0.1: separate evaluation

[Main index](../README.md) · [Bug catalog](../BUG_CATALOG.md) · [All complete NYT results](../evaluations/campaigns/evaluation-complete-top20-all-models.md)

This evaluation retains **6 full-NYT runs** with **5,300 run-specific top-20 fact assessments**, plus separate documented-only conditions and validation fixtures. Four evaluations with confirmed active defects were retired; their [raw-run identities](../pre-fix/EVALUATION.md) remain. Beta is a model choice, not a sampling defect.

## Complete comparable top-20 census

Every NYT row below reuses the harmonized complete top-20 census: all expressed facts in the twenty most frequent relations, ranked by assigned input rows. S/E/A = supported / unsupported under the declared predicate / ambiguous. Precision bounds are S/N to (S+A)/N, not confidence intervals. Each run has its own fact population. Counts across runs describe assessment workload and are not pooled precision. Retained run annotations, predicates and per-run denominators are unchanged.

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [verbatim_beta01_bridge_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) | 0.1 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 727 | 463 / 210 / 54 | 5034/8516 (59.11%) | 63.69%–71.11% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2/assessment.md) |
| [verbatim_beta01_bridge_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) | 0.1 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 742 | 454 / 229 / 59 | 4894/8516 (57.47%) | 61.19%–69.14% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_ad8866964cf6/assessment.md) |
| [verbatim_beta01_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260912.md) | 0.1 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 735 | 486 / 185 / 64 | 5368/8516 (63.03%) | 66.12%–74.83% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_c2349c1e0c57/assessment.md) |
| [verbatim_beta01_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260913.md) | 0.1 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 715 | 473 / 190 / 52 | 5096/8516 (59.84%) | 66.15%–73.43% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9f5868d8ee0e/assessment.md) |
| [entityfix_latent_beta01_seed20260912](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) | 0.1 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | 1184 | 553 / 537 / 94 | 5299/8516 (62.22%) | 46.71%–54.65% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_8c6806186e00/assessment.md) |
| [entityfix_latent_beta01_seed20260913](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) | 0.1 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | 1197 | 489 / 628 / 80 | 5303/8516 (62.27%) | 40.85%–47.54% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_d0f63db2a21a/assessment.md) |

The retained beta=0.1 evaluation set contains four fixed-name runs with the entity defect dormant and two corrected latent runs.

## Earlier sampled screen (historical, different estimator)

Only five facts per relation were graded (100 per run), using relation-population-weighted estimates. These figures are preserved separately from the complete census above. Later label/scope changes and completion of the population both affect the difference.

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta01_seed20260912 | [audit_384a3e2233](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/assessment.md) | 46 / 48 / 6 | 46.13%–52.08% |
| entityfix_latent_beta01_seed20260913 | [audit_c0010fff1d](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/assessment.md) | 41 / 52 / 7 | 37.28%–43.74% |
| verbatim_beta01_bridge_seed20260912 | [audit_4c50ddb65b](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/assessment.md) | 67 / 29 / 4 | 60.99%–67.81% |
| verbatim_beta01_bridge_seed20260913 | [audit_08e2dd6fc7](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/assessment.md) | 62 / 27 / 11 | 64.45%–75.18% |
| verbatim_beta01_seed20260912 | [audit_dba5006d06](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/assessment.md) | 72 / 24 / 4 | 74.45%–78.86% |
| verbatim_beta01_seed20260913 | [audit_fb501b5da8](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/README.md) | [assessment](../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/assessment.md) | 67 / 27 / 6 | 66.74%–72.42% |

## Documented-only beta=0.1 conditions

These conditions are described in earlier implementation notes; raw run outputs and exact producing source snapshots are missing. They are separate from similarly named original archive fixtures. No precision value can be reconstructed here. Their pre-correction stage is documented, but the precise active bug subset is not established.

| Documented condition | β | Recorded outcome / limitation | Precision |
|---|---:|---|---|
| [250-row NYT, fact moves only](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) | 0.1 | 24–28 expressed relations; best reported log probability −4489 | unavailable |
| [250-row NYT, relation split/merge](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) | 0.1 | See saved development-note summary; no preserved semantic census | unavailable |

## Exclusions and uncertainties

Figure 1 uses β=0.5; entropy 0.1 is not β=0.1. The archived Bernoulli-mixture folders use alpha=0.1 and beta=0.001/0.01. Archived NYT outputs do not have a securely bound β value. The documented 2,500-row scaling run also has unknown β; it is not included in this confirmed beta=0.1 set. Analytic sensitivity calculations and copied configs are not additional inference runs.

## Related beta=0.1 analyses

[Optional bridge and matched controls](../analysis/analysis-nyt-sentence-relation-bridge.md) · [Model-choice calculations](../analysis/analysis-nyt-model-choice-numerical-study.md). These analyze existing runs or hypothetical settings; they add no runs to the count.

## Saved toy replay processes

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [controlled-1789236603939/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0/config.json) |
| [controlled-1789236603939/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1/config.json) |
| [controlled-1789236603939/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0/config.json) |
| [controlled-1789236603939/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1/config.json) |
| [controlled-1789236660906/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0/config.json) |
| [controlled-1789236660906/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1/config.json) |
| [controlled-1789236660906/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0/config.json) |
| [controlled-1789236660906/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1/config.json) |
| [entityfix-1789237190192/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0) | 0.1 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0/config.json) |
| [entityfix-1789237190192/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1) | 0.1 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1/config.json) |
| [entityfix-1789237190192/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0) | 0.1 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0/config.json) |
| [entityfix-1789237190192/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1) | 0.1 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1/config.json) |
