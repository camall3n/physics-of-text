# audit_06dbdb9b03af — rel_87: has minister

Predicate ID: has_minister

Country, government, or political administration X has or had person Y as an explicitly identified minister.

Includes: explicit minister of X or X's minister; a portfolio or prime minister office explicitly attached to X; historical ministerial office. Excludes: ordinary official, ambassador, or opposition politician without minister title; a minister of a different government merely meeting X; candidate or proposed appointment alone. Ambiguous unless resolved by case-local evidence: an incomplete national adjective in the institution slot; minister-designate without established tenure; unclear portfolio or government attachment. The inverse ministerial office does not assert that every minister is the head of government.

Complete census: 8 supported, 0 incorrect, 0 ambiguous; N=8. Precision 8/8=100.00% to 8/8=100.00%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 8 | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| 4 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| 3 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-have-&gt;nsubj-&gt;\|nsubj |
| 1 | pobj\|&lt;-pobj&lt;-into&lt;-prep&lt;-raid-&gt;prep-&gt;by-&gt;pobj-&gt;group-&gt;rcmod-&gt;provide-&gt;dobj-&gt;government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-company-&gt;dobj-&gt;ten-&gt;prep-&gt;to-&gt;pobj-&gt;politician-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-economy&lt;-dobj&lt;-entrust-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-minister-&gt;dep-&gt;provide-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-invite&lt;-partmod&lt;-ruler-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-telephone-&gt;dobj-&gt;\|dobj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-as&lt;-prep&lt;-term&lt;-pobj&lt;-after&lt;-prep&lt;-face-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-by&lt;-prep&lt;-initiative-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-talk&lt;-pobj&lt;-for&lt;-prep&lt;-call-&gt;dep-&gt;\|dep |
| 1 | poss\|&lt;-poss&lt;-president&lt;-nsubj&lt;-accept-&gt;dobj-&gt;resignation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-response&lt;-pobj&lt;-of&lt;-prep&lt;-charge&lt;-pobj&lt;-in&lt;-prep&lt;-message-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-roster-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-service&lt;-nsubj&lt;-tighten-&gt;dobj-&gt;issue-&gt;appos-&gt;\|appos |
| 1 | rcmod\|-&gt;rcmod-&gt;cross-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;discuss-&gt;dobj-&gt;package-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;see-&gt;prep-&gt;as-&gt;pobj-&gt;move-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;nsubj-&gt;minister-&gt;appos-&gt;\|appos |

## Every evaluated fact

### rel_87__ent_820__ent_709

**All observed names:** Israel → Ehud Olmert (6)

Ordered IDs: Ent[ent_820] → Ent[ent_709]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7037](../raw_map.tsv:7037) | Israel | Ehud Olmert | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7039](../raw_map.tsv:7039) | Israel | Ehud Olmert | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7040](../raw_map.tsv:7040) | Israel | Ehud Olmert | pobj\|&lt;-pobj&lt;-into&lt;-prep&lt;-raid-&gt;prep-&gt;by-&gt;pobj-&gt;group-&gt;rcmod-&gt;provide-&gt;dobj-&gt;government-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7042](../raw_map.tsv:7042) | Israel | Ehud Olmert | rcmod\|-&gt;rcmod-&gt;discuss-&gt;dobj-&gt;package-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [7043](../raw_map.tsv:7043) | Israel | Ehud Olmert | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-with&lt;-prep&lt;-talk&lt;-pobj&lt;-for&lt;-prep&lt;-call-&gt;dep-&gt;\|dep |
| [7046](../raw_map.tsv:7046) | Israel | Ehud Olmert | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-by&lt;-prep&lt;-initiative-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Israel → Ehud Olmert: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7037](../raw_map.tsv:7037), [7039](../raw_map.tsv:7039), [7040](../raw_map.tsv:7040), [7042](../raw_map.tsv:7042), [7043](../raw_map.tsv:7043), [7046](../raw_map.tsv:7046).


Issue tags: mixed_evidence

### rel_87__ent_820__ent_949

**All observed names:** Israel → Ariel Sharon (5)

Ordered IDs: Ent[ent_820] → Ent[ent_949]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6997](../raw_map.tsv:6997) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [6999](../raw_map.tsv:6999) | Israel | Ariel Sharon | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7002](../raw_map.tsv:7002) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-minister&lt;-pobj&lt;-as&lt;-prep&lt;-term&lt;-pobj&lt;-after&lt;-prep&lt;-face-&gt;nsubj-&gt;\|nsubj |
| [7003](../raw_map.tsv:7003) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-minister-&gt;dep-&gt;provide-&gt;dobj-&gt;\|dobj |
| [7004](../raw_map.tsv:7004) | Israel | Ariel Sharon | poss\|&lt;-poss&lt;-leadership-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Israel → Ariel Sharon: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [6997](../raw_map.tsv:6997), [6999](../raw_map.tsv:6999), [7002](../raw_map.tsv:7002), [7003](../raw_map.tsv:7003), [7004](../raw_map.tsv:7004).


Issue tags: mixed_evidence

### rel_87__ent_813__ent_706

**All observed names:** Britain → Tony Blair (5)

Ordered IDs: Ent[ent_813] → Ent[ent_706]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7007](../raw_map.tsv:7007) | Britain | Tony Blair | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7008](../raw_map.tsv:7008) | Britain | Tony Blair | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-say-&gt;nsubj-&gt;\|nsubj |
| [7011](../raw_map.tsv:7011) | Britain | Tony Blair | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [7012](../raw_map.tsv:7012) | Britain | Tony Blair | pobj\|&lt;-pobj&lt;-in&lt;-prep&lt;-have-&gt;nsubj-&gt;\|nsubj |
| [7014](../raw_map.tsv:7014) | Britain | Tony Blair | rcmod\|-&gt;rcmod-&gt;take-&gt;nsubj-&gt;minister-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Britain → Tony Blair: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7007](../raw_map.tsv:7007), [7008](../raw_map.tsv:7008), [7011](../raw_map.tsv:7011), [7012](../raw_map.tsv:7012), [7014](../raw_map.tsv:7014).


