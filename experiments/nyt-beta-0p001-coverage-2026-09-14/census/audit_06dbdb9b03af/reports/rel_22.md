# audit_06dbdb9b03af — rel_22: economist at organization

Predicate ID: economist_for

Person X works or worked as an economist for or affiliated with organization Y.

Includes: explicit economist at/for/with/of; historical departmental economist affiliation. Excludes: analyst/strategist/specialist/professor/executive alone; generic financial expertise. Ambiguous unless resolved by case-local evidence: unclear economist/employer attachment.

Complete census: 6 supported, 1 incorrect, 0 ambiguous; N=7. Precision 6/7=85.71% to 6/7=85.71%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| 5 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;branch-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;for-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;in-&gt;pobj-&gt;branch-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;producer-&gt;rcmod-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;specialist-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-caution-&gt;nsubj-&gt;branch-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-commercialism-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;baseball-&gt;nsubj-&gt;professor-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;organization-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_22__ent_720__ent_962

**All observed names:** Patrick C. Jackman → Labor Department (7)

Ordered IDs: Ent[ent_720] → Ent[ent_962]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7515](../raw_map.tsv:7515) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;specialist-&gt;nn-&gt;\|nn |
| [7516](../raw_map.tsv:7516) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7517](../raw_map.tsv:7517) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| [7518](../raw_map.tsv:7518) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;chief-&gt;prep-&gt;of-&gt;pobj-&gt;branch-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7519](../raw_map.tsv:7519) | Patrick C. Jackman | Labor Department | nsubj\|&lt;-nsubj&lt;-caution-&gt;nsubj-&gt;branch-&gt;poss-&gt;\|poss |
| [7522](../raw_map.tsv:7522) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;in-&gt;pobj-&gt;branch-&gt;nn-&gt;\|nn |
| [7523](../raw_map.tsv:7523) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;for-&gt;pobj-&gt;unit-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Patrick C. Jackman → Labor Department: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [7515](../raw_map.tsv:7515), [7516](../raw_map.tsv:7516), [7517](../raw_map.tsv:7517), [7518](../raw_map.tsv:7518), [7519](../raw_map.tsv:7519), [7522](../raw_map.tsv:7522), [7523](../raw_map.tsv:7523).


Issue tags: mixed_evidence

### rel_22__ent_157__ent_399

**All observed names:** Andrew Zimbalist → Smith College (5)

Ordered IDs: Ent[ent_157] → Ent[ent_399]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [313](../raw_map.tsv:313) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [316](../raw_map.tsv:316) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| [318](../raw_map.tsv:318) | Andrew Zimbalist | Smith College | appos\|-&gt;appos-&gt;economist-&gt;rcmod-&gt;teach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [320](../raw_map.tsv:320) | Andrew Zimbalist | Smith College | rcmod\|-&gt;rcmod-&gt;baseball-&gt;nsubj-&gt;professor-&gt;nn-&gt;\|nn |
| [321](../raw_map.tsv:321) | Andrew Zimbalist | Smith College | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-commercialism-&gt;appos-&gt;professor-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Andrew Zimbalist → Smith College: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [313](../raw_map.tsv:313), [316](../raw_map.tsv:316), [318](../raw_map.tsv:318), [320](../raw_map.tsv:320), [321](../raw_map.tsv:321).


Issue tags: mixed_evidence

### rel_22__ent_854__ent_615

**All observed names:** Gary Burtless → Brookings Institution (5)

Ordered IDs: Ent[ent_854] → Ent[ent_615]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2388](../raw_map.tsv:2388) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2391](../raw_map.tsv:2391) | Gary Burtless | Brookings Institution | rcmod\|-&gt;rcmod-&gt;organization-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2394](../raw_map.tsv:2394) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2395](../raw_map.tsv:2395) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;nn-&gt;\|nn |
| [2397](../raw_map.tsv:2397) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Gary Burtless → Brookings Institution: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [2388](../raw_map.tsv:2388), [2391](../raw_map.tsv:2391), [2394](../raw_map.tsv:2394), [2395](../raw_map.tsv:2395), [2397](../raw_map.tsv:2397).


Issue tags: mixed_evidence

### rel_22__ent_541__ent_783

**All observed names:** Tom Wolzien → Sanford C. Bernstein &amp; Company (4)

Ordered IDs: Ent[ent_541] → Ent[ent_783]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [599](../raw_map.tsv:599) | Tom Wolzien | Sanford C. Bernstein &amp; Company | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [600](../raw_map.tsv:600) | Tom Wolzien | Sanford C. Bernstein &amp; Company | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [601](../raw_map.tsv:601) | Tom Wolzien | Sanford C. Bernstein &amp; Company | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [602](../raw_map.tsv:602) | Tom Wolzien | Sanford C. Bernstein &amp; Company | appos\|-&gt;appos-&gt;producer-&gt;rcmod-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Tom Wolzien → Sanford C. Bernstein & Company: Only analyst/producer role evidence is supplied; it does not establish an economist role.

Cited evidence lines: [599](../raw_map.tsv:599), [600](../raw_map.tsv:600), [601](../raw_map.tsv:601), [602](../raw_map.tsv:602).




### rel_22__ent_524__ent_766

**All observed names:** Donald J. Fine → Chase Manhattan Bank (3)

Ordered IDs: Ent[ent_524] → Ent[ent_766]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [558](../raw_map.tsv:558) | Donald J. Fine | Chase Manhattan Bank | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [561](../raw_map.tsv:561) | Donald J. Fine | Chase Manhattan Bank | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [562](../raw_map.tsv:562) | Donald J. Fine | Chase Manhattan Bank | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Donald J. Fine → Chase Manhattan Bank: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [558](../raw_map.tsv:558), [561](../raw_map.tsv:561), [562](../raw_map.tsv:562).


Issue tags: mixed_evidence

### rel_22__ent_773__ent_523

**All observed names:** Donald Ratajczak → Georgia State University (2)

Ordered IDs: Ent[ent_773] → Ent[ent_523]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [535](../raw_map.tsv:535) | Donald Ratajczak | Georgia State University | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [541](../raw_map.tsv:541) | Donald Ratajczak | Georgia State University | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Donald Ratajczak → Georgia State University: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [535](../raw_map.tsv:535), [541](../raw_map.tsv:541).




### rel_22__ent_553__ent_795

**All observed names:** Paul L. Kasriel → Northern Trust Company (1)

Ordered IDs: Ent[ent_553] → Ent[ent_795]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [748](../raw_map.tsv:748) | Paul L. Kasriel | Northern Trust Company | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Paul L. Kasriel → Northern Trust Company: An explicit economist title attached to the named employer or institution establishes the declared affiliation.

Cited evidence lines: [748](../raw_map.tsv:748).



