# NYT inference: corrected latent entities, beta=0.001, seed 20260913

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

This completed saved inference run has **78.90–89.22% complete top-20 fact precision**, from 436 expressed facts and 1,521/8,516 input rows (17.86%). Endpoints count ambiguous cases as unsupported/supported. This report inventories existing evidence for cleanup review; no inference, tests, label changes or experiment edits were performed.

[Saved run](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913) · [Configuration](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/config.json) · [Execution and hashes](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/run.json) · [Summary](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/summary.json) · [Complete assessment](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470/assessment.md)

## Question and implemented condition

Does reduced relation-path smoothing improve outputs while retaining corrected latent entity inference? The paired reference is [entityfix_latent_beta01_seed20260913](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/entityfix_latent_beta01_seed20260913). Production source and initialized/post-entity sentence assignments match that reference exactly; beta is the only changed model parameter. Beta affects relation inference and can then affect argument reassignment; it does not freeze names. The paper's elementary model states verbatim named arguments and defers entity-reference machinery. The archived implementation can infer entities and is not verified as the exact implementation/configuration of the paper experiment. Fixed names are closer to that stated experiment, not recovered historical settings. [Paper/model analysis](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/paper_model_choices.md).

| Aspect | Actual status |
| --- | --- |
| Five earlier sampling repair families | The update-introduced fact-deletion proposal error, plus inherited smart-split signs, null aborted empty splits, log-sum/probability initialization and reverse smart-merge normalizers. |
| Entity factorial/multiplicity correction | Present and active: split +log(N+1), merge −log(N). |
| Entity behavior | Entity-only split/merge initialization, then restricted argument Gibbs reassignment among existing compatible facts; entity count fixed in relation phase. |
| Dictionary choice | beta=0.001 per path; 4,276 path types give total concentration 4.276. A prior choice, not a bug fix. |
| Optional bridge | Weight 0; disabled. |
| Relation-count model | Pool maxRels=400 retained with its pool-dependent prior; no normalization/replacement. |
| Replay plumbing | Independent seeded RNG streams and stable categorical iteration; intended transition probabilities unchanged. |

The historical basename **beta0001 means 0.001**, not 0.0001. Beta smooths relation paths; entity-name alpha remains 0.001.

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
| beta | 0.001 |
| sparsity | 0.001 |
| sparsityA | 1 |
| sparsityB | 1437601 |
| freezeArgumentEntities | false |
| sentenceRelationMoveWeight | 0 |
| seed | 20260913 |
| checkpointEvery | 100 |

Executed: **20 entity iterations / 40,000 entity proposals**, then **980 relation iterations / 1,960,000 relation proposals**. Frozen runs omit 40,000 entity proposals rather than reallocating them; every modern run retains 1,960,000 relation proposals. The nominal sparsity=0.001 field is inactive under Beta sparsity a=1, b=1,437,601. Start 2026-09-14T19:10:58.731Z; finish 2026-09-14T19:13:49.257Z; elapsed 170.335 seconds. Seeds identify independent inference trajectories on identical data.

Saved proposal diagnostics: relation splits 8363/39737 accepted, merges 8348/84087 accepted. sentence relation bridge 0/0 accepted; 0 unreferenced targets blocked. These counts describe the executed proposal mixture; they are not convergence or precision measures.

## Saved MAP, final state and precision

| MAP quantity | Value |
| --- | --- |
| Selected relation iteration | 973 / 980 |
| Log joint | -180697.89208411 |
| Available / expressed entity IDs | 1161 / 1160 |
| Occupied / expressed relations | 399 / 398 |
| Total true / expressed facts | 2928 / 2861 |
| Top-20 facts | 436 |
| Top-20 rows / 8,516 | 1521 / 8516 (17.86%) |
| Changed argument mentions / 17,032 | 5224 |
| Mixed-name expressed entity IDs | 511 |

MAP means the highest recorded sampled joint, not the final state or a proven global optimum. The final snapshot has 1161 available entities, 2964 total true facts, 2858 expressed facts and 399 expressed relations. [MAP assignments](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/map_world_sentences.tsv) and [final assignments](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/final_world_sentences.tsv) preserve this distinction. Expressed facts have assigned rows; total true facts include unexpressed facts.

| Evaluation | Population / reviewed | S / E / A | Precision endpoints |
| --- | --- | --- | --- |
| Complete top-20 census | 436 / 436 | 344 / 47 / 45 | 78.90–89.22% |
| Earlier five-per-relation screen | 436 / 100 | 85 / 9 / 6 | 85.05–91.15% |

