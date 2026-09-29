# audit_e318fe663470 — rel_5: has lawyer or legal counsel

Predicate ID: has_lawyer

Client or institutional principal X is represented by or professionally affiliated with lawyer, attorney, or legal counsel Y.

Includes: explicit lawyer, attorney, or counsel for X; historical legal representation or institutional legal office; public attorney for the named jurisdiction. Excludes: ordinary spokesperson, adviser, or employee without a legal role; a place where a lawyer practices without client or institutional affiliation; a third party lawyer merely quoted about X. Ambiguous unless resolved by case-local evidence: unclear legal client versus geographic location; lawyer title attachment unresolved; an incomplete principal. Inverse of lawyer_for. This does not require that the legal professional exclusively represents X.

Complete census: 3 supported, 1 incorrect, 0 ambiguous; N=4. Precision 3/4=75.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| 1 | appos\|-&gt;appos-&gt;man-&gt;rcmod-&gt;get-&gt;dobj-&gt;appointment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-call-&gt;dep-&gt;\|dep |
| 1 | dobj\|&lt;-dobj&lt;-sentence&lt;-partmod&lt;-judge-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-hire-&gt;dobj-&gt;lawyer-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-spend-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-question&lt;-nsubj&lt;-interrupted-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-attorney-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-appos&lt;-judge-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-dobj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-acknowledge-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-concede-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examination&lt;-dobj&lt;-undergo&lt;-partmod&lt;-stand&lt;-pobj&lt;-on&lt;-prep&lt;-spend-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-shouting&lt;-pobj&lt;-with&lt;-prep&lt;-echo&lt;-partmod&lt;-courtroom&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-to&lt;-prep&lt;-\|prep |
| 1 | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;as-&gt;pobj-&gt;lawyer-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_5__ent_48__ent_1195

**All observed names:** Mr. Skakel → Michael Sherman (9)

Ordered IDs: Ent[ent_48] → Ent[ent_1195]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3783](../raw_map.tsv:3783) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3784](../raw_map.tsv:3784) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-dep&lt;-under&lt;-prep&lt;-acknowledge-&gt;nsubj-&gt;\|nsubj |
| [3785](../raw_map.tsv:3785) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-attorney-&gt;appos-&gt;\|appos |
| [3786](../raw_map.tsv:3786) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-to&lt;-prep&lt;-\|prep |
| [3787](../raw_map.tsv:3787) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;appos-&gt;\|appos |
| [3788](../raw_map.tsv:3788) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-concede-&gt;nsubj-&gt;\|nsubj |
| [3789](../raw_map.tsv:3789) | Mr. Skakel | Michael Sherman | poss\|&lt;-poss&lt;-lawyer&lt;-appos&lt;-judge-&gt;appos-&gt;\|appos |
| [3790](../raw_map.tsv:3790) | Mr. Skakel | Michael Sherman | nsubj\|&lt;-nsubj&lt;-spend-&gt;dobj-&gt;\|dobj |
| [3791](../raw_map.tsv:3791) | Mr. Skakel | Michael Sherman | dobj\|&lt;-dobj&lt;-sentence&lt;-partmod&lt;-judge-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Skakel → Michael Sherman: An explicit possessed-lawyer/attorney or hired-lawyer row identifies legal representation of the client.

Cited evidence lines: [3783](../raw_map.tsv:3783), [3784](../raw_map.tsv:3784), [3785](../raw_map.tsv:3785), [3786](../raw_map.tsv:3786), [3787](../raw_map.tsv:3787), [3788](../raw_map.tsv:3788), [3789](../raw_map.tsv:3789), [3790](../raw_map.tsv:3790), [3791](../raw_map.tsv:3791).


Issue tags: mixed_evidence

### rel_5__ent_1336__ent_41

**All observed names:** Mr. Sharpton → Michael A. Hardy (7)

Ordered IDs: Ent[ent_1336] → Ent[ent_41]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3792](../raw_map.tsv:3792) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3793](../raw_map.tsv:3793) | Mr. Sharpton | Michael A. Hardy | rcmod\|-&gt;rcmod-&gt;sit-&gt;prep-&gt;as-&gt;pobj-&gt;lawyer-&gt;appos-&gt;\|appos |
| [3794](../raw_map.tsv:3794) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-shouting&lt;-pobj&lt;-with&lt;-prep&lt;-echo&lt;-partmod&lt;-courtroom&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |
| [3795](../raw_map.tsv:3795) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examination&lt;-dobj&lt;-undergo&lt;-partmod&lt;-stand&lt;-pobj&lt;-on&lt;-prep&lt;-spend-&gt;dobj-&gt;\|dobj |
| [3796](../raw_map.tsv:3796) | Mr. Sharpton | Michael A. Hardy | poss\|&lt;-poss&lt;-lawyer&lt;-dobj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [3797](../raw_map.tsv:3797) | Mr. Sharpton | Michael A. Hardy | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-question&lt;-nsubj&lt;-interrupted-&gt;dep-&gt;\|dep |
| [3798](../raw_map.tsv:3798) | Mr. Sharpton | Michael A. Hardy | dobj\|&lt;-dobj&lt;-call-&gt;dep-&gt;\|dep |

**Judgment: supported** (primary). Mr. Sharpton → Michael A. Hardy: An explicit possessed-lawyer/attorney or hired-lawyer row identifies legal representation of the client.

Cited evidence lines: [3792](../raw_map.tsv:3792), [3793](../raw_map.tsv:3793), [3794](../raw_map.tsv:3794), [3795](../raw_map.tsv:3795), [3796](../raw_map.tsv:3796), [3797](../raw_map.tsv:3797), [3798](../raw_map.tsv:3798).


Issue tags: mixed_evidence

### rel_5__ent_827__ent_653

**All observed names:** Mr. Clinton → Robert S. Bennett (2)

Ordered IDs: Ent[ent_827] → Ent[ent_653]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3837](../raw_map.tsv:3837) | Mr. Clinton | Robert S. Bennett | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3841](../raw_map.tsv:3841) | Mr. Clinton | Robert S. Bennett | nsubj\|&lt;-nsubj&lt;-hire-&gt;dobj-&gt;lawyer-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Clinton → Robert S. Bennett: An explicit possessed-lawyer/attorney or hired-lawyer row identifies legal representation of the client.

Cited evidence lines: [3837](../raw_map.tsv:3837), [3841](../raw_map.tsv:3841).




### rel_5__ent_998__ent_798

**All observed names:** Christopher J. Christie → United States (1)

Ordered IDs: Ent[ent_998] → Ent[ent_798]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8339](../raw_map.tsv:8339) | Christopher J. Christie | United States | appos\|-&gt;appos-&gt;man-&gt;rcmod-&gt;get-&gt;dobj-&gt;appointment-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Christopher J. Christie → United States: The public-attorney appointment has person-to-jurisdiction direction, the reverse of the declared has-lawyer relation.

Cited evidence lines: [8339](../raw_map.tsv:8339).



