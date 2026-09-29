# audit_9c88162c7b22 — rel_92: owns organization or asset

Predicate ID: owns

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

Complete census: 2 supported, 1 incorrect, 0 ambiguous; N=3. Precision 2/3=66.67% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |
| 2 | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-suggestion-&gt;dep-&gt;call-&gt;nsubjpass-&gt;team-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-unhappiness-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_92__ent_1033__ent_1004

**All observed names:** George Steinbrenner → Yankees (6)

Ordered IDs: Ent[ent_1033] → Ent[ent_1004]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1418](../raw_map.tsv:1418) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1420](../raw_map.tsv:1420) | George Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| [1421](../raw_map.tsv:1421) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-unhappiness-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1422](../raw_map.tsv:1422) | George Steinbrenner | Yankees | poss\|&lt;-poss&lt;-control-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1423](../raw_map.tsv:1423) | George Steinbrenner | Yankees | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-ouster-&gt;prep-&gt;as-&gt;pobj-&gt;partner-&gt;poss-&gt;\|poss |
| [1424](../raw_map.tsv:1424) | George Steinbrenner | Yankees | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-suggestion-&gt;dep-&gt;call-&gt;nsubjpass-&gt;team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). George Steinbrenner → Yankees: An explicit reign-as-owner path establishes ownership of the Yankees, including historical ownership.

Cited evidence lines: [1418](../raw_map.tsv:1418), [1420](../raw_map.tsv:1420), [1421](../raw_map.tsv:1421), [1422](../raw_map.tsv:1422), [1423](../raw_map.tsv:1423), [1424](../raw_map.tsv:1424).




### rel_92__ent_351__ent_1004

**All observed names:** Steinbrenner → Yankees (3)

Ordered IDs: Ent[ent_351] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1499](../raw_map.tsv:1499) | Steinbrenner | Yankees | poss\|&lt;-poss&lt;-reign-&gt;prep-&gt;as-&gt;pobj-&gt;owner-&gt;poss-&gt;\|poss |
| [1502](../raw_map.tsv:1502) | Steinbrenner | Yankees | rcmod\|-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |
| [1503](../raw_map.tsv:1503) | Steinbrenner | Yankees | nsubj\|&lt;-nsubj&lt;-return-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Steinbrenner → Yankees: An explicit reign-as-owner path establishes ownership of the Yankees, including historical ownership.

Cited evidence lines: [1499](../raw_map.tsv:1499), [1502](../raw_map.tsv:1502), [1503](../raw_map.tsv:1503).




### rel_92__ent_356__ent_308

**All observed names:** Ewing → Knicks (2)

Ordered IDs: Ent[ent_356] → Ent[ent_308]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3083](../raw_map.tsv:3083) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |
| [4227](../raw_map.tsv:4227) | Ewing | Knicks | nsubj\|&lt;-nsubj&lt;-leader-&gt;poss-&gt;\|poss |

**Judgment: incorrect** (primary). Ewing → Knicks: Being a team leader does not establish an ownership interest.

Cited evidence lines: [3083](../raw_map.tsv:3083), [4227](../raw_map.tsv:4227).



