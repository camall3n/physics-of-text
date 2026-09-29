# audit_dcb746fa83d6 — rel_8: sells to

Predicate ID: sells_to

Entity X sells or sold goods, services, property, or transferable rights to buyer Y.

Includes: explicit sell-to or sale-to; a completed commercial transfer to Y; historical sales including transferable sporting contracts. Excludes: ordinary giving or physical movement; a proposed sale without realization; Y is the item sold rather than the buyer. Ambiguous unless resolved by case-local evidence: unclear seller-versus-item role; proposed or conditional sale; a nominal sale whose owner or seller is unresolved. An explicit sell-to edge can establish the commercial relation without identifying the item; generic give/send does not.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| 2 | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-tonight-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|&lt;-dep&lt;-say-&gt;nsubj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-accord&lt;-prep&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;conduct-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_8__ent_537__ent_99

**All observed names:** United States → Iran (8)

Ordered IDs: Ent[ent_537] → Ent[ent_99]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5505](../raw_map.tsv:5505) | United States | Iran | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5508](../raw_map.tsv:5508) | United States | Iran | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5509](../raw_map.tsv:5509) | United States | Iran | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [5510](../raw_map.tsv:5510) | United States | Iran | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [7885](../raw_map.tsv:7885) | United States | Iran | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7888](../raw_map.tsv:7888) | United States | Iran | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7889](../raw_map.tsv:7889) | United States | Iran | nn\|&lt;-nn&lt;-weapon&lt;-pobj&lt;-of&lt;-prep&lt;-sale-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7890](../raw_map.tsv:7890) | United States | Iran | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). United States → Iran: Direct sell-to rows establish a commercial transfer to the named buyer, without requiring the transferred item to be identified.

Cited evidence lines: [5505](../raw_map.tsv:5505), [5508](../raw_map.tsv:5508), [5509](../raw_map.tsv:5509), [5510](../raw_map.tsv:5510), [7885](../raw_map.tsv:7885), [7888](../raw_map.tsv:7888), [7889](../raw_map.tsv:7889), [7890](../raw_map.tsv:7890).


Issue tags: mixed_evidence

### rel_8__ent_309__ent_1004

**All observed names:** Red Sox → Yankees (6)

Ordered IDs: Ent[ent_309] → Ent[ent_1004]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [865](../raw_map.tsv:865) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [869](../raw_map.tsv:869) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| [2665](../raw_map.tsv:2665) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2669](../raw_map.tsv:2669) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| [6931](../raw_map.tsv:6931) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6935](../raw_map.tsv:6935) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Red Sox → Yankees: Direct sell-to rows establish a commercial transfer to the named buyer, without requiring the transferred item to be identified.

Cited evidence lines: [865](../raw_map.tsv:865), [869](../raw_map.tsv:869), [2665](../raw_map.tsv:2665), [2669](../raw_map.tsv:2669), [6931](../raw_map.tsv:6931), [6935](../raw_map.tsv:6935).


Issue tags: mixed_evidence

### rel_8__ent_154__ent_1400

**All observed names:** Gen. Peter Pace → Joint Chiefs of Staff (3)

Ordered IDs: Ent[ent_154] → Ent[ent_1400]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [272](../raw_map.tsv:272) | Gen. Peter Pace | Joint Chiefs of Staff | rcmod\|-&gt;rcmod-&gt;conduct-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [274](../raw_map.tsv:274) | Gen. Peter Pace | Joint Chiefs of Staff | dep\|&lt;-dep&lt;-say-&gt;nsubj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [277](../raw_map.tsv:277) | Gen. Peter Pace | Joint Chiefs of Staff | appos\|&lt;-appos&lt;-tonight-&gt;appos-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Gen. Peter Pace → Joint Chiefs of Staff: A chair office or company location is not a sale to a buyer.

Cited evidence lines: [272](../raw_map.tsv:272), [274](../raw_map.tsv:274), [277](../raw_map.tsv:277).




### rel_8__ent_224__ent_1024

**All observed names:** Soundscan → Hartsdale (1)

Ordered IDs: Ent[ent_224] → Ent[ent_1024]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5837](../raw_map.tsv:5837) | Soundscan | Hartsdale | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-accord&lt;-prep&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Soundscan → Hartsdale: A chair office or company location is not a sale to a buyer.

Cited evidence lines: [5837](../raw_map.tsv:5837).



