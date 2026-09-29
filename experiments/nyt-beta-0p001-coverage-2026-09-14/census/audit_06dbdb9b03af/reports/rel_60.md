# audit_06dbdb9b03af — rel_60: organization described by national affiliation

Predicate ID: organization_national_affiliation

Organization X is explicitly described as belonging to the national or country affiliation designated by Y.

Includes: an explicit national adjective modifying the organization, such as a French company; a directly stated country-of-origin or national institutional affiliation; multiple explicitly named national affiliations. Excludes: physical offices or temporary operations in a country alone; ownership by a person or organization of that nationality alone; a national adjective modifying an unrelated person or parent rather than X; a person's nationality. Ambiguous unless resolved by case-local evidence: unclear national adjective attachment; a regional or city descriptor rather than a national affiliation; national origin versus current affiliation when the distinction is material. Y can be a complete nationality designation such as French or British-Dutch; this predicate does not assert headquarters or legal incorporation. A nationality label used as the argument here differs from an incomplete institution name in an office predicate.

Complete census: 2 supported, 1 incorrect, 0 ambiguous; N=3. Precision 2/3=66.67% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;group-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-put-&gt;prep-&gt;on-&gt;pobj-&gt;agency-&gt;rcmod-&gt;review-&gt;dobj-&gt;acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;asset-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-happen&lt;-csubj&lt;-happen-&gt;prep-&gt;to-&gt;pobj-&gt;company-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-move&lt;-nsubj&lt;-cost-&gt;dobj-&gt;job-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-oil-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-oil-&gt;prep-&gt;for-&gt;pobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;consumption-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-reserve&lt;-nsubj&lt;-contribute-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;consumption-&gt;amod-&gt;\|amod |

## Every evaluated fact

### rel_60__ent_24__ent_822

**All observed names:** Unocal → American (7)

Ordered IDs: Ent[ent_24] → Ent[ent_822]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3627](../raw_map.tsv:3627) | Unocal | American | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3628](../raw_map.tsv:3628) | Unocal | American | poss\|&lt;-poss&lt;-reserve&lt;-nsubj&lt;-contribute-&gt;dobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;consumption-&gt;amod-&gt;\|amod |
| [3629](../raw_map.tsv:3629) | Unocal | American | poss\|&lt;-poss&lt;-oil-&gt;prep-&gt;for-&gt;pobj-&gt;percent-&gt;prep-&gt;of-&gt;pobj-&gt;consumption-&gt;amod-&gt;\|amod |
| [3630](../raw_map.tsv:3630) | Unocal | American | poss\|&lt;-poss&lt;-oil-&gt;amod-&gt;\|amod |
| [3631](../raw_map.tsv:3631) | Unocal | American | poss\|&lt;-poss&lt;-move&lt;-nsubj&lt;-cost-&gt;dobj-&gt;job-&gt;amod-&gt;\|amod |
| [3633](../raw_map.tsv:3633) | Unocal | American | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-happen&lt;-csubj&lt;-happen-&gt;prep-&gt;to-&gt;pobj-&gt;company-&gt;amod-&gt;\|amod |
| [3636](../raw_map.tsv:3636) | Unocal | American | nsubj\|&lt;-nsubj&lt;-put-&gt;prep-&gt;on-&gt;pobj-&gt;agency-&gt;rcmod-&gt;review-&gt;dobj-&gt;acquisition-&gt;prep-&gt;of-&gt;pobj-&gt;asset-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Unocal → American: Direct company apposition with a national descriptor establishes organizational national affiliation.

Cited evidence lines: [3627](../raw_map.tsv:3627), [3628](../raw_map.tsv:3628), [3629](../raw_map.tsv:3629), [3630](../raw_map.tsv:3630), [3631](../raw_map.tsv:3631), [3633](../raw_map.tsv:3633), [3636](../raw_map.tsv:3636).


Issue tags: mixed_evidence

### rel_60__ent_934__ent_1079

**All observed names:** Unilever → British-Dutch (3)

Ordered IDs: Ent[ent_934] → Ent[ent_1079]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6828](../raw_map.tsv:6828) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [6830](../raw_map.tsv:6830) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;group-&gt;nn-&gt;\|nn |
| [6831](../raw_map.tsv:6831) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Unilever → British-Dutch: Direct company apposition with a national descriptor establishes organizational national affiliation.

Cited evidence lines: [6828](../raw_map.tsv:6828), [6830](../raw_map.tsv:6830), [6831](../raw_map.tsv:6831).


Issue tags: mixed_evidence

### rel_60__ent_20__ent_22

**All observed names:** Paul Dergarabedian → Los Angeles-based (1)

Ordered IDs: Ent[ent_20] → Ent[ent_22]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3657](../raw_map.tsv:3657) | Paul Dergarabedian | Los Angeles-based | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Paul Dergarabedian → Los Angeles-based: The literal subject is a person and the descriptor city-based, not an organization with a national affiliation.

Cited evidence lines: [3657](../raw_map.tsv:3657).



