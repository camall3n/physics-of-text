# audit_dcb746fa83d6 — rel_76: executive of

Predicate ID: executive_of

Person X holds or held an explicitly identified executive office in organization or governmental jurisdiction Y.

Includes: executive/chief executive office; corporate and county executive; explicit historical executive office. Excludes: chair/director/president/head alone without executive title; hired by an executive; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: title/attachment omits who holds the executive office.

Complete census: 3 supported, 4 incorrect, 0 ambiguous; N=7. Precision 3/7=42.86% to 3/7=42.86%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |
| 2 | nn\|&lt;-nn&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;counterpart-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-wo-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-elect-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president&lt;-dobj&lt;-elevate-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-membership-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-week&lt;-tmod&lt;-begin-&gt;prep-&gt;as-&gt;pobj-&gt;executive-elect-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_76__ent_742__ent_984

**All observed names:** Andrew J. Spano → Westchester County (4)

Ordered IDs: Ent[ent_742] → Ent[ent_984]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8069](../raw_map.tsv:8069) | Andrew J. Spano | Westchester County | appos\|-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |
| [8072](../raw_map.tsv:8072) | Andrew J. Spano | Westchester County | poss\|&lt;-poss&lt;-week&lt;-tmod&lt;-begin-&gt;prep-&gt;as-&gt;pobj-&gt;executive-elect-&gt;nn-&gt;\|nn |
| [8074](../raw_map.tsv:8074) | Andrew J. Spano | Westchester County | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [8076](../raw_map.tsv:8076) | Andrew J. Spano | Westchester County | nsubj\|&lt;-nsubj&lt;-elect-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Andrew J. Spano → Westchester County: An explicit appositional executive title establishes executive office in the county or team.

Cited evidence lines: [8069](../raw_map.tsv:8069), [8072](../raw_map.tsv:8072), [8074](../raw_map.tsv:8074), [8076](../raw_map.tsv:8076).


Issue tags: mixed_evidence

### rel_76__ent_1309__ent_743

**All observed names:** Thomas S. Gulotta → Nassau County (3)

Ordered IDs: Ent[ent_1309] → Ent[ent_743]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8104](../raw_map.tsv:8104) | Thomas S. Gulotta | Nassau County | appos\|-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |
| [8107](../raw_map.tsv:8107) | Thomas S. Gulotta | Nassau County | appos\|-&gt;appos-&gt;counterpart-&gt;nn-&gt;\|nn |
| [8113](../raw_map.tsv:8113) | Thomas S. Gulotta | Nassau County | dep\|&lt;-dep&lt;-wo-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Thomas S. Gulotta → Nassau County: An explicit appositional executive title establishes executive office in the county or team.

Cited evidence lines: [8104](../raw_map.tsv:8104), [8107](../raw_map.tsv:8107), [8113](../raw_map.tsv:8113).


Issue tags: mixed_evidence

### rel_76__ent_517__ent_1351

**All observed names:** United States → Iran (2)

Ordered IDs: Ent[ent_517] → Ent[ent_1351]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5513](../raw_map.tsv:5513) | United States | Iran | nn\|&lt;-nn&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7893](../raw_map.tsv:7893) | United States | Iran | nn\|&lt;-nn&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Iran: Sales, institutional membership, generic officials or an inverse Senate-to-person appointment do not establish the declared executive role.

Cited evidence lines: [5513](../raw_map.tsv:5513), [7893](../raw_map.tsv:7893).




### rel_76__ent_598__ent_412

**All observed names:** Joe McIlvaine → Mets (1)

Ordered IDs: Ent[ent_598] → Ent[ent_412]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1692](../raw_map.tsv:1692) | Joe McIlvaine | Mets | appos\|-&gt;appos-&gt;executive-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Joe McIlvaine → Mets: An explicit appositional executive title establishes executive office in the county or team.

Cited evidence lines: [1692](../raw_map.tsv:1692).




### rel_76__ent_1206__ent_1196

**All observed names:** China → World Trade Organization (1)

Ordered IDs: Ent[ent_1206] → Ent[ent_1196]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1924](../raw_map.tsv:1924) | China | World Trade Organization | poss\|&lt;-poss&lt;-membership-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). China → World Trade Organization: Sales, institutional membership, generic officials or an inverse Senate-to-person appointment do not establish the declared executive role.

Cited evidence lines: [1924](../raw_map.tsv:1924).




### rel_76__ent_1389__ent_1002

**All observed names:** Bush → Washington (1)

Ordered IDs: Ent[ent_1389] → Ent[ent_1002]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5249](../raw_map.tsv:5249) | Bush | Washington | nn\|&lt;-nn&lt;-official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bush → Washington: Sales, institutional membership, generic officials or an inverse Senate-to-person appointment do not establish the declared executive role.

Cited evidence lines: [5249](../raw_map.tsv:5249).




### rel_76__ent_502__ent_930

**All observed names:** Senate → Donald T. DiFrancesco (1)

Ordered IDs: Ent[ent_502] → Ent[ent_930]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6779](../raw_map.tsv:6779) | Senate | Donald T. DiFrancesco | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president&lt;-dobj&lt;-elevate-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Senate → Donald T. DiFrancesco: Sales, institutional membership, generic officials or an inverse Senate-to-person appointment do not establish the declared executive role.

Cited evidence lines: [6779](../raw_map.tsv:6779).



