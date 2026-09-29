# audit_06dbdb9b03af — rel_29: winner or champion of

Predicate ID: winner_of

Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title.

Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

Complete census: 18 supported, 0 incorrect, 0 ambiguous; N=18. Precision 18/18=100.00% to 18/18=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 21 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| 20 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| 11 | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| 7 | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |
| 3 | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-championship-&gt;nn-&gt;\|nn |
| 2 | rcmod\|-&gt;rcmod-&gt;finish-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-begin-&gt;dobj-&gt;defense-&gt;prep-&gt;of-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-come-&gt;prep-&gt;at-&gt;pobj-&gt;hole-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-set-&gt;dep-&gt;win-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-shoot-&gt;prep-&gt;in-&gt;pobj-&gt;playoff-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-single-&gt;prep-&gt;as-&gt;pobj-&gt;key-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;tournament-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-present-&gt;prep-&gt;with-&gt;pobj-&gt;trophy-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-outrun-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;son-&gt;prep-&gt;of-&gt;pobj-&gt;winner-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;runner-up-&gt;prep-&gt;in-&gt;pobj-&gt;time-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | tmod\|&lt;-tmod&lt;-draw-&gt;partmod-&gt;seek-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_29__ent_750__ent_992

**All observed names:** Curtis Strange → United States Open (10)

Ordered IDs: Ent[ent_750] → Ent[ent_992]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7974](../raw_map.tsv:7974) | Curtis Strange | United States Open | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7975](../raw_map.tsv:7975) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7976](../raw_map.tsv:7976) | Curtis Strange | United States Open | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7977](../raw_map.tsv:7977) | Curtis Strange | United States Open | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7978](../raw_map.tsv:7978) | Curtis Strange | United States Open | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7979](../raw_map.tsv:7979) | Curtis Strange | United States Open | nsubjpass\|&lt;-nsubjpass&lt;-present-&gt;prep-&gt;with-&gt;pobj-&gt;trophy-&gt;nn-&gt;\|nn |
| [7980](../raw_map.tsv:7980) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-single-&gt;prep-&gt;as-&gt;pobj-&gt;key-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7981](../raw_map.tsv:7981) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-shoot-&gt;prep-&gt;in-&gt;pobj-&gt;playoff-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7982](../raw_map.tsv:7982) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7983](../raw_map.tsv:7983) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-come-&gt;prep-&gt;at-&gt;pobj-&gt;hole-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Curtis Strange → United States Open: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7974](../raw_map.tsv:7974), [7975](../raw_map.tsv:7975), [7976](../raw_map.tsv:7976), [7977](../raw_map.tsv:7977), [7978](../raw_map.tsv:7978), [7979](../raw_map.tsv:7979), [7980](../raw_map.tsv:7980), [7981](../raw_map.tsv:7981), [7982](../raw_map.tsv:7982), [7983](../raw_map.tsv:7983).


Issue tags: mixed_evidence

### rel_29__ent_110__ent_851

**All observed names:** Devils → Stanley Cup (8)

Ordered IDs: Ent[ent_110] → Ent[ent_851]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2227](../raw_map.tsv:2227) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2228](../raw_map.tsv:2228) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2230](../raw_map.tsv:2230) | Devils | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7726](../raw_map.tsv:7726) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7727](../raw_map.tsv:7727) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7729](../raw_map.tsv:7729) | Devils | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [8039](../raw_map.tsv:8039) | Devils | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [8040](../raw_map.tsv:8040) | Devils | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Devils → Stanley Cup: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2227](../raw_map.tsv:2227), [2228](../raw_map.tsv:2228), [2230](../raw_map.tsv:2230), [7726](../raw_map.tsv:7726), [7727](../raw_map.tsv:7727), [7729](../raw_map.tsv:7729), [8039](../raw_map.tsv:8039), [8040](../raw_map.tsv:8040).




### rel_29__ent_608__ent_607

**All observed names:** Woods → Masters (7)

