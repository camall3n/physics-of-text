# One validated semantic-consistency diagnostic

Input: one validated current population, zero or more explicitly named validated reference populations, and `includePrior`.

For fact `f`, define:

```text
E(f) = sorted distinct set of (literal argument1, literal argument2, dependency path)
I(f) = (entity1 == entity2)
K(f) = (SHA256(full frozen predicate record), I(f), E(f))

primary(f)   = confirmed primary annotation, otherwise absent
effective(f) = validated nonblank human override, otherwise primary(f)
```

Group records by `K`; flag a group if labels disagree and the group includes a current case. Compute this twice: primary labels and effective labels. This is diagnostic only: no labels are copied, altered or inferred.

Literal names and direction matter. Repeated identical rows and arbitrary local entity numbers do not change the key. Equality of the two entity IDs does matter. A changed predicate version or any other frozen predicate content changes its hash. Existing declaration serialization/hash conventions are preserved.

## Current versus reference

- Both populations first pass the same full census validator used for scoring.
- Reference labels are freshly obtained from validated annotations/overrides, not trusted from an old generated assessment.
- Exclude an already-current fact by `source_sha256 + case_id`; a run-local case ID alone is insufficient.
- Require identical full predicate record and shared rubric hash for a reference comparison.
- A disagreement confined to reference cases is not reported as a current conflict.
- Reference cases never enter current precision or coverage denominators.

## Output and intentional differences from the two old scripts

`schema_version: 2` includes explicit population IDs, `include_prior`, predicate versions/hashes, input hashes, and `modes.primary` / `modes.effective`.

The original top-20 checker compared primary labels using predicate IDs. The original coverage checker compared effective labels and could add separately stored top-20 assessments. Both now call the shared validated implementation. The current retained data still produce zero disagreements: 6,905 top-20 cases; 8,488 coverage cases plus 5,300 nonduplicate reference cases.

A current-only run records `with_prior_references: null` and `include_prior: false`. An omitted reference check must not be mistaken for a completed zero-conflict check.

Old saved `analysis/semantic_consistency.json` files remain unchanged historical artifacts. New output uses `semantic_consistency_v2.json/.md`; legacy script paths now print the new diagnostic read-only. Use the central CLI with an explicit output directory to save it. The diagnostic schema and validation behavior intentionally improve; scientific judgments, scores and saved reports stay unchanged.
