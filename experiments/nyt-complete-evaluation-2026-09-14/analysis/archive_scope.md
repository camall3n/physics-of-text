# Scope, archive completeness, and protocol comparison

The primary comparison contains **10 retained complete modern MAP states and 6,905 expressed facts in their top 20 relations**. Every state contains the same 8,516 observed NYT dependency-triple rows. The imported archives do not contain another complete MAP for that full corpus. They must remain a separate availability and qualitative-comparison appendix, with one possible complete **different-corpus** supplemental census.

All original sources were read without modification. [archive_scope.json](archive_scope.json) records directly calculated SHA-256 hashes, paths, every modern top-20 relation's population, archived file schemas and counts, and the protocol sources. This appendix assigns no semantic grades.

## Complete modern populations

| Saved result | Top-20 facts | Top-20 rows | Earlier review coverage |
|---|---:|---:|---|
| Sept12 `entityfix_latent_beta01_seed20260912` | 1,184 | 5,299 | 100 sampled facts |
| Sept12 `entityfix_latent_beta01_seed20260913` | 1,197 | 5,303 | 100 sampled facts |
| Sept12 `verbatim_beta01_seed20260912` | 735 | 5,368 | 100 sampled facts |
| Sept12 `verbatim_beta01_seed20260913` | 715 | 5,096 | 100 sampled facts |
| Sept12 `verbatim_beta01_bridge_seed20260912` | 727 | 5,034 | 100 sampled facts |
| Sept12 `verbatim_beta01_bridge_seed20260913` | 742 | 4,894 | 100 sampled facts |
| Sept12 `verbatim_beta0001_seed20260912` | 384 | 1,824 | 100 sampled facts |
| Sept12 `verbatim_beta0001_seed20260913` | 364 | 1,583 | 100 sampled facts |
| Sept14 `entityfix_latent_beta0001_seed20260912` | 421 | 1,546 | 100 sampled facts |
| Sept14 `entityfix_latent_beta0001_seed20260913` | 436 | 1,521 | 100 sampled facts |

The four active-defect NYT evaluations and original subsidiary review were retired; raw experiment outputs remain. [Cleanup record](../../../reports/buggy-evaluation-cleanup-2026-09-28/README.md). The filename token `beta0001` denotes numeric **0.001**, not 0.0001.

Modern files use the complete six-column TSV schema `relation, entity1, entity2, arg1, arg2, path`. A fact is an ordered run-local `(relation, entity1, entity2)` tuple. The count is not a count of unique literal name pairs, sentence rows, or independent historical propositions. These distinctions remain necessary even after every case has been read.

## Imported NYT archives

Paths below are relative to `resources/sampler-140626/`.

| Archive | Available material | What prevents an equivalent full-NYT census |
|---|---|---|
| `results/output.txt` | 1,200 trigger entries at ten checkpoints; input has **3,357 rows**, 4,484 nouns and 333 paths | Different corpus; no printed facts or complete partition. No matching complete saved MAP was found. |
| `results/McCallum-corpus-sub/output-1.txt` | Trigger-only log for 116 rows, 46 nouns, 65 paths | Different corpus; no facts or complete partition |
| `…/output-2.txt` | Trigger-only log for 223 rows, 89 nouns, 123 paths | Different corpus; no facts or complete partition |
| `…/output-3.txt` | Trigger-only log for 451 rows, 177 nouns, 204 paths | Different corpus; no facts or complete partition |
| `…/output-5.txt` | Trigger-only log for the same **8,516-row** corpus, 1,199 nouns and 4,276 paths | No facts, full relation ranking, or saved complete sentence-to-fact partition. Its last eight displayed trigger blocks do not establish eight total relations. |
| `results/clusters_with_facts.txt` | 208 selected fact entries across 23 printed IDs | Unknown selection rule and complete populations; no complete assigned evidence. Some edited sections contain inconsistent IDs. |
| `results/clusters_with_facts.log` | 201 selected entries across 23 printed IDs | Same limitations; seven entries in the `.txt` are absent here |
| `results/cluster_facts_sample.txt` | 71 selected entries across eight printed IDs | No complete population or annotation legend. The 15 `1`, one `0.5`, 50 unmarked and five `#` entries cannot reconstruct the reported precision. |
| `tmp/results.txt` | Trigger-only test log, 89 nouns, 123 paths, 50 argument pairs | Input path is not stated. Dimensions agree with the 223-row subset, but that alone does not prove corpus identity. No full partition. |

`results/McCallum-corpus-sub/clusters_with_facts.txt` is a byte-identical copy of `results/clusters_with_facts.txt`. `cluster_facts_sample_all.txt` is a byte-identical copy of `cluster_facts_sample.txt`. Do not count these duplicates as separate experiments. All 208 listed ordered name pairs occur somewhere in the modern input, which establishes corpus overlap, not relation correctness or an identical learned partition.

