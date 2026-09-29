# Complete census: audit_9c88162c7b22

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**364/364 facts evaluated.** 311 supported, 26 incorrect, 27 ambiguous. Exact census precision is **311/364 = 85.44%** with ambiguity counted incorrect, or **338/364 = 92.86%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 92.28%; decided coverage: 92.58%. Macro precision (equal relation weights): 83.90%–92.53%.

Top-relation row coverage: 1583/8516; coverage is not recall. Total expressed relations/facts in the saved world: 400/1942. Human overrides used: 0.

| Rank | Full dictionary, every fact and evaluation | Predicate ID | S | E | A | N | Precision endpoints |
|---:|---|---|---:|---:|---:|---:|---|
| 1 | [defeated opponent (rel_283)](reports/rel_283.md) | defeated | 18 | 2 | 0 | 20 | 90.00%–90.00% |
| 2 | [subsidiary or organizational unit of (rel_167)](reports/rel_167.md) | subsidiary_of | 19 | 0 | 0 | 19 | 100.00%–100.00% |
| 3 | [analyst at organization (rel_11)](reports/rel_11.md) | analyst_for | 24 | 1 | 0 | 25 | 96.00%–96.00% |
| 4 | [defeated opponent (rel_388)](reports/rel_388.md) | defeated | 19 | 2 | 0 | 21 | 90.48%–90.48% |
| 5 | [president or manager of (rel_257)](reports/rel_257.md) | president_or_manager_of | 22 | 0 | 0 | 22 | 100.00%–100.00% |
| 6 | [managerial or leadership office in (rel_278)](reports/rel_278.md) | managerial_office_in | 15 | 0 | 4 | 19 | 78.95%–100.00% |
| 7 | [spokesperson for (rel_94)](reports/rel_94.md) | spokesperson_for | 22 | 0 | 1 | 23 | 95.65%–100.00% |
| 8 | [president or manager of (rel_22)](reports/rel_22.md) | president_or_manager_of | 18 | 1 | 2 | 21 | 85.71%–95.24% |
| 9 | [managerial or leadership office in (rel_138)](reports/rel_138.md) | managerial_office_in | 14 | 0 | 2 | 16 | 87.50%–100.00% |
| 10 | [organization based or located in (rel_259)](reports/rel_259.md) | located_in | 13 | 5 | 1 | 19 | 68.42%–73.68% |
| 11 | [managerial or leadership office in (rel_322)](reports/rel_322.md) | managerial_office_in | 20 | 0 | 2 | 22 | 90.91%–100.00% |
| 12 | [coach of (rel_39)](reports/rel_39.md) | coach_of | 17 | 3 | 0 | 20 | 85.00%–85.00% |
| 13 | [geographical part of (rel_194)](reports/rel_194.md) | geographic_part_of | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 14 | [leader or organizational head of (rel_102)](reports/rel_102.md) | organizational_leader_of | 14 | 2 | 3 | 19 | 73.68%–89.47% |
| 15 | [managerial or leadership office in (rel_128)](reports/rel_128.md) | managerial_office_in | 17 | 0 | 0 | 17 | 100.00%–100.00% |
| 16 | [winner or champion of (rel_186)](reports/rel_186.md) | winner_of | 12 | 2 | 0 | 14 | 85.71%–85.71% |
| 17 | [managerial or leadership office in (rel_61)](reports/rel_61.md) | managerial_office_in | 2 | 1 | 9 | 12 | 16.67%–91.67% |
| 18 | [athlete plays for team (rel_80)](reports/rel_80.md) | athlete_for | 7 | 6 | 2 | 15 | 46.67%–60.00% |
| 19 | [defeated opponent (rel_193)](reports/rel_193.md) | defeated | 13 | 1 | 1 | 15 | 86.67%–93.33% |
| 20 | [managerial or leadership office in (rel_196)](reports/rel_196.md) | managerial_office_in | 15 | 0 | 0 | 15 | 100.00%–100.00% |

## Questions for human review

