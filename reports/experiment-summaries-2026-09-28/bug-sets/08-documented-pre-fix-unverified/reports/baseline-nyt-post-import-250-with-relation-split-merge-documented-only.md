# Post-import NYT 250-row run: relation split/merge enabled

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

Purpose: test whether relation split/merge reduces fragmentation compared with fact moves alone.

**Evidence status: documented run/configuration, raw output unavailable.** [CHANGES.md](../../../../../resources/sampler-140626/CHANGES.md) and [HANDOFF.md](../../../../../HANDOFF.md) describe this experiment, but the checkout has no preserved post-import trace, complete MAP, stdout/run manifest or fact annotation set for it. The imported all-poss-facts folders are older runs and cannot fill this gap. No inference or evaluation was regenerated.

The saved [config-250-inferK.json](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/config-250-inferK.json) specifies numRels 10, maxRels 40, 265 initial entities, 3,000 iterations, alpha 0.001, beta 0.1 and Beta(1,70,225) sparsity (fallback sparsity 0.001). Input [pluieTriples-1.json](../../../../../resources/sampler-140626/data/06-19/pluieTriples-1.json) has 250 rows, 265 nouns and 30 paths. No stepsPerIteration/entityFraction override is in that config; current defaults cannot by themselves certify the historical invocation. Seed and exact source snapshot are missing. The comparison does not give a separate verified runtime.

CHANGES reports **22–26 expressed relations, described as settled by iteration 300**, best total log probability **-4454**. President-of joined into 32 sentences; director-of still split 19+18. Reported acceptance was 46% splits and 51% merges. Works-at variants and chairman/spokesman lexical forms also merged. These figures are preserved implementation-note claims, not recomputed metrics from existing raw output. “Settled” in a narrative is not a convergence diagnostic. No fact-by-fact semantic precision, complete assessment population, sampled estimator or gold recall exists for this run.

These configurations belong to the 2026 implementation before the later sampling corrections. The bounded-search fact-deletion error introduced with the update, inherited entity proposal/normalization bugs and pool-dependent count prior all qualify interpretation. Exact initialization is not linked to a run artifact. The entity model is latent; a noun-based starting state must not be called frozen verbatim entities.

The [archived output-250](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-250) has 15 relation headers and an older 10,000-observation trace; it is a different experiment, including the later supplemental evaluation of that archived MAP. Current role: documentation-only report of the split/merge development comparison. No run, tests, artifact replacements or cleanup were performed.
