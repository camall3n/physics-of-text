# audit_dcb746fa83d6 — rel_90: physically present in place

Predicate ID: present_in

Entity X is or was physically present in geographic place Y, temporarily or as a resident or located institution.

Includes: explicit unqualified physical be-in or presence; a direct residence or physical location statement; a completed arrival, visit, or departure that establishes presence in Y. Excludes: membership in an organization; participation or victory in a nongeographic event; political office or control alone; discussion, publication, or other abstract presence; a destination without evidence of realized movement or presence. Ambiguous unless resolved by case-local evidence: place-versus-institution metonymy; an incomplete geographic argument; uncertain attachment or explicit hypothetical presence. Physical presence is weaker than residence or headquarters. Those narrower predicates retain their existing definitions. Do not infer a geographic location from membership or event participation.

Complete census: 2 supported, 3 incorrect, 1 ambiguous; N=6. Precision 2/6=33.33% to 3/6=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| 2 | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-arrive-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-visit-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-get-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-player-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-play-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-security&lt;-nsubj&lt;-depend-&gt;prep-&gt;on-&gt;pobj-&gt;membership-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_90__ent_1408__ent_586

**All observed names:** Ms. Lewinsky → White House (6)

Ordered IDs: Ent[ent_1408] → Ent[ent_586]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3489](../raw_map.tsv:3489) | Ms. Lewinsky | White House | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |
| [3491](../raw_map.tsv:3491) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [3493](../raw_map.tsv:3493) | Ms. Lewinsky | White House | poss\|&lt;-poss&lt;-visit-&gt;nn-&gt;\|nn |
| [6176](../raw_map.tsv:6176) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [6178](../raw_map.tsv:6178) | Ms. Lewinsky | White House | poss\|&lt;-poss&lt;-visit-&gt;nn-&gt;\|nn |
| [6180](../raw_map.tsv:6180) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-arrive-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Ms. Lewinsky → White House: Actual arrivals and visits establish physical presence at the White House site.

Cited evidence lines: [3489](../raw_map.tsv:3489), [3491](../raw_map.tsv:3491), [3493](../raw_map.tsv:3493), [6176](../raw_map.tsv:6176), [6178](../raw_map.tsv:6178), [6180](../raw_map.tsv:6180).


Issue tags: mixed_evidence

### rel_90__ent_360__ent_1415

**All observed names:** Ms. Lewinsky → White House (3); John F. Kennedy → White House (1)

Ordered IDs: Ent[ent_360] → Ent[ent_1415]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2748](../raw_map.tsv:2748) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [3492](../raw_map.tsv:3492) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [3495](../raw_map.tsv:3495) | Ms. Lewinsky | White House | nsubj\|&lt;-nsubj&lt;-arrive-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6174](../raw_map.tsv:6174) | Ms. Lewinsky | White House | appos\|-&gt;appos-&gt;intern-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Ms. Lewinsky → White House; John F. Kennedy → White House: The latent subject merges John F. Kennedy and Ms. Lewinsky; local presence evidence cannot make those distinct people one coherent inferred entity.

Cited evidence lines: [2748](../raw_map.tsv:2748), [3492](../raw_map.tsv:3492), [3495](../raw_map.tsv:3495), [6174](../raw_map.tsv:6174).

**Review question:** Should John F. Kennedy and Ms. Lewinsky be separated before evaluating physical presence?
Issue tags: argument_identity, mixed_evidence

### rel_90__ent_818__ent_1196

**All observed names:** China → World Trade Organization (2)

Ordered IDs: Ent[ent_818] → Ent[ent_1196]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1925](../raw_map.tsv:1925) | China | World Trade Organization | dobj\|&lt;-dobj&lt;-get-&gt;prep-&gt;into-&gt;pobj-&gt;\|pobj |
| [1927](../raw_map.tsv:1927) | China | World Trade Organization | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). China → World Trade Organization: Institutional accession or athletic membership is not presence in a geographic place.

Cited evidence lines: [1925](../raw_map.tsv:1925), [1927](../raw_map.tsv:1927).




### rel_90__ent_1198__ent_810

**All observed names:** Poland → European Union (2)

Ordered IDs: Ent[ent_1198] → Ent[ent_810]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1945](../raw_map.tsv:1945) | Poland | European Union | nsubj\|&lt;-nsubj&lt;-enter-&gt;dobj-&gt;\|dobj |
| [1946](../raw_map.tsv:1946) | Poland | European Union | poss\|&lt;-poss&lt;-security&lt;-nsubj&lt;-depend-&gt;prep-&gt;on-&gt;pobj-&gt;membership-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Poland → European Union: Institutional accession or athletic membership is not presence in a geographic place.

Cited evidence lines: [1945](../raw_map.tsv:1945), [1946](../raw_map.tsv:1946).




### rel_90__ent_66__ent_896

**All observed names:** Kidd → Nets (2)

Ordered IDs: Ent[ent_66] → Ent[ent_896]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3111](../raw_map.tsv:3111) | Kidd | Nets | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-play-&gt;nsubj-&gt;\|nsubj |
| [3112](../raw_map.tsv:3112) | Kidd | Nets | nsubj\|&lt;-nsubj&lt;-player-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Kidd → Nets: Institutional accession or athletic membership is not presence in a geographic place.

Cited evidence lines: [3111](../raw_map.tsv:3111), [3112](../raw_map.tsv:3112).




### rel_90__ent_669__ent_167

**All observed names:** Americans → Iraq (1)

Ordered IDs: Ent[ent_669] → Ent[ent_167]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8143](../raw_map.tsv:8143) | Americans | Iraq | nsubj\|&lt;-nsubj&lt;-die-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Americans → Iraq: Dying in Iraq establishes presence there of affected Americans, not of every American.

Cited evidence lines: [8143](../raw_map.tsv:8143).


Issue tags: broad_predicate
