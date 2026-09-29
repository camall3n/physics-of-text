# audit_dcb746fa83d6 — rel_53: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 6 supported, 1 incorrect, 0 ambiguous; N=7. Precision 6/7=85.71% to 6/7=85.71%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| 3 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |
| 2 | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 1 | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 1 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;goal-&gt;prep-&gt;through-&gt;pobj-&gt;game-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-set-&gt;dobj-&gt;goal-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;place-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-return-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;visit-&gt;dobj-&gt;camp-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_53__ent_1117__ent_347

**All observed names:** Kovalev → Rangers (6)

Ordered IDs: Ent[ent_1117] → Ent[ent_347]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4259](../raw_map.tsv:4259) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4260](../raw_map.tsv:4260) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4262](../raw_map.tsv:4262) | Kovalev | Rangers | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |
| [4263](../raw_map.tsv:4263) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-set-&gt;dobj-&gt;goal-&gt;poss-&gt;\|poss |
| [4265](../raw_map.tsv:4265) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;goal-&gt;prep-&gt;through-&gt;pobj-&gt;game-&gt;poss-&gt;\|poss |
| [4266](../raw_map.tsv:4266) | Kovalev | Rangers | rcmod\|-&gt;rcmod-&gt;visit-&gt;dobj-&gt;camp-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Kovalev → Rangers: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [4259](../raw_map.tsv:4259), [4260](../raw_map.tsv:4260), [4262](../raw_map.tsv:4262), [4263](../raw_map.tsv:4263), [4265](../raw_map.tsv:4265), [4266](../raw_map.tsv:4266).


Issue tags: mixed_evidence

### rel_53__ent_61__ent_259

**All observed names:** Reggie Miller → Indiana (5)

Ordered IDs: Ent[ent_61] → Ent[ent_259]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3154](../raw_map.tsv:3154) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3155](../raw_map.tsv:3155) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3157](../raw_map.tsv:3157) | Reggie Miller | Indiana | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| [3160](../raw_map.tsv:3160) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3162](../raw_map.tsv:3162) | Reggie Miller | Indiana | poss\|&lt;-poss&lt;-return-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Reggie Miller → Indiana: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [3154](../raw_map.tsv:3154), [3155](../raw_map.tsv:3155), [3157](../raw_map.tsv:3157), [3160](../raw_map.tsv:3160), [3162](../raw_map.tsv:3162).


Issue tags: mixed_evidence

### rel_53__ent_66__ent_543

**All observed names:** Kidd → Nets (4)

Ordered IDs: Ent[ent_66] → Ent[ent_543]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3104](../raw_map.tsv:3104) | Kidd | Nets | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| [3105](../raw_map.tsv:3105) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3106](../raw_map.tsv:3106) | Kidd | Nets | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| [3109](../raw_map.tsv:3109) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |

**Judgment: supported** (primary). Kidd → Nets: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [3104](../raw_map.tsv:3104), [3105](../raw_map.tsv:3105), [3106](../raw_map.tsv:3106), [3109](../raw_map.tsv:3109).


Issue tags: mixed_evidence

### rel_53__ent_1271__ent_1359

**All observed names:** Michael Jordan → Bulls (2)

Ordered IDs: Ent[ent_1271] → Ent[ent_1359]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3144](../raw_map.tsv:3144) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3151](../raw_map.tsv:3151) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Michael Jordan → Bulls: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [3144](../raw_map.tsv:3144), [3151](../raw_map.tsv:3151).




### rel_53__ent_1116__ent_185

**All observed names:** MacLean → Devils (2)

Ordered IDs: Ent[ent_1116] → Ent[ent_185]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4255](../raw_map.tsv:4255) | MacLean | Devils | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |
| [4256](../raw_map.tsv:4256) | MacLean | Devils | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |

**Judgment: supported** (primary). MacLean → Devils: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [4255](../raw_map.tsv:4255), [4256](../raw_map.tsv:4256).




### rel_53__ent_413__ent_110

**All observed names:** Holik → Devils (2)

Ordered IDs: Ent[ent_413] → Ent[ent_110]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4302](../raw_map.tsv:4302) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4305](../raw_map.tsv:4305) | Holik | Devils | poss\|&lt;-poss&lt;-goal&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |

**Judgment: supported** (primary). Holik → Devils: Player position, captain or scoring/goal contribution identifies athletic participation for the team.

Cited evidence lines: [4302](../raw_map.tsv:4302), [4305](../raw_map.tsv:4305).




### rel_53__ent_377__ent_938

**All observed names:** Frank R. Lautenberg → Robert G. Torricelli (1)

Ordered IDs: Ent[ent_377] → Ent[ent_938]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5866](../raw_map.tsv:5866) | Frank R. Lautenberg | Robert G. Torricelli | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;place-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Frank R. Lautenberg → Robert G. Torricelli: Taking another person’s place does not establish athletic team membership.

Cited evidence lines: [5866](../raw_map.tsv:5866).



