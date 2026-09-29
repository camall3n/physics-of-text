# Manual precision screen: audit_dba5006d06

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 74.4%–78.9%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 72 supported, 24 incorrect, 4 ambiguous; 100 assessed out of 735 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 72.0%–76.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **19.2%–95.2%**; for the optimistic endpoint: **21.8%–95.9%**. The envelope 19.2%–95.9% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 3.7% strict, 3.0% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_157](relations/rel_157.md): organization based or located in | 54 | 2/3/0 | 0.0735 | 40.0%–40.0% |
| 2 | [rel_247](relations/rel_247.md): managerial or leadership office in | 69 | 5/0/0 | 0.0939 | 100.0%–100.0% |
| 3 | [rel_63](relations/rel_63.md): defeated opponent | 41 | 5/0/0 | 0.0558 | 100.0%–100.0% |
| 4 | [rel_117](relations/rel_117.md): managerial or leadership office in | 40 | 5/0/0 | 0.0544 | 100.0%–100.0% |
| 5 | [rel_262](relations/rel_262.md): spokesperson for | 53 | 4/0/1 | 0.0721 | 80.0%–100.0% |
| 6 | [rel_134](relations/rel_134.md): subsidiary or organizational unit of | 35 | 4/1/0 | 0.0476 | 80.0%–80.0% |
| 7 | [rel_268](relations/rel_268.md): analyst at organization | 55 | 4/0/1 | 0.0748 | 80.0%–100.0% |
| 8 | [rel_323](relations/rel_323.md): winner or champion of | 33 | 4/1/0 | 0.0449 | 80.0%–80.0% |
| 9 | [rel_215](relations/rel_215.md): athlete plays for team | 36 | 3/2/0 | 0.0490 | 60.0%–60.0% |
| 10 | [rel_71](relations/rel_71.md): managerial or leadership office in | 49 | 5/0/0 | 0.0667 | 100.0%–100.0% |
| 11 | [rel_113](relations/rel_113.md): directed communication to | 30 | 4/0/1 | 0.0408 | 80.0%–100.0% |
| 12 | [rel_124](relations/rel_124.md): lives or has lived in | 43 | 3/2/0 | 0.0585 | 60.0%–60.0% |
| 13 | [rel_223](relations/rel_223.md): moves or travels to | 28 | 5/0/0 | 0.0381 | 100.0%–100.0% |
| 14 | [rel_389](relations/rel_389.md): member of organization or political body | 24 | 1/3/1 | 0.0327 | 20.0%–40.0% |
| 15 | [rel_180](relations/rel_180.md): owns organization or asset | 25 | 4/1/0 | 0.0340 | 80.0%–80.0% |
| 16 | [rel_394](relations/rel_394.md): president or manager office in | 24 | 2/3/0 | 0.0327 | 40.0%–40.0% |
| 17 | [rel_245](relations/rel_245.md): coach of | 21 | 5/0/0 | 0.0286 | 100.0%–100.0% |
| 18 | [rel_353](relations/rel_353.md): lives or has lived in | 32 | 0/5/0 | 0.0435 | 0.0%–0.0% |
| 19 | [rel_336](relations/rel_336.md): president or manager office in | 23 | 5/0/0 | 0.0313 | 100.0%–100.0% |
| 20 | [rel_156](relations/rel_156.md): directed communication to | 20 | 2/3/0 | 0.0272 | 40.0%–40.0% |

## Ambiguous cases for inspection

- [rel_262__ent_109__ent_1046](relations/rel_262.md): Does Environment identify a specific organization represented by Adrienne Esposito, and does say-for here mean speaking on its behalf?
- [rel_268__ent_862__ent_808](relations/rel_268.md): Should economist and trends-specialist work qualify as analyst work under the declared analyst predicate?
- [rel_113__ent_197__ent_520](relations/rel_113.md): What did Ms. Lewinsky send to Vernon Jordan, and does the underlying text establish communication from her to him?
- [rel_389__ent_819__ent_1197](relations/rel_389.md): Does Democrats denote the individual legislators elected to the Senate here, or the Democratic Party as the entity whose membership is being asserted?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
