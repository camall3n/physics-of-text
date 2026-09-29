# audit_dcb746fa83d6 — rel_79: organization described by national affiliation

Predicate ID: organization_national_affiliation

Organization X is explicitly described as belonging to the national or country affiliation designated by Y.

Includes: an explicit national adjective modifying the organization, such as a French company; a directly stated country-of-origin or national institutional affiliation; multiple explicitly named national affiliations. Excludes: physical offices or temporary operations in a country alone; ownership by a person or organization of that nationality alone; a national adjective modifying an unrelated person or parent rather than X; a person's nationality. Ambiguous unless resolved by case-local evidence: unclear national adjective attachment; a regional or city descriptor rather than a national affiliation; national origin versus current affiliation when the distinction is material. Y can be a complete nationality designation such as French or British-Dutch; this predicate does not assert headquarters or legal incorporation. A nationality label used as the argument here differs from an incomplete institution name in an office predicate.

Complete census: 1 supported, 4 incorrect, 0 ambiguous; N=5. Precision 1/5=20.00% to 1/5=20.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;group-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;conglomerate-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;consumer-products-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;corporation-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;food-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;group-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;maker-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;product-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;tracker-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-bank-&gt;prep-&gt;across-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-competitor-&gt;prep-&gt;in-&gt;pobj-&gt;technology-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;search-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;institution-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_79__ent_934__ent_1079

**All observed names:** Unilever → British-Dutch (9)

Ordered IDs: Ent[ent_934] → Ent[ent_1079]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6824](../raw_map.tsv:6824) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| [6825](../raw_map.tsv:6825) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;product-&gt;nn-&gt;\|nn |
| [6826](../raw_map.tsv:6826) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;conglomerate-&gt;nn-&gt;\|nn |
| [6827](../raw_map.tsv:6827) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;food-&gt;nn-&gt;\|nn |
| [6829](../raw_map.tsv:6829) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;maker-&gt;nn-&gt;\|nn |
| [6830](../raw_map.tsv:6830) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;group-&gt;nn-&gt;\|nn |
| [6831](../raw_map.tsv:6831) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| [6832](../raw_map.tsv:6832) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;corporation-&gt;nn-&gt;\|nn |
| [6833](../raw_map.tsv:6833) | Unilever | British-Dutch | appos\|-&gt;appos-&gt;consumer-products-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Unilever → British-Dutch: Repeated explicit British-Dutch company and producer descriptions establish national affiliation.

Cited evidence lines: [6824](../raw_map.tsv:6824), [6825](../raw_map.tsv:6825), [6826](../raw_map.tsv:6826), [6827](../raw_map.tsv:6827), [6829](../raw_map.tsv:6829), [6830](../raw_map.tsv:6830), [6831](../raw_map.tsv:6831), [6832](../raw_map.tsv:6832), [6833](../raw_map.tsv:6833).


Issue tags: mixed_evidence

### rel_79__ent_462__ent_683

**All observed names:** Mcorp → Texas (5)

Ordered IDs: Ent[ent_462] → Ent[ent_683]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5794](../raw_map.tsv:5794) | Mcorp | Texas | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| [5795](../raw_map.tsv:5795) | Mcorp | Texas | nsubj\|&lt;-nsubj&lt;-company-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5798](../raw_map.tsv:5798) | Mcorp | Texas | appos\|-&gt;appos-&gt;group-&gt;poss-&gt;\|poss |
| [5800](../raw_map.tsv:5800) | Mcorp | Texas | rcmod\|-&gt;rcmod-&gt;institution-&gt;nn-&gt;\|nn |
| [5802](../raw_map.tsv:5802) | Mcorp | Texas | poss\|&lt;-poss&lt;-bank-&gt;prep-&gt;across-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mcorp → Texas: Texas, Chicago and Washington are regional/local descriptors, and Internet is an industry domain; none establishes a national affiliation as defined.

Cited evidence lines: [5794](../raw_map.tsv:5794), [5795](../raw_map.tsv:5795), [5798](../raw_map.tsv:5798), [5800](../raw_map.tsv:5800), [5802](../raw_map.tsv:5802).


Issue tags: mixed_evidence

### rel_79__ent_933__ent_1444

**All observed names:** Google → Internet (4)

Ordered IDs: Ent[ent_933] → Ent[ent_1444]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6835](../raw_map.tsv:6835) | Google | Internet | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |
| [6836](../raw_map.tsv:6836) | Google | Internet | appos\|-&gt;appos-&gt;giant-&gt;nn-&gt;\|nn |
| [6838](../raw_map.tsv:6838) | Google | Internet | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;search-&gt;nn-&gt;\|nn |
| [6841](../raw_map.tsv:6841) | Google | Internet | poss\|&lt;-poss&lt;-competitor-&gt;prep-&gt;in-&gt;pobj-&gt;technology-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Google → Internet: Texas, Chicago and Washington are regional/local descriptors, and Internet is an industry domain; none establishes a national affiliation as defined.

Cited evidence lines: [6835](../raw_map.tsv:6835), [6836](../raw_map.tsv:6836), [6838](../raw_map.tsv:6838), [6841](../raw_map.tsv:6841).


Issue tags: mixed_evidence

### rel_79__ent_220__ent_861

**All observed names:** Morningstar → Chicago (2)

Ordered IDs: Ent[ent_220] → Ent[ent_861]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5790](../raw_map.tsv:5790) | Morningstar | Chicago | appos\|-&gt;appos-&gt;tracker-&gt;nn-&gt;\|nn |
| [5792](../raw_map.tsv:5792) | Morningstar | Chicago | appos\|-&gt;appos-&gt;company-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Morningstar → Chicago: Texas, Chicago and Washington are regional/local descriptors, and Internet is an industry domain; none establishes a national affiliation as defined.

Cited evidence lines: [5790](../raw_map.tsv:5790), [5792](../raw_map.tsv:5792).




### rel_79__ent_955__ent_1361

**All observed names:** Petroleum Finance Company → Washington (1)

Ordered IDs: Ent[ent_955] → Ent[ent_1361]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7423](../raw_map.tsv:7423) | Petroleum Finance Company | Washington | appos\|-&gt;appos-&gt;group-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Petroleum Finance Company → Washington: Texas, Chicago and Washington are regional/local descriptors, and Internet is an industry domain; none establishes a national affiliation as defined.

Cited evidence lines: [7423](../raw_map.tsv:7423).



