# audit_9c88162c7b22 — rel_83: dancer for company

Predicate ID: dancer_for

Person X dances or danced professionally for dance company or producing ensemble Y.

Includes: explicit dancer in or for Y; principal dancer role in Y; performing for Y when the local dancer role is established. Excludes: directing or management alone; generic performing without dance context; staging a work or being on payroll alone; a venue without company affiliation. Ambiguous unless resolved by case-local evidence: principal title without clear dancer meaning; unclear dancer versus director attachment; company versus venue identity unresolved. A specific artistic occupation, distinct from general institutional membership or management.

Complete census: 1 supported, 2 incorrect, 0 ambiguous; N=3. Precision 1/3=33.33% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|-&gt;appos-&gt;dancer-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;partner-&gt;rcmod-&gt;direct-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;principal-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-kill-&gt;tmod-&gt;day-&gt;dep-&gt;be-&gt;nsubj-&gt;he-&gt;appos-&gt;\|appos |
| 1 | partmod\|-&gt;partmod-&gt;perform-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-work&lt;-pobj&lt;-in&lt;-prep&lt;-dancer-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-staging-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-accuse-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-romance&lt;-rcmod&lt;-spendthrift-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;payroll-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;turn-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_83__ent_298__ent_19

**All observed names:** Kevin McKenzie → Ballet Theater (6)

Ordered IDs: Ent[ent_298] → Ent[ent_19]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3550](../raw_map.tsv:3550) | Kevin McKenzie | Ballet Theater | appos\|-&gt;appos-&gt;partner-&gt;rcmod-&gt;direct-&gt;dobj-&gt;\|dobj |
| [3551](../raw_map.tsv:3551) | Kevin McKenzie | Ballet Theater | appos\|-&gt;appos-&gt;dancer-&gt;nn-&gt;\|nn |
| [3552](../raw_map.tsv:3552) | Kevin McKenzie | Ballet Theater | poss\|&lt;-poss&lt;-staging-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3553](../raw_map.tsv:3553) | Kevin McKenzie | Ballet Theater | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-work&lt;-pobj&lt;-in&lt;-prep&lt;-dancer-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3554](../raw_map.tsv:3554) | Kevin McKenzie | Ballet Theater | partmod\|-&gt;partmod-&gt;perform-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [3555](../raw_map.tsv:3555) | Kevin McKenzie | Ballet Theater | appos\|-&gt;appos-&gt;principal-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Kevin McKenzie → Ballet Theater: An explicit Ballet Theater dancer title identifies professional dance membership, corroborated by principal and performance context.

Cited evidence lines: [3550](../raw_map.tsv:3550), [3551](../raw_map.tsv:3551), [3552](../raw_map.tsv:3552), [3553](../raw_map.tsv:3553), [3554](../raw_map.tsv:3554), [3555](../raw_map.tsv:3555).


Issue tags: mixed_evidence

### rel_83__ent_1114__ent_418

**All observed names:** Mr. Ammon → Generosa (3)

Ordered IDs: Ent[ent_1114] → Ent[ent_418]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4505](../raw_map.tsv:4505) | Mr. Ammon | Generosa | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-romance&lt;-rcmod&lt;-spendthrift-&gt;appos-&gt;\|appos |
| [4508](../raw_map.tsv:4508) | Mr. Ammon | Generosa | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-accuse-&gt;appos-&gt;\|appos |
| [4510](../raw_map.tsv:4510) | Mr. Ammon | Generosa | nsubjpass\|&lt;-nsubjpass&lt;-kill-&gt;tmod-&gt;day-&gt;dep-&gt;be-&gt;nsubj-&gt;he-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Ammon → Generosa: Wife, romance, accusation, and death evidence does not identify a dancer-company relationship.

Cited evidence lines: [4505](../raw_map.tsv:4505), [4508](../raw_map.tsv:4508), [4510](../raw_map.tsv:4510).




### rel_83__ent_1042__ent_308

**All observed names:** Isiah Thomas → Knicks (2)

Ordered IDs: Ent[ent_1042] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1650](../raw_map.tsv:1650) | Isiah Thomas | Knicks | rcmod\|-&gt;rcmod-&gt;turn-&gt;nsubj-&gt;\|nsubj |
| [1654](../raw_map.tsv:1654) | Isiah Thomas | Knicks | rcmod\|-&gt;rcmod-&gt;payroll-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Isiah Thomas → Knicks: Being on the Knicks payroll does not establish professional dance work for a dance company.

Cited evidence lines: [1650](../raw_map.tsv:1650), [1654](../raw_map.tsv:1654).



