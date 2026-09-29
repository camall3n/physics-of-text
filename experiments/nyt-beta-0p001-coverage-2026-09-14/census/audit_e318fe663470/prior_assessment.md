# Complete census: audit_e318fe663470

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**436/436 facts evaluated.** 344 supported, 47 incorrect, 45 ambiguous. Exact census precision is **344/436 = 78.90%** with ambiguity counted incorrect, or **389/436 = 89.22%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 87.98%; decided coverage: 89.68%. Macro precision (equal relation weights): 79.68%–89.55%.

Top-relation row coverage: 1521/8516; coverage is not recall. Total expressed relations/facts in the saved world: 398/2861. Human overrides used: 0.

| Rank | Full dictionary, every fact and evaluation | Predicate ID | S | E | A | N | Precision endpoints |
|---:|---|---|---:|---:|---:|---:|---|
| 1 | [subsidiary or organizational unit of (rel_169)](reports/rel_169.md) | subsidiary_of | 27 | 0 | 2 | 29 | 93.10%–100.00% |
| 2 | [analyst at organization (rel_125)](reports/rel_125.md) | analyst_for | 23 | 2 | 1 | 26 | 88.46%–92.31% |
| 3 | [defeated opponent (rel_324)](reports/rel_324.md) | defeated | 24 | 5 | 2 | 31 | 77.42%–83.87% |
| 4 | [president or manager of (rel_333)](reports/rel_333.md) | president_or_manager_of | 24 | 1 | 2 | 27 | 88.89%–96.30% |
| 5 | [leader or organizational head of (rel_274)](reports/rel_274.md) | organizational_leader_of | 20 | 2 | 5 | 27 | 74.07%–92.59% |
| 6 | [coach of (rel_38)](reports/rel_38.md) | coach_of | 18 | 0 | 0 | 18 | 100.00%–100.00% |
| 7 | [defeated opponent (rel_6)](reports/rel_6.md) | defeated | 14 | 10 | 2 | 26 | 53.85%–61.54% |
| 8 | [economist at organization (rel_132)](reports/rel_132.md) | economist_for | 19 | 0 | 0 | 19 | 100.00%–100.00% |
| 9 | [director of organization (rel_175)](reports/rel_175.md) | director_of | 13 | 5 | 7 | 25 | 52.00%–80.00% |
| 10 | [managerial or leadership office in (rel_32)](reports/rel_32.md) | managerial_office_in | 18 | 1 | 7 | 26 | 69.23%–96.15% |
| 11 | [managerial or leadership office in (rel_164)](reports/rel_164.md) | managerial_office_in | 17 | 0 | 2 | 19 | 89.47%–100.00% |
| 12 | [organization based or located in (rel_138)](reports/rel_138.md) | located_in | 13 | 2 | 2 | 17 | 76.47%–88.24% |
| 13 | [winner or champion of (rel_340)](reports/rel_340.md) | winner_of | 10 | 5 | 2 | 17 | 58.82%–70.59% |
| 14 | [born in (rel_329)](reports/rel_329.md) | born_in | 17 | 3 | 2 | 22 | 77.27%–86.36% |
| 15 | [president or manager of (rel_338)](reports/rel_338.md) | president_or_manager_of | 16 | 2 | 2 | 20 | 80.00%–90.00% |
| 16 | [subsidiary or organizational unit of (rel_352)](reports/rel_352.md) | subsidiary_of | 13 | 1 | 3 | 17 | 76.47%–94.12% |
| 17 | [leader or organizational head of (rel_72)](reports/rel_72.md) | organizational_leader_of | 15 | 5 | 2 | 22 | 68.18%–77.27% |
| 18 | [managerial or leadership office in (rel_239)](reports/rel_239.md) | managerial_office_in | 14 | 2 | 0 | 16 | 87.50%–87.50% |
| 19 | [subsidiary or organizational unit of (rel_42)](reports/rel_42.md) | subsidiary_of | 15 | 0 | 0 | 15 | 100.00%–100.00% |
| 20 | [defeated opponent (rel_304)](reports/rel_304.md) | defeated | 14 | 1 | 2 | 17 | 82.35%–94.12% |

