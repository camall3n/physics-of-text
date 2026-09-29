# audit_dcb746fa83d6 — rel_47: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 11 supported, 1 incorrect, 3 ambiguous; N=15. Precision 11/15=73.33% to 14/15=93.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 13 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 8 | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 7 | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| 3 | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-company-&gt;amod-&gt;\|amod |
| 2 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;office-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-wagering-&gt;partmod-&gt;spend-&gt;advmod-&gt;significantly-&gt;dep-&gt;than-&gt;pobj-&gt;concern-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-loss-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;make-&gt;prep-&gt;in-&gt;pobj-&gt;interview-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;percent-&gt;partmod-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;government-&gt;amod-&gt;\|amod |

## Every evaluated fact

### rel_47__ent_461__ent_222

**All observed names:** Dataquest → San Jose (6)

Ordered IDs: Ent[ent_461] → Ent[ent_222]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5808](../raw_map.tsv:5808) | Dataquest | San Jose | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5810](../raw_map.tsv:5810) | Dataquest | San Jose | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5812](../raw_map.tsv:5812) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7102](../raw_map.tsv:7102) | Dataquest | San Jose | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7104](../raw_map.tsv:7104) | Dataquest | San Jose | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7106](../raw_map.tsv:7106) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dataquest → San Jose: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [5808](../raw_map.tsv:5808), [5810](../raw_map.tsv:5810), [5812](../raw_map.tsv:5812), [7102](../raw_map.tsv:7102), [7104](../raw_map.tsv:7104), [7106](../raw_map.tsv:7106).




### rel_47__ent_1000__ent_304

**All observed names:** Wal-Mart → Bentonville (5)

Ordered IDs: Ent[ent_1000] → Ent[ent_304]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [814](../raw_map.tsv:814) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [816](../raw_map.tsv:816) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4355](../raw_map.tsv:4355) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4360](../raw_map.tsv:4360) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;know-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4362](../raw_map.tsv:4362) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [814](../raw_map.tsv:814), [816](../raw_map.tsv:816), [4355](../raw_map.tsv:4355), [4360](../raw_map.tsv:4360), [4362](../raw_map.tsv:4362).


Issue tags: mixed_evidence

### rel_47__ent_1001__ent_307

**All observed names:** Hewlett-Packard → Palo Alto (5)

Ordered IDs: Ent[ent_1001] → Ent[ent_307]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [829](../raw_map.tsv:829) | Hewlett-Packard | Palo Alto | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [831](../raw_map.tsv:831) | Hewlett-Packard | Palo Alto | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [834](../raw_map.tsv:834) | Hewlett-Packard | Palo Alto | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [835](../raw_map.tsv:835) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [836](../raw_map.tsv:836) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Hewlett-Packard → Palo Alto: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [829](../raw_map.tsv:829), [831](../raw_map.tsv:831), [834](../raw_map.tsv:834), [835](../raw_map.tsv:835), [836](../raw_map.tsv:836).


Issue tags: mixed_evidence

### rel_47__ent_655__ent_897

**All observed names:** Guidant → Indianapolis (5)

Ordered IDs: Ent[ent_655] → Ent[ent_897]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4328](../raw_map.tsv:4328) | Guidant | Indianapolis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4330](../raw_map.tsv:4330) | Guidant | Indianapolis | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4331](../raw_map.tsv:4331) | Guidant | Indianapolis | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4332](../raw_map.tsv:4332) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4333](../raw_map.tsv:4333) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Guidant → Indianapolis: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [4328](../raw_map.tsv:4328), [4330](../raw_map.tsv:4330), [4331](../raw_map.tsv:4331), [4332](../raw_map.tsv:4332), [4333](../raw_map.tsv:4333).


Issue tags: mixed_evidence

### rel_47__ent_14__ent_38

**All observed names:** Cnooc → Chinese (4)

Ordered IDs: Ent[ent_14] → Ent[ent_38]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3668](../raw_map.tsv:3668) | Cnooc | Chinese | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3669](../raw_map.tsv:3669) | Cnooc | Chinese | rcmod\|-&gt;rcmod-&gt;percent-&gt;partmod-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;government-&gt;amod-&gt;\|amod |
| [3674](../raw_map.tsv:3674) | Cnooc | Chinese | nsubj\|&lt;-nsubj&lt;-wagering-&gt;partmod-&gt;spend-&gt;advmod-&gt;significantly-&gt;dep-&gt;than-&gt;pobj-&gt;concern-&gt;amod-&gt;\|amod |
| [3677](../raw_map.tsv:3677) | Cnooc | Chinese | nsubj\|&lt;-nsubj&lt;-company-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Cnooc → Chinese: The place argument is only a national adjective; it does not unambiguously identify a geographic location.

Cited evidence lines: [3668](../raw_map.tsv:3668), [3669](../raw_map.tsv:3669), [3674](../raw_map.tsv:3674), [3677](../raw_map.tsv:3677).

**Review question:** Is the intended geographic country China/Germany, and is the evidence location rather than nationality?
Issue tags: argument_identity

### rel_47__ent_786__ent_305

**All observed names:** Apple → Cupertino (3)

