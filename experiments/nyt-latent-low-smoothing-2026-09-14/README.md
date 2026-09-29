# Latent entities with lower relation-dictionary smoothing — 14 September 2026

**Evaluation code — 2026-09-29:** maintained algorithms now live in [code/evaluation](../../code/evaluation/README.md); this campaign's scripts are compatible callers. Use preset `sampled-sep14` for read-only checks or a separate rendered review folder. [Selection rules and commands](../../code/evaluation/README.md#selection-is-separate-from-scoring) · [Equivalence evidence](../../reports/evaluation-consolidation-2026-09-29/README.md). Saved judgments and results are unchanged.

This separate follow-up supplies the combination missing from the previous NYT comparison: **entity inference enabled, beta=0.001, and all six confirmed sampling defect families corrected**. The old sampler, ten earlier controlled runs and their judgments are preserved. No production code was changed: this is an exact copy of the previously validated entity-multiplicity-fix variant with one experiment parameter changed.

## Clarification of the earlier table

The earlier rows were separate experimental branches. The new entity-factorial correction was present only in row 2, “New entity-sampling fix.” Row 3, “Fixed literal names,” and row 4, “Fixed names, lower dictionary smoothing,” used the controlled source without that additional correction. Those rows disabled entity inference, so the affected entity split/merge kernels never ran. Row 5, with the optional sentence/relation move, likewise kept entities fixed. All five rows retained the five earlier sampling fixes.

The new experiment uses the source from **row 2** and lowers beta from 0.1 to 0.001. It keeps entity inference enabled. This answers the missing comparison without combining unrelated model changes.

Seeds 20260912 and 20260913 are integer initializations for the pseudorandom generators. Both runs use the same complete 8,516-row corpus and the same parameter values except the seed. They are independent repeated inference trajectories, not different subsets of data. The paired earlier corrected-latent runs use those same seeds.

## Completed outcome

Both full NYT runs and all 200 sample judgments are complete. The table gives relation-size-weighted precision estimates; endpoints treat ambiguous cases as incorrect/correct. These are 100-fact screens per run, not censuses or confidence intervals.

| Condition | Seed 20260912 | Seed 20260913 |
|---|---:|---:|
| Corrected latent entities, beta 0.1 (previous) | 46.1–52.1% | 37.3–43.7% |
| **Corrected latent entities, beta 0.001 (new)** | **76.2–84.5%** | **85.0–91.1%** |
| Fixed literal names, beta 0.001 (previous) | 91.9–96.0% | 85.8–93.8% |

Lower relation-dictionary smoothing therefore produces much higher screening precision with entity inference still enabled. Both paired comparisons use exactly the same corrected source and exactly the same post-entity-phase assignments. The only changed model parameter is beta. This supports a substantial smoothing effect on the outputs of these finite runs; it does not isolate a population-wide accuracy effect because the evaluated facts and relation meanings change.

The tradeoff is substantial: expressed relations increase from 275/288 to 399/398; the top 20 fact populations shrink from 1,184/1,197 to 421/436, and their sentence coverage falls from 62.2/62.3% to 18.2/17.9%. Total expressed facts increase from 2,113/2,195 to 2,773/2,861. The additional facts mainly arise from assigning each literal pair across more relations, rather than increased within-relation duplication. The [partition diagnostics](analysis/partition_diagnostics.md) give the exact accounting, population overlaps and examples.

These scores concern local textual support for a declared predicate. They do not certify globally coherent inferred entities. For example, the second audit finds one ID used for both Shimon Peres and Conde Nast Publications; such incompatible identities can be visible across separate locally supported facts. Global mixed-name counts are diagnostic flags, not automatic error rates, because legitimate aliases also produce multiple names. Explicit mixed-identity cases and competing predicate meanings remain available for user review. The [first reviewer’s caveats](analysis/reviewer_caveats_runner.md) and [second reviewer’s caveats](analysis/reviewer_caveats_evaluation.md) preserve these uncertainties and alternative-predicate sensitivities. The new condition does not establish a 95% paper replication, and the low-beta relation count remains close to the 400-slot limit.

All 200 cases validate: 161 supported, 24 incorrect and 15 ambiguous. These bookkeeping totals are not a pooled micro-precision estimate across the two runs. [Detailed results](analysis/results.md), [case and annotation index](manual_review/README.md), and [all 15 ambiguity questions](analysis/ambiguities_for_user.md).

## Exactly what is included

| Item | This experiment |
|---|---|
| Updated fact-deletion proposal correction | Included |
| Inherited smart-split sign corrections | Included |
| Aborted-empty-split null behavior | Included |
| Correct log-sum initialization and probability handling | Included |
| Reverse smart-merge normalizers | Included |
| New entity-count factorial/multiplicity correction | Included and active |
| Entity inference | Enabled: entity split/merge phase and later argument Gibbs updates |
| Fixed literal entity identities | Disabled |
| Optional sentence/relation birth/death bridge | Disabled; weight 0 |
| Relation-count prior modification | None; existing pool-dependent model retained |
| Production-code changes versus the corrected latent reference | None; all 156 source files match |

[Independent source audit](analysis/source_audit.md) identifies the corrected code locations and verifies the new copy against both earlier runs’ source manifests. The [previous mathematical derivation](../nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) explains the added log(N+1) split and −log(N) merge terms. The correction fixes a missing multiplicity in the sampler; it does not determine the best modeling choices for semantic precision.

