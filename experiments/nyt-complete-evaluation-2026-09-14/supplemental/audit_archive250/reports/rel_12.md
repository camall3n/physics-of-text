# audit_archive250 — rel_12: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 13 supported, 4 incorrect, 3 ambiguous; N=20. Precision 13/20=65.00% to 16/20=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;chairman-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_12__ent_75__ent_180

**All observed names:** Joseph L. Bruno → Republican (1); Yugoslav → Slobodan Milosevic (1)

Ordered IDs: Ent[ent_75] → Ent[ent_180]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [69](../raw_map.tsv:69) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [87](../raw_map.tsv:87) | Yugoslav | Slobodan Milosevic | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Joseph L. Bruno → Republican; Yugoslav → Slobodan Milosevic: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [69](../raw_map.tsv:69), [87](../raw_map.tsv:87).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_12__ent_111__ent_56

**All observed names:** Alan Greenspan → Federal Reserve (1); Ward McCarthy → McCarthy Research Associates (1)

Ordered IDs: Ent[ent_111] → Ent[ent_56]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [75](../raw_map.tsv:75) | Alan Greenspan | Federal Reserve | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [78](../raw_map.tsv:78) | Ward McCarthy | McCarthy Research Associates | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Alan Greenspan → Federal Reserve; Ward McCarthy → McCarthy Research Associates: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [75](../raw_map.tsv:75), [78](../raw_map.tsv:78).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_12__ent_157__ent_21

**All observed names:** George J. Mitchell → Senate (1)

Ordered IDs: Ent[ent_157] → Ent[ent_21]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [70](../raw_map.tsv:70) | George J. Mitchell | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). George J. Mitchell → Senate: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [70](../raw_map.tsv:70).




### rel_12__ent_154__ent_152

**All observed names:** Representative Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_154] → Ent[ent_152]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [71](../raw_map.tsv:71) | Representative Richard A. Gephardt | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Representative Richard A. Gephardt → House: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [71](../raw_map.tsv:71).




### rel_12__ent_159__ent_55

**All observed names:** Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_159] → Ent[ent_55]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [72](../raw_map.tsv:72) | Richard A. Gephardt | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Richard A. Gephardt → House: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [72](../raw_map.tsv:72).




### rel_12__ent_167__ent_123

**All observed names:** Yasir Arafat → Palestine Liberation Organization (1)

Ordered IDs: Ent[ent_167] → Ent[ent_123]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [73](../raw_map.tsv:73) | Yasir Arafat | Palestine Liberation Organization | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yasir Arafat → Palestine Liberation Organization: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [73](../raw_map.tsv:73).




### rel_12__ent_190__ent_23

**All observed names:** Rupert Murdoch → News Corporation (1)

Ordered IDs: Ent[ent_190] → Ent[ent_23]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [74](../raw_map.tsv:74) | Rupert Murdoch | News Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rupert Murdoch → News Corporation: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [74](../raw_map.tsv:74).




### rel_12__ent_222__ent_201

**All observed names:** Gen. Colin L. Powell → Joint Chiefs of Staff (1)

Ordered IDs: Ent[ent_222] → Ent[ent_201]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [76](../raw_map.tsv:76) | Gen. Colin L. Powell | Joint Chiefs of Staff | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Gen. Colin L. Powell → Joint Chiefs of Staff: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [76](../raw_map.tsv:76).




### rel_12__ent_43__ent_195

**All observed names:** Dr. Arthur Caplan → University of Minnesota (1)

Ordered IDs: Ent[ent_43] → Ent[ent_195]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [77](../raw_map.tsv:77) | Dr. Arthur Caplan | University of Minnesota | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dr. Arthur Caplan → University of Minnesota: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [77](../raw_map.tsv:77).




### rel_12__ent_111__ent_110

**All observed names:** David Rebovich → Rider University (1)

Ordered IDs: Ent[ent_111] → Ent[ent_110]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [79](../raw_map.tsv:79) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). David Rebovich → Rider University: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [79](../raw_map.tsv:79).


