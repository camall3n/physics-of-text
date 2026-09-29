# audit_9c88162c7b22 — rel_79: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 7 supported, 0 incorrect, 1 ambiguous; N=8. Precision 7/8=87.50% to 8/8=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 8 | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| 5 | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 5 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| 3 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |
| 2 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-candidate-&gt;appos-&gt;\|appos |
| 1 | amod\|&lt;-amod&lt;-rival-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-by&lt;-prep&lt;-endorsement-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-of&lt;-prep&lt;-ally-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-of&lt;-prep&lt;-defeat-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-with&lt;-prep&lt;-position-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-nominee-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-supporter-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-whip-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-confirm-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-fail-&gt;prep-&gt;on-&gt;pobj-&gt;proposal-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-counterpart-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-deliver-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-uncertainty-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader&lt;-nsubj&lt;-\|nsubj |

## Every evaluated fact

### rel_79__ent_1197__ent_267

**All observed names:** Senate → Trent Lott (7)

Ordered IDs: Ent[ent_1197] → Ent[ent_267]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7636](../raw_map.tsv:7636) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7637](../raw_map.tsv:7637) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7638](../raw_map.tsv:7638) | Senate | Trent Lott | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7639](../raw_map.tsv:7639) | Senate | Trent Lott | nn\|&lt;-nn&lt;-whip-&gt;appos-&gt;\|appos |
| [7642](../raw_map.tsv:7642) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-by&lt;-prep&lt;-endorsement-&gt;appos-&gt;\|appos |
| [7644](../raw_map.tsv:7644) | Senate | Trent Lott | nsubj\|&lt;-nsubj&lt;-fail-&gt;prep-&gt;on-&gt;pobj-&gt;proposal-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7645](../raw_map.tsv:7645) | Senate | Trent Lott | nsubj\|&lt;-nsubj&lt;-confirm-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Senate → Trent Lott: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7636](../raw_map.tsv:7636), [7637](../raw_map.tsv:7637), [7638](../raw_map.tsv:7638), [7639](../raw_map.tsv:7639), [7642](../raw_map.tsv:7642), [7644](../raw_map.tsv:7644), [7645](../raw_map.tsv:7645).


Issue tags: mixed_evidence

### rel_79__ent_1197__ent_727

**All observed names:** Senate → Ralph J. Marino (7)

Ordered IDs: Ent[ent_1197] → Ent[ent_727]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7656](../raw_map.tsv:7656) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7657](../raw_map.tsv:7657) | Senate | Ralph J. Marino | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7659](../raw_map.tsv:7659) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |
| [7660](../raw_map.tsv:7660) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| [7661](../raw_map.tsv:7661) | Senate | Ralph J. Marino | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader&lt;-nsubj&lt;-\|nsubj |
| [7663](../raw_map.tsv:7663) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-of&lt;-prep&lt;-ally-&gt;appos-&gt;\|appos |
| [7664](../raw_map.tsv:7664) | Senate | Ralph J. Marino | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Senate → Ralph J. Marino: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7656](../raw_map.tsv:7656), [7657](../raw_map.tsv:7657), [7659](../raw_map.tsv:7659), [7660](../raw_map.tsv:7660), [7661](../raw_map.tsv:7661), [7663](../raw_map.tsv:7663), [7664](../raw_map.tsv:7664).


Issue tags: mixed_evidence

### rel_79__ent_1197__ent_268

**All observed names:** Senate → Joseph L. Bruno (6)

Ordered IDs: Ent[ent_1197] → Ent[ent_268]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7616](../raw_map.tsv:7616) | Senate | Joseph L. Bruno | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7617](../raw_map.tsv:7617) | Senate | Joseph L. Bruno | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7619](../raw_map.tsv:7619) | Senate | Joseph L. Bruno | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-aide-&gt;appos-&gt;\|appos |
| [7620](../raw_map.tsv:7620) | Senate | Joseph L. Bruno | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7623](../raw_map.tsv:7623) | Senate | Joseph L. Bruno | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-counterpart-&gt;appos-&gt;\|appos |
| [7624](../raw_map.tsv:7624) | Senate | Joseph L. Bruno | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Joseph L. Bruno: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7616](../raw_map.tsv:7616), [7617](../raw_map.tsv:7617), [7619](../raw_map.tsv:7619), [7620](../raw_map.tsv:7620), [7623](../raw_map.tsv:7623), [7624](../raw_map.tsv:7624).


