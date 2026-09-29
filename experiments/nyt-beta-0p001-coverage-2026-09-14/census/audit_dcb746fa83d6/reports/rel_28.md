# audit_dcb746fa83d6 — rel_28: managerial or leadership office in

Predicate ID: managerial_office_in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

Complete census: 0 supported, 2 incorrect, 4 ambiguous; N=6. Precision 0/6=0.00% to 4/6=66.67%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 4 | poss\|&lt;-poss&lt;-faction-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| 2 | rcmod\|-&gt;rcmod-&gt;leader-&gt;amod-&gt;\|amod |
| 1 | appos\|-&gt;appos-&gt;confidante-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;counselor-&gt;poss-&gt;\|poss |
| 1 | appos\|-&gt;appos-&gt;incumbent-&gt;amod-&gt;\|amod |
| 1 | dep\|-&gt;dep-&gt;divine-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;attack-&gt;amod-&gt;\|amod |
| 1 | rcmod\|-&gt;rcmod-&gt;seek-&gt;dobj-&gt;nomination-&gt;amod-&gt;\|amod |
| 1 | trigger#protégé,adviser Karen_P._Hughes Mr._Bush source#Karen/NNP/PERSON_P./NNP/PERSON_Hughes/NNP/PERSON dest#Mr./NNP/PERSON_Bush/NNP/PERSON path#pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-protégé-&gt;appos-&gt;adviser-&gt;poss-&gt;\|poss sen#Mr._Wilkinson_,_32_,_is_a_protégé_of_Karen_P._Hughes_,_Mr._Bush_'s_longtime_adviser_,_and_his_appointment_puts_a_White_House_loyalist_with_Washington_experience_in_a_pivotal_position_at_the_Central_Command_,_which_is_based_in_Florida_and_which_will_be_charged_with_waging_and_winning_any_war_against_Saddam_Hussein_. lex#, pos#, lc#protégé_of rc#'s_longtime |

## Every evaluated fact

### rel_28__ent_1337__ent_1273

**All observed names:** Yasir Arafat → Palestine Liberation Organization (4)

Ordered IDs: Ent[ent_1337] → Ent[ent_1273]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [234](../raw_map.tsv:234) | Yasir Arafat | Palestine Liberation Organization | poss\|&lt;-poss&lt;-faction-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [2940](../raw_map.tsv:2940) | Yasir Arafat | Palestine Liberation Organization | poss\|&lt;-poss&lt;-faction-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5032](../raw_map.tsv:5032) | Yasir Arafat | Palestine Liberation Organization | poss\|&lt;-poss&lt;-faction-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [5739](../raw_map.tsv:5739) | Yasir Arafat | Palestine Liberation Organization | poss\|&lt;-poss&lt;-faction-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Yasir Arafat → Palestine Liberation Organization: Possessing a faction within the organization suggests influence but does not identify the actual managerial office or unambiguous management role.

Cited evidence lines: [234](../raw_map.tsv:234), [2940](../raw_map.tsv:2940), [5032](../raw_map.tsv:5032), [5739](../raw_map.tsv:5739).

**Review question:** Does the source state that Yasir Arafat heads or manages the organization or an identified faction, beyond the possessive faction wording?
Issue tags: omitted_role

### rel_28__ent_291__ent_119

**All observed names:** Karen P. Hughes → Mr. Bush (3)

Ordered IDs: Ent[ent_291] → Ent[ent_119]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3584](../raw_map.tsv:3584) | Karen P. Hughes | Mr. Bush | appos\|-&gt;appos-&gt;counselor-&gt;poss-&gt;\|poss |
| [3588](../raw_map.tsv:3588) | Karen P. Hughes | Mr. Bush | appos\|-&gt;appos-&gt;confidante-&gt;poss-&gt;\|poss |
| [3589](../raw_map.tsv:3589) | Karen P. Hughes | Mr. Bush | trigger#protégé,adviser Karen_P._Hughes Mr._Bush source#Karen/NNP/PERSON_P./NNP/PERSON_Hughes/NNP/PERSON dest#Mr./NNP/PERSON_Bush/NNP/PERSON path#pobj\|&lt;-pobj&lt;-of&lt;-prep&lt;-protégé-&gt;appos-&gt;adviser-&gt;poss-&gt;\|poss sen#Mr._Wilkinson_,_32_,_is_a_protégé_of_Karen_P._Hughes_,_Mr._Bush_'s_longtime_adviser_,_and_his_appointment_puts_a_White_House_loyalist_with_Washington_experience_in_a_pivotal_position_at_the_Central_Command_,_which_is_based_in_Florida_and_which_will_be_charged_with_waging_and_winning_any_war_against_Saddam_Hussein_. lex#, pos#, lc#protégé_of rc#'s_longtime |

