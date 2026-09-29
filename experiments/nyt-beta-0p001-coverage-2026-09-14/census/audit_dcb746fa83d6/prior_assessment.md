# Complete census: audit_dcb746fa83d6

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**421/421 facts evaluated.** 337 supported, 48 incorrect, 36 ambiguous. Exact census precision is **337/421 = 80.05%** with ambiguity counted incorrect, or **373/421 = 88.60%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 87.53%; decided coverage: 91.45%. Macro precision (equal relation weights): 79.86%–89.34%.

Top-relation row coverage: 1546/8516; coverage is not recall. Total expressed relations/facts in the saved world: 399/2773. Human overrides used: 0.

| Rank | Full dictionary, every fact and evaluation | Predicate ID | S | E | A | N | Precision endpoints |
|---:|---|---|---:|---:|---:|---:|---|
| 1 | [subsidiary or organizational unit of (rel_250)](reports/rel_250.md) | subsidiary_of | 31 | 0 | 2 | 33 | 93.94%–100.00% |
| 2 | [analyst at organization (rel_342)](reports/rel_342.md) | analyst_for | 19 | 1 | 3 | 23 | 82.61%–95.65% |
| 3 | [coach of (rel_21)](reports/rel_21.md) | coach_of | 20 | 1 | 0 | 21 | 95.24%–95.24% |
| 4 | [defeated opponent (rel_114)](reports/rel_114.md) | defeated | 22 | 9 | 0 | 31 | 70.97%–70.97% |
| 5 | [director of organization (rel_263)](reports/rel_263.md) | director_of | 26 | 3 | 1 | 30 | 86.67%–90.00% |
| 6 | [chairperson of (rel_205)](reports/rel_205.md) | chairperson_of | 18 | 3 | 0 | 21 | 85.71%–85.71% |
| 7 | [directed communication to (rel_390)](reports/rel_390.md) | communicates_to | 21 | 1 | 1 | 23 | 91.30%–95.65% |
| 8 | [chairs or heads organization (rel_242)](reports/rel_242.md) | chairs_or_heads | 4 | 2 | 9 | 15 | 26.67%–86.67% |
| 9 | [subsidiary or organizational unit of (rel_170)](reports/rel_170.md) | subsidiary_of | 14 | 2 | 1 | 17 | 82.35%–88.24% |
| 10 | [economist at organization (rel_269)](reports/rel_269.md) | economist_for | 14 | 5 | 1 | 20 | 70.00%–75.00% |
| 11 | [winner or champion of (rel_112)](reports/rel_112.md) | winner_of | 17 | 4 | 0 | 21 | 80.95%–80.95% |
| 12 | [director of organization (rel_383)](reports/rel_383.md) | director_of | 17 | 3 | 5 | 25 | 68.00%–88.00% |
| 13 | [executive of (rel_382)](reports/rel_382.md) | executive_of | 13 | 0 | 0 | 13 | 100.00%–100.00% |
| 14 | [managerial or leadership office in (rel_83)](reports/rel_83.md) | managerial_office_in | 18 | 0 | 1 | 19 | 94.74%–100.00% |
| 15 | [president or manager of (rel_186)](reports/rel_186.md) | president_or_manager_of | 17 | 4 | 0 | 21 | 80.95%–80.95% |
| 16 | [leader or organizational head of (rel_274)](reports/rel_274.md) | organizational_leader_of | 14 | 0 | 5 | 19 | 73.68%–100.00% |
| 17 | [winner or champion of (rel_98)](reports/rel_98.md) | winner_of | 13 | 8 | 2 | 23 | 56.52%–65.22% |
| 18 | [defeated opponent (rel_216)](reports/rel_216.md) | defeated | 14 | 1 | 3 | 18 | 77.78%–94.44% |
| 19 | [geographical part of (rel_223)](reports/rel_223.md) | geographic_part_of | 10 | 0 | 1 | 11 | 90.91%–100.00% |
| 20 | [owns organization or asset (rel_312)](reports/rel_312.md) | owns | 15 | 1 | 1 | 17 | 88.24%–94.12% |

## Questions for human review

