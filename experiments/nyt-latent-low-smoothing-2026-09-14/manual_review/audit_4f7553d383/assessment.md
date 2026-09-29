# Manual precision screen: audit_4f7553d383

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 76.2%–84.5%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 76 supported, 15 incorrect, 9 ambiguous; 100 assessed out of 421 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 76.0%–85.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **22.8%–94.3%**; for the optimistic endpoint: **27.6%–96.4%**. The envelope 22.8%–96.4% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 3.9% strict, 3.3% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_250](relations/rel_250.md): unit or subsidiary of | 33 | 5/0/0 | 0.0784 | 100.0%–100.0% |
| 2 | [rel_342](relations/rel_342.md): analyst affiliation | 23 | 3/0/2 | 0.0546 | 60.0%–100.0% |
| 3 | [rel_21](relations/rel_21.md): coach of | 21 | 4/1/0 | 0.0499 | 80.0%–80.0% |
| 4 | [rel_114](relations/rel_114.md): defeated opponent | 31 | 3/2/0 | 0.0736 | 60.0%–60.0% |
| 5 | [rel_263](relations/rel_263.md): director of | 30 | 4/1/0 | 0.0713 | 80.0%–80.0% |
| 6 | [rel_205](relations/rel_205.md): chairperson of | 21 | 3/2/0 | 0.0499 | 60.0%–60.0% |
| 7 | [rel_390](relations/rel_390.md): directed communication | 23 | 5/0/0 | 0.0546 | 100.0%–100.0% |
| 8 | [rel_242](relations/rel_242.md): chairs or heads organization | 15 | 2/2/1 | 0.0356 | 40.0%–60.0% |
| 9 | [rel_170](relations/rel_170.md): unit or subsidiary of | 17 | 3/2/0 | 0.0404 | 60.0%–60.0% |
| 10 | [rel_269](relations/rel_269.md): economist affiliation | 20 | 5/0/0 | 0.0475 | 100.0%–100.0% |
| 11 | [rel_112](relations/rel_112.md): winner or champion of | 21 | 3/2/0 | 0.0499 | 60.0%–60.0% |
| 12 | [rel_383](relations/rel_383.md): director affiliation | 25 | 4/0/1 | 0.0594 | 80.0%–100.0% |
| 13 | [rel_382](relations/rel_382.md): executive of | 13 | 5/0/0 | 0.0309 | 100.0%–100.0% |
| 14 | [rel_83](relations/rel_83.md): managerial or leadership office in | 19 | 5/0/0 | 0.0451 | 100.0%–100.0% |
| 15 | [rel_186](relations/rel_186.md): president or manager of | 21 | 3/2/0 | 0.0499 | 60.0%–60.0% |
| 16 | [rel_274](relations/rel_274.md): political or organizational leader of | 19 | 4/0/1 | 0.0451 | 80.0%–100.0% |
| 17 | [rel_98](relations/rel_98.md): winner or champion of | 23 | 3/1/1 | 0.0546 | 60.0%–80.0% |
| 18 | [rel_216](relations/rel_216.md): defeated opponent | 18 | 3/0/2 | 0.0428 | 60.0%–100.0% |
| 19 | [rel_223](relations/rel_223.md): geographical part of | 11 | 4/0/1 | 0.0261 | 80.0%–100.0% |
| 20 | [rel_312](relations/rel_312.md): owner of | 17 | 5/0/0 | 0.0404 | 100.0%–100.0% |

## Ambiguous cases for inspection

- [rel_342__ent_1330__ent_1180](relations/rel_342.md): Should this latent entity be resolved to Paine Webber or Merrill Lynch, or split into two organizations?
- [rel_342__ent_736__ent_783](relations/rel_342.md): Which person does this first latent entity denote, given its Wolzien, Abramowitz and Black mentions?
- [rel_242__ent_7__ent_485](relations/rel_242.md): Which named Democrat is the first argument, and do these committee-chair references all denote that individual?
- [rel_383__ent_1109__ent_672](relations/rel_383.md): Does Study of American Catholicism name the institution/program Appleby directs, and what full entity does the source sentence identify?
- [rel_274__ent_1406__ent_1401](relations/rel_274.md): Which person does this first entity denote, Bob Dole or Tom Daschle, and should these Senate-leadership facts be split?
- [rel_98__ent_409__ent_1420](relations/rel_98.md): Does this first entity denote the Yankees or the Marlins, and should their World Series facts be separated?
- [rel_216__ent_1236__ent_647](relations/rel_216.md): Should the second entity be the Dodgers or Florida Marlins, or should these opponent facts be split?
- [rel_216__ent_1310__ent_254](relations/rel_216.md): Do East and West denote the same sports competitors throughout these rows, or have geographic/political East–West referents been merged into the pair?
- [rel_223__ent_1220__ent_323](relations/rel_223.md): Does this first entity denote Bedford-Stuyvesant or Brownsville, and should their containment facts be separate?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
