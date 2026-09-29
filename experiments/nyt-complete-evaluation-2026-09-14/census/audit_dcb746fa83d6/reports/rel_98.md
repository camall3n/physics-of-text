# audit_dcb746fa83d6 — rel_98: winner or champion of

Predicate ID: winner_of

Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title.

Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

Complete census: 13 supported, 8 incorrect, 2 ambiguous; N=23. Precision 13/23=56.52% to 15/23=65.22%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 19 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| 11 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| 5 | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 3 | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| 3 | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |
| 1 | amod\|&lt;-amod&lt;-opponent-&gt;appos-&gt;\|appos |
| 1 | appos\|&lt;-appos&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | dep\|&lt;-dep&lt;-winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-begin-&gt;dobj-&gt;defense-&gt;prep-&gt;of-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-dominate-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-dwell-&gt;prep-&gt;on-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-rarity-&gt;dep-&gt;church-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;stage-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;dep-&gt;material-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-opponent-&gt;prep-&gt;for-&gt;pobj-&gt;fear-&gt;prep-&gt;of-&gt;pobj-&gt;influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-expire-&gt;prep-&gt;in-&gt;pobj-&gt;semifinal-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-performance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;tournament-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;run-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;runner-up-&gt;prep-&gt;in-&gt;pobj-&gt;time-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobjöden_were_now_resigned_to_fighting_it_out_with_Basso_for_second_place_. lex#,_who_won_the pos#,_WP_VBD_DT rc#in |

## Every evaluated fact

### rel_98__ent_608__ent_607

**All observed names:** Woods → Masters (7)

Ordered IDs: Ent[ent_608] → Ent[ent_607]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2237](../raw_map.tsv:2237) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2240](../raw_map.tsv:2240) | Woods | Masters | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2241](../raw_map.tsv:2241) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [2243](../raw_map.tsv:2243) | Woods | Masters | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;tournament-&gt;nn-&gt;\|nn |
| [2244](../raw_map.tsv:2244) | Woods | Masters | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2245](../raw_map.tsv:2245) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-dominate-&gt;dobj-&gt;\|dobj |
| [2246](../raw_map.tsv:2246) | Woods | Masters | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Woods → Masters: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2237](../raw_map.tsv:2237), [2240](../raw_map.tsv:2240), [2241](../raw_map.tsv:2241), [2243](../raw_map.tsv:2243), [2244](../raw_map.tsv:2244), [2245](../raw_map.tsv:2245), [2246](../raw_map.tsv:2246).


Issue tags: mixed_evidence

### rel_98__ent_732__ent_974

**All observed names:** Ullrich → Tour (6)

Ordered IDs: Ent[ent_732] → Ent[ent_974]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7784](../raw_map.tsv:7784) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7785](../raw_map.tsv:7785) | Ullrich | Tour | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7789](../raw_map.tsv:7789) | Ullrich | Tour | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;stage-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7791](../raw_map.tsv:7791) | Ullrich | Tour | nsubj\|&lt;-nsubj&lt;-begin-&gt;dobj-&gt;defense-&gt;prep-&gt;of-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7792](../raw_map.tsv:7792) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobjöden_were_now_resigned_to_fighting_it_out_with_Basso_for_second_place_. lex#,_who_won_the pos#,_WP_VBD_DT rc#in |
| [7793](../raw_map.tsv:7793) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;runner-up-&gt;prep-&gt;in-&gt;pobj-&gt;time-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Ullrich → Tour: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7784](../raw_map.tsv:7784), [7785](../raw_map.tsv:7785), [7789](../raw_map.tsv:7789), [7791](../raw_map.tsv:7791), [7792](../raw_map.tsv:7792), [7793](../raw_map.tsv:7793).


Issue tags: mixed_evidence

### rel_98__ent_1411__ent_1381

**All observed names:** Giants → Super Bowl (5)

