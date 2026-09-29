# audit_06dbdb9b03af — rel_62: practices law in place

Predicate ID: lawyer_in

Person X is explicitly described as a lawyer practicing or professionally based in geographic place Y.

Includes: explicit lawyer-in place; a city or geographic nominal modifier of a lawyer establishing professional location; historical legal practice in the place. Excludes: representing a client or institution alone; a law firm or personal client in the geographic argument slot; residence or travel alone without legal practice. Ambiguous unless resolved by case-local evidence: public attorney office for a jurisdiction without evidence of practice location; geographic versus institutional meaning of Y unresolved; unclear attachment of the place to the lawyer. Separate from lawyer_for, which concerns representation or professional institutional affiliation. A governmental jurisdiction as client or office does not automatically establish this geographic practice predicate.

Complete census: 9 supported, 0 incorrect, 0 ambiguous; N=9. Precision 9/9=100.00% to 9/9=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 9 | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| 5 | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 5 | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| 4 | appos\|-&gt;appos-&gt;co-op-&gt;nn-&gt;\|nn |
| 2 | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;accountant-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;accountant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;in-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;with-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;dep-&gt;\|dep |
| 1 | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;tenant-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;tax-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-i.r.a.-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| 1 | appos\|&lt;-appos&lt;-investigator&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;dobj-&gt;lawyer-&gt;nn-&gt;\|nn |
| 1 | dep\|&lt;-dep&lt;-pair-&gt;prep-&gt;in-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;lawyer-&gt;nn-&gt;\|nn |

## Every evaluated fact

### rel_62__ent_601__ent_843

**All observed names:** Sidney Kess → New York (6)

Ordered IDs: Ent[ent_601] → Ent[ent_843]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2294](../raw_map.tsv:2294) | Sidney Kess | New York | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2295](../raw_map.tsv:2295) | Sidney Kess | New York | appos\|-&gt;appos-&gt;accountant-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2296](../raw_map.tsv:2296) | Sidney Kess | New York | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2297](../raw_map.tsv:2297) | Sidney Kess | New York | appos\|-&gt;appos-&gt;accountant-&gt;nn-&gt;\|nn |
| [2298](../raw_map.tsv:2298) | Sidney Kess | New York | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |
| [2299](../raw_map.tsv:2299) | Sidney Kess | New York | appos\|&lt;-appos&lt;-i.r.a.-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Sidney Kess → New York: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2294](../raw_map.tsv:2294), [2295](../raw_map.tsv:2295), [2296](../raw_map.tsv:2296), [2297](../raw_map.tsv:2297), [2298](../raw_map.tsv:2298), [2299](../raw_map.tsv:2299).


Issue tags: mixed_evidence

### rel_62__ent_604__ent_846

**All observed names:** Joel E. Miller → Queens (6)

Ordered IDs: Ent[ent_604] → Ent[ent_846]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2300](../raw_map.tsv:2300) | Joel E. Miller | Queens | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2301](../raw_map.tsv:2301) | Joel E. Miller | Queens | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2302](../raw_map.tsv:2302) | Joel E. Miller | Queens | rcmod\|-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2303](../raw_map.tsv:2303) | Joel E. Miller | Queens | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2304](../raw_map.tsv:2304) | Joel E. Miller | Queens | appos\|-&gt;appos-&gt;tax-&gt;nn-&gt;\|nn |
| [2305](../raw_map.tsv:2305) | Joel E. Miller | Queens | appos\|-&gt;appos-&gt;co-op-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Joel E. Miller → Queens: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2300](../raw_map.tsv:2300), [2301](../raw_map.tsv:2301), [2302](../raw_map.tsv:2302), [2303](../raw_map.tsv:2303), [2304](../raw_map.tsv:2304), [2305](../raw_map.tsv:2305).


Issue tags: mixed_evidence

### rel_62__ent_844__ent_1002

**All observed names:** John Dowd → Washington (4)

Ordered IDs: Ent[ent_844] → Ent[ent_1002]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2290](../raw_map.tsv:2290) | John Dowd | Washington | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2291](../raw_map.tsv:2291) | John Dowd | Washington | appos\|-&gt;appos-&gt;lawyer-&gt;dep-&gt;\|dep |
| [2292](../raw_map.tsv:2292) | John Dowd | Washington | appos\|&lt;-appos&lt;-investigator&lt;-pobj&lt;-with&lt;-prep&lt;-begin-&gt;dobj-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2293](../raw_map.tsv:2293) | John Dowd | Washington | appos\|-&gt;appos-&gt;attorney-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). John Dowd → Washington: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2290](../raw_map.tsv:2290), [2291](../raw_map.tsv:2291), [2292](../raw_map.tsv:2292), [2293](../raw_map.tsv:2293).




