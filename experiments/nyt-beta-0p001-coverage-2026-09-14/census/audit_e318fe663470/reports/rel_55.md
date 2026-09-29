# audit_e318fe663470 — rel_55: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 4 supported, 8 incorrect, 4 ambiguous; N=16. Precision 4/16=25.00% to 8/16=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 15 | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| 4 | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| 4 | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 3 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;guard-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;after-&gt;pobj-&gt;challenge-&gt;dep-&gt;down-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;in-&gt;pobj-&gt;period-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-score&lt;-dep&lt;-ap&lt;-nsubj&lt;-hit-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-stand-&gt;prep-&gt;in-&gt;pobj-&gt;driveway-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-hold-&gt;dobj-&gt;teammate-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-credit&lt;-pobj&lt;-to&lt;-prep&lt;-make-&gt;nsubj-&gt;president-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-case-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;open-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;pace-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;after-&gt;pobj-&gt;season-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_55__ent_65__ent_60

**All observed names:** Dominique Wilkins → Hawks (8)

Ordered IDs: Ent[ent_65] → Ent[ent_60]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3124](../raw_map.tsv:3124) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3125](../raw_map.tsv:3125) | Dominique Wilkins | Hawks | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3126](../raw_map.tsv:3126) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3127](../raw_map.tsv:3127) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [3130](../raw_map.tsv:3130) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;in-&gt;pobj-&gt;period-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3131](../raw_map.tsv:3131) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;after-&gt;pobj-&gt;challenge-&gt;dep-&gt;down-&gt;nsubj-&gt;\|nsubj |
| [3132](../raw_map.tsv:3132) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;poss-&gt;\|poss |
| [3133](../raw_map.tsv:3133) | Dominique Wilkins | Hawks | nsubj\|&lt;-nsubj&lt;-score&lt;-dep&lt;-ap&lt;-nsubj&lt;-hit-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dominique Wilkins → Hawks: A local player/guard or score/points-for row establishes athlete representation of the team.

Cited evidence lines: [3124](../raw_map.tsv:3124), [3125](../raw_map.tsv:3125), [3126](../raw_map.tsv:3126), [3127](../raw_map.tsv:3127), [3130](../raw_map.tsv:3130), [3131](../raw_map.tsv:3131), [3132](../raw_map.tsv:3132), [3133](../raw_map.tsv:3133).


Issue tags: mixed_evidence

### rel_55__ent_1211__ent_1005

**All observed names:** Michael Jordan → Bulls (8)

Ordered IDs: Ent[ent_1211] → Ent[ent_1005]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3144](../raw_map.tsv:3144) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3146](../raw_map.tsv:3146) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3148](../raw_map.tsv:3148) | Michael Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3149](../raw_map.tsv:3149) | Michael Jordan | Bulls | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3150](../raw_map.tsv:3150) | Michael Jordan | Bulls | nsubjpass\|&lt;-nsubjpass&lt;-hold-&gt;dobj-&gt;teammate-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |
| [3151](../raw_map.tsv:3151) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3152](../raw_map.tsv:3152) | Michael Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3153](../raw_map.tsv:3153) | Michael Jordan | Bulls | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Michael Jordan → Bulls: A local player/guard or score/points-for row establishes athlete representation of the team.

Cited evidence lines: [3144](../raw_map.tsv:3144), [3146](../raw_map.tsv:3146), [3148](../raw_map.tsv:3148), [3149](../raw_map.tsv:3149), [3150](../raw_map.tsv:3150), [3151](../raw_map.tsv:3151), [3152](../raw_map.tsv:3152), [3153](../raw_map.tsv:3153).


Issue tags: mixed_evidence

### rel_55__ent_61__ent_259

**All observed names:** Reggie Miller → Indiana (6)

