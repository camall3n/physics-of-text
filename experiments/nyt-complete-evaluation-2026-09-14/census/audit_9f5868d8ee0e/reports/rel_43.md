# audit_9f5868d8ee0e — rel_43: organization based or located in

Predicate ID: located_in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

Complete census: 17 supported, 1 incorrect, 0 ambiguous; N=18. Precision 17/18=94.44% to 17/18=94.44%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 26 | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 21 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 15 | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 13 | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 9 | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 7 | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 7 | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 6 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 4 | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| 3 | appos\|-&gt;appos-&gt;giant-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | appos\|-&gt;appos-&gt;organization-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 3 | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| 3 | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;discounter-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;semiconductor-&gt;dep-&gt;\|dep |
| 2 | dep\|-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |
| 2 | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | nn\|&lt;-nn&lt;-spokesman-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-manager-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-center-&gt;nn-&gt;\|nn |
| 2 | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| 2 | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-research-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;suburb-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |
| 2 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;house-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;provider-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;research-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-conference-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-begin-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-learn&lt;-dep&lt;-sue-&gt;prep-&gt;in-&gt;pobj-&gt;court-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-manufacture-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-develop&lt;-rcmod&lt;-microprocessor-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-engineer-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;rcmod-&gt;try-&gt;prep-&gt;on-&gt;pobj-&gt;charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-worker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-make&lt;-rcmod&lt;-overture-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-announcement-&gt;rcmod-&gt;make-&gt;prep-&gt;after-&gt;pobj-&gt;meeting-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-board&lt;-nsubj&lt;-convene-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-center-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-city-&gt;appos-&gt;\|appos |
| 1 | poss\|&lt;-poss&lt;-city-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-headquarters&lt;-nsubjpass&lt;-situate-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-operation&lt;-pobj&lt;-of&lt;-prep&lt;-much&lt;-nsubjpass&lt;-transfer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-stock&lt;-nsubj&lt;-perform-&gt;prep-&gt;since-&gt;pobj-&gt;breakup-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;outside-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;fact-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;follow-&gt;prep-&gt;by-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;form-&gt;dobj-&gt;venture-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_43__ent_786__ent_305

**All observed names:** Apple → Cupertino (20)

Ordered IDs: Ent[ent_786] → Ent[ent_305]; 20 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [788](../raw_map.tsv:788) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [789](../raw_map.tsv:789) | Apple | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [790](../raw_map.tsv:790) | Apple | Cupertino | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [791](../raw_map.tsv:791) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [792](../raw_map.tsv:792) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [793](../raw_map.tsv:793) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [794](../raw_map.tsv:794) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [795](../raw_map.tsv:795) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [796](../raw_map.tsv:796) | Apple | Cupertino | poss\|&lt;-poss&lt;-research-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [797](../raw_map.tsv:797) | Apple | Cupertino | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4344](../raw_map.tsv:4344) | Apple | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4345](../raw_map.tsv:4345) | Apple | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4346](../raw_map.tsv:4346) | Apple | Cupertino | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4347](../raw_map.tsv:4347) | Apple | Cupertino | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4348](../raw_map.tsv:4348) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4349](../raw_map.tsv:4349) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4350](../raw_map.tsv:4350) | Apple | Cupertino | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [4351](../raw_map.tsv:4351) | Apple | Cupertino | nn\|&lt;-nn&lt;-headquarters&lt;-dobj&lt;-visit-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4352](../raw_map.tsv:4352) | Apple | Cupertino | poss\|&lt;-poss&lt;-research-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4353](../raw_map.tsv:4353) | Apple | Cupertino | poss\|&lt;-poss&lt;-office-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Apple → Cupertino: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [788](../raw_map.tsv:788), [789](../raw_map.tsv:789), [790](../raw_map.tsv:790), [791](../raw_map.tsv:791), [792](../raw_map.tsv:792), [793](../raw_map.tsv:793), [794](../raw_map.tsv:794), [795](../raw_map.tsv:795), [796](../raw_map.tsv:796), [797](../raw_map.tsv:797), [4344](../raw_map.tsv:4344), [4345](../raw_map.tsv:4345), [4346](../raw_map.tsv:4346), [4347](../raw_map.tsv:4347), [4348](../raw_map.tsv:4348), [4349](../raw_map.tsv:4349), [4350](../raw_map.tsv:4350), [4351](../raw_map.tsv:4351), [4352](../raw_map.tsv:4352), [4353](../raw_map.tsv:4353).




