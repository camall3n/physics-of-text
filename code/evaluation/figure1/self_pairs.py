"""Corrected-run sensitivity analysis adding self-pairs to saved Figure 1 ranks.

No MCMC is run. No posterior scores can be recovered from the saved PR arrays.
We explicitly place the known-true self-pairs first (score-one tie convention)
and preserve the complete existing order of all distinct-sentence pairs.
"""
import copy
import csv
import hashlib
import json
import math
import platform
import sys
from datetime import datetime, timezone
from pathlib import Path

import numpy as np
from .curves import interpolate

RECALL_GRID = np.linspace(0.1, 0.99, 30)
CHECKPOINTS = np.array([0.1, 0.3, 0.5, 0.6, 0.7, 0.9])
TOLERANCE = 1e-8


def recover_counts(run, num_sentences):
    """Recover integer cumulative TP and the true-pair count; reject bad arrays."""
    if isinstance(num_sentences, bool) or not isinstance(num_sentences, int) or num_sentences < 2:
        raise ValueError("num_sentences must be an integer >= 2")
    try:
        p = np.asarray(run["precisions"], dtype=float)
        r = np.asarray(run["recalls"], dtype=float)
    except (KeyError, TypeError, ValueError) as exc:
        raise ValueError("Missing or invalid precision/recall arrays") from exc
    expected = num_sentences * (num_sentences - 1) // 2
    if p.ndim != 1 or r.ndim != 1 or len(p) != expected or len(r) != expected:
        raise ValueError("Expected one PR point per unordered distinct-sentence pair")
    if not np.all(np.isfinite(p)) or not np.all(np.isfinite(r)):
        raise ValueError("Non-finite precision/recall")
    if np.any(p < 0) or np.any(p > 1) or np.any(r < 0) or np.any(r > 1):
        raise ValueError("Precision/recall outside [0, 1]")
    ranks = np.arange(1, expected + 1)
    raw_tp = ranks * p
    tp = np.rint(raw_tp).astype(np.int64)
    if not np.allclose(raw_tp, tp, atol=TOLERANCE, rtol=0):
        raise ValueError("Precision does not encode integer true-positive counts")
    increments = np.diff(np.concatenate(([0], tp)))
    if not np.all((increments == 0) | (increments == 1)):
        raise ValueError("True-positive count must increase by zero or one per rank")
    total_true = int(tp[-1])
    if total_true <= 0:
        raise ValueError("A positive true-pair denominator is required")
    if not np.allclose(r, tp / total_true, atol=TOLERANCE, rtol=0):
        raise ValueError("Recall disagrees with reconstructed true-positive counts")
    return tp, total_true


def add_self_pairs(run, num_sentences=60):
    """Return a new PR curve with all n diagonal pairs before existing ranks."""
    tp, total_true = recover_counts(run, num_sentences)
    n = num_sentences
    original_ranks = np.arange(1, len(tp) + 1)
    result = copy.deepcopy(run)
    result["precisions"] = np.concatenate((np.ones(n), (tp + n) / (original_ranks + n))).tolist()
    result["recalls"] = np.concatenate((np.arange(1, n + 1) / (total_true + n), (tp + n) / (total_true + n))).tolist()
    counts = {"sentences": n, "distinct_pair_predictions": len(tp), "self_pair_predictions_added": n,
              "all_pair_predictions": len(tp) + n, "distinct_true_pairs": total_true,
              "all_true_pairs": total_true + n, "false_pairs_unchanged": len(tp) - total_true,
              "recall_after_self_prefix": n / (total_true + n)}
    return result, counts



def describe(values):
    values = np.asarray(values, dtype=float)
    n = len(values)
    sd = float(values.std(ddof=1)) if n > 1 else None
    return {"n": n, "mean": float(values.mean()), "sd": sd,
            "se": sd / math.sqrt(n) if sd is not None else None,
            "min": float(values.min()), "max": float(values.max()),
            "per_world": values.tolist()}


def sha256(file):
    return hashlib.sha256(file.read_bytes()).hexdigest()


def write_json(file, value):
    file.parent.mkdir(parents=True, exist_ok=True)
    file.write_text(json.dumps(value, indent=2, allow_nan=False) + "\n")


