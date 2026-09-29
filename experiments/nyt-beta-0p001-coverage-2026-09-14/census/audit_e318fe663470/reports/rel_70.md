# audit_e318fe663470 — rel_70: directed communication to

Predicate ID: communicates_to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

Complete census: 3 supported, 4 incorrect, 0 ambiguous; N=7. Precision 3/7=42.86% to 3/7=42.86%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |
| 2 | nsubj\|&lt;-nsubj&lt;-testify-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-testimony-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;parent-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;case-&gt;rcmod-&gt;sentence-&gt;nsubjpass-&gt;\|nsubjpass |
| 1 | appos\|&lt;-appos&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-address-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-advise-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-appear-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;credibility-&gt;prep-&gt;of-&gt;pobj-&gt;witness-&gt;rcmod-&gt;identify-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-release-&gt;prep-&gt;by-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-submit&lt;-rcmod&lt;-report-&gt;prep-&gt;in-&gt;pobj-&gt;sign-&gt;rcmod-&gt;ready-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-comment-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-testimony-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-testimony&lt;-nsubj&lt;-say-&gt;tmod-&gt;\|tmod |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_70__ent_188__ent_181

**All observed names:** Mr. Greenspan → Senate Banking Committee (7)

Ordered IDs: Ent[ent_188] → Ent[ent_181]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [426](../raw_map.tsv:426) | Mr. Greenspan | Senate Banking Committee | nsubj\|&lt;-nsubj&lt;-testify-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |
| [427](../raw_map.tsv:427) | Mr. Greenspan | Senate Banking Committee | poss\|&lt;-poss&lt;-testimony-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [428](../raw_map.tsv:428) | Mr. Greenspan | Senate Banking Committee | poss\|&lt;-poss&lt;-comment-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [429](../raw_map.tsv:429) | Mr. Greenspan | Senate Banking Committee | nsubj\|&lt;-nsubj&lt;-appear-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |
| [430](../raw_map.tsv:430) | Mr. Greenspan | Senate Banking Committee | nsubj\|&lt;-nsubj&lt;-address-&gt;dobj-&gt;\|dobj |
| [433](../raw_map.tsv:433) | Mr. Greenspan | Senate Banking Committee | poss\|&lt;-poss&lt;-testimony&lt;-nsubj&lt;-say-&gt;tmod-&gt;\|tmod |
| [434](../raw_map.tsv:434) | Mr. Greenspan | Senate Banking Committee | poss\|&lt;-poss&lt;-testimony-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Greenspan → Senate Banking Committee: Explicit testimony to/before, advice or directed speech establishes communication to the named institutional addressee.

Cited evidence lines: [426](../raw_map.tsv:426), [427](../raw_map.tsv:427), [428](../raw_map.tsv:428), [429](../raw_map.tsv:429), [430](../raw_map.tsv:430), [433](../raw_map.tsv:433), [434](../raw_map.tsv:434).


Issue tags: mixed_evidence

### rel_70__ent_659__ent_1112

**All observed names:** Stephen Jones → Mr. McVeigh (4)

Ordered IDs: Ent[ent_659] → Ent[ent_1112]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4471](../raw_map.tsv:4471) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |
| [4474](../raw_map.tsv:4474) | Stephen Jones | Mr. McVeigh | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;team-&gt;poss-&gt;\|poss |
| [4477](../raw_map.tsv:4477) | Stephen Jones | Mr. McVeigh | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;credibility-&gt;prep-&gt;of-&gt;pobj-&gt;witness-&gt;rcmod-&gt;identify-&gt;dobj-&gt;\|dobj |
| [4479](../raw_map.tsv:4479) | Stephen Jones | Mr. McVeigh | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;case-&gt;rcmod-&gt;sentence-&gt;nsubjpass-&gt;\|nsubjpass |

**Judgment: incorrect** (primary). Stephen Jones → Mr. McVeigh: Lawyer or corporate-chair roles do not assert this communication; the Congress/White House release/submission rows have the reverse sender/recipient direction.

Cited evidence lines: [4471](../raw_map.tsv:4471), [4474](../raw_map.tsv:4474), [4477](../raw_map.tsv:4477), [4479](../raw_map.tsv:4479).




### rel_70__ent_1099__ent_1239

**All observed names:** Alan Greenspan → Congress (3)

Ordered IDs: Ent[ent_1099] → Ent[ent_1239]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [408](../raw_map.tsv:408) | Alan Greenspan | Congress | appos\|&lt;-appos&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [412](../raw_map.tsv:412) | Alan Greenspan | Congress | poss\|&lt;-poss&lt;-testimony-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [413](../raw_map.tsv:413) | Alan Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-advise-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Alan Greenspan → Congress: Explicit testimony to/before, advice or directed speech establishes communication to the named institutional addressee.

Cited evidence lines: [408](../raw_map.tsv:408), [412](../raw_map.tsv:412), [413](../raw_map.tsv:413).




### rel_70__ent_189__ent_1422

**All observed names:** Congress → White House (2)

Ordered IDs: Ent[ent_189] → Ent[ent_1422]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7946](../raw_map.tsv:7946) | Congress | White House | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-submit&lt;-rcmod&lt;-report-&gt;prep-&gt;in-&gt;pobj-&gt;sign-&gt;rcmod-&gt;ready-&gt;nsubj-&gt;\|nsubj |
| [7947](../raw_map.tsv:7947) | Congress | White House | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-release-&gt;prep-&gt;by-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Congress → White House: Lawyer or corporate-chair roles do not assert this communication; the Congress/White House release/submission rows have the reverse sender/recipient direction.

Cited evidence lines: [7946](../raw_map.tsv:7946), [7947](../raw_map.tsv:7947).




### rel_70__ent_1366__ent_189

**All observed names:** Alan Greenspan → Congress (1)

Ordered IDs: Ent[ent_1366] → Ent[ent_189]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [407](../raw_map.tsv:407) | Alan Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-testify-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Alan Greenspan → Congress: Explicit testimony to/before, advice or directed speech establishes communication to the named institutional addressee.

Cited evidence lines: [407](../raw_map.tsv:407).




### rel_70__ent_1111__ent_532

**All observed names:** Michael E. Tigar → Mr. Nichols (1)

Ordered IDs: Ent[ent_1111] → Ent[ent_532]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4465](../raw_map.tsv:4465) | Michael E. Tigar | Mr. Nichols | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Michael E. Tigar → Mr. Nichols: Lawyer or corporate-chair roles do not assert this communication; the Congress/White House release/submission rows have the reverse sender/recipient direction.

Cited evidence lines: [4465](../raw_map.tsv:4465).




### rel_70__ent_151__ent_625

**All observed names:** Rupert Murdoch → Fox (1)

Ordered IDs: Ent[ent_151] → Ent[ent_625]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6013](../raw_map.tsv:6013) | Rupert Murdoch | Fox | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;parent-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Rupert Murdoch → Fox: Lawyer or corporate-chair roles do not assert this communication; the Congress/White House release/submission rows have the reverse sender/recipient direction.

Cited evidence lines: [6013](../raw_map.tsv:6013).