Ordered IDs: Ent[ent_786] → Ent[ent_305]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [789](../raw_map.tsv:789) | Apple | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [791](../raw_map.tsv:791) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4347](../raw_map.tsv:4347) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [789](../raw_map.tsv:789), [791](../raw_map.tsv:791), [4347](../raw_map.tsv:4347).




### rel_47__ent_549__ent_1002

**All observed names:** MCI → Washington (3)

Ordered IDs: Ent[ent_549] → Ent[ent_1002]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [839](../raw_map.tsv:839) | MCI | Washington | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [841](../raw_map.tsv:841) | MCI | Washington | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [847](../raw_map.tsv:847) | MCI | Washington | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MCI → Washington: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [839](../raw_map.tsv:839), [841](../raw_map.tsv:841), [847](../raw_map.tsv:847).




### rel_47__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (3)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [858](../raw_map.tsv:858) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4385](../raw_map.tsv:4385) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4391](../raw_map.tsv:4391) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [858](../raw_map.tsv:858), [4385](../raw_map.tsv:4385), [4391](../raw_map.tsv:4391).




### rel_47__ent_463__ent_440

**All observed names:** T. Rowe Price → Baltimore (3)

Ordered IDs: Ent[ent_463] → Ent[ent_440]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5825](../raw_map.tsv:5825) | T. Rowe Price | Baltimore | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [5826](../raw_map.tsv:5826) | T. Rowe Price | Baltimore | appos\|-&gt;appos-&gt;manager-&gt;amod-&gt;\|amod |
| [5828](../raw_map.tsv:5828) | T. Rowe Price | Baltimore | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). T. Rowe Price → Baltimore: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [5825](../raw_map.tsv:5825), [5826](../raw_map.tsv:5826), [5828](../raw_map.tsv:5828).


Issue tags: mixed_evidence

### rel_47__ent_1078__ent_429

**All observed names:** Exhibitor Relations → Los Angeles (3)

Ordered IDs: Ent[ent_1078] → Ent[ent_429]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6819](../raw_map.tsv:6819) | Exhibitor Relations | Los Angeles | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [6820](../raw_map.tsv:6820) | Exhibitor Relations | Los Angeles | appos\|-&gt;appos-&gt;office-&gt;nn-&gt;\|nn |
| [6823](../raw_map.tsv:6823) | Exhibitor Relations | Los Angeles | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Exhibitor Relations → Los Angeles: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [6819](../raw_map.tsv:6819), [6820](../raw_map.tsv:6820), [6823](../raw_map.tsv:6823).


Issue tags: mixed_evidence

### rel_47__ent_539__ent_173

**All observed names:** Hicks → Dallas (3)

Ordered IDs: Ent[ent_539] → Ent[ent_173]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7414](../raw_map.tsv:7414) | Hicks | Dallas | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |
| [7415](../raw_map.tsv:7415) | Hicks | Dallas | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7419](../raw_map.tsv:7419) | Hicks | Dallas | rcmod\|-&gt;rcmod-&gt;make-&gt;prep-&gt;in-&gt;pobj-&gt;interview-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Hicks → Dallas: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [7414](../raw_map.tsv:7414), [7415](../raw_map.tsv:7415), [7419](../raw_map.tsv:7419).


Issue tags: mixed_evidence

### rel_47__ent_547__ent_1262

**All observed names:** I.B.M. → Armonk (2)

Ordered IDs: Ent[ent_547] → Ent[ent_1262]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [806](../raw_map.tsv:806) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4402](../raw_map.tsv:4402) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). I.B.M. → Armonk: The sole have-working-in path omits who or what is working and does not clearly establish an organizational office or base.

Cited evidence lines: [806](../raw_map.tsv:806), [4402](../raw_map.tsv:4402).

**Review question:** Does the omitted working subject establish an IBM office or physical organizational site in Armonk?
Issue tags: missing_object

### rel_47__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (2)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [819](../raw_map.tsv:819) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4309](../raw_map.tsv:4309) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Motorola → Schaumburg: A local based-in, headquarters, office, or explicit organizational location row identifies this place.

Cited evidence lines: [819](../raw_map.tsv:819), [4309](../raw_map.tsv:4309).




### rel_47__ent_293__ent_10

**All observed names:** Bertelsmann → German (2)

Ordered IDs: Ent[ent_293] → Ent[ent_10]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3605](../raw_map.tsv:3605) | Bertelsmann | German | nsubj\|&lt;-nsubj&lt;-company-&gt;amod-&gt;\|amod |
| [3608](../raw_map.tsv:3608) | Bertelsmann | German | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Bertelsmann → German: The place argument is only a national adjective; it does not unambiguously identify a geographic location.

Cited evidence lines: [3605](../raw_map.tsv:3605), [3608](../raw_map.tsv:3608).

**Review question:** Is the intended geographic country China/Germany, and is the evidence location rather than nationality?
Issue tags: argument_identity

### rel_47__ent_400__ent_1340

**All observed names:** Jets → Giants Stadium (1)

Ordered IDs: Ent[ent_400] → Ent[ent_1340]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4847](../raw_map.tsv:4847) | Jets | Giants Stadium | poss\|&lt;-poss&lt;-loss-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Jets → Giants Stadium: A team loss at a stadium is an event location, not organizational location.

Cited evidence lines: [4847](../raw_map.tsv:4847).



