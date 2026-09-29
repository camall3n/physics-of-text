# Verification of report cleanup

The authorized cleanup removes evaluation reports and grading data for confirmed active defects while retaining raw experiment outputs, configurations, bug documentation and regression tests. See the [cleanup record](../buggy-evaluation-cleanup-2026-09-28/README.md).

## Summary-tree scope

- Removed five detailed run reports: four full-NYT runs in B01/B02 and the pre-fix Figure 1 condition in B05.
- Removed EVALUATION.md from B01, B02 and B05; their README.md files retain short identities, configurations and raw-source links. BUGS.md remains.
- Removed those runs' score rows and grading links from shared beta, pre-fix and campaign views. The Figure 1 sensitivity summary retains corrected-run results.
- Retained 77 detailed summaries, including ten complete-NYT run evaluations, twenty coverage conditions, corrected Figure 1, uncertain historical outputs and validation fixtures.
- The six retained beta=0.1 complete censuses contain 5,300 run-specific facts; all ten retained complete censuses contain 6,905 facts. These totals describe separate assessment populations, not pooled precision.

This documentation cleanup does not rerun inference or semantic grading. The final local Markdown link scan found no missing targets. No removed NYT audit IDs, original-subsidiary evaluation links, or deleted detailed-report links remain in the retained summaries. The organization map explicitly records the five retired report filenames as history. The earlier organization-only preservation fingerprint is superseded by the cleanup record because evaluation artifacts are now intentionally removed.
