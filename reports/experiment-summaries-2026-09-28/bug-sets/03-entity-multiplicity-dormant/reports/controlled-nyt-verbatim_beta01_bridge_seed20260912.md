# NYT inference: fixed literal names, beta=0.1, seed 20260912, optional bridge

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

This completed saved inference run has **63.69–71.11% complete top-20 fact precision**, from 727 expressed facts and 5,034/8,516 input rows (59.11%). Endpoints count ambiguous cases as unsupported/supported. This report inventories existing evidence for cleanup review; no inference, tests, label changes or experiment edits were performed.

[Saved run](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912) · [Configuration](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/config.json) · [Execution and hashes](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/run.json) · [Summary](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/summary.json) · [Complete assessment](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2/assessment.md)

## Question and implemented condition

Does an extra reversible sentence/relation birth/death proposal improve finite-budget access to the same fixed-name fact-world target? The matched reference is [verbatim_beta01_seed20260912](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_seed20260912). Weight 1 reallocates the existing relation proposal budget. The paper's elementary model states verbatim named arguments and defers entity-reference machinery. The archived implementation can infer entities and is not verified as the exact implementation/configuration of the paper experiment. Fixed names are closer to that stated experiment, not recovered historical settings. [Paper/model analysis](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/paper_model_choices.md).

| Aspect | Actual status |
| --- | --- |
| Five earlier sampling repair families | The update-introduced fact-deletion proposal error, plus inherited smart-split signs, null aborted empty splits, log-sum/probability initialization and reverse smart-merge normalizers. |
| Entity factorial/multiplicity correction | Absent from controlled source; dormant because entity inference is disabled. |
| Entity behavior | One persistent entity per observed string; no argument drift. |
| Dictionary choice | beta=0.1 per path; 4,276 path types give total concentration 427.6. A prior choice, not a bug fix. |
| Optional bridge | Weight 1; enabled only in this beta=0.1 arm; same target. |
| Relation-count model | Pool maxRels=400 retained with its pool-dependent prior; no normalization/replacement. |
| Replay plumbing | Independent seeded RNG streams and stable categorical iteration; intended transition probabilities unchanged. |

## Inputs, parameters and budget

Inference uses all 8,516 rows of the unchanged NYT JSON: 17,032 argument mentions, 1,199 literal names, 4,276 paths and 920 ordered literal pairs. No train/test split or inference subsample was used. Thirty metadata-contaminated paths and 784 repeated triples beyond first occurrence remain; full original sentences/article dates are unavailable. [Corpus audit](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/corpus_audit.md).

| Parameter | Saved value |
| --- | --- |
| numRels | 200 |
| maxRels | 400 |
| numEnts | 1199 |
| numIterations | 1000 |
| stepsPerIteration | 2000 |
| entityFraction | 0.02 |
| alpha | 0.001 |
| beta | 0.1 |
| sparsity | 0.001 |
| sparsityA | 1 |
| sparsityB | 1437601 |
| freezeArgumentEntities | true |
| sentenceRelationMoveWeight | 1 |
| seed | 20260912 |
| checkpointEvery | 100 |

Executed: **0 entity iterations / 0 entity proposals**, then **980 relation iterations / 1,960,000 relation proposals**. Frozen runs omit 40,000 entity proposals rather than reallocating them; every modern run retains 1,960,000 relation proposals. The nominal sparsity=0.001 field is inactive under Beta sparsity a=1, b=1,437,601. Start 2026-09-12T18:15:16.065Z; finish 2026-09-12T18:16:37.414Z; elapsed 81.291 seconds. Seeds identify independent inference trajectories on identical data.

Saved proposal diagnostics: relation splits 34683/78469 accepted, merges 34866/61286 accepted. sentence relation bridge 7252/443451 accepted; 76 unreferenced targets blocked. These counts describe the executed proposal mixture; they are not convergence or precision measures.

## Saved MAP, final state and precision

| MAP quantity | Value |
| --- | --- |
| Selected relation iteration | 979 / 980 |
| Log joint | -149345.76859789 |
| Available / expressed entity IDs | 1199 / 1199 |
| Occupied / expressed relations | 200 / 200 |
| Total true / expressed facts | 1302 / 1302 |
| Top-20 facts | 727 |
| Top-20 rows / 8,516 | 5034 / 8516 (59.11%) |
| Changed argument mentions / 17,032 | 0 |
| Mixed-name expressed entity IDs | 0 |

