# audit_06dbdb9b03af — rel_67: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 6 supported, 1 incorrect, 0 ambiguous; N=7. Precision 6/7=85.71% to 6/7=85.71%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 4 | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 3 | appos\|-&gt;appos-&gt;scorer-&gt;poss-&gt;\|poss |
| 3 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 2 | rcmod\|-&gt;rcmod-&gt;play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;star-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-commit-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-earn-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-hero-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-quit-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-hold-&gt;dobj-&gt;teammate-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;give-&gt;iobj-&gt;\|iobj |

## Every evaluated fact

### rel_67__ent_413__ent_110

**All observed names:** Holik → Devils (7)

Ordered IDs: Ent[ent_413] → Ent[ent_110]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4298](../raw_map.tsv:4298) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4300](../raw_map.tsv:4300) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4301](../raw_map.tsv:4301) | Holik | Devils | rcmod\|-&gt;rcmod-&gt;play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [4303](../raw_map.tsv:4303) | Holik | Devils | appos\|-&gt;appos-&gt;scorer-&gt;poss-&gt;\|poss |
| [4304](../raw_map.tsv:4304) | Holik | Devils | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4305](../raw_map.tsv:4305) | Holik | Devils | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4306](../raw_map.tsv:4306) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Holik → Devils: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [4298](../raw_map.tsv:4298), [4300](../raw_map.tsv:4300), [4301](../raw_map.tsv:4301), [4303](../raw_map.tsv:4303), [4304](../raw_map.tsv:4304), [4305](../raw_map.tsv:4305), [4306](../raw_map.tsv:4306).


Issue tags: mixed_evidence

### rel_67__ent_260__ent_1005

**All observed names:** Jordan → Bulls (6)

Ordered IDs: Ent[ent_260] → Ent[ent_1005]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3115](../raw_map.tsv:3115) | Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3116](../raw_map.tsv:3116) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3120](../raw_map.tsv:3120) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-quit-&gt;dobj-&gt;\|dobj |
| [3121](../raw_map.tsv:3121) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3122](../raw_map.tsv:3122) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [3123](../raw_map.tsv:3123) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jordan → Bulls: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [3115](../raw_map.tsv:3115), [3116](../raw_map.tsv:3116), [3120](../raw_map.tsv:3120), [3121](../raw_map.tsv:3121), [3122](../raw_map.tsv:3122), [3123](../raw_map.tsv:3123).


Issue tags: mixed_evidence

### rel_67__ent_62__ent_1005

**All observed names:** Michael Jordan → Bulls (5)

Ordered IDs: Ent[ent_62] → Ent[ent_1005]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3145](../raw_map.tsv:3145) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3146](../raw_map.tsv:3146) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3147](../raw_map.tsv:3147) | Michael Jordan | Bulls | appos\|-&gt;appos-&gt;star-&gt;poss-&gt;\|poss |
| [3149](../raw_map.tsv:3149) | Michael Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3150](../raw_map.tsv:3150) | Michael Jordan | Bulls | nsubjpass\|&lt;-nsubjpass&lt;-hold-&gt;dobj-&gt;teammate-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Michael Jordan → Bulls: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [3145](../raw_map.tsv:3145), [3146](../raw_map.tsv:3146), [3147](../raw_map.tsv:3147), [3149](../raw_map.tsv:3149), [3150](../raw_map.tsv:3150).




### rel_67__ent_1116__ent_110

**All observed names:** MacLean → Devils (5)

Ordered IDs: Ent[ent_1116] → Ent[ent_110]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4248](../raw_map.tsv:4248) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4251](../raw_map.tsv:4251) | MacLean | Devils | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4252](../raw_map.tsv:4252) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4256](../raw_map.tsv:4256) | MacLean | Devils | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4257](../raw_map.tsv:4257) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-hero-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). MacLean → Devils: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [4248](../raw_map.tsv:4248), [4251](../raw_map.tsv:4251), [4252](../raw_map.tsv:4252), [4256](../raw_map.tsv:4256), [4257](../raw_map.tsv:4257).


Issue tags: mixed_evidence

### rel_67__ent_1119__ent_110

**All observed names:** Bobby Holik → Devils (5)

Ordered IDs: Ent[ent_1119] → Ent[ent_110]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4278](../raw_map.tsv:4278) | Bobby Holik | Devils | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4280](../raw_map.tsv:4280) | Bobby Holik | Devils | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;goal-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4281](../raw_map.tsv:4281) | Bobby Holik | Devils | appos\|-&gt;appos-&gt;scorer-&gt;poss-&gt;\|poss |
| [4282](../raw_map.tsv:4282) | Bobby Holik | Devils | rcmod\|-&gt;rcmod-&gt;play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [4287](../raw_map.tsv:4287) | Bobby Holik | Devils | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bobby Holik → Devils: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [4278](../raw_map.tsv:4278), [4280](../raw_map.tsv:4280), [4281](../raw_map.tsv:4281), [4282](../raw_map.tsv:4282), [4287](../raw_map.tsv:4287).


Issue tags: mixed_evidence

### rel_67__ent_1137__ent_1135

**All observed names:** Lee A. Iacocca → Chrysler (5)

Ordered IDs: Ent[ent_1137] → Ent[ent_1135]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5139](../raw_map.tsv:5139) | Lee A. Iacocca | Chrysler | nsubj\|&lt;-nsubj&lt;-earn-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5140](../raw_map.tsv:5140) | Lee A. Iacocca | Chrysler | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [5141](../raw_map.tsv:5141) | Lee A. Iacocca | Chrysler | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;poss-&gt;\|poss |
| [5142](../raw_map.tsv:5142) | Lee A. Iacocca | Chrysler | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [5143](../raw_map.tsv:5143) | Lee A. Iacocca | Chrysler | nsubj\|&lt;-nsubj&lt;-commit-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Lee A. Iacocca → Chrysler: Chair/executive leadership of a company is not athletic service for a sports team.

Cited evidence lines: [5139](../raw_map.tsv:5139), [5140](../raw_map.tsv:5140), [5141](../raw_map.tsv:5141), [5142](../raw_map.tsv:5142), [5143](../raw_map.tsv:5143).




### rel_67__ent_63__ent_543

**All observed names:** Richard Jefferson → Nets (3)

Ordered IDs: Ent[ent_63] → Ent[ent_543]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3095](../raw_map.tsv:3095) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3098](../raw_map.tsv:3098) | Richard Jefferson | Nets | appos\|-&gt;appos-&gt;scorer-&gt;poss-&gt;\|poss |
| [3103](../raw_map.tsv:3103) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;give-&gt;iobj-&gt;\|iobj |

**Judgment: supported** (primary). Richard Jefferson → Nets: Scorer, scoring/points-for, or playing-with evidence establishes the athlete-to-team relationship.

Cited evidence lines: [3095](../raw_map.tsv:3095), [3098](../raw_map.tsv:3098), [3103](../raw_map.tsv:3103).


Issue tags: mixed_evidence
