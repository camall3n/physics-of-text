# audit_9c88162c7b22 — rel_63: president of institution

Predicate ID: president_of

Person X holds or held an explicitly identified president office in organization, team, public body, or institution Y.

Includes: explicit president office; a functional or departmental president role within Y; historical or former presidency. Excludes: manager, director, chairman, head, or executive alone without a president title; ordinary employment or membership; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: president-elect or unresolved tenure without evidence of holding office; an incomplete institution or personal principal; unclear holder or title attachment. This specific title is separate from president_or_manager_of and managerial_office_in. It does not require that the officeholder be the sole head of Y.

Complete census: 1 supported, 2 incorrect, 1 ambiguous; N=4. Precision 1/4=25.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 1 | appos\|-&gt;appos-&gt;index-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-fund-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-president-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-resettle-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-act-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubj\|&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-allow-&gt;purpcl-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-give&lt;-prep&lt;-speech&lt;-pobj&lt;-to&lt;-prep&lt;-refer-&gt;dep-&gt;open-&gt;dobj-&gt;meeting-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-emigration-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-resignation&lt;-pobj&lt;-for&lt;-prep&lt;-call-&gt;dep-&gt;adviser-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter-&gt;dep-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;board-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_63__ent_784__ent_534

**All observed names:** Goldman → Sachs (7)

Ordered IDs: Ent[ent_784] → Ent[ent_534]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [633](../raw_map.tsv:633) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [635](../raw_map.tsv:635) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-act-&gt;nsubj-&gt;\|nsubj |
| [637](../raw_map.tsv:637) | Goldman | Sachs | appos\|-&gt;appos-&gt;index-&gt;nn-&gt;\|nn |
| [639](../raw_map.tsv:639) | Goldman | Sachs | dep\|&lt;-dep&lt;-president-&gt;nn-&gt;\|nn |
| [640](../raw_map.tsv:640) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-tell-&gt;nsubj-&gt;\|nsubj |
| [641](../raw_map.tsv:641) | Goldman | Sachs | nsubj\|&lt;-nsubj&lt;-be-&gt;nsubj-&gt;\|nsubj |
| [642](../raw_map.tsv:642) | Goldman | Sachs | dep\|&lt;-dep&lt;-fund-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Goldman → Sachs: Goldman and Sachs appear in fund/index and malformed president attachments, suggesting one company name split across the two entity slots.

Cited evidence lines: [633](../raw_map.tsv:633), [635](../raw_map.tsv:635), [637](../raw_map.tsv:637), [639](../raw_map.tsv:639), [640](../raw_map.tsv:640), [641](../raw_map.tsv:641), [642](../raw_map.tsv:642).

**Review question:** Does Goldman identify a person holding office at Sachs, or are both words parts of the company Goldman Sachs?
Issue tags: argument_boundary

### rel_63__ent_136__ent_256

**All observed names:** Juan Antonio Samaranch → I.O.C. (5)

Ordered IDs: Ent[ent_136] → Ent[ent_256]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2859](../raw_map.tsv:2859) | Juan Antonio Samaranch | I.O.C. | rcmod\|-&gt;rcmod-&gt;preside-&gt;prep-&gt;over-&gt;pobj-&gt;meeting-&gt;prep-&gt;of-&gt;pobj-&gt;board-&gt;nn-&gt;\|nn |
| [2861](../raw_map.tsv:2861) | Juan Antonio Samaranch | I.O.C. | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-successor-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2863](../raw_map.tsv:2863) | Juan Antonio Samaranch | I.O.C. | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-letter-&gt;dep-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2864](../raw_map.tsv:2864) | Juan Antonio Samaranch | I.O.C. | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-resignation&lt;-pobj&lt;-for&lt;-prep&lt;-call-&gt;dep-&gt;adviser-&gt;nsubj-&gt;president-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2865](../raw_map.tsv:2865) | Juan Antonio Samaranch | I.O.C. | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-give&lt;-prep&lt;-speech&lt;-pobj&lt;-to&lt;-prep&lt;-refer-&gt;dep-&gt;open-&gt;dobj-&gt;meeting-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Juan Antonio Samaranch → I.O.C.: President attachment and successor-as-president evidence establish the I.O.C. presidency.

Cited evidence lines: [2859](../raw_map.tsv:2859), [2861](../raw_map.tsv:2861), [2863](../raw_map.tsv:2863), [2864](../raw_map.tsv:2864), [2865](../raw_map.tsv:2865).


Issue tags: mixed_evidence

### rel_63__ent_1101__ent_405

**All observed names:** Jews → Soviet Union (4)

Ordered IDs: Ent[ent_1101] → Ent[ent_405]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4035](../raw_map.tsv:4035) | Jews | Soviet Union | partmod\|-&gt;partmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [4038](../raw_map.tsv:4038) | Jews | Soviet Union | nsubjpass\|&lt;-nsubjpass&lt;-allow-&gt;purpcl-&gt;leave-&gt;dobj-&gt;\|dobj |
| [4042](../raw_map.tsv:4042) | Jews | Soviet Union | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-emigration-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4043](../raw_map.tsv:4043) | Jews | Soviet Union | dobj\|&lt;-dobj&lt;-resettle-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Jews → Soviet Union: Emigration or an auction showroom is unrelated to president office.

Cited evidence lines: [4035](../raw_map.tsv:4035), [4038](../raw_map.tsv:4038), [4042](../raw_map.tsv:4042), [4043](../raw_map.tsv:4043).


Issue tags: wrong_predicate

### rel_63__ent_1168__ent_1169

**All observed names:** Christie → Park Avenue (1)

Ordered IDs: Ent[ent_1168] → Ent[ent_1169]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6232](../raw_map.tsv:6232) | Christie | Park Avenue | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Christie → Park Avenue: Emigration or an auction showroom is unrelated to president office.

Cited evidence lines: [6232](../raw_map.tsv:6232).


Issue tags: wrong_predicate
