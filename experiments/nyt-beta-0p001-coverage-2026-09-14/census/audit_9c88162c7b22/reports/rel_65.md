# audit_9c88162c7b22 — rel_65: directed communication to

Predicate ID: communicates_to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

Complete census: 2 supported, 1 incorrect, 0 ambiguous; N=3. Precision 2/3=66.67% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| 1 | dobj\|&lt;-dobj&lt;-support-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-encounter-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-lawyer-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-of&lt;-prep&lt;-more&lt;-dobj&lt;-have-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-screed-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;prescription-&gt;prep-&gt;in-&gt;pobj-&gt;issue-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;congregate-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_65__ent_182__ent_113

**All observed names:** Mr. Bush → Mr. Kerry (4)

Ordered IDs: Ent[ent_182] → Ent[ent_113]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1587](../raw_map.tsv:1587) | Mr. Bush | Mr. Kerry | nsubj\|&lt;-nsubj&lt;-attack-&gt;dobj-&gt;\|dobj |
| [1592](../raw_map.tsv:1592) | Mr. Bush | Mr. Kerry | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |
| [1593](../raw_map.tsv:1593) | Mr. Bush | Mr. Kerry | dobj\|&lt;-dobj&lt;-support-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [1594](../raw_map.tsv:1594) | Mr. Bush | Mr. Kerry | poss\|&lt;-poss&lt;-encounter-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Bush → Mr. Kerry: The explicit tell path directs communication from the first named person to the second.

Cited evidence lines: [1587](../raw_map.tsv:1587), [1592](../raw_map.tsv:1592), [1593](../raw_map.tsv:1593), [1594](../raw_map.tsv:1594).




### rel_65__ent_857__ent_614

**All observed names:** William Kristol → The Weekly Standard (4)

Ordered IDs: Ent[ent_857] → Ent[ent_614]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2404](../raw_map.tsv:2404) | William Kristol | The Weekly Standard | rcmod\|-&gt;rcmod-&gt;congregate-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2405](../raw_map.tsv:2405) | William Kristol | The Weekly Standard | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;prescription-&gt;prep-&gt;in-&gt;pobj-&gt;issue-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2406](../raw_map.tsv:2406) | William Kristol | The Weekly Standard | poss\|&lt;-poss&lt;-screed-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2407](../raw_map.tsv:2407) | William Kristol | The Weekly Standard | nsubj\|&lt;-nsubj&lt;-publisher-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). William Kristol → The Weekly Standard: Publishing, a screed in a publication, and congregating at it do not identify the publication as an addressee of directed communication.

Cited evidence lines: [2404](../raw_map.tsv:2404), [2405](../raw_map.tsv:2405), [2406](../raw_map.tsv:2406), [2407](../raw_map.tsv:2407).




### rel_65__ent_44__ent_43

**All observed names:** Mr. Gotti → Bruce Cutler (3)

Ordered IDs: Ent[ent_44] → Ent[ent_43]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3801](../raw_map.tsv:3801) | Mr. Gotti | Bruce Cutler | poss\|&lt;-poss&lt;-lawyer&lt;-pobj&lt;-of&lt;-prep&lt;-style&lt;-pobj&lt;-of&lt;-prep&lt;-more&lt;-dobj&lt;-have-&gt;dep-&gt;\|dep |
| [3802](../raw_map.tsv:3802) | Mr. Gotti | Bruce Cutler | poss\|&lt;-poss&lt;-lawyer-&gt;dep-&gt;\|dep |
| [3804](../raw_map.tsv:3804) | Mr. Gotti | Bruce Cutler | nsubj\|&lt;-nsubj&lt;-tell-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Mr. Gotti → Bruce Cutler: The explicit tell path directs communication from the first named person to the second.

Cited evidence lines: [3801](../raw_map.tsv:3801), [3802](../raw_map.tsv:3802), [3804](../raw_map.tsv:3804).



