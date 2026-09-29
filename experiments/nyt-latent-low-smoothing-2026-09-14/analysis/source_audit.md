# Source and parameter audit — 14 September 2026

**Verified:** the new latent-entity, `beta=0.001` condition uses exactly the source that produced the two previous corrected latent-entity runs. All six confirmed sampling defect families are included. The sole experiment-configuration difference from each paired run is `beta: 0.1 → 0.001`; entity inference remains enabled and the optional sentence/relation bridge remains disabled.

This is a bounded provenance and configuration audit, not a new general code review. No production source or previous result was modified by this audit.

## Exact source baseline

The copied [variant source](../variants/entity-multiplicity-fix/src) was independently compared against the saved `source_sha256.json` in both historical runs:

- [entityfix_latent_beta01_seed20260912](../../nyt-precision-investigation-2026-09-12/runs/entityfix_latent_beta01_seed20260912/source_sha256.json)
- [entityfix_latent_beta01_seed20260913](../../nyt-precision-investigation-2026-09-12/runs/entityfix_latent_beta01_seed20260913/source_sha256.json)

For each comparison, **all 156 source-tree files match their recorded SHA-256 values**, including all 104 main Java files. There are no missing, differing or additional source-tree files. This checks the historical saved manifests rather than relying only on the present-day parent variant directory. That parent directory independently also matches both manifests.

Both historical source manifests have SHA-256:

`98d6ff0b884cd6d596980ce9b95276c714a8e5f23a13430dca4a6a37da60c541`

The historical source archives were also hashed and matched the respective `run.json` records:

| Seed | Historical `source_snapshot.tar.gz` SHA-256 |
|---|---|
| 20260912 | `f9a49ecc2e89ffb812c2b89b286c985ed834dca6e4e35c5355fec9d1c6d7cdae` |
| 20260913 | `3d34e009109a1a26cbfdbac42cd9432878e0cc12c3c03fe352f6b049506da92c` |

The archives have different container hashes but identical per-file source manifests. An archive-container hash should not be used as a substitute for the per-file comparison.

## Six confirmed defect families included

Locations below refer to the copied source, under `src/main/java/org/ucb/generative_ie/`. The [five-family report](../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) explains their original evidence; the [entity-count derivation](../../nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) establishes the sixth correction, including empty-entity multiplicities.

| Family | Copied implementation and inspected location | Correction retained |
|---|---|---|
| Fact-deletion search probability | [FactBirthDeathStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mcmc/FactBirthDeathStep.java), `logDeathSearchSuccess` line 108, acceptance terms 139/153 | Includes the bounded search success `s(F,U)=1−(1−U/F)^20`: adds its reverse-search log probability for births and subtracts the forward-search log probability for deaths. |
| Smart-split reverse likelihood signs | [EntitySmartSplitStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java), `logProposalRatio` lines 380–401 | Recomputes the hypothetical post-merge parent normalizer using negative noun log likelihood for every candidate, consistently with the forward inverse-likelihood split-parent choice. |
| Non-null aborted empty splits | Both [smart split](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java) and [smart merge](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), empty-parent guard line 179; application guards 409/434 | Calls `setNull()` on an empty-parent split; null applications do nothing. Insufficient-population and two-empty-entity merges remain null. One-empty-daughter splits of a populated parent remain reversible. |
| Log-sum initialization and weighted normalization | [LogProbMap.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/util/LogProbMap.java), lines 34–49; [NormalProbMap.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/util/NormalProbMap.java), line 38; [Util.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/util/Util.java), lines 68 and 144–157 | Uses stable maximum-scaled normalization and proper log-zero handling, retaining valid zero log weights and consistent raw/normalized weighted choices. |
| Reverse smart-merge normalizers | [EntitySmartMergeStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), `logProposalRatio` lines 382–415, particularly 397/398 | Conditional sums begin with the actual opposite daughter likelihood, then add only eligible entities. Both merge orders are included; there is no phantom unit-weight candidate. |
| Entity-count factorial omission | [EntitySmartSplitStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java), line 368, and [EntitySmartMergeStep.java](../variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java), line 370 | Adds `log(N+1)` to split acceptance and subtracts `log(N)` from merge acceptance. With the proposal multiplicities included, this restores `pi_partition` instead of the unintended `pi_partition/N!`. It is not simply an unqualified addition of the falling-factorial state term. |

The full source copy also retains the associated log-domain MH acceptance, idempotent proposal ratios, probability-map ordering and complete seed propagation, and the other corrections recorded in the previous reports. The optional new bridge class is present in the complete copy but has weight zero in these runs, so it contributes no proposal transitions.

Selected production-file hashes, independently recomputed in the new folder:

