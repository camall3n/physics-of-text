# Optional sentence/relation bridge: reversibility validation and finite-budget diagnostic

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The isolated bridge is a same-target proposal intended to separate distinct predicates attached to one entity pair. It is not a probability-model repair. The saved exhaustive audit passes; the two beta=0.1 full-NYT bridge runs show no consistent semantic-precision benefit at the fixed total relation budget.

## Proposal and exact validation

Existing fact moves transport an entire sentence bundle, and ordinary sentence Gibbs can move only to an already existing fact. A birth/death proposal must hit one of N²M possible facts to create a needed second fact. The bridge selects a sentence uniformly and a relation slot uniformly, creates the corresponding same-argument fact if absent, moves the selected sentence, and deletes the source fact only if that sentence was its last reference. Selecting the same sentence and old relation reverses the move. Both selection probabilities are 1/(SM), so acceptance is min(1,pi(new)/pi(old)).

A target fact that already exists but is unreferenced must be rejected without mutation; otherwise reversal could delete pre-existing latent state. Current-slot choices are null. The log ratio changes only two trigger histograms, relevant fact probabilities, occupied relation count, and uniform reporting; noun assignments remain fixed.

The archived exhaustive check covers 9,216 two-sentence states across both sparsity models plus two three-sentence fixtures. It records 10,242 allowed proposals/reverses and 8,192 forbidden unreferenced-target cases. Full transition rows, including rejection/null choices, normalize. Direct scalar oracle and WorldProb ratios, reversal, unchanged unreferenced facts and indexes agree across 375,864 assertions; maximum numerical error is 7.993605777301127e−15. These are deterministic enumerations, not Monte Carlo precision estimates.

## Full-NYT diagnostic

Only verbatim_beta01_bridge_seed20260912 and seed20260913 enable weight 1. Both freeze all identities, use beta=0.1, alpha=0.001, maxRels=400, 980×2,000 relation proposals and no entity proposals. Weight 1 reduces the fraction assigned to existing kernels while retaining 1,960,000 total relation proposals. The entity factorial correction is absent from their controlled source; the defect remains dormant under freezing.

| Seed | Bridge expressed relations / facts | Complete top-20 N | S / E / A | Complete census precision | Matched no-bridge precision |
| --- | --- | --- | --- | --- | --- |
| 20260912 | 200 / 1,302 | 727 | 463 / 210 / 54 | 63.69–71.11% | 66.12–74.83% |
| 20260913 | 199 / 1,336 | 742 | 454 / 229 / 59 | 61.19–69.14% | 66.15–73.43% |

These are complete per-run census populations, not the older 100-fact weighted screens. Predicates and population membership differ. Both matched no-bridge runs reached higher best log joint under the same target. This does not prove bridge moves intrinsically harm inference; proposal allocation, finite trajectories and mixing matter. No convergence was demonstrated, and no bridge arm at beta=0.001 was saved.

## Interpretation and reproducibility

The bridge passes a bounded exact reversibility audit while its tested weight offers no established practical gain. Retain its source, probe, outputs and both seeded runs as distinct evidence; correctness and semantic outcomes answer different questions.

## Evidence and cleanup dependencies

[Derivation](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/kernel_audit.md) · [Bridge implementation](../../../experiments/nyt-precision-investigation-2026-09-12/variants/controlled/src/main/java/org/ucb/generative_ie/mcmc/SentenceRelationBirthDeathMove.java) · [Probe](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/SentenceRelationBridgeProbe.java) · [Saved output](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/SentenceRelationBridgeProbe.txt) · [Complete census](../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.json) · [Run 12](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912) · [Run 13](../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260913). Exact restart dependencies are recorded in each run manifest; the probe also needs the frozen baseline/classes and dependency JAR.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