Ordered IDs: Ent[ent_608] → Ent[ent_607]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2237](../raw_map.tsv:2237) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2238](../raw_map.tsv:2238) | Woods | Masters | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2240](../raw_map.tsv:2240) | Woods | Masters | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2241](../raw_map.tsv:2241) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| [2242](../raw_map.tsv:2242) | Woods | Masters | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;tournament-&gt;nn-&gt;\|nn |
| [2244](../raw_map.tsv:2244) | Woods | Masters | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2246](../raw_map.tsv:2246) | Woods | Masters | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Woods → Masters: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2237](../raw_map.tsv:2237), [2238](../raw_map.tsv:2238), [2240](../raw_map.tsv:2240), [2241](../raw_map.tsv:2241), [2242](../raw_map.tsv:2242), [2244](../raw_map.tsv:2244), [2246](../raw_map.tsv:2246).




### rel_29__ent_732__ent_974

**All observed names:** Ullrich → Tour (7)

Ordered IDs: Ent[ent_732] → Ent[ent_974]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7784](../raw_map.tsv:7784) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7785](../raw_map.tsv:7785) | Ullrich | Tour | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7786](../raw_map.tsv:7786) | Ullrich | Tour | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7787](../raw_map.tsv:7787) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;finish-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7788](../raw_map.tsv:7788) | Ullrich | Tour | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7791](../raw_map.tsv:7791) | Ullrich | Tour | nsubj\|&lt;-nsubj&lt;-begin-&gt;dobj-&gt;defense-&gt;prep-&gt;of-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7793](../raw_map.tsv:7793) | Ullrich | Tour | rcmod\|-&gt;rcmod-&gt;runner-up-&gt;prep-&gt;in-&gt;pobj-&gt;time-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Ullrich → Tour: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7784](../raw_map.tsv:7784), [7785](../raw_map.tsv:7785), [7786](../raw_map.tsv:7786), [7787](../raw_map.tsv:7787), [7788](../raw_map.tsv:7788), [7791](../raw_map.tsv:7791), [7793](../raw_map.tsv:7793).


Issue tags: mixed_evidence

### rel_29__ent_347__ent_851

**All observed names:** Rangers → Stanley Cup (6)

Ordered IDs: Ent[ent_347] → Ent[ent_851]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2187](../raw_map.tsv:2187) | Rangers | Stanley Cup | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2189](../raw_map.tsv:2189) | Rangers | Stanley Cup | poss\|&lt;-poss&lt;-championship-&gt;nn-&gt;\|nn |
| [2192](../raw_map.tsv:2192) | Rangers | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2193](../raw_map.tsv:2193) | Rangers | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2195](../raw_map.tsv:2195) | Rangers | Stanley Cup | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2196](../raw_map.tsv:2196) | Rangers | Stanley Cup | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Rangers → Stanley Cup: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2187](../raw_map.tsv:2187), [2189](../raw_map.tsv:2189), [2192](../raw_map.tsv:2192), [2193](../raw_map.tsv:2193), [2195](../raw_map.tsv:2195), [2196](../raw_map.tsv:2196).


Issue tags: mixed_evidence

### rel_29__ent_561__ent_850

**All observed names:** Giants → Super Bowl (6)

Ordered IDs: Ent[ent_561] → Ent[ent_850]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2217](../raw_map.tsv:2217) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2220](../raw_map.tsv:2220) | Giants | Super Bowl | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |
| [2221](../raw_map.tsv:2221) | Giants | Super Bowl | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [3437](../raw_map.tsv:3437) | Giants | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [3440](../raw_map.tsv:3440) | Giants | Super Bowl | poss\|&lt;-poss&lt;-season-&gt;nn-&gt;\|nn |
| [3441](../raw_map.tsv:3441) | Giants | Super Bowl | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Giants → Super Bowl: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2217](../raw_map.tsv:2217), [2220](../raw_map.tsv:2220), [2221](../raw_map.tsv:2221), [3437](../raw_map.tsv:3437), [3440](../raw_map.tsv:3440), [3441](../raw_map.tsv:3441).


Issue tags: mixed_evidence

### rel_29__ent_980__ent_741

**All observed names:** Real Quiet → Kentucky Derby (6)

