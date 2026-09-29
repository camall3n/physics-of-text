# Corrected Figure 1 replication

Completed on 2026-09-11 using the corrected working-tree sources and unchanged experiment budget: 8 worlds in each of five entropy bins, 2,000 iterations per world, 10 moves per iteration, 500 burn-in iterations. Java completed successfully in 7.627 seconds. The original before-fix raw output remains in `../figure1-2026/`; its derived evaluations were retired on 2026-09-28.

- [Corrected figure](pr_polysemy.png), also [PDF](pr_polysemy.pdf).
- [Corrected evaluation and limitations](evaluation.md).
- [Checkpoint table](precision_at_recall.csv); [per-world numbers](evaluation_details.json).
- [Raw precision/recall data](prec_recall.out).
- [Exact command, parameters, versions and fingerprints](run_metadata.json).
- [Console output](run.log).

This is the synthetic relation-recovery experiment: predictions concern whether two sentences express the same relation. Its relation pool has 2 slots. The NYT setting maxRels=400 does not apply here.

The experiment includes 40 worlds and 70,800 pair rankings in total. Each world's precision-recall curve is derived from 1,770 unordered pairs of its 60 sentences. The supplied RNG seed does not control all internal random generators, so independent runs are not controlled paired samples. The precision-recall implementation's legacy score tie handling is unchanged; see the evaluation limitations.

A [separate self-pairs-included variant](../figure1-2026-self-pairs-included/README.md), created on 2026-09-12, transforms the corrected saved run to include each sentence compared with itself. It preserves this directory's data and figures, explicitly defines its self-first tie convention, and examines the entropy-0.1/0.3 crossing using individual worlds.

## Reproduction

From the repository root, using the existing Python environment:

```sh
MPLCONFIGDIR=/private/tmp/physics-figure1-mpl .venv/bin/python resources/sampler-140626/scripts/compare_figure1_runs.py
```

The historical script name remains, but its interface and outputs now evaluate only the corrected run. The `plotting.command` in `run_metadata.json` is preserved as historical run provenance; use the command above for current reproduction. Before-fix grades are not regenerated.
