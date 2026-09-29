# Manual precision screen: audit_c0010fff1d

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 37.3%–43.7%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 41 supported, 52 incorrect, 7 ambiguous; 100 assessed out of 1197 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 41.0%–48.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **6.1%–88.0%**; for the optimistic endpoint: **7.3%–90.2%**. The envelope 6.1%–90.2% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 4.3% strict, 4.5% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_87](relations/rel_87.md): managerial or leadership office in | 94 | 3/2/0 | 0.0785 | 60.0%–60.0% |
| 2 | [rel_156](relations/rel_156.md): defeated opponent | 111 | 0/5/0 | 0.0927 | 0.0%–0.0% |
| 3 | [rel_298](relations/rel_298.md): economist at organization | 88 | 1/4/0 | 0.0735 | 20.0%–20.0% |
| 4 | [rel_372](relations/rel_372.md): subsidiary or organizational unit of | 63 | 5/0/0 | 0.0526 | 100.0%–100.0% |
| 5 | [rel_363](relations/rel_363.md): travels or moves to | 90 | 1/3/1 | 0.0752 | 20.0%–40.0% |
| 6 | [rel_280](relations/rel_280.md): managerial or leadership office in | 56 | 4/1/0 | 0.0468 | 80.0%–80.0% |
| 7 | [rel_222](relations/rel_222.md): defeated opponent | 81 | 1/4/0 | 0.0677 | 20.0%–20.0% |
| 8 | [rel_109](relations/rel_109.md): coach of | 57 | 2/3/0 | 0.0476 | 40.0%–40.0% |
| 9 | [rel_84](relations/rel_84.md): organization based or located in | 44 | 2/2/1 | 0.0368 | 40.0%–60.0% |
| 10 | [rel_89](relations/rel_89.md): managerial or leadership office in | 53 | 3/1/1 | 0.0443 | 60.0%–80.0% |
| 11 | [rel_187](relations/rel_187.md): winner or champion of | 39 | 3/1/1 | 0.0326 | 60.0%–80.0% |
| 12 | [rel_258](relations/rel_258.md): managerial or leadership office in | 61 | 0/4/1 | 0.0510 | 0.0%–20.0% |
| 13 | [rel_196](relations/rel_196.md): organization based or located in | 38 | 5/0/0 | 0.0317 | 100.0%–100.0% |
| 14 | [rel_13](relations/rel_13.md): directed communication to | 57 | 1/3/1 | 0.0476 | 20.0%–40.0% |
| 15 | [rel_323](relations/rel_323.md): winner or champion of | 54 | 1/4/0 | 0.0451 | 20.0%–20.0% |
| 16 | [rel_188](relations/rel_188.md): analyst at organization | 50 | 1/4/0 | 0.0418 | 20.0%–20.0% |
| 17 | [rel_47](relations/rel_47.md): owns or is parent of | 43 | 3/2/0 | 0.0359 | 60.0%–60.0% |
| 18 | [rel_197](relations/rel_197.md): director of organization | 43 | 1/3/1 | 0.0359 | 20.0%–40.0% |
| 19 | [rel_134](relations/rel_134.md): has political or institutional leader | 42 | 2/3/0 | 0.0351 | 40.0%–40.0% |
| 20 | [rel_221](relations/rel_221.md): spokesperson for | 33 | 2/3/0 | 0.0276 | 40.0%–40.0% |

## Ambiguous cases for inspection

- [rel_363__ent_1004__ent_682](relations/rel_363.md): Does the original move-to sentence report an actual Yankees relocation, or a proposed/conditional move to New Jersey?
- [rel_84__ent_1247__ent_1270](relations/rel_84.md): Should Dallas and Muse be separated, and which complete Hicks organization is intended by this latent pair?
- [rel_89__ent_1291__ent_497](relations/rel_89.md): Does Yugoslav stand for the state Yugoslavia or a more specific omitted body in the original president-of sentence?
- [rel_187__ent_994__ent_1228](relations/rel_187.md): Should World Boxing Council be interpreted as a specific WBC title here, and which title is intended?
- [rel_258__ent_1386__ent_497](relations/rel_258.md): What complete state or organization is represented by Yugoslav in the leader-of construction?
- [rel_13__ent_180__ent_189](relations/rel_13.md): Can Bush and Mr. Greenspan be separated into their intended entity identities before assessing this communication fact?
- [rel_197__ent_556__ent_798](relations/rel_197.md): Which identities should replace this merged pair, and does the director-amod sentence establish Mr. Lee as director of any Taiwan institution?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
