# audit_e318fe663470 — rel_21: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 1 supported, 6 incorrect, 1 ambiguous; N=8. Precision 1/8=12.50% to 2/8=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;colleague-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-office-&gt;prep-&gt;of-&gt;pobj-&gt;group-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-announce-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-edge-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-reject-&gt;dobj-&gt;deal-&gt;rcmod-&gt;acquire-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-include-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-representative&lt;-pobj&lt;-with&lt;-prep&lt;-negotiate-&gt;prep-&gt;for-&gt;pobj-&gt;purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-man-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-marriage-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-seat-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_21__ent_459__ent_1154

**All observed names:** Texas Air Corporation → Eastern (5)

Ordered IDs: Ent[ent_459] → Ent[ent_1154]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5973](../raw_map.tsv:5973) | Texas Air Corporation | Eastern | poss\|&lt;-poss&lt;-marriage-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5974](../raw_map.tsv:5974) | Texas Air Corporation | Eastern | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-representative&lt;-pobj&lt;-with&lt;-prep&lt;-negotiate-&gt;prep-&gt;for-&gt;pobj-&gt;purchase-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5975](../raw_map.tsv:5975) | Texas Air Corporation | Eastern | nsubj\|&lt;-nsubj&lt;-reject-&gt;dobj-&gt;deal-&gt;rcmod-&gt;acquire-&gt;dobj-&gt;\|dobj |
| [5976](../raw_map.tsv:5976) | Texas Air Corporation | Eastern | nsubj\|&lt;-nsubj&lt;-announce-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [5979](../raw_map.tsv:5979) | Texas Air Corporation | Eastern | appos\|-&gt;appos-&gt;company-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Texas Air Corporation → Eastern: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [5973](../raw_map.tsv:5973), [5974](../raw_map.tsv:5974), [5975](../raw_map.tsv:5975), [5976](../raw_map.tsv:5976), [5979](../raw_map.tsv:5979).




### rel_21__ent_847__ent_529

**All observed names:** Bruce Steinberg → Merrill Lynch (2)

Ordered IDs: Ent[ent_847] → Ent[ent_529]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2324](../raw_map.tsv:2324) | Bruce Steinberg | Merrill Lynch | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2329](../raw_map.tsv:2329) | Bruce Steinberg | Merrill Lynch | pobj\|&lt;-pobj&lt;-include-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bruce Steinberg → Merrill Lynch: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [2324](../raw_map.tsv:2324), [2329](../raw_map.tsv:2329).




### rel_21__ent_1240__ent_866

**All observed names:** United → UAL Corporation (2)

Ordered IDs: Ent[ent_1240] → Ent[ent_866]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2489](../raw_map.tsv:2489) | United | UAL Corporation | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |
| [6596](../raw_map.tsv:6596) | United | UAL Corporation | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). United → UAL Corporation: Explicit UAL-unit wording establishes United as a corporate unit of UAL Corporation.

Cited evidence lines: [2489](../raw_map.tsv:2489), [6596](../raw_map.tsv:6596).




### rel_21__ent_1033__ent_661

**All observed names:** Washington → Consumers Union (2)

Ordered IDs: Ent[ent_1033] → Ent[ent_661]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4167](../raw_map.tsv:4167) | Washington | Consumers Union | nsubj\|&lt;-nsubj&lt;-president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [4168](../raw_map.tsv:4168) | Washington | Consumers Union | nn\|&lt;-nn&lt;-office-&gt;prep-&gt;of-&gt;pobj-&gt;group-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Washington → Consumers Union: Washington stands for an unnamed organizational office, not a named subsidiary.

Cited evidence lines: [4167](../raw_map.tsv:4167), [4168](../raw_map.tsv:4168).

**Review question:** Which office or business unit is meant by Washington?
Issue tags: truncated_argument

### rel_21__ent_1439__ent_102

**All observed names:** Mets → Yankees (1)

Ordered IDs: Ent[ent_1439] → Ent[ent_102]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [919](../raw_map.tsv:919) | Mets | Yankees | nsubj\|&lt;-nsubj&lt;-edge-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Mets → Yankees: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [919](../raw_map.tsv:919).




### rel_21__ent_261__ent_1449

**All observed names:** Bob Dole → Senate (1)

Ordered IDs: Ent[ent_261] → Ent[ent_1449]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2969](../raw_map.tsv:2969) | Bob Dole | Senate | poss\|&lt;-poss&lt;-seat-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Bob Dole → Senate: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [2969](../raw_map.tsv:2969).




### rel_21__ent_70__ent_1007

**All observed names:** Peter A. Bradford → Nuclear Regulatory Commission (1)

Ordered IDs: Ent[ent_70] → Ent[ent_1007]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3315](../raw_map.tsv:3315) | Peter A. Bradford | Nuclear Regulatory Commission | appos\|-&gt;appos-&gt;colleague-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Peter A. Bradford → Nuclear Regulatory Commission: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [3315](../raw_map.tsv:3315).




### rel_21__ent_380__ent_1404

**All observed names:** Alan Greenspan → Paul A. Volcker (1)

Ordered IDs: Ent[ent_380] → Ent[ent_1404]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5883](../raw_map.tsv:5883) | Alan Greenspan | Paul A. Volcker | poss\|&lt;-poss&lt;-man-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Alan Greenspan → Paul A. Volcker: Parent-side/proposed acquisition, professional employment, sports victory, public membership or a personal appositive does not establish the child-to-parent subsidiary relation.

Cited evidence lines: [5883](../raw_map.tsv:5883).



