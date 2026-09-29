# Historical NYT run with maxRels=400 — partially repaired

Completed on 2026-09-11 after the five sampling repairs documented in the [fix report](../nyt-2026/evaluation/sampling_fixes.md). Java exited successfully after 157 seconds. Saved settings remain `maxRels=400`, `numRels=200`, `beta=0.1`, 40,000 entity proposals and 1,960,000 relation proposals. The earlier saved NYT run also used pool 400.

**The entity-count multiplicity defect was still active in this latent-entity run.** The historical `fixed-400` name predates that later correction. Its reports, saved grading data and before/after comparisons were retired on 2026-09-28, together with the other confirmed active-bug run evaluations. The [entity multiplicity derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md), sampler regression tests and original run evidence remain.

## Current evaluations

Use the [10 retained full-NYT censuses](../../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.md) and the [four corrected β=0.001 models at five coverage targets](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md). These supply current per-fact evidence, judgments and review workflows. Do not regenerate this run's retired evaluation or use its old summary grades as current results.

The [corrected Figure 1 evaluation](../figure1-2026-fixed/evaluation.md) and [self-pair variant](../figure1-2026-self-pairs-included/README.md) remain available for the corrected synthetic run.

## Preserved run evidence

- [Raw relation summary](summary.txt) and [complete MAP TSV](map_world_sentences.tsv).
- [Joint-probability trace](logprobs.txt), [configuration](config.json), and [run provenance](run.json).
- [Source hashes](source_sha256.json) and [source snapshot](source_snapshot.tar.gz).

All raw sampler outputs, including `summary.txt`, are unchanged. Raw summaries or logs may contain historical grading text; they are retained as original experiment evidence. The exact Java command remains in `run.json`. Randomness in this historical run was not fully controlled, and convergence was not established.

**The pool-dependent count prior remains unchanged.** Pool 400 preserves this run's setting; it does not repair the prior. Even below capacity, the pool changes the preference for occupied relations. See [HANDOFF.md](../../../../HANDOFF.md#3-the-model-as-implemented) and the retained [sampling fix report](../nyt-2026/evaluation/sampling_fixes.md).

## New corrected experiments

Use the [maintained corrected sampler](../../../../code/sampler/README.md), which also includes the entity multiplicity repair. From the repository root, for example:

```sh
node code/sampler/build.mjs
node code/sampler/run.mjs experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/config.json experiments/nyt-next-corrected
```

The output path must be fresh. Select the intended seeded configuration explicitly; this example reuses a retained corrected β=0.001 configuration, while this historical run used β=0.1. New runs require fresh case-level judgments under the documented evaluation method. See the [cleanup record](../../../../reports/buggy-evaluation-cleanup-2026-09-28/README.md) for retired artifacts and preservation checks.
