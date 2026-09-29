# Historical selected NYT cluster and fact listings

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Purpose: preserve selected relation examples and partial annotation marks used for historical qualitative comparison. This is one output/annotation family, not a set of independently established runs.

| Artifact | Saved content |
|---|---|
| [results/clusters_with_facts.txt](../../../../../resources/sampler-140626/results/clusters_with_facts.txt) | 208 fact entries, 23 distinct printed relation IDs, 150 trigger entries |
| [McCallum copy](../../../../../resources/sampler-140626/results/McCallum-corpus-sub/clusters_with_facts.txt) | Byte-identical copy of the preceding file |
| [clusters_with_facts.log](../../../../../resources/sampler-140626/results/clusters_with_facts.log) | Edited selection: 201 facts, 23 printed relation IDs, 145 triggers |
| [cluster_facts_sample.txt](../../../../../resources/sampler-140626/results/cluster_facts_sample.txt) | Eight selected labeled sections, 71 facts, 40 triggers |
| [cluster_facts_sample_all.txt](../../../../../resources/sampler-140626/results/cluster_facts_sample_all.txt) | Byte-identical copy of the preceding sample |

The .txt full selection has seven exact (printed relation, name1, name2) entries absent from the .log and no reverse-only entries. Hand-added section labels, a repeated cluster14 label and inconsistent within-section printed fact IDs prevent treating either as an authoritative full partition. The two duplicate pairs are copies, not new runs or independent evaluations.

The [archive comparison](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/archived_comparison.md) and [pair-by-pair mapping](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/archived_fact_pairs.md) establish that all 208 selected ordered name pairs occur in the 2026 TSV. This is pair presence, not matched fact labels or clustering accuracy. Different relations can hold for the same pair. Neither a complete old sentence partition nor a complete gold fact set is available.

The 71 sample facts contain 15 numeric “1” marks, one “0.5”, 50 unmarked entries and five “#” entries. No complete legend or denominator survives. Thus **there is no defensible full or sampled precision percentage**; treating blanks or # marks as successes/failures would invent a scoring rule. The old subsidiary rel_23 has ten selected examples and five paths, including New York → BBDO Worldwide; these are not the paper's complete 60 facts and are not independently validated truths.

Full configuration, seed, exact corpus assignment, producing code and entity-freeze policy are unknown. These are original-archive-era selections, predating the 2026 update and fixes. Source defects are documented in [CHANGES](../../../../../resources/sampler-140626/CHANGES.md), but their prevalence in the producing trajectory cannot be inferred from edited examples. The later fact-deletion and count-prior updates should not be projected onto these selections.

Current role: historical examples, annotation-provenance evidence and derived comparisons. The existence of good examples does not reproduce the paper's roughly 95% score. No reruns, reannotation or cleanup were performed.
