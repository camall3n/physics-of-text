# Every changed judgment on a previously reviewed fact

[Comparison and interpretation](prior_comparison.md) · [Structured prior/current comparison](prior_comparison.json)

Each entry is an exact-source, exact-case match. A changed label may reflect a clearer common predicate scope, an identity/attachment correction, or a reviewer reassessment. The report does not automatically assign a causal category. All dictionaries and every case row are available through the linked evaluated relation report.

## nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260912

2/100 previously reviewed labels changed; 321 additional facts were evaluated.

### rel_274 — organizational_leader_of

[Full dictionary and all evidence](census/audit_dcb746fa83d6/reports/rel_274.md) · [Prior annotation](census/audit_dcb746fa83d6/prior_annotations/rel_274.json)

Prior declaration: **political or organizational leader of**. The first person is or was a political, organizational or community leader of the group, legislature or political body designated by the second argument. Leader-of/noun/possessive dominates. Preserve the earlier political-group scope, including legislative majority/minority leadership and adjectival group names when direct leadership paths establish the group connection. A generic political label is not a uniquely named person; incompatible personal names remain identity ambiguities. Do not infer formal state control from spiritual/community leadership or mere founding.

Current declaration: **leader or organizational head of**. Person X holds or held a leader, head, president, chief or chair office in group, institution, organization or political body Y. Includes: explicit leader/head/president/chief/chair; legislative majority/minority leadership or whip; leadership office within an identified body; historical office. Excludes: ordinary membership or service; founding/ownership alone; party control of a chamber; candidate alone; athletic/standings or task-only lead; editor alone. Ambiguous unless resolved by case-local evidence: generic director or executive without clear leadership role; bare lead lacking organizational-role context; materially truncated political body. Preserves the narrower leader/head family used in the two original full censuses; managerial_office_in separately accepts explicit director/executive titles.

- **rel_274__ent_1224__ent_69: supported → ambiguous.** Radovan Karadzic → Bosnian Serb. Source lines: [3054](census/audit_dcb746fa83d6/raw_map.tsv:3054), [3055](census/audit_dcb746fa83d6/raw_map.tsv:3055), [3056](census/audit_dcb746fa83d6/raw_map.tsv:3056), [3057](census/audit_dcb746fa83d6/raw_map.tsv:3057), [3061](census/audit_dcb746fa83d6/raw_map.tsv:3061).
  - Prior reason (prior_annotation): Karadzic is repeatedly a Bosnian Serb leader, including direct leader-of paths. Under the preserved adjectival political-group convention, this denotes leadership of the named group without inventing a fuller state name.
  - Current reason (primary): Radovan Karadzic → Bosnian Serb: The political argument is a singular nationality or truncated political descriptor, leaving the governed body or people underspecified.
  - Current question: What complete political body or people group does the argument denote?

- **rel_274__ent_34__ent_37: supported → ambiguous.** Mikhail S. Gorbachev → Soviet. Source lines: [3689](census/audit_dcb746fa83d6/raw_map.tsv:3689), [3692](census/audit_dcb746fa83d6/raw_map.tsv:3692), [3693](census/audit_dcb746fa83d6/raw_map.tsv:3693), [3695](census/audit_dcb746fa83d6/raw_map.tsv:3695).
  - Prior reason (prior_annotation): Direct leader-of and Soviet-leader/president descriptions support Gorbachev's leadership of the Soviet political body/group. The program-of-change row is additional mixed evidence; no exact state title beyond the supplied group designation is inferred.
  - Current reason (primary): Mikhail S. Gorbachev → Soviet: The political argument is a singular nationality or truncated political descriptor, leaving the governed body or people underspecified.
  - Current question: What complete political body or people group does the argument denote?

## nyt-latent-low-smoothing-2026-09-14/entityfix_latent_beta0001_seed20260913

2/100 previously reviewed labels changed; 336 additional facts were evaluated.

### rel_6 — defeated

[Full dictionary and all evidence](census/audit_e318fe663470/reports/rel_6.md) · [Prior annotation](census/audit_e318fe663470/prior_annotations/rel_6.json)

Prior declaration: **defeated opponent**. X defeated opposing competitor Y in at least one competitive contest. Preserves prior winner-to-opponent scope. Beat, defeat, completed sweep, outscore or victory over qualifies. Playing, facing, standings, losing, trades or transfers alone do not. A historical win remains supported when other rows describe losses; flag the mixed evidence. The largest individual path is play (26), with beat (16), loss-to (10), lose-to (9) and face (6). A broader played-against interpretation is plausible. This primary audit retains the previous defeated-opponent predicate for comparability; do not switch after seeing the five case judgments. Record the competing interpretation separately.

