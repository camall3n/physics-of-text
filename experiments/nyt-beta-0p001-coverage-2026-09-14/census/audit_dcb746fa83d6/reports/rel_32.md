# audit_dcb746fa83d6 — rel_32: has or had medical condition

Predicate ID: has_medical_condition

Person X, or an explicitly identified subset of population X, has or had medical condition Y.

Includes: explicit having or suffering from Y; diagnosis of Y; death from or of Y establishing the condition; a stated affected subset of a named population. Excludes: generic discussion or research about Y; treating another person with Y; a disease merely located in a place; a generic have phrase whose object is not a medical condition. Ambiguous unless resolved by case-local evidence: unclear condition attachment or affected person; risk, possible diagnosis, or suspected condition without confirmation; a population mention that does not identify affected members. This is annotation of textual support, not medical guidance. A population fact does not imply every member has the condition.

Complete census: 2 supported, 8 incorrect, 0 ambiguous; N=10. Precision 2/10=20.00% to 2/10=20.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| 3 | nsubj\|&lt;-nsubj&lt;-need-&gt;dobj-&gt;\|dobj |
| 3 | nsubj\|&lt;-nsubj&lt;-trade-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-better-&gt;prep-&gt;without-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;disease-&gt;partmod-&gt;cause-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;dep-&gt;\|dep |
| 1 | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-test-&gt;prep-&gt;for-&gt;pobj-&gt;exposure-&gt;prep-&gt;to-&gt;pobj-&gt;virus-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-want-&gt;prep-&gt;like-&gt;pobj-&gt;other-&gt;rcmod-&gt;die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-cover-&gt;prep-&gt;as-&gt;pobj-&gt;pianist-&gt;prep-&gt;to-&gt;pobj-&gt;death-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-make-&gt;dep-&gt;have-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-read-&gt;prep-&gt;have-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nnó_were_seriously_fought_over_by_multiple_bidders_. lex#'s pos#POS rc#salesroom_in |
| 1 | poss\|&lt;-poss&lt;-semblance&lt;-nsubjpass&lt;-embody-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;reveal-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;show-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_32__ent_685__ent_443

**All observed names:** Liberace → AIDS (9)

Ordered IDs: Ent[ent_685] → Ent[ent_443]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4916](../raw_map.tsv:4916) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4917](../raw_map.tsv:4917) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;disease-&gt;partmod-&gt;cause-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [4918](../raw_map.tsv:4918) | Liberace | AIDS | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;show-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4919](../raw_map.tsv:4919) | Liberace | AIDS | poss\|&lt;-poss&lt;-symptom&lt;-nsubj&lt;-fall-&gt;prep-&gt;into-&gt;pobj-&gt;pattern-&gt;rcmod-&gt;reveal-&gt;dobj-&gt;presence-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4920](../raw_map.tsv:4920) | Liberace | AIDS | pobj\|&lt;-pobj&lt;-as&lt;-prep&lt;-cover-&gt;prep-&gt;as-&gt;pobj-&gt;pianist-&gt;prep-&gt;to-&gt;pobj-&gt;death-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4921](../raw_map.tsv:4921) | Liberace | AIDS | partmod\|-&gt;partmod-&gt;die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4922](../raw_map.tsv:4922) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-want-&gt;prep-&gt;like-&gt;pobj-&gt;other-&gt;rcmod-&gt;die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4923](../raw_map.tsv:4923) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-test-&gt;prep-&gt;for-&gt;pobj-&gt;exposure-&gt;prep-&gt;to-&gt;pobj-&gt;virus-&gt;nn-&gt;\|nn |
| [4925](../raw_map.tsv:4925) | Liberace | AIDS | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Liberace → AIDS: Explicit having or death-from evidence establishes the condition for the person or affected members of the named population, without claiming every member is affected.

Cited evidence lines: [4916](../raw_map.tsv:4916), [4917](../raw_map.tsv:4917), [4918](../raw_map.tsv:4918), [4919](../raw_map.tsv:4919), [4920](../raw_map.tsv:4920), [4921](../raw_map.tsv:4921), [4922](../raw_map.tsv:4922), [4923](../raw_map.tsv:4923), [4925](../raw_map.tsv:4925).


Issue tags: mixed_evidence

### rel_32__ent_308__ent_356

**All observed names:** Knicks → Ewing (6)

