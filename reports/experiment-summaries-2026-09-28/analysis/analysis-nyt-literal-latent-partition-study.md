# Six saved NYT worlds: literal-pair and latent-fact partition diagnostics

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The saved diagnostic compares both seeds of corrected latent beta=0.001, paired corrected latent beta=0.1, and fixed-name beta=0.001. It uses the same 8,516 rows, maxRels=400, no bridge and seeds 20260912/20260913. It analyzes existing MAP assignments without generating new inference states or semantic judgments.

## Units and exact accounting

L is the number of distinct ordered literal pairs; G counts distinct (relation,literal pair) groups; F counts expressed latent (relation,entity1,entity2) facts; A counts observed group–fact associations. One literal pair may split across facts; one fact may combine literal pairs. The checked identity is F−G=(A−G)−(A−F). Counts are diagnostic flags, not errors or recall.

| Condition / seed | Relations | L | G | F | Groups with >1 fact | A−G | Facts with >1 literal pair | A−F |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Corrected latent beta=.001 / 12 | 399 | 920 | 2,770 | 2,773 | 103 | 113 | 106 | 110 |
| Corrected latent beta=.001 / 13 | 398 | 920 | 2,868 | 2,861 | 91 | 99 | 102 | 106 |
| Corrected latent beta=.1 / 12 | 275 | 920 | 2,095 | 2,113 | 120 | 153 | 124 | 135 |
| Corrected latent beta=.1 / 13 | 288 | 920 | 2,172 | 2,195 | 113 | 148 | 118 | 125 |
| Fixed beta=.001 / 12 | 398 | 920 | 1,929 | 1,929 | 0 | 0 | 0 | 0 |
| Fixed beta=.001 / 13 | 400 | 920 | 1,942 | 1,942 | 0 | 0 | 0 | 0 |

The beta reduction adds 660/666 latent facts but 675/696 relation/literal groups, while within-group split excess falls by 40/49 and multiple-literal-pair excess falls by 25/19. Thus most additional facts arise across relation assignments, not increased within-relation duplication of a literal pair. Mean full-corpus relations per literal pair rises 2.277→3.011 and 2.361→3.117 in the paired latent runs.

## Top-20 selection and overlap

| Condition / seed | Rows | Row coverage | Literal pairs | Facts |
| --- | --- | --- | --- | --- |
| Corrected latent beta=.001 / 12 | 1,546 | 18.2% | 346 | 421 |
| Corrected latent beta=.001 / 13 | 1,521 | 17.9% | 338 | 436 |
| Corrected latent beta=.1 / 12 | 5,299 | 62.2% | 745 | 1,184 |
| Corrected latent beta=.1 / 13 | 5,303 | 62.3% | 759 | 1,197 |
| Fixed beta=.001 / 12 | 1,824 | 21.4% | 342 | 384 |
| Fixed beta=.001 / 13 | 1,583 | 18.6% | 307 | 364 |

Top relations are selected separately by row count, ties by numeric ID. Literal-pair Jaccard overlap of new low-beta latent top 20 versus paired beta=.1 is 41.7%/41.4%, and versus fixed low-beta 51.5%/49.3%. These do not match relation meanings or entity identities and are not precision/recall. The later complete coverage evaluation extends these same four low-beta worlds to 57–90% row coverage; it does not change the partition counts.

## Interpretation and limits

Low beta yields more expressed facts overall while selecting fewer rows and literal pairs in the top 20. A higher selected fact-precision score therefore does not establish more correct discoveries or better whole-corpus accuracy. Fixed names make G=F by construction; latent identities permit both splitting and merging. Legitimate aliases and homonymous names prevent interpreting every multiplicity as an error. All six worlds share 7,732 distinct observed triples and 784 repeated rows; those repetitions are separate from group–fact multiplicity.

The saved diagnostic checks MAP hashes, identical row order, configuration mode/beta, a hand-specified bipartite fixture, accounting identities and frozen one-to-one mapping. Its JSON preserves histograms, per-relation metrics, largest multiplicity examples and TSV line references. No MCMC convergence, semantic correctness or unique-fact recall follows from these checks.

## Evidence and cleanup dependencies

[Diagnostic narrative](../../../experiments/nyt-latent-low-smoothing-2026-09-14/analysis/partition_diagnostics.md) · [Full diagnostic output](../../../experiments/nyt-latent-low-smoothing-2026-09-14/analysis/partition_diagnostics.json) · [Diagnostic script](../../../experiments/nyt-latent-low-smoothing-2026-09-14/scripts/partition_diagnostics.mjs) · [Latent low-beta runs](../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs) · [Paired earlier runs](../../../experiments/nyt-precision-investigation-2026-09-12/runs) · [Latest coverage evaluation](../../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.json). Preserve all six MAP TSVs and source/config hashes, shared corpus, script and JSON with examples; population comparisons cannot be reconstructed from headline precision alone.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
