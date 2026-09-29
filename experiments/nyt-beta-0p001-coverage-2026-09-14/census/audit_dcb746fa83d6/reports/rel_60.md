# audit_dcb746fa83d6 — rel_60: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 0 supported, 2 incorrect, 1 ambiguous; N=3. Precision 0/3=0.00% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-chat-&gt;prep-&gt;in-&gt;pobj-&gt;lot-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-sour-&gt;dobj-&gt;relation-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;struggle-&gt;prep-&gt;with-&gt;pobj-&gt;member-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-consign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-move-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-building&lt;-dobj&lt;-own-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-headquarters&lt;-pobj&lt;-at&lt;-prep&lt;-hold-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;pare-&gt;dobj-&gt;request-&gt;prep-&gt;for-&gt;pobj-&gt;transportation-&gt;prep-&gt;in-&gt;pobj-&gt;request-&gt;rcmod-&gt;send-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_60__ent_1377__ent_484

**All observed names:** Sotheby → 72d Street (8); Sotheby → York Avenue (1)

Ordered IDs: Ent[ent_1377] → Ent[ent_484]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6246](../raw_map.tsv:6246) | Sotheby | York Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6254](../raw_map.tsv:6254) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6255](../raw_map.tsv:6255) | Sotheby | 72d Street | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6257](../raw_map.tsv:6257) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6258](../raw_map.tsv:6258) | Sotheby | 72d Street | poss\|&lt;-poss&lt;-headquarters&lt;-pobj&lt;-at&lt;-prep&lt;-hold-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6259](../raw_map.tsv:6259) | Sotheby | 72d Street | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6261](../raw_map.tsv:6261) | Sotheby | 72d Street | poss\|&lt;-poss&lt;-building&lt;-dobj&lt;-own-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6262](../raw_map.tsv:6262) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-move-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6263](../raw_map.tsv:6263) | Sotheby | 72d Street | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-consign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Sotheby → 72d Street; Sotheby → York Avenue: The Sotheby location is explicit, but York Avenue and 72d Street are distinct street names merged in the latent object; an intersection could connect the addresses without making the streets one entity.

Cited evidence lines: [6246](../raw_map.tsv:6246), [6254](../raw_map.tsv:6254), [6255](../raw_map.tsv:6255), [6257](../raw_map.tsv:6257), [6258](../raw_map.tsv:6258), [6259](../raw_map.tsv:6259), [6261](../raw_map.tsv:6261), [6262](../raw_map.tsv:6262), [6263](../raw_map.tsv:6263).

**Review question:** Do these rows denote one named site or two distinct street entities, and should the latter be separated?
Issue tags: argument_identity, mixed_evidence

### rel_60__ent_917__ent_586

**All observed names:** Richard G. Darman → White House (6)

Ordered IDs: Ent[ent_917] → Ent[ent_586]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8465](../raw_map.tsv:8465) | Richard G. Darman | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8467](../raw_map.tsv:8467) | Richard G. Darman | White House | rcmod\|-&gt;rcmod-&gt;pare-&gt;dobj-&gt;request-&gt;prep-&gt;for-&gt;pobj-&gt;transportation-&gt;prep-&gt;in-&gt;pobj-&gt;request-&gt;rcmod-&gt;send-&gt;nsubj-&gt;\|nsubj |
| [8469](../raw_map.tsv:8469) | Richard G. Darman | White House | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;struggle-&gt;prep-&gt;with-&gt;pobj-&gt;member-&gt;nn-&gt;\|nn |
| [8470](../raw_map.tsv:8470) | Richard G. Darman | White House | nsubj\|&lt;-nsubj&lt;-sour-&gt;dobj-&gt;relation-&gt;nn-&gt;\|nn |
| [8471](../raw_map.tsv:8471) | Richard G. Darman | White House | nsubj\|&lt;-nsubj&lt;-chat-&gt;prep-&gt;in-&gt;pobj-&gt;lot-&gt;nn-&gt;\|nn |
| [8472](../raw_map.tsv:8472) | Richard G. Darman | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Richard G. Darman → White House: A person at a public office or a sporting championship does not establish organizational geographic location.

Cited evidence lines: [8465](../raw_map.tsv:8465), [8467](../raw_map.tsv:8467), [8469](../raw_map.tsv:8469), [8470](../raw_map.tsv:8470), [8471](../raw_map.tsv:8471), [8472](../raw_map.tsv:8472).




### rel_60__ent_561__ent_850

**All observed names:** Giants → Super Bowl (2)

Ordered IDs: Ent[ent_561] → Ent[ent_850]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2225](../raw_map.tsv:2225) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| [3445](../raw_map.tsv:3445) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Giants → Super Bowl: A person at a public office or a sporting championship does not establish organizational geographic location.

Cited evidence lines: [2225](../raw_map.tsv:2225), [3445](../raw_map.tsv:3445).



