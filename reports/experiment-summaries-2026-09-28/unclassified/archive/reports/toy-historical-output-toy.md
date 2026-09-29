# Archived output-toy ten-sentence toy run

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: exercise entity aliases and the intended wrote/authored and love/like relation groupings on the small synthetic corpus.

Location: [output-toy](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy). Primary artifacts are [map_world.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy/map_world.txt) and [logprobs.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy/logprobs.txt); [entity_mentions.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy/entity_mentions.txt) and [relation_triggers.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy/relation_triggers.txt) are companion snapshots. [map_world_mentions.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-toy/map_world_mentions.txt) is a same-MAP entity view, not a new run.

The MAP contains ten sentence rows and two relation headers, grouping five wrote plus one authored row, and two love plus two like rows. Surface names include A/A2, B/B2 and G/G2 aliases. Its first-line score is -89.33916642828827, equal to the maximum of 2,000 stored observations in each of five channels (total, facts, args, origin, collapsed_trigs); final total is -109.14193787622419. Relation grouping is visible, but no independently scored semantic precision/recall or complete probabilistic validation is present.

The exact command/configuration, alpha/beta, sparsity, initial entity count, phase allocation, seed and runtime are not bound to this directory. The nearby config-toy.json currently says two relations, eight entities, 5,000 iterations, alpha=beta=0.01 and sparsity=0.1; that does **not** prove these settings produced the 2,000-observation files. Latent IDs join aliases in the MAP, so noun identity is not frozen per distinct surface form. The exact initialization and freeze policy remain unrecorded.

The files were imported with the June-2014 archive; no exact command, seed or source snapshot binds them to a producing revision. Archive code had an incomplete relation joint and entity/state/proposal/normalization defects, as documented in [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) and [the code audit](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md). Their impact on this individual earlier output is not recoverable. These outputs predate the update's inferred-count prior and newly introduced fact-deletion move; they are not evidence for the corrected 2026 sampler.

This directory and toy-output have different trace contents and scores, so they are distinct saved output families.  The legacy trigger observer could overwrite a better trigger state; trigger and entity listings need not be the full-joint MAP.

Current role: historical toy smoke evidence of intended lexical grouping and entity alias behavior. It is not the later post-import beta sensitivity experiment and does not validate the corrected sampler. Original files were only read.
