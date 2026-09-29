# audit_dcb746fa83d6 — rel_10: manager of institution

Predicate ID: manager_of

Person X holds or held an explicitly identified manager office in organization, team, business, or public institution Y.

Includes: explicit manager or general manager; a functional or departmental managerial office within Y; historical managerial office. Excludes: president, director, head, executive, or coach alone without a manager title; ordinary employment or membership; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: a personal principal standing for an omitted institution or campaign; unclear manager or institutional attachment; appointment without established tenure. This specific title is separate from president_or_manager_of and managerial_office_in. A sports manager qualifies; merely coaching does not prove the manager title.

Complete census: 3 supported, 4 incorrect, 2 ambiguous; N=9. Precision 3/9=33.33% to 5/9=55.56%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;officer-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;counselor-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;office-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-face-&gt;dobj-&gt;test-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-hold-&gt;dobj-&gt;briefing-&gt;prep-&gt;on-&gt;pobj-&gt;goal-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;man-&gt;rcmod-&gt;precede-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-succeed-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;that-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;draft-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;meet-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;play-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;replace-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;replace-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_10__ent_285__ent_1236

**All observed names:** Frank Cashen → Mets (6)

Ordered IDs: Ent[ent_285] → Ent[ent_1236]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3352](../raw_map.tsv:3352) | Frank Cashen | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3357](../raw_map.tsv:3357) | Frank Cashen | Mets | appos\|-&gt;appos-&gt;officer-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3358](../raw_map.tsv:3358) | Frank Cashen | Mets | appos\|-&gt;appos-&gt;office-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3359](../raw_map.tsv:3359) | Frank Cashen | Mets | nsubj\|&lt;-nsubj&lt;-hold-&gt;dobj-&gt;briefing-&gt;prep-&gt;on-&gt;pobj-&gt;goal-&gt;poss-&gt;\|poss |
| [3360](../raw_map.tsv:3360) | Frank Cashen | Mets | rcmod\|-&gt;rcmod-&gt;play-&gt;nsubj-&gt;\|nsubj |
| [3361](../raw_map.tsv:3361) | Frank Cashen | Mets | rcmod\|-&gt;rcmod-&gt;meet-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Frank Cashen → Mets: An explicit manager title or historical replacement/succession as manager establishes the specified office.

Cited evidence lines: [3352](../raw_map.tsv:3352), [3357](../raw_map.tsv:3357), [3358](../raw_map.tsv:3358), [3359](../raw_map.tsv:3359), [3360](../raw_map.tsv:3360), [3361](../raw_map.tsv:3361).


Issue tags: mixed_evidence

### rel_10__ent_276__ent_561

**All observed names:** Ernie Accorsi → Giants (4)

Ordered IDs: Ent[ent_276] → Ent[ent_561]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3225](../raw_map.tsv:3225) | Ernie Accorsi | Giants | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3227](../raw_map.tsv:3227) | Ernie Accorsi | Giants | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;draft-&gt;nn-&gt;\|nn |
| [3229](../raw_map.tsv:3229) | Ernie Accorsi | Giants | nsubj\|&lt;-nsubj&lt;-succeed-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |
| [3230](../raw_map.tsv:3230) | Ernie Accorsi | Giants | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;man-&gt;rcmod-&gt;precede-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Ernie Accorsi → Giants: An explicit manager title or historical replacement/succession as manager establishes the specified office.

Cited evidence lines: [3225](../raw_map.tsv:3225), [3227](../raw_map.tsv:3227), [3229](../raw_map.tsv:3229), [3230](../raw_map.tsv:3230).


Issue tags: mixed_evidence

### rel_10__ent_587__ent_577

**All observed names:** Richard D. Parsons → AOL Time Warner (3)

Ordered IDs: Ent[ent_587] → Ent[ent_577]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1319](../raw_map.tsv:1319) | Richard D. Parsons | AOL Time Warner | appos\|-&gt;appos-&gt;officer-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1322](../raw_map.tsv:1322) | Richard D. Parsons | AOL Time Warner | rcmod\|-&gt;rcmod-&gt;replace-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1325](../raw_map.tsv:1325) | Richard D. Parsons | AOL Time Warner | nsubj\|&lt;-nsubj&lt;-face-&gt;dobj-&gt;test-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Richard D. Parsons → AOL Time Warner: Executive/director/counselor office or a team coached to a championship does not establish the specific manager title.

