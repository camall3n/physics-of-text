# audit_e318fe663470 — rel_65: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 9 supported, 1 incorrect, 2 ambiguous; N=12. Precision 9/12=75.00% to 11/12=91.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 12 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 9 | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 7 | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 7 | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-broadcast-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-company-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-strike-&gt;prep-&gt;with-&gt;pobj-&gt;shareholder-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-headquarters&lt;-nsubjpass&lt;-situate-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_65__ent_1001__ent_307

**All observed names:** Hewlett-Packard → Palo Alto (5)

Ordered IDs: Ent[ent_1001] → Ent[ent_307]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [829](../raw_map.tsv:829) | Hewlett-Packard | Palo Alto | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [830](../raw_map.tsv:830) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [831](../raw_map.tsv:831) | Hewlett-Packard | Palo Alto | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [834](../raw_map.tsv:834) | Hewlett-Packard | Palo Alto | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [836](../raw_map.tsv:836) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Hewlett-Packard → Palo Alto: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [829](../raw_map.tsv:829), [830](../raw_map.tsv:830), [831](../raw_map.tsv:831), [834](../raw_map.tsv:834), [836](../raw_map.tsv:836).


Issue tags: mixed_evidence

### rel_65__ent_549__ent_1002

**All observed names:** MCI → Washington (5)

Ordered IDs: Ent[ent_549] → Ent[ent_1002]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [839](../raw_map.tsv:839) | MCI | Washington | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [840](../raw_map.tsv:840) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [841](../raw_map.tsv:841) | MCI | Washington | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [844](../raw_map.tsv:844) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters&lt;-nsubjpass&lt;-situate-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [847](../raw_map.tsv:847) | MCI | Washington | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MCI → Washington: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [839](../raw_map.tsv:839), [840](../raw_map.tsv:840), [841](../raw_map.tsv:841), [844](../raw_map.tsv:844), [847](../raw_map.tsv:847).




### rel_65__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (5)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [852](../raw_map.tsv:852) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [853](../raw_map.tsv:853) | Johnson &amp; Johnson | New Brunswick | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [858](../raw_map.tsv:858) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4386](../raw_map.tsv:4386) | Johnson &amp; Johnson | New Brunswick | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4391](../raw_map.tsv:4391) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [852](../raw_map.tsv:852), [853](../raw_map.tsv:853), [858](../raw_map.tsv:858), [4386](../raw_map.tsv:4386), [4391](../raw_map.tsv:4391).




### rel_65__ent_545__ent_787

**All observed names:** Intel → Santa Clara (4)

Ordered IDs: Ent[ent_545] → Ent[ent_787]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [769](../raw_map.tsv:769) | Intel | Santa Clara | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [770](../raw_map.tsv:770) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4319](../raw_map.tsv:4319) | Intel | Santa Clara | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4320](../raw_map.tsv:4320) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Intel → Santa Clara: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [769](../raw_map.tsv:769), [770](../raw_map.tsv:770), [4319](../raw_map.tsv:4319), [4320](../raw_map.tsv:4320).




### rel_65__ent_786__ent_1283

**All observed names:** Apple → Cupertino (4)

Ordered IDs: Ent[ent_786] → Ent[ent_1283]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [789](../raw_map.tsv:789) | Apple | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [790](../raw_map.tsv:790) | Apple | Cupertino | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [791](../raw_map.tsv:791) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4347](../raw_map.tsv:4347) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [789](../raw_map.tsv:789), [790](../raw_map.tsv:790), [791](../raw_map.tsv:791), [4347](../raw_map.tsv:4347).




### rel_65__ent_893__ent_897

**All observed names:** Guidant → Indianapolis (4)