Ordered IDs: Ent[ent_308] → Ent[ent_356]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3428](../raw_map.tsv:3428) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-need-&gt;dobj-&gt;\|dobj |
| [3430](../raw_map.tsv:3430) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [3433](../raw_map.tsv:3433) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-better-&gt;prep-&gt;without-&gt;pobj-&gt;\|pobj |
| [4927](../raw_map.tsv:4927) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-need-&gt;dobj-&gt;\|dobj |
| [4929](../raw_map.tsv:4929) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4932](../raw_map.tsv:4932) | Knicks | Ewing | nsubj\|&lt;-nsubj&lt;-better-&gt;prep-&gt;without-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Knicks → Ewing: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [3428](../raw_map.tsv:3428), [3430](../raw_map.tsv:3430), [3433](../raw_map.tsv:3433), [4927](../raw_map.tsv:4927), [4929](../raw_map.tsv:4929), [4932](../raw_map.tsv:4932).




### rel_32__ent_444__ent_686

**All observed names:** Heather → Mommies (4)

Ordered IDs: Ent[ent_444] → Ent[ent_686]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4882](../raw_map.tsv:4882) | Heather | Mommies | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4883](../raw_map.tsv:4883) | Heather | Mommies | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-read-&gt;prep-&gt;have-&gt;dobj-&gt;\|dobj |
| [4884](../raw_map.tsv:4884) | Heather | Mommies | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-make-&gt;dep-&gt;have-&gt;dobj-&gt;\|dobj |
| [4885](../raw_map.tsv:4885) | Heather | Mommies | nsubj\|&lt;-nsubj&lt;-have-&gt;dep-&gt;\|dep |

**Judgment: incorrect** (primary). Heather → Mommies: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [4882](../raw_map.tsv:4882), [4883](../raw_map.tsv:4883), [4884](../raw_map.tsv:4884), [4885](../raw_map.tsv:4885).




### rel_32__ent_1029__ent_64

**All observed names:** Knicks → Patrick Ewing (3)

Ordered IDs: Ent[ent_1029] → Ent[ent_64]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4936](../raw_map.tsv:4936) | Knicks | Patrick Ewing | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4940](../raw_map.tsv:4940) | Knicks | Patrick Ewing | nsubj\|&lt;-nsubj&lt;-need-&gt;dobj-&gt;\|dobj |
| [4943](../raw_map.tsv:4943) | Knicks | Patrick Ewing | poss\|&lt;-poss&lt;-semblance&lt;-nsubjpass&lt;-embody-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Knicks → Patrick Ewing: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [4936](../raw_map.tsv:4936), [4940](../raw_map.tsv:4940), [4943](../raw_map.tsv:4943).




### rel_32__ent_201__ent_443

**All observed names:** New Yorkers → AIDS (2)

Ordered IDs: Ent[ent_201] → Ent[ent_443]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4906](../raw_map.tsv:4906) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;\|dobj |
| [4915](../raw_map.tsv:4915) | New Yorkers | AIDS | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). New Yorkers → AIDS: Explicit having or death-from evidence establishes the condition for the person or affected members of the named population, without claiming every member is affected.

Cited evidence lines: [4906](../raw_map.tsv:4906), [4915](../raw_map.tsv:4915).




### rel_32__ent_1248__ent_1338

**All observed names:** Alan Greenspan → Congress (1)

Ordered IDs: Ent[ent_1248] → Ent[ent_1338]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [414](../raw_map.tsv:414) | Alan Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Alan Greenspan → Congress: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [414](../raw_map.tsv:414).




### rel_32__ent_778__ent_321

**All observed names:** Yankees → Mets (1)

Ordered IDs: Ent[ent_778] → Ent[ent_321]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2597](../raw_map.tsv:2597) | Yankees | Mets | nsubj\|&lt;-nsubj&lt;-trade-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Yankees → Mets: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [2597](../raw_map.tsv:2597).




### rel_32__ent_470__ent_778

**All observed names:** Mariners → Yankees (1)

Ordered IDs: Ent[ent_470] → Ent[ent_778]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6070](../raw_map.tsv:6070) | Mariners | Yankees | nsubj\|&lt;-nsubj&lt;-trade-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mariners → Yankees: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [6070](../raw_map.tsv:6070).




### rel_32__ent_476__ent_242

**All observed names:** Sotheby → York Avenue (1)

Ordered IDs: Ent[ent_476] → Ent[ent_242]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6252](../raw_map.tsv:6252) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nnó_were_seriously_fought_over_by_multiple_bidders_. lex#'s pos#POS rc#salesroom_in |

**Judgment: incorrect** (primary). Sotheby → York Avenue: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [6252](../raw_map.tsv:6252).




### rel_32__ent_259__ent_1013

**All observed names:** Yankees → Florida Marlins (1)

Ordered IDs: Ent[ent_259] → Ent[ent_1013]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6952](../raw_map.tsv:6952) | Yankees | Florida Marlins | nsubj\|&lt;-nsubj&lt;-trade-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Yankees → Florida Marlins: The object is a player, parent designation, legislature, team, or street rather than a medical condition.

Cited evidence lines: [6952](../raw_map.tsv:6952).



