# audit_9c88162c7b22 — rel_48: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 3 supported, 0 incorrect, 0 ambiguous; N=3. Precision 3/3=100.00% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-worker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;house-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-hold-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-house-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-house-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-room-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-at&lt;-prep&lt;-tomorrow-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-of&lt;-prep&lt;-session&lt;-pobj&lt;-in&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_48__ent_1168__ent_1169

**All observed names:** Christie → Park Avenue (9)

Ordered IDs: Ent[ent_1168] → Ent[ent_1169]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6224](../raw_map.tsv:6224) | Christie | Park Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6225](../raw_map.tsv:6225) | Christie | Park Avenue | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| [6226](../raw_map.tsv:6226) | Christie | Park Avenue | appos\|-&gt;appos-&gt;house-&gt;nn-&gt;\|nn |
| [6227](../raw_map.tsv:6227) | Christie | Park Avenue | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |
| [6228](../raw_map.tsv:6228) | Christie | Park Avenue | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-of&lt;-prep&lt;-session&lt;-pobj&lt;-in&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6229](../raw_map.tsv:6229) | Christie | Park Avenue | poss\|&lt;-poss&lt;-house-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6230](../raw_map.tsv:6230) | Christie | Park Avenue | poss\|&lt;-poss&lt;-house-&gt;nn-&gt;\|nn |
| [6231](../raw_map.tsv:6231) | Christie | Park Avenue | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-hold-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6233](../raw_map.tsv:6233) | Christie | Park Avenue | poss\|&lt;-poss&lt;-room-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Christie → Park Avenue: Explicit physical be-at, headquarters, gallery, salesroom or house-on-avenue evidence establishes organizational location.

Cited evidence lines: [6224](../raw_map.tsv:6224), [6225](../raw_map.tsv:6225), [6226](../raw_map.tsv:6226), [6227](../raw_map.tsv:6227), [6228](../raw_map.tsv:6228), [6229](../raw_map.tsv:6229), [6230](../raw_map.tsv:6230), [6231](../raw_map.tsv:6231), [6233](../raw_map.tsv:6233).


Issue tags: mixed_evidence

### rel_48__ent_481__ent_242

**All observed names:** Sotheby → York Avenue (5)

Ordered IDs: Ent[ent_481] → Ent[ent_242]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6244](../raw_map.tsv:6244) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [6245](../raw_map.tsv:6245) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| [6246](../raw_map.tsv:6246) | Sotheby | York Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6248](../raw_map.tsv:6248) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |
| [6253](../raw_map.tsv:6253) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-at&lt;-prep&lt;-tomorrow-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Sotheby → York Avenue: Explicit physical be-at, headquarters, gallery, salesroom or house-on-avenue evidence establishes organizational location.

Cited evidence lines: [6244](../raw_map.tsv:6244), [6245](../raw_map.tsv:6245), [6246](../raw_map.tsv:6246), [6248](../raw_map.tsv:6248), [6253](../raw_map.tsv:6253).


Issue tags: mixed_evidence

### rel_48__ent_545__ent_787

**All observed names:** Intel → Santa Clara (4)

Ordered IDs: Ent[ent_545] → Ent[ent_787]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [771](../raw_map.tsv:771) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [772](../raw_map.tsv:772) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-worker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4321](../raw_map.tsv:4321) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [4322](../raw_map.tsv:4322) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-worker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Intel → Santa Clara: Explicit physical be-at, headquarters, gallery, salesroom or house-on-avenue evidence establishes organizational location.

Cited evidence lines: [771](../raw_map.tsv:771), [772](../raw_map.tsv:772), [4321](../raw_map.tsv:4321), [4322](../raw_map.tsv:4322).


Issue tags: mixed_evidence
