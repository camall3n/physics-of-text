# audit_9c88162c7b22 — rel_23: played or competed against

Predicate ID: competed_against

Competitor X played or competed against opposing competitor Y in a contest.

Includes: explicit played against; a completed win or loss against opponent; competition with clear opponent roles. Excludes: ordinary interaction; standings comparison without a contest; future schedule alone. Ambiguous unless resolved by case-local evidence: ambiguous game occurrence. Sensitivity-only for previously defeat-labeled relations unless a new primary assignment is explicitly frozen before grading. Not a union of unrelated meanings.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | nsubj\|&lt;-nsubj&lt;-outrebound-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |
| 1 | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-accord-&gt;rcmod-&gt;end-&gt;dobj-&gt;backing-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-saturday-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-critic-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-government&lt;-nsubj&lt;-turn-&gt;dobj-&gt;suspect-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-rout-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;interest-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;explain-&gt;nsubj-&gt;dictator-&gt;amod-&gt;\|amod |
| 1 | rcmod\|-&gt;rcmod-&gt;issue-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_23__ent_33__ent_32

**All observed names:** Col. Muammar el-Qaddafi → Libyan (5)

Ordered IDs: Ent[ent_33] → Ent[ent_32]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3740](../raw_map.tsv:3740) | Col. Muammar el-Qaddafi | Libyan | rcmod\|-&gt;rcmod-&gt;explain-&gt;nsubj-&gt;dictator-&gt;amod-&gt;\|amod |
| [3741](../raw_map.tsv:3741) | Col. Muammar el-Qaddafi | Libyan | poss\|&lt;-poss&lt;-government&lt;-nsubj&lt;-turn-&gt;dobj-&gt;suspect-&gt;amod-&gt;\|amod |
| [3742](../raw_map.tsv:3742) | Col. Muammar el-Qaddafi | Libyan | poss\|&lt;-poss&lt;-critic-&gt;amod-&gt;\|amod |
| [3743](../raw_map.tsv:3743) | Col. Muammar el-Qaddafi | Libyan | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-saturday-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3744](../raw_map.tsv:3744) | Col. Muammar el-Qaddafi | Libyan | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-accord-&gt;rcmod-&gt;end-&gt;dobj-&gt;backing-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Col. Muammar el-Qaddafi → Libyan: Dictator, government, and political backing descriptions do not express a sporting or electoral contest against the second argument.

Cited evidence lines: [3740](../raw_map.tsv:3740), [3741](../raw_map.tsv:3741), [3742](../raw_map.tsv:3742), [3743](../raw_map.tsv:3743), [3744](../raw_map.tsv:3744).




### rel_23__ent_543__ent_308

**All observed names:** Nets → Knicks (4)

Ordered IDs: Ent[ent_543] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [944](../raw_map.tsv:944) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |
| [945](../raw_map.tsv:945) | Nets | Knicks | poss\|&lt;-poss&lt;-rout-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [947](../raw_map.tsv:947) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-outrebound-&gt;dobj-&gt;\|dobj |
| [950](../raw_map.tsv:950) | Nets | Knicks | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Nets → Knicks: The rout, outscore, and out-rebound paths establish an actual competitive encounter between the teams.

Cited evidence lines: [944](../raw_map.tsv:944), [945](../raw_map.tsv:945), [947](../raw_map.tsv:947), [950](../raw_map.tsv:950).




### rel_23__ent_279__ent_278

**All observed names:** Bobby Cox → Braves (3)

Ordered IDs: Ent[ent_279] → Ent[ent_278]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3239](../raw_map.tsv:3239) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |
| [3241](../raw_map.tsv:3241) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;issue-&gt;nsubj-&gt;\|nsubj |
| [3242](../raw_map.tsv:3242) | Bobby Cox | Braves | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;interest-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Bobby Cox → Braves: Managing the Braves is an organizational role, not competing against the team.

Cited evidence lines: [3239](../raw_map.tsv:3239), [3241](../raw_map.tsv:3241), [3242](../raw_map.tsv:3242).



