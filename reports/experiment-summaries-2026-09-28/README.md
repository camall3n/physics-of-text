# Experiment summary index — 2026-09-28

**Maintained evaluation:** [one code location, campaign presets and selection rules](../../code/evaluation/README.md). Existing experiment summaries and saved results remain in place; [refactor equivalence record](../evaluation-consolidation-2026-09-29/README.md).

## Classification and retention status

Reports are now organized by the known bug state of the executed kernels. Each original summary has one canonical location. The parameter and pre-fix folders are overlapping navigation/evaluation views, so membership does not duplicate an experiment or its annotations.

- [β=0.1: separate evaluation and complete inventory](beta-0p1/EVALUATION.md): 6 retained full-NYT evaluations, 4 retired evaluations, 2 documented-only conditions, and 12 toy replay processes.
- [Pre-fix: retired evaluations and retained evidence](pre-fix/EVALUATION.md): distinguish before the earlier repairs from the later entity defect still being active.
- [β=0.001: separate evaluation](beta-0p001/EVALUATION.md): 4 saved full-NYT runs, plus their distinct validation evidence.
- [All bug sets](bug-sets/README.md) and [bug catalog with original audit links](BUG_CATALOG.md).
- [Complete top-20 comparison, grouped by bug state](evaluations/campaigns/evaluation-complete-top20-all-models.md).
- [Organization, scope and exact old-to-new report map](ORGANIZATION.md).
- [Verification of summary cleanup and retained inventory](VERIFICATION.md).

Evaluation reports and grading data for four NYT runs and the pre-fix Figure 1 condition were removed because confirmed bugs affected their active inference. Raw experiment outputs, configurations, bug documentation and regression tests remain. See the [cleanup record](../buggy-evaluation-cleanup-2026-09-28/README.md). β=0.1 is a modeling choice, not an implementation defect. A dormant defect is distinguished from one exercised by inference; unknown historical provenance is not assigned a definite active bug set.


**77 retained Markdown summary reports**, organized below. This number includes inference runs, derived evaluation conditions, analytic/validation studies and historical evidence inventories; it is not a count of 77 independent MCMC experiments.

The initial summary review only created Markdown reports in this directory. It did not execute simulations or scientific tests, regenerate evaluations, change judgments or parameters, edit existing experiment files, move artifacts, or delete anything. Existing test passes and source checks quoted in the summaries are historical records. Read-only numerical and link checks were used to keep the summaries accurate.

## What each summary covers

Reports identify the experiment or output family, its scientific question, saved configuration and seed when known, model choices versus implementation repairs, recorded outcomes with their correct denominators, limitations, available provenance, related evaluations and reproduction dependencies. Missing records, uncertain source versions and ambiguous labels are stated explicitly. The active-defect evaluation removals are recorded separately; retained summaries cover corrected, dormant-defect and uncertain historical conditions.

## Paper interpretation used in this review

Fixed literal names are the closer reading of the elementary NYT model stated in the [paper](../../resources/russell-2016-the-physics-of-text.pdf), section 3 on printed page 53 and sections 4–5 on page 55: arguments are used verbatim, and generative entity mentions/entity resolution are described as extensions. That is textual evidence, not proof of the exact published executable. The surviving archive also contains active entity inference. Accordingly, latent runs are documented as separate modeling investigations with their own provenance; lower precision or a different scope alone is not treated as a reason to discard them.

The historical run token beta0001 denotes numeric beta=0.001. Seed suffixes 20260912 and 20260913 identify random inference trajectories, not train/test splits. The baseline directory nyt-2026-fixed-400 still uses latent entities.

## Suggested reading order

1. [Complete top-20 comparison across the ten retained full-NYT evaluations](evaluations/campaigns/evaluation-complete-top20-all-models.md). This distinguishes model results from changes in the assessment protocol.
2. [Fixed-name, beta=0.001, seed 20260912](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) and [seed 20260913](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md), with exact parameters, fixes and limitations.
3. [Four-model coverage campaign](evaluations/coverage/evaluation-coverage-beta0001-campaign.md), then any of its twenty individually documented conditions.
4. [Figure 1 after sampling fixes](bug-sets/06-known-fixes-relation-only/reports/figure1-2026-after-fixes.md) and [the self-pair evaluation variant](evaluations/figure-1/figure1-2026-self-pairs-evaluation.md).
5. The historical, missing-result and diagnostic groups below when reviewing dependencies and uncertain provenance.

