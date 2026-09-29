# β=0.1: complete experiment inventory

[Evaluation and precision ranges](EVALUATION.md)

## Retired evaluations with confirmed active defects

[Four retained raw-run identities and configurations](../pre-fix/EVALUATION.md). Their reports and grading data were removed; fixed-name and corrected latent evaluations below remain.

## B03 — Fixed names; entity multiplicity defect dormant

- [verbatim_beta01_bridge_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2/assessment.md).
- [verbatim_beta01_bridge_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260913/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_ad8866964cf6/assessment.md).
- [verbatim_beta01_seed20260912](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260912.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_seed20260912/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_c2349c1e0c57/assessment.md).
- [verbatim_beta01_seed20260913](../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260913.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_seed20260913/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9f5868d8ee0e/assessment.md).
## B04 — Latent entities; six known sampling families corrected

- [entityfix_latent_beta01_seed20260912](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/entityfix_latent_beta01_seed20260912/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_8c6806186e00/assessment.md).
- [entityfix_latent_beta01_seed20260913](../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) — [saved configuration](../../../experiments/nyt-precision-investigation-2026-09-12/runs/entityfix_latent_beta01_seed20260913/config.json); [all assessed facts](../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_d0f63db2a21a/assessment.md).

## Documented-only conditions

These conditions are described in earlier implementation notes; raw run outputs and exact producing source snapshots are missing. They are separate from similarly named original archive fixtures. No precision value can be reconstructed here. Their pre-correction stage is documented, but the precise active bug subset is not established.

| Documented condition | β | Recorded outcome / limitation | Precision |
|---|---:|---|---|
| [250-row NYT, fact moves only](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) | 0.1 | 24–28 expressed relations; best reported log probability −4489 | unavailable |
| [250-row NYT, relation split/merge](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) | 0.1 | See saved development-note summary; no preserved semantic census | unavailable |

## Validation processes

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [controlled-1789236603939/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0/config.json) |
| [controlled-1789236603939/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1/config.json) |
| [controlled-1789236603939/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-0/config.json) |
| [controlled-1789236603939/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/frozen-1/config.json) |
| [controlled-1789236660906/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0/config.json) |
| [controlled-1789236660906/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1/config.json) |
| [controlled-1789236660906/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-0/config.json) |
| [controlled-1789236660906/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1) | 0.1 | 20260912 | [03](../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/frozen-1/config.json) |
| [entityfix-1789237190192/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0) | 0.1 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-0/config.json) |
| [entityfix-1789237190192/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1) | 0.1 | 20260912 | [04](../bug-sets/04-known-fixes-latent/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/latent-1/config.json) |
| [entityfix-1789237190192/frozen-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0) | 0.1 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0/config.json) |
| [entityfix-1789237190192/frozen-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1) | 0.1 | 20260912 | [07](../bug-sets/07-known-fixes-frozen-validation/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1/config.json) |