Current declaration: **defeated opponent**. Competitor X defeated opponent Y in at least one completed competitive contest. Includes: beat/defeat/trounce/rout/upset/victory over; completed sporting sweep/outlast/elimination; explicit electoral defeat of an opposing competitor; historical win despite losses in other games. Excludes: mere play/face/rivalry; standings or polling lead; losing to Y; winning an event rather than beating Y; political control or hostility alone. Ambiguous unless resolved by case-local evidence: bare outscore/surpass/shock without a completed-contest result; score margin for only one period; unclear geographic/team metonymy. Preserves the two full-census opponent-win scope, including electoral contests. Broader competed-against belongs only in a separately declared sensitivity where the prior primary was defeat.

- **rel_6__ent_543__ent_308: supported → ambiguous.** Nets → Knicks. Source lines: [944](census/audit_e318fe663470/raw_map.tsv:944), [946](census/audit_e318fe663470/raw_map.tsv:946).
  - Prior reason (prior_annotation): Nets explicitly outscore Knicks, supporting a competitive win; the play row alone is broader.
  - Current reason (primary): Nets → Knicks: Outscoring Knicks and playing them do not specify whether the scoring advantage covered the completed game or only part of it. The shared full-census criterion requires a completed win.
  - Current question: Does the outscore row describe the final game result or only a period of play?

### rel_175 — director_of

[Full dictionary and all evidence](census/audit_e318fe663470/reports/rel_175.md) · [Prior annotation](census/audit_e318fe663470/prior_annotations/rel_175.json)

Prior declaration: **director of organization**. Person X holds or held an explicit director office in organization or institution Y. Director-for/of/possessive/noun constructions are the leading family. Preserve the earlier director-specific scope. Spokesperson, adviser, confidante, lobbyist or chairwoman alone is a competing role; do not broaden to general affiliation.

Current declaration: **director of organization**. Person X holds or held an explicit director office of, for or at organization or institution Y. Includes: explicit director/co-director; functional directorship such as communications or research director within Y; historical office. Excludes: head/president/chair/executive alone; spokesperson/adviser/publisher/professor/member alone; performing or authorship alone. Ambiguous unless resolved by case-local evidence: personal principal with omitted organization; abstract topic in place of the actual institution. Does not require sole chief control of the entire institution.

- **rel_175__ent_363__ent_1023: supported → ambiguous.** David E. Cole → Study of Automotive Transportation. Source lines: [1760](census/audit_e318fe663470/raw_map.tsv:1760).
  - Prior reason (prior_annotation): Cole is explicitly director for the named Study of Automotive Transportation program/unit.
  - Current reason (primary): David E. Cole → Study of Automotive Transportation: Study of Automotive Transportation leaves the complete center or institutional name unresolved under the shared abstract-topic rule.
  - Current question: Which complete center or institution is meant by Study of Automotive Transportation?

## nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260912

1/100 previously reviewed labels changed; 1084 additional facts were evaluated.

### rel_24 — managerial_office_in

[Full dictionary and all evidence](census/audit_8c6806186e00/reports/rel_24.md) · [Prior annotation](census/audit_8c6806186e00/prior_annotations/rel_24.json)

Prior declaration: **managerial leadership in**. Person 1 holds or formerly held a managerial leadership office in organization 2. Director/head family dominates, with chair, president and manager paraphrases. Spokesperson, lawyer or aide alone does not establish leadership; names known-as and geographic relations are competing themes.

Current declaration: **managerial or leadership office in**. Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y. Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

- **rel_24__ent_1028__ent_175: incorrect → ambiguous.** Zenia Mucha → Mr. Pataki. Source lines: [1179](census/audit_8c6806186e00/raw_map.tsv:1179), [1181](census/audit_8c6806186e00/raw_map.tsv:1181), [1182](census/audit_8c6806186e00/raw_map.tsv:1182), [1183](census/audit_8c6806186e00/raw_map.tsv:1183), [1185](census/audit_8c6806186e00/raw_map.tsv:1185), [3519](census/audit_8c6806186e00/raw_map.tsv:3519), [3520](census/audit_8c6806186e00/raw_map.tsv:3520), [3522](census/audit_8c6806186e00/raw_map.tsv:3522), [3523](census/audit_8c6806186e00/raw_map.tsv:3523), [3524](census/audit_8c6806186e00/raw_map.tsv:3524), [3526](census/audit_8c6806186e00/raw_map.tsv:3526), [3528](census/audit_8c6806186e00/raw_map.tsv:3528).
  - Prior reason (prior_annotation): Mucha is a director/manager/adviser for Mr. Pataki, an individual principal. These do not identify an organization as argument 2.
  - Current reason (primary): Zenia Mucha → Mr. Pataki: Manager/director or team-head wording is attached to a personal principal rather than the omitted campaign, office or legal team.
  - Current question: What institution or team is actually managed, and is that entity the intended second argument?

## nyt-precision-investigation-2026-09-12/entityfix_latent_beta01_seed20260913

4/100 previously reviewed labels changed; 1097 additional facts were evaluated.

### rel_363 — travels_to

[Full dictionary and all evidence](census/audit_d0f63db2a21a/reports/rel_363.md) · [Prior annotation](census/audit_d0f63db2a21a/prior_annotations/rel_363.json)

