# audit_dcb746fa83d6 — rel_55: economist at organization

Predicate ID: economist_for

Person X works or worked as an economist for or affiliated with organization Y.

Includes: explicit economist at/for/with/of; historical departmental economist affiliation. Excludes: analyst/strategist/specialist/professor/executive alone; generic financial expertise. Ambiguous unless resolved by case-local evidence: unclear economist/employer attachment.

Complete census: 9 supported, 1 incorrect, 0 ambiguous; N=10. Precision 9/10=90.00% to 9/10=90.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 6 | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| 5 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 4 | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;principal-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;in-&gt;pobj-&gt;trend-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;advmod-&gt;now-&gt;dep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;official-&gt;rcmod-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | appos\|&lt;-appos&lt;-booming-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-loss&lt;-dobj&lt;-discuss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-web-&gt;appos-&gt;director-&gt;poss-&gt;\|poss |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;comment-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;organization-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;predict-&gt;nsubj-&gt;official-&gt;rcmod-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_55__ent_854__ent_615

**All observed names:** Gary Burtless → Brookings Institution (8)

Ordered IDs: Ent[ent_854] → Ent[ent_615]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2388](../raw_map.tsv:2388) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2389](../raw_map.tsv:2389) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2390](../raw_map.tsv:2390) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2391](../raw_map.tsv:2391) | Gary Burtless | Brookings Institution | rcmod\|-&gt;rcmod-&gt;organization-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2392](../raw_map.tsv:2392) | Gary Burtless | Brookings Institution | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;comment-&gt;nn-&gt;\|nn |
| [2394](../raw_map.tsv:2394) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2395](../raw_map.tsv:2395) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;fellow-&gt;nn-&gt;\|nn |
| [2397](../raw_map.tsv:2397) | Gary Burtless | Brookings Institution | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Gary Burtless → Brookings Institution: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [2388](../raw_map.tsv:2388), [2389](../raw_map.tsv:2389), [2390](../raw_map.tsv:2390), [2391](../raw_map.tsv:2391), [2392](../raw_map.tsv:2392), [2394](../raw_map.tsv:2394), [2395](../raw_map.tsv:2395), [2397](../raw_map.tsv:2397).


Issue tags: mixed_evidence

### rel_55__ent_862__ent_808

**All observed names:** Stephen S. Roach → Morgan Stanley (5)

Ordered IDs: Ent[ent_862] → Ent[ent_808]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2350](../raw_map.tsv:2350) | Stephen S. Roach | Morgan Stanley | appos\|-&gt;appos-&gt;principal-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2353](../raw_map.tsv:2353) | Stephen S. Roach | Morgan Stanley | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2354](../raw_map.tsv:2354) | Stephen S. Roach | Morgan Stanley | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |
| [2355](../raw_map.tsv:2355) | Stephen S. Roach | Morgan Stanley | pobj\|&lt;-pobj&lt;-from&lt;-prep&lt;-web-&gt;appos-&gt;director-&gt;poss-&gt;\|poss |
| [2356](../raw_map.tsv:2356) | Stephen S. Roach | Morgan Stanley | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;in-&gt;pobj-&gt;trend-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Stephen S. Roach → Morgan Stanley: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [2350](../raw_map.tsv:2350), [2353](../raw_map.tsv:2353), [2354](../raw_map.tsv:2354), [2355](../raw_map.tsv:2355), [2356](../raw_map.tsv:2356).


Issue tags: mixed_evidence

### rel_55__ent_852__ent_613

**All observed names:** Lawrence A. Kudlow → Bear (5)

Ordered IDs: Ent[ent_852] → Ent[ent_613]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2378](../raw_map.tsv:2378) | Lawrence A. Kudlow | Bear | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2379](../raw_map.tsv:2379) | Lawrence A. Kudlow | Bear | rcmod\|-&gt;rcmod-&gt;predict-&gt;nsubj-&gt;official-&gt;rcmod-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2381](../raw_map.tsv:2381) | Lawrence A. Kudlow | Bear | appos\|-&gt;appos-&gt;official-&gt;rcmod-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2383](../raw_map.tsv:2383) | Lawrence A. Kudlow | Bear | appos\|-&gt;appos-&gt;economist-&gt;advmod-&gt;now-&gt;dep-&gt;with-&gt;pobj-&gt;\|pobj |
| [2384](../raw_map.tsv:2384) | Lawrence A. Kudlow | Bear | appos\|&lt;-appos&lt;-booming-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Lawrence A. Kudlow → Bear: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [2378](../raw_map.tsv:2378), [2379](../raw_map.tsv:2379), [2381](../raw_map.tsv:2381), [2383](../raw_map.tsv:2383), [2384](../raw_map.tsv:2384).