| Source suffix | SHA-256 |
|---|---|
| `mcmc/FactBirthDeathStep.java` | `188a05720d6fe58809258a25e3603332a414307db8130f8da06d820e99b4f780` |
| `mh/EntitySmartSplitStep.java` | `8b4b068d54166001c65b9b0054ab77d14f51e6ad1f90d6023975f45caab42c3f` |
| `mh/EntitySmartMergeStep.java` | `04ae30ada816f826fbae3fd99f37a972fd92de89a41b48dc05f26635408e96f7` |
| `util/LogProbMap.java` | `7bf44502635120e0fe5487e5b4963e6c8896dcf1b69c25da34741b3ab77820d5` |
| `util/NormalProbMap.java` | `f8e9f675af88661ecb01b6816ef5fd6c0a5660cb1096657f9cf36d153abb76d1` |
| `util/Util.java` | `2c65a063a6026f9e3a9bc0da2fa5cc266d836ee02c97ec15dc6e6d92eeb41be0` |
| `mh/GeneralMHStep.java` | `868ea13d4b48c12b4e9c981867e1900c9d26d0d5cdcbe0c91a096a25e4995b95` |
| `mcmc/WorldInferSteps.java` | `3d7eaeac9c9f4f73b45e340b35ebabd72d1c980dba3b946282294559b5b8183d` |
| `experiments/ControlledNYT.java` | `b59a6fede5e47d58de9de683495f619b45efaceba62693cc753f80c2ded59980` |

## Exact parameter comparison

Parsed every key in each new [configuration](../configs), comparing it with the corresponding historical run's actual `run.json.config` rather than only a proposed configuration file. Each comparison returned precisely one changed key: `beta`, from `0.1` to `0.001`.

| Setting | Historical corrected latent runs | New runs |
|---|---:|---:|
| Relation dictionary `beta` | 0.1 | 0.001 |
| Entity dictionary `alpha` | 0.001 | 0.001 |
| `freezeArgumentEntities` | false | false |
| `sentenceRelationMoveWeight` | 0 | 0 |
| `numRels` / `maxRels` | 200 / 400 | 200 / 400 |
| Initial `numEnts` | 1199 | 1199 |
| `numIterations` / `stepsPerIteration` | 1000 / 2000 | 1000 / 2000 |
| `entityFraction` | 0.02 | 0.02 |
| Entity / relation proposal budgets | 40,000 / 1,960,000 | 40,000 / 1,960,000 |
| `sparsity` | 0.001 | 0.001 |
| `sparsityA` / `sparsityB` | 1 / 1,437,601 | 1 / 1,437,601 |
| Seeds | 20260912, 20260913 | 20260912, 20260913 |
| `checkpointEvery` | 100 | 100 |

The configuration filenames use `beta0001`, following the preceding experiment's naming convention. The actual JSON numeric value is **0.001**, not 0.0001.

New configuration SHA-256 values:

- Seed 20260912: `5a4d0d395541e87d3e0be216fb960330de017ac030ba6a0572214da70097c9a1`
- Seed 20260913: `fce2a3ad944f092ca6fae4a65b9165aa5221d187ddf6c07e6674e27affc49f10`

The [new test wrapper](../scripts/test_entity_variant.mjs) differs from the previous wrapper only by changing the small replay fixture's `beta` from `.1` to `.001`. This extends the replay check to the new setting; it is not a production-code change. Java regression-test sources are byte-identical to the previous validated set. The build and run wrappers are also byte-identical to their previous versions; their paths resolve relative to the new experiment directory.

Fresh validation has completed in [tests/entityfix-1789413029174](../tests/entityfix-1789413029174): [JUnit output](../tests/entityfix-1789413029174/junit.log) reports **91 passing tests**, including the exact 38-state entity partition checks, and [replay results](../tests/entityfix-1789413029174/results.json) report byte-identical separate-JVM replay for both latent and frozen toy modes at the new `beta=0.001`. The frozen toy fixture tests the existing optional mode; both full NYT configurations remain latent. Actual NYT outputs are recorded separately under `runs/`; source identity alone is not used as a substitute for execution.

## Interpretation and limits

Lowering `beta` is a documented modeling-parameter change, not another arithmetic fix. For vocabulary size `V` and relation counts `n_rt`, its collapsed trigger predictive probability is `(n_rt + beta)/(n_r + V*beta)`. The new condition gives observed relation-specific paths less smoothing toward unseen paths. It does not change noun smoothing, the entity-count prior, the fixed relation-slot prior or the inference schedule.

The pool-dependent relation-count prior remains present with `maxRels=400`. No slot-count correction or nonparametric relation model is introduced. The entity phase remains noun-only and precedes relation inference; this is not joint entity/relation posterior sampling. The source corrections establish the checked target and transition formulas, not convergence or 95% semantic precision.

With the same seed and source, changing only relation `beta` should preserve the post-entity snapshot because that phase uses the noun parameter `alpha`. Comparing each new `post_entity_world_sentences.tsv` against its paired historical file is therefore a useful runtime check. Relation trajectories can subsequently diverge, and the top-20 fact populations need fresh manual assessment. Estimates from five sampled facts per relation have substantial sampling uncertainty, and ambiguity endpoints are not confidence intervals.
