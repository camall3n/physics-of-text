# Entity multiplicity defect: counterexample and exact partition-chain experiment

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The saved exact experiments establish a missing entity-count factorial ratio: the pre-correction smart kernels preserve pi/N! rather than the stated partition density pi. The isolated correction adds log(N+1) for splits and subtracts log(N) for merges. This is an implementation defect, distinct from choosing a different entity or relation prior.

## Target and experiments

For J observed mention positions partitioned into K nonempty entities out of N available objects, the stated entity-phase density is proportional to g(N) N^(−J) [N!/(N−K)!] times the collapsed noun likelihoods. Empty entities contribute proposal multiplicities; adding the full falling factorial naively to one stored component would be wrong. The correction is to the complete accepted transition.

| Saved check | State space / observation | Result |
| --- | --- | --- |
| Minimal forced split | One noun, one sentence/two mentions; (N,K)=(1,1) → (2,2); q_forward=1/4, q_reverse=1/2 | Old acceptance 0.13902598; required 0.27805196 |
| Exact projected chain | Seven (N,K) states, J=2, one noun, N=1…4; both actual smart proposal classes plus mention Gibbs | Old detailed-balance residual against pi 0.031219999; against pi/N! 1.38778e−17; corrected against pi 1.38778e−17 |
| Exact partition chains | 38 states per noun sequence 0011, 0101, 0001; four distinct mention positions, 15 set partitions embedded at allowable N≤4 | Old pi/N! residual <6.3e−17; pi residual up to 0.0351; compiled corrected pi residual <4.9e−17 |
| Saved regression/replay | Corrected variant, 91 JUnit tests and two latent/two frozen separate-JVM toy runs | Pass; exact replay recorded |

The 38-state tests enumerate every parent, allocation, ordered merge, mention/target Gibbs outcome, rejection and null move, including empty objects. Transition rows normalize. Their independent target uses scalar rising products and directly counted mentions, not WorldProb/ModelFunctions. The N≤4 truncation is symmetric and confined to the harness; it is not an NYT model cap. This finite enumeration is deterministic, not a sampled precision trial.

## Provenance, implication and limits

The omitted term is present in the imported June 2014 source at commit 9489d21ee6797a7b4ccc71f1f46f1c27af7da31b. That establishes inherited omission; the original tar hash is unavailable and the import is not verified as the exact 2016 paper implementation. The old invariant-density proof concerns the baseline after the five prior repair families, not every uncorrected archived kernel.

Near N≈1,000 the unintended extra penalty is about 6.9 log units per added entity. Removing it changes pre-clipping split/merge ratios by roughly a thousand, but clipped acceptance probabilities need not change by that factor. Only the two smart entity files differ in production between controlled and entityfix variants. The fix is active in four modern latent runs, absent in two controlled latent baselines, and dormant/absent in six frozen controlled runs. Low beta and frozen identities are model choices, not extra arithmetic repairs.

Exact entity-phase balance does not prove the subsequent two-phase NYT algorithm is stationary for a single full joint, that it converges at the saved budget, or that it attains high semantic precision. The modern census documents no restoration of paper-level precision from this fix alone; early 100-fact screens in the derivation are superseded for comparable results by the later complete census.

## Evidence and cleanup dependencies

[Full derivation and provenance](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) · [Archive provenance](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_archive_provenance.json) · [Probe source/output directory](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit) · [Corrected partition output](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/EntityPartitionChainProbe-fixed.txt) · [Isolated variant](../../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/README.md). Preserve baseline and corrected source, Java probes, both old/new numerical outputs, compile log/classes, runner, JAR and validation bundles; recorded Java is 25.0.4.1.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
