# audit_e318fe663470 — rel_61: chairs or heads organization

Predicate ID: chairs_or_heads

Person X holds or held a chair or organizational head/leader office in organization or committee Y.

Includes: explicit chair/head/organizational leader; historical chair or head office. Excludes: ordinary member/serve-on/sit-on; generic executive/director/president without chair/head role; chair of a panel as proof of chairing its parent organization. Ambiguous unless resolved by case-local evidence: incomplete panel/parent attachment; unnamed person identified only by party. This preserves the explicitly declared chair/head mixture in the latest review; it is narrower than managerial_office_in and must stay the same across cases.

Complete census: 1 supported, 2 incorrect, 6 ambiguous; N=9. Precision 1/9=11.11% to 7/9=77.78%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 7 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 5 | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 5 | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| 5 | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 4 | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| 3 | rcmod\|-&gt;rcmod-&gt;chair-&gt;dobj-&gt;\|dobj |
| 3 | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;party-&gt;amod-&gt;loyal-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-appointment-&gt;prep-&gt;to-&gt;pobj-&gt;chairmanship-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-showroom-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;say-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;run-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;step-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;succeed-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;succeed-&gt;prep-&gt;as-&gt;pobj-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;travel-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_61__ent_7__ent_485

**All observed names:** Democrat → Senate Armed Services Committee (9)

Ordered IDs: Ent[ent_7] → Ent[ent_485]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6309](../raw_map.tsv:6309) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6310](../raw_map.tsv:6310) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| [6311](../raw_map.tsv:6311) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chair-&gt;dobj-&gt;\|dobj |
| [6312](../raw_map.tsv:6312) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6313](../raw_map.tsv:6313) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6314](../raw_map.tsv:6314) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6315](../raw_map.tsv:6315) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6316](../raw_map.tsv:6316) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6317](../raw_map.tsv:6317) | Democrat | Senate Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;panel-&gt;poss-&gt;\|poss |

**Judgment: ambiguous** (primary). Democrat → Senate Armed Services Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6309](../raw_map.tsv:6309), [6310](../raw_map.tsv:6310), [6311](../raw_map.tsv:6311), [6312](../raw_map.tsv:6312), [6313](../raw_map.tsv:6313), [6314](../raw_map.tsv:6314), [6315](../raw_map.tsv:6315), [6316](../raw_map.tsv:6316), [6317](../raw_map.tsv:6317).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity, mixed_evidence

### rel_61__ent_7__ent_488

**All observed names:** Democrat → House Armed Services Committee (9)

Ordered IDs: Ent[ent_7] → Ent[ent_488]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6334](../raw_map.tsv:6334) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6335](../raw_map.tsv:6335) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| [6336](../raw_map.tsv:6336) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6337](../raw_map.tsv:6337) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chair-&gt;dobj-&gt;\|dobj |
| [6338](../raw_map.tsv:6338) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6339](../raw_map.tsv:6339) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;succeed-&gt;prep-&gt;as-&gt;pobj-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6341](../raw_map.tsv:6341) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6342](../raw_map.tsv:6342) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6343](../raw_map.tsv:6343) | Democrat | House Armed Services Committee | rcmod\|-&gt;rcmod-&gt;travel-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Democrat → House Armed Services Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6334](../raw_map.tsv:6334), [6335](../raw_map.tsv:6335), [6336](../raw_map.tsv:6336), [6337](../raw_map.tsv:6337), [6338](../raw_map.tsv:6338), [6339](../raw_map.tsv:6339), [6341](../raw_map.tsv:6341), [6342](../raw_map.tsv:6342), [6343](../raw_map.tsv:6343).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity, mixed_evidence

### rel_61__ent_7__ent_243

**All observed names:** Democrat → Armed Services Committee (7)

Ordered IDs: Ent[ent_7] → Ent[ent_243]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6300](../raw_map.tsv:6300) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6301](../raw_map.tsv:6301) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6302](../raw_map.tsv:6302) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6304](../raw_map.tsv:6304) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;chair-&gt;dobj-&gt;\|dobj |
| [6306](../raw_map.tsv:6306) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6307](../raw_map.tsv:6307) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;succeed-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6308](../raw_map.tsv:6308) | Democrat | Armed Services Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Democrat → Armed Services Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6300](../raw_map.tsv:6300), [6301](../raw_map.tsv:6301), [6302](../raw_map.tsv:6302), [6304](../raw_map.tsv:6304), [6306](../raw_map.tsv:6306), [6307](../raw_map.tsv:6307), [6308](../raw_map.tsv:6308).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity, mixed_evidence

### rel_61__ent_1269__ent_244

**All observed names:** Republican → Judiciary Committee (5)

