# Corrected Figure 1 alternative: self-pairs included

This **separate evaluation variant** adds each sentence compared with itself to the [corrected Figure 1 run](../figure1-2026-fixed/README.md). It does not replace the distinct-pair figures or rerun MCMC. The corrected worlds, inferred rankings and entropy values are unchanged. The variant was created on 2026-09-12; before-fix grades and comparisons were retired on 2026-09-28.

## Figures and data

- [Corrected run with self-pairs](pr_self_pairs.png).
- [Effect of adding self-pairs to the corrected run](self_pair_effect.png): solid curves include self-pairs; dashed curves exclude them.
- [Why entropy 0.1 and 0.3 cross: individual corrected-run worlds](crossing_diagnostic.png).
- [Precision at selected recall values](comparison_at_recall.csv) and [per-world details](comparison_details.json).
- [Transformed corrected-run data](after-fixes/prec_recall.out).
- [Provenance, input fingerprints and checks](metadata.json).
- [Regression test output](regression_tests.txt): 12 tests pass, including raw count conservation for all 80 retained input worlds, explicit score-one ties, corrected-only reporting, and rejection of the retired reporting interface. Conservation tests on the preserved original raw data do not save before-fix grades.

All curves average eight worlds per entropy bin using the previous plotting convention: stable sorting by recall, linear interpolation of each world's precision, then an arithmetic mean. The principal plots use the same 30 recall values from 0.1 to 0.99. No worlds are excluded because they perform poorly.

## Exactly what changed

The question remains: **do the two sentences express the same relation?** It does not ask whether the sentences mention the same entities or express the same complete fact.

Each world has 60 sentences. Previously the evaluation included only distinct unordered pairs, `i < j`: `60 × 59 / 2 = 1,770` predictions. This variant uses `i <= j`: **1,830 predictions**, including 60 self-pairs. Reversed pairs are still counted only once. Every self-pair is true in the ground truth and has posterior probability 1 because a sentence necessarily has the same relation as itself.

For an original cutoff containing k predictions, let TP be its true positives and T the total number of true distinct-sentence pairs. After adding all 60 self-pairs:

```
precision = (TP + 60) / (k + 60)
recall    = (TP + 60) / (T + 60)
```

The recall denominator changes as well as the numerator. The total candidate count changes from 1,770 to 1,830. At the corresponding cutoff, false positives and false negatives among distinct pairs are unchanged; the improved precision and recall are an evaluation effect, not improved inference.

The saved files retain every rank's precision and recall, allowing recovery of `TP_k = round(k × precision_k)` and the ranked truth sequence. The script verifies those counts against every stored recall value before transforming them. It prepends 60 points with precision 1 and recalls `1/(T+60), ..., 60/(T+60)`, then transforms all original points. This preserves every original off-diagonal ranking.

**Explicit tie convention:** self-pairs are placed first, ahead of any distinct pair also having posterior score 1. This is a valid ranked-list convention, but a favorable one for the earliest precision values. The saved inputs do not contain posterior scores, so the exact original score-1 tie order and a curve that groups all equal-score predictions at one threshold cannot be reconstructed. These plots retain the existing individual-rank metric; they are not a repair of its score-tie limitation. A cutoff partway through an equal-score group need not correspond to a score threshold.

## Is this closer to the paper?

It is closer to the **archived evaluator's pair convention**. [SentenceSameRelations.java](../../src/main/java/org/ucb/generative_ie/inference/SentenceSameRelations.java) loops over all sentences, including the diagonal, and stores unordered pairs. The newer [LexicalEntropyExperiment.java](../../src/main/java/org/ucb/generative_ie/experiments/LexicalEntropyExperiment.java) explicitly uses `j = i + 1` and excludes self-pairs. This variant makes the candidate universe agree with the former. It does not establish that the archive is exactly the program used for the published figure, or reproduce its ordering within ties.

The [paper](../../../russell-2016-the-physics-of-text.pdf), Figure 1 on page 3 and discussion on page 4, does **not explicitly specify self-pairs, the candidate universe or tie handling**. Thus “confirmed reproduction of the paper's metric” would be too strong.

