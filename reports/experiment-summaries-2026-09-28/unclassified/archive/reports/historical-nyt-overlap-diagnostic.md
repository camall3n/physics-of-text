# Historical sentence-overlap diagnostic

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: saved numerical/plot family relating the number of sentences to a quantity labeled P(Overlap), rather than a relation-discovery partition.

Artifacts: [results/overlap.data](../../../../../resources/sampler-140626/results/overlap.data), its [McCallum-corpus-sub copy](../../../../../resources/sampler-140626/results/McCallum-corpus-sub/overlap.data), and [p-overlap.png](../../../../../resources/sampler-140626/results/p-overlap.png). The two .data files are byte-identical (SHA-256 `359a2daea35e4a1ca4f27f7986059eb72a92c6600926aa44a3bd827c6e12ef8e`) and count as one table, not two experiments.

The table has 2,144 rows: first (1, 1.013279e-6), last (2144, 0.98996496). Visual inspection of the existing PNG shows title “Number of Sentences VS Overlap”, x-axis “Number of Sentences” and y-axis “P(Overlap)”, with a smooth increasing curve. The name and image do not identify the exact probability model, fitted parameters, corpus, seed, code revision or generation procedure. No link to a particular McCallum trajectory is established.

This is not semantic precision, fact recall, posterior relation count or a repeated inference run. Full/sampled semantic evaluation and entity initialization/freezing are not applicable to the saved table alone. Original-vs-updated sampler defects cannot be assigned to an unknown generating computation. It is an imported supporting diagnostic, and the identical copy provides no replication evidence.

Current role: historical supporting visualization whose mechanism/provenance remains incomplete. The plot was inspected, not regenerated; no original artifact was changed.
