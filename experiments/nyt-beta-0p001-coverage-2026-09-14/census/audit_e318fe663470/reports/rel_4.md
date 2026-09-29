# audit_e318fe663470 — rel_4: played or competed against

Predicate ID: competed_against

Competitor X played or competed against opposing competitor Y in a contest.

Includes: explicit played against; a completed win or loss against opponent; competition with clear opponent roles. Excludes: ordinary interaction; standings comparison without a contest; future schedule alone. Ambiguous unless resolved by case-local evidence: ambiguous game occurrence. Sensitivity-only for previously defeat-labeled relations unless a new primary assignment is explicitly frozen before grading. Not a union of unrelated meanings.

Complete census: 8 supported, 5 incorrect, 2 ambiguous; N=15. Precision 8/15=53.33% to 10/15=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| 8 | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| 5 | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| 4 | poss\|&lt;-poss&lt;-game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-triumph-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-battle-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-fight-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;dobj-&gt;game-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-admit-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;prepare-&gt;prep-&gt;for-&gt;pobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-tv&lt;-pobj&lt;-on&lt;-prep&lt;-change-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-hire-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-rivalry-&gt;dep-&gt;be-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-tie-&gt;prep-&gt;to-&gt;pobj-&gt;alliance-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-upset-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;trail-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_4__ent_74__ent_1004

**All observed names:** Red Sox → Yankees (7)

Ordered IDs: Ent[ent_74] → Ent[ent_1004]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [861](../raw_map.tsv:861) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [866](../raw_map.tsv:866) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [2661](../raw_map.tsv:2661) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [2666](../raw_map.tsv:2666) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [2667](../raw_map.tsv:2667) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| [6927](../raw_map.tsv:6927) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [6932](../raw_map.tsv:6932) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Red Sox → Yankees: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [861](../raw_map.tsv:861), [866](../raw_map.tsv:866), [2661](../raw_map.tsv:2661), [2666](../raw_map.tsv:2666), [2667](../raw_map.tsv:2667), [6927](../raw_map.tsv:6927), [6932](../raw_map.tsv:6932).


Issue tags: mixed_evidence

### rel_4__ent_646__ent_237

**All observed names:** David → Goliath (6)

Ordered IDs: Ent[ent_646] → Ent[ent_237]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6437](../raw_map.tsv:6437) | David | Goliath | nsubj\|&lt;-nsubj&lt;-fight-&gt;dobj-&gt;\|dobj |
| [6439](../raw_map.tsv:6439) | David | Goliath | nsubj\|&lt;-nsubj&lt;-battle-&gt;dobj-&gt;\|dobj |
| [6440](../raw_map.tsv:6440) | David | Goliath | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [6442](../raw_map.tsv:6442) | David | Goliath | poss\|&lt;-poss&lt;-triumph-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [6443](../raw_map.tsv:6443) | David | Goliath | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-tv&lt;-pobj&lt;-on&lt;-prep&lt;-change-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [6445](../raw_map.tsv:6445) | David | Goliath | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). David → Goliath: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [6437](../raw_map.tsv:6437), [6439](../raw_map.tsv:6439), [6440](../raw_map.tsv:6440), [6442](../raw_map.tsv:6442), [6443](../raw_map.tsv:6443), [6445](../raw_map.tsv:6445).


Issue tags: mixed_evidence, broad_predicate

### rel_4__ent_1004__ent_309

**All observed names:** Yankees → Red Sox (5)

Ordered IDs: Ent[ent_1004] → Ent[ent_309]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [882](../raw_map.tsv:882) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [885](../raw_map.tsv:885) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [2585](../raw_map.tsv:2585) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [3138](../raw_map.tsv:3138) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [6901](../raw_map.tsv:6901) | Yankees | Red Sox | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Yankees → Red Sox: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [882](../raw_map.tsv:882), [885](../raw_map.tsv:885), [2585](../raw_map.tsv:2585), [3138](../raw_map.tsv:3138), [6901](../raw_map.tsv:6901).


Issue tags: mixed_evidence

### rel_4__ent_543__ent_308

**All observed names:** Nets → Knicks (4)

Ordered IDs: Ent[ent_543] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [941](../raw_map.tsv:941) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [943](../raw_map.tsv:943) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [949](../raw_map.tsv:949) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| [950](../raw_map.tsv:950) | Nets | Knicks | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Nets → Knicks: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [941](../raw_map.tsv:941), [943](../raw_map.tsv:943), [949](../raw_map.tsv:949), [950](../raw_map.tsv:950).


Issue tags: mixed_evidence

### rel_4__ent_561__ent_1038

**All observed names:** Giants → Dallas Cowboys (4)

Ordered IDs: Ent[ent_561] → Ent[ent_1038]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2672](../raw_map.tsv:2672) | Giants | Dallas Cowboys | partmod\|-&gt;partmod-&gt;prepare-&gt;prep-&gt;for-&gt;pobj-&gt;game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| [2675](../raw_map.tsv:2675) | Giants | Dallas Cowboys | poss\|&lt;-poss&lt;-game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| [2678](../raw_map.tsv:2678) | Giants | Dallas Cowboys | poss\|&lt;-poss&lt;-upset-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2679](../raw_map.tsv:2679) | Giants | Dallas Cowboys | poss\|&lt;-poss&lt;-rivalry-&gt;dep-&gt;be-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Giants → Dallas Cowboys: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [2672](../raw_map.tsv:2672), [2675](../raw_map.tsv:2675), [2678](../raw_map.tsv:2678), [2679](../raw_map.tsv:2679).


Issue tags: mixed_evidence

### rel_4__ent_110__ent_347

**All observed names:** Devils → Rangers (4)

