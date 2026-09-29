# Bug-state directory index

[Main index](../README.md) · [Bug catalog](../BUG_CATALOG.md) · [All complete NYT results](../evaluations/campaigns/evaluation-complete-top20-all-models.md)

B01–B07 classify known implementation state together with whether affected kernels execute. B08 is a documented chronology/provenance category, not proof of one identical bug set. A corrected known family is not a claim that every possible defect has been eliminated. B01/B02/B05 counts describe retained raw runs; their evaluation reports and grading data were removed.

| Directory | Saved full-NYT runs | β=0.1 full-NYT runs | Other evidence |
|---|---:|---:|---|
| [B01 — NYT before sampling corrections; evaluation retired](01-before-sampling-fixes-latent/README.md); [bugs](01-before-sampling-fixes-latent/BUGS.md) | 1 | 1 | — |
| [B02 — active entity factorial defect; evaluation retired](02-entity-multiplicity-active/README.md); [bugs](02-entity-multiplicity-active/BUGS.md) | 3 | 3 | 4 toy replay processes |
| [B03 — Fixed names; entity multiplicity defect dormant](03-entity-multiplicity-dormant/EVALUATION.md); [bugs](03-entity-multiplicity-dormant/BUGS.md) | 6 | 4 | 4 toy replay processes |
| [B04 — Latent entities; six known sampling families corrected](04-known-fixes-latent/EVALUATION.md); [bugs](04-known-fixes-latent/BUGS.md) | 4 | 2 | 4 toy replay processes |
| [B05 — Figure 1 before corrections; evaluation retired](05-before-sampling-fixes-relation-only/README.md); [bugs](05-before-sampling-fixes-relation-only/BUGS.md) | 0 | 0 | one 40-world Figure 1 experiment, β=0.5 |
| [B06 — Figure 1 after relevant sampling/query corrections](06-known-fixes-relation-only/EVALUATION.md); [bugs](06-known-fixes-relation-only/BUGS.md) | 0 | 0 | one 40-world Figure 1 experiment, β=0.5 |
| [B07 — Patched-source frozen toy validation](07-known-fixes-frozen-validation/EVALUATION.md); [bugs](07-known-fixes-frozen-validation/BUGS.md) | 0 | 0 | 4 toy replay processes |
| [B08 — Documented pre-fix conditions; exact source unknown](08-documented-pre-fix-unverified/EVALUATION.md); [bugs](08-documented-pre-fix-unverified/BUGS.md) | 0 | 0 | five documented-only conditions |

[Historical source unverified](../unclassified/archive/README.md) · [Exploratory/component source unverified](../unclassified/exploratory/README.md)
