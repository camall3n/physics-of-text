# Report organization and migration record

The initial organization covered 82 experiment/evaluation/diagnostic summaries. The subsequent authorized cleanup retains 77 detailed summaries and short identity records for five retired evaluations. It does not reorganize raw scientific artifacts. A saved inference run has one canonical summary; beta and pre-fix views link to that summary and to the original case-level assessment.

## Classification rules

- Numeric beta comes from a saved run config or an explicitly documented configuration. A plotted entropy of 0.1 or a Dirichlet alpha of 0.1 is not beta=0.1.
- Known sampling defects are classified by source state and whether the affected kernel executed. Fixed-name runs retaining an unused entity defect are distinct from latent runs executing it.
- The six known families are the earlier five-family repair plus the later entity-count factorial correction. This label does not assert universal correctness, convergence, or a corrected finite-pool prior.
- Earlier reconstruction fixes, adjacent numerical/query fixes, model choices and uncertain source provenance are described in the bug catalog.
- Saved historical artifacts whose producing source/configuration cannot be identified remain unclassified. Documented-only pre-fix conditions are listed separately from saved and evaluated runs.
- Validation replay indices 0/1 repeat one seed in separate JVMs. They are not extra NYT precision experiments.
- New comparable top-20 tables reuse the saved harmonized assessments. Historical sampled tables remain explicitly labeled and preserve their original estimator and results. Surviving per-run labels, denominators and predicates remain unchanged.
- Cross-run analyses and evaluations retain separate identities and link to every applicable group.

## Scope of document changes

Five active-defect run reports and three associated group EVALUATION.md files were removed. Their score rows were removed from shared views; retained per-run values are unchanged. Group READMEs preserve identity, configuration and raw-output links. A wording error in the bridge analysis was corrected: the entity factorial *correction* is absent from controlled source; its defect is dormant under fixed names.

New BUGS.md and EVALUATION.md documents explain the groups. The parameter and pre-fix selectors are views over canonical reports, not copied inference outputs. Original bug-audit documents remain at their historical locations and are linked from the new descriptions.

Raw-run historical commands, source hashes and configurations are retained. Evaluation manifests are adjusted by the [cleanup](../buggy-evaluation-cleanup-2026-09-28/README.md). This record maps report locations only; it is not a regenerated scientific provenance manifest.

## Complete report map

