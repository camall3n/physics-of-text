# audit_e318fe663470 — rel_86: participated in sporting event

Predicate ID: participated_in_sporting_event

Competitor or team X participated in sporting event or competition Y.

Includes: actual played-in, competed-in, or appeared-in a sporting event; being in an event when competitive participation is clear; a completed win or title in the event, which entails participation. Excludes: plans, hopes, or qualification without established participation; attendance as spectator; membership in a league without participation in the designated event; non-sporting events or geographic presence alone. Ambiguous unless resolved by case-local evidence: future or proposed participation; event occurrence or participant role unclear; a governing body or location substituted for an unresolved event. Participation does not require winning. Preserve defeated and winner_of as separate predicates where those meanings were declared.

Complete census: 0 supported, 2 incorrect, 1 ambiguous; N=3. Precision 0/3=0.00% to 1/3=33.33%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|-&gt;appos-&gt;member-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;member-&gt;rcmod-&gt;run-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-promote-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-recall-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-run&lt;-nsubj&lt;-decide-&gt;dobj-&gt;presidency-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;dep-&gt;material-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-outrun-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-close-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-challenge-&gt;prep-&gt;after-&gt;pobj-&gt;sweep-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;favorite-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;son-&gt;prep-&gt;of-&gt;pobj-&gt;winner-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-song&lt;-nsubj&lt;-set-&gt;prep-&gt;for-&gt;pobj-&gt;finish-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-song&lt;-pobj&lt;-out&lt;-prep&lt;-works-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;beat-&gt;prep-&gt;by-&gt;pobj-&gt;length-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_86__ent_739__ent_741

**All observed names:** Unbridled → Kentucky Derby (5); Real Quiet → Kentucky Derby (4)

Ordered IDs: Ent[ent_739] → Ent[ent_741]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7742](../raw_map.tsv:7742) | Real Quiet | Kentucky Derby | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-challenge-&gt;prep-&gt;after-&gt;pobj-&gt;sweep-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7743](../raw_map.tsv:7743) | Real Quiet | Kentucky Derby | pobj\|&lt;-pobj&lt;-on&lt;-prep&lt;-close-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7744](../raw_map.tsv:7744) | Real Quiet | Kentucky Derby | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-outrun-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7745](../raw_map.tsv:7745) | Real Quiet | Kentucky Derby | nsubjpass\|&lt;-nsubjpass&lt;-consider-&gt;dep-&gt;material-&gt;nn-&gt;\|nn |
| [7778](../raw_map.tsv:7778) | Unbridled | Kentucky Derby | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;favorite-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [7779](../raw_map.tsv:7779) | Unbridled | Kentucky Derby | rcmod\|-&gt;rcmod-&gt;beat-&gt;prep-&gt;by-&gt;pobj-&gt;length-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7780](../raw_map.tsv:7780) | Unbridled | Kentucky Derby | poss\|&lt;-poss&lt;-song-&gt;appos-&gt;son-&gt;prep-&gt;of-&gt;pobj-&gt;winner-&gt;nn-&gt;\|nn |
| [7782](../raw_map.tsv:7782) | Unbridled | Kentucky Derby | poss\|&lt;-poss&lt;-song&lt;-pobj&lt;-out&lt;-prep&lt;-works-&gt;appos-&gt;\|appos |
| [7783](../raw_map.tsv:7783) | Unbridled | Kentucky Derby | poss\|&lt;-poss&lt;-song&lt;-nsubj&lt;-set-&gt;prep-&gt;for-&gt;pobj-&gt;finish-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Unbridled → Kentucky Derby; Real Quiet → Kentucky Derby: Sporting outcome evidence merges Real Quiet with Unbridled, and Unbridled's Song fragments leave horse/parent identity unresolved.

Cited evidence lines: [7742](../raw_map.tsv:7742), [7743](../raw_map.tsv:7743), [7744](../raw_map.tsv:7744), [7745](../raw_map.tsv:7745), [7778](../raw_map.tsv:7778), [7779](../raw_map.tsv:7779), [7780](../raw_map.tsv:7780), [7782](../raw_map.tsv:7782), [7783](../raw_map.tsv:7783).

**Review question:** Which horse actually participated, and should Real Quiet and Unbridled/Unbridled's Song be separate?
Issue tags: entity_collision, truncated_argument

### rel_86__ent_494__ent_333

**All observed names:** Ruth W. Messinger → Manhattan (3)

Ordered IDs: Ent[ent_494] → Ent[ent_333]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2818](../raw_map.tsv:2818) | Ruth W. Messinger | Manhattan | appos\|-&gt;appos-&gt;member-&gt;rcmod-&gt;run-&gt;prep-&gt;for-&gt;pobj-&gt;president-&gt;nn-&gt;\|nn |
| [2819](../raw_map.tsv:2819) | Ruth W. Messinger | Manhattan | appos\|-&gt;appos-&gt;member-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [2820](../raw_map.tsv:2820) | Ruth W. Messinger | Manhattan | nsubj\|&lt;-nsubj&lt;-run&lt;-nsubj&lt;-decide-&gt;dobj-&gt;presidency-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Ruth W. Messinger → Manhattan: Political office candidacy or player recall does not establish sporting-event participation by the first argument.

Cited evidence lines: [2818](../raw_map.tsv:2818), [2819](../raw_map.tsv:2819), [2820](../raw_map.tsv:2820).




### rel_86__ent_12__ent_735

**All observed names:** Yankees → Class AAA Columbus (2)

Ordered IDs: Ent[ent_12] → Ent[ent_735]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7916](../raw_map.tsv:7916) | Yankees | Class AAA Columbus | nsubj\|&lt;-nsubj&lt;-recall-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [7917](../raw_map.tsv:7917) | Yankees | Class AAA Columbus | nsubj\|&lt;-nsubj&lt;-promote-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Yankees → Class AAA Columbus: Political office candidacy or player recall does not establish sporting-event participation by the first argument.

Cited evidence lines: [7916](../raw_map.tsv:7916), [7917](../raw_map.tsv:7917).