**Judgment: incorrect** (primary). Karen P. Hughes → Mr. Bush: Counselor, confidante or adviser service and a geographic religious-person reference do not establish a managerial office.

Cited evidence lines: [3584](../raw_map.tsv:3584), [3588](../raw_map.tsv:3588), [3589](../raw_map.tsv:3589).




### rel_28__ent_31__ent_1216

**All observed names:** Harry Reid → Democratic (3)

Ordered IDs: Ent[ent_31] → Ent[ent_1216]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3720](../raw_map.tsv:3720) | Harry Reid | Democratic | appos\|-&gt;appos-&gt;incumbent-&gt;amod-&gt;\|amod |
| [3723](../raw_map.tsv:3723) | Harry Reid | Democratic | rcmod\|-&gt;rcmod-&gt;leader-&gt;amod-&gt;\|amod |
| [3724](../raw_map.tsv:3724) | Harry Reid | Democratic | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;attack-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Harry Reid → Democratic: Leadership language is present but Democratic is an incomplete institutional adjective rather than a clearly identified party body.

Cited evidence lines: [3720](../raw_map.tsv:3720), [3723](../raw_map.tsv:3723), [3724](../raw_map.tsv:3724).

**Review question:** Which complete political body does Democratic identify in this leadership statement?
Issue tags: argument_identity

### rel_28__ent_1419__ent_85

**All observed names:** Craig Hammerman → Community Board (1); Paul Goldstein → Community Board (1)

Ordered IDs: Ent[ent_1419] → Ent[ent_85]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3390](../raw_map.tsv:3390) | Paul Goldstein | Community Board | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |
| [3393](../raw_map.tsv:3393) | Craig Hammerman | Community Board | appos\|-&gt;appos-&gt;manager-&gt;prep-&gt;for-&gt;pobj-&gt;\|pobj |

**Judgment: ambiguous** (primary). Craig Hammerman → Community Board; Paul Goldstein → Community Board: Each row gives a manager role, but Paul Goldstein and Craig Hammerman are distinct named people merged in one latent subject.

Cited evidence lines: [3390](../raw_map.tsv:3390), [3393](../raw_map.tsv:3393).

**Review question:** Should Paul Goldstein and Craig Hammerman be separate people before evaluating their board managerial offices?
Issue tags: argument_identity

### rel_28__ent_264__ent_1305

**All observed names:** Richard A. Gephardt → Democratic (2)

Ordered IDs: Ent[ent_264] → Ent[ent_1305]; 2 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3756](../raw_map.tsv:3756) | Richard A. Gephardt | Democratic | rcmod\|-&gt;rcmod-&gt;seek-&gt;dobj-&gt;nomination-&gt;amod-&gt;\|amod |
| [3757](../raw_map.tsv:3757) | Richard A. Gephardt | Democratic | rcmod\|-&gt;rcmod-&gt;leader-&gt;amod-&gt;\|amod |

**Judgment: ambiguous** (primary). Richard A. Gephardt → Democratic: Leadership language is present but Democratic is an incomplete institutional adjective rather than a clearly identified party body.

Cited evidence lines: [3756](../raw_map.tsv:3756), [3757](../raw_map.tsv:3757).

**Review question:** Which complete political body does Democratic identify in this leadership statement?
Issue tags: argument_identity

### rel_28__ent_888__ent_312

**All observed names:** John → Manhattan (1)

Ordered IDs: Ent[ent_888] → Ent[ent_312]; 1 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [3968](../raw_map.tsv:3968) | John | Manhattan | dep\|-&gt;dep-&gt;divine-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). John → Manhattan: Counselor, confidante or adviser service and a geographic religious-person reference do not establish a managerial office.

Cited evidence lines: [3968](../raw_map.tsv:3968).



