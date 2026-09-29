# Archived alpha1-rel100 output nested below toy-output

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: preserve the separately identifiable 100-relation historical output. Despite its location, its content is NYT-style dependency paths, **not the ten-sentence wrote/love toy**.

Location: [toy-output/alpha1-rel100](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/toy-output/alpha1-rel100). The [MAP text](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/toy-output/alpha1-rel100/map_world.txt) has 100 relation headers, many empty, dependency-path histograms and latent fact IDs, but no sentence rows or surface-name evidence. [logprobs.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/toy-output/alpha1-rel100/logprobs.txt) has 1,000 observations in each of five channels (total, facts, args, origin, collapsed_trigs). MAP score -3239.420902143145 equals max(total); final total is -3259.0729199324733.

The path “alpha1-rel100” suggests a parameter label and 100 relation slots, but a name is not a configuration record. Exact corpus, row count, alpha/beta, sparsity, initial entities, update schedule and seed are unknown. Commented source references in [EntityExperimentTest.java](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/experiments/EntityExperimentTest.java) mention output/alpha1-rel100 with 100 relations and alpha 0.1, but do not bind this artifact to those settings. The discrepancy is left unresolved rather than assuming alpha=1 from the folder name.

Entity initialization/freeze mode is unknown; printed latent entity IDs without surface names do not establish a verbatim entity model. No semantic annotation population, precision/recall, complete partition or convergence evidence is available. The displayed score is not semantic accuracy.

The files were imported with the June-2014 archive; no exact command, seed or source snapshot binds them to a producing revision. Archive code had an incomplete relation joint and entity/state/proposal/normalization defects, as documented in [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) and [the code audit](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md). Their impact on this individual earlier output is not recoverable. These outputs predate the update's inferred-count prior and newly introduced fact-deletion move; they are not evidence for the corrected 2026 sampler.

Current role: a distinct historical trace/MAP family with weak configuration provenance, useful for preventing accidental classification as a toy run or a corrected pool-size experiment. No rerun, code changes or cleanup were performed.
