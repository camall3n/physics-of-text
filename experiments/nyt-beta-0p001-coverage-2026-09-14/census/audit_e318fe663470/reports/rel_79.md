# audit_e318fe663470 — rel_79: coach of

Predicate ID: coach_of

Person X coaches or coached sports team or collegiate athletic program Y.

Includes: explicit coach title; direct coaching with correct subject and team; former/dismissed coach with clear office evidence; team/university shorthand when the athletic program role is clear. Excludes: manager/president/player alone; winning with a team alone; vacancy consideration alone; reverse team-to-coach direction. Ambiguous unless resolved by case-local evidence: missing coach subject or team attachment.

Complete census: 5 supported, 3 incorrect, 0 ambiguous; N=8. Precision 5/8=62.50% to 5/8=62.50%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| 2 | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-name&lt;-partmod&lt;-cybersettle.com-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;on-&gt;pobj-&gt;vision-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-role-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;angry-&gt;dep-&gt;turnover-&gt;dep-&gt;squander-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_79__ent_1176__ent_543

**All observed names:** Bill Fitch → Nets (5)

Ordered IDs: Ent[ent_1176] → Ent[ent_543]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6498](../raw_map.tsv:6498) | Bill Fitch | Nets | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| [6499](../raw_map.tsv:6499) | Bill Fitch | Nets | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| [6500](../raw_map.tsv:6500) | Bill Fitch | Nets | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6502](../raw_map.tsv:6502) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| [6505](../raw_map.tsv:6505) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;angry-&gt;dep-&gt;turnover-&gt;dep-&gt;squander-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Bill Fitch → Nets: A local explicit coach title identifies the person coaching the team; Knick is team shorthand in this coaching context.

Cited evidence lines: [6498](../raw_map.tsv:6498), [6499](../raw_map.tsv:6499), [6500](../raw_map.tsv:6500), [6502](../raw_map.tsv:6502), [6505](../raw_map.tsv:6505).


Issue tags: mixed_evidence

### rel_79__ent_239__ent_561

**All observed names:** Bill Parcells → Giants (3)

Ordered IDs: Ent[ent_239] → Ent[ent_561]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6490](../raw_map.tsv:6490) | Bill Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6493](../raw_map.tsv:6493) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [6495](../raw_map.tsv:6495) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bill Parcells → Giants: A local explicit coach title identifies the person coaching the team; Knick is team shorthand in this coaching context.

Cited evidence lines: [6490](../raw_map.tsv:6490), [6493](../raw_map.tsv:6493), [6495](../raw_map.tsv:6495).


Issue tags: mixed_evidence

### rel_79__ent_1202__ent_492

**All observed names:** Iran → Iraq (2)

Ordered IDs: Ent[ent_1202] → Ent[ent_492]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5527](../raw_map.tsv:5527) | Iran | Iraq | poss\|&lt;-poss&lt;-role-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5529](../raw_map.tsv:5529) | Iran | Iraq | poss\|&lt;-poss&lt;-influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Iran → Iraq: Political influence, an article or a corporate unit does not establish coaching.

Cited evidence lines: [5527](../raw_map.tsv:5527), [5529](../raw_map.tsv:5529).




### rel_79__ent_334__ent_308

**All observed names:** Rick Pitino → Knicks (2)

Ordered IDs: Ent[ent_334] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6537](../raw_map.tsv:6537) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6541](../raw_map.tsv:6541) | Rick Pitino | Knicks | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Rick Pitino → Knicks: A local explicit coach title identifies the person coaching the team; Knick is team shorthand in this coaching context.

Cited evidence lines: [6537](../raw_map.tsv:6537), [6541](../raw_map.tsv:6541).


Issue tags: mixed_evidence

### rel_79__ent_1060__ent_961

**All observed names:** Rick Pitino → Knick (2)

Ordered IDs: Ent[ent_1060] → Ent[ent_961]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7245](../raw_map.tsv:7245) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [7248](../raw_map.tsv:7248) | Rick Pitino | Knick | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Rick Pitino → Knick: A local explicit coach title identifies the person coaching the team; Knick is team shorthand in this coaching context.

Cited evidence lines: [7245](../raw_map.tsv:7245), [7248](../raw_map.tsv:7248).


Issue tags: mixed_evidence

### rel_79__ent_4__ent_941

**All observed names:** Yasir Arafat → Palestinian (1)

Ordered IDs: Ent[ent_4] → Ent[ent_941]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3685](../raw_map.tsv:3685) | Yasir Arafat | Palestinian | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;on-&gt;pobj-&gt;vision-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Yasir Arafat → Palestinian: Political influence, an article or a corporate unit does not establish coaching.

Cited evidence lines: [3685](../raw_map.tsv:3685).




### rel_79__ent_889__ent_561

**All observed names:** Parcells → Giants (1)

Ordered IDs: Ent[ent_889] → Ent[ent_561]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4077](../raw_map.tsv:4077) | Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Parcells → Giants: A local explicit coach title identifies the person coaching the team; Knick is team shorthand in this coaching context.

Cited evidence lines: [4077](../raw_map.tsv:4077).




### rel_79__ent_324__ent_627

**All observed names:** New York → DDB Worldwide (1)

Ordered IDs: Ent[ent_324] → Ent[ent_627]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4174](../raw_map.tsv:4174) | New York | DDB Worldwide | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-name&lt;-partmod&lt;-cybersettle.com-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). New York → DDB Worldwide: Political influence, an article or a corporate unit does not establish coaching.

Cited evidence lines: [4174](../raw_map.tsv:4174).



