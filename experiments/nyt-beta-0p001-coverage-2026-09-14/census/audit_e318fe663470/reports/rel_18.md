# audit_e318fe663470 — rel_18: wins or holds sporting championship

Predicate ID: sporting_champion_of

Entity X won sporting competition Y or held an explicitly Y-designated sporting championship or title.

Includes: sport win/champion/title/clinch-title; sporting league/division or explicitly title-designating body; historical sporting title. Excludes: non-sport honorary awards; political election or control; participation; single stage without overall title; coaching or team membership alone. Ambiguous unless resolved by case-local evidence: medal without a winning championship; unclear title attachment. Retains the original sports-only relation separately from winner_of; do not silently extend it to Nobel or political examples.

Complete census: 4 supported, 0 incorrect, 0 ambiguous; N=4. Precision 4/4=100.00% to 4/4=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 4 | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| 3 | nsubj\|&lt;-nsubj&lt;-raise-&gt;dobj-&gt;banner-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;medalist-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-teammate-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-champion-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-champion-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-absence&lt;-dobj&lt;-understand-&gt;prep-&gt;during-&gt;pobj-&gt;remainder-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;champion-&gt;nsubj-&gt;hurdle-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;prep-&gt;in-&gt;pobj-&gt;final-&gt;dep-&gt;\|dep |
| 1 | rcmod\|-&gt;rcmod-&gt;set-&gt;dobj-&gt;record-&gt;nn-&gt;\|nn |
| 1 | tmod\|&lt;-tmod&lt;-draw-&gt;partmod-&gt;seek-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | tmod\|&lt;-tmod&lt;-struggle-&gt;prep-&gt;in-&gt;pobj-&gt;match-&gt;prep-&gt;since-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_18__ent_110__ent_851

**All observed names:** Devils → Stanley Cup (8)

Ordered IDs: Ent[ent_110] → Ent[ent_851]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2228](../raw_map.tsv:2228) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2231](../raw_map.tsv:2231) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-raise-&gt;dobj-&gt;banner-&gt;nn-&gt;\|nn |
| [7727](../raw_map.tsv:7727) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7730](../raw_map.tsv:7730) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-raise-&gt;dobj-&gt;banner-&gt;nn-&gt;\|nn |
| [7735](../raw_map.tsv:7735) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| [8040](../raw_map.tsv:8040) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8043](../raw_map.tsv:8043) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-raise-&gt;dobj-&gt;banner-&gt;nn-&gt;\|nn |
| [8048](../raw_map.tsv:8048) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Devils → Stanley Cup: An explicit sporting champion title identifies the competition or Olympic championship designation.

Cited evidence lines: [2228](../raw_map.tsv:2228), [2231](../raw_map.tsv:2231), [7727](../raw_map.tsv:7727), [7730](../raw_map.tsv:7730), [7735](../raw_map.tsv:7735), [8040](../raw_map.tsv:8040), [8043](../raw_map.tsv:8043), [8048](../raw_map.tsv:8048).




### rel_18__ent_991__ent_510

**All observed names:** Becker → Wimbledon (7)

Ordered IDs: Ent[ent_991] → Ent[ent_510]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7984](../raw_map.tsv:7984) | Becker | Wimbledon | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7986](../raw_map.tsv:7986) | Becker | Wimbledon | rcmod\|-&gt;rcmod-&gt;lose-&gt;prep-&gt;in-&gt;pobj-&gt;final-&gt;dep-&gt;\|dep |
| [7987](../raw_map.tsv:7987) | Becker | Wimbledon | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| [7988](../raw_map.tsv:7988) | Becker | Wimbledon | tmod\|&lt;-tmod&lt;-struggle-&gt;prep-&gt;in-&gt;pobj-&gt;match-&gt;prep-&gt;since-&gt;pobj-&gt;\|pobj |
| [7989](../raw_map.tsv:7989) | Becker | Wimbledon | tmod\|&lt;-tmod&lt;-draw-&gt;partmod-&gt;seek-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7991](../raw_map.tsv:7991) | Becker | Wimbledon | poss\|&lt;-poss&lt;-absence&lt;-dobj&lt;-understand-&gt;prep-&gt;during-&gt;pobj-&gt;remainder-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7992](../raw_map.tsv:7992) | Becker | Wimbledon | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Becker → Wimbledon: An explicit sporting champion title identifies the competition or Olympic championship designation.

Cited evidence lines: [7984](../raw_map.tsv:7984), [7986](../raw_map.tsv:7986), [7987](../raw_map.tsv:7987), [7988](../raw_map.tsv:7988), [7989](../raw_map.tsv:7989), [7991](../raw_map.tsv:7991), [7992](../raw_map.tsv:7992).


Issue tags: mixed_evidence

### rel_18__ent_751__ent_990

**All observed names:** Mike Marsh → Olympic (6)

Ordered IDs: Ent[ent_751] → Ent[ent_990]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8014](../raw_map.tsv:8014) | Mike Marsh | Olympic | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8015](../raw_map.tsv:8015) | Mike Marsh | Olympic | rcmod\|-&gt;rcmod-&gt;set-&gt;dobj-&gt;record-&gt;nn-&gt;\|nn |
| [8016](../raw_map.tsv:8016) | Mike Marsh | Olympic | dep\|&lt;-dep&lt;-champion-&gt;nn-&gt;\|nn |
| [8017](../raw_map.tsv:8017) | Mike Marsh | Olympic | dep\|&lt;-dep&lt;-champion-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8018](../raw_map.tsv:8018) | Mike Marsh | Olympic | appos\|&lt;-appos&lt;-teammate-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [8019](../raw_map.tsv:8019) | Mike Marsh | Olympic | appos\|-&gt;appos-&gt;medalist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mike Marsh → Olympic: An explicit sporting champion title identifies the competition or Olympic championship designation.

Cited evidence lines: [8014](../raw_map.tsv:8014), [8015](../raw_map.tsv:8015), [8016](../raw_map.tsv:8016), [8017](../raw_map.tsv:8017), [8018](../raw_map.tsv:8018), [8019](../raw_map.tsv:8019).


Issue tags: mixed_evidence, broad_predicate

### rel_18__ent_979__ent_990

**All observed names:** Roger Kingdom → Olympic (5)

Ordered IDs: Ent[ent_979] → Ent[ent_990]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7965](../raw_map.tsv:7965) | Roger Kingdom | Olympic | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7966](../raw_map.tsv:7966) | Roger Kingdom | Olympic | appos\|-&gt;appos-&gt;medalist-&gt;nn-&gt;\|nn |
| [7967](../raw_map.tsv:7967) | Roger Kingdom | Olympic | rcmod\|-&gt;rcmod-&gt;champion-&gt;nsubj-&gt;hurdle-&gt;nn-&gt;\|nn |
| [7968](../raw_map.tsv:7968) | Roger Kingdom | Olympic | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| [7970](../raw_map.tsv:7970) | Roger Kingdom | Olympic | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Roger Kingdom → Olympic: An explicit sporting champion title identifies the competition or Olympic championship designation.

Cited evidence lines: [7965](../raw_map.tsv:7965), [7966](../raw_map.tsv:7966), [7967](../raw_map.tsv:7967), [7968](../raw_map.tsv:7968), [7970](../raw_map.tsv:7970).


Issue tags: mixed_evidence, broad_predicate