Prior declaration: **travels or moves to**. Person, group or organization X travels, visits, arrives, returns or relocates to geographical place Y. Preserves travel/relocation scope. Event participation, residence, death place, datelines and general association alone do not qualify; a relocation mentioned only as a potential move needs modal review.

Current declaration: **moves or travels to**. Person, group or organization X undertakes movement with geographic destination Y. Includes: move/relocate/return/arrive/go/visit to Y; depart/leave for Y; temporary travel or organizational relocation; bare unqualified destination movement as textual support. Excludes: leave/withdraw from Y; mere presence/residence/death place; sports-event qualification or attendance as a nongeographic destination; membership or political control. Ambiguous unless resolved by case-local evidence: explicitly hypothetical or proposed relocation; invasion-only boundary; geographic/team or theatrical metonymy. Permanent residence and completed arrival are not required. Do not import external history to reject an otherwise unqualified textual movement path.

- **rel_363__ent_1004__ent_682: ambiguous → supported.** Yankees → New Jersey. Source lines: [4830](census/audit_d0f63db2a21a/raw_map.tsv:4830), [4834](census/audit_d0f63db2a21a/raw_map.tsv:4834), [4835](census/audit_d0f63db2a21a/raw_map.tsv:4835), [4837](census/audit_d0f63db2a21a/raw_map.tsv:4837), [4839](census/audit_d0f63db2a21a/raw_map.tsv:4839).
  - Prior reason (prior_annotation): Yankees have a passive move-to-New-Jersey path but surrounding rows describe losing the team, attendance origins and designation for export; actuality of relocation is unresolved.
  - Current reason (primary): Yankees → New Jersey: At least one explicit move, return, go, arrive, travel, leave-for or resettlement path establishes movement with this geographic destination; other residence or departure evidence does not negate that support.

### rel_222 — defeated

[Full dictionary and all evidence](census/audit_d0f63db2a21a/reports/rel_222.md) · [Prior annotation](census/audit_d0f63db2a21a/prior_annotations/rel_222.json)

Prior declaration: **defeated opponent**. X defeated opposing competitor Y in at least one competitive contest. Preserves winner-to-opponent scope. Beat, defeat and victory over qualify. Playing/facing, standings, losing, communication and professional affiliation alone do not. A historical win remains support when other rows describe losses.

Current declaration: **defeated opponent**. Competitor X defeated opponent Y in at least one completed competitive contest. Includes: beat/defeat/trounce/rout/upset/victory over; completed sporting sweep/outlast/elimination; explicit electoral defeat of an opposing competitor; historical win despite losses in other games. Excludes: mere play/face/rivalry; standings or polling lead; losing to Y; winning an event rather than beating Y; political control or hostility alone. Ambiguous unless resolved by case-local evidence: bare outscore/surpass/shock without a completed-contest result; score margin for only one period; unclear geographic/team metonymy. Preserves the two full-census opponent-win scope, including electoral contests. Broader competed-against belongs only in a separately declared sensitivity where the prior primary was defeat.

- **rel_222__ent_1261__ent_471: supported → ambiguous.** East → West. Source lines: [6051](census/audit_d0f63db2a21a/raw_map.tsv:6051), [6052](census/audit_d0f63db2a21a/raw_map.tsv:6052), [6054](census/audit_d0f63db2a21a/raw_map.tsv:6054), [6057](census/audit_d0f63db2a21a/raw_map.tsv:6057), [6059](census/audit_d0f63db2a21a/raw_map.tsv:6059), [6060](census/audit_d0f63db2a21a/raw_map.tsv:6060).
  - Prior reason (prior_annotation): East explicitly beats and defeats West and has a victory over it; contest context establishes opposing teams.
  - Current reason (primary): East → West: East–West defeat wording does not identify the specific competitors; geographic interpretations remain possible.
  - Current question: Which particular competitors do East and West denote?

### rel_187 — winner_of

[Full dictionary and all evidence](census/audit_d0f63db2a21a/reports/rel_187.md) · [Prior annotation](census/audit_d0f63db2a21a/prior_annotations/rel_187.json)

Prior declaration: **winner or champion of**. X won competition, race, championship, prize or award Y. Preserves event/award winner scope. Y is the event or award, not a defeated opponent, political office, general venue or issuing organization unless the event referent is recoverable. Presence and participation alone do not qualify.

Current declaration: **winner or champion of**. Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title. Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

- **rel_187__ent_994__ent_1228: ambiguous → supported.** Oscar De La Hoya → World Boxing Council. Source lines: [8007](census/audit_d0f63db2a21a/raw_map.tsv:8007), [8008](census/audit_d0f63db2a21a/raw_map.tsv:8008), [8010](census/audit_d0f63db2a21a/raw_map.tsv:8010), [8012](census/audit_d0f63db2a21a/raw_map.tsv:8012), [8013](census/audit_d0f63db2a21a/raw_map.tsv:8013).
  - Prior reason (prior_annotation): De La Hoya wins/retains a championship/title modified by World Boxing Council; Y literally names the sanctioning body, leaving the particular event/title omitted.
  - Current reason (primary): Oscar De La Hoya → World Boxing Council: An explicit win/winner/champion, held or retained title, or event-victory row supports the named competition or award. Additional participation/loss rows do not negate it.

