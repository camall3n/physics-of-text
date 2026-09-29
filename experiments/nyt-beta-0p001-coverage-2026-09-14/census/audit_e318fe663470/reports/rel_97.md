# audit_e318fe663470 — rel_97: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 12 supported, 4 incorrect, 1 ambiguous; N=17. Precision 12/17=70.59% to 13/17=76.47%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 19 | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 10 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;element-&gt;nn-&gt;\|nn |
| 2 | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |
| 1 | appos\|-&gt;appos-&gt;person-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;provider-&gt;amod-&gt;\|amod |
| 1 | dep\|-&gt;dep-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | nn\|&lt;-nn&lt;-senator-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-manufacture-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;rcmod-&gt;try-&gt;prep-&gt;on-&gt;pobj-&gt;charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-part-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-announcement-&gt;rcmod-&gt;make-&gt;prep-&gt;after-&gt;pobj-&gt;meeting-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;fact-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_97__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (9)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [851](../raw_map.tsv:851) | Johnson &amp; Johnson | New Brunswick | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [855](../raw_map.tsv:855) | Johnson &amp; Johnson | New Brunswick | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [859](../raw_map.tsv:859) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |
| [860](../raw_map.tsv:860) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;element-&gt;nn-&gt;\|nn |
| [4384](../raw_map.tsv:4384) | Johnson &amp; Johnson | New Brunswick | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4385](../raw_map.tsv:4385) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4388](../raw_map.tsv:4388) | Johnson &amp; Johnson | New Brunswick | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-division-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4392](../raw_map.tsv:4392) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |
| [4393](../raw_map.tsv:4393) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;element-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [851](../raw_map.tsv:851), [855](../raw_map.tsv:855), [859](../raw_map.tsv:859), [860](../raw_map.tsv:860), [4384](../raw_map.tsv:4384), [4385](../raw_map.tsv:4385), [4388](../raw_map.tsv:4388), [4392](../raw_map.tsv:4392), [4393](../raw_map.tsv:4393).


Issue tags: mixed_evidence

### rel_97__ent_547__ent_789

**All observed names:** I.B.M. → Armonk (6)

Ordered IDs: Ent[ent_547] → Ent[ent_789]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [798](../raw_map.tsv:798) | I.B.M. | Armonk | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [800](../raw_map.tsv:800) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [802](../raw_map.tsv:802) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4394](../raw_map.tsv:4394) | I.B.M. | Armonk | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4396](../raw_map.tsv:4396) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4398](../raw_map.tsv:4398) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). I.B.M. → Armonk: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [798](../raw_map.tsv:798), [800](../raw_map.tsv:800), [802](../raw_map.tsv:802), [4394](../raw_map.tsv:4394), [4396](../raw_map.tsv:4396), [4398](../raw_map.tsv:4398).


Issue tags: mixed_evidence

### rel_97__ent_617__ent_654

**All observed names:** Qwest → Denver (5)

Ordered IDs: Ent[ent_617] → Ent[ent_654]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4365](../raw_map.tsv:4365) | Qwest | Denver | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4367](../raw_map.tsv:4367) | Qwest | Denver | appos\|-&gt;appos-&gt;provider-&gt;amod-&gt;\|amod |
| [4368](../raw_map.tsv:4368) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4369](../raw_map.tsv:4369) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;fact-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4372](../raw_map.tsv:4372) | Qwest | Denver | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;rcmod-&gt;try-&gt;prep-&gt;on-&gt;pobj-&gt;charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Qwest → Denver: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [4365](../raw_map.tsv:4365), [4367](../raw_map.tsv:4367), [4368](../raw_map.tsv:4368), [4369](../raw_map.tsv:4369), [4372](../raw_map.tsv:4372).


Issue tags: mixed_evidence

### rel_97__ent_545__ent_787

**All observed names:** Intel → Santa Clara (4)

Ordered IDs: Ent[ent_545] → Ent[ent_787]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [768](../raw_map.tsv:768) | Intel | Santa Clara | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [771](../raw_map.tsv:771) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [4318](../raw_map.tsv:4318) | Intel | Santa Clara | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4321](../raw_map.tsv:4321) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Intel → Santa Clara: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [768](../raw_map.tsv:768), [771](../raw_map.tsv:771), [4318](../raw_map.tsv:4318), [4321](../raw_map.tsv:4321).




### rel_97__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (4)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [818](../raw_map.tsv:818) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [819](../raw_map.tsv:819) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4308](../raw_map.tsv:4308) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4309](../raw_map.tsv:4309) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Motorola → Schaumburg: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [818](../raw_map.tsv:818), [819](../raw_map.tsv:819), [4308](../raw_map.tsv:4308), [4309](../raw_map.tsv:4309).




### rel_97__ent_1206__ent_544

**All observed names:** Microsoft → Redmond (3)

Ordered IDs: Ent[ent_1206] → Ent[ent_544]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [778](../raw_map.tsv:778) | Microsoft | Redmond | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [780](../raw_map.tsv:780) | Microsoft | Redmond | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4334](../raw_map.tsv:4334) | Microsoft | Redmond | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Microsoft → Redmond: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [778](../raw_map.tsv:778), [780](../raw_map.tsv:780), [4334](../raw_map.tsv:4334).




### rel_97__ent_786__ent_1283

**All observed names:** Apple → Cupertino (3)

