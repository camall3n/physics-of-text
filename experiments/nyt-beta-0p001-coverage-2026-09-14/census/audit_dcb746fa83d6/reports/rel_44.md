# audit_dcb746fa83d6 — rel_44: politically controls

Predicate ID: politically_controls

Political group X controls or gains control of political body Y.

Includes: control/take-control/retain/regain/win-control; historical political control. Excludes: generic win/be-in alone; individual leadership office without party control; ordinary membership; sporting victory. Ambiguous unless resolved by case-local evidence: incomplete control object or political-group identity.

Complete census: 5 supported, 5 incorrect, 0 ambiguous; N=10. Precision 5/10=50.00% to 5/10=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| 2 | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-continue-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-control-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-stir-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;by-&gt;pobj-&gt;jostler-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-reign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;on-&gt;pobj-&gt;revival-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_44__ent_1176__ent_543

**All observed names:** Bill Fitch → Nets (3); Richard Jefferson → Nets (1)

Ordered IDs: Ent[ent_1176] → Ent[ent_543]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3100](../raw_map.tsv:3100) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |
| [6498](../raw_map.tsv:6498) | Bill Fitch | Nets | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| [6499](../raw_map.tsv:6499) | Bill Fitch | Nets | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| [6502](../raw_map.tsv:6502) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Bill Fitch → Nets; Richard Jefferson → Nets: Sports roles, corporate control, a city article, or inverse body-to-individual leadership are outside political-group control.

Cited evidence lines: [3100](../raw_map.tsv:3100), [6498](../raw_map.tsv:6498), [6499](../raw_map.tsv:6499), [6502](../raw_map.tsv:6502).


Issue tags: identity_ambiguity

### rel_44__ent_689__ent_1144

**All observed names:** James L. Dolan → Madison Square Garden (3)

Ordered IDs: Ent[ent_689] → Ent[ent_1144]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5720](../raw_map.tsv:5720) | James L. Dolan | Madison Square Garden | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| [5721](../raw_map.tsv:5721) | James L. Dolan | Madison Square Garden | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-reign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [5722](../raw_map.tsv:5722) | James L. Dolan | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-stir-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;by-&gt;pobj-&gt;jostler-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). James L. Dolan → Madison Square Garden: Sports roles, corporate control, a city article, or inverse body-to-individual leadership are outside political-group control.

Cited evidence lines: [5720](../raw_map.tsv:5720), [5721](../raw_map.tsv:5721), [5722](../raw_map.tsv:5722).




### rel_44__ent_819__ent_1197

**All observed names:** Democrats → Senate (2)

Ordered IDs: Ent[ent_819] → Ent[ent_1197]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6376](../raw_map.tsv:6376) | Democrats | Senate | nsubj\|&lt;-nsubj&lt;-control-&gt;dobj-&gt;\|dobj |
| [6381](../raw_map.tsv:6381) | Democrats | Senate | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Democrats → Senate: Direct party control of the named legislature establishes political control.

Cited evidence lines: [6376](../raw_map.tsv:6376), [6381](../raw_map.tsv:6381).




### rel_44__ent_816__ent_1326

**All observed names:** Republicans → House (2)

Ordered IDs: Ent[ent_816] → Ent[ent_1326]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6399](../raw_map.tsv:6399) | Republicans | House | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |
| [6403](../raw_map.tsv:6403) | Republicans | House | nn\|&lt;-nn&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Republicans → House: Direct party control of the named legislature establishes political control.

Cited evidence lines: [6399](../raw_map.tsv:6399), [6403](../raw_map.tsv:6403).




### rel_44__ent_1197__ent_969

**All observed names:** Senate → Bill Frist (2)

Ordered IDs: Ent[ent_1197] → Ent[ent_969]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7673](../raw_map.tsv:7673) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |
| [7674](../raw_map.tsv:7674) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-continue-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Senate → Bill Frist: Sports roles, corporate control, a city article, or inverse body-to-individual leadership are outside political-group control.

Cited evidence lines: [7673](../raw_map.tsv:7673), [7674](../raw_map.tsv:7674).




### rel_44__ent_1160__ent_429

**All observed names:** David Mermelstein → Los Angeles (1)

Ordered IDs: Ent[ent_1160] → Ent[ent_429]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6091](../raw_map.tsv:6091) | David Mermelstein | Los Angeles | poss\|&lt;-poss&lt;-article-&gt;prep-&gt;on-&gt;pobj-&gt;revival-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). David Mermelstein → Los Angeles: Sports roles, corporate control, a city article, or inverse body-to-individual leadership are outside political-group control.

Cited evidence lines: [6091](../raw_map.tsv:6091).




### rel_44__ent_1382__ent_811

**All observed names:** Democrats → House (1)

Ordered IDs: Ent[ent_1382] → Ent[ent_811]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6368](../raw_map.tsv:6368) | Democrats | House | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Democrats → House: Direct party control of the named legislature establishes political control.

Cited evidence lines: [6368](../raw_map.tsv:6368).




### rel_44__ent_727__ent_1333

**All observed names:** Democrats → Senate (1)

Ordered IDs: Ent[ent_727] → Ent[ent_1333]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6379](../raw_map.tsv:6379) | Democrats | Senate | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Democrats → Senate: Direct party control of the named legislature establishes political control.

Cited evidence lines: [6379](../raw_map.tsv:6379).




### rel_44__ent_1107__ent_189

**All observed names:** Republicans → Congress (1)

Ordered IDs: Ent[ent_1107] → Ent[ent_189]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6388](../raw_map.tsv:6388) | Republicans | Congress | rcmod\|-&gt;rcmod-&gt;control-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Republicans → Congress: Direct party control of the named legislature establishes political control.

Cited evidence lines: [6388](../raw_map.tsv:6388).




### rel_44__ent_1333__ent_1406

**All observed names:** Senate → Bob Dole (1)

Ordered IDs: Ent[ent_1333] → Ent[ent_1406]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7632](../raw_map.tsv:7632) | Senate | Bob Dole | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Senate → Bob Dole: Sports roles, corporate control, a city article, or inverse body-to-individual leadership are outside political-group control.

Cited evidence lines: [7632](../raw_map.tsv:7632).