### rel_43__ent_547__ent_789

**All observed names:** I.B.M. → Armonk (20)

Ordered IDs: Ent[ent_547] → Ent[ent_789]; 20 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [798](../raw_map.tsv:798) | I.B.M. | Armonk | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [799](../raw_map.tsv:799) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [800](../raw_map.tsv:800) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [801](../raw_map.tsv:801) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [802](../raw_map.tsv:802) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [803](../raw_map.tsv:803) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| [804](../raw_map.tsv:804) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-spokesman-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [805](../raw_map.tsv:805) | I.B.M. | Armonk | dep\|-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |
| [806](../raw_map.tsv:806) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [807](../raw_map.tsv:807) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4394](../raw_map.tsv:4394) | I.B.M. | Armonk | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4395](../raw_map.tsv:4395) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4396](../raw_map.tsv:4396) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4397](../raw_map.tsv:4397) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4398](../raw_map.tsv:4398) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4399](../raw_map.tsv:4399) | I.B.M. | Armonk | poss\|&lt;-poss&lt;-headquarters-&gt;dep-&gt;\|dep |
| [4400](../raw_map.tsv:4400) | I.B.M. | Armonk | nn\|&lt;-nn&lt;-spokesman-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4401](../raw_map.tsv:4401) | I.B.M. | Armonk | dep\|-&gt;dep-&gt;say-&gt;nsubj-&gt;\|nsubj |
| [4402](../raw_map.tsv:4402) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;working-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4403](../raw_map.tsv:4403) | I.B.M. | Armonk | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). I.B.M. → Armonk: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [798](../raw_map.tsv:798), [799](../raw_map.tsv:799), [800](../raw_map.tsv:800), [801](../raw_map.tsv:801), [802](../raw_map.tsv:802), [803](../raw_map.tsv:803), [804](../raw_map.tsv:804), [805](../raw_map.tsv:805), [806](../raw_map.tsv:806), [807](../raw_map.tsv:807), [4394](../raw_map.tsv:4394), [4395](../raw_map.tsv:4395), [4396](../raw_map.tsv:4396), [4397](../raw_map.tsv:4397), [4398](../raw_map.tsv:4398), [4399](../raw_map.tsv:4399), [4400](../raw_map.tsv:4400), [4401](../raw_map.tsv:4401), [4402](../raw_map.tsv:4402), [4403](../raw_map.tsv:4403).


Issue tags: mixed_evidence

### rel_43__ent_302__ent_544

**All observed names:** Microsoft → Redmond (15)

Ordered IDs: Ent[ent_302] → Ent[ent_544]; 15 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [778](../raw_map.tsv:778) | Microsoft | Redmond | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [780](../raw_map.tsv:780) | Microsoft | Redmond | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [781](../raw_map.tsv:781) | Microsoft | Redmond | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [782](../raw_map.tsv:782) | Microsoft | Redmond | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [784](../raw_map.tsv:784) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-manager-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [786](../raw_map.tsv:786) | Microsoft | Redmond | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [787](../raw_map.tsv:787) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4334](../raw_map.tsv:4334) | Microsoft | Redmond | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4335](../raw_map.tsv:4335) | Microsoft | Redmond | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4336](../raw_map.tsv:4336) | Microsoft | Redmond | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4337](../raw_map.tsv:4337) | Microsoft | Redmond | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4338](../raw_map.tsv:4338) | Microsoft | Redmond | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4340](../raw_map.tsv:4340) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-manager-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4342](../raw_map.tsv:4342) | Microsoft | Redmond | poss\|&lt;-poss&lt;-campus-&gt;nn-&gt;\|nn |
| [4343](../raw_map.tsv:4343) | Microsoft | Redmond | pobj\|&lt;-pobj&lt;-at&lt;-prep&lt;-director-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Microsoft → Redmond: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [778](../raw_map.tsv:778), [780](../raw_map.tsv:780), [781](../raw_map.tsv:781), [782](../raw_map.tsv:782), [784](../raw_map.tsv:784), [786](../raw_map.tsv:786), [787](../raw_map.tsv:787), [4334](../raw_map.tsv:4334), [4335](../raw_map.tsv:4335), [4336](../raw_map.tsv:4336), [4337](../raw_map.tsv:4337), [4338](../raw_map.tsv:4338), [4340](../raw_map.tsv:4340), [4342](../raw_map.tsv:4342), [4343](../raw_map.tsv:4343).




