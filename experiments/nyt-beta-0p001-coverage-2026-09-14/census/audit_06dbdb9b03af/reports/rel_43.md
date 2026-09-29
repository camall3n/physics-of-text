# audit_06dbdb9b03af — rel_43: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 7 supported, 0 incorrect, 0 ambiguous; N=7. Precision 7/7=100.00% to 7/7=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| 3 | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| 3 | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| 2 | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-commissioner&lt;-dobj&lt;-elect&lt;-dep&lt;-have-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;dep-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-takeover-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_43__ent_591__ent_110

**All observed names:** John McMullen → Devils (7)

Ordered IDs: Ent[ent_591] → Ent[ent_110]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1475](../raw_map.tsv:1475) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1476](../raw_map.tsv:1476) | John McMullen | Devils | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1478](../raw_map.tsv:1478) | John McMullen | Devils | rcmod\|-&gt;rcmod-&gt;miss-&gt;nsubjpass-&gt;presence-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1479](../raw_map.tsv:1479) | John McMullen | Devils | rcmod\|-&gt;rcmod-&gt;buy-&gt;dobj-&gt;\|dobj |
| [1480](../raw_map.tsv:1480) | John McMullen | Devils | poss\|&lt;-poss&lt;-hurrah&lt;-pobj&lt;-in&lt;-prep&lt;-win-&gt;nsubj-&gt;\|nsubj |
| [1483](../raw_map.tsv:1483) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-see-&gt;dobj-&gt;game-&gt;nn-&gt;\|nn |
| [1484](../raw_map.tsv:1484) | John McMullen | Devils | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). John McMullen → Devils: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [1475](../raw_map.tsv:1475), [1476](../raw_map.tsv:1476), [1478](../raw_map.tsv:1478), [1479](../raw_map.tsv:1479), [1480](../raw_map.tsv:1480), [1483](../raw_map.tsv:1483), [1484](../raw_map.tsv:1484).


Issue tags: mixed_evidence

### rel_43__ent_1153__ent_458

**All observed names:** Cablevision → Garden (6)

Ordered IDs: Ent[ent_1153] → Ent[ent_458]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5993](../raw_map.tsv:5993) | Cablevision | Garden | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [5994](../raw_map.tsv:5994) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5996](../raw_map.tsv:5996) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;co-owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5997](../raw_map.tsv:5997) | Cablevision | Garden | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5998](../raw_map.tsv:5998) | Cablevision | Garden | poss\|&lt;-poss&lt;-takeover-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5999](../raw_map.tsv:5999) | Cablevision | Garden | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Cablevision → Garden: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [5993](../raw_map.tsv:5993), [5994](../raw_map.tsv:5994), [5996](../raw_map.tsv:5996), [5997](../raw_map.tsv:5997), [5998](../raw_map.tsv:5998), [5999](../raw_map.tsv:5999).


Issue tags: mixed_evidence

### rel_43__ent_339__ent_1036

**All observed names:** Bud Selig → Milwaukee Brewers (5)

Ordered IDs: Ent[ent_339] → Ent[ent_1036]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1445](../raw_map.tsv:1445) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1446](../raw_map.tsv:1446) | Bud Selig | Milwaukee Brewers | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |
| [1449](../raw_map.tsv:1449) | Bud Selig | Milwaukee Brewers | rcmod\|-&gt;rcmod-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1450](../raw_map.tsv:1450) | Bud Selig | Milwaukee Brewers | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-president-&gt;dep-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1453](../raw_map.tsv:1453) | Bud Selig | Milwaukee Brewers | nn\|&lt;-nn&lt;-commissioner&lt;-dobj&lt;-elect&lt;-dep&lt;-have-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Bud Selig → Milwaukee Brewers: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [1445](../raw_map.tsv:1445), [1446](../raw_map.tsv:1446), [1449](../raw_map.tsv:1449), [1450](../raw_map.tsv:1450), [1453](../raw_map.tsv:1453).


Issue tags: mixed_evidence

### rel_43__ent_1153__ent_1144

**All observed names:** Cablevision → Madison Square Garden (5)

Ordered IDs: Ent[ent_1153] → Ent[ent_1144]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5921](../raw_map.tsv:5921) | Cablevision | Madison Square Garden | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5924](../raw_map.tsv:5924) | Cablevision | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |
| [5925](../raw_map.tsv:5925) | Cablevision | Madison Square Garden | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [5926](../raw_map.tsv:5926) | Cablevision | Madison Square Garden | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5929](../raw_map.tsv:5929) | Cablevision | Madison Square Garden | poss\|&lt;-poss&lt;-purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Cablevision → Madison Square Garden: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [5921](../raw_map.tsv:5921), [5924](../raw_map.tsv:5924), [5925](../raw_map.tsv:5925), [5926](../raw_map.tsv:5926), [5929](../raw_map.tsv:5929).




### rel_43__ent_351__ent_1004

**All observed names:** Steinbrenner → Yankees (3)

Ordered IDs: Ent[ent_351] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1498](../raw_map.tsv:1498) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-buy-&gt;dobj-&gt;\|dobj |
| [1501](../raw_map.tsv:1501) | Steinbrenner | Yankees | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1504](../raw_map.tsv:1504) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-own-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Steinbrenner → Yankees: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [1498](../raw_map.tsv:1498), [1501](../raw_map.tsv:1501), [1504](../raw_map.tsv:1504).




### rel_43__ent_101__ent_881

**All observed names:** Walt Disney Company → ABC (2)

Ordered IDs: Ent[ent_101] → Ent[ent_881]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5933](../raw_map.tsv:5933) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5934](../raw_map.tsv:5934) | Walt Disney Company | ABC | appos\|-&gt;appos-&gt;owner-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Walt Disney Company → ABC: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [5933](../raw_map.tsv:5933), [5934](../raw_map.tsv:5934).




### rel_43__ent_628__ent_867

**All observed names:** General Electric Company → NBC (2)

Ordered IDs: Ent[ent_628] → Ent[ent_867]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5965](../raw_map.tsv:5965) | General Electric Company | NBC | poss\|&lt;-poss&lt;-ownership-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5967](../raw_map.tsv:5967) | General Electric Company | NBC | appos\|-&gt;appos-&gt;owner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). General Electric Company → NBC: A direct owner, ownership, own, purchase or bought path establishes some or all ownership of the named organization or property.

Cited evidence lines: [5965](../raw_map.tsv:5965), [5967](../raw_map.tsv:5967).



