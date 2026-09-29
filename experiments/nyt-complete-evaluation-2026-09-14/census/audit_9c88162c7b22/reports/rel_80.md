# audit_9c88162c7b22 — rel_80: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 7 supported, 6 incorrect, 2 ambiguous; N=15. Precision 7/15=46.67% to 9/15=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 18 | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| 8 | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| 8 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 6 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 4 | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 2 | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |
| 2 | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;pick-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-clinch-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-clinch-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-quit-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;in-&gt;pobj-&gt;period-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-dep&lt;-along&lt;-prep&lt;-give-&gt;iobj-&gt;\|iobj |

## Every evaluated fact

### rel_80__ent_260__ent_1005

**All observed names:** Jordan → Bulls (9)

Ordered IDs: Ent[ent_260] → Ent[ent_1005]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3114](../raw_map.tsv:3114) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3115](../raw_map.tsv:3115) | Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3116](../raw_map.tsv:3116) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3118](../raw_map.tsv:3118) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [3119](../raw_map.tsv:3119) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3120](../raw_map.tsv:3120) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-quit-&gt;dobj-&gt;\|dobj |
| [3121](../raw_map.tsv:3121) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3122](../raw_map.tsv:3122) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [3123](../raw_map.tsv:3123) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jordan → Bulls: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [3114](../raw_map.tsv:3114), [3115](../raw_map.tsv:3115), [3116](../raw_map.tsv:3116), [3118](../raw_map.tsv:3118), [3119](../raw_map.tsv:3119), [3120](../raw_map.tsv:3120), [3121](../raw_map.tsv:3121), [3122](../raw_map.tsv:3122), [3123](../raw_map.tsv:3123).


Issue tags: mixed_evidence

### rel_80__ent_66__ent_543

**All observed names:** Kidd → Nets (7)

Ordered IDs: Ent[ent_66] → Ent[ent_543]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3104](../raw_map.tsv:3104) | Kidd | Nets | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| [3105](../raw_map.tsv:3105) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3106](../raw_map.tsv:3106) | Kidd | Nets | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| [3107](../raw_map.tsv:3107) | Kidd | Nets | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3108](../raw_map.tsv:3108) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3109](../raw_map.tsv:3109) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [3110](../raw_map.tsv:3110) | Kidd | Nets | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Kidd → Nets: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [3104](../raw_map.tsv:3104), [3105](../raw_map.tsv:3105), [3106](../raw_map.tsv:3106), [3107](../raw_map.tsv:3107), [3108](../raw_map.tsv:3108), [3109](../raw_map.tsv:3109), [3110](../raw_map.tsv:3110).


Issue tags: mixed_evidence

### rel_80__ent_65__ent_60

**All observed names:** Dominique Wilkins → Hawks (7)

Ordered IDs: Ent[ent_65] → Ent[ent_60]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3124](../raw_map.tsv:3124) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3125](../raw_map.tsv:3125) | Dominique Wilkins | Hawks | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3126](../raw_map.tsv:3126) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3127](../raw_map.tsv:3127) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [3129](../raw_map.tsv:3129) | Dominique Wilkins | Hawks | pobj\|&lt;-pobj&lt;-with&lt;-dep&lt;-along&lt;-prep&lt;-give-&gt;iobj-&gt;\|iobj |
| [3130](../raw_map.tsv:3130) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;in-&gt;pobj-&gt;period-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3132](../raw_map.tsv:3132) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Dominique Wilkins → Hawks: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [3124](../raw_map.tsv:3124), [3125](../raw_map.tsv:3125), [3126](../raw_map.tsv:3126), [3127](../raw_map.tsv:3127), [3129](../raw_map.tsv:3129), [3130](../raw_map.tsv:3130), [3132](../raw_map.tsv:3132).


Issue tags: mixed_evidence

### rel_80__ent_1117__ent_347

**All observed names:** Kovalev → Rangers (6)

