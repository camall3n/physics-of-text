# audit_e318fe663470 — rel_93: member of organization

Predicate ID: member_of

Person, country or organization X is or becomes a member of organization, alliance, party or public body Y.

Includes: explicit member/belong/membership; join/accession/entry when organizational membership is established; individual legislators and countries in alliances. Excludes: join a person in an action; geographic entry; event participation; party control of legislature; negotiations or proposed membership alone. Ambiguous unless resolved by case-local evidence: bare join without clear completion or membership meaning; plural party naming individual members rather than the party itself.

Complete census: 2 supported, 5 incorrect, 5 ambiguous; N=12. Precision 2/12=16.67% to 7/12=58.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| 3 | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-need-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-arrive-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-estimate-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-attempt-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-gain-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-counsel-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-security&lt;-nsubj&lt;-depend-&gt;prep-&gt;on-&gt;pobj-&gt;membership-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-service&lt;-nsubj&lt;-tighten-&gt;dobj-&gt;issue-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-staff-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;order-&gt;dobj-&gt;guard-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;sponsor-&gt;prep-&gt;of-&gt;pobj-&gt;bill-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;storage-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_93__ent_1252__ent_810

**All observed names:** Poland → European Union (3)

Ordered IDs: Ent[ent_1252] → Ent[ent_810]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1945](../raw_map.tsv:1945) | Poland | European Union | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [1946](../raw_map.tsv:1946) | Poland | European Union | poss\|&lt;-poss&lt;-security&lt;-nsubj&lt;-depend-&gt;prep-&gt;on-&gt;pobj-&gt;membership-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1951](../raw_map.tsv:1951) | Poland | European Union | dobj\|&lt;-dobj&lt;-need-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Poland → European Union: Explicit institutional membership or entry into the WTO establishes membership in the stated international body.

Cited evidence lines: [1945](../raw_map.tsv:1945), [1946](../raw_map.tsv:1946), [1951](../raw_map.tsv:1951).


Issue tags: mixed_evidence

### rel_93__ent_6__ent_1422

**All observed names:** Bill Clinton → White House (3)

Ordered IDs: Ent[ent_6] → Ent[ent_1422]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2716](../raw_map.tsv:2716) | Bill Clinton | White House | poss\|&lt;-poss&lt;-counsel-&gt;nn-&gt;\|nn |
| [2720](../raw_map.tsv:2720) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [2722](../raw_map.tsv:2722) | Bill Clinton | White House | poss\|&lt;-poss&lt;-staff-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Bill Clinton → White House: Enter White House and associated office/storage/staff wording do not resolve institutional service versus entry into the building.

Cited evidence lines: [2716](../raw_map.tsv:2716), [2720](../raw_map.tsv:2720), [2722](../raw_map.tsv:2722).

**Review question:** Do these rows establish institutional membership rather than physical entry or another person's staff role?
Issue tags: institution_place_ambiguity

### rel_93__ent_251__ent_586

**All observed names:** John F. Kennedy → White House (3)

Ordered IDs: Ent[ent_251] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2748](../raw_map.tsv:2748) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [2751](../raw_map.tsv:2751) | John F. Kennedy | White House | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;storage-&gt;nn-&gt;\|nn |
| [2752](../raw_map.tsv:2752) | John F. Kennedy | White House | rcmod\|-&gt;rcmod-&gt;order-&gt;dobj-&gt;guard-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). John F. Kennedy → White House: Enter White House and associated office/storage/staff wording do not resolve institutional service versus entry into the building.

Cited evidence lines: [2748](../raw_map.tsv:2748), [2751](../raw_map.tsv:2751), [2752](../raw_map.tsv:2752).

**Review question:** Do these rows establish institutional membership rather than physical entry or another person's staff role?
Issue tags: institution_place_ambiguity

### rel_93__ent_197__ent_586

**All observed names:** Ms. Lewinsky → White House (3)

Ordered IDs: Ent[ent_197] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3491](../raw_map.tsv:3491) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [3495](../raw_map.tsv:3495) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-arrive-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6176](../raw_map.tsv:6176) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Ms. Lewinsky → White House: Physical entry/arrival, company-name co-subjects or incidental appositives do not establish institutional membership.

