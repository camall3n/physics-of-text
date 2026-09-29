# audit_dcb746fa83d6 — rel_17: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 12 supported, 0 incorrect, 0 ambiguous; N=12. Precision 12/12=100.00% to 12/12=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 14 | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 8 | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 6 | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;firm-&gt;amod-&gt;\|amod |
| 3 | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;company-&gt;dep-&gt;\|dep |
| 2 | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-executive-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_17__ent_1147__ent_1270

**All observed names:** Yankee Group → Boston (8)

Ordered IDs: Ent[ent_1147] → Ent[ent_1270]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5765](../raw_map.tsv:5765) | Yankee Group | Boston | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5767](../raw_map.tsv:5767) | Yankee Group | Boston | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5769](../raw_map.tsv:5769) | Yankee Group | Boston | appos\|-&gt;appos-&gt;firm-&gt;amod-&gt;\|amod |
| [5771](../raw_map.tsv:5771) | Yankee Group | Boston | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7087](../raw_map.tsv:7087) | Yankee Group | Boston | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7089](../raw_map.tsv:7089) | Yankee Group | Boston | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7093](../raw_map.tsv:7093) | Yankee Group | Boston | appos\|-&gt;appos-&gt;firm-&gt;amod-&gt;\|amod |
| [7095](../raw_map.tsv:7095) | Yankee Group | Boston | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankee Group → Boston: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [5765](../raw_map.tsv:5765), [5767](../raw_map.tsv:5767), [5769](../raw_map.tsv:5769), [5771](../raw_map.tsv:5771), [7087](../raw_map.tsv:7087), [7089](../raw_map.tsv:7089), [7093](../raw_map.tsv:7093), [7095](../raw_map.tsv:7095).


Issue tags: mixed_evidence

### rel_17__ent_461__ent_222

**All observed names:** Dataquest → San Jose (6)

Ordered IDs: Ent[ent_461] → Ent[ent_222]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5803](../raw_map.tsv:5803) | Dataquest | San Jose | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5806](../raw_map.tsv:5806) | Dataquest | San Jose | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5809](../raw_map.tsv:5809) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7097](../raw_map.tsv:7097) | Dataquest | San Jose | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7100](../raw_map.tsv:7100) | Dataquest | San Jose | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7103](../raw_map.tsv:7103) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dataquest → San Jose: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [5803](../raw_map.tsv:5803), [5806](../raw_map.tsv:5806), [5809](../raw_map.tsv:5809), [7097](../raw_map.tsv:7097), [7100](../raw_map.tsv:7100), [7103](../raw_map.tsv:7103).




### rel_17__ent_1412__ent_221

**All observed names:** International Data Corporation → Framingham (5)

Ordered IDs: Ent[ent_1412] → Ent[ent_221]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5813](../raw_map.tsv:5813) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5815](../raw_map.tsv:5815) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5819](../raw_map.tsv:5819) | International Data Corporation | Framingham | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7149](../raw_map.tsv:7149) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7153](../raw_map.tsv:7153) | International Data Corporation | Framingham | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). International Data Corporation → Framingham: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [5813](../raw_map.tsv:5813), [5815](../raw_map.tsv:5815), [5819](../raw_map.tsv:5819), [7149](../raw_map.tsv:7149), [7153](../raw_map.tsv:7153).




### rel_17__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (4)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [818](../raw_map.tsv:818) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [825](../raw_map.tsv:825) | Motorola | Schaumburg | nn\|&lt;-nn&lt;-executive-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4308](../raw_map.tsv:4308) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4315](../raw_map.tsv:4315) | Motorola | Schaumburg | nn\|&lt;-nn&lt;-executive-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Motorola → Schaumburg: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [818](../raw_map.tsv:818), [825](../raw_map.tsv:825), [4308](../raw_map.tsv:4308), [4315](../raw_map.tsv:4315).


Issue tags: mixed_evidence

### rel_17__ent_943__ent_452

**All observed names:** Forrester Research → Cambridge (4)

