# Previous evaluations versus harmonized complete census

[Method](METHOD.md) · [Complete current comparison](comparison.md) · [All matched prior/current judgments](prior_comparison.json) · [Every changed label](judgment_changes.md)

The old estimator and the harmonized estimator use exactly the same prior cases and the same relation-population weights N_r/N. For the 12 sampled runs this reconstructs the stratified estimator, not the unweighted success fraction among 100 cases. For the two old complete evaluations it is the exact top-20 census fraction; extra subsidiary cases are excluded. The full census uses every fact. Ambiguity endpoints are descriptive; no sampling confidence intervals are added here.

Read each row left to right: first change the judgments/declared scope on the same previously reviewed cases, then expand to all cases while keeping the current scope fixed. The two differences are an arithmetic decomposition, not estimates of causal effects. Text differences between declarations do not prove a semantic scope change; changed-label reasons must be inspected. Newly evaluated facts were judged individually, with no label extrapolation.

| Run | Prior / full N | Prior estimate | Current scope, identical prior cases | Complete current census | Same-case changed labels | New-case census S/E/A |
|---|---:|---:|---:|---:|---:|---|
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | 100/421 | 76.20%–84.51% | 74.39%–84.51% | 80.05%–88.60% | 2 | 263/33/25 (N=321) |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | 100/436 | 85.05%–91.15% | 82.71%–91.15% | 78.90%–89.22% | 2 | 261/38/37 (N=336) |
| [nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260912](census/audit_8c6806186e00/assessment.md) | 100/1184 | 46.13%–52.08% | 46.13%–53.63% | 46.71%–54.65% | 1 | 507/490/87 (N=1084) |
| [nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260913](census/audit_d0f63db2a21a/assessment.md) | 100/1197 | 37.28%–43.74% | 37.38%–43.74% | 40.85%–47.54% | 4 | 448/576/73 (N=1097) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | 100/384 | 91.88%–95.99% | 91.88%–95.99% | 89.58%–95.57% | 0 | 254/13/17 (N=284) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | 100/364 | 85.82%–93.85% | 85.82%–93.85% | 85.44%–92.86% | 0 | 227/19/18 (N=264) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260912](census/audit_e4fd4a14b8e2/assessment.md) | 100/727 | 60.99%–67.81% | 60.88%–70.56% | 63.69%–71.11% | 3 | 396/182/49 (N=627) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260913](census/audit_ad8866964cf6/assessment.md) | 100/742 | 64.45%–75.18% | 64.45%–73.88% | 61.19%–69.14% | 2 | 392/200/50 (N=642) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260912](census/audit_c2349c1e0c57/assessment.md) | 100/735 | 74.45%–78.86% | 74.78%–79.51% | 66.12%–74.83% | 3 | 414/162/59 (N=635) |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260913](census/audit_9f5868d8ee0e/assessment.md) | 100/715 | 66.74%–72.42% | 65.99%–74.32% | 66.15%–73.43% | 4 | 407/164/44 (N=615) |

The JSON also gives exact counts on the prior subset, transition matrices, per-relation declarations, and the two endpoint differences. Original annotations and any original human overrides remain in each audit’s prior snapshots. Current human overrides, if any, are included in the current results.
