# audit_archive250 — rel_14: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 7 supported, 5 incorrect, 3 ambiguous; N=15. Precision 7/15=46.67% to 10/15=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;secretary-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_14__ent_150__ent_117

**All observed names:** C. Fred Bergsten → Institute for International Economics (1); Nancy Pelosi → House (1)

Ordered IDs: Ent[ent_150] → Ent[ent_117]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [109](../raw_map.tsv:109) | Nancy Pelosi | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [124](../raw_map.tsv:124) | C. Fred Bergsten | Institute for International Economics | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). C. Fred Bergsten → Institute for International Economics; Nancy Pelosi → House: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [109](../raw_map.tsv:109), [124](../raw_map.tsv:124).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_14__ent_230__ent_219

**All observed names:** Fred Siegel → Cooper Union (1); Leland T. Jones → Mayor (1)

Ordered IDs: Ent[ent_230] → Ent[ent_219]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [115](../raw_map.tsv:115) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [121](../raw_map.tsv:121) | Leland T. Jones | Mayor | appos\|-&gt;appos-&gt;secretary-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Fred Siegel → Cooper Union; Leland T. Jones → Mayor: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [115](../raw_map.tsv:115), [121](../raw_map.tsv:121).


Issue tags: wrong_predicate

### rel_14__ent_230__ent_82

**All observed names:** Radovan Karadzic → Bosnian Serb (1)

Ordered IDs: Ent[ent_230] → Ent[ent_82]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [108](../raw_map.tsv:108) | Radovan Karadzic | Bosnian Serb | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Radovan Karadzic → Bosnian Serb: Bosnian Serb is a singular nationality descriptor rather than the fully identified political group.

Cited evidence lines: [108](../raw_map.tsv:108).

**Review question:** Which full political institution or people group is intended?
Issue tags: truncated_entity

### rel_14__ent_88__ent_68

**All observed names:** Mr. Dole → Senate (1)

Ordered IDs: Ent[ent_88] → Ent[ent_68]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [110](../raw_map.tsv:110) | Mr. Dole | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mr. Dole → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [110](../raw_map.tsv:110).




### rel_14__ent_226__ent_26

**All observed names:** Radovan Karadzic → Bosnian Serb (1)

Ordered IDs: Ent[ent_226] → Ent[ent_26]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [111](../raw_map.tsv:111) | Radovan Karadzic | Bosnian Serb | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Radovan Karadzic → Bosnian Serb: Bosnian Serb is a singular nationality descriptor rather than the fully identified political group.

Cited evidence lines: [111](../raw_map.tsv:111).

**Review question:** Which full political institution or people group is intended?
Issue tags: truncated_entity

### rel_14__ent_176__ent_224

**All observed names:** Mr. Dole → Senate (1)

Ordered IDs: Ent[ent_176] → Ent[ent_224]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [112](../raw_map.tsv:112) | Mr. Dole | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mr. Dole → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [112](../raw_map.tsv:112).




### rel_14__ent_39__ent_93

**All observed names:** Joan Claybrook → Public Citizen (1)

Ordered IDs: Ent[ent_39] → Ent[ent_93]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [113](../raw_map.tsv:113) | Joan Claybrook | Public Citizen | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Joan Claybrook → Public Citizen: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [113](../raw_map.tsv:113).




### rel_14__ent_146__ent_118

**All observed names:** Jack Valenti → Motion Picture Association of America (1)

Ordered IDs: Ent[ent_146] → Ent[ent_118]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [114](../raw_map.tsv:114) | Jack Valenti | Motion Picture Association of America | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jack Valenti → Motion Picture Association of America: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [114](../raw_map.tsv:114).




### rel_14__ent_159__ent_96

**All observed names:** Douglas Muzzio → Baruch College (1)

Ordered IDs: Ent[ent_159] → Ent[ent_96]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [116](../raw_map.tsv:116) | Douglas Muzzio | Baruch College | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Douglas Muzzio → Baruch College: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [116](../raw_map.tsv:116).


Issue tags: wrong_predicate

### rel_14__ent_46__ent_182

**All observed names:** John Lipsky → Salomon Brothers (1)

Ordered IDs: Ent[ent_46] → Ent[ent_182]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [117](../raw_map.tsv:117) | John Lipsky | Salomon Brothers | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John Lipsky → Salomon Brothers: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [117](../raw_map.tsv:117).


Issue tags: wrong_predicate

### rel_14__ent_221__ent_169

**All observed names:** Fernando Ferrer → Bronx (1)

Ordered IDs: Ent[ent_221] → Ent[ent_169]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [118](../raw_map.tsv:118) | Fernando Ferrer | Bronx | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Fernando Ferrer → Bronx: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [118](../raw_map.tsv:118).




### rel_14__ent_120__ent_223

**All observed names:** Scott McClellan → White House (1)

Ordered IDs: Ent[ent_120] → Ent[ent_223]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [119](../raw_map.tsv:119) | Scott McClellan | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Scott McClellan → White House: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [119](../raw_map.tsv:119).


Issue tags: wrong_predicate

### rel_14__ent_234__ent_60

**All observed names:** Alan B. Krueger → Princeton University (1)

Ordered IDs: Ent[ent_234] → Ent[ent_60]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [120](../raw_map.tsv:120) | Alan B. Krueger | Princeton University | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Alan B. Krueger → Princeton University: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [120](../raw_map.tsv:120).


Issue tags: wrong_predicate

### rel_14__ent_253__ent_132

**All observed names:** Lou Lamoriello → Devils (1)

Ordered IDs: Ent[ent_253] → Ent[ent_132]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [122](../raw_map.tsv:122) | Lou Lamoriello | Devils | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Lou Lamoriello → Devils: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [122](../raw_map.tsv:122).




### rel_14__ent_165__ent_103

**All observed names:** Charles A. Gargano → Empire State Development Corporation (1)

Ordered IDs: Ent[ent_165] → Ent[ent_103]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [123](../raw_map.tsv:123) | Charles A. Gargano | Empire State Development Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Charles A. Gargano → Empire State Development Corporation: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [123](../raw_map.tsv:123).