Ordered IDs: Ent[ent_943] → Ent[ent_452]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7129](../raw_map.tsv:7129) | Forrester Research | Cambridge | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7130](../raw_map.tsv:7130) | Forrester Research | Cambridge | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7133](../raw_map.tsv:7133) | Forrester Research | Cambridge | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7136](../raw_map.tsv:7136) | Forrester Research | Cambridge | appos\|-&gt;appos-&gt;company-&gt;dep-&gt;\|dep |

**Judgment: supported** (primary). Forrester Research → Cambridge: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [7129](../raw_map.tsv:7129), [7130](../raw_map.tsv:7130), [7133](../raw_map.tsv:7133), [7136](../raw_map.tsv:7136).


Issue tags: mixed_evidence

### rel_17__ent_539__ent_713

**All observed names:** Hicks → Dallas (4)

Ordered IDs: Ent[ent_539] → Ent[ent_713]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7412](../raw_map.tsv:7412) | Hicks | Dallas | appos\|-&gt;appos-&gt;firm-&gt;amod-&gt;\|amod |
| [7413](../raw_map.tsv:7413) | Hicks | Dallas | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7416](../raw_map.tsv:7416) | Hicks | Dallas | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7417](../raw_map.tsv:7417) | Hicks | Dallas | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Hicks → Dallas: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [7412](../raw_map.tsv:7412), [7413](../raw_map.tsv:7413), [7416](../raw_map.tsv:7416), [7417](../raw_map.tsv:7417).




### rel_17__ent_1148__ent_460

**All observed names:** NPD Group → Port Washington (3)

Ordered IDs: Ent[ent_1148] → Ent[ent_460]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5773](../raw_map.tsv:5773) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5781](../raw_map.tsv:5781) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;company-&gt;dep-&gt;\|dep |
| [7142](../raw_map.tsv:7142) | NPD Group | Port Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). NPD Group → Port Washington: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [5773](../raw_map.tsv:5773), [5781](../raw_map.tsv:5781), [7142](../raw_map.tsv:7142).


Issue tags: mixed_evidence

### rel_17__ent_1272__ent_305

**All observed names:** Apple → Cupertino (2)

Ordered IDs: Ent[ent_1272] → Ent[ent_305]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [788](../raw_map.tsv:788) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [795](../raw_map.tsv:795) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [788](../raw_map.tsv:788), [795](../raw_map.tsv:795).




### rel_17__ent_549__ent_1002

**All observed names:** MCI → Washington (2)

Ordered IDs: Ent[ent_549] → Ent[ent_1002]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [838](../raw_map.tsv:838) | MCI | Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [843](../raw_map.tsv:843) | MCI | Washington | prep\|-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MCI → Washington: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [838](../raw_map.tsv:838), [843](../raw_map.tsv:843).




### rel_17__ent_786__ent_1445

**All observed names:** Apple → Cupertino (2)

Ordered IDs: Ent[ent_786] → Ent[ent_1445]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4344](../raw_map.tsv:4344) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4351](../raw_map.tsv:4351) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [4344](../raw_map.tsv:4344), [4351](../raw_map.tsv:4351).




### rel_17__ent_942__ent_731

**All observed names:** Jupiter Communications → New York (2)

Ordered IDs: Ent[ent_942] → Ent[ent_731]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7169](../raw_map.tsv:7169) | Jupiter Communications | New York | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7172](../raw_map.tsv:7172) | Jupiter Communications | New York | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jupiter Communications → New York: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [7169](../raw_map.tsv:7169), [7172](../raw_map.tsv:7172).




### rel_17__ent_302__ent_544

**All observed names:** Microsoft → Redmond (1)

Ordered IDs: Ent[ent_302] → Ent[ent_544]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4334](../raw_map.tsv:4334) | Microsoft | Redmond | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Microsoft → Redmond: Explicit based-in or firm-in geographic evidence establishes the organizational location; a shortened firm name is resolved by its own firm role.

Cited evidence lines: [4334](../raw_map.tsv:4334).



