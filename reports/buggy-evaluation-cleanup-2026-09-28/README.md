# Retired evaluations of confirmed-bug experiments — 2026-09-28

The user requested removal of both evaluation reports and saved grading data
for experiments with confirmed active implementation defects, while preserving
raw experiment outputs, bug documentation and regression tests.

## Retired conditions

| Run | Reason |
|---|---|
| nyt-2026, including the subsidiary side audit | Before the five sampling defect repairs; later entity defect also active |
| nyt-2026-fixed-400 | Earlier five repairs present, entity multiplicity defect still active |
| latent_beta01_seed20260912 | Entity multiplicity defect active |
| latent_beta01_seed20260913 | Entity multiplicity defect active |
| Figure 1 before sampling fixes | Relevant shared/relation/query defects not yet repaired |

Beta=0.1 alone is not a defect. Fixed-name runs whose entity defect was dormant,
corrected runs, and historical archives with unverified producing revisions
were not selected for deletion.

## Preserved evidence and retained evaluations

Original sampler outputs and source/configuration provenance remain. Retired
audit folders retain raw copies, aggregate ungraded case evidence and source
metadata, with a short status README. Their grades and rendered reports have
been removed. Shared predicate definitions remain unchanged because retained
experiments depend on those operational meanings.

The retained complete top-20 campaign contains **10 runs / 6,905 facts**.
The four corrected beta=0.001 coverage evaluations retain **8,488 facts / 20
coverage views**. Their scientific results match the
pre-cleanup hashes and freshly recomputed assessments.

- [Experiment index](../experiment-summaries-2026-09-28/README.md)
- [Retained complete top-20 comparison](../../experiments/nyt-complete-evaluation-2026-09-14/comparison.md)
- [Corrected beta=0.001 coverage comparison](../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md)
- [Figure 1 cleanup and validation](FIGURE1.md)

## Audit records

Detailed file/hash records are grouped in [records/](records/), including component change ledgers.
No deleted judgment bodies are copied into this cleanup folder.
The JSON deletion plan lists exact paths and hashes, not labels or evidence.

## Final validation

- **1,409 obsolete files removed**, including detailed reports, grading data,
  derived evaluation views and the unused subsidiary preparation script.
- **9,495 existing files** containing raw outputs, retained evaluations, immutable
  method/provenance records and regression evidence verified byte-for-byte unchanged.
- The 10 retained complete assessments match fresh validation; the four corrected
  coverage assessments and every cutoff remain exactly unchanged.
- **83 JavaScript tests and 12 Python tests passed**. Retirement guards reject the
  removed cohorts before writing new evaluation artifacts.
- **148 Markdown files checked; zero broken local links.**
- Sampler code and parameters unchanged. Bug descriptions and mathematical fixes
  retained; two obsolete navigation/evaluation passages in bug documents updated.
- Original protected manifests unchanged. Current census/coverage preservation
  checks accept only the exact authorized transitions in
  [maintenance_changes.json](maintenance_changes.json); other changes still fail.
  Both checks pass, covering 8,055 and 9,721 original entries respectively.

[Machine-readable validation](records/final_validation.json) ·
[JavaScript test output](records/evaluation_tests.tap) ·
[Figure 1 verification](FIGURE1.md).

## Pending legacy integrity compatibility

The two older September 12 / latent September 14 integrity scripts remain
unchanged and will report authorized removed/edited artifacts as preservation
failures. The maintained sampler and retained evaluation computations do not
depend on running those old verification commands.

Automatic approval review rejected changing these historical integrity controls
without explicit approval. The [proposed patch](proposed_legacy_integrity.patch)
and [explanation](LEGACY_INTEGRITY_PROPOSAL.md) are ready for review but have not
been applied. They preserve original manifests and admit only recorded exact
before/after hashes; this is the sole pending maintenance action.