### rel_134 — has_political_leader

[Full dictionary and all evidence](census/audit_d0f63db2a21a/reports/rel_134.md) · [Prior annotation](census/audit_d0f63db2a21a/prior_annotations/rel_134.json)

Prior declaration: **has political or institutional leader**. Political body or institution X has person Y as leader, president, minister or head. Preserves inverse political-leadership scope. Explicit minister office is included. Forward person-to-body leadership, mere presence and resignation without an office are not the same ordered relation.

Current declaration: **political body has a leader**. Country, political body or legislature X has or had person Y as a political leader. Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

- **rel_134__ent_1266__ent_706: supported → ambiguous.** Britain → Tony Blair. Source lines: [7007](census/audit_d0f63db2a21a/raw_map.tsv:7007), [7008](census/audit_d0f63db2a21a/raw_map.tsv:7008), [7009](census/audit_d0f63db2a21a/raw_map.tsv:7009), [7014](census/audit_d0f63db2a21a/raw_map.tsv:7014), [7016](census/audit_d0f63db2a21a/raw_map.tsv:7016).
  - Prior reason (prior_annotation): Britain has Blair as minister in explicit possessive/relative constructions.
  - Current reason (primary): Britain → Tony Blair: The evidence identifies an unspecified minister without resolving head-of-government or qualifying political-leadership scope.
  - Current question: Does the complete sentence identify a prime minister or another qualifying political leader?

## nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260912

0/100 previously reviewed labels changed; 284 additional facts were evaluated.

## nyt-precision-investigation-2026-09-12/verbatim_beta0001_seed20260913

0/100 previously reviewed labels changed; 264 additional facts were evaluated.

## nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260912

3/100 previously reviewed labels changed; 627 additional facts were evaluated.

### rel_381 — managerial_office_in

[Full dictionary and all evidence](census/audit_e4fd4a14b8e2/reports/rel_381.md) · [Prior annotation](census/audit_e4fd4a14b8e2/prior_annotations/rel_381.json)

Prior declaration: **managerial leadership in**. Argument 1 is or was a person holding a managerial or leadership office in organization 2. Choose the aggregate director/manager/president/chief family from the full dictionary. Spokesperson and economist are substantial competing roles, but employment alone does not establish leadership; a director role qualifies without requiring the chief executive.

Current declaration: **managerial or leadership office in**. Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y. Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

- **rel_381__ent_176__ent_175: incorrect → ambiguous.** Michael McKeon → Mr. Pataki. Source lines: [372](census/audit_e4fd4a14b8e2/raw_map.tsv:372), [373](census/audit_e4fd4a14b8e2/raw_map.tsv:373), [374](census/audit_e4fd4a14b8e2/raw_map.tsv:374), [375](census/audit_e4fd4a14b8e2/raw_map.tsv:375), [376](census/audit_e4fd4a14b8e2/raw_map.tsv:376), [377](census/audit_e4fd4a14b8e2/raw_map.tsv:377), [378](census/audit_e4fd4a14b8e2/raw_map.tsv:378), [379](census/audit_e4fd4a14b8e2/raw_map.tsv:379), [380](census/audit_e4fd4a14b8e2/raw_map.tsv:380), [381](census/audit_e4fd4a14b8e2/raw_map.tsv:381).
  - Prior reason (prior_annotation): McKeon is a spokesman/director for Mr. Pataki, an individual principal; the rows do not identify Pataki as an organization in which McKeon holds office.
  - Current reason (primary): Michael McKeon → Mr. Pataki: A director or manager role is attached to a named personal principal or Mayor, leaving the omitted campaign/office/institution unresolved.
  - Current question: Which institution or campaign is meant by the personal principal in this managerial role?

### rel_292 — has_political_leader

[Full dictionary and all evidence](census/audit_e4fd4a14b8e2/reports/rel_292.md) · [Prior annotation](census/audit_e4fd4a14b8e2/prior_annotations/rel_292.json)

Prior declaration: **has political leader or minister**. Political body, party, country or legislature 1 has or had person 2 as a leader, minister or senior political officeholder. Direction body to leader, inverse of the dominant leader-of family. Legislature majority/minority leaders and whips qualify. Spokespeople, aides, visitors, merely cited officials elsewhere and the reverse direction do not.

Current declaration: **political body has a leader**. Country, political body or legislature X has or had person Y as a political leader. Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

