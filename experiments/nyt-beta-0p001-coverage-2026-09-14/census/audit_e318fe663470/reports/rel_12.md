# audit_e318fe663470 — rel_12: has minister

Predicate ID: has_minister

Country, government, or political administration X has or had person Y as an explicitly identified minister.

Includes: explicit minister of X or X's minister; a portfolio or prime minister office explicitly attached to X; historical ministerial office. Excludes: ordinary official, ambassador, or opposition politician without minister title; a minister of a different government merely meeting X; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: an incomplete national adjective in the institution slot; minister-designate without established tenure; unclear portfolio or government attachment. The inverse ministerial office does not assert that every minister is the head of government.

Complete census: 4 supported, 2 incorrect, 0 ambiguous; N=6. Precision 4/6=66.67% to 4/6=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| 2 | appos\|-&gt;appos-&gt;agency-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-side-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-leader-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-minister-&gt;rcmod-&gt;savor-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-like&lt;-prep&lt;-interlocutor&lt;-pobj&lt;-with&lt;-prep&lt;-dealings&lt;-pobj&lt;-for&lt;-prep&lt;-know-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-of&lt;-prep&lt;-arrival&lt;-pobj&lt;-before&lt;-prep&lt;-day-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-official&lt;-pobj&lt;-with&lt;-prep&lt;-talk&lt;-dobj&lt;-hold-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-triumvirate-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-triumvirate-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-willingness-&gt;appos-&gt;decision-&gt;partmod-&gt;make-&gt;prep-&gt;by-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;possible-&gt;prep-&gt;under-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_12__ent_818__ent_708

**All observed names:** China → Qian Qichen (6)

Ordered IDs: Ent[ent_818] → Ent[ent_708]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7047](../raw_map.tsv:7047) | China | Qian Qichen | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7050](../raw_map.tsv:7050) | China | Qian Qichen | poss\|&lt;-poss&lt;-willingness-&gt;appos-&gt;decision-&gt;partmod-&gt;make-&gt;prep-&gt;by-&gt;pobj-&gt;minister-&gt;appos-&gt;\|appos |
| [7051](../raw_map.tsv:7051) | China | Qian Qichen | poss\|&lt;-poss&lt;-official&lt;-pobj&lt;-with&lt;-prep&lt;-talk&lt;-dobj&lt;-hold-&gt;dobj-&gt;\|dobj |
| [7054](../raw_map.tsv:7054) | China | Qian Qichen | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-of&lt;-prep&lt;-arrival&lt;-pobj&lt;-before&lt;-prep&lt;-day-&gt;appos-&gt;\|appos |
| [7055](../raw_map.tsv:7055) | China | Qian Qichen | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-like&lt;-prep&lt;-interlocutor&lt;-pobj&lt;-with&lt;-prep&lt;-dealings&lt;-pobj&lt;-for&lt;-prep&lt;-know-&gt;nsubj-&gt;\|nsubj |
| [7056](../raw_map.tsv:7056) | China | Qian Qichen | poss\|&lt;-poss&lt;-leader-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). China → Qian Qichen: An explicit possessed-minister row establishes the minister of the named country.

Cited evidence lines: [7047](../raw_map.tsv:7047), [7050](../raw_map.tsv:7050), [7051](../raw_map.tsv:7051), [7054](../raw_map.tsv:7054), [7055](../raw_map.tsv:7055), [7056](../raw_map.tsv:7056).


Issue tags: mixed_evidence

### rel_12__ent_1237__ent_1132

**All observed names:** Israel → Shimon Peres (3)

Ordered IDs: Ent[ent_1237] → Ent[ent_1132]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7017](../raw_map.tsv:7017) | Israel | Shimon Peres | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7025](../raw_map.tsv:7025) | Israel | Shimon Peres | rcmod\|-&gt;rcmod-&gt;possible-&gt;prep-&gt;under-&gt;pobj-&gt;\|pobj |
| [7026](../raw_map.tsv:7026) | Israel | Shimon Peres | poss\|&lt;-poss&lt;-triumvirate-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Israel → Shimon Peres: An explicit possessed-minister row establishes the minister of the named country.

Cited evidence lines: [7017](../raw_map.tsv:7017), [7025](../raw_map.tsv:7025), [7026](../raw_map.tsv:7026).


Issue tags: mixed_evidence

### rel_12__ent_1265__ent_819

**All observed names:** Republicans → Democrats (2)

Ordered IDs: Ent[ent_1265] → Ent[ent_819]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1911](../raw_map.tsv:1911) | Republicans | Democrats | nsubj\|&lt;-nsubj&lt;-side-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5484](../raw_map.tsv:5484) | Republicans | Democrats | nsubj\|&lt;-nsubj&lt;-side-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Republicans → Democrats: Political agreement or a corporate agency affiliation does not establish ministerial office.

Cited evidence lines: [1911](../raw_map.tsv:1911), [5484](../raw_map.tsv:5484).




### rel_12__ent_1304__ent_1015

**All observed names:** BBDO Worldwide → Omnicom Group (2)

Ordered IDs: Ent[ent_1304] → Ent[ent_1015]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4606](../raw_map.tsv:4606) | BBDO Worldwide | Omnicom Group | appos\|-&gt;appos-&gt;agency-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6678](../raw_map.tsv:6678) | BBDO Worldwide | Omnicom Group | appos\|-&gt;appos-&gt;agency-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). BBDO Worldwide → Omnicom Group: Political agreement or a corporate agency affiliation does not establish ministerial office.

Cited evidence lines: [4606](../raw_map.tsv:4606), [6678](../raw_map.tsv:6678).




### rel_12__ent_1204__ent_941

**All observed names:** Israel → Yitzhak Rabin (2)

Ordered IDs: Ent[ent_1204] → Ent[ent_941]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7057](../raw_map.tsv:7057) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7066](../raw_map.tsv:7066) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-minister-&gt;rcmod-&gt;savor-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Israel → Yitzhak Rabin: An explicit possessed-minister row establishes the minister of the named country.

Cited evidence lines: [7057](../raw_map.tsv:7057), [7066](../raw_map.tsv:7066).




### rel_12__ent_1237__ent_940

**All observed names:** Israel → Yitzhak Shamir (2)

Ordered IDs: Ent[ent_1237] → Ent[ent_940]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7077](../raw_map.tsv:7077) | Israel | Yitzhak Shamir | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7084](../raw_map.tsv:7084) | Israel | Yitzhak Shamir | poss\|&lt;-poss&lt;-triumvirate-&gt;dep-&gt;\|dep |

**Judgment: supported** (primary). Israel → Yitzhak Shamir: An explicit possessed-minister row establishes the minister of the named country.

Cited evidence lines: [7077](../raw_map.tsv:7077), [7084](../raw_map.tsv:7084).


Issue tags: mixed_evidence
