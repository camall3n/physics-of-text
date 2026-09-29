# Precision at increasing input-row coverage

[Method](METHOD.md) · [Structured comparison](comparison.json)

All facts in every requested prefix have valid judgments. Precision endpoints S/N and (S+A)/N treat ambiguity as incorrect or supported; these are exact descriptive fractions, not confidence intervals. Row coverage is not gold-fact recall. Each run has its own inferred fact population.

| Run | Target | k | Actual row coverage | S | E | A | N | S/N | (S+A)/N |
|---|---|---:|---:|---:|---:|---:|---:|---:|---:|
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | [57.00%](census/audit_dcb746fa83d6/coverage_57.md) | 114 | 4860/8516=57.07% | 1008 | 322 | 197 | 1527 | 66.01% | 78.91% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | [60.00%](census/audit_dcb746fa83d6/coverage_60.md) | 126 | 5129/8516=60.23% | 1073 | 344 | 202 | 1619 | 66.28% | 78.75% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | [70.00%](census/audit_dcb746fa83d6/coverage_70.md) | 168 | 5969/8516=70.09% | 1210 | 451 | 224 | 1885 | 64.19% | 76.07% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | [80.00%](census/audit_dcb746fa83d6/coverage_80.md) | 220 | 6813/8516=80.00% | 1336 | 574 | 253 | 2163 | 61.77% | 73.46% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | [90.00%](census/audit_dcb746fa83d6/coverage_90.md) | 290 | 7668/8516=90.04% | 1449 | 720 | 299 | 2468 | 58.71% | 70.83% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | [57.00%](census/audit_e318fe663470/coverage_57.md) | 116 | 4876/8516=57.26% | 980 | 365 | 190 | 1535 | 63.84% | 76.22% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | [60.00%](census/audit_e318fe663470/coverage_60.md) | 127 | 5131/8516=60.25% | 1021 | 405 | 199 | 1625 | 62.83% | 75.08% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | [70.00%](census/audit_e318fe663470/coverage_70.md) | 167 | 5966/8516=70.06% | 1162 | 526 | 238 | 1926 | 60.33% | 72.69% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | [80.00%](census/audit_e318fe663470/coverage_80.md) | 220 | 6825/8516=80.14% | 1292 | 666 | 273 | 2231 | 57.91% | 70.15% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | [90.00%](census/audit_e318fe663470/coverage_90.md) | 287 | 7674/8516=90.11% | 1398 | 833 | 311 | 2542 | 55.00% | 67.23% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | [57.00%](census/audit_06dbdb9b03af/coverage_57.md) | 98 | 4868/8516=57.16% | 888 | 98 | 87 | 1073 | 82.76% | 90.87% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | [60.00%](census/audit_06dbdb9b03af/coverage_60.md) | 109 | 5130/8516=60.24% | 923 | 116 | 100 | 1139 | 81.04% | 89.82% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | [70.00%](census/audit_06dbdb9b03af/coverage_70.md) | 152 | 5965/8516=70.04% | 1035 | 171 | 119 | 1325 | 78.11% | 87.09% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | [80.00%](census/audit_06dbdb9b03af/coverage_80.md) | 209 | 6825/8516=80.14% | 1139 | 242 | 142 | 1523 | 74.79% | 84.11% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | [90.00%](census/audit_06dbdb9b03af/coverage_90.md) | 282 | 7671/8516=90.08% | 1241 | 323 | 168 | 1732 | 71.65% | 81.35% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | [57.00%](census/audit_9c88162c7b22/coverage_57.md) | 104 | 4874/8516=57.23% | 887 | 119 | 92 | 1098 | 80.78% | 89.16% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | [60.00%](census/audit_9c88162c7b22/coverage_60.md) | 115 | 5126/8516=60.19% | 931 | 128 | 101 | 1160 | 80.26% | 88.97% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | [70.00%](census/audit_9c88162c7b22/coverage_70.md) | 159 | 5976/8516=70.17% | 1064 | 176 | 122 | 1362 | 78.12% | 87.08% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | [80.00%](census/audit_9c88162c7b22/coverage_80.md) | 215 | 6815/8516=80.03% | 1155 | 228 | 158 | 1541 | 74.95% | 85.20% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | [90.00%](census/audit_9c88162c7b22/coverage_90.md) | 285 | 7665/8516=90.01% | 1252 | 311 | 183 | 1746 | 71.71% | 82.19% |

## Preserved previous top20 scores

| Run | S | E | A | N | S/N | (S+A)/N |
|---|---:|---:|---:|---:|---:|---:|
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | 337 | 48 | 36 | 421 | 80.05% | 88.60% |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | 344 | 47 | 45 | 436 | 78.90% | 89.22% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | 344 | 17 | 23 | 384 | 89.58% | 95.57% |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | 311 | 26 | 27 | 364 | 85.44% | 92.86% |

Each run assessment includes precision in the added relation blocks, per-relation counts, every judged fact, and editable human-review questions.
