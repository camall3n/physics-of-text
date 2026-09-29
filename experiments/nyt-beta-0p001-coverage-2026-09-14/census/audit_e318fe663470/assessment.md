# Complete census: audit_e318fe663470

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**2542/2542 facts evaluated.** 1398 supported, 833 incorrect, 311 ambiguous. Exact census precision is **1398/2542 = 55.00%** with ambiguity counted incorrect, or **1709/2542 = 67.23%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 62.66%; decided coverage: 87.77%. Macro precision (equal relation weights): 50.45%–62.81%.

Top-relation row coverage: 7674/8516; coverage is not recall. Total expressed relations/facts in the saved world: 398/2861. Human overrides used: 0.

## Requested row-coverage prefixes

Every cutoff includes all facts in the smallest ranked prefix reaching the target. Whole relations can overshoot the requested coverage. Marginal scores cover only relations added since the previous cutoff; the first block starts after the preserved top20. Unresolved-predicate facts are included in A and N; their count is shown separately from case-level ambiguity.

| Target | k | Rows | Actual coverage | S | E | A | N | S/N | (S+A)/N | Unresolved relation facts | Added ranks | Added S/E/A/N | Added precision |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---|---|---|
| [57.00%](coverage_57.md) | 116 | 4876/8516 | 57.26% | 980 | 365 | 190 | 1535 | 63.84% | 76.22% | 0 | 21–116 | 636/318/145/1099 | 57.87%–71.06% |
| [60.00%](coverage_60.md) | 127 | 5131/8516 | 60.25% | 1021 | 405 | 199 | 1625 | 62.83% | 75.08% | 0 | 117–127 | 41/40/9/90 | 45.56%–55.56% |
| [70.00%](coverage_70.md) | 167 | 5966/8516 | 70.06% | 1162 | 526 | 238 | 1926 | 60.33% | 72.69% | 9 | 128–167 | 141/121/39/301 | 46.84%–59.80% |
| [80.00%](coverage_80.md) | 220 | 6825/8516 | 80.14% | 1292 | 666 | 273 | 2231 | 57.91% | 70.15% | 24 | 168–220 | 130/140/35/305 | 42.62%–54.10% |
| [90.00%](coverage_90.md) | 287 | 7674/8516 | 90.11% | 1398 | 833 | 311 | 2542 | 55.00% | 67.23% | 34 | 221–287 | 106/167/38/311 | 34.08%–46.30% |

