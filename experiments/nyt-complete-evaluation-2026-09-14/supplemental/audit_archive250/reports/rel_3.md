# audit_archive250 — rel_3: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 9 supported, 5 incorrect, 2 ambiguous; N=16. Precision 9/16=56.25% to 11/16=68.75%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_3__ent_42__ent_28

**All observed names:** Juan Antonio Samaranch → International Olympic Committee (1); Kenneth E. Raske → Greater New York Hospital Association (1)

Ordered IDs: Ent[ent_42] → Ent[ent_28]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [142](../raw_map.tsv:142) | Kenneth E. Raske | Greater New York Hospital Association | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [143](../raw_map.tsv:143) | Juan Antonio Samaranch | International Olympic Committee | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Juan Antonio Samaranch → International Olympic Committee; Kenneth E. Raske → Greater New York Hospital Association: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [142](../raw_map.tsv:142), [143](../raw_map.tsv:143).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_3__ent_207__ent_55

**All observed names:** John C. Coffee Jr. → Columbia University (1); Robert J. Barbera → Hoenig &amp; Company (1)

Ordered IDs: Ent[ent_207] → Ent[ent_55]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [145](../raw_map.tsv:145) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [152](../raw_map.tsv:152) | Robert J. Barbera | Hoenig &amp; Company | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John C. Coffee Jr. → Columbia University; Robert J. Barbera → Hoenig & Company: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [145](../raw_map.tsv:145), [152](../raw_map.tsv:152).


Issue tags: wrong_predicate

### rel_3__ent_33__ent_36

**All observed names:** James P. Rubin → State Department (1); Joseph L. Bruno → Senate (1)

Ordered IDs: Ent[ent_33] → Ent[ent_36]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [150](../raw_map.tsv:150) | James P. Rubin | State Department | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| [153](../raw_map.tsv:153) | Joseph L. Bruno | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). James P. Rubin → State Department; Joseph L. Bruno → Senate: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [150](../raw_map.tsv:150), [153](../raw_map.tsv:153).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_3__ent_223__ent_153

**All observed names:** Raymond D. Horton → Citizens Budget Commission (1)

Ordered IDs: Ent[ent_223] → Ent[ent_153]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [139](../raw_map.tsv:139) | Raymond D. Horton | Citizens Budget Commission | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raymond D. Horton → Citizens Budget Commission: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [139](../raw_map.tsv:139).




### rel_3__ent_108__ent_114

**All observed names:** Gerry Adams → Sinn Fein (1)

Ordered IDs: Ent[ent_108] → Ent[ent_114]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [140](../raw_map.tsv:140) | Gerry Adams | Sinn Fein | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Gerry Adams → Sinn Fein: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [140](../raw_map.tsv:140).




### rel_3__ent_31__ent_134

**All observed names:** Juan Antonio Samaranch → International Olympic Committee (1)

Ordered IDs: Ent[ent_31] → Ent[ent_134]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [141](../raw_map.tsv:141) | Juan Antonio Samaranch | International Olympic Committee | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Juan Antonio Samaranch → International Olympic Committee: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [141](../raw_map.tsv:141).




### rel_3__ent_150__ent_32

**All observed names:** Robert Thompson → Syracuse University (1)

Ordered IDs: Ent[ent_150] → Ent[ent_32]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [144](../raw_map.tsv:144) | Robert Thompson | Syracuse University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Robert Thompson → Syracuse University: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [144](../raw_map.tsv:144).


Issue tags: wrong_predicate

### rel_3__ent_25__ent_250

**All observed names:** Stephen Gillers → New York University Law School (1)

Ordered IDs: Ent[ent_25] → Ent[ent_250]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [146](../raw_map.tsv:146) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Stephen Gillers → New York University Law School: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [146](../raw_map.tsv:146).


Issue tags: wrong_predicate

### rel_3__ent_176__ent_207

**All observed names:** Rupert Murdoch → News Corporation (1)

Ordered IDs: Ent[ent_176] → Ent[ent_207]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [147](../raw_map.tsv:147) | Rupert Murdoch | News Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rupert Murdoch → News Corporation: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [147](../raw_map.tsv:147).




### rel_3__ent_173__ent_42

**All observed names:** Charles A. Gargano → Empire State Development Corporation (1)

Ordered IDs: Ent[ent_173] → Ent[ent_42]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [148](../raw_map.tsv:148) | Charles A. Gargano | Empire State Development Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Charles A. Gargano → Empire State Development Corporation: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [148](../raw_map.tsv:148).




### rel_3__ent_141__ent_218

**All observed names:** Rupert Murdoch → News Corporation (1)

Ordered IDs: Ent[ent_141] → Ent[ent_218]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [149](../raw_map.tsv:149) | Rupert Murdoch | News Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rupert Murdoch → News Corporation: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [149](../raw_map.tsv:149).




### rel_3__ent_187__ent_236

**All observed names:** Joe Lockhart → White House (1)

Ordered IDs: Ent[ent_187] → Ent[ent_236]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [151](../raw_map.tsv:151) | Joe Lockhart | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Joe Lockhart → White House: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [151](../raw_map.tsv:151).


Issue tags: wrong_predicate

### rel_3__ent_18__ent_175

**All observed names:** Hal R. Varian → University of California (1)

Ordered IDs: Ent[ent_18] → Ent[ent_175]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [154](../raw_map.tsv:154) | Hal R. Varian | University of California | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Hal R. Varian → University of California: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [154](../raw_map.tsv:154).


Issue tags: wrong_predicate

### rel_3__ent_143__ent_160

**All observed names:** George Young → Giants (1)

Ordered IDs: Ent[ent_143] → Ent[ent_160]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [155](../raw_map.tsv:155) | George Young | Giants | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). George Young → Giants: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [155](../raw_map.tsv:155).




### rel_3__ent_44__ent_210

**All observed names:** Glen Sather → Rangers (1)

Ordered IDs: Ent[ent_44] → Ent[ent_210]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [156](../raw_map.tsv:156) | Glen Sather | Rangers | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Glen Sather → Rangers: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [156](../raw_map.tsv:156).




### rel_3__ent_64__ent_139

**All observed names:** C. Fred Bergsten → Institute for International Economics (1)

Ordered IDs: Ent[ent_64] → Ent[ent_139]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [157](../raw_map.tsv:157) | C. Fred Bergsten | Institute for International Economics | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). C. Fred Bergsten → Institute for International Economics: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [157](../raw_map.tsv:157).



