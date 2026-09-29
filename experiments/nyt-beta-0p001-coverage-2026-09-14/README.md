# Corrected β=0.001 NYT models: precision versus input-row coverage

**Evaluation code — 2026-09-29:** maintained algorithms now live in [code/evaluation](../../code/evaluation/README.md); this campaign's scripts are compatible callers. Use preset `nyt-coverage` for read-only checks or a separate rendered review folder. [Selection rules and commands](../../code/evaluation/README.md#selection-is-separate-from-scoring) · [Equivalence evidence](../../reports/evaluation-consolidation-2026-09-29/README.md). Saved judgments and results are unchanged.

**All 20 evaluations are complete.** We assessed the four saved corrected β=0.001 outputs at **57%, 60%, 70%, 80% and 90% input-row coverage**, selecting the smallest frequency-ranked whole-relation prefix that reaches each target. Every expressed fact in each selected prefix is evaluated. There is no five-case cap or sampled subset.

Start with [the complete comparison table](comparison.md): it gives the exact top-k, achieved row coverage, S/E/A counts, full N, and precision endpoints for every model and cutoff. Click a percentage in that table to browse only that cutoff's relations, then a relation to see **every fact, its evidence, judgment, reason and ambiguity question**.

This is a coverage sensitivity evaluation of existing saved inference results. **No new MCMC chains, model fixes or parameter changes were introduced.** “Coverage” means the fraction of the 8,516 input rows assigned to selected relations, not the fraction of relation IDs and not gold-fact recall. The first point guarantees at least 57%; whole relations cause small overshoots.

## Precision ranges

Each cell links to its complete evaluation. Bounds are S/N to (S+A)/N: ambiguous cases counted unsupported or supported. They are not confidence intervals. Seed suffix **12 means 20260912** and **13 means 20260913**.

| Target row coverage | Fixed names, seed 12 | Fixed names, seed 13 | Latent entities, seed 12 | Latent entities, seed 13 |
|---|---|---|---|---|
| 57% | [82.76–90.87%](census/audit_06dbdb9b03af/coverage_57.md) | [80.78–89.16%](census/audit_9c88162c7b22/coverage_57.md) | [66.01–78.91%](census/audit_dcb746fa83d6/coverage_57.md) | [63.84–76.22%](census/audit_e318fe663470/coverage_57.md) |
| 60% | [81.04–89.82%](census/audit_06dbdb9b03af/coverage_60.md) | [80.26–88.97%](census/audit_9c88162c7b22/coverage_60.md) | [66.28–78.75%](census/audit_dcb746fa83d6/coverage_60.md) | [62.83–75.08%](census/audit_e318fe663470/coverage_60.md) |
| 70% | [78.11–87.09%](census/audit_06dbdb9b03af/coverage_70.md) | [78.12–87.08%](census/audit_9c88162c7b22/coverage_70.md) | [64.19–76.07%](census/audit_dcb746fa83d6/coverage_70.md) | [60.33–72.69%](census/audit_e318fe663470/coverage_70.md) |
| 80% | [74.79–84.11%](census/audit_06dbdb9b03af/coverage_80.md) | [74.95–85.20%](census/audit_9c88162c7b22/coverage_80.md) | [61.77–73.46%](census/audit_dcb746fa83d6/coverage_80.md) | [57.91–70.15%](census/audit_e318fe663470/coverage_80.md) |
| 90% | [71.65–81.35%](census/audit_06dbdb9b03af/coverage_90.md) | [71.71–82.19%](census/audit_9c88162c7b22/coverage_90.md) | [58.71–70.83%](census/audit_dcb746fa83d6/coverage_90.md) | [55.00–67.23%](census/audit_e318fe663470/coverage_90.md) |

The fixed-name models retain higher fact precision in these evaluations. Their lower endpoints fall from about 81–83% at 57% coverage to about 72% at 90%. The latent-entity models fall from about 64–66% to 55–59%. Expanding past the most frequent relations therefore exposes substantially more errors and ambiguity, especially with entity inference enabled. This is a descriptive comparison of different inferred fact populations under a common rubric; two seeds and assistant-authored semantic judgments do not establish a general statistical advantage.

The previous top-20 results remain exactly preserved. Those 20 relations covered only about 18–21% of input rows, so their better precision should not be read as precision at 57% or 90% coverage. Neither the broader results nor the earlier top-20 bounds establish a direct reproduction of the paper's 95% claim: the precise evaluated population and semantic rubric matter. See [METHOD.md](METHOD.md) for the distinctions between input-row coverage, fact precision, sentence-assignment purity and recall.

## Which models and fixes are included

The two model families each have two saved seeds. All use β=0.001, α=0.001, maxRels=400, the same corpus, and the same relation-inference schedule. The run-name fragment `beta0001` denotes **0.001**, not 0.0001.

