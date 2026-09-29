# Code ownership and historical callers

| Work | Maintained implementation | Calling/configuration layer |
|---|---|---|
| Full NYT top-20 and coverage scores | `nyt/audit.mjs`, `judgments.mjs`, `scoring.mjs`, `reporter.mjs` | `campaigns.mjs`, `commands/nyt.mjs`; study `evaluation_context.mjs` and thin `report_censuses.mjs` callers |
| Evidence parsing and selected populations | `nyt/parse_map.mjs`, `census.mjs`, `coverage.mjs` | Study `prepare_*.mjs` callers and `nyt/commands/prepare.mjs` |
| Frozen predicate records | `nyt/predicates.mjs`, `protocols.mjs` | Saved campaign catalogues/assignments/declarations, passed as data |
| Semantic consistency | `nyt/consistency.mjs` | `commands/consistency.mjs`; both old checker paths delegate here |
| Historical five-fact screens | `nyt/sampled.mjs` | Two `sampled_evaluation_config.mjs` files and old prepare/report/index callers |
| Recording explicit manual decisions | [review tools](nyt/review/README.md) | Reviewer/root/population options supplied by thin old helper paths |
| Read-only evidence views and identity diagnostics | `nyt/review/`, `nyt/diagnostics/` | Old viewers/diagnostic paths delegate with their original parameters |
| Study trace/comparison summaries | `nyt/studies/` | Two old summary callers; these are run diagnostics, not fact grading |
| Published artifact checks | `nyt/commands/verify.mjs` | Existing study verification callers |
| Refactor equivalence checks | `tests/migration/`, `tests/equivalence_cli.test.mjs` | Two tiny callers beside [validation artifacts](../../reports/evaluation-consolidation-2026-09-29/README.md) |
| Figure 1 curves/plots and self-pair transformation | [figure1/](figure1/README.md) | Separate Python CLI plus original sampler-script callers |
| Immutable historical file manifests | Existing `verify_preservation.mjs` | Existing study preservation callers; exact maintenance transitions only |

Preparation and manual recording are explicit editing operations; scoring and consistency are read-only functions. Rendering writes only when invoked. The central CLI uses a separate output directory; legacy report/preparation commands retain their original explicit in-place behavior.

## Historical sources outside the maintained evaluator

- [18 recorded declaration/amendment scripts](nyt/review/HISTORICAL.md): unchanged, with hardcoded past judgments and state assumptions. They are not part of check/render. Reusable helpers they depend on delegate to the maintained library.
- `manual_review/*/manual_assessment_record.mjs` and historical `declare_predicates.mjs`: saved review-decision provenance, not scoring engines. These are not replayed by consolidation.
- [Archived sampler evaluation scripts](../../resources/sampler-140626/scripts/EVALUATION_STATUS.md): older retired schemas, raw-output diagnostics and original author plotting source. Supported current NYT scores come from the registered presets.
- `experiments/nyt-precision-investigation-2026-09-12/scripts/evaluation_sensitivity.mjs`: a historical sensitivity analysis hardcoded to the retired fixed-400 evaluation. Its required grading records were deliberately removed previously; it is not a current evaluator.
- The two older study `verify_integrity.mjs` files and their proposed patch remain untouched. They still report the previously authorized cleanup changes as mismatches; they were not silently relaxed by this refactor. The current maintenance-aware preservation checks and the new refactor hash check are the applicable validation records.

Frozen methods/catalogues and saved reports remain experiment data. Source recovery archives are historical evidence, not maintained implementations. No old annotation format is silently reinterpreted as a modern complete census.
