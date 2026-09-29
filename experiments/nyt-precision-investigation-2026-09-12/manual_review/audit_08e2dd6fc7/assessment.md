# Manual precision screen: audit_08e2dd6fc7

[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)

**Estimated micro precision: 64.4%–75.2%**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.

Sample counts: 62 supported, 27 incorrect, 11 ambiguous; 100 assessed out of 742 facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.

Macro precision estimate: 62.0%–73.0%.

Conservative 95% finite-population sampling interval for the strict endpoint: **13.1%–94.1%**; for the optimistic endpoint: **18.3%–96.0%**. The envelope 13.1%–96.0% includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.

Exploratory plug-in design SE: 4.7% strict, 3.9% optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.

| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |
|---:|---|---:|---:|---:|---:|
| 1 | [rel_10](relations/rel_10.md): managerial or organizational leader of | 61 | 4/0/1 | 0.0822 | 80.0%–100.0% |
| 2 | [rel_358](relations/rel_358.md): organization based or located in | 47 | 4/1/0 | 0.0633 | 80.0%–80.0% |
| 3 | [rel_55](relations/rel_55.md): managerial or organizational leader of | 47 | 3/0/2 | 0.0633 | 60.0%–100.0% |
| 4 | [rel_113](relations/rel_113.md): directed communication to | 45 | 4/1/0 | 0.0606 | 80.0%–80.0% |
| 5 | [rel_270](relations/rel_270.md): spokesperson for | 63 | 4/1/0 | 0.0849 | 80.0%–80.0% |
| 6 | [rel_141](relations/rel_141.md): analyst at | 44 | 3/2/0 | 0.0593 | 60.0%–60.0% |
| 7 | [rel_340](relations/rel_340.md): lives in | 47 | 3/0/2 | 0.0633 | 60.0%–100.0% |
| 8 | [rel_52](relations/rel_52.md): subsidiary or organizational unit of | 27 | 4/1/0 | 0.0364 | 80.0%–80.0% |
| 9 | [rel_278](relations/rel_278.md): winner or champion of | 31 | 3/2/0 | 0.0418 | 60.0%–60.0% |
| 10 | [rel_354](relations/rel_354.md): defeated opponent | 25 | 4/1/0 | 0.0337 | 80.0%–80.0% |
| 11 | [rel_221](relations/rel_221.md): managerial or organizational leader of | 44 | 4/1/0 | 0.0593 | 80.0%–80.0% |
| 12 | [rel_149](relations/rel_149.md): coach of | 28 | 3/2/0 | 0.0377 | 60.0%–60.0% |
| 13 | [rel_308](relations/rel_308.md): directed communication to | 29 | 3/1/1 | 0.0391 | 60.0%–80.0% |
| 14 | [rel_383](relations/rel_383.md): departed from | 35 | 1/4/0 | 0.0472 | 20.0%–20.0% |
| 15 | [rel_329](relations/rel_329.md): owns | 43 | 3/2/0 | 0.0580 | 60.0%–60.0% |
| 16 | [rel_246](relations/rel_246.md): subsidiary or organizational unit of | 24 | 2/0/3 | 0.0323 | 40.0%–100.0% |
| 17 | [rel_171](relations/rel_171.md): has organizational or political leader | 22 | 5/0/0 | 0.0296 | 100.0%–100.0% |
| 18 | [rel_307](relations/rel_307.md): politically controls | 27 | 1/4/0 | 0.0364 | 20.0%–20.0% |
| 19 | [rel_253](relations/rel_253.md): member of | 24 | 0/3/2 | 0.0323 | 0.0%–40.0% |
| 20 | [rel_351](relations/rel_351.md): economist at | 29 | 4/1/0 | 0.0391 | 80.0%–80.0% |

## Ambiguous cases for inspection

- [rel_10__ent_255__ent_497](relations/rel_10.md): Does Yugoslav denote Yugoslavia, its government, a party or another omitted political body in these rows?
- [rel_55__ent_263__ent_1172](relations/rel_55.md): Which individual does Republican identify, and do the chairmanship and ordinary membership rows refer to that same person?
- [rel_55__ent_30__ent_36](relations/rel_55.md): What body is omitted after Democratic, and is Pelosi its chair rather than simply a Democratic member or activist?
- [rel_340__ent_667__ent_537](relations/rel_340.md): Which person or population does the extracted argument Born identify?
- [rel_340__ent_822__ent_835](relations/rel_340.md): Which person or defined population does American denote, and do the woman and serviceman rows refer to that same entity?
- [rel_308__ent_356__ent_308](relations/rel_308.md): What does Ewing give the Knicks in the gives-to rows: an explicit message/advice or a noncommunicative sporting contribution?
- [rel_246__ent_660__ent_623](relations/rel_246.md): Which San Francisco office or agency is omitted, and is that organization a unit of Foote rather than the city itself?
- [rel_246__ent_843__ent_1104](relations/rel_246.md): Does New York denote a specific BBDO office or agency, and what is its full organizational identity?
- [rel_246__ent_843__ent_421](relations/rel_246.md): What specific New York office or agency is meant, and should it be represented separately from the city?
- [rel_253__ent_815__ent_537](relations/rel_253.md): What is the full complement of Russia joins the United States: membership in an organization or joining it in a particular action?
- [rel_253__ent_819__ent_816](relations/rel_253.md): Do the join/register sentences describe individual Democrats becoming Republican members, or groups cooperating while retaining different party membership?

Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.
