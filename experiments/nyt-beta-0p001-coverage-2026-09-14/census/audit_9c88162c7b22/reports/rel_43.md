# audit_9c88162c7b22 — rel_43: lawyer or attorney for

Predicate ID: lawyer_for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

Complete census: 6 supported, 0 incorrect, 1 ambiguous; N=7. Precision 6/7=85.71% to 7/7=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 3 | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 3 | nsubj\|&lt;-nsubj&lt;-attorney-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| 2 | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;dep-&gt;\|dep |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;man-&gt;rcmod-&gt;get-&gt;dobj-&gt;appointment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-character-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-friend-&gt;appos-&gt;\|appos |
| 1 | appos\|&lt;-appos&lt;-investigator&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;dobj-&gt;lawyer-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-name&lt;-partmod&lt;-deputy-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-confirm-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-confirm-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-appoint-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-nomination&lt;-dobj&lt;-support-&gt;prep-&gt;to-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;primary-&gt;dep-&gt;refer-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;co-signed-&gt;dobj-&gt;indictment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;leave-&gt;dep-&gt;work-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_43__ent_995__ent_333

**All observed names:** Robert M. Morgenthau → Manhattan (6)

Ordered IDs: Ent[ent_995] → Ent[ent_333]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8294](../raw_map.tsv:8294) | Robert M. Morgenthau | Manhattan | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8297](../raw_map.tsv:8297) | Robert M. Morgenthau | Manhattan | nsubj\|&lt;-nsubj&lt;-attorney-&gt;nn-&gt;\|nn |
| [8298](../raw_map.tsv:8298) | Robert M. Morgenthau | Manhattan | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| [8299](../raw_map.tsv:8299) | Robert M. Morgenthau | Manhattan | partmod\|-&gt;partmod-&gt;know-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;poss-&gt;\|poss |
| [8300](../raw_map.tsv:8300) | Robert M. Morgenthau | Manhattan | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8303](../raw_map.tsv:8303) | Robert M. Morgenthau | Manhattan | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;primary-&gt;dep-&gt;refer-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Robert M. Morgenthau → Manhattan: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8294](../raw_map.tsv:8294), [8297](../raw_map.tsv:8297), [8298](../raw_map.tsv:8298), [8299](../raw_map.tsv:8299), [8300](../raw_map.tsv:8300), [8303](../raw_map.tsv:8303).




### rel_43__ent_756__ent_537

**All observed names:** Mary Jo White → United States (6)

Ordered IDs: Ent[ent_756] → Ent[ent_537]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8324](../raw_map.tsv:8324) | Mary Jo White | United States | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8325](../raw_map.tsv:8325) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| [8327](../raw_map.tsv:8327) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8330](../raw_map.tsv:8330) | Mary Jo White | United States | rcmod\|-&gt;rcmod-&gt;co-signed-&gt;dobj-&gt;indictment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8332](../raw_map.tsv:8332) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;dep-&gt;attorney-&gt;nn-&gt;\|nn |
| [8333](../raw_map.tsv:8333) | Mary Jo White | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-departure-&gt;prep-&gt;from-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mary Jo White → United States: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8324](../raw_map.tsv:8324), [8325](../raw_map.tsv:8325), [8327](../raw_map.tsv:8327), [8330](../raw_map.tsv:8330), [8332](../raw_map.tsv:8332), [8333](../raw_map.tsv:8333).




### rel_43__ent_998__ent_537

**All observed names:** Christopher J. Christie → United States (6)

Ordered IDs: Ent[ent_998] → Ent[ent_537]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8335](../raw_map.tsv:8335) | Christopher J. Christie | United States | nsubj\|&lt;-nsubj&lt;-attorney-&gt;nn-&gt;\|nn |
| [8336](../raw_map.tsv:8336) | Christopher J. Christie | United States | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-appoint-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8339](../raw_map.tsv:8339) | Christopher J. Christie | United States | appos\|-&gt;appos-&gt;man-&gt;rcmod-&gt;get-&gt;dobj-&gt;appointment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8341](../raw_map.tsv:8341) | Christopher J. Christie | United States | appos\|&lt;-appos&lt;-friend-&gt;appos-&gt;\|appos |
| [8342](../raw_map.tsv:8342) | Christopher J. Christie | United States | appos\|&lt;-appos&lt;-character-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8343](../raw_map.tsv:8343) | Christopher J. Christie | United States | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Christopher J. Christie → United States: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8335](../raw_map.tsv:8335), [8336](../raw_map.tsv:8336), [8339](../raw_map.tsv:8339), [8341](../raw_map.tsv:8341), [8342](../raw_map.tsv:8342), [8343](../raw_map.tsv:8343).


