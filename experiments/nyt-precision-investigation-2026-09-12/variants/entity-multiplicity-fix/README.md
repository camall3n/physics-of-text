# Isolated entity-count multiplicity correction
Consolidation update, 2026-09-28: src is now a compatibility symlink to the
[single maintained corrected sampler](../../../../code/sampler/README.md).
All source bytes are unchanged. This study retains its own build directory and
commands through adapters. The correction description below remains historical
provenance; saved per-run source archives were not changed.


This is a complete source copy of `../controlled/src`, with two production-file changes that restore the intended entity-partition target. It is a separate follow-up variant. It does not overwrite the baseline, controlled variant, earlier experiments or their compiled runtime snapshots.

Read [the mathematical derivation and evidence](../../analysis/entity_multiplicity.md). The old entity smart split/merge kernels target `pi_partition/N!`; the correction adds `log(N+1)` to a split acceptance ratio and subtracts `log(N)` from a merge ratio. Empty-entity proposal multiplicities are included in that derivation. This is not the same issue as the relation-pool-size prior.

## Production changes

- `src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java`: add the missing entity-count factorial ratio.
- `src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java`: apply the identical correction to its complementary kernel.

Every other production source file is copied from the controlled variant. An existing entity component-ratio assertion is updated for the intentional additional term, and exact partition-chain tests are added. The dedicated build and run wrappers select this directory. `build/source_sha256.json` and each run's archived source/runtime classes identify the exact implementation.

## Parameters and experimental comparison

The follow-up configurations are [seed 20260912](../../configs/entityfix_latent_beta01_seed20260912.json) and [seed 20260913](../../configs/entityfix_latent_beta01_seed20260913.json). Each is byte-for-byte identical to the corresponding `latent_beta01_seed...json` configuration. The new wrapper chooses the corrected implementation.

| Setting | Value |
|---|---:|
| `numRels` / `maxRels` | 200 / 400 |
| Initial entity count | 1199 |
| Iterations / moves per iteration | 1000 / 2000 |
| Entity phase fraction | 0.02: 40,000 entity proposals |
| Relation phase budget | 1,960,000 proposals |
| Entity dictionary `alpha` | 0.001 |
| Relation dictionary `beta` | 0.1 |
| Beta sparsity `a` / `b` | 1 / 1,437,601 |
| Frozen argument entities | false |
| Added sentence/relation bridge weight | 0 |
| Seed | 20260912 or 20260913 |
| Checkpoint interval | 100 |

The fixed relation-slot prior and all relation moves remain as in the paired controlled latent runs. These two runs were chosen **after** the new exact entity-count defect was established. They are explicitly follow-up experiments, not entries retroactively added to the initial comparison matrix.

## Build, test and run

From the repository root:

```sh
node experiments/nyt-precision-investigation-2026-09-12/scripts/test_entity_variant.mjs
node experiments/nyt-precision-investigation-2026-09-12/scripts/run_entity_experiment.mjs \
  experiments/nyt-precision-investigation-2026-09-12/configs/entityfix_latent_beta01_seed20260912.json \
  experiments/nyt-precision-investigation-2026-09-12/runs/replay_entityfix_latent_beta01_seed20260912
```

The original completed outputs are in `runs/entityfix_latent_beta01_seed...`; the command above uses a new replay directory. Use the analogous `20260913` paths for the second seed. The test wrapper builds this variant; the standalone build wrapper is `scripts/build_entity_variant.mjs`. The run wrapper refuses an existing output folder or sources changed after compilation. It records the corpus/dependency hashes, copies runtime classes, archives source, and records the explicit configuration.

Validation completed before NYT launch: **91 JUnit tests pass**, including the previous 85 with the one documented expectation update, five control tests and one exhaustive partition-target regression. Four independent-JVM toy runs replay byte-for-byte. [Validation pointer](../../tests/latest_entity_variant_test.txt). The separate [kernel-audit runner](../../tests/kernel-audit/run.mjs) also retains baseline counterexamples and exhaustive corrected-class matrix checks.

Both NYT follow-ups and their 100-case manual screens are complete. [Results](../../analysis/experiment_results.md) report weighted ambiguity endpoints of **46.1%–52.1%** and **37.3%–43.7%**, versus paired baseline estimates of **54.2%–61.1%** and **50.4%–63.3%**. Available entity counts increase from 1045/1026 to 1180/1161. Thus this mathematically validated correction does not restore high precision in the tested budget. The estimates concern different sampled relation populations and predicate scopes, their ambiguity endpoints are not confidence intervals, and the runs have not demonstrated convergence; the comparison does not prove that the correct stationary target intrinsically lowers precision. The [derivation](../../analysis/entity_multiplicity.md) includes exact archive provenance and the detailed comparison.
