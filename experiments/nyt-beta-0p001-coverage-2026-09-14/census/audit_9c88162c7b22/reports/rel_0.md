# audit_9c88162c7b22 — rel_0: departed from

Predicate ID: departed_from

Person, group or organization X physically leaves or withdraws from geographic place Y.

Includes: leave/withdraw/pull out from Y; historical physical departure. Excludes: arrival/return to Y; residence alone; leaving a job or team as an institution without geography. Ambiguous unless resolved by case-local evidence: place versus institution as source; explicitly conditional departure.

Complete census: 3 supported, 1 incorrect, 0 ambiguous; N=4. Precision 3/4=75.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| 4 | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-fight-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-complete-&gt;dobj-&gt;withdrawal-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-war-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;province-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;province-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;region-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;make-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;people-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;make-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;population-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_0__ent_235__ent_477

**All observed names:** Albanians → Kosovo (7)

Ordered IDs: Ent[ent_235] → Ent[ent_477]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6105](../raw_map.tsv:6105) | Albanians | Kosovo | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;region-&gt;nn-&gt;\|nn |
| [6106](../raw_map.tsv:6106) | Albanians | Kosovo | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6108](../raw_map.tsv:6108) | Albanians | Kosovo | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;province-&gt;nn-&gt;\|nn |
| [6109](../raw_map.tsv:6109) | Albanians | Kosovo | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;province-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6111](../raw_map.tsv:6111) | Albanians | Kosovo | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6112](../raw_map.tsv:6112) | Albanians | Kosovo | rcmod\|-&gt;rcmod-&gt;make-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;people-&gt;poss-&gt;\|poss |
| [6114](../raw_map.tsv:6114) | Albanians | Kosovo | rcmod\|-&gt;rcmod-&gt;make-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;population-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Albanians → Kosovo: Being driven out/from or completing withdrawal establishes physical departure from the territory.

Cited evidence lines: [6105](../raw_map.tsv:6105), [6106](../raw_map.tsv:6106), [6108](../raw_map.tsv:6108), [6109](../raw_map.tsv:6109), [6111](../raw_map.tsv:6111), [6112](../raw_map.tsv:6112), [6114](../raw_map.tsv:6114).


Issue tags: mixed_evidence

### rel_0__ent_492__ent_648

**All observed names:** Iraq → Kuwait (6)

Ordered IDs: Ent[ent_492] → Ent[ent_648]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4025](../raw_map.tsv:4025) | Iraq | Kuwait | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [4029](../raw_map.tsv:4029) | Iraq | Kuwait | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4032](../raw_map.tsv:4032) | Iraq | Kuwait | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6417](../raw_map.tsv:6417) | Iraq | Kuwait | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [6421](../raw_map.tsv:6421) | Iraq | Kuwait | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6424](../raw_map.tsv:6424) | Iraq | Kuwait | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Iraq → Kuwait: Being driven out/from or completing withdrawal establishes physical departure from the territory.

Cited evidence lines: [4025](../raw_map.tsv:4025), [4029](../raw_map.tsv:4029), [4032](../raw_map.tsv:4032), [6417](../raw_map.tsv:6417), [6421](../raw_map.tsv:6421), [6424](../raw_map.tsv:6424).


Issue tags: mixed_evidence

### rel_0__ent_408__ent_1103

**All observed names:** Soviets → Afghanistan (5)

Ordered IDs: Ent[ent_408] → Ent[ent_1103]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4114](../raw_map.tsv:4114) | Soviets | Afghanistan | dobj\|&lt;-dobj&lt;-fight-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4117](../raw_map.tsv:4117) | Soviets | Afghanistan | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [4118](../raw_map.tsv:4118) | Soviets | Afghanistan | nsubj\|&lt;-nsubj&lt;-complete-&gt;dobj-&gt;withdrawal-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4119](../raw_map.tsv:4119) | Soviets | Afghanistan | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-war-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4122](../raw_map.tsv:4122) | Soviets | Afghanistan | dobj\|&lt;-dobj&lt;-drive-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Soviets → Afghanistan: Being driven out/from or completing withdrawal establishes physical departure from the territory.

Cited evidence lines: [4114](../raw_map.tsv:4114), [4117](../raw_map.tsv:4117), [4118](../raw_map.tsv:4118), [4119](../raw_map.tsv:4119), [4122](../raw_map.tsv:4122).


Issue tags: mixed_evidence

### rel_0__ent_537__ent_492

**All observed names:** United States → Iraq (4)

Ordered IDs: Ent[ent_537] → Ent[ent_492]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2763](../raw_map.tsv:2763) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [2772](../raw_map.tsv:2772) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4064](../raw_map.tsv:4064) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [4073](../raw_map.tsv:4073) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Iraq: Invasion and having something in Iraq do not establish departure from Iraq.

Cited evidence lines: [2763](../raw_map.tsv:2763), [2772](../raw_map.tsv:2772), [4064](../raw_map.tsv:4064), [4073](../raw_map.tsv:4073).


Issue tags: wrong_direction