Ordered IDs: Ent[ent_61] → Ent[ent_259]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3154](../raw_map.tsv:3154) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3155](../raw_map.tsv:3155) | Reggie Miller | Indiana | nsubj\|&lt;-nsubj&lt;-score-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3156](../raw_map.tsv:3156) | Reggie Miller | Indiana | appos\|-&gt;appos-&gt;guard-&gt;nn-&gt;\|nn |
| [3158](../raw_map.tsv:3158) | Reggie Miller | Indiana | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |
| [3160](../raw_map.tsv:3160) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3161](../raw_map.tsv:3161) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;after-&gt;pobj-&gt;season-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Reggie Miller → Indiana: A local player/guard or score/points-for row establishes athlete representation of the team.

Cited evidence lines: [3154](../raw_map.tsv:3154), [3155](../raw_map.tsv:3155), [3156](../raw_map.tsv:3156), [3158](../raw_map.tsv:3158), [3160](../raw_map.tsv:3160), [3161](../raw_map.tsv:3161).


Issue tags: mixed_evidence

### rel_55__ent_1210__ent_308

**All observed names:** Patrick Ewing → Knicks (4)

Ordered IDs: Ent[ent_1210] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3064](../raw_map.tsv:3064) | Patrick Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3069](../raw_map.tsv:3069) | Patrick Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3071](../raw_map.tsv:3071) | Patrick Ewing | Knicks | rcmod\|-&gt;rcmod-&gt;open-&gt;nsubj-&gt;\|nsubj |
| [3073](../raw_map.tsv:3073) | Patrick Ewing | Knicks | poss\|&lt;-poss&lt;-case-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Patrick Ewing → Knicks: Leading or having/putting something for a team does not recover an athlete role without local player/scoring evidence.

Cited evidence lines: [3064](../raw_map.tsv:3064), [3069](../raw_map.tsv:3069), [3071](../raw_map.tsv:3071), [3073](../raw_map.tsv:3073).

**Review question:** Does the omitted context establish athletic participation rather than coaching or another role?
Issue tags: predicate_scope

### rel_55__ent_1399__ent_308

**All observed names:** Ewing → Knicks (4)

Ordered IDs: Ent[ent_1399] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3074](../raw_map.tsv:3074) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3080](../raw_map.tsv:3080) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [4218](../raw_map.tsv:4218) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [4224](../raw_map.tsv:4224) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Ewing → Knicks: Leading or having/putting something for a team does not recover an athlete role without local player/scoring evidence.

Cited evidence lines: [3074](../raw_map.tsv:3074), [3080](../raw_map.tsv:3080), [4218](../raw_map.tsv:4218), [4224](../raw_map.tsv:4224).

**Review question:** Does the omitted context establish athletic participation rather than coaching or another role?
Issue tags: predicate_scope

### rel_55__ent_309__ent_1004

**All observed names:** Red Sox → Yankees (3)

Ordered IDs: Ent[ent_309] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [864](../raw_map.tsv:864) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [2665](../raw_map.tsv:2665) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6930](../raw_map.tsv:6930) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [864](../raw_map.tsv:864), [2665](../raw_map.tsv:2665), [6930](../raw_map.tsv:6930).




### rel_55__ent_1004__ent_74

**All observed names:** Yankees → Red Sox (3)

Ordered IDs: Ent[ent_1004] → Ent[ent_74]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2584](../raw_map.tsv:2584) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3137](../raw_map.tsv:3137) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [6900](../raw_map.tsv:6900) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Yankees → Red Sox: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [2584](../raw_map.tsv:2584), [3137](../raw_map.tsv:3137), [6900](../raw_map.tsv:6900).




### rel_55__ent_1325__ent_543

**All observed names:** Richard Jefferson → Nets (3)

Ordered IDs: Ent[ent_1325] → Ent[ent_543]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3094](../raw_map.tsv:3094) | Richard Jefferson | Nets | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3101](../raw_map.tsv:3101) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;pace-&gt;dobj-&gt;\|dobj |
| [3102](../raw_map.tsv:3102) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Richard Jefferson → Nets: Leading or having/putting something for a team does not recover an athlete role without local player/scoring evidence.