Cited evidence lines: [3491](../raw_map.tsv:3491), [3495](../raw_map.tsv:3495), [6176](../raw_map.tsv:6176).




### rel_93__ent_606__ent_534

**All observed names:** Goldman → Sachs (2)

Ordered IDs: Ent[ent_606] → Ent[ent_534]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [638](../raw_map.tsv:638) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-estimate-&gt;nsubj-&gt;\|nsubj |
| [640](../raw_map.tsv:640) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Goldman → Sachs: Physical entry/arrival, company-name co-subjects or incidental appositives do not establish institutional membership.

Cited evidence lines: [638](../raw_map.tsv:638), [640](../raw_map.tsv:640).




### rel_93__ent_1444__ent_486

**All observed names:** Republican → Finance Committee (2)

Ordered IDs: Ent[ent_1444] → Ent[ent_486]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6283](../raw_map.tsv:6283) | Republican | Finance Committee | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6288](../raw_map.tsv:6288) | Republican | Finance Committee | rcmod\|-&gt;rcmod-&gt;sponsor-&gt;prep-&gt;of-&gt;pobj-&gt;bill-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Republican → Finance Committee: Sit-on-committee wording identifies membership but the person is only an unnamed Republican or Democrat.

Cited evidence lines: [6283](../raw_map.tsv:6283), [6288](../raw_map.tsv:6288).

**Review question:** Which named committee member is intended?
Issue tags: unnamed_person

### rel_93__ent_1412__ent_1351

**All observed names:** China → World Trade Organization (1)

Ordered IDs: Ent[ent_1412] → Ent[ent_1351]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1927](../raw_map.tsv:1927) | China | World Trade Organization | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). China → World Trade Organization: Explicit institutional membership or entry into the WTO establishes membership in the stated international body.

Cited evidence lines: [1927](../raw_map.tsv:1927).




### rel_93__ent_1383__ent_1009

**All observed names:** White House → Ari Fleischer (1)

Ordered IDs: Ent[ent_1383] → Ent[ent_1009]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5424](../raw_map.tsv:5424) | White House | Ari Fleischer | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-attempt-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). White House → Ari Fleischer: Physical entry/arrival, company-name co-subjects or incidental appositives do not establish institutional membership.

Cited evidence lines: [5424](../raw_map.tsv:5424).




### rel_93__ent_263__ent_244

**All observed names:** Republican → Judiciary Committee (1)

Ordered IDs: Ent[ent_263] → Ent[ent_244]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6275](../raw_map.tsv:6275) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Republican → Judiciary Committee: Sit-on-committee wording identifies membership but the person is only an unnamed Republican or Democrat.

Cited evidence lines: [6275](../raw_map.tsv:6275).

**Review question:** Which named committee member is intended?
Issue tags: unnamed_person

### rel_93__ent_7__ent_243

**All observed names:** Democrat → Armed Services Committee (1)

Ordered IDs: Ent[ent_7] → Ent[ent_243]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6303](../raw_map.tsv:6303) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Democrat → Armed Services Committee: Sit-on-committee wording identifies membership but the person is only an unnamed Republican or Democrat.

Cited evidence lines: [6303](../raw_map.tsv:6303).

**Review question:** Which named committee member is intended?
Issue tags: unnamed_person

### rel_93__ent_820__ent_941

**All observed names:** Israel → Yitzhak Rabin (1)

Ordered IDs: Ent[ent_820] → Ent[ent_941]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7059](../raw_map.tsv:7059) | Israel | Yitzhak Rabin | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-gain-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Israel → Yitzhak Rabin: Physical entry/arrival, company-name co-subjects or incidental appositives do not establish institutional membership.

Cited evidence lines: [7059](../raw_map.tsv:7059).




### rel_93__ent_1421__ent_941

**All observed names:** Israel → Yitzhak Rabin (1)

Ordered IDs: Ent[ent_1421] → Ent[ent_941]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7063](../raw_map.tsv:7063) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-service&lt;-nsubj&lt;-tighten-&gt;dobj-&gt;issue-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Israel → Yitzhak Rabin: Physical entry/arrival, company-name co-subjects or incidental appositives do not establish institutional membership.

Cited evidence lines: [7063](../raw_map.tsv:7063).