Issue tags: mixed_evidence

### rel_43__ent_758__ent_537

**All observed names:** Patrick J. Fitzgerald → United States (6)

Ordered IDs: Ent[ent_758] → Ent[ent_537]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8381](../raw_map.tsv:8381) | Patrick J. Fitzgerald | United States | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8382](../raw_map.tsv:8382) | Patrick J. Fitzgerald | United States | rcmod\|-&gt;rcmod-&gt;leave-&gt;dep-&gt;work-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8384](../raw_map.tsv:8384) | Patrick J. Fitzgerald | United States | rcmod\|-&gt;rcmod-&gt;attorney-&gt;nn-&gt;\|nn |
| [8385](../raw_map.tsv:8385) | Patrick J. Fitzgerald | United States | nsubjpass\|&lt;-nsubjpass&lt;-confirm-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8389](../raw_map.tsv:8389) | Patrick J. Fitzgerald | United States | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8390](../raw_map.tsv:8390) | Patrick J. Fitzgerald | United States | dep\|&lt;-dep&lt;-name&lt;-partmod&lt;-deputy-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Patrick J. Fitzgerald → United States: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8381](../raw_map.tsv:8381), [8382](../raw_map.tsv:8382), [8384](../raw_map.tsv:8384), [8385](../raw_map.tsv:8385), [8389](../raw_map.tsv:8389), [8390](../raw_map.tsv:8390).




### rel_43__ent_844__ent_1002

**All observed names:** John Dowd → Washington (4)

Ordered IDs: Ent[ent_844] → Ent[ent_1002]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2290](../raw_map.tsv:2290) | John Dowd | Washington | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2291](../raw_map.tsv:2291) | John Dowd | Washington | appos\|-&gt;appos-&gt;lawyer-&gt;dep-&gt;\|dep |
| [2292](../raw_map.tsv:2292) | John Dowd | Washington | appos\|&lt;-appos&lt;-investigator&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;dobj-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2293](../raw_map.tsv:2293) | John Dowd | Washington | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). John Dowd → Washington: Washington lawyer/attorney noun modifiers do not distinguish an office representing the jurisdiction from a private lawyer located there.

Cited evidence lines: [2290](../raw_map.tsv:2290), [2291](../raw_map.tsv:2291), [2292](../raw_map.tsv:2292), [2293](../raw_map.tsv:2293).

**Review question:** Was John Dowd an attorney for Washington as a jurisdiction, or a private lawyer located in Washington?
Issue tags: location_versus_client

### rel_43__ent_997__ent_537

**All observed names:** Roslynn R. Mauskopf → United States (4)

Ordered IDs: Ent[ent_997] → Ent[ent_537]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8362](../raw_map.tsv:8362) | Roslynn R. Mauskopf | United States | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8366](../raw_map.tsv:8366) | Roslynn R. Mauskopf | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-nomination&lt;-dobj&lt;-support-&gt;prep-&gt;to-&gt;pobj-&gt;post-&gt;poss-&gt;attorney-&gt;nn-&gt;\|nn |
| [8369](../raw_map.tsv:8369) | Roslynn R. Mauskopf | United States | nsubjpass\|&lt;-nsubjpass&lt;-confirm-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [8370](../raw_map.tsv:8370) | Roslynn R. Mauskopf | United States | nsubj\|&lt;-nsubj&lt;-attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Roslynn R. Mauskopf → United States: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8362](../raw_map.tsv:8362), [8366](../raw_map.tsv:8366), [8369](../raw_map.tsv:8369), [8370](../raw_map.tsv:8370).


Issue tags: mixed_evidence

### rel_43__ent_516__ent_537

**All observed names:** Michael J. Garcia → United States (4)

Ordered IDs: Ent[ent_516] → Ent[ent_537]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8372](../raw_map.tsv:8372) | Michael J. Garcia | United States | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [8373](../raw_map.tsv:8373) | Michael J. Garcia | United States | rcmod\|-&gt;rcmod-&gt;take-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8374](../raw_map.tsv:8374) | Michael J. Garcia | United States | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8380](../raw_map.tsv:8380) | Michael J. Garcia | United States | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Michael J. Garcia → United States: Governmental attorney title, office or service evidence establishes legal office for the named jurisdiction.

Cited evidence lines: [8372](../raw_map.tsv:8372), [8373](../raw_map.tsv:8373), [8374](../raw_map.tsv:8374), [8380](../raw_map.tsv:8380).



