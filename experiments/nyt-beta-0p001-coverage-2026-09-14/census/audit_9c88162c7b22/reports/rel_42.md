# audit_9c88162c7b22 — rel_42: has lawyer or legal counsel

Predicate ID: has_lawyer

Client or institutional principal X is represented by or professionally affiliated with lawyer, attorney, or legal counsel Y.

Includes: explicit lawyer, attorney, or counsel for X; historical legal representation or institutional legal office; public attorney for the named jurisdiction. Excludes: ordinary spokesperson, adviser, or employee without a legal role; a place where a lawyer practices without client or institutional affiliation; a third party lawyer merely quoted about X. Ambiguous unless resolved by case-local evidence: unclear legal client versus geographic location; lawyer title attachment unresolved; an incomplete principal. Inverse of lawyer_for. This does not require that the legal professional exclusively represents X.

Complete census: 3 supported, 1 incorrect, 0 ambiguous; N=4. Precision 3/4=75.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| 1 | appos\|-&gt;appos-&gt;bid-&gt;poss-&gt;\|poss |
| 1 | dep\|&lt;-dep&lt;-offer-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-own-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-sell-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-spend-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-besides&lt;-prep&lt;-figure&lt;-nsubj&lt;-lawyer-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-attorney-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-appos&lt;-judge-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-acknowledge-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-shouting&lt;-pobj&lt;-with&lt;-prep&lt;-echo&lt;-partmod&lt;-courtroom&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_42__ent_48__ent_47

**All observed names:** Mr. Skakel → Michael Sherman (6)

Ordered IDs: Ent[ent_48] → Ent[ent_47]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3783](../raw_map.tsv:3783) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3784](../raw_map.tsv:3784) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-acknowledge-&gt;nsubj-&gt;\|nsubj |
| [3785](../raw_map.tsv:3785) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-attorney-&gt;appos-&gt;\|appos |
| [3787](../raw_map.tsv:3787) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;appos-&gt;\|appos |
| [3789](../raw_map.tsv:3789) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-appos&lt;-judge-&gt;appos-&gt;\|appos |
| [3790](../raw_map.tsv:3790) | Mr. Skakel | Michael Sherman | nsubj\|&lt;-nsubj&lt;-spend-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Skakel → Michael Sherman: Explicit lawyer/attorney attachment identifies the second person as legal representative of the first.

Cited evidence lines: [3783](../raw_map.tsv:3783), [3784](../raw_map.tsv:3784), [3785](../raw_map.tsv:3785), [3787](../raw_map.tsv:3787), [3789](../raw_map.tsv:3789), [3790](../raw_map.tsv:3790).


Issue tags: mixed_evidence

### rel_42__ent_300__ent_542

**All observed names:** Kohlberg → Kravis (4)

Ordered IDs: Ent[ent_300] → Ent[ent_542]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [627](../raw_map.tsv:627) | Kohlberg | Kravis | dep\|&lt;-dep&lt;-offer-&gt;nn-&gt;\|nn |
| [628](../raw_map.tsv:628) | Kohlberg | Kravis | appos\|-&gt;appos-&gt;bid-&gt;poss-&gt;\|poss |
| [629](../raw_map.tsv:629) | Kohlberg | Kravis | nsubj\|&lt;-nsubj&lt;-sell-&gt;nsubj-&gt;\|nsubj |
| [631](../raw_map.tsv:631) | Kohlberg | Kravis | nsubj\|&lt;-nsubj&lt;-own-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Kohlberg → Kravis: Kohlberg/Kravis occurs in bid, ownership and sale fragments with no lawyer relation.

Cited evidence lines: [627](../raw_map.tsv:627), [628](../raw_map.tsv:628), [629](../raw_map.tsv:629), [631](../raw_map.tsv:631).


Issue tags: wrong_predicate

### rel_42__ent_892__ent_411

**All observed names:** Mr. Barry → R. Kenneth Mundy (3)

Ordered IDs: Ent[ent_892] → Ent[ent_411]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3834](../raw_map.tsv:3834) | Mr. Barry | R. Kenneth Mundy | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3835](../raw_map.tsv:3835) | Mr. Barry | R. Kenneth Mundy | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [3836](../raw_map.tsv:3836) | Mr. Barry | R. Kenneth Mundy | pobj\|&lt;-pobj&lt;-besides&lt;-prep&lt;-figure&lt;-nsubj&lt;-lawyer-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Barry → R. Kenneth Mundy: Explicit lawyer/attorney attachment identifies the second person as legal representative of the first.

Cited evidence lines: [3834](../raw_map.tsv:3834), [3835](../raw_map.tsv:3835), [3836](../raw_map.tsv:3836).


Issue tags: mixed_evidence

### rel_42__ent_42__ent_41

**All observed names:** Mr. Sharpton → Michael A. Hardy (2)

Ordered IDs: Ent[ent_42] → Ent[ent_41]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3792](../raw_map.tsv:3792) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3794](../raw_map.tsv:3794) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-shouting&lt;-pobj&lt;-with&lt;-prep&lt;-echo&lt;-partmod&lt;-courtroom&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Sharpton → Michael A. Hardy: Explicit lawyer/attorney attachment identifies the second person as legal representative of the first.

Cited evidence lines: [3792](../raw_map.tsv:3792), [3794](../raw_map.tsv:3794).


Issue tags: mixed_evidence
