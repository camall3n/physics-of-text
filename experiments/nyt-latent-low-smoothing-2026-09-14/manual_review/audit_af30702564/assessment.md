# Manual precision screen: audit_af30702564

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 85.0%–91.1%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 85 supported, 9 incorrect, 6 ambiguous; 100 assessed out of 436 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 85.0%–91.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **26.6%–96.6%**; for the optimistic endpoint: **29.8%–97.9%**. The envelope 26.6%–97.9% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 3.2% strict, 2.7% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_169](relations/rel_169.md): subsidiary or organizational unit of | 29 | 5/0/0 | 0.0665 | 100.0%–100.0% |
| 2 | [rel_125](relations/rel_125.md): analyst at organization | 26 | 4/0/1 | 0.0596 | 80.0%–100.0% |
| 3 | [rel_324](relations/rel_324.md): defeated opponent | 31 | 4/1/0 | 0.0711 | 80.0%–80.0% |
| 4 | [rel_333](relations/rel_333.md): president or manager of | 27 | 5/0/0 | 0.0619 | 100.0%–100.0% |
| 5 | [rel_274](relations/rel_274.md): leader or organizational head of | 27 | 2/1/2 | 0.0619 | 40.0%–80.0% |
| 6 | [rel_38](relations/rel_38.md): coach of | 18 | 5/0/0 | 0.0413 | 100.0%–100.0% |
| 7 | [rel_6](relations/rel_6.md): defeated opponent | 26 | 4/1/0 | 0.0596 | 80.0%–80.0% |
| 8 | [rel_132](relations/rel_132.md): economist at organization | 19 | 5/0/0 | 0.0436 | 100.0%–100.0% |
| 9 | [rel_175](relations/rel_175.md): director of organization | 25 | 5/0/0 | 0.0573 | 100.0%–100.0% |
| 10 | [rel_32](relations/rel_32.md): managerial or leadership office in | 26 | 5/0/0 | 0.0596 | 100.0%–100.0% |
| 11 | [rel_164](relations/rel_164.md): managerial or leadership office in | 19 | 4/0/1 | 0.0436 | 80.0%–100.0% |
| 12 | [rel_138](relations/rel_138.md): organization based or located in | 17 | 4/1/0 | 0.0390 | 80.0%–80.0% |
| 13 | [rel_340](relations/rel_340.md): winner or champion of | 17 | 4/1/0 | 0.0390 | 80.0%–80.0% |
| 14 | [rel_329](relations/rel_329.md): born in | 22 | 5/0/0 | 0.0505 | 100.0%–100.0% |
| 15 | [rel_338](relations/rel_338.md): president or manager of | 20 | 4/1/0 | 0.0459 | 80.0%–80.0% |
| 16 | [rel_352](relations/rel_352.md): subsidiary or organizational unit of | 17 | 3/1/1 | 0.0390 | 60.0%–80.0% |
| 17 | [rel_72](relations/rel_72.md): leader or organizational head of | 22 | 4/1/0 | 0.0505 | 80.0%–80.0% |
| 18 | [rel_239](relations/rel_239.md): managerial or leadership office in | 16 | 4/1/0 | 0.0367 | 80.0%–80.0% |
| 19 | [rel_42](relations/rel_42.md): subsidiary or organizational unit of | 15 | 5/0/0 | 0.0344 | 100.0%–100.0% |
| 20 | [rel_304](relations/rel_304.md): defeated opponent | 17 | 4/0/1 | 0.0390 | 80.0%–100.0% |

## Ambiguous cases for inspection

- [rel_125__ent_1186__ent_783](relations/rel_125.md): Which person should this fact identify, and should Wolzien, Abramowitz and Black be split into separate entities?
- [rel_274__ent_1203__ent_497](relations/rel_274.md): Does Yugoslav refer to the state Yugoslavia or a more specific omitted institution in the original leader-of sentence?
- [rel_274__ent_1364__ent_55](relations/rel_274.md): Should Science fiction/Wild West be separated from David Trimble/Ulster Unionist Party, and which entity pair is intended here?
- [rel_164__ent_1271__ent_1300](relations/rel_164.md): Which Clinton campaign, office or organization does director refer to, and should that body replace Mr. Clinton as the second argument?
- [rel_352__ent_407__ent_1218](relations/rel_352.md): Which Chicago office or organizational unit is meant, and should its full name replace the city argument?
- [rel_304__ent_1370__ent_557](relations/rel_304.md): Should Montreal Expos and San Diego Padres be separated, and which team is intended by this latent fact?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