Ordered IDs: Ent[ent_1117] → Ent[ent_347]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4258](../raw_map.tsv:4258) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4259](../raw_map.tsv:4259) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4260](../raw_map.tsv:4260) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4261](../raw_map.tsv:4261) | Kovalev | Rangers | appos\|-&gt;appos-&gt;pick-&gt;poss-&gt;\|poss |
| [4262](../raw_map.tsv:4262) | Kovalev | Rangers | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |
| [4264](../raw_map.tsv:4264) | Kovalev | Rangers | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Kovalev → Rangers: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [4258](../raw_map.tsv:4258), [4259](../raw_map.tsv:4259), [4260](../raw_map.tsv:4260), [4261](../raw_map.tsv:4261), [4262](../raw_map.tsv:4262), [4264](../raw_map.tsv:4264).


Issue tags: mixed_evidence

### rel_80__ent_356__ent_308

**All observed names:** Ewing → Knicks (5)

Ordered IDs: Ent[ent_356] → Ent[ent_308]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3074](../raw_map.tsv:3074) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3080](../raw_map.tsv:3080) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [4218](../raw_map.tsv:4218) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4221](../raw_map.tsv:4221) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4224](../raw_map.tsv:4224) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Ewing → Knicks: Leading/putting/giving without explicit player, scoring, or playing-for evidence leaves athlete versus coaching/management role unresolved in this fact.

Cited evidence lines: [3074](../raw_map.tsv:3074), [3080](../raw_map.tsv:3080), [4218](../raw_map.tsv:4218), [4221](../raw_map.tsv:4221), [4224](../raw_map.tsv:4224).

**Review question:** Does the original context establish that this person is playing for the team, rather than coaching or managing it?
Issue tags: predicate_boundary

### rel_80__ent_62__ent_1005

**All observed names:** Michael Jordan → Bulls (5)

Ordered IDs: Ent[ent_62] → Ent[ent_1005]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3144](../raw_map.tsv:3144) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3146](../raw_map.tsv:3146) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3149](../raw_map.tsv:3149) | Michael Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3151](../raw_map.tsv:3151) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3153](../raw_map.tsv:3153) | Michael Jordan | Bulls | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Michael Jordan → Bulls: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [3144](../raw_map.tsv:3144), [3146](../raw_map.tsv:3146), [3149](../raw_map.tsv:3149), [3151](../raw_map.tsv:3151), [3153](../raw_map.tsv:3153).


Issue tags: mixed_evidence

### rel_80__ent_1116__ent_110

**All observed names:** MacLean → Devils (5)

Ordered IDs: Ent[ent_1116] → Ent[ent_110]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4249](../raw_map.tsv:4249) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [4250](../raw_map.tsv:4250) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4251](../raw_map.tsv:4251) | MacLean | Devils | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4253](../raw_map.tsv:4253) | MacLean | Devils | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [4255](../raw_map.tsv:4255) | MacLean | Devils | appos\|-&gt;appos-&gt;wing-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). MacLean → Devils: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [4249](../raw_map.tsv:4249), [4250](../raw_map.tsv:4250), [4251](../raw_map.tsv:4251), [4253](../raw_map.tsv:4253), [4255](../raw_map.tsv:4255).


Issue tags: mixed_evidence

### rel_80__ent_1004__ent_309

**All observed names:** Yankees → Red Sox (4)

Ordered IDs: Ent[ent_1004] → Ent[ent_309]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [884](../raw_map.tsv:884) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [2584](../raw_map.tsv:2584) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3137](../raw_map.tsv:3137) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [6900](../raw_map.tsv:6900) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Yankees → Red Sox: The first argument is itself a team leading an opponent or division, not an athlete playing for a team.

Cited evidence lines: [884](../raw_map.tsv:884), [2584](../raw_map.tsv:2584), [3137](../raw_map.tsv:3137), [6900](../raw_map.tsv:6900).


Issue tags: direction, other_predicate

### rel_80__ent_61__ent_259

**All observed names:** Reggie Miller → Indiana (4)

Ordered IDs: Ent[ent_61] → Ent[ent_259]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3154](../raw_map.tsv:3154) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3155](../raw_map.tsv:3155) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3157](../raw_map.tsv:3157) | Reggie Miller | Indiana | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| [3158](../raw_map.tsv:3158) | Reggie Miller | Indiana | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Reggie Miller → Indiana: Explicit player/guard/wing/captain or scoring-for evidence identifies athletic participation for the named team.

