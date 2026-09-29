# Higher-level toy MAP and execution-log remnants

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: describe the toy-related remnants outside the named all-poss-facts output directories without inventing links between unmatched files.

Artifacts are in [test/Entity_resolution_Relation](../../../../../resources/sampler-140626/test/Entity_resolution_Relation):

- [map_world.txt](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/map_world.txt): ten sentences, two relation groups (wrote/authored and love/like), score -51.643906831163164, with latent aliases joined. It is not byte-identical to the nested toy-output MAP but shares its score and relation grouping. A different relabeling/object identity does not prove an independent stochastic run.
- [toy.log](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/toy.log): explicitly names ../../data/06-19/toyTriples.json and an unsaved config.json, reporting seven entities, two relations, alpha/beta 0.01, sparsity 0.1, 1,000 iterations, 11 nouns, four paths, seven name pairs, ten sentences and 3.2829182 seconds elapsed.
- [err.log](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/err.log): ten progress lines 0–900 of 1000, with no further identity; it could accompany toy.log, but the association is not proven.

These are one incompletely linked provenance family, not three counted experiments. The top-level MAP cannot be confidently assigned to toy.log merely by adjacency: no matching trace or source hash is retained and the configuration is incomplete. The nearby config-toy.json instead specifies eight initial entities and 5,000 iterations; it must not overwrite the log's distinct settings.

The MAP demonstrates latent alias merging, not per-name entity freezing. Exact initialization, seed, producing revision and freeze controls are unknown. The files are original archive artifacts, prior to the 2026 code reconstruction/corrections; archive probability/entity defects documented in [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) limit posterior interpretation. No semantic precision, recall or independent evaluation set is stored.

The extensionless [wangw@big](../../../../../resources/sampler-140626/test/Entity_resolution_Relation/wangw@big) is configuration-shaped text (100 relations, 3,000 entities, 50,000 iterations, alpha=beta=0.001, sparsity=0.001), not an experiment result. config-8000.json differs in sparsity (0.0001). [Entity_map/data/toyTriplesEntities.json](../../../../../resources/sampler-140626/test/Entity_map/data/toyTriplesEntities.json) and test/entities.json are input/supporting data; no Entity_map output or mentionclustering output was found in this checkout.

Current role: evidence of toy execution/configuration and an unpaired MAP artifact. The grouping is intentionally provenance-limited; no rerun, tests or cleanup were performed.
