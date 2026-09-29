# Group 06: relevant sampling corrections included, relation-only inference

[Evaluation and experiment links](EVALUATION.md)

This group contains the corrected Figure 1 inference output. The experiment uses beta=0.5, constant sparsity, and relation-phase moves; smart entity split/merge is not scheduled.

| Defect set | Status |
| --- | --- |
| Earlier reconstruction defects | Repaired in the modern implementation. |
| S1 fact-deletion correction and S4 shared normalization | Corrected in the producing working sources. |
| Near-zero reverse relation probabilities and query burn-in | Corrected; 1,500 query draws retained at the saved budget. |
| S2/S3/S5 smart entity proposals | Repairs present, but these entity kernels are inactive. |
| E1 entity factorial | Later isolated correction absent from this source lineage; affected kernels inactive. |

The relevant source locations are `mcmc/FactBirthDeathStep.java` helper/acceptance methods, `util/LogProbMap.java` and associated utilities, `mcmc/RelationSplitMergeStep.java:467`, and `inference/Inferer.java:42`. Their fixes account for bounded search success, normalize categorical weights correctly, preserve tiny reverse probabilities and include the first post-burn-in draw.

The [saved run metadata](../../../../resources/sampler-140626/results/figure1-2026-fixed/run_metadata.json) identifies the corrected working-source fingerprint; its Git HEAD alone is not the full source identity. No complete source archive is stored in this result directory.

Remaining limitations include partially unseeded generation/selection, eight worlds per bin, finite chains, entropy-bin selection bias and legacy truth-dependent tie ordering. Before/after worlds are unpaired, so curve differences do not identify a causal effect of the repairs. Smart entity corrections cannot explain changes in a run that never executes those kernels.

The self-pairs-included plot re-evaluates the same saved evidence. Its different pair population and perfect diagonal predictions do not alter sampler correctness.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
