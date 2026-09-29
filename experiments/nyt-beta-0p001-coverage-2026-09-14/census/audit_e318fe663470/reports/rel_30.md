# audit_e318fe663470 — rel_30: met or encountered

Predicate ID: met_with

Person, group, institution, or sports team X actually met or encountered Y.

Includes: explicit actual meet or meet-with encounter; a meeting between representatives clearly attributed to the named institutions; actual meeting of opposing sports teams. Excludes: communication alone without an encounter; a proposed or scheduled meeting not established as occurring; physical confluence of rivers or geographic features; mere co-occurrence or comparison. Ambiguous unless resolved by case-local evidence: future or planned meeting when occurrence is unresolved; meeting versus satisfying an abstract requirement; unclear representatives or participants. The primary direction follows the extracted arguments, although an encounter is semantically mutual. Team meetings include competitive encounters but do not imply a result.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;president-&gt;rcmod-&gt;able-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-recommend-&gt;prep-&gt;for-&gt;pobj-&gt;position-&gt;prep-&gt;by-&gt;pobj-&gt;friend-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-common-&gt;prep-&gt;than-&gt;dep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-conversation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-opponent-&gt;partmod-&gt;walk-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-referral-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-refusal&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;demand-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_30__ent_197__ent_520

**All observed names:** Ms. Lewinsky → Vernon Jordan (5)

Ordered IDs: Ent[ent_197] → Ent[ent_520]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8214](../raw_map.tsv:8214) | Ms. Lewinsky | Vernon Jordan | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8216](../raw_map.tsv:8216) | Ms. Lewinsky | Vernon Jordan | poss\|&lt;-poss&lt;-conversation-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8217](../raw_map.tsv:8217) | Ms. Lewinsky | Vernon Jordan | nsubj\|&lt;-nsubj&lt;-suggest-&gt;prep-&gt;to-&gt;pobj-&gt;president-&gt;rcmod-&gt;able-&gt;nsubj-&gt;\|nsubj |
| [8219](../raw_map.tsv:8219) | Ms. Lewinsky | Vernon Jordan | poss\|&lt;-poss&lt;-referral-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [8220](../raw_map.tsv:8220) | Ms. Lewinsky | Vernon Jordan | nsubjpass\|&lt;-nsubjpass&lt;-recommend-&gt;prep-&gt;for-&gt;pobj-&gt;position-&gt;prep-&gt;by-&gt;pobj-&gt;friend-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Ms. Lewinsky → Vernon Jordan: An unqualified local meet-with row establishes an encounter; another refusal row does not erase that separate affirmative evidence.

Cited evidence lines: [8214](../raw_map.tsv:8214), [8216](../raw_map.tsv:8216), [8217](../raw_map.tsv:8217), [8219](../raw_map.tsv:8219), [8220](../raw_map.tsv:8220).


Issue tags: mixed_evidence

### rel_30__ent_753__ent_519

**All observed names:** Mr. Netanyahu → Mr. Arafat (5)

Ordered IDs: Ent[ent_753] → Ent[ent_519]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8274](../raw_map.tsv:8274) | Mr. Netanyahu | Mr. Arafat | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8276](../raw_map.tsv:8276) | Mr. Netanyahu | Mr. Arafat | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8280](../raw_map.tsv:8280) | Mr. Netanyahu | Mr. Arafat | rcmod\|-&gt;rcmod-&gt;demand-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [8282](../raw_map.tsv:8282) | Mr. Netanyahu | Mr. Arafat | poss\|&lt;-poss&lt;-refusal&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8283](../raw_map.tsv:8283) | Mr. Netanyahu | Mr. Arafat | poss\|&lt;-poss&lt;-opponent-&gt;partmod-&gt;walk-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mr. Netanyahu → Mr. Arafat: An unqualified local meet-with row establishes an encounter; another refusal row does not erase that separate affirmative evidence.

Cited evidence lines: [8274](../raw_map.tsv:8274), [8276](../raw_map.tsv:8276), [8280](../raw_map.tsv:8280), [8282](../raw_map.tsv:8282), [8283](../raw_map.tsv:8283).


Issue tags: mixed_evidence

### rel_30__ent_157__ent_316

**All observed names:** Mr. Bush → Mr. Gore (2)

Ordered IDs: Ent[ent_157] → Ent[ent_316]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3087](../raw_map.tsv:3087) | Mr. Bush | Mr. Gore | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3090](../raw_map.tsv:3090) | Mr. Bush | Mr. Gore | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-common-&gt;prep-&gt;than-&gt;dep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Bush → Mr. Gore: Comparison/commentary or committee chairmanship does not establish an encounter.

Cited evidence lines: [3087](../raw_map.tsv:3087), [3090](../raw_map.tsv:3090).




### rel_30__ent_1426__ent_485

**All observed names:** Democrat → Senate Armed Services Committee (1)

Ordered IDs: Ent[ent_1426] → Ent[ent_485]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6318](../raw_map.tsv:6318) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Democrat → Senate Armed Services Committee: Comparison/commentary or committee chairmanship does not establish an encounter.

Cited evidence lines: [6318](../raw_map.tsv:6318).