| Previous filename at report root | Canonical report |
|---|---|
| analysis-nyt-active-kernel-oracles.md | [Active relation kernels: independent oracles and sampled stationary-distribution checks](analysis/analysis-nyt-active-kernel-oracles.md) |
| analysis-nyt-corpus-audit.md | [Unchanged NYT input: corpus and dependency-path diagnostics](analysis/analysis-nyt-corpus-audit.md) |
| analysis-nyt-count-prior-enumeration.md | [NYT relation-count prior: exact enumeration and finite-pool sensitivity](analysis/analysis-nyt-count-prior-enumeration.md) |
| analysis-nyt-entity-multiplicity-chains.md | [Entity multiplicity defect: counterexample and exact partition-chain experiment](analysis/analysis-nyt-entity-multiplicity-chains.md) |
| analysis-nyt-literal-latent-partition-study.md | [Six saved NYT worlds: literal-pair and latent-fact partition diagnostics](analysis/analysis-nyt-literal-latent-partition-study.md) |
| analysis-nyt-model-choice-numerical-study.md | [Paper/model comparison: entity, smoothing, sparsity and reporting calculations](analysis/analysis-nyt-model-choice-numerical-study.md) |
| analysis-nyt-sentence-relation-bridge.md | [Optional sentence/relation bridge: reversibility validation and finite-budget diagnostic](analysis/analysis-nyt-sentence-relation-bridge.md) |
| baseline-nyt-2026-before-sampling-fixes.md | [Retired evaluation: run identity and raw outputs](bug-sets/01-before-sampling-fixes-latent/README.md) |
| baseline-nyt-2026-fixed-400.md | [Retired evaluation: run identity and raw outputs](bug-sets/02-entity-multiplicity-active/README.md) |
| baseline-nyt-post-import-250-fact-moves-only-documented-only.md | [Post-import NYT 250-row run: fact moves only](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) |
| baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md | [Post-import NYT 250-row run: relation split/merge enabled](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) |
| baseline-nyt-post-import-2500-scaling-documented-only.md | [Post-import NYT 2,500-row scaling run](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-2500-scaling-documented-only.md) |
| controlled-nyt-entityfix_latent_beta0001_seed20260912.md | [NYT inference: corrected latent entities, beta=0.001, seed 20260912](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) |
| controlled-nyt-entityfix_latent_beta0001_seed20260913.md | [NYT inference: corrected latent entities, beta=0.001, seed 20260913](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) |
| controlled-nyt-entityfix_latent_beta01_seed20260912.md | [NYT inference: corrected latent entities, beta=0.1, seed 20260912](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) |
| controlled-nyt-entityfix_latent_beta01_seed20260913.md | [NYT inference: corrected latent entities, beta=0.1, seed 20260913](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) |
| controlled-nyt-latent_beta01_seed20260912.md | [Retired evaluation: run identity and raw outputs](bug-sets/02-entity-multiplicity-active/README.md) |
| controlled-nyt-latent_beta01_seed20260913.md | [Retired evaluation: run identity and raw outputs](bug-sets/02-entity-multiplicity-active/README.md) |
| controlled-nyt-verbatim_beta0001_seed20260912.md | [NYT inference: fixed literal names, beta=0.001, seed 20260912](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) |
| controlled-nyt-verbatim_beta0001_seed20260913.md | [NYT inference: fixed literal names, beta=0.001, seed 20260913](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md) |
| controlled-nyt-verbatim_beta01_bridge_seed20260912.md | [NYT inference: fixed literal names, beta=0.1, seed 20260912, optional bridge](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) |
| controlled-nyt-verbatim_beta01_bridge_seed20260913.md | [NYT inference: fixed literal names, beta=0.1, seed 20260913, optional bridge](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) |
| controlled-nyt-verbatim_beta01_seed20260912.md | [NYT inference: fixed literal names, beta=0.1, seed 20260912](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260912.md) |
| controlled-nyt-verbatim_beta01_seed20260913.md | [NYT inference: fixed literal names, beta=0.1, seed 20260913](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260913.md) |
| evaluation-complete-top20-all-models.md | [Complete top-20 evaluation of 10 retained NYT runs](evaluations/campaigns/evaluation-complete-top20-all-models.md) |
| evaluation-coverage-beta0001-campaign.md | [β=0.001 coverage campaign: four models and twenty evaluation conditions](evaluations/coverage/evaluation-coverage-beta0001-campaign.md) |
| evaluation-coverage-fixed-seed20260912-57.md | [Fixed literal names, seed 20260912: 57% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-57.md) |
| evaluation-coverage-fixed-seed20260912-60.md | [Fixed literal names, seed 20260912: 60% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-60.md) |
| evaluation-coverage-fixed-seed20260912-70.md | [Fixed literal names, seed 20260912: 70% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-70.md) |
| evaluation-coverage-fixed-seed20260912-80.md | [Fixed literal names, seed 20260912: 80% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-80.md) |
| evaluation-coverage-fixed-seed20260912-90.md | [Fixed literal names, seed 20260912: 90% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-90.md) |
| evaluation-coverage-fixed-seed20260913-57.md | [Fixed literal names, seed 20260913: 57% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-57.md) |
| evaluation-coverage-fixed-seed20260913-60.md | [Fixed literal names, seed 20260913: 60% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-60.md) |
| evaluation-coverage-fixed-seed20260913-70.md | [Fixed literal names, seed 20260913: 70% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-70.md) |
| evaluation-coverage-fixed-seed20260913-80.md | [Fixed literal names, seed 20260913: 80% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-80.md) |
| evaluation-coverage-fixed-seed20260913-90.md | [Fixed literal names, seed 20260913: 90% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-90.md) |
| evaluation-coverage-latent-seed20260912-57.md | [Corrected latent entities, seed 20260912: 57% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-57.md) |
| evaluation-coverage-latent-seed20260912-60.md | [Corrected latent entities, seed 20260912: 60% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-60.md) |
| evaluation-coverage-latent-seed20260912-70.md | [Corrected latent entities, seed 20260912: 70% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-70.md) |
| evaluation-coverage-latent-seed20260912-80.md | [Corrected latent entities, seed 20260912: 80% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-80.md) |
| evaluation-coverage-latent-seed20260912-90.md | [Corrected latent entities, seed 20260912: 90% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-90.md) |
| evaluation-coverage-latent-seed20260913-57.md | [Corrected latent entities, seed 20260913: 57% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-57.md) |
| evaluation-coverage-latent-seed20260913-60.md | [Corrected latent entities, seed 20260913: 60% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-60.md) |
| evaluation-coverage-latent-seed20260913-70.md | [Corrected latent entities, seed 20260913: 70% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-70.md) |
| evaluation-coverage-latent-seed20260913-80.md | [Corrected latent entities, seed 20260913: 80% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-80.md) |
| evaluation-coverage-latent-seed20260913-90.md | [Corrected latent entities, seed 20260913: 90% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-90.md) |
| evaluation-sampled-top20-2026-09-12.md | [Earlier five-fact screens: 2026-09-12](evaluations/campaigns/evaluation-sampled-top20-2026-09-12.md) |
| evaluation-sampled-top20-2026-09-14.md | [Earlier five-fact screens: 2026-09-14](evaluations/campaigns/evaluation-sampled-top20-2026-09-14.md) |
| exploratory-historical-experiment-code-inventory.md | [Historical experiment source inventory without an established saved run](unclassified/exploratory/reports/exploratory-historical-experiment-code-inventory.md) |
| exploratory-unattributed-logprobs.md | [Unattributed archived log-probability trace](unclassified/exploratory/reports/exploratory-unattributed-logprobs.md) |
| exploratory-world-py.md | [Exploratory world generation in world.py](unclassified/exploratory/reports/exploratory-world-py.md) |
| figure1-2026-after-fixes.md | [Figure 1: 2026 distinct-pair run after sampling fixes](bug-sets/06-known-fixes-relation-only/reports/figure1-2026-after-fixes.md) |
| figure1-2026-before-fixes.md | [Retired evaluation: run identity and raw outputs](bug-sets/05-before-sampling-fixes-relation-only/README.md) |
| figure1-2026-self-pairs-evaluation.md | [Figure 1: evaluation-only inclusion of self-pairs](evaluations/figure-1/figure1-2026-self-pairs-evaluation.md) |
| historical-nyt-all-poss-facts-250.md | [Archived all-poss-facts NYT 250-row output](unclassified/archive/reports/historical-nyt-all-poss-facts-250.md) |
| historical-nyt-all-poss-facts-2500.md | [Archived all-poss-facts NYT 2500-row output](unclassified/archive/reports/historical-nyt-all-poss-facts-2500.md) |
| historical-nyt-alpha1-rel100-misnested.md | [Archived alpha1-rel100 output nested below toy-output](unclassified/archive/reports/historical-nyt-alpha1-rel100-misnested.md) |
| historical-nyt-mccallum-output-1.md | [Historical NYT McCallum subset output-1](unclassified/archive/reports/historical-nyt-mccallum-output-1.md) |
| historical-nyt-mccallum-output-2.md | [Historical NYT McCallum subset output-2](unclassified/archive/reports/historical-nyt-mccallum-output-2.md) |
| historical-nyt-mccallum-output-3.md | [Historical NYT McCallum subset output-3](unclassified/archive/reports/historical-nyt-mccallum-output-3.md) |
| historical-nyt-mccallum-output-5.md | [Historical NYT McCallum subset output-5](unclassified/archive/reports/historical-nyt-mccallum-output-5.md) |
| historical-nyt-output-june12-corpus.md | [Historical NYT trigger output for the June-12 corpus](unclassified/archive/reports/historical-nyt-output-june12-corpus.md) |
| historical-nyt-overlap-diagnostic.md | [Historical sentence-overlap diagnostic](unclassified/archive/reports/historical-nyt-overlap-diagnostic.md) |
| historical-nyt-selected-cluster-fact-listings.md | [Historical selected NYT cluster and fact listings](unclassified/archive/reports/historical-nyt-selected-cluster-fact-listings.md) |
| historical-nyt-tmp-test-transcript.md | [Historical NYTExperimentTest transcript in tmp/results.txt](unclassified/archive/reports/historical-nyt-tmp-test-transcript.md) |
| synthetic-dirichlet-draw-diagnostic.md | [Archived Dirichlet draw diagnostic](unclassified/exploratory/reports/synthetic-dirichlet-draw-diagnostic.md) |
| synthetic-dpm-output-d15-n100-v5-a0.1-b0.001-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n100-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n100-v5-a0.1-b0.001-i100.md) |
| synthetic-dpm-output-d15-n100-v5-a0.1-b0.01-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n100-v5-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n100-v5-a0.1-b0.01-i100.md) |
| synthetic-dpm-output-d15-n1000-v5-a0.1-b0.001-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n1000-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n1000-v5-a0.1-b0.001-i100.md) |
| synthetic-dpm-output-d15-n20-v5-a0.1-b0.001-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n20-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n20-v5-a0.1-b0.001-i100.md) |
| synthetic-dpm-output-d15-n30-v1-a0.1-b0.01-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n30-v1-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v1-a0.1-b0.01-i100.md) |
| synthetic-dpm-output-d15-n30-v2-a0.1-b0.01-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n30-v2-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v2-a0.1-b0.01-i100.md) |
| synthetic-dpm-output-d15-n30-v4-a0.1-b0.01-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n30-v4-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v4-a0.1-b0.01-i100.md) |
| synthetic-dpm-output-d15-n30-v5-a0.1-b0.01-i100.md | [Archived Bernoulli-mixture configuration: output-d15-n30-v5-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v5-a0.1-b0.01-i100.md) |
| synthetic-hmm-learned-model.md | [Archived two-state HMM learning example](unclassified/exploratory/reports/synthetic-hmm-learned-model.md) |
| toy-historical-output-toy.md | [Archived output-toy ten-sentence toy run](unclassified/archive/reports/toy-historical-output-toy.md) |
| toy-historical-top-level-remnants.md | [Higher-level toy MAP and execution-log remnants](unclassified/archive/reports/toy-historical-top-level-remnants.md) |
| toy-historical-toy-output.md | [Archived toy-output ten-sentence toy run](unclassified/archive/reports/toy-historical-toy-output.md) |
| toy-post-import-beta05-documented-only.md | [Post-import toy inference-of-K, beta=0.5](bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-beta05-documented-only.md) |
| toy-post-import-sparse-beta001-documented-only.md | [Post-import toy inference-of-K, beta=0.01](bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-sparse-beta001-documented-only.md) |
| validation-nyt-latent-low-smoothing-2026-09-14.md | [Controlled NYT validation bundle: nyt-latent-low-smoothing-2026-09-14](validation/validation-nyt-latent-low-smoothing-2026-09-14.md) |
| validation-nyt-precision-investigation-2026-09-12.md | [Controlled NYT validation bundle: nyt-precision-investigation-2026-09-12](validation/validation-nyt-precision-investigation-2026-09-12.md) |
