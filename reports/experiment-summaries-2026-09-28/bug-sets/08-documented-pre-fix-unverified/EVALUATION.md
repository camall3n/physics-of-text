# B08 — Documented pre-fix conditions; exact source unknown — evaluation

[Main index](../../README.md) · [Bug catalog](../../BUG_CATALOG.md) · [All complete NYT results](../../evaluations/campaigns/evaluation-complete-top20-all-models.md)

[Bug descriptions, implications and fixes](BUGS.md)

## Documented-only conditions

These conditions are described in earlier implementation notes; raw run outputs and exact producing source snapshots are missing. They are separate from similarly named original archive fixtures. No precision value can be reconstructed here. Their pre-correction stage is documented, but the precise active bug subset is not established.

| Documented condition | β | Recorded outcome / limitation | Precision |
|---|---:|---|---|
| [250-row NYT, fact moves only](reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md) | 0.1 | 24–28 expressed relations; best reported log probability −4489 | unavailable |
| [250-row NYT, relation split/merge](reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md) | 0.1 | See saved development-note summary; no preserved semantic census | unavailable |
| [2,500-row NYT scaling](reports/baseline-nyt-post-import-2500-scaling-documented-only.md) | unknown | Reported runtime under three minutes; exact β and run config unknown | unavailable |
| [Toy, sparse dictionaries](reports/toy-post-import-sparse-beta001-documented-only.md) | 0.01 | Development-note result only; no saved run-level semantic evaluation | unavailable |
| [Toy, smoother dictionaries](reports/toy-post-import-beta05-documented-only.md) | 0.5 | Development-note result only; no saved run-level semantic evaluation | unavailable |

## Canonical experiment summaries

- [Post-import NYT 250-row run: fact moves only](reports/baseline-nyt-post-import-250-fact-moves-only-documented-only.md)
- [Post-import NYT 250-row run: relation split/merge enabled](reports/baseline-nyt-post-import-250-with-relation-split-merge-documented-only.md)
- [Post-import NYT 2,500-row scaling run](reports/baseline-nyt-post-import-2500-scaling-documented-only.md)
- [Post-import toy inference-of-K, beta=0.5](reports/toy-post-import-beta05-documented-only.md)
- [Post-import toy inference-of-K, beta=0.01](reports/toy-post-import-sparse-beta001-documented-only.md)

Recorded results are retained for inspection; no deletion decision or claim of universal sampler correctness is implied.