def generate(after_path, output, *, retired_inputs=()):
    import matplotlib
    matplotlib.use("Agg")
    import matplotlib.pyplot as plt
    from matplotlib.lines import Line2D

    after_path, output = Path(after_path), Path(output)
    if after_path.resolve() in {Path(p).resolve() for p in retired_inputs}:
        raise ValueError("Before-fix evaluation is retired; use the corrected run")
    inputs = {"after-fixes": after_path.resolve()}
    output = output.resolve()
    output.mkdir(parents=True, exist_ok=True)
    original, transformed, worlds = {}, {}, []
    input_hashes = {name: sha256(file) for name, file in inputs.items()}
    expected_bins = ["0.1", "0.3", "0.5", "0.7", "0.9"]
    for name, file in inputs.items():
        original[name] = json.loads(file.read_text())
        if sorted(original[name], key=float) != expected_bins:
            raise ValueError("Expected the five Figure 1 entropy bins")
        transformed[name] = {}
        for entropy in expected_bins:
            runs = original[name][entropy]
            if len(runs) != 8:
                raise ValueError("Expected exactly eight worlds in each entropy bin")
            transformed[name][entropy] = []
            for world_index, run in enumerate(runs, start=1):
                if not float(entropy) <= run["entropy"] < float(entropy) + 0.05:
                    raise ValueError("Actual entropy does not belong to the stated bin")
                curve, counts = add_self_pairs(run)
                transformed[name][entropy].append(curve)
                worlds.append({"sampler_version": name, "entropy_bin": float(entropy), "world": world_index,
                               "actual_entropy": run["entropy"], **counts})
        target = output / name / "prec_recall.out"
        if target.resolve() == file:
            raise ValueError("Output must not overwrite an input")
        write_json(target, transformed[name])

    summary = {"checkpoints": CHECKPOINTS.tolist(), "versions": {}}
    csv_rows = []
    for name in inputs:
        summary["versions"][name] = {}
        for entropy in expected_bins:
            raw_values = interpolate(original[name][entropy], CHECKPOINTS)
            self_values = interpolate(transformed[name][entropy], CHECKPOINTS)
            rows = []
            for i, recall in enumerate(CHECKPOINTS):
                raw_stats, self_stats = describe(raw_values[:, i]), describe(self_values[:, i])
                delta = describe(self_values[:, i] - raw_values[:, i])
                rows.append({"recall": float(recall), "distinct_pairs": raw_stats,
                             "self_pairs_included": self_stats, "within_world_precision_difference": delta})
                csv_rows.append({"sampler_version": name, "entropy_bin": entropy, "recall": recall, "worlds": 8,
                                 "distinct_precision_mean": raw_stats["mean"], "distinct_world_sd": raw_stats["sd"],
                                 "distinct_mean_se": raw_stats["se"], "self_precision_mean": self_stats["mean"],
                                 "self_world_sd": self_stats["sd"], "self_mean_se": self_stats["se"],
                                 "within_world_change_percentage_points": 100 * delta["mean"],
                                 "within_world_change_sd": delta["sd"], "within_world_change_se": delta["se"]})
            summary["versions"][name][entropy] = rows
    summary["crossing_diagnostic"] = {
        "sampler_version": "after-fixes", "recall": 0.6,
        "entropy_0.1": summary["versions"]["after-fixes"]["0.1"][3],
        "entropy_0.3": summary["versions"]["after-fixes"]["0.3"][3],
        "note": "The entropy bins contain different worlds; standard errors are descriptive across eight worlds, not a paired comparison between bins. The original versus self-pair values within each world are paired deterministic transformations."}
    write_json(output / "comparison_details.json", summary)
    with (output / "comparison_at_recall.csv").open("w", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=list(csv_rows[0]))
        writer.writeheader()
        writer.writerows(csv_rows)

    plt.rcParams.update({"font.size": 11, "axes.spines.top": False, "axes.spines.right": False})
    colors = plt.get_cmap("tab10").colors

    def save(fig, name):
        fig.savefig(output / (name + ".png"), dpi=160)
        fig.savefig(output / (name + ".svg"))
        plt.close(fig)

    fig, ax = plt.subplots(figsize=(8.2, 5.8))
    for entropy, color in zip(expected_bins, colors):
        ax.plot(RECALL_GRID, interpolate(transformed["after-fixes"][entropy], RECALL_GRID).mean(axis=0),
                color=color, lw=2.2, label=f"Entropy {entropy}")
    ax.set(xlabel="Recall", ylabel="Precision", xlim=(0, 1), ylim=(0, 1.02), title="Corrected Figure 1: self-pairs included")
    ax.grid(alpha=0.2)
    ax.legend(loc="lower left", frameon=False)
    fig.text(0.5, 0.016, "Evaluation only · Self-pairs first at score 1 · 8 corrected worlds per bin", ha="center", fontsize=9)
    fig.tight_layout(rect=(0, 0.045, 1, 1))
    save(fig, "pr_self_pairs")

    fig, ax = plt.subplots(figsize=(9, 6.5))
    for entropy, color in zip(expected_bins, colors):
        ax.plot(RECALL_GRID, interpolate(transformed["after-fixes"][entropy], RECALL_GRID).mean(axis=0), color=color, lw=2)
        ax.plot(RECALL_GRID, interpolate(original["after-fixes"][entropy], RECALL_GRID).mean(axis=0), color=color, lw=1.8, ls="--")
    ax.set(xlabel="Recall", ylabel="Precision", xlim=(0, 1), ylim=(0, 1.02), title="Self-pair effect on the corrected Figure 1 worlds")
    ax.grid(alpha=0.2)
    handles = [Line2D([0], [0], color=c, lw=2, label=f"Entropy {e}") for e, c in zip(expected_bins, colors)]
    handles += [Line2D([0], [0], color="black", lw=2, label="Including self-pairs"),
                Line2D([0], [0], color="black", lw=2, ls="--", label="Distinct pairs only")]
    ax.legend(handles=handles, loc="lower left", frameon=False, fontsize=9)
    fig.text(0.5, 0.016, "Solid versus dashed changes evaluation only; every curve uses the same corrected worlds.", ha="center", fontsize=9)
    fig.tight_layout(rect=(0, 0.045, 1, 1))
    save(fig, "self_pair_effect")

    diagnostic_grid = np.unique(np.concatenate((RECALL_GRID, [0.6])))
    fig, axes = plt.subplots(1, 2, figsize=(12, 5.6), sharex=True, sharey=True)
    for ax, data, title in zip(axes, (original, transformed), ("Distinct pairs only", "Including self-pairs")):
        for entropy, color in zip(("0.1", "0.3"), colors):
            values = interpolate(data["after-fixes"][entropy], diagnostic_grid)
            for curve in values:
                ax.plot(diagnostic_grid, curve, color=color, alpha=0.18, lw=1)
            ax.plot(diagnostic_grid, values.mean(axis=0), color=color, lw=3, label=f"Entropy {entropy}: mean of 8")
            exact = interpolate(data["after-fixes"][entropy], [0.6]).mean()
            ax.scatter([0.6], [exact], color=color, s=38, zorder=4)
        ax.axvline(0.6, color="gray", ls=":", lw=1)
        ax.set(xlabel="Recall", xlim=(0.4, 0.8), ylim=(0.6, 1.01), title=title)
        ax.grid(alpha=0.2)
    axes[0].set_ylabel("Precision")
    axes[1].legend(loc="lower left", frameon=False)
    fig.suptitle("After sampler fixes: individual worlds and the low-entropy curve crossing", fontsize=13)
    fig.text(0.5, 0.016, "Faint lines: individual worlds. Thick lines: means. Dots: exact interpolation at recall 0.6.", ha="center", fontsize=10)
    fig.tight_layout(rect=(0, 0.045, 1, 0.95))
    save(fig, "crossing_diagnostic")

    if any(sha256(file) != input_hashes[name] for name, file in inputs.items()):
        raise RuntimeError("Input data changed while computing the variant")
    metadata = {
        "created_at": datetime.now(timezone.utc).isoformat(), "experiment": "Figure 1 self-pair evaluation-only sensitivity analysis",
        "new_mcmc_run": False, "sampler_code_changed": False,
        "input_files": {name: {"path": str(file), "sha256": input_hashes[name]} for name, file in inputs.items()},
        "script": str(Path(__file__).resolve()), "script_sha256": sha256(Path(__file__)),
        "command": [sys.executable, str(Path(__file__).with_name("cli.py").resolve()), "self-pairs", "--after", str(inputs["after-fixes"]), "--output", str(output)],
        "versions": {"python": platform.python_version(), "numpy": np.__version__, "matplotlib": matplotlib.__version__},
        "transformation": {"sentences_per_world": 60, "distinct_pairs_per_world": 1770, "all_pairs_per_world": 1830,
                           "formula": "TP_k = round(k * precision_k); T = TP_final; prepend n points (P=1,R=j/(T+n)); remaining points P=(TP_k+n)/(k+n), R=(TP_k+n)/(T+n)",
                           "validation": "Integer TP; increments in {0,1}; saved recalls equal TP/T; positive T; no mutation of inputs; 8 corrected worlds in each of 5 bins.",
                           "score_one_tie_convention": "All 60 self-pairs come before all distinct-sentence pairs, including any distinct pairs with score one. Existing distinct-pair order is unchanged.",
                           "limitation": "Saved PR arrays omit posterior scores. Actual score-one ties and a tie-grouped PR curve cannot be reconstructed. This is an explicit self-first convention, not a claim of reproducing an unknown paper tie policy."},
        "averaging": "Stable-sort each world's recall, np.interp at the evaluation grid, then arithmetic mean over worlds; same duplicate-recall convention as existing plot_precision_recall.py. No precision envelope.",
        "plot_recall_grid": RECALL_GRID.tolist(), "crossing_diagnostic_grid": diagnostic_grid.tolist(),
        "checkpoint_recalls": CHECKPOINTS.tolist(),
        "comparison_design": "Including versus excluding self-pairs is a deterministic same-world comparison of the corrected sampler run. Retired before-fix grades are not generated.",
        "worlds_checked": len(worlds), "per_world_counts": worlds,
        "output_sha256": {str(file.relative_to(output)): sha256(file) for file in sorted(output.rglob("*")) if file.is_file() and file.name not in ("README.md", "metadata.json")}}
    write_json(output / "metadata.json", metadata)
    print("Validated and transformed", len(worlds), "worlds without running MCMC; wrote", output)
    for name in inputs:
        e09 = summary["versions"][name]["0.9"]
        print(name, "entropy0.9 self precision@.1", e09[0]["self_pairs_included"]["mean"],
              "@.7", e09[4]["self_pairs_included"]["mean"])
    print(json.dumps(summary["crossing_diagnostic"], indent=2))

