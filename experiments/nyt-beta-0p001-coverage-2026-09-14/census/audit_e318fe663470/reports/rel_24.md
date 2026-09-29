# audit_e318fe663470 — rel_24: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 5 supported, 5 incorrect, 1 ambiguous; N=11. Precision 5/11=45.45% to 6/11=54.55%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 3 | appos\|-&gt;appos-&gt;researcher-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| 2 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-say-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| 2 | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-export-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| 1 | partmod\|-&gt;partmod-&gt;welcome-&gt;prep-&gt;to-&gt;pobj-&gt;camp-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-shift-&gt;rcmod-&gt;say-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-export-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-face&lt;-nsubj&lt;-hang-&gt;prep-&gt;over-&gt;pobj-&gt;dugout-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;say-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | tmod\|&lt;-tmod&lt;-suspend-&gt;prep-&gt;from-&gt;pobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_24__ent_350__ent_592

**All observed names:** Marge Schott → Cincinnati Reds (7)

Ordered IDs: Ent[ent_350] → Ent[ent_592]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1465](../raw_map.tsv:1465) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1466](../raw_map.tsv:1466) | Marge Schott | Cincinnati Reds | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1469](../raw_map.tsv:1469) | Marge Schott | Cincinnati Reds | rcmod\|-&gt;rcmod-&gt;undermine-&gt;dobj-&gt;position-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1470](../raw_map.tsv:1470) | Marge Schott | Cincinnati Reds | tmod\|&lt;-tmod&lt;-suspend-&gt;prep-&gt;from-&gt;pobj-&gt;operation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1472](../raw_map.tsv:1472) | Marge Schott | Cincinnati Reds | poss\|&lt;-poss&lt;-face&lt;-nsubj&lt;-hang-&gt;prep-&gt;over-&gt;pobj-&gt;dugout-&gt;poss-&gt;\|poss |
| [1473](../raw_map.tsv:1473) | Marge Schott | Cincinnati Reds | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-saga&lt;-nsubj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;suspension-&gt;prep-&gt;of-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1474](../raw_map.tsv:1474) | Marge Schott | Cincinnati Reds | partmod\|-&gt;partmod-&gt;welcome-&gt;prep-&gt;to-&gt;pobj-&gt;camp-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Marge Schott → Cincinnati Reds: A local owner/own/acquisition row explicitly establishes an ownership interest.

Cited evidence lines: [1465](../raw_map.tsv:1465), [1466](../raw_map.tsv:1466), [1469](../raw_map.tsv:1469), [1470](../raw_map.tsv:1470), [1472](../raw_map.tsv:1472), [1473](../raw_map.tsv:1473), [1474](../raw_map.tsv:1474).


Issue tags: mixed_evidence

### rel_24__ent_351__ent_1004

**All observed names:** Steinbrenner → Yankees (5)

Ordered IDs: Ent[ent_351] → Ent[ent_1004]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1495](../raw_map.tsv:1495) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1496](../raw_map.tsv:1496) | Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1498](../raw_map.tsv:1498) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [1503](../raw_map.tsv:1503) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1504](../raw_map.tsv:1504) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Steinbrenner → Yankees: A local owner/own/acquisition row explicitly establishes an ownership interest.

Cited evidence lines: [1495](../raw_map.tsv:1495), [1496](../raw_map.tsv:1496), [1498](../raw_map.tsv:1498), [1503](../raw_map.tsv:1503), [1504](../raw_map.tsv:1504).


Issue tags: mixed_evidence

### rel_24__ent_1359__ent_110

**All observed names:** John McMullen → Devils (4)

Ordered IDs: Ent[ent_1359] → Ent[ent_110]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1475](../raw_map.tsv:1475) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1476](../raw_map.tsv:1476) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1481](../raw_map.tsv:1481) | John McMullen | Devils | partmod\|-&gt;partmod-&gt;undergo-&gt;nsubj-&gt;\|nsubj |
| [1484](../raw_map.tsv:1484) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). John McMullen → Devils: A local owner/own/acquisition row explicitly establishes an ownership interest.

Cited evidence lines: [1475](../raw_map.tsv:1475), [1476](../raw_map.tsv:1476), [1481](../raw_map.tsv:1481), [1484](../raw_map.tsv:1484).


Issue tags: mixed_evidence

### rel_24__ent_101__ent_881

**All observed names:** Walt Disney Company → ABC (3)

