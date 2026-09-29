# audit_e318fe663470 — rel_10: departed from

Predicate ID: departed_from

Person, group or organization X physically leaves or withdraws from geographic place Y.

Includes: leave/withdraw/pull out from Y; historical physical departure. Excludes: arrival/return to Y; residence alone; leaving a job or team as an institution without geography. Ambiguous unless resolved by case-local evidence: place versus institution as source; explicitly conditional departure.

Complete census: 7 supported, 4 incorrect, 1 ambiguous; N=12. Precision 7/12=58.33% to 8/12=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 8 | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-occupy-&gt;dobj-&gt;\|dobj |
| 2 | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | amod\|&lt;-amod&lt;-challenger-&gt;appos-&gt;\|appos |
| 1 | dobj\|&lt;-dobj&lt;-sweep-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-seal-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-performance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;speaker-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;over-&gt;pobj-&gt;planning-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;relocate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_10__ent_6__ent_586

**All observed names:** Bill Clinton → White House (4)

Ordered IDs: Ent[ent_6] → Ent[ent_586]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2717](../raw_map.tsv:2717) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [2718](../raw_map.tsv:2718) | Bill Clinton | White House | poss\|&lt;-poss&lt;-performance-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2719](../raw_map.tsv:2719) | Bill Clinton | White House | nsubj\|&lt;-nsubj&lt;-occupy-&gt;dobj-&gt;\|dobj |
| [2721](../raw_map.tsv:2721) | Bill Clinton | White House | dobj\|&lt;-dobj&lt;-sweep-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Bill Clinton → White House: Leave/occupy White House can denote leaving political office rather than physical departure.

Cited evidence lines: [2717](../raw_map.tsv:2717), [2718](../raw_map.tsv:2718), [2719](../raw_map.tsv:2719), [2721](../raw_map.tsv:2721).

**Review question:** Does leave White House here mean physical departure or the end of office?
Issue tags: institution_place_ambiguity

### rel_10__ent_1162__ent_226

**All observed names:** Mr. bin Laden → Sudan (3)

Ordered IDs: Ent[ent_1162] → Ent[ent_226]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6145](../raw_map.tsv:6145) | Mr. bin Laden | Sudan | nsubj\|&lt;-nsubj&lt;-live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6148](../raw_map.tsv:6148) | Mr. bin Laden | Sudan | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [6150](../raw_map.tsv:6150) | Mr. bin Laden | Sudan | rcmod\|-&gt;rcmod-&gt;relocate-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. bin Laden → Sudan: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [6145](../raw_map.tsv:6145), [6148](../raw_map.tsv:6148), [6150](../raw_map.tsv:6150).


Issue tags: mixed_evidence

### rel_10__ent_1335__ent_323

**All observed names:** Dodgers → Brooklyn (2)

Ordered IDs: Ent[ent_1335] → Ent[ent_323]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4054](../raw_map.tsv:4054) | Dodgers | Brooklyn | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [4055](../raw_map.tsv:4055) | Dodgers | Brooklyn | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Dodgers → Brooklyn: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4054](../raw_map.tsv:4054), [4055](../raw_map.tsv:4055).




### rel_10__ent_157__ent_1002

**All observed names:** Mr. Bush → Washington (2)

Ordered IDs: Ent[ent_157] → Ent[ent_1002]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4095](../raw_map.tsv:4095) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [5237](../raw_map.tsv:5237) | Mr. Bush | Washington | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Bush → Washington: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4095](../raw_map.tsv:4095), [5237](../raw_map.tsv:5237).




### rel_10__ent_1217__ent_1309

**All observed names:** Israel → Gaza (2)

Ordered IDs: Ent[ent_1217] → Ent[ent_1309]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4106](../raw_map.tsv:4106) | Israel | Gaza | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [4110](../raw_map.tsv:4110) | Israel | Gaza | nsubj\|&lt;-nsubj&lt;-seal-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Israel → Gaza: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4106](../raw_map.tsv:4106), [4110](../raw_map.tsv:4110).


Issue tags: mixed_evidence

### rel_10__ent_7__ent_965

**All observed names:** Democrat → White House (1)

Ordered IDs: Ent[ent_7] → Ent[ent_965]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2708](../raw_map.tsv:2708) | Democrat | White House | nsubj\|&lt;-nsubj&lt;-occupy-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Democrat → White House: Occupation, a speaker role, party planning or a challenger appositive does not establish physical departure.

Cited evidence lines: [2708](../raw_map.tsv:2708).




### rel_10__ent_68__ent_716

**All observed names:** Representative Richard A. Gephardt → House (1)

Ordered IDs: Ent[ent_68] → Ent[ent_716]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3050](../raw_map.tsv:3050) | Representative Richard A. Gephardt | House | prep\|-&gt;prep-&gt;as-&gt;pobj-&gt;speaker-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Representative Richard A. Gephardt → House: Occupation, a speaker role, party planning or a challenger appositive does not establish physical departure.

Cited evidence lines: [3050](../raw_map.tsv:3050).




### rel_10__ent_1004__ent_572

**All observed names:** Yankees → Bronx (1)

Ordered IDs: Ent[ent_1004] → Ent[ent_572]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4045](../raw_map.tsv:4045) | Yankees | Bronx | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Yankees → Bronx: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4045](../raw_map.tsv:4045).




### rel_10__ent_817__ent_572

**All observed names:** Yankees → Bronx (1)

Ordered IDs: Ent[ent_817] → Ent[ent_572]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4052](../raw_map.tsv:4052) | Yankees | Bronx | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Yankees → Bronx: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4052](../raw_map.tsv:4052).




### rel_10__ent_199__ent_1103

**All observed names:** Soviets → Afghanistan (1)

Ordered IDs: Ent[ent_199] → Ent[ent_1103]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4115](../raw_map.tsv:4115) | Soviets | Afghanistan | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Soviets → Afghanistan: An unqualified leave-place row establishes physical departure or withdrawal from the geographic location.

Cited evidence lines: [4115](../raw_map.tsv:4115).




### rel_10__ent_1213__ent_767

**All observed names:** Republicans → Bush (1)

Ordered IDs: Ent[ent_1213] → Ent[ent_767]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7558](../raw_map.tsv:7558) | Republicans | Bush | prep\|-&gt;prep-&gt;over-&gt;pobj-&gt;planning-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Republicans → Bush: Occupation, a speaker role, party planning or a challenger appositive does not establish physical departure.

Cited evidence lines: [7558](../raw_map.tsv:7558).




### rel_10__ent_1322__ent_1292

**All observed names:** Republican → Bob Dole (1)

Ordered IDs: Ent[ent_1322] → Ent[ent_1292]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7710](../raw_map.tsv:7710) | Republican | Bob Dole | amod\|&lt;-amod&lt;-challenger-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Republican → Bob Dole: Occupation, a speaker role, party planning or a challenger appositive does not establish physical departure.

Cited evidence lines: [7710](../raw_map.tsv:7710).



