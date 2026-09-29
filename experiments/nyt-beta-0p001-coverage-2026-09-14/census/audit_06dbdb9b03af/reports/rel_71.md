# audit_06dbdb9b03af — rel_71: politically controls

Predicate ID: politically_controls

Political group X controls or gains control of political body Y.

Includes: control/take-control/retain/regain/win-control; historical political control. Excludes: generic win/be-in alone; individual leadership office without party control; ordinary membership; sporting victory. Ambiguous unless resolved by case-local evidence: incomplete control object or political-group identity.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-hold-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-tonight-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-keep-&gt;dobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-present-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-marquee&lt;-pobj&lt;-on&lt;-prep&lt;-take-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-election-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-offer-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;go-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_71__ent_816__ent_811

**All observed names:** Republicans → House (4)

Ordered IDs: Ent[ent_816] → Ent[ent_811]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6402](../raw_map.tsv:6402) | Republicans | House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [6403](../raw_map.tsv:6403) | Republicans | House | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6404](../raw_map.tsv:6404) | Republicans | House | nsubj\|&lt;-nsubj&lt;-keep-&gt;dobj-&gt;control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6405](../raw_map.tsv:6405) | Republicans | House | nsubj\|&lt;-nsubj&lt;-hold-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Republicans → House: Direct party control-of or keep-control-of establishes political control of the legislature.

Cited evidence lines: [6402](../raw_map.tsv:6402), [6403](../raw_map.tsv:6403), [6404](../raw_map.tsv:6404), [6405](../raw_map.tsv:6405).


Issue tags: mixed_evidence

### rel_71__ent_827__ent_816

**All observed names:** Mr. Clinton → Republicans (3)

Ordered IDs: Ent[ent_827] → Ent[ent_816]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5551](../raw_map.tsv:5551) | Mr. Clinton | Republicans | rcmod\|-&gt;rcmod-&gt;go-&gt;nsubj-&gt;\|nsubj |
| [5553](../raw_map.tsv:5553) | Mr. Clinton | Republicans | poss\|&lt;-poss&lt;-offer-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5554](../raw_map.tsv:5554) | Mr. Clinton | Republicans | poss\|&lt;-poss&lt;-election-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Clinton → Republicans: A personal election/offer or theater address does not establish political-group control of a body.

Cited evidence lines: [5551](../raw_map.tsv:5551), [5553](../raw_map.tsv:5553), [5554](../raw_map.tsv:5554).




### rel_71__ent_240__ent_482

**All observed names:** Joyce Theater → Eighth Avenue (3)

Ordered IDs: Ent[ent_240] → Ent[ent_482]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6235](../raw_map.tsv:6235) | Joyce Theater | Eighth Avenue | appos\|&lt;-appos&lt;-tonight-&gt;appos-&gt;\|appos |
| [6239](../raw_map.tsv:6239) | Joyce Theater | Eighth Avenue | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-marquee&lt;-pobj&lt;-on&lt;-prep&lt;-take-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6240](../raw_map.tsv:6240) | Joyce Theater | Eighth Avenue | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-present-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Joyce Theater → Eighth Avenue: A personal election/offer or theater address does not establish political-group control of a body.

Cited evidence lines: [6235](../raw_map.tsv:6235), [6239](../raw_map.tsv:6239), [6240](../raw_map.tsv:6240).




### rel_71__ent_819__ent_1197

**All observed names:** Democrats → Senate (3)

Ordered IDs: Ent[ent_819] → Ent[ent_1197]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6380](../raw_map.tsv:6380) | Democrats | Senate | nsubj\|&lt;-nsubj&lt;-hold-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6381](../raw_map.tsv:6381) | Democrats | Senate | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6385](../raw_map.tsv:6385) | Democrats | Senate | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Democrats → Senate: Direct party control-of or keep-control-of establishes political control of the legislature.

Cited evidence lines: [6380](../raw_map.tsv:6380), [6381](../raw_map.tsv:6381), [6385](../raw_map.tsv:6385).


Issue tags: mixed_evidence
