# audit_archive250 — rel_1: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 6 supported, 2 incorrect, 2 ambiguous; N=10. Precision 6/10=60.00% to 8/10=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_1__ent_34__ent_48

**All observed names:** C. Virginia Fields → Manhattan (1); Haley Barbour → Republican National Committee (1)

Ordered IDs: Ent[ent_34] → Ent[ent_48]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [23](../raw_map.tsv:23) | Haley Barbour | Republican National Committee | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [25](../raw_map.tsv:25) | C. Virginia Fields | Manhattan | appos\|-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). C. Virginia Fields → Manhattan; Haley Barbour → Republican National Committee: Supporting office evidence shares its inferred fact with incompatible local person or institution names; its entity pair is unresolved.

Cited evidence lines: [23](../raw_map.tsv:23), [25](../raw_map.tsv:25).

**Review question:** Which local names identify the intended entity pair, and should these incompatible names be separated?
Issue tags: local_entity_collision

### rel_1__ent_74__ent_169

**All observed names:** Gen. Colin L. Powell → Joint Chiefs of Staff (1)

Ordered IDs: Ent[ent_74] → Ent[ent_169]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [20](../raw_map.tsv:20) | Gen. Colin L. Powell | Joint Chiefs of Staff | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Gen. Colin L. Powell → Joint Chiefs of Staff: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [20](../raw_map.tsv:20).




### rel_1__ent_209__ent_237

**All observed names:** Dan Rostenkowski → House Ways and Means Committee (1)

Ordered IDs: Ent[ent_209] → Ent[ent_237]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [21](../raw_map.tsv:21) | Dan Rostenkowski | House Ways and Means Committee | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dan Rostenkowski → House Ways and Means Committee: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [21](../raw_map.tsv:21).




### rel_1__ent_45__ent_228

**All observed names:** Charles A. Gargano → Empire State Development Corporation (1)

Ordered IDs: Ent[ent_45] → Ent[ent_228]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [22](../raw_map.tsv:22) | Charles A. Gargano | Empire State Development Corporation | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Charles A. Gargano → Empire State Development Corporation: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [22](../raw_map.tsv:22).




### rel_1__ent_24__ent_128

**All observed names:** Raymond D. Horton → Citizens Budget Commission (1)

Ordered IDs: Ent[ent_24] → Ent[ent_128]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [24](../raw_map.tsv:24) | Raymond D. Horton | Citizens Budget Commission | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raymond D. Horton → Citizens Budget Commission: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [24](../raw_map.tsv:24).




### rel_1__ent_102__ent_38

**All observed names:** Republican → Judiciary Committee (1)

Ordered IDs: Ent[ent_102] → Ent[ent_38]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [26](../raw_map.tsv:26) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Republican → Judiciary Committee: The office is explicit, but Republican is an unnamed party member rather than an identified officeholder.

Cited evidence lines: [26](../raw_map.tsv:26).

**Review question:** Which Republican individual is chairman of the Judiciary Committee?
Issue tags: underspecified_identity

### rel_1__ent_170__ent_45

**All observed names:** Ian Shepherdson → United States (1)

Ordered IDs: Ent[ent_170] → Ent[ent_45]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [27](../raw_map.tsv:27) | Ian Shepherdson | United States | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Ian Shepherdson → United States: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [27](../raw_map.tsv:27).


Issue tags: wrong_predicate

### rel_1__ent_87__ent_84

**All observed names:** Tony Snow → White House (1)

Ordered IDs: Ent[ent_87] → Ent[ent_84]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [28](../raw_map.tsv:28) | Tony Snow | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Tony Snow → White House: The supplied rows establish academic, economist, analyst, spokesperson, alias or party-control relations, without a qualifying personal managerial office in the ordered direction.

Cited evidence lines: [28](../raw_map.tsv:28).


Issue tags: wrong_predicate

### rel_1__ent_222__ent_46

**All observed names:** Louis Farrakhan → Nation of Islam (1)

Ordered IDs: Ent[ent_222] → Ent[ent_46]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [29](../raw_map.tsv:29) | Louis Farrakhan | Nation of Islam | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Louis Farrakhan → Nation of Islam: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [29](../raw_map.tsv:29).




### rel_1__ent_100__ent_250

**All observed names:** Kathleen Hall Jamieson → University of Pennsylvania (1)

Ordered IDs: Ent[ent_100] → Ent[ent_250]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [30](../raw_map.tsv:30) | Kathleen Hall Jamieson | University of Pennsylvania | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Kathleen Hall Jamieson → University of Pennsylvania: An explicit president, director, chairman, manager, dean, chief or legislative leadership title establishes a qualifying office in the named institution.

Cited evidence lines: [30](../raw_map.tsv:30).



