# Figure 1 evaluator

This evaluates synthetic **same-relation sentence pairs**, independently of NYT S/E/A fact judgments. Inference and posterior ranking remain in the sampler. It reads saved precision/recall arrays; it does not run inference or reconstruct missing posterior scores.

| Module | Input | Output |
|---|---|---|
| `curves.py` | Per-world arrays and recall grid | Stable sorting and NumPy interpolation, one row per world |
| `distinct_pairs.py` | Corrected distinct-pair arrays, output directory | Plots, checkpoint means, world SD and per-world values |
| `self_pairs.py` | Distinct-pair arrays, output directory | Self-first transformation, counts, same-world comparisons and plots |
| `plot_precision_recall.py` | Arrays, image path | Original Python 3 plot style |
| `cli.py` | Command and explicit paths | Calls evaluator; owns repository retirement policy |
| `test_self_pairs.py` | Fixtures and preserved raw worlds | Conservation, conventions and report equivalence checks |

From repository root:

```sh
.venv/bin/python code/evaluation/figure1/cli.py distinct --after resources/sampler-140626/results/figure1-2026-fixed/prec_recall.out --output /tmp/figure1-distinct
.venv/bin/python code/evaluation/figure1/cli.py self-pairs --after resources/sampler-140626/results/figure1-2026-fixed/prec_recall.out --output /tmp/figure1-self-pairs
PYTHONDONTWRITEBYTECODE=1 .venv/bin/python code/evaluation/figure1/test_self_pairs.py
```

The three historical paths under `resources/sampler-140626/scripts/` are thin compatibility callers. Their default input/output paths are unchanged; use an explicit temporary output directory for verification. Importing callers does not run reports. The authors' Python 2 `graph_*.py` files remain historical source evidence, outside the maintained evaluator.

## Selections and mathematical conventions

The standard corrected run has 60 sentences and 1,770 unordered distinct pairs per world, eight worlds in each of five entropy bins. The self-pair sensitivity view adds 60 known-positive diagonal pairs **before** existing ranks, including any distinct-pair score-one ties. It changes evaluation only.

For original rank `k`, cumulative true positives `TP_k`, and total true distinct pairs `T`:

- Original: `P_k = TP_k/k`, `R_k = TP_k/T`.
- Self-first tail: `P = (TP_k+60)/(k+60)`, `R = (TP_k+60)/(T+60)`.
- Prefix: `P=1`, `R=j/(T+60)` for `j=1..60`.

Interpolation, duplicate-recall handling, per-world averaging, checkpoints and precision calculations are unchanged. No precision envelope or tie-grouped posterior reconstruction is claimed. SD/SE describe between-world variability; they are not calibrated uncertainty in the published result.

Reusable `generate(input, output, retired_inputs=...)` functions require explicit paths. Retirement is a calling policy: the normal reporting calls reject the preserved known before-fix run before output creation. Raw before-fix arrays remain in conservation tests, not current evaluation reports.

Saved outputs and provenance are preserved. New self-pair metadata identifies the centralized source/hash and runnable `cli.py self-pairs` command; changing provenance paths does not change scientific arrays or metrics. PDF/SVG serialization can contain dates/generated IDs; equivalence checks compare scientific data and rendered PNGs rather than incidental PDF/SVG bytes.
