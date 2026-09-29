# Historical archive: known source defects, unknown producing bug sets

[Evaluation and artifact links](EVALUATION.md) · [Bug catalog](../../BUG_CATALOG.md)

These outputs were inherited from the authors' archive. Their exact producing source, command, seed and configuration are often missing. An imported source defect is evidence about that source, **not proof that every saved earlier output exercised it**. The archive is also not verified as the executable used for the published paper.

## Original text-sampler history

The [reconstruction record](../../../../resources/sampler-140626/CHANGES.md) documents imported-source defects: omitted relation terms in `WorldProb.logProb()`; inconsistent facts after entity changes; phantom mentions retained by `Sentences.clear()`; destructive noun-histogram updates; a doubled noun predictive; stale mention indexes; and `FactRV` numerical edge failures. Their repairs are described in the catalog.

The [historical audit](../../../../resources/sampler-140626/results/nyt-2026/evaluation/code_audit.md) additionally identifies four inherited sampling families: inconsistent smart-split likelihood signs, non-null aborted empty splits, shared log-weight initialization, and phantom reverse smart-merge normalizers. The [later entity derivation](../../../../experiments/nyt-precision-investigation-2026-09-12/analysis/entity_multiplicity.md) verifies that the factorial omission was also inherited.

These defects make posterior interpretation of the imported implementation problematic, but their realized effect on a particular old log or selected example cannot be recovered without source-to-run provenance. The exact π/N! invariant-density proof applies to a later baseline after the other proposal repairs, not to all original kernels simultaneously.

**Do not project the 2026 bounded fact-deletion bug onto original outputs:** that move was introduced later. The reconstructed occupied-relation pool target also differs from the original fixed-relation implementation. The old artifacts are not evidence that the corrected 2026 code ran.

## Different archival families require different judgments

| Family | What is established |
| --- | --- |
| NYT/toy text-sampler outputs | Imported-source defects provide historical context; individual producing revisions and active effects generally remain unknown. A reconstructed evaluation of saved facts can still be useful without proving the original sampler correct. |
| Eight Bernoulli-mixture/DPM configurations | Separate `org.ucb.dpm` kernels share LogProbMap/Util helpers with documented normalization problems. Their generating executable is not fingerprinted; NYT entity/fact proposal repairs do not validate this separate sampler. |
| HMM learned-model artifact | A separate Jahmm/library demonstration, not the NYT relation model; no specific active NYT bug attribution is justified. |
| Dirichlet draws | Recorded distribution summaries are descriptive; no active saved-draw defect is established. |
| Overlap diagnostics and selected listings | Derived/selected artifacts with limited provenance, not automatically complete inference runs or precision evaluations. |

An unknown parameter must remain unknown. In particular, adjacency to a configuration or a suggestive directory name does not establish its beta value or freeze policy.

Original facts, traces and examples remain evidence of what was saved. A later corpus-evidence assessment, such as the complete 223-fact review of the 250-row archive, evaluates that saved population; it does not reconstruct the transition kernel or identify the paper's historical judgment protocol.

[Sampling correction history](../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) · [Related findings](../../../../resources/sampler-140626/results/nyt-2026/evaluation/additional_sampling_findings.md)

No new code audit, tests, simulations or semantic judgments were performed for this organization.
