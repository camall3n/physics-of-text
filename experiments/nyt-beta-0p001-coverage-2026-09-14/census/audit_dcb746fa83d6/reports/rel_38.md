# audit_dcb746fa83d6 — rel_38: political body has a leader

Predicate ID: has_political_leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

Complete census: 2 supported, 3 incorrect, 0 ambiguous; N=5. Precision 2/5=40.00% to 2/5=40.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 2 | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| 1 | appos\|-&gt;appos-&gt;economist-&gt;poss-&gt;\|poss |
| 1 | dep\|-&gt;dep-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-seat-&gt;rcmod-&gt;hold-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-by&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |
| 1 | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-to&lt;-prep&lt;-'-&gt;appos-&gt;\|appos |
| 1 | nsubj\|&lt;-nsubj&lt;-invite-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-concern-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-release&lt;-partmod&lt;-statement&lt;-pobj&lt;-of&lt;-prep&lt;-text-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-include-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_38__ent_586__ent_344

**All observed names:** White House → Marlin Fitzwater (4)

Ordered IDs: Ent[ent_586] → Ent[ent_344]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5370](../raw_map.tsv:5370) | White House | Marlin Fitzwater | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-by&lt;-prep&lt;-statement-&gt;appos-&gt;\|appos |
| [5372](../raw_map.tsv:5372) | White House | Marlin Fitzwater | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-release&lt;-partmod&lt;-statement&lt;-pobj&lt;-of&lt;-prep&lt;-text-&gt;appos-&gt;\|appos |
| [5374](../raw_map.tsv:5374) | White House | Marlin Fitzwater | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-concern-&gt;appos-&gt;\|appos |
| [5375](../raw_map.tsv:5375) | White House | Marlin Fitzwater | nn\|&lt;-nn&lt;-spokesman&lt;-pobj&lt;-to&lt;-prep&lt;-'-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). White House → Marlin Fitzwater: Spokesperson service, an economist employer or a person visiting a city is not the declared body-to-political-leader relation.

Cited evidence lines: [5370](../raw_map.tsv:5370), [5372](../raw_map.tsv:5372), [5374](../raw_map.tsv:5374), [5375](../raw_map.tsv:5375).




### rel_38__ent_847__ent_1275

**All observed names:** Bruce Steinberg → Merrill Lynch (3)

Ordered IDs: Ent[ent_847] → Ent[ent_1275]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [2326](../raw_map.tsv:2326) | Bruce Steinberg | Merrill Lynch | appos\|-&gt;appos-&gt;economist-&gt;poss-&gt;\|poss |
| [2329](../raw_map.tsv:2329) | Bruce Steinberg | Merrill Lynch | pobj\|&lt;-pobj&lt;-include-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [2331](../raw_map.tsv:2331) | Bruce Steinberg | Merrill Lynch | dep\|-&gt;dep-&gt;economist-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Bruce Steinberg → Merrill Lynch: Spokesperson service, an economist employer or a person visiting a city is not the declared body-to-political-leader relation.

Cited evidence lines: [2326](../raw_map.tsv:2326), [2329](../raw_map.tsv:2329), [2331](../raw_map.tsv:2331).




### rel_38__ent_1299__ent_930

**All observed names:** Senate → Donald T. DiFrancesco (2)

Ordered IDs: Ent[ent_1299] → Ent[ent_930]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6775](../raw_map.tsv:6775) | Senate | Donald T. DiFrancesco | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |
| [6781](../raw_map.tsv:6781) | Senate | Donald T. DiFrancesco | nn\|&lt;-nn&lt;-seat-&gt;rcmod-&gt;hold-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Senate → Donald T. DiFrancesco: Direct Senate or borough president apposition establishes political leadership of the named body.

Cited evidence lines: [6775](../raw_map.tsv:6775), [6781](../raw_map.tsv:6781).


Issue tags: mixed_evidence

### rel_38__ent_1290__ent_584

**All observed names:** Mr. Gorbachev → Moscow (1)

Ordered IDs: Ent[ent_1290] → Ent[ent_584]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5225](../raw_map.tsv:5225) | Mr. Gorbachev | Moscow | nsubj\|&lt;-nsubj&lt;-invite-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Mr. Gorbachev → Moscow: Spokesperson service, an economist employer or a person visiting a city is not the declared body-to-political-leader relation.

Cited evidence lines: [5225](../raw_map.tsv:5225).




### rel_38__ent_884__ent_937

**All observed names:** Brooklyn Borough → Howard Golden (1)

Ordered IDs: Ent[ent_884] → Ent[ent_937]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6763](../raw_map.tsv:6763) | Brooklyn Borough | Howard Golden | nn\|&lt;-nn&lt;-president-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Brooklyn Borough → Howard Golden: Direct Senate or borough president apposition establishes political leadership of the named body.

Cited evidence lines: [6763](../raw_map.tsv:6763).



