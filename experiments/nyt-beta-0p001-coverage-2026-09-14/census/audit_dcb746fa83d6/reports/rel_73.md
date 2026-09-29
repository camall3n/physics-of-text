# audit_dcb746fa83d6 — rel_73: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 2 supported, 2 incorrect, 0 ambiguous; N=4. Precision 2/4=50.00% to 2/4=50.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;follow-&gt;dobj-&gt;business-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-contender-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-follow-&gt;advmod-&gt;\|advmod |
| 1 | nsubj\|&lt;-nsubj&lt;-reopen-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-sign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-begin-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-feature&lt;-pobj&lt;-as&lt;-prep&lt;-today&lt;-dep&lt;-tension-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-open&lt;-partmod&lt;-concert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-resurrect-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-room-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-of&lt;-prep&lt;-session&lt;-pobj&lt;-in&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_73__ent_1167__ent_229

**All observed names:** Film Forum → West Houston Street (8)

Ordered IDs: Ent[ent_1167] → Ent[ent_229]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6214](../raw_map.tsv:6214) | Film Forum | West Houston Street | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6215](../raw_map.tsv:6215) | Film Forum | West Houston Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-resurrect-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6216](../raw_map.tsv:6216) | Film Forum | West Houston Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-open&lt;-partmod&lt;-concert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6217](../raw_map.tsv:6217) | Film Forum | West Houston Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-feature&lt;-pobj&lt;-as&lt;-prep&lt;-today&lt;-dep&lt;-tension-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6218](../raw_map.tsv:6218) | Film Forum | West Houston Street | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-begin-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6219](../raw_map.tsv:6219) | Film Forum | West Houston Street | nsubj\|&lt;-nsubj&lt;-sign-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6220](../raw_map.tsv:6220) | Film Forum | West Houston Street | nsubj\|&lt;-nsubj&lt;-reopen-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6223](../raw_map.tsv:6223) | Film Forum | West Houston Street | nsubj\|&lt;-nsubj&lt;-follow-&gt;advmod-&gt;\|advmod |

**Judgment: supported** (primary). Film Forum → West Houston Street: A direct be-at or reopened-at statement establishes the venue/business location, with local showroom context for Christie.

Cited evidence lines: [6214](../raw_map.tsv:6214), [6215](../raw_map.tsv:6215), [6216](../raw_map.tsv:6216), [6217](../raw_map.tsv:6217), [6218](../raw_map.tsv:6218), [6219](../raw_map.tsv:6219), [6220](../raw_map.tsv:6220), [6223](../raw_map.tsv:6223).


Issue tags: mixed_evidence

### rel_73__ent_1168__ent_1169

**All observed names:** Christie → Park Avenue (4)

Ordered IDs: Ent[ent_1168] → Ent[ent_1169]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6224](../raw_map.tsv:6224) | Christie | Park Avenue | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6228](../raw_map.tsv:6228) | Christie | Park Avenue | poss\|&lt;-poss&lt;-sale&lt;-pobj&lt;-of&lt;-prep&lt;-session&lt;-pobj&lt;-in&lt;-prep&lt;-auction-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6232](../raw_map.tsv:6232) | Christie | Park Avenue | rcmod\|-&gt;rcmod-&gt;auction-&gt;prep-&gt;in-&gt;pobj-&gt;showroom-&gt;nn-&gt;\|nn |
| [6233](../raw_map.tsv:6233) | Christie | Park Avenue | poss\|&lt;-poss&lt;-room-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Christie → Park Avenue: A direct be-at or reopened-at statement establishes the venue/business location, with local showroom context for Christie.

Cited evidence lines: [6224](../raw_map.tsv:6224), [6228](../raw_map.tsv:6228), [6232](../raw_map.tsv:6232), [6233](../raw_map.tsv:6233).


Issue tags: mixed_evidence

### rel_73__ent_1330__ent_1180

**All observed names:** Emanuel Goldman → Paine Webber (2)

Ordered IDs: Ent[ent_1330] → Ent[ent_1180]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1802](../raw_map.tsv:1802) | Emanuel Goldman | Paine Webber | rcmod\|-&gt;rcmod-&gt;follow-&gt;dobj-&gt;business-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [7812](../raw_map.tsv:7812) | Emanuel Goldman | Paine Webber | rcmod\|-&gt;rcmod-&gt;follow-&gt;dobj-&gt;business-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Emanuel Goldman → Paine Webber: Professional analysis or borough presidency does not establish an organization's location.

Cited evidence lines: [1802](../raw_map.tsv:1802), [7812](../raw_map.tsv:7812).




### rel_73__ent_253__ent_1056

**All observed names:** Fernando Ferrer → Bronx Borough (1)

Ordered IDs: Ent[ent_253] → Ent[ent_1056]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2801](../raw_map.tsv:2801) | Fernando Ferrer | Bronx Borough | appos\|&lt;-appos&lt;-contender-&gt;appos-&gt;president-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Fernando Ferrer → Bronx Borough: Professional analysis or borough presidency does not establish an organization's location.

Cited evidence lines: [2801](../raw_map.tsv:2801).



