# audit_e318fe663470 — rel_40: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 1 supported, 3 incorrect, 0 ambiguous; N=4. Precision 1/4=25.00% to 1/4=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-blame-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;co-chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-recommended-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-p.m.&lt;-pobj&lt;-at&lt;-prep&lt;-perform-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-gate&lt;-pobj&lt;-at&lt;-prep&lt;-a.m.&lt;-pobj&lt;-at&lt;-prep&lt;-meet-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter-&gt;dep-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-garden&lt;-nsubj&lt;-mile-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;north-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | trigger#-lrb-718-rrb- 273-2060 Museum_Snug_Harbor Richmond_Terrace_Livingston source#Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#'_Women_in_Art_III_'_Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_6_to_12_Tomorrow_Cynthia_Pannucci_is_in_the_middle_of_making_a_fiber-optic_lighted_Plexiglas_insect_,_which_will_float_in_a_cove_at_Battery_Park_City_in_the_summer_of_1995_. lc#'s rc#(718)_273-2060_Recommended |

## Every evaluated fact

### rel_40__ent_1007__ent_227

**All observed names:** Snug Harbor → Richmond Terrace (7)

Ordered IDs: Ent[ent_1007] → Ent[ent_227]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6195](../raw_map.tsv:6195) | Snug Harbor | Richmond Terrace | dep\|-&gt;dep-&gt;be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6197](../raw_map.tsv:6197) | Snug Harbor | Richmond Terrace | trigger#-lrb-718-rrb- 273-2060 Museum_Snug_Harbor Richmond_Terrace_Livingston source#Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#'_Women_in_Art_III_'_Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_6_to_12_Tomorrow_Cynthia_Pannucci_is_in_the_middle_of_making_a_fiber-optic_lighted_Plexiglas_insect_,_which_will_float_in_a_cove_at_Battery_Park_City_in_the_summer_of_1995_. lc#'s rc#(718)_273-2060_Recommended |
| [6198](../raw_map.tsv:6198) | Snug Harbor | Richmond Terrace | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;north-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| [6200](../raw_map.tsv:6200) | Snug Harbor | Richmond Terrace | poss\|&lt;-poss&lt;-garden&lt;-nsubj&lt;-mile-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6201](../raw_map.tsv:6201) | Snug Harbor | Richmond Terrace | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-gate&lt;-pobj&lt;-at&lt;-prep&lt;-a.m.&lt;-pobj&lt;-at&lt;-prep&lt;-meet-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| [6202](../raw_map.tsv:6202) | Snug Harbor | Richmond Terrace | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-p.m.&lt;-pobj&lt;-at&lt;-prep&lt;-perform-&gt;dobj-&gt;\|dobj |
| [6203](../raw_map.tsv:6203) | Snug Harbor | Richmond Terrace | nn\|&lt;-nn&lt;-recommended-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Snug Harbor → Richmond Terrace: Direct be-at and venue address context establish Snug Harbor's location on Richmond Terrace.

Cited evidence lines: [6195](../raw_map.tsv:6195), [6197](../raw_map.tsv:6197), [6198](../raw_map.tsv:6198), [6200](../raw_map.tsv:6200), [6201](../raw_map.tsv:6201), [6202](../raw_map.tsv:6202), [6203](../raw_map.tsv:6203).


Issue tags: mixed_evidence

### rel_40__ent_1445__ent_1235

**All observed names:** Tom Daschle → Democratic (3)

Ordered IDs: Ent[ent_1445] → Ent[ent_1235]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3699](../raw_map.tsv:3699) | Tom Daschle | Democratic | appos\|-&gt;appos-&gt;co-chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3701](../raw_map.tsv:3701) | Tom Daschle | Democratic | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;amod-&gt;\|amod |
| [3702](../raw_map.tsv:3702) | Tom Daschle | Democratic | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter-&gt;dep-&gt;leader-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Tom Daschle → Democratic: Political leadership or blame does not establish an organization's location.

Cited evidence lines: [3699](../raw_map.tsv:3699), [3701](../raw_map.tsv:3701), [3702](../raw_map.tsv:3702).




### rel_40__ent_1213__ent_819

**All observed names:** Republicans → Democrats (1)

Ordered IDs: Ent[ent_1213] → Ent[ent_819]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1908](../raw_map.tsv:1908) | Republicans | Democrats | nsubj\|&lt;-nsubj&lt;-blame-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Republicans → Democrats: Political leadership or blame does not establish an organization's location.

Cited evidence lines: [1908](../raw_map.tsv:1908).




### rel_40__ent_1296__ent_424

**All observed names:** Republicans → Democrats (1)

Ordered IDs: Ent[ent_1296] → Ent[ent_424]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5481](../raw_map.tsv:5481) | Republicans | Democrats | nsubj\|&lt;-nsubj&lt;-blame-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Republicans → Democrats: Political leadership or blame does not establish an organization's location.

Cited evidence lines: [5481](../raw_map.tsv:5481).



