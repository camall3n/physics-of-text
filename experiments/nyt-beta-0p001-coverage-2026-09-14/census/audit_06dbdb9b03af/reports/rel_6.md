# audit_06dbdb9b03af — rel_6: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 3 supported, 2 incorrect, 0 ambiguous; N=5. Precision 3/5=60.00% to 3/5=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-gallery-&gt;appos-&gt;information-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-p.m.-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;dobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-upset-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-continue-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-p.m.&lt;-pobj&lt;-at&lt;-prep&lt;-perform-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-print-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-gate&lt;-pobj&lt;-at&lt;-prep&lt;-a.m.&lt;-pobj&lt;-at&lt;-prep&lt;-meet-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-consign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-grounds&lt;-pobj&lt;-throughout&lt;-prep&lt;-performance&lt;-pobj&lt;-of&lt;-prep&lt;-series&lt;-dobj&lt;-present-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | trigger#-lrb-718-rrb- 273-2060 Museum_Snug_Harbor Richmond_Terrace_Livingston source#Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#'_Women_in_Art_III_'_Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_6_to_12_Tomorrow_Cynthia_Pannucci_is_in_the_middle_of_making_a_fiber-optic_lighted_Plexiglas_insect_,_which_will_float_in_a_cove_at_Battery_Park_City_in_the_summer_of_1995_. lc#'s rc#(718)_273-2060_Recommended |
| 1 | trigger#-lrb-718-rrb- 273-2060 Staten_Island_Children_'s_Museum_Snug_Harbor Richmond_Terrace_Livingston source#Staten/NNP/ORGANIZATION_Island/NNP/ORGANIZATION_Children/NNP/ORGANIZATION_'s/POS/ORGANIZATION_Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_All_ages_The_Staten_Island_Children_'s_Museum_has_the_honor_of_being_on_the_grounds_of_the_Snug_Harbor_Cultural_Center_,_an_80-acre_former_colony_for_weary_sailors_. rc#(718)_273-2060_Recommended |

## Every evaluated fact

### rel_6__ent_1165__ent_227

**All observed names:** Snug Harbor → Richmond Terrace (6)

Ordered IDs: Ent[ent_1165] → Ent[ent_227]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6194](../raw_map.tsv:6194) | Snug Harbor | Richmond Terrace | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6196](../raw_map.tsv:6196) | Snug Harbor | Richmond Terrace | trigger#-lrb-718-rrb- 273-2060 Staten_Island_Children_'s_Museum_Snug_Harbor Richmond_Terrace_Livingston source#Staten/NNP/ORGANIZATION_Island/NNP/ORGANIZATION_Children/NNP/ORGANIZATION_'s/POS/ORGANIZATION_Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_All_ages_The_Staten_Island_Children_'s_Museum_has_the_honor_of_being_on_the_grounds_of_the_Snug_Harbor_Cultural_Center_,_an_80-acre_former_colony_for_weary_sailors_. rc#(718)_273-2060_Recommended |
| [6197](../raw_map.tsv:6197) | Snug Harbor | Richmond Terrace | trigger#-lrb-718-rrb- 273-2060 Museum_Snug_Harbor Richmond_Terrace_Livingston source#Museum/NNP/ORGANIZATION_Snug/NNP/ORGANIZATION_Harbor/NNP/ORGANIZATION dest#Richmond/NNP/ORGANIZATION_Terrace/NNP/ORGANIZATION_Livingston/NNP/ORGANIZATION path#nn\|&lt;-nn&lt;--lrb-718-rrb- 273-2060-&gt;nn-&gt;\|nn sen#'_Women_in_Art_III_'_Staten_Island_Children_'s_Museum_Snug_Harbor_1000_Richmond_Terrace_Livingston_(718)_273-2060_Recommended_ages_:_6_to_12_Tomorrow_Cynthia_Pannucci_is_in_the_middle_of_making_a_fiber-optic_lighted_Plexiglas_insect_,_which_will_float_in_a_cove_at_Battery_Park_City_in_the_summer_of_1995_. lc#'s rc#(718)_273-2060_Recommended |
| [6199](../raw_map.tsv:6199) | Snug Harbor | Richmond Terrace | poss\|&lt;-poss&lt;-grounds&lt;-pobj&lt;-throughout&lt;-prep&lt;-performance&lt;-pobj&lt;-of&lt;-prep&lt;-series&lt;-dobj&lt;-present-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6201](../raw_map.tsv:6201) | Snug Harbor | Richmond Terrace | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-gate&lt;-pobj&lt;-at&lt;-prep&lt;-a.m.&lt;-pobj&lt;-at&lt;-prep&lt;-meet-&gt;prep-&gt;off-&gt;pobj-&gt;\|pobj |
| [6202](../raw_map.tsv:6202) | Snug Harbor | Richmond Terrace | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-p.m.&lt;-pobj&lt;-at&lt;-prep&lt;-perform-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Snug Harbor → Richmond Terrace: An explicit institution-at-street or local physical address establishes organizational location.

