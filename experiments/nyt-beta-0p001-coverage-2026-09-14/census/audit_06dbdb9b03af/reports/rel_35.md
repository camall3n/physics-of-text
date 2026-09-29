# audit_06dbdb9b03af — rel_35: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 3 supported, 0 incorrect, 0 ambiguous; N=3. Precision 3/3=100.00% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;researcher-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;house-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-house-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_35__ent_1168__ent_1169

**All observed names:** Christie → Park Avenue (6)

Ordered IDs: Ent[ent_1168] → Ent[ent_1169]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6224](../raw_map.tsv:6224) | Christie | Park Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6225](../raw_map.tsv:6225) | Christie | Park Avenue | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| [6226](../raw_map.tsv:6226) | Christie | Park Avenue | appos\|-&gt;appos-&gt;house-&gt;nn-&gt;\|nn |
| [6227](../raw_map.tsv:6227) | Christie | Park Avenue | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |
| [6229](../raw_map.tsv:6229) | Christie | Park Avenue | poss\|&lt;-poss&lt;-house-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6232](../raw_map.tsv:6232) | Christie | Park Avenue | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Christie → Park Avenue: The auction house galleries or salesrooms and direct physical-location rows locate the organization on the named avenue.

Cited evidence lines: [6224](../raw_map.tsv:6224), [6225](../raw_map.tsv:6225), [6226](../raw_map.tsv:6226), [6227](../raw_map.tsv:6227), [6229](../raw_map.tsv:6229), [6232](../raw_map.tsv:6232).


Issue tags: mixed_evidence

### rel_35__ent_481__ent_242

**All observed names:** Sotheby → York Avenue (3)

Ordered IDs: Ent[ent_481] → Ent[ent_242]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6245](../raw_map.tsv:6245) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-salesroom-&gt;nn-&gt;\|nn |
| [6246](../raw_map.tsv:6246) | Sotheby | York Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6248](../raw_map.tsv:6248) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-gallery-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Sotheby → York Avenue: The auction house galleries or salesrooms and direct physical-location rows locate the organization on the named avenue.

Cited evidence lines: [6245](../raw_map.tsv:6245), [6246](../raw_map.tsv:6246), [6248](../raw_map.tsv:6248).


Issue tags: mixed_evidence

### rel_35__ent_207__ent_407

**All observed names:** Morningstar Inc. → Chicago (2)

Ordered IDs: Ent[ent_207] → Ent[ent_407]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5744](../raw_map.tsv:5744) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;researcher-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7108](../raw_map.tsv:7108) | Morningstar Inc. | Chicago | appos\|-&gt;appos-&gt;researcher-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Morningstar Inc. → Chicago: The appositional research organization is explicitly located in Chicago.

Cited evidence lines: [5744](../raw_map.tsv:5744), [7108](../raw_map.tsv:7108).