- **rel_292__ent_96__ent_948: supported → ambiguous.** India → Atal Behari Vajpayee. Source lines: [7027](census/audit_e4fd4a14b8e2/raw_map.tsv:7027), [7028](census/audit_e4fd4a14b8e2/raw_map.tsv:7028), [7029](census/audit_e4fd4a14b8e2/raw_map.tsv:7029), [7032](census/audit_e4fd4a14b8e2/raw_map.tsv:7032), [7033](census/audit_e4fd4a14b8e2/raw_map.tsv:7033), [7034](census/audit_e4fd4a14b8e2/raw_map.tsv:7034), [7035](census/audit_e4fd4a14b8e2/raw_map.tsv:7035).
  - Prior reason (prior_annotation): India has a minister explicitly named Atal Behari Vajpayee in possessive and minister-of-India appositions.
  - Current reason (primary): India → Atal Behari Vajpayee: The evidence identifies an unspecified minister but does not locally establish head-of-government or the narrower declared political leadership scope.
  - Current question: Does the full sentence establish a head-of-government or comparable political leader rather than an unspecified minister?

### rel_369 — located_in

[Full dictionary and all evidence](census/audit_e4fd4a14b8e2/reports/rel_369.md) · [Prior annotation](census/audit_e4fd4a14b8e2/prior_annotations/rel_369.json)

Prior declaration: **organization located or based in**. Organization 1 is based in or has a geographic office/site in place 2. Firm/company-in and based-in paths qualify. Nationality adjectives alone remain ambiguous between geographic base and ownership/origin. Individual professionals, agencies as employers and sectors are other predicates.

Current declaration: **organization based or located in**. Organization X is based, headquartered or physically located in geographic place Y. Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

- **rel_369__ent_1165__ent_227: ambiguous → supported.** Snug Harbor → Richmond Terrace. Source lines: [6195](census/audit_e4fd4a14b8e2/raw_map.tsv:6195), [6198](census/audit_e4fd4a14b8e2/raw_map.tsv:6198), [6200](census/audit_e4fd4a14b8e2/raw_map.tsv:6200), [6202](census/audit_e4fd4a14b8e2/raw_map.tsv:6202).
  - Prior reason (prior_annotation): The be-at and garden-at paths establish a Richmond Terrace location, but do not settle whether Snug Harbor is an organization/institutional site or only a geographic place.
  - Current reason (primary): Snug Harbor → Richmond Terrace: The company, service or venue is explicitly in/at the named place, based there, or supplied with a clear geographic organizational modifier.

## nyt-precision-investigation-2026-09-12/verbatim_beta01_bridge_seed20260913

2/100 previously reviewed labels changed; 642 additional facts were evaluated.

### rel_253 — member_of

[Full dictionary and all evidence](census/audit_ad8866964cf6/reports/rel_253.md) · [Prior annotation](census/audit_ad8866964cf6/prior_annotations/rel_253.json)

Prior declaration: **member of**. Person, country or organization X is or becomes a member of organization or political group Y. Member-of, membership, entry/accession and join provide the membership component. Joining someone in an action or alliance is distinct from becoming a constituent member; bare join without its completion can be ambiguous. Diplomatic relations, borders and television-title fragments do not establish membership.

Current declaration: **member of organization**. Person, country or organization X is or becomes a member of organization, alliance, party or public body Y. Includes: explicit member/belong/membership; join/accession/entry when organizational membership is established; individual legislators and countries in alliances. Excludes: join a person in an action; geographic entry; event participation; party control of legislature; negotiations or proposed membership alone. Ambiguous unless resolved by case-local evidence: bare join without clear completion or membership meaning; plural party naming individual members rather than the party itself.

- **rel_253__ent_815__ent_537: ambiguous → incorrect.** Russia → United States. Source lines: [1982](census/audit_ad8866964cf6/raw_map.tsv:1982), [1983](census/audit_ad8866964cf6/raw_map.tsv:1983), [1984](census/audit_ad8866964cf6/raw_map.tsv:1984), [1985](census/audit_ad8866964cf6/raw_map.tsv:1985), [1986](census/audit_ad8866964cf6/raw_map.tsv:1986), [1987](census/audit_ad8866964cf6/raw_map.tsv:1987), [1988](census/audit_ad8866964cf6/raw_map.tsv:1988), [1989](census/audit_ad8866964cf6/raw_map.tsv:1989), [1990](census/audit_ad8866964cf6/raw_map.tsv:1990), [1991](census/audit_ad8866964cf6/raw_map.tsv:1991).
  - Prior reason (prior_annotation): Russia joins the United States in a bare path, but other evidence is diplomatic relations, migration, ambassador, criticism and comparison. The omitted complement prevents deciding whether join means membership or participation in a joint action.
  - Current reason (primary): Russia → United States: Bilateral national alliances, borders, conflict, diplomacy or trade do not establish membership in the other country.