The authoritative comparable census uses S/N and (S+A)/N, **N=436**, including every expressed ordered (relation, entity1, entity2) fact in the 20 relations ranked by assigned-row frequency, ties by numeric relation ID. The earlier 100-fact screen weights each relation by its complete fact population; its raw sample S/E/A do not directly produce the weighted percentage. Differences reflect expanded coverage and possibly revised shared predicate judgments, not another chain. Neither pair is a confidence interval. The census records 0 human overrides; labels are assistant-authored textual support, not independent human gold judgments or external historical verification. [Earlier assessment](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/audit_af30702564/assessment.md) · [Census method](../../../../../experiments/nyt-complete-evaluation-2026-09-14/METHOD.md) · [Prior judgment comparison](../../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md).

## Later complete coverage-prefix evaluation

The unchanged MAP was assessed at nested whole-relation prefixes. Each is the smallest prefix reaching its requested fraction of 8,516 rows; all its expressed facts are evaluated. These are neither new chains nor independent samples.

| Requested rows | Relations k | Rows / achieved coverage | N | S / E / A | Precision | Unresolved facts / relations |
| --- | --- | --- | --- | --- | --- | --- |
| [57%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_e318fe663470/coverage_57.md) | 116 | 4876 / 57.26% | 1535 | 980 / 365 / 190 | 63.84–76.22% | 0 / 0 |
| [60%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_e318fe663470/coverage_60.md) | 127 | 5131 / 60.25% | 1625 | 1021 / 405 / 199 | 62.83–75.08% | 0 / 0 |
| [70%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_e318fe663470/coverage_70.md) | 167 | 5966 / 70.06% | 1926 | 1162 / 526 / 238 | 60.33–72.69% | 9 / 1 |
| [80%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_e318fe663470/coverage_80.md) | 220 | 6825 / 80.14% | 2231 | 1292 / 666 / 273 | 57.91–70.15% | 24 / 4 |
| [90%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_e318fe663470/coverage_90.md) | 287 | 7674 / 90.11% | 2542 | 1398 / 833 / 311 | 55.00–67.23% | 34 / 6 |

Unresolved predicates remain ambiguous in N; the upper endpoint assumes them supported. Coverage is input-row coverage, not gold-fact recall or sentence-cluster purity. [Latest coverage comparison](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.json) · [Coverage manifest](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census_manifest.json).

## Interpretation and limits

The matched source and post-entity state isolate the smoothing change in these trajectories. Higher top-20 precision accompanies near-cap relation counts, more expressed facts and sharply smaller top-20 coverage. This is not evidence of improved whole-corpus accuracy. No MCMC convergence is established. Final-100 minus preceding-100 mean joint: 946.864; positive correlated-block differences prove neither nonstationarity nor convergence. Of the final 100 iterations, 78 had at least 399 occupied relations. Log joints across beta values/entity models are not accuracy rankings. Mixed names may be legitimate aliases; changed IDs are not entity error rates. The latent two-phase algorithm uses different objectives and is not one stationary full-joint sampler. Categorical paths, uniform reporting, pool-dependent priors, absent sentence context, predicate scope and assistant reviewer variability remain limitations. Local fact support does not imply global identity coherence or unique real-world discovery counts. These two-seed conditions do not establish the paper's approximately 95% result.

## Dependencies to preserve before cleanup

[Entire run](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913) includes [source archive](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/source_snapshot.tar.gz), [source hashes](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/source_sha256.json), [build record](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913/build.json), copied runtime_classes, config, execution manifest, assignments, trace, descriptions and checkpoints. Recorded runtime/compiler: Temurin/OpenJDK and javac 25.0.4.1. Source archive SHA-256: f8bc05d96efe88a37e48e17795abf2284937938246c75f1f770cb937e24523d4. Corpus SHA-256: f34202952d36e2a0fc36dd7466d51be4c24fe36661a8100625dc373b9213161c. Dependency JAR SHA-256: 66d396ff7a5bce7df7c3d0637377693be218e077b483df0f0335454b1f586242.

The shared [corpus](../../../../../resources/sampler-140626/data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json) and [dependency fat JAR](../../../../../resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar) live outside each run. [Node runner](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/scripts/run_entity_experiment.mjs) and its build helper invoke org.ucb.generative_ie.experiments.ControlledNYT with assertions and a 4 GiB heap, placing copied runtime classes before the JAR. The run manifest records exact command/cwd. Preserve variant source and Node helpers alongside the pinned environment. Future replay requires a fresh output directory. Inspection checkpoints omit RNG/allocation/collection state and cannot resume the exact chain; restart replay is supported on the recorded environment. Toy replay checks do not mean these full NYT chains were themselves repeated.

[Design](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/experiment_design.md) · [Entity derivation](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) · [Integrity record](../../../../../experiments/nyt-latent-low-smoothing-2026-09-14/analysis/integrity_verification.json) · [Complete census evidence/annotations](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470)
