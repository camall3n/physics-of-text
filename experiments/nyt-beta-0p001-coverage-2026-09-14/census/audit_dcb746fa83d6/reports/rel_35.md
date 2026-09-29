# audit_dcb746fa83d6 — rel_35: physically present in place

Predicate ID: present_in

Entity X is or was physically present in geographic place Y, temporarily or as a resident or located institution.

Includes: explicit unqualified physical be-in or presence; a direct residence or physical location statement; a completed arrival, visit, or departure that establishes presence in Y. Excludes: membership in an organization; participation or victory in a nongeographic event; political office or control alone; discussion, publication, or other abstract presence; a destination without evidence of realized movement or presence. Ambiguous unless resolved by case-local evidence: place-versus-institution metonymy; an incomplete geographic argument; uncertain attachment or explicit hypothetical presence. Physical presence is weaker than residence or headquarters. Those narrower predicates retain their existing definitions. Do not infer a geographic location from membership or event participation.

Complete census: 3 supported, 4 incorrect, 1 ambiguous; N=8. Precision 3/8=37.50% to 4/8=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 4 | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-pack-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;prepare-&gt;prep-&gt;for-&gt;pobj-&gt;series-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;win-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-value-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-discuss-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-executive-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;leave-&gt;dep-&gt;work-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_35__ent_182__ent_1002

**All observed names:** Mr. Bush → Washington (5)

Ordered IDs: Ent[ent_182] → Ent[ent_1002]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4097](../raw_map.tsv:4097) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5238](../raw_map.tsv:5238) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5239](../raw_map.tsv:5239) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7343](../raw_map.tsv:7343) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7344](../raw_map.tsv:7344) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Bush → Washington: Unqualified saying or telling in the named country or city establishes the geographic location of the speaking person.

Cited evidence lines: [4097](../raw_map.tsv:4097), [5238](../raw_map.tsv:5238), [5239](../raw_map.tsv:5239), [7343](../raw_map.tsv:7343), [7344](../raw_map.tsv:7344).




### rel_35__ent_315__ent_557

**All observed names:** Atlanta Braves → New York Mets (3)

Ordered IDs: Ent[ent_315] → Ent[ent_557]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1015](../raw_map.tsv:1015) | Atlanta Braves | New York Mets | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-discuss-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| [1016](../raw_map.tsv:1016) | Atlanta Braves | New York Mets | partmod\|-&gt;partmod-&gt;win-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| [1018](../raw_map.tsv:1018) | Atlanta Braves | New York Mets | partmod\|-&gt;partmod-&gt;prepare-&gt;prep-&gt;for-&gt;pobj-&gt;series-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Atlanta Braves → New York Mets: Sports rivalry, movement from one geographic region to another, statements in a publication, or a country executive do not establish this subject physical presence in the object place.

Cited evidence lines: [1015](../raw_map.tsv:1015), [1016](../raw_map.tsv:1016), [1018](../raw_map.tsv:1018).




### rel_35__ent_758__ent_537

**All observed names:** Patrick J. Fitzgerald → United States (3)

Ordered IDs: Ent[ent_758] → Ent[ent_537]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8382](../raw_map.tsv:8382) | Patrick J. Fitzgerald | United States | rcmod\|-&gt;rcmod-&gt;leave-&gt;dep-&gt;work-&gt;nsubj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8386](../raw_map.tsv:8386) | Patrick J. Fitzgerald | United States | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8387](../raw_map.tsv:8387) | Patrick J. Fitzgerald | United States | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Patrick J. Fitzgerald → United States: Unqualified saying or telling in the named country or city establishes the geographic location of the speaking person.

Cited evidence lines: [8382](../raw_map.tsv:8382), [8386](../raw_map.tsv:8386), [8387](../raw_map.tsv:8387).


Issue tags: mixed_evidence

### rel_35__ent_1310__ent_254

**All observed names:** East → West (2)

Ordered IDs: Ent[ent_1310] → Ent[ent_254]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6053](../raw_map.tsv:6053) | East | West | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6059](../raw_map.tsv:6059) | East | West | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-value-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). East → West: Sports rivalry, movement from one geographic region to another, statements in a publication, or a country executive do not establish this subject physical presence in the object place.

Cited evidence lines: [6053](../raw_map.tsv:6053), [6059](../raw_map.tsv:6059).




### rel_35__ent_951__ent_325

**All observed names:** John Gross → The Times (2)

Ordered IDs: Ent[ent_951] → Ent[ent_325]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7315](../raw_map.tsv:7315) | John Gross | The Times | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7317](../raw_map.tsv:7317) | John Gross | The Times | appos\|&lt;-appos&lt;-book&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John Gross → The Times: Sports rivalry, movement from one geographic region to another, statements in a publication, or a country executive do not establish this subject physical presence in the object place.

Cited evidence lines: [7315](../raw_map.tsv:7315), [7317](../raw_map.tsv:7317).




### rel_35__ent_276__ent_702

**All observed names:** Ernie Accorsi → Giants (1)

Ordered IDs: Ent[ent_276] → Ent[ent_702]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3232](../raw_map.tsv:3232) | Ernie Accorsi | Giants | nsubj\|&lt;-nsubj&lt;-pack-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Ernie Accorsi → Giants: Packing in an office at the Giants may refer to team premises, but the object is the team rather than an identified geographic site.

Cited evidence lines: [3232](../raw_map.tsv:3232).

**Review question:** Does Giants designate a particular physical site in the office-packing row, and if so which?
Issue tags: place_institution_metonymy

### rel_35__ent_718__ent_1002

**All observed names:** Bush → Washington (1)

Ordered IDs: Ent[ent_718] → Ent[ent_1002]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5251](../raw_map.tsv:5251) | Bush | Washington | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bush → Washington: Unqualified saying or telling in the named country or city establishes the geographic location of the speaking person.

Cited evidence lines: [5251](../raw_map.tsv:5251).




### rel_35__ent_1378__ent_1191

**All observed names:** Pakistan → Gen. Pervez Musharraf (1)

Ordered IDs: Ent[ent_1378] → Ent[ent_1191]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5285](../raw_map.tsv:5285) | Pakistan | Gen. Pervez Musharraf | poss\|&lt;-poss&lt;-executive-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Pakistan → Gen. Pervez Musharraf: Sports rivalry, movement from one geographic region to another, statements in a publication, or a country executive do not establish this subject physical presence in the object place.

Cited evidence lines: [5285](../raw_map.tsv:5285).