Cited evidence lines: [3154](../raw_map.tsv:3154), [3155](../raw_map.tsv:3155), [3157](../raw_map.tsv:3157), [3158](../raw_map.tsv:3158).


Issue tags: mixed_evidence

### rel_80__ent_309__ent_1004

**All observed names:** Red Sox → Yankees (3)

Ordered IDs: Ent[ent_309] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [864](../raw_map.tsv:864) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [2664](../raw_map.tsv:2664) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [6930](../raw_map.tsv:6930) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: The first argument is itself a team leading an opponent or division, not an athlete playing for a team.

Cited evidence lines: [864](../raw_map.tsv:864), [2664](../raw_map.tsv:2664), [6930](../raw_map.tsv:6930).


Issue tags: direction, other_predicate

### rel_80__ent_1004__ent_9

**All observed names:** Yankees → American League East (3)

Ordered IDs: Ent[ent_1004] → Ent[ent_9]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2736](../raw_map.tsv:2736) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [2737](../raw_map.tsv:2737) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-clinch-&gt;dobj-&gt;\|dobj |
| [2738](../raw_map.tsv:2738) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-clinch-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Yankees → American League East: The first argument is itself a team leading an opponent or division, not an athlete playing for a team.

Cited evidence lines: [2736](../raw_map.tsv:2736), [2737](../raw_map.tsv:2737), [2738](../raw_map.tsv:2738).


Issue tags: direction, other_predicate

### rel_80__ent_413__ent_110

**All observed names:** Holik → Devils (3)

Ordered IDs: Ent[ent_413] → Ent[ent_110]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4302](../raw_map.tsv:4302) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4304](../raw_map.tsv:4304) | Holik | Devils | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [4307](../raw_map.tsv:4307) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Holik → Devils: Leading/putting/giving without explicit player, scoring, or playing-for evidence leaves athlete versus coaching/management role unresolved in this fact.

Cited evidence lines: [4302](../raw_map.tsv:4302), [4304](../raw_map.tsv:4304), [4307](../raw_map.tsv:4307).

**Review question:** Does the original context establish that this person is playing for the team, rather than coaching or managing it?
Issue tags: predicate_boundary

### rel_80__ent_1137__ent_1135

**All observed names:** Lee A. Iacocca → Chrysler (3)

Ordered IDs: Ent[ent_1137] → Ent[ent_1135]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5140](../raw_map.tsv:5140) | Lee A. Iacocca | Chrysler | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [5141](../raw_map.tsv:5141) | Lee A. Iacocca | Chrysler | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;executive-&gt;poss-&gt;\|poss |
| [5142](../raw_map.tsv:5142) | Lee A. Iacocca | Chrysler | nsubj\|&lt;-nsubj&lt;-do-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Lee A. Iacocca → Chrysler: Executive or coaching leadership does not establish athletic playing-for membership under the shared scope.

Cited evidence lines: [5140](../raw_map.tsv:5140), [5141](../raw_map.tsv:5141), [5142](../raw_map.tsv:5142).


Issue tags: predicate_boundary

### rel_80__ent_1175__ent_308

**All observed names:** Stu Jackson → Knicks (2)

Ordered IDs: Ent[ent_1175] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6479](../raw_map.tsv:6479) | Stu Jackson | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [6485](../raw_map.tsv:6485) | Stu Jackson | Knicks | nsubjpass\|&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Stu Jackson → Knicks: Executive or coaching leadership does not establish athletic playing-for membership under the shared scope.

Cited evidence lines: [6479](../raw_map.tsv:6479), [6485](../raw_map.tsv:6485).


Issue tags: predicate_boundary

### rel_80__ent_1095__ent_960

**All observed names:** Mike Krzyzewski → Duke (1)

Ordered IDs: Ent[ent_1095] → Ent[ent_960]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7257](../raw_map.tsv:7257) | Mike Krzyzewski | Duke | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Mike Krzyzewski → Duke: Executive or coaching leadership does not establish athletic playing-for membership under the shared scope.

Cited evidence lines: [7257](../raw_map.tsv:7257).


Issue tags: predicate_boundary
