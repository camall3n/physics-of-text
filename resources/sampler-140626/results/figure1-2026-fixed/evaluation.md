# Corrected Figure 1 evaluation

Mean precision for the 40 corrected worlds, with eight worlds per entropy bin.

| Entropy bin | Recall 0.1 | Recall 0.3 | Recall 0.5 | Recall 0.7 |
|---|---:|---:|---:|---:|
| 0.1 | 0.970 | 0.967 | 0.962 | 0.925 |
| 0.3 | 0.962 | 0.959 | 0.952 | 0.931 |
| 0.5 | 0.847 | 0.794 | 0.749 | 0.668 |
| 0.7 | 0.807 | 0.737 | 0.682 | 0.632 |
| 0.9 | 0.608 | 0.589 | 0.574 | 0.556 |

## Computation and limits

The plots reproduce `scripts/plot_precision_recall.py`: stable-sort each world's recall values, linearly interpolate precision using `numpy.interp`, then take the arithmetic mean over worlds. Plots use 30 recall values from 0.1 to 0.99; the table interpolates directly at 0.1, 0.3, 0.5 and 0.7. Duplicate recall values follow NumPy's convention. This is not a precision envelope or a pooled pair-level curve.

The CSV includes sample standard deviations across worlds, not confidence intervals. `evaluation_details.json` contains each world's interpolated values and actual entropy. Each world has 60 sentences and 1,770 unordered distinct-sentence-pair predictions. The metric asks whether two sentences express the same relation, not whether their argument entities are identical.

`PrecisionRecallCurve` ranks pairs individually without grouping tied posterior scores; its storage is grouped by ground-truth Boolean, which can affect ranking inside ties. The saved JSON omits posterior scores, so a tie-grouped reconstruction cannot be obtained from these files alone.

The available relation pool has 2 slots. Entity smart-split/merge fixes are not exercised by this relation-only experiment. Normalization, fact proposals and shared inference fixes are exercised. The supplied seed does not control every internal RNG.

Before-fix grades and comparisons were retired on 2026-09-28. The original before-fix raw `prec_recall.out` remains available as experiment evidence; this report evaluates only the corrected input.
