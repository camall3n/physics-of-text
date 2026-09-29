# audit_e318fe663470 — rel_58: directed communication to

Predicate ID: communicates_to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

Complete census: 9 supported, 5 incorrect, 0 ambiguous; N=14. Precision 9/14=64.29% to 9/14=64.29%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 4 | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |
| 2 | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-continue-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-deny-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-different-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;to-&gt;pobj-&gt;counsel-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-vulnerable-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;finance-&gt;dobj-&gt;re-election-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-floor&lt;-pobj&lt;-on&lt;-prep&lt;-announce-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-flow-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-lawyer-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-tax&lt;-nsubj&lt;-draw-&gt;dobj-&gt;attack-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_58__ent_183__ent_189

**All observed names:** Administration → Congress (4)

Ordered IDs: Ent[ent_183] → Ent[ent_189]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [446](../raw_map.tsv:446) | Administration | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [447](../raw_map.tsv:447) | Administration | Congress | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |
| [2013](../raw_map.tsv:2013) | Administration | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [2014](../raw_map.tsv:2014) | Administration | Congress | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Administration → Congress: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [446](../raw_map.tsv:446), [447](../raw_map.tsv:447), [2013](../raw_map.tsv:2013), [2014](../raw_map.tsv:2014).




### rel_58__ent_44__ent_43

**All observed names:** Mr. Gotti → Bruce Cutler (4)

Ordered IDs: Ent[ent_44] → Ent[ent_43]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3802](../raw_map.tsv:3802) | Mr. Gotti | Bruce Cutler | poss\|&lt;-poss&lt;-lawyer-&gt;dep-&gt;\|dep |
| [3804](../raw_map.tsv:3804) | Mr. Gotti | Bruce Cutler | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [3805](../raw_map.tsv:3805) | Mr. Gotti | Bruce Cutler | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;to-&gt;pobj-&gt;counsel-&gt;appos-&gt;\|appos |
| [3806](../raw_map.tsv:3806) | Mr. Gotti | Bruce Cutler | nsubj\|&lt;-nsubj&lt;-deny-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Mr. Gotti → Bruce Cutler: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [3802](../raw_map.tsv:3802), [3804](../raw_map.tsv:3804), [3805](../raw_map.tsv:3805), [3806](../raw_map.tsv:3806).


Issue tags: mixed_evidence

### rel_58__ent_182__ent_424

**All observed names:** Mr. Bush → Democrats (3)

Ordered IDs: Ent[ent_182] → Ent[ent_424]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5559](../raw_map.tsv:5559) | Mr. Bush | Democrats | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [5562](../raw_map.tsv:5562) | Mr. Bush | Democrats | poss\|&lt;-poss&lt;-tax&lt;-nsubj&lt;-draw-&gt;dobj-&gt;attack-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [5563](../raw_map.tsv:5563) | Mr. Bush | Democrats | nsubj\|&lt;-nsubj&lt;-vulnerable-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Bush → Democrats: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [5559](../raw_map.tsv:5559), [5562](../raw_map.tsv:5562), [5563](../raw_map.tsv:5563).


Issue tags: mixed_evidence

### rel_58__ent_829__ent_1107

**All observed names:** Clinton Administration → Congress (2)

Ordered IDs: Ent[ent_829] → Ent[ent_1107]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2063](../raw_map.tsv:2063) | Clinton Administration | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [2064](../raw_map.tsv:2064) | Clinton Administration | Congress | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Clinton Administration → Congress: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [2063](../raw_map.tsv:2063), [2064](../raw_map.tsv:2064).




### rel_58__ent_228__ent_489

**All observed names:** Louis Farrakhan → Nation of Islam (2)

Ordered IDs: Ent[ent_228] → Ent[ent_489]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2945](../raw_map.tsv:2945) | Louis Farrakhan | Nation of Islam | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4967](../raw_map.tsv:4967) | Louis Farrakhan | Nation of Islam | appos\|-&gt;appos-&gt;minister-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Louis Farrakhan → Nation of Islam: Minister status, inverse leadership, difference, migration flow or a coaching relationship does not establish the stated communication direction.

