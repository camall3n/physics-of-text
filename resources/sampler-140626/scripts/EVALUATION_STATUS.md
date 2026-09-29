# Evaluation entry points in the archived sampler

The maintained code is [code/evaluation](../../../code/evaluation/README.md). Current NYT census selections and commands are registered there; synthetic Figure 1 remains separate.

| Files here | Status |
|---|---|
| `compare_figure1_runs.py`, `figure1_self_pairs.py`, `plot_precision_recall.py` | Compatible callers of the maintained Figure 1 evaluator. |
| `compare_nyt_archives.mjs` | Compatible caller of the maintained raw archive inventory. Corpus overlap is not semantic accuracy. |
| `audit_nyt.mjs`, `report_nyt_audit.mjs` | Historical implementation hardcoded to the retired `nyt-2026` evaluation and original subsidiary review. Required grades were removed by the authorized cleanup. Not part of current evaluation. |
| `audit_nyt_rerun.mjs`, `report_nyt_rerun.mjs` | Historical generic review schema used by the earlier rerun. Preserved source; its parser/annotation schema is not silently substituted for the current census protocol. |
| `compare_corrected_nyt.mjs`, `diagnose_nyt_rerun.mjs`, `audit_sampler_code.mjs`, audit probes | Historical raw sampler/bug diagnostics, not the maintained semantic precision evaluator. |
| `summarize_relations.py` | Raw relation-output summarization, not S/E/A evaluation. |
| Original `graph_*.py` scripts elsewhere in the sampler | Archived authors' Python 2 plotting source; retained for provenance. |

The retired evaluators and original code are retained as source history in this archived sampler tree. They are excluded from normal check/render commands. Consolidation does not recreate retired reports or grading data, execute historical amendment scripts, or rewrite raw experiment outputs.
