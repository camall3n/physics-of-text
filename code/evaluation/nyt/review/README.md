# Manual review tools

These libraries record **explicit supplied judgments** or display evidence. They contain no semantic classifier and do not automatically choose S/E/A. Importing the experiment callers performs no review or writes.

| Module | Role |
|---|---|
| `record.mjs` | One configurable full-relation recording implementation; includes read-only `prepareRecord` and evidence `show` |
| `archive250.mjs` | Separate historical archive-250 annotation schema and broad managerial predicate policy |
| `grade_adapter.mjs` | S/E/A shorthand mapping for explicit judgments |
| `scope_record.mjs` | Validated dictionary-first scope recording |
| `print_review.mjs`, `batch.mjs`, `rank_range.mjs` | Read-only evidence viewers; full source-line groups are preserved |
| `dictionaries.mjs` | Read-only rendering of complete dictionaries, with an optional writer |

Campaign wrappers supply roots, reviewer identity, population, audit IDs and CLI arguments. The complete census uses `census`; supplemental helpers use `supplemental`. Root, runner, evaluation and kernel callers preserve their original reviewer attribution. Coverage retains the pre-grading declaration lock, annotation history, identity tags and reviewer override option. Complete-census historical helpers keep their original recording behavior; no old annotation schema is silently rewritten.

`createManualReview(config).prepareRecord(...)` returns an annotation/manual-record plan without writing. `.record(...)` validates the full set before persisting. Coverage history preserves the previous annotation file whenever an existing judgment is replaced. These are deliberate editing functions, separate from read-only evaluation and report generation; consolidation does not call them on real experiments.

The [recording tests](../tests/manual_recording.test.mjs) use temporary synthetic cases only. [Historical workflow inventory](HISTORICAL.md) identifies retained one-time scripts; none are part of routine report regeneration.

Sibling `../diagnostics/` modules collect possible identity/collision flags without assigning labels. Their read-only collectors are separate from optional writers. These flags are not correctness or recall metrics.
