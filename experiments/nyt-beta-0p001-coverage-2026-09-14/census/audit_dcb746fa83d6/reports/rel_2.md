# audit_dcb746fa83d6 — rel_2: participated in sporting event

Predicate ID: participated_in_sporting_event

Competitor or team X participated in sporting event or competition Y.

Includes: actual played-in, competed-in, or appeared-in a sporting event; being in an event when competitive participation is clear; a completed win or title in the event, which entails participation. Excludes: plans, hopes, or qualification without established participation; attendance as spectator; membership in a league without participation in the designated event; non-sporting events or geographic presence alone. Ambiguous unless resolved by case-local evidence: future or proposed participation; event occurrence or participant role unclear; a governing body or location substituted for an unresolved event. Participation does not require winning. Preserve defeated and winner_of as separate predicates where those meanings were declared.

Complete census: 4 supported, 6 incorrect, 0 ambiguous; N=10. Precision 4/10=40.00% to 4/10=40.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-lose-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-supporter&lt;-dep&lt;-install&lt;-partmod&lt;-coup&lt;-nsubj&lt;-ascendancy-&gt;prep-&gt;among-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-play-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-secretary&lt;-pobj&lt;-of&lt;-prep&lt;-brother-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-continue-&gt;dobj-&gt;warm-up-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-urge-&gt;dobj-&gt;senators-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-general&lt;-nsubj&lt;-drop-&gt;dobj-&gt;investigation-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-general&lt;-nsubj&lt;-order-&gt;dobj-&gt;government-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-as&lt;-prep&lt;-term&lt;-pobj&lt;-after&lt;-prep&lt;-face-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-war&lt;-dobj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_2__ent_1004__ent_1302

**All observed names:** Yankees → World Series (5)

Ordered IDs: Ent[ent_1004] → Ent[ent_1302]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2178](../raw_map.tsv:2178) | Yankees | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2184](../raw_map.tsv:2184) | Yankees | World Series | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-lose-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2694](../raw_map.tsv:2694) | Yankees | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2698](../raw_map.tsv:2698) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |
| [2701](../raw_map.tsv:2701) | Yankees | World Series | dobj\|&lt;-dobj&lt;-play-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankees → World Series: A completed win, defeat or play-in row establishes participation in the sporting event.

Cited evidence lines: [2178](../raw_map.tsv:2178), [2184](../raw_map.tsv:2184), [2694](../raw_map.tsv:2694), [2698](../raw_map.tsv:2698), [2701](../raw_map.tsv:2701).


Issue tags: mixed_evidence

### rel_2__ent_1356__ent_949

**All observed names:** Israel → Ariel Sharon (3)

Ordered IDs: Ent[ent_1356] → Ent[ent_949]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6998](../raw_map.tsv:6998) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-general&lt;-nsubj&lt;-drop-&gt;dobj-&gt;investigation-&gt;prep-&gt;against-&gt;pobj-&gt;\|pobj |
| [7002](../raw_map.tsv:7002) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-as&lt;-prep&lt;-term&lt;-pobj&lt;-after&lt;-prep&lt;-face-&gt;nsubj-&gt;\|nsubj |
| [7005](../raw_map.tsv:7005) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-general&lt;-nsubj&lt;-order-&gt;dobj-&gt;government-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Israel → Ariel Sharon: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [6998](../raw_map.tsv:6998), [7002](../raw_map.tsv:7002), [7005](../raw_map.tsv:7005).




### rel_2__ent_752__ent_510

**All observed names:** Pat Cash → Wimbledon (3)

Ordered IDs: Ent[ent_752] → Ent[ent_510]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7997](../raw_map.tsv:7997) | Pat Cash | Wimbledon | rcmod\|-&gt;rcmod-&gt;win-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [8001](../raw_map.tsv:8001) | Pat Cash | Wimbledon | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-lose-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [8003](../raw_map.tsv:8003) | Pat Cash | Wimbledon | nsubj\|&lt;-nsubj&lt;-continue-&gt;dobj-&gt;warm-up-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Pat Cash → Wimbledon: A completed win, defeat or play-in row establishes participation in the sporting event.

Cited evidence lines: [7997](../raw_map.tsv:7997), [8001](../raw_map.tsv:8001), [8003](../raw_map.tsv:8003).


Issue tags: mixed_evidence

### rel_2__ent_321__ent_836

**All observed names:** Mets → World Series (2)

Ordered IDs: Ent[ent_321] → Ent[ent_836]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2211](../raw_map.tsv:2211) | Mets | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3478](../raw_map.tsv:3478) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;title-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mets → World Series: A completed win, defeat or play-in row establishes participation in the sporting event.

Cited evidence lines: [2211](../raw_map.tsv:2211), [3478](../raw_map.tsv:3478).


Issue tags: mixed_evidence

### rel_2__ent_268__ent_764

**All observed names:** Joseph L. Bruno → Republican (1)

Ordered IDs: Ent[ent_268] → Ent[ent_764]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3031](../raw_map.tsv:3031) | Joseph L. Bruno | Republican | appos\|&lt;-appos&lt;-supporter&lt;-dep&lt;-install&lt;-partmod&lt;-coup&lt;-nsubj&lt;-ascendancy-&gt;prep-&gt;among-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Joseph L. Bruno → Republican: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [3031](../raw_map.tsv:3031).




### rel_2__ent_1236__ent_745

**All observed names:** Mets → World Series (1)

Ordered IDs: Ent[ent_1236] → Ent[ent_745]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3473](../raw_map.tsv:3473) | Mets | World Series | dobj\|&lt;-dobj&lt;-beat-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mets → World Series: A completed win, defeat or play-in row establishes participation in the sporting event.

Cited evidence lines: [3473](../raw_map.tsv:3473).




### rel_2__ent_49__ent_1305

**All observed names:** George J. Mitchell → Democratic (1)

Ordered IDs: Ent[ent_49] → Ent[ent_1305]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3777](../raw_map.tsv:3777) | George J. Mitchell | Democratic | nsubj\|&lt;-nsubj&lt;-urge-&gt;dobj-&gt;senators-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). George J. Mitchell → Democratic: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [3777](../raw_map.tsv:3777).




### rel_2__ent_629__ent_1383

**All observed names:** Raiders → Oakland (1)

Ordered IDs: Ent[ent_629] → Ent[ent_1383]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5235](../raw_map.tsv:5235) | Raiders | Oakland | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-lose-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Raiders → Oakland: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [5235](../raw_map.tsv:5235).




### rel_2__ent_169__ent_1039

**All observed names:** White House → Scott McClellan (1)

Ordered IDs: Ent[ent_169] → Ent[ent_1039]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5409](../raw_map.tsv:5409) | White House | Scott McClellan | nn\|&lt;-nn&lt;-secretary&lt;-pobj&lt;-of&lt;-prep&lt;-brother-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). White House → Scott McClellan: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [5409](../raw_map.tsv:5409).




### rel_2__ent_99__ent_492

**All observed names:** Iran → Iraq (1)

Ordered IDs: Ent[ent_99] → Ent[ent_492]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5534](../raw_map.tsv:5534) | Iran | Iraq | poss\|&lt;-poss&lt;-war&lt;-dobj&lt;-end-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Iran → Iraq: Political roles, geographic Oakland, a secretary relationship or war do not establish participation in a sporting event.

Cited evidence lines: [5534](../raw_map.tsv:5534).



