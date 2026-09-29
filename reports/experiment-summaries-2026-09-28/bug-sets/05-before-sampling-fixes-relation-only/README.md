# B05 — Figure 1 before sampling corrections: evaluation retired

[Bug description](BUGS.md) · [Cleanup record](../../../buggy-evaluation-cleanup-2026-09-28/README.md) · [All bug sets](../README.md)

The pre-fix evaluation report and derived score comparisons were removed because confirmed relation/query defects were applicable. The raw inference output remains available for debugging and provenance.

Identity: `figure1-2026`, documented 2026-09-11; β=0.5, alpha=0.01, 2 relation slots, 60 sentences per world, five entropy bins with eight worlds each. Inference uses 2,000 iterations, ten relation moves per iteration and nominal burn-in 500. Smart entity split/merge is not scheduled. Nominal seed 20130601 does not control every RNG.

[Raw per-world output](../../../../resources/sampler-140626/results/figure1-2026/prec_recall.out) · [experiment implementation](../../../../resources/sampler-140626/src/main/java/org/ucb/generative_ie/experiments/LexicalEntropyExperiment.java) · [corrected-run evaluation](../06-known-fixes-relation-only/EVALUATION.md).
