# Corrected sampler source consolidation — 2026-09-28

The two identical corrected sampler source trees now share [one maintained implementation](../../code/sampler/README.md). This was a source/build organization change; no sampler Java bytes, model settings or saved scientific results changed.

## What changed

- Moved one corrected src tree to [code/sampler/src](../../code/sampler/src) and removed the second identical physical copy.
- Retained both old src paths as relative directory symlinks, preserving existing source links and src/... manifest keys.
- Replaced four duplicated study build/run scripts with thin adapters to one shared builder and runner. Each study keeps its own build directory and output boundary.
- Fixed the relocation-specific archive hazard: new runs archive the canonical source directory, not a compatibility symlink.
- Added a verification harness and updated the handoff and variant documentation.
- Left the controlled variant, historical baseline, original sampler, all scientific run/evaluation directories and their records intact.

## Equivalence checks

[Preparation](prepare_results.json) ran against the original source before relocation. [Verification](verification_results.json) ran against the consolidated source.

| Check | Result |
|---|---|
| Original source trees | All 156 files byte-identical |
| Canonical source versus originals | All 156 files unchanged; 154 are Java |
| Existing regression suite | 91 tests passed before; 91 passed after |
| Compiled main outputs | 140 files identical, including logback.xml |
| Compiled test outputs | 70 files identical |
| Fresh before/after experiments | Five seeded configurations; every scientific file identical |
| Historical replay comparisons | Eight comparisons against both saved replays of each standard configuration; identical |
| Total scientific file comparisons | 239 matching file pairs across the 13 comparisons |
| New source archives | Five archives materialized and all 156 source files verified |
| Compatibility adapters | Both preserve the study/build/output context |
| Runner protections | Reused output, missing seed, stale build and legacy CLI scope checks passed |

The five configurations use beta=0.1/0.001 crossed with latent/fixed entities, plus fixed beta=0.1 with the optional bridge. They use the saved 60-row toy fixture, seed 20260912 and 100 × 100 proposals, with 9,000 relation proposals and either 1,000 or zero entity proposals.

[CLI and stale-build checks](adapter_guard_results.json) verify the legacy command boundary without writing into the old studies. Tests and fresh run outputs live only beneath this directory; historical latest-test pointers and build directories were not overwritten. Temporary archive-inspection source extractions were removed after validation.

The compiler/dependency environment matches the saved replay environment. Run timestamps, paths and gzip archive containers are not scientific byte-equality targets. Their materialized source contents and recorded hashes are checked separately.

No full NYT or Figure 1 inference was rerun. All compiled source behavior was preserved; this does not establish convergence or remove Figure 1's pre-existing incomplete seed control.

## Lines removed

Counts are physical lines including blanks/comments and final unterminated lines, counted once per real file. Symlink aliases are not duplicate source copies. Archived source tarballs, generated classes, JSON evidence and Markdown are excluded from code counts.

| Scope | Before | After | Reduction |
|---|---:|---:|---:|
| Corrected Java source, including tests | 36,496 | 18,248 | 18,248 |
| Java + build/run JavaScript + new verification harness | 36,654 | 18,567 | **18,087** |

The new verification harness adds 182 JavaScript lines. Shared build/run code plus the four adapters totals 137 lines, replacing 158 duplicated wrapper lines. Gross duplicate removal is therefore 18,248 Java lines; overall net removal, including the added test, is **18,087 code lines**.

One removed duplicate source directory also contained 105 non-Java metadata/resource lines, so its complete directory contained 18,353 lines. Those 105 lines are excluded from the Java/code reduction above. [Machine-readable counts](line_counts.json) identify every included file and the counting convention.

## Preservation and historical manifests

The [before ledger](preservation-before.json) captured 19,452 existing file/symlink entries. The [after verification](preservation-after.json) found:

- **19,446 entries unchanged**.
- Exactly **six authorized existing-file changes**: four build/run adapters, HANDOFF.md, and the September 12 variant README.
- Zero unexpected changes.
- The 312 historical source-file paths still resolve to unchanged bytes through the two new directory symlinks.
- Saved source archives, run configs, MAP worlds, runtime classes, annotations, protected manifests and the dependency JAR remain unchanged.

The old protected manifests remain historical records. Some strict historical verification scripts compare wrappers as well as science against the September snapshots; they will now truthfully report the four authorized wrapper changes. Do not regenerate those old manifests to hide this migration. Use the explicit before/after ledger to distinguish tooling changes from altered scientific artifacts.

## How to use or repeat

See [maintained sampler instructions](../../code/sampler/README.md) for the canonical build/run commands. The historical study commands still work as adapters.

The [verification harness](../../code/sampler/tests/consolidation.mjs) can be run in prepare then verify mode with a fresh directory under experiments/. It refuses to overwrite a prior verification. For this completed migration, the saved before_manifest.json and preparation outputs record the actual pre-migration state.
