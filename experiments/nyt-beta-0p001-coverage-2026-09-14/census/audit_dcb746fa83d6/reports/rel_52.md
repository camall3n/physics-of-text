# audit_dcb746fa83d6 — rel_52: winner or champion of

Predicate ID: winner_of

Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title.

Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

Complete census: 1 supported, 3 incorrect, 0 ambiguous; N=4. Precision 1/4=25.00% to 1/4=25.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | dobj\|&lt;-dobj&lt;-write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-find-&gt;partmod-&gt;write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-come-&gt;prep-&gt;at-&gt;pobj-&gt;hole-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-shoot-&gt;prep-&gt;in-&gt;pobj-&gt;playoff-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-single-&gt;prep-&gt;as-&gt;pobj-&gt;key-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-present-&gt;prep-&gt;with-&gt;pobj-&gt;trophy-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-party&lt;-pobj&lt;-of&lt;-prep&lt;-leadership&lt;-pobj&lt;-for&lt;-prep&lt;-vote&lt;-pobj&lt;-in&lt;-prep&lt;-victorious-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;bitter-&gt;prep-&gt;since-&gt;pobj-&gt;assassination-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_52__ent_750__ent_992

**All observed names:** Curtis Strange → United States Open (6)

Ordered IDs: Ent[ent_750] → Ent[ent_992]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7978](../raw_map.tsv:7978) | Curtis Strange | United States Open | rcmod\|-&gt;rcmod-&gt;win-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7979](../raw_map.tsv:7979) | Curtis Strange | United States Open | nsubjpass\|&lt;-nsubjpass&lt;-present-&gt;prep-&gt;with-&gt;pobj-&gt;trophy-&gt;nn-&gt;\|nn |
| [7980](../raw_map.tsv:7980) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-single-&gt;prep-&gt;as-&gt;pobj-&gt;key-&gt;prep-&gt;to-&gt;pobj-&gt;victory-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7981](../raw_map.tsv:7981) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-shoot-&gt;prep-&gt;in-&gt;pobj-&gt;playoff-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7982](../raw_map.tsv:7982) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-make-&gt;dobj-&gt;championship-&gt;nn-&gt;\|nn |
| [7983](../raw_map.tsv:7983) | Curtis Strange | United States Open | nsubj\|&lt;-nsubj&lt;-come-&gt;prep-&gt;at-&gt;pobj-&gt;hole-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Curtis Strange → United States Open: Explicit winning the United States Open championship and receiving its trophy establish the event win.

Cited evidence lines: [7978](../raw_map.tsv:7978), [7979](../raw_map.tsv:7979), [7980](../raw_map.tsv:7980), [7981](../raw_map.tsv:7981), [7982](../raw_map.tsv:7982), [7983](../raw_map.tsv:7983).


Issue tags: mixed_evidence

### rel_52__ent_1434__ent_941

**All observed names:** Israel → Yitzhak Rabin (2)

Ordered IDs: Ent[ent_1434] → Ent[ent_941]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7062](../raw_map.tsv:7062) | Israel | Yitzhak Rabin | rcmod\|-&gt;rcmod-&gt;bitter-&gt;prep-&gt;since-&gt;pobj-&gt;assassination-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7064](../raw_map.tsv:7064) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-party&lt;-pobj&lt;-of&lt;-prep&lt;-leadership&lt;-pobj&lt;-for&lt;-prep&lt;-vote&lt;-pobj&lt;-in&lt;-prep&lt;-victorious-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Israel → Yitzhak Rabin: Inverse political leadership or newspaper-writing context does not establish an award or competition win.

Cited evidence lines: [7062](../raw_map.tsv:7062), [7064](../raw_map.tsv:7064).




### rel_52__ent_719__ent_1313

**All observed names:** Janet Maslin → The Times (2)

Ordered IDs: Ent[ent_719] → Ent[ent_1313]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7285](../raw_map.tsv:7285) | Janet Maslin | The Times | dobj\|&lt;-dobj&lt;-write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7289](../raw_map.tsv:7289) | Janet Maslin | The Times | nsubj\|&lt;-nsubj&lt;-find-&gt;partmod-&gt;write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Janet Maslin → The Times: Inverse political leadership or newspaper-writing context does not establish an award or competition win.

Cited evidence lines: [7285](../raw_map.tsv:7285), [7289](../raw_map.tsv:7289).




### rel_52__ent_710__ent_1058

**All observed names:** Vincent Canby → The Times (2)

Ordered IDs: Ent[ent_710] → Ent[ent_1058]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7295](../raw_map.tsv:7295) | Vincent Canby | The Times | dobj\|&lt;-dobj&lt;-write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7301](../raw_map.tsv:7301) | Vincent Canby | The Times | nsubj\|&lt;-nsubj&lt;-find-&gt;partmod-&gt;write-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Vincent Canby → The Times: Inverse political leadership or newspaper-writing context does not establish an award or competition win.

Cited evidence lines: [7295](../raw_map.tsv:7295), [7301](../raw_map.tsv:7301).



