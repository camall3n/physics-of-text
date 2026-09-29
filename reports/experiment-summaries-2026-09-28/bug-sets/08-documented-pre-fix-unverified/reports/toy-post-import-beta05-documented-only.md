# Post-import toy inference-of-K, beta=0.5

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

Purpose: check whether the updated model merges wrote/authored and love/like while inferring the number of relations, and how the path dictionary prior changes that behavior.

**Evidence status: documented run/configuration, raw output unavailable.** [CHANGES.md](../../../../../resources/sampler-140626/CHANGES.md) and [HANDOFF.md](../../../../../HANDOFF.md) describe this experiment, but the checkout has no preserved post-import trace, complete MAP, stdout/run manifest or fact annotation set for it. The imported all-poss-facts folders are older runs and cannot fill this gap. No inference or evaluation was regenerated.

Configuration reported in CHANGES: ten-sentence [toyTriples.json](../../../../../resources/sampler-140626/data/06-19/toyTriples.json), two intended relations, relation pool eight, integrated sparsity Beta(1,64), beta=0.5. The description references [config-toy.json](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/config-toy.json) plus overrides. That saved base config has two relations, eight entities, 5,000 iterations, alpha 0.01 and constant sparsity 0.1; it is not an exact manifest of the reported override run. Exact iteration/phase budget, seed, runtime and initialization for this configuration are not preserved.

Reported result: posterior mass moved to two or three expressed relations and both intended lexical merges appeared. The claim is qualitative behavior from an implementation log, not a computed result verified from saved draws in this task. The log gives no semantic precision denominator, confidence interval or complete posterior histogram. It does not establish gold recall or convergence.

This is an early updated run after relation-count/Beta-sparsity support was added, before the later 2026-09-11 sampling corrections. Inherited entity-proposal/log-normalization defects and the update's bounded-search fact-deletion correction error therefore remain relevant to interpretation; the exact producing revision is not bound by a manifest. The inferred-count pool also changes the target prior. Entity inference in this implementation is latent; no evidence establishes noun-string freezing, and noun-aware initialization—if present at that specific revision—would not itself freeze entities.

Current role: documentation-only motivation for beta sensitivity, separate from both archived toy fixtures and corrected saved NYT runs. The result is not independently reviewable from raw output. No cleanup conclusion is drawn.
