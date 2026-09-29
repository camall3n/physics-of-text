"""Evaluate the corrected Figure 1 run using the existing interpolation convention.

Reusable generator: explicit input/output paths; command setup is in cli.py.
The historical filename remains a compatibility caller.
"""
import csv
import json
from pathlib import Path

import numpy as np
from .curves import interpolate as interpolate_curves

RECALL_GRID = np.linspace(0.1, 0.99, 30)
CHECKPOINTS = np.array([0.1, 0.3, 0.5, 0.7])


def interpolate(runs, x):
    for run in runs:
        r, p = np.asarray(run["recalls"]), np.asarray(run["precisions"])
        if r.ndim != 1 or p.ndim != 1 or len(r) != 1770 or len(p) != 1770:
            raise ValueError("Expected 1,770 distinct-pair predictions per world")
        if not (np.all(np.isfinite(r)) and np.all(np.isfinite(p))):
            raise ValueError("Non-finite precision/recall")
        if not (np.all((0 <= r) & (r <= 1)) and np.all((0 <= p) & (p <= 1))):
            raise ValueError("Precision/recall outside [0, 1]")
        if not (np.all(np.diff(r) >= 0) and r[-1] == 1):
            raise ValueError("Recall must increase monotonically to 1")
    return interpolate_curves(runs, x)


def generate(fixed_path, out_dir, *, retired_inputs=()):
    import matplotlib
    matplotlib.use("Agg")
    import matplotlib.pyplot as plt

    fixed_path, out_dir = Path(fixed_path).resolve(), Path(out_dir).resolve()
    if fixed_path in {Path(p).resolve() for p in retired_inputs}:
        raise ValueError("Before-fix evaluation is retired; use the corrected run")
    fixed = json.loads(fixed_path.read_text())
    entropies = sorted(fixed, key=float)
    if entropies != ["0.1", "0.3", "0.5", "0.7", "0.9"]:
        raise ValueError("Expected the five Figure 1 entropy bins")
    rows, summary = [], {}
    for e in entropies:
        if len(fixed[e]) != 8 or not all(float(e) <= run["entropy"] < float(e) + 0.05 for run in fixed[e]):
            raise ValueError("Expected eight worlds with actual entropy in each stated bin")
        values = interpolate(fixed[e], CHECKPOINTS)
        summary[e] = {"worlds": len(fixed[e]), "actual_entropies": [r["entropy"] for r in fixed[e]], "checkpoints": []}
        for i, recall in enumerate(CHECKPOINTS):
            row = {"entropy_bin": float(e), "recall": float(recall),
                   "precision_mean": float(values[:, i].mean()),
                   "precision_world_sd": float(values[:, i].std(ddof=1))}
            rows.append(row)
            summary[e]["checkpoints"].append({**row, "per_world": values[:, i].tolist()})

    out_dir.mkdir(parents=True, exist_ok=True)
    plt.rcParams.update({"font.size": 11, "axes.spines.top": False, "axes.spines.right": False})
    fig, ax = plt.subplots(figsize=(8.2, 5.8))
    for e, color in zip(entropies, plt.get_cmap("tab10").colors):
        ax.plot(RECALL_GRID, interpolate(fixed[e], RECALL_GRID).mean(axis=0), color=color, lw=2, label=f"Entropy {e}")
    ax.set(xlabel="Recall", ylabel="Precision", xlim=(0, 1), ylim=(0, 1.02), title="Figure 1 replication after sampler fixes")
    ax.grid(alpha=0.2)
    ax.legend(loc="lower left", frameon=False)
    fig.text(0.5, 0.015, "8 independent worlds per entropy bin · 2,000 iterations · 10 moves per iteration", ha="center", fontsize=9)
    fig.tight_layout(rect=(0, 0.035, 1, 1))
    fig.savefig(out_dir / "pr_polysemy.png", dpi=160)
    fig.savefig(out_dir / "pr_polysemy.pdf")
    plt.close(fig)
    with (out_dir / "precision_at_recall.csv").open("w", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=list(rows[0]))
        writer.writeheader()
        writer.writerows(rows)
    (out_dir / "evaluation_details.json").write_text(json.dumps(summary, indent=2, allow_nan=False) + "\n")
    lines = ["# Corrected Figure 1 evaluation", "", "Mean precision for the 40 corrected worlds, with eight worlds per entropy bin.", "", "| Entropy bin | Recall 0.1 | Recall 0.3 | Recall 0.5 | Recall 0.7 |", "|---|---:|---:|---:|---:|"]
    for e in entropies:
        cells = [f"{r['precision_mean']:.3f}" for r in summary[e]["checkpoints"]]
        lines.append("| " + e + " | " + " | ".join(cells) + " |")
    lines += ["", "## Computation and limits", "", "The plots reproduce `scripts/plot_precision_recall.py`: stable-sort each world's recall values, linearly interpolate precision using `numpy.interp`, then take the arithmetic mean over worlds. Plots use 30 recall values from 0.1 to 0.99; the table interpolates directly at 0.1, 0.3, 0.5 and 0.7. Duplicate recall values follow NumPy's convention. This is not a precision envelope or a pooled pair-level curve.", "", "The CSV includes sample standard deviations across worlds, not confidence intervals. `evaluation_details.json` contains each world's interpolated values and actual entropy. Each world has 60 sentences and 1,770 unordered distinct-sentence-pair predictions. The metric asks whether two sentences express the same relation, not whether their argument entities are identical.", "", "`PrecisionRecallCurve` ranks pairs individually without grouping tied posterior scores; its storage is grouped by ground-truth Boolean, which can affect ranking inside ties. The saved JSON omits posterior scores, so a tie-grouped reconstruction cannot be obtained from these files alone.", "", "The available relation pool has 2 slots. Entity smart-split/merge fixes are not exercised by this relation-only experiment. Normalization, fact proposals and shared inference fixes are exercised. The supplied seed does not control every internal RNG.", "", "Before-fix grades and comparisons were retired on 2026-09-28. The original before-fix raw `prec_recall.out` remains available as experiment evidence; this report evaluates only the corrected input.", ""]
    (out_dir / "evaluation.md").write_text("\n".join(lines))
    print("Validated 40 corrected worlds; wrote plots, checkpoint table and per-world metrics to", out_dir)

