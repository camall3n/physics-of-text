# audit_06dbdb9b03af — rel_57: leader or organizational head of

Predicate ID: organizational_leader_of

Person X holds or held a leader, head, president, chief or chair office in group, institution, organization or political body Y.

Includes: explicit leader/head/president/chief/chair; legislative majority/minority leadership or whip; leadership office within an identified body; historical office. Excludes: ordinary membership or service; founding/ownership alone; party control of a chamber; candidate alone; athletic/standings or task-only lead; editor alone. Ambiguous unless resolved by case-local evidence: generic director or executive without clear leadership role; bare lead lacking organizational-role context; materially truncated political body. Preserves the narrower leader/head family used in the two original full censuses; managerial_office_in separately accepts explicit director/executive titles.

Complete census: 1 supported, 0 incorrect, 4 ambiguous; N=5. Precision 1/5=20.00% to 5/5=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| 3 | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| 2 | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;majority-&gt;amod-&gt;\|amod |
| 1 | appos\|&lt;-appos&lt;-leader-&gt;amod-&gt;\|amod |
| 1 | appos\|&lt;-appos&lt;-leader-&gt;dep-&gt;\|dep |
| 1 | appos\|&lt;-appos&lt;-supporter&lt;-dep&lt;-install&lt;-partmod&lt;-coup&lt;-nsubj&lt;-ascendancy-&gt;prep-&gt;among-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-urge-&gt;dobj-&gt;senators-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-rants&lt;-nsubj&lt;-turn-&gt;dobj-&gt;welcome-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-belong&lt;-partmod&lt;-week&lt;-pobj&lt;-until&lt;-prep&lt;-leader-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meeting&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-government&lt;-nsubj&lt;-turn-&gt;dobj-&gt;suspect-&gt;amod-&gt;\|amod |
| 1 | rcmod\|-&gt;rcmod-&gt;seek-&gt;dobj-&gt;nomination-&gt;amod-&gt;\|amod |

## Every evaluated fact

### rel_57__ent_268__ent_263

**All observed names:** Joseph L. Bruno → Republican (5)

Ordered IDs: Ent[ent_268] → Ent[ent_263]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3027](../raw_map.tsv:3027) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| [3028](../raw_map.tsv:3028) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-leader-&gt;amod-&gt;\|amod |
| [3029](../raw_map.tsv:3029) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-leader-&gt;dep-&gt;\|dep |
| [3031](../raw_map.tsv:3031) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-supporter&lt;-dep&lt;-install&lt;-partmod&lt;-coup&lt;-nsubj&lt;-ascendancy-&gt;prep-&gt;among-&gt;pobj-&gt;\|pobj |
| [3032](../raw_map.tsv:3032) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Joseph L. Bruno → Republican: Explicit Republican majority-leader wording identifies named party leadership, matching the earlier census party-name boundary.

Cited evidence lines: [3027](../raw_map.tsv:3027), [3028](../raw_map.tsv:3028), [3029](../raw_map.tsv:3029), [3031](../raw_map.tsv:3031), [3032](../raw_map.tsv:3032).


Issue tags: mixed_evidence

### rel_57__ent_49__ent_36

**All observed names:** George J. Mitchell → Democratic (5)

Ordered IDs: Ent[ent_49] → Ent[ent_36]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3768](../raw_map.tsv:3768) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3769](../raw_map.tsv:3769) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| [3770](../raw_map.tsv:3770) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| [3772](../raw_map.tsv:3772) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;majority-&gt;amod-&gt;\|amod |
| [3777](../raw_map.tsv:3777) | George J. Mitchell | Democratic | nsubj\|&lt;-nsubj&lt;-urge-&gt;dobj-&gt;senators-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). George J. Mitchell → Democratic: Democratic or Libyan is an incomplete adjectival body argument, leaving the exact party body or state office unresolved.

Cited evidence lines: [3768](../raw_map.tsv:3768), [3769](../raw_map.tsv:3769), [3770](../raw_map.tsv:3770), [3772](../raw_map.tsv:3772), [3777](../raw_map.tsv:3777).

**Review question:** Which fully identified political body is led by this person?
Issue tags: argument_identity, mixed_evidence

### rel_57__ent_31__ent_36

**All observed names:** Harry Reid → Democratic (3)

Ordered IDs: Ent[ent_31] → Ent[ent_36]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3718](../raw_map.tsv:3718) | Harry Reid | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3726](../raw_map.tsv:3726) | Harry Reid | Democratic | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meeting&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;leader-&gt;amod-&gt;\|amod |
| [3727](../raw_map.tsv:3727) | Harry Reid | Democratic | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-belong&lt;-partmod&lt;-week&lt;-pobj&lt;-until&lt;-prep&lt;-leader-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Harry Reid → Democratic: Democratic or Libyan is an incomplete adjectival body argument, leaving the exact party body or state office unresolved.

Cited evidence lines: [3718](../raw_map.tsv:3718), [3726](../raw_map.tsv:3726), [3727](../raw_map.tsv:3727).

**Review question:** Which fully identified political body is led by this person?
Issue tags: argument_identity

### rel_57__ent_33__ent_32

**All observed names:** Col. Muammar el-Qaddafi → Libyan (3)

Ordered IDs: Ent[ent_33] → Ent[ent_32]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3738](../raw_map.tsv:3738) | Col. Muammar el-Qaddafi | Libyan | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3741](../raw_map.tsv:3741) | Col. Muammar el-Qaddafi | Libyan | poss\|&lt;-poss&lt;-government&lt;-nsubj&lt;-turn-&gt;dobj-&gt;suspect-&gt;amod-&gt;\|amod |
| [3747](../raw_map.tsv:3747) | Col. Muammar el-Qaddafi | Libyan | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-rants&lt;-nsubj&lt;-turn-&gt;dobj-&gt;welcome-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Col. Muammar el-Qaddafi → Libyan: Democratic or Libyan is an incomplete adjectival body argument, leaving the exact party body or state office unresolved.

Cited evidence lines: [3738](../raw_map.tsv:3738), [3741](../raw_map.tsv:3741), [3747](../raw_map.tsv:3747).

**Review question:** Which fully identified political body is led by this person?
Issue tags: argument_identity, mixed_evidence

### rel_57__ent_264__ent_36

**All observed names:** Richard A. Gephardt → Democratic (3)

Ordered IDs: Ent[ent_264] → Ent[ent_36]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3748](../raw_map.tsv:3748) | Richard A. Gephardt | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3752](../raw_map.tsv:3752) | Richard A. Gephardt | Democratic | appos\|-&gt;appos-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;majority-&gt;amod-&gt;\|amod |
| [3756](../raw_map.tsv:3756) | Richard A. Gephardt | Democratic | rcmod\|-&gt;rcmod-&gt;seek-&gt;dobj-&gt;nomination-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Richard A. Gephardt → Democratic: Democratic or Libyan is an incomplete adjectival body argument, leaving the exact party body or state office unresolved.

Cited evidence lines: [3748](../raw_map.tsv:3748), [3752](../raw_map.tsv:3752), [3756](../raw_map.tsv:3756).

**Review question:** Which fully identified political body is led by this person?
Issue tags: argument_identity, mixed_evidence
