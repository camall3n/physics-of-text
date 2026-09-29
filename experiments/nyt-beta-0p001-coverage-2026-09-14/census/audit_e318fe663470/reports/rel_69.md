# audit_e318fe663470 — rel_69: moves or travels to

Predicate ID: travels_to

Person, group or organization X undertakes movement with geographic destination Y.

Includes: move/relocate/return/arrive/go/visit to Y; depart/leave for Y; temporary travel or organizational relocation; bare unqualified destination movement as textual support. Excludes: leave/withdraw from Y; mere presence/residence/death place; sports-event qualification or attendance as a nongeographic destination; membership or political control. Ambiguous unless resolved by case-local evidence: explicitly hypothetical or proposed relocation; invasion-only boundary; geographic/team or theatrical metonymy. Permanent residence and completed arrival are not required. Do not import external history to reject an otherwise unqualified textual movement path.

Complete census: 1 supported, 1 incorrect, 1 ambiguous; N=3. Precision 1/3=33.33% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-immigration-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;immigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |
| 1 | prep\|&lt;-prep&lt;-come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | prep\|&lt;-prep&lt;-follow-&gt;dobj-&gt;father-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;immigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_69__ent_1397__ent_537

**All observed names:** Born → United States (7)

Ordered IDs: Ent[ent_1397] → Ent[ent_537]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4693](../raw_map.tsv:4693) | Born | United States | nsubj\|&lt;-nsubj&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4695](../raw_map.tsv:4695) | Born | United States | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4696](../raw_map.tsv:4696) | Born | United States | dep\|-&gt;dep-&gt;immigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4697](../raw_map.tsv:4697) | Born | United States | dep\|-&gt;dep-&gt;come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4698](../raw_map.tsv:4698) | Born | United States | rcmod\|-&gt;rcmod-&gt;immigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4699](../raw_map.tsv:4699) | Born | United States | prep\|&lt;-prep&lt;-follow-&gt;dobj-&gt;father-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4700](../raw_map.tsv:4700) | Born | United States | prep\|&lt;-prep&lt;-come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Born → United States: The extracted subject Born is a sentence fragment rather than an identified migrant.

Cited evidence lines: [4693](../raw_map.tsv:4693), [4695](../raw_map.tsv:4695), [4696](../raw_map.tsv:4696), [4697](../raw_map.tsv:4697), [4698](../raw_map.tsv:4698), [4699](../raw_map.tsv:4699), [4700](../raw_map.tsv:4700).

**Review question:** Who is the person immigrating or moving to the United States?
Issue tags: truncated_argument

### rel_69__ent_80__ent_1204

**All observed names:** Soviet Jews → Israel (4)

Ordered IDs: Ent[ent_80] → Ent[ent_1204]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3481](../raw_map.tsv:3481) | Soviet Jews | Israel | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [3483](../raw_map.tsv:3483) | Soviet Jews | Israel | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-immigration-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4782](../raw_map.tsv:4782) | Soviet Jews | Israel | nsubj\|&lt;-nsubj&lt;-emigrate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4784](../raw_map.tsv:4784) | Soviet Jews | Israel | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-immigration-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Soviet Jews → Israel: Explicit emigration-to establishes destination movement by members of the population.

Cited evidence lines: [3481](../raw_map.tsv:3481), [3483](../raw_map.tsv:3483), [4782](../raw_map.tsv:4782), [4784](../raw_map.tsv:4784).




### rel_69__ent_586__ent_109

**All observed names:** White House → Congress (1)

Ordered IDs: Ent[ent_586] → Ent[ent_109]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2059](../raw_map.tsv:2059) | White House | Congress | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). White House → Congress: Institutional notification does not establish geographic destination movement.

Cited evidence lines: [2059](../raw_map.tsv:2059).



