# audit_9c88162c7b22 — rel_90: participated in sporting event

Predicate ID: participated_in_sporting_event

Competitor or team X participated in sporting event or competition Y.

Includes: actual played-in, competed-in, or appeared-in a sporting event; being in an event when competitive participation is clear; a completed win or title in the event, which entails participation. Excludes: plans, hopes, or qualification without established participation; attendance as spectator; membership in a league without participation in the designated event; non-sporting events or geographic presence alone. Ambiguous unless resolved by case-local evidence: future or proposed participation; event occurrence or participant role unclear; a governing body or location substituted for an unresolved event. Participation does not require winning. Preserve defeated and winner_of as separate predicates where those meanings were declared.

Complete census: 5 supported, 8 incorrect, 0 ambiguous; N=13. Precision 5/13=38.46% to 5/13=38.46%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 17 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 10 | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| 5 | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| 2 | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-sweep-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;place-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;view-&gt;dep-&gt;\|dep |
| 1 | nsubj\|&lt;-nsubj&lt;-maintain-&gt;dobj-&gt;lead-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-dep&lt;-ahead&lt;-advmod&lt;-game-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;tie-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_90__ent_1004__ent_836

**All observed names:** Yankees → World Series (8)

Ordered IDs: Ent[ent_1004] → Ent[ent_836]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2177](../raw_map.tsv:2177) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2179](../raw_map.tsv:2179) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2180](../raw_map.tsv:2180) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2183](../raw_map.tsv:2183) | Yankees | World Series | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |
| [2693](../raw_map.tsv:2693) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2695](../raw_map.tsv:2695) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2696](../raw_map.tsv:2696) | Yankees | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2699](../raw_map.tsv:2699) | Yankees | World Series | poss\|&lt;-poss&lt;-victory-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Yankees → World Series: Explicit competition participation, win/loss or competitive standings establishes participation in the designated sporting competition.

Cited evidence lines: [2177](../raw_map.tsv:2177), [2179](../raw_map.tsv:2179), [2180](../raw_map.tsv:2180), [2183](../raw_map.tsv:2183), [2693](../raw_map.tsv:2693), [2695](../raw_map.tsv:2695), [2696](../raw_map.tsv:2696), [2699](../raw_map.tsv:2699).




### rel_90__ent_1004__ent_9

**All observed names:** Yankees → American League East (5)

Ordered IDs: Ent[ent_1004] → Ent[ent_9]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2735](../raw_map.tsv:2735) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2739](../raw_map.tsv:2739) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2740](../raw_map.tsv:2740) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;place-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2741](../raw_map.tsv:2741) | Yankees | American League East | pobj\|&lt;-pobj&lt;-of&lt;-dep&lt;-ahead&lt;-advmod&lt;-game-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2742](../raw_map.tsv:2742) | Yankees | American League East | nsubj\|&lt;-nsubj&lt;-maintain-&gt;dobj-&gt;lead-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankees → American League East: Explicit competition participation, win/loss or competitive standings establishes participation in the designated sporting competition.

Cited evidence lines: [2735](../raw_map.tsv:2735), [2739](../raw_map.tsv:2739), [2740](../raw_map.tsv:2740), [2741](../raw_map.tsv:2741), [2742](../raw_map.tsv:2742).


Issue tags: broad_predicate

### rel_90__ent_6__ent_586

**All observed names:** Bill Clinton → White House (4)

Ordered IDs: Ent[ent_6] → Ent[ent_586]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2713](../raw_map.tsv:2713) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2714](../raw_map.tsv:2714) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2720](../raw_map.tsv:2720) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [2721](../raw_map.tsv:2721) | Bill Clinton | White House | dobj\|&lt;-dobj&lt;-sweep-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bill Clinton → White House: The White House rows concern political office or control, outside sporting participation.

Cited evidence lines: [2713](../raw_map.tsv:2713), [2714](../raw_map.tsv:2714), [2720](../raw_map.tsv:2720), [2721](../raw_map.tsv:2721).


Issue tags: wrong_domain

### rel_90__ent_816__ent_586

**All observed names:** Republicans → White House (4)

Ordered IDs: Ent[ent_816] → Ent[ent_586]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2775](../raw_map.tsv:2775) | Republicans | White House | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;tie-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2776](../raw_map.tsv:2776) | Republicans | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2780](../raw_map.tsv:2780) | Republicans | White House | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2781](../raw_map.tsv:2781) | Republicans | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Republicans → White House: The White House rows concern political office or control, outside sporting participation.

Cited evidence lines: [2775](../raw_map.tsv:2775), [2776](../raw_map.tsv:2776), [2780](../raw_map.tsv:2780), [2781](../raw_map.tsv:2781).


Issue tags: wrong_domain

### rel_90__ent_600__ent_836

**All observed names:** Cubs → World Series (3)

