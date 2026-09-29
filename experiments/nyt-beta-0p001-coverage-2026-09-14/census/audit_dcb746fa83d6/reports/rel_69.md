# audit_dcb746fa83d6 — rel_69: lawyer or attorney for

Predicate ID: lawyer_for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

Complete census: 2 supported, 3 incorrect, 0 ambiguous; N=5. Precision 2/5=40.00% to 2/5=40.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-yesterday&lt;-tmod&lt;-say-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-entice-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-hold-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-lure-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;co-signed-&gt;dobj-&gt;indictment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;sign-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_69__ent_610__ent_843

**All observed names:** Olympics → New York (5)

Ordered IDs: Ent[ent_610] → Ent[ent_843]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4770](../raw_map.tsv:4770) | Olympics | New York | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4772](../raw_map.tsv:4772) | Olympics | New York | dobj\|&lt;-dobj&lt;-lure-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4774](../raw_map.tsv:4774) | Olympics | New York | dobj\|&lt;-dobj&lt;-hold-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4775](../raw_map.tsv:4775) | Olympics | New York | dobj\|&lt;-dobj&lt;-entice-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [4777](../raw_map.tsv:4777) | Olympics | New York | partmod\|-&gt;partmod-&gt;come-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Olympics → New York: Event hosting or sports personnel and team movement is not legal representation.

Cited evidence lines: [4770](../raw_map.tsv:4770), [4772](../raw_map.tsv:4772), [4774](../raw_map.tsv:4774), [4775](../raw_map.tsv:4775), [4777](../raw_map.tsv:4777).




### rel_69__ent_756__ent_537

**All observed names:** Mary Jo White → United States (4)

Ordered IDs: Ent[ent_756] → Ent[ent_537]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8325](../raw_map.tsv:8325) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| [8327](../raw_map.tsv:8327) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8328](../raw_map.tsv:8328) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8330](../raw_map.tsv:8330) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;co-signed-&gt;dobj-&gt;indictment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mary Jo White → United States: Explicit United States attorney service and legal-office actions establish the governmental attorney role.

Cited evidence lines: [8325](../raw_map.tsv:8325), [8327](../raw_map.tsv:8327), [8328](../raw_map.tsv:8328), [8330](../raw_map.tsv:8330).


Issue tags: mixed_evidence

### rel_69__ent_516__ent_517

**All observed names:** Michael J. Garcia → United States (4)

Ordered IDs: Ent[ent_516] → Ent[ent_517]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8373](../raw_map.tsv:8373) | Michael J. Garcia | United States | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8374](../raw_map.tsv:8374) | Michael J. Garcia | United States | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8377](../raw_map.tsv:8377) | Michael J. Garcia | United States | appos\|&lt;-appos&lt;-yesterday&lt;-tmod&lt;-say-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8380](../raw_map.tsv:8380) | Michael J. Garcia | United States | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Michael J. Garcia → United States: Explicit United States attorney service and legal-office actions establish the governmental attorney role.

Cited evidence lines: [8373](../raw_map.tsv:8373), [8374](../raw_map.tsv:8374), [8377](../raw_map.tsv:8377), [8380](../raw_map.tsv:8380).


Issue tags: mixed_evidence

### rel_69__ent_63__ent_543

**All observed names:** Richard Jefferson → Nets (3)

Ordered IDs: Ent[ent_63] → Ent[ent_543]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3097](../raw_map.tsv:3097) | Richard Jefferson | Nets | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [3099](../raw_map.tsv:3099) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;sign-&gt;nsubj-&gt;\|nsubj |
| [3102](../raw_map.tsv:3102) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Richard Jefferson → Nets: Event hosting or sports personnel and team movement is not legal representation.

Cited evidence lines: [3097](../raw_map.tsv:3097), [3099](../raw_map.tsv:3099), [3102](../raw_map.tsv:3102).




### rel_69__ent_1374__ent_897

**All observed names:** Dodgers → Brooklyn (1)

Ordered IDs: Ent[ent_1374] → Ent[ent_897]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4063](../raw_map.tsv:4063) | Dodgers | Brooklyn | dobj\|&lt;-dobj&lt;-bring-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Dodgers → Brooklyn: Event hosting or sports personnel and team movement is not legal representation.

Cited evidence lines: [4063](../raw_map.tsv:4063).



