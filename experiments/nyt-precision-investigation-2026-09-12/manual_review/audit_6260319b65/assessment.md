# Manual precision screen: audit_6260319b65

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 85.8%–93.8%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 84 supported, 7 incorrect, 9 ambiguous; 100 assessed out of 364 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 84.0%–93.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **30.5%–95.6%**; for the optimistic endpoint: **34.9%–98.1%**. The envelope 30.5%–98.1% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 2.5% strict, 1.4% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_283](relations/rel_283.md): defeated opponent | 20 | 5/0/0 | 0.0549 | 100.0%–100.0% |
| 2 | [rel_167](relations/rel_167.md): subsidiary or organizational unit of | 19 | 5/0/0 | 0.0522 | 100.0%–100.0% |
| 3 | [rel_11](relations/rel_11.md): analyst at organization | 25 | 5/0/0 | 0.0687 | 100.0%–100.0% |
| 4 | [rel_388](relations/rel_388.md): defeated opponent | 21 | 5/0/0 | 0.0577 | 100.0%–100.0% |
| 5 | [rel_257](relations/rel_257.md): president or manager of | 22 | 5/0/0 | 0.0604 | 100.0%–100.0% |
| 6 | [rel_278](relations/rel_278.md): managerial or leadership office in | 19 | 5/0/0 | 0.0522 | 100.0%–100.0% |
| 7 | [rel_94](relations/rel_94.md): spokesperson for | 23 | 4/0/1 | 0.0632 | 80.0%–100.0% |
| 8 | [rel_22](relations/rel_22.md): president or manager of | 21 | 4/0/1 | 0.0577 | 80.0%–100.0% |
| 9 | [rel_138](relations/rel_138.md): managerial or leadership office in | 16 | 4/0/1 | 0.0440 | 80.0%–100.0% |
| 10 | [rel_259](relations/rel_259.md): business or organization based or located in | 19 | 3/2/0 | 0.0522 | 60.0%–60.0% |
| 11 | [rel_322](relations/rel_322.md): managerial or leadership office in | 22 | 5/0/0 | 0.0604 | 100.0%–100.0% |
| 12 | [rel_39](relations/rel_39.md): coach of | 20 | 5/0/0 | 0.0549 | 100.0%–100.0% |
| 13 | [rel_194](relations/rel_194.md): geographic neighborhood or area within | 10 | 5/0/0 | 0.0275 | 100.0%–100.0% |
| 14 | [rel_102](relations/rel_102.md): leader or organizational head of | 19 | 3/0/2 | 0.0522 | 60.0%–100.0% |
| 15 | [rel_128](relations/rel_128.md): managerial or leadership office in | 17 | 5/0/0 | 0.0467 | 100.0%–100.0% |
| 16 | [rel_186](relations/rel_186.md): winner or champion of | 14 | 4/1/0 | 0.0385 | 80.0%–80.0% |
| 17 | [rel_61](relations/rel_61.md): organizational leadership office in | 12 | 1/0/4 | 0.0330 | 20.0%–100.0% |
| 18 | [rel_80](relations/rel_80.md): athlete plays for team | 15 | 1/4/0 | 0.0412 | 20.0%–20.0% |
| 19 | [rel_193](relations/rel_193.md): defeated opponent | 15 | 5/0/0 | 0.0412 | 100.0%–100.0% |
| 20 | [rel_196](relations/rel_196.md): managerial or leadership office in | 15 | 5/0/0 | 0.0412 | 100.0%–100.0% |

## Ambiguous cases for inspection

- [rel_94__ent_1002__ent_536](relations/rel_94.md): Which named State Department spokesperson is intended, and is Washington a dateline/place rather than that person?
- [rel_22__ent_1028__ent_175](relations/rel_22.md): Does manager mean manager of Pataki’s campaign or organization, and what organizational principal should replace the person argument?
- [rel_138__ent_490__ent_51](relations/rel_138.md): Which full organization name does Taxi stand for in these source sentences?
- [rel_102__ent_34__ent_37](relations/rel_102.md): What full state, party or organization is denoted by Soviet in these leadership descriptions?
- [rel_102__ent_67__ent_69](relations/rel_102.md): Does Bosnian Serb denote the Bosnian Serbs as a group, a specific institution, or an incomplete entity name?
- [rel_61__ent_263__ent_1172](relations/rel_61.md): Which named Republican is the Senate Finance Committee chair/head in these sentences?
- [rel_61__ent_263__ent_486](relations/rel_61.md): Which named Republican is this Finance Committee officeholder, and do all the rows refer to the same person?
- [rel_61__ent_263__ent_1171](relations/rel_61.md): Which named Republican holds or held the House Ways and Means Committee chairmanship here?
- [rel_61__ent_7__ent_488](relations/rel_61.md): Which individual Democrat is the House Armed Services Committee leader in these sentences?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
