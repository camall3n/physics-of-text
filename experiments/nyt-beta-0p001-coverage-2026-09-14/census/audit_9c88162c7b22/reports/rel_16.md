# audit_9c88162c7b22 — rel_16: died in place

Predicate ID: died_in

Person X, or an explicitly identified subset of population X, died in geographic place Y.

Includes: explicit died-in or death-in location; being killed in Y establishing death there; historical death location. Excludes: residence, birth, or ordinary presence alone; Y is the perpetrator or cause rather than location; discussion of deaths without the affected person or population. Ambiguous unless resolved by case-local evidence: place versus institution unresolved; unclear death or geographic attachment; a population mention without identified affected members. This describes location of death, not where X lived or who caused death. An affected subset does not imply every member died.

Complete census: 9 supported, 1 incorrect, 1 ambiguous; N=11. Precision 9/11=81.82% to 10/11=90.91%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 10 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;mogul-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_16__ent_678__ent_302

**All observed names:** William H. Gates → Microsoft (2)

Ordered IDs: Ent[ent_678] → Ent[ent_302]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5073](../raw_map.tsv:5073) | William H. Gates | Microsoft | appos\|-&gt;appos-&gt;mogul-&gt;nn-&gt;\|nn |
| [5703](../raw_map.tsv:5703) | William H. Gates | Microsoft | appos\|-&gt;appos-&gt;mogul-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). William H. Gates → Microsoft: A Microsoft mogul description has no death-location evidence.

Cited evidence lines: [5073](../raw_map.tsv:5073), [5703](../raw_map.tsv:5703).




### rel_16__ent_365__ent_122

**All observed names:** William Feinberg → Mount Sinai Hospital (1)

Ordered IDs: Ent[ent_365] → Ent[ent_122]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1769](../raw_map.tsv:1769) | William Feinberg | Mount Sinai Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William Feinberg → Mount Sinai Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1769](../raw_map.tsv:1769).




### rel_16__ent_364__ent_1050

**All observed names:** William Chaison → Doctor 's Hospital (1)

Ordered IDs: Ent[ent_364] → Ent[ent_1050]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1770](../raw_map.tsv:1770) | William Chaison | Doctor 's Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). William Chaison → Doctor 's Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1770](../raw_map.tsv:1770).




### rel_16__ent_125__ent_367

**All observed names:** Walter G. Williams → N.Y. ) Hospital (1)

Ordered IDs: Ent[ent_125] → Ent[ent_367]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1771](../raw_map.tsv:1771) | Walter G. Williams | N.Y. ) Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Walter G. Williams → N.Y. ) Hospital: Died-at supplies a death location, but N.Y. ) Hospital is a truncated extraction that does not identify the particular hospital.

Cited evidence lines: [1771](../raw_map.tsv:1771).

**Review question:** Which hospital is represented by N.Y. ) Hospital in the death-location statement?
Issue tags: truncated_place

### rel_16__ent_1051__ent_124

**All observed names:** Tony Manero → Greenwich Hospital (1)

Ordered IDs: Ent[ent_1051] → Ent[ent_124]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1772](../raw_map.tsv:1772) | Tony Manero | Greenwich Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Tony Manero → Greenwich Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1772](../raw_map.tsv:1772).




### rel_16__ent_366__ent_1052

**All observed names:** Thomas P. Robinson → George Washington University Hospital (1)

Ordered IDs: Ent[ent_366] → Ent[ent_1052]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1773](../raw_map.tsv:1773) | Thomas P. Robinson | George Washington University Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Thomas P. Robinson → George Washington University Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1773](../raw_map.tsv:1773).




### rel_16__ent_116__ent_358

**All observed names:** Sanford C. Miller → Valley Hospital (1)

Ordered IDs: Ent[ent_116] → Ent[ent_358]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1774](../raw_map.tsv:1774) | Sanford C. Miller | Valley Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Sanford C. Miller → Valley Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1774](../raw_map.tsv:1774).




### rel_16__ent_1053__ent_115

**All observed names:** Samuel M. Brownell → Yale-New Haven Hospital (1)

Ordered IDs: Ent[ent_1053] → Ent[ent_115]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1775](../raw_map.tsv:1775) | Samuel M. Brownell | Yale-New Haven Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Samuel M. Brownell → Yale-New Haven Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1775](../raw_map.tsv:1775).




### rel_16__ent_357__ent_599

**All observed names:** Raymond Reisler → New York Hospital (1)

Ordered IDs: Ent[ent_357] → Ent[ent_599]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1776](../raw_map.tsv:1776) | Raymond Reisler | New York Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raymond Reisler → New York Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1776](../raw_map.tsv:1776).




### rel_16__ent_1054__ent_118

**All observed names:** Raul A. Campanioni → St. Vincent 's Hospital (1)

Ordered IDs: Ent[ent_1054] → Ent[ent_118]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1777](../raw_map.tsv:1777) | Raul A. Campanioni | St. Vincent 's Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Raul A. Campanioni → St. Vincent 's Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1777](../raw_map.tsv:1777).




### rel_16__ent_1055__ent_117

**All observed names:** Rabbi Israel Spira → Maimonides Hospital (1)

Ordered IDs: Ent[ent_1055] → Ent[ent_117]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1778](../raw_map.tsv:1778) | Rabbi Israel Spira | Maimonides Hospital | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rabbi Israel Spira → Maimonides Hospital: The direct died-at path identifies the named hospital as the physical location of this person’s death.

Cited evidence lines: [1778](../raw_map.tsv:1778).