Issue tags: wrong_predicate

### rel_12__ent_169__ent_131

**All observed names:** Peter Arenella → University of California (1)

Ordered IDs: Ent[ent_169] → Ent[ent_131]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [80](../raw_map.tsv:80) | Peter Arenella | University of California | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Peter Arenella → University of California: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [80](../raw_map.tsv:80).


Issue tags: wrong_predicate

### rel_12__ent_147__ent_94

**All observed names:** Mary Brosnahan → Coalition (1)

Ordered IDs: Ent[ent_147] → Ent[ent_94]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [81](../raw_map.tsv:81) | Mary Brosnahan | Coalition | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Mary Brosnahan → Coalition: Coalition is a generic incomplete institution name; the director role is explicit but its organization is unresolved.

Cited evidence lines: [81](../raw_map.tsv:81).

**Review question:** Which coalition does the second entity identify?
Issue tags: truncated_entity

### rel_12__ent_153__ent_71

**All observed names:** Norman Siegel → New York Civil Liberties Union (1)

Ordered IDs: Ent[ent_153] → Ent[ent_71]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [82](../raw_map.tsv:82) | Norman Siegel | New York Civil Liberties Union | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Norman Siegel → New York Civil Liberties Union: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [82](../raw_map.tsv:82).




### rel_12__ent_41__ent_182

**All observed names:** Alan Greenspan → Federal Reserve (1)

Ordered IDs: Ent[ent_41] → Ent[ent_182]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [83](../raw_map.tsv:83) | Alan Greenspan | Federal Reserve | appos\|-&gt;appos-&gt;chairman-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Alan Greenspan → Federal Reserve: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [83](../raw_map.tsv:83).




### rel_12__ent_206__ent_199

**All observed names:** Alan Greenspan → Federal Reserve (1)

Ordered IDs: Ent[ent_206] → Ent[ent_199]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [84](../raw_map.tsv:84) | Alan Greenspan | Federal Reserve | appos\|-&gt;appos-&gt;chairman-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Alan Greenspan → Federal Reserve: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [84](../raw_map.tsv:84).




### rel_12__ent_237__ent_191

**All observed names:** Sandra Feldman → United Federation of Teachers (1)

Ordered IDs: Ent[ent_237] → Ent[ent_191]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [85](../raw_map.tsv:85) | Sandra Feldman | United Federation of Teachers | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sandra Feldman → United Federation of Teachers: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [85](../raw_map.tsv:85).




### rel_12__ent_46__ent_209

**All observed names:** Ruth W. Messinger → Manhattan (1)

Ordered IDs: Ent[ent_46] → Ent[ent_209]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [86](../raw_map.tsv:86) | Ruth W. Messinger | Manhattan | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Ruth W. Messinger → Manhattan: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [86](../raw_map.tsv:86).




### rel_12__ent_72__ent_263

**All observed names:** James E. Glassman → United States (1)

Ordered IDs: Ent[ent_72] → Ent[ent_263]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [88](../raw_map.tsv:88) | James E. Glassman | United States | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). James E. Glassman → United States: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [88](../raw_map.tsv:88).


Issue tags: wrong_predicate

### rel_12__ent_209__ent_29

**All observed names:** Joe Torre → Yankees (1)

Ordered IDs: Ent[ent_209] → Ent[ent_29]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [89](../raw_map.tsv:89) | Joe Torre | Yankees | appos\|-&gt;appos-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Joe Torre → Yankees: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [89](../raw_map.tsv:89).




### rel_12__ent_101__ent_153

**All observed names:** Bendheim → Princeton University (1)

Ordered IDs: Ent[ent_101] → Ent[ent_153]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [90](../raw_map.tsv:90) | Bendheim | Princeton University | nn\|&lt;-nn&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bendheim → Princeton University: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [90](../raw_map.tsv:90).


Issue tags: wrong_predicate
