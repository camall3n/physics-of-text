# β=0.001: complete experiment inventory

[Evaluation and precision ranges](EVALUATION.md)

## B03 — Fixed names; entity multiplicity defect dormant

- [verbatim_beta0001_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af/assessment.md).
- [verbatim_beta0001_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9c88162c7b22/assessment.md).
## B04 — Latent entities; six known sampling families corrected

- [entityfix_latent_beta0001_seed20260912](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) — [saved configuration](../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_dcb746fa83d6/assessment.md).
- [entityfix_latent_beta0001_seed20260913](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) — [saved configuration](../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470/assessment.md).

## Validation processes

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [entityfix-1789413029174/latent-0](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0) | 0.001 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-0/config.json) |
| [entityfix-1789413029174/latent-1](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1) | 0.001 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/latent-1/config.json) |
| [entityfix-1789413029174/frozen-0](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0) | 0.001 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0/config.json) |
| [entityfix-1789413029174/frozen-1](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1) | 0.001 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1/config.json) |
