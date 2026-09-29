# audit_dcb746fa83d6 — rel_4: departed from

Predicate ID: departed_from

Person, group or organization X physically leaves or withdraws from geographic place Y.

Includes: leave/withdraw/pull out from Y; historical physical departure. Excludes: arrival/return to Y; residence alone; leaving a job or team as an institution without geography. Ambiguous unless resolved by case-local evidence: place versus institution as source; explicitly conditional departure.

Complete census: 4 supported, 1 incorrect, 0 ambiguous; N=5. Precision 4/5=80.00% to 4/5=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| 1 | dobj\|&lt;-dobj&lt;-enter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-move-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-welcome-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;theater-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-operation-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;confirm-&gt;nsubjpass-&gt;death-&gt;prep-&gt;in-&gt;pobj-&gt;war-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_4__ent_669__ent_492

**All observed names:** Americans → Iraq (5)

Ordered IDs: Ent[ent_669] → Ent[ent_492]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8142](../raw_map.tsv:8142) | Americans | Iraq | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8144](../raw_map.tsv:8144) | Americans | Iraq | rcmod\|-&gt;rcmod-&gt;confirm-&gt;nsubjpass-&gt;death-&gt;prep-&gt;in-&gt;pobj-&gt;war-&gt;nn-&gt;\|nn |
| [8145](../raw_map.tsv:8145) | Americans | Iraq | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;theater-&gt;nn-&gt;\|nn |
| [8147](../raw_map.tsv:8147) | Americans | Iraq | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [8148](../raw_map.tsv:8148) | Americans | Iraq | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Americans → Iraq: An unqualified leave-location row establishes geographic departure, including organizational or group departure.

Cited evidence lines: [8142](../raw_map.tsv:8142), [8144](../raw_map.tsv:8144), [8145](../raw_map.tsv:8145), [8147](../raw_map.tsv:8147), [8148](../raw_map.tsv:8148).


Issue tags: mixed_evidence

### rel_4__ent_1356__ent_1274

**All observed names:** Israel → Gaza (3)

Ordered IDs: Ent[ent_1356] → Ent[ent_1274]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4106](../raw_map.tsv:4106) | Israel | Gaza | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [4109](../raw_map.tsv:4109) | Israel | Gaza | dobj\|&lt;-dobj&lt;-enter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4112](../raw_map.tsv:4112) | Israel | Gaza | poss\|&lt;-poss&lt;-operation-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Israel → Gaza: An unqualified leave-location row establishes geographic departure, including organizational or group departure.

Cited evidence lines: [4106](../raw_map.tsv:4106), [4109](../raw_map.tsv:4109), [4112](../raw_map.tsv:4112).


Issue tags: mixed_evidence, broad_predicate

### rel_4__ent_778__ent_843

**All observed names:** Yankees → New York (2)

Ordered IDs: Ent[ent_778] → Ent[ent_843]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5199](../raw_map.tsv:5199) | Yankees | New York | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [5202](../raw_map.tsv:5202) | Yankees | New York | dobj\|&lt;-dobj&lt;-move-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankees → New York: An unqualified leave-location row establishes geographic departure, including organizational or group departure.

Cited evidence lines: [5199](../raw_map.tsv:5199), [5202](../raw_map.tsv:5202).


Issue tags: mixed_evidence, broad_predicate

### rel_4__ent_791__ent_1103

**All observed names:** Soviets → Afghanistan (1)

Ordered IDs: Ent[ent_791] → Ent[ent_1103]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4115](../raw_map.tsv:4115) | Soviets | Afghanistan | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Soviets → Afghanistan: An unqualified leave-location row establishes geographic departure, including organizational or group departure.

Cited evidence lines: [4115](../raw_map.tsv:4115).




### rel_4__ent_1382__ent_1325

**All observed names:** Democrats → Clinton (1)

Ordered IDs: Ent[ent_1382] → Ent[ent_1325]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7582](../raw_map.tsv:7582) | Democrats | Clinton | nsubj\|&lt;-nsubj&lt;-welcome-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Democrats → Clinton: Welcoming a person does not establish geographic departure.

Cited evidence lines: [7582](../raw_map.tsv:7582).



