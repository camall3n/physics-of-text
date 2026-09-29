# audit_06dbdb9b03af — rel_10: has political candidate or nominee

Predicate ID: has_candidate

Political party X has or had person Y as an explicitly identified candidate, contender for its nomination, or nominee.

Includes: explicit party nominee or candidate; explicit contender for the party nomination; historical candidacy. Excludes: holding political office without candidacy; ordinary membership or an opposing-party rival; a corporate or sporting appointment. Ambiguous unless resolved by case-local evidence: an unspecified challenger or hopeful without identified party candidacy; a constituency or office replacing the party; an unnamed or materially truncated person or party. This is the exact inverse of candidate_for and does not claim winning election or holding office. Republican as an identified party label follows the inherited party-label convention.

Complete census: 1 supported, 1 incorrect, 0 ambiguous; N=2. Precision 1/2=50.00% to 1/2=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | amod\|&lt;-amod&lt;-challenger-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-nomination&lt;-pobj&lt;-for&lt;-prep&lt;-rival-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-nominee-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-rival-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-candidate-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-nominee-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;performance-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;production-&gt;partmod-&gt;call-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;program-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;program-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-review-&gt;prep-&gt;in-&gt;pobj-&gt;series-&gt;prep-&gt;of-&gt;pobj-&gt;performance-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_10__ent_263__ent_261

**All observed names:** Republican → Bob Dole (6)

Ordered IDs: Ent[ent_263] → Ent[ent_261]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7709](../raw_map.tsv:7709) | Republican | Bob Dole | amod\|&lt;-amod&lt;-rival-&gt;appos-&gt;\|appos |
| [7710](../raw_map.tsv:7710) | Republican | Bob Dole | amod\|&lt;-amod&lt;-challenger-&gt;appos-&gt;\|appos |
| [7711](../raw_map.tsv:7711) | Republican | Bob Dole | nn\|&lt;-nn&lt;-candidate-&gt;appos-&gt;\|appos |
| [7712](../raw_map.tsv:7712) | Republican | Bob Dole | amod\|&lt;-amod&lt;-nominee-&gt;appos-&gt;\|appos |
| [7714](../raw_map.tsv:7714) | Republican | Bob Dole | nn\|&lt;-nn&lt;-nominee-&gt;appos-&gt;\|appos |
| [7715](../raw_map.tsv:7715) | Republican | Bob Dole | amod\|&lt;-amod&lt;-nomination&lt;-pobj&lt;-for&lt;-prep&lt;-rival-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Republican → Bob Dole: Explicit Republican nominee and candidate appositions identify party candidacy.

Cited evidence lines: [7709](../raw_map.tsv:7709), [7710](../raw_map.tsv:7710), [7711](../raw_map.tsv:7711), [7712](../raw_map.tsv:7712), [7714](../raw_map.tsv:7714), [7715](../raw_map.tsv:7715).


Issue tags: mixed_evidence

### rel_10__ent_800__ent_801

**All observed names:** Jack Anderson → Dance Theater (5)

Ordered IDs: Ent[ent_800] → Ent[ent_801]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1881](../raw_map.tsv:1881) | Jack Anderson | Dance Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;performance-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1883](../raw_map.tsv:1883) | Jack Anderson | Dance Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;program-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1884](../raw_map.tsv:1884) | Jack Anderson | Dance Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;prep-&gt;in-&gt;pobj-&gt;series-&gt;prep-&gt;of-&gt;pobj-&gt;performance-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [1885](../raw_map.tsv:1885) | Jack Anderson | Dance Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;program-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [1888](../raw_map.tsv:1888) | Jack Anderson | Dance Theater | nsubj\|&lt;-nsubj&lt;-review-&gt;dobj-&gt;production-&gt;partmod-&gt;call-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Jack Anderson → Dance Theater: Artistic reviewing is not a political party having a candidate.

Cited evidence lines: [1881](../raw_map.tsv:1881), [1883](../raw_map.tsv:1883), [1884](../raw_map.tsv:1884), [1885](../raw_map.tsv:1885), [1888](../raw_map.tsv:1888).



