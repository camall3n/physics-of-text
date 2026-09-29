# Complete census: audit_9c88162c7b22

[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)

**1746/1746 facts evaluated.** 1252 supported, 311 incorrect, 183 ambiguous. Exact census precision is **1252/1746 = 71.71%** with ambiguity counted incorrect, or **1435/1746 = 82.19%** with ambiguity counted supported.

These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.

Decided-only precision: 80.10%; decided coverage: 89.52%. Macro precision (equal relation weights): 63.12%–76.45%.

Top-relation row coverage: 7665/8516; coverage is not recall. Total expressed relations/facts in the saved world: 400/1942. Human overrides used: 0.

## Requested row-coverage prefixes

Every cutoff includes all facts in the smallest ranked prefix reaching the target. Whole relations can overshoot the requested coverage. Marginal scores cover only relations added since the previous cutoff; the first block starts after the preserved top20. Unresolved-predicate facts are included in A and N; their count is shown separately from case-level ambiguity.

| Target | k | Rows | Actual coverage | S | E | A | N | S/N | (S+A)/N | Unresolved relation facts | Added ranks | Added S/E/A/N | Added precision |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---|---|---|
| [57.00%](coverage_57.md) | 104 | 4874/8516 | 57.23% | 887 | 119 | 92 | 1098 | 80.78% | 89.16% | 6 | 21–104 | 576/93/65/734 | 78.47%–87.33% |
| [60.00%](coverage_60.md) | 115 | 5126/8516 | 60.19% | 931 | 128 | 101 | 1160 | 80.26% | 88.97% | 6 | 105–115 | 44/9/9/62 | 70.97%–85.48% |
| [70.00%](coverage_70.md) | 159 | 5976/8516 | 70.17% | 1064 | 176 | 122 | 1362 | 78.12% | 87.08% | 10 | 116–159 | 133/48/21/202 | 65.84%–76.24% |
| [80.00%](coverage_80.md) | 215 | 6815/8516 | 80.03% | 1155 | 228 | 158 | 1541 | 74.95% | 85.20% | 20 | 160–215 | 91/52/36/179 | 50.84%–70.95% |
| [90.00%](coverage_90.md) | 285 | 7665/8516 | 90.01% | 1252 | 311 | 183 | 1746 | 71.71% | 82.19% | 27 | 216–285 | 97/83/25/205 | 47.32%–59.51% |

