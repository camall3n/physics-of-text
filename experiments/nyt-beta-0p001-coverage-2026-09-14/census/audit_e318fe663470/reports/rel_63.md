# audit_e318fe663470 — rel_63: participated in sporting event

Predicate ID: participated_in_sporting_event

Competitor or team X participated in sporting event or competition Y.

Includes: actual played-in, competed-in, or appeared-in a sporting event; being in an event when competitive participation is clear; a completed win or title in the event, which entails participation. Excludes: plans, hopes, or qualification without established participation; attendance as spectator; membership in a league without participation in the designated event; non-sporting events or geographic presence alone. Ambiguous unless resolved by case-local evidence: future or proposed participation; event occurrence or participant role unclear; a governing body or location substituted for an unresolved event. Participation does not require winning. Preserve defeated and winner_of as separate predicates where those meanings were declared.

Complete census: 5 supported, 4 incorrect, 0 ambiguous; N=9. Precision 5/9=55.56% to 5/9=55.56%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 12 | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| 4 | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | dep\|-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-join-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-system-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-summon-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-club-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-romance&lt;-rcmod&lt;-spendthrift-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;guide-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;thank-&gt;prep-&gt;for-&gt;pobj-&gt;contribution-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_63__ent_321__ent_836

**All observed names:** Mets → World Series (5)

Ordered IDs: Ent[ent_321] → Ent[ent_836]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2211](../raw_map.tsv:2211) | Mets | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2213](../raw_map.tsv:2213) | Mets | World Series | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [2216](../raw_map.tsv:2216) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [3473](../raw_map.tsv:3473) | Mets | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3475](../raw_map.tsv:3475) | Mets | World Series | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mets → World Series: A local event-title, beaten-in-event or explicit event-team construction identifies participation in the named sporting competition.

Cited evidence lines: [2211](../raw_map.tsv:2211), [2213](../raw_map.tsv:2213), [2216](../raw_map.tsv:2216), [3473](../raw_map.tsv:3473), [3475](../raw_map.tsv:3475).




### rel_63__ent_1093__ent_1094

**All observed names:** Lou Holtz → Notre Dame (5)

Ordered IDs: Ent[ent_1093] → Ent[ent_1094]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7235](../raw_map.tsv:7235) | Lou Holtz | Notre Dame | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7238](../raw_map.tsv:7238) | Lou Holtz | Notre Dame | rcmod\|-&gt;rcmod-&gt;guide-&gt;dobj-&gt;\|dobj |
| [7240](../raw_map.tsv:7240) | Lou Holtz | Notre Dame | nn\|&lt;-nn&lt;-system-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7241](../raw_map.tsv:7241) | Lou Holtz | Notre Dame | dep\|-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| [7242](../raw_map.tsv:7242) | Lou Holtz | Notre Dame | rcmod\|-&gt;rcmod-&gt;thank-&gt;prep-&gt;for-&gt;pobj-&gt;contribution-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Lou Holtz → Notre Dame: Coaching a program, affiliation with a minor-league team, marriage or a city team modifier does not identify participation in a named event.

Cited evidence lines: [7235](../raw_map.tsv:7235), [7238](../raw_map.tsv:7238), [7240](../raw_map.tsv:7240), [7241](../raw_map.tsv:7241), [7242](../raw_map.tsv:7242).




### rel_63__ent_12__ent_836

**All observed names:** Yankees → World Series (4)

Ordered IDs: Ent[ent_12] → Ent[ent_836]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2178](../raw_map.tsv:2178) | Yankees | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2182](../raw_map.tsv:2182) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [2694](../raw_map.tsv:2694) | Yankees | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2698](../raw_map.tsv:2698) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Yankees → World Series: A local event-title, beaten-in-event or explicit event-team construction identifies participation in the named sporting competition.

Cited evidence lines: [2178](../raw_map.tsv:2178), [2182](../raw_map.tsv:2182), [2694](../raw_map.tsv:2694), [2698](../raw_map.tsv:2698).




### rel_63__ent_1004__ent_735

**All observed names:** Yankees → Class AAA Columbus (4)

Ordered IDs: Ent[ent_1004] → Ent[ent_735]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7919](../raw_map.tsv:7919) | Yankees | Class AAA Columbus | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7921](../raw_map.tsv:7921) | Yankees | Class AAA Columbus | nsubj\|&lt;-nsubj&lt;-summon-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [7922](../raw_map.tsv:7922) | Yankees | Class AAA Columbus | dobj\|&lt;-dobj&lt;-join-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [7923](../raw_map.tsv:7923) | Yankees | Class AAA Columbus | poss\|&lt;-poss&lt;-club-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Yankees → Class AAA Columbus: Coaching a program, affiliation with a minor-league team, marriage or a city team modifier does not identify participation in a named event.

Cited evidence lines: [7919](../raw_map.tsv:7919), [7921](../raw_map.tsv:7921), [7922](../raw_map.tsv:7922), [7923](../raw_map.tsv:7923).




### rel_63__ent_1410__ent_851

**All observed names:** Devils → Stanley Cup (3)

Ordered IDs: Ent[ent_1410] → Ent[ent_851]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2233](../raw_map.tsv:2233) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7732](../raw_map.tsv:7732) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [8045](../raw_map.tsv:8045) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Devils → Stanley Cup: A local event-title, beaten-in-event or explicit event-team construction identifies participation in the named sporting competition.

Cited evidence lines: [2233](../raw_map.tsv:2233), [7732](../raw_map.tsv:7732), [8045](../raw_map.tsv:8045).




### rel_63__ent_561__ent_1443

**All observed names:** Giants → Super Bowl (2)

Ordered IDs: Ent[ent_561] → Ent[ent_1443]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2219](../raw_map.tsv:2219) | Giants | Super Bowl | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [3439](../raw_map.tsv:3439) | Giants | Super Bowl | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Giants → Super Bowl: A local event-title, beaten-in-event or explicit event-team construction identifies participation in the named sporting competition.

Cited evidence lines: [2219](../raw_map.tsv:2219), [3439](../raw_map.tsv:3439).




### rel_63__ent_889__ent_418

**All observed names:** Mr. Ammon → Generosa (1); Parcells → Giants (1)

Ordered IDs: Ent[ent_889] → Ent[ent_418]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4083](../raw_map.tsv:4083) | Parcells | Giants | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [4505](../raw_map.tsv:4505) | Mr. Ammon | Generosa | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-romance&lt;-rcmod&lt;-spendthrift-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Mr. Ammon → Generosa; Parcells → Giants: Coaching a program, affiliation with a minor-league team, marriage or a city team modifier does not identify participation in a named event.

Cited evidence lines: [4083](../raw_map.tsv:4083), [4505](../raw_map.tsv:4505).




### rel_63__ent_347__ent_851

**All observed names:** Rangers → Stanley Cup (1)

Ordered IDs: Ent[ent_347] → Ent[ent_851]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2190](../raw_map.tsv:2190) | Rangers | Stanley Cup | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rangers → Stanley Cup: A local event-title, beaten-in-event or explicit event-team construction identifies participation in the named sporting competition.

Cited evidence lines: [2190](../raw_map.tsv:2190).




### rel_63__ent_60__ent_1401

**All observed names:** Yankees → New York (1)

Ordered IDs: Ent[ent_60] → Ent[ent_1401]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5200](../raw_map.tsv:5200) | Yankees | New York | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Yankees → New York: Coaching a program, affiliation with a minor-league team, marriage or a city team modifier does not identify participation in a named event.

Cited evidence lines: [5200](../raw_map.tsv:5200).



