# audit_e318fe663470 — rel_64: wins or holds sporting championship

Predicate ID: sporting_champion_of

Entity X won sporting competition Y or held an explicitly Y-designated sporting championship or title.

Includes: sport win/champion/title/clinch-title; sporting league/division or explicitly title-designating body; historical sporting title. Excludes: non-sport honorary awards; political election or control; participation; single stage without overall title; coaching or team membership alone. Ambiguous unless resolved by case-local evidence: medal without a winning championship; unclear title attachment. Retains the original sports-only relation separately from winner_of; do not silently extend it to Nobel or political examples.

Complete census: 4 supported, 2 incorrect, 0 ambiguous; N=6. Precision 4/6=66.67% to 4/6=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| 5 | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| 4 | nsubj\|&lt;-nsubj&lt;-capture-&gt;dobj-&gt;\|dobj |
| 4 | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| 3 | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-coach-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-operation-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-pullout-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_64__ent_1410__ent_851

**All observed names:** Devils → Stanley Cup (10)

Ordered IDs: Ent[ent_1410] → Ent[ent_851]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2227](../raw_map.tsv:2227) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2232](../raw_map.tsv:2232) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-capture-&gt;dobj-&gt;\|dobj |
| [2235](../raw_map.tsv:2235) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| [2236](../raw_map.tsv:2236) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| [7726](../raw_map.tsv:7726) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7731](../raw_map.tsv:7731) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-capture-&gt;dobj-&gt;\|dobj |
| [7734](../raw_map.tsv:7734) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| [8039](../raw_map.tsv:8039) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [8044](../raw_map.tsv:8044) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-capture-&gt;dobj-&gt;\|dobj |
| [8047](../raw_map.tsv:8047) | Devils | Stanley Cup | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Devils → Stanley Cup: A local win/capture/champion/title assertion establishes the sporting championship.

Cited evidence lines: [2227](../raw_map.tsv:2227), [2232](../raw_map.tsv:2232), [2235](../raw_map.tsv:2235), [2236](../raw_map.tsv:2236), [7726](../raw_map.tsv:7726), [7731](../raw_map.tsv:7731), [7734](../raw_map.tsv:7734), [8039](../raw_map.tsv:8039), [8044](../raw_map.tsv:8044), [8047](../raw_map.tsv:8047).




### rel_64__ent_561__ent_1443

**All observed names:** Giants → Super Bowl (5)

Ordered IDs: Ent[ent_561] → Ent[ent_1443]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2217](../raw_map.tsv:2217) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2223](../raw_map.tsv:2223) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [2225](../raw_map.tsv:2225) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |
| [3443](../raw_map.tsv:3443) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [3445](../raw_map.tsv:3445) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-champion-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Giants → Super Bowl: A local win/capture/champion/title assertion establishes the sporting championship.

Cited evidence lines: [2217](../raw_map.tsv:2217), [2223](../raw_map.tsv:2223), [2225](../raw_map.tsv:2225), [3443](../raw_map.tsv:3443), [3445](../raw_map.tsv:3445).


Issue tags: mixed_evidence

### rel_64__ent_321__ent_836

**All observed names:** Mets → World Series (4)

Ordered IDs: Ent[ent_321] → Ent[ent_836]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2208](../raw_map.tsv:2208) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [3469](../raw_map.tsv:3469) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [3470](../raw_map.tsv:3470) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [3471](../raw_map.tsv:3471) | Mets | World Series | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Mets → World Series: A local win/capture/champion/title assertion establishes the sporting championship.

Cited evidence lines: [2208](../raw_map.tsv:2208), [3469](../raw_map.tsv:3469), [3470](../raw_map.tsv:3470), [3471](../raw_map.tsv:3471).


Issue tags: mixed_evidence

### rel_64__ent_347__ent_851

**All observed names:** Rangers → Stanley Cup (3)

Ordered IDs: Ent[ent_347] → Ent[ent_851]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2187](../raw_map.tsv:2187) | Rangers | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2191](../raw_map.tsv:2191) | Rangers | Stanley Cup | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| [2194](../raw_map.tsv:2194) | Rangers | Stanley Cup | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rangers → Stanley Cup: A local win/capture/champion/title assertion establishes the sporting championship.

Cited evidence lines: [2187](../raw_map.tsv:2187), [2191](../raw_map.tsv:2191), [2194](../raw_map.tsv:2194).




### rel_64__ent_1337__ent_1309

**All observed names:** Israel → Gaza (3)

Ordered IDs: Ent[ent_1337] → Ent[ent_1309]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4107](../raw_map.tsv:4107) | Israel | Gaza | poss\|&lt;-poss&lt;-pullout-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4112](../raw_map.tsv:4112) | Israel | Gaza | poss\|&lt;-poss&lt;-operation-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4113](../raw_map.tsv:4113) | Israel | Gaza | nsubj\|&lt;-nsubj&lt;-capture-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Israel → Gaza: Territorial capture/withdrawal and a coach title are not sporting championship claims.

Cited evidence lines: [4107](../raw_map.tsv:4107), [4112](../raw_map.tsv:4112), [4113](../raw_map.tsv:4113).




### rel_64__ent_935__ent_1092

**All observed names:** Colin Campbell → Ranger (1)

Ordered IDs: Ent[ent_935] → Ent[ent_1092]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7226](../raw_map.tsv:7226) | Colin Campbell | Ranger | nsubj\|&lt;-nsubj&lt;-coach-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Colin Campbell → Ranger: Territorial capture/withdrawal and a coach title are not sporting championship claims.

Cited evidence lines: [7226](../raw_map.tsv:7226).



