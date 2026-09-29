# Group 03: five sampling families corrected, entity factorial defect dormant

[Evaluation and experiment links](EVALUATION.md)

This group contains the six fixed-name controlled NYT runs and frozen toy replays built from the controlled, non-entityfix source. The source has the five earlier repairs but retains E1; **the affected entity kernels are disabled in these executions**.

| Defect set | Status |
| --- | --- |
| Earlier reconstruction defects | Repaired. |
| S1–S5 and associated repairs | Included. The corrected relation/shared paths execute; entity-only paths are inactive. |
| E1 entity-count factorial | Present in source, dormant under fixed names. It was not patched in this source variant. |

Fixed names skips the preliminary entity-inference phase and disables both argument-entity Gibbs updates during relation inference. Noun-aware initialization alone would not provide this guarantee. The controlled validation records zero changed argument identities in frozen mode.

E1 lives in the two smart entity `logStateRatio()` methods. Its missing log(N+1)/−log(N) term cannot affect these runs because those proposals are not scheduled. Consequently these runs should not be grouped with latent runs exposed to E1, nor described as having source with all six families patched. Frozen replays using genuinely patched entityfix source belong in group 07.

The six full-NYT conditions are beta=0.1 without a bridge, beta=0.001 without a bridge, and beta=0.1 with the optional sentence/relation bridge, each with seeds 20260912 and 20260913. Beta and freezing are model choices. The bridge changes the proposal mixture while intending to preserve the same fixed-name target; it is not an arithmetic correction.

The relation-pool prior remains unchanged. Fixed names can separate aliases and collapse homonymous strings by design; mathematical correctness of the implemented conditional model does not establish perfect entity semantics or convergence.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