Ordered IDs: Ent[ent_980] → Ent[ent_741]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7736](../raw_map.tsv:7736) | Real Quiet | Kentucky Derby | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7737](../raw_map.tsv:7737) | Real Quiet | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7738](../raw_map.tsv:7738) | Real Quiet | Kentucky Derby | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7740](../raw_map.tsv:7740) | Real Quiet | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;finish-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7741](../raw_map.tsv:7741) | Real Quiet | Kentucky Derby | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7744](../raw_map.tsv:7744) | Real Quiet | Kentucky Derby | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-outrun-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Real Quiet → Kentucky Derby: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7736](../raw_map.tsv:7736), [7737](../raw_map.tsv:7737), [7738](../raw_map.tsv:7738), [7740](../raw_map.tsv:7740), [7741](../raw_map.tsv:7741), [7744](../raw_map.tsv:7744).


Issue tags: mixed_evidence

### rel_29__ent_740__ent_982

**All observed names:** Hansel → Preakness (5)

Ordered IDs: Ent[ent_740] → Ent[ent_982]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7754](../raw_map.tsv:7754) | Hansel | Preakness | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7755](../raw_map.tsv:7755) | Hansel | Preakness | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7756](../raw_map.tsv:7756) | Hansel | Preakness | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7760](../raw_map.tsv:7760) | Hansel | Preakness | poss\|&lt;-poss&lt;-victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7761](../raw_map.tsv:7761) | Hansel | Preakness | nsubj\|&lt;-nsubj&lt;-set-&gt;dep-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Hansel → Preakness: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7754](../raw_map.tsv:7754), [7755](../raw_map.tsv:7755), [7756](../raw_map.tsv:7756), [7760](../raw_map.tsv:7760), [7761](../raw_map.tsv:7761).


Issue tags: mixed_evidence

### rel_29__ent_739__ent_741

**All observed names:** Unbridled → Kentucky Derby (5)

Ordered IDs: Ent[ent_739] → Ent[ent_741]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7774](../raw_map.tsv:7774) | Unbridled | Kentucky Derby | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7775](../raw_map.tsv:7775) | Unbridled | Kentucky Derby | appos\|-&gt;appos-&gt;winner-&gt;nn-&gt;\|nn |
| [7776](../raw_map.tsv:7776) | Unbridled | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7777](../raw_map.tsv:7777) | Unbridled | Kentucky Derby | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7780](../raw_map.tsv:7780) | Unbridled | Kentucky Derby | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;son-&gt;prep-&gt;of-&gt;pobj-&gt;winner-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Unbridled → Kentucky Derby: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7774](../raw_map.tsv:7774), [7775](../raw_map.tsv:7775), [7776](../raw_map.tsv:7776), [7777](../raw_map.tsv:7777), [7780](../raw_map.tsv:7780).


Issue tags: mixed_evidence

### rel_29__ent_731__ent_982

**All observed names:** Tabasco Cat → Preakness (4)

Ordered IDs: Ent[ent_731] → Ent[ent_982]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7794](../raw_map.tsv:7794) | Tabasco Cat | Preakness | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7795](../raw_map.tsv:7795) | Tabasco Cat | Preakness | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7796](../raw_map.tsv:7796) | Tabasco Cat | Preakness | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7797](../raw_map.tsv:7797) | Tabasco Cat | Preakness | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Tabasco Cat → Preakness: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7794](../raw_map.tsv:7794), [7795](../raw_map.tsv:7795), [7796](../raw_map.tsv:7796), [7797](../raw_map.tsv:7797).


Issue tags: mixed_evidence

### rel_29__ent_991__ent_510

**All observed names:** Becker → Wimbledon (4)

Ordered IDs: Ent[ent_991] → Ent[ent_510]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7984](../raw_map.tsv:7984) | Becker | Wimbledon | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7985](../raw_map.tsv:7985) | Becker | Wimbledon | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7989](../raw_map.tsv:7989) | Becker | Wimbledon | tmod\|&lt;-tmod&lt;-draw-&gt;partmod-&gt;seek-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7992](../raw_map.tsv:7992) | Becker | Wimbledon | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-provide-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Becker → Wimbledon: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7984](../raw_map.tsv:7984), [7985](../raw_map.tsv:7985), [7989](../raw_map.tsv:7989), [7992](../raw_map.tsv:7992).


