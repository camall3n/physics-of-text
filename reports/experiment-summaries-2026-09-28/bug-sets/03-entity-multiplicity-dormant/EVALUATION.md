# B03 — Fixed names; entity multiplicity defect dormant — evaluation

[Main index](../../README.md) · [Bug catalog](../../BUG_CATALOG.md) · [All complete NYT results](../../evaluations/campaigns/evaluation-complete-top20-all-models.md)

[Bug descriptions, implications and fixes](BUGS.md)

## Complete NYT top-20 results

Every NYT row below reuses the harmonized complete top-20 census: all expressed facts in the twenty most frequent relations, ranked by assigned input rows. S/E/A = supported / unsupported under the declared predicate / ambiguous. Precision bounds are S/N to (S+A)/N, not confidence intervals. Each run has its own fact population. Counts across runs describe assessment workload and are not pooled precision. No annotation, predicate, denominator or inferred world has been changed.

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [verbatim_beta01_bridge_seed20260912](reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) | 0.1 | [03](BUGS.md) | 727 | 463 / 210 / 54 | 5034/8516 (59.11%) | 63.69%–71.11% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2/assessment.md) |
| [verbatim_beta01_bridge_seed20260913](reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) | 0.1 | [03](BUGS.md) | 742 | 454 / 229 / 59 | 4894/8516 (57.47%) | 61.19%–69.14% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_ad8866964cf6/assessment.md) |
| [verbatim_beta01_seed20260912](reports/controlled-nyt-verbatim_beta01_seed20260912.md) | 0.1 | [03](BUGS.md) | 735 | 486 / 185 / 64 | 5368/8516 (63.03%) | 66.12%–74.83% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_c2349c1e0c57/assessment.md) |
| [verbatim_beta01_seed20260913](reports/controlled-nyt-verbatim_beta01_seed20260913.md) | 0.1 | [03](BUGS.md) | 715 | 473 / 190 / 52 | 5096/8516 (59.84%) | 66.15%–73.43% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9f5868d8ee0e/assessment.md) |
| [verbatim_beta0001_seed20260912](reports/controlled-nyt-verbatim_beta0001_seed20260912.md) | 0.001 | [03](BUGS.md) | 384 | 344 / 17 / 23 | 1824/8516 (21.42%) | 89.58%–95.57% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af/assessment.md) |
| [verbatim_beta0001_seed20260913](reports/controlled-nyt-verbatim_beta0001_seed20260913.md) | 0.001 | [03](BUGS.md) | 364 | 311 / 26 / 27 | 1583/8516 (18.59%) | 85.44%–92.86% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9c88162c7b22/assessment.md) |

## Earlier sampled screen (historical, different estimator)

Only five facts per relation were graded (100 per run), using relation-population-weighted estimates. These figures are preserved separately from the complete census above. Later label/scope changes and completion of the population both affect the difference.

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| verbatim_beta0001_seed20260912 | [audit_5e74dee865](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_5e74dee865/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_5e74dee865/assessment.md) | 90 / 4 / 6 | 91.88%–95.99% |
| verbatim_beta0001_seed20260913 | [audit_6260319b65](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_6260319b65/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_6260319b65/assessment.md) | 84 / 7 / 9 | 85.82%–93.85% |
| verbatim_beta01_bridge_seed20260912 | [audit_4c50ddb65b](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/assessment.md) | 67 / 29 / 4 | 60.99%–67.81% |
| verbatim_beta01_bridge_seed20260913 | [audit_08e2dd6fc7](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/assessment.md) | 62 / 27 / 11 | 64.45%–75.18% |
| verbatim_beta01_seed20260912 | [audit_dba5006d06](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/assessment.md) | 72 / 24 / 4 | 74.45%–78.86% |
| verbatim_beta01_seed20260913 | [audit_fb501b5da8](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/assessment.md) | 67 / 27 / 6 | 66.74%–72.42% |

## Saved toy validation evidence

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [controlled-1789236603939/frozen-0](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0) | 0.1 | 20260912 | [03](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0/config.json) |
| [controlled-1789236603939/frozen-1](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1) | 0.1 | 20260912 | [03](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1/config.json) |
| [controlled-1789236660906/frozen-0](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0) | 0.1 | 20260912 | [03](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0/config.json) |
| [controlled-1789236660906/frozen-1](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1) | 0.1 | 20260912 | [03](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1/config.json) |

## Canonical experiment summaries

- [NYT inference: fixed literal names, beta=0.001, seed 20260912](reports/controlled-nyt-verbatim_beta0001_seed20260912.md)
- [NYT inference: fixed literal names, beta=0.001, seed 20260913](reports/controlled-nyt-verbatim_beta0001_seed20260913.md)
- [NYT inference: fixed literal names, beta=0.1, seed 20260912, optional bridge](reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md)
- [NYT inference: fixed literal names, beta=0.1, seed 20260913, optional bridge](reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md)
- [NYT inference: fixed literal names, beta=0.1, seed 20260912](reports/controlled-nyt-verbatim_beta01_seed20260912.md)
- [NYT inference: fixed literal names, beta=0.1, seed 20260913](reports/controlled-nyt-verbatim_beta01_seed20260913.md)

Recorded results are retained for inspection; no deletion decision or claim of universal sampler correctness is implied.
