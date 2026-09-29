# audit_9c88162c7b22 — rel_57: has or had medical condition

Predicate ID: has_medical_condition

Person X, or an explicitly identified subset of population X, has or had medical condition Y.

Includes: explicit having or suffering from Y; diagnosis of Y; death from or of Y establishing the condition; a stated affected subset of a named population. Excludes: generic discussion or research about Y; treating another person with Y; a disease merely located in a place; a generic have phrase whose object is not a medical condition. Ambiguous unless resolved by case-local evidence: unclear condition attachment or affected person; risk, possible diagnosis, or suspected condition without confirmation; a population mention that does not identify affected members. This is annotation of textual support, not medical guidance. A population fact does not imply every member has the condition.

Complete census: 3 supported, 0 incorrect, 0 ambiguous; N=3. Precision 3/3=100.00% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-suffer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;complex-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;virus-&gt;rcmod-&gt;cause-&gt;dobj-&gt;\|dobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-infect-&gt;prep-&gt;with-&gt;pobj-&gt;virus-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-cover-&gt;prep-&gt;as-&gt;pobj-&gt;pianist-&gt;prep-&gt;to-&gt;pobj-&gt;death-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-million-&gt;prep-&gt;with-&gt;pobj-&gt;condition-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-million&lt;-nsubj&lt;-develop-&gt;dobj-&gt;form-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-significant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;show-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;suffer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_57__ent_669__ent_202

**All observed names:** Americans → diabetes (6)

Ordered IDs: Ent[ent_669] → Ent[ent_202]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4872](../raw_map.tsv:4872) | Americans | diabetes | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4873](../raw_map.tsv:4873) | Americans | diabetes | nsubj\|&lt;-nsubj&lt;-suffer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4874](../raw_map.tsv:4874) | Americans | diabetes | rcmod\|-&gt;rcmod-&gt;suffer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4876](../raw_map.tsv:4876) | Americans | diabetes | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-significant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [4880](../raw_map.tsv:4880) | Americans | diabetes | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-million-&gt;prep-&gt;with-&gt;pobj-&gt;condition-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| [4881](../raw_map.tsv:4881) | Americans | diabetes | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-million&lt;-nsubj&lt;-develop-&gt;dobj-&gt;form-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Americans → diabetes: Explicit having, suffering from or dying of the condition establishes it for the person or affected members of the named population.

Cited evidence lines: [4872](../raw_map.tsv:4872), [4873](../raw_map.tsv:4873), [4874](../raw_map.tsv:4874), [4876](../raw_map.tsv:4876), [4880](../raw_map.tsv:4880), [4881](../raw_map.tsv:4881).




### rel_57__ent_201__ent_443

**All observed names:** New Yorkers → AIDS (5)

Ordered IDs: Ent[ent_201] → Ent[ent_443]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4906](../raw_map.tsv:4906) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4908](../raw_map.tsv:4908) | New Yorkers | AIDS | nsubjpass\|&lt;-nsubjpass&lt;-infect-&gt;prep-&gt;with-&gt;pobj-&gt;virus-&gt;nn-&gt;\|nn |
| [4910](../raw_map.tsv:4910) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;complex-&gt;amod-&gt;\|amod |
| [4914](../raw_map.tsv:4914) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-suffer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4915](../raw_map.tsv:4915) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). New Yorkers → AIDS: Explicit having, suffering from or dying of the condition establishes it for the person or affected members of the named population.

Cited evidence lines: [4906](../raw_map.tsv:4906), [4908](../raw_map.tsv:4908), [4910](../raw_map.tsv:4910), [4914](../raw_map.tsv:4914), [4915](../raw_map.tsv:4915).




### rel_57__ent_685__ent_443

**All observed names:** Liberace → AIDS (5)

Ordered IDs: Ent[ent_685] → Ent[ent_443]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4916](../raw_map.tsv:4916) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4918](../raw_map.tsv:4918) | Liberace | AIDS | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;show-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4920](../raw_map.tsv:4920) | Liberace | AIDS | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-cover-&gt;prep-&gt;as-&gt;pobj-&gt;pianist-&gt;prep-&gt;to-&gt;pobj-&gt;death-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4924](../raw_map.tsv:4924) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;virus-&gt;rcmod-&gt;cause-&gt;dobj-&gt;\|dobj |
| [4925](../raw_map.tsv:4925) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Liberace → AIDS: Explicit having, suffering from or dying of the condition establishes it for the person or affected members of the named population.

Cited evidence lines: [4916](../raw_map.tsv:4916), [4918](../raw_map.tsv:4918), [4920](../raw_map.tsv:4920), [4924](../raw_map.tsv:4924), [4925](../raw_map.tsv:4925).



