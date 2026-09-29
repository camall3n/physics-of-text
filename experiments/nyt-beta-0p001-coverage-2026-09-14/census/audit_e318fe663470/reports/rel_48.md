# audit_e318fe663470 — rel_48: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 9 supported, 2 incorrect, 0 ambiguous; N=11. Precision 9/11=81.82% to 9/11=81.82%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 6 | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 5 | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | advmod\|&lt;-advmod&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;compensation-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;manager-&gt;amod-&gt;\|amod |
| 1 | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokeswoman-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-question-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;under-&gt;pobj-&gt;scramble-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_48__ent_1148__ent_460

**All observed names:** NPD Group → Port Washington (6)

Ordered IDs: Ent[ent_1148] → Ent[ent_460]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5778](../raw_map.tsv:5778) | NPD Group | Port Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5779](../raw_map.tsv:5779) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7137](../raw_map.tsv:7137) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7139](../raw_map.tsv:7139) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7142](../raw_map.tsv:7142) | NPD Group | Port Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7143](../raw_map.tsv:7143) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). NPD Group → Port Washington: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [5778](../raw_map.tsv:5778), [5779](../raw_map.tsv:5779), [7137](../raw_map.tsv:7137), [7139](../raw_map.tsv:7139), [7142](../raw_map.tsv:7142), [7143](../raw_map.tsv:7143).




### rel_48__ent_1147__ent_209

**All observed names:** Yankee Group → Boston (4)

Ordered IDs: Ent[ent_1147] → Ent[ent_209]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5765](../raw_map.tsv:5765) | Yankee Group | Boston | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5771](../raw_map.tsv:5771) | Yankee Group | Boston | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7089](../raw_map.tsv:7089) | Yankee Group | Boston | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7095](../raw_map.tsv:7095) | Yankee Group | Boston | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Yankee Group → Boston: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [5765](../raw_map.tsv:5765), [5771](../raw_map.tsv:5771), [7089](../raw_map.tsv:7089), [7095](../raw_map.tsv:7095).




### rel_48__ent_463__ent_440

**All observed names:** T. Rowe Price → Baltimore (4)

Ordered IDs: Ent[ent_463] → Ent[ent_440]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5826](../raw_map.tsv:5826) | T. Rowe Price | Baltimore | appos\|-&gt;appos-&gt;manager-&gt;amod-&gt;\|amod |
| [5829](../raw_map.tsv:5829) | T. Rowe Price | Baltimore | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5831](../raw_map.tsv:5831) | T. Rowe Price | Baltimore | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5832](../raw_map.tsv:5832) | T. Rowe Price | Baltimore | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-question-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). T. Rowe Price → Baltimore: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [5826](../raw_map.tsv:5826), [5829](../raw_map.tsv:5829), [5831](../raw_map.tsv:5831), [5832](../raw_map.tsv:5832).


Issue tags: mixed_evidence

### rel_48__ent_700__ent_1401

**All observed names:** Pearl Meyer &amp; Partners → New York (4)

Ordered IDs: Ent[ent_700] → Ent[ent_1401]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7157](../raw_map.tsv:7157) | Pearl Meyer &amp; Partners | New York | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7159](../raw_map.tsv:7159) | Pearl Meyer &amp; Partners | New York | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7160](../raw_map.tsv:7160) | Pearl Meyer &amp; Partners | New York | appos\|-&gt;appos-&gt;compensation-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7162](../raw_map.tsv:7162) | Pearl Meyer &amp; Partners | New York | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Pearl Meyer & Partners → New York: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [7157](../raw_map.tsv:7157), [7159](../raw_map.tsv:7159), [7160](../raw_map.tsv:7160), [7162](../raw_map.tsv:7162).




### rel_48__ent_1087__ent_701

**All observed names:** Gartner Group → Stamford (3)

Ordered IDs: Ent[ent_1087] → Ent[ent_701]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7117](../raw_map.tsv:7117) | Gartner Group | Stamford | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7121](../raw_map.tsv:7121) | Gartner Group | Stamford | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7124](../raw_map.tsv:7124) | Gartner Group | Stamford | appos\|-&gt;appos-&gt;consultant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Gartner Group → Stamford: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [7117](../raw_map.tsv:7117), [7121](../raw_map.tsv:7121), [7124](../raw_map.tsv:7124).




### rel_48__ent_943__ent_1088

**All observed names:** Forrester Research → Cambridge (3)

Ordered IDs: Ent[ent_943] → Ent[ent_1088]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7129](../raw_map.tsv:7129) | Forrester Research | Cambridge | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7130](../raw_map.tsv:7130) | Forrester Research | Cambridge | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7133](../raw_map.tsv:7133) | Forrester Research | Cambridge | appos\|-&gt;appos-&gt;technology-&gt;dep-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Forrester Research → Cambridge: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [7129](../raw_map.tsv:7129), [7130](../raw_map.tsv:7130), [7133](../raw_map.tsv:7133).




### rel_48__ent_893__ent_897

**All observed names:** Guidant → Indianapolis (2)

Ordered IDs: Ent[ent_893] → Ent[ent_897]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4329](../raw_map.tsv:4329) | Guidant | Indianapolis | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4332](../raw_map.tsv:4332) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Guidant → Indianapolis: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [4329](../raw_map.tsv:4329), [4332](../raw_map.tsv:4332).




### rel_48__ent_1254__ent_703

**All observed names:** Birinyi Associates → Greenwich (2)

Ordered IDs: Ent[ent_1254] → Ent[ent_703]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7174](../raw_map.tsv:7174) | Birinyi Associates | Greenwich | appos\|-&gt;appos-&gt;firm-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7175](../raw_map.tsv:7175) | Birinyi Associates | Greenwich | appos\|-&gt;appos-&gt;firm-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Birinyi Associates → Greenwich: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [7174](../raw_map.tsv:7174), [7175](../raw_map.tsv:7175).




### rel_48__ent_1350__ent_969

**All observed names:** Senate → Bill Frist (2)

Ordered IDs: Ent[ent_1350] → Ent[ent_969]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7671](../raw_map.tsv:7671) | Senate | Bill Frist | nn\|&lt;-nn&lt;-leader&lt;-pobj&lt;-for&lt;-prep&lt;-spokeswoman-&gt;appos-&gt;\|appos |
| [7675](../raw_map.tsv:7675) | Senate | Bill Frist | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;under-&gt;pobj-&gt;scramble-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Senate → Bill Frist: A political leadership attachment and corporate ownership have the wrong predicate or argument roles.

Cited evidence lines: [7671](../raw_map.tsv:7671), [7675](../raw_map.tsv:7675).




### rel_48__ent_623__ent_1325

**All observed names:** Foote → True North Communications (1)

Ordered IDs: Ent[ent_623] → Ent[ent_1325]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2497](../raw_map.tsv:2497) | Foote | True North Communications | advmod\|&lt;-advmod&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Foote → True North Communications: A political leadership attachment and corporate ownership have the wrong predicate or argument roles.

Cited evidence lines: [2497](../raw_map.tsv:2497).




### rel_48__ent_1128__ent_501

**All observed names:** Wal-Mart → Bentonville (1)

Ordered IDs: Ent[ent_1128] → Ent[ent_501]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4354](../raw_map.tsv:4354) | Wal-Mart | Bentonville | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: A local firm-in/geographic company modifier/based-in row explicitly supports organizational location.

Cited evidence lines: [4354](../raw_map.tsv:4354).



