# Group 08: documented pre-correction development runs, exact producer unverified

[Evaluation and experiment links](EVALUATION.md)

This group contains five configurations described in development notes but lacking preserved raw inference outputs and exact producing-source manifests:

| Documented condition | Beta established by its notes |
| --- | --- |
| Ten-row toy, sparse dictionary | 0.01 |
| Ten-row toy, wider dictionary | 0.5 |
| NYT 250-row slice, fact moves only | 0.1 |
| NYT 250-row slice, relation split/merge added | 0.1 |
| NYT 2,500-row scalability check | Unknown; do not infer 0.1 from a nearby configuration. |

[CHANGES.md](../../../../resources/sampler-140626/CHANGES.md) and [HANDOFF.md](../../../../HANDOFF.md) locate these in early post-import development before the later sampling audit/corrections. They do not bind every run to an exact source revision or prove the same active kernel set.

The inherited smart entity/sign/null/normalizer defects, shared log-weight issue and entity factorial omission are relevant historical risks. The update introduced bounded fact-deletion search without the required proposal-success correction. However, missing execution/source records prevent exact attribution of each defect's incidence to each timing or posterior claim.

The fact-moves-only NYT250 condition predates relation split/merge in that comparison; it must not be assigned an active relation-split numerical defect. The 2,500-row report centers on performance fixes and does not preserve sufficient settings to assign beta, sparsity or every kernel confidently.

Earlier reconstruction repairs were being implemented during this period. Current source cannot retrospectively establish which intermediate snapshot produced each reported observation. This group therefore records **pre-correction timing with unverified exact source**, rather than borrowing the fully specified modern baseline's defect matrix.

The historical archive's `output-250` and `output-2500` are different experiments and cannot replace missing results here. No saved semantic precision population, complete annotation file or independently checkable posterior trace exists for these five documented-only configurations. Narrative outcomes can be preserved but should not be promoted to recomputed evaluation metrics.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
