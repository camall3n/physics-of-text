# NYT inference: fixed literal names, beta=0.001, seed 20260912

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

This completed saved inference run has **89.58–95.57% complete top-20 fact precision**, from 384 expressed facts and 1,824/8,516 input rows (21.42%). Endpoints count ambiguous cases as unsupported/supported. This report inventories existing evidence for cleanup review; no inference, tests, label changes or experiment edits were performed.

[Saved run](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912) · [Configuration](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/config.json) · [Execution and hashes](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/run.json) · [Summary](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/summary.json) · [Complete assessment](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af/assessment.md)

## Question and implemented condition

Does stronger relation-dictionary concentration change precision and fragmentation with fixed names? The reference is [verbatim_beta01_seed20260912](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta01_seed20260912). Per-path beta changes from 0.1 to 0.001. The paper's elementary model states verbatim named arguments and defers entity-reference machinery. The archived implementation can infer entities and is not verified as the exact implementation/configuration of the paper experiment. Fixed names are closer to that stated experiment, not recovered historical settings. [Paper/model analysis](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/paper_model_choices.md).

| Aspect | Actual status |
| --- | --- |
| Five earlier sampling repair families | The update-introduced fact-deletion proposal error, plus inherited smart-split signs, null aborted empty splits, log-sum/probability initialization and reverse smart-merge normalizers. |
| Entity factorial/multiplicity correction | Absent from controlled source; dormant because entity inference is disabled. |
| Entity behavior | One persistent entity per observed string; no argument drift. |
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
| freezeArgumentEntities | true |
| sentenceRelationMoveWeight | 0 |
| seed | 20260912 |
| checkpointEvery | 100 |

Executed: **0 entity iterations / 0 entity proposals**, then **980 relation iterations / 1,960,000 relation proposals**. Frozen runs omit 40,000 entity proposals rather than reallocating them; every modern run retains 1,960,000 relation proposals. The nominal sparsity=0.001 field is inactive under Beta sparsity a=1, b=1,437,601. Start 2026-09-12T18:14:12.224Z; finish 2026-09-12T18:15:15.640Z; elapsed 63.355 seconds. Seeds identify independent inference trajectories on identical data.

Saved proposal diagnostics: relation splits 12227/59217 accepted, merges 12215/81956 accepted. sentence relation bridge 0/0 accepted; 0 unreferenced targets blocked. These counts describe the executed proposal mixture; they are not convergence or precision measures.

## Saved MAP, final state and precision

| MAP quantity | Value |
| --- | --- |
| Selected relation iteration | 971 / 980 |
| Log joint | -155829.62784747 |
| Available / expressed entity IDs | 1199 / 1199 |
| Occupied / expressed relations | 398 / 398 |
| Total true / expressed facts | 1937 / 1929 |
| Top-20 facts | 384 |
| Top-20 rows / 8,516 | 1824 / 8516 (21.42%) |
| Changed argument mentions / 17,032 | 0 |
| Mixed-name expressed entity IDs | 0 |

MAP means the highest recorded sampled joint, not the final state or a proven global optimum. The final snapshot has 1199 available entities, 1938 total true facts, 1928 expressed facts and 399 expressed relations. [MAP assignments](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/map_world_sentences.tsv) and [final assignments](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/final_world_sentences.tsv) preserve this distinction. Expressed facts have assigned rows; total true facts include unexpressed facts.

| Evaluation | Population / reviewed | S / E / A | Precision endpoints |
| --- | --- | --- | --- |
| Complete top-20 census | 384 / 384 | 344 / 17 / 23 | 89.58–95.57% |
| Earlier five-per-relation screen | 384 / 100 | 90 / 4 / 6 | 91.88–95.99% |

The authoritative comparable census uses S/N and (S+A)/N, **N=384**, including every expressed ordered (relation, entity1, entity2) fact in the 20 relations ranked by assigned-row frequency, ties by numeric relation ID. The earlier 100-fact screen weights each relation by its complete fact population; its raw sample S/E/A do not directly produce the weighted percentage. Differences reflect expanded coverage and possibly revised shared predicate judgments, not another chain. Neither pair is a confidence interval. The census records 0 human overrides; labels are assistant-authored textual support, not independent human gold judgments or external historical verification. [Earlier assessment](../../../../../experiments/nyt-precision-investigation-2026-09-12/manual_review/audit_5e74dee865/assessment.md) · [Census method](../../../../../experiments/nyt-complete-evaluation-2026-09-14/METHOD.md) · [Prior judgment comparison](../../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md).