Ordered IDs: Ent[ent_786] → Ent[ent_1283]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [788](../raw_map.tsv:788) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4344](../raw_map.tsv:4344) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4345](../raw_map.tsv:4345) | Apple | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [788](../raw_map.tsv:788), [4344](../raw_map.tsv:4344), [4345](../raw_map.tsv:4345).




### rel_97__ent_549__ent_675

**All observed names:** MCI → Washington (3)

Ordered IDs: Ent[ent_549] → Ent[ent_675]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [838](../raw_map.tsv:838) | MCI | Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [842](../raw_map.tsv:842) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [846](../raw_map.tsv:846) | MCI | Washington | poss\|&lt;-poss&lt;-announcement-&gt;rcmod-&gt;make-&gt;prep-&gt;after-&gt;pobj-&gt;meeting-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MCI → Washington: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [838](../raw_map.tsv:838), [842](../raw_map.tsv:842), [846](../raw_map.tsv:846).




### rel_97__ent_896__ent_415

**All observed names:** Monsanto → St. Louis (3)

Ordered IDs: Ent[ent_896] → Ent[ent_415]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4374](../raw_map.tsv:4374) | Monsanto | St. Louis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4375](../raw_map.tsv:4375) | Monsanto | St. Louis | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4382](../raw_map.tsv:4382) | Monsanto | St. Louis | nsubj\|&lt;-nsubj&lt;-manufacture-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Monsanto → St. Louis: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [4374](../raw_map.tsv:4374), [4375](../raw_map.tsv:4375), [4382](../raw_map.tsv:4382).


Issue tags: mixed_evidence

### rel_97__ent_306__ent_1283

**All observed names:** Semiconductor Industry Association → Cupertino (2)

Ordered IDs: Ent[ent_306] → Ent[ent_1283]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [848](../raw_map.tsv:848) | Semiconductor Industry Association | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [849](../raw_map.tsv:849) | Semiconductor Industry Association | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Semiconductor Industry Association → Cupertino: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [848](../raw_map.tsv:848), [849](../raw_map.tsv:849).




### rel_97__ent_461__ent_222

**All observed names:** Dataquest → San Jose (2)

Ordered IDs: Ent[ent_461] → Ent[ent_222]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5809](../raw_map.tsv:5809) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7103](../raw_map.tsv:7103) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dataquest → San Jose: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [5809](../raw_map.tsv:5809), [7103](../raw_map.tsv:7103).




### rel_97__ent_299__ent_1439

**All observed names:** Cristyne F. Lategano → Mayor (1)

Ordered IDs: Ent[ent_299] → Ent[ent_1439]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3545](../raw_map.tsv:3545) | Cristyne F. Lategano | Mayor | appos\|-&gt;appos-&gt;person-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Cristyne F. Lategano → Mayor: The rows concern a person/principal, ownership, corporate part-of, or a senator jurisdiction rather than organizational location.

Cited evidence lines: [3545](../raw_map.tsv:3545).




### rel_97__ent_1358__ent_893

**All observed names:** Microsoft → Redmond (1)

Ordered IDs: Ent[ent_1358] → Ent[ent_893]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4336](../raw_map.tsv:4336) | Microsoft | Redmond | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Microsoft → Redmond: A local based-in/headquarters row clearly places the named organization in the stated geographic location.

Cited evidence lines: [4336](../raw_map.tsv:4336).




### rel_97__ent_1190__ent_1238

**All observed names:** Viacom → CBS (1)

Ordered IDs: Ent[ent_1190] → Ent[ent_1238]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5947](../raw_map.tsv:5947) | Viacom | CBS | dep\|-&gt;dep-&gt;own-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Viacom → CBS: The rows concern a person/principal, ownership, corporate part-of, or a senator jurisdiction rather than organizational location.

Cited evidence lines: [5947](../raw_map.tsv:5947).




### rel_97__ent_1068__ent_888

**All observed names:** McCann-Erickson World Group → Interpublic Group of Companies (1)

Ordered IDs: Ent[ent_1068] → Ent[ent_888]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6652](../raw_map.tsv:6652) | McCann-Erickson World Group | Interpublic Group of Companies | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-part-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). McCann-Erickson World Group → Interpublic Group of Companies: The rows concern a person/principal, ownership, corporate part-of, or a senator jurisdiction rather than organizational location.

Cited evidence lines: [6652](../raw_map.tsv:6652).




### rel_97__ent_235__ent_1270

**All observed names:** Hicks → Dallas (1)

Ordered IDs: Ent[ent_235] → Ent[ent_1270]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7416](../raw_map.tsv:7416) | Hicks | Dallas | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Hicks → Dallas: The isolated based-in row uses Hicks without a local company or other organizational identification.

Cited evidence lines: [7416](../raw_map.tsv:7416).

**Review question:** Does Hicks identify the firm rather than a person in this local row?
Issue tags: argument_identity

### rel_97__ent_905__ent_1401

**All observed names:** United States → New York (1)

Ordered IDs: Ent[ent_905] → Ent[ent_1401]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7607](../raw_map.tsv:7607) | United States | New York | nn\|&lt;-nn&lt;-senator-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → New York: The rows concern a person/principal, ownership, corporate part-of, or a senator jurisdiction rather than organizational location.

Cited evidence lines: [7607](../raw_map.tsv:7607).