Cited evidence lines: [6194](../raw_map.tsv:6194), [6196](../raw_map.tsv:6196), [6197](../raw_map.tsv:6197), [6199](../raw_map.tsv:6199), [6201](../raw_map.tsv:6201), [6202](../raw_map.tsv:6202).


Issue tags: mixed_evidence

### rel_6__ent_481__ent_484

**All observed names:** Sotheby → 72d Street (5)

Ordered IDs: Ent[ent_481] → Ent[ent_484]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6254](../raw_map.tsv:6254) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6255](../raw_map.tsv:6255) | Sotheby | 72d Street | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6257](../raw_map.tsv:6257) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6259](../raw_map.tsv:6259) | Sotheby | 72d Street | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6263](../raw_map.tsv:6263) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-consign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sotheby → 72d Street: An explicit institution-at-street or local physical address establishes organizational location.

Cited evidence lines: [6254](../raw_map.tsv:6254), [6255](../raw_map.tsv:6255), [6257](../raw_map.tsv:6257), [6259](../raw_map.tsv:6259), [6263](../raw_map.tsv:6263).


Issue tags: mixed_evidence

### rel_6__ent_241__ent_483

**All observed names:** Montclair Art Museum → South Mountain Avenue (5)

Ordered IDs: Ent[ent_241] → Ent[ent_483]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6264](../raw_map.tsv:6264) | Montclair Art Museum | South Mountain Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6265](../raw_map.tsv:6265) | Montclair Art Museum | South Mountain Avenue | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-print-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6266](../raw_map.tsv:6266) | Montclair Art Museum | South Mountain Avenue | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-continue-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6267](../raw_map.tsv:6267) | Montclair Art Museum | South Mountain Avenue | nn\|&lt;-nn&lt;-p.m.-&gt;nn-&gt;\|nn |
| [6268](../raw_map.tsv:6268) | Montclair Art Museum | South Mountain Avenue | appos\|&lt;-appos&lt;-gallery-&gt;appos-&gt;information-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Montclair Art Museum → South Mountain Avenue: An explicit institution-at-street or local physical address establishes organizational location.

Cited evidence lines: [6264](../raw_map.tsv:6264), [6265](../raw_map.tsv:6265), [6266](../raw_map.tsv:6266), [6267](../raw_map.tsv:6267), [6268](../raw_map.tsv:6268).


Issue tags: mixed_evidence

### rel_6__ent_197__ent_586

**All observed names:** Ms. Lewinsky → White House (4)

Ordered IDs: Ent[ent_197] → Ent[ent_586]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3489](../raw_map.tsv:3489) | Ms. Lewinsky | White House | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |
| [3492](../raw_map.tsv:3492) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6174](../raw_map.tsv:6174) | Ms. Lewinsky | White House | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |
| [6177](../raw_map.tsv:6177) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ms. Lewinsky → White House: A person internship/presence or a sporting opponent is not organization-to-geographic-location.

Cited evidence lines: [3489](../raw_map.tsv:3489), [3492](../raw_map.tsv:3492), [6174](../raw_map.tsv:6174), [6177](../raw_map.tsv:6177).




### rel_6__ent_561__ent_560

**All observed names:** Giants → Redskins (2)

Ordered IDs: Ent[ent_561] → Ent[ent_560]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [897](../raw_map.tsv:897) | Giants | Redskins | nsubj\|&lt;-nsubj&lt;-upset-&gt;dobj-&gt;\|dobj |
| [900](../raw_map.tsv:900) | Giants | Redskins | nsubj\|&lt;-nsubj&lt;-play-&gt;dobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Giants → Redskins: A person internship/presence or a sporting opponent is not organization-to-geographic-location.

Cited evidence lines: [897](../raw_map.tsv:897), [900](../raw_map.tsv:900).