Cited evidence lines: [3094](../raw_map.tsv:3094), [3101](../raw_map.tsv:3101), [3102](../raw_map.tsv:3102).

**Review question:** Does the omitted context establish athletic participation rather than coaching or another role?
Issue tags: predicate_scope

### rel_55__ent_1196__ent_1380

**All observed names:** Jordan → Bulls (3)

Ordered IDs: Ent[ent_1196] → Ent[ent_1380]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3114](../raw_map.tsv:3114) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3116](../raw_map.tsv:3116) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-have-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3117](../raw_map.tsv:3117) | Jordan | Bulls | nsubj\|&lt;-nsubj&lt;-score-&gt;dobj-&gt;point-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jordan → Bulls: A local player/guard or score/points-for row establishes athlete representation of the team.

Cited evidence lines: [3114](../raw_map.tsv:3114), [3116](../raw_map.tsv:3116), [3117](../raw_map.tsv:3117).




### rel_55__ent_74__ent_60

**All observed names:** Red Sox → Yankees (2)

Ordered IDs: Ent[ent_74] → Ent[ent_60]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2664](../raw_map.tsv:2664) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [6931](../raw_map.tsv:6931) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [2664](../raw_map.tsv:2664), [6931](../raw_map.tsv:6931).




### rel_55__ent_66__ent_1080

**All observed names:** Kidd → Nets (2)

Ordered IDs: Ent[ent_66] → Ent[ent_1080]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3105](../raw_map.tsv:3105) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-lead-&gt;dobj-&gt;\|dobj |
| [3107](../raw_map.tsv:3107) | Kidd | Nets | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Kidd → Nets: Leading or having/putting something for a team does not recover an athlete role without local player/scoring evidence.

Cited evidence lines: [3105](../raw_map.tsv:3105), [3107](../raw_map.tsv:3107).

**Review question:** Does the omitted context establish athletic participation rather than coaching or another role?
Issue tags: predicate_scope

### rel_55__ent_74__ent_12

**All observed names:** Red Sox → Yankees (1)

Ordered IDs: Ent[ent_74] → Ent[ent_12]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [865](../raw_map.tsv:865) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [865](../raw_map.tsv:865).




### rel_55__ent_338__ent_965

**All observed names:** Joe Lockhart → White House (1)

Ordered IDs: Ent[ent_338] → Ent[ent_965]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1414](../raw_map.tsv:1414) | Joe Lockhart | White House | nsubj\|&lt;-nsubj&lt;-stand-&gt;prep-&gt;in-&gt;pobj-&gt;driveway-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Joe Lockhart → White House: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [1414](../raw_map.tsv:1414).




### rel_55__ent_590__ent_980

**All observed names:** Rod Thorn → Nets (1)

Ordered IDs: Ent[ent_590] → Ent[ent_980]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1623](../raw_map.tsv:1623) | Rod Thorn | Nets | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-credit&lt;-pobj&lt;-to&lt;-prep&lt;-make-&gt;nsubj-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Rod Thorn → Nets: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [1623](../raw_map.tsv:1623).




### rel_55__ent_413__ent_1364

**All observed names:** Holik → Devils (1)

Ordered IDs: Ent[ent_413] → Ent[ent_1364]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4307](../raw_map.tsv:4307) | Holik | Devils | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Holik → Devils: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [4307](../raw_map.tsv:4307).




### rel_55__ent_587__ent_99

**All observed names:** United States → Iran (1)

Ordered IDs: Ent[ent_587] → Ent[ent_99]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7885](../raw_map.tsv:7885) | United States | Iran | nsubj\|&lt;-nsubj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). United States → Iran: The complete rows show team-to-team leading/selling, a different office, a location, or generic put/sell without an athlete representation assertion.

Cited evidence lines: [7885](../raw_map.tsv:7885).



