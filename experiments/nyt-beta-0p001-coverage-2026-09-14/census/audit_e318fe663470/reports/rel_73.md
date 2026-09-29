# audit_e318fe663470 — rel_73: lawyer or attorney for

Predicate ID: lawyer_for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| 1 | dep\|-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-sit-&gt;prep-&gt;in-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-transfer-&gt;prep-&gt;at-&gt;pobj-&gt;time-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;share-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;nsubj-&gt;team-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_73__ent_1096__ent_718

**All observed names:** Joe Paterno → Penn State (5)

Ordered IDs: Ent[ent_1096] → Ent[ent_718]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7264](../raw_map.tsv:7264) | Joe Paterno | Penn State | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7267](../raw_map.tsv:7267) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;win-&gt;nsubj-&gt;team-&gt;nn-&gt;\|nn |
| [7268](../raw_map.tsv:7268) | Joe Paterno | Penn State | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| [7271](../raw_map.tsv:7271) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7272](../raw_map.tsv:7272) | Joe Paterno | Penn State | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;share-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Joe Paterno → Penn State: Coaching or presence in a collegiate athletic setting does not establish legal service.

Cited evidence lines: [7264](../raw_map.tsv:7264), [7267](../raw_map.tsv:7267), [7268](../raw_map.tsv:7268), [7271](../raw_map.tsv:7271), [7272](../raw_map.tsv:7272).




### rel_73__ent_947__ent_704

**All observed names:** Jim Boeheim → Syracuse (4)

Ordered IDs: Ent[ent_947] → Ent[ent_704]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7207](../raw_map.tsv:7207) | Jim Boeheim | Syracuse | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7209](../raw_map.tsv:7209) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-sit-&gt;prep-&gt;in-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| [7210](../raw_map.tsv:7210) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7211](../raw_map.tsv:7211) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Jim Boeheim → Syracuse: Coaching or presence in a collegiate athletic setting does not establish legal service.

Cited evidence lines: [7207](../raw_map.tsv:7207), [7209](../raw_map.tsv:7209), [7210](../raw_map.tsv:7210), [7211](../raw_map.tsv:7211).




### rel_73__ent_756__ent_537

**All observed names:** Mary Jo White → United States (4)

Ordered IDs: Ent[ent_756] → Ent[ent_537]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8326](../raw_map.tsv:8326) | Mary Jo White | United States | dep\|-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8328](../raw_map.tsv:8328) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8331](../raw_map.tsv:8331) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-transfer-&gt;prep-&gt;at-&gt;pobj-&gt;time-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8333](../raw_map.tsv:8333) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mary Jo White → United States: Explicit served-as-attorney and attorney-office departure wording establishes public legal office for the jurisdiction.

Cited evidence lines: [8326](../raw_map.tsv:8326), [8328](../raw_map.tsv:8328), [8331](../raw_map.tsv:8331), [8333](../raw_map.tsv:8333).



