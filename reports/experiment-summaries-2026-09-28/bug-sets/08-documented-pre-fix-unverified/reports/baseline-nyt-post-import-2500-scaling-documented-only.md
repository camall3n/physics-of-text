# Post-import NYT 2,500-row scaling run

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

Purpose: verify that entity-phase performance fixes make the intermediate NYT corpus computationally practical.

**Evidence status: documented run/configuration, raw output unavailable.** [CHANGES.md](../../../../../resources/sampler-140626/CHANGES.md) and [HANDOFF.md](../../../../../HANDOFF.md) describe this experiment, but the checkout has no preserved post-import trace, complete MAP, stdout/run manifest or fact annotation set for it. The imported all-poss-facts folders are older runs and cannot fill this gap. No inference or evaluation was regenerated.

[HANDOFF.md](../../../../../HANDOFF.md) reports [pluieTriples_fgreptest4.json](../../../../../resources/sampler-140626/data/06-19/pluieTriples_fgreptest4.json), 2,500 sentences, 1,258 noun strings, relation pool 150, 2,000 iterations of 50 moves, completing in under three minutes after entity-phase performance fixes. The report does not preserve an exact run manifest, alpha/beta, prior centre, sparsity, phase fraction, initial entity count, seed, MAP relation count or semantic assessment. Do not equate noun count with configured or final entity count.

The purpose concerns removal of unused huge fact-variable allocation, repeated noun-dictionary draws and eager debug-string construction. It belongs to early post-import development, not an independently verified corrected posterior sample. The later sampling audit established inherited entity proposal/normalization defects, the update's fact-deletion correction error, and a separate pool-dependent count-prior mismatch. Without the specific source/config snapshot, their incidence and effect in this timing run cannot be quantified.

The entity phase reportedly merged little because its noun-only model lacks name similarity. This observation does not make entities frozen per noun: initialization, latent updates and freezing are distinct choices. Exact initialization for this invocation is unrecorded.

No complete or sampled precision, gold recall, convergence analysis or saved world is available. The [archived output-2500](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-2500) instead has 50 relation headers and 10,000 score observations, with truncated MAP examples. It is not the output of this pool-150 timing run.

Current role: documentation-only historical scalability claim and provenance gap; no benchmark, inference, tests or cleanup were performed.