### Smaller complete and truncated MAP states

`test/Entity_resolution_Relation/all-poss-facts/output-250/map_world.txt` contains **all 250 rows, 223 expressed facts, and all 15 relations** of `data/06-19/pluieTriples-1.json`. Its displayed triple multiset matches that source exactly. A 223-fact supplemental census of all 15 relations is feasible, clearly labeled as a different corpus. Only 123 of its 250 displayed triple occurrences overlap the full modern NYT corpus. The archive's configuration association is not established; do not borrow a later `config-250-inferK.json` merely because the row count matches.

`…/output-2500/map_world.txt` contains 50 relation headers and complete path histograms totaling 2,500 rows, but only **2,461 displayed rows and 2,401 displayed facts**. Its top 20, ranked by the full histogram totals, contain **1,137 rows in the histograms but only 1,107 displayed rows and 1,070 displayed facts**. Thus 39 rows overall and 30 within the top 20 are missing. These omissions may hide additional latent facts or supporting/contradictory evidence for displayed facts. A census of the displayed 1,070 cases is not a complete census of the actual top-20 population. The source is `data/06-19/pluieTriples_fgreptest4.json`, a different corpus; 516 displayed triple occurrences overlap the modern full NYT corpus.

The imported `RelationTriggersObserver.java` at commit `9489d21ee6797a7b4ccc71f1f46f1c27af7da31b` stops gathering examples once it has found ten **distinct facts** for a relation/path. This is more precise than describing the archive as a universal ten-sentence cap. The observed omissions are measured from the actual files, independently of that implementation detail.

The neighboring `relation_triggers.txt` files are different saved states, not extra evidence for the MAP. The 250-row version is also complete with 223 facts but has different relation counts. The 2,500-row version shows 2,465 rows and 2,408 facts; its top 20 has 1,107 of 1,135 histogram rows and 1,077 displayed facts. Do not splice these rows into MAP omissions: their assignments do not describe the same state. They are auxiliary artifacts of the same archived experiments, not independent additional replications.

### Exclusions and unavailable results

The eight top-level `output-d15-*` directories contain synthetic DPM mixture likelihood/cluster diagrams, not NYT fact partitions. The `wrote/authored` and `love/like` worlds under `output-toy`, `toy-output`, `toy-output/alpha1-rel100`, and `test/Entity_resolution_Relation/map_world.txt` are synthetic debugging fixtures. Hashes and paths are recorded in the JSON inventory.

As `HANDOFF.md` records, the **later** inference-of-K toy/250/2500 experiments described in `resources/sampler-140626/CHANGES.md` have no saved outputs. The imported `all-poss-facts` fixtures are different runs. Neither the paper's full annotated top-20 fact set nor a complete saved state verified as its published subsidiary relation is available here. No missing judgments or partitions should be inferred from the approximate 95% claim.

## Protocol differences and consistent census criteria

The complete-census method requires every expressed top-20 fact to be read with its full evidence. The Sept12 and Sept14 screening protocols selected five facts per relation by deterministic hash. The latter gave the weighted estimator `sum_r (N_r/N) (S_r/n_r)`, not a census result; raw `S/100` gave equal relation weights. The shared semantic rule was already **at least one supporting triple**, with mixed evidence flagged separately, and explicit S/E/A judgments. The switch now is to complete coverage and exact `S/N` and `(S+A)/N`; no sampling weights or sampling confidence intervals remain.

Complete coverage alone does not reconcile differing predicate scopes. Reviewers should declare a common directional predicate from each full dictionary, document narrower title versus broader leadership choices, and reconsider all cases if that definition changes. A chairman relation, an explicit president relation, and a broad organizational leadership predicate must not be silently treated as interchangeable. Reuse requires the same predicate scope, complete evidence and identity interpretation, with provenance retained. Matching numeric relation IDs or a shared path is insufficient.

The new [METHOD.md](../METHOD.md) preserves the historical fact-local evidence criterion: S for clear support of the ordered predicate, E for another predicate/direction without support, A for material unresolved identity, attachment or interpretation. Every A needs a concrete reviewer question and every case needs valid local citations. Read all names and paths; a supporting keyword alone is not a semantic judgment. Different latent facts sharing literal names remain separate denominator units. Temporal corpus facts do not require current-world truth, and fact support is not sentence-cluster purity.

Report each run's exact counts and top-20 coverage separately. Changing relation inventories, identity fragmentation, predicate scope, and selected populations still make comparisons descriptive and unpaired. A census removes fact subsampling error for the saved population; it does not remove annotation uncertainty, prove convergence, provide recall, or establish the paper's undisclosed annotation rules.
