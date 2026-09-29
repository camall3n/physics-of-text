# audit_archive250 — rel_5: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 6 supported, 3 incorrect, 4 ambiguous; N=13. Precision 6/13=46.15% to 10/13=76.92%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;scholar-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_5__ent_243__ent_219

**All observed names:** Brian Cashman → Yankees (1); Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_243] → Ent[ent_219]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [168](../raw_map.tsv:168) | Richard A. Gephardt | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [181](../raw_map.tsv:181) | Brian Cashman | Yankees | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Brian Cashman → Yankees; Richard A. Gephardt → House: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [168](../raw_map.tsv:168), [181](../raw_map.tsv:181).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_5__ent_245__ent_220

**All observed names:** Rod Thorn → Nets (1); Stephen S. Roach → Morgan Stanley (1)

Ordered IDs: Ent[ent_245] → Ent[ent_220]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [174](../raw_map.tsv:174) | Stephen S. Roach | Morgan Stanley | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [182](../raw_map.tsv:182) | Rod Thorn | Nets | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Rod Thorn → Nets; Stephen S. Roach → Morgan Stanley: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [174](../raw_map.tsv:174), [182](../raw_map.tsv:182).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_5__ent_210__ent_203

**All observed names:** Jack Valenti → Motion Picture Association of America (1); New York → Columbia University (1)

Ordered IDs: Ent[ent_210] → Ent[ent_203]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [175](../raw_map.tsv:175) | Jack Valenti | Motion Picture Association of America | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [177](../raw_map.tsv:177) | New York | Columbia University | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Jack Valenti → Motion Picture Association of America; New York → Columbia University: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [175](../raw_map.tsv:175), [177](../raw_map.tsv:177).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_5__ent_187__ent_109

**All observed names:** Trent Lott → Senate (1)

Ordered IDs: Ent[ent_187] → Ent[ent_109]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [169](../raw_map.tsv:169) | Trent Lott | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Trent Lott → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [169](../raw_map.tsv:169).




### rel_5__ent_76__ent_262

**All observed names:** Dick Armey → House (1)

Ordered IDs: Ent[ent_76] → Ent[ent_262]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [170](../raw_map.tsv:170) | Dick Armey | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Dick Armey → House: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [170](../raw_map.tsv:170).




### rel_5__ent_107__ent_258

**All observed names:** Nancy Pelosi → House (1)

Ordered IDs: Ent[ent_107] → Ent[ent_258]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [171](../raw_map.tsv:171) | Nancy Pelosi | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Nancy Pelosi → House: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [171](../raw_map.tsv:171).




### rel_5__ent_28__ent_189

**All observed names:** Bob Dole → Senate (1)

Ordered IDs: Ent[ent_28] → Ent[ent_189]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [172](../raw_map.tsv:172) | Bob Dole | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bob Dole → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [172](../raw_map.tsv:172).




### rel_5__ent_83__ent_83

**All observed names:** Tom Daschle → Senate (1)

Ordered IDs: Ent[ent_83] → Ent[ent_83]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [173](../raw_map.tsv:173) | Tom Daschle | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Tom Daschle → Senate: Tom Daschle and Senate occupy the same latent entity ID. The leadership row is otherwise clear, but the inferred fact conflates a person with the institution.

Cited evidence lines: [173](../raw_map.tsv:173).

**Review question:** Should Tom Daschle and Senate be separated into distinct entity IDs?
Issue tags: self_entity_collision

### rel_5__ent_163__ent_248

**All observed names:** Fernando Ferrer → Bronx Borough (1)

Ordered IDs: Ent[ent_163] → Ent[ent_248]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [176](../raw_map.tsv:176) | Fernando Ferrer | Bronx Borough | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Fernando Ferrer → Bronx Borough: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [176](../raw_map.tsv:176).




### rel_5__ent_247__ent_27

**All observed names:** Norman Ornstein → American Enterprise Institute (1)

Ordered IDs: Ent[ent_247] → Ent[ent_27]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [178](../raw_map.tsv:178) | Norman Ornstein | American Enterprise Institute | appos\|-&gt;appos-&gt;scholar-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Norman Ornstein → American Enterprise Institute: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [178](../raw_map.tsv:178).


Issue tags: wrong_predicate

### rel_5__ent_57__ent_146

**All observed names:** Michael D. McCurry → White House (1)

Ordered IDs: Ent[ent_57] → Ent[ent_146]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [179](../raw_map.tsv:179) | Michael D. McCurry | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Michael D. McCurry → White House: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [179](../raw_map.tsv:179).


Issue tags: wrong_predicate

### rel_5__ent_166__ent_130

**All observed names:** Federal Home Loan Mortgage Corporation → Freddie Mac (1)

Ordered IDs: Ent[ent_166] → Ent[ent_130]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [180](../raw_map.tsv:180) | Federal Home Loan Mortgage Corporation | Freddie Mac | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Federal Home Loan Mortgage Corporation → Freddie Mac: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [180](../raw_map.tsv:180).


Issue tags: wrong_predicate

### rel_5__ent_128__ent_211

**All observed names:** Robert M. Gates → Central Intelligence (1)

Ordered IDs: Ent[ent_128] → Ent[ent_211]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [183](../raw_map.tsv:183) | Robert M. Gates | Central Intelligence | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Robert M. Gates → Central Intelligence: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [183](../raw_map.tsv:183).



