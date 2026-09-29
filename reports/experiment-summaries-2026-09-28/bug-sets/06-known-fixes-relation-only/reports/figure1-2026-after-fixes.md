# Figure 1: 2026 distinct-pair run after sampling fixes

Classification: [bug description](../BUGS.md) · [group evaluation](../EVALUATION.md) · [all groups](../../../README.md).

Reviewed 2026-09-28 from saved evidence only. No experiment, test, or plot was run for this report.

## Purpose and evidence

This independent 40-world rerun asks how the synthetic same-relation recovery curves look after the documented sampling corrections. It was completed on 2026-09-11, preserving the earlier run.

Primary evidence: [README](../../../../../resources/sampler-140626/results/figure1-2026-fixed/README.md), [run metadata](../../../../../resources/sampler-140626/results/figure1-2026-fixed/run_metadata.json), [console log](../../../../../resources/sampler-140626/results/figure1-2026-fixed/run.log), [raw curves](../../../../../resources/sampler-140626/results/figure1-2026-fixed/prec_recall.out), [comparison and limitations](../../../../../resources/sampler-140626/results/figure1-2026-fixed/evaluation.md), [checkpoint means and standard deviations](../../../../../resources/sampler-140626/results/figure1-2026-fixed/precision_at_recall.csv), [per-world details](../../../../../resources/sampler-140626/results/figure1-2026-fixed/evaluation_details.json), and [saved plot](../../../../../resources/sampler-140626/results/figure1-2026-fixed/pr_polysemy.png).

## Exact documented design

Five entropy intervals start at 0.1, 0.3, 0.5, 0.7, 0.9, each with width 0.05; eight worlds are used per interval from 5,000 candidates. Each has 60 sentences, 10 entities, identity nouns, 2 relation slots, 5 paths, constant sparsity 0.3, alpha=0.01 and beta=0.5. The budget is 2,000 iterations × 10 relation-phase moves with 500 burn-in iterations; the corrected query accumulator retains 1,500 draws. Entity smart split/merge is not scheduled.

The saved Java command invokes `LexicalEntropyExperiment prec_recall.out 8 2000 10` with `-Xmx2g`, fresh `target-javac/classes` ahead of the archived dependency JAR, and logging disabled via the saved XML. Metadata records Temurin OpenJDK 25.0.4.1, exit code 0, 7.627 wall seconds, Git HEAD `13c3605ade242f9366e4bda55fabd394c23589dc`, and working-source SHA-256 `0e7c1dee85ac7257360db057d34e1ab1937311bc03162dfaa1dab0ec4a42510e`. Git HEAD alone does not identify the corrected working tree; its source fingerprint matters. No full source snapshot is stored in this directory.

The nominal seed is 20130601, with an explicit warning that it does not control every RNG. Worlds are consequently unpaired with the earlier run. Selection takes the first eight worlds in entropy-sorted bins, as documented by [SampleEntropy](../../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/world/SampleEntropy.java) and [the entry point](../../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/experiments/LexicalEntropyExperiment.java). Saved actual ranges are 0.101054–0.130558, 0.300069–0.304183, 0.500356–0.501251, 0.700054–0.700672, and 0.900332–0.901590.

## Outcomes

All 40 worlds supply 1,770 distinct unordered pair rankings, totaling 70,800; every curve reaches recall 1. Mean interpolated precision is:

| Entropy bin | Recall 0.1 | Recall 0.3 | Recall 0.5 | Recall 0.7 |
|---|---:|---:|---:|---:|
| 0.1 | 0.970 | 0.967 | 0.962 | 0.925 |
| 0.3 | 0.962 | 0.959 | 0.952 | 0.931 |
| 0.5 | 0.847 | 0.794 | 0.749 | 0.668 |
| 0.7 | 0.807 | 0.737 | 0.682 | 0.632 |
| 0.9 | 0.608 | 0.589 | 0.574 | 0.556 |

The earlier defective evaluation was retired; this table reports only the corrected run.

Plotting stable-sorts recall, uses linear interpolation within each world, and averages worlds; the plot uses 30 recall values from 0.1 to 0.99. CSV deviations describe world variability, not confidence intervals or convergence.

## Defect status and paper interpretation

The [fix record](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) and [additional findings](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) establish the correction of relevant shared normalization, fact-proposal, relation-numerics, and burn-in issues. The run metadata identifies the corrected working sources. These checks do not establish that every possible defect was removed or that this finite chain converged. Entity fixes do not explain changes here because this experiment does not exercise their kernels.

Remaining evaluation limitations include individual ranking of tied posterior scores, truth-grouped tie storage, unsaved posterior scores, interpolation choices, only eight worlds per bin, and incomplete seed propagation. A low-entropy curve crossing is documented in [the later sensitivity analysis](../../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/README.md): at recall 0.6, bin 0.1 has 93.36% mean precision with 13.73 percentage-point SD, versus 94.88% and 8.91 points for bin 0.3. One retained bin-0.1 world scores 60.13%; the crossing is not by itself a demonstrated bug.

The paper's Figure 1 and prose target the same conceptual task, but its exact experimental settings and score conventions are not fully specified. Its entropy-0.9 prose value is 90% at recall 0.1, while this distinct-pair run is 60.8%. Including self-pairs changes that value to 83.2% without altering inference. The fixed pool is 2; NYT's maxRels=400 setting does not describe this experiment.

## Reproducibility and later review

The result fingerprint is `46e0538f1bd6921c6fcd5e7669a0fb06e364daf6ef6eb4ff8df002b12ff74dc0`. Metadata preserves commands, versions and hashes; raw curves, comparison tables, figures and logs remain available. Missing controlled RNG state, generated worlds and posterior scores limit exact reruns and alternative evaluation.

This is the documented corrected synthetic baseline and the parent evidence for the after-fix self-pair evaluation. It supports implementation-history and metric-sensitivity review, without claiming a controlled causal effect of the fixes.