Issue tags: mixed_evidence

### rel_29__ent_309__ent_836

**All observed names:** Red Sox → World Series (3)

Ordered IDs: Ent[ent_309] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2197](../raw_map.tsv:2197) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2198](../raw_map.tsv:2198) | Red Sox | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2205](../raw_map.tsv:2205) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Red Sox → World Series: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2197](../raw_map.tsv:2197), [2198](../raw_map.tsv:2198), [2205](../raw_map.tsv:2205).


Issue tags: mixed_evidence

### rel_29__ent_321__ent_836

**All observed names:** Mets → World Series (3)

Ordered IDs: Ent[ent_321] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2207](../raw_map.tsv:2207) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2214](../raw_map.tsv:2214) | Mets | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [3476](../raw_map.tsv:3476) | Mets | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mets → World Series: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2207](../raw_map.tsv:2207), [2214](../raw_map.tsv:2214), [3476](../raw_map.tsv:3476).




### rel_29__ent_849__ent_850

**All observed names:** Patriots → Super Bowl (3)

Ordered IDs: Ent[ent_849] → Ent[ent_850]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2247](../raw_map.tsv:2247) | Patriots | Super Bowl | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2252](../raw_map.tsv:2252) | Patriots | Super Bowl | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2256](../raw_map.tsv:2256) | Patriots | Super Bowl | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Patriots → Super Bowl: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2247](../raw_map.tsv:2247), [2252](../raw_map.tsv:2252), [2256](../raw_map.tsv:2256).




### rel_29__ent_609__ent_836

**All observed names:** Marlins → World Series (3)

Ordered IDs: Ent[ent_609] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2258](../raw_map.tsv:2258) | Marlins | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [2260](../raw_map.tsv:2260) | Marlins | World Series | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [2266](../raw_map.tsv:2266) | Marlins | World Series | poss\|&lt;-poss&lt;-championship-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Marlins → World Series: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2258](../raw_map.tsv:2258), [2260](../raw_map.tsv:2260), [2266](../raw_map.tsv:2266).




### rel_29__ent_600__ent_836

**All observed names:** Cubs → World Series (3)

Ordered IDs: Ent[ent_600] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2267](../raw_map.tsv:2267) | Cubs | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2268](../raw_map.tsv:2268) | Cubs | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7765](../raw_map.tsv:7765) | Cubs | World Series | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Cubs → World Series: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [2267](../raw_map.tsv:2267), [2268](../raw_map.tsv:2268), [7765](../raw_map.tsv:7765).




### rel_29__ent_968__ent_981

**All observed names:** Mrs. Aung San Suu Kyi → Nobel Peace Prize (3)

Ordered IDs: Ent[ent_968] → Ent[ent_981]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7718](../raw_map.tsv:7718) | Mrs. Aung San Suu Kyi | Nobel Peace Prize | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7719](../raw_map.tsv:7719) | Mrs. Aung San Suu Kyi | Nobel Peace Prize | appos\|-&gt;appos-&gt;winner-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7720](../raw_map.tsv:7720) | Mrs. Aung San Suu Kyi | Nobel Peace Prize | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mrs. Aung San Suu Kyi → Nobel Peace Prize: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7718](../raw_map.tsv:7718), [7719](../raw_map.tsv:7719), [7720](../raw_map.tsv:7720).




### rel_29__ent_752__ent_510

**All observed names:** Pat Cash → Wimbledon (3)

Ordered IDs: Ent[ent_752] → Ent[ent_510]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7994](../raw_map.tsv:7994) | Pat Cash | Wimbledon | appos\|-&gt;appos-&gt;champion-&gt;nn-&gt;\|nn |
| [7995](../raw_map.tsv:7995) | Pat Cash | Wimbledon | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [7998](../raw_map.tsv:7998) | Pat Cash | Wimbledon | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Pat Cash → Wimbledon: At least one supplied row explicitly identifies a win, winner, championship, or champion of the named event/award. Participation, stage, and contextual paths are not needed for support.

Cited evidence lines: [7994](../raw_map.tsv:7994), [7995](../raw_map.tsv:7995), [7998](../raw_map.tsv:7998).



