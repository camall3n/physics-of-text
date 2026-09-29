# audit_e318fe663470 — rel_17: supports or endorses

Predicate ID: supports

Entity X explicitly gives political, material, or institutional support or endorsement to Y.

Includes: explicit supports, backs, endorses, or provides identified aid to Y; voting for Y as an endorsement; historical support. Excludes: merely pressuring or criticizing Y; ordinary alliance or meeting without support assertion; generic possession or acquisition; physical support of an object unrelated to the institutional relation. Ambiguous unless resolved by case-local evidence: give with omitted object; unclear support versus pressure or opposition; a future proposed endorsement without realization. This does not imply permanent agreement or exclusive support. A bare give edge is insufficient without an identified supportive act or other local evidence.

Complete census: 1 supported, 2 incorrect, 1 ambiguous; N=4. Precision 1/4=25.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|&lt;-appos&lt;-son-&gt;dep-&gt;brother-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-wife-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;street-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-spend-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-pobj&lt;-in&lt;-prep&lt;-disavow-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-envoy&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-statement&lt;-nsubj&lt;-look-&gt;prep-&gt;like-&gt;pobj-&gt;reward-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;aid-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;favor-&gt;rcmod-&gt;support-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;stand-&gt;prep-&gt;with-&gt;pobj-&gt;exception-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_17__ent_406__ent_333

**All observed names:** William → Manhattan (4)

Ordered IDs: Ent[ent_406] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4018](../raw_map.tsv:4018) | William | Manhattan | nsubj\|&lt;-nsubj&lt;-spend-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4021](../raw_map.tsv:4021) | William | Manhattan | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;street-&gt;appos-&gt;\|appos |
| [4022](../raw_map.tsv:4022) | William | Manhattan | appos\|&lt;-appos&lt;-wife-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4023](../raw_map.tsv:4023) | William | Manhattan | appos\|&lt;-appos&lt;-son-&gt;dep-&gt;brother-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). William → Manhattan: Family/residence or a coach title does not establish institutional support.

Cited evidence lines: [4018](../raw_map.tsv:4018), [4021](../raw_map.tsv:4021), [4022](../raw_map.tsv:4022), [4023](../raw_map.tsv:4023).




### rel_17__ent_1352__ent_721

**All observed names:** Republicans → John McCain (3)

Ordered IDs: Ent[ent_1352] → Ent[ent_721]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7550](../raw_map.tsv:7550) | Republicans | John McCain | rcmod\|-&gt;rcmod-&gt;stand-&gt;prep-&gt;with-&gt;pobj-&gt;exception-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7553](../raw_map.tsv:7553) | Republicans | John McCain | rcmod\|-&gt;rcmod-&gt;favor-&gt;rcmod-&gt;support-&gt;dobj-&gt;\|dobj |
| [7554](../raw_map.tsv:7554) | Republicans | John McCain | rcmod\|-&gt;rcmod-&gt;aid-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Republicans → John McCain: An explicit support direct-object row supplies forward support for John McCain; reverse aid-by is distinct evidence.

Cited evidence lines: [7550](../raw_map.tsv:7550), [7553](../raw_map.tsv:7553), [7554](../raw_map.tsv:7554).


Issue tags: mixed_evidence

### rel_17__ent_182__ent_519

**All observed names:** Mr. Bush → Mr. Arafat (3)

Ordered IDs: Ent[ent_182] → Ent[ent_519]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8243](../raw_map.tsv:8243) | Mr. Bush | Mr. Arafat | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-pobj&lt;-in&lt;-prep&lt;-disavow-&gt;nsubj-&gt;\|nsubj |
| [8247](../raw_map.tsv:8247) | Mr. Bush | Mr. Arafat | poss\|&lt;-poss&lt;-statement&lt;-nsubj&lt;-look-&gt;prep-&gt;like-&gt;pobj-&gt;reward-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8250](../raw_map.tsv:8250) | Mr. Bush | Mr. Arafat | poss\|&lt;-poss&lt;-envoy&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Mr. Bush → Mr. Arafat: The apparent reward/support is attributed by looks-like wording, while an envoy's request and reverse disavowal do not resolve direct support by Bush.

Cited evidence lines: [8243](../raw_map.tsv:8243), [8247](../raw_map.tsv:8247), [8250](../raw_map.tsv:8250).

**Review question:** Does the text actually assert support by Mr. Bush, or only characterize his statement as a possible reward?
Issue tags: attribution_ambiguity

### rel_17__ent_239__ent_27

**All observed names:** Bill Parcells → Giants (1)

Ordered IDs: Ent[ent_239] → Ent[ent_27]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6491](../raw_map.tsv:6491) | Bill Parcells | Giants | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Bill Parcells → Giants: Family/residence or a coach title does not establish institutional support.

Cited evidence lines: [6491](../raw_map.tsv:6491).



