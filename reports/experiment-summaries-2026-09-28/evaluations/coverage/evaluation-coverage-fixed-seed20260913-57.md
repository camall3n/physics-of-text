# Fixed literal names, seed 20260913: 57% input-row coverage

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: evaluation condition on a saved MAP run; original evaluation date 2026-09-14; summary written 2026-09-28. No new simulation or annotation was performed for this summary.

## Purpose and selected population

Select the smallest prefix of relations ranked by assigned input-row frequency that reaches 57% of the 8,516 input rows. Numeric relation ID breaks frequency ties. Whole boundary relations are retained. This point uses **k=104 relations**, **4874/8516 rows (57.23%)**, and **all 1098 expressed ordered latent facts** in that prefix.

This percentage is neither the fraction of relation IDs nor gold-fact recall. The five requested points for this run are nested slices of the same completed 90% census, not independent replications. Each point gets its own summary to make the requested coverage conditions individually reviewable.

## Underlying model and fixes

Saved inference run: verbatim_beta0001_seed20260913. Seed 20260913 controls its recorded random streams. Common settings: β=0.001, α=0.001, maxRels=400, numRels=200, initial numEnts=1199, integrated sparsity Beta(1,1437601), nominal 1000 iterations with 2000 proposal calls each, entityFraction=0.02, sentenceRelationMoveWeight=0. The basename beta0001 means 0.001.

Entity identities are fixed to exact observed noun strings. Entity inference and both argument Gibbs updates are disabled; the reserved entity budget is skipped. Active relation sampling includes the five earlier repair families. The later entity factorial defect remains in dormant source code but its affected kernels never execute. This is an entity-model restriction, not the factorial repair.

Both families retain the 400-slot occupancy-prior dependence and finite-chain limitations. The best recorded MAP state is not a proven global optimum. No model parameter changes when this coverage point is selected.

## Recorded result

| Quantity | Value |
|---|---:|
| Supported S | 887 |
| Unsupported E | 119 |
| Ambiguous A | 92 |
| Complete fact denominator N | 1098 |
| Lower endpoint S/N | 80.78% |
| Upper endpoint (S+A)/N | 89.16% |
| Entirely unresolved relation meanings | 1 relations / 6 facts |

The additional block since the preserved top twenty comprises ranks 21–104: 576 S / 93 E / 65 A, N=734, bounds 78.47%–87.33%. This block result is distinct from cumulative precision above.

Bounds count A as unsupported or supported; they are not confidence intervals. Unresolved-predicate cases stay in the denominator and make the upper endpoint especially optimistic. Judgments concern support in supplied local paths, not external historical verification. Extra off-predicate rows may coexist with a supported fact.

## Relation to other results and the paper

The preserved top-20 result for this same run is 311/364 to 338/364, or 85.44%–92.86%, at only 18.59% row coverage. Comparing that score with this point changes the evaluated population, not the fitted model.

The fixed-name restriction is the closer match to the paper’s explicit verbatim-argument model, though its precise published execution and name preprocessing remain uncertain.

## Inspection, provenance and dependencies

- [Every selected relation, full evidence and S/E/A judgments](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_9c88162c7b22/coverage_57.md).
- [Structured complete selected population](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_9c88162c7b22/coverage_57.json); [fixed coverage selection](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_9c88162c7b22/coverage.json).
- [Original saved MAP rows](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/map_world_sentences.tsv); [original configuration](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/config.json); [original run manifest](../../../../experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913/run.json).
- [Model-specific design](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/fixed_name.md); [mathematical target and inference](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/target_and_inference.md).
- [Evaluation rubric](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/METHOD.md); [final recorded pipeline validation](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/analysis/final_pipeline_validation.json).

Original MAP SHA-256 recorded by the evaluation: b6db21de59c94f2892766f29f6a34119694b6235c4001f33daf657b3aae10fea. The source, frozen predicate declarations, full annotations, prior top-20 snapshots and adjudication history are needed to reconstruct this score. Saved validation reports 31 passing pipeline tests and no remaining identical-evidence conflicts; none was rerun here.

## Interpretive role for later cleanup

A complete evaluation at a specified coverage level. It depends on the same saved run and annotation set as its neighboring cutoffs; it is not an independent experiment seed or a new result archive. No deletion or relabeling decision is made in this summary.
