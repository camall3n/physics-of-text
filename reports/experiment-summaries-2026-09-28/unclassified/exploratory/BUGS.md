# Exploratory and unattributed material: bug status unclassified

[Evaluation and inventory links](EVALUATION.md) · [Bug catalog](../../BUG_CATALOG.md)

This group covers exploratory source, code-only experiment inventories and artifacts without enough attribution to establish a producing experiment. A source file's existence does not establish that it was executed; an unattributed trace does not establish its target, parameters, seed or code revision.

The Python `world.py` exploration is a separate implementation. Historical code entry points and test scaffolds may describe possible computations without preserving completed runs. Unattributed probability series cannot be assigned to an NYT or Figure 1 condition merely because their shapes appear similar.

Consequently there is no justified uniform active/dormant/corrected bug set here, and no defensible beta=0.1 classification unless a particular artifact has direct parameter evidence. “Unknown” is distinct from both “known defective” and “verified correct.”

The [original sampler reconstruction](../../../../resources/sampler-140626/CHANGES.md), [pre-fix audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md), [five-family repairs](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md), [additional findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md) and [entity-factorial derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) establish defects and corrections in identified Java sampler versions. They are supporting context, not automatic proof that a separate Python prototype or unidentified output shares those defects.

Retain the distinction between code inventory, component diagnostic and completed experiment in any later cleanup decision. No semantic precision population is implied by this classification. No files in this group were executed, repaired or re-evaluated while writing this note.
