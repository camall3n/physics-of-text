# Group 02: five sampling families corrected, entity factorial defect active

[Retired evaluation: run identity and raw outputs](README.md)

This group contains the corrected `nyt-2026-fixed-400` baseline, the two controlled `latent_beta01` full-NYT runs, and applicable controlled latent toy replays. **“fixed-400” means the earlier corrections with a 400-slot pool; it does not mean fixed entity names or every later bug fixed.**

| Defect set | Status |
| --- | --- |
| Earlier reconstruction defects | Repaired. |
| S1–S5 and the associated numerical/output/query repairs | Repaired in the documented source. |
| E1 entity-count factorial | Still present and active: smart entity split/merge executes. |

The E1 omission is in `logStateRatio()` of both `mh/EntitySmartSplitStep.java` and `mh/EntitySmartMergeStep.java`. For the entity-phase partition target π, these post-five-fix kernels instead preserve π/N!. Increasing N to N+1 therefore incurs an unintended extra penalty 1/(N+1), beyond the configured count prior and noun/origin likelihoods.

The isolated fix adds log(N+1) for splits and subtracts log(N) for merges, after accounting for empty-object proposal multiplicities. Corrected-file locations are the isolated variant's smart-split line 368 and smart-merge line 370; [the full derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) explains why simply adding the full falling-factorial density change is insufficient.

This can favor merging distinct named entities and change relation evidence. It does not establish that the whole precision gap comes from this defect. The corrected entityfix runs belong in group 04, with their evaluations retained.

The older fixed-400 run has incomplete seed control; the controlled runs add separate seeded streams and deterministic categorical iteration. That provenance difference is documented per run and does not change the shared active E1 omission. Controlled toy replay confirms repeatability of this implementation, not correctness of its entity target.

The relevant full-NYT runs use beta=0.1. The finite pool prior and two-phase latent model remain unchanged model choices.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
