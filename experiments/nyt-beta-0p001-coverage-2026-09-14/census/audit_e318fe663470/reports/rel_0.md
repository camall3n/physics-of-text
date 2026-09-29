# audit_e318fe663470 — rel_0: died in place

Predicate ID: died_in

Person X, or an explicitly identified subset of population X, died in geographic place Y.

Includes: explicit died-in or death-in location; being killed in Y establishing death there; historical death location. Excludes: residence, birth, or ordinary presence alone; Y is the perpetrator or cause rather than location; discussion of deaths without the affected person or population. Ambiguous unless resolved by case-local evidence: place versus institution unresolved; unclear death or geographic attachment; a population mention without identified affected members. This describes location of death, not where X lived or who caused death. An affected subset does not imply every member died.

Complete census: 6 supported, 3 incorrect, 2 ambiguous; N=11. Precision 6/11=54.55% to 8/11=72.73%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-impose-&gt;prep-&gt;after-&gt;pobj-&gt;invasion-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-agree-&gt;prep-&gt;under-&gt;pobj-&gt;pressure-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_0__ent_1055__ent_1173

**All observed names:** Rabbi Israel Spira → Maimonides Hospital (1); Walter G. Williams → N.Y. ) Hospital (1)

Ordered IDs: Ent[ent_1055] → Ent[ent_1173]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1771](../raw_map.tsv:1771) | Walter G. Williams | N.Y. ) Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1778](../raw_map.tsv:1778) | Rabbi Israel Spira | Maimonides Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Rabbi Israel Spira → Maimonides Hospital; Walter G. Williams → N.Y. ) Hospital: Death-location evidence is merged with a different person or an unrelated administration/legislature pair.

Cited evidence lines: [1771](../raw_map.tsv:1771), [1778](../raw_map.tsv:1778).

**Review question:** Which deceased person and hospital should this inferred fact identify?
Issue tags: entity_collision

### rel_0__ent_829__ent_1087

**All observed names:** Clinton Administration → Congress (1); Thomas P. Robinson → George Washington University Hospital (1)

Ordered IDs: Ent[ent_829] → Ent[ent_1087]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1773](../raw_map.tsv:1773) | Thomas P. Robinson | George Washington University Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2067](../raw_map.tsv:2067) | Clinton Administration | Congress | nsubj\|&lt;-nsubj&lt;-agree-&gt;prep-&gt;under-&gt;pobj-&gt;pressure-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Clinton Administration → Congress; Thomas P. Robinson → George Washington University Hospital: Death-location evidence is merged with a different person or an unrelated administration/legislature pair.

Cited evidence lines: [1773](../raw_map.tsv:1773), [2067](../raw_map.tsv:2067).

**Review question:** Which deceased person and hospital should this inferred fact identify?
Issue tags: entity_collision

### rel_0__ent_492__ent_648

**All observed names:** Iraq → Kuwait (2)

Ordered IDs: Ent[ent_492] → Ent[ent_648]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4033](../raw_map.tsv:4033) | Iraq | Kuwait | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-impose-&gt;prep-&gt;after-&gt;pobj-&gt;invasion-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6425](../raw_map.tsv:6425) | Iraq | Kuwait | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-impose-&gt;prep-&gt;after-&gt;pobj-&gt;invasion-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Iraq → Kuwait: Invasion/sanctions or an institutional director location does not establish death at the location.

Cited evidence lines: [4033](../raw_map.tsv:4033), [6425](../raw_map.tsv:6425).




### rel_0__ent_302__ent_480

**All observed names:** Microsoft → Redmond (1)

Ordered IDs: Ent[ent_302] → Ent[ent_480]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [787](../raw_map.tsv:787) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Microsoft → Redmond: Invasion/sanctions or an institutional director location does not establish death at the location.

Cited evidence lines: [787](../raw_map.tsv:787).




### rel_0__ent_913__ent_114

**All observed names:** William Feinberg → Mount Sinai Hospital (1)

Ordered IDs: Ent[ent_913] → Ent[ent_114]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1769](../raw_map.tsv:1769) | William Feinberg | Mount Sinai Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William Feinberg → Mount Sinai Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1769](../raw_map.tsv:1769).


Issue tags: broad_predicate

### rel_0__ent_564__ent_1115

**All observed names:** William Chaison → Doctor 's Hospital (1)

Ordered IDs: Ent[ent_564] → Ent[ent_1115]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1770](../raw_map.tsv:1770) | William Chaison | Doctor 's Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William Chaison → Doctor 's Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1770](../raw_map.tsv:1770).


Issue tags: broad_predicate

### rel_0__ent_116__ent_358

**All observed names:** Sanford C. Miller → Valley Hospital (1)

Ordered IDs: Ent[ent_116] → Ent[ent_358]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1774](../raw_map.tsv:1774) | Sanford C. Miller | Valley Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sanford C. Miller → Valley Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1774](../raw_map.tsv:1774).


Issue tags: broad_predicate

### rel_0__ent_1053__ent_1089

**All observed names:** Samuel M. Brownell → Yale-New Haven Hospital (1)

Ordered IDs: Ent[ent_1053] → Ent[ent_1089]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1775](../raw_map.tsv:1775) | Samuel M. Brownell | Yale-New Haven Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Samuel M. Brownell → Yale-New Haven Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1775](../raw_map.tsv:1775).


Issue tags: broad_predicate

### rel_0__ent_844__ent_1436

**All observed names:** Raymond Reisler → New York Hospital (1)

Ordered IDs: Ent[ent_844] → Ent[ent_1436]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1776](../raw_map.tsv:1776) | Raymond Reisler | New York Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raymond Reisler → New York Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1776](../raw_map.tsv:1776).


Issue tags: broad_predicate

### rel_0__ent_1406__ent_301

**All observed names:** Raul A. Campanioni → St. Vincent 's Hospital (1)

Ordered IDs: Ent[ent_1406] → Ent[ent_301]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1777](../raw_map.tsv:1777) | Raul A. Campanioni | St. Vincent 's Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raul A. Campanioni → St. Vincent 's Hospital: The explicit died-at-hospital row establishes the physical death location.

Cited evidence lines: [1777](../raw_map.tsv:1777).


Issue tags: broad_predicate

### rel_0__ent_1418__ent_544

**All observed names:** Microsoft → Redmond (1)

Ordered IDs: Ent[ent_1418] → Ent[ent_544]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4343](../raw_map.tsv:4343) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Microsoft → Redmond: Invasion/sanctions or an institutional director location does not establish death at the location.

Cited evidence lines: [4343](../raw_map.tsv:4343).



