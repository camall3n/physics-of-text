# Complete NYT census comparison

[Method](METHOD.md) · [Machine-readable comparison](comparison.json) · [Prior evaluation comparison](prior_comparison.md) · [Changed judgments](judgment_changes.md)

Every reported run passed full-census validation. S/N and (S+A)/N are exact descriptive fractions under the declared judgments, not confidence intervals. Separate runs are not pooled; these fractions do not measure gold recall or reviewer uncertainty.

| Run | S | E | A | N | S/N | (S+A)/N | Top-20 rows |
|---|---:|---:|---:|---:|---:|---:|---:|
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912](census/audit_dcb746fa83d6/assessment.md) | 337 | 48 | 36 | 421 | 80.05% | 88.60% | 1546/8516 |
| [nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913](census/audit_e318fe663470/assessment.md) | 344 | 47 | 45 | 436 | 78.90% | 89.22% | 1521/8516 |
| [nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260912](census/audit_8c6806186e00/assessment.md) | 553 | 537 | 94 | 1184 | 46.71% | 54.65% | 5299/8516 |
| [nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260913](census/audit_d0f63db2a21a/assessment.md) | 489 | 628 | 80 | 1197 | 40.85% | 47.54% | 5303/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912](census/audit_06dbdb9b03af/assessment.md) | 344 | 17 | 23 | 384 | 89.58% | 95.57% | 1824/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913](census/audit_9c88162c7b22/assessment.md) | 311 | 26 | 27 | 364 | 85.44% | 92.86% | 1583/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260912](census/audit_e4fd4a14b8e2/assessment.md) | 463 | 210 | 54 | 727 | 63.69% | 71.11% | 5034/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260913](census/audit_ad8866964cf6/assessment.md) | 454 | 229 | 59 | 742 | 61.19% | 69.14% | 4894/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260912](census/audit_c2349c1e0c57/assessment.md) | 486 | 185 | 64 | 735 | 66.12% | 74.83% | 5368/8516 |
| [nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260913](census/audit_9f5868d8ee0e/assessment.md) | 473 | 190 | 52 | 715 | 66.15% | 73.43% | 5096/8516 |
