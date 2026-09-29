# audit_dcb746fa83d6 — rel_59: died in place

Predicate ID: died_in

Person X, or an explicitly identified subset of population X, died in geographic place Y.

Includes: explicit died-in or death-in location; being killed in Y establishing death there; historical death location. Excludes: residence, birth, or ordinary presence alone; Y is the perpetrator or cause rather than location; discussion of deaths without the affected person or population. Ambiguous unless resolved by case-local evidence: place versus institution unresolved; unclear death or geographic attachment; a population mention without identified affected members. This describes location of death, not where X lived or who caused death. An affected subset does not imply every member died.

Complete census: 6 supported, 4 incorrect, 0 ambiguous; N=10. Precision 6/10=60.00% to 6/10=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;rofessor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;on-&gt;pobj-&gt;ethic-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-save-&gt;prep-&gt;during-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-kill-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-pobj&lt;-on&lt;-prep&lt;-column-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand&lt;-dobj&lt;-save-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;crash-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-provision-&gt;dep-&gt;advise-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-widow&lt;-nsubj&lt;-return-&gt;prep-&gt;from-&gt;pobj-&gt;exile-&gt;amod-&gt;\|amod |
| 1 | rcmod\|-&gt;rcmod-&gt;declare-&gt;nsubj-&gt;fall-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;after-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;include-&gt;dobj-&gt;picture-&gt;prep-&gt;of-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_59__ent_747__ent_824

**All observed names:** Diana → Paris (8)

Ordered IDs: Ent[ent_747] → Ent[ent_824]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8160](../raw_map.tsv:8160) | Diana | Paris | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8161](../raw_map.tsv:8161) | Diana | Paris | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8163](../raw_map.tsv:8163) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;after-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8164](../raw_map.tsv:8164) | Diana | Paris | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;crash-&gt;nn-&gt;\|nn |
| [8165](../raw_map.tsv:8165) | Diana | Paris | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-pobj&lt;-on&lt;-prep&lt;-column-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8166](../raw_map.tsv:8166) | Diana | Paris | nsubjpass\|&lt;-nsubjpass&lt;-kill-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8168](../raw_map.tsv:8168) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;kill-&gt;prep-&gt;in-&gt;pobj-&gt;accident-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8169](../raw_map.tsv:8169) | Diana | Paris | rcmod\|-&gt;rcmod-&gt;include-&gt;dobj-&gt;picture-&gt;prep-&gt;of-&gt;pobj-&gt;crash-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Diana → Paris: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8160](../raw_map.tsv:8160), [8161](../raw_map.tsv:8161), [8163](../raw_map.tsv:8163), [8164](../raw_map.tsv:8164), [8165](../raw_map.tsv:8165), [8166](../raw_map.tsv:8166), [8168](../raw_map.tsv:8168), [8169](../raw_map.tsv:8169).


Issue tags: mixed_evidence

### rel_59__ent_1228__ent_507

**All observed names:** Mr. Marcos → Hawaii (6)

Ordered IDs: Ent[ent_1228] → Ent[ent_507]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8181](../raw_map.tsv:8181) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8182](../raw_map.tsv:8182) | Mr. Marcos | Hawaii | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8185](../raw_map.tsv:8185) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;hospitalize-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8187](../raw_map.tsv:8187) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-widow&lt;-nsubj&lt;-return-&gt;prep-&gt;from-&gt;pobj-&gt;exile-&gt;amod-&gt;\|amod |
| [8189](../raw_map.tsv:8189) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-death-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8190](../raw_map.tsv:8190) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Marcos → Hawaii: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8181](../raw_map.tsv:8181), [8182](../raw_map.tsv:8182), [8185](../raw_map.tsv:8185), [8187](../raw_map.tsv:8187), [8189](../raw_map.tsv:8189), [8190](../raw_map.tsv:8190).


Issue tags: mixed_evidence

### rel_59__ent_1101__ent_748

**All observed names:** Jews → Holocaust (4)