MAP means the highest recorded sampled joint, not the final state or a proven global optimum. The final snapshot has 1199 available entities, 1301 total true facts, 1301 expressed facts and 208 expressed relations. [MAP assignments](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/map_world_sentences.tsv) and [final assignments](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/final_world_sentences.tsv) preserve this distinction. Expressed facts have assigned rows; total true facts include unexpressed facts.

| Evaluation | Population / reviewed | S / E / A | Precision endpoints |
| --- | --- | --- | --- |
| Complete top-20 census | 727 / 727 | 463 / 210 / 54 | 63.69–71.11% |
| Earlier five-per-relation screen | 727 / 100 | 67 / 29 / 4 | 60.99–67.81% |

The authoritative comparable census uses S/N and (S+A)/N, **N=727**, including every expressed ordered (relation, entity1, entity2) fact in the 20 relations ranked by assigned-row frequency, ties by numeric relation ID. The earlier 100-fact screen weights each relation by its complete fact population; its raw sample S/E/A do not directly produce the weighted percentage. Differences reflect expanded coverage and possibly revised shared predicate judgments, not another chain. Neither pair is a confidence interval. The census records 0 human overrides; labels are assistant-authored textual support, not independent human gold judgments or external historical verification. [Earlier assessment](../../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_4c50ddb65b/assessment.md) · [Census method](../../../../../experiments/nyt-complete-evaluation-2026-09-14/METHOD.md) · [Prior judgment comparison](../../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md).

## Interpretation and limits

These finite runs show no consistent precision benefit from the extra audited proposal. The matched non-bridge run reaches a higher best joint under the same target, and weight 1 reallocates existing work. No MCMC convergence is established. Final-100 minus preceding-100 mean joint: 767.708; positive correlated-block differences prove neither nonstationarity nor convergence. Of the final 100 iterations, 0 had at least 399 occupied relations. Log joints across beta values/entity models are not accuracy rankings. Mixed names may be legitimate aliases; changed IDs are not entity error rates. Literal names cannot disambiguate homonyms or merge aliases. Categorical paths, uniform reporting, pool-dependent priors, absent sentence context, predicate scope and assistant reviewer variability remain limitations. Local fact support does not imply global identity coherence or unique real-world discovery counts. These two-seed conditions do not establish the paper's approximately 95% result.

## Dependencies to preserve before cleanup

[Entire run](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912) includes [source archive](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/source_snapshot.tar.gz), [source hashes](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/source_sha256.json), [build record](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_bridge_seed20260912/build.json), copied runtime_classes, config, execution manifest, assignments, trace, descriptions and checkpoints. Recorded runtime/compiler: Temurin/OpenJDK and javac 25.0.4.1. Source archive SHA-256: 466d221d5d9eb37b8380a22e837684a26df90e14142a1e041fa77989f5b1d5bd. Corpus SHA-256: f34202952d36e2a0fc36dd7466d51be4c24fe36661a8100625dc373b9213161c. Dependency JAR SHA-256: 66d396ff7a5bce7df7c3d0637377693be218e077b483df0f0335454b1f586242.

The shared [corpus](../../../../../resources/sampler-140626/data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json) and [dependency fat JAR](../../../../../resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar) live outside each run. [Node runner](../../../../../experiments/nyt-precision-investigation-2026-09-12/scripts/run_experiment.mjs) and its build helper invoke org.ucb.generative_ie.experiments.ControlledNYT with assertions and a 4 GiB heap, placing copied runtime classes before the JAR. The run manifest records exact command/cwd. Preserve variant source and Node helpers alongside the pinned environment. Future replay requires a fresh output directory. Inspection checkpoints omit RNG/allocation/collection state and cannot resume the exact chain; restart replay is supported on the recorded environment. Toy replay checks do not mean these full NYT chains were themselves repeated.

[Design](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/experiment_design.md) · [Entity derivation](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) · [Integrity record](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/integrity_verification.json) · [Complete census evidence/annotations](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2)
