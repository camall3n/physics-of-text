# audit_9c88162c7b22 — rel_31: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 6 supported, 0 incorrect, 0 ambiguous; N=6. Precision 6/6=100.00% to 6/6=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 6 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_31__ent_547__ent_789

**All observed names:** I.B.M. → Armonk (6)

Ordered IDs: Ent[ent_547] → Ent[ent_789]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [801](../raw_map.tsv:801) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [803](../raw_map.tsv:803) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| [807](../raw_map.tsv:807) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4397](../raw_map.tsv:4397) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4399](../raw_map.tsv:4399) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| [4403](../raw_map.tsv:4403) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). I.B.M. → Armonk: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [801](../raw_map.tsv:801), [803](../raw_map.tsv:803), [807](../raw_map.tsv:807), [4397](../raw_map.tsv:4397), [4399](../raw_map.tsv:4399), [4403](../raw_map.tsv:4403).




### rel_31__ent_1000__ent_304

**All observed names:** Wal-Mart → Bentonville (6)

Ordered IDs: Ent[ent_1000] → Ent[ent_304]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [811](../raw_map.tsv:811) | Wal-Mart | Bentonville | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [815](../raw_map.tsv:815) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [816](../raw_map.tsv:816) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4357](../raw_map.tsv:4357) | Wal-Mart | Bentonville | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4361](../raw_map.tsv:4361) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4362](../raw_map.tsv:4362) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [811](../raw_map.tsv:811), [815](../raw_map.tsv:815), [816](../raw_map.tsv:816), [4357](../raw_map.tsv:4357), [4361](../raw_map.tsv:4361), [4362](../raw_map.tsv:4362).


Issue tags: mixed_evidence

### rel_31__ent_1001__ent_307

**All observed names:** Hewlett-Packard → Palo Alto (3)

Ordered IDs: Ent[ent_1001] → Ent[ent_307]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [832](../raw_map.tsv:832) | Hewlett-Packard | Palo Alto | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [835](../raw_map.tsv:835) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [836](../raw_map.tsv:836) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Hewlett-Packard → Palo Alto: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [832](../raw_map.tsv:832), [835](../raw_map.tsv:835), [836](../raw_map.tsv:836).


Issue tags: mixed_evidence

### rel_31__ent_302__ent_544

**All observed names:** Microsoft → Redmond (2)

Ordered IDs: Ent[ent_302] → Ent[ent_544]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [781](../raw_map.tsv:781) | Microsoft | Redmond | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4337](../raw_map.tsv:4337) | Microsoft | Redmond | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Microsoft → Redmond: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [781](../raw_map.tsv:781), [4337](../raw_map.tsv:4337).




### rel_31__ent_786__ent_305

**All observed names:** Apple → Cupertino (2)

Ordered IDs: Ent[ent_786] → Ent[ent_305]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [792](../raw_map.tsv:792) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4348](../raw_map.tsv:4348) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [792](../raw_map.tsv:792), [4348](../raw_map.tsv:4348).




### rel_31__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (2)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [854](../raw_map.tsv:854) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4387](../raw_map.tsv:4387) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: Explicit headquarters-in evidence establishes organizational physical location.

Cited evidence lines: [854](../raw_map.tsv:854), [4387](../raw_map.tsv:4387).



