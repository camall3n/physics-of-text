# audit_dcb746fa83d6 — rel_84: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | dobj\|&lt;-dobj&lt;-nominate-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-parent-&gt;appos-&gt;\|appos |
| 2 | rcmod\|-&gt;rcmod-&gt;division-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;subsidiary-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-place-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-appoint-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-owner-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_84__ent_822__ent_1233

**All observed names:** American → AMR Corporation (5)

Ordered IDs: Ent[ent_822] → Ent[ent_1233]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2554](../raw_map.tsv:2554) | American | AMR Corporation | poss\|&lt;-poss&lt;-parent-&gt;appos-&gt;\|appos |
| [2558](../raw_map.tsv:2558) | American | AMR Corporation | rcmod\|-&gt;rcmod-&gt;subsidiary-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2559](../raw_map.tsv:2559) | American | AMR Corporation | rcmod\|-&gt;rcmod-&gt;division-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6582](../raw_map.tsv:6582) | American | AMR Corporation | rcmod\|-&gt;rcmod-&gt;subsidiary-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6583](../raw_map.tsv:6583) | American | AMR Corporation | rcmod\|-&gt;rcmod-&gt;division-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). American → AMR Corporation: Direct subsidiary/division, parent or owner apposition identifies the shortened organization as an owned business of the named parent.

Cited evidence lines: [2554](../raw_map.tsv:2554), [2558](../raw_map.tsv:2558), [2559](../raw_map.tsv:2559), [6582](../raw_map.tsv:6582), [6583](../raw_map.tsv:6583).




### rel_84__ent_1154__ent_459

**All observed names:** Eastern → Texas Air Corporation (4)

Ordered IDs: Ent[ent_1154] → Ent[ent_459]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6558](../raw_map.tsv:6558) | Eastern | Texas Air Corporation | poss\|&lt;-poss&lt;-parent-&gt;appos-&gt;\|appos |
| [6560](../raw_map.tsv:6560) | Eastern | Texas Air Corporation | pobj\|&lt;-pobj&lt;-like&lt;-prep&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [6563](../raw_map.tsv:6563) | Eastern | Texas Air Corporation | poss\|&lt;-poss&lt;-owner-&gt;appos-&gt;\|appos |
| [6564](../raw_map.tsv:6564) | Eastern | Texas Air Corporation | nsubjpass\|&lt;-nsubjpass&lt;-place-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Eastern → Texas Air Corporation: Direct subsidiary/division, parent or owner apposition identifies the shortened organization as an owned business of the named parent.

Cited evidence lines: [6558](../raw_map.tsv:6558), [6560](../raw_map.tsv:6560), [6563](../raw_map.tsv:6563), [6564](../raw_map.tsv:6564).


Issue tags: mixed_evidence

### rel_84__ent_998__ent_1294

**All observed names:** Christopher J. Christie → United States (2)

Ordered IDs: Ent[ent_998] → Ent[ent_1294]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8336](../raw_map.tsv:8336) | Christopher J. Christie | United States | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-appoint-&gt;dobj-&gt;attorney-&gt;nn-&gt;\|nn |
| [8338](../raw_map.tsv:8338) | Christopher J. Christie | United States | dobj\|&lt;-dobj&lt;-nominate-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Christopher J. Christie → United States: Attorney nominations are personal offices rather than a business unit belonging to a parent.

Cited evidence lines: [8336](../raw_map.tsv:8336), [8338](../raw_map.tsv:8338).




### rel_84__ent_755__ent_517

**All observed names:** James B. Comey → United States (1)

Ordered IDs: Ent[ent_755] → Ent[ent_517]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8358](../raw_map.tsv:8358) | James B. Comey | United States | dobj\|&lt;-dobj&lt;-nominate-&gt;prep-&gt;as-&gt;pobj-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). James B. Comey → United States: Attorney nominations are personal offices rather than a business unit belonging to a parent.

Cited evidence lines: [8358](../raw_map.tsv:8358).