- **rel_253__ent_819__ent_816: ambiguous → incorrect.** Democrats → Republicans. Source lines: [1913](census/audit_ad8866964cf6/raw_map.tsv:1913), [1917](census/audit_ad8866964cf6/raw_map.tsv:1917), [1921](census/audit_ad8866964cf6/raw_map.tsv:1921), [5466](census/audit_ad8866964cf6/raw_map.tsv:5466), [5470](census/audit_ad8866964cf6/raw_map.tsv:5470), [5911](census/audit_ad8866964cf6/raw_map.tsv:5911), [5915](census/audit_ad8866964cf6/raw_map.tsv:5915).
  - Prior reason (prior_annotation): Democrats join or join with Republicans, plus a register path. The available paths do not distinguish party switching by particular individuals from temporary bipartisan cooperation by groups.
  - Current reason (primary): Democrats → Republicans: Parties joining or siding with each other in an action do not establish party membership.

## nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260912

3/100 previously reviewed labels changed; 635 additional facts were evaluated.

### rel_63 — defeated

[Full dictionary and all evidence](census/audit_c2349c1e0c57/reports/rel_63.md) · [Prior annotation](census/audit_c2349c1e0c57/prior_annotations/rel_63.json)

Prior declaration: **defeated opponent**. Competitor X defeated opposing competitor Y in a completed sporting or electoral contest. Beat, defeat, sweep, outlast, rout, upset and explicit victories qualify. Mere playing, facing, standings leads, transfers and losses do not. Historical win evidence suffices even with other losses; geographic team metonymy needs clear competitive roles.

Current declaration: **defeated opponent**. Competitor X defeated opponent Y in at least one completed competitive contest. Includes: beat/defeat/trounce/rout/upset/victory over; completed sporting sweep/outlast/elimination; explicit electoral defeat of an opposing competitor; historical win despite losses in other games. Excludes: mere play/face/rivalry; standings or polling lead; losing to Y; winning an event rather than beating Y; political control or hostility alone. Ambiguous unless resolved by case-local evidence: bare outscore/surpass/shock without a completed-contest result; score margin for only one period; unclear geographic/team metonymy. Preserves the two full-census opponent-win scope, including electoral contests. Broader competed-against belongs only in a separately declared sensitivity where the prior primary was defeat.

- **rel_63__ent_1159__ent_471: supported → ambiguous.** East → West. Source lines: [6051](census/audit_c2349c1e0c57/raw_map.tsv:6051), [6052](census/audit_c2349c1e0c57/raw_map.tsv:6052), [6054](census/audit_c2349c1e0c57/raw_map.tsv:6054), [6057](census/audit_c2349c1e0c57/raw_map.tsv:6057).
  - Prior reason (prior_annotation): East beats and defeats West and is led to victory over West; the complete local evidence fixes opposing competitive sides.
  - Current reason (primary): East → West: The win paths name only East and West, leaving the specific competitors unresolved.
  - Current question: Which teams or bodies do East and West designate?

### rel_262 — spokesperson_for

[Full dictionary and all evidence](census/audit_c2349c1e0c57/reports/rel_262.md) · [Prior annotation](census/audit_c2349c1e0c57/prior_annotations/rel_262.json)

Prior declaration: **spokesperson for**. Person X serves or served as a spokesperson for principal Y, including a person, organization or public office. Explicit spokesman, spokeswoman, speaking-for and identified principal-office representation qualify. Director, secretary, adviser, aide, lobbyist, manager and generic employment alone do not. Statements to Y are not representation of Y.

Current declaration: **spokesperson for**. Person X serves or served as spokesperson for principal Y, which may be a person, organization or public office. Includes: explicit spokesman/spokeswoman/spokesperson; expressly speaking for principal; representation through an identified principal office. Excludes: director/president/adviser/aide/lobbyist/secretary alone; communicating to rather than for Y; forward principal-to-person direction. Ambiguous unless resolved by case-local evidence: geographic dateline replacing the person; unclear represented principal.

- **rel_262__ent_109__ent_1046: ambiguous → supported.** Adrienne Esposito → Environment. Source lines: [1736](census/audit_c2349c1e0c57/raw_map.tsv:1736), [1737](census/audit_c2349c1e0c57/raw_map.tsv:1737).
  - Prior reason (prior_annotation): Say-for may express spokesperson representation, but the principal is the truncated name Environment and the other row supplies only director-for.
  - Current reason (primary): Adrienne Esposito → Environment: The person is identified in an organizational role and expressly says for that organization, supporting speaking on its behalf.

### rel_389 — member_of

[Full dictionary and all evidence](census/audit_c2349c1e0c57/reports/rel_389.md) · [Prior annotation](census/audit_c2349c1e0c57/prior_annotations/rel_389.json)

Prior declaration: **member of organization or political body**. X is or has been a member of organization, alliance, party or public body Y. The join/member/entry/membership paths define membership, including countries in alliances and individual legislators. Mere negotiation to join, geographical entry, allies of individual countries, political party control of a legislature and criticism of another body do not automatically establish membership. Membership of unnamed individual party members is not membership of their party as a single institution.

Current declaration: **member of organization**. Person, country or organization X is or becomes a member of organization, alliance, party or public body Y. Includes: explicit member/belong/membership; join/accession/entry when organizational membership is established; individual legislators and countries in alliances. Excludes: join a person in an action; geographic entry; event participation; party control of legislature; negotiations or proposed membership alone. Ambiguous unless resolved by case-local evidence: bare join without clear completion or membership meaning; plural party naming individual members rather than the party itself.

