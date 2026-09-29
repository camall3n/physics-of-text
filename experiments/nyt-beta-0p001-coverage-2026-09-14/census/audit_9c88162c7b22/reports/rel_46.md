# audit_9c88162c7b22 — rel_46: official of institution

Predicate ID: official_of

Person X holds or held an explicitly identified official role in institution or governmental body Y.

Includes: explicit official-of, official-at, or institutional official description; historical official role; a named formal public office that unambiguously entails official status. Excludes: ordinary employment without an official role; a city dateline or institution standing in the person slot; a generic adviser or spokesperson without official status; proposed appointment alone. Ambiguous unless resolved by case-local evidence: unclear person versus place identity; official title attachment unresolved; a generic institutional role without established official status. Separate from managerial_office_in: an official need not be a manager. Do not infer official status from every professional affiliation.

Complete census: 2 supported, 0 incorrect, 1 ambiguous; N=3. Precision 2/3=66.67% to 3/3=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;official-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;envoy-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;authority-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;operation-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;no.-&gt;dep-&gt;official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-neighborhood&lt;-pobj&lt;-in&lt;-prep&lt;-kill&lt;-dep&lt;-say-&gt;nsubj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;person-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;from-&gt;pobj-&gt;job-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-leave-&gt;dobj-&gt;post-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-plea&lt;-dobj&lt;-accept-&gt;dobj-&gt;official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-explode-&gt;prep-&gt;accord-&gt;dep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-neighborhood&lt;-pobj&lt;-in&lt;-prep&lt;-explode-&gt;prep-&gt;accord-&gt;dep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;force-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;step-&gt;advmod-&gt;down-&gt;dep-&gt;from-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_46__ent_972__ent_971

**All observed names:** Webster L. Hubbell → Justice Department (10)

Ordered IDs: Ent[ent_972] → Ent[ent_971]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7469](../raw_map.tsv:7469) | Webster L. Hubbell | Justice Department | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| [7470](../raw_map.tsv:7470) | Webster L. Hubbell | Justice Department | appos\|-&gt;appos-&gt;official-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7471](../raw_map.tsv:7471) | Webster L. Hubbell | Justice Department | appos\|-&gt;appos-&gt;no.-&gt;dep-&gt;official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7472](../raw_map.tsv:7472) | Webster L. Hubbell | Justice Department | rcmod\|-&gt;rcmod-&gt;step-&gt;advmod-&gt;down-&gt;dep-&gt;from-&gt;pobj-&gt;\|pobj |
| [7473](../raw_map.tsv:7473) | Webster L. Hubbell | Justice Department | rcmod\|-&gt;rcmod-&gt;force-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [7474](../raw_map.tsv:7474) | Webster L. Hubbell | Justice Department | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-plea&lt;-dobj&lt;-accept-&gt;dobj-&gt;official-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7475](../raw_map.tsv:7475) | Webster L. Hubbell | Justice Department | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-work-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [7476](../raw_map.tsv:7476) | Webster L. Hubbell | Justice Department | pobj\|&lt;-pobj&lt;-after&lt;-prep&lt;-leave-&gt;dobj-&gt;post-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7477](../raw_map.tsv:7477) | Webster L. Hubbell | Justice Department | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;from-&gt;pobj-&gt;job-&gt;nn-&gt;\|nn |
| [7478](../raw_map.tsv:7478) | Webster L. Hubbell | Justice Department | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;person-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Webster L. Hubbell → Justice Department: Explicit official-at or institution-modifying official title establishes formal official status.

Cited evidence lines: [7469](../raw_map.tsv:7469), [7470](../raw_map.tsv:7470), [7471](../raw_map.tsv:7471), [7472](../raw_map.tsv:7472), [7473](../raw_map.tsv:7473), [7474](../raw_map.tsv:7474), [7475](../raw_map.tsv:7475), [7476](../raw_map.tsv:7476), [7477](../raw_map.tsv:7477), [7478](../raw_map.tsv:7478).


Issue tags: mixed_evidence

### rel_46__ent_84__ent_715

**All observed names:** Baghdad → Interior Ministry (5)

Ordered IDs: Ent[ent_84] → Ent[ent_715]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7446](../raw_map.tsv:7446) | Baghdad | Interior Ministry | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| [7449](../raw_map.tsv:7449) | Baghdad | Interior Ministry | appos\|-&gt;appos-&gt;official-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7451](../raw_map.tsv:7451) | Baghdad | Interior Ministry | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-explode-&gt;prep-&gt;accord-&gt;dep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| [7454](../raw_map.tsv:7454) | Baghdad | Interior Ministry | nn\|&lt;-nn&lt;-neighborhood&lt;-pobj&lt;-in&lt;-prep&lt;-kill&lt;-dep&lt;-say-&gt;nsubj-&gt;official-&gt;nn-&gt;\|nn |
| [7455](../raw_map.tsv:7455) | Baghdad | Interior Ministry | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-neighborhood&lt;-pobj&lt;-in&lt;-prep&lt;-explode-&gt;prep-&gt;accord-&gt;dep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). Baghdad → Interior Ministry: Baghdad is a dateline or place in the person slot; Interior Ministry official comments do not identify that official as Baghdad.

Cited evidence lines: [7446](../raw_map.tsv:7446), [7449](../raw_map.tsv:7449), [7451](../raw_map.tsv:7451), [7454](../raw_map.tsv:7454), [7455](../raw_map.tsv:7455).

**Review question:** Which named Interior Ministry official is speaking in the Baghdad-dateline rows?
Issue tags: dateline_argument

### rel_46__ent_970__ent_730

**All observed names:** Yasushi Akashi → United Nations (4)

Ordered IDs: Ent[ent_970] → Ent[ent_730]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7459](../raw_map.tsv:7459) | Yasushi Akashi | United Nations | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| [7466](../raw_map.tsv:7466) | Yasushi Akashi | United Nations | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;operation-&gt;nn-&gt;\|nn |
| [7467](../raw_map.tsv:7467) | Yasushi Akashi | United Nations | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;authority-&gt;nn-&gt;\|nn |
| [7468](../raw_map.tsv:7468) | Yasushi Akashi | United Nations | appos\|-&gt;appos-&gt;envoy-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Yasushi Akashi → United Nations: Explicit official-at or institution-modifying official title establishes formal official status.

Cited evidence lines: [7459](../raw_map.tsv:7459), [7466](../raw_map.tsv:7466), [7467](../raw_map.tsv:7467), [7468](../raw_map.tsv:7468).


Issue tags: mixed_evidence
