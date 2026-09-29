# audit_9c88162c7b22 — rel_33: entered agreement with

Predicate ID: agreed_with

Entity X entered or had an explicit agreement with counterpart Y.

Includes: explicit agreement-with; a stated shared agreement or accord; historical agreement. Excludes: mere meeting or conversation; unilateral approval or support without shared agreement; a proposed agreement or ongoing negotiation without realization. Ambiguous unless resolved by case-local evidence: unclear parties to an agreement; a future or conditional agreement; approval by a subunit without evidence of agreement by Y. A specific agreement is sufficient; this does not imply agreement on every issue or permanent alliance.

Complete census: 1 supported, 1 incorrect, 1 ambiguous; N=3. Precision 1/3=33.33% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | poss\|&lt;-poss&lt;-agreement-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 2 | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;approval-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;nn-&gt;\|nn |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-practice-&gt;prep-&gt;without-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;leave-&gt;purpcl-&gt;start-&gt;dep-&gt;much-&gt;nsubj-&gt;adjustment-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-until&lt;-prep&lt;-be-&gt;dep-&gt;know-&gt;dobj-&gt;status-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-team-&gt;dep-&gt;without-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;speak-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_33__ent_597__ent_1041

**All observed names:** Van Gundy → Johnson (6)

Ordered IDs: Ent[ent_597] → Ent[ent_1041]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1606](../raw_map.tsv:1606) | Van Gundy | Johnson | rcmod\|-&gt;rcmod-&gt;speak-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1607](../raw_map.tsv:1607) | Van Gundy | Johnson | rcmod\|-&gt;rcmod-&gt;meet-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1609](../raw_map.tsv:1609) | Van Gundy | Johnson | poss\|&lt;-poss&lt;-team-&gt;dep-&gt;without-&gt;pobj-&gt;\|pobj |
| [1610](../raw_map.tsv:1610) | Van Gundy | Johnson | pobj\|&lt;-pobj&lt;-until&lt;-prep&lt;-be-&gt;dep-&gt;know-&gt;dobj-&gt;status-&gt;poss-&gt;\|poss |
| [1611](../raw_map.tsv:1611) | Van Gundy | Johnson | partmod\|-&gt;partmod-&gt;leave-&gt;purpcl-&gt;start-&gt;dep-&gt;much-&gt;nsubj-&gt;adjustment-&gt;rcmod-&gt;have-&gt;nsubj-&gt;\|nsubj |
| [1612](../raw_map.tsv:1612) | Van Gundy | Johnson | nsubjpass\|&lt;-nsubjpass&lt;-practice-&gt;prep-&gt;without-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Van Gundy → Johnson: Speaking and meeting, a team without Johnson, and adjustment/status paths do not establish an agreement.

Cited evidence lines: [1606](../raw_map.tsv:1606), [1607](../raw_map.tsv:1607), [1609](../raw_map.tsv:1609), [1610](../raw_map.tsv:1610), [1611](../raw_map.tsv:1611), [1612](../raw_map.tsv:1612).




### rel_33__ent_196__ent_189

**All observed names:** Bush Administration → Congress (4)

Ordered IDs: Ent[ent_196] → Ent[ent_189]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [468](../raw_map.tsv:468) | Bush Administration | Congress | poss\|&lt;-poss&lt;-agreement-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [472](../raw_map.tsv:472) | Bush Administration | Congress | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;approval-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;nn-&gt;\|nn |
| [2075](../raw_map.tsv:2075) | Bush Administration | Congress | poss\|&lt;-poss&lt;-agreement-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2079](../raw_map.tsv:2079) | Bush Administration | Congress | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;approval-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bush Administration → Congress: The explicit possessive agreement-with-Congress paths establish an agreement by the named administration; no external agreement content is assumed.

Cited evidence lines: [468](../raw_map.tsv:468), [472](../raw_map.tsv:472), [2075](../raw_map.tsv:2075), [2079](../raw_map.tsv:2079).




### rel_33__ent_183__ent_189

**All observed names:** Administration → Congress (2)

Ordered IDs: Ent[ent_183] → Ent[ent_189]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [452](../raw_map.tsv:452) | Administration | Congress | poss\|&lt;-poss&lt;-agreement-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2019](../raw_map.tsv:2019) | Administration | Congress | poss\|&lt;-poss&lt;-agreement-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Administration → Congress: Agreement-with is explicit, but the sole Administration argument does not identify which administration is the institutional principal.

Cited evidence lines: [452](../raw_map.tsv:452), [2019](../raw_map.tsv:2019).

**Review question:** Which administration entered the agreement with Congress?
Issue tags: unnamed_principal