- **rel_389__ent_816__ent_811: incorrect → ambiguous.** Republicans → House. Source lines: [6396](census/audit_c2349c1e0c57/raw_map.tsv:6396), [6397](census/audit_c2349c1e0c57/raw_map.tsv:6397), [6398](census/audit_c2349c1e0c57/raw_map.tsv:6398), [6399](census/audit_c2349c1e0c57/raw_map.tsv:6399), [6400](census/audit_c2349c1e0c57/raw_map.tsv:6400), [6401](census/audit_c2349c1e0c57/raw_map.tsv:6401), [6402](census/audit_c2349c1e0c57/raw_map.tsv:6402), [6403](census/audit_c2349c1e0c57/raw_map.tsv:6403), [6404](census/audit_c2349c1e0c57/raw_map.tsv:6404), [6405](census/audit_c2349c1e0c57/raw_map.tsv:6405).
  - Prior reason (prior_annotation): The supplied fact expresses Republican control of the House. Committee shorthand alone does not identify a membership relation for the party, and no direct member or elected-to row is present.
  - Current reason (primary): Republicans → House: Party-control evidence is mixed with election/committee wording that may denote individual legislators rather than the party itself.
  - Current question: Does the plural party name here denote individual legislators who are members of the chamber, or the political party as a collective?

## nyt-precision-investigation-2026-09-12/verbatim_beta01_seed20260913

4/100 previously reviewed labels changed; 615 additional facts were evaluated.

### rel_91 — analyst_for

[Full dictionary and all evidence](census/audit_9f5868d8ee0e/reports/rel_91.md) · [Prior annotation](census/audit_9f5868d8ee0e/prior_annotations/rel_91.json)

Prior declaration: **analyst at organization**. Person X is an analyst at, with or for organization Y. Preserves prior analyst role. Other titles or general expertise alone do not qualify; do not broaden to all professional affiliation.

Current declaration: **analyst at organization**. Person X works or worked as an analyst for organization Y. Includes: explicit analyst at/for/with/of; following or tracking an industry or companies for an employer when it identifies professional analysis. Excludes: director/president/professor/scientist/spokesperson/editor/lawyer/partner alone; generic affiliation. Ambiguous unless resolved by case-local evidence: economist-only, forecaster, strategist or specialist at the analyst role boundary; unclear role/employer attachment. Preserves the earlier full-census A boundary for nearby financial roles; do not silently label all financial employment analyst.

- **rel_91__ent_773__ent_523: incorrect → ambiguous.** Donald Ratajczak → Georgia State University. Source lines: [534](census/audit_9f5868d8ee0e/raw_map.tsv:534), [537](census/audit_9f5868d8ee0e/raw_map.tsv:537), [539](census/audit_9f5868d8ee0e/raw_map.tsv:539), [540](census/audit_9f5868d8ee0e/raw_map.tsv:540).
  - Prior reason (prior_annotation): Ratajczak is director/specialist associated with Georgia State University; analyst is not established.
  - Current reason (primary): Donald Ratajczak → Georgia State University: Director and specialist evidence leaves the professional analyst role unresolved.
  - Current question: Does the specialist role at Georgia State identify analyst work, or only another academic/director role?

### rel_45 — resides_in

[Full dictionary and all evidence](census/audit_9f5868d8ee0e/reports/rel_45.md) · [Prior annotation](census/audit_9f5868d8ee0e/prior_annotations/rel_45.json)

Prior declaration: **lives in**. Person or group X lives or has a residence in geographical place Y. Preserves personal residence scope. Death, birth, work, visit or a relative residing somewhere is not sufficient. Dictionary contains substantial family and obituary contamination; do not broaden to all person-place association.

Current declaration: **lives or has lived in**. Person X, or members of population X, live or have lived in geographic place Y. Includes: live/resident/residence/home-in; explicit resettlement or being raised there; death at own home in a place when home attachment is clear. Excludes: death/killing in a place without residence; birth alone; work/travel/visits/presence/office alone; a relative living there without attribution to X. Ambiguous unless resolved by case-local evidence: obituary person-of-city apposition; relative/home attachment. Population statements concern members of the population, not necessarily every member.

