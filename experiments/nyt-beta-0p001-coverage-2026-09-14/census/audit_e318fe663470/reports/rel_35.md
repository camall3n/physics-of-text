# audit_e318fe663470 — rel_35: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 1 supported, 2 incorrect, 1 ambiguous; N=4. Precision 1/4=25.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-replace-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-talk-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-gathering-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meet&lt;-partmod&lt;-first&lt;-nsubj&lt;-drive-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-assistance-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-on&lt;-prep&lt;-schedule-&gt;nsubjpass-&gt;\|nsubjpass |
| 1 | poss\|&lt;-poss&lt;-official-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-official&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-dobj&lt;-send-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-ruler&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-appos&lt;-withdrawal-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-shift-&gt;prep-&gt;from-&gt;pobj-&gt;state-&gt;partmod-&gt;create-&gt;prep-&gt;by-&gt;pobj-&gt;president-&gt;dep-&gt;\|dep |
| 1 | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;involvement-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;develop-&gt;dobj-&gt;relationship-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;rival-&gt;nsubj-&gt;president-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_35__ent_697__ent_212

**All observed names:** Syria → Hafez al-Assad (5)

Ordered IDs: Ent[ent_697] → Ent[ent_212]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5350](../raw_map.tsv:5350) | Syria | Hafez al-Assad | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-gathering-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [5352](../raw_map.tsv:5352) | Syria | Hafez al-Assad | rcmod\|-&gt;rcmod-&gt;rival-&gt;nsubj-&gt;president-&gt;appos-&gt;\|appos |
| [5353](../raw_map.tsv:5353) | Syria | Hafez al-Assad | rcmod\|-&gt;rcmod-&gt;develop-&gt;dobj-&gt;relationship-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [5354](../raw_map.tsv:5354) | Syria | Hafez al-Assad | poss\|&lt;-poss&lt;-shift-&gt;prep-&gt;from-&gt;pobj-&gt;state-&gt;partmod-&gt;create-&gt;prep-&gt;by-&gt;pobj-&gt;president-&gt;dep-&gt;\|dep |
| [5355](../raw_map.tsv:5355) | Syria | Hafez al-Assad | poss\|&lt;-poss&lt;-ruler&lt;-pobj&lt;-of&lt;-prep&lt;-death&lt;-appos&lt;-withdrawal-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Syria → Hafez al-Assad: A local ruler/president construction identifies the country's political leader.

Cited evidence lines: [5350](../raw_map.tsv:5350), [5352](../raw_map.tsv:5352), [5353](../raw_map.tsv:5353), [5354](../raw_map.tsv:5354), [5355](../raw_map.tsv:5355).


Issue tags: mixed_evidence

### rel_35__ent_762__ent_197

**All observed names:** Mr. Jordan → Ms. Lewinsky (5)

Ordered IDs: Ent[ent_762] → Ent[ent_197]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8232](../raw_map.tsv:8232) | Mr. Jordan | Ms. Lewinsky | nsubj\|&lt;-nsubj&lt;-talk-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8234](../raw_map.tsv:8234) | Mr. Jordan | Ms. Lewinsky | nsubj\|&lt;-nsubj&lt;-meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [8235](../raw_map.tsv:8235) | Mr. Jordan | Ms. Lewinsky | prep\|-&gt;prep-&gt;about-&gt;pobj-&gt;involvement-&gt;poss-&gt;\|poss |
| [8240](../raw_map.tsv:8240) | Mr. Jordan | Ms. Lewinsky | poss\|&lt;-poss&lt;-assistance-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [8241](../raw_map.tsv:8241) | Mr. Jordan | Ms. Lewinsky | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-meet&lt;-partmod&lt;-first&lt;-nsubj&lt;-drive-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Mr. Jordan → Ms. Lewinsky: Personal communication/meetings or sports coaching does not establish inverse national political leadership.

Cited evidence lines: [8232](../raw_map.tsv:8232), [8234](../raw_map.tsv:8234), [8235](../raw_map.tsv:8235), [8240](../raw_map.tsv:8240), [8241](../raw_map.tsv:8241).




### rel_35__ent_1412__ent_708

**All observed names:** China → Qian Qichen (3)

Ordered IDs: Ent[ent_1412] → Ent[ent_708]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7048](../raw_map.tsv:7048) | China | Qian Qichen | poss\|&lt;-poss&lt;-official-&gt;appos-&gt;\|appos |
| [7052](../raw_map.tsv:7052) | China | Qian Qichen | poss\|&lt;-poss&lt;-official&lt;-pobj&lt;-to&lt;-prep&lt;-letter&lt;-dobj&lt;-send-&gt;dobj-&gt;\|dobj |
| [7053](../raw_map.tsv:7053) | China | Qian Qichen | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-on&lt;-prep&lt;-schedule-&gt;nsubjpass-&gt;\|nsubjpass |

**Judgment: ambiguous** (primary). China → Qian Qichen: Minister and official titles do not establish that the person is the head or political leader of the country.

Cited evidence lines: [7048](../raw_map.tsv:7048), [7052](../raw_map.tsv:7052), [7053](../raw_map.tsv:7053).

**Review question:** Does the minister hold the leadership role required by this narrower political-leader predicate?
Issue tags: role_ambiguity

### rel_35__ent_334__ent_292

**All observed names:** Rick Pitino → Knick (1)

Ordered IDs: Ent[ent_334] → Ent[ent_292]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7249](../raw_map.tsv:7249) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-replace-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Rick Pitino → Knick: Personal communication/meetings or sports coaching does not establish inverse national political leadership.

Cited evidence lines: [7249](../raw_map.tsv:7249).



