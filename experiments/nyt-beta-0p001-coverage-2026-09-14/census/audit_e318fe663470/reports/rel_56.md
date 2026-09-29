# audit_e318fe663470 — rel_56: organization described by national affiliation

Predicate ID: organization_national_affiliation

Organization X is explicitly described as belonging to the national or country affiliation designated by Y.

Includes: an explicit national adjective modifying the organization, such as a French company; a directly stated country-of-origin or national institutional affiliation; multiple explicitly named national affiliations. Excludes: physical offices or temporary operations in a country alone; ownership by a person or organization of that nationality alone; a national adjective modifying an unrelated person or parent rather than X; a person's nationality. Ambiguous unless resolved by case-local evidence: unclear national adjective attachment; a regional or city descriptor rather than a national affiliation; national origin versus current affiliation when the distinction is material. Y can be a complete nationality designation such as French or British-Dutch; this predicate does not assert headquarters or legal incorporation. A nationality label used as the argument here differs from an incomplete institution name in an office predicate.

Complete census: 4 supported, 3 incorrect, 0 ambiguous; N=7. Precision 4/7=57.14% to 4/7=57.14%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 5 | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |
| 3 | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;carrier-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;consortium-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;maker-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;media-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;subsidiary-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;amod-&gt;\|amod |
| 1 | dep\|&lt;-dep&lt;-operator-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-make&lt;-dep&lt;-monday-&gt;appos-&gt;minister-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;of-&gt;pobj-&gt;support-&gt;poss-&gt;government-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-run-&gt;prep-&gt;from-&gt;pobj-&gt;government-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-stake&lt;-dobj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;amod-&gt;\|amod |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-agreement&lt;-nsubj&lt;-satisfy-&gt;dobj-&gt;quest-&gt;poss-&gt;government-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-oil-&gt;amod-&gt;\|amod |
| 1 | poss\|&lt;-poss&lt;-party&lt;-pobj&lt;-of&lt;-prep&lt;-leadership&lt;-pobj&lt;-for&lt;-prep&lt;-vote&lt;-pobj&lt;-in&lt;-prep&lt;-victorious-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-share&lt;-pobj&lt;-of&lt;-prep&lt;-percent&lt;-nsubjpass&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;total-&gt;appos-&gt;company-&gt;amod-&gt;\|amodéal_,_a_consumer_products_company_. lex#'s_shares_are_owned_by_Total_,_the pos#POS_NNS_VBP_VBN_IN_NNP_,_DT lc#percent_of rc#oil_company |
| 1 | poss\|&lt;-poss&lt;-structure&lt;-nsubj&lt;-drive-&gt;dobj-&gt;deal-&gt;dep-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;total-&gt;appos-&gt;company-&gt;amod-&gt;\|amodéal_,_a_consumer_products_company_. lex#'s_ownership_structure_may_also_be_driving_the_deal_:_percent_of_'s_shares_are_owned_by_Total_,_the pos#POS_NN_NN_MD_RB_VB_VBG_DT_NN_:_NN_IN_POS_NNS_VBP_VBN_IN_NNP_,_DT rc#oil_company |

## Every evaluated fact

### rel_56__ent_23__ent_29

**All observed names:** Sanofi → French (9)

Ordered IDs: Ent[ent_23] → Ent[ent_29]; 9 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3637](../raw_map.tsv:3637) | Sanofi | French | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3638](../raw_map.tsv:3638) | Sanofi | French | appos\|-&gt;appos-&gt;maker-&gt;amod-&gt;\|amod |
| [3640](../raw_map.tsv:3640) | Sanofi | French | appos\|-&gt;appos-&gt;subsidiary-&gt;prep-&gt;of-&gt;pobj-&gt;company-&gt;amod-&gt;\|amod |
| [3641](../raw_map.tsv:3641) | Sanofi | French | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |
| [3642](../raw_map.tsv:3642) | Sanofi | French | poss\|&lt;-poss&lt;-structure&lt;-nsubj&lt;-drive-&gt;dobj-&gt;deal-&gt;dep-&gt;own-&gt;prep-&gt;by-&gt;pobj-&gt;total-&gt;appos-&gt;company-&gt;amod-&gt;\|amodéal_,_a_consumer_products_company_. lex#'s_ownership_structure_may_also_be_driving_the_deal_:_percent_of_'s_shares_are_owned_by_Total_,_the pos#POS_NN_NN_MD_RB_VB_VBG_DT_NN_:_NN_IN_POS_NNS_VBP_VBN_IN_NNP_,_DT rc#oil_company |
| [3643](../raw_map.tsv:3643) | Sanofi | French | poss\|&lt;-poss&lt;-share&lt;-pobj&lt;-of&lt;-prep&lt;-percent&lt;-nsubjpass&lt;-own-&gt;prep-&gt;by-&gt;pobj-&gt;total-&gt;appos-&gt;company-&gt;amod-&gt;\|amodéal_,_a_consumer_products_company_. lex#'s_shares_are_owned_by_Total_,_the pos#POS_NNS_VBP_VBN_IN_NNP_,_DT lc#percent_of rc#oil_company |
| [3644](../raw_map.tsv:3644) | Sanofi | French | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-agreement&lt;-nsubj&lt;-satisfy-&gt;dobj-&gt;quest-&gt;poss-&gt;government-&gt;amod-&gt;\|amod |
| [3645](../raw_map.tsv:3645) | Sanofi | French | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;of-&gt;pobj-&gt;support-&gt;poss-&gt;government-&gt;amod-&gt;\|amod |
| [3646](../raw_map.tsv:3646) | Sanofi | French | nsubj\|&lt;-nsubj&lt;-make&lt;-dep&lt;-monday-&gt;appos-&gt;minister-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Sanofi → French: A local national adjective directly modifies the organization, establishing national affiliation.

