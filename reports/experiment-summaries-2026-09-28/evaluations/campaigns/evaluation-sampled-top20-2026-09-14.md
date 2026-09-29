# Earlier five-fact screens: 2026-09-14

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: sampled manual evaluation campaign of two saved full-NYT inference outputs; summary 2026-09-28. No new simulation or new grading occurs in this summary.

## Purpose and actual scope

The screen inspected the full dictionaries of the top twenty relations but graded only five facts per relation: 100 facts per run. Each sampled fact retained its local evidence. It did not grade every fact in the selected top-twenty population. This sample size was an assistant-chosen shortcut, not a requirement from the paper or the user.

The recorded estimator weights the within-relation sampled support by each relation’s full fact population. Consequently the weighted precision is generally not the raw supported count divided by 100. The ambiguity endpoints exclude additional uncertainty due to having sampled only five facts per relation.

## Historical results, not the current complete census

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta0001_seed20260912 | [audit_4f7553d383](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/audit_4f7553d383/README.md) | [assessment](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/audit_4f7553d383/assessment.md) | 76 / 15 / 9 | 76.20%–84.51% |
| entityfix_latent_beta0001_seed20260913 | [audit_af30702564](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/audit_af30702564/README.md) | [assessment](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/audit_af30702564/assessment.md) | 85 / 9 / 6 | 85.05%–91.15% |

These are preserved historical estimates. The later harmonized full census evaluates every selected fact and also revisits some earlier scopes/judgments. It supersedes the screens for complete-population comparisons; a change in the table is not evidence of a changed sampler.

## Model choices and fixes

The two runs use β=0.001 with corrected latent entities, keeping the other September 12 factorial-corrected latent settings. Lower β changes the relation dictionary smoothing; it does not disable entity sampling or replace the earlier bug fixes.

Seed suffixes denote seeds 20260912 and 20260913. The beta0001 filename token means numeric 0.001. See the individual inference-run reports for actual configurations and budgets.

## Inspection and evidence

- [Original sampled review index](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/README.md); [original sample protocol](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/analysis/manual_protocol.md).
- [Complete current comparison](../../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.md); [same-case versus added-case decomposition](../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md).
- [Explanation of why the screens were not equivalent](../../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/why_the_previous_samples_were_not_equivalent.md).

Existing sample annotations and audit hashes preserve the old procedure. They should not be relabeled as a census or treated as a fresh inference run. The scientific interpretation is an early screening estimate with limited coverage; its historical provenance explains discrepancies in previous tables. No deletion decision is made.
