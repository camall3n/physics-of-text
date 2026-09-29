# Historical NYT McCallum subset output-1

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: archived relation-discovery experiment on subset 1; a distinct saved trigger-snapshot stream, not a complete fact partition.

Primary output: [McCallum-corpus-sub/output-1.txt](../../../../../resources/sampler-140626/results/McCallum-corpus-sub/output-1.txt). [The adjacent log](../../../../../resources/sampler-140626/results/McCallum-corpus-sub/log) identifies input `data/Umass-sub-corpus/pluieTriples_2013_01_06_1.json` and reports 116 sentences, 46 noun strings, 65 paths, 25 ordered argument pairs and timing `17.304s/17.814s`. This is a smaller input than the 2026 8,516-row NYT run. The slash-separated timing fields have no complete legend; do not choose one as a validated comparable wall clock.

The output prints checkpoints 0, 1000, …, 9000, each with denominator 10000, and 800 trigger entries over the ten displays. The entries are repeated path-weight displays, not 800 unique paths or relations. Complete configuration, relation pool, alpha/beta, sparsity, proposal count per iteration and seed are not established by this log. Eight displayed blocks at the last snapshot do not establish the occupied relation count. Nominal iterations cannot be equated with the 2026 run's 2,000 proposals per iteration.

There are no explicit fact entries or complete row-to-relation/entity assignments. Imported June-2014 archive artifact. Exact producing revision, seed, initialization and entity-freeze policy are not recorded. [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) and [the historical code audit](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) establish bugs in the imported source (including an incomplete relation joint, entity/state defects and proposal/normalization errors), but cannot establish the impact of every bug on this earlier log. The update's later fact-deletion bug and pool/count-prior change did not belong to the original implementation.

No full or sampled semantic precision estimate, gold recall, sentence purity or partition agreement can be recovered. Visible leadership/professional dependency patterns establish only qualitative output content. The [archive comparison](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/archived_comparison.md) documents completeness and corpus limitations.

Current role: historical subset evidence. Relation IDs/display positions and selected examples cannot establish identity with the paper's relation 46 / 60-fact run. Adjacent selected cluster lists and overlap.data are separate supporting families; they are not established as complete annotations of this trajectory.  No rerun or cleanup was performed for this summary.
