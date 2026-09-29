# Evaluation code and campaign navigation

This is the maintained evaluation implementation. Experiment directories hold saved inputs, judgments, outputs and small calling/configuration files.

```text
code/evaluation/
  cli.mjs                 command parsing
  campaigns.mjs           named NYT populations + selection parameters
  commands/               campaign execution and output destinations
  nyt/                    reusable NYT parser, validation, scoring and reporting
    predicates.mjs        frozen predicate records and rubric hashes
    judgments.mjs         one S/E/A judgment validator
    audit.mjs             one complete-census fact loop
    protocols.mjs         explicit frozen-record checks for each campaign protocol
    census.mjs            top-relation evidence selection/preparation
    coverage.mjs          minimal row-coverage prefixes and declarations
    scoring.mjs           census fractions and marginal coverage blocks
    consistency.mjs       validated primary/effective-label diagnostics
    sampled.mjs           historical stratified-screen mode
  figure1/                separate synthetic sentence-pair evaluator
  tests/                  shared regressions and CLI equivalence tests
```

Implementation belongs here; roots, filenames, populations and invocation belong in campaign configuration/callers. Existing `experiments/*/scripts/` and Figure 1 script paths remain compatibility callers. Importing a maintained evaluator does not execute a campaign. Historical amendment scripts and original author code are provenance, not alternative maintained evaluators.

[Code ownership, compatibility callers and historical exclusions](FILE_MAP.md) identify what is maintained and what is provenance.

## Run and browse

From the repository root:

```sh
node code/evaluation/cli.mjs list
node code/evaluation/cli.mjs check --preset nyt-top20
node code/evaluation/cli.mjs check --preset nyt-coverage
node code/evaluation/cli.mjs render --preset nyt-coverage --output-dir /tmp/nyt-coverage-review
node code/evaluation/cli.mjs consistency --preset nyt-coverage
node code/evaluation/cli.mjs consistency --preset nyt-coverage --current-only
```

`check` freshly validates/scores each audit and compares the entire assessment with its saved counterpart. For the two modern NYT campaigns it also runs the validated primary/effective consistency diagnostic, including configured references. It is read-only. `render` validates the whole campaign first, then writes a new, empty output directory with browseable report/evidence snapshots. It rejects experiment/source-code destinations and nonempty output directories. Open the generated `README.md`. Copied annotation/override forms are snapshots; editing them does not update original records.

`consistency` is read-only unless `--output-dir NEW_EMPTY_DIR` is supplied. It writes version-2 diagnostics under new filenames and preserves old saved diagnostics. See [consistency semantics](nyt/CONSISTENCY.md).

Saved authoritative results remain in their original locations:

| Preset | Selection | Saved results |
|---|---|---|
| `nyt-top20` | All facts in the top 20 relations, ten retained runs | [Complete census](../../experiments/nyt-complete-evaluation-2026-09-14/comparison.md) |
| `nyt-coverage` | All facts through each 57%, 60%, 70%, 80%, 90% row-coverage prefix; four corrected beta=.001 runs | [Coverage comparison](../../experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md) |
| `nyt-archive250` | Top-20 request on a separate corpus with only 15 relations: all 223 facts | [Archive-250 assessment](../../experiments/nyt-complete-evaluation-2026-09-14/supplemental/audit_archive250/assessment.md) |
| `sampled-sep12` | Top 20 relations, up to five sampled facts per relation; eight retained runs | [Historical samples](../../experiments/nyt-precision-investigation-2026-09-12/manual_review/README.md) |
| `sampled-sep14` | Same historical selection; two latent low-smoothing runs | [Historical samples](../../experiments/nyt-latent-low-smoothing-2026-09-14/manual_review/README.md) |

The 250-row corpus is not pooled with full NYT. Coverage views are nested selections of saved runs, not new inference experiments. Fixed versus latent entities is a model property; the complete-census judgment rules and scorer are shared.

## Selection is separate from scoring

Let relations be ordered by decreasing assigned input rows, breaking ties by numeric relation ID. Let `m_i` be rows in relation `i`, and `M` all input rows.

- Top relations: `k = min(requested_k, number_of_relations)`. Include every expressed ordered fact in ranks 1 through `k`.
- Row coverage `t`: `k(t) = min { k : sum(i<=k) m_i >= t*M }`. Keep whole relations; overshoot is allowed. Do not expand boundary ties. Targets measure **input rows**, not percentages of relations.
- Historical screen: within the top relations, choose up to five facts per relation by the original salted SHA-256 ordering. Preserve the original salt and finite-population estimator. See [historical sampled mode](nyt/SAMPLED.md).

The five CLI presets encode existing frozen populations. Modern runs use the retained census manifests; historical sample rosters use their retained unblinding manifests, so missing generated reports cannot silently shrink a population. Arbitrary `--target`/`--k` flags are deliberately unsupported: changing a population requires a separately prepared campaign, its documented selection and complete judgments. In the reusable API, `censusFromRaw(raw,{topRelations:k})` and `coveragePrefixes(parseMap(raw),targets)` construct selections; `createAuditValidator({census,selection,coverage})` validates them before the same scoring loop. Selection does not infer new semantic judgments.

## Shared NYT evaluation contract

`MAP rows + selected population + frozen predicates + primary annotations + optional human overrides → validate → effective judgments → score → render`

For every selected fact, the validator checks source/evidence hashes and completeness, predicate assignment, citations, reason, label, ambiguity question and any override reviewer. A valid nonblank human override takes precedence; the primary record remains in the result. A provisional primary cannot become a final score without confirmation or an explicit valid override.

For a complete census:

```text
N = S + E + A
precision endpoints = [S/N, (S+A)/N]
decided precision = S/(S+E), when S+E > 0
decided coverage = (S+E)/N
macro endpoints = unweighted mean of the per-relation endpoints
row coverage = selected input rows / all input rows
```

These are **textual-support judgments for inferred ordered facts**, conditional on declared relation meanings. One supported fact can have several assigned evidence rows. The evaluator does not assign an S/E/A label to each row. The endpoints reflect ambiguity, not confidence intervals. Gold fact recall and complete row-assignment accuracy are not measured.

The shared code loads each frozen predicate catalogue through one registry implementation. Existing catalogue copies are versioned experiment data, not duplicated algorithms. Full predicate records are hashed; an absent version field is treated as historical v1. Original serialization is retained for existing declaration hashes.

Protocol checks remain explicit: the top-20 census uses its frozen relation assignment catalogue; coverage additionally verifies declarations made before grading, immutable prior snapshots and exact inherited top-20 judgments. These provenance constraints do not change the scoring formula. Historical samples retain their older annotation schema and weighted estimator; they do not become complete censuses retroactively.

## Figure 1

[Figure 1 code, commands and pair conventions](figure1/README.md) are separate. That evaluator measures synthetic same-relation sentence-pair precision/recall against generated truth. Distinct-pair and self-pair variants are explicit. It shares neither NYT S/E/A grades nor an invented NYT recall denominator.

## Equivalence and source preservation

[Refactor record and validation](../../reports/evaluation-consolidation-2026-09-29/README.md) document the original source snapshot, byte-level data preservation, old/new tests and exact regenerated reports. No inference was rerun and no existing grade was changed.

```sh
node reports/evaluation-consolidation-2026-09-29/verify_baseline.mjs
node reports/evaluation-consolidation-2026-09-29/verify_saved_censuses.mjs
node --test code/evaluation/tests/*.test.mjs code/evaluation/nyt/tests/*.test.mjs
PYTHONDONTWRITEBYTECODE=1 .venv/bin/python code/evaluation/figure1/test_self_pairs.py
```
