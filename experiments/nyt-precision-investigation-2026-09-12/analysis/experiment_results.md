# Controlled NYT experiment results

All counts below describe the saved MAP world. Each run uses all 8,516 unchanged rows. Seed suffix 12/13 means 20260912/20260913. This evaluation index includes retained runs only; the two confirmed-bug latent baselines have retired evaluations and preserved raw outputs. Manual precision is a relation-size-weighted estimate from five facts per top-20 relation; endpoints count ambiguous cases as incorrect/correct. They are **not confidence intervals**, and none of these screens is a full census. See each linked assessment for individual judgments and the deliberately conservative finite-population sampling bounds.

| Run | Entities (available) | Relations (expressed) | Facts (expressed) | Top-20 facts | Top-20 rows | Sample precision | Audit |
|---|---:|---:|---:|---:|---:|---|---|
| entityfix_latent_beta01_seed20260912 | 1180 | 275 | 2113 | 1184 | 5299 (62.2%) | 46.1%–52.1% | [review](../manual_review/audit_384a3e2233/assessment.md) |
| entityfix_latent_beta01_seed20260913 | 1161 | 288 | 2195 | 1197 | 5303 (62.3%) | 37.3%–43.7% | [review](../manual_review/audit_c0010fff1d/assessment.md) |
| verbatim_beta0001_seed20260912 | 1199 | 398 | 1929 | 384 | 1824 (21.4%) | 91.9%–96.0% | [review](../manual_review/audit_5e74dee865/assessment.md) |
| verbatim_beta0001_seed20260913 | 1199 | 400 | 1942 | 364 | 1583 (18.6%) | 85.8%–93.8% | [review](../manual_review/audit_6260319b65/assessment.md) |
| verbatim_beta01_bridge_seed20260912 | 1199 | 200 | 1302 | 727 | 5034 (59.1%) | 61.0%–67.8% | [review](../manual_review/audit_4c50ddb65b/assessment.md) |
| verbatim_beta01_bridge_seed20260913 | 1199 | 199 | 1336 | 742 | 4894 (57.5%) | 64.4%–75.2% | [review](../manual_review/audit_08e2dd6fc7/assessment.md) |
| verbatim_beta01_seed20260912 | 1199 | 181 | 1244 | 735 | 5368 (63.0%) | 74.4%–78.9% | [review](../manual_review/audit_dba5006d06/assessment.md) |
| verbatim_beta01_seed20260913 | 1199 | 185 | 1249 | 715 | 5096 (59.8%) | 66.7%–72.4% | [review](../manual_review/audit_fb501b5da8/assessment.md) |

## Identity drift and finite-run behavior

A mixed-name entity ID is a diagnostic flag, not a proven error: aliases can be legitimate. Changed mention counts compare implementation IDs with initialization and likewise do not measure identity accuracy. No run has demonstrated convergence. The positive last-block differences are consistent with continued movement toward higher-density regions; they do not establish convergence or prove nonstationarity. Log-joint comparisons are meaningful only within the same target; do not rank beta or entity models by these numbers.

| Run | MAP iteration / 980 | Changed argument mentions / 17,032 | Mixed-name IDs | Mean log-joint improvement: final 100 vs prior 100 | Iterations at >=399 relations in final 100 |
|---|---:|---:|---:|---:|---:|
| entityfix_latent_beta01_seed20260912 | 977 | 5111 | 433 | 1656.1 | 0 |
| entityfix_latent_beta01_seed20260913 | 978 | 5289 | 444 | 1526.2 | 0 |
| verbatim_beta0001_seed20260912 | 971 | 0 | 0 | 583.1 | 47 |
| verbatim_beta0001_seed20260913 | 972 | 0 | 0 | 519.6 | 45 |
| verbatim_beta01_bridge_seed20260912 | 979 | 0 | 0 | 767.7 | 0 |
| verbatim_beta01_bridge_seed20260913 | 973 | 0 | 0 | 715.5 | 0 |
| verbatim_beta01_seed20260912 | 978 | 0 | 0 | 574.3 | 0 |
| verbatim_beta01_seed20260913 | 976 | 0 | 0 | 704.1 | 0 |

## Recompute

Run `node scripts/summarize_experiments.mjs` from this investigation directory. It independently parses MAP assignments, checks unchanged observed rows, verifies MAP scores against the trace, derives total true facts from the uniform-reporting term, verifies the top-20 population against the blind sample manifest, and checks frozen-identity invariants and proposal budgets. Exact inputs, source snapshots and output hashes are in each run’s `run.json`. Machine-readable details are in [experiment_results.json](experiment_results.json).