Issue tags: mixed_evidence

### rel_87__ent_96__ent_948

**All observed names:** India → Atal Behari Vajpayee (5)

Ordered IDs: Ent[ent_96] → Ent[ent_948]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7027](../raw_map.tsv:7027) | India | Atal Behari Vajpayee | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7028](../raw_map.tsv:7028) | India | Atal Behari Vajpayee | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [7029](../raw_map.tsv:7029) | India | Atal Behari Vajpayee | poss\|&lt;-poss&lt;-president&lt;-nsubj&lt;-accept-&gt;dobj-&gt;resignation-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7035](../raw_map.tsv:7035) | India | Atal Behari Vajpayee | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-telephone-&gt;dobj-&gt;\|dobj |
| [7036](../raw_map.tsv:7036) | India | Atal Behari Vajpayee | poss\|&lt;-poss&lt;-minister&lt;-dobj&lt;-invite&lt;-partmod&lt;-ruler-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). India → Atal Behari Vajpayee: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7027](../raw_map.tsv:7027), [7028](../raw_map.tsv:7028), [7029](../raw_map.tsv:7029), [7035](../raw_map.tsv:7035), [7036](../raw_map.tsv:7036).


Issue tags: mixed_evidence

### rel_87__ent_492__ent_707

**All observed names:** Iraq → Tariq Aziz (4)

Ordered IDs: Ent[ent_492] → Ent[ent_707]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6987](../raw_map.tsv:6987) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [6988](../raw_map.tsv:6988) | Iraq | Tariq Aziz | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [6989](../raw_map.tsv:6989) | Iraq | Tariq Aziz | rcmod\|-&gt;rcmod-&gt;cross-&gt;prep-&gt;with-&gt;pobj-&gt;letter-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [6995](../raw_map.tsv:6995) | Iraq | Tariq Aziz | poss\|&lt;-poss&lt;-minister&lt;-appos&lt;-today-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Iraq → Tariq Aziz: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [6987](../raw_map.tsv:6987), [6988](../raw_map.tsv:6988), [6989](../raw_map.tsv:6989), [6995](../raw_map.tsv:6995).


Issue tags: mixed_evidence

### rel_87__ent_820__ent_941

**All observed names:** Israel → Yitzhak Rabin (4)

Ordered IDs: Ent[ent_820] → Ent[ent_941]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7057](../raw_map.tsv:7057) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7058](../raw_map.tsv:7058) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-response&lt;-pobj&lt;-of&lt;-prep&lt;-charge&lt;-pobj&lt;-in&lt;-prep&lt;-message-&gt;appos-&gt;\|appos |
| [7060](../raw_map.tsv:7060) | Israel | Yitzhak Rabin | rcmod\|-&gt;rcmod-&gt;see-&gt;prep-&gt;as-&gt;pobj-&gt;move-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |
| [7063](../raw_map.tsv:7063) | Israel | Yitzhak Rabin | poss\|&lt;-poss&lt;-service&lt;-nsubj&lt;-tighten-&gt;dobj-&gt;issue-&gt;appos-&gt;\|appos |

**Judgment: supported** (primary). Israel → Yitzhak Rabin: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7057](../raw_map.tsv:7057), [7058](../raw_map.tsv:7058), [7060](../raw_map.tsv:7060), [7063](../raw_map.tsv:7063).


Issue tags: mixed_evidence

### rel_87__ent_837__ent_1086

**All observed names:** Japan → Kiichi Miyazawa (4)

Ordered IDs: Ent[ent_837] → Ent[ent_1086]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7067](../raw_map.tsv:7067) | Japan | Kiichi Miyazawa | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7068](../raw_map.tsv:7068) | Japan | Kiichi Miyazawa | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-minister-&gt;appos-&gt;\|appos |
| [7074](../raw_map.tsv:7074) | Japan | Kiichi Miyazawa | poss\|&lt;-poss&lt;-economy&lt;-dobj&lt;-entrust-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7076](../raw_map.tsv:7076) | Japan | Kiichi Miyazawa | poss\|&lt;-poss&lt;-company-&gt;dobj-&gt;ten-&gt;prep-&gt;to-&gt;pobj-&gt;politician-&gt;prep-&gt;include-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Japan → Kiichi Miyazawa: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7067](../raw_map.tsv:7067), [7068](../raw_map.tsv:7068), [7074](../raw_map.tsv:7074), [7076](../raw_map.tsv:7076).


Issue tags: mixed_evidence

### rel_87__ent_820__ent_940

**All observed names:** Israel → Yitzhak Shamir (2)

Ordered IDs: Ent[ent_820] → Ent[ent_940]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7077](../raw_map.tsv:7077) | Israel | Yitzhak Shamir | poss\|&lt;-poss&lt;-minister-&gt;appos-&gt;\|appos |
| [7085](../raw_map.tsv:7085) | Israel | Yitzhak Shamir | poss\|&lt;-poss&lt;-roster-&gt;partmod-&gt;lead-&gt;prep-&gt;by-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Israel → Yitzhak Shamir: A direct country minister possessive/apposition establishes the named ministerial office, without assuming head-of-government status.

Cited evidence lines: [7077](../raw_map.tsv:7077), [7085](../raw_map.tsv:7085).


Issue tags: mixed_evidence