- [rel_250__ent_407__ent_1210](reports/rel_250.md#rel_250__ent_407__ent_1210): Which organizational office does the city name stand for in the part-of statement?
- [rel_250__ent_843__ent_1321](reports/rel_250.md#rel_250__ent_843__ent_1321): Which organizational office does the city name stand for in the part-of statement?
- [rel_342__ent_736__ent_783](reports/rel_342.md#rel_342__ent_736__ent_783): Which of Wolzien, Abramowitz or Black does the first entity denote?
- [rel_342__ent_1330__ent_1180](reports/rel_342.md#rel_342__ent_1330__ent_1180): Does the employer entity denote Paine Webber or Merrill Lynch, or should these facts be separated?
- [rel_342__ent_1181__ent_777](reports/rel_342.md#rel_342__ent_1181__ent_777): Which person/employer pair is intended, Thompson/Lexington or Sweig/Southeast?
- [rel_263__ent_911__ent_1002](reports/rel_263.md#rel_263__ent_911__ent_1002): Which organization is intended by the Washington director expression?
- [rel_390__ent_1408__ent_520](reports/rel_390.md#rel_390__ent_1408__ent_520): Was the item sent to Jordan a message, and does fuller context establish him as addressee rather than only the person discussed with the president?
- [rel_242__ent_7__ent_243](reports/rel_242.md#rel_242__ent_7__ent_243): Which individual officeholder is represented?
- [rel_242__ent_263__ent_244](reports/rel_242.md#rel_242__ent_263__ent_244): Which individual officeholder is represented?
- [rel_242__ent_263__ent_486](reports/rel_242.md#rel_242__ent_263__ent_486): Which individual officeholder is represented?
- [rel_242__ent_7__ent_485](reports/rel_242.md#rel_242__ent_7__ent_485): Which individual officeholder is represented?
- [rel_242__ent_7__ent_488](reports/rel_242.md#rel_242__ent_7__ent_488): Which individual officeholder is represented?
- [rel_242__ent_263__ent_1172](reports/rel_242.md#rel_242__ent_263__ent_1172): Which individual officeholder is represented?
- [rel_242__ent_263__ent_1171](reports/rel_242.md#rel_242__ent_263__ent_1171): Which individual officeholder is represented?
- [rel_242__ent_263__ent_1170](reports/rel_242.md#rel_242__ent_263__ent_1170): Which individual officeholder is represented?
- [rel_242__ent_263__ent_1214](reports/rel_242.md#rel_242__ent_263__ent_1214): Which individual officeholder is represented?
- [rel_170__ent_921__ent_1066](reports/rel_170.md#rel_170__ent_921__ent_1066): Does the Hughes executive-at row refer to a person or reflect an extraction error, rather than the subsidiary named in the other rows?
- [rel_269__ent_791__ent_852](reports/rel_269.md#rel_269__ent_791__ent_852): Does the complete sentence identify Sullivan as the Witter Reynolds economist, or does the economist apposition describe another referent?
- [rel_383__ent_12__ent_15](reports/rel_383.md#rel_383__ent_12__ent_15): What complete institution does this truncated argument denote?
- [rel_383__ent_348__ent_1045](reports/rel_383.md#rel_383__ent_348__ent_1045): What complete institution does this truncated argument denote?
- [rel_383__ent_915__ent_1046](reports/rel_383.md#rel_383__ent_915__ent_1046): What complete institution does this truncated argument denote?
- [rel_383__ent_1109__ent_672](reports/rel_383.md#rel_383__ent_1109__ent_672): What complete institution does this truncated argument denote?
- [rel_383__ent_291__ent_182](reports/rel_383.md#rel_383__ent_291__ent_182): Which institution or campaign is intended?
- [rel_83__ent_490__ent_51](reports/rel_83.md#rel_83__ent_490__ent_51): Which taxi-related institution is intended?
- [rel_274__ent_1224__ent_69](reports/rel_274.md#rel_274__ent_1224__ent_69): What complete political body or people group does the argument denote?
- [rel_274__ent_255__ent_497](reports/rel_274.md#rel_274__ent_255__ent_497): What complete political body or people group does the argument denote?
- [rel_274__ent_34__ent_37](reports/rel_274.md#rel_274__ent_34__ent_37): What complete political body or people group does the argument denote?
- [rel_274__ent_1406__ent_1401](reports/rel_274.md#rel_274__ent_1406__ent_1401): Which person does the inferred subject represent?
- [rel_274__ent_1337__ent_35](reports/rel_274.md#rel_274__ent_1337__ent_35): What complete political body or people group does the argument denote?
- [rel_98__ent_409__ent_1420](reports/rel_98.md#rel_98__ent_409__ent_1420): Which team is intended by this latent fact, and should Yankees and Marlins be split?
- [rel_98__ent_726__ent_607](reports/rel_98.md#rel_98__ent_726__ent_607): Which named golfer does Scot denote in the original sentence?
- [rel_216__ent_1310__ent_254](reports/rel_216.md#rel_216__ent_1310__ent_254): Do East and West identify the competing teams in these rows or geopolitical regions, and should their uses be separated?
- [rel_216__ent_1236__ent_647](reports/rel_216.md#rel_216__ent_1236__ent_647): Should Dodgers and Florida Marlins be separated, and which opponent is intended here?
- [rel_216__ent_1004__ent_843](reports/rel_216.md#rel_216__ent_1004__ent_843): Which opponent does New York designate in this defeat sentence?
- [rel_223__ent_1220__ent_323](reports/rel_223.md#rel_223__ent_1220__ent_323): Should Bedford-Stuyvesant and Brownsville be separated into distinct geographic facts?
- [rel_312__ent_684__ent_1211](reports/rel_312.md#rel_312__ent_684__ent_1211): Does Los Angeles stand for the Dodgers or another owned organization, rather than the city itself?
