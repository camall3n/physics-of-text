"""Render saved Figure 1 curves using the original Python 3 plot style."""
import json
from pathlib import Path
import numpy as np
from .curves import interpolate


def generate(input_path, output_path="pr_polysemy.png"):
    import matplotlib
    matplotlib.use("Agg")
    import matplotlib.pyplot as plt
    data = json.loads(Path(input_path).read_text())
    recall_samples = np.linspace(0.1, 0.99, 30)
    # A fresh figure avoids shared pyplot state when called repeatedly as a library.
    plt.figure()
    for entropy in sorted(data, key=float):
        curves = interpolate(data[entropy], recall_samples)
        plt.plot(recall_samples, np.mean(curves, axis=0), label=f"Entropy = {entropy}")
    plt.xlabel("recall"); plt.ylabel("precision"); plt.xlim(0, 1); plt.ylim(0, 1)
    plt.legend(loc="lower right")
    plt.title(f"Precision/Recall vs Lexical Entropy (averaged over {len(next(iter(data.values())))} runs)")
    plt.savefig(output_path, dpi=120)
    plt.close()
    print("wrote", output_path)