Ordered IDs: Ent[ent_600] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2267](../raw_map.tsv:2267) | Cubs | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2269](../raw_map.tsv:2269) | Cubs | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7766](../raw_map.tsv:7766) | Cubs | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Cubs → World Series: Explicit competition participation, win/loss or competitive standings establishes participation in the designated sporting competition.

Cited evidence lines: [2267](../raw_map.tsv:2267), [2269](../raw_map.tsv:2269), [7766](../raw_map.tsv:7766).




### rel_90__ent_251__ent_586

**All observed names:** John F. Kennedy → White House (3)

Ordered IDs: Ent[ent_251] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2743](../raw_map.tsv:2743) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2746](../raw_map.tsv:2746) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2748](../raw_map.tsv:2748) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). John F. Kennedy → White House: The White House rows concern political office or control, outside sporting participation.

Cited evidence lines: [2743](../raw_map.tsv:2743), [2746](../raw_map.tsv:2746), [2748](../raw_map.tsv:2748).


Issue tags: wrong_domain

### rel_90__ent_182__ent_1002

**All observed names:** Mr. Bush → Washington (3)

Ordered IDs: Ent[ent_182] → Ent[ent_1002]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4101](../raw_map.tsv:4101) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5243](../raw_map.tsv:5243) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7348](../raw_map.tsv:7348) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Washington: Geographic presence in Washington, Manhattan or Vietnam is not sporting-event participation.

Cited evidence lines: [4101](../raw_map.tsv:4101), [5243](../raw_map.tsv:5243), [7348](../raw_map.tsv:7348).


Issue tags: wrong_argument_type

### rel_90__ent_819__ent_586

**All observed names:** Democrats → White House (3)

Ordered IDs: Ent[ent_819] → Ent[ent_586]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6426](../raw_map.tsv:6426) | Democrats | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [6431](../raw_map.tsv:6431) | Democrats | White House | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [6433](../raw_map.tsv:6433) | Democrats | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → White House: The White House rows concern political office or control, outside sporting participation.

Cited evidence lines: [6426](../raw_map.tsv:6426), [6431](../raw_map.tsv:6431), [6433](../raw_map.tsv:6433).


Issue tags: wrong_domain

### rel_90__ent_309__ent_836

**All observed names:** Red Sox → World Series (2)

Ordered IDs: Ent[ent_309] → Ent[ent_836]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2201](../raw_map.tsv:2201) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-lose-&gt;dobj-&gt;\|dobj |
| [2202](../raw_map.tsv:2202) | Red Sox | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Red Sox → World Series: Explicit competition participation, win/loss or competitive standings establishes participation in the designated sporting competition.

Cited evidence lines: [2201](../raw_map.tsv:2201), [2202](../raw_map.tsv:2202).




### rel_90__ent_609__ent_836

**All observed names:** Marlins → World Series (2)

Ordered IDs: Ent[ent_609] → Ent[ent_836]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2257](../raw_map.tsv:2257) | Marlins | World Series | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |
| [2263](../raw_map.tsv:2263) | Marlins | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Marlins → World Series: Explicit competition participation, win/loss or competitive standings establishes participation in the designated sporting competition.

Cited evidence lines: [2257](../raw_map.tsv:2257), [2263](../raw_map.tsv:2263).




### rel_90__ent_8__ent_333

**All observed names:** Addresses → Manhattan (2)

Ordered IDs: Ent[ent_8] → Ent[ent_333]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2691](../raw_map.tsv:2691) | Addresses | Manhattan | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2692](../raw_map.tsv:2692) | Addresses | Manhattan | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;view-&gt;dep-&gt;\|dep |

**Judgment: incorrect** (primary). Addresses → Manhattan: Geographic presence in Washington, Manhattan or Vietnam is not sporting-event participation.

Cited evidence lines: [2691](../raw_map.tsv:2691), [2692](../raw_map.tsv:2692).


Issue tags: wrong_argument_type

### rel_90__ent_7__ent_586

**All observed names:** Democrat → White House (2)

Ordered IDs: Ent[ent_7] → Ent[ent_586]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2703](../raw_map.tsv:2703) | Democrat | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2704](../raw_map.tsv:2704) | Democrat | White House | nsubj\|&lt;-nsubj&lt;-win-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Democrat → White House: The White House rows concern political office or control, outside sporting participation.

Cited evidence lines: [2703](../raw_map.tsv:2703), [2704](../raw_map.tsv:2704).


Issue tags: wrong_domain

### rel_90__ent_669__ent_989

**All observed names:** Americans → Vietnam (1)

Ordered IDs: Ent[ent_669] → Ent[ent_989]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8174](../raw_map.tsv:8174) | Americans | Vietnam | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Americans → Vietnam: Geographic presence in Washington, Manhattan or Vietnam is not sporting-event participation.

Cited evidence lines: [8174](../raw_map.tsv:8174).


Issue tags: wrong_argument_type