Ordered IDs: Ent[ent_893] → Ent[ent_897]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4328](../raw_map.tsv:4328) | Guidant | Indianapolis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4330](../raw_map.tsv:4330) | Guidant | Indianapolis | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4331](../raw_map.tsv:4331) | Guidant | Indianapolis | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4333](../raw_map.tsv:4333) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Guidant → Indianapolis: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [4328](../raw_map.tsv:4328), [4330](../raw_map.tsv:4330), [4331](../raw_map.tsv:4331), [4333](../raw_map.tsv:4333).


Issue tags: mixed_evidence

### rel_65__ent_617__ent_654

**All observed names:** Qwest → Denver (4)

Ordered IDs: Ent[ent_617] → Ent[ent_654]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4364](../raw_map.tsv:4364) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4366](../raw_map.tsv:4366) | Qwest | Denver | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4370](../raw_map.tsv:4370) | Qwest | Denver | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4373](../raw_map.tsv:4373) | Qwest | Denver | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Qwest → Denver: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [4364](../raw_map.tsv:4364), [4366](../raw_map.tsv:4366), [4370](../raw_map.tsv:4370), [4373](../raw_map.tsv:4373).


Issue tags: mixed_evidence

### rel_65__ent_461__ent_222

**All observed names:** Dataquest → San Jose (4)

Ordered IDs: Ent[ent_461] → Ent[ent_222]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5808](../raw_map.tsv:5808) | Dataquest | San Jose | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5812](../raw_map.tsv:5812) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7104](../raw_map.tsv:7104) | Dataquest | San Jose | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7106](../raw_map.tsv:7106) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dataquest → San Jose: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [5808](../raw_map.tsv:5808), [5812](../raw_map.tsv:5812), [7104](../raw_map.tsv:7104), [7106](../raw_map.tsv:7106).




### rel_65__ent_1000__ent_304

**All observed names:** Wal-Mart → Bentonville (3)

Ordered IDs: Ent[ent_1000] → Ent[ent_304]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [809](../raw_map.tsv:809) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4355](../raw_map.tsv:4355) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4356](../raw_map.tsv:4356) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: Local based-in/headquarters/company-location rows clearly establish the organizational location.

Cited evidence lines: [809](../raw_map.tsv:809), [4355](../raw_map.tsv:4355), [4356](../raw_map.tsv:4356).




### rel_65__ent_293__ent_10

**All observed names:** Bertelsmann → German (2)

Ordered IDs: Ent[ent_293] → Ent[ent_10]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3604](../raw_map.tsv:3604) | Bertelsmann | German | nsubj\|&lt;-nsubj&lt;-strike-&gt;prep-&gt;with-&gt;pobj-&gt;shareholder-&gt;amod-&gt;\|amod |
| [3608](../raw_map.tsv:3608) | Bertelsmann | German | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Bertelsmann → German: German is a nationality or truncated country argument, not an unambiguous geographic place even where based-in is extracted.

Cited evidence lines: [3604](../raw_map.tsv:3604), [3608](../raw_map.tsv:3608).

**Review question:** Does the source identify Germany as a physical location, or only German affiliation?
Issue tags: argument_identity

### rel_65__ent_293__ent_522

**All observed names:** Bertelsmann → German (1)

Ordered IDs: Ent[ent_293] → Ent[ent_522]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3605](../raw_map.tsv:3605) | Bertelsmann | German | nsubj\|&lt;-nsubj&lt;-company-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Bertelsmann → German: German is a nationality or truncated country argument, not an unambiguous geographic place even where based-in is extracted.

Cited evidence lines: [3605](../raw_map.tsv:3605).

**Review question:** Does the source identify Germany as a physical location, or only German affiliation?
Issue tags: argument_identity

### rel_65__ent_1238__ent_850

**All observed names:** CBS → Super Bowl (1)

Ordered IDs: Ent[ent_1238] → Ent[ent_850]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4956](../raw_map.tsv:4956) | CBS | Super Bowl | nn\|&lt;-nn&lt;-broadcast-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). CBS → Super Bowl: Broadcasting a sporting event does not locate the broadcaster at a geographic place.

Cited evidence lines: [4956](../raw_map.tsv:4956).



