# audit_e318fe663470 — rel_84: geographical part of

Predicate ID: geographic_part_of

Named geographic area, neighborhood or district X is contained within geographic place Y.

Includes: area/section/neighborhood/district of or in; clear place-to-containing-place attachment. Excludes: organization subsidiary or location; residence/work/travel; an event in a place. Ambiguous unless resolved by case-local evidence: place names attached through an omitted institution.

Complete census: 7 supported, 0 incorrect, 1 ambiguous; N=8. Precision 7/8=87.50% to 8/8=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;neighborhood-&gt;nn-&gt;\|nn |
| 4 | nn\|&lt;-nn&lt;-neighborhood-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-district-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-disturbance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-riot-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-trial-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-burglarize&lt;-csubj&lt;-venture-&gt;appos-&gt;time-&gt;dep-&gt;cause-&gt;prep-&gt;in-&gt;pobj-&gt;neighborhood-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-grow-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-school-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_84__ent_865__ent_1387

**All observed names:** Crown Heights → Brooklyn (6)

Ordered IDs: Ent[ent_865] → Ent[ent_1387]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1130](../raw_map.tsv:1130) | Crown Heights | Brooklyn | nn\|&lt;-nn&lt;-neighborhood-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1131](../raw_map.tsv:1131) | Crown Heights | Brooklyn | appos\|-&gt;appos-&gt;neighborhood-&gt;nn-&gt;\|nn |
| [1133](../raw_map.tsv:1133) | Crown Heights | Brooklyn | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1135](../raw_map.tsv:1135) | Crown Heights | Brooklyn | nn\|&lt;-nn&lt;-trial-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1136](../raw_map.tsv:1136) | Crown Heights | Brooklyn | nn\|&lt;-nn&lt;-riot-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1137](../raw_map.tsv:1137) | Crown Heights | Brooklyn | nn\|&lt;-nn&lt;-disturbance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Crown Heights → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1130](../raw_map.tsv:1130), [1131](../raw_map.tsv:1131), [1133](../raw_map.tsv:1133), [1135](../raw_map.tsv:1135), [1136](../raw_map.tsv:1136), [1137](../raw_map.tsv:1137).


Issue tags: mixed_evidence

### rel_84__ent_784__ent_1307

**All observed names:** Williamsburg → Brooklyn (3); Bensonhurst → Brooklyn (2)

Ordered IDs: Ent[ent_784] → Ent[ent_1307]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1109](../raw_map.tsv:1109) | Williamsburg | Brooklyn | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1112](../raw_map.tsv:1112) | Williamsburg | Brooklyn | nn\|&lt;-nn&lt;-neighborhood-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1117](../raw_map.tsv:1117) | Williamsburg | Brooklyn | appos\|-&gt;appos-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1144](../raw_map.tsv:1144) | Bensonhurst | Brooklyn | nn\|&lt;-nn&lt;-neighborhood-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1147](../raw_map.tsv:1147) | Bensonhurst | Brooklyn | appos\|-&gt;appos-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Williamsburg → Brooklyn; Bensonhurst → Brooklyn: Two different neighborhoods, Williamsburg and Bensonhurst, are merged as one inferred geographic subject.

Cited evidence lines: [1109](../raw_map.tsv:1109), [1112](../raw_map.tsv:1112), [1117](../raw_map.tsv:1117), [1144](../raw_map.tsv:1144), [1147](../raw_map.tsv:1147).

**Review question:** Should Williamsburg and Bensonhurst be separate inferred places?
Issue tags: entity_collision

### rel_84__ent_1063__ent_1341

**All observed names:** Bedford-Stuyvesant → Brooklyn (4)

Ordered IDs: Ent[ent_1063] → Ent[ent_1341]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1100](../raw_map.tsv:1100) | Bedford-Stuyvesant | Brooklyn | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1101](../raw_map.tsv:1101) | Bedford-Stuyvesant | Brooklyn | nn\|&lt;-nn&lt;-neighborhood-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1102](../raw_map.tsv:1102) | Bedford-Stuyvesant | Brooklyn | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-school-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1104](../raw_map.tsv:1104) | Bedford-Stuyvesant | Brooklyn | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-burglarize&lt;-csubj&lt;-venture-&gt;appos-&gt;time-&gt;dep-&gt;cause-&gt;prep-&gt;in-&gt;pobj-&gt;neighborhood-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bedford-Stuyvesant → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1100](../raw_map.tsv:1100), [1101](../raw_map.tsv:1101), [1102](../raw_map.tsv:1102), [1104](../raw_map.tsv:1104).


Issue tags: mixed_evidence

### rel_84__ent_575__ent_323

**All observed names:** Brownsville → Brooklyn (3)

Ordered IDs: Ent[ent_575] → Ent[ent_323]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1169](../raw_map.tsv:1169) | Brownsville | Brooklyn | nn\|&lt;-nn&lt;-district-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1171](../raw_map.tsv:1171) | Brownsville | Brooklyn | appos\|-&gt;appos-&gt;neighborhood-&gt;nn-&gt;\|nn |
| [1177](../raw_map.tsv:1177) | Brownsville | Brooklyn | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-grow-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Brownsville → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1169](../raw_map.tsv:1169), [1171](../raw_map.tsv:1171), [1177](../raw_map.tsv:1177).


Issue tags: mixed_evidence

### rel_84__ent_334__ent_1341

**All observed names:** Park Slope → Brooklyn (2)

Ordered IDs: Ent[ent_334] → Ent[ent_1341]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1151](../raw_map.tsv:1151) | Park Slope | Brooklyn | appos\|-&gt;appos-&gt;neighborhood-&gt;nn-&gt;\|nn |
| [1152](../raw_map.tsv:1152) | Park Slope | Brooklyn | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Park Slope → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1151](../raw_map.tsv:1151), [1152](../raw_map.tsv:1152).




### rel_84__ent_570__ent_1317

**All observed names:** East New York → Brooklyn (1)

Ordered IDs: Ent[ent_570] → Ent[ent_1317]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1084](../raw_map.tsv:1084) | East New York | Brooklyn | appos\|-&gt;appos-&gt;section-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). East New York → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1084](../raw_map.tsv:1084).




### rel_84__ent_1281__ent_1221

**All observed names:** Riverdale → Bronx (1)

Ordered IDs: Ent[ent_1281] → Ent[ent_1221]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1094](../raw_map.tsv:1094) | Riverdale | Bronx | nn\|&lt;-nn&lt;-area-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Riverdale → Bronx: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1094](../raw_map.tsv:1094).




### rel_84__ent_1036__ent_1317

**All observed names:** Flatbush → Brooklyn (1)

Ordered IDs: Ent[ent_1036] → Ent[ent_1317]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1121](../raw_map.tsv:1121) | Flatbush | Brooklyn | appos\|-&gt;appos-&gt;neighborhood-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Flatbush → Brooklyn: Local area/neighborhood/section/district wording establishes geographic containment within the stated borough.

Cited evidence lines: [1121](../raw_map.tsv:1121).



