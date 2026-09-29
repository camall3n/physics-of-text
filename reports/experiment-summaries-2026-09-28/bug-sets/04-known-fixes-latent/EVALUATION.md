# B04 — Latent entities; six known sampling families corrected — evaluation

[Main index](../../README.md) · [Bug catalog](../../BUG_CATALOG.md) · [All complete NYT results](../../evaluations/campaigns/evaluation-complete-top20-all-models.md)

[Bug descriptions, implications and fixes](BUGS.md)

## Complete NYT top-20 results

Every NYT row below reuses the harmonized complete top-20 census: all expressed facts in the twenty most frequent relations, ranked by assigned input rows. S/E/A = supported / unsupported under the declared predicate / ambiguous. Precision bounds are S/N to (S+A)/N, not confidence intervals. Each run has its own fact population. Counts across runs describe assessment workload and are not pooled precision. No annotation, predicate, denominator or inferred world has been changed.

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [entityfix_latent_beta01_seed20260912](reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) | 0.1 | [04](BUGS.md) | 1184 | 553 / 537 / 94 | 5299/8516 (62.22%) | 46.71%–54.65% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_8c6806186e00/assessment.md) |
| [entityfix_latent_beta01_seed20260913](reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) | 0.1 | [04](BUGS.md) | 1197 | 489 / 628 / 80 | 5303/8516 (62.27%) | 40.85%–47.54% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_d0f63db2a21a/assessment.md) |
| [entityfix_latent_beta0001_seed20260912](reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) | 0.001 | [04](BUGS.md) | 421 | 337 / 48 / 36 | 1546/8516 (18.15%) | 80.05%–88.60% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_dcb746fa83d6/assessment.md) |
| [entityfix_latent_beta0001_seed20260913](reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) | 0.001 | [04](BUGS.md) | 436 | 344 / 47 / 45 | 1521/8516 (17.86%) | 78.90%–89.22% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470/assessment.md) |

## Earlier sampled screen (historical, different estimator)

Only five facts per relation were graded (100 per run), using relation-population-weighted estimates. These figures are preserved separately from the complete census above. Later label/scope changes and completion of the population both affect the difference.

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta01_seed20260912 | [audit_384a3e2233](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/assessment.md) | 46 / 48 / 6 | 46.13%–52.08% |
| entityfix_latent_beta01_seed20260913 | [audit_c0010fff1d](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/assessment.md) | 41 / 52 / 7 | 37.28%–43.74% |

## Saved toy validation evidence

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [entityfix-1789237190192/latent-0](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0) | 0.1 | 20260912 | [04](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0/config.json) |
| [entityfix-1789237190192/latent-1](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1) | 0.1 | 20260912 | [04](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1/config.json) |
| [entityfix-1789413029174/latent-0](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0) | 0.001 | 20260912 | [04](BUGS.md) | [config](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0/config.json) |
| [entityfix-1789413029174/latent-1](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1) | 0.001 | 20260912 | [04](BUGS.md) | [config](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1/config.json) |

## Canonical experiment summaries

- [NYT inference: corrected latent entities, beta=0.001, seed 20260912](reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md)
- [NYT inference: corrected latent entities, beta=0.001, seed 20260913](reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md)
- [NYT inference: corrected latent entities, beta=0.1, seed 20260912](reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md)
- [NYT inference: corrected latent entities, beta=0.1, seed 20260913](reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md)

Recorded results are retained for inspection; no deletion decision or claim of universal sampler correctness is implied.

## Earlier low-beta sampled assessment

The [September 14 sampled screen](../../evaluations/campaigns/evaluation-sampled-top20-2026-09-14.md) contains the historical 100-fact assessments for the two corrected latent beta=0.001 runs. Those estimates used the earlier sampled protocol; the complete census above remains the comparable full-population reference.
