# audit_dcb746fa83d6 — rel_88: has minister

Predicate ID: has_minister

Country, government, or political administration X has or had person Y as an explicitly identified minister.

Includes: explicit minister of X or X's minister; a portfolio or prime minister office explicitly attached to X; historical ministerial office. Excludes: ordinary official, ambassador, or opposition politician without minister title; a minister of a different government merely meeting X; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: an incomplete national adjective in the institution slot; minister-designate without established tenure; unclear portfolio or government attachment. The inverse ministerial office does not assert that every minister is the head of government.

Complete census: 3 supported, 1 incorrect, 0 ambiguous; N=4. Precision 3/4=75.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| 2 | rcmod\|-&gt;rcmod-&gt;work-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-panic-&gt;prep-&gt;over-&gt;pobj-&gt;devaluation-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-establishment&lt;-nsubj&lt;-rally-&gt;prep-&gt;around-&gt;pobj-&gt;policy-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-friend-&gt;dep-&gt;declare-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-by&lt;-prep&lt;-applaud-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-meeting&lt;-pobj&lt;-after&lt;-prep&lt;-say-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-raise&lt;-rcmod&lt;-situation-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-official&lt;-nsubj&lt;-raise-&gt;prep-&gt;follow-&gt;prep-&gt;on-&gt;pobj-&gt;promise-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;cross-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;seem-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;supportive-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_88__ent_492__ent_707

**All observed names:** Iraq → Tariq Aziz (8)

Ordered IDs: Ent[ent_492] → Ent[ent_707]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6987](../raw_map.tsv:6987) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [6988](../raw_map.tsv:6988) | Iraq | Tariq Aziz | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [6989](../raw_map.tsv:6989) | Iraq | Tariq Aziz | rcmod\|-&gt;rcmod-&gt;cross-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6991](../raw_map.tsv:6991) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-raise&lt;-rcmod&lt;-situation-&gt;appos-&gt;\|appos |
| [6992](../raw_map.tsv:6992) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-meeting&lt;-pobj&lt;-after&lt;-prep&lt;-say-&gt;appos-&gt;\|appos |
| [6993](../raw_map.tsv:6993) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-by&lt;-prep&lt;-applaud-&gt;dobj-&gt;\|dobj |
| [6994](../raw_map.tsv:6994) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [6996](../raw_map.tsv:6996) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-friend-&gt;dep-&gt;declare-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Iraq → Tariq Aziz: Explicit country minister apposition establishes the named ministerial office without assuming head-of-government rank.

Cited evidence lines: [6987](../raw_map.tsv:6987), [6988](../raw_map.tsv:6988), [6989](../raw_map.tsv:6989), [6991](../raw_map.tsv:6991), [6992](../raw_map.tsv:6992), [6993](../raw_map.tsv:6993), [6994](../raw_map.tsv:6994), [6996](../raw_map.tsv:6996).


Issue tags: mixed_evidence

### rel_88__ent_1386__ent_706

**All observed names:** Britain → Tony Blair (6)

Ordered IDs: Ent[ent_1386] → Ent[ent_706]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7007](../raw_map.tsv:7007) | Britain | Tony Blair | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7009](../raw_map.tsv:7009) | Britain | Tony Blair | poss\|&lt;-poss&lt;-official&lt;-nsubj&lt;-raise-&gt;prep-&gt;follow-&gt;prep-&gt;on-&gt;pobj-&gt;promise-&gt;poss-&gt;\|poss |
| [7010](../raw_map.tsv:7010) | Britain | Tony Blair | poss\|&lt;-poss&lt;-establishment&lt;-nsubj&lt;-rally-&gt;prep-&gt;around-&gt;pobj-&gt;policy-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7011](../raw_map.tsv:7011) | Britain | Tony Blair | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [7015](../raw_map.tsv:7015) | Britain | Tony Blair | rcmod\|-&gt;rcmod-&gt;supportive-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |
| [7016](../raw_map.tsv:7016) | Britain | Tony Blair | rcmod\|-&gt;rcmod-&gt;seem-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Britain → Tony Blair: Explicit country minister apposition establishes the named ministerial office without assuming head-of-government rank.

Cited evidence lines: [7007](../raw_map.tsv:7007), [7009](../raw_map.tsv:7009), [7010](../raw_map.tsv:7010), [7011](../raw_map.tsv:7011), [7015](../raw_map.tsv:7015), [7016](../raw_map.tsv:7016).


Issue tags: mixed_evidence

### rel_88__ent_104__ent_347

**All observed names:** Neil Smith → Rangers (2)

Ordered IDs: Ent[ent_104] → Ent[ent_347]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1662](../raw_map.tsv:1662) | Neil Smith | Rangers | rcmod\|-&gt;rcmod-&gt;work-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3329](../raw_map.tsv:3329) | Neil Smith | Rangers | rcmod\|-&gt;rcmod-&gt;work-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Neil Smith → Rangers: Working for a sporting team has the wrong institutional and argument roles for a country having a minister.

Cited evidence lines: [1662](../raw_map.tsv:1662), [3329](../raw_map.tsv:3329).




### rel_88__ent_1425__ent_1132

**All observed names:** Israel → Shimon Peres (2)

Ordered IDs: Ent[ent_1425] → Ent[ent_1132]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7017](../raw_map.tsv:7017) | Israel | Shimon Peres | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7022](../raw_map.tsv:7022) | Israel | Shimon Peres | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-panic-&gt;prep-&gt;over-&gt;pobj-&gt;devaluation-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Israel → Shimon Peres: Explicit country minister apposition establishes the named ministerial office without assuming head-of-government rank.

Cited evidence lines: [7017](../raw_map.tsv:7017), [7022](../raw_map.tsv:7022).


Issue tags: mixed_evidence