## Parameters and intended comparison

| Parameter | New setting | Paired corrected latent reference |
|---|---:|---:|
| Relation-dictionary beta, per path | **0.001** | **0.1** |
| Total concentration, 4,276 path types | **4.276** | **427.6** |
| Noun-dictionary alpha, per name | 0.001 | 0.001 |
| Initial entity count | 1199 | 1199 |
| numRels / maxRels | 200 /400 | 200 /400 |
| Beta sparsity a /b | 1 /1437601 | 1 /1437601 |
| Nominal sparsity field | 0.001, inactive under the Beta prior | Same |
| numIterations / stepsPerIteration | 1000 /2000 | Same |
| entityFraction | 0.02 | Same |
| Entity proposals executed | 40000 | 40000 |
| Relation proposals executed | 1960000 | 1960000 |
| freezeArgumentEntities | false | false |
| sentenceRelationMoveWeight | 0 | 0 |
| checkpointEvery | 100 | 100 |
| Seeds | 20260912,20260913 | Same |

The [pre-run experiment plan](experiment_plan.json) records both paired references. Exact configs are [seed 20260912](configs/entityfix_latent_beta0001_seed20260912.json) and [seed 20260913](configs/entityfix_latent_beta0001_seed20260913.json). The arm name `beta0001` denotes the JSON value 0.001.

This changes smoothing of **relation dependency paths**, not smoothing of entity names. The predictive distribution is

\[
P(t\mid r,\text{other rows})=\frac{n_{rt}+\beta}{n_r+4276\beta}.
\]

The preliminary entity-only phase uses alpha and its entity-count model, so it is unaffected by beta. Both new runs’ initialized sentence assignments and post-entity-phase assignments are exactly identical to their paired beta 0.1 references. During the subsequent relation phase, different path assignments can alter which facts exist and therefore influence later argument Gibbs updates. Entity identities continue to be inferred in that phase; lowering beta does not freeze them.

The finite relation pool and uniform fact-reporting model remain as documented in the [earlier model analysis](../nyt-precision-investigation-2026-09-12/analysis/paper_model_choices.md). Replacing those is a theoretical modeling decision and was deliberately excluded from this beta-only comparison. Correcting a sampler does not guarantee semantic accuracy or convergence within a fixed run budget.

## Results and inspection

[Results and paired comparisons](analysis/results.md) contain the two new outcomes alongside the previous corrected-latent beta 0.1 and fixed-name beta 0.001 conditions. MAP-world relation/fact counts and the fraction of corpus rows covered by the top 20 are reported with precision, so fragmentation and selection changes remain visible.

The [manual protocol](analysis/manual_protocol.md) was recorded before new outcomes. It preserves the prior deterministic sample rule: five facts from each of the top 20 relations ranked by assigned rows, using the same sampling salt, complete evidence and directional predicates. Each new run has 100 judgments. The weighted micro precision is

\[
\widehat P=\sum_{r=1}^{20}\frac{N_r}{\sum_jN_j}\frac{s_r}{n_r},
\]

with a second endpoint treating ambiguous cases as supported. Those endpoints are not confidence intervals. Small samples, predicate scope, reviewer differences, entity fragmentation and the changing top 20 population limit the comparison. A high screening score alone does not establish the paper’s approximately 95% all-facts precision.

Review artifacts and user questions are indexed in [manual_review/README.md](manual_review/README.md). These are assistant evidence-based judgments for user inspection, not independent human labels or historical fact verification. The full corpus is used for inference; the 100-case samples apply only to semantic assessment.

## Validation, isolation and reproduction

A fresh build passes **91 JUnit tests**, including the exact entity-partition target regression. Separate-JVM toy runs replay byte-for-byte with the new beta 0.001 in both latent and frozen modes. The only test-wrapper change is its toy configuration beta 0.1 → 0.001; no production source was modified. See [test pointer](tests/latest_entity_variant_test.txt). The copied manual selection/reporting pipeline also passes **12 tests**.

`protected_manifest.json` fingerprints 6,062 previous artifacts, including the old investigation, original source/results and HANDOFF. [Completed integrity verification](analysis/integrity_verification.json) confirms all remain unchanged, verifies all 358 recorded new-run output files, and checks identical source and initial/post-entity states against the matched references. Run outputs include exact config, source archives, copied compiled classes, Java version, dependency/corpus hashes and execution commands. Periodic snapshots are inspection artifacts, not resumable RNG checkpoints.

From this directory, use a fresh output folder for a replay:

```sh
node scripts/test_entity_variant.mjs
node scripts/run_entity_experiment.mjs configs/entityfix_latent_beta0001_seed20260912.json runs/replay_entityfix_latent_beta0001_seed20260912
node scripts/run_entity_experiment.mjs configs/entityfix_latent_beta0001_seed20260913.json runs/replay_entityfix_latent_beta0001_seed20260913
node --test tests/manual_sampling.test.mjs tests/manual_report.test.mjs
node scripts/summarize_results.mjs
node scripts/build_review_index.mjs
node scripts/verify_integrity.mjs
```

The runners refuse existing output folders. Source matches and paired settings are checked before execution. Do not overwrite previous runs or annotations when extending the comparison.
