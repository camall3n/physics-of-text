# audit_06dbdb9b03af — rel_99

Rank 19; 66 rows; every 12 inferred ordered fact.

Frozen prior predicate: **professor or university teacher at**. Person X is a professor or teaches at academic institution Y. Includes: explicit professor; teaching at the institution; historical teaching affiliation. Excludes: expert/specialist/dean/researcher/analyst alone; attendance or institution location alone. Ambiguous unless resolved by case-local evidence: unclear teacher versus student attachment.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 11 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 7 | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 7 | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| 5 | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 5 | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 4 | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;expert-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;school-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;scholar-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;scientist-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;on-&gt;pobj-&gt;policy-&gt;rcmod-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;historian-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;historian-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;of-&gt;pobj-&gt;law-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;rofessor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | dep\|-&gt;dep-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-letter&lt;-dobj&lt;-make&lt;-rcmod&lt;-conflict&lt;-dobj&lt;-see-&gt;dobj-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;comment-&gt;nn-&gt;\|nn |

## Every fact and all evidence

### rel_99__ent_148__ent_163

**All observed names:** Fred Siegel → Cooper Union (9)

Ordered IDs: Ent[ent_148] → Ent[ent_163]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [345](../raw_map.tsv:345) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [346](../raw_map.tsv:346) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;historian-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [347](../raw_map.tsv:347) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [348](../raw_map.tsv:348) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [349](../raw_map.tsv:349) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [350](../raw_map.tsv:350) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;historian-&gt;nn-&gt;\|nn |
| [351](../raw_map.tsv:351) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [352](../raw_map.tsv:352) | Fred Siegel | Cooper Union | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [353](../raw_map.tsv:353) | Fred Siegel | Cooper Union | appos\|-&gt;appos-&gt;expert-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_395__ent_156

**All observed names:** David Rebovich → Rider University (7)

Ordered IDs: Ent[ent_395] → Ent[ent_156]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [288](../raw_map.tsv:288) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [289](../raw_map.tsv:289) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [290](../raw_map.tsv:290) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [291](../raw_map.tsv:291) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;scientist-&gt;nn-&gt;\|nn |
| [292](../raw_map.tsv:292) | David Rebovich | Rider University | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [294](../raw_map.tsv:294) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [295](../raw_map.tsv:295) | David Rebovich | Rider University | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_391__ent_149

**All observed names:** Ross K. Baker → Rutgers University (7)

Ordered IDs: Ent[ent_391] → Ent[ent_149]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [338](../raw_map.tsv:338) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [339](../raw_map.tsv:339) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [340](../raw_map.tsv:340) | Ross K. Baker | Rutgers University | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [341](../raw_map.tsv:341) | Ross K. Baker | Rutgers University | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [342](../raw_map.tsv:342) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;scholar-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [343](../raw_map.tsv:343) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [344](../raw_map.tsv:344) | Ross K. Baker | Rutgers University | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_398__ent_155

**All observed names:** Stephen Gillers → New York University (6)

Ordered IDs: Ent[ent_398] → Ent[ent_155]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [296](../raw_map.tsv:296) | Stephen Gillers | New York University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [297](../raw_map.tsv:297) | Stephen Gillers | New York University | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [298](../raw_map.tsv:298) | Stephen Gillers | New York University | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [299](../raw_map.tsv:299) | Stephen Gillers | New York University | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [300](../raw_map.tsv:300) | Stephen Gillers | New York University | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [301](../raw_map.tsv:301) | Stephen Gillers | New York University | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_397__ent_158

**All observed names:** John C. Coffee Jr. → Columbia University (6)

Ordered IDs: Ent[ent_397] → Ent[ent_158]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [306](../raw_map.tsv:306) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [307](../raw_map.tsv:307) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [308](../raw_map.tsv:308) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [309](../raw_map.tsv:309) | John C. Coffee Jr. | Columbia University | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [310](../raw_map.tsv:310) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;of-&gt;pobj-&gt;law-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [311](../raw_map.tsv:311) | John C. Coffee Jr. | Columbia University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;school-&gt;poss-&gt;\|poss |

