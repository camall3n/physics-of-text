# Manual precision screen: audit_384a3e2233

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 46.1%–52.1%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 46 supported, 48 incorrect, 6 ambiguous; 100 assessed out of 1184 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 46.0%–52.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **5.1%–92.8%**; for the optimistic endpoint: **7.3%–93.9%**. The envelope 5.1%–93.9% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 5.4% strict, 5.3% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_393](relations/rel_393.md): managerial or political leadership in | 86 | 3/2/0 | 0.0726 | 60.0%–60.0% |
| 2 | [rel_389](relations/rel_389.md): winner or champion of | 87 | 3/2/0 | 0.0735 | 60.0%–60.0% |
| 3 | [rel_24](relations/rel_24.md): managerial leadership in | 92 | 2/3/0 | 0.0777 | 40.0%–40.0% |
| 4 | [rel_252](relations/rel_252.md): managerial or political leadership in | 90 | 3/2/0 | 0.0760 | 60.0%–60.0% |
| 5 | [rel_397](relations/rel_397.md): communicated to | 82 | 2/2/1 | 0.0693 | 40.0%–60.0% |
| 6 | [rel_351](relations/rel_351.md): organizational subsidiary or unit of | 58 | 3/2/0 | 0.0490 | 60.0%–60.0% |
| 7 | [rel_84](relations/rel_84.md): defeated | 72 | 2/3/0 | 0.0608 | 40.0%–40.0% |
| 8 | [rel_335](relations/rel_335.md): analyst for | 61 | 2/2/1 | 0.0515 | 40.0%–60.0% |
| 9 | [rel_208](relations/rel_208.md): defeated | 76 | 1/4/0 | 0.0642 | 20.0%–20.0% |
| 10 | [rel_191](relations/rel_191.md): managerial or political leadership in | 58 | 3/0/2 | 0.0490 | 60.0%–100.0% |
| 11 | [rel_245](relations/rel_245.md): organization located or based in | 54 | 2/3/0 | 0.0456 | 40.0%–40.0% |
| 12 | [rel_67](relations/rel_67.md): president or manager of | 61 | 2/3/0 | 0.0515 | 40.0%–40.0% |
| 13 | [rel_18](relations/rel_18.md): coach of | 53 | 3/1/1 | 0.0448 | 60.0%–80.0% |
| 14 | [rel_228](relations/rel_228.md): organization located or based in | 39 | 2/3/0 | 0.0329 | 40.0%–40.0% |
| 15 | [rel_284](relations/rel_284.md): lawyer or attorney for | 35 | 1/4/0 | 0.0296 | 20.0%–20.0% |
| 16 | [rel_135](relations/rel_135.md): criticized or accused | 44 | 1/4/0 | 0.0372 | 20.0%–20.0% |
| 17 | [rel_364](relations/rel_364.md): owns | 30 | 4/1/0 | 0.0253 | 80.0%–80.0% |
| 18 | [rel_143](relations/rel_143.md): resided in | 40 | 1/3/1 | 0.0338 | 20.0%–40.0% |
| 19 | [rel_220](relations/rel_220.md): has spokesperson | 30 | 3/2/0 | 0.0253 | 60.0%–60.0% |
| 20 | [rel_321](relations/rel_321.md): organizational subsidiary or unit of | 36 | 3/2/0 | 0.0304 | 60.0%–60.0% |

## Ambiguous cases for inspection

- [rel_397__ent_189__ent_310](relations/rel_397.md): What was sent by Congress to the White House, and does the full sentence establish an addressed communication?
- [rel_335__ent_791__ent_310](relations/rel_335.md): Should this economist role count as an analyst, and is there source evidence of analytical duties or an analyst title?
- [rel_191__ent_2__ent_1261](relations/rel_191.md): Which real-world entities does this inferred pair denote: Rohatyn/Municipal Assistance Corporation, or Bosnian Serb/Karadzic?
- [rel_191__ent_107__ent_561](relations/rel_191.md): Are John Mara and George Young distinct people incorrectly merged here, and which person should the inferred fact name?
- [rel_18__ent_1060__ent_961](relations/rel_18.md): Does this inferred pair denote Pitino/Knick, or Cubans/United States, and should the mixed entity assignments be separated?
- [rel_143__ent_318__ent_517](relations/rel_143.md): Does this inferred population denote Cubans or Mexicans, and which group is the residence fact intended to identify?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
