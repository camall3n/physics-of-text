# audit_e318fe663470 — rel_25: directed communication to

Predicate ID: communicates_to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

Complete census: 3 supported, 2 incorrect, 0 ambiguous; N=5. Precision 3/5=60.00% to 3/5=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| 2 | nsubj\|&lt;-nsubj&lt;-warn-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;in-&gt;pobj-&gt;charge-&gt;prep-&gt;of-&gt;pobj-&gt;desk-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-holiday-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-fence-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;about-&gt;pobj-&gt;letter-&gt;poss-&gt;\|poss |
| 1 | partmod\|-&gt;partmod-&gt;record-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-conversation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;outfit-&gt;nsubjpass-&gt;\|nsubjpass |

## Every evaluated fact

### rel_25__ent_197__ent_199

**All observed names:** Ms. Lewinsky → Ms. Tripp (5)

Ordered IDs: Ent[ent_197] → Ent[ent_199]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [496](../raw_map.tsv:496) | Ms. Lewinsky | Ms. Tripp | poss\|&lt;-poss&lt;-conversation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [497](../raw_map.tsv:497) | Ms. Lewinsky | Ms. Tripp | partmod\|-&gt;partmod-&gt;record-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [500](../raw_map.tsv:500) | Ms. Lewinsky | Ms. Tripp | nsubj\|&lt;-nsubj&lt;-tell-&gt;prep-&gt;about-&gt;pobj-&gt;letter-&gt;poss-&gt;\|poss |
| [503](../raw_map.tsv:503) | Ms. Lewinsky | Ms. Tripp | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [504](../raw_map.tsv:504) | Ms. Lewinsky | Ms. Tripp | rcmod\|-&gt;rcmod-&gt;outfit-&gt;nsubjpass-&gt;\|nsubjpass |

**Judgment: supported** (primary). Ms. Lewinsky → Ms. Tripp: An explicit conversation, warning or suggestion-to row establishes directed communication to the named person/body.

Cited evidence lines: [496](../raw_map.tsv:496), [497](../raw_map.tsv:497), [500](../raw_map.tsv:500), [503](../raw_map.tsv:503), [504](../raw_map.tsv:504).


Issue tags: mixed_evidence

### rel_25__ent_1009__ent_303

**All observed names:** Bill Gamba → Cowen &amp; Company (4)

Ordered IDs: Ent[ent_1009] → Ent[ent_303]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [764](../raw_map.tsv:764) | Bill Gamba | Cowen &amp; Company | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [765](../raw_map.tsv:765) | Bill Gamba | Cowen &amp; Company | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;in-&gt;pobj-&gt;charge-&gt;prep-&gt;of-&gt;pobj-&gt;desk-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [766](../raw_map.tsv:766) | Bill Gamba | Cowen &amp; Company | appos\|&lt;-appos&lt;-holiday-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [767](../raw_map.tsv:767) | Bill Gamba | Cowen &amp; Company | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bill Gamba → Cowen & Company: A president/head office does not establish communication to the employer.

Cited evidence lines: [764](../raw_map.tsv:764), [765](../raw_map.tsv:765), [766](../raw_map.tsv:766), [767](../raw_map.tsv:767).




### rel_25__ent_180__ent_1118

**All observed names:** Bush → Saddam Hussein (3)

Ordered IDs: Ent[ent_180] → Ent[ent_1118]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4268](../raw_map.tsv:4268) | Bush | Saddam Hussein | nsubj\|&lt;-nsubj&lt;-give-&gt;iobj-&gt;\|iobj |
| [4270](../raw_map.tsv:4270) | Bush | Saddam Hussein | nsubj\|&lt;-nsubj&lt;-warn-&gt;dobj-&gt;\|dobj |
| [4274](../raw_map.tsv:4274) | Bush | Saddam Hussein | nsubj\|&lt;-nsubj&lt;-fence-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bush → Saddam Hussein: An explicit conversation, warning or suggestion-to row establishes directed communication to the named person/body.

Cited evidence lines: [4268](../raw_map.tsv:4268), [4270](../raw_map.tsv:4270), [4274](../raw_map.tsv:4274).


Issue tags: mixed_evidence

### rel_25__ent_1361__ent_189

**All observed names:** Alan Greenspan → Congress (2)

Ordered IDs: Ent[ent_1361] → Ent[ent_189]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [410](../raw_map.tsv:410) | Alan Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-warn-&gt;dobj-&gt;\|dobj |
| [414](../raw_map.tsv:414) | Alan Greenspan | Congress | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Alan Greenspan → Congress: An explicit conversation, warning or suggestion-to row establishes directed communication to the named person/body.

Cited evidence lines: [410](../raw_map.tsv:410), [414](../raw_map.tsv:414).




### rel_25__ent_124__ent_817

**All observed names:** James R. Capra → Shearson Lehman Government Securities (1)

Ordered IDs: Ent[ent_124] → Ent[ent_817]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [719](../raw_map.tsv:719) | James R. Capra | Shearson Lehman Government Securities | appos\|-&gt;appos-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). James R. Capra → Shearson Lehman Government Securities: A president/head office does not establish communication to the employer.

Cited evidence lines: [719](../raw_map.tsv:719).



