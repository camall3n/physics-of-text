# audit_9c88162c7b22 — rel_32: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 4 supported, 3 incorrect, 0 ambiguous; N=7. Precision 4/7=57.14% to 4/7=57.14%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 8 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 4 | appos\|-&gt;appos-&gt;center-&gt;nn-&gt;\|nn |
| 3 | appos\|-&gt;appos-&gt;center-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| 1 | dep\|&lt;-dep&lt;-respectively-&gt;dep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-case-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;subcommittee-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;pace-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;sign-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_32__ent_64__ent_308

**All observed names:** Patrick Ewing → Knicks (6)

Ordered IDs: Ent[ent_64] → Ent[ent_308]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3064](../raw_map.tsv:3064) | Patrick Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3065](../raw_map.tsv:3065) | Patrick Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;poss-&gt;\|poss |
| [3066](../raw_map.tsv:3066) | Patrick Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3067](../raw_map.tsv:3067) | Patrick Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;nn-&gt;\|nn |
| [3069](../raw_map.tsv:3069) | Patrick Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3073](../raw_map.tsv:3073) | Patrick Ewing | Knicks | poss\|&lt;-poss&lt;-case-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Patrick Ewing → Knicks: Center position or explicit rebounding/triple-double/scoring context establishes the person as an athlete for the team.

Cited evidence lines: [3064](../raw_map.tsv:3064), [3065](../raw_map.tsv:3065), [3066](../raw_map.tsv:3066), [3067](../raw_map.tsv:3067), [3069](../raw_map.tsv:3069), [3073](../raw_map.tsv:3073).


Issue tags: mixed_evidence

### rel_32__ent_356__ent_308

**All observed names:** Ewing → Knicks (6)

Ordered IDs: Ent[ent_356] → Ent[ent_308]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3075](../raw_map.tsv:3075) | Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;poss-&gt;\|poss |
| [3076](../raw_map.tsv:3076) | Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3079](../raw_map.tsv:3079) | Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;nn-&gt;\|nn |
| [4219](../raw_map.tsv:4219) | Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;poss-&gt;\|poss |
| [4220](../raw_map.tsv:4220) | Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4223](../raw_map.tsv:4223) | Ewing | Knicks | appos\|-&gt;appos-&gt;center-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Ewing → Knicks: Center position or explicit rebounding/triple-double/scoring context establishes the person as an athlete for the team.

Cited evidence lines: [3075](../raw_map.tsv:3075), [3076](../raw_map.tsv:3076), [3079](../raw_map.tsv:3079), [4219](../raw_map.tsv:4219), [4220](../raw_map.tsv:4220), [4223](../raw_map.tsv:4223).




### rel_32__ent_63__ent_543

**All observed names:** Richard Jefferson → Nets (6)

Ordered IDs: Ent[ent_63] → Ent[ent_543]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3094](../raw_map.tsv:3094) | Richard Jefferson | Nets | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3095](../raw_map.tsv:3095) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3099](../raw_map.tsv:3099) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;sign-&gt;nsubj-&gt;\|nsubj |
| [3100](../raw_map.tsv:3100) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |
| [3101](../raw_map.tsv:3101) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;pace-&gt;dobj-&gt;\|dobj |
| [3102](../raw_map.tsv:3102) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Richard Jefferson → Nets: Center position or explicit rebounding/triple-double/scoring context establishes the person as an athlete for the team.

Cited evidence lines: [3094](../raw_map.tsv:3094), [3095](../raw_map.tsv:3095), [3099](../raw_map.tsv:3099), [3100](../raw_map.tsv:3100), [3101](../raw_map.tsv:3101), [3102](../raw_map.tsv:3102).


Issue tags: mixed_evidence

### rel_32__ent_263__ent_1171

**All observed names:** Republican → House Ways and Means Committee (4)

Ordered IDs: Ent[ent_263] → Ent[ent_1171]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6324](../raw_map.tsv:6324) | Republican | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [6325](../raw_map.tsv:6325) | Republican | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6326](../raw_map.tsv:6326) | Republican | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;subcommittee-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6328](../raw_map.tsv:6328) | Republican | House Ways and Means Committee | nn\|&lt;-nn&lt;-member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Republican → House Ways and Means Committee: The rows concern political committee leadership or a religious minister, not an athletic role.

Cited evidence lines: [6324](../raw_map.tsv:6324), [6325](../raw_map.tsv:6325), [6326](../raw_map.tsv:6326), [6328](../raw_map.tsv:6328).


Issue tags: wrong_domain

### rel_32__ent_247__ent_489

**All observed names:** Louis Farrakhan → Nation of Islam (3)

Ordered IDs: Ent[ent_247] → Ent[ent_489]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2945](../raw_map.tsv:2945) | Louis Farrakhan | Nation of Islam | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4967](../raw_map.tsv:4967) | Louis Farrakhan | Nation of Islam | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4971](../raw_map.tsv:4971) | Louis Farrakhan | Nation of Islam | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Louis Farrakhan → Nation of Islam: The rows concern political committee leadership or a religious minister, not an athletic role.

Cited evidence lines: [2945](../raw_map.tsv:2945), [4967](../raw_map.tsv:4967), [4971](../raw_map.tsv:4971).


Issue tags: wrong_domain

### rel_32__ent_1119__ent_110

**All observed names:** Bobby Holik → Devils (3)

Ordered IDs: Ent[ent_1119] → Ent[ent_110]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4283](../raw_map.tsv:4283) | Bobby Holik | Devils | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4284](../raw_map.tsv:4284) | Bobby Holik | Devils | appos\|-&gt;appos-&gt;center-&gt;nn-&gt;\|nn |
| [4287](../raw_map.tsv:4287) | Bobby Holik | Devils | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bobby Holik → Devils: Center position or explicit rebounding/triple-double/scoring context establishes the person as an athlete for the team.

Cited evidence lines: [4283](../raw_map.tsv:4283), [4284](../raw_map.tsv:4284), [4287](../raw_map.tsv:4287).


Issue tags: mixed_evidence

### rel_32__ent_263__ent_1172

**All observed names:** Republican → Senate Finance Committee (2)

Ordered IDs: Ent[ent_263] → Ent[ent_1172]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6349](../raw_map.tsv:6349) | Republican | Senate Finance Committee | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [6352](../raw_map.tsv:6352) | Republican | Senate Finance Committee | dep\|&lt;-dep&lt;-respectively-&gt;dep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Republican → Senate Finance Committee: The rows concern political committee leadership or a religious minister, not an athletic role.

Cited evidence lines: [6349](../raw_map.tsv:6349), [6352](../raw_map.tsv:6352).


Issue tags: wrong_domain