Cited evidence lines: [2945](../raw_map.tsv:2945), [4967](../raw_map.tsv:4967).




### rel_58__ent_819__ent_1294

**All observed names:** Democrats → Clinton (2)

Ordered IDs: Ent[ent_819] → Ent[ent_1294]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7578](../raw_map.tsv:7578) | Democrats | Clinton | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [7581](../raw_map.tsv:7581) | Democrats | Clinton | partmod\|-&gt;partmod-&gt;finance-&gt;dobj-&gt;re-election-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Democrats → Clinton: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [7578](../raw_map.tsv:7578), [7581](../raw_map.tsv:7581).


Issue tags: mixed_evidence

### rel_58__ent_1321__ent_969

**All observed names:** Senate → Bill Frist (2)

Ordered IDs: Ent[ent_1321] → Ent[ent_969]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7668](../raw_map.tsv:7668) | Senate | Bill Frist | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-floor&lt;-pobj&lt;-on&lt;-prep&lt;-announce-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7674](../raw_map.tsv:7674) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-nsubj&lt;-continue-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Senate → Bill Frist: Minister status, inverse leadership, difference, migration flow or a coaching relationship does not establish the stated communication direction.

Cited evidence lines: [7668](../raw_map.tsv:7668), [7674](../raw_map.tsv:7674).




### rel_58__ent_196__ent_109

**All observed names:** Bush Administration → Congress (1)

Ordered IDs: Ent[ent_196] → Ent[ent_109]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [466](../raw_map.tsv:466) | Bush Administration | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Bush Administration → Congress: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [466](../raw_map.tsv:466).




### rel_58__ent_1321__ent_1046

**All observed names:** Senate → House (1)

Ordered IDs: Ent[ent_1321] → Ent[ent_1046]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1939](../raw_map.tsv:1939) | Senate | House | nsubj\|&lt;-nsubj&lt;-different-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Senate → House: Minister status, inverse leadership, difference, migration flow or a coaching relationship does not establish the stated communication direction.

Cited evidence lines: [1939](../raw_map.tsv:1939).




### rel_58__ent_1231__ent_587

**All observed names:** Russia → United States (1)

Ordered IDs: Ent[ent_1231] → Ent[ent_587]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1990](../raw_map.tsv:1990) | Russia | United States | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Russia → United States: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [1990](../raw_map.tsv:1990).




### rel_58__ent_586__ent_1310

**All observed names:** White House → Congress (1)

Ordered IDs: Ent[ent_586] → Ent[ent_1310]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2056](../raw_map.tsv:2056) | White House | Congress | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). White House → Congress: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [2056](../raw_map.tsv:2056).




### rel_58__ent_823__ent_905

**All observed names:** Mexicans → United States (1)

Ordered IDs: Ent[ent_823] → Ent[ent_905]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2131](../raw_map.tsv:2131) | Mexicans | United States | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-flow-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mexicans → United States: Minister status, inverse leadership, difference, migration flow or a coaching relationship does not establish the stated communication direction.

Cited evidence lines: [2131](../raw_map.tsv:2131).




### rel_58__ent_944__ent_1044

**All observed names:** P. J. Carlesimo → Seton Hall (1)

Ordered IDs: Ent[ent_944] → Ent[ent_1044]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7198](../raw_map.tsv:7198) | P. J. Carlesimo | Seton Hall | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). P. J. Carlesimo → Seton Hall: Minister status, inverse leadership, difference, migration flow or a coaching relationship does not establish the stated communication direction.

Cited evidence lines: [7198](../raw_map.tsv:7198).




### rel_58__ent_1422__ent_839

**All observed names:** White House → Congress (1)

Ordered IDs: Ent[ent_1422] → Ent[ent_839]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7882](../raw_map.tsv:7882) | White House | Congress | nsubj\|&lt;-nsubj&lt;-notify-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). White House → Congress: A local tell/notify/say-to row explicitly directs communication to the stated recipient.

Cited evidence lines: [7882](../raw_map.tsv:7882).



