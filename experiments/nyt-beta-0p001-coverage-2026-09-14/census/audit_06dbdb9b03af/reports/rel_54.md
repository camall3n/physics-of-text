# audit_06dbdb9b03af — rel_54: departed from

Predicate ID: departed_from

Person, group or organization X physically leaves or withdraws from geographic place Y.

Includes: leave/withdraw/pull out from Y; historical physical departure. Excludes: arrival/return to Y; residence alone; leaving a job or team as an institution without geography. Ambiguous unless resolved by case-local evidence: place versus institution as source; explicitly conditional departure.

Complete census: 3 supported, 3 incorrect, 0 ambiguous; N=6. Precision 3/6=50.00% to 3/6=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 2 | appos\|-&gt;appos-&gt;semiconductor-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-cover-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-resettle-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-belong-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-miss-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;emigrate-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;miss-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-emigration-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-opponent-&gt;prep-&gt;for-&gt;pobj-&gt;fear-&gt;prep-&gt;of-&gt;pobj-&gt;influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;fight-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;storage-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_54__ent_1101__ent_405

**All observed names:** Jews → Soviet Union (5)

Ordered IDs: Ent[ent_1101] → Ent[ent_405]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4035](../raw_map.tsv:4035) | Jews | Soviet Union | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [4037](../raw_map.tsv:4037) | Jews | Soviet Union | partmod\|-&gt;partmod-&gt;emigrate-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4039](../raw_map.tsv:4039) | Jews | Soviet Union | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4042](../raw_map.tsv:4042) | Jews | Soviet Union | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-emigration-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4043](../raw_map.tsv:4043) | Jews | Soviet Union | dobj\|&lt;-dobj&lt;-resettle-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jews → Soviet Union: Unqualified leaving or emigration-from establishes physical departure from the named place.

Cited evidence lines: [4035](../raw_map.tsv:4035), [4037](../raw_map.tsv:4037), [4039](../raw_map.tsv:4039), [4042](../raw_map.tsv:4042), [4043](../raw_map.tsv:4043).




### rel_54__ent_1004__ent_572

**All observed names:** Yankees → Bronx (4)

Ordered IDs: Ent[ent_1004] → Ent[ent_572]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4046](../raw_map.tsv:4046) | Yankees | Bronx | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4050](../raw_map.tsv:4050) | Yankees | Bronx | nsubj\|&lt;-nsubj&lt;-belong-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4052](../raw_map.tsv:4052) | Yankees | Bronx | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [4053](../raw_map.tsv:4053) | Yankees | Bronx | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankees → Bronx: Unqualified leaving or emigration-from establishes physical departure from the named place.

Cited evidence lines: [4046](../raw_map.tsv:4046), [4050](../raw_map.tsv:4050), [4052](../raw_map.tsv:4052), [4053](../raw_map.tsv:4053).


Issue tags: mixed_evidence

### rel_54__ent_647__ent_323

**All observed names:** Dodgers → Brooklyn (4)

Ordered IDs: Ent[ent_647] → Ent[ent_323]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4055](../raw_map.tsv:4055) | Dodgers | Brooklyn | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [4060](../raw_map.tsv:4060) | Dodgers | Brooklyn | dobj\|&lt;-dobj&lt;-cover-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4061](../raw_map.tsv:4061) | Dodgers | Brooklyn | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4063](../raw_map.tsv:4063) | Dodgers | Brooklyn | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dodgers → Brooklyn: Unqualified leaving or emigration-from establishes physical departure from the named place.

Cited evidence lines: [4055](../raw_map.tsv:4055), [4060](../raw_map.tsv:4060), [4061](../raw_map.tsv:4061), [4063](../raw_map.tsv:4063).


Issue tags: mixed_evidence

### rel_54__ent_669__ent_989

**All observed names:** Americans → Vietnam (4)

Ordered IDs: Ent[ent_669] → Ent[ent_989]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8171](../raw_map.tsv:8171) | Americans | Vietnam | partmod\|-&gt;partmod-&gt;miss-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [8172](../raw_map.tsv:8172) | Americans | Vietnam | nsubj\|&lt;-nsubj&lt;-miss-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [8174](../raw_map.tsv:8174) | Americans | Vietnam | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8176](../raw_map.tsv:8176) | Americans | Vietnam | rcmod\|-&gt;rcmod-&gt;fight-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Americans → Vietnam: Missing/present/fighting, stored-object movement or based-in evidence does not establish departure of this actor.

Cited evidence lines: [8171](../raw_map.tsv:8171), [8172](../raw_map.tsv:8172), [8174](../raw_map.tsv:8174), [8176](../raw_map.tsv:8176).




### rel_54__ent_251__ent_586

**All observed names:** John F. Kennedy → White House (3)

Ordered IDs: Ent[ent_251] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2745](../raw_map.tsv:2745) | John F. Kennedy | White House | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-opponent-&gt;prep-&gt;for-&gt;pobj-&gt;fear-&gt;prep-&gt;of-&gt;pobj-&gt;influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2750](../raw_map.tsv:2750) | John F. Kennedy | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| [2751](../raw_map.tsv:2751) | John F. Kennedy | White House | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;storage-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). John F. Kennedy → White House: Missing/present/fighting, stored-object movement or based-in evidence does not establish departure of this actor.

Cited evidence lines: [2745](../raw_map.tsv:2745), [2750](../raw_map.tsv:2750), [2751](../raw_map.tsv:2751).




### rel_54__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (2)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [820](../raw_map.tsv:820) | Motorola | Schaumburg | appos\|-&gt;appos-&gt;semiconductor-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4310](../raw_map.tsv:4310) | Motorola | Schaumburg | appos\|-&gt;appos-&gt;semiconductor-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Motorola → Schaumburg: Missing/present/fighting, stored-object movement or based-in evidence does not establish departure of this actor.

Cited evidence lines: [820](../raw_map.tsv:820), [4310](../raw_map.tsv:4310).



