# audit_dcb746fa83d6 — rel_12: analyst at organization

Predicate ID: analyst_for

Person X works or worked as an analyst for organization Y.

Includes: explicit analyst at/for/with/of; following or tracking an industry or companies for an employer when it identifies professional analysis. Excludes: director/president/professor/scientist/spokesperson/editor/lawyer/partner alone; generic affiliation. Ambiguous unless resolved by case-local evidence: economist-only, forecaster, strategist or specialist at the analyst role boundary; unclear role/employer attachment. Preserves the earlier full-census A boundary for nearby financial roles; do not silently label all financial employment analyst.

Complete census: 4 supported, 3 incorrect, 1 ambiguous; N=8. Precision 4/8=50.00% to 5/8=62.50%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;spokesman-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;branch-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;track-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;research-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-bill-&gt;prep-&gt;like-&gt;pobj-&gt;measure-&gt;nn-&gt;\|nn |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-release-&gt;prep-&gt;by-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;research-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_12__ent_383__ent_140

**All observed names:** Blair Horner → New York Public Interest Research Group (8)

Ordered IDs: Ent[ent_383] → Ent[ent_140]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [118](../raw_map.tsv:118) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;branch-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [119](../raw_map.tsv:119) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [122](../raw_map.tsv:122) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;spokesman-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [123](../raw_map.tsv:123) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1719](../raw_map.tsv:1719) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;head-&gt;prep-&gt;of-&gt;pobj-&gt;branch-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1720](../raw_map.tsv:1720) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1723](../raw_map.tsv:1723) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;spokesman-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [1724](../raw_map.tsv:1724) | Blair Horner | New York Public Interest Research Group | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Blair Horner → New York Public Interest Research Group: An explicit analyst title establishes the institutional analysis role.

Cited evidence lines: [118](../raw_map.tsv:118), [119](../raw_map.tsv:119), [122](../raw_map.tsv:122), [123](../raw_map.tsv:123), [1719](../raw_map.tsv:1719), [1720](../raw_map.tsv:1720), [1723](../raw_map.tsv:1723), [1724](../raw_map.tsv:1724).


Issue tags: mixed_evidence

### rel_12__ent_121__ent_376

**All observed names:** Charles Brecher → Citizens Budget Commission (4)

Ordered IDs: Ent[ent_121] → Ent[ent_376]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1755](../raw_map.tsv:1755) | Charles Brecher | Citizens Budget Commission | appos\|-&gt;appos-&gt;professor-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1756](../raw_map.tsv:1756) | Charles Brecher | Citizens Budget Commission | rcmod\|-&gt;rcmod-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;research-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [1757](../raw_map.tsv:1757) | Charles Brecher | Citizens Budget Commission | appos\|-&gt;appos-&gt;spokesman-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [1759](../raw_map.tsv:1759) | Charles Brecher | Citizens Budget Commission | appos\|-&gt;appos-&gt;director-&gt;prep-&gt;of-&gt;pobj-&gt;research-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Charles Brecher → Citizens Budget Commission: Research director/professor/spokesman alone or legislative discourse does not establish analyst employment.

Cited evidence lines: [1755](../raw_map.tsv:1755), [1756](../raw_map.tsv:1756), [1757](../raw_map.tsv:1757), [1759](../raw_map.tsv:1759).


Issue tags: mixed_evidence

### rel_12__ent_495__ent_1182

**All observed names:** Neil Sweig → Southeast Research Partners (2)

Ordered IDs: Ent[ent_495] → Ent[ent_1182]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1804](../raw_map.tsv:1804) | Neil Sweig | Southeast Research Partners | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [1806](../raw_map.tsv:1806) | Neil Sweig | Southeast Research Partners | rcmod\|-&gt;rcmod-&gt;track-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Neil Sweig → Southeast Research Partners: An explicit analyst title establishes the institutional analysis role.

Cited evidence lines: [1804](../raw_map.tsv:1804), [1806](../raw_map.tsv:1806).


Issue tags: mixed_evidence

### rel_12__ent_926__ent_1295

**All observed names:** Walter Spilka → Harris Upham &amp; Company (1)

Ordered IDs: Ent[ent_926] → Ent[ent_1295]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1829](../raw_map.tsv:1829) | Walter Spilka | Harris Upham &amp; Company | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Walter Spilka → Harris Upham & Company: An explicit analyst title establishes the institutional analysis role.

Cited evidence lines: [1829](../raw_map.tsv:1829).




### rel_12__ent_1401__ent_1326

**All observed names:** Senate → House (1)

Ordered IDs: Ent[ent_1401] → Ent[ent_1326]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1936](../raw_map.tsv:1936) | Senate | House | nn\|&lt;-nn&lt;-bill-&gt;prep-&gt;like-&gt;pobj-&gt;measure-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Senate → House: Research director/professor/spokesman alone or legislative discourse does not establish analyst employment.

Cited evidence lines: [1936](../raw_map.tsv:1936).




### rel_12__ent_1355__ent_1180

**All observed names:** Emanuel Goldman → Paine Webber (1)

Ordered IDs: Ent[ent_1355] → Ent[ent_1180]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7805](../raw_map.tsv:7805) | Emanuel Goldman | Paine Webber | appos\|-&gt;appos-&gt;analyst-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Emanuel Goldman → Paine Webber: An explicit analyst title establishes the institutional analysis role.

Cited evidence lines: [7805](../raw_map.tsv:7805).




### rel_12__ent_1355__ent_1275

**All observed names:** Emanuel Goldman → Merrill Lynch (1)

Ordered IDs: Ent[ent_1355] → Ent[ent_1275]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7850](../raw_map.tsv:7850) | Emanuel Goldman | Merrill Lynch | rcmod\|-&gt;rcmod-&gt;track-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Emanuel Goldman → Merrill Lynch: Bare track-for omits what was tracked and does not independently identify professional industry analysis.

Cited evidence lines: [7850](../raw_map.tsv:7850).

**Review question:** Was Goldman tracking companies or an industry for Merrill Lynch, or something else?
Issue tags: omitted_analysis_object

### rel_12__ent_1440__ent_1415

**All observed names:** Congress → White House (1)

Ordered IDs: Ent[ent_1440] → Ent[ent_1415]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7947](../raw_map.tsv:7947) | Congress | White House | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-release-&gt;prep-&gt;by-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Congress → White House: Research director/professor/spokesman alone or legislative discourse does not establish analyst employment.

Cited evidence lines: [7947](../raw_map.tsv:7947).