## Inventory at a glance

| Category | Reports | Meaning of a report |
|---|---:|---|
| [Controlled full-NYT inference runs](#controlled-full-nyt-inference-runs) | 10 | Ten retained seed/configuration reports. Each report contains its actual design, bug status, MAP/final distinction, complete top-20 scores and earlier sampled estimates. Low-beta reports also include the five expanded coverage results. |
| [Earlier full-NYT baselines](#earlier-full-nyt-baselines) | 0 | Both baseline evaluations were retired. Raw-run identities and configurations remain in B01/B02. |
| [Figure 1 replication and evaluation variant](#figure-1-replication-and-evaluation-variant) | 2 | The corrected forty-world inference report and its self-pair sensitivity evaluation. The pre-fix evaluation was retired. |
| [NYT evaluation campaigns](#nyt-evaluation-campaigns) | 4 | Four reports describing the original sampled screens, the harmonized complete top-20 census, and the expanded coverage campaign. These are assessments of saved runs; they did not generate new MCMC worlds. |
| [Individual NYT coverage conditions](#individual-nyt-coverage-conditions) | 20 | Twenty separate conditions: four saved beta=0.001 model/seed combinations, each evaluated at 57%, 60%, 70%, 80% and 90% input-row coverage. Conditions within a run are nested and share annotations; they are not independent simulation runs. |
| [Historical NYT and toy output families](#historical-nyt-and-toy-output-families) | 14 | Preserved archival outputs, partial listings, transcripts and a sentence-overlap diagnostic. Matching files or plots are grouped with their producing output family where provenance permits; duplicate views are not counted as separate runs. |
| [Documented configurations without preserved raw results](#documented-configurations-without-preserved-raw-results) | 5 | Five post-import toy/NYT configurations reported in CHANGES or HANDOFF. Their summaries distinguish source-recorded claims from results that can actually be inspected. Older similarly named archive fixtures do not substitute for the missing runs. |
| [Archived Bernoulli-mixture configurations](#archived-bernoulli-mixture-configurations) | 8 | Eight configuration-level archives of binary-vector clustering diagnostics. Some contain appended executions with unidentified boundaries. They are not NYT semantic extraction or text-topic-model experiments. |
| [Model analyses and saved validation experiments](#model-analyses-and-saved-validation-experiments) | 9 | Seven analytic/diagnostic studies and two validation campaign summaries. The validation reports inventory all sixteen saved toy replay runs, including historical attempts; individual unit tests are supporting checks rather than separate scientific experiments. |
| [Exploratory code and component evidence](#exploratory-code-and-component-evidence) | 5 | Exploratory world generation, dormant experiment source, component diagnostics and an unattributed trace. Source-only examples are identified explicitly and are not represented as successful runs. |

## Reading numerical results

- Complete top-20 precision evaluates all expressed facts in the twenty most frequent relations. The earlier screens reviewed only five facts per relation, with population-weighted estimates. Both versions are labeled in the reports.
- S/E/A means supported / unsupported under the declared predicate / ambiguous. S/N to (S+A)/N is an ambiguity range conditional on the assessment, not a confidence interval or independent historical verification.
- Coverage refers to input rows assigned to selected relations. It is not gold-fact recall, the fraction of relation IDs, or the fraction of all real-world facts recovered.
- A later census or self-pair curve can change reported precision without changing the fitted model. Log probabilities, component sizes and corpus overlaps are not semantic accuracy scores.
- A saved best sampled world is not a proven global optimum. A source hash supports provenance; it does not prove convergence or absence of all bugs.

## Material provenance distinctions

The archive review found appended DPM sequences, a NYT-path output nested under a toy directory, partial sentence/fact listings, duplicated companion files and five post-import configurations lacking raw results. Those facts are documented in the corresponding summaries. Existing historical READMEs/HANDOFF were left unchanged; their earlier-stage descriptions should be read with their dates and the later evidence linked here.

## Controlled full-NYT inference runs

Ten retained seed/configuration reports. Each report contains its actual design, bug status, MAP/final distinction, complete top-20 scores and earlier sampled estimates. Low-beta reports also include the five expanded coverage results.

| Summary | File |
|---|---|
| [NYT inference: corrected latent entities, beta=0.001, seed 20260912](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) | controlled-nyt-entityfix_latent_beta0001_seed20260912.md |
| [NYT inference: corrected latent entities, beta=0.001, seed 20260913](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) | controlled-nyt-entityfix_latent_beta0001_seed20260913.md |
| [NYT inference: corrected latent entities, beta=0.1, seed 20260912](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) | controlled-nyt-entityfix_latent_beta01_seed20260912.md |
| [NYT inference: corrected latent entities, beta=0.1, seed 20260913](bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) | controlled-nyt-entityfix_latent_beta01_seed20260913.md |
| [NYT inference: fixed literal names, beta=0.001, seed 20260912](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) | controlled-nyt-verbatim_beta0001_seed20260912.md |
| [NYT inference: fixed literal names, beta=0.001, seed 20260913](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md) | controlled-nyt-verbatim_beta0001_seed20260913.md |
| [NYT inference: fixed literal names, beta=0.1, seed 20260912, optional bridge](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) | controlled-nyt-verbatim_beta01_bridge_seed20260912.md |
| [NYT inference: fixed literal names, beta=0.1, seed 20260913, optional bridge](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) | controlled-nyt-verbatim_beta01_bridge_seed20260913.md |
| [NYT inference: fixed literal names, beta=0.1, seed 20260912](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260912.md) | controlled-nyt-verbatim_beta01_seed20260912.md |
| [NYT inference: fixed literal names, beta=0.1, seed 20260913](bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260913.md) | controlled-nyt-verbatim_beta01_seed20260913.md |

## Earlier full-NYT baselines

Their evaluations were retired. Retained identities and raw outputs: [B01 nyt-2026](bug-sets/01-before-sampling-fixes-latent/README.md) and [B02 nyt-2026-fixed-400](bug-sets/02-entity-multiplicity-active/README.md).

## Figure 1 replication and evaluation variant

The corrected forty-world inference report and its self-pair sensitivity evaluation remain. The [pre-fix evaluation was retired](bug-sets/05-before-sampling-fixes-relation-only/README.md).

| Summary | File |
|---|---|
| [Figure 1: 2026 distinct-pair run after sampling fixes](bug-sets/06-known-fixes-relation-only/reports/figure1-2026-after-fixes.md) | figure1-2026-after-fixes.md |
| [Figure 1: evaluation-only inclusion of self-pairs](evaluations/figure-1/figure1-2026-self-pairs-evaluation.md) | figure1-2026-self-pairs-evaluation.md |

## NYT evaluation campaigns

Four reports describing the original sampled screens, the harmonized complete top-20 census, and the expanded coverage campaign. These are assessments of saved runs; they did not generate new MCMC worlds.

| Summary | File |
|---|---|
| [Complete top-20 evaluation of 10 retained NYT runs](evaluations/campaigns/evaluation-complete-top20-all-models.md) | evaluation-complete-top20-all-models.md |
| [β=0.001 coverage campaign: four models and twenty evaluation conditions](evaluations/coverage/evaluation-coverage-beta0001-campaign.md) | evaluation-coverage-beta0001-campaign.md |
| [Earlier five-fact screens: 2026-09-12](evaluations/campaigns/evaluation-sampled-top20-2026-09-12.md) | evaluation-sampled-top20-2026-09-12.md |
| [Earlier five-fact screens: 2026-09-14](evaluations/campaigns/evaluation-sampled-top20-2026-09-14.md) | evaluation-sampled-top20-2026-09-14.md |

## Individual NYT coverage conditions

Twenty separate conditions: four saved beta=0.001 model/seed combinations, each evaluated at 57%, 60%, 70%, 80% and 90% input-row coverage. Conditions within a run are nested and share annotations; they are not independent simulation runs.

| Summary | File |
|---|---|
| [Fixed literal names, seed 20260912: 57% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-57.md) | evaluation-coverage-fixed-seed20260912-57.md |
| [Fixed literal names, seed 20260912: 60% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-60.md) | evaluation-coverage-fixed-seed20260912-60.md |
| [Fixed literal names, seed 20260912: 70% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-70.md) | evaluation-coverage-fixed-seed20260912-70.md |
| [Fixed literal names, seed 20260912: 80% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-80.md) | evaluation-coverage-fixed-seed20260912-80.md |
| [Fixed literal names, seed 20260912: 90% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260912-90.md) | evaluation-coverage-fixed-seed20260912-90.md |
| [Fixed literal names, seed 20260913: 57% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-57.md) | evaluation-coverage-fixed-seed20260913-57.md |
| [Fixed literal names, seed 20260913: 60% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-60.md) | evaluation-coverage-fixed-seed20260913-60.md |
| [Fixed literal names, seed 20260913: 70% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-70.md) | evaluation-coverage-fixed-seed20260913-70.md |
| [Fixed literal names, seed 20260913: 80% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-80.md) | evaluation-coverage-fixed-seed20260913-80.md |
| [Fixed literal names, seed 20260913: 90% input-row coverage](evaluations/coverage/evaluation-coverage-fixed-seed20260913-90.md) | evaluation-coverage-fixed-seed20260913-90.md |
| [Corrected latent entities, seed 20260912: 57% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-57.md) | evaluation-coverage-latent-seed20260912-57.md |
| [Corrected latent entities, seed 20260912: 60% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-60.md) | evaluation-coverage-latent-seed20260912-60.md |
| [Corrected latent entities, seed 20260912: 70% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-70.md) | evaluation-coverage-latent-seed20260912-70.md |
| [Corrected latent entities, seed 20260912: 80% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-80.md) | evaluation-coverage-latent-seed20260912-80.md |
| [Corrected latent entities, seed 20260912: 90% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260912-90.md) | evaluation-coverage-latent-seed20260912-90.md |
| [Corrected latent entities, seed 20260913: 57% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-57.md) | evaluation-coverage-latent-seed20260913-57.md |
| [Corrected latent entities, seed 20260913: 60% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-60.md) | evaluation-coverage-latent-seed20260913-60.md |
| [Corrected latent entities, seed 20260913: 70% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-70.md) | evaluation-coverage-latent-seed20260913-70.md |
| [Corrected latent entities, seed 20260913: 80% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-80.md) | evaluation-coverage-latent-seed20260913-80.md |
| [Corrected latent entities, seed 20260913: 90% input-row coverage](evaluations/coverage/evaluation-coverage-latent-seed20260913-90.md) | evaluation-coverage-latent-seed20260913-90.md |

## Historical NYT and toy output families

Preserved archival outputs, partial listings, transcripts and a sentence-overlap diagnostic. Matching files or plots are grouped with their producing output family where provenance permits; duplicate views are not counted as separate runs.

| Summary | File |
|---|---|
| [Archived all-poss-facts NYT 250-row output](unclassified/archive/reports/historical-nyt-all-poss-facts-250.md) | historical-nyt-all-poss-facts-250.md |
| [Archived all-poss-facts NYT 2500-row output](unclassified/archive/reports/historical-nyt-all-poss-facts-2500.md) | historical-nyt-all-poss-facts-2500.md |
| [Archived alpha1-rel100 output nested below toy-output](unclassified/archive/reports/historical-nyt-alpha1-rel100-misnested.md) | historical-nyt-alpha1-rel100-misnested.md |
| [Historical NYT McCallum subset output-1](unclassified/archive/reports/historical-nyt-mccallum-output-1.md) | historical-nyt-mccallum-output-1.md |
| [Historical NYT McCallum subset output-2](unclassified/archive/reports/historical-nyt-mccallum-output-2.md) | historical-nyt-mccallum-output-2.md |
| [Historical NYT McCallum subset output-3](unclassified/archive/reports/historical-nyt-mccallum-output-3.md) | historical-nyt-mccallum-output-3.md |
| [Historical NYT McCallum subset output-5](unclassified/archive/reports/historical-nyt-mccallum-output-5.md) | historical-nyt-mccallum-output-5.md |
| [Historical NYT trigger output for the June-12 corpus](unclassified/archive/reports/historical-nyt-output-june12-corpus.md) | historical-nyt-output-june12-corpus.md |
| [Historical sentence-overlap diagnostic](unclassified/archive/reports/historical-nyt-overlap-diagnostic.md) | historical-nyt-overlap-diagnostic.md |
| [Historical selected NYT cluster and fact listings](unclassified/archive/reports/historical-nyt-selected-cluster-fact-listings.md) | historical-nyt-selected-cluster-fact-listings.md |
| [Historical NYTExperimentTest transcript in tmp/results.txt](unclassified/archive/reports/historical-nyt-tmp-test-transcript.md) | historical-nyt-tmp-test-transcript.md |
| [Archived output-toy ten-sentence toy run](unclassified/archive/reports/toy-historical-output-toy.md) | toy-historical-output-toy.md |
| [Higher-level toy MAP and execution-log remnants](unclassified/archive/reports/toy-historical-top-level-remnants.md) | toy-historical-top-level-remnants.md |
| [Archived toy-output ten-sentence toy run](unclassified/archive/reports/toy-historical-toy-output.md) | toy-historical-toy-output.md |

## Documented configurations without preserved raw results

Five post-import toy/NYT configurations reported in CHANGES or HANDOFF. Their summaries distinguish source-recorded claims from results that can actually be inspected. Older similarly named archive fixtures do not substitute for the missing runs.

| Summary | File |
|---|---|
| [Post-import NYT 250-row run: fact moves only](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) | baseline-nyt-post-import-250-fact-moves-only-documented-only.md |
| [Post-import NYT 250-row run: relation split/merge enabled](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) | baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md |
| [Post-import NYT 2,500-row scaling run](bug-sets/08-documented-pre-fix-unverified/reports/baseline-nyt-post-import-2500-scaling-documented-only.md) | baseline-nyt-post-import-2500-scaling-documented-only.md |
| [Post-import toy inference-of-K, beta=0.5](bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-beta05-documented-only.md) | toy-post-import-beta05-documented-only.md |
| [Post-import toy inference-of-K, beta=0.01](bug-sets/08-documented-pre-fix-unverified/reports/toy-post-import-sparse-beta001-documented-only.md) | toy-post-import-sparse-beta001-documented-only.md |

## Archived Bernoulli-mixture configurations

Eight configuration-level archives of binary-vector clustering diagnostics. Some contain appended executions with unidentified boundaries. They are not NYT semantic extraction or text-topic-model experiments.

| Summary | File |
|---|---|
| [Archived Bernoulli-mixture configuration: output-d15-n100-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n100-v5-a0.1-b0.001-i100.md) | synthetic-dpm-output-d15-n100-v5-a0.1-b0.001-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n100-v5-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n100-v5-a0.1-b0.01-i100.md) | synthetic-dpm-output-d15-n100-v5-a0.1-b0.01-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n1000-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n1000-v5-a0.1-b0.001-i100.md) | synthetic-dpm-output-d15-n1000-v5-a0.1-b0.001-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n20-v5-a0.1-b0.001-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n20-v5-a0.1-b0.001-i100.md) | synthetic-dpm-output-d15-n20-v5-a0.1-b0.001-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n30-v1-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v1-a0.1-b0.01-i100.md) | synthetic-dpm-output-d15-n30-v1-a0.1-b0.01-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n30-v2-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v2-a0.1-b0.01-i100.md) | synthetic-dpm-output-d15-n30-v2-a0.1-b0.01-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n30-v4-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v4-a0.1-b0.01-i100.md) | synthetic-dpm-output-d15-n30-v4-a0.1-b0.01-i100.md |
| [Archived Bernoulli-mixture configuration: output-d15-n30-v5-a0.1-b0.01-i100](unclassified/archive/reports/synthetic-dpm-output-d15-n30-v5-a0.1-b0.01-i100.md) | synthetic-dpm-output-d15-n30-v5-a0.1-b0.01-i100.md |

## Model analyses and saved validation experiments

Seven analytic/diagnostic studies and two validation campaign summaries. The validation reports inventory all sixteen saved toy replay runs, including historical attempts; individual unit tests are supporting checks rather than separate scientific experiments.

| Summary | File |
|---|---|
| [Active relation kernels: independent oracles and sampled stationary-distribution checks](analysis/analysis-nyt-active-kernel-oracles.md) | analysis-nyt-active-kernel-oracles.md |
| [Unchanged NYT input: corpus and dependency-path diagnostics](analysis/analysis-nyt-corpus-audit.md) | analysis-nyt-corpus-audit.md |
| [NYT relation-count prior: exact enumeration and finite-pool sensitivity](analysis/analysis-nyt-count-prior-enumeration.md) | analysis-nyt-count-prior-enumeration.md |
| [Entity multiplicity defect: counterexample and exact partition-chain experiment](analysis/analysis-nyt-entity-multiplicity-chains.md) | analysis-nyt-entity-multiplicity-chains.md |
| [Six saved NYT worlds: literal-pair and latent-fact partition diagnostics](analysis/analysis-nyt-literal-latent-partition-study.md) | analysis-nyt-literal-latent-partition-study.md |
| [Paper/model comparison: entity, smoothing, sparsity and reporting calculations](analysis/analysis-nyt-model-choice-numerical-study.md) | analysis-nyt-model-choice-numerical-study.md |
| [Optional sentence/relation bridge: reversibility validation and finite-budget diagnostic](analysis/analysis-nyt-sentence-relation-bridge.md) | analysis-nyt-sentence-relation-bridge.md |
| [Controlled NYT validation bundle: nyt-latent-low-smoothing-2026-09-14](validation/validation-nyt-latent-low-smoothing-2026-09-14.md) | validation-nyt-latent-low-smoothing-2026-09-14.md |
| [Controlled NYT validation bundle: nyt-precision-investigation-2026-09-12](validation/validation-nyt-precision-investigation-2026-09-12.md) | validation-nyt-precision-investigation-2026-09-12.md |

## Exploratory code and component evidence

Exploratory world generation, dormant experiment source, component diagnostics and an unattributed trace. Source-only examples are identified explicitly and are not represented as successful runs.

| Summary | File |
|---|---|
| [Historical experiment source inventory without an established saved run](unclassified/exploratory/reports/exploratory-historical-experiment-code-inventory.md) | exploratory-historical-experiment-code-inventory.md |
| [Unattributed archived log-probability trace](unclassified/exploratory/reports/exploratory-unattributed-logprobs.md) | exploratory-unattributed-logprobs.md |
| [Exploratory world generation in world.py](unclassified/exploratory/reports/exploratory-world-py.md) | exploratory-world-py.md |
| [Archived Dirichlet draw diagnostic](unclassified/exploratory/reports/synthetic-dirichlet-draw-diagnostic.md) | synthetic-dirichlet-draw-diagnostic.md |
| [Archived two-state HMM learning example](unclassified/exploratory/reports/synthetic-hmm-learned-model.md) | synthetic-hmm-learned-model.md |

## Verification of this documentation

The summaries were checked against their saved configurations, comparison tables, manifests and available output headers. The twenty retained coverage reports and ten retained complete-census rows describe the surviving evaluations. Every report appears exactly once in this index. Local link targets were checked for existence. These checks did not rerun the underlying experiments, scientific tests or semantic grading.

The cleanup removed five detailed run reports and three active-defect group evaluations, pruned their shared score tables, and retained short identity/configuration records. See [verification](VERIFICATION.md) for scope.
