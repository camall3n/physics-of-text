# Active relation kernels: independent oracles and sampled stationary-distribution checks

Organization: [experiment index](../README.md) · [bug-state definitions](../BUG_CATALOG.md).

The saved audit identifies no further arithmetic defect in its bounded tests of active relation/fact/sentence kernels. It supplies exact local balance checks and two small sampled-chain diagnostics, not proof of NYT-scale convergence or semantic accuracy.

## Method and saved results

The independent density oracle reconstructs histograms from sentence origins and scalar rising-factor products, avoiding WorldProb and ModelFunctions. It includes collapsed noun/path dictionaries, fixed or Beta sparsity for a specified labeled fact subset (no count-event binomial coefficient), uniform reporting −S log F, and the scalar relation-count factor. Entity count is fixed, so its factor cancels.

| Check | Saved coverage / result |
| --- | --- |
| Fact conditionals and birth/death | 1,020 worlds, 7,650 toggles; two entities/two slots, every nonempty subset of eight possible facts, both sparsity models, observed/no-sentence cases |
| Sentence conditional | 512 complete-fact worlds and 9,216 alternatives, three sentences across eight facts, both arguments, repeated nouns and self-pairs |
| Fact moves and relation split/reversal | 324 moves, 144 splits plus reverses; three distinct pairs/three slots |
| Deterministic total | 70,266 numerical/index assertions; largest discrepancy 9.769962616701378e−15 |
| Dumb split / smart merge sampled chain | 1,200,000 retained draws on exact 27-state three-fact/three-slot space; TV 0.002296737798222981; maximum state discrepancy 0.0008171441858921269 |
| Smart split / dumb merge sampled chain | 1,200,000 retained draws on same space; TV 0.0045772756916; maximum discrepancy 0.0021411891474412137 |

Each sampled chain has 10,000 warmup draws. The source uses seeded Random streams 913 for dumb split/smart merge and 912 for smart split/dumb merge, with fixture initialization Random(11). Test worlds use small fixture parameters from the probe, including Beta sparsity (0.8,3.1), rather than NYT Beta sparsity. Cached fact, sentence, relation, noun, trigger and mention indexes are checked against raw iteration.

## Scope and interpretation

The sampled TV values are small-state diagnostics, not IID confidence bounds or proof of rapid mixing on large data. The audit separately exposes an entity factorial defect and motivates a reversible bridge for separating sentences about the same pair. These are documented in separate summary reports. Unchanged target choices include finite-pool dependence and uniform reporting, which can still yield poor semantic clusters. No manual NYT precision population is evaluated here.

## Reproducibility

The historical runner compiles the frozen post-five-fix baseline and isolated bridge, putting fresh classes before the archived dependency JAR. Compilation/source logs, probe source and complete stdout are required to distinguish exact checks from sampled draws. The saved results were inspected, not rerun for this report.

## Evidence and cleanup dependencies

[Audit method](../../../experiments/nyt-precision-investigation-2026-09-12/analysis/kernel_audit.md) · [Probe source](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/KernelAuditProbe.java) · [Exact saved output](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/KernelAuditProbe.txt) · [Audit runner](../../../experiments/nyt-precision-investigation-2026-09-12/tests/kernel-audit/run.mjs) · [Frozen baseline](../../../experiments/nyt-precision-investigation-2026-09-12/baseline/src). Preserve Java source/classes, dependency JAR, compile logs and output; no NYT experiment output can substitute for the 27-state diagnostic.

This report summarizes existing evidence only. No calculations, simulations or tests from the experiment were rerun, no scientific outputs were rewritten, and no cleanup/deletion decision was made. Preserve the linked inputs, source, output and interpretation together; a summary cannot replace exact reproducibility artifacts.
