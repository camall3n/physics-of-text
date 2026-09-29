# Group 05: before sampling corrections, relation-only inference

[Retired evaluation: run identity and raw outputs](README.md)

This group contains the earlier Figure 1 inference output. It uses beta=0.5 and does not schedule smart entity split/merge. It must not inherit every active-defect claim from the full-NYT latent baseline merely because the codebase is shared.

| Defect or limitation | Applicability |
| --- | --- |
| S1 bounded fact-deletion proposal correction | Missing; the relation-phase fact birth/death kernel is relevant. |
| S4 log-weight normalization | Missing; shared weighted/Gibbs choices are relevant. |
| Near-zero reverse relation-probability arithmetic | Pre-repair; relation split/merge is relevant. |
| Burn-in query counting | Off by one: retains 1,499 rather than 1,500 query draws for 2,000 iterations and burn-in 500. |
| S2/S3/S5 smart entity proposal defects and E1 factorial | Present in the pre-correction source history but inactive here; smart entity kernels are not scheduled. |
| Earlier reconstruction defects | Modern experiment follows reconstruction; do not project the original archive's missing relation joint onto it. |

S1 biases birth/death proposal corrections; S4 can misnormalize categorical choices; the relation complement arithmetic can assign an impossible reverse probability to a valid very-small event. The precise fixes and recorded locations appear in [the catalog](../../BUG_CATALOG.md). Realized frequencies and separate curve effects are unavailable.

The burn-in defect is at `inference/Inferer.java:42`: the correction includes i=burnin rather than beginning one draw later. NYT MAP evaluations are not affected by this query filter, but this experiment estimates pair probabilities from retained query draws.

Seed propagation is incomplete. The corrected run uses independently generated worlds, not a paired set held fixed across code changes. Legacy evaluation ranks tied scores one pair at a time in truth-dependent storage order, and original posterior scores were not retained for tie-grouped reconstruction. These are additional reproducibility/evaluation limitations, not entity-proposal effects.

The later self-pair figure is an evaluation transformation of these saved results and the corrected results; it is not a third inference run or evidence that the old sampling defects were fixed.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
