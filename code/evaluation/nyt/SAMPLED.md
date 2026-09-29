# Historical sampled NYT protocol

The maintained implementation is [sampled.mjs](sampled.mjs). The two experiment directories contain configuration and thin callers; imports never generate reports. Current complete-census and coverage evaluation use the modern joint NYT mechanism. These older screens keep their original annotation schema and estimator.

## Inputs, selection and output

Input: six-column MAP evidence, the frozen campaign manual protocol, and per-relation annotations. The shared [parse_map.mjs](parse_map.mjs) defines ordered facts `(relation, entity1, entity2)` and retains every name/path evidence row.

Selection context is explicit in each `scripts/sampled_evaluation_config.mjs`:

- Rank relations by assigned row count, breaking ties by numeric relation ID.
- Select the top 20 relations.
- Within each relation, select up to five facts by lowest SHA256 of salt, MAP hash, relation, ordered entity IDs and first source line, separated by NUL.
- Both historical campaigns retain salt `nyt-precision-screen-2026-09-12-v1`. Changing salt or sample size is a new selection, not a regrade of the saved selection.
- Every selected fact retains all its evidence rows; five facts does not mean five rows.

For relation population `N_r`, sample size `n_r`, and supported/ambiguous sample counts `S_r,A_r`, the weighted precision endpoints are `sum_r (N_r/N) S_r/n_r` and `sum_r (N_r/N) (S_r+A_r)/n_r`, where `N=sum_r N_r`. They are estimates, not census fractions. Hypergeometric inversion with the original Bonferroni allocation provides separate conservative sampling bounds; its mathematics and numerical operations are preserved.

Output: a validated complete structured sampled assessment, its Markdown rendering and summary. Labels, reasons, citations, ambiguity questions, MAP hash and frozen protocol hash are validated before scoring. The historical schema has predicate label/definition/scope in each annotation; it has no modern frozen predicate catalogue or separate human-override file. We do not invent absent predicate versions or silently reinterpret those judgments as modern census annotations.

## Calls versus evaluation

`createSampledEvaluator({experiment, retiredAuditIds, selection, indexText})` returns:

| Function | Behavior |
|---|---|
| `selectReview(raw, options)` | Pure deterministic selection |
| `prepareRun(path)` | Creates stable evidence/annotation templates, honoring retired audit IDs |
| `evaluateAudit(folder)` | Read-only validation/scoring; returns `{result, markdown, summary}` |
| `reportAudit(folder, {outputDirectory})` | Writes those outputs; defaults to the original audit folder |
| `renderReviewIndex()` | Read-only historical navigation rendering |
| `buildReviewIndex({outputDirectory})` | Writes that navigation |

The original script names still work. `report_manual_samples.mjs --check manual_review/AUDIT` validates/scores without writing. Campaign roots and retirement IDs are in the configuration callers, not inferred from evaluator module locations. `indexText` preserves two small historical wording differences so consolidation does not rewrite old navigation.

The campaign-specific MAP/trace comparison assemblers live in `studies/`; these contain historical experiment conditions and presentation, not a second precision formula. Their old scripts call them with explicit campaign roots. They are separate from the shared sampler and do not rerun inference.

No saved grades, selections, sources, protocols or assessments are edited by the consolidation. [tests/sampled.test.mjs](tests/sampled.test.mjs) recomputes all ten retained assessments (1,000 reviewed facts), compares full JSON and Markdown bytes, and independently rebuilds every selected case/evidence collection. Existing finite-population enumeration tests continue through compatibility imports.