### rel_43__ent_1000__ent_304

**All observed names:** Wal-Mart → Bentonville (15)

Ordered IDs: Ent[ent_1000] → Ent[ent_304]; 15 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [808](../raw_map.tsv:808) | Wal-Mart | Bentonville | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [809](../raw_map.tsv:809) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [810](../raw_map.tsv:810) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [811](../raw_map.tsv:811) | Wal-Mart | Bentonville | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [812](../raw_map.tsv:812) | Wal-Mart | Bentonville | appos\|-&gt;appos-&gt;discounter-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [813](../raw_map.tsv:813) | Wal-Mart | Bentonville | appos\|-&gt;appos-&gt;giant-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [815](../raw_map.tsv:815) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4354](../raw_map.tsv:4354) | Wal-Mart | Bentonville | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4355](../raw_map.tsv:4355) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4356](../raw_map.tsv:4356) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4357](../raw_map.tsv:4357) | Wal-Mart | Bentonville | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4358](../raw_map.tsv:4358) | Wal-Mart | Bentonville | appos\|-&gt;appos-&gt;discounter-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4359](../raw_map.tsv:4359) | Wal-Mart | Bentonville | appos\|-&gt;appos-&gt;giant-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4361](../raw_map.tsv:4361) | Wal-Mart | Bentonville | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4362](../raw_map.tsv:4362) | Wal-Mart | Bentonville | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Wal-Mart → Bentonville: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [808](../raw_map.tsv:808), [809](../raw_map.tsv:809), [810](../raw_map.tsv:810), [811](../raw_map.tsv:811), [812](../raw_map.tsv:812), [813](../raw_map.tsv:813), [815](../raw_map.tsv:815), [4354](../raw_map.tsv:4354), [4355](../raw_map.tsv:4355), [4356](../raw_map.tsv:4356), [4357](../raw_map.tsv:4357), [4358](../raw_map.tsv:4358), [4359](../raw_map.tsv:4359), [4361](../raw_map.tsv:4361), [4362](../raw_map.tsv:4362).




### rel_43__ent_545__ent_787

**All observed names:** Intel → Santa Clara (12)

Ordered IDs: Ent[ent_545] → Ent[ent_787]; 12 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [768](../raw_map.tsv:768) | Intel | Santa Clara | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [769](../raw_map.tsv:769) | Intel | Santa Clara | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [770](../raw_map.tsv:770) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [771](../raw_map.tsv:771) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [772](../raw_map.tsv:772) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-worker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [773](../raw_map.tsv:773) | Intel | Santa Clara | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [777](../raw_map.tsv:777) | Intel | Santa Clara | pobj\|&lt;-pobj&lt;-by&lt;-prep&lt;-develop&lt;-rcmod&lt;-microprocessor-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4318](../raw_map.tsv:4318) | Intel | Santa Clara | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4319](../raw_map.tsv:4319) | Intel | Santa Clara | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4320](../raw_map.tsv:4320) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4321](../raw_map.tsv:4321) | Intel | Santa Clara | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [4323](../raw_map.tsv:4323) | Intel | Santa Clara | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Intel → Santa Clara: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [768](../raw_map.tsv:768), [769](../raw_map.tsv:769), [770](../raw_map.tsv:770), [771](../raw_map.tsv:771), [772](../raw_map.tsv:772), [773](../raw_map.tsv:773), [777](../raw_map.tsv:777), [4318](../raw_map.tsv:4318), [4319](../raw_map.tsv:4319), [4320](../raw_map.tsv:4320), [4321](../raw_map.tsv:4321), [4323](../raw_map.tsv:4323).




### rel_43__ent_546__ent_788

**All observed names:** Motorola → Schaumburg (12)