Ordered IDs: Ent[ent_1411] → Ent[ent_1381]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2217](../raw_map.tsv:2217) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2221](../raw_map.tsv:2221) | Giants | Super Bowl | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2223](../raw_map.tsv:2223) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [3437](../raw_map.tsv:3437) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [3443](../raw_map.tsv:3443) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Giants → Super Bowl: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2217](../raw_map.tsv:2217), [2221](../raw_map.tsv:2221), [2223](../raw_map.tsv:2223), [3437](../raw_map.tsv:3437), [3443](../raw_map.tsv:3443).


Issue tags: mixed_evidence

### rel_98__ent_185__ent_851

**All observed names:** Devils → Stanley Cup (5)

Ordered IDs: Ent[ent_185] → Ent[ent_851]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2227](../raw_map.tsv:2227) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2230](../raw_map.tsv:2230) | Devils | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7728](../raw_map.tsv:7728) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8039](../raw_map.tsv:8039) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [8041](../raw_map.tsv:8041) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Devils → Stanley Cup: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2227](../raw_map.tsv:2227), [2230](../raw_map.tsv:2230), [7728](../raw_map.tsv:7728), [8039](../raw_map.tsv:8039), [8041](../raw_map.tsv:8041).


Issue tags: mixed_evidence

### rel_98__ent_980__ent_741

**All observed names:** Real Quiet → Kentucky Derby (4)

Ordered IDs: Ent[ent_980] → Ent[ent_741]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7737](../raw_map.tsv:7737) | Real Quiet | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7738](../raw_map.tsv:7738) | Real Quiet | Kentucky Derby | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7741](../raw_map.tsv:7741) | Real Quiet | Kentucky Derby | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7745](../raw_map.tsv:7745) | Real Quiet | Kentucky Derby | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;dep-&gt;material-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Real Quiet → Kentucky Derby: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7737](../raw_map.tsv:7737), [7738](../raw_map.tsv:7738), [7741](../raw_map.tsv:7741), [7745](../raw_map.tsv:7745).


Issue tags: mixed_evidence

### rel_98__ent_740__ent_1231

**All observed names:** Hansel → Preakness (4)

Ordered IDs: Ent[ent_740] → Ent[ent_1231]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7755](../raw_map.tsv:7755) | Hansel | Preakness | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7758](../raw_map.tsv:7758) | Hansel | Preakness | dep\|&lt;-dep&lt;-winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7759](../raw_map.tsv:7759) | Hansel | Preakness | rcmod\|-&gt;rcmod-&gt;run-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7760](../raw_map.tsv:7760) | Hansel | Preakness | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Hansel → Preakness: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7755](../raw_map.tsv:7755), [7758](../raw_map.tsv:7758), [7759](../raw_map.tsv:7759), [7760](../raw_map.tsv:7760).


Issue tags: mixed_evidence

### rel_98__ent_409__ent_1420

**All observed names:** Yankees → World Series (2); Marlins → World Series (1)

Ordered IDs: Ent[ent_409] → Ent[ent_1420]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2181](../raw_map.tsv:2181) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-play-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2257](../raw_map.tsv:2257) | Marlins | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2693](../raw_map.tsv:2693) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Yankees → World Series; Marlins → World Series: The same first latent entity combines Yankees and Marlins, so the supported winner rows do not identify one coherent inferred subject.

Cited evidence lines: [2181](../raw_map.tsv:2181), [2257](../raw_map.tsv:2257), [2693](../raw_map.tsv:2693).

**Review question:** Which team is intended by this latent fact, and should Yankees and Marlins be split?
Issue tags: entity_identity

### rel_98__ent_347__ent_1298

**All observed names:** Rangers → Stanley Cup (3)

Ordered IDs: Ent[ent_347] → Ent[ent_1298]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2188](../raw_map.tsv:2188) | Rangers | Stanley Cup | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2193](../raw_map.tsv:2193) | Rangers | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2196](../raw_map.tsv:2196) | Rangers | Stanley Cup | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rangers → Stanley Cup: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2188](../raw_map.tsv:2188), [2193](../raw_map.tsv:2193), [2196](../raw_map.tsv:2196).