The largest visual discrepancy becomes substantially smaller, particularly at low recall and high entropy:

| Entropy 0.9, recall 0.1 | Corrected run |
|---|---:|
| Original distinct-pair evaluation | 60.8% |
| This self-pair variant | 83.2% |

The paper's discussion explicitly gives **90% precision at 10% recall** for entropy 0.9. The plotted curve itself appears nearer 96% at that location; that is an approximate visual reading, not published raw data. The corrected self-pair result remains below either reference. At moderate recall, agreement is much closer: the corrected entropy-0.9 curve is 61.2% at recall 0.5 and 58.3% at recall 0.7, versus approximately 61% and 57% read from the paper's plot. The paper's numeric data are unavailable here, so these latter comparisons are approximate.

The replication therefore does **not look uniformly very different**: the low-recall discrepancy shrinks greatly, and several medium/high-entropy curves resemble the paper at moderate recall. Meaningful differences remain. In particular, the entropy-0.3 replication performs substantially better than the paper over much of its curve, and the two low-entropy curves cross. Adding easy, certain positives helps explain the change in appearance without demonstrating better recovery of relationships between distinct sentences.

## Does the entropy-0.3 versus entropy-0.1 crossing make sense?

Yes, a crossing is possible; it is not by itself evidence of a sampler or plotting bug. In the corrected **distinct-pair** figure, at recall 0.6:

| Entropy bin | Worlds | Mean precision | Standard deviation across worlds |
|---|---:|---:|---:|
| 0.1 | 8 | 93.36% | 13.73 percentage points |
| 0.3 | 8 | 94.88% | 8.91 percentage points |

The difference is just **1.52 percentage points**, while variation across worlds is much larger. One entropy-0.1 world (the seventh saved run, actual entropy 0.1215943) scores **60.13%** at recall 0.6. The other seven average **98.11%**. This leave-one-out calculation diagnoses its influence; that world is retained in every reported mean. The standard deviations describe variability across these eight worlds, not a formal confidence interval or a repeated-chain convergence analysis.

[LexEntropy.java](../../src/main/java/org/ucb/generative_ie/world/LexEntropy.java) measures frequency-weighted uncertainty about the relation given a dependency path, assuming relations are chosen uniformly. It is one summary of the dictionaries, not a guarantee that two independently generated worlds will be ordered by precision at every recall. Different facts, relation frequencies, observed sentence samples and finite MCMC trajectories also affect performance. The bins contain different worlds, rather than a controlled experiment that increases ambiguity in an otherwise identical world. An entropy ordering alone does not imply pointwise dominance of precision-recall curves even with an ideal inference method.

For intuition, a dictionary collection can mix very distinctive paths with highly ambiguous ones. Its average entropy can be high while its easiest, highest-ranked predictions are excellent. Another collection can distribute a smaller amount of ambiguity more evenly. A single average entropy does not describe which portion of the ranked list contains the uncertainty.

With self-pairs, precision at recall 0.6 becomes **96.24% for entropy 0.1** and **95.40% for entropy 0.3**, so that particular crossing disappears. A small crossing remains at recall 0.7: **93.18% versus 93.94%**. This sensitivity is consistent with the small sample and the effect of ranking/interpolation; it does not prove that all remaining inference code is correct or that higher entropy improves inference.

## Reproduction and limitations

The implementation is [figure1_self_pairs.py](../../scripts/figure1_self_pairs.py), with independent reconstruction checks in [test_figure1_self_pairs.py](../../scripts/test_figure1_self_pairs.py). Use the project's configured Python environment. From the repository root:

```sh
MPLCONFIGDIR=/private/tmp/physics-figure1-mpl .venv/bin/python resources/sampler-140626/scripts/figure1_self_pairs.py
```

Comparison with and without self-pairs uses exactly the same corrected worlds and rankings. The reporting script accepts only the corrected-run input interface; its default invocation does not regenerate retired before-fix grades. The figure still has only eight worlds per bin, finite chains and the legacy rank/tie/interpolation conventions. Establishing closer quantitative reproduction requires saved posterior scores, defined tie handling, controlled random generators, and the paper's missing experimental settings.