| Family | Entity design | Applicable repairs | Full assessment |
|---|---|---|---|
| Fixed literal names | Exactly one entity per observed noun string; entity kernels disabled | All five earlier sampling defect families repaired in active relation code; the entity multiplicity defect is dormant because those kernels never execute | [Seed 20260912](census/audit_06dbdb9b03af/assessment.md), [seed 20260913](census/audit_9c88162c7b22/assessment.md) |
| Corrected latent entities | Initial noun-only entity inference, then restricted argument reassignment during relation inference | Earlier five families plus the subsequent entity smart split/merge factorial correction | [Seed 20260912](census/audit_dcb746fa83d6/assessment.md), [seed 20260913](census/audit_e318fe663470/assessment.md) |

The five families are fact-deletion proposal correction, smart-split signs, null aborted empty splits, log-sum/probability initialization, and reverse smart-merge normalizers. Fixed-name versus inferred entities, smoothing β, the finite relation pool, the integrated sparsity prior and the inference schedule remain modeling/algorithmic choices, not extra bug fixes introduced here.

Detailed, source-checked documentation:

- [Model overview](models/README.md), [fixed-name design](models/fixed_name.md), and [latent-entity design](models/latent_entity.md).
- [Mathematical probability target, priors, predictives, proposal schedule and MAP selection](models/target_and_inference.md).
- [Exact saved source/configuration/output verification and reproduction instructions](models/provenance.md).

## Complete review and inspection files

The 90% prefixes contain **8,488 run-specific facts across 1,144 relations**. Exactly **1,605 earlier top-20 judgments were preserved** and **6,883 additional facts were reviewed**. Every new relation's predicate was declared before entering its case grades. The five cutoffs reuse nested subsets of the same complete judgments; we did not independently sample cases for different percentages.

| Location | Contents |
|---|---|
| [comparison.md](comparison.md) / [comparison.json](comparison.json) | All 20 results, actual coverage, k, N and exact counts; earlier top-20 comparison |
| `census/<audit>/coverage_57.md` through `coverage_90.md` | One complete selected prefix per file, relation links and only its ambiguity questions; matching JSON contains every selected fact |
| `census/<audit>/reports/rel_*.md` | Declared meaning, full frequency dictionary, every fact, all local evidence, S/E/A, reason and question |
| `census/<audit>/declarations/` | Frozen relation interpretation, rationale, source/predicate hashes, and blank pregrading snapshots |
| `census/<audit>/annotations/` and `annotation_history/` | Primary judgments and retained versions of amendments |
| `census/<audit>/human_review.json` | Optional human adjudications; instructions in [METHOD.md](METHOD.md#browse-correct-and-reproduce) |
| [Semantic consistency results](analysis/semantic_consistency.md) | Checks identical complete evidence under the same predicate, including preserved reference censuses |
| [Explicit consistency adjudications](analysis/exact_evidence_adjudications.json) | Fourteen individually reviewed corrections, with earlier labels/reasons retained; no predicate or population changes |

Some low-frequency clusters do not admit a coherent relation meaning. These are explicitly marked unresolved, remain ambiguous, and stay in the denominator; each cutoff separately counts them. The upper endpoint assumes even those unresolved cases are correct. Other limitations include indirect dependency attachments, lost sentence context, and entity identity errors. All judgments concern support in the supplied local text evidence, not external factual verification.

## Verification and preservation

The complete-report validator checks every case, citation and frozen predicate, exact prior top-20 preservation, original MAP hashes, complete evidence and minimal nested coverage prefixes. All **31 regression tests passed**; [final validation](analysis/final_pipeline_validation.json) and [test log](analysis/pipeline_tests.tap) record the checks. Semantic labels were assigned by assistant reviewers reading the evidence, not by those tests or a keyword classifier. Final exact-evidence consistency checks find no remaining disagreements among the current cases or the matching preserved references. Consistency is not proof that every semantic judgment is correct.

All **9,721 protected pre-existing files and symlinks** were verified unchanged: [verification result](protected_verification.json), [original manifest](protected_manifest.json). This includes the original sampler, earlier experiments and HANDOFF. Every new artifact belongs to this separate folder. [METHOD.md](METHOD.md#browse-correct-and-reproduce) gives commands to regenerate the reports and rerun validation.

## Maintenance update — 2026-09-28

The 129 one-time grading entry scripts were removed after their judgments had been saved. Current annotations, earlier annotation versions, manual review records, predicate declarations, evidence and generated evaluations remain intact. Regenerate reports with the commands in METHOD.md; the deleted scripts were not report-generation dependencies. The reusable recording helpers and correction tools remain available.

See the [cleanup record](../../reports/grading-script-cleanup-2026-09-28/README.md) for the deleted-file inventory, line count and verification.
