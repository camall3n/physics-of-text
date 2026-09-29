# Pre-fix conditions: retired evaluations and retained evidence

[Main index](../README.md) · [Bug catalog](../BUG_CATALOG.md) · [Cleanup record](../../buggy-evaluation-cleanup-2026-09-28/README.md)

Evaluations and grading data for the four full-NYT runs with confirmed active defects and the pre-fix Figure 1 condition have been removed. Their configurations, raw outputs and bug evidence remain in the identity records below.

- [B01: NYT before sampling corrections](../bug-sets/01-before-sampling-fixes-latent/README.md).
- [B02: three NYT runs with active entity factorial defect](../bug-sets/02-entity-multiplicity-active/README.md).
- [B05: Figure 1 before relation/query corrections](../bug-sets/05-before-sampling-fixes-relation-only/README.md).

Uncertain historical conditions and validation fixtures remain distinct from those retired evaluations.

## Documented pre-fix development runs, incomplete provenance

These conditions are described in earlier implementation notes; raw run outputs and exact producing source snapshots are missing. They are separate from similarly named original archive fixtures. No precision value can be reconstructed here. Their pre-correction stage is documented, but the precise active bug subset is not established.

| Documented condition | β | Recorded outcome / limitation | Precision |
|---|---:|---|---|
| [250-row NYT, fact moves only](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) | 0.1 | 24–28 expressed relations; best reported log probability −4489 | unavailable |
| [250-row NYT, relation split/merge](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) | 0.1 | See saved development-note summary; no preserved semantic census | unavailable |
| [2,500-row NYT scaling](../bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-2500-scaling-documented-only.md) | unknown | Reported runtime under three minutes; exact β and run config unknown | unavailable |
| [Toy, sparse dictionaries](../bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-sparse-beta001-documented-only.md) | 0.01 | Development-note result only; no saved run-level semantic evaluation | unavailable |
| [Toy, smoother dictionaries](../bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-beta05-documented-only.md) | 0.5 | Development-note result only; no saved run-level semantic evaluation | unavailable |

## Toy replay processes that still exercise the entity defect

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [controlled-1789236603939/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-0/config.json) |
| [controlled-1789236603939/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236603939/latent-1/config.json) |
| [controlled-1789236660906/latent-0](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-0/config.json) |
| [controlled-1789236660906/latent-1](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1) | 0.1 | 20260912 | [02](../bug-sets/02-entity-multiplicity-active/BUGS.md) | [config](../../../experiments/nyt-precision-investigation-2026-09-12/tests/controlled-1789236660906/latent-1/config.json) |

## Source defects that do not execute, and unknown historical cases

[B03 fixed-name runs](../bug-sets/03-entity-multiplicity-dormant/EVALUATION.md) retain the factorial omission in source but disable its kernel; they are not evidence that the active defect caused their precision. [Archived outputs](../unclassified/archive/EVALUATION.md) lack enough source-to-output linkage for an exact bug assignment. [Exploratory/component evidence](../unclassified/exploratory/EVALUATION.md) has separate or unknown kernels.