Cited evidence lines: [3637](../raw_map.tsv:3637), [3638](../raw_map.tsv:3638), [3640](../raw_map.tsv:3640), [3641](../raw_map.tsv:3641), [3642](../raw_map.tsv:3642), [3643](../raw_map.tsv:3643), [3644](../raw_map.tsv:3644), [3645](../raw_map.tsv:3645), [3646](../raw_map.tsv:3646).


Issue tags: mixed_evidence

### rel_56__ent_27__ent_29

**All observed names:** Cegetel → French (7)

Ordered IDs: Ent[ent_27] → Ent[ent_29]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3619](../raw_map.tsv:3619) | Cegetel | French | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3621](../raw_map.tsv:3621) | Cegetel | French | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-stake&lt;-dobj&lt;-sell-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;amod-&gt;\|amod |
| [3622](../raw_map.tsv:3622) | Cegetel | French | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-run-&gt;prep-&gt;from-&gt;pobj-&gt;government-&gt;amod-&gt;\|amod |
| [3623](../raw_map.tsv:3623) | Cegetel | French | dep\|&lt;-dep&lt;-operator-&gt;prep-&gt;to-&gt;pobj-&gt;partner-&gt;amod-&gt;\|amod |
| [3624](../raw_map.tsv:3624) | Cegetel | French | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |
| [3625](../raw_map.tsv:3625) | Cegetel | French | appos\|-&gt;appos-&gt;consortium-&gt;amod-&gt;\|amod |
| [3626](../raw_map.tsv:3626) | Cegetel | French | appos\|-&gt;appos-&gt;carrier-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Cegetel → French: A local national adjective directly modifies the organization, establishing national affiliation.

Cited evidence lines: [3619](../raw_map.tsv:3619), [3621](../raw_map.tsv:3621), [3622](../raw_map.tsv:3622), [3623](../raw_map.tsv:3623), [3624](../raw_map.tsv:3624), [3625](../raw_map.tsv:3625), [3626](../raw_map.tsv:3626).


Issue tags: mixed_evidence

### rel_56__ent_293__ent_10

**All observed names:** Bertelsmann → German (2)

Ordered IDs: Ent[ent_293] → Ent[ent_10]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3606](../raw_map.tsv:3606) | Bertelsmann | German | appos\|-&gt;appos-&gt;media-&gt;amod-&gt;\|amod |
| [3607](../raw_map.tsv:3607) | Bertelsmann | German | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Bertelsmann → German: A local national adjective directly modifies the organization, establishing national affiliation.

Cited evidence lines: [3606](../raw_map.tsv:3606), [3607](../raw_map.tsv:3607).




### rel_56__ent_24__ent_1339

**All observed names:** Unocal → American (2)

Ordered IDs: Ent[ent_24] → Ent[ent_1339]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3627](../raw_map.tsv:3627) | Unocal | American | appos\|-&gt;appos-&gt;company-&gt;amod-&gt;\|amod |
| [3630](../raw_map.tsv:3630) | Unocal | American | poss\|&lt;-poss&lt;-oil-&gt;amod-&gt;\|amod |

**Judgment: supported** (primary). Unocal → American: A local national adjective directly modifies the organization, establishing national affiliation.

Cited evidence lines: [3627](../raw_map.tsv:3627), [3630](../raw_map.tsv:3630).


Issue tags: mixed_evidence

### rel_56__ent_1337__ent_941

**All observed names:** Israel → Yitzhak Rabin (1)

Ordered IDs: Ent[ent_1337] → Ent[ent_941]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7064](../raw_map.tsv:7064) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-party&lt;-pobj&lt;-of&lt;-prep&lt;-leadership&lt;-pobj&lt;-for&lt;-prep&lt;-vote&lt;-pobj&lt;-in&lt;-prep&lt;-victorious-&gt;appos-&gt;\|appos |

**Judgment: incorrect** (primary). Israel → Yitzhak Rabin: Inverse political leadership or a city-based group descriptor does not establish national affiliation.

Cited evidence lines: [7064](../raw_map.tsv:7064).




### rel_56__ent_1247__ent_1270

**All observed names:** Hicks → Dallas (1)

Ordered IDs: Ent[ent_1247] → Ent[ent_1270]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7414](../raw_map.tsv:7414) | Hicks | Dallas | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Hicks → Dallas: Inverse political leadership or a city-based group descriptor does not establish national affiliation.

Cited evidence lines: [7414](../raw_map.tsv:7414).




### rel_56__ent_955__ent_1033

**All observed names:** Petroleum Finance Company → Washington (1)

Ordered IDs: Ent[ent_955] → Ent[ent_1033]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7428](../raw_map.tsv:7428) | Petroleum Finance Company | Washington | appos\|-&gt;appos-&gt;group-&gt;amod-&gt;\|amod |

**Judgment: incorrect** (primary). Petroleum Finance Company → Washington: Inverse political leadership or a city-based group descriptor does not establish national affiliation.

Cited evidence lines: [7428](../raw_map.tsv:7428).