### rel_99__ent_398__ent_390

**All observed names:** Stephen Gillers → New York University Law School (6)

Ordered IDs: Ent[ent_398] → Ent[ent_390]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [322](../raw_map.tsv:322) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [323](../raw_map.tsv:323) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [325](../raw_map.tsv:325) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [327](../raw_map.tsv:327) | Stephen Gillers | New York University Law School | rcmod\|-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [328](../raw_map.tsv:328) | Stephen Gillers | New York University Law School | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-letter&lt;-dobj&lt;-make&lt;-rcmod&lt;-conflict&lt;-dobj&lt;-see-&gt;dobj-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [331](../raw_map.tsv:331) | Stephen Gillers | New York University Law School | appos\|-&gt;appos-&gt;rofessor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_150__ent_392

**All observed names:** Merle Black → Emory University (6)

Ordered IDs: Ent[ent_150] → Ent[ent_392]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [332](../raw_map.tsv:332) | Merle Black | Emory University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [333](../raw_map.tsv:333) | Merle Black | Emory University | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [334](../raw_map.tsv:334) | Merle Black | Emory University | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [335](../raw_map.tsv:335) | Merle Black | Emory University | appos\|-&gt;appos-&gt;scientist-&gt;nn-&gt;\|nn |
| [336](../raw_map.tsv:336) | Merle Black | Emory University | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [337](../raw_map.tsv:337) | Merle Black | Emory University | dep\|-&gt;dep-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_157__ent_399

**All observed names:** Andrew Zimbalist → Smith College (5)

Ordered IDs: Ent[ent_157] → Ent[ent_399]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [312](../raw_map.tsv:312) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [314](../raw_map.tsv:314) | Andrew Zimbalist | Smith College | nsubj\|&lt;-nsubj&lt;-professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [315](../raw_map.tsv:315) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [317](../raw_map.tsv:317) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [319](../raw_map.tsv:319) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;expert-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_854__ent_615

**All observed names:** Gary Burtless → Brookings Institution (5)

Ordered IDs: Ent[ent_854] → Ent[ent_615]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2389](../raw_map.tsv:2389) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2390](../raw_map.tsv:2390) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2392](../raw_map.tsv:2392) | Gary Burtless | Brookings Institution | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;comment-&gt;nn-&gt;\|nn |
| [2393](../raw_map.tsv:2393) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;scholar-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2396](../raw_map.tsv:2396) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_162__ent_165

**All observed names:** Douglas Muzzio → Baruch College (4)

Ordered IDs: Ent[ent_162] → Ent[ent_165]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [354](../raw_map.tsv:354) | Douglas Muzzio | Baruch College | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [355](../raw_map.tsv:355) | Douglas Muzzio | Baruch College | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;school-&gt;poss-&gt;\|poss |
| [356](../raw_map.tsv:356) | Douglas Muzzio | Baruch College | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [357](../raw_map.tsv:357) | Douglas Muzzio | Baruch College | appos\|-&gt;appos-&gt;scientist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_1006__ent_155

**All observed names:** Robert Berne → New York University (4)

Ordered IDs: Ent[ent_1006] → Ent[ent_155]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [752](../raw_map.tsv:752) | Robert Berne | New York University | appos\|-&gt;appos-&gt;dean-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [753](../raw_map.tsv:753) | Robert Berne | New York University | appos\|-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| [756](../raw_map.tsv:756) | Robert Berne | New York University | appos\|-&gt;appos-&gt;expert-&gt;prep-&gt;on-&gt;pobj-&gt;policy-&gt;rcmod-&gt;president-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [757](../raw_map.tsv:757) | Robert Berne | New York University | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

### rel_99__ent_191__ent_194

**All observed names:** Dr. Arthur Caplan → University of Pennsylvania (1)

Ordered IDs: Ent[ent_191] → Ent[ent_194]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [515](../raw_map.tsv:515) | Dr. Arthur Caplan | University of Pennsylvania | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
