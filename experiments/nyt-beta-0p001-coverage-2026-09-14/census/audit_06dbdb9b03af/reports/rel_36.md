# audit_06dbdb9b03af — rel_36: lawyer or attorney for

Predicate ID: lawyer_for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

Complete census: 2 supported, 0 incorrect, 0 ambiguous; N=2. Precision 2/2=100.00% to 2/2=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;represent-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;case-&gt;rcmod-&gt;sentence-&gt;nsubjpass-&gt;\|nsubjpass |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;rcmod-&gt;head-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| 1 | appos\|&lt;-appos&lt;-lawyer-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-today-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;credibility-&gt;prep-&gt;of-&gt;pobj-&gt;witness-&gt;rcmod-&gt;identify-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined&lt;-dep&lt;-say-&gt;nsubj-&gt;lawyer-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-unlike&lt;-prep&lt;-promise-&gt;nsubj-&gt;lawyer-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_36__ent_659__ent_1112

**All observed names:** Stephen Jones → Mr. McVeigh (10)

Ordered IDs: Ent[ent_659] → Ent[ent_1112]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4470](../raw_map.tsv:4470) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4471](../raw_map.tsv:4471) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |
| [4472](../raw_map.tsv:4472) | Stephen Jones | Mr. McVeigh | rcmod\|-&gt;rcmod-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4473](../raw_map.tsv:4473) | Stephen Jones | Mr. McVeigh | rcmod\|-&gt;rcmod-&gt;represent-&gt;dobj-&gt;\|dobj |
| [4474](../raw_map.tsv:4474) | Stephen Jones | Mr. McVeigh | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| [4475](../raw_map.tsv:4475) | Stephen Jones | Mr. McVeigh | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| [4476](../raw_map.tsv:4476) | Stephen Jones | Mr. McVeigh | pobj\|&lt;-pobj&lt;-unlike&lt;-prep&lt;-promise-&gt;nsubj-&gt;lawyer-&gt;poss-&gt;\|poss |
| [4477](../raw_map.tsv:4477) | Stephen Jones | Mr. McVeigh | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;credibility-&gt;prep-&gt;of-&gt;pobj-&gt;witness-&gt;rcmod-&gt;identify-&gt;dobj-&gt;\|dobj |
| [4478](../raw_map.tsv:4478) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;rcmod-&gt;head-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| [4479](../raw_map.tsv:4479) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;case-&gt;rcmod-&gt;sentence-&gt;nsubjpass-&gt;\|nsubjpass |

**Judgment: supported** (primary). Stephen Jones → Mr. McVeigh: Explicit lawyer-for, possessive lawyer and legal representation paths establish client representation.

Cited evidence lines: [4470](../raw_map.tsv:4470), [4471](../raw_map.tsv:4471), [4472](../raw_map.tsv:4472), [4473](../raw_map.tsv:4473), [4474](../raw_map.tsv:4474), [4475](../raw_map.tsv:4475), [4476](../raw_map.tsv:4476), [4477](../raw_map.tsv:4477), [4478](../raw_map.tsv:4478), [4479](../raw_map.tsv:4479).


Issue tags: mixed_evidence

### rel_36__ent_1111__ent_417

**All observed names:** Michael E. Tigar → Mr. Nichols (6)

Ordered IDs: Ent[ent_1111] → Ent[ent_417]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4464](../raw_map.tsv:4464) | Michael E. Tigar | Mr. Nichols | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4465](../raw_map.tsv:4465) | Michael E. Tigar | Mr. Nichols | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |
| [4466](../raw_map.tsv:4466) | Michael E. Tigar | Mr. Nichols | rcmod\|-&gt;rcmod-&gt;represent-&gt;dobj-&gt;\|dobj |
| [4467](../raw_map.tsv:4467) | Michael E. Tigar | Mr. Nichols | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined&lt;-dep&lt;-say-&gt;nsubj-&gt;lawyer-&gt;poss-&gt;\|poss |
| [4468](../raw_map.tsv:4468) | Michael E. Tigar | Mr. Nichols | appos\|&lt;-appos&lt;-today-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4469](../raw_map.tsv:4469) | Michael E. Tigar | Mr. Nichols | appos\|&lt;-appos&lt;-lawyer-&gt;appos-&gt;lawyer-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Michael E. Tigar → Mr. Nichols: Explicit lawyer-for, possessive lawyer and legal representation paths establish client representation.

Cited evidence lines: [4464](../raw_map.tsv:4464), [4465](../raw_map.tsv:4465), [4466](../raw_map.tsv:4466), [4467](../raw_map.tsv:4467), [4468](../raw_map.tsv:4468), [4469](../raw_map.tsv:4469).


Issue tags: mixed_evidence
