# One-time grading-script removal — 2026-09-28

Removed exactly **129** `*_grade_*.mjs` entry scripts from
`experiments/nyt-beta-0p001-coverage-2026-09-14/scripts/`, as requested.
This removes **1,030 physical JavaScript lines** (including comments and blank lines)
and **325,982 bytes**. There are **19** remaining reusable/helper/correction scripts.
No replacement executable code was added.

The scripts recorded explicit assistant-authored S/E/A decisions for particular
saved relation/fact IDs; their outputs are retained as annotations, annotation
history and manual review records. They were not inference code or a classifier
for new experiments. All cases, evidence, predicate declarations, review
corrections, experiment outputs and generated precision reports remain.

[Removed-file inventory](removed-files.tsv) gives each deleted path, line count,
byte count and SHA-256. Deleted script bodies are not retained in a new archive.

## Verification

Before removal, fresh read-only validation exactly matched all four saved full
assessments, all 20 cutoff views and precision counts, and confirmed all 1,144
relation reports include their 8,488 evaluated fact headings and judgments.
No report generator or annotation-entry script was executed on saved data.

All **7,237 other existing files** within the coverage study, totaling
**287,944,834 bytes**, were verified byte-for-byte unchanged
immediately after removal. The study README is the sole intentional existing
documentation change and is excluded from that comparison.

Preserved-file aggregate SHA-256: `856562d31112534ab41ed383521ce04356d21f414f0397a5eca3e7ef115a9a45`.
Computed from sorted UTF-8 rows `relative_path<TAB>byte_count<TAB>sha256<LF>`,
relative to the coverage study, excluding its README and the 129 deleted paths.

Study README SHA-256 before: `e6defcb1d6fe38e28746c3cd838b767e7fd163eb0d48175993a0d7c107c763c3`.
Study README SHA-256 after: `6126a418637b3dc88f5993fdd690e910266ab1c695ebf512ae97945748da919b`.

Post-removal validation again exactly matched the four full assessments, all
20 cutoff views, counts and precision endpoints. All **31 existing regression
tests passed**, with zero failures, skips or cancellations; see [test log](tests.log).
The tests created and removed only temporary fixture directories.

After the tests, the same 7,237 preserved files were checked again against the
aggregate above and matched exactly. No grading entry scripts remain.

The older cross-experiment protected manifests already report authorized
sampler-consolidation changes (HANDOFF, legacy build/run adapters and a variant
README); none lists the deleted grading scripts. Those historical manifests
were preserved rather than rewritten to hide the earlier maintenance changes.
Existing JSON data and historical provenance manifests have not been rewritten.

[Read-only JSON storage audit and compaction options](JSON_STORAGE_AUDIT.md). No JSON was compacted.
