# audit_dcb746fa83d6 — rel_39: leader or organizational head of

Predicate ID: organizational_leader_of

Person X holds or held a leader, head, president, chief or chair office in group, institution, organization or political body Y.

Includes: explicit leader/head/president/chief/chair; legislative majority/minority leadership or whip; leadership office within an identified body; historical office. Excludes: ordinary membership or service; founding/ownership alone; party control of a chamber; candidate alone; athletic/standings or task-only lead; editor alone. Ambiguous unless resolved by case-local evidence: generic director or executive without clear leadership role; bare lead lacking organizational-role context; materially truncated political body. Preserves the narrower leader/head family used in the two original full censuses; managerial_office_in separately accepts explicit director/executive titles.

Complete census: 2 supported, 1 incorrect, 3 ambiguous; N=6. Precision 2/6=33.33% to 5/6=83.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| 2 | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| 2 | appos\|&lt;-appos&lt;-leader-&gt;appos-&gt;\|appos |
| 1 | appos\|-&gt;appos-&gt;giant-&gt;amod-&gt;\|amod |
| 1 | appos\|&lt;-appos&lt;-leader-&gt;amod-&gt;\|amod |
| 1 | appos\|&lt;-appos&lt;-man-&gt;appos-&gt;\|appos |
| 1 | appos\|&lt;-appos&lt;-speaker-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-removal-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;operate-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_39__ent_1221__ent_263

**All observed names:** Joseph L. Bruno → Republican (6)

Ordered IDs: Ent[ent_1221] → Ent[ent_263]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3025](../raw_map.tsv:3025) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-leader-&gt;appos-&gt;\|appos |
| [3026](../raw_map.tsv:3026) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3028](../raw_map.tsv:3028) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-leader-&gt;amod-&gt;\|amod |
| [3030](../raw_map.tsv:3030) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-speaker-&gt;appos-&gt;\|appos |
| [3032](../raw_map.tsv:3032) | Joseph L. Bruno | Republican | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |
| [3033](../raw_map.tsv:3033) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-man-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Joseph L. Bruno → Republican: An explicit Republican leader title establishes organizational leadership under the preserved party-label convention.

Cited evidence lines: [3025](../raw_map.tsv:3025), [3026](../raw_map.tsv:3026), [3028](../raw_map.tsv:3028), [3030](../raw_map.tsv:3030), [3032](../raw_map.tsv:3032), [3033](../raw_map.tsv:3033).


Issue tags: mixed_evidence

### rel_39__ent_26__ent_1375

**All observed names:** American Airlines → AMR Corporation (1); Gazprom → Russian (1)

Ordered IDs: Ent[ent_26] → Ent[ent_1375]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2569](../raw_map.tsv:2569) | American Airlines | AMR Corporation | rcmod\|-&gt;rcmod-&gt;operate-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [3649](../raw_map.tsv:3649) | Gazprom | Russian | appos\|-&gt;appos-&gt;giant-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). American Airlines → AMR Corporation; Gazprom → Russian: Corporate operation or a company's nationality does not establish person-to-institution leadership.

Cited evidence lines: [2569](../raw_map.tsv:2569), [3649](../raw_map.tsv:3649).




### rel_39__ent_267__ent_764

**All observed names:** Trent Lott → Republican (2)

Ordered IDs: Ent[ent_267] → Ent[ent_764]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3758](../raw_map.tsv:3758) | Trent Lott | Republican | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3761](../raw_map.tsv:3761) | Trent Lott | Republican | appos\|&lt;-appos&lt;-leader-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Trent Lott → Republican: An explicit Republican leader title establishes organizational leadership under the preserved party-label convention.

Cited evidence lines: [3758](../raw_map.tsv:3758), [3761](../raw_map.tsv:3761).




### rel_39__ent_49__ent_36

**All observed names:** George J. Mitchell → Democratic (2)

Ordered IDs: Ent[ent_49] → Ent[ent_36]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3768](../raw_map.tsv:3768) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |
| [3769](../raw_map.tsv:3769) | George J. Mitchell | Democratic | appos\|-&gt;appos-&gt;senator-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). George J. Mitchell → Democratic: The leadership role attaches to Democratic or Palestinian as an incomplete political-body adjective.

Cited evidence lines: [3768](../raw_map.tsv:3768), [3769](../raw_map.tsv:3769).

**Review question:** Which complete political body or party is intended?
Issue tags: truncated_argument

### rel_39__ent_1337__ent_458

**All observed names:** Yasir Arafat → Palestinian (1)

Ordered IDs: Ent[ent_1337] → Ent[ent_458]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3686](../raw_map.tsv:3686) | Yasir Arafat | Palestinian | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-removal-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Yasir Arafat → Palestinian: The leadership role attaches to Democratic or Palestinian as an incomplete political-body adjective.

Cited evidence lines: [3686](../raw_map.tsv:3686).

**Review question:** Which complete political body or party is intended?
Issue tags: truncated_argument

### rel_39__ent_265__ent_1216

**All observed names:** Tom Daschle → Democratic (1)

Ordered IDs: Ent[ent_265] → Ent[ent_1216]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3698](../raw_map.tsv:3698) | Tom Daschle | Democratic | appos\|-&gt;appos-&gt;leader-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Tom Daschle → Democratic: The leadership role attaches to Democratic or Palestinian as an incomplete political-body adjective.

Cited evidence lines: [3698](../raw_map.tsv:3698).

**Review question:** Which complete political body or party is intended?
Issue tags: truncated_argument
