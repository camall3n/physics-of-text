# audit_06dbdb9b03af — rel_77: president of institution

Predicate ID: president_of

Person X holds or held an explicitly identified president office in organization, team, public body, or institution Y.

Includes: explicit president office; a functional or departmental president role within Y; historical or former presidency. Excludes: manager, director, chairman, head, or executive alone without a president title; ordinary employment or membership; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: president-elect or unresolved tenure without evidence of holding office; an incomplete institution or personal principal; unclear holder or title attachment. This specific title is separate from president_or_manager_of and managerial_office_in. It does not require that the officeholder be the sole head of Y.

Complete census: 1 supported, 1 incorrect, 0 ambiguous; N=2. Precision 1/2=50.00% to 1/2=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|&lt;-appos&lt;-remark-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-session-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-speech&lt;-pobj&lt;-after&lt;-prep&lt;-complain-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-invite-&gt;dobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-liken-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-remark&lt;-nsubj&lt;-reflect-&gt;dobj-&gt;assessment-&gt;prep-&gt;among-&gt;pobj-&gt;official-&gt;rcmod-&gt;defeat-&gt;dobj-&gt;authority-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-son&lt;-nsubj&lt;-take-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-statement-&gt;prep-&gt;on-&gt;pobj-&gt;question-&gt;prep-&gt;of-&gt;dep-&gt;change-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-threat&lt;-nsubj&lt;-pose-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-victory&lt;-dobj&lt;-praise-&gt;prep-&gt;over-&gt;pobj-&gt;government-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-view&lt;-pobj&lt;-in&lt;-prep&lt;-unilateralist-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-vulnerability&lt;-nsubj&lt;-instil-&gt;prep-&gt;about-&gt;pobj-&gt;venture-&gt;dep-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;negotiator-&gt;prep-&gt;as-&gt;pobj-&gt;chairwoman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_77__ent_182__ent_355

**All observed names:** Mr. Bush → Mr. Hussein (8)

Ordered IDs: Ent[ent_182] → Ent[ent_355]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1596](../raw_map.tsv:1596) | Mr. Bush | Mr. Hussein | nsubj\|&lt;-nsubj&lt;-liken-&gt;dobj-&gt;\|dobj |
| [1598](../raw_map.tsv:1598) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-vulnerability&lt;-nsubj&lt;-instil-&gt;prep-&gt;about-&gt;pobj-&gt;venture-&gt;dep-&gt;leave-&gt;dobj-&gt;\|dobj |
| [1599](../raw_map.tsv:1599) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-view&lt;-pobj&lt;-in&lt;-prep&lt;-unilateralist-&gt;nsubj-&gt;\|nsubj |
| [1600](../raw_map.tsv:1600) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-victory&lt;-dobj&lt;-praise-&gt;prep-&gt;over-&gt;pobj-&gt;government-&gt;poss-&gt;\|poss |
| [1601](../raw_map.tsv:1601) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-threat&lt;-nsubj&lt;-pose-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [1602](../raw_map.tsv:1602) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-statement-&gt;prep-&gt;on-&gt;pobj-&gt;question-&gt;prep-&gt;of-&gt;dep-&gt;change-&gt;nsubj-&gt;\|nsubj |
| [1603](../raw_map.tsv:1603) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-son&lt;-nsubj&lt;-take-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [1604](../raw_map.tsv:1604) | Mr. Bush | Mr. Hussein | poss\|&lt;-poss&lt;-remark&lt;-nsubj&lt;-reflect-&gt;dobj-&gt;assessment-&gt;prep-&gt;among-&gt;pobj-&gt;official-&gt;rcmod-&gt;defeat-&gt;dobj-&gt;authority-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Mr. Bush → Mr. Hussein: Political controversy and personal comparisons do not make one person president of the other.

Cited evidence lines: [1596](../raw_map.tsv:1596), [1598](../raw_map.tsv:1598), [1599](../raw_map.tsv:1599), [1600](../raw_map.tsv:1600), [1601](../raw_map.tsv:1601), [1602](../raw_map.tsv:1602), [1603](../raw_map.tsv:1603), [1604](../raw_map.tsv:1604).




### rel_77__ent_130__ent_372

**All observed names:** Randi Weingarten → United Federation of Teachers (6)

Ordered IDs: Ent[ent_130] → Ent[ent_372]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3](../raw_map.tsv:3) | Randi Weingarten | United Federation of Teachers | nsubj\|&lt;-nsubj&lt;-president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7](../raw_map.tsv:7) | Randi Weingarten | United Federation of Teachers | rcmod\|-&gt;rcmod-&gt;negotiator-&gt;prep-&gt;as-&gt;pobj-&gt;chairwoman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [8](../raw_map.tsv:8) | Randi Weingarten | United Federation of Teachers | dobj\|&lt;-dobj&lt;-invite-&gt;dobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [9](../raw_map.tsv:9) | Randi Weingarten | United Federation of Teachers | appos\|&lt;-appos&lt;-speech&lt;-pobj&lt;-after&lt;-prep&lt;-complain-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [10](../raw_map.tsv:10) | Randi Weingarten | United Federation of Teachers | appos\|&lt;-appos&lt;-session-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [11](../raw_map.tsv:11) | Randi Weingarten | United Federation of Teachers | appos\|&lt;-appos&lt;-remark-&gt;appos-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Randi Weingarten → United Federation of Teachers: Direct president title establishes institutional presidency.

Cited evidence lines: [3](../raw_map.tsv:3), [7](../raw_map.tsv:7), [8](../raw_map.tsv:8), [9](../raw_map.tsv:9), [10](../raw_map.tsv:10), [11](../raw_map.tsv:11).


Issue tags: mixed_evidence
