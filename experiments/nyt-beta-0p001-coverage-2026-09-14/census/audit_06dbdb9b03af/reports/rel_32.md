# audit_06dbdb9b03af — rel_32: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 3 supported, 1 incorrect, 1 ambiguous; N=5. Precision 3/5=60.00% to 4/5=80.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |
| 2 | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;nn-&gt;\|nn |
| 2 | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 2 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-by&lt;-prep&lt;-endorsement-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokeswoman-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-with&lt;-prep&lt;-position-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-whip-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-fail-&gt;prep-&gt;on-&gt;pobj-&gt;proposal-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-counterpart-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-friend-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader&lt;-nsubj&lt;-\|nsubj |
| 1 | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;under-&gt;pobj-&gt;scramble-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_32__ent_1197__ent_267

**All observed names:** Senate → Trent Lott (5)

Ordered IDs: Ent[ent_1197] → Ent[ent_267]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7637](../raw_map.tsv:7637) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7639](../raw_map.tsv:7639) | Senate | Trent Lott | nn\|&lt;-nn&lt;-whip-&gt;appos-&gt;\|appos |
| [7642](../raw_map.tsv:7642) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-by&lt;-prep&lt;-endorsement-&gt;appos-&gt;\|appos |
| [7643](../raw_map.tsv:7643) | Senate | Trent Lott | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-friend-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [7644](../raw_map.tsv:7644) | Senate | Trent Lott | nsubj\|&lt;-nsubj&lt;-fail-&gt;prep-&gt;on-&gt;pobj-&gt;proposal-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Senate → Trent Lott: A direct whip or named Senate/majority leader row establishes the political leadership role, alongside intermediary references.

Cited evidence lines: [7637](../raw_map.tsv:7637), [7639](../raw_map.tsv:7639), [7642](../raw_map.tsv:7642), [7643](../raw_map.tsv:7643), [7644](../raw_map.tsv:7644).


Issue tags: mixed_evidence

### rel_32__ent_1197__ent_268

**All observed names:** Senate → Joseph L. Bruno (4)

Ordered IDs: Ent[ent_1197] → Ent[ent_268]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7619](../raw_map.tsv:7619) | Senate | Joseph L. Bruno | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| [7620](../raw_map.tsv:7620) | Senate | Joseph L. Bruno | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7623](../raw_map.tsv:7623) | Senate | Joseph L. Bruno | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-counterpart-&gt;appos-&gt;\|appos |
| [7624](../raw_map.tsv:7624) | Senate | Joseph L. Bruno | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Joseph L. Bruno: A direct whip or named Senate/majority leader row establishes the political leadership role, alongside intermediary references.

Cited evidence lines: [7619](../raw_map.tsv:7619), [7620](../raw_map.tsv:7620), [7623](../raw_map.tsv:7623), [7624](../raw_map.tsv:7624).


Issue tags: mixed_evidence

### rel_32__ent_1197__ent_727

**All observed names:** Senate → Ralph J. Marino (4)

Ordered IDs: Ent[ent_1197] → Ent[ent_727]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7659](../raw_map.tsv:7659) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |
| [7660](../raw_map.tsv:7660) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| [7661](../raw_map.tsv:7661) | Senate | Ralph J. Marino | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader&lt;-nsubj&lt;-\|nsubj |
| [7664](../raw_map.tsv:7664) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Senate → Ralph J. Marino: A direct whip or named Senate/majority leader row establishes the political leadership role, alongside intermediary references.

Cited evidence lines: [7659](../raw_map.tsv:7659), [7660](../raw_map.tsv:7660), [7661](../raw_map.tsv:7661), [7664](../raw_map.tsv:7664).


Issue tags: mixed_evidence

### rel_32__ent_1197__ent_969

**All observed names:** Senate → Bill Frist (4)

Ordered IDs: Ent[ent_1197] → Ent[ent_969]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7670](../raw_map.tsv:7670) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-with&lt;-prep&lt;-position-&gt;appos-&gt;\|appos |
| [7671](../raw_map.tsv:7671) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokeswoman-&gt;appos-&gt;\|appos |
| [7672](../raw_map.tsv:7672) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |
| [7675](../raw_map.tsv:7675) | Senate | Bill Frist | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;under-&gt;pobj-&gt;scramble-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Senate → Bill Frist: Spokesperson/position and leadership-under-scramble paths leave whether Bill Frist is the Senate leader or attached intermediary unresolved.

Cited evidence lines: [7670](../raw_map.tsv:7670), [7671](../raw_map.tsv:7671), [7672](../raw_map.tsv:7672), [7675](../raw_map.tsv:7675).

**Review question:** Which local expression directly makes Bill Frist the Senate leader rather than the spokesman or another attached person?
Issue tags: attachment, mixed_evidence

### rel_32__ent_561__ent_850

**All observed names:** Giants → Super Bowl (2)

Ordered IDs: Ent[ent_561] → Ent[ent_850]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2224](../raw_map.tsv:2224) | Giants | Super Bowl | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;nn-&gt;\|nn |
| [3444](../raw_map.tsv:3444) | Giants | Super Bowl | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Giants → Super Bowl: A sports team reaching event victory is not a political body having a named leader.

Cited evidence lines: [2224](../raw_map.tsv:2224), [3444](../raw_map.tsv:3444).



