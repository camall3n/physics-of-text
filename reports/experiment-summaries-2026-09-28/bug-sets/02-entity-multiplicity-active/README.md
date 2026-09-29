# B02 — Active entity factorial defect: evaluations retired

[Bug description](BUGS.md) · [Cleanup record](../../../buggy-evaluation-cleanup-2026-09-28/README.md) · [All bug sets](../README.md)

The three full-NYT evaluations and their grading data were removed because the confirmed entity factorial defect was active. All three runs use β=0.1, a 400-slot relation pool and latent entity inference; the earlier sampling families had been repaired.

| Retained run identity | Configuration | Raw outputs and source provenance |
|---|---|---|
| `nyt-2026-fixed-400` | [config](../../../../resources/sampler-140626/results/nyt-2026-fixed-400/config.json) | [run directory](../../../../resources/sampler-140626/results/nyt-2026-fixed-400) |
| `latent_beta01_seed20260912` | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260912/config.json) | [run and source snapshot](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260912) |
| `latent_beta01_seed20260913` | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260913/config.json) | [run and source snapshot](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/latent_beta01_seed20260913) |

The controlled seeds are 20260912 and 20260913. The older `fixed-400` name identifies the relation pool; entity names remain latent. [Toy replay fixtures](../../validation/validation-nyt-precision-investigation-2026-09-12.md) and regression tests are retained as validation evidence.
