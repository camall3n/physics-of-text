# Fixed literal names, seed 20260912: 90% input-row coverage

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: evaluation condition on a saved MAP run; original evaluation date 2026-09-14; summary written 2026-09-28. No new simulation or annotation was performed for this summary.

## Purpose and selected population

Select the smallest prefix of relations ranked by assigned input-row frequency that reaches 90% of the 8,516 input rows. Numeric relation ID breaks frequency ties. Whole boundary relations are retained. This point uses **k=282 relations**, **7671/8516 rows (90.08%)**, and **all 1732 expressed ordered latent facts** in that prefix.

This percentage is neither the fraction of relation IDs nor gold-fact recall. The five requested points for this run are nested slices of the same completed 90% census, not independent replications. Each point gets its own summary to make the requested coverage conditions individually reviewable.

## Underlying model and fixes

Saved inference run: verbatim_beta0001_seed20260912. Seed 20260912 controls its recorded random streams. Common settings: β=0.001, α=0.001, maxRels=400, numRels=200, initial numEnts=1199, integrated sparsity Beta(1,1437601), nominal 1000 iterations with 2000 proposal calls each, entityFraction=0.02, sentenceRelationMoveWeight=0. The basename beta0001 means 0.001.

Entity identities are fixed to exact observed noun strings. Entity inference and both argument Gibbs updates are disabled; the reserved entity budget is skipped. Active relation sampling includes the five earlier repair families. The later entity factorial defect remains in dormant source code but its affected kernels never execute. This is an entity-model restriction, not the factorial repair.

Both families retain the 400-slot occupancy-prior dependence and finite-chain limitations. The best recorded MAP state is not a proven global optimum. No model parameter changes when this coverage point is selected.

## Recorded result

| Quantity | Value |
|---|---:|
| Supported S | 1241 |
| Unsupported E | 323 |
| Ambiguous A | 168 |
| Complete fact denominator N | 1732 |
| Lower endpoint S/N | 71.65% |
| Upper endpoint (S+A)/N | 81.35% |
| Entirely unresolved relation meanings | 3 relations / 10 facts |

The additional block since the preceding coverage point comprises ranks 210–282: 102 S / 81 E / 26 A, N=209, bounds 48.80%–61.24%. This block result is distinct from cumulative precision above.

Bounds count A as unsupported or supported; they are not confidence intervals. Unresolved-predicate cases stay in the denominator and make the upper endpoint especially optimistic. Judgments concern support in supplied local paths, not external historical verification. Extra off-predicate rows may coexist with a supported fact.

## Relation to other results and the paper

The preserved top-20 result for this same run is 344/384 to 367/384, or 89.58%–95.57%, at only 21.42% row coverage. Comparing that score with this point changes the evaluated population, not the fitted model.

The fixed-name restriction is the closer match to the paper’s explicit verbatim-argument model, though its precise published execution and name preprocessing remain uncertain.

## Inspection, provenance and dependencies

- [Every selected relation, full evidence and S/E/A judgments](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_90.md).
- [Structured complete selected population](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage_90.json); [fixed coverage selection](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_06dbdb9b03af/coverage.json).
- [Original saved MAP rows](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/map_world_sentences.tsv); [original configuration](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/config.json); [original run manifest](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912/run.json).
- [Model-specific design](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/fixed_name.md); [mathematical target and inference](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/target_and_inference.md).
- [Evaluation rubric](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/METHOD.md); [final recorded pipeline validation](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/analysis/final_pipeline_validation.json).

Original MAP SHA-256 recorded by the evaluation: 5fab808b6778c75611496d57bf58fc2c881dd7c33413b97052507b29ffacf89a. The source, frozen predicate declarations, full annotations, prior top-20 snapshots and adjudication history are needed to reconstruct this score. Saved validation reports 31 passing pipeline tests and no remaining identical-evidence conflicts; none was rerun here.

## Interpretive role for later cleanup

A complete evaluation at a specified coverage level. It depends on the same saved run and annotation set as its neighboring cutoffs; it is not an independent experiment seed or a new result archive. No deletion or relabeling decision is made in this summary.
