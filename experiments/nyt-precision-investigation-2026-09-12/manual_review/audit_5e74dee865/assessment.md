# Manual precision screen: audit_5e74dee865

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 91.9%–96.0%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 90 supported, 4 incorrect, 6 ambiguous; 100 assessed out of 384 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 90.0%–96.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **32.8%–97.4%**; for the optimistic endpoint: **35.2%–99.0%**. The envelope 32.8%–99.0% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 2.1% strict, 1.8% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_114](relations/rel_114.md): defeated opponent | 27 | 5/0/0 | 0.0703 | 100.0%–100.0% |
| 2 | [rel_91](relations/rel_91.md): analyst at organization | 33 | 5/0/0 | 0.0859 | 100.0%–100.0% |
| 3 | [rel_343](relations/rel_343.md): defeated opponent | 22 | 4/1/0 | 0.0573 | 80.0%–80.0% |
| 4 | [rel_396](relations/rel_396.md): coach of | 23 | 5/0/0 | 0.0599 | 100.0%–100.0% |
| 5 | [rel_332](relations/rel_332.md): president or manager of | 28 | 4/1/0 | 0.0729 | 80.0%–80.0% |
| 6 | [rel_126](relations/rel_126.md): president or manager of | 25 | 5/0/0 | 0.0651 | 100.0%–100.0% |
| 7 | [rel_326](relations/rel_326.md): managerial or leadership office in | 21 | 5/0/0 | 0.0547 | 100.0%–100.0% |
| 8 | [rel_58](relations/rel_58.md): leader or organizational head of | 18 | 5/0/0 | 0.0469 | 100.0%–100.0% |
| 9 | [rel_29](relations/rel_29.md): winner or champion of | 18 | 5/0/0 | 0.0469 | 100.0%–100.0% |
| 10 | [rel_9](relations/rel_9.md): subsidiary or organizational unit of | 16 | 5/0/0 | 0.0417 | 100.0%–100.0% |
| 11 | [rel_282](relations/rel_282.md): subsidiary or organizational unit of | 17 | 4/0/1 | 0.0443 | 80.0%–100.0% |
| 12 | [rel_8](relations/rel_8.md): owns or is parent of | 14 | 5/0/0 | 0.0365 | 100.0%–100.0% |
| 13 | [rel_31](relations/rel_31.md): spokesperson for | 20 | 5/0/0 | 0.0521 | 100.0%–100.0% |
| 14 | [rel_127](relations/rel_127.md): organizational leadership office in | 12 | 1/1/3 | 0.0313 | 20.0%–80.0% |
| 15 | [rel_290](relations/rel_290.md): managerial or leadership office in | 25 | 5/0/0 | 0.0651 | 100.0%–100.0% |
| 16 | [rel_251](relations/rel_251.md): directed communication to | 15 | 4/1/0 | 0.0391 | 80.0%–80.0% |
| 17 | [rel_260](relations/rel_260.md): managerial or leadership office in | 15 | 5/0/0 | 0.0391 | 100.0%–100.0% |
| 18 | [rel_159](relations/rel_159.md): has spokesperson | 10 | 5/0/0 | 0.0260 | 100.0%–100.0% |
| 19 | [rel_99](relations/rel_99.md): professor or university teacher at | 12 | 5/0/0 | 0.0313 | 100.0%–100.0% |
| 20 | [rel_347](relations/rel_347.md): business or organization based or located in | 13 | 3/0/2 | 0.0339 | 60.0%–100.0% |

## Ambiguous cases for inspection

- [rel_282__ent_843__ent_422](relations/rel_282.md): Does New York denote a specific Hill office/business unit here, and if so what is its name?
- [rel_127__ent_263__ent_486](relations/rel_127.md): Which individual Republican is the chairman/head of Finance Committee in these source sentences?
- [rel_127__ent_7__ent_243](relations/rel_127.md): Which individual Democrat is the Armed Services Committee leader, and do the member and chair rows refer to that same person?
- [rel_127__ent_263__ent_1172](relations/rel_127.md): Which named Republican holds or held this Senate Finance Committee leadership office?
- [rel_347__ent_293__ent_10](relations/rel_347.md): Does German stand for Germany or for another truncated location in the original sentence?
- [rel_347__ent_1089__ent_953](relations/rel_347.md): Is Birinyi Associates physically located on Wall Street here, or is Wall Street only an industry descriptor?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