### rel_62__ent_603__ent_333

**All observed names:** Richard Siegler → Manhattan (4)

Ordered IDs: Ent[ent_603] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2306](../raw_map.tsv:2306) | Richard Siegler | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2307](../raw_map.tsv:2307) | Richard Siegler | Manhattan | appos\|-&gt;appos-&gt;co-op-&gt;nn-&gt;\|nn |
| [2308](../raw_map.tsv:2308) | Richard Siegler | Manhattan | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2309](../raw_map.tsv:2309) | Richard Siegler | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Richard Siegler → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2306](../raw_map.tsv:2306), [2307](../raw_map.tsv:2307), [2308](../raw_map.tsv:2308), [2309](../raw_map.tsv:2309).


Issue tags: mixed_evidence

### rel_62__ent_848__ent_333

**All observed names:** Stuart Saft → Manhattan (4)

Ordered IDs: Ent[ent_848] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2314](../raw_map.tsv:2314) | Stuart Saft | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2315](../raw_map.tsv:2315) | Stuart Saft | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2316](../raw_map.tsv:2316) | Stuart Saft | Manhattan | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;with-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |
| [2317](../raw_map.tsv:2317) | Stuart Saft | Manhattan | appos\|-&gt;appos-&gt;chairman-&gt;prep-&gt;in-&gt;pobj-&gt;firm-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Stuart Saft → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2314](../raw_map.tsv:2314), [2315](../raw_map.tsv:2315), [2316](../raw_map.tsv:2316), [2317](../raw_map.tsv:2317).


Issue tags: mixed_evidence

### rel_62__ent_605__ent_333

**All observed names:** David Ng → Manhattan (4)

Ordered IDs: Ent[ent_605] → Ent[ent_333]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2318](../raw_map.tsv:2318) | David Ng | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2319](../raw_map.tsv:2319) | David Ng | Manhattan | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2320](../raw_map.tsv:2320) | David Ng | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [2321](../raw_map.tsv:2321) | David Ng | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;poss-&gt;tenant-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). David Ng → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2318](../raw_map.tsv:2318), [2319](../raw_map.tsv:2319), [2320](../raw_map.tsv:2320), [2321](../raw_map.tsv:2321).


Issue tags: mixed_evidence

### rel_62__ent_602__ent_333

**All observed names:** Arthur I. Weinstein → Manhattan (3)

Ordered IDs: Ent[ent_602] → Ent[ent_333]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2287](../raw_map.tsv:2287) | Arthur I. Weinstein | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2288](../raw_map.tsv:2288) | Arthur I. Weinstein | Manhattan | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2289](../raw_map.tsv:2289) | Arthur I. Weinstein | Manhattan | appos\|-&gt;appos-&gt;co-op-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Arthur I. Weinstein → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2287](../raw_map.tsv:2287), [2288](../raw_map.tsv:2288), [2289](../raw_map.tsv:2289).


Issue tags: mixed_evidence

### rel_62__ent_606__ent_333

**All observed names:** Aaron Shmulewitz → Manhattan (3)

Ordered IDs: Ent[ent_606] → Ent[ent_333]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2311](../raw_map.tsv:2311) | Aaron Shmulewitz | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [2312](../raw_map.tsv:2312) | Aaron Shmulewitz | Manhattan | appos\|-&gt;appos-&gt;co-op-&gt;nn-&gt;\|nn |
| [2313](../raw_map.tsv:2313) | Aaron Shmulewitz | Manhattan | dep\|-&gt;dep-&gt;lawyer-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Aaron Shmulewitz → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [2311](../raw_map.tsv:2311), [2312](../raw_map.tsv:2312), [2313](../raw_map.tsv:2313).


Issue tags: mixed_evidence

### rel_62__ent_403__ent_333

**All observed names:** Richard → Manhattan (2)

Ordered IDs: Ent[ent_403] → Ent[ent_333]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3978](../raw_map.tsv:3978) | Richard | Manhattan | appos\|-&gt;appos-&gt;lawyer-&gt;nn-&gt;\|nn |
| [3984](../raw_map.tsv:3984) | Richard | Manhattan | dep\|&lt;-dep&lt;-pair-&gt;prep-&gt;in-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Richard → Manhattan: A local lawyer-in or geographic lawyer noun-modifier row establishes professional legal practice in the named city.

Cited evidence lines: [3978](../raw_map.tsv:3978), [3984](../raw_map.tsv:3984).


Issue tags: mixed_evidence
