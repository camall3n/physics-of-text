# audit_9c88162c7b22 — rel_45: died in place

Predicate ID: died_in

Person X, or an explicitly identified subset of population X, died in geographic place Y.

Includes: explicit died-in or death-in location; being killed in Y establishing death there; historical death location. Excludes: residence, birth, or ordinary presence alone; Y is the perpetrator or cause rather than location; discussion of deaths without the affected person or population. Ambiguous unless resolved by case-local evidence: place versus institution unresolved; unclear death or geographic attachment; a population mention without identified affected members. This describes location of death, not where X lived or who caused death. An affected subset does not imply every member died.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-kill&lt;-nsubjpass&lt;-collect-&gt;prep-&gt;by-&gt;pobj-&gt;friend-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-pobj&lt;-on&lt;-prep&lt;-column-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-push-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;crash-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;campaign-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;on-&gt;pobj-&gt;staff-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;in-&gt;pobj-&gt;exile-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;call-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;include-&gt;dobj-&gt;picture-&gt;prep-&gt;of-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_45__ent_747__ent_824

**All observed names:** Diana → Paris (6)

Ordered IDs: Ent[ent_747] → Ent[ent_824]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8160](../raw_map.tsv:8160) | Diana | Paris | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8164](../raw_map.tsv:8164) | Diana | Paris | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;crash-&gt;nn-&gt;\|nn |
| [8165](../raw_map.tsv:8165) | Diana | Paris | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-pobj&lt;-on&lt;-prep&lt;-column-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8167](../raw_map.tsv:8167) | Diana | Paris | nsubjpass\|&lt;-nsubjpass&lt;-kill&lt;-nsubjpass&lt;-collect-&gt;prep-&gt;by-&gt;pobj-&gt;friend-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8168](../raw_map.tsv:8168) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8169](../raw_map.tsv:8169) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;include-&gt;dobj-&gt;picture-&gt;prep-&gt;of-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Diana → Paris: Explicit death-in or being killed in an accident in the place establishes death location.

Cited evidence lines: [8160](../raw_map.tsv:8160), [8164](../raw_map.tsv:8164), [8165](../raw_map.tsv:8165), [8167](../raw_map.tsv:8167), [8168](../raw_map.tsv:8168), [8169](../raw_map.tsv:8169).


Issue tags: mixed_evidence

### rel_45__ent_819__ent_967

**All observed names:** Democrats → Edward M. Kennedy (4)

Ordered IDs: Ent[ent_819] → Ent[ent_967]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7569](../raw_map.tsv:7569) | Democrats | Edward M. Kennedy | rcmod\|-&gt;rcmod-&gt;call-&gt;nsubj-&gt;\|nsubj |
| [7570](../raw_map.tsv:7570) | Democrats | Edward M. Kennedy | prep\|-&gt;prep-&gt;on-&gt;pobj-&gt;staff-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7572](../raw_map.tsv:7572) | Democrats | Edward M. Kennedy | prep\|-&gt;prep-&gt;include-&gt;pobj-&gt;campaign-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7575](../raw_map.tsv:7575) | Democrats | Edward M. Kennedy | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-push-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Democrats → Edward M. Kennedy: Political staff interactions or weapons sales are unrelated to death location.

Cited evidence lines: [7569](../raw_map.tsv:7569), [7570](../raw_map.tsv:7570), [7572](../raw_map.tsv:7572), [7575](../raw_map.tsv:7575).


Issue tags: wrong_predicate

### rel_45__ent_988__ent_507

**All observed names:** Mr. Marcos → Hawaii (4)

Ordered IDs: Ent[ent_988] → Ent[ent_507]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8185](../raw_map.tsv:8185) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8186](../raw_map.tsv:8186) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;in-&gt;pobj-&gt;exile-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8189](../raw_map.tsv:8189) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8190](../raw_map.tsv:8190) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Marcos → Hawaii: Explicit death-in or being killed in an accident in the place establishes death location.

Cited evidence lines: [8185](../raw_map.tsv:8185), [8186](../raw_map.tsv:8186), [8189](../raw_map.tsv:8189), [8190](../raw_map.tsv:8190).


Issue tags: mixed_evidence

### rel_45__ent_537__ent_99

**All observed names:** United States → Iran (2)

Ordered IDs: Ent[ent_537] → Ent[ent_99]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5509](../raw_map.tsv:5509) | United States | Iran | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7889](../raw_map.tsv:7889) | United States | Iran | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Iran: Political staff interactions or weapons sales are unrelated to death location.

Cited evidence lines: [5509](../raw_map.tsv:5509), [7889](../raw_map.tsv:7889).


Issue tags: wrong_predicate