Ordered IDs: Ent[ent_101] → Ent[ent_881]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5933](../raw_map.tsv:5933) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5934](../raw_map.tsv:5934) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [5937](../raw_map.tsv:5937) | Walt Disney Company | ABC | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Walt Disney Company → ABC: A local owner/own/acquisition row explicitly establishes an ownership interest.

Cited evidence lines: [5933](../raw_map.tsv:5933), [5934](../raw_map.tsv:5934), [5937](../raw_map.tsv:5937).




### rel_24__ent_506__ent_429

**All observed names:** Walter O'Malley → Los Angeles (2)

Ordered IDs: Ent[ent_506] → Ent[ent_429]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4865](../raw_map.tsv:4865) | Walter O'Malley | Los Angeles | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4866](../raw_map.tsv:4866) | Walter O'Malley | Los Angeles | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Walter O'Malley → Los Angeles: Owner-of terminates at Los Angeles, leaving the actual team/property asset omitted.

Cited evidence lines: [4865](../raw_map.tsv:4865), [4866](../raw_map.tsv:4866).

**Review question:** What asset does Los Angeles stand for in this ownership construction?
Issue tags: missing_argument

### rel_24__ent_1314__ent_336

**All observed names:** State Department → Richard A. Boucher (2)

Ordered IDs: Ent[ent_1314] → Ent[ent_336]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5380](../raw_map.tsv:5380) | State Department | Richard A. Boucher | rcmod\|-&gt;rcmod-&gt;say-&gt;nsubj-&gt;\|nsubj |
| [5383](../raw_map.tsv:5383) | State Department | Richard A. Boucher | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-say-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). State Department → Richard A. Boucher: Spokesperson, research-location or international export rows do not establish ownership.

Cited evidence lines: [5380](../raw_map.tsv:5380), [5383](../raw_map.tsv:5383).




### rel_24__ent_586__ent_1030

**All observed names:** White House → Ari Fleischer (2)

Ordered IDs: Ent[ent_586] → Ent[ent_1030]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5420](../raw_map.tsv:5420) | White House | Ari Fleischer | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-say-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |
| [5423](../raw_map.tsv:5423) | White House | Ari Fleischer | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-shift-&gt;rcmod-&gt;say-&gt;nsubj-&gt;spokesman-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). White House → Ari Fleischer: Spokesperson, research-location or international export rows do not establish ownership.

Cited evidence lines: [5420](../raw_map.tsv:5420), [5423](../raw_map.tsv:5423).




### rel_24__ent_1285__ent_1205

**All observed names:** Morningstar Inc. → Chicago (2)

Ordered IDs: Ent[ent_1285] → Ent[ent_1205]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5751](../raw_map.tsv:5751) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;researcher-&gt;nn-&gt;\|nn |
| [7115](../raw_map.tsv:7115) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;researcher-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Morningstar Inc. → Chicago: Spokesperson, research-location or international export rows do not establish ownership.

Cited evidence lines: [5751](../raw_map.tsv:5751), [7115](../raw_map.tsv:7115).




### rel_24__ent_1412__ent_905

**All observed names:** China → United States (2)

Ordered IDs: Ent[ent_1412] → Ent[ent_905]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5872](../raw_map.tsv:5872) | China | United States | poss\|&lt;-poss&lt;-export-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5874](../raw_map.tsv:5874) | China | United States | nsubj\|&lt;-nsubj&lt;-export-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). China → United States: Spokesperson, research-location or international export rows do not establish ownership.

Cited evidence lines: [5872](../raw_map.tsv:5872), [5874](../raw_map.tsv:5874).




### rel_24__ent_567__ent_1238

**All observed names:** Viacom → CBS (2)

Ordered IDs: Ent[ent_567] → Ent[ent_1238]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5941](../raw_map.tsv:5941) | Viacom | CBS | poss\|&lt;-poss&lt;-acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5944](../raw_map.tsv:5944) | Viacom | CBS | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Viacom → CBS: A local owner/own/acquisition row explicitly establishes an ownership interest.

Cited evidence lines: [5941](../raw_map.tsv:5941), [5944](../raw_map.tsv:5944).




### rel_24__ent_220__ent_407

**All observed names:** Morningstar → Chicago (1)

Ordered IDs: Ent[ent_220] → Ent[ent_407]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5791](../raw_map.tsv:5791) | Morningstar | Chicago | appos\|-&gt;appos-&gt;researcher-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Morningstar → Chicago: Spokesperson, research-location or international export rows do not establish ownership.

Cited evidence lines: [5791](../raw_map.tsv:5791).