Issue tags: mixed_evidence

### rel_79__ent_1197__ent_265

**All observed names:** Senate → Tom Daschle (5)

Ordered IDs: Ent[ent_1197] → Ent[ent_265]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7646](../raw_map.tsv:7646) | Senate | Tom Daschle | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7647](../raw_map.tsv:7647) | Senate | Tom Daschle | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7651](../raw_map.tsv:7651) | Senate | Tom Daschle | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7653](../raw_map.tsv:7653) | Senate | Tom Daschle | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-deliver-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7655](../raw_map.tsv:7655) | Senate | Tom Daschle | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-of&lt;-prep&lt;-defeat-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Tom Daschle: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7646](../raw_map.tsv:7646), [7647](../raw_map.tsv:7647), [7651](../raw_map.tsv:7651), [7653](../raw_map.tsv:7653), [7655](../raw_map.tsv:7655).


Issue tags: mixed_evidence

### rel_79__ent_1197__ent_261

**All observed names:** Senate → Bob Dole (4)

Ordered IDs: Ent[ent_1197] → Ent[ent_261]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7626](../raw_map.tsv:7626) | Senate | Bob Dole | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7628](../raw_map.tsv:7628) | Senate | Bob Dole | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7631](../raw_map.tsv:7631) | Senate | Bob Dole | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;appos-&gt;\|appos |
| [7635](../raw_map.tsv:7635) | Senate | Bob Dole | nn\|&lt;-nn&lt;-supporter-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Senate → Bob Dole: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7626](../raw_map.tsv:7626), [7628](../raw_map.tsv:7628), [7631](../raw_map.tsv:7631), [7635](../raw_map.tsv:7635).


Issue tags: mixed_evidence

### rel_79__ent_1197__ent_969

**All observed names:** Senate → Bill Frist (4)

Ordered IDs: Ent[ent_1197] → Ent[ent_969]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7666](../raw_map.tsv:7666) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7667](../raw_map.tsv:7667) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7670](../raw_map.tsv:7670) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-with&lt;-prep&lt;-position-&gt;appos-&gt;\|appos |
| [7672](../raw_map.tsv:7672) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokesman-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Bill Frist: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7666](../raw_map.tsv:7666), [7667](../raw_map.tsv:7667), [7670](../raw_map.tsv:7670), [7672](../raw_map.tsv:7672).


Issue tags: mixed_evidence

### rel_79__ent_263__ent_261

**All observed names:** Republican → Bob Dole (4)

Ordered IDs: Ent[ent_263] → Ent[ent_261]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7706](../raw_map.tsv:7706) | Republican | Bob Dole | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7709](../raw_map.tsv:7709) | Republican | Bob Dole | amod\|&lt;-amod&lt;-rival-&gt;appos-&gt;\|appos |
| [7713](../raw_map.tsv:7713) | Republican | Bob Dole | amod\|&lt;-amod&lt;-candidate-&gt;appos-&gt;\|appos |
| [7714](../raw_map.tsv:7714) | Republican | Bob Dole | nn\|&lt;-nn&lt;-nominee-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Republican → Bob Dole: Republican modifies a leader/candidate but does not identify the complete party or caucus body.

Cited evidence lines: [7706](../raw_map.tsv:7706), [7709](../raw_map.tsv:7709), [7713](../raw_map.tsv:7713), [7714](../raw_map.tsv:7714).

**Review question:** Which Republican party organization or legislative caucus does the leader title identify?
Issue tags: incomplete_argument

### rel_79__ent_1197__ent_49

**All observed names:** Senate → George J. Mitchell (3)

Ordered IDs: Ent[ent_1197] → Ent[ent_49]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7686](../raw_map.tsv:7686) | Senate | George J. Mitchell | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7692](../raw_map.tsv:7692) | Senate | George J. Mitchell | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7693](../raw_map.tsv:7693) | Senate | George J. Mitchell | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-uncertainty-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → George J. Mitchell: Direct Senate leader/whip apposition supplies an eligible legislative leadership role.

Cited evidence lines: [7686](../raw_map.tsv:7686), [7692](../raw_map.tsv:7692), [7693](../raw_map.tsv:7693).


Issue tags: mixed_evidence