Ordered IDs: Ent[ent_110] → Ent[ent_347]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6973](../raw_map.tsv:6973) | Devils | Rangers | rcmod\|-&gt;rcmod-&gt;trail-&gt;dobj-&gt;\|dobj |
| [6974](../raw_map.tsv:6974) | Devils | Rangers | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| [6975](../raw_map.tsv:6975) | Devils | Rangers | nsubj\|&lt;-nsubj&lt;-play-&gt;dobj-&gt;game-&gt;prep-&gt;than-&gt;pobj-&gt;\|pobj |
| [6976](../raw_map.tsv:6976) | Devils | Rangers | poss\|&lt;-poss&lt;-triumph-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Devils → Rangers: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [6973](../raw_map.tsv:6973), [6974](../raw_map.tsv:6974), [6975](../raw_map.tsv:6975), [6976](../raw_map.tsv:6976).


Issue tags: mixed_evidence

### rel_4__ent_309__ent_12

**All observed names:** Red Sox → Yankees (2)

Ordered IDs: Ent[ent_309] → Ent[ent_12]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [867](../raw_map.tsv:867) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |
| [6933](../raw_map.tsv:6933) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: The rows show standings-only games-behind, NATO affiliation, legal employment or hiring rather than an actual contest.

Cited evidence lines: [867](../raw_map.tsv:867), [6933](../raw_map.tsv:6933).




### rel_4__ent_321__ent_60

**All observed names:** Mets → Yankees (2)

Ordered IDs: Ent[ent_321] → Ent[ent_60]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [911](../raw_map.tsv:911) | Mets | Yankees | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [917](../raw_map.tsv:917) | Mets | Yankees | poss\|&lt;-poss&lt;-game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mets → Yankees: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [911](../raw_map.tsv:911), [917](../raw_map.tsv:917).


Issue tags: mixed_evidence

### rel_4__ent_1252__ent_814

**All observed names:** Poland → NATO (2)

Ordered IDs: Ent[ent_1252] → Ent[ent_814]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1997](../raw_map.tsv:1997) | Poland | NATO | poss\|&lt;-poss&lt;-tie-&gt;prep-&gt;to-&gt;pobj-&gt;alliance-&gt;nn-&gt;\|nn |
| [1999](../raw_map.tsv:1999) | Poland | NATO | nsubjpass\|&lt;-nsubjpass&lt;-admit-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Poland → NATO: The rows show standings-only games-behind, NATO affiliation, legal employment or hiring rather than an actual contest.

Cited evidence lines: [1997](../raw_map.tsv:1997), [1999](../raw_map.tsv:1999).




### rel_4__ent_321__ent_1335

**All observed names:** Mets → Dodgers (2)

Ordered IDs: Ent[ent_321] → Ent[ent_1335]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6919](../raw_map.tsv:6919) | Mets | Dodgers | nsubj\|&lt;-nsubj&lt;-beat-&gt;dobj-&gt;\|dobj |
| [6922](../raw_map.tsv:6922) | Mets | Dodgers | poss\|&lt;-poss&lt;-game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mets → Dodgers: At least one local completed beat/win/triumph/upset row establishes a contest with these ordered competitors.

Cited evidence lines: [6919](../raw_map.tsv:6919), [6922](../raw_map.tsv:6922).


Issue tags: mixed_evidence

### rel_4__ent_1177__ent_280

**All observed names:** David Ng → Manhattan (1)

Ordered IDs: Ent[ent_1177] → Ent[ent_280]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2319](../raw_map.tsv:2319) | David Ng | Manhattan | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). David Ng → Manhattan: The rows show standings-only games-behind, NATO affiliation, legal employment or hiring rather than an actual contest.

Cited evidence lines: [2319](../raw_map.tsv:2319).




### rel_4__ent_1315__ent_1063

**All observed names:** Rangers → Devils (1)

Ordered IDs: Ent[ent_1315] → Ent[ent_1063]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2607](../raw_map.tsv:2607) | Rangers | Devils | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Rangers → Devils: The isolated trail row does not distinguish in-game competition from a standings comparison.

Cited evidence lines: [2607](../raw_map.tsv:2607).

**Review question:** Does trail refer to an actual game against this opponent?
Issue tags: predicate_scope

### rel_4__ent_274__ent_462

**All observed names:** Al Bianchi → Knicks (1)

Ordered IDs: Ent[ent_274] → Ent[ent_462]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3213](../raw_map.tsv:3213) | Al Bianchi | Knicks | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-hire-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Al Bianchi → Knicks: The rows show standings-only games-behind, NATO affiliation, legal employment or hiring rather than an actual contest.

Cited evidence lines: [3213](../raw_map.tsv:3213).




### rel_4__ent_321__ent_278

**All observed names:** Mets → Braves (1)

Ordered IDs: Ent[ent_321] → Ent[ent_278]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6896](../raw_map.tsv:6896) | Mets | Braves | nsubj\|&lt;-nsubj&lt;-game-&gt;prep-&gt;behind-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mets → Braves: The rows show standings-only games-behind, NATO affiliation, legal employment or hiring rather than an actual contest.

Cited evidence lines: [6896](../raw_map.tsv:6896).




### rel_4__ent_1282__ent_1013

**All observed names:** Mets → Florida Marlins (1)

Ordered IDs: Ent[ent_1282] → Ent[ent_1013]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6984](../raw_map.tsv:6984) | Mets | Florida Marlins | poss\|&lt;-poss&lt;-game-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Mets → Florida Marlins: A bare game-against phrase does not establish whether the contest occurred or was only scheduled.

Cited evidence lines: [6984](../raw_map.tsv:6984).

**Review question:** Was this game played rather than merely scheduled?
Issue tags: temporal_scope