Ordered IDs: Ent[ent_1269] → Ent[ent_244]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6269](../raw_map.tsv:6269) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6270](../raw_map.tsv:6270) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| [6272](../raw_map.tsv:6272) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6276](../raw_map.tsv:6276) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;serve-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6277](../raw_map.tsv:6277) | Republican | Judiciary Committee | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Republican → Judiciary Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6269](../raw_map.tsv:6269), [6270](../raw_map.tsv:6270), [6272](../raw_map.tsv:6272), [6276](../raw_map.tsv:6276), [6277](../raw_map.tsv:6277).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity, mixed_evidence

### rel_61__ent_386__ent_1170

**All observed names:** Republican → Ways and Means Committee (4)

Ordered IDs: Ent[ent_386] → Ent[ent_1170]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6289](../raw_map.tsv:6289) | Republican | Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6290](../raw_map.tsv:6290) | Republican | Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| [6294](../raw_map.tsv:6294) | Republican | Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;member-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6297](../raw_map.tsv:6297) | Republican | Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;supervise-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Republican → Ways and Means Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6289](../raw_map.tsv:6289), [6290](../raw_map.tsv:6290), [6294](../raw_map.tsv:6294), [6297](../raw_map.tsv:6297).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity, mixed_evidence

### rel_61__ent_246__ent_1171

**All observed names:** Illinois Democrat → House Ways and Means Committee (4)

Ordered IDs: Ent[ent_246] → Ent[ent_1171]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6329](../raw_map.tsv:6329) | Illinois Democrat | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6331](../raw_map.tsv:6331) | Illinois Democrat | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;step-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6332](../raw_map.tsv:6332) | Illinois Democrat | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;run-&gt;dobj-&gt;\|dobj |
| [6333](../raw_map.tsv:6333) | Illinois Democrat | House Ways and Means Committee | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;say-&gt;nsubj-&gt;\|nsubj |

**Judgment: ambiguous** (primary). Illinois Democrat → House Ways and Means Committee: Chair/head evidence is present but the officeholder is identified only as Democrat/Republican rather than a named individual.

Cited evidence lines: [6329](../raw_map.tsv:6329), [6331](../raw_map.tsv:6331), [6332](../raw_map.tsv:6332), [6333](../raw_map.tsv:6333).

**Review question:** Who is the actual individual chair/head, and which rows belong to that person?
Issue tags: argument_identity

### rel_61__ent_56__ent_59

**All observed names:** Laura D'Andrea Tyson → Council of Economic Advisers (3)

Ordered IDs: Ent[ent_56] → Ent[ent_59]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2879](../raw_map.tsv:2879) | Laura D'Andrea Tyson | Council of Economic Advisers | rcmod\|-&gt;rcmod-&gt;head-&gt;dobj-&gt;\|dobj |
| [2881](../raw_map.tsv:2881) | Laura D'Andrea Tyson | Council of Economic Advisers | rcmod\|-&gt;rcmod-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2883](../raw_map.tsv:2883) | Laura D'Andrea Tyson | Council of Economic Advisers | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-appointment-&gt;prep-&gt;to-&gt;pobj-&gt;chairmanship-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Laura D'Andrea Tyson → Council of Economic Advisers: Head/chairman and appointment-to-chairmanship rows explicitly identify the named person and council.

Cited evidence lines: [2879](../raw_map.tsv:2879), [2881](../raw_map.tsv:2881), [2883](../raw_map.tsv:2883).




### rel_61__ent_1243__ent_1024

**All observed names:** Sotheby → York Avenue (2); Sotheby → 72d Street (1)

Ordered IDs: Ent[ent_1243] → Ent[ent_1024]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6250](../raw_map.tsv:6250) | Sotheby | York Avenue | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;on-&gt;pobj-&gt;\|pobj |
| [6251](../raw_map.tsv:6251) | Sotheby | York Avenue | poss\|&lt;-poss&lt;-showroom-&gt;nn-&gt;\|nn |
| [6259](../raw_map.tsv:6259) | Sotheby | 72d Street | poss\|&lt;-poss&lt;-gallery&lt;-pobj&lt;-by&lt;-prep&lt;-absorb-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Sotheby → York Avenue; Sotheby → 72d Street: The complete evidence concerns gallery locations or party loyalty rather than a chair/head office.

Cited evidence lines: [6250](../raw_map.tsv:6250), [6251](../raw_map.tsv:6251), [6259](../raw_map.tsv:6259).




### rel_61__ent_815__ent_13

**All observed names:** Russia → Vladimir V. Putin (1)

Ordered IDs: Ent[ent_815] → Ent[ent_13]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5362](../raw_map.tsv:5362) | Russia | Vladimir V. Putin | appos\|-&gt;appos-&gt;party-&gt;amod-&gt;loyal-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Russia → Vladimir V. Putin: The complete evidence concerns gallery locations or party loyalty rather than a chair/head office.

Cited evidence lines: [5362](../raw_map.tsv:5362).



