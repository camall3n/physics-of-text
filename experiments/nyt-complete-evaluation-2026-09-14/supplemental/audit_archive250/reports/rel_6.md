# audit_archive250 — rel_6: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 9 supported, 4 incorrect, 3 ambiguous; N=16. Precision 9/16=56.25% to 12/16=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;scientist-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_6__ent_58__ent_86

**All observed names:** Lee E. Koppelman → Long Island Regional Planning Board (1); Louis J. Freeh → Federal Bureau of Investigation (1)

Ordered IDs: Ent[ent_58] → Ent[ent_86]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [185](../raw_map.tsv:185) | Louis J. Freeh | Federal Bureau of Investigation | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [187](../raw_map.tsv:187) | Lee E. Koppelman | Long Island Regional Planning Board | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Lee E. Koppelman → Long Island Regional Planning Board; Louis J. Freeh → Federal Bureau of Investigation: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [185](../raw_map.tsv:185), [187](../raw_map.tsv:187).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_6__ent_82__ent_45

**All observed names:** Kate Michelman → National Abortion Rights Action League (1); Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_82] → Ent[ent_45]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [189](../raw_map.tsv:189) | Kate Michelman | National Abortion Rights Action League | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [193](../raw_map.tsv:193) | Richard A. Gephardt | House | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Kate Michelman → National Abortion Rights Action League; Richard A. Gephardt → House: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [189](../raw_map.tsv:189), [193](../raw_map.tsv:193).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_6__ent_23__ent_156

**All observed names:** Sean McCormack → State Department (1); Wen Ho Lee → Los Alamos (1)

Ordered IDs: Ent[ent_23] → Ent[ent_156]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [197](../raw_map.tsv:197) | Sean McCormack | State Department | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| [202](../raw_map.tsv:202) | Wen Ho Lee | Los Alamos | appos\|-&gt;appos-&gt;scientist-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Sean McCormack → State Department; Wen Ho Lee → Los Alamos: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [197](../raw_map.tsv:197), [202](../raw_map.tsv:202).


Issue tags: wrong_predicate

### rel_6__ent_252__ent_92

**All observed names:** Dr. Arthur Caplan → Center for Bioethics (1)

Ordered IDs: Ent[ent_252] → Ent[ent_92]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [184](../raw_map.tsv:184) | Dr. Arthur Caplan | Center for Bioethics | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dr. Arthur Caplan → Center for Bioethics: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [184](../raw_map.tsv:184).




### rel_6__ent_2__ent_147

**All observed names:** Blair Horner → New York Public Interest Research Group (1)

Ordered IDs: Ent[ent_2] → Ent[ent_147]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [186](../raw_map.tsv:186) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Blair Horner → New York Public Interest Research Group: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [186](../raw_map.tsv:186).




### rel_6__ent_101__ent_83

**All observed names:** Norman Siegel → New York Civil Liberties Union (1)

Ordered IDs: Ent[ent_101] → Ent[ent_83]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [188](../raw_map.tsv:188) | Norman Siegel | New York Civil Liberties Union | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Norman Siegel → New York Civil Liberties Union: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [188](../raw_map.tsv:188).




### rel_6__ent_52__ent_3

**All observed names:** Bob Dole → Senate (1)

Ordered IDs: Ent[ent_52] → Ent[ent_3]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [190](../raw_map.tsv:190) | Bob Dole | Senate | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bob Dole → Senate: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [190](../raw_map.tsv:190).




### rel_6__ent_260__ent_40

**All observed names:** Joseph L. Bruno → Republican (1)

Ordered IDs: Ent[ent_260] → Ent[ent_40]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [191](../raw_map.tsv:191) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Joseph L. Bruno → Republican: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [191](../raw_map.tsv:191).




### rel_6__ent_66__ent_40

**All observed names:** Radovan Karadzic → Bosnian Serb (1)

Ordered IDs: Ent[ent_66] → Ent[ent_40]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [192](../raw_map.tsv:192) | Radovan Karadzic | Bosnian Serb | appos\|-&gt;appos-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Radovan Karadzic → Bosnian Serb: Bosnian Serb is a singular nationality descriptor rather than the fully identified political group.

Cited evidence lines: [192](../raw_map.tsv:192).

**Review question:** Is the intended organization or people group Bosnian Serbs, and what institution is meant?
Issue tags: truncated_entity

### rel_6__ent_122__ent_59

**All observed names:** Thomas Mayer → Deutsche Bank (1)

Ordered IDs: Ent[ent_122] → Ent[ent_59]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [194](../raw_map.tsv:194) | Thomas Mayer | Deutsche Bank | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Thomas Mayer → Deutsche Bank: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [194](../raw_map.tsv:194).


Issue tags: wrong_predicate

### rel_6__ent_49__ent_63

**All observed names:** Bruce Steinberg → Merrill Lynch (1)

Ordered IDs: Ent[ent_49] → Ent[ent_63]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [195](../raw_map.tsv:195) | Bruce Steinberg | Merrill Lynch | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bruce Steinberg → Merrill Lynch: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [195](../raw_map.tsv:195).


Issue tags: wrong_predicate

### rel_6__ent_96__ent_132

**All observed names:** William V. Sullivan Jr. → Witter Reynolds (1)

Ordered IDs: Ent[ent_96] → Ent[ent_132]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [196](../raw_map.tsv:196) | William V. Sullivan Jr. | Witter Reynolds | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William V. Sullivan Jr. → Witter Reynolds: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [196](../raw_map.tsv:196).




### rel_6__ent_233__ent_35

**All observed names:** Federal National Mortgage Association → Fannie Mae (1)

Ordered IDs: Ent[ent_233] → Ent[ent_35]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [198](../raw_map.tsv:198) | Federal National Mortgage Association | Fannie Mae | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Federal National Mortgage Association → Fannie Mae: The supplied rows establish an academic, economist, analyst, spokesperson or alias relation, without a qualifying managerial office in the ordered direction.

Cited evidence lines: [198](../raw_map.tsv:198).


Issue tags: wrong_predicate

### rel_6__ent_153__ent_157

**All observed names:** Gen. Colin L. Powell → Joint Chiefs of Staff (1)

Ordered IDs: Ent[ent_153] → Ent[ent_157]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [199](../raw_map.tsv:199) | Gen. Colin L. Powell | Joint Chiefs of Staff | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Gen. Colin L. Powell → Joint Chiefs of Staff: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [199](../raw_map.tsv:199).




### rel_6__ent_45__ent_184

**All observed names:** Glen Sather → Rangers (1)

Ordered IDs: Ent[ent_45] → Ent[ent_184]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [200](../raw_map.tsv:200) | Glen Sather | Rangers | appos\|-&gt;appos-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Glen Sather → Rangers: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [200](../raw_map.tsv:200).




### rel_6__ent_264__ent_244

**All observed names:** Alan Greenspan → Fed (1)

Ordered IDs: Ent[ent_264] → Ent[ent_244]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [201](../raw_map.tsv:201) | Alan Greenspan | Fed | appos\|-&gt;appos-&gt;chairman-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Alan Greenspan → Fed: An explicit president, director, chairman, manager or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [201](../raw_map.tsv:201).



