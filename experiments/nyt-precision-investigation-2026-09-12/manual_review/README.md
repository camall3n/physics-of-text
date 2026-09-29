# NYT manual comparison and user inspection

This index reveals experiment identities. The individual audit folders were prepared under content-derived IDs to keep condition names out of the grading workflow where feasible. These are assistant evidence-based assessments for user review, not independent human labels or the paper’s unavailable ground truth.

Every audit contains all20full relation dictionaries and five sampled facts per relation (100 total), with each fact’s complete observed evidence. A single directional predicate and scope notes are declared per relation. `annotations/rel_*.json` contains the editable judgments and exact source row numbers; `assessment.md` gives the computed weighted precision and population counts.

The two precision endpoints count ambiguous facts as incorrect/correct. They are not confidence limits. The random-sample uncertainty is separate and can be large. Compare coverage and full population sizes as well as percentages.

| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |
|---|---|---|---|---|
| entityfix_latent_beta01_seed20260912 | [audit_384a3e2233](audit_384a3e2233/README.md) | [assessment](audit_384a3e2233/assessment.md) | 46 / 48 / 6 | 46.13%–52.08% |
| entityfix_latent_beta01_seed20260913 | [audit_c0010fff1d](audit_c0010fff1d/README.md) | [assessment](audit_c0010fff1d/assessment.md) | 41 / 52 / 7 | 37.28%–43.74% |
| verbatim_beta0001_seed20260912 | [audit_5e74dee865](audit_5e74dee865/README.md) | [assessment](audit_5e74dee865/assessment.md) | 90 / 4 / 6 | 91.88%–95.99% |
| verbatim_beta0001_seed20260913 | [audit_6260319b65](audit_6260319b65/README.md) | [assessment](audit_6260319b65/assessment.md) | 84 / 7 / 9 | 85.82%–93.85% |
| verbatim_beta01_bridge_seed20260912 | [audit_4c50ddb65b](audit_4c50ddb65b/README.md) | [assessment](audit_4c50ddb65b/assessment.md) | 67 / 29 / 4 | 60.99%–67.81% |
| verbatim_beta01_bridge_seed20260913 | [audit_08e2dd6fc7](audit_08e2dd6fc7/README.md) | [assessment](audit_08e2dd6fc7/assessment.md) | 62 / 27 / 11 | 64.45%–75.18% |
| verbatim_beta01_seed20260912 | [audit_dba5006d06](audit_dba5006d06/README.md) | [assessment](audit_dba5006d06/assessment.md) | 72 / 24 / 4 | 74.45%–78.86% |
| verbatim_beta01_seed20260913 | [audit_fb501b5da8](audit_fb501b5da8/README.md) | [assessment](audit_fb501b5da8/assessment.md) | 67 / 27 / 6 | 66.74%–72.42% |

Completed assessments: **8 of 8**; 800 judgments across completed runs (529 supported, 218 incorrect, 53 ambiguous). These totals are bookkeeping, not pooled precision across different models.

[All ambiguity questions](../analysis/ambiguities_for_user.md) and [all predicate scope notes](../analysis/predicate_scope_notes.md) are collected separately for inspection.

To revise a judgment, edit its annotation JSON and rerun `node scripts/report_manual_samples.mjs manual_review/AUDIT_ID`, then `node scripts/summarize_experiments.mjs` and `node scripts/build_review_index.mjs` from the investigation directory. Keep original copies if comparing adjudication versions. The reporter validates case coverage, evidence line membership, scope declarations, questions for ambiguous cases, and source/protocol hashes.
