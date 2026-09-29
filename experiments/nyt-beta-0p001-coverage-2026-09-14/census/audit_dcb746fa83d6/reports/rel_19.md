# audit_dcb746fa83d6 — rel_19: unresolved relation meaning

Predicate ID: unresolved_relation

The complete relation dictionary and argument roles do not identify a coherent dominant predicate whose facts can be judged without inventing a scope.

Includes: explicitly documented relation-level semantic indeterminacy after complete dictionary and argument-role inspection. Excludes: using ambiguity to omit difficult facts or change denominators; a broad association or disjunction invented to make unrelated meanings correct; using this marker when a coherent dominant family can be identified. Ambiguous unless resolved by case-local evidence: all facts remain ambiguous because the relation meaning is unresolved. This is an evaluation marker, not a learned semantic relation. Every fact receives A with a case-specific question; retain all facts in denominators and separately report relation-semantic-indeterminacy counts.

Complete census: 0 supported, 0 incorrect, 3 ambiguous; N=3. Precision 0/3=0.00% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | amod\|&lt;-amod&lt;-leader-&gt;dep-&gt;\|dep |
| 1 | appos\|-&gt;appos-&gt;agribusiness-&gt;amod-&gt;\|amod |
| 1 | nn\|&lt;-nn&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-deputy-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-write-&gt;prep-&gt;as-&gt;pobj-&gt;result-&gt;prep-&gt;of-&gt;pobj-&gt;loss-&gt;prep-&gt;of-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-coartem-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-share&lt;-nsubj&lt;-fall-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-share&lt;-nsubj&lt;-rise-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-share&lt;-nsubj&lt;-fall-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |

## Every evaluated fact

### rel_19__ent_292__ent_1431

**All observed names:** Novartis → Swiss (6)

Ordered IDs: Ent[ent_292] → Ent[ent_1431]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3612](../raw_map.tsv:3612) | Novartis | Swiss | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-share&lt;-nsubj&lt;-rise-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| [3613](../raw_map.tsv:3613) | Novartis | Swiss | appos\|-&gt;appos-&gt;agribusiness-&gt;amod-&gt;\|amod |
| [3614](../raw_map.tsv:3614) | Novartis | Swiss | poss\|&lt;-poss&lt;-share&lt;-nsubj&lt;-fall-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| [3616](../raw_map.tsv:3616) | Novartis | Swiss | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-share&lt;-nsubj&lt;-fall-&gt;prep-&gt;to-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |
| [3617](../raw_map.tsv:3617) | Novartis | Swiss | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-coartem-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3618](../raw_map.tsv:3618) | Novartis | Swiss | nsubj\|&lt;-nsubj&lt;-write-&gt;prep-&gt;as-&gt;pobj-&gt;result-&gt;prep-&gt;of-&gt;pobj-&gt;loss-&gt;prep-&gt;of-&gt;pobj-&gt;franc-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Novartis → Swiss: Swiss agribusiness affiliation is recognizable but competes with political leadership and movement in the frozen unresolved dictionary; currency references do not settle one shared predicate.

Cited evidence lines: [3612](../raw_map.tsv:3612), [3613](../raw_map.tsv:3613), [3614](../raw_map.tsv:3614), [3616](../raw_map.tsv:3616), [3617](../raw_map.tsv:3617), [3618](../raw_map.tsv:3618).

**Review question:** Should the dictionary mean organizational nationality, political office, or another specific relation?
Issue tags: relation_semantic_indeterminacy

### rel_19__ent_69__ent_1224

**All observed names:** Bosnian Serb → Radovan Karadzic (3)

Ordered IDs: Ent[ent_69] → Ent[ent_1224]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7697](../raw_map.tsv:7697) | Bosnian Serb | Radovan Karadzic | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [7700](../raw_map.tsv:7700) | Bosnian Serb | Radovan Karadzic | amod\|&lt;-amod&lt;-leader-&gt;dep-&gt;\|dep |
| [7705](../raw_map.tsv:7705) | Bosnian Serb | Radovan Karadzic | nsubj\|&lt;-nsubj&lt;-deputy-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Bosnian Serb → Radovan Karadzic: President/leader and deputy paths are locally political but do not resolve the dictionary tie, and Bosnian Serb remains an incomplete political-body fragment.

Cited evidence lines: [7697](../raw_map.tsv:7697), [7700](../raw_map.tsv:7700), [7705](../raw_map.tsv:7705).

**Review question:** Which complete political body and which predicate should this relation identify for Radovan Karadzic?
Issue tags: relation_semantic_indeterminacy, argument_identity

### rel_19__ent_1123__ent_608

**All observed names:** Jonathan Pryce → Broadway (1)

Ordered IDs: Ent[ent_1123] → Ent[ent_608]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4748](../raw_map.tsv:4748) | Jonathan Pryce | Broadway | nn\|&lt;-nn&lt;-move-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Jonathan Pryce → Broadway: The lone move-to-Broadway row is ambiguous between performance context and destination and cannot resolve the dictionary-wide semantic tie.

Cited evidence lines: [4748](../raw_map.tsv:4748).

**Review question:** Is the intended relation theatrical participation or physical movement, and how does that reconcile with the competing dictionary families?
Issue tags: relation_semantic_indeterminacy, metonymy
