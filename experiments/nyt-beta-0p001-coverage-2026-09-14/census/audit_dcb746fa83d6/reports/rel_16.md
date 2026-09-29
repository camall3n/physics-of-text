# audit_dcb746fa83d6 — rel_16: has or had wife

Predicate ID: has_wife

Person X is or was married to woman Y identified as X's wife.

Includes: explicit wife or spouse identified as wife; wife apposition or accompanied-by-wife attachment establishing the couple; historical or former wife. Excludes: daughter or other relative; ordinary companion or accompaniment without a wife relationship; a fictional or proposed marriage unless actual marital status is stated. Ambiguous unless resolved by case-local evidence: unclear whose wife Y is; wife versus other companion attachment unresolved; engagement without established marriage. The ordered argument roles are person to wife; do not substitute generic kinship or companionship.

Complete census: 1 supported, 5 incorrect, 0 ambiguous; N=6. Precision 1/6=16.67% to 1/6=16.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-defeat-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-know-&gt;prep-&gt;of-&gt;pobj-&gt;article-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | partmod\|-&gt;partmod-&gt;perform-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-behind&lt;-prep&lt;-have-&gt;advmod-&gt;ahead-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-over&lt;-prep&lt;-concern&lt;-dobj&lt;-express&lt;-dep&lt;-prohibit-&gt;dobj-&gt;company-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-cabin&lt;-nsubj&lt;-kill-&gt;dobj-&gt;wife-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-computer&lt;-dobj&lt;-service-&gt;prep-&gt;while-&gt;pobj-&gt;baby-&gt;rcmod-&gt;provide-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-wife-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-strike-&gt;dep-&gt;\|dep |

## Every evaluated fact

### rel_16__ent_1115__ent_671

**All observed names:** Mr. Weaver → Vicki (3)

Ordered IDs: Ent[ent_1115] → Ent[ent_671]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4511](../raw_map.tsv:4511) | Mr. Weaver | Vicki | poss\|&lt;-poss&lt;-wife-&gt;appos-&gt;\|appos |
| [4512](../raw_map.tsv:4512) | Mr. Weaver | Vicki | poss\|&lt;-poss&lt;-wife&lt;-dobj&lt;-strike-&gt;dep-&gt;\|dep |
| [4513](../raw_map.tsv:4513) | Mr. Weaver | Vicki | poss\|&lt;-poss&lt;-cabin&lt;-nsubj&lt;-kill-&gt;dobj-&gt;wife-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Mr. Weaver → Vicki: Direct possessive wife apposition identifies the named wife relationship.

Cited evidence lines: [4511](../raw_map.tsv:4511), [4512](../raw_map.tsv:4512), [4513](../raw_map.tsv:4513).


Issue tags: mixed_evidence

### rel_16__ent_935__ent_1369

**All observed names:** Ameritech → Bell (3)

Ordered IDs: Ent[ent_935] → Ent[ent_1369]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6850](../raw_map.tsv:6850) | Ameritech | Bell | poss\|&lt;-poss&lt;-computer&lt;-dobj&lt;-service-&gt;prep-&gt;while-&gt;pobj-&gt;baby-&gt;rcmod-&gt;provide-&gt;nsubj-&gt;\|nsubj |
| [6851](../raw_map.tsv:6851) | Ameritech | Bell | pobj\|&lt;-pobj&lt;-over&lt;-prep&lt;-concern&lt;-dobj&lt;-express&lt;-dep&lt;-prohibit-&gt;dobj-&gt;company-&gt;nn-&gt;\|nn |
| [6853](../raw_map.tsv:6853) | Ameritech | Bell | pobj\|&lt;-pobj&lt;-behind&lt;-prep&lt;-have-&gt;advmod-&gt;ahead-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ameritech → Bell: Corporate relations, invasion, knowing an article source, artistic performance or a sports game does not establish marriage.

Cited evidence lines: [6850](../raw_map.tsv:6850), [6851](../raw_map.tsv:6851), [6853](../raw_map.tsv:6853).




### rel_16__ent_537__ent_492

**All observed names:** United States → Iraq (2)

Ordered IDs: Ent[ent_537] → Ent[ent_492]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2763](../raw_map.tsv:2763) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |
| [4064](../raw_map.tsv:4064) | United States | Iraq | nsubj\|&lt;-nsubj&lt;-invade-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). United States → Iraq: Corporate relations, invasion, knowing an article source, artistic performance or a sports game does not establish marriage.

Cited evidence lines: [2763](../raw_map.tsv:2763), [4064](../raw_map.tsv:4064).




### rel_16__ent_1408__ent_199

**All observed names:** Ms. Lewinsky → Ms. Tripp (1)

Ordered IDs: Ent[ent_1408] → Ent[ent_199]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [502](../raw_map.tsv:502) | Ms. Lewinsky | Ms. Tripp | nsubj\|&lt;-nsubj&lt;-know-&gt;prep-&gt;of-&gt;pobj-&gt;article-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Ms. Lewinsky → Ms. Tripp: Corporate relations, invasion, knowing an article source, artistic performance or a sports game does not establish marriage.

Cited evidence lines: [502](../raw_map.tsv:502).




### rel_16__ent_270__ent_19

**All observed names:** Kevin McKenzie → Ballet Theater (1)

Ordered IDs: Ent[ent_270] → Ent[ent_19]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3554](../raw_map.tsv:3554) | Kevin McKenzie | Ballet Theater | partmod\|-&gt;partmod-&gt;perform-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Kevin McKenzie → Ballet Theater: Corporate relations, invasion, knowing an article source, artistic performance or a sports game does not establish marriage.

Cited evidence lines: [3554](../raw_map.tsv:3554).




### rel_16__ent_321__ent_693

**All observed names:** Mets → Shea Stadium (1)

Ordered IDs: Ent[ent_321] → Ent[ent_693]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5212](../raw_map.tsv:5212) | Mets | Shea Stadium | nsubj\|&lt;-nsubj&lt;-defeat-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mets → Shea Stadium: Corporate relations, invasion, knowing an article source, artistic performance or a sports game does not establish marriage.

Cited evidence lines: [5212](../raw_map.tsv:5212).



