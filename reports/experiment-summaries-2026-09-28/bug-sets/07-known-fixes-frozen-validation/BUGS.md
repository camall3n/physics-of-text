# Group 07: corrected source, frozen-name toy validation

[Evaluation and experiment links](EVALUATION.md)

This group is restricted to **frozen toy replays from the entityfix source**, not full-NYT fixed-name runs from controlled source.

Applicable saved bundles are `entityfix-1789237190192/frozen-0, frozen-1` at beta=0.1 and `entityfix-1789413029174/frozen-0, frozen-1` at beta=0.001. Each pair starts the same seed/configuration in separate JVMs.

| Defect set | Status |
| --- | --- |
| Earlier reconstruction defects | Repaired. |
| S1–S5 and related numerical/output/query repairs | Included in source. |
| E1 entity factorial | Included in source; affected entity kernels are inactive because names are frozen. |

The isolated entityfix source adds log(N+1)/−log(N) to the smart entity acceptance components, but these particular processes skip entity inference and disable argument reassignment. Their evidence concerns deterministic replay, freezing and the executed relation/shared kernels. They do not supply a Monte Carlo test of the repaired entity transition: the latent replays and exact partition-chain tests provide that evidence.

The recorded bundles passed 91 tests and preserved byte-matching output pairs. Those historical results do not establish semantic precision or NYT-scale convergence. The four processes here are toy validations, not four independent random-seed experiments or additional NYT evaluations.

Controlled-source frozen replays and the six fixed-name NYT runs belong in group 03: their E1 omission is dormant but the source is not patched. This distinction preserves exact correction provenance.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
