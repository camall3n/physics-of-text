# NYT manual comparison and user inspection

This index reveals experiment identities. The individual audit folders were prepared under content-derived IDs to keep condition names out of the grading workflow where feasible. These are assistant evidence-based assessments for user review, not independent human labels or the paper’s unavailable ground truth.

Every audit contains all 20 full relation dictionaries and five sampled facts per relation (100 total), with each fact’s complete observed evidence. A single directional predicate and scope notes are declared per relation. `annotations/rel_*.json` contains the editable judgments and exact source row numbers; `assessment.md` gives the computed weighted precision and population counts.

The two precision endpoints count ambiguous facts as incorrect/correct. They are not confidence limits. The random-sample uncertainty is separate and can be large. Compare coverage and full population sizes as well as percentages.

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta0001_seed20260912 | [audit_4f7553d383](audit_4f7553d383/README.md) | [assessment](audit_4f7553d383/assessment.md) | 76 / 15 / 9 | 76.20%–84.51% |
| entityfix_latent_beta0001_seed20260913 | [audit_af30702564](audit_af30702564/README.md) | [assessment](audit_af30702564/assessment.md) | 85 / 9 / 6 | 85.05%–91.15% |

Completed assessments: **2 of 2**; 200 judgments across completed runs (161 supported, 24 incorrect, 15 ambiguous). These totals are bookkeeping, not pooled precision across different models.

[All ambiguity questions](../analysis/ambiguities_for_user.md) and [all predicate scope notes](../analysis/predicate_scope_notes.md) are collected separately for inspection.

To revise a judgment, edit its annotation JSON and rerun `node scripts/report_manual_samples.mjs manual_review/AUDIT_ID`, then `node scripts/summarize_experiments.mjs` and `node scripts/build_review_index.mjs` from the investigation directory. Keep original copies if comparing adjudication versions. The reporter validates case coverage, evidence line membership, scope declarations, questions for ambiguous cases, and source/protocol hashes.
