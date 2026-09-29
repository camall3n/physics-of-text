# Maintained corrected sampler

This is the single maintained source for the corrected sampler previously duplicated in the September 12 precision investigation and September 14 latent low-smoothing study. All **156 source-tree files, including 154 Java files, are byte-identical to both pre-consolidation copies**. No probability model, sampler arithmetic, defaults, configurations or evaluation judgments changed.

The controlled and baseline variants are historical implementations with meaningful differences; they were not merged into this tree.

## Build and run

From the repository root:

    node code/sampler/build.mjs
    node code/sampler/run.mjs CONFIG_JSON NEW_OUTPUT_DIRECTORY CORPUS_JSON

The corpus argument defaults to the original 8,516-row NYT input. CONFIG_JSON must provide an integer seed. NEW_OUTPUT_DIRECTORY must be a fresh path beneath this repository; the runner refuses existing output.

The canonical build writes code/sampler/build/. The runner snapshots runtime classes and the complete src directory before inference and records config/source/dependency hashes. Beta, fixed/latent entities and bridge weight remain configuration choices.

Build uses the existing Java environment and [dependency JAR](../../resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar), with fresh classes ahead of that archived bundle. Historical HMM/DPM/logging test exclusions are unchanged: 104 main and 45 eligible test source files compile.

## Compatibility and ownership

The old directories contain src symlinks, not additional source copies:

- [September 12 source path](../../experiments/nyt-precision-investigation-2026-09-12/variants/entity-multiplicity-fix/src)
- [September 14 source path](../../experiments/nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix/src)

Edit source here. Editing either compatibility path changes the same files. Immutable per-run source archives remain the authority for reproducing saved source versions.

The two studies' build_entity_variant.mjs and run_entity_experiment.mjs are thin adapters to [build.mjs](build.mjs) and [run.mjs](run.mjs). They retain study-specific output boundaries and independent build directories. Existing source links, kernel probes and src/... manifest keys continue to resolve. Run archives use this canonical directory so they contain real files rather than only a symlink.

## Verification

[Consolidation evidence](../../experiments/sampler-consolidation-2026-09-28/README.md) records:

- The existing 91-test suite passed before and after.
- Main and test compilation outputs were byte-identical.
- Five seeded configurations matched fresh before/after scientific outputs: both beta values and entity modes, plus the bridge.
- Four configurations also matched both saved historical replays: eight comparisons.
- Five source archives contained all 156 original files.
- Legacy CLI scope, existing-output, missing-seed and stale-build guards passed.

The [verification harness](tests/consolidation.mjs) requires a fresh validation directory:

    node code/sampler/tests/consolidation.mjs prepare experiments/NEW_CONSOLIDATION_CHECK
    node code/sampler/tests/consolidation.mjs verify experiments/NEW_CONSOLIDATION_CHECK

It does not invoke old test wrappers that update saved latest pointers. Temporary source extractions are removed after checking. It does not rerun full NYT or Figure 1: source/class identity preserves their implementation but does not establish convergence or repair Figure 1's incomplete seed control.

## Line reduction and historical checks

Removed **18,248 duplicate Java lines**. After shared modules, four adapters and the new test harness, the net reduction is **18,087 code lines**. Counts include comments/blanks; [exact accounting](../../experiments/sampler-consolidation-2026-09-28/line_counts.json) excludes archives, generated builds, JSON and Markdown.

Historical manifests fingerprint tooling as well as data. They were not rewritten: strict September checks now detect the four intentional adapter changes. The new [preservation report](../../experiments/sampler-consolidation-2026-09-28/preservation-after.json) distinguishes these and the documented handoff/README changes from unexpected changes. Saved runs, configurations, source archives, annotations and dependency bytes remain unchanged.
