# audit_archive250 — rel_2: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 8 supported, 3 incorrect, 1 ambiguous; N=12. Precision 8/12=66.67% to 9/12=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chief-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_2__ent_204__ent_102

**All observed names:** Bob Dole → Republican (1); Gerald Schoenfeld → Shubert Organization (1)

Ordered IDs: Ent[ent_204] → Ent[ent_102]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [127](../raw_map.tsv:127) | Bob Dole | Republican | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| [137](../raw_map.tsv:137) | Gerald Schoenfeld | Shubert Organization | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Bob Dole → Republican; Gerald Schoenfeld → Shubert Organization: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [127](../raw_map.tsv:127), [137](../raw_map.tsv:137).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_2__ent_157__ent_43

**All observed names:** Bronx Borough → Fernando Ferrer (1); Charles E. Redman → State Department (1)

Ordered IDs: Ent[ent_157] → Ent[ent_43]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [133](../raw_map.tsv:133) | Bronx Borough | Fernando Ferrer | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [135](../raw_map.tsv:135) | Charles E. Redman | State Department | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Bronx Borough → Fernando Ferrer; Charles E. Redman → State Department: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [133](../raw_map.tsv:133), [135](../raw_map.tsv:135).


Issue tags: wrong_predicate

### rel_2__ent_211__ent_108

**All observed names:** Mr. Dole → Senate (1)

Ordered IDs: Ent[ent_211] → Ent[ent_108]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [125](../raw_map.tsv:125) | Mr. Dole | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mr. Dole → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [125](../raw_map.tsv:125).




### rel_2__ent_155__ent_129

**All observed names:** Representative Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_155] → Ent[ent_129]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [126](../raw_map.tsv:126) | Representative Richard A. Gephardt | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Representative Richard A. Gephardt → House: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [126](../raw_map.tsv:126).




### rel_2__ent_179__ent_36

**All observed names:** Trent Lott → Senate (1)

Ordered IDs: Ent[ent_179] → Ent[ent_36]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [128](../raw_map.tsv:128) | Trent Lott | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Trent Lott → Senate: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [128](../raw_map.tsv:128).




### rel_2__ent_56__ent_141

**All observed names:** Lou Lamoriello → Devils (1)

Ordered IDs: Ent[ent_56] → Ent[ent_141]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [129](../raw_map.tsv:129) | Lou Lamoriello | Devils | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Lou Lamoriello → Devils: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [129](../raw_map.tsv:129).




### rel_2__ent_51__ent_188

**All observed names:** Gary Burtless → Brookings Institution (1)

Ordered IDs: Ent[ent_51] → Ent[ent_188]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [130](../raw_map.tsv:130) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Gary Burtless → Brookings Institution: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [130](../raw_map.tsv:130).


Issue tags: wrong_predicate

### rel_2__ent_155__ent_143

**All observed names:** Steven A. Wood → Bank of America (1)

Ordered IDs: Ent[ent_155] → Ent[ent_143]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [131](../raw_map.tsv:131) | Steven A. Wood | Bank of America | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Steven A. Wood → Bank of America: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [131](../raw_map.tsv:131).




### rel_2__ent_36__ent_201

**All observed names:** C. Virginia Fields → Manhattan (1)

Ordered IDs: Ent[ent_36] → Ent[ent_201]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [132](../raw_map.tsv:132) | C. Virginia Fields | Manhattan | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). C. Virginia Fields → Manhattan: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [132](../raw_map.tsv:132).




### rel_2__ent_37__ent_199

**All observed names:** Andrew H. Card Jr. → White House (1)

Ordered IDs: Ent[ent_37] → Ent[ent_199]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [134](../raw_map.tsv:134) | Andrew H. Card Jr. | White House | appos\|-&gt;appos-&gt;chief-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Andrew H. Card Jr. → White House: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [134](../raw_map.tsv:134).




### rel_2__ent_98__ent_126

**All observed names:** Donald J. Fine → Chase Manhattan Bank (1)

Ordered IDs: Ent[ent_98] → Ent[ent_126]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [136](../raw_map.tsv:136) | Donald J. Fine | Chase Manhattan Bank | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Donald J. Fine → Chase Manhattan Bank: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [136](../raw_map.tsv:136).


Issue tags: wrong_predicate

### rel_2__ent_136__ent_15

**All observed names:** Ralph Reed → Christian Coalition (1)

Ordered IDs: Ent[ent_136] → Ent[ent_15]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [138](../raw_map.tsv:138) | Ralph Reed | Christian Coalition | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Ralph Reed → Christian Coalition: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [138](../raw_map.tsv:138).



