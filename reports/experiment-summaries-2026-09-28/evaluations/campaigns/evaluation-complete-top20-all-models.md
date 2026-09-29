# Complete top-20 evaluation of 10 retained NYT runs

Organization: [experiment index](../../README.md) · [bug-state definitions](../../BUG_CATALOG.md).

Kind: retrospective evaluation campaign; original date 2026-09-14; summary written 2026-09-28. No inference was rerun for this evaluation or for this summary.

## Purpose and experiment identity

This campaign replaced the earlier five-facts-per-relation screens with complete reviews and harmonized predicate scopes. The retained evaluations cover ten controlled MAP partitions of the same 8,516 input triples. Four evaluations with confirmed active defects were removed under the [cleanup decision](../../../buggy-evaluation-cleanup-2026-09-28/README.md). These audits evaluate saved inference runs; they are not new simulations.

## Design and denominator

Relations are ranked by assigned row count, with numeric relation ID breaking ties. Every expressed ordered (relation, entity1, entity2) fact in the top twenty relations is graded. The total workload is 6,905 facts across 200 run-specific relations. A fact may have many evidence rows; those rows do not give that fact extra precision votes. Facts outside the top twenty and true-but-unreported model facts are outside this primary evaluation.

S means supported by the case-local evidence; E means unsupported under the declared predicate, not necessarily false in the world; A means unresolved. Bounds are S/N to (S+A)/N, not confidence intervals. One supporting row can suffice for a coherent fact with mixed evidence, so this is not sentence-assignment purity. Entity errors and predicate granularity still matter.

## Recorded results by bug state

[Only beta=0.1](../../beta-0p1/EVALUATION.md) · [Only beta=0.001](../../beta-0p001/EVALUATION.md) · [Active pre-fix cases](../../pre-fix/EVALUATION.md)

Evaluations for B01 and B02 were retired. [Run identities and cleanup status](../../pre-fix/EVALUATION.md).

### B03 — Fixed names; entity multiplicity defect dormant

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [verbatim_beta01_bridge_seed20260912](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260912.md) | 0.1 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 727 | 463 / 210 / 54 | 5034/8516 (59.11%) | 63.69%–71.11% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e4fd4a14b8e2/assessment.md) |
| [verbatim_beta01_bridge_seed20260913](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_bridge_seed20260913.md) | 0.1 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 742 | 454 / 229 / 59 | 4894/8516 (57.47%) | 61.19%–69.14% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_ad8866964cf6/assessment.md) |
| [verbatim_beta01_seed20260912](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260912.md) | 0.1 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 735 | 486 / 185 / 64 | 5368/8516 (63.03%) | 66.12%–74.83% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_c2349c1e0c57/assessment.md) |
| [verbatim_beta01_seed20260913](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta01_seed20260913.md) | 0.1 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 715 | 473 / 190 / 52 | 5096/8516 (59.84%) | 66.15%–73.43% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9f5868d8ee0e/assessment.md) |
| [verbatim_beta0001_seed20260912](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260912.md) | 0.001 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 384 | 344 / 17 / 23 | 1824/8516 (21.42%) | 89.58%–95.57% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_06dbdb9b03af/assessment.md) |
| [verbatim_beta0001_seed20260913](../../bug-sets/03-entity-multiplicity-dormant/reports/controlled-nyt-verbatim_beta0001_seed20260913.md) | 0.001 | [03](../../bug-sets/03-entity-multiplicity-dormant/BUGS.md) | 364 | 311 / 26 / 27 | 1583/8516 (18.59%) | 85.44%–92.86% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_9c88162c7b22/assessment.md) |

### B04 — Latent entities; six known sampling families corrected

| Run summary | β | Bug set | Full N | S / E / A | Input-row coverage | Precision bounds | Browse all cases |
|---|---:|---|---:|---|---|---|---|
| [entityfix_latent_beta01_seed20260912](../../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260912.md) | 0.1 | [04](../../bug-sets/04-known-fixes-latent/BUGS.md) | 1184 | 553 / 537 / 94 | 5299/8516 (62.22%) | 46.71%–54.65% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_8c6806186e00/assessment.md) |
| [entityfix_latent_beta01_seed20260913](../../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta01_seed20260913.md) | 0.1 | [04](../../bug-sets/04-known-fixes-latent/BUGS.md) | 1197 | 489 / 628 / 80 | 5303/8516 (62.27%) | 40.85%–47.54% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_d0f63db2a21a/assessment.md) |
| [entityfix_latent_beta0001_seed20260912](../../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260912.md) | 0.001 | [04](../../bug-sets/04-known-fixes-latent/BUGS.md) | 421 | 337 / 48 / 36 | 1546/8516 (18.15%) | 80.05%–88.60% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_dcb746fa83d6/assessment.md) |
| [entityfix_latent_beta0001_seed20260913](../../bug-sets/04-known-fixes-latent/reports/controlled-nyt-entityfix_latent_beta0001_seed20260913.md) | 0.001 | [04](../../bug-sets/04-known-fixes-latent/BUGS.md) | 436 | 344 / 47 / 45 | 1521/8516 (17.86%) | 78.90%–89.22% | [assessment](../../../../experiments/nyt-complete-evaluation-2026-09-14/census/audit_e318fe663470/assessment.md) |

## Changes from earlier evaluation

Previously sampled cases in the retained runs were revisited under the shared rubric and omitted cases were newly evaluated. A difference from an old screen can combine a scope/judgment change and a population-completion change; it is not a new model result or a causal effect of a code repair.

## Relationship to the paper and later work

The top-20 selection matches the stated form of the paper’s manual assessment, but original gold labels and exact annotation rules are unavailable. Fixed-name runs match the paper’s verbatim-argument description more closely; latent runs retain entity-inference capabilities from the archive. This interpretation does not prove the program used for the publication. None of the ranges alone establishes a replicated 95% result.

The later β=0.001 coverage campaign preserves the four corresponding top-20 assessments and expands their relation prefixes to reach 57–90% of rows. It does not replace the top-20 scope for the other six retained runs.

## Evidence and reproduction status

- [Campaign README](../../../../experiments/nyt-complete-evaluation-2026-09-14/README.md) and [method](../../../../experiments/nyt-complete-evaluation-2026-09-14/METHOD.md).
- [Exact source/audit manifest](../../../../experiments/nyt-complete-evaluation-2026-09-14/census_manifest.json); [comparison data](../../../../experiments/nyt-complete-evaluation-2026-09-14/comparison.json).
- [Same-case versus full-population comparison](../../../../experiments/nyt-complete-evaluation-2026-09-14/prior_comparison.md); [all prior label changes](../../../../experiments/nyt-complete-evaluation-2026-09-14/judgment_changes.md).
- [Recorded corpus-equivalence check](../../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/corpus_equivalence.json); [recorded report verification](../../../../experiments/nyt-complete-evaluation-2026-09-14/analysis/report_artifact_verification.json).

Saved annotations, evidence, predicates and report scripts support regeneration. Existing verification records are historical evidence, not tests rerun during this summary task. Reports are assistant-authored judgments requiring human inspection.

## Retention status

This is the comparable top-20 reference for the ten retained runs. Their sampled screens remain as historical evaluation versions. Removed active-defect evaluations are documented only by the linked cleanup and raw-run identity records.
