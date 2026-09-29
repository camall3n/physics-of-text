# β=0.001: separate evaluation

[Main index](../README.md) · [Bug catalog](../BUG_CATALOG.md) · [All complete NYT results](../evaluations/campaigns/evaluation-complete-top20-all-models.md)

This group contains **4 saved full-NYT runs** with **1,605 run-specific top-20 fact assessments**, plus 0 documented-only conditions and 4 saved toy replay processes. These are different evidence categories. Beta is a prior/model choice, not a sampling defect; inclusion here is a review filter, not a declaration that a run is invalid.

## Complete comparable top-20 census

Every NYT row below reuses the harmonized complete top-20 census: all expressed facts in the twenty most frequent relations, ranked by assigned input rows. S/E/A = supported / unsupported under the declared predicate / ambiguous. Precision bounds are S/N to (S+A)/N, not confidence intervals. Each run has its own fact population. Counts across runs describe assessment workload and are not pooled precision. No annotation, predicate, denominator or inferred world has been changed.

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [verbatim_beta0001_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) | 0.001 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 384 | 344 / 17 / 23 | 1824/8516 (21.42%) | 89.58%–95.57% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af/assessment.md) |
| [verbatim_beta0001_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md) | 0.001 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 364 | 311 / 26 / 27 | 1583/8516 (18.59%) | 85.44%–92.86% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9c88162c7b22/assessment.md) |
| [entityfix_latent_beta0001_seed20260912](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) | 0.001 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | 421 | 337 / 48 / 36 | 1546/8516 (18.15%) | 80.05%–88.60% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_dcb746fa83d6/assessment.md) |
| [entityfix_latent_beta0001_seed20260913](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) | 0.001 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | 436 | 344 / 47 / 45 | 1521/8516 (17.86%) | 78.90%–89.22% | [assessment](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470/assessment.md) |

The two fixed-name runs retain an unused entity defect in their source (B03); the two latent runs include its correction (B04). Their top twenty relations cover only 17.86%–21.42% of input rows.

[Expanded 57–90% input-row coverage comparison](../evaluations/coverage/evaluation-coverage-beta0001-campaign.md) uses these same four saved runs. It changes the selected relation population, not inference.

## Saved toy replay processes

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [entityfix-1789413029174/latent-0](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0) | 0.001 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0/config.json) |
| [entityfix-1789413029174/latent-1](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1) | 0.001 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1/config.json) |
| [entityfix-1789413029174/frozen-0](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0) | 0.001 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0/config.json) |
| [entityfix-1789413029174/frozen-1](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1) | 0.001 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1/config.json) |

## Earlier low-beta sampled assessment

The [September 14 sampled screen](../evaluations/campaigns/evaluation-sampled-top20-2026-09-14.md) contains the historical 100-fact assessments for the two corrected latent beta=0.001 runs. Those estimates used the earlier sampled protocol; the complete census above remains the comparable full-population reference.
The [September 12 sampled screen](../evaluations/campaigns/evaluation-sampled-top20-2026-09-12.md) separately preserves the two fixed-name beta=0.001 sampled estimates.