## Later complete coverage-prefix evaluation

The unchanged MAP was assessed at nested whole-relation prefixes. Each is the smallest prefix reaching its requested fraction of 8,516 rows; all its expressed facts are evaluated. These are neither new chains nor independent samples.

| Requested rows | Relations k | Rows / achieved coverage | N | S / E / A | Precision | Unresolved facts / relations |
| --- | --- | --- | --- | --- | --- | --- |
| [57%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_57.md) | 98 | 4868 / 57.16% | 1073 | 888 / 98 / 87 | 82.76–90.87% | 0 / 0 |
| [60%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_60.md) | 109 | 5130 / 60.24% | 1139 | 923 / 116 / 100 | 81.04–89.82% | 0 / 0 |
| [70%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_70.md) | 152 | 5965 / 70.04% | 1325 | 1035 / 171 / 119 | 78.11–87.09% | 0 / 0 |
| [80%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_80.md) | 209 | 6825 / 80.14% | 1523 | 1139 / 242 / 142 | 74.79–84.11% | 9 / 2 |
| [90%](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_90.md) | 282 | 7671 / 90.08% | 1732 | 1241 / 323 / 168 | 71.65–81.35% | 10 / 3 |

Unresolved predicates remain ambiguous in N; the upper endpoint assumes them supported. Coverage is input-row coverage, not gold-fact recall or sentence-cluster purity. [Latest coverage comparison](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.json) · [Coverage manifest](../../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census_manifest.json).

## Interpretation and limits

High selected top-20 precision accompanies relation counts near 400 and only about one fifth of input rows covered. The later complete coverage census shows the limits of interpreting this selected population. No MCMC convergence is established. Final-100 minus preceding-100 mean joint: 583.085; positive correlated-block differences prove neither nonstationarity nor convergence. Of the final 100 iterations, 47 had at least 399 occupied relations. Log joints across beta values/entity models are not accuracy rankings. Mixed names may be legitimate aliases; changed IDs are not entity error rates. Literal names cannot disambiguate homonyms or merge aliases. Categorical paths, uniform reporting, pool-dependent priors, absent sentence context, predicate scope and assistant reviewer variability remain limitations. Local fact support does not imply global identity coherence or unique real-world discovery counts. These two-seed conditions do not establish the paper's approximately 95% result.

## Dependencies to preserve before cleanup

[Entire run](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912) includes [source archive](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/source_snapshot.tar.gz), [source hashes](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/source_sha256.json), [build record](../../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/build.json), copied runtime_classes, config, execution manifest, assignments, trace, descriptions and checkpoints. Recorded runtime/compiler: Temurin/OpenJDK and javac 25.0.4.1. Source archive SHA-256: f6763247bf3067f2042e20134133fc978c5aeb2d61242a4ad537a256901fdded. Corpus SHA-256: f34202952d36e2a0fc36dd7466d51be4c24fe36661a8100625dc373b9213161c. Dependency JAR SHA-256: 66d396ff7a5bce7df7c3d0637377693be218e077b483df0f0335454b1f586242.

The shared [corpus](../../../../../resources/sampler-140626/data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json) and [dependency fat JAR](../../../../../resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar) live outside each run. [Node runner](../../../../../experiments/nyt-precision-investigation-2026-09-12/scripts/run_experiment.mjs) and its build helper invoke org.ucb.generative_ie.experiments.ControlledNYT with assertions and a 4 GiB heap, placing copied runtime classes before the JAR. The run manifest records exact command/cwd. Preserve variant source and Node helpers alongside the pinned environment. Future replay requires a fresh output directory. Inspection checkpoints omit RNG/allocation/collection state and cannot resume the exact chain; restart replay is supported on the recorded environment. Toy replay checks do not mean these full NYT chains were themselves repeated.

[Design](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/experiment_design.md) · [Entity derivation](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) · [Integrity record](../../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/integrity_verification.json) · [Complete census evidence/annotations](../../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af)
