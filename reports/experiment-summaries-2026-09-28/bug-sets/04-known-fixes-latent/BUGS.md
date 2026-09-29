# Group 04: known sampling corrections included, latent entities enabled

[Evaluation and experiment links](EVALUATION.md)

This group contains four full-NYT entityfix runs, at beta=0.1 and beta=0.001 with two seeds each, and applicable entityfix latent toy replays.

| Defect set | Status |
| --- | --- |
| Earlier reconstruction defects | Repaired. |
| S1–S5 and associated numerical/output/query repairs | Included. |
| E1 entity-count factorial | Corrected; affected entity kernels execute with the additional acceptance term. |

The isolated variant changes only two production files relative to controlled source: `mh/EntitySmartSplitStep.java` and `mh/EntitySmartMergeStep.java`. At the recorded corrected lines 368/370, their `logStateRatio()` components add log(N+1) on splits and subtract log(N) on merges. The full transition accounts for empty-entity proposal multiplicities and targets the documented entity partition density instead of π/N!.

The [variant README](../../../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/README.md) and [derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) preserve exact counterexamples, finite partition-chain checks and saved 91-test validation. These are evidence for the checked formulas, not proof that every possible implementation issue is absent.

The lower-beta study preserves the same corrected production source and lowers relation dictionary beta from 0.1 to 0.001. That is a model comparison, not another bug fix.

The entity phase still targets a noun-and-count model, followed by relation inference in which entity count is held fixed and restricted argument reassignment remains possible. These corrections do not make that two-phase procedure established joint MCMC for the entire fact model. The finite relation-pool prior, finite budget and corpus-evidence evaluation choices also remain. A lower semantic score after a mathematically supported fix is not grounds to relabel the fix as a defect.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