Issue tags: mixed_evidence

### rel_98__ent_1350__ent_1302

**All observed names:** Mets → World Series (3)

Ordered IDs: Ent[ent_1350] → Ent[ent_1302]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2208](../raw_map.tsv:2208) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-reach-&gt;dobj-&gt;\|dobj |
| [2212](../raw_map.tsv:2212) | Mets | World Series | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2214](../raw_map.tsv:2214) | Mets | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mets → World Series: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2208](../raw_map.tsv:2208), [2212](../raw_map.tsv:2212), [2214](../raw_map.tsv:2214).


Issue tags: mixed_evidence

### rel_98__ent_739__ent_741

**All observed names:** Unbridled → Kentucky Derby (3)

Ordered IDs: Ent[ent_739] → Ent[ent_741]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7775](../raw_map.tsv:7775) | Unbridled | Kentucky Derby | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |
| [7776](../raw_map.tsv:7776) | Unbridled | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7777](../raw_map.tsv:7777) | Unbridled | Kentucky Derby | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Unbridled → Kentucky Derby: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7775](../raw_map.tsv:7775), [7776](../raw_map.tsv:7776), [7777](../raw_map.tsv:7777).




### rel_98__ent_752__ent_510

**All observed names:** Pat Cash → Wimbledon (3)

Ordered IDs: Ent[ent_752] → Ent[ent_510]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7995](../raw_map.tsv:7995) | Pat Cash | Wimbledon | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7998](../raw_map.tsv:7998) | Pat Cash | Wimbledon | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [8002](../raw_map.tsv:8002) | Pat Cash | Wimbledon | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-expire-&gt;prep-&gt;in-&gt;pobj-&gt;semifinal-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Pat Cash → Wimbledon: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7995](../raw_map.tsv:7995), [7998](../raw_map.tsv:7998), [8002](../raw_map.tsv:8002).


Issue tags: mixed_evidence

### rel_98__ent_309__ent_1302

**All observed names:** Red Sox → World Series (2)

Ordered IDs: Ent[ent_309] → Ent[ent_1302]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2197](../raw_map.tsv:2197) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2198](../raw_map.tsv:2198) | Red Sox | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Red Sox → World Series: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2197](../raw_map.tsv:2197), [2198](../raw_map.tsv:2198).




### rel_98__ent_6__ent_586

**All observed names:** Bill Clinton → White House (2)

Ordered IDs: Ent[ent_6] → Ent[ent_586]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2714](../raw_map.tsv:2714) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2718](../raw_map.tsv:2718) | Bill Clinton | White House | poss\|&lt;-poss&lt;-performance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bill Clinton → White House: Winning political office/control is outside the declared competition/award predicate.

Cited evidence lines: [2714](../raw_map.tsv:2714), [2718](../raw_map.tsv:2718).


Issue tags: predicate_boundary

### rel_98__ent_251__ent_586

**All observed names:** John F. Kennedy → White House (2)

Ordered IDs: Ent[ent_251] → Ent[ent_586]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2745](../raw_map.tsv:2745) | John F. Kennedy | White House | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-opponent-&gt;prep-&gt;for-&gt;pobj-&gt;fear-&gt;prep-&gt;of-&gt;pobj-&gt;influence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2746](../raw_map.tsv:2746) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). John F. Kennedy → White House: Winning political office/control is outside the declared competition/award predicate.

Cited evidence lines: [2745](../raw_map.tsv:2745), [2746](../raw_map.tsv:2746).


Issue tags: predicate_boundary

### rel_98__ent_726__ent_607

**All observed names:** Scot → Masters (2)

Ordered IDs: Ent[ent_726] → Ent[ent_607]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7716](../raw_map.tsv:7716) | Scot | Masters | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7717](../raw_map.tsv:7717) | Scot | Masters | nsubj\|&lt;-nsubj&lt;-dwell-&gt;prep-&gt;on-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Scot → Masters: The win/victory path is clear, but Scot is an incomplete person designation and does not identify the winner from the supplied triples.

