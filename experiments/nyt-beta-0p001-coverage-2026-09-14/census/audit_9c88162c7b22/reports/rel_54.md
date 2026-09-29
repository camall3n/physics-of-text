# audit_9c88162c7b22 — rel_54: subsidiary or organizational unit of

Predicate ID: subsidiary_of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

Complete census: 3 supported, 2 incorrect, 0 ambiguous; N=5. Precision 3/5=60.00% to 3/5=60.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 3 | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| 3 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 3 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-president-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-agency&lt;-nsubj&lt;-part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | dep\|&lt;-dep&lt;-agency-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-handle&lt;-rcmod&lt;-account&lt;-pobj&lt;-on&lt;-prep&lt;-agency-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-award-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-be-&gt;attr-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-team-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-executive-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-president&lt;-pobj&lt;-with&lt;-prep&lt;-interaction-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_54__ent_421__ent_423

**All observed names:** Fallon Worldwide → Publicis Groupe (5)

Ordered IDs: Ent[ent_421] → Ent[ent_423]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4622](../raw_map.tsv:4622) | Fallon Worldwide | Publicis Groupe | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4625](../raw_map.tsv:4625) | Fallon Worldwide | Publicis Groupe | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4626](../raw_map.tsv:4626) | Fallon Worldwide | Publicis Groupe | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-handle&lt;-rcmod&lt;-account&lt;-pobj&lt;-on&lt;-prep&lt;-agency-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4627](../raw_map.tsv:4627) | Fallon Worldwide | Publicis Groupe | dep\|&lt;-dep&lt;-agency-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4629](../raw_map.tsv:4629) | Fallon Worldwide | Publicis Groupe | appos\|&lt;-appos&lt;-agency&lt;-nsubj&lt;-part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Fallon Worldwide → Publicis Groupe: Office/agency organizational-part attachment establishes the named child agency as part of the parent group.

Cited evidence lines: [4622](../raw_map.tsv:4622), [4625](../raw_map.tsv:4625), [4626](../raw_map.tsv:4626), [4627](../raw_map.tsv:4627), [4629](../raw_map.tsv:4629).




### rel_54__ent_426__ent_668

**All observed names:** Arnold Worldwide → Arnold Worldwide Partners division (5)

Ordered IDs: Ent[ent_426] → Ent[ent_668]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4662](../raw_map.tsv:4662) | Arnold Worldwide | Arnold Worldwide Partners division | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-president-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4663](../raw_map.tsv:4663) | Arnold Worldwide | Arnold Worldwide Partners division | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4665](../raw_map.tsv:4665) | Arnold Worldwide | Arnold Worldwide Partners division | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-team-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4666](../raw_map.tsv:4666) | Arnold Worldwide | Arnold Worldwide Partners division | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-be-&gt;attr-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4668](../raw_map.tsv:4668) | Arnold Worldwide | Arnold Worldwide Partners division | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Arnold Worldwide → Arnold Worldwide Partners division: Office/agency organizational-part attachment establishes the named child agency as part of the parent group.

Cited evidence lines: [4662](../raw_map.tsv:4662), [4663](../raw_map.tsv:4663), [4665](../raw_map.tsv:4665), [4666](../raw_map.tsv:4666), [4668](../raw_map.tsv:4668).




### rel_54__ent_649__ent_880

**All observed names:** DDB Worldwide → Omnicom Group (4)

Ordered IDs: Ent[ent_649] → Ent[ent_880]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4633](../raw_map.tsv:4633) | DDB Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4634](../raw_map.tsv:4634) | DDB Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-president-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4635](../raw_map.tsv:4635) | DDB Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;appos-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4638](../raw_map.tsv:4638) | DDB Worldwide | Omnicom Group | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-office&lt;-pobj&lt;-to&lt;-prep&lt;-award-&gt;dobj-&gt;part-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). DDB Worldwide → Omnicom Group: Office/agency organizational-part attachment establishes the named child agency as part of the parent group.

Cited evidence lines: [4633](../raw_map.tsv:4633), [4634](../raw_map.tsv:4634), [4635](../raw_map.tsv:4635), [4638](../raw_map.tsv:4638).




### rel_54__ent_309__ent_1004

**All observed names:** Red Sox → Yankees (3)

Ordered IDs: Ent[ent_309] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [869](../raw_map.tsv:869) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| [2669](../raw_map.tsv:2669) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |
| [6935](../raw_map.tsv:6935) | Red Sox | Yankees | nsubj\|&lt;-nsubj&lt;-shock-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Red Sox → Yankees: Shocking a rival team is competitive action, not subsidiary containment.

Cited evidence lines: [869](../raw_map.tsv:869), [2669](../raw_map.tsv:2669), [6935](../raw_map.tsv:6935).


Issue tags: wrong_predicate

### rel_54__ent_695__ent_210

**All observed names:** Pakistan → Gen. Pervez Musharraf (2)

Ordered IDs: Ent[ent_695] → Ent[ent_210]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5282](../raw_map.tsv:5282) | Pakistan | Gen. Pervez Musharraf | poss\|&lt;-poss&lt;-president&lt;-pobj&lt;-with&lt;-prep&lt;-interaction-&gt;appos-&gt;\|appos |
| [5285](../raw_map.tsv:5285) | Pakistan | Gen. Pervez Musharraf | poss\|&lt;-poss&lt;-executive-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Pakistan → Gen. Pervez Musharraf: A country's president or executive is a person, not its organizational parent.

Cited evidence lines: [5282](../raw_map.tsv:5282), [5285](../raw_map.tsv:5285).


Issue tags: wrong_argument_type
