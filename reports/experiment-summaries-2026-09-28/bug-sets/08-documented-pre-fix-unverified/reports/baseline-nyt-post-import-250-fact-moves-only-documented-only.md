# Post-import NYT 250-row run: fact moves only

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

Purpose: evaluate the new fact moves and inferred relation count on a small NYT slice.

**Evidence status: documented run/configuration, raw output unavailable.** [CHANGES.md](../../../../../resources/sampler-140626/CHANGES.md) and [HANDOFF.md](../../../../../HANDOFF.md) describe this experiment, but the checkout has no preserved post-import trace, complete MAP, stdout/run manifest or fact annotation set for it. The imported all-poss-facts folders are older runs and cannot fill this gap. No inference or evaluation was regenerated.

The saved [config-250-inferK.json](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/config-250-inferK.json) specifies numRels 10, maxRels 40, 265 initial entities, 3,000 iterations, alpha 0.001, beta 0.1 and Beta(1,70,225) sparsity (fallback sparsity 0.001). Input [pluieTriples-1.json](../../../../../resources/sampler-140626/data/06-19/pluieTriples-1.json) has 250 rows, 265 nouns and 30 paths. No stepsPerIteration/entityFraction override is in that config; current defaults cannot by themselves certify the historical invocation. Seed and exact source snapshot are missing. CHANGES reports about five minutes.

CHANGES reports **24–28 expressed relations, still drifting downward**, best total log probability **-4489**. President-of remained split into 21 and nine sentence clusters. CHANGES reports director-of 25, chairman-of 25 and leader-nn 39 among recognizable clusters. These figures are preserved implementation-note claims, not recomputed metrics from existing raw output. “Settled” in a narrative is not a convergence diagnostic. No fact-by-fact semantic precision, complete assessment population, sampled estimator or gold recall exists for this run.

These configurations belong to the 2026 implementation before the later sampling corrections. The bounded-search fact-deletion error introduced with the update, inherited entity proposal/normalization bugs and pool-dependent count prior all qualify interpretation. Exact initialization is not linked to a run artifact. The entity model is latent; a noun-based starting state must not be called frozen verbatim entities.

The [archived output-250](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-250) has 15 relation headers and an older 10,000-observation trace; it is a different experiment, including the later supplemental evaluation of that archived MAP. Current role: documentation-only baseline for the split/merge development comparison. No run, tests, artifact replacements or cleanup were performed.