Issue tags: mixed_evidence

### rel_55__ent_553__ent_795

**All observed names:** Paul L. Kasriel → Northern Trust Company (3)

Ordered IDs: Ent[ent_553] → Ent[ent_795]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [745](../raw_map.tsv:745) | Paul L. Kasriel | Northern Trust Company | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [747](../raw_map.tsv:747) | Paul L. Kasriel | Northern Trust Company | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [748](../raw_map.tsv:748) | Paul L. Kasriel | Northern Trust Company | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Paul L. Kasriel → Northern Trust Company: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [745](../raw_map.tsv:745), [747](../raw_map.tsv:747), [748](../raw_map.tsv:748).




### rel_55__ent_862__ent_861

**All observed names:** Stephen S. Roach → Morgan Stanley &amp; Company (3)

Ordered IDs: Ent[ent_862] → Ent[ent_861]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2340](../raw_map.tsv:2340) | Stephen S. Roach | Morgan Stanley &amp; Company | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2341](../raw_map.tsv:2341) | Stephen S. Roach | Morgan Stanley &amp; Company | appos\|-&gt;appos-&gt;principal-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2345](../raw_map.tsv:2345) | Stephen S. Roach | Morgan Stanley &amp; Company | appos\|-&gt;appos-&gt;specialist-&gt;prep-&gt;in-&gt;pobj-&gt;trend-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Stephen S. Roach → Morgan Stanley & Company: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [2340](../raw_map.tsv:2340), [2341](../raw_map.tsv:2341), [2345](../raw_map.tsv:2345).


Issue tags: mixed_evidence

### rel_55__ent_720__ent_962

**All observed names:** Patrick C. Jackman → Labor Department (2)

Ordered IDs: Ent[ent_720] → Ent[ent_962]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7516](../raw_map.tsv:7516) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7517](../raw_map.tsv:7517) | Patrick C. Jackman | Labor Department | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Patrick C. Jackman → Labor Department: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [7516](../raw_map.tsv:7516), [7517](../raw_map.tsv:7517).




### rel_55__ent_1382__ent_144

**All observed names:** Robert D. Reischauer → Congressional Budget Office (1)

Ordered IDs: Ent[ent_1382] → Ent[ent_144]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [158](../raw_map.tsv:158) | Robert D. Reischauer | Congressional Budget Office | appos\|-&gt;appos-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Robert D. Reischauer → Congressional Budget Office: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [158](../raw_map.tsv:158).




### rel_55__ent_773__ent_161

**All observed names:** Donald Ratajczak → Georgia State University (1)

Ordered IDs: Ent[ent_773] → Ent[ent_161]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [541](../raw_map.tsv:541) | Donald Ratajczak | Georgia State University | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Donald Ratajczak → Georgia State University: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [541](../raw_map.tsv:541).




### rel_55__ent_1234__ent_147

**All observed names:** Seattle Mariners → New York Yankees (1)

Ordered IDs: Ent[ent_1234] → Ent[ent_147]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1057](../raw_map.tsv:1057) | Seattle Mariners | New York Yankees | nn\|&lt;-nn&lt;-loss&lt;-dobj&lt;-discuss-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Seattle Mariners → New York Yankees: Discussing a sporting loss does not establish economist employment.

Cited evidence lines: [1057](../raw_map.tsv:1057).




### rel_55__ent_331__ent_1414

**All observed names:** Bruce Steinberg → Merrill Lynch (1)

Ordered IDs: Ent[ent_331] → Ent[ent_1414]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2327](../raw_map.tsv:2327) | Bruce Steinberg | Merrill Lynch | appos\|-&gt;appos-&gt;economist-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bruce Steinberg → Merrill Lynch: An explicit economist title identifies professional affiliation with this institution; Bear is accepted as the same identifiable shorthand used in inherited full-census judgments.

Cited evidence lines: [2327](../raw_map.tsv:2327).