Cited evidence lines: [7716](../raw_map.tsv:7716), [7717](../raw_map.tsv:7717).

**Review question:** Which named golfer does Scot denote in the original sentence?
Issue tags: entity_identity

### rel_98__ent_1238__ent_483

**All observed names:** Alan Greenspan → Congress (1)

Ordered IDs: Ent[ent_1238] → Ent[ent_483]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [408](../raw_map.tsv:408) | Alan Greenspan | Congress | appos\|&lt;-appos&lt;-chairman&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Alan Greenspan → Congress: The supplied communication, church/location, or opponent-apposition evidence does not establish winning an event or award.

Cited evidence lines: [408](../raw_map.tsv:408).


Issue tags: other_predicate

### rel_98__ent_1320__ent_764

**All observed names:** Devils → Stanley Cup (1)

Ordered IDs: Ent[ent_1320] → Ent[ent_764]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2229](../raw_map.tsv:2229) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-lead-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Devils → Stanley Cup: Being led to the Stanley Cup does not by itself distinguish reaching the final from winning it. No explicit win is supplied for this latent fact.

Cited evidence lines: [2229](../raw_map.tsv:2229).


Issue tags: other_predicate

### rel_98__ent_409__ent_772

**All observed names:** Yankees → American League East (1)

Ordered IDs: Ent[ent_409] → Ent[ent_772]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2735](../raw_map.tsv:2735) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Yankees → American League East: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [2735](../raw_map.tsv:2735).




### rel_98__ent_645__ent_380

**All observed names:** Mark → Manhattan (1)

Ordered IDs: Ent[ent_645] → Ent[ent_380]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3991](../raw_map.tsv:3991) | Mark | Manhattan | nsubj\|&lt;-nsubj&lt;-rarity-&gt;dep-&gt;church-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Mark → Manhattan: The supplied communication, church/location, or opponent-apposition evidence does not establish winning an event or award.

Cited evidence lines: [3991](../raw_map.tsv:3991).


Issue tags: other_predicate

### rel_98__ent_249__ent_1326

**All observed names:** Democrats → House (1)

Ordered IDs: Ent[ent_249] → Ent[ent_1326]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6366](../raw_map.tsv:6366) | Democrats | House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Democrats → House: Winning political office/control is outside the declared competition/award predicate.

Cited evidence lines: [6366](../raw_map.tsv:6366).


Issue tags: predicate_boundary

### rel_98__ent_816__ent_20

**All observed names:** Republicans → House (1)

Ordered IDs: Ent[ent_816] → Ent[ent_20]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6402](../raw_map.tsv:6402) | Republicans | House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Republicans → House: Winning political office/control is outside the declared competition/award predicate.

Cited evidence lines: [6402](../raw_map.tsv:6402).


Issue tags: predicate_boundary

### rel_98__ent_263__ent_1215

**All observed names:** Republican → Bob Dole (1)

Ordered IDs: Ent[ent_263] → Ent[ent_1215]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7708](../raw_map.tsv:7708) | Republican | Bob Dole | amod\|&lt;-amod&lt;-opponent-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Republican → Bob Dole: The supplied communication, church/location, or opponent-apposition evidence does not establish winning an event or award.

Cited evidence lines: [7708](../raw_map.tsv:7708).


Issue tags: other_predicate

### rel_98__ent_991__ent_964

**All observed names:** Becker → Wimbledon (1)

Ordered IDs: Ent[ent_991] → Ent[ent_964]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7985](../raw_map.tsv:7985) | Becker | Wimbledon | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Becker → Wimbledon: A supplied row explicitly identifies a win or winner of the named competition; other participation, stage, or contextual rows are not needed.

Cited evidence lines: [7985](../raw_map.tsv:7985).



