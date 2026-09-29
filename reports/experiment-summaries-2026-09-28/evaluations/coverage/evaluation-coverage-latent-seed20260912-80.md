# Corrected latent entities, seed 20260912: 80% input-row coverage

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: evaluation condition on a saved MAP run; original evaluation date 2026-09-14; summary written 2026-09-28. No new simulation or annotation was performed for this summary.

## Purpose and selected population

Select the smallest prefix of relations ranked by assigned input-row frequency that reaches 80% of the 8,516 input rows. Numeric relation ID breaks frequency ties. Whole boundary relations are retained. This point uses **k=220 relations**, **6813/8516 rows (80.00%)**, and **all 2163 expressed ordered latent facts** in that prefix.

This percentage is neither the fraction of relation IDs nor gold-fact recall. The five requested points for this run are nested slices of the same completed 90% census, not independent replications. Each point gets its own summary to make the requested coverage conditions individually reviewable.

## Underlying model and fixes

Saved inference run: entityfix_latent_beta0001_seed20260912. Seed 20260912 controls its recorded random streams. Common settings: β=0.001, α=0.001, maxRels=400, numRels=200, initial numEnts=1199, integrated sparsity Beta(1,1437601), nominal 1000 iterations with 2000 proposal calls each, entityFraction=0.02, sentenceRelationMoveWeight=0. The basename beta0001 means 0.001.

Entity inference remains enabled: 40,000 noun-only entity proposals, synchronization of facts, then 1,960,000 relation-phase proposals with restricted argument-entity updates. The five earlier repair families and the later entity factorial correction are present. This two-phase procedure is not full joint sampling of entity count and relations under one target.

Both families retain the 400-slot occupancy-prior dependence and finite-chain limitations. The best recorded MAP state is not a proven global optimum. No model parameter changes when this coverage point is selected.

## Recorded result

| Quantity | Value |
|---|---:|
| Supported S | 1336 |
| Unsupported E | 574 |
| Ambiguous A | 253 |
| Complete fact denominator N | 2163 |
| Lower endpoint S/N | 61.77% |
| Upper endpoint (S+A)/N | 73.46% |
| Entirely unresolved relation meanings | 1 relations / 4 facts |

The additional block since the preceding coverage point comprises ranks 169–220: 126 S / 123 E / 29 A, N=278, bounds 45.32%–55.76%. This block result is distinct from cumulative precision above.

Bounds count A as unsupported or supported; they are not confidence intervals. Unresolved-predicate cases stay in the denominator and make the upper endpoint especially optimistic. Judgments concern support in supplied local paths, not external historical verification. Extra off-predicate rows may coexist with a supported fact.

## Relation to other results and the paper

The preserved top-20 result for this same run is 337/421 to 373/421, or 80.05%–88.60%, at only 18.15% row coverage. Comparing that score with this point changes the evaluated population, not the fitted model.

The latent-entity condition reflects capabilities found in the archived sampler and the paper’s broader ambition. The paper’s stated elementary NYT model more directly supports fixed verbatim names, so this condition should be interpreted as a separate modeling investigation, not dismissed merely for lower precision.

## Inspection, provenance and dependencies

- [Every selected relation, full evidence and S/E/A judgments](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_dcb746fa83d6/coverage_80.md).
- [Structured complete selected population](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_dcb746fa83d6/coverage_80.json); [fixed coverage selection](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/census/audit_dcb746fa83d6/coverage.json).
- [Original saved MAP rows](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/map_world_sentences.tsv); [original configuration](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/config.json); [original run manifest](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/run.json).
- [Model-specific design](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/latent_entity.md); [mathematical target and inference](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/target_and_inference.md).
- [Evaluation rubric](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/METHOD.md); [final recorded pipeline validation](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/analysis/final_pipeline_validation.json).

Original MAP SHA-256 recorded by the evaluation: 23bc536bced899125a6a30a82c93e7f273adf0fc22b9f6f3bca2bbcec9d019af. The source, frozen predicate declarations, full annotations, prior top-20 snapshots and adjudication history are needed to reconstruct this score. Saved validation reports 31 passing pipeline tests and no remaining identical-evidence conflicts; none was rerun here.

## Interpretive role for later cleanup

A complete evaluation at a specified coverage level. It depends on the same saved run and annotation set as its neighboring cutoffs; it is not an independent experiment seed or a new result archive. No deletion or relabeling decision is made in this summary.
