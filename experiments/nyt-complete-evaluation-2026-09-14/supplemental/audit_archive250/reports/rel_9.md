# audit_archive250 — rel_9: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 11 supported, 3 incorrect, 1 ambiguous; N=15. Precision 11/15=73.33% to 12/15=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 3 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| 1 | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_9__ent_51__ent_232

**All observed names:** Donna Lieberman → New York Civil Liberties Union (1); Richard Berner → United States (1)

Ordered IDs: Ent[ent_51] → Ent[ent_232]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [239](../raw_map.tsv:239) | Donna Lieberman | New York Civil Liberties Union | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [248](../raw_map.tsv:248) | Richard Berner | United States | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Donna Lieberman → New York Civil Liberties Union; Richard Berner → United States: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [239](../raw_map.tsv:239), [248](../raw_map.tsv:248).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_9__ent_187__ent_259

**All observed names:** Ian Shepherdson → High Frequency Economics (1); Soviet → Mikhail S. Gorbachev (1)

Ordered IDs: Ent[ent_187] → Ent[ent_259]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [246](../raw_map.tsv:246) | Ian Shepherdson | High Frequency Economics | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [247](../raw_map.tsv:247) | Soviet | Mikhail S. Gorbachev | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Ian Shepherdson → High Frequency Economics; Soviet → Mikhail S. Gorbachev: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [246](../raw_map.tsv:246), [247](../raw_map.tsv:247).


Issue tags: wrong_predicate

### rel_9__ent_175__ent_136

**All observed names:** Philippe de Montebello → Metropolitan Museum of Art (1)

Ordered IDs: Ent[ent_175] → Ent[ent_136]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [235](../raw_map.tsv:235) | Philippe de Montebello | Metropolitan Museum of Art | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Philippe de Montebello → Metropolitan Museum of Art: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [235](../raw_map.tsv:235).




### rel_9__ent_87__ent_253

**All observed names:** Blair Horner → New York Public Interest Research Group (1)

Ordered IDs: Ent[ent_87] → Ent[ent_253]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [236](../raw_map.tsv:236) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Blair Horner → New York Public Interest Research Group: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [236](../raw_map.tsv:236).




### rel_9__ent_224__ent_90

**All observed names:** Dr. Anthony S. Fauci → National Institute of Allergy and Infectious Diseases (1)

Ordered IDs: Ent[ent_224] → Ent[ent_90]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [237](../raw_map.tsv:237) | Dr. Anthony S. Fauci | National Institute of Allergy and Infectious Diseases | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dr. Anthony S. Fauci → National Institute of Allergy and Infectious Diseases: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [237](../raw_map.tsv:237).




### rel_9__ent_154__ent_227

**All observed names:** William J. Casey → Central Intelligence (1)

Ordered IDs: Ent[ent_154] → Ent[ent_227]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [238](../raw_map.tsv:238) | William J. Casey | Central Intelligence | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William J. Casey → Central Intelligence: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [238](../raw_map.tsv:238).




### rel_9__ent_203__ent_137

**All observed names:** Dick Ebersol → NBC Sports (1)

Ordered IDs: Ent[ent_203] → Ent[ent_137]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [240](../raw_map.tsv:240) | Dick Ebersol | NBC Sports | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dick Ebersol → NBC Sports: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [240](../raw_map.tsv:240).




### rel_9__ent_232__ent_145

**All observed names:** Rocco Landesman → Jujamcyn Theaters (1)

Ordered IDs: Ent[ent_232] → Ent[ent_145]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [241](../raw_map.tsv:241) | Rocco Landesman | Jujamcyn Theaters | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rocco Landesman → Jujamcyn Theaters: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [241](../raw_map.tsv:241).




### rel_9__ent_224__ent_135

**All observed names:** Sandra Feldman → United Federation of Teachers (1)

Ordered IDs: Ent[ent_224] → Ent[ent_135]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [242](../raw_map.tsv:242) | Sandra Feldman | United Federation of Teachers | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sandra Feldman → United Federation of Teachers: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [242](../raw_map.tsv:242).




### rel_9__ent_39__ent_237

**All observed names:** Dick Armey → House (1)

Ordered IDs: Ent[ent_39] → Ent[ent_237]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [243](../raw_map.tsv:243) | Dick Armey | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Dick Armey → House: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [243](../raw_map.tsv:243).




### rel_9__ent_35__ent_254

**All observed names:** George J. Mitchell → Senate (1)

Ordered IDs: Ent[ent_35] → Ent[ent_254]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [244](../raw_map.tsv:244) | George J. Mitchell | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). George J. Mitchell → Senate: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [244](../raw_map.tsv:244).




### rel_9__ent_7__ent_160

**All observed names:** George J. Mitchell → Senate (1)

Ordered IDs: Ent[ent_7] → Ent[ent_160]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [245](../raw_map.tsv:245) | George J. Mitchell | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). George J. Mitchell → Senate: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [245](../raw_map.tsv:245).




### rel_9__ent_221__ent_56

**All observed names:** Federal Home Loan Mortgage Corp. → Freddie Mac (1)

Ordered IDs: Ent[ent_221] → Ent[ent_56]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [249](../raw_map.tsv:249) | Federal Home Loan Mortgage Corp. | Freddie Mac | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Federal Home Loan Mortgage Corp. → Freddie Mac: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [249](../raw_map.tsv:249).


Issue tags: wrong_predicate

### rel_9__ent_201__ent_181

**All observed names:** Yasir Arafat → Palestine Liberation Organization (1)

Ordered IDs: Ent[ent_201] → Ent[ent_181]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [250](../raw_map.tsv:250) | Yasir Arafat | Palestine Liberation Organization | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yasir Arafat → Palestine Liberation Organization: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [250](../raw_map.tsv:250).




### rel_9__ent_21__ent_185

**All observed names:** Ross K. Baker → Rutgers University (1)

Ordered IDs: Ent[ent_21] → Ent[ent_185]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [251](../raw_map.tsv:251) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ross K. Baker → Rutgers University: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [251](../raw_map.tsv:251).


Issue tags: wrong_predicate
