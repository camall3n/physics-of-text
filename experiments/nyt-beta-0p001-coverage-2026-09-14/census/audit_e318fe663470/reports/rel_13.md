# audit_e318fe663470 — rel_13: physically present in place

Predicate ID: present_in

Entity X is or was physically present in geographic place Y, temporarily or as a resident or located institution.

Includes: explicit unqualified physical be-in or presence; a direct residence or physical location statement; a completed arrival, visit, or departure that establishes presence in Y. Excludes: membership in an organization; participation or victory in a nongeographic event; political office or control alone; discussion, publication, or other abstract presence; a destination without evidence of realized movement or presence. Ambiguous unless resolved by case-local evidence: place-versus-institution metonymy; an incomplete geographic argument; uncertain attachment or explicit hypothetical presence. Physical presence is weaker than residence or headquarters. Those narrower predicates retain their existing definitions. Do not infer a geographic location from membership or event participation.

Complete census: 0 supported, 6 incorrect, 1 ambiguous; N=7. Precision 0/7=0.00% to 1/7=14.29%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-contest-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-throw-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;spokesman-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-shout-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-mother-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-secretary-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_13__ent_251__ent_1422

**All observed names:** John F. Kennedy → White House (4); Democrat → White House (1)

Ordered IDs: Ent[ent_251] → Ent[ent_1422]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2703](../raw_map.tsv:2703) | Democrat | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2743](../raw_map.tsv:2743) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2744](../raw_map.tsv:2744) | John F. Kennedy | White House | poss\|&lt;-poss&lt;-secretary-&gt;nn-&gt;\|nn |
| [2749](../raw_map.tsv:2749) | John F. Kennedy | White House | nsubj\|&lt;-nsubj&lt;-contest-&gt;dobj-&gt;\|dobj |
| [2750](../raw_map.tsv:2750) | John F. Kennedy | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: ambiguous** (primary). John F. Kennedy → White House; Democrat → White House: White House be-in and secretary/spokesman context leaves physical presence versus institutional role unclear; the subject also includes an unnamed Democrat.

Cited evidence lines: [2703](../raw_map.tsv:2703), [2743](../raw_map.tsv:2743), [2744](../raw_map.tsv:2744), [2749](../raw_map.tsv:2749), [2750](../raw_map.tsv:2750).

**Review question:** Does this fact identify Kennedy's physical presence, and is Democrat the same person?
Issue tags: institution_place_ambiguity, unnamed_person

### rel_13__ent_493__ent_374

**All observed names:** God → heaven (4)

Ordered IDs: Ent[ent_493] → Ent[ent_374]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2753](../raw_map.tsv:2753) | God | heaven | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2759](../raw_map.tsv:2759) | God | heaven | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-mother-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2760](../raw_map.tsv:2760) | God | heaven | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-shout-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2762](../raw_map.tsv:2762) | God | heaven | nsubj\|&lt;-nsubj&lt;-throw-&gt;prep-&gt;out-&gt;dep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). God → heaven: God/heaven is a theological rather than geographic location; the supplied rows do not establish the declared geographic physical-presence relation.

Cited evidence lines: [2753](../raw_map.tsv:2753), [2759](../raw_map.tsv:2759), [2760](../raw_map.tsv:2760), [2762](../raw_map.tsv:2762).


Issue tags: nonliteral_location

### rel_13__ent_1055__ent_836

**All observed names:** Mets → World Series (2); Mets → Braves (1)

Ordered IDs: Ent[ent_1055] → Ent[ent_836]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2215](../raw_map.tsv:2215) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [3477](../raw_map.tsv:3477) | Mets | World Series | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [6891](../raw_map.tsv:6891) | Mets | Braves | nsubj\|&lt;-nsubj&lt;-trail-&gt;dobj-&gt;\|dobj |

**Judgment: incorrect** (primary). Mets → World Series; Mets → Braves: Sporting event/opponent context, reversed dateline-to-institution extraction or spokesperson titles do not establish physical presence.

Cited evidence lines: [2215](../raw_map.tsv:2215), [3477](../raw_map.tsv:3477), [6891](../raw_map.tsv:6891).




### rel_13__ent_1002__ent_1356

**All observed names:** Washington → State Department (2)

Ordered IDs: Ent[ent_1002] → Ent[ent_1356]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7437](../raw_map.tsv:7437) | Washington | State Department | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;spokesman-&gt;nn-&gt;\|nn |
| [7438](../raw_map.tsv:7438) | Washington | State Department | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Washington → State Department: Sporting event/opponent context, reversed dateline-to-institution extraction or spokesperson titles do not establish physical presence.

Cited evidence lines: [7437](../raw_map.tsv:7437), [7438](../raw_map.tsv:7438).




### rel_13__ent_321__ent_1392

**All observed names:** Mets → Cubs (1)

Ordered IDs: Ent[ent_321] → Ent[ent_1392]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6964](../raw_map.tsv:6964) | Mets | Cubs | poss\|&lt;-poss&lt;-loss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mets → Cubs: Sporting event/opponent context, reversed dateline-to-institution extraction or spokesperson titles do not establish physical presence.

Cited evidence lines: [6964](../raw_map.tsv:6964).




### rel_13__ent_1061__ent_40

**All observed names:** Dan Bartlett → White House (1)

Ordered IDs: Ent[ent_1061] → Ent[ent_40]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8438](../raw_map.tsv:8438) | Dan Bartlett | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Dan Bartlett → White House: Sporting event/opponent context, reversed dateline-to-institution extraction or spokesperson titles do not establish physical presence.

Cited evidence lines: [8438](../raw_map.tsv:8438).




### rel_13__ent_17__ent_1422

**All observed names:** George Stephanopoulos → White House (1)

Ordered IDs: Ent[ent_17] → Ent[ent_1422]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [8445](../raw_map.tsv:8445) | George Stephanopoulos | White House | appos\|-&gt;appos-&gt;spokesman-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). George Stephanopoulos → White House: Sporting event/opponent context, reversed dateline-to-institution extraction or spokesperson titles do not establish physical presence.

Cited evidence lines: [8445](../raw_map.tsv:8445).