- [rel_278__ent_67__ent_69](reports/rel_278.md#rel_278__ent_67__ent_69): What complete political body or people group is intended?
- [rel_278__ent_4__ent_35](reports/rel_278.md#rel_278__ent_4__ent_35): What complete political body or people group is intended?
- [rel_278__ent_255__ent_497](reports/rel_278.md#rel_278__ent_255__ent_497): What complete political body or people group is intended?
- [rel_278__ent_911__ent_1002](reports/rel_278.md#rel_278__ent_911__ent_1002): Which organization is intended?
- [rel_94__ent_1002__ent_536](reports/rel_94.md#rel_94__ent_1002__ent_536): Which person, if any, does Washington denote in the State Department spokesperson row?
- [rel_22__ent_1028__ent_175](reports/rel_22.md#rel_22__ent_1028__ent_175): What campaign or institution is managed, and what exact manager office does this person-to-person path denote?
- [rel_22__ent_17__ent_827](reports/rel_22.md#rel_22__ent_17__ent_827): What campaign or institution is managed, and what exact manager office does this person-to-person path denote?
- [rel_138__ent_490__ent_51](reports/rel_138.md#rel_138__ent_490__ent_51): What full institution does Taxi denote?
- [rel_138__ent_263__ent_1172](reports/rel_138.md#rel_138__ent_263__ent_1172): Which Republican person is intended?
- [rel_259__ent_1089__ent_953](reports/rel_259.md#rel_259__ent_1089__ent_953): Does Wall Street indicate the firms physical location here, or only its financial-market industry?
- [rel_322__ent_12__ent_15](reports/rel_322.md#rel_322__ent_12__ent_15): What complete institution does the truncated argument denote?
- [rel_322__ent_363__ent_120](reports/rel_322.md#rel_322__ent_363__ent_120): What complete institution does the truncated argument denote?
- [rel_102__ent_67__ent_69](reports/rel_102.md#rel_102__ent_67__ent_69): What complete political body or people group is intended?
- [rel_102__ent_34__ent_37](reports/rel_102.md#rel_102__ent_34__ent_37): What complete political body or people group is intended?
- [rel_102__ent_264__ent_36](reports/rel_102.md#rel_102__ent_264__ent_36): What complete political body or people group is intended?
- [rel_61__ent_263__ent_1170](reports/rel_61.md#rel_61__ent_263__ent_1170): Which individual officeholder is intended?
- [rel_61__ent_263__ent_245](reports/rel_61.md#rel_61__ent_263__ent_245): Which individual officeholder is intended?
- [rel_61__ent_263__ent_1172](reports/rel_61.md#rel_61__ent_263__ent_1172): Which individual officeholder is intended?
- [rel_61__ent_263__ent_244](reports/rel_61.md#rel_61__ent_263__ent_244): Which individual officeholder is intended?
- [rel_61__ent_263__ent_486](reports/rel_61.md#rel_61__ent_263__ent_486): Which individual officeholder is intended?
- [rel_61__ent_7__ent_243](reports/rel_61.md#rel_61__ent_7__ent_243): Which individual officeholder is intended?
- [rel_61__ent_7__ent_485](reports/rel_61.md#rel_61__ent_7__ent_485): Which individual officeholder is intended?
- [rel_61__ent_263__ent_1171](reports/rel_61.md#rel_61__ent_263__ent_1171): Which individual officeholder is intended?
- [rel_61__ent_7__ent_488](reports/rel_61.md#rel_61__ent_7__ent_488): Which individual officeholder is intended?
- [rel_80__ent_356__ent_308](reports/rel_80.md#rel_80__ent_356__ent_308): Does the original context establish that this person is playing for the team, rather than coaching or managing it?
- [rel_80__ent_413__ent_110](reports/rel_80.md#rel_80__ent_413__ent_110): Does the original context establish that this person is playing for the team, rather than coaching or managing it?
- [rel_193__ent_1159__ent_471](reports/rel_193.md#rel_193__ent_1159__ent_471): Which teams or bodies do East and West designate?
