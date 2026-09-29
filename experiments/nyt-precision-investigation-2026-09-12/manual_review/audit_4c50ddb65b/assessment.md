# Manual precision screen: audit_4c50ddb65b

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 61.0%–67.8%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 67 supported, 29 incorrect, 4 ambiguous; 100 assessed out of 727 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 67.0%–71.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **14.6%–92.8%**; for the optimistic endpoint: **16.4%–94.9%**. The envelope 14.6%–94.9% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 4.6% strict, 4.9% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_381](relations/rel_381.md): managerial leadership in | 100 | 1/2/2 | 0.1376 | 20.0%–60.0% |
| 2 | [rel_66](relations/rel_66.md): managerial leadership in | 61 | 4/1/0 | 0.0839 | 80.0%–80.0% |
| 3 | [rel_213](relations/rel_213.md): defeated | 44 | 3/2/0 | 0.0605 | 60.0%–60.0% |
| 4 | [rel_299](relations/rel_299.md): communicated to | 43 | 3/2/0 | 0.0591 | 60.0%–60.0% |
| 5 | [rel_245](relations/rel_245.md): organizational subsidiary or unit of | 34 | 5/0/0 | 0.0468 | 100.0%–100.0% |
| 6 | [rel_269](relations/rel_269.md): president or manager of | 41 | 3/2/0 | 0.0564 | 60.0%–60.0% |
| 7 | [rel_373](relations/rel_373.md): lawyer or attorney for | 43 | 1/4/0 | 0.0591 | 20.0%–20.0% |
| 8 | [rel_9](relations/rel_9.md): winner or champion of | 29 | 4/0/1 | 0.0399 | 80.0%–100.0% |
| 9 | [rel_19](relations/rel_19.md): managerial leadership in | 35 | 5/0/0 | 0.0481 | 100.0%–100.0% |
| 10 | [rel_133](relations/rel_133.md): traveled or moved to | 36 | 5/0/0 | 0.0495 | 100.0%–100.0% |
| 11 | [rel_375](relations/rel_375.md): organization located or based in | 35 | 3/2/0 | 0.0481 | 60.0%–60.0% |
| 12 | [rel_238](relations/rel_238.md): political or organizational leader of | 29 | 5/0/0 | 0.0399 | 100.0%–100.0% |
| 13 | [rel_11](relations/rel_11.md): contributed writing to publication | 38 | 1/4/0 | 0.0523 | 20.0%–20.0% |
| 14 | [rel_354](relations/rel_354.md): owns | 32 | 1/4/0 | 0.0440 | 20.0%–20.0% |
| 15 | [rel_345](relations/rel_345.md): organization located or based in | 19 | 5/0/0 | 0.0261 | 100.0%–100.0% |
| 16 | [rel_292](relations/rel_292.md): has political leader or minister | 23 | 3/2/0 | 0.0316 | 60.0%–60.0% |
| 17 | [rel_156](relations/rel_156.md): athlete played for team | 19 | 3/2/0 | 0.0261 | 60.0%–60.0% |
| 18 | [rel_369](relations/rel_369.md): organization located or based in | 19 | 4/0/1 | 0.0261 | 80.0%–100.0% |
| 19 | [rel_41](relations/rel_41.md): coach of | 21 | 4/1/0 | 0.0289 | 80.0%–80.0% |
| 20 | [rel_231](relations/rel_231.md): analyst for | 26 | 4/1/0 | 0.0358 | 80.0%–80.0% |

## Ambiguous cases for inspection

- [rel_381__ent_299__ent_16](relations/rel_381.md): Does Mayor denote the mayoral administration or the individual officeholder in these rows?
- [rel_381__ent_862__ent_808](relations/rel_381.md): Does principal at Morgan Stanley here establish a managerial office, or only a senior research/professional rank?
- [rel_9__ent_983__ent_981](relations/rel_9.md): Does Prevention of Nuclear War denote the recipient organization itself, and what is its full name in the source sentence?
- [rel_369__ent_1165__ent_227](relations/rel_369.md): Does Snug Harbor here denote an institution or organizational venue based at Richmond Terrace, or merely a geographic harbor/place?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
