# JSON storage audit — 2026-09-28

Read-only inventory performed alongside removal of the one-time grading scripts.
**No existing JSON or JSONL content was edited, reformatted, moved or deleted.**

## What was measured

Physical files below the repository root, excluding `.git` and without following
symlink directories. Physical line counts include formatting, comments where
applicable to source data, and blank lines; they do not measure executable code.
There are **6,948 JSON files and one JSONL file**, totaling **12,934,496 lines** and
**467,207,564 bytes** (467.21 decimal MB; 445.56 MiB).

Most JSON is experiment data: evidence, saved judgments, source/configuration
provenance and materialized report views. Editing these records is not equivalent
to maintaining that many lines of algorithmic code.

These mutually exclusive categories were assigned by filename/path heuristics:

| Category | Files | Physical lines | Bytes |
|---|---:|---:|---:|
| Derived assessments, coverage views, ranked cases and evaluations | 58 | 7,669,571 | 269,971,306 |
| Case and prior-case evidence | 53 | 3,027,535 | 105,782,673 |
| Current annotations | 1,721 | 514,281 | 20,117,762 |
| Annotation histories and prior annotations | 588 | 129,011 | 4,638,911 |
| Manifests and run/source metadata | 101 | 118,170 | 7,091,832 |
| Human review and references | 44 | 61,410 | 1,576,661 |
| Other JSON, including declarations, records, corpus and diagnostics | 4,384 | 1,414,518 | 58,028,419 |
| **Total** | **6,949** | **12,934,496** | **467,207,564** |

The coverage campaign and complete top-20 campaign account for 85.3% of bytes:

| Tree under experiments/ | Files | Lines | Bytes |
|---|---:|---:|---:|
| nyt-beta-0p001-coverage-2026-09-14 | 4,856 | 7,315,084 | 261,651,594 |
| nyt-complete-evaluation-2026-09-14 | 984 | 3,836,808 | 136,892,496 |

## Why the evidence repeats

All four coverage audits store the full reviewed facts in `assessment.json`.
Their `coverage_90.json` fact arrays are exactly equal to those assessment fact
arrays, and each smaller cutoff contains an unchanged subset of those facts.
The 20 cutoff JSON files alone contain **3,841,626 lines / 136,007,674 bytes**.
This supports independently browsable, complete selected-prefix reports but
duplicates evidence and judgments on disk.

There are 448 groups of exact-byte-identical files, with 609 redundant copies
totaling 31,325,067 bytes. Some of the largest are deliberate historical
`prior_cases` and `prior_assessment` snapshots. Identical bytes do not mean the
paths can be deleted safely: provenance and readers depend on their roles.

## Files open in the IDE

- `analysis/root_reviewer_attribution_correction.json`: audit record of attribution
  corrections, including before/after hashes; historical evidence.
- `progress.json`: regenerable workflow counts, not validated precision.
- `models/provenance.json`: source, parameter and saved-output provenance.
- `protected_manifest.json`: historical paths, sizes and hashes used to detect
  changes. It is not a disposable cache.

## Measured compaction options

| Approach | Estimated resulting bytes | Reduction | Effect |
|---|---:|---:|---|
| Remove only JSON whitespace outside strings | 331,478,535 | 29.051% | Same tokens/values, different file bytes |
| gzip each original file independently, level 6 | 38,584,731 | 91.741% | Original file bytes recoverable by decompression |

These are in-memory estimates; no compacted files were written. The gzip estimate
excludes directory/path/archive metadata and is not a measured complete archive.
JSONL record boundaries were retained in the whitespace calculation.

A blanket parse-and-reserialize operation is less conservative than lexical
whitespace removal: it can change numeric spelling, encoding and serialization.
Two legacy corpus JSON files (`pluieTriples_2013_06_12_3.json` and
`pluieTriples_2013_06_12_5.json`) are not UTF-8 and parse using CP1252/Latin-1.
The other 6,947 files parsed as standard UTF JSON/JSONL; no duplicate keys or
nonfinite numbers were found in that audit.

## Why in-place minification is not currently safe

The [coverage validator](../../experiments/nyt-beta-0p001-coverage-2026-09-14/scripts/report_censuses.mjs)
checks raw SHA-256 for cases, coverage selection, full ranked evidence, prior
snapshots, declarations and pregrading snapshots. Existing protected manifests
also record sizes and raw hashes. Formatting changes would fail those checks
despite unchanged parsed JSON values.

The existing preparation/report libraries use pretty JSON and in some places
reject byte differences from regenerated content. Minifying once does not make
the current writers preserve that format. Historical manifests must not simply
be overwritten to make a migration appear unchanged.

## Recommended direction

1. Keep current authoritative evidence, judgments, review amendments and provenance.
2. For frozen experiments, use lossless compressed archives that retain original
   paths and bytes. Verify every extracted file against its original hash before
   replacing loose storage. Existing tools then need either an explicit restore
   step or archive-aware loading; they do not currently read compressed files.
3. For active evaluations, store complete evidence and judgments once, and represent
   each coverage cutoff using stable case/relation references and aggregate counts.
   Keep the browsable Markdown views. This needs a versioned schema/reader migration
   and a check that every reconstructed view exactly matches the current one.
4. Use compact formatting selectively for future generated data; keep small
   human-edited configurations and review files readable.

Compression preserves archival information with much larger savings than
minification. Deduplicating generated views reduces repeated data and maintenance
burden, but it is a separate implementation task, not a safe mass-delete operation.
