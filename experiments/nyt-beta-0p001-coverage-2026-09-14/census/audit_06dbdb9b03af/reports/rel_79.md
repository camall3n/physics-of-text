# audit_06dbdb9b03af — rel_79: defeated opponent

Predicate ID: defeated

Competitor X defeated opponent Y in at least one completed competitive contest.

Includes: beat/defeat/trounce/rout/upset/victory over; completed sporting sweep/outlast/elimination; explicit electoral defeat of an opposing competitor; historical win despite losses in other games. Excludes: mere play/face/rivalry; standings or polling lead; losing to Y; winning an event rather than beating Y; political control or hostility alone. Ambiguous unless resolved by case-local evidence: bare outscore/surpass/shock without a completed-contest result; score margin for only one period; unclear geographic/team metonymy. Preserves the two full-census opponent-win scope, including electoral contests. Broader competed-against belongs only in a separately declared sensitivity where the prior primary was defeat.

Complete census: 1 supported, 1 incorrect, 1 ambiguous; N=3. Precision 1/3=33.33% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |
| 2 | nsubj\|&lt;-nsubj&lt;-host-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;guard-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-outrebound-&gt;dobj-&gt;\|dobj |
| 1 | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-return-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-rout-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;after-&gt;pobj-&gt;season-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;stay-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_79__ent_61__ent_259

**All observed names:** Reggie Miller → Indiana (6)

Ordered IDs: Ent[ent_61] → Ent[ent_259]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3156](../raw_map.tsv:3156) | Reggie Miller | Indiana | appos\|-&gt;appos-&gt;guard-&gt;nn-&gt;\|nn |
| [3158](../raw_map.tsv:3158) | Reggie Miller | Indiana | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-pass-&gt;prep-&gt;in-&gt;pobj-&gt;game-&gt;prep-&gt;of-&gt;pobj-&gt;series-&gt;nn-&gt;\|nn |
| [3159](../raw_map.tsv:3159) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;stay-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3160](../raw_map.tsv:3160) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3161](../raw_map.tsv:3161) | Reggie Miller | Indiana | rcmod\|-&gt;rcmod-&gt;retire-&gt;prep-&gt;after-&gt;pobj-&gt;season-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [3162](../raw_map.tsv:3162) | Reggie Miller | Indiana | poss\|&lt;-poss&lt;-return-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Reggie Miller → Indiana: Player affiliation, residence and retirement with a team do not establish defeating that team.

Cited evidence lines: [3156](../raw_map.tsv:3156), [3158](../raw_map.tsv:3158), [3159](../raw_map.tsv:3159), [3160](../raw_map.tsv:3160), [3161](../raw_map.tsv:3161), [3162](../raw_map.tsv:3162).




### rel_79__ent_308__ent_543

**All observed names:** Knicks → Nets (4)

Ordered IDs: Ent[ent_308] → Ent[ent_543]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [937](../raw_map.tsv:937) | Knicks | Nets | nsubj\|&lt;-nsubj&lt;-host-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [939](../raw_map.tsv:939) | Knicks | Nets | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |
| [2617](../raw_map.tsv:2617) | Knicks | Nets | nsubj\|&lt;-nsubj&lt;-host-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [2619](../raw_map.tsv:2619) | Knicks | Nets | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Knicks → Nets: Outscore does not specify whether it is a final match result or a partial-period margin.

Cited evidence lines: [937](../raw_map.tsv:937), [939](../raw_map.tsv:939), [2617](../raw_map.tsv:2617), [2619](../raw_map.tsv:2619).

**Review question:** Was the Knicks outscoring of the Nets the completed contest result?
Issue tags: result_scope, mixed_evidence

### rel_79__ent_543__ent_308

**All observed names:** Nets → Knicks (4)

Ordered IDs: Ent[ent_543] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [944](../raw_map.tsv:944) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-outscore-&gt;dobj-&gt;\|dobj |
| [945](../raw_map.tsv:945) | Nets | Knicks | poss\|&lt;-poss&lt;-rout-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [947](../raw_map.tsv:947) | Nets | Knicks | nsubj\|&lt;-nsubj&lt;-outrebound-&gt;dobj-&gt;\|dobj |
| [950](../raw_map.tsv:950) | Nets | Knicks | partmod\|-&gt;partmod-&gt;trail-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Nets → Knicks: An explicit rout-of establishes a completed victory despite other score/standings evidence.

Cited evidence lines: [944](../raw_map.tsv:944), [945](../raw_map.tsv:945), [947](../raw_map.tsv:947), [950](../raw_map.tsv:950).


Issue tags: mixed_evidence