Ordered IDs: Ent[ent_546] → Ent[ent_788]; 12 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [818](../raw_map.tsv:818) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [819](../raw_map.tsv:819) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [821](../raw_map.tsv:821) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;suburb-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [822](../raw_map.tsv:822) | Motorola | Schaumburg | poss\|&lt;-poss&lt;-center-&gt;nn-&gt;\|nn |
| [823](../raw_map.tsv:823) | Motorola | Schaumburg | pobj\|&lt;-pobj&lt;-for&lt;-prep&lt;-engineer-&gt;rcmod-&gt;live-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [824](../raw_map.tsv:824) | Motorola | Schaumburg | nsubj\|&lt;-nsubj&lt;-begin-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [827](../raw_map.tsv:827) | Motorola | Schaumburg | appos\|-&gt;appos-&gt;semiconductor-&gt;dep-&gt;\|dep |
| [4308](../raw_map.tsv:4308) | Motorola | Schaumburg | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4309](../raw_map.tsv:4309) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4311](../raw_map.tsv:4311) | Motorola | Schaumburg | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;suburb-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4312](../raw_map.tsv:4312) | Motorola | Schaumburg | poss\|&lt;-poss&lt;-center-&gt;nn-&gt;\|nn |
| [4317](../raw_map.tsv:4317) | Motorola | Schaumburg | appos\|-&gt;appos-&gt;semiconductor-&gt;dep-&gt;\|dep |

**Judgment: supported** (primary). Motorola → Schaumburg: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [818](../raw_map.tsv:818), [819](../raw_map.tsv:819), [821](../raw_map.tsv:821), [822](../raw_map.tsv:822), [823](../raw_map.tsv:823), [824](../raw_map.tsv:824), [827](../raw_map.tsv:827), [4308](../raw_map.tsv:4308), [4309](../raw_map.tsv:4309), [4311](../raw_map.tsv:4311), [4312](../raw_map.tsv:4312), [4317](../raw_map.tsv:4317).


Issue tags: mixed_evidence

### rel_43__ent_1001__ent_307

**All observed names:** Hewlett-Packard → Palo Alto (10)

Ordered IDs: Ent[ent_1001] → Ent[ent_307]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [828](../raw_map.tsv:828) | Hewlett-Packard | Palo Alto | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [829](../raw_map.tsv:829) | Hewlett-Packard | Palo Alto | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [830](../raw_map.tsv:830) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [831](../raw_map.tsv:831) | Hewlett-Packard | Palo Alto | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [832](../raw_map.tsv:832) | Hewlett-Packard | Palo Alto | nn\|&lt;-nn&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [833](../raw_map.tsv:833) | Hewlett-Packard | Palo Alto | appos\|-&gt;appos-&gt;giant-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [834](../raw_map.tsv:834) | Hewlett-Packard | Palo Alto | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [835](../raw_map.tsv:835) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-town-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [836](../raw_map.tsv:836) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-reputation&lt;-nsubjpass&lt;-build-&gt;dep-&gt;mention-&gt;dobj-&gt;founding-&gt;prep-&gt;in-&gt;pobj-&gt;garage-&gt;nn-&gt;\|nn |
| [837](../raw_map.tsv:837) | Hewlett-Packard | Palo Alto | poss\|&lt;-poss&lt;-center-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Hewlett-Packard → Palo Alto: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [828](../raw_map.tsv:828), [829](../raw_map.tsv:829), [830](../raw_map.tsv:830), [831](../raw_map.tsv:831), [832](../raw_map.tsv:832), [833](../raw_map.tsv:833), [834](../raw_map.tsv:834), [835](../raw_map.tsv:835), [836](../raw_map.tsv:836), [837](../raw_map.tsv:837).




### rel_43__ent_549__ent_1002

**All observed names:** MCI → Washington (10)

Ordered IDs: Ent[ent_549] → Ent[ent_1002]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [838](../raw_map.tsv:838) | MCI | Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [839](../raw_map.tsv:839) | MCI | Washington | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [840](../raw_map.tsv:840) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [841](../raw_map.tsv:841) | MCI | Washington | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [842](../raw_map.tsv:842) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters-&gt;nn-&gt;\|nn |
| [843](../raw_map.tsv:843) | MCI | Washington | prep\|-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [844](../raw_map.tsv:844) | MCI | Washington | poss\|&lt;-poss&lt;-headquarters&lt;-nsubjpass&lt;-situate-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [845](../raw_map.tsv:845) | MCI | Washington | poss\|&lt;-poss&lt;-board&lt;-nsubj&lt;-convene-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [846](../raw_map.tsv:846) | MCI | Washington | poss\|&lt;-poss&lt;-announcement-&gt;rcmod-&gt;make-&gt;prep-&gt;after-&gt;pobj-&gt;meeting-&gt;prep-&gt;at-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [847](../raw_map.tsv:847) | MCI | Washington | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). MCI → Washington: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [838](../raw_map.tsv:838), [839](../raw_map.tsv:839), [840](../raw_map.tsv:840), [841](../raw_map.tsv:841), [842](../raw_map.tsv:842), [843](../raw_map.tsv:843), [844](../raw_map.tsv:844), [845](../raw_map.tsv:845), [846](../raw_map.tsv:846), [847](../raw_map.tsv:847).




