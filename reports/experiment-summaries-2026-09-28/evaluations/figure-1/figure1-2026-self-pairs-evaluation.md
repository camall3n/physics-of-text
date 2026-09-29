# Figure 1: evaluation-only inclusion of self-pairs

This evaluation retains [B06 after fixes](../../bug-sets/06-known-fixes-relation-only/EVALUATION.md). The [pre-fix evaluation is retired](../../bug-sets/05-before-sampling-fixes-relation-only/README.md).

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Reviewed 2026-09-28 from saved evidence only. No MCMC, evaluation script, regression test, or plot was run for this report.

## Condition and sources

This 2026-09-12 sensitivity analysis applies a self-pair evaluation change to the corrected saved Figure 1 run. It adds no inference run: [metadata](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/metadata.json) explicitly records `new_mcmc_run=false` and `sampler_code_changed=false`.

Sources: [full explanation](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/README.md), [transformed after-fix curves](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/after-fixes/prec_recall.out), [all checkpoint statistics](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/comparison_at_recall.csv), [individual worlds](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/comparison_details.json), [implementation](../../../../resources/sampler-140626/scripts/figure1_self_pairs.py), and [saved nine-test output](../../../../resources/sampler-140626/results/figure1-2026-self-pairs-included/regression_tests.txt).

## Design

The inherited worlds and inference settings are described in [the corrected-run report](../../bug-sets/06-known-fixes-relation-only/reports/figure1-2026-after-fixes.md): 40 worlds, five bins, eight worlds per bin, 60 sentences, two relations, 2,000 iterations, ten moves per iteration, 500 burn-in, and incompletely controlled seed 20130601. This transformation has no new simulation seed.

Within each world, the candidate set changes from 1,770 unordered distinct pairs (i<j) to 1,830 unordered pairs including the 60 self-pairs (i<=j). Each self-pair has ground truth true and posterior probability 1. The same-relation question does not require identical argument entities or complete facts.

For a parent rank k with TP true positives and T true distinct pairs, the transformed point is precision=(TP+60)/(k+60), recall=(TP+60)/(T+60), preceded by 60 perfect-precision ranks. The script reconstructs integer TP from saved precision and checks stored recall. Original distinct-pair order, entropy and worlds are preserved; false positives and false negatives at corresponding cutoffs remain unchanged.

All self-pairs precede all distinct pairs, including any distinct pairs tied at score 1. This deliberately explicit self-first tie convention favors early precision and does not fix the legacy tied-score ranking issue. Parent arrays lack scores, so a score-threshold curve grouping all ties cannot be recovered. Interpolated per-world curves are averaged with the parent plotting convention.

## Outcomes

Mean precision at recall 0.1, shown as original distinct-pair → self-pair evaluation:

| Entropy bin | Corrected parent: distinct pairs → self-pairs |
|---|---:|
| 0.1 | 0.970 → 0.988 |
| 0.3 | 0.962 → 0.990 |
| 0.5 | 0.847 → 0.946 |
| 0.7 | 0.807 → 0.913 |
| 0.9 | 0.608 → 0.832 |

At entropy 0.9, after-fix precision with self-pairs is 0.612 at recall 0.5 and 0.583 at recall 0.7 (distinct pairs: 0.574 and 0.556). Improvements are metric effects from certain positives, not improved recovery between distinct sentences.

The corrected distinct-pair means at recall 0.6 cross: entropy 0.1 gives 0.9336 and entropy 0.3 gives 0.9488. The seventh bin-0.1 world, actual entropy 0.1215943, has precision 0.6013 there; the other seven average 0.9811. No world is excluded. With self-pairs the means become 0.9624 and 0.9540, so this crossing disappears; a small crossing remains at recall 0.7 (0.9318 versus 0.9394). The world-level SDs and influence diagnostic explain sensitivity without establishing a new sampler defect.

## Correctness, provenance and relation to paper

Saved regression output reports nine passing tests, including all 80 parent worlds, score-one ties, and unchanged false-positive/false-negative counts. These are historical saved results, not fresh verification in this review. Metadata includes input/output/script hashes and Python 3.9.6, NumPy 2.0.2 and Matplotlib 3.9.4.

[The archived SentenceSameRelations evaluator](../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/inference/SentenceSameRelations.java) includes self-pairs, while the 2026 entry point excludes them. This condition is closer to that archived candidate convention. It does not prove which code generated the published figure: the paper does not explicitly define self-pairs or score ties, and the archive is not verified as its exact implementation. The paper's stated high-entropy value is 90% precision at recall 0.1; 83.2% here reduces, but do not remove, that difference.

The pre-fix derived evaluation was removed under the cleanup decision. The corrected parent retains its finite-chain, RNG and evaluation limitations. With-versus-without self-pairs is a controlled transformation of the same corrected ranked evidence.

This artifact's role is to separate inference behavior from evaluation-definition sensitivity and explain the low-entropy crossing. It provides a documented alternative reading of the same data, with the corrected-run evaluation retained.
