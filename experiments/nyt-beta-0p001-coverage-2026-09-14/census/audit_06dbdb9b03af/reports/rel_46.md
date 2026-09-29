# audit_06dbdb9b03af — rel_46: secretary to principal

Predicate ID: secretary_to

Person X holds or held an explicitly identified secretary role serving principal Y.

Includes: explicit secretary-to or possessive secretary title for a named person or institution; historical secretarial office. Excludes: consultant, adviser, spokesperson or director alone; ordinary communication or employment without secretary title; inferring leadership or a specific cabinet portfolio from secretary alone. Ambiguous unless resolved by case-local evidence: unclear secretary or principal attachment; an omitted department or principal when the role cannot be resolved. This specific secretary role is separate from general advice, speaking for a principal, and organizational leadership.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;secretary-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;secretary-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-spokesman&lt;-nsubj&lt;-compare-&gt;dep-&gt;thrash-&gt;nsubj-&gt;\|nsubj |
| 1 | dobj\|&lt;-dobj&lt;-lift-&gt;prep-&gt;into-&gt;pobj-&gt;playoff-&gt;rcmod-&gt;win-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-bench-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-go-&gt;prep-&gt;with-&gt;pobj-&gt;rotation-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;series-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-game&lt;-pobj&lt;-by&lt;-prep&lt;-backed&lt;-nsubj&lt;-kick-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;lecture-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_46__ent_176__ent_175

**All observed names:** Michael McKeon → Mr. Pataki (4)

Ordered IDs: Ent[ent_176] → Ent[ent_175]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [373](../raw_map.tsv:373) | Michael McKeon | Mr. Pataki | appos\|-&gt;appos-&gt;secretary-&gt;poss-&gt;\|poss |
| [378](../raw_map.tsv:378) | Michael McKeon | Mr. Pataki | appos\|&lt;-appos&lt;-spokesman&lt;-nsubj&lt;-compare-&gt;dep-&gt;thrash-&gt;nsubj-&gt;\|nsubj |
| [379](../raw_map.tsv:379) | Michael McKeon | Mr. Pataki | appos\|-&gt;appos-&gt;secretary-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [380](../raw_map.tsv:380) | Michael McKeon | Mr. Pataki | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Michael McKeon → Mr. Pataki: Direct possessive secretary and secretary-to appositions establish service as the named principal secretary.

Cited evidence lines: [373](../raw_map.tsv:373), [378](../raw_map.tsv:378), [379](../raw_map.tsv:379), [380](../raw_map.tsv:380).


Issue tags: mixed_evidence

### rel_46__ent_111__ent_114

**All observed names:** Riley → Starks (3)

Ordered IDs: Ent[ent_111] → Ent[ent_114]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1546](../raw_map.tsv:1546) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-bench-&gt;dobj-&gt;\|dobj |
| [1550](../raw_map.tsv:1550) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-go-&gt;prep-&gt;with-&gt;pobj-&gt;rotation-&gt;appos-&gt;\|appos |
| [1552](../raw_map.tsv:1552) | Riley | Starks | rcmod\|-&gt;rcmod-&gt;lecture-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Riley → Starks: Sports benching, rotation, competition and victory are not a secretary role.

Cited evidence lines: [1546](../raw_map.tsv:1546), [1550](../raw_map.tsv:1550), [1552](../raw_map.tsv:1552).




### rel_46__ent_321__ent_600

**All observed names:** Mets → Cubs (3)

Ordered IDs: Ent[ent_321] → Ent[ent_600]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6962](../raw_map.tsv:6962) | Mets | Cubs | dobj\|&lt;-dobj&lt;-lift-&gt;prep-&gt;into-&gt;pobj-&gt;playoff-&gt;rcmod-&gt;win-&gt;nsubj-&gt;\|nsubj |
| [6965](../raw_map.tsv:6965) | Mets | Cubs | poss\|&lt;-poss&lt;-game&lt;-pobj&lt;-by&lt;-prep&lt;-backed&lt;-nsubj&lt;-kick-&gt;nsubj-&gt;\|nsubj |
| [6966](../raw_map.tsv:6966) | Mets | Cubs | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;series-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mets → Cubs: Sports benching, rotation, competition and victory are not a secretary role.

Cited evidence lines: [6962](../raw_map.tsv:6962), [6965](../raw_map.tsv:6965), [6966](../raw_map.tsv:6966).