### rel_43__ent_548__ent_1003

**All observed names:** Johnson &amp; Johnson → New Brunswick (10)

Ordered IDs: Ent[ent_548] → Ent[ent_1003]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [851](../raw_map.tsv:851) | Johnson &amp; Johnson | New Brunswick | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [852](../raw_map.tsv:852) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [853](../raw_map.tsv:853) | Johnson &amp; Johnson | New Brunswick | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [854](../raw_map.tsv:854) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [858](../raw_map.tsv:858) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4384](../raw_map.tsv:4384) | Johnson &amp; Johnson | New Brunswick | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4385](../raw_map.tsv:4385) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4386](../raw_map.tsv:4386) | Johnson &amp; Johnson | New Brunswick | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4387](../raw_map.tsv:4387) | Johnson &amp; Johnson | New Brunswick | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4391](../raw_map.tsv:4391) | Johnson &amp; Johnson | New Brunswick | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Johnson & Johnson → New Brunswick: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [851](../raw_map.tsv:851), [852](../raw_map.tsv:852), [853](../raw_map.tsv:853), [854](../raw_map.tsv:854), [858](../raw_map.tsv:858), [4384](../raw_map.tsv:4384), [4385](../raw_map.tsv:4385), [4386](../raw_map.tsv:4386), [4387](../raw_map.tsv:4387), [4391](../raw_map.tsv:4391).




### rel_43__ent_412__ent_654

**All observed names:** Qwest → Denver (10)

Ordered IDs: Ent[ent_412] → Ent[ent_654]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4364](../raw_map.tsv:4364) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4365](../raw_map.tsv:4365) | Qwest | Denver | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4366](../raw_map.tsv:4366) | Qwest | Denver | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4367](../raw_map.tsv:4367) | Qwest | Denver | appos\|-&gt;appos-&gt;provider-&gt;amod-&gt;\|amod |
| [4368](../raw_map.tsv:4368) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;have-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4369](../raw_map.tsv:4369) | Qwest | Denver | rcmod\|-&gt;rcmod-&gt;fact-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4370](../raw_map.tsv:4370) | Qwest | Denver | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4371](../raw_map.tsv:4371) | Qwest | Denver | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-make&lt;-rcmod&lt;-overture-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4372](../raw_map.tsv:4372) | Qwest | Denver | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;rcmod-&gt;try-&gt;prep-&gt;on-&gt;pobj-&gt;charge-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4373](../raw_map.tsv:4373) | Qwest | Denver | pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-executive-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Qwest → Denver: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [4364](../raw_map.tsv:4364), [4365](../raw_map.tsv:4365), [4366](../raw_map.tsv:4366), [4367](../raw_map.tsv:4367), [4368](../raw_map.tsv:4368), [4369](../raw_map.tsv:4369), [4370](../raw_map.tsv:4370), [4371](../raw_map.tsv:4371), [4372](../raw_map.tsv:4372), [4373](../raw_map.tsv:4373).


Issue tags: mixed_evidence

### rel_43__ent_896__ent_415

**All observed names:** Monsanto → St. Louis (10)

