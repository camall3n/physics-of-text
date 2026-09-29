"""Common per-world interpolation. Stable sorting and duplicate-recall behavior are preserved."""
import numpy as np

def interpolate(runs, grid):
    """Match plot_precision_recall.py exactly, including duplicate recall handling."""
    values = []
    for run in runs:
        r, p = np.asarray(run["recalls"]), np.asarray(run["precisions"])
        order = np.argsort(r, kind="stable")
        values.append(np.interp(grid, r[order], p[order]))
    return np.asarray(values)

