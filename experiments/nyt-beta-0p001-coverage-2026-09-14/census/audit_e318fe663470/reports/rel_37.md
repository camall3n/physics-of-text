# audit_e318fe663470 — rel_37: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 3 supported, 7 incorrect, 2 ambiguous; N=12. Precision 3/12=25.00% to 5/12=41.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| 2 | partmod\|-&gt;partmod-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-campaign-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| 1 | dep\|-&gt;dep-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-senator-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-uncertainty-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-board&lt;-pobj&lt;-of&lt;-prep&lt;-member-&gt;dep-&gt;plan-&gt;partmod-&gt;call-&gt;dep-&gt;\|dep |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-takeover-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-leadership-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-majority-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-parent&lt;-nsubj&lt;-lose-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;buy-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;nsubj-&gt;man-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_37__ent_1073__ent_1434

**All observed names:** Young &amp; Rubicam → WPP Group (4)

Ordered IDs: Ent[ent_1073] → Ent[ent_1434]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6720](../raw_map.tsv:6720) | Young &amp; Rubicam | WPP Group | partmod\|-&gt;partmod-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [6721](../raw_map.tsv:6721) | Young &amp; Rubicam | WPP Group | dep\|-&gt;dep-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [6722](../raw_map.tsv:6722) | Young &amp; Rubicam | WPP Group | rcmod\|-&gt;rcmod-&gt;buy-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [6726](../raw_map.tsv:6726) | Young &amp; Rubicam | WPP Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-takeover-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Young & Rubicam → WPP Group: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [6720](../raw_map.tsv:6720), [6721](../raw_map.tsv:6721), [6722](../raw_map.tsv:6722), [6726](../raw_map.tsv:6726).




### rel_37__ent_1321__ent_1269

**All observed names:** Senate → Republican (3)

Ordered IDs: Ent[ent_1321] → Ent[ent_1269]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7677](../raw_map.tsv:7677) | Senate | Republican | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7678](../raw_map.tsv:7678) | Senate | Republican | poss\|&lt;-poss&lt;-majority-&gt;amod-&gt;\|amod |
| [7685](../raw_map.tsv:7685) | Senate | Republican | poss\|&lt;-poss&lt;-leadership-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Senate → Republican: The leader construction supplies only Republican or Republicans rather than an identified individual officeholder.

Cited evidence lines: [7677](../raw_map.tsv:7677), [7678](../raw_map.tsv:7678), [7685](../raw_map.tsv:7685).

**Review question:** Which named Senate leader is intended?
Issue tags: unnamed_person

### rel_37__ent_1321__ent_49

**All observed names:** Senate → George J. Mitchell (3)

Ordered IDs: Ent[ent_1321] → Ent[ent_49]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7686](../raw_map.tsv:7686) | Senate | George J. Mitchell | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |
| [7691](../raw_map.tsv:7691) | Senate | George J. Mitchell | poss\|&lt;-poss&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |
| [7693](../raw_map.tsv:7693) | Senate | George J. Mitchell | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-uncertainty-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → George J. Mitchell: An explicit inverse leader/majority-leader construction names the Senate's political leader.

Cited evidence lines: [7686](../raw_map.tsv:7686), [7691](../raw_map.tsv:7691), [7693](../raw_map.tsv:7693).


Issue tags: mixed_evidence

### rel_37__ent_1294__ent_1401

**All observed names:** Clinton → New York (2)

Ordered IDs: Ent[ent_1294] → Ent[ent_1401]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4684](../raw_map.tsv:4684) | Clinton | New York | poss\|&lt;-poss&lt;-campaign-&gt;nn-&gt;\|nn |
| [4689](../raw_map.tsv:4689) | Clinton | New York | nsubj\|&lt;-nsubj&lt;-senator-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Clinton → New York: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [4684](../raw_map.tsv:4684), [4689](../raw_map.tsv:4689).




### rel_37__ent_882__ent_723

**All observed names:** American Airlines → AMR Corporation (1)

Ordered IDs: Ent[ent_882] → Ent[ent_723]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2570](../raw_map.tsv:2570) | American Airlines | AMR Corporation | poss\|&lt;-poss&lt;-parent&lt;-nsubj&lt;-lose-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). American Airlines → AMR Corporation: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [2570](../raw_map.tsv:2570).




### rel_37__ent_645__ent_333

**All observed names:** Mark → Manhattan (1)

Ordered IDs: Ent[ent_645] → Ent[ent_333]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3988](../raw_map.tsv:3988) | Mark | Manhattan | rcmod\|-&gt;rcmod-&gt;take-&gt;nsubj-&gt;man-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mark → Manhattan: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [3988](../raw_map.tsv:3988).




### rel_37__ent_1128__ent_773

**All observed names:** J. Walter Thompson → WPP Group (1)

Ordered IDs: Ent[ent_1128] → Ent[ent_773]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4584](../raw_map.tsv:4584) | J. Walter Thompson | WPP Group | partmod\|-&gt;partmod-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). J. Walter Thompson → WPP Group: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [4584](../raw_map.tsv:4584).




### rel_37__ent_313__ent_843

**All observed names:** Mr. Clinton → New York (1)

Ordered IDs: Ent[ent_313] → Ent[ent_843]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4711](../raw_map.tsv:4711) | Mr. Clinton | New York | poss\|&lt;-poss&lt;-campaign-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Mr. Clinton → New York: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [4711](../raw_map.tsv:4711).




### rel_37__ent_1197__ent_1213

**All observed names:** Senate → Republicans (1)

Ordered IDs: Ent[ent_1197] → Ent[ent_1213]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4902](../raw_map.tsv:4902) | Senate | Republicans | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |

**Judgment: ambiguous** (primary). Senate → Republicans: The leader construction supplies only Republican or Republicans rather than an identified individual officeholder.

Cited evidence lines: [4902](../raw_map.tsv:4902).

**Review question:** Which named Senate leader is intended?
Issue tags: unnamed_person

### rel_37__ent_1142__ent_606

**All observed names:** California Public Employees ' Retirement System → Calpers (1)

Ordered IDs: Ent[ent_1142] → Ent[ent_606]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5633](../raw_map.tsv:5633) | California Public Employees ' Retirement System | Calpers | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-board&lt;-pobj&lt;-of&lt;-prep&lt;-member-&gt;dep-&gt;plan-&gt;partmod-&gt;call-&gt;dep-&gt;\|dep |

**Judgment: incorrect** (primary). California Public Employees ' Retirement System → Calpers: Corporate ownership, a campaign/senator affiliation, residence or pension-fund alias context does not establish the declared inverse political leadership.

Cited evidence lines: [5633](../raw_map.tsv:5633).




### rel_37__ent_1197__ent_268

**All observed names:** Senate → Joseph L. Bruno (1)

Ordered IDs: Ent[ent_1197] → Ent[ent_268]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7622](../raw_map.tsv:7622) | Senate | Joseph L. Bruno | poss\|&lt;-poss&lt;-majority&lt;-pobj&lt;-of&lt;-prep&lt;-leader-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Joseph L. Bruno: An explicit inverse leader/majority-leader construction names the Senate's political leader.

Cited evidence lines: [7622](../raw_map.tsv:7622).




### rel_37__ent_1321__ent_1214

**All observed names:** Senate → Trent Lott (1)

Ordered IDs: Ent[ent_1321] → Ent[ent_1214]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7636](../raw_map.tsv:7636) | Senate | Trent Lott | nn\|&lt;-nn&lt;-leader-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Senate → Trent Lott: An explicit inverse leader/majority-leader construction names the Senate's political leader.

Cited evidence lines: [7636](../raw_map.tsv:7636).



