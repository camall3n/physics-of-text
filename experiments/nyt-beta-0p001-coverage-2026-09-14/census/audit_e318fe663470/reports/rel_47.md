# audit_e318fe663470 — rel_47: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 2 supported, 6 incorrect, 0 ambiguous; N=8. Precision 2/8=25.00% to 2/8=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;publisher-&gt;nn-&gt;\|nn |
| 3 | nsubj\|&lt;-nsubj&lt;-push-&gt;prep-&gt;through-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;impresario-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;showman-restaurateur-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-investigator&lt;-nsubj&lt;-work-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| 1 | appos\|&lt;-appos&lt;-plaintiff-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-suggest-&gt;dobj-&gt;route-&gt;partmod-&gt;utilize-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;run-&gt;dobj-&gt;kitchen-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-widow&lt;-nsubj&lt;-return-&gt;prep-&gt;from-&gt;pobj-&gt;exile-&gt;amod-&gt;\|amod |
| 1 | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_47__ent_593__ent_112

**All observed names:** Warner LeRoy → Tavern (8)

Ordered IDs: Ent[ent_593] → Ent[ent_112]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1505](../raw_map.tsv:1505) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1507](../raw_map.tsv:1507) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;impresario-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| [1509](../raw_map.tsv:1509) | Warner LeRoy | Tavern | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [1510](../raw_map.tsv:1510) | Warner LeRoy | Tavern | partmod\|-&gt;partmod-&gt;run-&gt;dobj-&gt;kitchen-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1511](../raw_map.tsv:1511) | Warner LeRoy | Tavern | appos\|-&gt;appos-&gt;showman-restaurateur-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1512](../raw_map.tsv:1512) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-plaintiff-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1513](../raw_map.tsv:1513) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-owner-&gt;rcmod-&gt;own-&gt;dobj-&gt;\|dobj |
| [1514](../raw_map.tsv:1514) | Warner LeRoy | Tavern | appos\|&lt;-appos&lt;-hostess-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Warner LeRoy → Tavern: Repeated owner-of and restaurant/restaurateur ownership constructions identify the local Tavern restaurant as the owned business; this case supplies context absent from isolated Tavern fragments.

Cited evidence lines: [1505](../raw_map.tsv:1505), [1507](../raw_map.tsv:1507), [1509](../raw_map.tsv:1509), [1510](../raw_map.tsv:1510), [1511](../raw_map.tsv:1511), [1512](../raw_map.tsv:1512), [1513](../raw_map.tsv:1513), [1514](../raw_map.tsv:1514).


Issue tags: mixed_evidence

### rel_47__ent_182__ent_189

**All observed names:** Mr. Bush → Congress (3)

Ordered IDs: Ent[ent_182] → Ent[ent_189]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [457](../raw_map.tsv:457) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-push-&gt;prep-&gt;through-&gt;pobj-&gt;\|pobj |
| [2034](../raw_map.tsv:2034) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-push-&gt;prep-&gt;through-&gt;pobj-&gt;\|pobj |
| [7867](../raw_map.tsv:7867) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-push-&gt;prep-&gt;through-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Congress: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [457](../raw_map.tsv:457), [2034](../raw_map.tsv:2034), [7867](../raw_map.tsv:7867).




### rel_47__ent_988__ent_507

**All observed names:** Mr. Marcos → Hawaii (3)

Ordered IDs: Ent[ent_988] → Ent[ent_507]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8183](../raw_map.tsv:8183) | Mr. Marcos | Hawaii | rcmod\|-&gt;rcmod-&gt;live-&gt;prep-&gt;with-&gt;pobj-&gt;wife-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8187](../raw_map.tsv:8187) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-widow&lt;-nsubj&lt;-return-&gt;prep-&gt;from-&gt;pobj-&gt;exile-&gt;amod-&gt;\|amod |
| [8190](../raw_map.tsv:8190) | Mr. Marcos | Hawaii | poss\|&lt;-poss&lt;-activity-&gt;amod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Marcos → Hawaii: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [8183](../raw_map.tsv:8183), [8187](../raw_map.tsv:8187), [8190](../raw_map.tsv:8190).




### rel_47__ent_158__ent_323

**All observed names:** Mr. Schwartz → Brooklyn (2)

Ordered IDs: Ent[ent_158] → Ent[ent_323]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [978](../raw_map.tsv:978) | Mr. Schwartz | Brooklyn | nsubj\|&lt;-nsubj&lt;-suggest-&gt;dobj-&gt;route-&gt;partmod-&gt;utilize-&gt;dobj-&gt;\|dobj |
| [980](../raw_map.tsv:980) | Mr. Schwartz | Brooklyn | appos\|&lt;-appos&lt;-investigator&lt;-nsubj&lt;-work-&gt;prep-&gt;in-&gt;pobj-&gt;office-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Mr. Schwartz → Brooklyn: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [978](../raw_map.tsv:978), [980](../raw_map.tsv:980).




### rel_47__ent_1033__ent_12

**All observed names:** George Steinbrenner → Yankees (2)

Ordered IDs: Ent[ent_1033] → Ent[ent_12]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1416](../raw_map.tsv:1416) | George Steinbrenner | Yankees | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1420](../raw_map.tsv:1420) | George Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). George Steinbrenner → Yankees: The explicit owner-of row establishes ownership of the Yankees.

Cited evidence lines: [1416](../raw_map.tsv:1416), [1420](../raw_map.tsv:1420).


Issue tags: mixed_evidence

### rel_47__ent_1285__ent_1205

**All observed names:** Morningstar Inc. → Chicago (2)

Ordered IDs: Ent[ent_1285] → Ent[ent_1205]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5743](../raw_map.tsv:5743) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;publisher-&gt;nn-&gt;\|nn |
| [7107](../raw_map.tsv:7107) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;publisher-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Morningstar Inc. → Chicago: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [5743](../raw_map.tsv:5743), [7107](../raw_map.tsv:7107).




### rel_47__ent_188__ent_109

**All observed names:** Mr. Greenspan → Congress (1)

Ordered IDs: Ent[ent_188] → Ent[ent_109]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [419](../raw_map.tsv:419) | Mr. Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Greenspan → Congress: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [419](../raw_map.tsv:419).




### rel_47__ent_78__ent_407

**All observed names:** Morningstar → Chicago (1)

Ordered IDs: Ent[ent_78] → Ent[ent_407]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5784](../raw_map.tsv:5784) | Morningstar | Chicago | appos\|-&gt;appos-&gt;publisher-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Morningstar → Chicago: Legislation, residence, work, publishing or telling committee members does not establish ownership.

Cited evidence lines: [5784](../raw_map.tsv:5784).



