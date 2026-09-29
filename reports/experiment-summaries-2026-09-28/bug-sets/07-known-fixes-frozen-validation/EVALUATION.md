# B07 — Patched-source frozen toy validation — evaluation

[Main index](../../README.md) · [Bug catalog](../../BUG_CATALOG.md) · [All complete NYT results](../../evaluations/campaigns/evaluation-complete-top20-all-models.md)

[Bug descriptions, implications and fixes](BUGS.md)

No full-NYT inference run belongs to this source/mode combination. Its evidence consists of the validation processes below.

## Saved toy validation evidence

These are validation process outputs, not NYT semantic-precision experiments. Within each latent/frozen pair, indices 0 and 1 restart the same seed in separate JVMs. The saved validation summaries report exact replay; those tests were not rerun for this organization.

| Saved process | β | Seed | Bug set | Configuration |
|---|---:|---:|---|---|
| [entityfix-1789237190192/frozen-0](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0) | 0.1 | 20260912 | [07](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-0/config.json) |
| [entityfix-1789237190192/frozen-1](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1) | 0.1 | 20260912 | [07](BUGS.md) | [config](../../../../experiments/nyt-precision-investigation-2026-09-12/tests/entityfix-1789237190192/frozen-1/config.json) |
| [entityfix-1789413029174/frozen-0](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0) | 0.001 | 20260912 | [07](BUGS.md) | [config](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-0/config.json) |
| [entityfix-1789413029174/frozen-1](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1) | 0.001 | 20260912 | [07](BUGS.md) | [config](../../../../experiments/nyt-latent-low-smoothing-2026-09-14/tests/entityfix-1789413029174/frozen-1/config.json) |

Recorded results are retained for inspection; no deletion decision or claim of universal sampler correctness is implied.
