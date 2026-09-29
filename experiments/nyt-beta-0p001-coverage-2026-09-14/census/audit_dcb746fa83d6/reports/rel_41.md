# audit_dcb746fa83d6 — rel_41: president of institution

Predicate ID: president_of

Person X holds or held an explicitly identified president office in organization, team, public body, or institution Y.

Includes: explicit president office; a functional or departmental president role within Y; historical or former presidency. Excludes: manager, director, chairman, head, or executive alone without a president title; ordinary employment or membership; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: president-elect or unresolved tenure without evidence of holding office; an incomplete institution or personal principal; unclear holder or title attachment. This specific title is separate from president_or_manager_of and managerial_office_in. It does not require that the officeholder be the sole head of Y.

Complete census: 2 supported, 2 incorrect, 2 ambiguous; N=6. Precision 2/6=33.33% to 4/6=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|&lt;-appos&lt;-candidate-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-urge-&gt;prep-&gt;from-&gt;pobj-&gt;campus-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-endorse-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-friday&lt;-dep&lt;-visit&lt;-nsubj&lt;-come-&gt;nsubj-&gt;president-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-budget&lt;-pobj&lt;-in&lt;-prep&lt;-available&lt;-amod&lt;-money-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-shot-&gt;partmod-&gt;pose-&gt;prep-&gt;in-&gt;pobj-&gt;sunshine-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-work-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-candidacy-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-occupation-&gt;prep-&gt;of-&gt;pobj-&gt;territory-&gt;partmod-&gt;belong-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-relation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-remark&lt;-pobj&lt;-before&lt;-prep&lt;-sit-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;appos-&gt;\|appos |
| 1 | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;nomination-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_41__ent_1376__ent_333

**All observed names:** C. Virginia Fields → Manhattan (6)

Ordered IDs: Ent[ent_1376] → Ent[ent_333]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2803](../raw_map.tsv:2803) | C. Virginia Fields | Manhattan | appos\|&lt;-appos&lt;-candidate-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| [2805](../raw_map.tsv:2805) | C. Virginia Fields | Manhattan | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;nomination-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| [2808](../raw_map.tsv:2808) | C. Virginia Fields | Manhattan | poss\|&lt;-poss&lt;-candidacy-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| [2809](../raw_map.tsv:2809) | C. Virginia Fields | Manhattan | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-budget&lt;-pobj&lt;-in&lt;-prep&lt;-available&lt;-amod&lt;-money-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| [2810](../raw_map.tsv:2810) | C. Virginia Fields | Manhattan | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-friday&lt;-dep&lt;-visit&lt;-nsubj&lt;-come-&gt;nsubj-&gt;president-&gt;nn-&gt;\|nn |
| [2811](../raw_map.tsv:2811) | C. Virginia Fields | Manhattan | nsubjpass\|&lt;-nsubjpass&lt;-endorse-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). C. Virginia Fields → Manhattan: Independent unqualified president apposition or as-president evidence establishes office beyond the separate candidacy references.

Cited evidence lines: [2803](../raw_map.tsv:2803), [2805](../raw_map.tsv:2805), [2808](../raw_map.tsv:2808), [2809](../raw_map.tsv:2809), [2810](../raw_map.tsv:2810), [2811](../raw_map.tsv:2811).


Issue tags: mixed_evidence

### rel_41__ent_182__ent_1127

**All observed names:** Mr. Bush → Laura (3)

Ordered IDs: Ent[ent_182] → Ent[ent_1127]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4576](../raw_map.tsv:4576) | Mr. Bush | Laura | poss\|&lt;-poss&lt;-remark&lt;-pobj&lt;-before&lt;-prep&lt;-sit-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;appos-&gt;\|appos |
| [4577](../raw_map.tsv:4577) | Mr. Bush | Laura | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-work-&gt;dobj-&gt;\|dobj |
| [4578](../raw_map.tsv:4578) | Mr. Bush | Laura | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-shot-&gt;partmod-&gt;pose-&gt;prep-&gt;in-&gt;pobj-&gt;sunshine-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Bush → Laura: Marital companionship or relations between countries do not establish a person holding an institutional president office.

Cited evidence lines: [4576](../raw_map.tsv:4576), [4577](../raw_map.tsv:4577), [4578](../raw_map.tsv:4578).




### rel_41__ent_1442__ent_20

**All observed names:** Fernando Ferrer → Bronx Borough (2)

Ordered IDs: Ent[ent_1442] → Ent[ent_20]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2795](../raw_map.tsv:2795) | Fernando Ferrer | Bronx Borough | appos\|&lt;-appos&lt;-candidate-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| [2797](../raw_map.tsv:2797) | Fernando Ferrer | Bronx Borough | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Fernando Ferrer → Bronx Borough: Independent unqualified president apposition or as-president evidence establishes office beyond the separate candidacy references.

Cited evidence lines: [2795](../raw_map.tsv:2795), [2797](../raw_map.tsv:2797).




### rel_41__ent_499__ent_165

**All observed names:** David N. Dinkins → Manhattan (2)

Ordered IDs: Ent[ent_499] → Ent[ent_165]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2847](../raw_map.tsv:2847) | David N. Dinkins | Manhattan | appos\|&lt;-appos&lt;-candidate-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| [2853](../raw_map.tsv:2853) | David N. Dinkins | Manhattan | nsubj\|&lt;-nsubj&lt;-urge-&gt;prep-&gt;from-&gt;pobj-&gt;campus-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). David N. Dinkins → Manhattan: The only president title is attached through candidate apposition, leaving candidacy for versus actual holding of the presidency unresolved.

Cited evidence lines: [2847](../raw_map.tsv:2847), [2853](../raw_map.tsv:2853).

**Review question:** Does the full apposition identify an actual current or former borough president, or merely a candidate for that office?
Issue tags: modality, attachment

### rel_41__ent_1434__ent_451

**All observed names:** Israel → Egypt (2)

Ordered IDs: Ent[ent_1434] → Ent[ent_451]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5192](../raw_map.tsv:5192) | Israel | Egypt | poss\|&lt;-poss&lt;-relation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5194](../raw_map.tsv:5194) | Israel | Egypt | poss\|&lt;-poss&lt;-occupation-&gt;prep-&gt;of-&gt;pobj-&gt;territory-&gt;partmod-&gt;belong-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Israel → Egypt: Marital companionship or relations between countries do not establish a person holding an institutional president office.

Cited evidence lines: [5192](../raw_map.tsv:5192), [5194](../raw_map.tsv:5194).




### rel_41__ent_253__ent_1260

**All observed names:** Fernando Ferrer → Bronx (1)

Ordered IDs: Ent[ent_253] → Ent[ent_1260]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2785](../raw_map.tsv:2785) | Fernando Ferrer | Bronx | appos\|&lt;-appos&lt;-candidate-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Fernando Ferrer → Bronx: The only president title is attached through candidate apposition, leaving candidacy for versus actual holding of the presidency unresolved.

Cited evidence lines: [2785](../raw_map.tsv:2785).

**Review question:** Does the full apposition identify an actual current or former borough president, or merely a candidate for that office?
Issue tags: modality, attachment
