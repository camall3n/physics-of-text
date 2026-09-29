# audit_e318fe663470 — rel_9: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 2 supported, 5 incorrect, 2 ambiguous; N=9. Precision 2/9=22.22% to 4/9=44.44%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 5 | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 4 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-request-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-engineer-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-manager-&gt;rcmod-&gt;replace-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-plot-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-talk-&gt;prep-&gt;to-&gt;pobj-&gt;politician-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-begin-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-agency-&gt;dep-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;court-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_9__ent_157__ent_1002

**All observed names:** Mr. Bush → Washington (9); Bush → Washington (1)

Ordered IDs: Ent[ent_157] → Ent[ent_1002]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4096](../raw_map.tsv:4096) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4100](../raw_map.tsv:4100) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4103](../raw_map.tsv:4103) | Mr. Bush | Washington | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5238](../raw_map.tsv:5238) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5242](../raw_map.tsv:5242) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5245](../raw_map.tsv:5245) | Mr. Bush | Washington | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5251](../raw_map.tsv:5251) | Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7343](../raw_map.tsv:7343) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7347](../raw_map.tsv:7347) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7350](../raw_map.tsv:7350) | Mr. Bush | Washington | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Washington; Bush → Washington: The complete evidence concerns a person's office/travel, an engineer's residence, an inverse office-parent attachment or replacing a manager, not the stated organizational location.

Cited evidence lines: [4096](../raw_map.tsv:4096), [4100](../raw_map.tsv:4100), [4103](../raw_map.tsv:4103), [5238](../raw_map.tsv:5238), [5242](../raw_map.tsv:5242), [5245](../raw_map.tsv:5245), [5251](../raw_map.tsv:5251), [7343](../raw_map.tsv:7343), [7347](../raw_map.tsv:7347), [7350](../raw_map.tsv:7350).




### rel_9__ent_684__ent_1277

**All observed names:** Walter O'Malley → Los Angeles (5)

Ordered IDs: Ent[ent_684] → Ent[ent_1277]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4860](../raw_map.tsv:4860) | Walter O'Malley | Los Angeles | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4863](../raw_map.tsv:4863) | Walter O'Malley | Los Angeles | nsubj\|&lt;-nsubj&lt;-talk-&gt;prep-&gt;to-&gt;pobj-&gt;politician-&gt;nn-&gt;\|nn |
| [4864](../raw_map.tsv:4864) | Walter O'Malley | Los Angeles | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4867](../raw_map.tsv:4867) | Walter O'Malley | Los Angeles | rcmod\|-&gt;rcmod-&gt;court-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [4869](../raw_map.tsv:4869) | Walter O'Malley | Los Angeles | nsubj\|&lt;-nsubj&lt;-plot-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Walter O'Malley → Los Angeles: The complete evidence concerns a person's office/travel, an engineer's residence, an inverse office-parent attachment or replacing a manager, not the stated organizational location.

Cited evidence lines: [4860](../raw_map.tsv:4860), [4863](../raw_map.tsv:4863), [4864](../raw_map.tsv:4864), [4867](../raw_map.tsv:4867), [4869](../raw_map.tsv:4869).




### rel_9__ent_786__ent_1283

**All observed names:** Apple → Cupertino (4)

Ordered IDs: Ent[ent_786] → Ent[ent_1283]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [795](../raw_map.tsv:795) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [797](../raw_map.tsv:797) | Apple | Cupertino | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4351](../raw_map.tsv:4351) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4353](../raw_map.tsv:4353) | Apple | Cupertino | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: Local office/headquarters or organizational relocation with begin-at evidence locates the institution in the stated place.

Cited evidence lines: [795](../raw_map.tsv:795), [797](../raw_map.tsv:797), [4351](../raw_map.tsv:4351), [4353](../raw_map.tsv:4353).




### rel_9__ent_545__ent_787

**All observed names:** Intel → Santa Clara (2)

Ordered IDs: Ent[ent_545] → Ent[ent_787]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [776](../raw_map.tsv:776) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-request-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4326](../raw_map.tsv:4326) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-request-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Intel → Santa Clara: The based-in modifier is attached through a request-by construction, leaving organization versus request attachment unclear.

Cited evidence lines: [776](../raw_map.tsv:776), [4326](../raw_map.tsv:4326).

**Review question:** Is Intel itself described as based in Santa Clara?
Issue tags: attachment

### rel_9__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (2)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [823](../raw_map.tsv:823) | Motorola | Schaumburg | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-engineer-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4313](../raw_map.tsv:4313) | Motorola | Schaumburg | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-engineer-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Motorola → Schaumburg: The complete evidence concerns a person's office/travel, an engineer's residence, an inverse office-parent attachment or replacing a manager, not the stated organizational location.

Cited evidence lines: [823](../raw_map.tsv:823), [4313](../raw_map.tsv:4313).




### rel_9__ent_1224__ent_1180

**All observed names:** Film Forum → West Houston Street (2)

Ordered IDs: Ent[ent_1224] → Ent[ent_1180]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6218](../raw_map.tsv:6218) | Film Forum | West Houston Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-begin-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6221](../raw_map.tsv:6221) | Film Forum | West Houston Street | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Film Forum → West Houston Street: Local office/headquarters or organizational relocation with begin-at evidence locates the institution in the stated place.

Cited evidence lines: [6218](../raw_map.tsv:6218), [6221](../raw_map.tsv:6221).




### rel_9__ent_528__ent_1218

**All observed names:** New York → DDB Worldwide (1)

Ordered IDs: Ent[ent_528] → Ent[ent_1218]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4179](../raw_map.tsv:4179) | New York | DDB Worldwide | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-agency-&gt;dep-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). New York → DDB Worldwide: The complete evidence concerns a person's office/travel, an engineer's residence, an inverse office-parent attachment or replacing a manager, not the stated organizational location.

Cited evidence lines: [4179](../raw_map.tsv:4179).




### rel_9__ent_12__ent_682

**All observed names:** Yankees → New Jersey (1)

Ordered IDs: Ent[ent_12] → Ent[ent_682]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4831](../raw_map.tsv:4831) | Yankees | New Jersey | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Yankees → New Jersey: The isolated move-to row does not resolve proposed movement versus established organizational location.

Cited evidence lines: [4831](../raw_map.tsv:4831).

**Review question:** Does this row establish the Yankees' location or merely a proposed move?
Issue tags: modality

### rel_9__ent_1049__ent_15

**All observed names:** Joe Morgan → John McNamara (1)

Ordered IDs: Ent[ent_1049] → Ent[ent_15]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5900](../raw_map.tsv:5900) | Joe Morgan | John McNamara | appos\|&lt;-appos&lt;-manager-&gt;rcmod-&gt;replace-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Joe Morgan → John McNamara: The complete evidence concerns a person's office/travel, an engineer's residence, an inverse office-parent attachment or replacing a manager, not the stated organizational location.

Cited evidence lines: [5900](../raw_map.tsv:5900).