Cited evidence lines: [1319](../raw_map.tsv:1319), [1322](../raw_map.tsv:1322), [1325](../raw_map.tsv:1325).


Issue tags: mixed_evidence

### rel_10__ent_273__ent_409

**All observed names:** Brian Cashman → Yankees (2); Joe Torre → Yankees (1)

Ordered IDs: Ent[ent_273] → Ent[ent_409]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3165](../raw_map.tsv:3165) | Brian Cashman | Yankees | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3170](../raw_map.tsv:3170) | Brian Cashman | Yankees | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;that-&gt;nsubj-&gt;\|nsubj |
| [3176](../raw_map.tsv:3176) | Joe Torre | Yankees | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Brian Cashman → Yankees; Joe Torre → Yankees: Manager support is present for two incompatible named people merged into one inferred person.

Cited evidence lines: [3165](../raw_map.tsv:3165), [3170](../raw_map.tsv:3170), [3176](../raw_map.tsv:3176).

**Review question:** Which manager should this inferred entity represent after separating the named people?
Issue tags: entity_collision, mixed_evidence

### rel_10__ent_1419__ent_85

**All observed names:** Craig Hammerman → Community Board (2); Paul Goldstein → Community Board (1)

Ordered IDs: Ent[ent_1419] → Ent[ent_85]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3389](../raw_map.tsv:3389) | Paul Goldstein | Community Board | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3392](../raw_map.tsv:3392) | Craig Hammerman | Community Board | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3395](../raw_map.tsv:3395) | Craig Hammerman | Community Board | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Craig Hammerman → Community Board; Paul Goldstein → Community Board: Manager support is present for two incompatible named people merged into one inferred person.

Cited evidence lines: [3389](../raw_map.tsv:3389), [3392](../raw_map.tsv:3392), [3395](../raw_map.tsv:3395).

**Review question:** Which manager should this inferred entity represent after separating the named people?
Issue tags: entity_collision, mixed_evidence

### rel_10__ent_110__ent_1298

**All observed names:** Devils → Stanley Cup (2)

Ordered IDs: Ent[ent_110] → Ent[ent_1298]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2234](../raw_map.tsv:2234) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| [8046](../raw_map.tsv:8046) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Devils → Stanley Cup: Executive/director/counselor office or a team coached to a championship does not establish the specific manager title.

Cited evidence lines: [2234](../raw_map.tsv:2234), [8046](../raw_map.tsv:8046).




### rel_10__ent_286__ent_468

**All observed names:** Bud Harrelson → Mets (2)

Ordered IDs: Ent[ent_286] → Ent[ent_468]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3342](../raw_map.tsv:3342) | Bud Harrelson | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3351](../raw_map.tsv:3351) | Bud Harrelson | Mets | rcmod\|-&gt;rcmod-&gt;replace-&gt;prep-&gt;as-&gt;pobj-&gt;manager-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Bud Harrelson → Mets: An explicit manager title or historical replacement/succession as manager establishes the specified office.

Cited evidence lines: [3342](../raw_map.tsv:3342), [3351](../raw_map.tsv:3351).


Issue tags: mixed_evidence

### rel_10__ent_75__ent_169

**All observed names:** Douglas Sosnik → White House (2)

Ordered IDs: Ent[ent_75] → Ent[ent_169]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8508](../raw_map.tsv:8508) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;counselor-&gt;nn-&gt;\|nn |
| [8512](../raw_map.tsv:8512) | Douglas Sosnik | White House | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Douglas Sosnik → White House: Executive/director/counselor office or a team coached to a championship does not establish the specific manager title.

Cited evidence lines: [8508](../raw_map.tsv:8508), [8512](../raw_map.tsv:8512).


Issue tags: mixed_evidence

### rel_10__ent_1363__ent_851

**All observed names:** Devils → Stanley Cup (1)

Ordered IDs: Ent[ent_1363] → Ent[ent_851]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7733](../raw_map.tsv:7733) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Devils → Stanley Cup: Executive/director/counselor office or a team coached to a championship does not establish the specific manager title.

Cited evidence lines: [7733](../raw_map.tsv:7733).