Preserved top20: 311 S, 26 E, 27 A, N=364; 85.44%–92.86%. [Immutable previous assessment](prior_assessment.md).

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
| 21 | [moves or travels to (rel_179)](reports/rel_179.md) | travels_to | 9 | 3 | 0 | 12 | 75.00%–75.00% |
| 22 | [economist at organization (rel_91)](reports/rel_91.md) | economist_for | 14 | 1 | 0 | 15 | 93.33%–93.33% |
| 23 | [owns organization or asset (rel_206)](reports/rel_206.md) | owns | 13 | 0 | 0 | 13 | 100.00%–100.00% |
| 24 | [subsidiary or organizational unit of (rel_308)](reports/rel_308.md) | subsidiary_of | 14 | 0 | 1 | 15 | 93.33%–100.00% |
| 25 | [lives or has lived in (rel_362)](reports/rel_362.md) | resides_in | 15 | 0 | 0 | 15 | 100.00%–100.00% |
| 26 | [organization described by national affiliation (rel_387)](reports/rel_387.md) | organization_national_affiliation | 9 | 5 | 0 | 14 | 64.29%–64.29% |
| 27 | [coach of (rel_175)](reports/rel_175.md) | coach_of | 12 | 0 | 0 | 12 | 100.00%–100.00% |
| 28 | [editor of publication (rel_299)](reports/rel_299.md) | editor_of | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 29 | [political body has a leader (rel_331)](reports/rel_331.md) | has_political_leader | 11 | 1 | 0 | 12 | 91.67%–91.67% |
| 30 | [subsidiary or organizational unit of (rel_6)](reports/rel_6.md) | subsidiary_of | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 31 | [member of organization (rel_397)](reports/rel_397.md) | member_of | 5 | 6 | 0 | 11 | 45.45%–45.45% |
| 32 | [owns organization or asset (rel_222)](reports/rel_222.md) | owns | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 33 | [has spokesperson (rel_203)](reports/rel_203.md) | has_spokesperson | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 34 | [reviewed artistic output of (rel_219)](reports/rel_219.md) | reviews_artistic_output_of | 7 | 0 | 0 | 7 | 100.00%–100.00% |
| 35 | [directed communication to (rel_281)](reports/rel_281.md) | communicates_to | 7 | 2 | 2 | 11 | 63.64%–81.82% |
| 36 | [leader or organizational head of (rel_199)](reports/rel_199.md) | organizational_leader_of | 12 | 0 | 2 | 14 | 85.71%–100.00% |
| 37 | [lawyer or attorney for (rel_249)](reports/rel_249.md) | lawyer_for | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 38 | [met or encountered (rel_383)](reports/rel_383.md) | met_with | 10 | 2 | 1 | 13 | 76.92%–84.62% |
| 39 | [location of organization or its office (rel_27)](reports/rel_27.md) | location_of_organization | 7 | 3 | 0 | 10 | 70.00%–70.00% |
| 40 | [president of institution (rel_284)](reports/rel_284.md) | president_of | 6 | 1 | 2 | 9 | 66.67%–88.89% |
| 41 | [president of institution (rel_301)](reports/rel_301.md) | president_of | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 42 | [organization based or located in (rel_36)](reports/rel_36.md) | located_in | 11 | 0 | 0 | 11 | 100.00%–100.00% |
| 43 | [organization based or located in (rel_178)](reports/rel_178.md) | located_in | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 44 | [winner or champion of (rel_188)](reports/rel_188.md) | winner_of | 9 | 0 | 2 | 11 | 81.82%–100.00% |
| 45 | [professor or university teacher at (rel_230)](reports/rel_230.md) | professor_at | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 46 | [lives or has lived in (rel_14)](reports/rel_14.md) | resides_in | 4 | 1 | 6 | 11 | 36.36%–90.91% |
| 47 | [organization based or located in (rel_148)](reports/rel_148.md) | located_in | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 48 | [organization based or located in (rel_171)](reports/rel_171.md) | located_in | 9 | 1 | 0 | 10 | 90.00%–90.00% |
| 49 | [criticized or accused (rel_50)](reports/rel_50.md) | criticizes | 9 | 1 | 0 | 10 | 90.00%–90.00% |
| 50 | [participated in sporting event (rel_90)](reports/rel_90.md) | participated_in_sporting_event | 5 | 8 | 0 | 13 | 38.46%–38.46% |
| 51 | [leader or organizational head of (rel_184)](reports/rel_184.md) | organizational_leader_of | 0 | 1 | 7 | 8 | 0.00%–87.50% |
| 52 | [acted jointly with (rel_158)](reports/rel_158.md) | acted_jointly_with | 1 | 2 | 5 | 8 | 12.50%–75.00% |
| 53 | [moves or travels to (rel_17)](reports/rel_17.md) | travels_to | 7 | 2 | 2 | 11 | 63.64%–81.82% |
| 54 | [political body has a leader (rel_79)](reports/rel_79.md) | has_political_leader | 7 | 0 | 1 | 8 | 87.50%–100.00% |
| 55 | [chairperson of (rel_103)](reports/rel_103.md) | chairperson_of | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 56 | [contributed writing to publication (rel_351)](reports/rel_351.md) | writes_for | 7 | 2 | 1 | 10 | 70.00%–80.00% |
| 57 | [directed communication to (rel_268)](reports/rel_268.md) | communicates_to | 10 | 0 | 0 | 10 | 100.00%–100.00% |
| 58 | [subsidiary or organizational unit of (rel_314)](reports/rel_314.md) | subsidiary_of | 7 | 0 | 0 | 7 | 100.00%–100.00% |
| 59 | [managerial or leadership office in (rel_71)](reports/rel_71.md) | managerial_office_in | 10 | 3 | 0 | 13 | 76.92%–76.92% |
| 60 | [spokesperson for (rel_122)](reports/rel_122.md) | spokesperson_for | 9 | 0 | 1 | 10 | 90.00%–100.00% |
| 61 | [executive of (rel_131)](reports/rel_131.md) | executive_of | 9 | 2 | 0 | 11 | 81.82%–81.82% |
| 62 | [directed communication to (rel_164)](reports/rel_164.md) | communicates_to | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 63 | [moves or travels to (rel_176)](reports/rel_176.md) | travels_to | 5 | 3 | 0 | 8 | 62.50%–62.50% |
| 64 | [chairperson of (rel_385)](reports/rel_385.md) | chairperson_of | 7 | 1 | 0 | 8 | 87.50%–87.50% |
| 65 | [has or had wife (rel_40)](reports/rel_40.md) | has_wife | 5 | 0 | 1 | 6 | 83.33%–100.00% |
| 66 | [organization based or located in (rel_229)](reports/rel_229.md) | located_in | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 67 | [directed communication to (rel_238)](reports/rel_238.md) | communicates_to | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 68 | [directed communication to (rel_342)](reports/rel_342.md) | communicates_to | 8 | 1 | 0 | 9 | 88.89%–88.89% |
| 69 | [died in place (rel_384)](reports/rel_384.md) | died_in | 9 | 1 | 0 | 10 | 90.00%–90.00% |
| 70 | [directed communication to (rel_390)](reports/rel_390.md) | communicates_to | 5 | 0 | 2 | 7 | 71.43%–100.00% |
| 71 | [manager of institution (rel_34)](reports/rel_34.md) | manager_of | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 72 | [lawyer or attorney for (rel_43)](reports/rel_43.md) | lawyer_for | 6 | 0 | 1 | 7 | 85.71%–100.00% |
| 73 | [political body has a leader (rel_210)](reports/rel_210.md) | has_political_leader | 4 | 1 | 2 | 7 | 57.14%–85.71% |
| 74 | [has member (rel_70)](reports/rel_70.md) | has_member | 6 | 4 | 0 | 10 | 60.00%–60.00% |
| 75 | [known or named as (rel_96)](reports/rel_96.md) | known_as | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 76 | [political body has a leader (rel_98)](reports/rel_98.md) | has_political_leader | 0 | 0 | 6 | 6 | 0.00%–100.00% |
| 77 | [professor or university teacher at (rel_312)](reports/rel_312.md) | professor_at | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 78 | [political body has a leader (rel_234)](reports/rel_234.md) | has_political_leader | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 79 | [founder or co-founder of (rel_244)](reports/rel_244.md) | founder_of | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 80 | [leader or organizational head of (rel_276)](reports/rel_276.md) | organizational_leader_of | 8 | 0 | 0 | 8 | 100.00%–100.00% |
| 81 | [lawyer or attorney for (rel_395)](reports/rel_395.md) | lawyer_for | 6 | 0 | 1 | 7 | 85.71%–100.00% |
| 82 | [athlete plays for team (rel_32)](reports/rel_32.md) | athlete_for | 4 | 3 | 0 | 7 | 57.14%–57.14% |
| 83 | [member of organization (rel_38)](reports/rel_38.md) | member_of | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 84 | [born in (rel_86)](reports/rel_86.md) | born_in | 6 | 2 | 0 | 8 | 75.00%–75.00% |
| 85 | [practices law in place (rel_89)](reports/rel_89.md) | lawyer_in | 9 | 0 | 0 | 9 | 100.00%–100.00% |
| 86 | [participated in sporting event (rel_132)](reports/rel_132.md) | participated_in_sporting_event | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 87 | [managerial or leadership office in (rel_264)](reports/rel_264.md) | managerial_office_in | 2 | 5 | 2 | 9 | 22.22%–44.44% |
| 88 | [departed from (rel_285)](reports/rel_285.md) | departed_from | 2 | 6 | 2 | 10 | 20.00%–40.00% |
| 89 | [has coach (rel_335)](reports/rel_335.md) | has_coach | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 90 | [chairperson of (rel_26)](reports/rel_26.md) | chairperson_of | 7 | 1 | 0 | 8 | 87.50%–87.50% |
| 91 | [leader or organizational head of (rel_73)](reports/rel_73.md) | organizational_leader_of | 3 | 0 | 2 | 5 | 60.00%–100.00% |
| 92 | [owns organization or asset (rel_135)](reports/rel_135.md) | owns | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 93 | [politically controls (rel_174)](reports/rel_174.md) | politically_controls | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 94 | [moves or travels to (rel_279)](reports/rel_279.md) | travels_to | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 95 | [departed from (rel_365)](reports/rel_365.md) | departed_from | 3 | 3 | 0 | 6 | 50.00%–50.00% |
| 96 | [moves or travels to (rel_258)](reports/rel_258.md) | travels_to | 4 | 1 | 1 | 6 | 66.67%–83.33% |
| 97 | [has spokesperson (rel_393)](reports/rel_393.md) | has_spokesperson | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 98 | [member of organization (rel_185)](reports/rel_185.md) | member_of | 2 | 5 | 0 | 7 | 28.57%–28.57% |
| 99 | [managerial or leadership office in (rel_207)](reports/rel_207.md) | managerial_office_in | 6 | 2 | 2 | 10 | 60.00%–80.00% |
| 100 | [executive of (rel_130)](reports/rel_130.md) | executive_of | 4 | 0 | 1 | 5 | 80.00%–100.00% |
| 101 | [born in (rel_243)](reports/rel_243.md) | born_in | 12 | 0 | 0 | 12 | 100.00%–100.00% |
| 102 | [chairperson of (rel_348)](reports/rel_348.md) | chairperson_of | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 103 | [succeeded person in role (rel_391)](reports/rel_391.md) | succeeded_person | 3 | 0 | 2 | 5 | 60.00%–100.00% |
| 104 | [unresolved relation meaning (rel_181)](reports/rel_181.md) | unresolved_relation | 0 | 0 | 6 | 6 | 0.00%–100.00% |
| 105 | [lives or has lived in (rel_111)](reports/rel_111.md) | resides_in | 1 | 0 | 3 | 4 | 25.00%–100.00% |
| 106 | [died in place (rel_121)](reports/rel_121.md) | died_in | 11 | 2 | 1 | 14 | 78.57%–85.71% |
| 107 | [chairs or heads organization (rel_197)](reports/rel_197.md) | chairs_or_heads | 1 | 0 | 5 | 6 | 16.67%–100.00% |
| 108 | [president of institution (rel_277)](reports/rel_277.md) | president_of | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 109 | [director of organization (rel_291)](reports/rel_291.md) | director_of | 6 | 1 | 0 | 7 | 85.71%–85.71% |
| 110 | [politically controls (rel_300)](reports/rel_300.md) | politically_controls | 3 | 4 | 0 | 7 | 42.86%–42.86% |
| 111 | [directed communication to (rel_306)](reports/rel_306.md) | communicates_to | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 112 | [director of organization (rel_307)](reports/rel_307.md) | director_of | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 113 | [director of organization (rel_356)](reports/rel_356.md) | director_of | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 114 | [physically present in place (rel_371)](reports/rel_371.md) | present_in | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 115 | [departed from (rel_0)](reports/rel_0.md) | departed_from | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 116 | [criticized or accused (rel_4)](reports/rel_4.md) | criticizes | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 117 | [wins or holds sporting championship (rel_8)](reports/rel_8.md) | sporting_champion_of | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 118 | [analyst at organization (rel_12)](reports/rel_12.md) | analyst_for | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 119 | [subsidiary or organizational unit of (rel_76)](reports/rel_76.md) | subsidiary_of | 2 | 3 | 1 | 6 | 33.33%–50.00% |
| 120 | [moves or travels to (rel_140)](reports/rel_140.md) | travels_to | 4 | 0 | 1 | 5 | 80.00%–100.00% |
| 121 | [has spokesperson (rel_313)](reports/rel_313.md) | has_spokesperson | 2 | 1 | 1 | 4 | 50.00%–75.00% |
| 122 | [politically controls (rel_361)](reports/rel_361.md) | politically_controls | 3 | 3 | 1 | 7 | 42.86%–57.14% |
| 123 | [directed communication to (rel_368)](reports/rel_368.md) | communicates_to | 4 | 0 | 1 | 5 | 80.00%–100.00% |
| 124 | [organization based or located in (rel_31)](reports/rel_31.md) | located_in | 6 | 0 | 0 | 6 | 100.00%–100.00% |
| 125 | [moves or travels to (rel_78)](reports/rel_78.md) | travels_to | 2 | 2 | 1 | 5 | 40.00%–60.00% |
| 126 | [spokesperson for (rel_120)](reports/rel_120.md) | spokesperson_for | 2 | 0 | 1 | 3 | 66.67%–100.00% |
| 127 | [known or named as (rel_141)](reports/rel_141.md) | known_as | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 128 | [played at sporting venue (rel_189)](reports/rel_189.md) | played_at_sporting_venue | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 129 | [wins or holds sporting championship (rel_275)](reports/rel_275.md) | sporting_champion_of | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 130 | [organization based or located in (rel_319)](reports/rel_319.md) | located_in | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 131 | [political body has a leader (rel_329)](reports/rel_329.md) | has_political_leader | 1 | 0 | 3 | 4 | 25.00%–100.00% |
| 132 | [spokesperson for (rel_344)](reports/rel_344.md) | spokesperson_for | 5 | 0 | 1 | 6 | 83.33%–100.00% |
| 133 | [participated in sporting event (rel_369)](reports/rel_369.md) | participated_in_sporting_event | 5 | 2 | 0 | 7 | 71.43%–71.43% |
| 134 | [politically controlled by (rel_13)](reports/rel_13.md) | politically_controlled_by | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 135 | [official of institution (rel_46)](reports/rel_46.md) | official_of | 2 | 0 | 1 | 3 | 66.67%–100.00% |
| 136 | [subsidiary or organizational unit of (rel_54)](reports/rel_54.md) | subsidiary_of | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 137 | [political body has a leader (rel_107)](reports/rel_107.md) | has_political_leader | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 138 | [director of organization (rel_221)](reports/rel_221.md) | director_of | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 139 | [commented on (rel_251)](reports/rel_251.md) | commented_on | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 140 | [wins or holds sporting championship (rel_310)](reports/rel_310.md) | sporting_champion_of | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 141 | [founder or co-founder of (rel_352)](reports/rel_352.md) | founder_of | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 142 | [defeated opponent (rel_374)](reports/rel_374.md) | defeated | 4 | 0 | 1 | 5 | 80.00%–100.00% |
| 143 | [athlete plays for team (rel_379)](reports/rel_379.md) | athlete_for | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 144 | [unresolved relation meaning (rel_1)](reports/rel_1.md) | unresolved_relation | 0 | 0 | 4 | 4 | 0.00%–100.00% |
| 145 | [organization based or located in (rel_48)](reports/rel_48.md) | located_in | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 146 | [criticized or accused (rel_97)](reports/rel_97.md) | criticizes | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 147 | [subsidiary or organizational unit of (rel_157)](reports/rel_157.md) | subsidiary_of | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 148 | [leader or organizational head of (rel_293)](reports/rel_293.md) | organizational_leader_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 149 | [reviewed artistic output of (rel_311)](reports/rel_311.md) | reviews_artistic_output_of | 1 | 3 | 1 | 5 | 20.00%–40.00% |
| 150 | [subsidiary or organizational unit of (rel_330)](reports/rel_330.md) | subsidiary_of | 5 | 0 | 0 | 5 | 100.00%–100.00% |
| 151 | [director of organization (rel_334)](reports/rel_334.md) | director_of | 3 | 2 | 1 | 6 | 50.00%–66.67% |
| 152 | [president of institution (rel_63)](reports/rel_63.md) | president_of | 1 | 2 | 1 | 4 | 25.00%–50.00% |
| 153 | [played or competed against (rel_115)](reports/rel_115.md) | competed_against | 1 | 4 | 0 | 5 | 20.00%–20.00% |
| 154 | [played or competed against (rel_165)](reports/rel_165.md) | competed_against | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 155 | [managerial or leadership office in (rel_218)](reports/rel_218.md) | managerial_office_in | 1 | 3 | 1 | 5 | 20.00%–40.00% |
| 156 | [has lawyer or legal counsel (rel_220)](reports/rel_220.md) | has_lawyer | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 157 | [official of institution (rel_225)](reports/rel_225.md) | official_of | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 158 | [supports or endorses (rel_231)](reports/rel_231.md) | supports | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 159 | [moves or travels to (rel_245)](reports/rel_245.md) | travels_to | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 160 | [physically present in place (rel_270)](reports/rel_270.md) | present_in | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 161 | [politically controlled by (rel_295)](reports/rel_295.md) | politically_controlled_by | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 162 | [physically present in place (rel_357)](reports/rel_357.md) | present_in | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 163 | [leader or organizational head of (rel_18)](reports/rel_18.md) | organizational_leader_of | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 164 | [died in place (rel_45)](reports/rel_45.md) | died_in | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 165 | [has or had medical condition (rel_57)](reports/rel_57.md) | has_medical_condition | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 166 | [leader or organizational head of (rel_125)](reports/rel_125.md) | organizational_leader_of | 3 | 0 | 1 | 4 | 75.00%–100.00% |
| 167 | [unresolved relation meaning (rel_127)](reports/rel_127.md) | unresolved_relation | 0 | 0 | 3 | 3 | 0.00%–100.00% |
| 168 | [member of organization (rel_155)](reports/rel_155.md) | member_of | 5 | 1 | 0 | 6 | 83.33%–83.33% |
| 169 | [spokesperson for (rel_190)](reports/rel_190.md) | spokesperson_for | 4 | 1 | 0 | 5 | 80.00%–80.00% |
| 170 | [winner or champion of (rel_195)](reports/rel_195.md) | winner_of | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 171 | [leader or organizational head of (rel_215)](reports/rel_215.md) | organizational_leader_of | 1 | 0 | 1 | 2 | 50.00%–100.00% |
| 172 | [unresolved relation meaning (rel_248)](reports/rel_248.md) | unresolved_relation | 0 | 0 | 2 | 2 | 0.00%–100.00% |
| 173 | [directed communication to (rel_263)](reports/rel_263.md) | communicates_to | 3 | 2 | 0 | 5 | 60.00%–60.00% |
| 174 | [managerial or leadership office in (rel_309)](reports/rel_309.md) | managerial_office_in | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 175 | [winner or champion of (rel_350)](reports/rel_350.md) | winner_of | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 176 | [has lawyer or legal counsel (rel_42)](reports/rel_42.md) | has_lawyer | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 177 | [has or had wife (rel_53)](reports/rel_53.md) | has_wife | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 178 | [legal specialist in field (rel_77)](reports/rel_77.md) | legal_specialist_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 179 | [founder or co-founder of (rel_110)](reports/rel_110.md) | founder_of | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 180 | [location of organization or its office (rel_126)](reports/rel_126.md) | location_of_organization | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 181 | [chairperson of (rel_137)](reports/rel_137.md) | chairperson_of | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 182 | [trailed sporting competitor (rel_154)](reports/rel_154.md) | trailed_competitor | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 183 | [leader or organizational head of (rel_166)](reports/rel_166.md) | organizational_leader_of | 2 | 0 | 1 | 3 | 66.67%–100.00% |
| 184 | [event held in place (rel_223)](reports/rel_223.md) | event_held_in | 0 | 1 | 1 | 2 | 0.00%–50.00% |
| 185 | [director of organization (rel_228)](reports/rel_228.md) | director_of | 1 | 1 | 3 | 5 | 20.00%–80.00% |
| 186 | [broadcasts event (rel_233)](reports/rel_233.md) | broadcasts_event | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 187 | [outnumbers (rel_246)](reports/rel_246.md) | outnumbers | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 188 | [commented on (rel_273)](reports/rel_273.md) | commented_on | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 189 | [political body has a leader (rel_303)](reports/rel_303.md) | has_political_leader | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 190 | [executive of (rel_305)](reports/rel_305.md) | executive_of | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 191 | [has lawyer or legal counsel (rel_321)](reports/rel_321.md) | has_lawyer | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 192 | [succeeded person in role (rel_326)](reports/rel_326.md) | succeeded_person | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 193 | [born in (rel_341)](reports/rel_341.md) | born_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 194 | [broadcasts or carries program (rel_372)](reports/rel_372.md) | broadcasts_program | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 195 | [political body has a leader (rel_378)](reports/rel_378.md) | has_political_leader | 0 | 1 | 2 | 3 | 0.00%–66.67% |
| 196 | [has or had wife (rel_9)](reports/rel_9.md) | has_wife | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 197 | [director of organization (rel_20)](reports/rel_20.md) | director_of | 2 | 1 | 1 | 4 | 50.00%–75.00% |
| 198 | [lives or has lived in (rel_25)](reports/rel_25.md) | resides_in | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 199 | [politically controls (rel_37)](reports/rel_37.md) | politically_controls | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 200 | [moves or travels to (rel_56)](reports/rel_56.md) | travels_to | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 201 | [subsidiary or organizational unit of (rel_62)](reports/rel_62.md) | subsidiary_of | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 202 | [spokesperson for (rel_74)](reports/rel_74.md) | spokesperson_for | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 203 | [director of organization (rel_75)](reports/rel_75.md) | director_of | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 204 | [directed communication to (rel_95)](reports/rel_95.md) | communicates_to | 1 | 0 | 2 | 3 | 33.33%–100.00% |
| 205 | [fought military conflict against (rel_113)](reports/rel_113.md) | fought_war_against | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 206 | [political body has a leader (rel_114)](reports/rel_114.md) | has_political_leader | 0 | 0 | 3 | 3 | 0.00%–100.00% |
| 207 | [physically present in place (rel_116)](reports/rel_116.md) | present_in | 0 | 1 | 2 | 3 | 0.00%–66.67% |
| 208 | [political body has a leader (rel_118)](reports/rel_118.md) | has_political_leader | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 209 | [political body has a leader (rel_156)](reports/rel_156.md) | has_political_leader | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 210 | [unresolved relation meaning (rel_159)](reports/rel_159.md) | unresolved_relation | 0 | 0 | 3 | 3 | 0.00%–100.00% |
| 211 | [economist at organization (rel_161)](reports/rel_161.md) | economist_for | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 212 | [unresolved relation meaning (rel_173)](reports/rel_173.md) | unresolved_relation | 0 | 0 | 2 | 2 | 0.00%–100.00% |
| 213 | [confers authority on institution (rel_180)](reports/rel_180.md) | confers_authority_on | 0 | 1 | 2 | 3 | 0.00%–66.67% |
| 214 | [owns organization or asset (rel_213)](reports/rel_213.md) | owns | 0 | 1 | 1 | 2 | 0.00%–50.00% |
| 215 | [official of institution (rel_227)](reports/rel_227.md) | official_of | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 216 | [wins or holds sporting championship (rel_252)](reports/rel_252.md) | sporting_champion_of | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 217 | [sells to (rel_254)](reports/rel_254.md) | sells_to | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 218 | [known or named as (rel_255)](reports/rel_255.md) | known_as | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 219 | [physically present in place (rel_265)](reports/rel_265.md) | present_in | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 220 | [met or encountered (rel_274)](reports/rel_274.md) | met_with | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 221 | [defeated opponent (rel_289)](reports/rel_289.md) | defeated | 2 | 2 | 0 | 4 | 50.00%–50.00% |
| 222 | [departed from (rel_316)](reports/rel_316.md) | departed_from | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 223 | [organization based or located in (rel_323)](reports/rel_323.md) | located_in | 1 | 0 | 2 | 3 | 33.33%–100.00% |
| 224 | [organization based or located in (rel_375)](reports/rel_375.md) | located_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 225 | [athlete plays for team (rel_389)](reports/rel_389.md) | athlete_for | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 226 | [subsidiary or organizational unit of (rel_72)](reports/rel_72.md) | subsidiary_of | 1 | 3 | 0 | 4 | 25.00%–25.00% |
| 227 | [moves or travels to (rel_88)](reports/rel_88.md) | travels_to | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 228 | [organization based or located in (rel_108)](reports/rel_108.md) | located_in | 4 | 0 | 0 | 4 | 100.00%–100.00% |
| 229 | [coach of (rel_145)](reports/rel_145.md) | coach_of | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 230 | [political body has a leader (rel_150)](reports/rel_150.md) | has_political_leader | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 231 | [has athlete on team (rel_153)](reports/rel_153.md) | has_athlete | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 232 | [organization operates in industry or domain (rel_162)](reports/rel_162.md) | organization_operates_in_domain | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 233 | [population includes subgroup members (rel_168)](reports/rel_168.md) | population_includes | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 234 | [political body has a leader (rel_169)](reports/rel_169.md) | has_political_leader | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 235 | [unresolved relation meaning (rel_202)](reports/rel_202.md) | unresolved_relation | 0 | 0 | 3 | 3 | 0.00%–100.00% |
| 236 | [played or competed against (rel_247)](reports/rel_247.md) | competed_against | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 237 | [has or had wife (rel_250)](reports/rel_250.md) | has_wife | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 238 | [has lawyer or legal counsel (rel_262)](reports/rel_262.md) | has_lawyer | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 239 | [manager of institution (rel_381)](reports/rel_381.md) | manager_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 240 | [died in place (rel_16)](reports/rel_16.md) | died_in | 9 | 1 | 1 | 11 | 81.82%–90.91% |
| 241 | [played or competed against (rel_23)](reports/rel_23.md) | competed_against | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 242 | [entered agreement with (rel_33)](reports/rel_33.md) | agreed_with | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 243 | [directed communication to (rel_44)](reports/rel_44.md) | communicates_to | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 244 | [researches or analyzes topic (rel_52)](reports/rel_52.md) | researches_topic | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 245 | [met or encountered (rel_93)](reports/rel_93.md) | met_with | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 246 | [fought military conflict against (rel_144)](reports/rel_144.md) | fought_war_against | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 247 | [calls up players from team (rel_146)](reports/rel_146.md) | calls_up_players_from | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 248 | [flows into waterbody (rel_160)](reports/rel_160.md) | flows_into | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 249 | [spokesperson for (rel_170)](reports/rel_170.md) | spokesperson_for | 1 | 1 | 1 | 3 | 33.33%–66.67% |
| 250 | [confers authority on institution (rel_177)](reports/rel_177.md) | confers_authority_on | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 251 | [has policy towards (rel_214)](reports/rel_214.md) | has_policy_towards | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 252 | [manager of institution (rel_236)](reports/rel_236.md) | manager_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 253 | [organization based or located in (rel_240)](reports/rel_240.md) | located_in | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 254 | [unresolved relation meaning (rel_242)](reports/rel_242.md) | unresolved_relation | 0 | 0 | 2 | 2 | 0.00%–100.00% |
| 255 | [has minister (rel_260)](reports/rel_260.md) | has_minister | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 256 | [organization based or located in (rel_266)](reports/rel_266.md) | located_in | 3 | 0 | 0 | 3 | 100.00%–100.00% |
| 257 | [founder or co-founder of (rel_272)](reports/rel_272.md) | founder_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 258 | [lawyer or attorney for (rel_286)](reports/rel_286.md) | lawyer_for | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 259 | [spokesperson for (rel_366)](reports/rel_366.md) | spokesperson_for | 3 | 1 | 0 | 4 | 75.00%–75.00% |
| 260 | [lawyer or attorney for (rel_373)](reports/rel_373.md) | lawyer_for | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 261 | [wins or holds sporting championship (rel_392)](reports/rel_392.md) | sporting_champion_of | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 262 | [president of institution (rel_10)](reports/rel_10.md) | president_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 263 | [has lawyer or legal counsel (rel_55)](reports/rel_55.md) | has_lawyer | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 264 | [directed communication to (rel_65)](reports/rel_65.md) | communicates_to | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 265 | [dancer for company (rel_83)](reports/rel_83.md) | dancer_for | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 266 | [owns organization or asset (rel_92)](reports/rel_92.md) | owns | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 267 | [leader or organizational head of (rel_99)](reports/rel_99.md) | organizational_leader_of | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 268 | [dismissed person from role (rel_105)](reports/rel_105.md) | dismissed_person | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 269 | [leader or organizational head of (rel_106)](reports/rel_106.md) | organizational_leader_of | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 270 | [managerial or leadership office in (rel_142)](reports/rel_142.md) | managerial_office_in | 0 | 2 | 1 | 3 | 0.00%–33.33% |
| 271 | [political body has a leader (rel_143)](reports/rel_143.md) | has_political_leader | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 272 | [organization based or located in (rel_147)](reports/rel_147.md) | located_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 273 | [contributed writing to publication (rel_182)](reports/rel_182.md) | writes_for | 1 | 2 | 0 | 3 | 33.33%–33.33% |
| 274 | [physically present in place (rel_198)](reports/rel_198.md) | present_in | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 275 | [spokesperson for (rel_204)](reports/rel_204.md) | spokesperson_for | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 276 | [coach of (rel_217)](reports/rel_217.md) | coach_of | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 277 | [spokesperson for (rel_239)](reports/rel_239.md) | spokesperson_for | 2 | 0 | 0 | 2 | 100.00%–100.00% |
| 278 | [acted jointly with (rel_241)](reports/rel_241.md) | acted_jointly_with | 1 | 0 | 1 | 2 | 50.00%–100.00% |
| 279 | [strategist for institution (rel_290)](reports/rel_290.md) | strategist_for | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 280 | [unresolved relation meaning (rel_302)](reports/rel_302.md) | unresolved_relation | 0 | 0 | 2 | 2 | 0.00%–100.00% |
| 281 | [organization based or located in (rel_315)](reports/rel_315.md) | located_in | 2 | 1 | 0 | 3 | 66.67%–66.67% |
| 282 | [lives or has lived in (rel_320)](reports/rel_320.md) | resides_in | 1 | 1 | 0 | 2 | 50.00%–50.00% |
| 283 | [participated in sporting event (rel_327)](reports/rel_327.md) | participated_in_sporting_event | 2 | 3 | 0 | 5 | 40.00%–40.00% |
| 284 | [chairperson of (rel_353)](reports/rel_353.md) | chairperson_of | 0 | 2 | 2 | 4 | 0.00%–50.00% |
| 285 | [president of institution (rel_355)](reports/rel_355.md) | president_of | 1 | 1 | 0 | 2 | 50.00%–50.00% |

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
- [rel_308__ent_407__ent_649](reports/rel_308.md#rel_308__ent_407__ent_649): Does Chicago denote a specific DDB office, and what is its complete organizational name?
- [rel_281__ent_537__ent_99](reports/rel_281.md#rel_281__ent_537__ent_99): What did the United States send to Iran, and was it communicative information?
- [rel_281__ent_1004__ent_321](reports/rel_281.md#rel_281__ent_1004__ent_321): Did the Yankees send a message or instead transfer a player or object to the Mets?
- [rel_199__ent_389__ent_146](reports/rel_199.md#rel_199__ent_389__ent_146): Which complete District Council is led by Stanley Hill?
- [rel_199__ent_246__ent_1171](reports/rel_199.md#rel_199__ent_246__ent_1171): Which person does Illinois Democrat designate here?
- [rel_383__ent_232__ent_474](reports/rel_383.md#rel_383__ent_232__ent_474): Who or what is Georgia in the meeting with Ms. Garrison?
- [rel_284__ent_34__ent_37](reports/rel_284.md#rel_284__ent_34__ent_37): Does Soviet identify the Soviet Union or a particular soviet institution in these rows?
- [rel_284__ent_4__ent_35](reports/rel_284.md#rel_284__ent_4__ent_35): Which Palestinian organization or governing institution is meant by the president title?
- [rel_188__ent_983__ent_981](reports/rel_188.md#rel_188__ent_983__ent_981): What complete organization is named as the Nobel Peace Prize winner?
- [rel_188__ent_726__ent_607](reports/rel_188.md#rel_188__ent_726__ent_607): Which named competitor is referred to as Scot?
- [rel_14__ent_885__ent_333](reports/rel_14.md#rel_14__ent_885__ent_333): Does Manhattan describe this named person's residence or that of another relative in the original obituary?
- [rel_14__ent_404__ent_333](reports/rel_14.md#rel_14__ent_404__ent_333): Does Manhattan describe this named person's residence or that of another relative in the original obituary?
- [rel_14__ent_887__ent_333](reports/rel_14.md#rel_14__ent_887__ent_333): Does Manhattan describe this named person's residence or that of another relative in the original obituary?
- [rel_14__ent_406__ent_333](reports/rel_14.md#rel_14__ent_406__ent_333): Does the wife residence statement also identify William as residing in Manhattan?
- [rel_14__ent_888__ent_333](reports/rel_14.md#rel_14__ent_888__ent_333): Does Manhattan describe this named person's residence or that of another relative in the original obituary?
- [rel_14__ent_1100__ent_333](reports/rel_14.md#rel_14__ent_1100__ent_333): Does Manhattan describe this named person's residence or that of another relative in the original obituary?
- [rel_184__ent_264__ent_36](reports/rel_184.md#rel_184__ent_264__ent_36): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_268__ent_263](reports/rel_184.md#rel_184__ent_268__ent_263): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_31__ent_36](reports/rel_184.md#rel_184__ent_31__ent_36): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_30__ent_36](reports/rel_184.md#rel_184__ent_30__ent_36): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_49__ent_36](reports/rel_184.md#rel_184__ent_49__ent_36): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_265__ent_36](reports/rel_184.md#rel_184__ent_265__ent_36): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_184__ent_261__ent_263](reports/rel_184.md#rel_184__ent_261__ent_263): Which complete party organization or legislative caucus is identified by this leadership title?
- [rel_158__ent_815__ent_537](reports/rel_158.md#rel_158__ent_815__ent_537): What actual joint action did these two parties undertake together?
- [rel_158__ent_813__ent_537](reports/rel_158.md#rel_158__ent_813__ent_537): What actual joint action did these two parties undertake together?
- [rel_158__ent_96__ent_695](reports/rel_158.md#rel_158__ent_96__ent_695): What did India join Pakistan in doing, and was that action cooperative?
- [rel_158__ent_819__ent_816](reports/rel_158.md#rel_158__ent_819__ent_816): What actual joint action did these two parties undertake together?
- [rel_158__ent_816__ent_819](reports/rel_158.md#rel_158__ent_816__ent_819): What actual joint action did these two parties undertake together?
- [rel_17__ent_1123__ent_427](reports/rel_17.md#rel_17__ent_1123__ent_427): Do these rows describe Jonathan Pryce physically traveling to Broadway or returning to theatrical performance?
- [rel_17__ent_813__ent_818](reports/rel_17.md#rel_17__ent_813__ent_818): Is Britain itself returning, or is Britain returning territory to China?
- [rel_79__ent_263__ent_261](reports/rel_79.md#rel_79__ent_263__ent_261): Which Republican party organization or legislative caucus does the leader title identify?
- [rel_351__ent_1098__ent_325](reports/rel_351.md#rel_351__ent_1098__ent_325): Was Herbert Mitgang the author of the Times passage or a quoted speaker?
- [rel_122__ent_1048__ent_1049](reports/rel_122.md#rel_122__ent_1048__ent_1049): What complete Center for Science organization is represented by Caroline Smith DeWaal?
- [rel_40__ent_182__ent_433](reports/rel_40.md#rel_40__ent_182__ent_433): Do all Mr. Bush rows refer to the same individual, and which wife/mother/daughter attachments belong to Barbara?
- [rel_390__ent_180__ent_189](reports/rel_390.md#rel_390__ent_180__ent_189): What was sent to Congress, and does the omitted object establish communication rather than a physical transfer?
- [rel_390__ent_196__ent_189](reports/rel_390.md#rel_390__ent_196__ent_189): What was sent to Congress, and does the omitted object establish communication rather than a physical transfer?
- [rel_43__ent_844__ent_1002](reports/rel_43.md#rel_43__ent_844__ent_1002): Was John Dowd an attorney for Washington as a jurisdiction, or a private lawyer located in Washington?
- [rel_210__ent_813__ent_706](reports/rel_210.md#rel_210__ent_813__ent_706): Does the minister title identify a head of government or another qualifying political leadership office?
- [rel_210__ent_820__ent_709](reports/rel_210.md#rel_210__ent_820__ent_709): Does the minister title identify a head of government or another qualifying political leadership office?
- [rel_98__ent_497__ent_255](reports/rel_98.md#rel_98__ent_497__ent_255): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_98__ent_25__ent_939](reports/rel_98.md#rel_98__ent_25__ent_939): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_98__ent_932__ent_213](reports/rel_98.md#rel_98__ent_932__ent_213): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_98__ent_1074__ent_255](reports/rel_98.md#rel_98__ent_1074__ent_255): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_98__ent_1075__ent_1076](reports/rel_98.md#rel_98__ent_1075__ent_1076): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_98__ent_37__ent_34](reports/rel_98.md#rel_98__ent_37__ent_34): Which complete country or governmental body does the national adjective stand for in this leadership fact?
- [rel_395__ent_601__ent_843](reports/rel_395.md#rel_395__ent_601__ent_843): Does Sidney Kess represent New York as a jurisdiction, or practice privately in New York?
- [rel_264__ent_291__ent_182](reports/rel_264.md#rel_264__ent_291__ent_182): Which institution, campaign or office did this person direct for the named principal?
- [rel_264__ent_17__ent_827](reports/rel_264.md#rel_264__ent_17__ent_827): Which institution, campaign or office did this person direct for the named principal?
- [rel_285__ent_6__ent_586](reports/rel_285.md#rel_285__ent_6__ent_586): Does Bill Clinton leave the physical White House or end institutional service in these rows?
- [rel_285__ent_963__ent_1140](reports/rel_285.md#rel_285__ent_963__ent_1140): Does Richard Perle physically leave the Pentagon, or resign from an advisory role?
- [rel_73__ent_502__ent_743](reports/rel_73.md#rel_73__ent_502__ent_743): Does the supplied executive title mean the head executive of Nassau County or another executive office?
- [rel_73__ent_265__ent_36](reports/rel_73.md#rel_73__ent_265__ent_36): Which complete Democratic organization or caucus is co-chaired or led here?
- [rel_258__ent_667__ent_537](reports/rel_258.md#rel_258__ent_667__ent_537): Who is the emigrating or moving subject represented by Born?
- [rel_393__ent_586__ent_1039](reports/rel_393.md#rel_393__ent_586__ent_1039): Do these rows identify Scott McClellan as spokesman for the White House, or merely a speaker or relative associated with it?
- [rel_207__ent_17__ent_827](reports/rel_207.md#rel_207__ent_17__ent_827): What institution, mayoral office or campaign is the person director of?
- [rel_207__ent_299__ent_16](reports/rel_207.md#rel_207__ent_299__ent_16): What institution, mayoral office or campaign is the person director of?
- [rel_130__ent_501__ent_743](reports/rel_130.md#rel_130__ent_501__ent_743): Had Thomas R. Suozzi begun serving as Nassau County executive at the time of these statements?
- [rel_391__ent_1150__ent_223](reports/rel_391.md#rel_391__ent_1150__ent_223): Did Sather personally assume Trottier's role, or appoint another replacement?
- [rel_391__ent_105__ent_223](reports/rel_391.md#rel_391__ent_105__ent_223): Did Sather personally assume Trottier's role, or appoint another replacement?
- [rel_181__ent_111__ent_114](reports/rel_181.md#rel_181__ent_111__ent_114): Is the intended relation coaching, playing alongside, or another role, and which path establishes it?
- [rel_181__ent_356__ent_308](reports/rel_181.md#rel_181__ent_356__ent_308): What precise relation does carrying or taking the Knicks assert for Ewing?
- [rel_181__ent_308__ent_1005](reports/rel_181.md#rel_181__ent_308__ent_1005): Does taking the Bulls mean defeating them, facing them, or a different action?
- [rel_181__ent_273__ent_1004](reports/rel_181.md#rel_181__ent_273__ent_1004): Which defined role between Torre and the Yankees is asserted by the contract and take paths?
- [rel_181__ent_1173__ent_480](reports/rel_181.md#rel_181__ent_1173__ent_480): Should this relation represent political control, movement, or another meaning for Taliban and Kabul?
- [rel_181__ent_487__ent_333](reports/rel_181.md#rel_181__ent_487__ent_333): Does Muppets take Manhattan denote a work title, travel or some other predicate?
- [rel_111__ent_822__ent_821](reports/rel_111.md#rel_111__ent_822__ent_821): Which American person resides in London, and which rows instead describe the airline or another company?
- [rel_111__ent_822__ent_824](reports/rel_111.md#rel_111__ent_822__ent_824): Which identified American person lives in this place, and which rows refer to a base, embassy or another entity?
- [rel_111__ent_822__ent_835](reports/rel_111.md#rel_111__ent_822__ent_835): Which identified American person lives in this place, and which rows refer to a base, embassy or another entity?
- [rel_121__ent_636__ent_878](reports/rel_121.md#rel_121__ent_636__ent_878): Who is the deceased person associated with the Tony Awards reference in South Salem?
- [rel_197__ent_7__ent_488](reports/rel_197.md#rel_197__ent_7__ent_488): Which named Democrat or Republican holds the stated committee chair/head role?
- [rel_197__ent_263__ent_486](reports/rel_197.md#rel_197__ent_263__ent_486): Which named Democrat or Republican holds the stated committee chair/head role?
- [rel_197__ent_7__ent_243](reports/rel_197.md#rel_197__ent_7__ent_243): Which named Democrat or Republican holds the stated committee chair/head role?
- [rel_197__ent_7__ent_485](reports/rel_197.md#rel_197__ent_7__ent_485): Which named Democrat or Republican holds the stated committee chair/head role?
- [rel_197__ent_263__ent_244](reports/rel_197.md#rel_197__ent_263__ent_244): Which named Democrat or Republican holds the stated committee chair/head role?
- [rel_76__ent_843__ent_1104](reports/rel_76.md#rel_76__ent_843__ent_1104): Which New York office or organizational unit is the part of BBDO Worldwide?
- [rel_140__ent_1123__ent_427](reports/rel_140.md#rel_140__ent_1123__ent_427): Do these Broadway rows establish physical travel or only appearing in a production?
- [rel_313__ent_536__ent_336](reports/rel_313.md#rel_313__ent_536__ent_336): Is Richard Boucher speaking for the State Department or merely speaking at its location?
- [rel_361__ent_819__ent_811](reports/rel_361.md#rel_361__ent_819__ent_811): Does take the House explicitly mean gaining legislative political control here?
- [rel_368__ent_816__ent_189](reports/rel_368.md#rel_368__ent_816__ent_189): What was pushed through Congress, and did the sentence state communication to it?
- [rel_78__ent_820__ent_451](reports/rel_78.md#rel_78__ent_820__ent_451): Is Israel returning territory to Egypt, or does this assert actual movement of Israeli people to Egypt?
- [rel_120__ent_1030__ent_586](reports/rel_120.md#rel_120__ent_1030__ent_586): Does the secretary/public-face role explicitly authorize Ari Fleischer to speak for the White House?
- [rel_329__ent_492__ent_707](reports/rel_329.md#rel_329__ent_492__ent_707): Which minister office is identified, and does it qualify as political leadership under the declared scope?
- [rel_329__ent_96__ent_948](reports/rel_329.md#rel_329__ent_96__ent_948): Which minister office is identified, and does it qualify as political leadership under the declared scope?
- [rel_329__ent_820__ent_941](reports/rel_329.md#rel_329__ent_820__ent_941): Which minister office is identified, and does it qualify as political leadership under the declared scope?
- [rel_344__ent_176__ent_175](reports/rel_344.md#rel_344__ent_176__ent_175): Does the spokesman clause identify Michael McKeon as speaking for Pataki rather than merely discussing him?
- [rel_46__ent_84__ent_715](reports/rel_46.md#rel_46__ent_84__ent_715): Which named Interior Ministry official is speaking in the Baghdad-dateline rows?
- [rel_374__ent_646__ent_237](reports/rel_374.md#rel_374__ent_646__ent_237): Do David and Goliath identify the actual competitors, or stand figuratively for other named entities?
- [rel_1__ent_826__ent_234](reports/rel_1.md#rel_1__ent_826__ent_234): Should this cluster mean residence, political claims or another relation for Palestinians and East Jerusalem?
- [rel_1__ent_561__ent_320](reports/rel_1.md#rel_1__ent_561__ent_320): Which competitive predicate is intended, and does it require an actual result?
- [rel_1__ent_238__ent_400](reports/rel_1.md#rel_1__ent_238__ent_400): Should this fact be evaluated as coach affiliation, departure or another precise relation?
- [rel_1__ent_1028__ent_175](reports/rel_1.md#rel_1__ent_1028__ent_175): Is Mucha speaking for Pataki, accusing him, or referring to charges involving someone else?
- [rel_311__ent_1188__ent_802](reports/rel_311.md#rel_311__ent_1188__ent_802): Was the reviewed musical produced by Shakespeare Theater or only performed at its venue?
- [rel_334__ent_1028__ent_175](reports/rel_334.md#rel_334__ent_1028__ent_175): Which institution, campaign or office was Mucha director for?
- [rel_63__ent_784__ent_534](reports/rel_63.md#rel_63__ent_784__ent_534): Does Goldman identify a person holding office at Sachs, or are both words parts of the company Goldman Sachs?
- [rel_218__ent_30__ent_36](reports/rel_218.md#rel_218__ent_30__ent_36): Which complete Democratic organization or legislative body is the office held in?
- [rel_357__ent_493__ent_250](reports/rel_357.md#rel_357__ent_493__ent_250): Is heaven intended as a literal geographic place here, and what physical-presence claim is being asserted?
- [rel_125__ent_246__ent_1171](reports/rel_125.md#rel_125__ent_246__ent_1171): Which person is the Illinois Democrat chairing or running this committee?
- [rel_127__ent_1002__ent_183](reports/rel_127.md#rel_127__ent_1002__ent_183): What relation between Washington and the Administration is asserted beyond officials speaking there?
- [rel_127__ent_1002__ent_536](reports/rel_127.md#rel_127__ent_1002__ent_536): Does Washington designate a physical office location or only the reporting dateline for these remarks?
- [rel_127__ent_84__ent_715](reports/rel_127.md#rel_127__ent_84__ent_715): What fact about Baghdad and the Interior Ministry is intended, rather than a missing official or reporting location?
- [rel_215__ent_267__ent_263](reports/rel_215.md#rel_215__ent_267__ent_263): Which Republican organization or caucus did Trent Lott lead?
- [rel_248__ent_775__ent_537](reports/rel_248.md#rel_248__ent_775__ent_537): What proposition relates the city Washington to the United States beyond this reporting dateline?
- [rel_248__ent_775__ent_536](reports/rel_248.md#rel_248__ent_775__ent_536): Is there a city-to-institution fact here, or only an omitted departmental speaker and dateline?
- [rel_166__ent_268__ent_263](reports/rel_166.md#rel_166__ent_268__ent_263): Which Republican organization or caucus did Bruno lead?
- [rel_223__ent_1125__ent_843](reports/rel_223.md#rel_223__ent_1125__ent_843): Were these Olympics actually held in New York, or are the rows describing a hosting bid or future proposal?
- [rel_228__ent_348__ent_1045](reports/rel_228.md#rel_228__ent_348__ent_1045): What institution or center for the Study of the States does Steven Gold direct?
- [rel_228__ent_1044__ent_106](reports/rel_228.md#rel_228__ent_1044__ent_106): Which organization serving the homeless does Mary Brosnahan direct?
- [rel_228__ent_109__ent_1046](reports/rel_228.md#rel_228__ent_109__ent_1046): Which environmental organization does Adrienne Esposito direct?
- [rel_273__ent_819__ent_964](reports/rel_273.md#rel_273__ent_819__ent_964): Did Democrats make an explicit statement about Gephardt, or are the words and comments attributed to Gephardt himself?
- [rel_303__ent_497__ent_255](reports/rel_303.md#rel_303__ent_497__ent_255): Which complete Yugoslav political body is associated with the leadership title?
- [rel_326__ent_1151__ent_215](reports/rel_326.md#rel_326__ent_1151__ent_215): Did Lautenberg replace Torricelli as a candidate, as an officeholder, or in another role, and had that role begun?
- [rel_378__ent_37__ent_34](reports/rel_378.md#rel_378__ent_37__ent_34): Which complete political institution, country or party caucus does the adjective denote?
- [rel_378__ent_263__ent_261](reports/rel_378.md#rel_378__ent_263__ent_261): Which complete political institution, country or party caucus does the adjective denote?
- [rel_20__ent_389__ent_146](reports/rel_20.md#rel_20__ent_389__ent_146): Which complete District Council is Stanley Hill director of?
- [rel_74__ent_1039__ent_586](reports/rel_74.md#rel_74__ent_1039__ent_586): Does the relative-clause spokesman denote Scott McClellan, or another speaker?
- [rel_95__ent_96__ent_977](reports/rel_95.md#rel_95__ent_96__ent_977): Was India sending information, troops, aid or another object to Sri Lanka?
- [rel_95__ent_811__ent_1197](reports/rel_95.md#rel_95__ent_811__ent_1197): What did the House send to the Senate, and was it a communicative document or a transferred proceeding?
- [rel_114__ent_1074__ent_255](reports/rel_114.md#rel_114__ent_1074__ent_255): Which complete Serbian, Bosnian or Croatian governmental body does the first argument identify?
- [rel_114__ent_1075__ent_1076](reports/rel_114.md#rel_114__ent_1075__ent_1076): Which complete Serbian, Bosnian or Croatian governmental body does the first argument identify?
- [rel_114__ent_932__ent_213](reports/rel_114.md#rel_114__ent_932__ent_213): Which complete Serbian, Bosnian or Croatian governmental body does the first argument identify?
- [rel_116__ent_7__ent_586](reports/rel_116.md#rel_116__ent_7__ent_586): Which Democrat is meant, and does occupying the White House assert physical presence or holding office?
- [rel_116__ent_6__ent_586](reports/rel_116.md#rel_116__ent_6__ent_586): Are these White House occupancy rows literal physical presence or political-office descriptions?
- [rel_156__ent_820__ent_709](reports/rel_156.md#rel_156__ent_820__ent_709): Which minister office is meant, and had Olmert begun serving in an eligible political leadership role?
- [rel_159__ent_933__ent_936](reports/rel_159.md#rel_159__ent_933__ent_936): Should this relation mean an organization operating in the Internet field or a different precise relation?
- [rel_159__ent_67__ent_1138](reports/rel_159.md#rel_159__ent_67__ent_1138): Should the shared relation be leadership, and how should the two other families be distinguished?
- [rel_159__ent_826__ent_1102](reports/rel_159.md#rel_159__ent_826__ent_1102): Should this relation mean physical presence, injury location or another precisely defined predicate?
- [rel_173__ent_211__ent_452](reports/rel_173.md#rel_173__ent_211__ent_452): Should this cluster express a country having a political leader, or a person coaching a team?
- [rel_173__ent_944__ent_705](reports/rel_173.md#rel_173__ent_944__ent_705): Is coaching the intended relation, despite the equally competing inverse political-office dictionary family?
- [rel_180__ent_663__ent_1197](reports/rel_180.md#rel_180__ent_663__ent_1197): Which identified authority or right does the Constitution confer on the Senate in these rows?
- [rel_180__ent_663__ent_189](reports/rel_180.md#rel_180__ent_663__ent_189): What power or right is granted to Congress, rather than merely discussed under the Constitution?
- [rel_213__ent_935__ent_931](reports/rel_213.md#rel_213__ent_935__ent_931): Which specific Bell company is the ownership target of Ameritech here?
- [rel_265__ent_822__ent_835](reports/rel_265.md#rel_265__ent_822__ent_835): Which identified person or organization is American, and which England-presence evidence refers to that same entity?
- [rel_274__ent_198__ent_195](reports/rel_274.md#rel_274__ent_198__ent_195): Did Gorbachev actually meet Reagan in this event, rather than arrive for an expected summit?
- [rel_323__ent_570__ent_323](reports/rel_323.md#rel_323__ent_570__ent_323): Which organization is named East New York, rather than the neighborhood modifying a school or station?
- [rel_323__ent_293__ent_10](reports/rel_323.md#rel_323__ent_293__ent_10): Does German stand for Germany in the based-in statement, or modify another omitted place or institution?
- [rel_88__ent_667__ent_537](reports/rel_88.md#rel_88__ent_667__ent_537): Who is the person represented by Born who immigrates to the United States?
- [rel_150__ent_818__ent_708](reports/rel_150.md#rel_150__ent_818__ent_708): What leadership office beyond an unspecified minister did Qian Qichen hold in the described China relation?
- [rel_153__ent_308__ent_356](reports/rel_153.md#rel_153__ent_308__ent_356): Does Ewing refer to a player already on the Knicks roster, rather than a person they need or another role?
- [rel_169__ent_1197__ent_263](reports/rel_169.md#rel_169__ent_1197__ent_263): Which named Republican leader is the Senate’s second argument?
- [rel_202__ent_646__ent_237](reports/rel_202.md#rel_202__ent_646__ent_237): Should these David/Goliath rows be evaluated as a competitive outcome, and how is that reconciled with the tied coaching family?
- [rel_202__ent_946__ent_1090](reports/rel_202.md#rel_202__ent_946__ent_1090): Is coach-of the intended relation for the cluster despite its equally competing outcome paths?
- [rel_202__ent_896__ent_415](reports/rel_202.md#rel_202__ent_896__ent_415): Which coherent relation, if any, is intended for the Monsanto–St. Louis rows in this mixed cluster?
- [rel_16__ent_125__ent_367](reports/rel_16.md#rel_16__ent_125__ent_367): Which hospital is represented by N.Y. ) Hospital in the death-location statement?
- [rel_33__ent_183__ent_189](reports/rel_33.md#rel_33__ent_183__ent_189): Which administration entered the agreement with Congress?
- [rel_144__ent_492__ent_648](reports/rel_144.md#rel_144__ent_492__ent_648): Do these rows identify Iraq as the invader of Kuwait, rather than merely the target of measures imposed after the invasion?
- [rel_170__ent_756__ent_537](reports/rel_170.md#rel_170__ent_756__ent_537): Is Mary Jo White the spokeswoman, or the attorney whose office has another spokeswoman in this sentence?
- [rel_177__ent_663__ent_1197](reports/rel_177.md#rel_177__ent_663__ent_1197): Who receives the seat or mandate, and does the text actually confer any identified authority on the Senate itself?
- [rel_242__ent_39__ent_38](reports/rel_242.md#rel_242__ent_39__ent_38): Should this cluster express government ownership of Cnooc or geographic presence of professionals, and how should the unresolved Chinese owner be identified?
- [rel_242__ent_822__ent_824](reports/rel_242.md#rel_242__ent_822__ent_824): Which intended relation and identified American subject should govern these Paris professional-presence rows?
- [rel_260__ent_96__ent_948](reports/rel_260.md#rel_260__ent_96__ent_948): Is Vajpayee the minister of India, or the person contacted or opposed by India’s minister in these rows?
- [rel_142__ent_1044__ent_106](reports/rel_142.md#rel_142__ent_1044__ent_106): What institution represented by Homeless is Mary Brosnahan’s chair or managerial office attached to?
- [rel_241__ent_1197__ent_811](reports/rel_241.md#rel_241__ent_1197__ent_811): What specific action did the Senate undertake jointly with the House in these rows?
- [rel_302__ent_283__ent_321](reports/rel_302.md#rel_302__ent_283__ent_321): Should this relation mean manager-of for Dave Johnson, despite the exactly tied lawyer-for family?
- [rel_302__ent_659__ent_1112](reports/rel_302.md#rel_302__ent_659__ent_1112): Should this relation mean lawyer-for for Stephen Jones, despite the exactly tied manager-office family?
- [rel_353__ent_380__ent_0](reports/rel_353.md#rel_353__ent_380__ent_0): Had Greenspan begun holding this chairmanship, rather than only being confirmed for it?
- [rel_353__ent_380__ent_1133](reports/rel_353.md#rel_353__ent_380__ent_1133): Had Greenspan begun holding this chairmanship, rather than only being confirmed for it?
