# Literal-pair and latent-fact partition diagnostics

This comparison uses six saved MAP worlds on the same **8,516 observed rows**: the two new corrected latent-entity runs at `beta=0.001`, the paired corrected latent runs at `beta=0.1`, and the previous verbatim/frozen runs at `beta=0.001`. All use `maxRels=400` and no sentence/relation bridge. The latent pair changes only beta; the frozen reference also disables entity inference, so it is a different modeling/inference condition.

These are **diagnostic counts, not errors, recall or correctness**. A latent fact is an ordered `(relation, entity1, entity2)` tuple; a literal pair is the exact ordered `(arg1, arg2)` strings. Alias normalization is not applied. Only facts expressed by at least one row are counted.

## Full-corpus counts

| Condition | Relations | Literal pairs L | Relation/literal groups G | Latent facts F | Groups with >1 latent fact | Excess latent associations A−G | Facts with >1 literal pair | Excess literal associations A−F |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| corrected latent beta=0.001, seed 12 | 399 | 920 | 2770 | 2773 | 103 | 113 | 106 | 110 |
| corrected latent beta=0.001, seed 13 | 398 | 920 | 2868 | 2861 | 91 | 99 | 102 | 106 |
| corrected latent beta=0.1, seed 12 | 275 | 920 | 2095 | 2113 | 120 | 153 | 124 | 135 |
| corrected latent beta=0.1, seed 13 | 288 | 920 | 2172 | 2195 | 113 | 148 | 118 | 125 |
| verbatim/frozen beta=0.001, seed 12 | 398 | 920 | 1929 | 1929 | 0 | 0 | 0 | 0 |
| verbatim/frozen beta=0.001, seed 13 | 400 | 920 | 1942 | 1942 | 0 | 0 | 0 | 0 |

## Top-20 counts and coverage

The top 20 relations are selected separately within each run by observed-row count (ties by numeric relation ID). Thus top-20 membership and the fact population can change across conditions.

| Condition | Rows (% of corpus) | Literal pairs (% of full) | Latent facts (% of full) | Relation/literal groups | Groups with >1 latent fact | Excess latent associations | Facts with >1 literal pair | Excess literal associations |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| corrected latent beta=0.001, seed 12 | 1546 (18.2%) | 346 (37.6%) | 421 (15.2%) | 403 | 25 | 28 | 9 | 10 |
| corrected latent beta=0.001, seed 13 | 1521 (17.9%) | 338 (36.7%) | 436 (15.2%) | 443 | 17 | 19 | 24 | 26 |
| corrected latent beta=0.1, seed 12 | 5299 (62.2%) | 745 (81.0%) | 1184 (56.0%) | 1112 | 106 | 139 | 63 | 67 |
| corrected latent beta=0.1, seed 13 | 5303 (62.3%) | 759 (82.5%) | 1197 (54.5%) | 1140 | 101 | 133 | 72 | 76 |
| verbatim/frozen beta=0.001, seed 12 | 1824 (21.4%) | 342 (37.2%) | 384 (19.9%) | 384 | 0 | 0 | 0 | 0 |
| verbatim/frozen beta=0.001, seed 13 | 1583 (18.6%) | 307 (33.4%) | 364 (18.7%) | 364 | 0 | 0 | 0 | 0 |

“Excess latent associations” counts additional distinct latent facts inside the same relation and literal pair, not repeated sentence rows. Write A for the number of distinct observed group–fact associations. A group linked to k latent facts contributes k−1 to A−G. A latent fact supported by k literal pairs contributes k−1 to A−F. The independently checked identity is **F−G=(A−G)−(A−F)**. Both phenomena can coexist, so comparing F and G alone can hide their cancellation.

## Fragmentation across relations

A literal pair can legitimately express multiple predicates; assigning it to several relation IDs is therefore a fragmentation flag rather than a demonstrated duplicate or error.

