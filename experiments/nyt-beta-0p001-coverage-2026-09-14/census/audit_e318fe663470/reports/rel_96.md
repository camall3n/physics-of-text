# audit_e318fe663470 — rel_96: athlete plays for team

Predicate ID: athlete_for

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

Complete census: 1 supported, 3 incorrect, 2 ambiguous; N=6. Precision 1/6=16.67% to 3/6=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 3 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |
| 2 | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-bench-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-player-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-show-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-start-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-play-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-tailor-&gt;prep-&gt;against-&gt;pobj-&gt;barber-&gt;poss-&gt;\|poss |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;mask-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;praise-&gt;dobj-&gt;defense-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;put-&gt;prep-&gt;with-&gt;pobj-&gt;unit-&gt;rcmod-&gt;include-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;suspend-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_96__ent_66__ent_543

**All observed names:** Kidd → Nets (8)

Ordered IDs: Ent[ent_66] → Ent[ent_543]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3104](../raw_map.tsv:3104) | Kidd | Nets | appos\|-&gt;appos-&gt;guard-&gt;poss-&gt;\|poss |
| [3106](../raw_map.tsv:3106) | Kidd | Nets | appos\|-&gt;appos-&gt;captain-&gt;poss-&gt;\|poss |
| [3108](../raw_map.tsv:3108) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3109](../raw_map.tsv:3109) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [3110](../raw_map.tsv:3110) | Kidd | Nets | appos\|-&gt;appos-&gt;player-&gt;poss-&gt;\|poss |
| [3111](../raw_map.tsv:3111) | Kidd | Nets | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-play-&gt;nsubj-&gt;\|nsubj |
| [3112](../raw_map.tsv:3112) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-player-&gt;nn-&gt;\|nn |
| [3113](../raw_map.tsv:3113) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Kidd → Nets: Explicit player/guard/captain and playing-with evidence establishes athletic representation of the Nets.

Cited evidence lines: [3104](../raw_map.tsv:3104), [3106](../raw_map.tsv:3106), [3108](../raw_map.tsv:3108), [3109](../raw_map.tsv:3109), [3110](../raw_map.tsv:3110), [3111](../raw_map.tsv:3111), [3112](../raw_map.tsv:3112), [3113](../raw_map.tsv:3113).


Issue tags: mixed_evidence

### rel_96__ent_1200__ent_1040

**All observed names:** Riley → Anthony (7)

Ordered IDs: Ent[ent_1200] → Ent[ent_1040]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1575](../raw_map.tsv:1575) | Riley | Anthony | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1576](../raw_map.tsv:1576) | Riley | Anthony | nsubj\|&lt;-nsubj&lt;-start-&gt;dobj-&gt;\|dobj |
| [1577](../raw_map.tsv:1577) | Riley | Anthony | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1580](../raw_map.tsv:1580) | Riley | Anthony | rcmod\|-&gt;rcmod-&gt;suspend-&gt;dobj-&gt;\|dobj |
| [1581](../raw_map.tsv:1581) | Riley | Anthony | rcmod\|-&gt;rcmod-&gt;put-&gt;prep-&gt;with-&gt;pobj-&gt;unit-&gt;rcmod-&gt;include-&gt;dobj-&gt;\|dobj |
| [1582](../raw_map.tsv:1582) | Riley | Anthony | rcmod\|-&gt;rcmod-&gt;praise-&gt;dobj-&gt;defense-&gt;poss-&gt;\|poss |
| [1584](../raw_map.tsv:1584) | Riley | Anthony | poss\|&lt;-poss&lt;-tailor-&gt;prep-&gt;against-&gt;pobj-&gt;barber-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Riley → Anthony: Coach-to-player interactions and person-to-person giving/speaking do not assert athlete-to-team representation.

Cited evidence lines: [1575](../raw_map.tsv:1575), [1576](../raw_map.tsv:1576), [1577](../raw_map.tsv:1577), [1580](../raw_map.tsv:1580), [1581](../raw_map.tsv:1581), [1582](../raw_map.tsv:1582), [1584](../raw_map.tsv:1584).




### rel_96__ent_111__ent_114

**All observed names:** Riley → Starks (5)

Ordered IDs: Ent[ent_111] → Ent[ent_114]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1545](../raw_map.tsv:1545) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1546](../raw_map.tsv:1546) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-bench-&gt;dobj-&gt;\|dobj |
| [1547](../raw_map.tsv:1547) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-show-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1551](../raw_map.tsv:1551) | Riley | Starks | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [1554](../raw_map.tsv:1554) | Riley | Starks | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;mask-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Riley → Starks: Coach-to-player interactions and person-to-person giving/speaking do not assert athlete-to-team representation.

Cited evidence lines: [1545](../raw_map.tsv:1545), [1546](../raw_map.tsv:1546), [1547](../raw_map.tsv:1547), [1551](../raw_map.tsv:1551), [1554](../raw_map.tsv:1554).




### rel_96__ent_182__ent_198

**All observed names:** Mr. Bush → Mr. Gorbachev (2)

Ordered IDs: Ent[ent_182] → Ent[ent_198]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [489](../raw_map.tsv:489) | Mr. Bush | Mr. Gorbachev | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [491](../raw_map.tsv:491) | Mr. Bush | Mr. Gorbachev | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Mr. Gorbachev: Coach-to-player interactions and person-to-person giving/speaking do not assert athlete-to-team representation.

Cited evidence lines: [489](../raw_map.tsv:489), [491](../raw_map.tsv:491).




### rel_96__ent_356__ent_308

**All observed names:** Ewing → Knicks (2)

Ordered IDs: Ent[ent_356] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3083](../raw_map.tsv:3083) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |
| [4221](../raw_map.tsv:4221) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |

**Judgment: ambiguous** (primary). Ewing → Knicks: Leader/give/take paths do not establish an athlete role rather than another team leadership or participation sense.

Cited evidence lines: [3083](../raw_map.tsv:3083), [4221](../raw_map.tsv:4221).

**Review question:** Do these rows identify Ewing as an athlete for the Knicks?
Issue tags: predicate_scope

### rel_96__ent_1399__ent_462

**All observed names:** Ewing → Knicks (2)

Ordered IDs: Ent[ent_1399] → Ent[ent_462]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4225](../raw_map.tsv:4225) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| [4227](../raw_map.tsv:4227) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Ewing → Knicks: Leader/give/take paths do not establish an athlete role rather than another team leadership or participation sense.

Cited evidence lines: [4225](../raw_map.tsv:4225), [4227](../raw_map.tsv:4227).

**Review question:** Do these rows identify Ewing as an athlete for the Knicks?
Issue tags: predicate_scope
