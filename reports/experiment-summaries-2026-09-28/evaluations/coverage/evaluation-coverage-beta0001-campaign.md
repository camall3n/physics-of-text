# β=0.001 coverage campaign: four models and twenty evaluation conditions

The fixed-name coverage arms belong to [B03, entity defect dormant](../../bug-sets/03-entity-multiplicity-dormant/EVALUATION.md); the latent arms belong to [B04, entity correction applied](../../bug-sets/04-known-fixes-latent/EVALUATION.md). All four runs have β=0.001. These cutoffs reuse saved inference and annotations.

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: retrospective evaluation campaign, 2026-09-14; summary 2026-09-28. It changes the assessed relation prefix of saved runs without rerunning inference.

## Question and design

How does fact precision change when the highest-frequency relations must explain at least 57%, 60%, 70%, 80%, or 90% of input rows? The four saved conditions are fixed names and corrected latent entities, each at seeds 20260912 and 20260913. Every model uses β=0.001 and maxRels=400. Prefix selection is by assigned row count, not by precision, and all facts in every selected relation are included.

The union up to 90% across these run-specific populations contains 8,488 facts in 1,144 relations. Exactly 1,605 prior top-20 judgments were preserved and 6,883 additional cases were manually assessed. These are workload totals across different models, not one pooled fact population. Each of the twenty conditions has a separate summary in this folder.

## Recorded results

| Model / seed | Target | k | Row coverage | N | Precision bounds |
|---|---:|---:|---|---:|---|
| Latent / 20260912 | [57%](evaluation-coverage-latent-seed20260912-57.md) | 114 | 4860/8516 (57.07%) | 1527 | 66.01%–78.91% |
| Latent / 20260912 | [60%](evaluation-coverage-latent-seed20260912-60.md) | 126 | 5129/8516 (60.23%) | 1619 | 66.28%–78.75% |
| Latent / 20260912 | [70%](evaluation-coverage-latent-seed20260912-70.md) | 168 | 5969/8516 (70.09%) | 1885 | 64.19%–76.07% |
| Latent / 20260912 | [80%](evaluation-coverage-latent-seed20260912-80.md) | 220 | 6813/8516 (80.00%) | 2163 | 61.77%–73.46% |
| Latent / 20260912 | [90%](evaluation-coverage-latent-seed20260912-90.md) | 290 | 7668/8516 (90.04%) | 2468 | 58.71%–70.83% |
| Latent / 20260913 | [57%](evaluation-coverage-latent-seed20260913-57.md) | 116 | 4876/8516 (57.26%) | 1535 | 63.84%–76.22% |
| Latent / 20260913 | [60%](evaluation-coverage-latent-seed20260913-60.md) | 127 | 5131/8516 (60.25%) | 1625 | 62.83%–75.08% |
| Latent / 20260913 | [70%](evaluation-coverage-latent-seed20260913-70.md) | 167 | 5966/8516 (70.06%) | 1926 | 60.33%–72.69% |
| Latent / 20260913 | [80%](evaluation-coverage-latent-seed20260913-80.md) | 220 | 6825/8516 (80.14%) | 2231 | 57.91%–70.15% |
| Latent / 20260913 | [90%](evaluation-coverage-latent-seed20260913-90.md) | 287 | 7674/8516 (90.11%) | 2542 | 55.00%–67.23% |
| Fixed / 20260912 | [57%](evaluation-coverage-fixed-seed20260912-57.md) | 98 | 4868/8516 (57.16%) | 1073 | 82.76%–90.87% |
| Fixed / 20260912 | [60%](evaluation-coverage-fixed-seed20260912-60.md) | 109 | 5130/8516 (60.24%) | 1139 | 81.04%–89.82% |
| Fixed / 20260912 | [70%](evaluation-coverage-fixed-seed20260912-70.md) | 152 | 5965/8516 (70.04%) | 1325 | 78.11%–87.09% |
| Fixed / 20260912 | [80%](evaluation-coverage-fixed-seed20260912-80.md) | 209 | 6825/8516 (80.14%) | 1523 | 74.79%–84.11% |
| Fixed / 20260912 | [90%](evaluation-coverage-fixed-seed20260912-90.md) | 282 | 7671/8516 (90.08%) | 1732 | 71.65%–81.35% |
| Fixed / 20260913 | [57%](evaluation-coverage-fixed-seed20260913-57.md) | 104 | 4874/8516 (57.23%) | 1098 | 80.78%–89.16% |
| Fixed / 20260913 | [60%](evaluation-coverage-fixed-seed20260913-60.md) | 115 | 5126/8516 (60.19%) | 1160 | 80.26%–88.97% |
| Fixed / 20260913 | [70%](evaluation-coverage-fixed-seed20260913-70.md) | 159 | 5976/8516 (70.17%) | 1362 | 78.12%–87.08% |
| Fixed / 20260913 | [80%](evaluation-coverage-fixed-seed20260913-80.md) | 215 | 6815/8516 (80.03%) | 1541 | 74.95%–85.20% |
| Fixed / 20260913 | [90%](evaluation-coverage-fixed-seed20260913-90.md) | 285 | 7665/8516 (90.01%) | 1746 | 71.71%–82.19% |

Fixed-name runs have higher precision under this rubric, and expanding coverage usually lowers cumulative precision. Two seeds, differing fact populations and assistant semantic judgments do not establish a general statistical ranking or prove a published 95% result. The fixed-name interpretation is supported by the paper’s stated verbatim model, independently of this empirical ranking.

## Evaluation choices and caveats

S/E/A bounds are S/N to (S+A)/N, not confidence intervals. Row coverage is not recall. New predicates were frozen before case grading; genuinely unresolved relation meanings remain A rather than being omitted. A coherent fact can be supported by one row despite unrelated extra rows, so sentence purity is not measured. Shared exact-evidence checks led to fourteen explicitly recorded case amendments; earlier judgments and evidence remain available. Prior top-20 labels were not changed.

## Sources, reproducibility and role

- [Original campaign README](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/README.md); [complete comparison](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md); [method](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/METHOD.md).
- [Model designs](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/README.md); [saved source verification](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/models/provenance.md).
- [Recorded final verification](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/analysis/final_pipeline_validation.json); [case amendment ledger](../../../../experiments/nyt-beta-0p001-coverage-2026-09-14/analysis/exact_evidence_adjudications.json).

The twenty conditions are derived views of four inference outputs and one complete review per run. All source evidence, annotations, scope declarations and their history are relevant dependencies. This summary only reports existing checks; it performs no regeneration or new validation run. No files are proposed for deletion.
