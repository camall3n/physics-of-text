# audit_dcb746fa83d6 — rel_91: physically present in place

Predicate ID: present_in

Entity X is or was physically present in geographic place Y, temporarily or as a resident or located institution.

Includes: explicit unqualified physical be-in or presence; a direct residence or physical location statement; a completed arrival, visit, or departure that establishes presence in Y. Excludes: membership in an organization; participation or victory in a nongeographic event; political office or control alone; discussion, publication, or other abstract presence; a destination without evidence of realized movement or presence. Ambiguous unless resolved by case-local evidence: place-versus-institution metonymy; an incomplete geographic argument; uncertain attachment or explicit hypothetical presence. Physical presence is weaker than residence or headquarters. Those narrower predicates retain their existing definitions. Do not infer a geographic location from membership or event participation.

Complete census: 1 supported, 1 incorrect, 1 ambiguous; N=3. Precision 1/3=33.33% to 2/3=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-briefing&lt;-pobj&lt;-at&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-through&lt;-prep&lt;-make-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-claim-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-leave-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-vote-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-want-&gt;dobj-&gt;\|dobj |
| 1 | partmod\|-&gt;partmod-&gt;remain-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-roundup&lt;-pobj&lt;-in&lt;-prep&lt;-take-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand&lt;-dobj&lt;-strip-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;residence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;resident-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_91__ent_826__ent_234

**All observed names:** Palestinians → East Jerusalem (6); Palestinians → Gaza (1)

Ordered IDs: Ent[ent_826] → Ent[ent_234]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6126](../raw_map.tsv:6126) | Palestinians | East Jerusalem | nsubj\|&lt;-nsubj&lt;-claim-&gt;dobj-&gt;\|dobj |
| [6128](../raw_map.tsv:6128) | Palestinians | East Jerusalem | rcmod\|-&gt;rcmod-&gt;resident-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6129](../raw_map.tsv:6129) | Palestinians | East Jerusalem | nsubj\|&lt;-nsubj&lt;-vote-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6130](../raw_map.tsv:6130) | Palestinians | East Jerusalem | prep\|-&gt;prep-&gt;with-&gt;pobj-&gt;residence-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6132](../raw_map.tsv:6132) | Palestinians | East Jerusalem | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand&lt;-dobj&lt;-strip-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6134](../raw_map.tsv:6134) | Palestinians | East Jerusalem | nsubj\|&lt;-nsubj&lt;-want-&gt;dobj-&gt;\|dobj |
| [8156](../raw_map.tsv:8156) | Palestinians | Gaza | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Palestinians → East Jerusalem; Palestinians → Gaza: Local presence/residence evidence is split between East Jerusalem and Gaza, incompatible places merged into one entity.

Cited evidence lines: [6126](../raw_map.tsv:6126), [6128](../raw_map.tsv:6128), [6129](../raw_map.tsv:6129), [6130](../raw_map.tsv:6130), [6132](../raw_map.tsv:6132), [6134](../raw_map.tsv:6134), [8156](../raw_map.tsv:8156).

**Review question:** Does this fact refer to East Jerusalem or Gaza?
Issue tags: entity_identity, mixed_evidence, identity_ambiguity

### rel_91__ent_1101__ent_1198

**All observed names:** Jews → Poland (5)

Ordered IDs: Ent[ent_1101] → Ent[ent_1198]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6096](../raw_map.tsv:6096) | Jews | Poland | nsubj\|&lt;-nsubj&lt;-leave-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6099](../raw_map.tsv:6099) | Jews | Poland | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-thousand-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6100](../raw_map.tsv:6100) | Jews | Poland | partmod\|-&gt;partmod-&gt;remain-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6101](../raw_map.tsv:6101) | Jews | Poland | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6104](../raw_map.tsv:6104) | Jews | Poland | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-roundup&lt;-pobj&lt;-in&lt;-prep&lt;-take-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jews → Poland: Explicit remain-in and died-in evidence establishes physical presence in Poland.

Cited evidence lines: [6096](../raw_map.tsv:6096), [6099](../raw_map.tsv:6099), [6100](../raw_map.tsv:6100), [6101](../raw_map.tsv:6101), [6104](../raw_map.tsv:6104).


Issue tags: mixed_evidence

### rel_91__ent_1390__ent_696

**All observed names:** State Department → Richard Boucher (2)

Ordered IDs: Ent[ent_1390] → Ent[ent_696]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5440](../raw_map.tsv:5440) | State Department | Richard Boucher | nn\|&lt;-nn&lt;-briefing&lt;-pobj&lt;-at&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [5444](../raw_map.tsv:5444) | State Department | Richard Boucher | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-through&lt;-prep&lt;-make-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). State Department → Richard Boucher: Inverse spokesperson/briefing paths do not place the institution in a geographic location.

Cited evidence lines: [5440](../raw_map.tsv:5440), [5444](../raw_map.tsv:5444).