Preserved top20: 344 S, 47 E, 45 A, N=436; 78.90%–89.22%. [Immutable previous assessment](prior_assessment.md).

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
| 21 | [lawyer or attorney for (rel_130)](reports/rel_130.md) | lawyer_for | 9 | 1 | 0 | 10 | 90.00%–90.00% |
| 22 | [managerial or leadership office in (rel_156)](reports/rel_156.md) | managerial_office_in | 10 | 1 | 2 | 13 | 76.92%–92.31% |
| 23 | [directed communication to (rel_215)](reports/rel_215.md) | communicates_to | 14 | 0 | 0 | 14 | 100.00%–100.00% |
| 24 | [spokesperson for (rel_331)](reports/rel_331.md) | spokesperson_for | 16 | 4 | 0 | 20 | 80.00%–80.00% |
| 25 | [directed communication to (rel_222)](reports/rel_222.md) | communicates_to | 12 | 4 | 3 | 19 | 63.16%–78.95% |
| 26 | [directed communication to (rel_355)](reports/rel_355.md) | communicates_to | 5 | 3 | 8 | 16 | 31.25%–81.25% |
| 27 | [athlete plays for team (rel_55)](reports/rel_55.md) | athlete_for | 4 | 8 | 4 | 16 | 25.00%–50.00% |
| 28 | [managerial or leadership office in (rel_68)](reports/rel_68.md) | managerial_office_in | 9 | 2 | 4 | 15 | 60.00%–86.67% |
| 29 | [organization based or located in (rel_97)](reports/rel_97.md) | located_in | 12 | 4 | 1 | 17 | 70.59%–76.47% |
| 30 | [organization based or located in (rel_272)](reports/rel_272.md) | located_in | 11 | 2 | 2 | 15 | 73.33%–86.67% |
| 31 | [political body has a leader (rel_279)](reports/rel_279.md) | has_political_leader | 11 | 3 | 0 | 14 | 78.57%–78.57% |
| 32 | [president of institution (rel_349)](reports/rel_349.md) | president_of | 8 | 1 | 2 | 11 | 72.73%–90.91% |
| 33 | [reviewed artistic output of (rel_390)](reports/rel_390.md) | reviews_artistic_output_of | 8 | 2 | 1 | 11 | 72.73%–81.82% |
| 34 | [editor of publication (rel_81)](reports/rel_81.md) | editor_of | 9 | 7 | 0 | 16 | 56.25%–56.25% |
| 35 | [executive of (rel_359)](reports/rel_359.md) | executive_of | 13 | 1 | 0 | 14 | 92.86%–92.86% |
| 36 | [chairs or heads organization (rel_61)](reports/rel_61.md) | chairs_or_heads | 1 | 2 | 6 | 9 | 11.11%–77.78% |
| 37 | [leader or organizational head of (rel_242)](reports/rel_242.md) | organizational_leader_of | 14 | 4 | 1 | 19 | 73.68%–78.95% |
| 38 | [director of organization (rel_370)](reports/rel_370.md) | director_of | 9 | 1 | 2 | 12 | 75.00%–91.67% |
| 39 | [played or competed against (rel_4)](reports/rel_4.md) | competed_against | 8 | 5 | 2 | 15 | 53.33%–66.67% |
| 40 | [organization based or located in (rel_65)](reports/rel_65.md) | located_in | 9 | 1 | 2 | 12 | 75.00%–91.67% |
| 41 | [departed from (rel_148)](reports/rel_148.md) | departed_from | 10 | 6 | 2 | 18 | 55.56%–66.67% |
| 42 | [athlete plays for team (rel_230)](reports/rel_230.md) | athlete_for | 7 | 2 | 0 | 9 | 77.78%–77.78% |
| 43 | [political body has a leader (rel_243)](reports/rel_243.md) | has_political_leader | 2 | 2 | 9 | 13 | 15.38%–84.62% |
| 44 | [professor or university teacher at (rel_265)](reports/rel_265.md) | professor_at | 7 | 7 | 1 | 15 | 46.67%–53.33% |
| 45 | [spokesperson for (rel_307)](reports/rel_307.md) | spokesperson_for | 14 | 1 | 0 | 15 | 93.33%–93.33% |
| 46 | [has spokesperson (rel_367)](reports/rel_367.md) | has_spokesperson | 11 | 1 | 1 | 13 | 84.62%–92.31% |
| 47 | [professor or university teacher at (rel_334)](reports/rel_334.md) | professor_at | 9 | 3 | 0 | 12 | 75.00%–75.00% |
| 48 | [criticized or accused (rel_224)](reports/rel_224.md) | criticizes | 6 | 10 | 2 | 18 | 33.33%–44.44% |
| 49 | [played or competed against (rel_235)](reports/rel_235.md) | competed_against | 11 | 0 | 3 | 14 | 78.57%–100.00% |
| 50 | [organization based or located in (rel_290)](reports/rel_290.md) | located_in | 8 | 3 | 1 | 12 | 66.67%–75.00% |
| 51 | [owns organization or asset (rel_151)](reports/rel_151.md) | owns | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 52 | [organization based or located in (rel_180)](reports/rel_180.md) | located_in | 7 | 2 | 3 | 12 | 58.33%–83.33% |
| 53 | [chairperson of (rel_399)](reports/rel_399.md) | chairperson_of | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 54 | [geographical part of (rel_131)](reports/rel_131.md) | geographic_part_of | 12 | 4 | 0 | 16 | 75.00%–75.00% |
| 55 | [owns organization or asset (rel_339)](reports/rel_339.md) | owns | 10 | 7 | 2 | 19 | 52.63%–63.16% |
| 56 | [directed communication to (rel_16)](reports/rel_16.md) | communicates_to | 5 | 10 | 3 | 18 | 27.78%–44.44% |
| 57 | [leader or organizational head of (rel_91)](reports/rel_91.md) | organizational_leader_of | 5 | 3 | 10 | 18 | 27.78%–83.33% |
| 58 | [known or named as (rel_100)](reports/rel_100.md) | known_as | 7 | 1 | 0 | 8 | 87.50%–87.50% |
| 59 | [has or had medical condition (rel_379)](reports/rel_379.md) | has_medical_condition | 2 | 9 | 1 | 12 | 16.67%–25.00% |
| 60 | [lawyer or attorney for (rel_8)](reports/rel_8.md) | lawyer_for | 7 | 2 | 2 | 11 | 63.64%–81.82% |
| 61 | [lives or has lived in (rel_82)](reports/rel_82.md) | resides_in | 7 | 3 | 1 | 11 | 63.64%–72.73% |
| 62 | [participated in sporting event (rel_289)](reports/rel_289.md) | participated_in_sporting_event | 5 | 8 | 0 | 13 | 38.46%–38.46% |
| 63 | [chairperson of (rel_27)](reports/rel_27.md) | chairperson_of | 6 | 1 | 3 | 10 | 60.00%–90.00% |
| 64 | [managerial or leadership office in (rel_177)](reports/rel_177.md) | managerial_office_in | 4 | 9 | 0 | 13 | 30.77%–30.77% |
| 65 | [met or encountered (rel_232)](reports/rel_232.md) | met_with | 5 | 5 | 2 | 12 | 41.67%–58.33% |
| 66 | [subsidiary or organizational unit of (rel_109)](reports/rel_109.md) | subsidiary_of | 7 | 4 | 0 | 11 | 63.64%–63.64% |
| 67 | [moves or travels to (rel_14)](reports/rel_14.md) | travels_to | 7 | 1 | 1 | 9 | 77.78%–88.89% |
| 68 | [owns organization or asset (rel_24)](reports/rel_24.md) | owns | 5 | 5 | 1 | 11 | 45.45%–54.55% |
| 69 | [organization based or located in (rel_48)](reports/rel_48.md) | located_in | 9 | 2 | 0 | 11 | 81.82%–81.82% |
| 70 | [moves or travels to (rel_89)](reports/rel_89.md) | travels_to | 5 | 4 | 1 | 10 | 50.00%–60.00% |
| 71 | [lives or has lived in (rel_117)](reports/rel_117.md) | resides_in | 0 | 1 | 8 | 9 | 0.00%–88.89% |
| 72 | [owns organization or asset (rel_140)](reports/rel_140.md) | owns | 6 | 10 | 0 | 16 | 37.50%–37.50% |
| 73 | [criticized or accused (rel_145)](reports/rel_145.md) | criticizes | 5 | 9 | 0 | 14 | 35.71%–35.71% |
| 74 | [organization based or located in (rel_276)](reports/rel_276.md) | located_in | 6 | 3 | 1 | 10 | 60.00%–70.00% |
| 75 | [organization described by national affiliation (rel_330)](reports/rel_330.md) | organization_national_affiliation | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 76 | [president of institution (rel_357)](reports/rel_357.md) | president_of | 9 | 3 | 1 | 13 | 69.23%–76.92% |
| 77 | [political body has a leader (rel_202)](reports/rel_202.md) | has_political_leader | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 78 | [known or named as (rel_174)](reports/rel_174.md) | known_as | 4 | 2 | 1 | 7 | 57.14%–71.43% |
| 79 | [directed communication to (rel_268)](reports/rel_268.md) | communicates_to | 8 | 4 | 0 | 12 | 66.67%–66.67% |
| 80 | [directed communication to (rel_310)](reports/rel_310.md) | communicates_to | 0 | 3 | 11 | 14 | 0.00%–78.57% |
| 81 | [member of organization (rel_392)](reports/rel_392.md) | member_of | 5 | 4 | 0 | 9 | 55.56%–55.56% |
| 82 | [moves or travels to (rel_123)](reports/rel_123.md) | travels_to | 7 | 2 | 2 | 11 | 63.64%–81.82% |
| 83 | [leader or organizational head of (rel_161)](reports/rel_161.md) | organizational_leader_of | 8 | 1 | 1 | 10 | 80.00%–90.00% |
| 84 | [leader or organizational head of (rel_205)](reports/rel_205.md) | organizational_leader_of | 3 | 1 | 6 | 10 | 30.00%–90.00% |
| 85 | [practices law in place (rel_273)](reports/rel_273.md) | lawyer_in | 2 | 4 | 4 | 10 | 20.00%–60.00% |
| 86 | [organization based or located in (rel_9)](reports/rel_9.md) | located_in | 2 | 5 | 2 | 9 | 22.22%–44.44% |
| 87 | [died in place (rel_256)](reports/rel_256.md) | died_in | 8 | 5 | 0 | 13 | 61.54%–61.54% |
| 88 | [coach of (rel_326)](reports/rel_326.md) | coach_of | 8 | 3 | 0 | 11 | 72.73%–72.73% |
| 89 | [owns organization or asset (rel_50)](reports/rel_50.md) | owns | 6 | 4 | 0 | 10 | 60.00%–60.00% |
| 90 | [participated in sporting event (rel_63)](reports/rel_63.md) | participated_in_sporting_event | 5 | 4 | 0 | 9 | 55.56%–55.56% |
| 91 | [has or had wife (rel_142)](reports/rel_142.md) | has_wife | 4 | 2 | 0 | 6 | 66.67%–66.67% |
| 92 | [succeeded person in role (rel_190)](reports/rel_190.md) | succeeded_person | 3 | 2 | 2 | 7 | 42.86%–71.43% |
| 93 | [director of organization (rel_285)](reports/rel_285.md) | director_of | 4 | 1 | 1 | 6 | 66.67%–83.33% |
| 94 | [director of organization (rel_381)](reports/rel_381.md) | director_of | 7 | 3 | 1 | 11 | 63.64%–72.73% |
| 95 | [wins or holds sporting championship (rel_18)](reports/rel_18.md) | sporting_champion_of | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 96 | [politically controls (rel_23)](reports/rel_23.md) | politically_controls | 8 | 4 | 0 | 12 | 66.67%–66.67% |
| 97 | [directed communication to (rel_58)](reports/rel_58.md) | communicates_to | 9 | 5 | 0 | 14 | 64.29%–64.29% |
| 98 | [wins or holds sporting championship (rel_64)](reports/rel_64.md) | sporting_champion_of | 4 | 2 | 0 | 6 | 66.67%–66.67% |
| 99 | [lives or has lived in (rel_66)](reports/rel_66.md) | resides_in | 3 | 3 | 4 | 10 | 30.00%–70.00% |
| 100 | [has member (rel_95)](reports/rel_95.md) | has_member | 6 | 4 | 1 | 11 | 54.55%–63.64% |
| 101 | [athlete plays for team (rel_96)](reports/rel_96.md) | athlete_for | 1 | 3 | 2 | 6 | 16.67%–50.00% |
| 102 | [has lawyer or legal counsel (rel_107)](reports/rel_107.md) | has_lawyer | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 103 | [wins or holds sporting championship (rel_226)](reports/rel_226.md) | sporting_champion_of | 4 | 4 | 1 | 9 | 44.44%–55.56% |
| 104 | [broadcasts or carries program (rel_311)](reports/rel_311.md) | broadcasts_program | 0 | 1 | 2 | 3 | 0.00%–66.67% |
| 105 | [departed from (rel_76)](reports/rel_76.md) | departed_from | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 106 | [executive of (rel_88)](reports/rel_88.md) | executive_of | 4 | 7 | 0 | 11 | 36.36%–36.36% |
| 107 | [managerial or leadership office in (rel_167)](reports/rel_167.md) | managerial_office_in | 7 | 1 | 0 | 8 | 87.50%–87.50% |
| 108 | [lives or has lived in (rel_246)](reports/rel_246.md) | resides_in | 7 | 3 | 0 | 10 | 70.00%–70.00% |
| 109 | [moves or travels to (rel_282)](reports/rel_282.md) | travels_to | 2 | 6 | 0 | 8 | 25.00%–25.00% |
| 110 | [executive of (rel_366)](reports/rel_366.md) | executive_of | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 111 | [moves or travels to (rel_384)](reports/rel_384.md) | travels_to | 2 | 6 | 1 | 9 | 22.22%–33.33% |
| 112 | [directed communication to (rel_52)](reports/rel_52.md) | communicates_to | 6 | 6 | 0 | 12 | 50.00%–50.00% |
| 113 | [contributed writing to publication (rel_87)](reports/rel_87.md) | writes_for | 6 | 0 | 2 | 8 | 75.00%–100.00% |
| 114 | [moves or travels to (rel_144)](reports/rel_144.md) | travels_to | 3 | 7 | 2 | 12 | 25.00%–41.67% |
| 115 | [wins or holds sporting championship (rel_150)](reports/rel_150.md) | sporting_champion_of | 6 | 1 | 0 | 7 | 85.71%–85.71% |
| 116 | [chairperson of (rel_155)](reports/rel_155.md) | chairperson_of | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 117 | [founder or co-founder of (rel_179)](reports/rel_179.md) | founder_of | 6 | 2 | 0 | 8 | 75.00%–75.00% |
| 118 | [athlete plays for team (rel_351)](reports/rel_351.md) | athlete_for | 3 | 6 | 0 | 9 | 33.33%–33.33% |
| 119 | [criticized or accused (rel_29)](reports/rel_29.md) | criticizes | 3 | 6 | 0 | 9 | 33.33%–33.33% |
| 120 | [manager of institution (rel_44)](reports/rel_44.md) | manager_of | 2 | 6 | 1 | 9 | 22.22%–33.33% |
| 121 | [organization described by national affiliation (rel_56)](reports/rel_56.md) | organization_national_affiliation | 4 | 3 | 0 | 7 | 57.14%–57.14% |
| 122 | [geographical part of (rel_84)](reports/rel_84.md) | geographic_part_of | 7 | 0 | 1 | 8 | 87.50%–100.00% |
| 123 | [acted jointly with (rel_141)](reports/rel_141.md) | acted_jointly_with | 0 | 0 | 5 | 5 | 0.00%–100.00% |
| 124 | [analyst at organization (rel_160)](reports/rel_160.md) | analyst_for | 3 | 9 | 1 | 13 | 23.08%–30.77% |
| 125 | [chairperson of (rel_165)](reports/rel_165.md) | chairperson_of | 4 | 3 | 0 | 7 | 57.14%–57.14% |
| 126 | [member of organization (rel_173)](reports/rel_173.md) | member_of | 5 | 1 | 1 | 7 | 71.43%–85.71% |
| 127 | [managerial or leadership office in (rel_181)](reports/rel_181.md) | managerial_office_in | 4 | 4 | 0 | 8 | 50.00%–50.00% |
| 128 | [unresolved relation meaning (rel_204)](reports/rel_204.md) | unresolved_relation | 0 | 0 | 9 | 9 | 0.00%–100.00% |
| 129 | [has coach (rel_207)](reports/rel_207.md) | has_coach | 2 | 5 | 0 | 7 | 28.57%–28.57% |
| 130 | [chairperson of (rel_209)](reports/rel_209.md) | chairperson_of | 3 | 5 | 1 | 9 | 33.33%–44.44% |
| 131 | [has diplomatic relations with (rel_264)](reports/rel_264.md) | has_diplomatic_relations_with | 4 | 3 | 1 | 8 | 50.00%–62.50% |
| 132 | [spokesperson for (rel_302)](reports/rel_302.md) | spokesperson_for | 6 | 1 | 0 | 7 | 85.71%–85.71% |
| 133 | [lives or has lived in (rel_306)](reports/rel_306.md) | resides_in | 2 | 1 | 4 | 7 | 28.57%–85.71% |
| 134 | [owns organization or asset (rel_47)](reports/rel_47.md) | owns | 2 | 6 | 0 | 8 | 25.00%–25.00% |
| 135 | [has or had wife (rel_51)](reports/rel_51.md) | has_wife | 4 | 2 | 0 | 6 | 66.67%–66.67% |
| 136 | [owns organization or asset (rel_90)](reports/rel_90.md) | owns | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 137 | [member of organization (rel_93)](reports/rel_93.md) | member_of | 2 | 5 | 5 | 12 | 16.67%–58.33% |
| 138 | [organization described by national affiliation (rel_98)](reports/rel_98.md) | organization_national_affiliation | 1 | 11 | 0 | 12 | 8.33%–8.33% |
| 139 | [died in place (rel_185)](reports/rel_185.md) | died_in | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 140 | [managerial or leadership office in (rel_341)](reports/rel_341.md) | managerial_office_in | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 141 | [fielded or used an athlete in play (rel_346)](reports/rel_346.md) | fielded_player | 2 | 6 | 1 | 9 | 22.22%–33.33% |
| 142 | [wins or holds sporting championship (rel_394)](reports/rel_394.md) | sporting_champion_of | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 143 | [president of institution (rel_43)](reports/rel_43.md) | president_of | 5 | 1 | 2 | 8 | 62.50%–87.50% |
| 144 | [has coach (rel_111)](reports/rel_111.md) | has_coach | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 145 | [directed communication to (rel_121)](reports/rel_121.md) | communicates_to | 6 | 3 | 0 | 9 | 66.67%–66.67% |
| 146 | [physically present in place (rel_196)](reports/rel_196.md) | present_in | 4 | 4 | 0 | 8 | 50.00%–50.00% |
| 147 | [met or encountered (rel_197)](reports/rel_197.md) | met_with | 7 | 0 | 0 | 7 | 100.00%–100.00% |
| 148 | [political body has a leader (rel_300)](reports/rel_300.md) | has_political_leader | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 149 | [reviewed artistic output of (rel_316)](reports/rel_316.md) | reviews_artistic_output_of | 1 | 6 | 0 | 7 | 14.29%–14.29% |
| 150 | [departed from (rel_10)](reports/rel_10.md) | departed_from | 7 | 4 | 1 | 12 | 58.33%–66.67% |
| 151 | [political body has a leader (rel_37)](reports/rel_37.md) | has_political_leader | 3 | 7 | 2 | 12 | 25.00%–41.67% |
| 152 | [lives or has lived in (rel_170)](reports/rel_170.md) | resides_in | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 153 | [analyst at organization (rel_254)](reports/rel_254.md) | analyst_for | 5 | 3 | 2 | 10 | 50.00%–70.00% |
| 154 | [political body has a leader (rel_261)](reports/rel_261.md) | has_political_leader | 1 | 0 | 5 | 6 | 16.67%–100.00% |
| 155 | [geographical part of (rel_269)](reports/rel_269.md) | geographic_part_of | 6 | 0 | 1 | 7 | 85.71%–100.00% |
| 156 | [politically controlled by (rel_277)](reports/rel_277.md) | politically_controlled_by | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 157 | [lives or has lived in (rel_320)](reports/rel_320.md) | resides_in | 3 | 5 | 0 | 8 | 37.50%–37.50% |
| 158 | [physically present in place (rel_387)](reports/rel_387.md) | present_in | 3 | 5 | 0 | 8 | 37.50%–37.50% |
| 159 | [subsidiary or organizational unit of (rel_398)](reports/rel_398.md) | subsidiary_of | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 160 | [has lawyer or legal counsel (rel_5)](reports/rel_5.md) | has_lawyer | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 161 | [organization based or located in (rel_20)](reports/rel_20.md) | located_in | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 162 | [directed communication to (rel_70)](reports/rel_70.md) | communicates_to | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 163 | [subsidiary or organizational unit of (rel_183)](reports/rel_183.md) | subsidiary_of | 1 | 3 | 2 | 6 | 16.67%–50.00% |
| 164 | [has minister (rel_191)](reports/rel_191.md) | has_minister | 3 | 6 | 0 | 9 | 33.33%–33.33% |
| 165 | [died in place (rel_221)](reports/rel_221.md) | died_in | 5 | 3 | 2 | 10 | 50.00%–70.00% |
| 166 | [organization based or located in (rel_322)](reports/rel_322.md) | located_in | 2 | 1 | 1 | 4 | 50.00%–75.00% |
| 167 | [has minister (rel_336)](reports/rel_336.md) | has_minister | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 168 | [succeeded person in role (rel_368)](reports/rel_368.md) | succeeded_person | 2 | 0 | 1 | 3 | 66.67%–100.00% |
| 169 | [subsidiary or organizational unit of (rel_385)](reports/rel_385.md) | subsidiary_of | 5 | 5 | 1 | 11 | 45.45%–54.55% |
| 170 | [organization based or located in (rel_133)](reports/rel_133.md) | located_in | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 171 | [official of institution (rel_184)](reports/rel_184.md) | official_of | 5 | 3 | 0 | 8 | 62.50%–62.50% |
| 172 | [lawyer or attorney for (rel_192)](reports/rel_192.md) | lawyer_for | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 173 | [director of organization (rel_212)](reports/rel_212.md) | director_of | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 174 | [subsidiary or organizational unit of (rel_252)](reports/rel_252.md) | subsidiary_of | 2 | 6 | 0 | 8 | 25.00%–25.00% |
| 175 | [manager of institution (rel_267)](reports/rel_267.md) | manager_of | 2 | 3 | 1 | 6 | 33.33%–50.00% |
| 176 | [has spokesperson (rel_327)](reports/rel_327.md) | has_spokesperson | 2 | 7 | 0 | 9 | 22.22%–22.22% |
| 177 | [politically controls (rel_369)](reports/rel_369.md) | politically_controls | 3 | 5 | 0 | 8 | 37.50%–37.50% |
| 178 | [has minister (rel_12)](reports/rel_12.md) | has_minister | 4 | 2 | 0 | 6 | 66.67%–66.67% |
| 179 | [physically present in place (rel_13)](reports/rel_13.md) | present_in | 0 | 6 | 1 | 7 | 0.00%–14.29% |
| 180 | [coach of (rel_79)](reports/rel_79.md) | coach_of | 5 | 3 | 0 | 8 | 62.50%–62.50% |
| 181 | [lobbyist for principal (rel_92)](reports/rel_92.md) | lobbyist_for | 1 | 6 | 0 | 7 | 14.29%–14.29% |
| 182 | [member of organization (rel_134)](reports/rel_134.md) | member_of | 4 | 3 | 0 | 7 | 57.14%–57.14% |
| 183 | [member of organization (rel_227)](reports/rel_227.md) | member_of | 5 | 1 | 1 | 7 | 71.43%–85.71% |
| 184 | [president of institution (rel_234)](reports/rel_234.md) | president_of | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 185 | [participated in sporting event (rel_251)](reports/rel_251.md) | participated_in_sporting_event | 2 | 5 | 0 | 7 | 28.57%–28.57% |
| 186 | [location of organization or its office (rel_286)](reports/rel_286.md) | location_of_organization | 3 | 2 | 1 | 6 | 50.00%–66.67% |
| 187 | [founder or co-founder of (rel_342)](reports/rel_342.md) | founder_of | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 188 | [organization based or located in (rel_45)](reports/rel_45.md) | located_in | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 189 | [supports or endorses (rel_104)](reports/rel_104.md) | supports | 1 | 1 | 4 | 6 | 16.67%–83.33% |
| 190 | [has or had wife (rel_126)](reports/rel_126.md) | has_wife | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 191 | [directed communication to (rel_139)](reports/rel_139.md) | communicates_to | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 192 | [president of institution (rel_159)](reports/rel_159.md) | president_of | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 193 | [supports or endorses (rel_216)](reports/rel_216.md) | supports | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 194 | [moves or travels to (rel_228)](reports/rel_228.md) | travels_to | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 195 | [unresolved relation meaning (rel_231)](reports/rel_231.md) | unresolved_relation | 0 | 0 | 7 | 7 | 0.00%–100.00% |
| 196 | [editor of publication (rel_263)](reports/rel_263.md) | editor_of | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 197 | [has or had wife (rel_319)](reports/rel_319.md) | has_wife | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 198 | [contributed writing to publication (rel_337)](reports/rel_337.md) | writes_for | 4 | 2 | 0 | 6 | 66.67%–66.67% |
| 199 | [political body has a leader (rel_354)](reports/rel_354.md) | has_political_leader | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 200 | [physically present in place (rel_358)](reports/rel_358.md) | present_in | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 201 | [organization operates in industry or domain (rel_393)](reports/rel_393.md) | organization_operates_in_domain | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 202 | [political candidate or nominee for party (rel_15)](reports/rel_15.md) | candidate_for | 2 | 2 | 1 | 5 | 40.00%–60.00% |
| 203 | [subsidiary or organizational unit of (rel_21)](reports/rel_21.md) | subsidiary_of | 1 | 6 | 1 | 8 | 12.50%–25.00% |
| 204 | [directed communication to (rel_25)](reports/rel_25.md) | communicates_to | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 205 | [spokesperson for (rel_78)](reports/rel_78.md) | spokesperson_for | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 206 | [played at sporting venue (rel_101)](reports/rel_101.md) | played_at_sporting_venue | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 207 | [moves or travels to (rel_110)](reports/rel_110.md) | travels_to | 2 | 2 | 1 | 5 | 40.00%–60.00% |
| 208 | [coach of (rel_112)](reports/rel_112.md) | coach_of | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 209 | [has or had medical condition (rel_143)](reports/rel_143.md) | has_medical_condition | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 210 | [unresolved relation meaning (rel_200)](reports/rel_200.md) | unresolved_relation | 0 | 0 | 4 | 4 | 0.00%–100.00% |
| 211 | [directed communication to (rel_240)](reports/rel_240.md) | communicates_to | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 212 | [managerial or leadership office in (rel_245)](reports/rel_245.md) | managerial_office_in | 2 | 2 | 1 | 5 | 40.00%–60.00% |
| 213 | [winner or champion of (rel_278)](reports/rel_278.md) | winner_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 214 | [unresolved relation meaning (rel_301)](reports/rel_301.md) | unresolved_relation | 0 | 0 | 4 | 4 | 0.00%–100.00% |
| 215 | [winner or champion of (rel_344)](reports/rel_344.md) | winner_of | 1 | 5 | 0 | 6 | 16.67%–16.67% |
| 216 | [has lawyer or legal counsel (rel_356)](reports/rel_356.md) | has_lawyer | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 217 | [director of organization (rel_376)](reports/rel_376.md) | director_of | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 218 | [physically present in place (rel_388)](reports/rel_388.md) | present_in | 0 | 7 | 2 | 9 | 0.00%–22.22% |
| 219 | [died in place (rel_0)](reports/rel_0.md) | died_in | 6 | 3 | 2 | 11 | 54.55%–72.73% |
| 220 | [political body has a leader (rel_35)](reports/rel_35.md) | has_political_leader | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 221 | [participated in sporting event (rel_86)](reports/rel_86.md) | participated_in_sporting_event | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 222 | [economist at organization (rel_118)](reports/rel_118.md) | economist_for | 1 | 5 | 0 | 6 | 16.67%–16.67% |
| 223 | [publisher of publication (rel_178)](reports/rel_178.md) | publisher_of | 1 | 5 | 0 | 6 | 16.67%–16.67% |
| 224 | [president of institution (rel_194)](reports/rel_194.md) | president_of | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 225 | [born in (rel_198)](reports/rel_198.md) | born_in | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 226 | [trades athletes to team (rel_210)](reports/rel_210.md) | trades_players_to | 0 | 5 | 5 | 10 | 0.00%–50.00% |
| 227 | [physically present in place (rel_237)](reports/rel_237.md) | present_in | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 228 | [organization based or located in (rel_287)](reports/rel_287.md) | located_in | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 229 | [location of organization or its office (rel_293)](reports/rel_293.md) | location_of_organization | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 230 | [moves or travels to (rel_296)](reports/rel_296.md) | travels_to | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 231 | [leader or organizational head of (rel_308)](reports/rel_308.md) | organizational_leader_of | 2 | 0 | 3 | 5 | 40.00%–100.00% |
| 232 | [criticized or accused (rel_328)](reports/rel_328.md) | criticizes | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 233 | [political candidate or nominee for party (rel_343)](reports/rel_343.md) | candidate_for | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 234 | [analyst at organization (rel_350)](reports/rel_350.md) | analyst_for | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 235 | [director of organization (rel_353)](reports/rel_353.md) | director_of | 4 | 3 | 0 | 7 | 57.14%–57.14% |
| 236 | [has spokesperson (rel_361)](reports/rel_361.md) | has_spokesperson | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 237 | [political body has a leader (rel_373)](reports/rel_373.md) | has_political_leader | 1 | 5 | 0 | 6 | 16.67%–16.67% |
| 238 | [editor of publication (rel_2)](reports/rel_2.md) | editor_of | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 239 | [reviewed artistic output of (rel_11)](reports/rel_11.md) | reviews_artistic_output_of | 2 | 5 | 0 | 7 | 28.57%–28.57% |
| 240 | [met or encountered (rel_30)](reports/rel_30.md) | met_with | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 241 | [managerial or leadership office in (rel_49)](reports/rel_49.md) | managerial_office_in | 0 | 4 | 2 | 6 | 0.00%–33.33% |
| 242 | [unresolved relation meaning (rel_60)](reports/rel_60.md) | unresolved_relation | 0 | 0 | 5 | 5 | 0.00%–100.00% |
| 243 | [lawyer or attorney for (rel_73)](reports/rel_73.md) | lawyer_for | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 244 | [director of organization (rel_85)](reports/rel_85.md) | director_of | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 245 | [moves or travels to (rel_102)](reports/rel_102.md) | travels_to | 0 | 4 | 1 | 5 | 0.00%–20.00% |
| 246 | [organization operates in industry or domain (rel_122)](reports/rel_122.md) | organization_operates_in_domain | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 247 | [lawyer or attorney for (rel_128)](reports/rel_128.md) | lawyer_for | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 248 | [chairperson of (rel_129)](reports/rel_129.md) | chairperson_of | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 249 | [president of institution (rel_136)](reports/rel_136.md) | president_of | 1 | 6 | 0 | 7 | 14.29%–14.29% |
| 250 | [subsidiary or organizational unit of (rel_211)](reports/rel_211.md) | subsidiary_of | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 251 | [organization based or located in (rel_299)](reports/rel_299.md) | located_in | 1 | 6 | 0 | 7 | 14.29%–14.29% |
| 252 | [moves or travels to (rel_312)](reports/rel_312.md) | travels_to | 0 | 3 | 1 | 4 | 0.00%–25.00% |
| 253 | [research fellow at institution (rel_314)](reports/rel_314.md) | fellow_at | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 254 | [event held in place (rel_318)](reports/rel_318.md) | event_held_in | 0 | 5 | 1 | 6 | 0.00%–16.67% |
| 255 | [president of institution (rel_321)](reports/rel_321.md) | president_of | 0 | 3 | 2 | 5 | 0.00%–40.00% |
| 256 | [organization described by national affiliation (rel_383)](reports/rel_383.md) | organization_national_affiliation | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 257 | [organization operates in industry or domain (rel_389)](reports/rel_389.md) | organization_operates_in_domain | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 258 | [geographical part of (rel_395)](reports/rel_395.md) | geographic_part_of | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 259 | [organization based or located in (rel_19)](reports/rel_19.md) | located_in | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 260 | [organization based or located in (rel_40)](reports/rel_40.md) | located_in | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 261 | [politically controls (rel_41)](reports/rel_41.md) | politically_controls | 1 | 1 | 2 | 4 | 25.00%–75.00% |
| 262 | [moves or travels to (rel_69)](reports/rel_69.md) | travels_to | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 263 | [subsidiary or organizational unit of (rel_80)](reports/rel_80.md) | subsidiary_of | 2 | 3 | 1 | 6 | 33.33%–50.00% |
| 264 | [director of organization (rel_113)](reports/rel_113.md) | director_of | 0 | 2 | 2 | 4 | 0.00%–50.00% |
| 265 | [departed from (rel_147)](reports/rel_147.md) | departed_from | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 266 | [played or competed against (rel_149)](reports/rel_149.md) | competed_against | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 267 | [wins or holds sporting championship (rel_162)](reports/rel_162.md) | sporting_champion_of | 1 | 5 | 0 | 6 | 16.67%–16.67% |
| 268 | [leader or organizational head of (rel_176)](reports/rel_176.md) | organizational_leader_of | 1 | 0 | 1 | 2 | 50.00%–100.00% |
| 269 | [founder or co-founder of (rel_208)](reports/rel_208.md) | founder_of | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 270 | [director of organization (rel_223)](reports/rel_223.md) | director_of | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 271 | [population includes subgroup members (rel_241)](reports/rel_241.md) | population_includes | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 272 | [organization based or located in (rel_255)](reports/rel_255.md) | located_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 273 | [flows into waterbody (rel_283)](reports/rel_283.md) | flows_into | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 274 | [has spokesperson (rel_313)](reports/rel_313.md) | has_spokesperson | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 275 | [adviser to principal (rel_347)](reports/rel_347.md) | adviser_to | 2 | 7 | 0 | 9 | 22.22%–22.22% |
| 276 | [organization based or located in (rel_372)](reports/rel_372.md) | located_in | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 277 | [defeated opponent (rel_382)](reports/rel_382.md) | defeated | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 278 | [supports or endorses (rel_17)](reports/rel_17.md) | supports | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 279 | [coach of (rel_22)](reports/rel_22.md) | coach_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 280 | [subsidiary or organizational unit of (rel_34)](reports/rel_34.md) | subsidiary_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 281 | [official of institution (rel_114)](reports/rel_114.md) | official_of | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 282 | [subsidiary or organizational unit of (rel_127)](reports/rel_127.md) | subsidiary_of | 0 | 3 | 1 | 4 | 0.00%–25.00% |
| 283 | [dismissed person from role (rel_153)](reports/rel_153.md) | dismissed_person | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 284 | [legal specialist in field (rel_182)](reports/rel_182.md) | legal_specialist_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 285 | [unresolved relation meaning (rel_193)](reports/rel_193.md) | unresolved_relation | 0 | 0 | 5 | 5 | 0.00%–100.00% |
| 286 | [managerial or leadership office in (rel_213)](reports/rel_213.md) | managerial_office_in | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 287 | [official of institution (rel_259)](reports/rel_259.md) | official_of | 2 | 1 | 0 | 3 | 66.67%–66.67% |

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
- [rel_156__ent_490__ent_51](reports/rel_156.md#rel_156__ent_490__ent_51): Does Taxi here identify the relevant public commission rather than an incomplete unrelated principal?
- [rel_156__ent_716__ent_142](reports/rel_156.md#rel_156__ent_716__ent_142): Should Reed and Robertson be separate inferred entities?
- [rel_222__ent_1330__ent_1239](reports/rel_222.md#rel_222__ent_1330__ent_1239): Should Reagan and Clinton be split before assessing this fact?
- [rel_222__ent_182__ent_819](reports/rel_222.md#rel_222__ent_182__ent_819): Does the omitted object establish a message or statement addressed to this recipient?
- [rel_222__ent_87__ent_1412](reports/rel_222.md#rel_222__ent_87__ent_1412): Does the omitted object establish a message or statement addressed to this recipient?
- [rel_355__ent_180__ent_189](reports/rel_355.md#rel_355__ent_180__ent_189): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_586__ent_189](reports/rel_355.md#rel_355__ent_586__ent_189): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_1393__ent_820](reports/rel_355.md#rel_355__ent_1393__ent_820): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_817__ent_1282](reports/rel_355.md#rel_355__ent_817__ent_1282): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_23__ent_467](reports/rel_355.md#rel_355__ent_23__ent_467): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_603__ent_467](reports/rel_355.md#rel_355__ent_603__ent_467): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_537__ent_99](reports/rel_355.md#rel_355__ent_537__ent_99): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_355__ent_1239__ent_586](reports/rel_355.md#rel_355__ent_1239__ent_586): Was the sent/submitted object communicative, and who was its actual addressee?
- [rel_55__ent_1210__ent_308](reports/rel_55.md#rel_55__ent_1210__ent_308): Does the omitted context establish athletic participation rather than coaching or another role?
- [rel_55__ent_1399__ent_308](reports/rel_55.md#rel_55__ent_1399__ent_308): Does the omitted context establish athletic participation rather than coaching or another role?
- [rel_55__ent_1325__ent_543](reports/rel_55.md#rel_55__ent_1325__ent_543): Does the omitted context establish athletic participation rather than coaching or another role?
- [rel_55__ent_66__ent_1080](reports/rel_55.md#rel_55__ent_66__ent_1080): Does the omitted context establish athletic participation rather than coaching or another role?
- [rel_68__ent_130__ent_372](reports/rel_68.md#rel_68__ent_130__ent_372): Which person and institution should this merged fact identify?
- [rel_68__ent_662__ent_37](reports/rel_68.md#rel_68__ent_662__ent_37): Does the argument denote the political body/collective, and what is its complete name?
- [rel_68__ent_1007__ent_1008](reports/rel_68.md#rel_68__ent_1007__ent_1008): Which person and institution should this merged fact identify?
- [rel_68__ent_67__ent_1384](reports/rel_68.md#rel_68__ent_67__ent_1384): Does the argument denote the political body/collective, and what is its complete name?
- [rel_97__ent_235__ent_1270](reports/rel_97.md#rel_97__ent_235__ent_1270): Does Hicks identify the firm rather than a person in this local row?
- [rel_272__ent_507__ent_573](reports/rel_272.md#rel_272__ent_507__ent_573): What organization and full geographic argument does the source construction identify?
- [rel_272__ent_703__ent_953](reports/rel_272.md#rel_272__ent_703__ent_953): Does this firm modifier assert physical location on Wall Street?
- [rel_349__ent_253__ent_167](reports/rel_349.md#rel_349__ent_253__ent_167): Which pair should the inferred fact identify after separating the incompatible names?
- [rel_349__ent_842__ent_1331](reports/rel_349.md#rel_349__ent_842__ent_1331): Which pair should the inferred fact identify after separating the incompatible names?
- [rel_390__ent_1188__ent_1139](reports/rel_390.md#rel_390__ent_1188__ent_1139): Does Shakespeare Theater identify the artistic producer whose work was reviewed, or only a venue?
- [rel_61__ent_7__ent_485](reports/rel_61.md#rel_61__ent_7__ent_485): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_61__ent_7__ent_488](reports/rel_61.md#rel_61__ent_7__ent_488): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_61__ent_7__ent_243](reports/rel_61.md#rel_61__ent_7__ent_243): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_61__ent_1269__ent_244](reports/rel_61.md#rel_61__ent_1269__ent_244): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_61__ent_386__ent_1170](reports/rel_61.md#rel_61__ent_386__ent_1170): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_61__ent_246__ent_1171](reports/rel_61.md#rel_61__ent_246__ent_1171): Who is the actual individual chair/head, and which rows belong to that person?
- [rel_242__ent_263__ent_486](reports/rel_242.md#rel_242__ent_263__ent_486): Which individual does Republican identify in these leadership rows?
- [rel_370__ent_1028__ent_175](reports/rel_370.md#rel_370__ent_1028__ent_175): What institution is omitted between the director and the named personal principal?
- [rel_370__ent_12__ent_15](reports/rel_370.md#rel_370__ent_12__ent_15): Which institution does Modern denote?
- [rel_4__ent_1315__ent_1063](reports/rel_4.md#rel_4__ent_1315__ent_1063): Does trail refer to an actual game against this opponent?
- [rel_4__ent_1282__ent_1013](reports/rel_4.md#rel_4__ent_1282__ent_1013): Was this game played rather than merely scheduled?
- [rel_65__ent_293__ent_10](reports/rel_65.md#rel_65__ent_293__ent_10): Does the source identify Germany as a physical location, or only German affiliation?
- [rel_65__ent_293__ent_522](reports/rel_65.md#rel_65__ent_293__ent_522): Does the source identify Germany as a physical location, or only German affiliation?
- [rel_148__ent_1004__ent_324](reports/rel_148.md#rel_148__ent_1004__ent_324): Which rows denote the city and which denote a New York team?
- [rel_148__ent_827__ent_1422](reports/rel_148.md#rel_148__ent_827__ent_1422): Does leave refer to physically departing the building or to leaving the administration?
- [rel_243__ent_497__ent_1203](reports/rel_243.md#rel_243__ent_497__ent_1203): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_25__ent_939](reports/rel_243.md#rel_243__ent_25__ent_939): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_999__ent_213](reports/rel_243.md#rel_243__ent_999__ent_213): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_1384__ent_67](reports/rel_243.md#rel_243__ent_1384__ent_67): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_1074__ent_1203](reports/rel_243.md#rel_243__ent_1074__ent_1203): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_37__ent_662](reports/rel_243.md#rel_243__ent_37__ent_662): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_1074__ent_1291](reports/rel_243.md#rel_243__ent_1074__ent_1291): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_98__ent_1076](reports/rel_243.md#rel_243__ent_98__ent_1076): What is the complete country, government or collective identified by this adjectival argument?
- [rel_243__ent_1075__ent_521](reports/rel_243.md#rel_243__ent_1075__ent_521): What is the complete country, government or collective identified by this adjectival argument?
- [rel_265__ent_157__ent_634](reports/rel_265.md#rel_265__ent_157__ent_634): Should the Zimbalist/Smith College fact be separated from Bush/Kerry?
- [rel_367__ent_1314__ent_577](reports/rel_367.md#rel_367__ent_1314__ent_577): Does voice here mean the institution's actual spokesperson?
- [rel_224__ent_1266__ent_537](reports/rel_224.md#rel_224__ent_1266__ent_537): Which subject and target should the accusation fact identify after splitting incompatible names?
- [rel_224__ent_182__ent_1002](reports/rel_224.md#rel_224__ent_182__ent_1002): Which subject and target should the accusation fact identify after splitting incompatible names?
- [rel_235__ent_1004__ent_1270](reports/rel_235.md#rel_235__ent_1004__ent_1270): Which opponent should this fact identify?
- [rel_235__ent_888__ent_333](reports/rel_235.md#rel_235__ent_888__ent_333): Does Manhattan denote a sports opponent or a place, and which John is meant?
- [rel_235__ent_446__ent_557](reports/rel_235.md#rel_235__ent_446__ent_557): Did this encounter occur?
- [rel_290__ent_1162__ent_1088](reports/rel_290.md#rel_290__ent_1162__ent_1088): Does the untyped dependency describe a firm located in Cambridge, or another relation to Cambridge?
- [rel_180__ent_1247__ent_1270](reports/rel_180.md#rel_180__ent_1247__ent_1270): Which person/organization pair should be retained after resolving the merged identities?
- [rel_180__ent_1017__ent_1409](reports/rel_180.md#rel_180__ent_1017__ent_1409): Which person/organization pair should be retained after resolving the merged identities?
- [rel_180__ent_290__ent_11](reports/rel_180.md#rel_180__ent_290__ent_11): Does the source explicitly locate the company in the Netherlands?
- [rel_339__ent_1247__ent_1270](reports/rel_339.md#rel_339__ent_1247__ent_1270): What asset in Dallas was actually owned?
- [rel_339__ent_593__ent_112](reports/rel_339.md#rel_339__ent_593__ent_112): Which named establishment does Tavern identify?
- [rel_16__ent_827__ent_1213](reports/rel_16.md#rel_16__ent_827__ent_1213): What was offered/given, and was it a communication addressed to this recipient?
- [rel_16__ent_1196__ent_1005](reports/rel_16.md#rel_16__ent_1196__ent_1005): What was offered/given, and was it a communication addressed to this recipient?
- [rel_16__ent_1117__ent_1331](reports/rel_16.md#rel_16__ent_1117__ent_1331): What was offered/given, and was it a communication addressed to this recipient?
- [rel_91__ent_263__ent_1172](reports/rel_91.md#rel_91__ent_263__ent_1172): Who is the officeholder and which Senate committee is meant?
- [rel_91__ent_1426__ent_243](reports/rel_91.md#rel_91__ent_1426__ent_243): Which named person holds this leadership office?
- [rel_91__ent_1269__ent_1171](reports/rel_91.md#rel_91__ent_1269__ent_1171): Which named person holds this leadership office?
- [rel_91__ent_878__ent_462](reports/rel_91.md#rel_91__ent_878__ent_462): Does lead denote a formal leadership office or athletic performance?
- [rel_91__ent_1399__ent_462](reports/rel_91.md#rel_91__ent_1399__ent_462): Does lead denote a formal leadership office or athletic performance?
- [rel_91__ent_1411__ent_1005](reports/rel_91.md#rel_91__ent_1411__ent_1005): Does lead denote a formal leadership office or athletic performance?
- [rel_91__ent_241__ent_953](reports/rel_91.md#rel_91__ent_241__ent_953): Does lead denote a formal leadership office or athletic performance?
- [rel_91__ent_1116__ent_110](reports/rel_91.md#rel_91__ent_1116__ent_110): Does lead denote a formal leadership office or athletic performance?
- [rel_91__ent_263__ent_244](reports/rel_91.md#rel_91__ent_263__ent_244): Which named person holds this leadership office?
- [rel_91__ent_925__ent_1171](reports/rel_91.md#rel_91__ent_925__ent_1171): Which named person holds this leadership office?
- [rel_379__ent_669__ent_202](reports/rel_379.md#rel_379__ent_669__ent_202): Should Europe and diabetes be separated into distinct inferred entities?
- [rel_8__ent_844__ent_1002](reports/rel_8.md#rel_8__ent_844__ent_1002): Is the city a represented governmental jurisdiction or merely the lawyer's practice location?
- [rel_8__ent_601__ent_1401](reports/rel_8.md#rel_8__ent_601__ent_1401): Is the city a represented governmental jurisdiction or merely the lawyer's practice location?
- [rel_82__ent_1431__ent_905](reports/rel_82.md#rel_82__ent_1431__ent_905): Should Cubans and Salvadorans be separate inferred population entities?
- [rel_27__ent_263__ent_1171](reports/rel_27.md#rel_27__ent_263__ent_1171): Who held the stated chairmanship?
- [rel_27__ent_1444__ent_245](reports/rel_27.md#rel_27__ent_1444__ent_245): Who held the stated chairmanship?
- [rel_27__ent_4__ent_35](reports/rel_27.md#rel_27__ent_4__ent_35): Which complete Palestinian institution is meant?
- [rel_232__ent_470__ent_1004](reports/rel_232.md#rel_232__ent_470__ent_1004): Should Mariners and Willie Randolph be split into separate entities?
- [rel_232__ent_30__ent_1406](reports/rel_232.md#rel_232__ent_30__ent_1406): Who or what does Georgia identify in this meeting?
- [rel_14__ent_1004__ent_682](reports/rel_14.md#rel_14__ent_1004__ent_682): Do these rows establish actual movement or only the proposed New Jersey relocation?
- [rel_24__ent_506__ent_429](reports/rel_24.md#rel_24__ent_506__ent_429): What asset does Los Angeles stand for in this ownership construction?
- [rel_89__ent_81__ent_84](reports/rel_89.md#rel_89__ent_81__ent_84): Was a Baghdad trip undertaken, or are these rows describing a rejected proposal?
- [rel_117__ent_1323__ent_333](reports/rel_117.md#rel_117__ent_1323__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_1100__ent_333](reports/rel_117.md#rel_117__ent_1100__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_403__ent_333](reports/rel_117.md#rel_117__ent_403__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_404__ent_333](reports/rel_117.md#rel_117__ent_404__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_646__ent_333](reports/rel_117.md#rel_117__ent_646__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_888__ent_333](reports/rel_117.md#rel_117__ent_888__ent_333): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_885__ent_280](reports/rel_117.md#rel_117__ent_885__ent_280): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_117__ent_887__ent_1008](reports/rel_117.md#rel_117__ent_887__ent_1008): Who is the named person, and does Manhattan modify that person or a different relative/institution?
- [rel_276__ent_1273__ent_1283](reports/rel_276.md#rel_276__ent_1273__ent_1283): Should Apple and Semiconductor Industry Association be separated?
- [rel_357__ent_1291__ent_497](reports/rel_357.md#rel_357__ent_1291__ent_497): Which complete political institution is meant by Yugoslav?
- [rel_174__ent_978__ent_171](reports/rel_174.md#rel_174__ent_978__ent_171): What is actually known by the alternative name in this row?
- [rel_310__ent_196__ent_189](reports/rel_310.md#rel_310__ent_196__ent_189): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_180__ent_189](reports/rel_310.md#rel_310__ent_180__ent_189): Do these rows establish Bush personally as speaker, or only his administration?
- [rel_310__ent_1278__ent_1107](reports/rel_310.md#rel_310__ent_1278__ent_1107): Do these rows establish Bush personally as speaker, or only his administration?
- [rel_310__ent_182__ent_189](reports/rel_310.md#rel_310__ent_182__ent_189): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_157__ent_1239](reports/rel_310.md#rel_310__ent_157__ent_1239): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_1330__ent_109](reports/rel_310.md#rel_310__ent_1330__ent_109): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_183__ent_1239](reports/rel_310.md#rel_310__ent_183__ent_1239): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_816__ent_827](reports/rel_310.md#rel_310__ent_816__ent_827): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_828__ent_1107](reports/rel_310.md#rel_310__ent_828__ent_1107): What was sent, and was it a communication addressed to this recipient?
- [rel_310__ent_1213__ent_313](reports/rel_310.md#rel_310__ent_1213__ent_313): Who gave the response and to whom was it directed?
- [rel_310__ent_1319__ent_839](reports/rel_310.md#rel_310__ent_1319__ent_839): What was sent, and was it a communication addressed to this recipient?
- [rel_123__ent_820__ent_451](reports/rel_123.md#rel_123__ent_820__ent_451): What returned to Egypt: the subject, people, or an omitted territory?
- [rel_123__ent_1382__ent_1442](reports/rel_123.md#rel_123__ent_1382__ent_1442): Does return/come to Broadway assert physical travel or resumption of a theatrical role?
- [rel_161__ent_1284__ent_1321](reports/rel_161.md#rel_161__ent_1284__ent_1321): Should House and Tom Daschle be separate inferred entities?
- [rel_205__ent_30__ent_1235](reports/rel_205.md#rel_205__ent_30__ent_1235): Which individual and complete political body should the fact identify?
- [rel_205__ent_33__ent_32](reports/rel_205.md#rel_205__ent_33__ent_32): What complete political body is meant by this adjective?
- [rel_205__ent_49__ent_1235](reports/rel_205.md#rel_205__ent_49__ent_1235): What complete political body is meant by this adjective?
- [rel_205__ent_31__ent_36](reports/rel_205.md#rel_205__ent_31__ent_36): What complete political body is meant by this adjective?
- [rel_205__ent_264__ent_36](reports/rel_205.md#rel_205__ent_264__ent_36): What complete political body is meant by this adjective?
- [rel_205__ent_1284__ent_36](reports/rel_205.md#rel_205__ent_1284__ent_36): What complete political body is meant by this adjective?
- [rel_273__ent_602__ent_333](reports/rel_273.md#rel_273__ent_602__ent_333): Which lawyer should this fact identify after separating the incompatible people?
- [rel_273__ent_606__ent_333](reports/rel_273.md#rel_273__ent_606__ent_333): Which lawyer should this fact identify after separating the incompatible people?
- [rel_273__ent_848__ent_333](reports/rel_273.md#rel_273__ent_848__ent_333): Which lawyer should this fact identify after separating the incompatible people?
- [rel_273__ent_511__ent_1008](reports/rel_273.md#rel_273__ent_511__ent_1008): Which lawyer should this fact identify after separating the incompatible people?
- [rel_9__ent_545__ent_787](reports/rel_9.md#rel_9__ent_545__ent_787): Is Intel itself described as based in Santa Clara?
- [rel_9__ent_12__ent_682](reports/rel_9.md#rel_9__ent_12__ent_682): Does this row establish the Yankees' location or merely a proposed move?
- [rel_190__ent_1150__ent_223](reports/rel_190.md#rel_190__ent_1150__ent_223): Did Sather personally succeed Trottier in the role, or select someone else to replace him?
- [rel_190__ent_105__ent_223](reports/rel_190.md#rel_190__ent_105__ent_223): Did Sather personally succeed Trottier in the role, or select someone else to replace him?
- [rel_285__ent_109__ent_522](reports/rel_285.md#rel_285__ent_109__ent_522): Which director/institution pair should the fact identify?
- [rel_381__ent_1353__ent_1002](reports/rel_381.md#rel_381__ent_1353__ent_1002): Which institution is Jendrzejczyk directing in Washington?
- [rel_66__ent_822__ent_821](reports/rel_66.md#rel_66__ent_822__ent_821): Who is the actual resident denoted by American?
- [rel_66__ent_1339__ent_824](reports/rel_66.md#rel_66__ent_1339__ent_824): Which person or population does this fact identify?
- [rel_66__ent_822__ent_835](reports/rel_66.md#rel_66__ent_822__ent_835): Who is the actual resident denoted by American?
- [rel_66__ent_823__ent_1393](reports/rel_66.md#rel_66__ent_823__ent_1393): Which person or population does this fact identify?
- [rel_95__ent_723__ent_965](reports/rel_95.md#rel_95__ent_723__ent_965): Which station or member organization does Channel identify?
- [rel_96__ent_356__ent_308](reports/rel_96.md#rel_96__ent_356__ent_308): Do these rows identify Ewing as an athlete for the Knicks?
- [rel_96__ent_1399__ent_462](reports/rel_96.md#rel_96__ent_1399__ent_462): Do these rows identify Ewing as an athlete for the Knicks?
- [rel_226__ent_994__ent_737](reports/rel_226.md#rel_226__ent_994__ent_737): Which boxer should this championship fact identify?
- [rel_311__ent_218__ent_1156](reports/rel_311.md#rel_311__ent_218__ent_1156): Does Press consistently refer to the complete program Meet the Press rather than a generic press interaction?
- [rel_311__ent_867__ent_1156](reports/rel_311.md#rel_311__ent_867__ent_1156): Does Press consistently refer to the complete program Meet the Press rather than a generic press interaction?
- [rel_384__ent_572__ent_1442](reports/rel_384.md#rel_384__ent_572__ent_1442): Does this assert physical travel or taking a Broadway role?
- [rel_87__ent_951__ent_325](reports/rel_87.md#rel_87__ent_951__ent_325): Was the person writing for the publication or merely being quoted in it?
- [rel_87__ent_1098__ent_325](reports/rel_87.md#rel_87__ent_1098__ent_325): Was the person writing for the publication or merely being quoted in it?
- [rel_144__ent_1312__ent_586](reports/rel_144.md#rel_144__ent_1312__ent_586): Does go denote physical movement to the building or joining the administration?
- [rel_144__ent_1382__ent_1442](reports/rel_144.md#rel_144__ent_1382__ent_1442): Does the Broadway move describe physical travel or an acting role?
- [rel_44__ent_285__ent_1282](reports/rel_44.md#rel_44__ent_285__ent_1282): Which manager should this fact identify?
- [rel_84__ent_784__ent_1307](reports/rel_84.md#rel_84__ent_784__ent_1307): Should Williamsburg and Bensonhurst be separate inferred places?
- [rel_141__ent_819__ent_816](reports/rel_141.md#rel_141__ent_819__ent_816): What specific action did these two political bodies undertake jointly?
- [rel_141__ent_1213__ent_819](reports/rel_141.md#rel_141__ent_1213__ent_819): What specific action did these two political bodies undertake jointly?
- [rel_141__ent_816__ent_819](reports/rel_141.md#rel_141__ent_816__ent_819): What specific action did these two political bodies undertake jointly?
- [rel_141__ent_819__ent_1265](reports/rel_141.md#rel_141__ent_819__ent_1265): What specific action did these two political bodies undertake jointly?
- [rel_141__ent_1197__ent_435](reports/rel_141.md#rel_141__ent_1197__ent_435): What specific action did these two political bodies undertake jointly?
- [rel_160__ent_970__ent_782](reports/rel_160.md#rel_160__ent_970__ent_782): Which person and employer should this analyst fact identify?
- [rel_173__ent_70__ent_71](reports/rel_173.md#rel_173__ent_70__ent_71): Which commission member should this fact identify?
- [rel_204__ent_1247__ent_790](reports/rel_204.md#rel_204__ent_1247__ent_790): Is Hicks/Muse a split company name, and what coherent predicate could relate its two arguments?
- [rel_204__ent_784__ent_534](reports/rel_204.md#rel_204__ent_784__ent_534): Are Goldman and Sachs fragments of one company name rather than a fact under an identifiable relation?
- [rel_204__ent_775__ent_905](reports/rel_204.md#rel_204__ent_775__ent_905): What substantive relation, if any, is asserted between WASHINGTON and United States?
- [rel_204__ent_775__ent_1314](reports/rel_204.md#rel_204__ent_775__ent_1314): Does WASHINGTON/State Department represent anything beyond reporting metadata?
- [rel_204__ent_1266__ent_818](reports/rel_204.md#rel_204__ent_1266__ent_818): What was transferred from Britain to China, and what predicate should this cluster represent?
- [rel_204__ent_1416__ent_1309](reports/rel_204.md#rel_204__ent_1416__ent_1309): Should this cluster mean death location, injury location or another predicate for Palestinians/Gaza?
- [rel_204__ent_989__ent_1332](reports/rel_204.md#rel_204__ent_989__ent_1332): Are these pieces of one corporate name, and what fact would the ordered pair express?
- [rel_204__ent_275__ent_27](reports/rel_204.md#rel_204__ent_275__ent_27): Should the cluster have an office predicate that applies to George Young/Giants?
- [rel_204__ent_393__ent_1433](reports/rel_204.md#rel_204__ent_393__ent_1433): Should the cluster have an ownership predicate for News Corporation/Fox?
- [rel_209__ent_130__ent_1304](reports/rel_209.md#rel_209__ent_130__ent_1304): Which actual chairperson is missing from the New York/BBDO extraction?
- [rel_264__ent_1266__ent_798](reports/rel_264.md#rel_264__ent_1266__ent_798): Does relationship here specifically mean diplomatic relations?
- [rel_306__ent_887__ent_333](reports/rel_306.md#rel_306__ent_887__ent_333): Who is the resident, and should Daniel and Corcoran Group be separate entities?
- [rel_306__ent_1100__ent_280](reports/rel_306.md#rel_306__ent_1100__ent_280): Which person and whose residence do these rows identify?
- [rel_306__ent_646__ent_280](reports/rel_306.md#rel_306__ent_646__ent_280): Does the place modify this named person or another relative in the obituary?
- [rel_306__ent_406__ent_280](reports/rel_306.md#rel_306__ent_406__ent_280): Does the place modify this named person or another relative in the obituary?
- [rel_93__ent_6__ent_1422](reports/rel_93.md#rel_93__ent_6__ent_1422): Do these rows establish institutional membership rather than physical entry or another person's staff role?
- [rel_93__ent_251__ent_586](reports/rel_93.md#rel_93__ent_251__ent_586): Do these rows establish institutional membership rather than physical entry or another person's staff role?
- [rel_93__ent_1444__ent_486](reports/rel_93.md#rel_93__ent_1444__ent_486): Which named committee member is intended?
- [rel_93__ent_263__ent_244](reports/rel_93.md#rel_93__ent_263__ent_244): Which named committee member is intended?
- [rel_93__ent_7__ent_243](reports/rel_93.md#rel_93__ent_7__ent_243): Which named committee member is intended?
- [rel_346__ent_426__ent_356](reports/rel_346.md#rel_346__ent_426__ent_356): Was Ewing fielded by Riley, and should the corporate pair be a separate fact?
- [rel_43__ent_499__ent_1008](reports/rel_43.md#rel_43__ent_499__ent_1008): Which person and institution does this presidency fact identify?
- [rel_43__ent_1203__ent_497](reports/rel_43.md#rel_43__ent_1203__ent_497): Which complete political body is intended?
- [rel_10__ent_6__ent_586](reports/rel_10.md#rel_10__ent_6__ent_586): Does leave White House here mean physical departure or the end of office?
- [rel_37__ent_1321__ent_1269](reports/rel_37.md#rel_37__ent_1321__ent_1269): Which named Senate leader is intended?
- [rel_37__ent_1197__ent_1213](reports/rel_37.md#rel_37__ent_1197__ent_1213): Which named Senate leader is intended?
- [rel_254__ent_634__ent_783](reports/rel_254.md#rel_254__ent_634__ent_783): Which analyst does this inferred fact identify?
- [rel_254__ent_301__ent_529](reports/rel_254.md#rel_254__ent_301__ent_529): Does follows for Merrill Lynch here specifically identify professional financial analysis?
- [rel_261__ent_1075__ent_1076](reports/rel_261.md#rel_261__ent_1075__ent_1076): Which complete country or political body is intended by the extracted adjective?
- [rel_261__ent_25__ent_939](reports/rel_261.md#rel_261__ent_25__ent_939): Which complete country or political body is intended by the extracted adjective?
- [rel_261__ent_999__ent_213](reports/rel_261.md#rel_261__ent_999__ent_213): Which complete country or political body is intended by the extracted adjective?
- [rel_261__ent_1074__ent_1203](reports/rel_261.md#rel_261__ent_1074__ent_1203): Which complete country or political body is intended by the extracted adjective?
- [rel_261__ent_37__ent_283](reports/rel_261.md#rel_261__ent_37__ent_283): Which complete country or political body is intended by the extracted adjective?
- [rel_269__ent_784__ent_323](reports/rel_269.md#rel_269__ent_784__ent_323): Which neighborhood should this fact identify?
- [rel_183__ent_1401__ent_421](reports/rel_183.md#rel_183__ent_1401__ent_421): Which named office and which parent firm does this fact intend?
- [rel_183__ent_1401__ent_1218](reports/rel_183.md#rel_183__ent_1401__ent_1218): What organization or named business unit is the subsidiary, rather than the city?
- [rel_221__ent_805__ent_1354](reports/rel_221.md#rel_221__ent_805__ent_1354): Who is the deceased person behind the Tony Awards extraction, and which pair should this fact identify?
- [rel_221__ent_286__ent_1188](reports/rel_221.md#rel_221__ent_286__ent_1188): Should Sydney Ullman and GENERATIONS Alice Elliott Dark be separated?
- [rel_322__ent_1254__ent_953](reports/rel_322.md#rel_322__ent_1254__ent_953): Is Wall Street a physical office location or a financial-industry description?
- [rel_368__ent_1151__ent_215](reports/rel_368.md#rel_368__ent_1151__ent_215): Which role did Lautenberg take over from Torricelli, and do these rows establish taking that role rather than replacement as a candidate?
- [rel_385__ent_843__ent_1304](reports/rel_385.md#rel_385__ent_843__ent_1304): What named business or branch office is the subsidiary?
- [rel_267__ent_1028__ent_175](reports/rel_267.md#rel_267__ent_1028__ent_175): Which campaign or organization is managed for Mr. Pataki?
- [rel_13__ent_251__ent_1422](reports/rel_13.md#rel_13__ent_251__ent_1422): Does this fact identify Kennedy's physical presence, and is Democrat the same person?
- [rel_227__ent_1322__ent_1172](reports/rel_227.md#rel_227__ent_1322__ent_1172): Which named committee member is intended?
- [rel_286__ent_843__ent_422](reports/rel_286.md#rel_286__ent_843__ent_422): Which full organization is Hill, and do the political-person rows refer to a different entity?
- [rel_104__ent_1046__ent_1350](reports/rel_104.md#rel_104__ent_1046__ent_1350): What was sent, and does it constitute support rather than neutral communication or transfer?
- [rel_104__ent_1393__ent_1421](reports/rel_104.md#rel_104__ent_1393__ent_1421): Does this fact intend Israel or Iran as the supported recipient?
- [rel_104__ent_313__ent_1239](reports/rel_104.md#rel_104__ent_313__ent_1239): What was sent, and does it constitute support rather than neutral communication or transfer?
- [rel_104__ent_1004__ent_1055](reports/rel_104.md#rel_104__ent_1004__ent_1055): What was sent, and does it constitute support rather than neutral communication or transfer?
- [rel_231__ent_1080__ent_1362](reports/rel_231.md#rel_231__ent_1080__ent_1362): Should this relation mean Internet business domain, and which company is intended?
- [rel_231__ent_950__ent_931](reports/rel_231.md#rel_231__ent_950__ent_931): Should the relation describe Bell corporate lineage, ownership, or an industry?
- [rel_231__ent_766__ent_1332](reports/rel_231.md#rel_231__ent_766__ent_1332): Are Kohlberg and Kravis one company-name fragment, and what directed fact should be evaluated?
- [rel_231__ent_414__ent_881](reports/rel_231.md#rel_231__ent_414__ent_881): Does this cluster intend a corporate ownership predicate for Disney/ABC?
- [rel_231__ent_887__ent_931](reports/rel_231.md#rel_231__ent_887__ent_931): Should the relation describe Bell corporate lineage, ownership, or an industry?
- [rel_231__ent_942__ent_324](reports/rel_231.md#rel_231__ent_942__ent_324): Should this relation express company location rather than industry or lineage?
- [rel_231__ent_516__ent_537](reports/rel_231.md#rel_231__ent_516__ent_537): Should this relation have any legal-office interpretation for Garcia/United States?
- [rel_15__ent_564__ent_500](reports/rel_15.md#rel_15__ent_564__ent_500): Which party nomination was sought for which county office?
- [rel_21__ent_1033__ent_661](reports/rel_21.md#rel_21__ent_1033__ent_661): Which office or business unit is meant by Washington?
- [rel_110__ent_6__ent_103](reports/rel_110.md#rel_110__ent_6__ent_103): Does put in the White House describe physical movement or election to office?
- [rel_200__ent_1212__ent_977](reports/rel_200.md#rel_200__ent_1212__ent_977): Is the intended relation diplomatic representation, troop transfer, support or something else?
- [rel_200__ent_1004__ent_735](reports/rel_200.md#rel_200__ent_1004__ent_735): Does the relation describe player assignment or a different kind of transfer?
- [rel_200__ent_829__ent_189](reports/rel_200.md#rel_200__ent_829__ent_189): Should this cluster be interpreted as directed communication to Congress?
- [rel_200__ent_142__ent_1239](reports/rel_200.md#rel_200__ent_142__ent_1239): What was sent to Congress and what predicate should the cluster express?
- [rel_245__ent_285__ent_321](reports/rel_245.md#rel_245__ent_285__ent_321): Which Mets manager should this fact identify?
- [rel_301__ent_1002__ent_183](reports/rel_301.md#rel_301__ent_1002__ent_183): Is Washington a dateline, a political actor, or a missing named official?
- [rel_301__ent_84__ent_715](reports/rel_301.md#rel_301__ent_84__ent_715): Should the cluster mean ministry location, reporting attribution or a political relation?
- [rel_301__ent_1002__ent_1314](reports/rel_301.md#rel_301__ent_1002__ent_1314): Is there a substantive relation here beyond dateline and quoted institution?
- [rel_301__ent_1125__ent_324](reports/rel_301.md#rel_301__ent_1125__ent_324): Should this relation be interpreted as event location, and does the row assert an actual or proposed event?
- [rel_376__ent_298__ent_19](reports/rel_376.md#rel_376__ent_298__ent_19): Does direct here establish an institutional director office or direction of a particular artistic work?
- [rel_388__ent_1339__ent_821](reports/rel_388.md#rel_388__ent_1339__ent_821): Does American identify a person or a company, and which entity is present in London?
- [rel_388__ent_225__ent_824](reports/rel_388.md#rel_388__ent_225__ent_824): Which American person is present in Paris?
- [rel_0__ent_1055__ent_1173](reports/rel_0.md#rel_0__ent_1055__ent_1173): Which deceased person and hospital should this inferred fact identify?
- [rel_0__ent_829__ent_1087](reports/rel_0.md#rel_0__ent_829__ent_1087): Which deceased person and hospital should this inferred fact identify?
- [rel_35__ent_1412__ent_708](reports/rel_35.md#rel_35__ent_1412__ent_708): Does the minister hold the leadership role required by this narrower political-leader predicate?
- [rel_86__ent_739__ent_741](reports/rel_86.md#rel_86__ent_739__ent_741): Which horse actually participated, and should Real Quiet and Unbridled/Unbridled's Song be separate?
- [rel_210__ent_12__ent_321](reports/rel_210.md#rel_210__ent_12__ent_321): Which player was traded, and does this row express a player transfer to the second team?
- [rel_210__ent_1004__ent_1013](reports/rel_210.md#rel_210__ent_1004__ent_1013): Which player was traded, and does this row express a player transfer to the second team?
- [rel_210__ent_1282__ent_817](reports/rel_210.md#rel_210__ent_1282__ent_817): Which player was traded, and does this row express a player transfer to the second team?
- [rel_210__ent_470__ent_12](reports/rel_210.md#rel_210__ent_470__ent_12): Which player was traded, and does this row express a player transfer to the second team?
- [rel_210__ent_376__ent_1084](reports/rel_210.md#rel_210__ent_376__ent_1084): Which player was traded, and does this row express a player transfer to the second team?
- [rel_308__ent_662__ent_37](reports/rel_308.md#rel_308__ent_662__ent_37): Which complete political institution or group is intended?
- [rel_308__ent_67__ent_1384](reports/rel_308.md#rel_308__ent_67__ent_1384): Which complete political institution or group is intended?
- [rel_308__ent_1403__ent_35](reports/rel_308.md#rel_308__ent_1403__ent_35): Which complete political institution or group is intended?
- [rel_343__ent_264__ent_1235](reports/rel_343.md#rel_343__ent_264__ent_1235): Which complete political party or body does Democratic denote?
- [rel_49__ent_30__ent_36](reports/rel_49.md#rel_49__ent_30__ent_36): Which complete institution or party is intended?
- [rel_49__ent_380__ent_1280](reports/rel_49.md#rel_49__ent_380__ent_1280): Does this nomination approval establish actual chair tenure in the supplied text?
- [rel_60__ent_543__ent_590](reports/rel_60.md#rel_60__ent_543__ent_590): Should the relation express an office, speech attribution or something else for Nets/Rod Thorn?
- [rel_60__ent_586__ent_189](reports/rel_60.md#rel_60__ent_586__ent_189): Should this cluster represent institutional liaison between White House and Congress?
- [rel_60__ent_40__ent_1312](reports/rel_60.md#rel_60__ent_40__ent_1312): Should the cluster mean public-office affiliation or reporting attribution?
- [rel_60__ent_1197__ent_1284](reports/rel_60.md#rel_60__ent_1197__ent_1284): What substantive predicate, beyond reporting, connects Senate and Tom Daschle here?
- [rel_60__ent_65__ent_748](reports/rel_60.md#rel_60__ent_65__ent_748): Should this cluster describe rescue/survival, and how would that relate to its other dictionary paths?
- [rel_102__ent_476__ent_1318](reports/rel_102.md#rel_102__ent_476__ent_1318): Which person or population is traveling to China?
- [rel_312__ent_81__ent_84](reports/rel_312.md#rel_312__ent_81__ent_84): Was the trip to Baghdad undertaken, or is the sent-to wording part of the anticipated trip?
- [rel_318__ent_1125__ent_843](reports/rel_318.md#rel_318__ent_1125__ent_843): Does the text assert that an Olympics actually occurred in New York, or only a proposed hosting bid?
- [rel_321__ent_252__ent_280](reports/rel_321.md#rel_321__ent_252__ent_280): Which person does this presidency fact identify?
- [rel_321__ent_556__ent_798](reports/rel_321.md#rel_321__ent_556__ent_798): Whose presidency does the visit/alma-mater construction identify?
- [rel_41__ent_1318__ent_479](reports/rel_41.md#rel_41__ent_1318__ent_479): Does take assert achieved political control of the place or institution?
- [rel_41__ent_7__ent_586](reports/rel_41.md#rel_41__ent_7__ent_586): Does take assert achieved political control of the place or institution?
- [rel_69__ent_1397__ent_537](reports/rel_69.md#rel_69__ent_1397__ent_537): Who is the person immigrating or moving to the United States?
- [rel_80__ent_1401__ent_422](reports/rel_80.md#rel_80__ent_1401__ent_422): What named unit and full parent organization are intended?
- [rel_113__ent_1044__ent_106](reports/rel_113.md#rel_113__ent_1044__ent_106): What complete organization or research center is omitted from the second argument?
- [rel_113__ent_361__ent_360](reports/rel_113.md#rel_113__ent_361__ent_360): What complete organization or research center is omitted from the second argument?
- [rel_149__ent_182__ent_1085](reports/rel_149.md#rel_149__ent_182__ent_1085): Should Al Gore and Laura be separate entities, and which opponent is intended?
- [rel_176__ent_274__ent_308](reports/rel_176.md#rel_176__ent_274__ent_308): Does this manager role establish the organizational head/leader relation rather than managerial office only?
- [rel_17__ent_182__ent_519](reports/rel_17.md#rel_17__ent_182__ent_519): Does the text actually assert support by Mr. Bush, or only characterize his statement as a possible reward?
- [rel_127__ent_660__ent_623](reports/rel_127.md#rel_127__ent_660__ent_623): What named office or subsidiary is contained in Foote?
- [rel_193__ent_645__ent_333](reports/rel_193.md#rel_193__ent_645__ent_333): Which person is intended, and should the relation describe residence, kinship or travel?
- [rel_193__ent_273__ent_1004](reports/rel_193.md#rel_193__ent_273__ent_1004): Should the relation express contractual affiliation, speech or another team role?
- [rel_193__ent_1192__ent_82](reports/rel_193.md#rel_193__ent_1192__ent_82): Should this cluster describe reviewing works in a medium?
- [rel_193__ent_470__ent_29](reports/rel_193.md#rel_193__ent_470__ent_29): Should the cluster describe national affiliation or an assurance-giving relation?
- [rel_193__ent_569__ent_234](reports/rel_193.md#rel_193__ent_569__ent_234): Should the relation mean territorial claim, and how should that scope apply to the other paths?
- [rel_213__ent_894__ent_112](reports/rel_213.md#rel_213__ent_894__ent_112): What full institution is Tavern, and does preside describe managerial office there?