Ordered IDs: Ent[ent_896] → Ent[ent_415]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4374](../raw_map.tsv:4374) | Monsanto | St. Louis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4375](../raw_map.tsv:4375) | Monsanto | St. Louis | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4376](../raw_map.tsv:4376) | Monsanto | St. Louis | poss\|&lt;-poss&lt;-headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4377](../raw_map.tsv:4377) | Monsanto | St. Louis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;outside-&gt;pobj-&gt;\|pobj |
| [4378](../raw_map.tsv:4378) | Monsanto | St. Louis | poss\|&lt;-poss&lt;-operation&lt;-pobj&lt;-of&lt;-prep&lt;-much&lt;-nsubjpass&lt;-transfer-&gt;prep-&gt;from-&gt;pobj-&gt;\|pobj |
| [4379](../raw_map.tsv:4379) | Monsanto | St. Louis | poss\|&lt;-poss&lt;-city-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4380](../raw_map.tsv:4380) | Monsanto | St. Louis | poss\|&lt;-poss&lt;-city-&gt;appos-&gt;\|appos |
| [4381](../raw_map.tsv:4381) | Monsanto | St. Louis | poss\|&lt;-poss&lt;-campus-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4382](../raw_map.tsv:4382) | Monsanto | St. Louis | nsubj\|&lt;-nsubj&lt;-manufacture-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4383](../raw_map.tsv:4383) | Monsanto | St. Louis | nsubj\|&lt;-nsubj&lt;-learn&lt;-dep&lt;-sue-&gt;prep-&gt;in-&gt;pobj-&gt;court-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Monsanto → St. Louis: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [4374](../raw_map.tsv:4374), [4375](../raw_map.tsv:4375), [4376](../raw_map.tsv:4376), [4377](../raw_map.tsv:4377), [4378](../raw_map.tsv:4378), [4379](../raw_map.tsv:4379), [4380](../raw_map.tsv:4380), [4381](../raw_map.tsv:4381), [4382](../raw_map.tsv:4382), [4383](../raw_map.tsv:4383).


Issue tags: mixed_evidence

### rel_43__ent_1148__ent_460

**All observed names:** NPD Group → Port Washington (7)

Ordered IDs: Ent[ent_1148] → Ent[ent_460]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5776](../raw_map.tsv:5776) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5780](../raw_map.tsv:5780) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5782](../raw_map.tsv:5782) | NPD Group | Port Washington | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |
| [7140](../raw_map.tsv:7140) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7142](../raw_map.tsv:7142) | NPD Group | Port Washington | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7144](../raw_map.tsv:7144) | NPD Group | Port Washington | appos\|-&gt;appos-&gt;company-&gt;prep-&gt;with-&gt;pobj-&gt;headquarters-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7146](../raw_map.tsv:7146) | NPD Group | Port Washington | rcmod\|-&gt;rcmod-&gt;be-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). NPD Group → Port Washington: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [5776](../raw_map.tsv:5776), [5780](../raw_map.tsv:5780), [5782](../raw_map.tsv:5782), [7140](../raw_map.tsv:7140), [7142](../raw_map.tsv:7142), [7144](../raw_map.tsv:7144), [7146](../raw_map.tsv:7146).




### rel_43__ent_461__ent_222

**All observed names:** Dataquest → San Jose (7)

Ordered IDs: Ent[ent_461] → Ent[ent_222]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5808](../raw_map.tsv:5808) | Dataquest | San Jose | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5809](../raw_map.tsv:5809) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5810](../raw_map.tsv:5810) | Dataquest | San Jose | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5812](../raw_map.tsv:5812) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7102](../raw_map.tsv:7102) | Dataquest | San Jose | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7103](../raw_map.tsv:7103) | Dataquest | San Jose | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7106](../raw_map.tsv:7106) | Dataquest | San Jose | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Dataquest → San Jose: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [5808](../raw_map.tsv:5808), [5809](../raw_map.tsv:5809), [5810](../raw_map.tsv:5810), [5812](../raw_map.tsv:5812), [7102](../raw_map.tsv:7102), [7103](../raw_map.tsv:7103), [7106](../raw_map.tsv:7106).




### rel_43__ent_464__ent_221

**All observed names:** International Data Corporation → Framingham (7)

Ordered IDs: Ent[ent_464] → Ent[ent_221]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [5817](../raw_map.tsv:5817) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5819](../raw_map.tsv:5819) | International Data Corporation | Framingham | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [5820](../raw_map.tsv:5820) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;organization-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7151](../raw_map.tsv:7151) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7153](../raw_map.tsv:7153) | International Data Corporation | Framingham | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7154](../raw_map.tsv:7154) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;organization-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7155](../raw_map.tsv:7155) | International Data Corporation | Framingham | appos\|-&gt;appos-&gt;house-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). International Data Corporation → Framingham: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [5817](../raw_map.tsv:5817), [5819](../raw_map.tsv:5819), [5820](../raw_map.tsv:5820), [7151](../raw_map.tsv:7151), [7153](../raw_map.tsv:7153), [7154](../raw_map.tsv:7154), [7155](../raw_map.tsv:7155).




