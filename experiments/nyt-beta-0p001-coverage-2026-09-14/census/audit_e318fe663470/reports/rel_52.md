# audit_e318fe663470 — rel_52: directed communication to

Predicate ID: communicates_to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

Complete census: 6 supported, 6 incorrect, 0 ambiguous; N=12. Precision 6/12=50.00% to 6/12=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| 5 | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-step-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | amod\|&lt;-amod&lt;-serviceman-&gt;partmod-&gt;station-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-call-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-rape-&gt;dobj-&gt;woman-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-share-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-sign-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-press-&gt;prep-&gt;in-&gt;pobj-&gt;struggle-&gt;advmod-&gt;now-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-resignation-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |

## Every evaluated fact

### rel_52__ent_157__ent_189

**All observed names:** Mr. Bush → Congress (3); Bush → Congress (1)

Ordered IDs: Ent[ent_157] → Ent[ent_189]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [463](../raw_map.tsv:463) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |
| [2002](../raw_map.tsv:2002) | Bush | Congress | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| [2040](../raw_map.tsv:2040) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |
| [7873](../raw_map.tsv:7873) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Bush → Congress; Bush → Congress: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [463](../raw_map.tsv:463), [2002](../raw_map.tsv:2002), [2040](../raw_map.tsv:2040), [7873](../raw_map.tsv:7873).




### rel_52__ent_267__ent_1197

**All observed names:** Trent Lott → Senate (4)

Ordered IDs: Ent[ent_267] → Ent[ent_1197]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3035](../raw_map.tsv:3035) | Trent Lott | Senate | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| [3037](../raw_map.tsv:3037) | Trent Lott | Senate | poss\|&lt;-poss&lt;-resignation-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| [3040](../raw_map.tsv:3040) | Trent Lott | Senate | nsubj\|&lt;-nsubj&lt;-step-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| [3042](../raw_map.tsv:3042) | Trent Lott | Senate | nsubj\|&lt;-nsubj&lt;-share-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Trent Lott → Senate: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [3035](../raw_map.tsv:3035), [3037](../raw_map.tsv:3037), [3040](../raw_map.tsv:3040), [3042](../raw_map.tsv:3042).




### rel_52__ent_1319__ent_1239

**All observed names:** Mr. Clinton → Congress (3)

Ordered IDs: Ent[ent_1319] → Ent[ent_1239]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2042](../raw_map.tsv:2042) | Mr. Clinton | Congress | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| [2046](../raw_map.tsv:2046) | Mr. Clinton | Congress | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |
| [7925](../raw_map.tsv:7925) | Mr. Clinton | Congress | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Clinton → Congress: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [2042](../raw_map.tsv:2042), [2046](../raw_map.tsv:2046), [7925](../raw_map.tsv:7925).




### rel_52__ent_354__ent_595

**All observed names:** Torre → Williams (2)

Ordered IDs: Ent[ent_354] → Ent[ent_595]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1539](../raw_map.tsv:1539) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| [1543](../raw_map.tsv:1543) | Torre | Williams | nsubj\|&lt;-nsubj&lt;-call-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Torre → Williams: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [1539](../raw_map.tsv:1539), [1543](../raw_map.tsv:1543).




### rel_52__ent_1294__ent_1107

**All observed names:** Clinton → Congress (2)

Ordered IDs: Ent[ent_1294] → Ent[ent_1107]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2022](../raw_map.tsv:2022) | Clinton | Congress | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |
| [7898](../raw_map.tsv:7898) | Clinton | Congress | nsubj\|&lt;-nsubj&lt;-persuade-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Clinton → Congress: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [2022](../raw_map.tsv:2022), [7898](../raw_map.tsv:7898).




### rel_52__ent_267__ent_1269

**All observed names:** Trent Lott → Republican (2)

Ordered IDs: Ent[ent_267] → Ent[ent_1269]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3764](../raw_map.tsv:3764) | Trent Lott | Republican | nsubj\|&lt;-nsubj&lt;-step-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |
| [3765](../raw_map.tsv:3765) | Trent Lott | Republican | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;leader-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Trent Lott → Republican: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [3764](../raw_map.tsv:3764), [3765](../raw_map.tsv:3765).




### rel_52__ent_1217__ent_451

**All observed names:** Israel → Egypt (2)

Ordered IDs: Ent[ent_1217] → Ent[ent_451]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5191](../raw_map.tsv:5191) | Israel | Egypt | nsubj\|&lt;-nsubj&lt;-sign-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5193](../raw_map.tsv:5193) | Israel | Egypt | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Israel → Egypt: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [5191](../raw_map.tsv:5191), [5193](../raw_map.tsv:5193).


Issue tags: mixed_evidence

### rel_52__ent_182__ent_1107

**All observed names:** Mr. Bush → Congress (1)

Ordered IDs: Ent[ent_182] → Ent[ent_1107]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [455](../raw_map.tsv:455) | Mr. Bush | Congress | nsubj\|&lt;-nsubj&lt;-ask-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Bush → Congress: A local ask/persuade/call construction explicitly directs communication to the named addressee; Bush/Mr. Bush is a compatible surface variant.

Cited evidence lines: [455](../raw_map.tsv:455).




### rel_52__ent_829__ent_189

**All observed names:** Clinton Administration → Congress (1)

Ordered IDs: Ent[ent_829] → Ent[ent_189]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2070](../raw_map.tsv:2070) | Clinton Administration | Congress | nsubjpass\|&lt;-nsubjpass&lt;-press-&gt;prep-&gt;in-&gt;pobj-&gt;struggle-&gt;advmod-&gt;now-&gt;prep-&gt;before-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Clinton Administration → Congress: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [2070](../raw_map.tsv:2070).




### rel_52__ent_311__ent_835

**All observed names:** American → England (1)

Ordered IDs: Ent[ent_311] → Ent[ent_835]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2166](../raw_map.tsv:2166) | American | England | amod\|&lt;-amod&lt;-serviceman-&gt;partmod-&gt;station-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). American → England: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [2166](../raw_map.tsv:2166).




### rel_52__ent_1325__ent_980

**All observed names:** Richard Jefferson → Nets (1)

Ordered IDs: Ent[ent_1325] → Ent[ent_980]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3100](../raw_map.tsv:3100) | Richard Jefferson | Nets | rcmod\|-&gt;rcmod-&gt;rebound-&gt;amod-&gt;shy-&gt;prep-&gt;of-&gt;pobj-&gt;triple-double-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Richard Jefferson → Nets: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [3100](../raw_map.tsv:3100).




### rel_52__ent_562__ent_675

**All observed names:** Mr. Smith → Washington (1)

Ordered IDs: Ent[ent_562] → Ent[ent_675]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3411](../raw_map.tsv:3411) | Mr. Smith | Washington | nsubj\|&lt;-nsubj&lt;-rape-&gt;dobj-&gt;woman-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Smith → Washington: Leadership resignation, a struggle before Congress, military location, sports or assault does not assert the stated directed communication.

Cited evidence lines: [3411](../raw_map.tsv:3411).