- **rel_45__ent_404__ent_333: incorrect → ambiguous.** Michael → Manhattan. Source lines: [3945](census/audit_9f5868d8ee0e/raw_map.tsv:3945), [3946](census/audit_9f5868d8ee0e/raw_map.tsv:3946), [3947](census/audit_9f5868d8ee0e/raw_map.tsv:3947), [3948](census/audit_9f5868d8ee0e/raw_map.tsv:3948), [3949](census/audit_9f5868d8ee0e/raw_map.tsv:3949), [3950](census/audit_9f5868d8ee0e/raw_map.tsv:3950), [3951](census/audit_9f5868d8ee0e/raw_map.tsv:3951), [3952](census/audit_9f5868d8ee0e/raw_map.tsv:3952), [3953](census/audit_9f5868d8ee0e/raw_map.tsv:3953), [3954](census/audit_9f5868d8ee0e/raw_map.tsv:3954).
  - Prior reason (prior_annotation): Michael has family, meeting, school and birthplace paths to Manhattan but no supplied residence evidence.
  - Current reason (primary): Michael → Manhattan: The obituary family/of-city attachment does not clearly establish residence of this named argument; some additional church, restaurant or relative fragments also leave identity or attachment unresolved.
  - Current question: Does the city-of-family phrase describe this person’s residence, or a relative, institution or other referent?

### rel_69 — travels_to

[Full dictionary and all evidence](census/audit_9f5868d8ee0e/reports/rel_69.md) · [Prior annotation](census/audit_9f5868d8ee0e/prior_annotations/rel_69.json)

Prior declaration: **travels or moves to**. Person, group or organization X travels, visits, arrives, returns or relocates to geographical place Y. Declared from go/come/visit/arrive paths and all 27 fact summaries. Sports-contest, possession and company-name meanings compete substantially. Literal venue travel qualifies; playing an opponent or turning to a player does not.

Current declaration: **moves or travels to**. Person, group or organization X undertakes movement with geographic destination Y. Includes: move/relocate/return/arrive/go/visit to Y; depart/leave for Y; temporary travel or organizational relocation; bare unqualified destination movement as textual support. Excludes: leave/withdraw from Y; mere presence/residence/death place; sports-event qualification or attendance as a nongeographic destination; membership or political control. Ambiguous unless resolved by case-local evidence: explicitly hypothetical or proposed relocation; invasion-only boundary; geographic/team or theatrical metonymy. Permanent residence and completed arrival are not required. Do not import external history to reject an otherwise unqualified textual movement path.

- **rel_69__ent_400__ent_83: supported → ambiguous.** Jets → Oakland. Source lines: [3459](census/audit_9f5868d8ee0e/raw_map.tsv:3459), [3460](census/audit_9f5868d8ee0e/raw_map.tsv:3460), [3461](census/audit_9f5868d8ee0e/raw_map.tsv:3461), [3462](census/audit_9f5868d8ee0e/raw_map.tsv:3462), [3463](census/audit_9f5868d8ee0e/raw_map.tsv:3463), [3464](census/audit_9f5868d8ee0e/raw_map.tsv:3464), [3465](census/audit_9f5868d8ee0e/raw_map.tsv:3465), [3466](census/audit_9f5868d8ee0e/raw_map.tsv:3466), [3467](census/audit_9f5868d8ee0e/raw_map.tsv:3467), [3468](census/audit_9f5868d8ee0e/raw_map.tsv:3468).
  - Prior reason (prior_annotation): Jets go to Oakland and play in it, establishing travel to a venue despite opponent-name metonymy in other rows.
  - Current reason (primary): Jets → Oakland: Oakland is a travel destination in go-to/play-in rows but the opposing team in beat/lose-to rows; the fact merges city and team readings.
  - Current question: Should the mixed Oakland city/team argument count as a single geographic destination?

### rel_120 — has_political_leader

[Full dictionary and all evidence](census/audit_9f5868d8ee0e/reports/rel_120.md) · [Prior annotation](census/audit_9f5868d8ee0e/prior_annotations/rel_120.json)

Prior declaration: **has political or institutional leader**. Institution or political body X has person Y as president, leader or head, including legislative leadership. Inverse of prior leader/office scope. General control by a party, legal representation and ordinary co-occurrence do not establish a named leadership office; a group argument standing for an unnamed leader requires review.

Current declaration: **political body has a leader**. Country, political body or legislature X has or had person Y as a political leader. Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

- **rel_120__ent_1197__ent_816: ambiguous → incorrect.** Senate → Republicans. Source lines: [4896](census/audit_9f5868d8ee0e/raw_map.tsv:4896), [4897](census/audit_9f5868d8ee0e/raw_map.tsv:4897), [4898](census/audit_9f5868d8ee0e/raw_map.tsv:4898), [4899](census/audit_9f5868d8ee0e/raw_map.tsv:4899), [4900](census/audit_9f5868d8ee0e/raw_map.tsv:4900), [4901](census/audit_9f5868d8ee0e/raw_map.tsv:4901), [4902](census/audit_9f5868d8ee0e/raw_map.tsv:4902), [4903](census/audit_9f5868d8ee0e/raw_map.tsv:4903), [4904](census/audit_9f5868d8ee0e/raw_map.tsv:4904), [4905](census/audit_9f5868d8ee0e/raw_map.tsv:4905).
  - Prior reason (prior_annotation): Republicans control/hold Senate, but the leader-appos path may stand for an unnamed Republican officeholder rather than the whole party.
  - Current reason (primary): Senate → Republicans: Collective party control or membership does not establish an individual political leader as required by this predicate.