## Questions for human review

- [rel_169__ent_1068__ent_923](reports/rel_169.md#rel_169__ent_1068__ent_923): Which distinct subsidiary should this first latent entity represent: Lowe Group or McCann-Erickson World Group?
- [rel_169__ent_1104__ent_1015](reports/rel_169.md#rel_169__ent_1104__ent_1015): Does the part-of clause identify BBDO itself as the Omnicom unit, rather than another omitted organization?
- [rel_125__ent_1186__ent_783](reports/rel_125.md#rel_125__ent_1186__ent_783): Which named analyst does the first entity denote, or should these three people be separated?
- [rel_324__ent_182__ent_1085](reports/rel_324.md#rel_324__ent_182__ent_1085): Should Al Gore and Mr. Arafat be separated, and which person is intended as the opponent?
- [rel_324__ent_321__ent_278](reports/rel_324.md#rel_324__ent_321__ent_278): Which opponent is intended, and should Braves and Phillies be split?
- [rel_333__ent_346__ent_308](reports/rel_333.md#rel_333__ent_346__ent_308): Does the inferred person denote Ernie Grunfeld or Al Bianchi?
- [rel_333__ent_288__ent_1055](reports/rel_333.md#rel_333__ent_288__ent_1055): Does the inferred person denote Frank Cashen or Al Harazin?
- [rel_274__ent_1364__ent_55](reports/rel_274.md#rel_274__ent_1364__ent_55): Which distinct subject should this inferred entity represent?
- [rel_274__ent_716__ent_142](reports/rel_274.md#rel_274__ent_716__ent_142): Which distinct subject should this inferred entity represent?
- [rel_274__ent_1203__ent_497](reports/rel_274.md#rel_274__ent_1203__ent_497): What full political body or people does the truncated second argument denote?
- [rel_274__ent_67__ent_1384](reports/rel_274.md#rel_274__ent_67__ent_1384): What full political body or people does the truncated second argument denote?
- [rel_274__ent_4__ent_35](reports/rel_274.md#rel_274__ent_4__ent_35): What full political body or people does the truncated second argument denote?
- [rel_6__ent_543__ent_308](reports/rel_6.md#rel_6__ent_543__ent_308): Does the outscore row describe the final game result or only a period of play?
- [rel_6__ent_1261__ent_471](reports/rel_6.md#rel_6__ent_1261__ent_471): Which teams or bodies do East and West denote in these rows?
- [rel_175__ent_291__ent_182](reports/rel_175.md#rel_175__ent_291__ent_182): Which organization, administration or campaign does the directorship belong to, rather than the named person?
- [rel_175__ent_176__ent_175](reports/rel_175.md#rel_175__ent_176__ent_175): Which organization, administration or campaign does the directorship belong to, rather than the named person?
- [rel_175__ent_348__ent_1045](reports/rel_175.md#rel_175__ent_348__ent_1045): What complete center or institution does Study of the States designate here?
- [rel_175__ent_1271__ent_827](reports/rel_175.md#rel_175__ent_1271__ent_827): Which organization, administration or campaign does the directorship belong to, rather than the named person?
- [rel_175__ent_346__ent_462](reports/rel_175.md#rel_175__ent_346__ent_462): Should Ernie Grunfeld and Al Bianchi be separated, and whose director fact is intended?
- [rel_175__ent_1095__ent_1103](reports/rel_175.md#rel_175__ent_1095__ent_1103): Which environmental organization or program is the object of Esposito director-for in the original text?
- [rel_175__ent_363__ent_1023](reports/rel_175.md#rel_175__ent_363__ent_1023): Which complete center or institution is meant by Study of Automotive Transportation?
- [rel_32__ent_263__ent_1172](reports/rel_32.md#rel_32__ent_263__ent_1172): Which named Republican holds this office?
- [rel_32__ent_263__ent_1170](reports/rel_32.md#rel_32__ent_263__ent_1170): Which named Republican holds this office?
- [rel_32__ent_447__ent_0](reports/rel_32.md#rel_32__ent_447__ent_0): Should the inferred subject be Volcker or Bernanke?
- [rel_32__ent_1269__ent_244](reports/rel_32.md#rel_32__ent_1269__ent_244): Which named Republican holds this office?
- [rel_32__ent_1269__ent_1171](reports/rel_32.md#rel_32__ent_1269__ent_1171): Which named Republican holds this office?
- [rel_32__ent_263__ent_486](reports/rel_32.md#rel_32__ent_263__ent_486): Which named Republican holds this office?
- [rel_32__ent_1444__ent_1176](reports/rel_32.md#rel_32__ent_1444__ent_1176): Which named Republican holds this office?
- [rel_164__ent_1271__ent_1300](reports/rel_164.md#rel_164__ent_1271__ent_1300): Which Clinton office, administration or campaign is the directorship in, and should that institution replace Mr. Clinton?
- [rel_164__ent_263__ent_245](reports/rel_164.md#rel_164__ent_263__ent_245): Which named Republican heads the Senate Foreign Relations Committee in the source?
- [rel_138__ent_955__ent_1409](reports/rel_138.md#rel_138__ent_955__ent_1409): Should the Al Harazin–Mets evidence be a different fact from Petroleum Finance Company–Washington?
- [rel_138__ent_21__ent_10](reports/rel_138.md#rel_138__ent_21__ent_10): Does German stand for Germany as a location rather than only nationality or corporate origin?
- [rel_340__ent_739__ent_741](reports/rel_340.md#rel_340__ent_739__ent_741): Should Real Quiet and Unbridled be separate entities, and which horse is intended here?
- [rel_340__ent_608__ent_607](reports/rel_340.md#rel_340__ent_608__ent_607): Who is Scot, and should that winner be separated from Woods?
- [rel_329__ent_404__ent_280](reports/rel_329.md#rel_329__ent_404__ent_280): Does Michael designate a person born in Manhattan, or the restaurant named in this same fact?
- [rel_329__ent_300__ent_324](reports/rel_329.md#rel_329__ent_300__ent_324): Does the born-in clause concern a person named Kohlberg or the formation of an investment firm?
- [rel_338__ent_288__ent_1439](reports/rel_338.md#rel_338__ent_288__ent_1439): Does this inferred person denote Dave Johnson, Frank Cashen or Al Harazin?
- [rel_338__ent_17__ent_827](reports/rel_338.md#rel_338__ent_17__ent_827): Was Stephanopoulos manager of Clinton’s campaign/organization, and what exact office does this person-to-person path denote?
- [rel_352__ent_1068__ent_923](reports/rel_352.md#rel_352__ent_1068__ent_923): Are Lowe Group and McCann-Erickson intended as the same entity, or has this fact merged two separate subsidiaries?
- [rel_352__ent_843__ent_1304](reports/rel_352.md#rel_352__ent_843__ent_1304): Which organizational office does the first geographic name designate in these sentences?
- [rel_352__ent_407__ent_1218](reports/rel_352.md#rel_352__ent_407__ent_1218): Which organizational office does the first geographic name designate in these sentences?
- [rel_72__ent_716__ent_89](reports/rel_72.md#rel_72__ent_716__ent_89): Which person does this inferred entity represent?
- [rel_72__ent_4__ent_35](reports/rel_72.md#rel_72__ent_4__ent_35): What political institution or group is intended?
- [rel_304__ent_1370__ent_557](reports/rel_304.md#rel_304__ent_1370__ent_557): Should Montreal Expos and San Diego Padres be separated, and which team is intended here?
- [rel_304__ent_228__ent_471](reports/rel_304.md#rel_304__ent_228__ent_471): Which competitors do East and West denote in the original sentence?
