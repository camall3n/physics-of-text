# Complete census: audit_06dbdb9b03af

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**384/384 facts evaluated.** 344 supported, 17 incorrect, 23 ambiguous. Exact census precision is **344/384 = 89.58%** with ambiguity counted incorrect, or **367/384 = 95.57%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 95.29%; decided coverage: 94.01%. Macro precision (equal relation weights): 88.99%–96.11%.

Top-relation row coverage: 1824/8516; coverage is not recall. Total expressed relations/facts in the saved world: 398/1929. Human overrides used: 0.

| Rank | Full dictionary, every fact and evaluation | Predicate ID | S | E | A | N | Precision endpoints |
|---:|---|---|---:|---:|---:|---:|---|
| 1 | [defeated opponent (rel_114)](reports/rel_114.md) | defeated | 22 | 4 | 1 | 27 | 81.48%–85.19% |
| 2 | [analyst at organization (rel_91)](reports/rel_91.md) | analyst_for | 30 | 2 | 1 | 33 | 90.91%–93.94% |
| 3 | [defeated opponent (rel_343)](reports/rel_343.md) | defeated | 19 | 1 | 2 | 22 | 86.36%–95.45% |
| 4 | [coach of (rel_396)](reports/rel_396.md) | coach_of | 22 | 1 | 0 | 23 | 95.65%–95.65% |
| 5 | [president or manager of (rel_332)](reports/rel_332.md) | president_or_manager_of | 26 | 2 | 0 | 28 | 92.86%–92.86% |
| 6 | [president or manager of (rel_126)](reports/rel_126.md) | president_or_manager_of | 21 | 2 | 2 | 25 | 84.00%–92.00% |
| 7 | [managerial or leadership office in (rel_326)](reports/rel_326.md) | managerial_office_in | 18 | 2 | 1 | 21 | 85.71%–90.48% |
| 8 | [leader or organizational head of (rel_58)](reports/rel_58.md) | organizational_leader_of | 17 | 0 | 1 | 18 | 94.44%–100.00% |
| 9 | [winner or champion of (rel_29)](reports/rel_29.md) | winner_of | 18 | 0 | 0 | 18 | 100.00%–100.00% |
| 10 | [subsidiary or organizational unit of (rel_9)](reports/rel_9.md) | subsidiary_of | 16 | 0 | 0 | 16 | 100.00%–100.00% |
| 11 | [subsidiary or organizational unit of (rel_282)](reports/rel_282.md) | subsidiary_of | 16 | 0 | 1 | 17 | 94.12%–100.00% |
| 12 | [owns organization or asset (rel_8)](reports/rel_8.md) | owns | 14 | 0 | 0 | 14 | 100.00%–100.00% |
| 13 | [spokesperson for (rel_31)](reports/rel_31.md) | spokesperson_for | 20 | 0 | 0 | 20 | 100.00%–100.00% |
| 14 | [managerial or leadership office in (rel_127)](reports/rel_127.md) | managerial_office_in | 2 | 1 | 9 | 12 | 16.67%–91.67% |
| 15 | [managerial or leadership office in (rel_290)](reports/rel_290.md) | managerial_office_in | 22 | 0 | 3 | 25 | 88.00%–100.00% |
| 16 | [directed communication to (rel_251)](reports/rel_251.md) | communicates_to | 14 | 1 | 0 | 15 | 93.33%–93.33% |
| 17 | [managerial or leadership office in (rel_260)](reports/rel_260.md) | managerial_office_in | 15 | 0 | 0 | 15 | 100.00%–100.00% |
| 18 | [has spokesperson (rel_159)](reports/rel_159.md) | has_spokesperson | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 19 | [professor or university teacher at (rel_99)](reports/rel_99.md) | professor_at | 11 | 1 | 0 | 12 | 91.67%–91.67% |
| 20 | [organization based or located in (rel_347)](reports/rel_347.md) | located_in | 11 | 0 | 2 | 13 | 84.62%–100.00% |

## Questions for human review

- [rel_114__ent_646__ent_237](reports/rel_114.md#rel_114__ent_646__ent_237): Does David/Goliath name the actual intended figures or metaphorically describe other competitors?
- [rel_91__ent_791__ent_310](reports/rel_91.md#rel_91__ent_791__ent_310): Does the full Sullivan sentence establish professional analysis for Witter Reynolds, or only a president title and a separately attached economist?
- [rel_343__ent_1159__ent_471](reports/rel_343.md#rel_343__ent_1159__ent_471): Which teams or bodies do East and West refer to?
- [rel_343__ent_1004__ent_843](reports/rel_343.md#rel_343__ent_1004__ent_843): Which opposing team does New York designate in this fact?
- [rel_126__ent_1028__ent_175](reports/rel_126.md#rel_126__ent_1028__ent_175): What campaign or institution is managed, and what precise manager office does the person-to-person path denote?
- [rel_126__ent_17__ent_827](reports/rel_126.md#rel_126__ent_17__ent_827): What campaign or institution is managed, and what precise manager office does the person-to-person path denote?
- [rel_326__ent_263__ent_244](reports/rel_326.md#rel_326__ent_263__ent_244): Which Republican individual holds this office?
- [rel_58__ent_264__ent_36](reports/rel_58.md#rel_58__ent_264__ent_36): What complete political organization is intended?
- [rel_282__ent_843__ent_422](reports/rel_282.md#rel_282__ent_843__ent_422): Does New York refer to an organizational office of Hill, and what organization does Hill name here?
- [rel_127__ent_7__ent_243](reports/rel_127.md#rel_127__ent_7__ent_243): Which individual officeholder is intended?
- [rel_127__ent_7__ent_488](reports/rel_127.md#rel_127__ent_7__ent_488): Which individual officeholder is intended?
- [rel_127__ent_263__ent_244](reports/rel_127.md#rel_127__ent_263__ent_244): Which individual officeholder is intended?
- [rel_127__ent_263__ent_486](reports/rel_127.md#rel_127__ent_263__ent_486): Which individual officeholder is intended?
- [rel_127__ent_263__ent_1170](reports/rel_127.md#rel_127__ent_263__ent_1170): Which individual officeholder is intended?
- [rel_127__ent_7__ent_485](reports/rel_127.md#rel_127__ent_7__ent_485): Which individual officeholder is intended?
- [rel_127__ent_263__ent_1171](reports/rel_127.md#rel_127__ent_263__ent_1171): Which individual officeholder is intended?
- [rel_127__ent_263__ent_1172](reports/rel_127.md#rel_127__ent_263__ent_1172): Which individual officeholder is intended?
- [rel_127__ent_263__ent_245](reports/rel_127.md#rel_127__ent_263__ent_245): Which individual officeholder is intended?
- [rel_290__ent_176__ent_175](reports/rel_290.md#rel_290__ent_176__ent_175): Which institution or campaign employs the director?
- [rel_290__ent_291__ent_182](reports/rel_290.md#rel_290__ent_291__ent_182): Which institution or campaign employs the director?
- [rel_290__ent_363__ent_120](reports/rel_290.md#rel_290__ent_363__ent_120): What full institution is intended?
- [rel_347__ent_1089__ent_953](reports/rel_347.md#rel_347__ent_1089__ent_953): Does Wall Street denote an actual office location here rather than the financial sector?
- [rel_347__ent_293__ent_10](reports/rel_347.md#rel_347__ent_293__ent_10): Should German be resolved to Germany as the actual location in the original sentence?
