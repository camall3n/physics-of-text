# Earlier five-fact screens: 2026-09-12

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: sampled manual evaluation campaign with eight retained full-NYT inference outputs; summary 2026-09-28. No new simulation or new grading occurs in this summary.

## Purpose and actual scope

The screen inspected the full dictionaries of the top twenty relations but graded only five facts per relation: 100 facts per run. Each sampled fact retained its local evidence. It did not grade every fact in the selected top-twenty population. This sample size was an assistant-chosen shortcut, not a requirement from the paper or the user.

The recorded estimator weights the within-relation sampled support by each relation’s full fact population. Consequently the weighted precision is generally not the raw supported count divided by 100. The ambiguity endpoints exclude additional uncertainty due to having sampled only five facts per relation.

## Historical results, not the current complete census

### β=0.1

[The two active-defect latent screens were retired](../../bug-sets/02-entity-multiplicity-active/README.md).

#### B03 — Fixed names; entity multiplicity defect dormant

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| verbatim_beta01_bridge_seed20260912 | [audit_4c50ddb65b](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/assessment.md) | 67 / 29 / 4 | 60.99%–67.81% |
| verbatim_beta01_bridge_seed20260913 | [audit_08e2dd6fc7](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_08e2dd6fc7/assessment.md) | 62 / 27 / 11 | 64.45%–75.18% |
| verbatim_beta01_seed20260912 | [audit_dba5006d06](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_dba5006d06/assessment.md) | 72 / 24 / 4 | 74.45%–78.86% |
| verbatim_beta01_seed20260913 | [audit_fb501b5da8](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_fb501b5da8/assessment.md) | 67 / 27 / 6 | 66.74%–72.42% |

#### B04 — Latent entities; six known sampling families corrected

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta01_seed20260912 | [audit_384a3e2233](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_384a3e2233/assessment.md) | 46 / 48 / 6 | 46.13%–52.08% |
| entityfix_latent_beta01_seed20260913 | [audit_c0010fff1d](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_c0010fff1d/assessment.md) | 41 / 52 / 7 | 37.28%–43.74% |

### β=0.001

#### B03 — Fixed names; entity multiplicity defect dormant

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| verbatim_beta0001_seed20260912 | [audit_5e74dee865](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_5e74dee865/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_5e74dee865/assessment.md) | 90 / 4 / 6 | 91.88%–95.99% |
| verbatim_beta0001_seed20260913 | [audit_6260319b65](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_6260319b65/README.md) | [assessment](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_6260319b65/assessment.md) | 84 / 7 / 9 | 85.82%–93.85% |

These are preserved historical estimates. The later harmonized full census evaluates every selected fact and also revisits some earlier scopes/judgments. It supersedes the screens for complete-population comparisons; a change in the table is not evidence of a changed sampler.

## Model choices and fixes

The eight retained runs cover fixed-name β=0.1, fixed-name β=0.1 with the optional bridge, fixed-name β=0.001, and factorial-corrected latent β=0.1, each at two seeds. Active sampling correction status differs by condition; names beginning entityfix include the additional entity factorial repair, while fixed-name modes do not execute the affected kernels. The bridge and smoothing are distinct modeling/algorithmic interventions.

Seed suffixes denote seeds 20260912 and 20260913. The beta0001 filename token means numeric 0.001. See the individual inference-run reports for actual configurations and budgets.

## Inspection and evidence

- [Original sampled review index](../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/README.md); [original sample protocol](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/manual_protocol.md).
- [Complete current comparison](../../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.md); [same-case versus added-case decomposition](../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md).
- [Explanation of why the screens were not equivalent](../../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/why_the_previous_samples_were_not_equivalent.md).

Existing sample annotations and audit hashes preserve the old procedure. They should not be relabeled as a census or treated as a fresh inference run. The scientific interpretation is an early screening estimate with limited coverage; its historical provenance explains discrepancies in previous tables. The two active-defect latent evaluations and grading data have been removed.