Ordered IDs: Ent[ent_1101] → Ent[ent_748]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8192](../raw_map.tsv:8192) | Jews | Holocaust | rcmod\|-&gt;rcmod-&gt;die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8193](../raw_map.tsv:8193) | Jews | Holocaust | dobj\|&lt;-dobj&lt;-save-&gt;prep-&gt;during-&gt;pobj-&gt;\|pobj |
| [8197](../raw_map.tsv:8197) | Jews | Holocaust | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8201](../raw_map.tsv:8201) | Jews | Holocaust | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand&lt;-dobj&lt;-save-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Jews → Holocaust: The Holocaust is an event rather than a geographic place; academic role, political fall or constitutional advice also do not assert geographic death.

Cited evidence lines: [8192](../raw_map.tsv:8192), [8193](../raw_map.tsv:8193), [8197](../raw_map.tsv:8197), [8201](../raw_map.tsv:8201).


Issue tags: mixed_evidence

### rel_59__ent_398__ent_374

**All observed names:** Stephen Gillers → New York University Law School (2)

Ordered IDs: Ent[ent_398] → Ent[ent_374]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [329](../raw_map.tsv:329) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;on-&gt;pobj-&gt;ethic-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [331](../raw_map.tsv:331) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;rofessor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Stephen Gillers → New York University Law School: The Holocaust is an event rather than a geographic place; academic role, political fall or constitutional advice also do not assert geographic death.

Cited evidence lines: [329](../raw_map.tsv:329), [331](../raw_map.tsv:331).




### rel_59__ent_564__ent_355

**All observed names:** Mr. Bush → Mr. Hussein (1)

Ordered IDs: Ent[ent_564] → Ent[ent_355]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1597](../raw_map.tsv:1597) | Mr. Bush | Mr. Hussein | rcmod\|-&gt;rcmod-&gt;declare-&gt;nsubj-&gt;fall-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Mr. Bush → Mr. Hussein: The Holocaust is an event rather than a geographic place; academic role, political fall or constitutional advice also do not assert geographic death.

Cited evidence lines: [1597](../raw_map.tsv:1597).




### rel_59__ent_663__ent_1333

**All observed names:** Constitution → Senate (1)

Ordered IDs: Ent[ent_663] → Ent[ent_1333]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4237](../raw_map.tsv:4237) | Constitution | Senate | poss\|&lt;-poss&lt;-provision-&gt;dep-&gt;advise-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Constitution → Senate: The Holocaust is an event rather than a geographic place; academic role, political fall or constitutional advice also do not assert geographic death.

Cited evidence lines: [4237](../raw_map.tsv:4237).




### rel_59__ent_232__ent_1223

**All observed names:** Willliam E. Wilson → Bloomington Hospital (1)

Ordered IDs: Ent[ent_232] → Ent[ent_1223]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8180](../raw_map.tsv:8180) | Willliam E. Wilson | Bloomington Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Willliam E. Wilson → Bloomington Hospital: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8180](../raw_map.tsv:8180).




### rel_59__ent_937__ent_81

**All observed names:** Linda Lyon Van Voorhis → Rochester (1)

Ordered IDs: Ent[ent_937] → Ent[ent_81]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8191](../raw_map.tsv:8191) | Linda Lyon Van Voorhis | Rochester | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Linda Lyon Van Voorhis → Rochester: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8191](../raw_map.tsv:8191).




### rel_59__ent_726__ent_926

**All observed names:** Douglas Edwards → Sarasota (1)

Ordered IDs: Ent[ent_726] → Ent[ent_926]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8202](../raw_map.tsv:8202) | Douglas Edwards | Sarasota | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Douglas Edwards → Sarasota: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8202](../raw_map.tsv:8202).




### rel_59__ent_853__ent_34

**All observed names:** David Roberts → Dartford (1)

Ordered IDs: Ent[ent_853] → Ent[ent_34]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8203](../raw_map.tsv:8203) | David Roberts | Dartford | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). David Roberts → Dartford: An explicit death-in or killed-in row locates death in the named place; a clearly named hospital is a physical death site.

Cited evidence lines: [8203](../raw_map.tsv:8203).



