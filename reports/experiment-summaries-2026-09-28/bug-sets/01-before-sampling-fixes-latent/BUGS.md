# Group 01: before sampling corrections, latent entities

[Retired evaluation: run identity and raw outputs](README.md)

This group contains the first modern full-NYT replication, `nyt-2026`. It is **after the initial archive reconstruction repairs, but before the five sampling-family corrections**. The later entity-count factorial correction is also absent, and entity inference is enabled.

| Defect set | Status in this run |
| --- | --- |
| Earlier reconstruction: missing relation joint, phantom/stale mentions, destructive histograms and doubled noun conditional | Already repaired in the modern implementation; do not ascribe these original archive bugs to this run. |
| S1 bounded fact-deletion search correction | Missing; affected fact birth/death kernel executes. |
| S2 inverse smart-split signs, S3 null empty splits, S5 reverse smart-merge normalizers | Missing; affected smart entity kernels execute. |
| S4 log-weight normalization | Missing; shared weighted/Gibbs choices execute. |
| E1 entity-count factorial | Missing; affected entity split/merge kernels execute. |
| Related numerical/output/query repairs | Pre-repair source; applicability differs by computation, as detailed below. |

The [catalog](../../BUG_CATALOG.md) gives exact files, historical line references, formula corrections and regression evidence. S1 omitted search-success probabilities; S2/S5 miscomputed reverse entity proposal densities; S3 allowed an aborted proposal to change entity count; S4 could produce invalid normalized weights. These are confirmed implementation errors, but exposure does not establish their realized frequency or individual semantic-precision effects.

The E1 omission adds an unintended bias toward fewer entities after other proposal errors are repaired. The exact target π/N! is established for the post-five-fix baseline; this run still has those other defects, so it must not be asserted to preserve precisely π/N!.

Related issues include log-space MH acceptance, repeatable entity-ratio queries and near-zero relation-proposal arithmetic. The trigger-output observer bug affected `relation_triggers.txt`, not the evaluated MAP TSV; the world-taking wrong-alpha helper was not the active NYT fact-move overload. The burn-in query off-by-one did not filter NYT MAP observations. Empty-corpus and 1–9-iteration progress failures are not causes of this completed nonempty 20/980-iteration run.

The run has beta=0.1 and pool 400. Its beta choice, pool-dependent prior, latent entity model, unseeded components and finite budget remain separate limitations. The MAP TSV was checked for completeness and score consistency in the saved audit; this provenance check concerns the raw MAP output. Its semantic evaluation reports and grading data have been retired; the raw output and bug evidence remain.

## Supporting history

[Bug catalog and source locations](../../BUG_CATALOG.md) · [Historical pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) · [Five-family corrections](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) · [Entity factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md)

These are descriptions of saved implementations and evidence. No fixes, tests, simulations or semantic rejudgments were performed for this organization. Beta is a separate model parameter, not a defect label.
