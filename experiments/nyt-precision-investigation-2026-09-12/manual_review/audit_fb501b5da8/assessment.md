# Manual precision screen: audit_fb501b5da8

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 66.7%–72.4%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 67 supported, 27 incorrect, 6 ambiguous; 100 assessed out of 715 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 67.0%–73.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **16.8%–93.8%**; for the optimistic endpoint: **18.3%–95.7%**. The envelope 16.8%–95.7% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 3.9% strict, 4.0% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_237](relations/rel_237.md): managerial or leadership office in | 60 | 5/0/0 | 0.0839 | 100.0%–100.0% |
| 2 | [rel_190](relations/rel_190.md): directed communication to | 51 | 5/0/0 | 0.0713 | 100.0%–100.0% |
| 3 | [rel_330](relations/rel_330.md): defeated opponent | 41 | 5/0/0 | 0.0573 | 100.0%–100.0% |
| 4 | [rel_26](relations/rel_26.md): winner or champion of | 43 | 1/4/0 | 0.0601 | 20.0%–20.0% |
| 5 | [rel_275](relations/rel_275.md): organization based or located in | 45 | 1/2/2 | 0.0629 | 20.0%–60.0% |
| 6 | [rel_319](relations/rel_319.md): managerial or leadership office in | 52 | 4/1/0 | 0.0727 | 80.0%–80.0% |
| 7 | [rel_91](relations/rel_91.md): analyst at organization | 57 | 2/3/0 | 0.0797 | 40.0%–40.0% |
| 8 | [rel_331](relations/rel_331.md): subsidiary or organizational unit of | 27 | 4/0/1 | 0.0378 | 80.0%–100.0% |
| 9 | [rel_118](relations/rel_118.md): member of organization | 36 | 2/3/0 | 0.0503 | 40.0%–40.0% |
| 10 | [rel_385](relations/rel_385.md): managerial or leadership office in | 31 | 4/1/0 | 0.0434 | 80.0%–80.0% |
| 11 | [rel_399](relations/rel_399.md): spokesperson for | 44 | 4/1/0 | 0.0615 | 80.0%–80.0% |
| 12 | [rel_45](relations/rel_45.md): lives in | 37 | 1/3/1 | 0.0517 | 20.0%–40.0% |
| 13 | [rel_130](relations/rel_130.md): president or manager of | 34 | 5/0/0 | 0.0476 | 100.0%–100.0% |
| 14 | [rel_69](relations/rel_69.md): travels or moves to | 27 | 3/2/0 | 0.0378 | 60.0%–60.0% |
| 15 | [rel_120](relations/rel_120.md): has political or institutional leader | 26 | 2/2/1 | 0.0364 | 40.0%–60.0% |
| 16 | [rel_1](relations/rel_1.md): coach of | 22 | 5/0/0 | 0.0308 | 100.0%–100.0% |
| 17 | [rel_52](relations/rel_52.md): owns or is parent of | 22 | 4/1/0 | 0.0308 | 80.0%–80.0% |
| 18 | [rel_342](relations/rel_342.md): managerial or leadership office in | 23 | 3/1/1 | 0.0322 | 60.0%–80.0% |
| 19 | [rel_43](relations/rel_43.md): organization based or located in | 18 | 4/1/0 | 0.0252 | 80.0%–80.0% |
| 20 | [rel_291](relations/rel_291.md): athlete plays for team | 19 | 3/2/0 | 0.0266 | 60.0%–60.0% |

## Ambiguous cases for inspection

- [rel_275__ent_292__ent_28](relations/rel_275.md): Does the original text establish a physical Swiss base, or only nationality/ownership?
- [rel_275__ent_293__ent_10](relations/rel_275.md): What complete place is the object of based in for Bertelsmann, and does German refer to it?
- [rel_331__ent_843__ent_422](relations/rel_331.md): Which New York office or unit and which Hill organization are meant, and do these rows refer to the same pair?
- [rel_45__ent_406__ent_333](relations/rel_45.md): Does the original wife/live-in sentence say William himself lives in Manhattan, or only a relative?
- [rel_120__ent_1197__ent_816](relations/rel_120.md): Does the leader construction identify a named individual omitted by the Republicans argument, or assert the party itself as institutional leader?
- [rel_342__ent_298__ent_19](relations/rel_342.md): Does the original head-of sentence identify Kevin McKenzie as Ballet Theater head, or a dancer who worked with him?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
