# audit_e318fe663470 — rel_80: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 2 supported, 3 incorrect, 1 ambiguous; N=6. Precision 2/6=33.33% to 3/6=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;acquire-&gt;nsubj-&gt;\|nsubj |
| 1 | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | dep\|-&gt;dep-&gt;take-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-race-&gt;prep-&gt;between-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-bar&lt;-dep&lt;-consider-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-minister-designate-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-senator&lt;-pobj&lt;-of&lt;-prep&lt;-star-&gt;dep-&gt;\|dep |

## Every evaluated fact

### rel_80__ent_1401__ent_422

**All observed names:** New York → Hill (4)

Ordered IDs: Ent[ent_1401] → Ent[ent_422]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4182](../raw_map.tsv:4182) | New York | Hill | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-race-&gt;prep-&gt;between-&gt;pobj-&gt;\|pobj |
| [4184](../raw_map.tsv:4184) | New York | Hill | poss\|&lt;-poss&lt;-senator&lt;-pobj&lt;-of&lt;-prep&lt;-star-&gt;dep-&gt;\|dep |
| [4186](../raw_map.tsv:4186) | New York | Hill | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-bar&lt;-dep&lt;-consider-&gt;nsubj-&gt;\|nsubj |
| [4189](../raw_map.tsv:4189) | New York | Hill | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). New York → Hill: New York replaces an unnamed business unit and Hill is an incomplete mixed office/political name.

Cited evidence lines: [4182](../raw_map.tsv:4182), [4184](../raw_map.tsv:4184), [4186](../raw_map.tsv:4186), [4189](../raw_map.tsv:4189).

**Review question:** What named unit and full parent organization are intended?
Issue tags: truncated_argument

### rel_80__ent_1128__ent_1434

**All observed names:** J. Walter Thompson → WPP Group (4)

Ordered IDs: Ent[ent_1128] → Ent[ent_1434]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4582](../raw_map.tsv:4582) | J. Walter Thompson | WPP Group | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4589](../raw_map.tsv:4589) | J. Walter Thompson | WPP Group | rcmod\|-&gt;rcmod-&gt;acquire-&gt;nsubj-&gt;\|nsubj |
| [6684](../raw_map.tsv:6684) | J. Walter Thompson | WPP Group | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6691](../raw_map.tsv:6691) | J. Walter Thompson | WPP Group | rcmod\|-&gt;rcmod-&gt;acquire-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). J. Walter Thompson → WPP Group: Explicit unit-of wording establishes the corporate parent relationship.

Cited evidence lines: [4582](../raw_map.tsv:4582), [4589](../raw_map.tsv:4589), [6684](../raw_map.tsv:6684), [6691](../raw_map.tsv:6691).




### rel_80__ent_1433__ent_393

**All observed names:** Fox → News Corporation (1)

Ordered IDs: Ent[ent_1433] → Ent[ent_393]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2514](../raw_map.tsv:2514) | Fox | News Corporation | nn\|&lt;-nn&lt;-unit-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Fox → News Corporation: Explicit unit-of wording establishes the corporate parent relationship.

Cited evidence lines: [2514](../raw_map.tsv:2514).




### rel_80__ent_1439__ent_148

**All observed names:** Muppets → Manhattan (1)

Ordered IDs: Ent[ent_1439] → Ent[ent_148]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6375](../raw_map.tsv:6375) | Muppets | Manhattan | dep\|-&gt;dep-&gt;take-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Muppets → Manhattan: A movie-title fragment, inverse minister designation or an attorney office does not establish corporate containment.

Cited evidence lines: [6375](../raw_map.tsv:6375).




### rel_80__ent_1204__ent_1207

**All observed names:** Israel → Ehud Olmert (1)

Ordered IDs: Ent[ent_1204] → Ent[ent_1207]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7038](../raw_map.tsv:7038) | Israel | Ehud Olmert | poss\|&lt;-poss&lt;-minister-designate-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Israel → Ehud Olmert: A movie-title fragment, inverse minister designation or an attorney office does not establish corporate containment.

Cited evidence lines: [7038](../raw_map.tsv:7038).




### rel_80__ent_995__ent_148

**All observed names:** Robert M. Morgenthau → Manhattan (1)

Ordered IDs: Ent[ent_995] → Ent[ent_148]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8300](../raw_map.tsv:8300) | Robert M. Morgenthau | Manhattan | appos\|&lt;-appos&lt;-boss-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Robert M. Morgenthau → Manhattan: A movie-title fragment, inverse minister designation or an attorney office does not establish corporate containment.

Cited evidence lines: [8300](../raw_map.tsv:8300).



