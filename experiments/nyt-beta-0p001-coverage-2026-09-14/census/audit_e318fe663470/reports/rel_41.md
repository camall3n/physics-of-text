# audit_e318fe663470 — rel_41: politically controls

Predicate ID: politically_controls

Political group X controls or gains control of political body Y.

Includes: control/take-control/retain/regain/win-control; historical political control. Excludes: generic win/be-in alone; individual leadership office without party control; ordinary membership; sporting victory. Ambiguous unless resolved by case-local evidence: incomplete control object or political-group identity.

Complete census: 1 supported, 1 incorrect, 2 ambiguous; N=4. Precision 1/4=25.00% to 3/4=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| 2 | poss\|&lt;-poss&lt;-information&lt;-pobj&lt;-for&lt;-prep&lt;-remove-&gt;nsubj-&gt;\|nsubj |
| 1 | nn\|&lt;-nn&lt;-seizure-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-march-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-seize-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-bear-&gt;prep-&gt;to-&gt;pobj-&gt;parent-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_41__ent_1173__ent_480

**All observed names:** Taliban → Kabul (5)

Ordered IDs: Ent[ent_1173] → Ent[ent_480]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6407](../raw_map.tsv:6407) | Taliban | Kabul | nsubj\|&lt;-nsubj&lt;-seize-&gt;dobj-&gt;\|dobj |
| [6408](../raw_map.tsv:6408) | Taliban | Kabul | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| [6411](../raw_map.tsv:6411) | Taliban | Kabul | nsubj\|&lt;-nsubj&lt;-march-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| [6413](../raw_map.tsv:6413) | Taliban | Kabul | nn\|&lt;-nn&lt;-seizure-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6415](../raw_map.tsv:6415) | Taliban | Kabul | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Taliban → Kabul: Explicit seizure and seized-city wording with military march/take context establishes territorial control.

Cited evidence lines: [6407](../raw_map.tsv:6407), [6408](../raw_map.tsv:6408), [6411](../raw_map.tsv:6411), [6413](../raw_map.tsv:6413), [6415](../raw_map.tsv:6415).


Issue tags: mixed_evidence

### rel_41__ent_308__ent_1005

**All observed names:** Knicks → Bulls (3)

Ordered IDs: Ent[ent_308] → Ent[ent_1005]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [880](../raw_map.tsv:880) | Knicks | Bulls | poss\|&lt;-poss&lt;-information&lt;-pobj&lt;-for&lt;-prep&lt;-remove-&gt;nsubj-&gt;\|nsubj |
| [6048](../raw_map.tsv:6048) | Knicks | Bulls | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| [6050](../raw_map.tsv:6050) | Knicks | Bulls | poss\|&lt;-poss&lt;-information&lt;-pobj&lt;-for&lt;-prep&lt;-remove-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Knicks → Bulls: Sports-team taking and informational fragments do not establish political control.

Cited evidence lines: [880](../raw_map.tsv:880), [6048](../raw_map.tsv:6048), [6050](../raw_map.tsv:6050).




### rel_41__ent_1318__ent_479

**All observed names:** China → Hong Kong (3)

Ordered IDs: Ent[ent_1318] → Ent[ent_479]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6447](../raw_map.tsv:6447) | China | Hong Kong | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |
| [6449](../raw_map.tsv:6449) | China | Hong Kong | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-bear-&gt;prep-&gt;to-&gt;pobj-&gt;parent-&gt;nn-&gt;\|nn |
| [6452](../raw_map.tsv:6452) | China | Hong Kong | poss\|&lt;-poss&lt;-official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). China → Hong Kong: Bare take does not distinguish actual political control from proposed transfer or another sense; the remaining rows do not resolve it.

Cited evidence lines: [6447](../raw_map.tsv:6447), [6449](../raw_map.tsv:6449), [6452](../raw_map.tsv:6452).

**Review question:** Does take assert achieved political control of the place or institution?
Issue tags: control_ambiguity

### rel_41__ent_7__ent_586

**All observed names:** Democrat → White House (1)

Ordered IDs: Ent[ent_7] → Ent[ent_586]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2712](../raw_map.tsv:2712) | Democrat | White House | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;\|dobj |

**Judgment: ambiguous** (primary). Democrat → White House: Bare take does not distinguish actual political control from proposed transfer or another sense; the remaining rows do not resolve it.

Cited evidence lines: [2712](../raw_map.tsv:2712).

**Review question:** Does take assert achieved political control of the place or institution?
Issue tags: control_ambiguity
