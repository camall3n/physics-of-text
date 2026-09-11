"""python3 port of graph_precision_recall.py (numpy only): plot Figure 1 from prec_recall.out."""
import json
import sys

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np

data = json.load(open(sys.argv[1]))
out = sys.argv[2] if len(sys.argv) > 2 else "pr_polysemy.png"
recall_samples = np.linspace(0.1, 0.99, 30)

for entropy in sorted(data, key=float):
    curves = []
    for run in data[entropy]:
        r, p = np.array(run["recalls"]), np.array(run["precisions"])
        order = np.argsort(r, kind="stable")
        curves.append(np.interp(recall_samples, r[order], p[order]))
    plt.plot(recall_samples, np.mean(curves, axis=0), label=f"Entropy = {entropy}")

plt.xlabel("recall"); plt.ylabel("precision"); plt.xlim(0, 1); plt.ylim(0, 1)
plt.legend(loc="lower right")
plt.title(f"Precision/Recall vs Lexical Entropy (averaged over {len(next(iter(data.values())))} runs)")
plt.savefig(out, dpi=120)
print("wrote", out)
