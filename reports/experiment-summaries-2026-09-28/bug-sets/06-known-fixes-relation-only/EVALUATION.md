# B06 — Figure 1 after relevant sampling/query corrections — evaluation

[Main index](../../README.md) · [Bug catalog](../../BUG_CATALOG.md) · [All complete NYT results](../../evaluations/campaigns/evaluation-complete-top20-all-models.md)

[Bug descriptions, implications and fixes](BUGS.md)

## Saved synthetic precision–recall results

Both Figure 1 runs use β=0.5. The 0.1 row label is an entropy bin, not beta. Each condition contains eight worlds; checkpoints are means of interpolated per-world precision over distinct unordered sentence pairs. These metrics are not NYT fact precision.

[Full Figure 1 report and raw evidence](reports/figure1-2026-after-fixes.md)

| Entropy bin | Recall 0.1 | Recall 0.3 | Recall 0.5 | Recall 0.7 |
|---|---:|---:|---:|---:|
| 0.1 | 0.970 | 0.967 | 0.962 | 0.925 |
| 0.3 | 0.962 | 0.959 | 0.952 | 0.931 |
| 0.5 | 0.847 | 0.794 | 0.749 | 0.668 |
| 0.7 | 0.807 | 0.737 | 0.682 | 0.632 |
| 0.9 | 0.608 | 0.589 | 0.574 | 0.556 |

[Self-pair sensitivity evaluation of the corrected run](../../evaluations/figure-1/figure1-2026-self-pairs-evaluation.md). This is a different evaluation convention, not another inference run. RNG control was incomplete. The pre-fix evaluation was retired; these results do not isolate a causal effect of repairs.

## Canonical experiment summaries

- [Figure 1: 2026 distinct-pair run after sampling fixes](reports/figure1-2026-after-fixes.md)

Recorded results are retained for inspection; no deletion decision or claim of universal sampler correctness is implied.
