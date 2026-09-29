# audit_e318fe663470 — rel_90: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 4 supported, 1 incorrect, 0 ambiguous; N=5. Precision 4/5=80.00% to 4/5=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;officer-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;officer-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;restaurant-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-receive-&gt;prep-&gt;for-&gt;pobj-&gt;move-&gt;prep-&gt;to-&gt;pobj-&gt;museum-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-control&lt;-rcmod&lt;-company&lt;-nsubj&lt;-report-&gt;dobj-&gt;profit-&gt;prep-&gt;for-&gt;pobj-&gt;network-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-move-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-restaurant-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-smile&lt;-nsubj&lt;-await-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;close-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;co-owns-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;comment-&gt;prep-&gt;on-&gt;pobj-&gt;selection-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;now-&gt;dep-&gt;\|dep |
| 1 | rcmod\|-&gt;rcmod-&gt;open-&gt;dobj-&gt;\|dobjèce_,_whose_owner_,_Ark_Restaurants_,_has_struggled_to_build_a_new_identity_after_acquiring_it_from_André_Soltner_. lex#,_who_triumphantly_opened pos#,_WP_RB_VBD lc#For_every rc#after |
| 1 | rcmod\|-&gt;rcmod-&gt;partner-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;transport-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_90__ent_337__ent_579

**All observed names:** Sirio Maccioni → Le Cirque (9)

Ordered IDs: Ent[ent_337] → Ent[ent_579]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1425](../raw_map.tsv:1425) | Sirio Maccioni | Le Cirque | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1427](../raw_map.tsv:1427) | Sirio Maccioni | Le Cirque | rcmod\|-&gt;rcmod-&gt;close-&gt;dobj-&gt;\|dobj |
| [1428](../raw_map.tsv:1428) | Sirio Maccioni | Le Cirque | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;restaurant-&gt;nn-&gt;\|nn |
| [1429](../raw_map.tsv:1429) | Sirio Maccioni | Le Cirque | rcmod\|-&gt;rcmod-&gt;transport-&gt;dobj-&gt;\|dobj |
| [1430](../raw_map.tsv:1430) | Sirio Maccioni | Le Cirque | rcmod\|-&gt;rcmod-&gt;open-&gt;dobj-&gt;\|dobjèce_,_whose_owner_,_Ark_Restaurants_,_has_struggled_to_build_a_new_identity_after_acquiring_it_from_André_Soltner_. lex#,_who_triumphantly_opened pos#,_WP_RB_VBD lc#For_every rc#after |
| [1431](../raw_map.tsv:1431) | Sirio Maccioni | Le Cirque | rcmod\|-&gt;rcmod-&gt;now-&gt;dep-&gt;\|dep |
| [1432](../raw_map.tsv:1432) | Sirio Maccioni | Le Cirque | poss\|&lt;-poss&lt;-smile&lt;-nsubj&lt;-await-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1433](../raw_map.tsv:1433) | Sirio Maccioni | Le Cirque | poss\|&lt;-poss&lt;-restaurant-&gt;appos-&gt;\|appos |
| [1434](../raw_map.tsv:1434) | Sirio Maccioni | Le Cirque | poss\|&lt;-poss&lt;-move-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sirio Maccioni → Le Cirque: At least one explicit owner/co-owner/co-owns row establishes full or partial ownership of the identified business or team.

Cited evidence lines: [1425](../raw_map.tsv:1425), [1427](../raw_map.tsv:1427), [1428](../raw_map.tsv:1428), [1429](../raw_map.tsv:1429), [1430](../raw_map.tsv:1430), [1431](../raw_map.tsv:1431), [1432](../raw_map.tsv:1432), [1433](../raw_map.tsv:1433), [1434](../raw_map.tsv:1434).


Issue tags: mixed_evidence

### rel_90__ent_1034__ent_1035

**All observed names:** Danny Meyer → Union Square Cafe (5)

Ordered IDs: Ent[ent_1034] → Ent[ent_1035]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1435](../raw_map.tsv:1435) | Danny Meyer | Union Square Cafe | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1437](../raw_map.tsv:1437) | Danny Meyer | Union Square Cafe | appos\|-&gt;appos-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1439](../raw_map.tsv:1439) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;partner-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [1443](../raw_map.tsv:1443) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;co-owns-&gt;dobj-&gt;\|dobj |
| [1444](../raw_map.tsv:1444) | Danny Meyer | Union Square Cafe | rcmod\|-&gt;rcmod-&gt;comment-&gt;prep-&gt;on-&gt;pobj-&gt;selection-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Danny Meyer → Union Square Cafe: At least one explicit owner/co-owner/co-owns row establishes full or partial ownership of the identified business or team.

Cited evidence lines: [1435](../raw_map.tsv:1435), [1437](../raw_map.tsv:1437), [1439](../raw_map.tsv:1439), [1443](../raw_map.tsv:1443), [1444](../raw_map.tsv:1444).


Issue tags: mixed_evidence

### rel_90__ent_107__ent_561

**All observed names:** John Mara → Giants (4)

Ordered IDs: Ent[ent_107] → Ent[ent_561]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1697](../raw_map.tsv:1697) | John Mara | Giants | appos\|-&gt;appos-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1701](../raw_map.tsv:1701) | John Mara | Giants | appos\|-&gt;appos-&gt;officer-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1702](../raw_map.tsv:1702) | John Mara | Giants | appos\|-&gt;appos-&gt;officer-&gt;poss-&gt;\|poss |
| [1703](../raw_map.tsv:1703) | John Mara | Giants | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). John Mara → Giants: At least one explicit owner/co-owner/co-owns row establishes full or partial ownership of the identified business or team.

Cited evidence lines: [1697](../raw_map.tsv:1697), [1701](../raw_map.tsv:1701), [1702](../raw_map.tsv:1702), [1703](../raw_map.tsv:1703).


Issue tags: mixed_evidence

### rel_90__ent_151__ent_1433

**All observed names:** Rupert Murdoch → Fox (3)

Ordered IDs: Ent[ent_151] → Ent[ent_1433]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6015](../raw_map.tsv:6015) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;poss-&gt;\|poss |
| [6018](../raw_map.tsv:6018) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6019](../raw_map.tsv:6019) | Rupert Murdoch | Fox | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-control&lt;-rcmod&lt;-company&lt;-nsubj&lt;-report-&gt;dobj-&gt;profit-&gt;prep-&gt;for-&gt;pobj-&gt;network-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rupert Murdoch → Fox: At least one explicit owner/co-owner/co-owns row establishes full or partial ownership of the identified business or team.

Cited evidence lines: [6015](../raw_map.tsv:6015), [6018](../raw_map.tsv:6018), [6019](../raw_map.tsv:6019).


Issue tags: mixed_evidence

### rel_90__ent_864__ent_216

**All observed names:** Barnes Foundation → Philadelphia (1)

Ordered IDs: Ent[ent_864] → Ent[ent_216]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4859](../raw_map.tsv:4859) | Barnes Foundation | Philadelphia | nsubj\|&lt;-nsubj&lt;-receive-&gt;prep-&gt;for-&gt;pobj-&gt;move-&gt;prep-&gt;to-&gt;pobj-&gt;museum-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Barnes Foundation → Philadelphia: A museum moving to a city does not establish ownership of that city.

Cited evidence lines: [4859](../raw_map.tsv:4859).



