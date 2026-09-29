# audit_dcb746fa83d6 — rel_27: lawyer or attorney for

Predicate ID: lawyer_for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

Complete census: 3 supported, 2 incorrect, 0 ambiguous; N=5. Precision 3/5=60.00% to 3/5=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;leader-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 2 | dep\|-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-prosecute-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-son-&gt;appos-&gt;\|appos |
| 1 | appos\|&lt;-appos&lt;-thing&lt;-nsubj&lt;-convene-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-rush-&gt;dobj-&gt;house-&gt;prep-&gt;at-&gt;pobj-&gt;street-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-from&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_27__ent_514__ent_1254

**All observed names:** Richard A. Brown → Queens (7)

Ordered IDs: Ent[ent_514] → Ent[ent_1254]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8304](../raw_map.tsv:8304) | Richard A. Brown | Queens | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8305](../raw_map.tsv:8305) | Richard A. Brown | Queens | appos\|&lt;-appos&lt;-son-&gt;appos-&gt;\|appos |
| [8309](../raw_map.tsv:8309) | Richard A. Brown | Queens | nsubj\|&lt;-nsubj&lt;-rush-&gt;dobj-&gt;house-&gt;prep-&gt;at-&gt;pobj-&gt;street-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8310](../raw_map.tsv:8310) | Richard A. Brown | Queens | nsubj\|&lt;-nsubj&lt;-prosecute-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8311](../raw_map.tsv:8311) | Richard A. Brown | Queens | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8312](../raw_map.tsv:8312) | Richard A. Brown | Queens | dep\|-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8313](../raw_map.tsv:8313) | Richard A. Brown | Queens | appos\|&lt;-appos&lt;-thing&lt;-nsubj&lt;-convene-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Richard A. Brown → Queens: Explicit governmental attorney title and prosecutorial context establish service for the named jurisdiction.

Cited evidence lines: [8304](../raw_map.tsv:8304), [8305](../raw_map.tsv:8305), [8309](../raw_map.tsv:8309), [8310](../raw_map.tsv:8310), [8311](../raw_map.tsv:8311), [8312](../raw_map.tsv:8312), [8313](../raw_map.tsv:8313).


Issue tags: mixed_evidence

### rel_27__ent_756__ent_537

**All observed names:** Mary Jo White → United States (4)

Ordered IDs: Ent[ent_756] → Ent[ent_537]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8324](../raw_map.tsv:8324) | Mary Jo White | United States | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8326](../raw_map.tsv:8326) | Mary Jo White | United States | dep\|-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8332](../raw_map.tsv:8332) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8333](../raw_map.tsv:8333) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mary Jo White → United States: Explicit governmental attorney title and prosecutorial context establish service for the named jurisdiction.

Cited evidence lines: [8324](../raw_map.tsv:8324), [8326](../raw_map.tsv:8326), [8332](../raw_map.tsv:8332), [8333](../raw_map.tsv:8333).


Issue tags: mixed_evidence

### rel_27__ent_131__ent_1213

**All observed names:** Gerry Adams → Sinn Fein (3)

Ordered IDs: Ent[ent_131] → Ent[ent_1213]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [35](../raw_map.tsv:35) | Gerry Adams | Sinn Fein | appos\|-&gt;appos-&gt;leader-&gt;poss-&gt;\|poss |
| [2922](../raw_map.tsv:2922) | Gerry Adams | Sinn Fein | appos\|-&gt;appos-&gt;leader-&gt;poss-&gt;\|poss |
| [4994](../raw_map.tsv:4994) | Gerry Adams | Sinn Fein | appos\|-&gt;appos-&gt;leader-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Gerry Adams → Sinn Fein: Political leadership or reverse client-to-lawyer evidence does not establish the declared person-to-client legal role.

Cited evidence lines: [35](../raw_map.tsv:35), [2922](../raw_map.tsv:2922), [4994](../raw_map.tsv:4994).




### rel_27__ent_732__ent_40

**All observed names:** Mr. Clinton → David E. Kendall (1)

Ordered IDs: Ent[ent_732] → Ent[ent_40]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3813](../raw_map.tsv:3813) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-from&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Clinton → David E. Kendall: Political leadership or reverse client-to-lawyer evidence does not establish the declared person-to-client legal role.

Cited evidence lines: [3813](../raw_map.tsv:3813).




### rel_27__ent_998__ent_900

**All observed names:** Christopher J. Christie → United States (1)

Ordered IDs: Ent[ent_998] → Ent[ent_900]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8337](../raw_map.tsv:8337) | Christopher J. Christie | United States | nsubj\|&lt;-nsubj&lt;-prosecute-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Christopher J. Christie → United States: Explicit governmental attorney title and prosecutorial context establish service for the named jurisdiction.

Cited evidence lines: [8337](../raw_map.tsv:8337).