| Condition | Full: pairs in >1 relation | Full: mean relations per literal pair | Top 20: pairs in >1 relation | Top 20: mean relations per literal pair |
|---|---:|---:|---:|---:|
| corrected latent beta=0.001, seed 12 | 788 | 3.011 | 56 | 1.165 |
| corrected latent beta=0.001, seed 13 | 783 | 3.117 | 83 | 1.311 |
| corrected latent beta=0.1, seed 12 | 666 | 2.277 | 285 | 1.493 |
| corrected latent beta=0.1, seed 13 | 666 | 2.361 | 294 | 1.502 |
| verbatim/frozen beta=0.001, seed 12 | 686 | 2.097 | 41 | 1.123 |
| verbatim/frozen beta=0.001, seed 13 | 684 | 2.111 | 51 | 1.186 |

## Top-20 population overlap

These intersections compare literal pairs appearing anywhere within each run’s top 20. They do not match relation meanings, assert entity equivalence, or form precision/recall measures. Jaccard is intersection divided by union.

| Seed | New corrected latent beta=.001 vs reference | Shared pairs | New only | Reference only | Jaccard |
|---|---|---:|---:|---:|---:|
| 12 | corrected latent beta=.1 | 321 | 25 | 424 | 41.7% |
| 12 | verbatim/frozen beta=.001 | 234 | 112 | 108 | 51.5% |
| 13 | corrected latent beta=.1 | 321 | 17 | 438 | 41.4% |
| 13 | verbatim/frozen beta=.001 | 213 | 125 | 94 | 49.3% |

In both paired latent comparisons, the lower-beta MAP has more total expressed facts while its top 20 cover far fewer rows and literal pairs. The top-20 row coverage falls from 62.2%/62.3% to 18.2%/17.9%, and literal-pair coverage falls from 81.0%/82.5% to 37.6%/36.7%. Across the full corpus, the mean relations per literal pair rises from 2.277/2.361 to 3.011/3.117.

The extra full-corpus facts are primarily accounted for by additional relation/literal-pair groups, rather than increased within-relation splitting of the same literal pair. The exact difference decomposition is delta(F)=delta(G)+delta(A−G)−delta(A−F):

| Seed | Extra latent facts | Extra relation/literal groups | Change in within-group split excess | Change in multiple-literal-pair excess |
|---|---:|---:|---:|---:|
| 12 | 660 | 675 | -40 | -25 |
| 13 | 666 | 696 | -49 | -19 |

## What changes precision comparability

The manual evaluation unit is a latent fact. If one `(relation, literal pair)` maps to several latent facts, that wording can contribute several evaluation units. Conversely, one latent fact supported by several literal pairs contributes one unit and can contain aliases, incompatible identities, or both. Neither pattern proves correctness or an implementation defect: identical names can denote different real entities, and distinct names can be aliases.

Low beta can split observations among more relation IDs. The top 20 can then cover fewer source rows and a different subset of literal pairs even when the whole corpus is unchanged. A higher precision estimate on that selected population would not show that more facts were recovered correctly or that performance improved over the full corpus. Within-relation entity fragmentation and across-relation predicate fragmentation are separate effects.

The frozen controls have a one-to-one mapping between relation/literal groups and latent facts by construction. The corrected latent runs permit both splitting and merging of literal names, so their denominators are not automatically comparable to the frozen runs. Relation IDs have no shared semantic meaning across runs and are not aligned here. The separately reviewed top-20 predicates and the limited sampling uncertainty remain necessary when interpreting precision differences.

Duplicate input evidence is another distinct issue. Across all six full-corpus worlds there are 7732 distinct exact `(arg1,arg2,path)` triples and 784 additional rows repeating such a triple. Those same repetitions occur in every condition. They are not counted as extra group–fact associations unless assignments differ, but they contribute likelihood weight and determine the row-based top-20 ranking. No source-document identity is available in this TSV, so an exact repeated triple is not asserted to be a duplicated original sentence.

## Reproduce and inspect

Run `node scripts/partition_diagnostics.mjs` from this experiment directory. The script writes only [partition_diagnostics.json](partition_diagnostics.json) and this report. JSON includes complete count histograms, each top-20 relation’s metrics, five largest split-group and multiple-literal-pair fact examples per scope, and source TSV line numbers. Examples are selected by multiplicity, not by a semantic judgment.

Validation checks the saved MAP hashes, all 8,516 observed triples in identical row order across six worlds, exact configuration mode/beta, a hand-specified bipartite fixture, group/fact accounting identities and the frozen one-to-one mapping. It does not establish convergence or semantic accuracy.
