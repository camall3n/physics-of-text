# audit_9c88162c7b22 — rel_62: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nn\|&lt;-nn&lt;-support-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-dobj&lt;-join-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;seat-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-use-&gt;dobj-&gt;veto-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;prep-&gt;for-&gt;pobj-&gt;seat-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-of&lt;-prep&lt;-partner-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-unit&lt;-pobj&lt;-at&lt;-prep&lt;-creative&lt;-amod&lt;-part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship&lt;-dobj&lt;-expand-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;hold-&gt;dobj-&gt;seat-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_62__ent_815__ent_271

**All observed names:** Russia → Security Council (4)

Ordered IDs: Ent[ent_815] → Ent[ent_271]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3295](../raw_map.tsv:3295) | Russia | Security Council | nsubj\|&lt;-nsubj&lt;-use-&gt;dobj-&gt;veto-&gt;nn-&gt;\|nn |
| [3296](../raw_map.tsv:3296) | Russia | Security Council | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;seat-&gt;nn-&gt;\|nn |
| [3298](../raw_map.tsv:3298) | Russia | Security Council | rcmod\|-&gt;rcmod-&gt;hold-&gt;dobj-&gt;seat-&gt;nn-&gt;\|nn |
| [3302](../raw_map.tsv:3302) | Russia | Security Council | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;prep-&gt;for-&gt;pobj-&gt;seat-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Russia → Security Council: A Security Council seat or veto is membership, not subsidiary containment.

Cited evidence lines: [3295](../raw_map.tsv:3295), [3296](../raw_map.tsv:3296), [3298](../raw_map.tsv:3298), [3302](../raw_map.tsv:3302).


Issue tags: membership_not_subsidiary

### rel_62__ent_1121__ent_425

**All observed names:** Grey Worldwide → Grey Global Group (4)

Ordered IDs: Ent[ent_1121] → Ent[ent_425]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4673](../raw_map.tsv:4673) | Grey Worldwide | Grey Global Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4677](../raw_map.tsv:4677) | Grey Worldwide | Grey Global Group | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship&lt;-dobj&lt;-expand-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4678](../raw_map.tsv:4678) | Grey Worldwide | Grey Global Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-unit&lt;-pobj&lt;-at&lt;-prep&lt;-creative&lt;-amod&lt;-part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4680](../raw_map.tsv:4680) | Grey Worldwide | Grey Global Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-of&lt;-prep&lt;-partner-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Grey Worldwide → Grey Global Group: Office/agency organizational-part attachment establishes parent-group containment.

Cited evidence lines: [4673](../raw_map.tsv:4673), [4677](../raw_map.tsv:4677), [4678](../raw_map.tsv:4678), [4680](../raw_map.tsv:4680).




### rel_62__ent_537__ent_820

**All observed names:** United States → Israel (3)

Ordered IDs: Ent[ent_537] → Ent[ent_820]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2082](../raw_map.tsv:2082) | United States | Israel | nn\|&lt;-nn&lt;-support-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4208](../raw_map.tsv:4208) | United States | Israel | nn\|&lt;-nn&lt;-support-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [7905](../raw_map.tsv:7905) | United States | Israel | nn\|&lt;-nn&lt;-support-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Israel: Support for Israel is not corporate containment.

Cited evidence lines: [2082](../raw_map.tsv:2082), [4208](../raw_map.tsv:4208), [7905](../raw_map.tsv:7905).


Issue tags: wrong_predicate

### rel_62__ent_1104__ent_880

**All observed names:** BBDO Worldwide → Omnicom Group (3)

Ordered IDs: Ent[ent_1104] → Ent[ent_880]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4604](../raw_map.tsv:4604) | BBDO Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4609](../raw_map.tsv:4609) | BBDO Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-dobj&lt;-join-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6681](../raw_map.tsv:6681) | BBDO Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-dobj&lt;-join-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). BBDO Worldwide → Omnicom Group: Office/agency organizational-part attachment establishes parent-group containment.

Cited evidence lines: [4604](../raw_map.tsv:4604), [4609](../raw_map.tsv:4609), [6681](../raw_map.tsv:6681).



