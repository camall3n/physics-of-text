# audit_9c88162c7b22 — rel_55: has lawyer or legal counsel

Predicate ID: has_lawyer

Client or institutional principal X is represented by or professionally affiliated with lawyer, attorney, or legal counsel Y.

Includes: explicit lawyer, attorney, or counsel for X; historical legal representation or institutional legal office; public attorney for the named jurisdiction. Excludes: ordinary spokesperson, adviser, or employee without a legal role; a place where a lawyer practices without client or institutional affiliation; a third party lawyer merely quoted about X. Ambiguous unless resolved by case-local evidence: unclear legal client versus geographic location; lawyer title attachment unresolved; an incomplete principal. Inverse of lawyer_for. This does not require that the legal professional exclusively represents X.

Complete census: 2 supported, 0 incorrect, 0 ambiguous; N=2. Precision 2/2=100.00% to 2/2=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-plea-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-for&lt;-prep&lt;-grant&lt;-partmod&lt;-time-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-from&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-to&lt;-prep&lt;-tonic-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-with&lt;-prep&lt;-sit-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lead&lt;-dobj&lt;-confront-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-response-&gt;rcmod-&gt;say-&gt;nsubj-&gt;lawyer-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-team-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_55__ent_827__ent_40

**All observed names:** Mr. Clinton → David E. Kendall (10)

Ordered IDs: Ent[ent_827] → Ent[ent_40]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3807](../raw_map.tsv:3807) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |
| [3808](../raw_map.tsv:3808) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-team-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [3809](../raw_map.tsv:3809) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-response-&gt;rcmod-&gt;say-&gt;nsubj-&gt;lawyer-&gt;appos-&gt;\|appos |
| [3810](../raw_map.tsv:3810) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lead&lt;-dobj&lt;-confront-&gt;dobj-&gt;\|dobj |
| [3811](../raw_map.tsv:3811) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-with&lt;-prep&lt;-sit-&gt;dobj-&gt;\|dobj |
| [3812](../raw_map.tsv:3812) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-to&lt;-prep&lt;-tonic-&gt;appos-&gt;\|appos |
| [3813](../raw_map.tsv:3813) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-from&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |
| [3814](../raw_map.tsv:3814) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-for&lt;-prep&lt;-grant&lt;-partmod&lt;-time-&gt;appos-&gt;\|appos |
| [3815](../raw_map.tsv:3815) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-plea-&gt;appos-&gt;\|appos |
| [3816](../raw_map.tsv:3816) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Clinton → David E. Kendall: The direct possessive-lawyer apposition identifies the second argument as the principal’s lawyer.

Cited evidence lines: [3807](../raw_map.tsv:3807), [3808](../raw_map.tsv:3808), [3809](../raw_map.tsv:3809), [3810](../raw_map.tsv:3810), [3811](../raw_map.tsv:3811), [3812](../raw_map.tsv:3812), [3813](../raw_map.tsv:3813), [3814](../raw_map.tsv:3814), [3815](../raw_map.tsv:3815), [3816](../raw_map.tsv:3816).




### rel_55__ent_893__ent_650

**All observed names:** Mr. Kelly → Thomas P. Puccio (1)

Ordered IDs: Ent[ent_893] → Ent[ent_650]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3833](../raw_map.tsv:3833) | Mr. Kelly | Thomas P. Puccio | poss\|&lt;-poss&lt;-lawyer-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Kelly → Thomas P. Puccio: The direct possessive-lawyer apposition identifies the second argument as the principal’s lawyer.

Cited evidence lines: [3833](../raw_map.tsv:3833).



