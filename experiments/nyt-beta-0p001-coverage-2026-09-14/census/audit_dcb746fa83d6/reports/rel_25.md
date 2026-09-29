# audit_dcb746fa83d6 — rel_25: manager of institution

Predicate ID: manager_of

Person X holds or held an explicitly identified manager office in organization, team, business, or public institution Y.

Includes: explicit manager or general manager; a functional or departmental managerial office within Y; historical managerial office. Excludes: president, director, head, executive, or coach alone without a manager title; ordinary employment or membership; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: a personal principal standing for an omitted institution or campaign; unclear manager or institutional attachment; appointment without established tenure. This specific title is separate from president_or_manager_of and managerial_office_in. A sports manager qualifies; merely coaching does not prove the manager title.

Complete census: 6 supported, 2 incorrect, 0 ambiguous; N=8. Precision 6/8=75.00% to 6/8=75.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;giant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |
| 1 | appos\|-&gt;appos-&gt;director-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-put-&gt;prep-&gt;in-&gt;pobj-&gt;lineup-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-money&lt;-dobj&lt;-raise-&gt;prep-&gt;than-&gt;pobj-&gt;candidate-&gt;prep-&gt;except-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-generation-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-fixation&lt;-nsubj&lt;-cost-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-lieutenant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;foray-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;present-&gt;nsubj-&gt;\|nsubj |

## Every evaluated fact

### rel_25__ent_279__ent_278

**All observed names:** Bobby Cox → Braves (6)

Ordered IDs: Ent[ent_279] → Ent[ent_278]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3235](../raw_map.tsv:3235) | Bobby Cox | Braves | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3237](../raw_map.tsv:3237) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;foray-&gt;poss-&gt;\|poss |
| [3238](../raw_map.tsv:3238) | Bobby Cox | Braves | nsubj\|&lt;-nsubj&lt;-put-&gt;prep-&gt;in-&gt;pobj-&gt;lineup-&gt;poss-&gt;\|poss |
| [3239](../raw_map.tsv:3239) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;manage-&gt;dobj-&gt;\|dobj |
| [3240](../raw_map.tsv:3240) | Bobby Cox | Braves | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| [3243](../raw_map.tsv:3243) | Bobby Cox | Braves | poss\|&lt;-poss&lt;-lieutenant-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Bobby Cox → Braves: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [3235](../raw_map.tsv:3235), [3237](../raw_map.tsv:3237), [3238](../raw_map.tsv:3238), [3239](../raw_map.tsv:3239), [3240](../raw_map.tsv:3240), [3243](../raw_map.tsv:3243).


Issue tags: mixed_evidence

### rel_25__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (4)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [857](../raw_map.tsv:857) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;giant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [859](../raw_map.tsv:859) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |
| [4390](../raw_map.tsv:4390) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;giant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4392](../raw_map.tsv:4392) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;purpcl-&gt;announce-&gt;nsubj-&gt;\|nsubj |

**Judgment: incorrect** (primary). Johnson & Johnson → New Brunswick: Company geography or political fundraising/candidate comparison does not establish a manager title.

Cited evidence lines: [857](../raw_map.tsv:857), [859](../raw_map.tsv:859), [4390](../raw_map.tsv:4390), [4392](../raw_map.tsv:4392).




### rel_25__ent_274__ent_1029

**All observed names:** Al Bianchi → Knicks (3)

Ordered IDs: Ent[ent_274] → Ent[ent_1029]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3206](../raw_map.tsv:3206) | Al Bianchi | Knicks | poss\|&lt;-poss&lt;-fixation&lt;-nsubj&lt;-cost-&gt;dobj-&gt;\|dobj |
| [3209](../raw_map.tsv:3209) | Al Bianchi | Knicks | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3211](../raw_map.tsv:3211) | Al Bianchi | Knicks | rcmod\|-&gt;rcmod-&gt;present-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Al Bianchi → Knicks: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [3206](../raw_map.tsv:3206), [3209](../raw_map.tsv:3209), [3211](../raw_map.tsv:3211).


Issue tags: mixed_evidence

### rel_25__ent_1043__ent_1236

**All observed names:** Joe McIlvaine → Mets (2)

Ordered IDs: Ent[ent_1043] → Ent[ent_1236]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1688](../raw_map.tsv:1688) | Joe McIlvaine | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3257](../raw_map.tsv:3257) | Joe McIlvaine | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Joe McIlvaine → Mets: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [1688](../raw_map.tsv:1688), [3257](../raw_map.tsv:3257).




### rel_25__ent_272__ent_321

**All observed names:** Steve Phillips → Mets (2)

Ordered IDs: Ent[ent_272] → Ent[ent_321]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3185](../raw_map.tsv:3185) | Steve Phillips | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [3189](../raw_map.tsv:3189) | Steve Phillips | Mets | appos\|-&gt;appos-&gt;director-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Steve Phillips → Mets: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [3185](../raw_map.tsv:3185), [3189](../raw_map.tsv:3189).


Issue tags: mixed_evidence

### rel_25__ent_819__ent_1161

**All observed names:** Democrats → Hillary Rodham Clinton (2)

Ordered IDs: Ent[ent_819] → Ent[ent_1161]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7592](../raw_map.tsv:7592) | Democrats | Hillary Rodham Clinton | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-generation-&gt;prep-&gt;like-&gt;pobj-&gt;\|pobj |
| [7594](../raw_map.tsv:7594) | Democrats | Hillary Rodham Clinton | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-money&lt;-dobj&lt;-raise-&gt;prep-&gt;than-&gt;pobj-&gt;candidate-&gt;prep-&gt;except-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Democrats → Hillary Rodham Clinton: Company geography or political fundraising/candidate comparison does not establish a manager title.

Cited evidence lines: [7592](../raw_map.tsv:7592), [7594](../raw_map.tsv:7594).




### rel_25__ent_590__ent_896

**All observed names:** Rod Thorn → Nets (1)

Ordered IDs: Ent[ent_590] → Ent[ent_896]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1621](../raw_map.tsv:1621) | Rod Thorn | Nets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Rod Thorn → Nets: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [1621](../raw_map.tsv:1621).




### rel_25__ent_277__ent_412

**All observed names:** Omar Minaya → Mets (1)

Ordered IDs: Ent[ent_277] → Ent[ent_412]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3215](../raw_map.tsv:3215) | Omar Minaya | Mets | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Omar Minaya → Mets: Explicit manager title establishes the specific managerial role.

Cited evidence lines: [3215](../raw_map.tsv:3215).



