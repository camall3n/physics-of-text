# audit_06dbdb9b03af — rel_27: winner or champion of

Predicate ID: winner_of

Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title.

Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

Complete census: 1 supported, 0 incorrect, 2 ambiguous; N=3. Precision 1/3=33.33% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;group-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| 1 | dep\|-&gt;dep-&gt;award-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-dwell-&gt;prep-&gt;on-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-member&lt;-appos&lt;-group-&gt;rcmod-&gt;award-&gt;dobj-&gt;\|dobj |

## Every evaluated fact

### rel_27__ent_110__ent_851

**All observed names:** Devils → Stanley Cup (4)

Ordered IDs: Ent[ent_110] → Ent[ent_851]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2234](../raw_map.tsv:2234) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7733](../raw_map.tsv:7733) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |
| [8042](../raw_map.tsv:8042) | Devils | Stanley Cup | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [8046](../raw_map.tsv:8046) | Devils | Stanley Cup | dobj\|&lt;-dobj&lt;-coach-&gt;prep-&gt;to-&gt;pobj-&gt;championship-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Devils → Stanley Cup: Explicit Stanley Cup win and coaching the team to the designated championship establish winning the title.

Cited evidence lines: [2234](../raw_map.tsv:2234), [7733](../raw_map.tsv:7733), [8042](../raw_map.tsv:8042), [8046](../raw_map.tsv:8046).




### rel_27__ent_983__ent_981

**All observed names:** Prevention of Nuclear War → Nobel Peace Prize (4)

Ordered IDs: Ent[ent_983] → Ent[ent_981]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7746](../raw_map.tsv:7746) | Prevention of Nuclear War | Nobel Peace Prize | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7748](../raw_map.tsv:7748) | Prevention of Nuclear War | Nobel Peace Prize | dep\|-&gt;dep-&gt;award-&gt;dobj-&gt;\|dobj |
| [7749](../raw_map.tsv:7749) | Prevention of Nuclear War | Nobel Peace Prize | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-member&lt;-appos&lt;-group-&gt;rcmod-&gt;award-&gt;dobj-&gt;\|dobj |
| [7753](../raw_map.tsv:7753) | Prevention of Nuclear War | Nobel Peace Prize | appos\|-&gt;appos-&gt;group-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Prevention of Nuclear War → Nobel Peace Prize: Winning the Nobel Peace Prize is explicit, but Prevention of Nuclear War is a materially incomplete organization name whose full recipient identity is unresolved.

Cited evidence lines: [7746](../raw_map.tsv:7746), [7748](../raw_map.tsv:7748), [7749](../raw_map.tsv:7749), [7753](../raw_map.tsv:7753).

**Review question:** What is the full name of the prize-winning organization truncated to Prevention of Nuclear War?
Issue tags: argument_identity

### rel_27__ent_726__ent_607

**All observed names:** Scot → Masters (2)

Ordered IDs: Ent[ent_726] → Ent[ent_607]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7716](../raw_map.tsv:7716) | Scot | Masters | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;\|dobj |
| [7717](../raw_map.tsv:7717) | Scot | Masters | nsubj\|&lt;-nsubj&lt;-dwell-&gt;prep-&gt;on-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Scot → Masters: Winning the Masters is explicit but Scot identifies nationality rather than the particular winning person.

Cited evidence lines: [7716](../raw_map.tsv:7716), [7717](../raw_map.tsv:7717).

**Review question:** Which person is the Scot named as the Masters winner?
Issue tags: argument_identity
