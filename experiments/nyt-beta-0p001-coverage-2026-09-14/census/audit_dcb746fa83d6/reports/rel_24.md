# audit_dcb746fa83d6 — rel_24: has lawyer or legal counsel

Predicate ID: has_lawyer

Client or institutional principal X is represented by or professionally affiliated with lawyer, attorney, or legal counsel Y.

Includes: explicit lawyer, attorney, or counsel for X; historical legal representation or institutional legal office; public attorney for the named jurisdiction. Excludes: ordinary spokesperson, adviser, or employee without a legal role; a place where a lawyer practices without client or institutional affiliation; a third party lawyer merely quoted about X. Ambiguous unless resolved by case-local evidence: unclear legal client versus geographic location; lawyer title attachment unresolved; an incomplete principal. Inverse of lawyer_for. This does not require that the legal professional exclusively represents X.

Complete census: 0 supported, 2 incorrect, 1 ambiguous; N=3. Precision 0/3=0.00% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-carry-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;governor-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-about&lt;-prep&lt;-concern-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-plea-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-for&lt;-prep&lt;-grant&lt;-partmod&lt;-time-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-to&lt;-prep&lt;-tonic-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-with&lt;-prep&lt;-sit-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lead&lt;-dobj&lt;-confront-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-meeting&lt;-pobj&lt;-at-&gt;dep-&gt;as-&gt;pobj-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;committee-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;before-&gt;pobj-&gt;appointment-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_24__ent_1347__ent_40

**All observed names:** Mr. Clinton → David E. Kendall (6)

Ordered IDs: Ent[ent_1347] → Ent[ent_40]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3810](../raw_map.tsv:3810) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lead&lt;-dobj&lt;-confront-&gt;dobj-&gt;\|dobj |
| [3811](../raw_map.tsv:3811) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-with&lt;-prep&lt;-sit-&gt;dobj-&gt;\|dobj |
| [3812](../raw_map.tsv:3812) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-to&lt;-prep&lt;-tonic-&gt;appos-&gt;\|appos |
| [3814](../raw_map.tsv:3814) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-for&lt;-prep&lt;-grant&lt;-partmod&lt;-time-&gt;appos-&gt;\|appos |
| [3815](../raw_map.tsv:3815) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-plea-&gt;appos-&gt;\|appos |
| [3816](../raw_map.tsv:3816) | Mr. Clinton | David E. Kendall | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-by&lt;-prep&lt;-cross-examined-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Mr. Clinton → David E. Kendall: Several paths mention Clinton's lawyer but reach Kendall through a plea, style, time, sitting or cross-examination construction; the retained paths do not directly attach the lawyer title to Kendall.

Cited evidence lines: [3810](../raw_map.tsv:3810), [3811](../raw_map.tsv:3811), [3812](../raw_map.tsv:3812), [3814](../raw_map.tsv:3814), [3815](../raw_map.tsv:3815), [3816](../raw_map.tsv:3816).

**Review question:** Does the full sentence explicitly identify Kendall as Clinton's lawyer rather than another argument in the legal proceedings?
Issue tags: attachment

### rel_24__ent_447__ent_1407

**All observed names:** Ben S. Bernanke → Federal Reserve (4)

Ordered IDs: Ent[ent_447] → Ent[ent_1407]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5709](../raw_map.tsv:5709) | Ben S. Bernanke | Federal Reserve | appos\|-&gt;appos-&gt;governor-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5710](../raw_map.tsv:5710) | Ben S. Bernanke | Federal Reserve | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;before-&gt;pobj-&gt;appointment-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5712](../raw_map.tsv:5712) | Ben S. Bernanke | Federal Reserve | poss\|&lt;-poss&lt;-meeting&lt;-pobj&lt;-at-&gt;dep-&gt;as-&gt;pobj-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;committee-&gt;poss-&gt;\|poss |
| [5713](../raw_map.tsv:5713) | Ben S. Bernanke | Federal Reserve | pobj\|&lt;-pobj&lt;-about&lt;-prep&lt;-concern-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ben S. Bernanke → Federal Reserve: Central-bank office or carrying a team does not establish inverse legal representation.

Cited evidence lines: [5709](../raw_map.tsv:5709), [5710](../raw_map.tsv:5710), [5712](../raw_map.tsv:5712), [5713](../raw_map.tsv:5713).




### rel_24__ent_1241__ent_308

**All observed names:** Ewing → Knicks (2)

Ordered IDs: Ent[ent_1241] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3078](../raw_map.tsv:3078) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-carry-&gt;dobj-&gt;\|dobj |
| [4222](../raw_map.tsv:4222) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-carry-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Ewing → Knicks: Central-bank office or carrying a team does not establish inverse legal representation.

Cited evidence lines: [3078](../raw_map.tsv:3078), [4222](../raw_map.tsv:4222).



