# audit_e318fe663470 — rel_85: director of organization

Predicate ID: director_of

Person X holds or held an explicit director office of, for or at organization or institution Y.

Includes: explicit director/co-director; functional directorship such as communications or research director within Y; historical office. Excludes: head/president/chair/executive alone; spokesperson/adviser/publisher/professor/member alone; performing or authorship alone. Ambiguous unless resolved by case-local evidence: personal principal with omitted organization; abstract topic in place of the actual institution. Does not require sole chief control of the entire institution.

Complete census: 3 supported, 4 incorrect, 0 ambiguous; N=7. Precision 3/7=42.86% to 3/7=42.86%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | nsubj\|&lt;-nsubj&lt;-surpass-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;master-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-deliver-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-announcement-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-office-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;caution-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;leave-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_85__ent_919__ent_918

**All observed names:** Louis J. Freeh → F.B.I. (4)

Ordered IDs: Ent[ent_919] → Ent[ent_918]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8474](../raw_map.tsv:8474) | Louis J. Freeh | F.B.I. | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [8477](../raw_map.tsv:8477) | Louis J. Freeh | F.B.I. | rcmod\|-&gt;rcmod-&gt;leave-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;nn-&gt;\|nn |
| [8479](../raw_map.tsv:8479) | Louis J. Freeh | F.B.I. | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| [8480](../raw_map.tsv:8480) | Louis J. Freeh | F.B.I. | poss\|&lt;-poss&lt;-announcement-&gt;prep-&gt;as-&gt;pobj-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Louis J. Freeh → F.B.I.: An explicit director title or established former director office identifies institutional directorship.

Cited evidence lines: [8474](../raw_map.tsv:8474), [8477](../raw_map.tsv:8477), [8479](../raw_map.tsv:8479), [8480](../raw_map.tsv:8480).


Issue tags: mixed_evidence

### rel_85__ent_189__ent_1002

**All observed names:** Congress → Washington (3)

Ordered IDs: Ent[ent_189] → Ent[ent_1002]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5180](../raw_map.tsv:5180) | Congress | Washington | poss\|&lt;-poss&lt;-office-&gt;nn-&gt;\|nn |
| [5181](../raw_map.tsv:5181) | Congress | Washington | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-deliver-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5182](../raw_map.tsv:5182) | Congress | Washington | nsubj\|&lt;-nsubj&lt;-send-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Congress → Washington: Geographic communication, a master metaphor or surpassing another country does not establish a director title.

Cited evidence lines: [5180](../raw_map.tsv:5180), [5181](../raw_map.tsv:5181), [5182](../raw_map.tsv:5182).




### rel_85__ent_89__ent_1030

**All observed names:** Whitey Herzog → Cardinals (2)

Ordered IDs: Ent[ent_89] → Ent[ent_1030]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3382](../raw_map.tsv:3382) | Whitey Herzog | Cardinals | appos\|-&gt;appos-&gt;master-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3383](../raw_map.tsv:3383) | Whitey Herzog | Cardinals | rcmod\|-&gt;rcmod-&gt;caution-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Whitey Herzog → Cardinals: Geographic communication, a master metaphor or surpassing another country does not establish a director title.

Cited evidence lines: [3382](../raw_map.tsv:3382), [3383](../raw_map.tsv:3383).




### rel_85__ent_809__ent_381

**All observed names:** Mary Ann Rothman → Council of New York Cooperatives (1)

Ordered IDs: Ent[ent_809] → Ent[ent_381]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [180](../raw_map.tsv:180) | Mary Ann Rothman | Council of New York Cooperatives | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Mary Ann Rothman → Council of New York Cooperatives: An explicit director title or established former director office identifies institutional directorship.

Cited evidence lines: [180](../raw_map.tsv:180).




### rel_85__ent_1231__ent_537

**All observed names:** Russia → United States (1)

Ordered IDs: Ent[ent_1231] → Ent[ent_537]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1991](../raw_map.tsv:1991) | Russia | United States | nsubj\|&lt;-nsubj&lt;-surpass-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Russia → United States: Geographic communication, a master metaphor or surpassing another country does not establish a director title.

Cited evidence lines: [1991](../raw_map.tsv:1991).




### rel_85__ent_783__ent_85

**All observed names:** Craig Hammerman → Community Board (1)

Ordered IDs: Ent[ent_783] → Ent[ent_85]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3395](../raw_map.tsv:3395) | Craig Hammerman | Community Board | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Craig Hammerman → Community Board: An explicit director title or established former director office identifies institutional directorship.

Cited evidence lines: [3395](../raw_map.tsv:3395).




### rel_85__ent_1412__ent_1393

**All observed names:** China → United States (1)

Ordered IDs: Ent[ent_1412] → Ent[ent_1393]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5876](../raw_map.tsv:5876) | China | United States | nsubj\|&lt;-nsubj&lt;-surpass-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). China → United States: Geographic communication, a master metaphor or surpassing another country does not establish a director title.

Cited evidence lines: [5876](../raw_map.tsv:5876).



