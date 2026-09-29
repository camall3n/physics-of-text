# Historical NYT trigger output for the June-12 corpus

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: archived relation-discovery output on the different subset named in its header.

Primary artifact: [results/output.txt](../../../../../resources/sampler-140626/results/output.txt). It names `data/Umass-sub-corpus-06-12/pluieTriples_2013_06_12_3.json` and reports **4,484 nouns, 333 paths and 3,002 ordered argument pairs**. A source sentence count is not stated in this output; the later [archive-scope analysis](../../../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/archive_scope.md) identifies the referenced input as 3,357 rows. These inventories differ from the 2026 8,516-row run, so this file is not an exact rerun baseline for it.

Configuration evidence is limited to checkpoints 0, 1000, …, 9000 with denominator 10000. The file has 1,200 trigger entries over repeated displays and ends with unlabeled integers; neither those entries nor the integer tail establishes an occupied relation count, fact count, convergence result or semantic score. Full configuration, seed, runtime and update schedule are unknown.

Imported June-2014 archive artifact. Exact producing revision, seed, initialization and entity-freeze policy are not recorded. [CHANGES](../../../../../resources/sampler-140626/CHANGES.md) and [the historical code audit](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) establish bugs in the imported source (including an incomplete relation joint, entity/state defects and proposal/normalization errors), but cannot establish the impact of every bug on this earlier log. The update's later fact-deletion bug and pool/count-prior change did not belong to the original implementation.

No explicit fact entries, complete sentence partition or documented semantic annotations are saved. Precision/recall cannot be reconstructed. The [archive comparison](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/archived_comparison.md) classifies this separately from the McCallum outputs and selected cluster/fact lists; proximity in results/ does not establish a common run.

Current role: historical evidence of a different corpus/preprocessing experiment, useful for provenance and qualitative path inspection. It has no verified connection to the paper's published complete partition. No rerun, fixes or cleanup were performed.
