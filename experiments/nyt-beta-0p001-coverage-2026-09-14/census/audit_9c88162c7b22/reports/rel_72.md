# audit_9c88162c7b22 — rel_72: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 1 supported, 3 incorrect, 0 ambiguous; N=4. Precision 1/4=25.00% to 1/4=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |
| 2 | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-flow-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-meander-&gt;prep-&gt;from-&gt;pobj-&gt;lake-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-along-&gt;dep-&gt;from-&gt;pobj-&gt;beach-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-smack-&gt;prep-&gt;near-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-over&lt;-prep&lt;-bridge&lt;-pobj&lt;-of&lt;-prep&lt;-operation&lt;-nsubj&lt;-impede-&gt;dobj-&gt;traffic-&gt;prep-&gt;between-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;co-captains-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;open-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;play-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_72__ent_231__ent_473

**All observed names:** Connecticut River → Long Island Sound (5)

Ordered IDs: Ent[ent_231] → Ent[ent_473]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6072](../raw_map.tsv:6072) | Connecticut River | Long Island Sound | nsubj\|&lt;-nsubj&lt;-meander-&gt;prep-&gt;from-&gt;pobj-&gt;lake-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6073](../raw_map.tsv:6073) | Connecticut River | Long Island Sound | nsubj\|&lt;-nsubj&lt;-flow-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| [6076](../raw_map.tsv:6076) | Connecticut River | Long Island Sound | pobj\|&lt;-pobj&lt;-over&lt;-prep&lt;-bridge&lt;-pobj&lt;-of&lt;-prep&lt;-operation&lt;-nsubj&lt;-impede-&gt;dobj-&gt;traffic-&gt;prep-&gt;between-&gt;pobj-&gt;\|pobj |
| [6077](../raw_map.tsv:6077) | Connecticut River | Long Island Sound | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-smack-&gt;prep-&gt;near-&gt;pobj-&gt;\|pobj |
| [6079](../raw_map.tsv:6079) | Connecticut River | Long Island Sound | pobj\|&lt;-pobj&lt;-along-&gt;dep-&gt;from-&gt;pobj-&gt;beach-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Connecticut River → Long Island Sound: River flow into a sound is geographic hydrology, not organizational containment.

Cited evidence lines: [6072](../raw_map.tsv:6072), [6073](../raw_map.tsv:6073), [6076](../raw_map.tsv:6076), [6077](../raw_map.tsv:6077), [6079](../raw_map.tsv:6079).




### rel_72__ent_64__ent_308

**All observed names:** Patrick Ewing → Knicks (4)

Ordered IDs: Ent[ent_64] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3068](../raw_map.tsv:3068) | Patrick Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |
| [3070](../raw_map.tsv:3070) | Patrick Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;play-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3071](../raw_map.tsv:3071) | Patrick Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;open-&gt;nsubj-&gt;\|nsubj |
| [3072](../raw_map.tsv:3072) | Patrick Ewing | Knicks | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;co-captains-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Patrick Ewing → Knicks: Playing and co-captain roles identify a player, not an owned business unit.

Cited evidence lines: [3068](../raw_map.tsv:3068), [3070](../raw_map.tsv:3070), [3071](../raw_map.tsv:3071), [3072](../raw_map.tsv:3072).




### rel_72__ent_624__ent_866

**All observed names:** United → UAL Corporation (2)

Ordered IDs: Ent[ent_624] → Ent[ent_866]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2489](../raw_map.tsv:2489) | United | UAL Corporation | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |
| [6596](../raw_map.tsv:6596) | United | UAL Corporation | rcmod\|-&gt;rcmod-&gt;unit-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). United → UAL Corporation: The explicit unit-of-UAL-Corporation paths establish United as the child organizational unit.

Cited evidence lines: [2489](../raw_map.tsv:2489), [6596](../raw_map.tsv:6596).




### rel_72__ent_1148__ent_460

**All observed names:** NPD Group → Port Washington (2)

Ordered IDs: Ent[ent_1148] → Ent[ent_460]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5782](../raw_map.tsv:5782) | NPD Group | Port Washington | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |
| [7146](../raw_map.tsv:7146) | NPD Group | Port Washington | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). NPD Group → Port Washington: The bare be path toward a geographic place supplies no organizational unit or parent relationship.

Cited evidence lines: [5782](../raw_map.tsv:5782), [7146](../raw_map.tsv:7146).