### rel_43__ent_655__ent_897

**All observed names:** Guidant → Indianapolis (6)

Ordered IDs: Ent[ent_655] → Ent[ent_897]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4328](../raw_map.tsv:4328) | Guidant | Indianapolis | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4329](../raw_map.tsv:4329) | Guidant | Indianapolis | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4330](../raw_map.tsv:4330) | Guidant | Indianapolis | nsubjpass\|&lt;-nsubjpass&lt;-base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4331](../raw_map.tsv:4331) | Guidant | Indianapolis | pobj\|&lt;-pobj&lt;-against&lt;-prep&lt;-file-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4332](../raw_map.tsv:4332) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;maker-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [4333](../raw_map.tsv:4333) | Guidant | Indianapolis | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Guidant → Indianapolis: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [4328](../raw_map.tsv:4328), [4329](../raw_map.tsv:4329), [4330](../raw_map.tsv:4330), [4331](../raw_map.tsv:4331), [4332](../raw_map.tsv:4332), [4333](../raw_map.tsv:4333).


Issue tags: mixed_evidence

### rel_43__ent_942__ent_843

**All observed names:** Jupiter Communications → New York (4)

Ordered IDs: Ent[ent_942] → Ent[ent_843]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7168](../raw_map.tsv:7168) | Jupiter Communications | New York | appos\|-&gt;appos-&gt;research-&gt;nn-&gt;\|nn |
| [7170](../raw_map.tsv:7170) | Jupiter Communications | New York | appos\|-&gt;appos-&gt;company-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7172](../raw_map.tsv:7172) | Jupiter Communications | New York | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7173](../raw_map.tsv:7173) | Jupiter Communications | New York | nn\|&lt;-nn&lt;-conference-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Jupiter Communications → New York: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [7168](../raw_map.tsv:7168), [7170](../raw_map.tsv:7170), [7172](../raw_map.tsv:7172), [7173](../raw_map.tsv:7173).


Issue tags: mixed_evidence

### rel_43__ent_306__ent_305

**All observed names:** Semiconductor Industry Association → Cupertino (3)

Ordered IDs: Ent[ent_306] → Ent[ent_305]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [848](../raw_map.tsv:848) | Semiconductor Industry Association | Cupertino | partmod\|-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [849](../raw_map.tsv:849) | Semiconductor Industry Association | Cupertino | rcmod\|-&gt;rcmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [850](../raw_map.tsv:850) | Semiconductor Industry Association | Cupertino | appos\|-&gt;appos-&gt;organization-&gt;partmod-&gt;base-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Semiconductor Industry Association → Cupertino: An explicit base, headquarters, or campus row places this organization in the named location.

Cited evidence lines: [848](../raw_map.tsv:848), [849](../raw_map.tsv:849), [850](../raw_map.tsv:850).




### rel_43__ent_950__ent_931

**All observed names:** Pacific Telesis → Bell (3)

Ordered IDs: Ent[ent_950] → Ent[ent_931]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6879](../raw_map.tsv:6879) | Pacific Telesis | Bell | rcmod\|-&gt;rcmod-&gt;form-&gt;dobj-&gt;venture-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [6880](../raw_map.tsv:6880) | Pacific Telesis | Bell | rcmod\|-&gt;rcmod-&gt;follow-&gt;prep-&gt;by-&gt;pobj-&gt;company-&gt;nn-&gt;\|nn |
| [6882](../raw_map.tsv:6882) | Pacific Telesis | Bell | poss\|&lt;-poss&lt;-stock&lt;-nsubj&lt;-perform-&gt;prep-&gt;since-&gt;pobj-&gt;breakup-&gt;nn-&gt;\|nn |

**Judgment: incorrect** (primary). Pacific Telesis → Bell: The venture, corporate-family and breakup references identify a corporate relationship, not a geographical location.

Cited evidence lines: [6879](../raw_map.tsv:6879), [6880](../raw_map.tsv:6880), [6882](../raw_map.tsv:6882).


Issue tags: wrong_predicate
