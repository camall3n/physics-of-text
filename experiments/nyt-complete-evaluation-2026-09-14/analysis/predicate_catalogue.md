# Shared NYT predicate catalogue

Frozen operational catalogue for the ten retained NYT censuses. The definitions and historical scope examples remain preserved; they do not restore retired grading records. [Cleanup record](../../../reports/buggy-evaluation-cleanup-2026-09-28/README.md).

The catalogue records the earlier operational meanings before the complete census labels are finalized. It keeps specific offices and broader leadership distinct where prior declarations actually differed. It does not invent broader predicates to rescue errors. Every case using the same ID uses the same definition and boundary rules. Prior statements and exact source paths are retained in [prior_predicate_definitions.json](prior_predicate_definitions.json); the current mapping has 200 retained primary relation assignments. The original subsidiary side audit and four active-defect censuses have been retired.

[Machine-readable catalogue](predicate_catalogue.json) · [All 200 retained relation assignments](relation_assignments.json)

## Shared fact-level rubric

- **unit:** Every expressed ordered (relation,entity1,entity2) latent fact in top20 relations by assigned row count; no sample expansion or deduplication.
- **supported:** At least one case-local evidence row clearly establishes the fixed ordered predicate and local identity is not materially unresolved.
- **incorrect:** Evidence establishes another predicate/direction or fails the fixed predicate without an otherwise-supportive unresolved interpretation.
- **ambiguous:** Otherwise supportive or potentially supportive evidence cannot be attributed soundly because of local incompatible identities, attachment, missing argument, modality or an explicitly listed scope boundary. If all interpretations clearly fail the predicate, use E rather than A solely because names are mixed.
- **mixed_evidence:** One clear supporting row may support an existential historical fact even when other assigned rows express other predicates. Flag mixed_evidence; S is not sentence purity.
- **identity:** Materially incompatible literal pairs within one fact require the same A rule in every run; compatible aliases may be accepted from local context. Cross-fact global identity coherence is a separate diagnostic, not automatic relabeling of all multi-name IDs.
- **locality:** No evidence imported from another latent fact, relation, run, model score, external biography or expected historical truth.
- **time:** Historical tenure/result/residence suffices. Explicit candidate/proposed/negated statements do not assert actuality. Missing tense/modality is not filled by external knowledge; follow predicate-specific bare-path rules.
- **short_names:** A truncated but locally identifiable organization/team may be supported. Unnamed individual party labels, materially incomplete demonyms and omitted institutions remain A. Never repair names silently.
- **counts:** Report census S/N through (S+A)/N; these are ambiguity endpoints, not confidence intervals. Macro relation average separately. Preserve retained prior annotations as provenance and review provisional copies under the catalogue.

## Scope disagreements resolved for this census

### D01: Specific office versus broad leadership

Keep director_of, chairperson_of, executive_of, chairs_or_heads, organizational_leader_of and managerial_office_in distinct. Preserve actually declared prior scope; same catalogue ID always has the same scope. Do not infer scope merely from labels or a top path.

Prior examples: nyt-2026 rel294 is chair-specific; audit_4f7553d383 rel205 chair-specific versus audit_af30702564 rel239 broad managerial; audit_edb22a4a92 rel27 actual annotation includes equivalent leadership, despite some earlier summary prose calling it director-specific; audit_c0010fff1d rel197 and audit_4f7553d383 rel263/383 are director-specific.

### D02: President/manager composite

Retain the explicit earlier combined operational predicate across retained runs. Tag manager-only broad_predicate; a president-only or all-leadership assessment is a separate complete sensitivity.

Prior examples: nyt-2026 rel92; fixed400 rel7/123; both small-beta follow-ups.

### D03: Inverse political leader and minister

Preserve original political-leader scope: unspecified minister A without further head-of-government/leadership evidence. Harmonize later minister-inclusive declarations to this rule. A genuinely general organization-to-officeholder declaration remains has_organizational_leader.

Prior examples: fixed400 rel294 and edb rel197 treat minister A; audit_4c50ddb65b rel292 and c001 rel134 included minister more broadly.

### D04: Title-awarding body as championship argument

Follow both full censuses: explicit Y-designated championship/title can be S with broad_predicate even when Y is WBC or Olympic designation. The body itself is not won. Later sampled A decisions require re-review.

Prior examples: nyt-2026 rel118/192; fixed400 rel329; audit_c0010fff1d rel187 De La Hoya/WBC was A.

### D05: Sports-only versus sports-and-awards

Keep sporting_champion_of for the original explicitly sports-only relation; winner_of includes honor awards. Political body/office control belongs neither. Electoral opponent defeat remains defeated.

Prior examples: nyt-2026 rel192 sports-only; nyt-2026 rel118 and fixed400 rel329 include Nobel.

### D06: Defeat versus competing against

Keep earlier defeated primary. A broader played/competed-against interpretation is recorded separately and applied to a complete relation if requested, not chosen after inspecting passing cases.

Prior examples: audit_af30702564 rel6; strong play/lose components across sports dictionaries.

### D07: Outscoring or shock without a completed win

Use full-census rule: period margin, vague shock or bare outscore without enough contest context is A if a win is plausible, E if only a non-winning period/standings statement is established. A separate beat/defeat row resolves S.

Prior examples: fixed400 rel201; audit_af30702564 rel6 Nets/Knicks row944 was S on outscore alone.

### D08: Analyst versus nearby financial roles

Explicit analyst or professional industry-following supports S. Economist-only/forecaster/strategist/specialist boundary remains A consistently, as in old full census. Unrelated offices remain E.

Prior examples: nyt-2026 rel365; fixed400 rel195; later strict analyst summaries sometimes omit this A boundary.

### D09: Objectless sending and institutional attribution

Send/submit/give alone with missing object is A unless case-local communication evidence resolves it. A spokesperson is not automatically the recipient. Institution through identified representative can communicate, but a persons envoy is not automatically personal speech.

Prior examples: nyt-2026 rel355; fixed400 rel202; audit_5e74dee865 rel251 description said submit-to qualifies more broadly.

### D10: Partial ownership versus subsidiary containment

owns states some-or-all ownership and accepts explicit partial interest. subsidiary_of requires organizational containment/parent/owned-business support; minority investment alone is A. Earlier partial-inclusive subsidiary descriptions and full-only ownership descriptions need harmonized case review.

Prior examples: audit_dba5006d06 rel180 accepts shares; audit_5e74dee865 rel8 excludes merely partial stake as full ownership; runner subsidiary scopes in4c/384 included partial ownership.

### D11: Travel and unobserved modality

Follow full census: bare unqualified destination movement is textual support; no external history rejection. Explicitly hypothetical or proposed motion is A unless local evidence confirms it. Invasion-only remains an explicit boundary.

Prior examples: nyt-2026 rel298 and fixed400 rel330; audit_c0010fff1d rel363 Yankees/New Jersey contextual proposal A.

### D12: Residence versus birth, work and death

Resides includes explicit home/resettlement/raised-in from full census; plain death/birth/work/visit is not enough. Born_in stays strictly birthplace. Relative-home attachments remain A.

Prior examples: fixed400 rel224; audit_fb501b5da8 rel45; new born-in clusters.

### D13: Adjectival national or party entities

A named person leading a locally identifiable party may use an adjectival party designation. Generic Republican/Democrat as unnamed person is A. Materially incomplete national-group labels remain A; do not treat all adjectives as either errors or uniquely identified countries.

Prior examples: nyt-2026 rel136 broadly accepted Yugoslav national role; fixed400 rel162 requires incomplete national-group review; later Yugoslav/Soviet/Bosnian-Serb cases varied.

### D14: Case-local support versus coherent entity graph

Use the same local incompatible-name A rule across retained runs, including otherwise matching relations. Global multi-name IDs are a separate diagnostic; do not change the primary unit or apply global penalties only to newer runs.

Prior examples: Wolzien/Abramowitz/Black within one fact; Peres/Conde Nast share an ID across separate facts.

### D15: Subunit office and relative attachment

Managerial office/director may be a functional role within Y. Specific chair/head of a panel does not automatically chair/head the entire parent body; if omitted subunit alters the ordered relation use A.

Prior examples: communications director of an organization; committee/panel chairman attached to parent institution.

## Predicate definitions

### subsidiary_of — subsidiary or organizational unit of

Organization or business unit X is or was a subsidiary, division, owned business or organizational unit of parent Y.

Includes: explicit subsidiary/unit/division/organizational-part; corporate owned-by or an explicit parent relationship in the child-to-parent direction; historical containment or ownership. Excludes: employment; geographic containment; ordinary affiliation; reverse parent-to-child direction; a proposed acquisition. Ambiguous unless resolved by case-local evidence: city standing for an unnamed office; minority investment alone without evidence of organizational containment; incomplete ownership attachment. Explicit ownership is evidence; a minority financial stake alone does not establish that the company is a subsidiary. Do not confuse a part-of-company with a geographic part.

### owns — owns organization or asset

Person or organization X owns or owned some or all of organization, business, team or property Y.

Includes: owner/co-owner/owns; explicit ownership interest or stated share; corporate parent; completed acquisition with ownership attachment; historical ownership. Excludes: management or leadership alone; publishing or distribution alone; mere collaboration; proposed or rejected acquisition. Ambiguous unless resolved by case-local evidence: merger without clear ownership direction; a possessive alone. This states ownership interest, not necessarily complete ownership or control. An explicit partial stake qualifies here but not automatically as subsidiary_of in reverse.

### managerial_office_in — managerial or leadership office in

Person X holds or held an explicit managerial or leadership office in organization, political body or institution Y.

Includes: head/president/chair/director/chief/commander/executive/manager; equivalent explicit management such as dean or commissioner; a functional or departmental leadership office within Y; historical office. Excludes: founder or owner alone; ordinary employment/membership; spokesperson/adviser/lawyer/analyst/editor alone; athletic or standings lead; candidacy or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal standing for an omitted campaign or institution; unclear leadership attachment. This is the prior broad office family. It does not require sole overall leadership of Y. Explicit editor-in-chief or other equivalent head office differs from editor alone.

### organizational_leader_of — leader or organizational head of

Person X holds or held a leader, head, president, chief or chair office in group, institution, organization or political body Y.

Includes: explicit leader/head/president/chief/chair; legislative majority/minority leadership or whip; leadership office within an identified body; historical office. Excludes: ordinary membership or service; founding/ownership alone; party control of a chamber; candidate alone; athletic/standings or task-only lead; editor alone. Ambiguous unless resolved by case-local evidence: generic director or executive without clear leadership role; bare lead lacking organizational-role context; materially truncated political body. Preserves the narrower leader/head family used in the two original full censuses; managerial_office_in separately accepts explicit director/executive titles.

### president_or_manager_of — president or manager of

Person X holds or held an explicitly identified president or manager office in organization, team, public body or institution Y.

Includes: explicit president or manager title or unambiguous manage-as-office evidence; general manager; borough president and community-board manager; functional presidency within an organization; historical tenure. Excludes: chair/director/executive/head alone; owner/founder/coach/player alone; generic running or control without the specified role; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: personal principal replacing omitted organization/campaign; missing title modifier that could change the office. This deliberately composite legacy operational predicate is retained for comparability. Mark manager-only support broad_predicate. It is not a claim that president and manager are interchangeable atomic relations. A narrower president-only sensitivity requires separate complete re-evaluation, not selective changes.

### chairperson_of — chairperson of

Person X holds or held the office of chair or chairperson of organization or governing body Y.

Includes: explicit chair/chairman/chairwoman/chairperson; co-chair if explicit; past tenure or resignation from that office. Excludes: president/head/executive/director alone; founder/owner/member alone; nomination/candidacy alone. Ambiguous unless resolved by case-local evidence: ambiguous successor or appointment that does not establish tenure; chair of an omitted subunit. Do not widen a prior specific-chair declaration to managerial office because its facts would then score better.

### chairs_or_heads — chairs or heads organization

Person X holds or held a chair or organizational head/leader office in organization or committee Y.

Includes: explicit chair/head/organizational leader; historical chair or head office. Excludes: ordinary member/serve-on/sit-on; generic executive/director/president without chair/head role; chair of a panel as proof of chairing its parent organization. Ambiguous unless resolved by case-local evidence: incomplete panel/parent attachment; unnamed person identified only by party. This preserves the explicitly declared chair/head mixture in the latest review; it is narrower than managerial_office_in and must stay the same across cases.

### director_of — director of organization

Person X holds or held an explicit director office of, for or at organization or institution Y.

Includes: explicit director/co-director; functional directorship such as communications or research director within Y; historical office. Excludes: head/president/chair/executive alone; spokesperson/adviser/publisher/professor/member alone; performing or authorship alone. Ambiguous unless resolved by case-local evidence: personal principal with omitted organization; abstract topic in place of the actual institution. Does not require sole chief control of the entire institution.

### executive_of — executive of

Person X holds or held an explicitly identified executive office in organization or governmental jurisdiction Y.

Includes: executive/chief executive office; corporate and county executive; explicit historical executive office. Excludes: chair/director/president/head alone without executive title; hired by an executive; candidate or nomination alone. Ambiguous unless resolved by case-local evidence: title/attachment omits who holds the executive office.

### has_political_leader — political body has a leader

Country, political body or legislature X has or had person Y as a political leader.

Includes: national president/ruler/head of government; named parliamentary majority/minority leader or whip; historical leadership. Excludes: corporate/team leadership; ordinary membership/meeting; party control instead of an individual leader; person-to-body forward direction. Ambiguous unless resolved by case-local evidence: unspecified minister without evidence of head-of-government or leadership scope; truncated body or unnamed officeholder. Harmonizes the later minister-inclusive samples to the original full-census scope. An unspecified minister alone is A, not automatically S.

### has_organizational_leader — has organizational or political leader

Organization or political body X has person Y holding an explicit managerial or leadership office in it.

Includes: inverse of managerial_office_in with an explicit office; corporate or political institutions; historical office. Excludes: ordinary membership; geographic co-occurrence; interactions without office; forward person-to-body direction. Ambiguous unless resolved by case-local evidence: incomplete principal or office attachment. Use only where the prior declaration actually included organizations generally, not to widen a political-only relation.

### analyst_for — analyst at organization

Person X works or worked as an analyst for organization Y.

Includes: explicit analyst at/for/with/of; following or tracking an industry or companies for an employer when it identifies professional analysis. Excludes: director/president/professor/scientist/spokesperson/editor/lawyer/partner alone; generic affiliation. Ambiguous unless resolved by case-local evidence: economist-only, forecaster, strategist or specialist at the analyst role boundary; unclear role/employer attachment. Preserves the earlier full-census A boundary for nearby financial roles; do not silently label all financial employment analyst.

### economist_for — economist at organization

Person X works or worked as an economist for or affiliated with organization Y.

Includes: explicit economist at/for/with/of; historical departmental economist affiliation. Excludes: analyst/strategist/specialist/professor/executive alone; generic financial expertise. Ambiguous unless resolved by case-local evidence: unclear economist/employer attachment.

### professor_at — professor or university teacher at

Person X is a professor or teaches at academic institution Y.

Includes: explicit professor; teaching at the institution; historical teaching affiliation. Excludes: expert/specialist/dean/researcher/analyst alone; attendance or institution location alone. Ambiguous unless resolved by case-local evidence: unclear teacher versus student attachment.

### lawyer_for — lawyer or attorney for

Person X serves or served as attorney, lawyer or legal counsel for client, employer, organization or governmental jurisdiction Y.

Includes: explicit lawyer/attorney/counsel for/at/with client or employer; legal employment at a firm; explicit governmental attorney office for a jurisdiction. Excludes: private lawyer merely located in a city; spokesperson/director/lobbyist alone; reverse client-to-lawyer direction. Ambiguous unless resolved by case-local evidence: city as location versus represented jurisdiction; firm partner without a clear legal-role attachment.

### coach_of — coach of

Person X coaches or coached sports team or collegiate athletic program Y.

Includes: explicit coach title; direct coaching with correct subject and team; former/dismissed coach with clear office evidence; team/university shorthand when the athletic program role is clear. Excludes: manager/president/player alone; winning with a team alone; vacancy consideration alone; reverse team-to-coach direction. Ambiguous unless resolved by case-local evidence: missing coach subject or team attachment.

### athlete_for — athlete plays for team

Person X plays or played as an athlete for sports team Y.

Includes: player/center/guard/wing/captain/scorer role on a team; playing for or with the team as athlete; scoring for the team. Excludes: coach/manager/owner alone; team leading or beating another team; generic lead without athlete context; reverse team-to-athlete direction. Ambiguous unless resolved by case-local evidence: bare lead without player/position/scoring context.

### spokesperson_for — spokesperson for

Person X serves or served as spokesperson for principal Y, which may be a person, organization or public office.

Includes: explicit spokesman/spokeswoman/spokesperson; expressly speaking for principal; representation through an identified principal office. Excludes: director/president/adviser/aide/lobbyist/secretary alone; communicating to rather than for Y; forward principal-to-person direction. Ambiguous unless resolved by case-local evidence: geographic dateline replacing the person; unclear represented principal.

### has_spokesperson — has spokesperson

Organization or principal X has person Y serving as its spokesperson.

Includes: inverse spokesperson_for with correct attachment; organization-modifying spokesman and appositive person. Excludes: leader/president/lawyer/secretary alone; speaking at a building; spokesperson-to-principal forward direction. Ambiguous unless resolved by case-local evidence: dateline/location replacing the principal or person.

### communicates_to — directed communication to

Person or institution X directs information, speech, request, advice, warning or a message to addressee Y.

Includes: tell/ask/urge/notify/advise/warn/persuade/address/speak-to; testimony before the addressee; send/submit a clearly communicative object; institutional communication through an identified representative. Excludes: mere meeting/cooperation/support; speaking about or criticizing Y without address; physical transfer; spokesperson intermediary treated as recipient. Ambiguous unless resolved by case-local evidence: send/submit/give with omitted object and no other clear communication in this fact; person versus their administration or envoy attribution. An unqualified send-to edge does not by itself recover a message. Case-local corroboration may resolve it.

### defeated — defeated opponent

Competitor X defeated opponent Y in at least one completed competitive contest.

Includes: beat/defeat/trounce/rout/upset/victory over; completed sporting sweep/outlast/elimination; explicit electoral defeat of an opposing competitor; historical win despite losses in other games. Excludes: mere play/face/rivalry; standings or polling lead; losing to Y; winning an event rather than beating Y; political control or hostility alone. Ambiguous unless resolved by case-local evidence: bare outscore/surpass/shock without a completed-contest result; score margin for only one period; unclear geographic/team metonymy. Preserves the two full-census opponent-win scope, including electoral contests. Broader competed-against belongs only in a separately declared sensitivity where the prior primary was defeat.

### winner_of — winner or champion of

Entity X won the award or competition designated by Y, or held an explicitly Y-designated championship title.

Includes: explicit win/winner/champion of event or award; sporting titles and honor awards such as Nobel Peace Prize; explicit championship/title designated by a sanctioning body or Olympic designation; historical victory. Excludes: participation or reaching the event; single stage/game victory without the overall title; winning political office/control of a body; location or ordinary membership. Ambiguous unless resolved by case-local evidence: unclear title/event attachment; medal without a clear winning title or award scope. A named boxing body can designate its explicit title; mark broad_predicate rather than claiming the body itself was won. A named electoral competition is conceptually an event, but winning the White House or a legislature is office/control, not event-winning.

### sporting_champion_of — wins or holds sporting championship

Entity X won sporting competition Y or held an explicitly Y-designated sporting championship or title.

Includes: sport win/champion/title/clinch-title; sporting league/division or explicitly title-designating body; historical sporting title. Excludes: non-sport honorary awards; political election or control; participation; single stage without overall title; coaching or team membership alone. Ambiguous unless resolved by case-local evidence: medal without a winning championship; unclear title attachment. Retains the original sports-only relation separately from winner_of; do not silently extend it to Nobel or political examples.

### located_in — organization based or located in

Organization X is based, headquartered or physically located in geographic place Y.

Includes: based/headquarters/campus/office in; company/firm/group in a place; clear company/firm geographic noun modifiers; historical organizational location. Excludes: industry/Internet or corporate-family/Bell association; person birthplace/residence/occupation; mere event location; ownership or employment alone. Ambiguous unless resolved by case-local evidence: nationality adjective alone; truncated country/place; Wall Street as place versus industry. A shortened organization name may be resolved by its own explicit company/unit role. No location evidence is imported from a different latent fact.

### resides_in — lives or has lived in

Person X, or members of population X, live or have lived in geographic place Y.

Includes: live/resident/residence/home-in; explicit resettlement or being raised there; death at own home in a place when home attachment is clear. Excludes: death/killing in a place without residence; birth alone; work/travel/visits/presence/office alone; a relative living there without attribution to X. Ambiguous unless resolved by case-local evidence: obituary person-of-city apposition; relative/home attachment. Population statements concern members of the population, not necessarily every member.

### born_in — born in

Person X was born in geographic place Y.

Includes: direct born-in; born into a family in Y when Y is the birth location. Excludes: grown up/raised/native/from alone; nationality; schooling/residence/travel; institution founding. Ambiguous unless resolved by case-local evidence: unclear person or birthplace attachment.

### travels_to — moves or travels to

Person, group or organization X undertakes movement with geographic destination Y.

Includes: move/relocate/return/arrive/go/visit to Y; depart/leave for Y; temporary travel or organizational relocation; bare unqualified destination movement as textual support. Excludes: leave/withdraw from Y; mere presence/residence/death place; sports-event qualification or attendance as a nongeographic destination; membership or political control. Ambiguous unless resolved by case-local evidence: explicitly hypothetical or proposed relocation; invasion-only boundary; geographic/team or theatrical metonymy. Permanent residence and completed arrival are not required. Do not import external history to reject an otherwise unqualified textual movement path.

### departed_from — departed from

Person, group or organization X physically leaves or withdraws from geographic place Y.

Includes: leave/withdraw/pull out from Y; historical physical departure. Excludes: arrival/return to Y; residence alone; leaving a job or team as an institution without geography. Ambiguous unless resolved by case-local evidence: place versus institution as source; explicitly conditional departure.

### member_of — member of organization

Person, country or organization X is or becomes a member of organization, alliance, party or public body Y.

Includes: explicit member/belong/membership; join/accession/entry when organizational membership is established; individual legislators and countries in alliances. Excludes: join a person in an action; geographic entry; event participation; party control of legislature; negotiations or proposed membership alone. Ambiguous unless resolved by case-local evidence: bare join without clear completion or membership meaning; plural party naming individual members rather than the party itself.

### politically_controls — politically controls

Political group X controls or gains control of political body Y.

Includes: control/take-control/retain/regain/win-control; historical political control. Excludes: generic win/be-in alone; individual leadership office without party control; ordinary membership; sporting victory. Ambiguous unless resolved by case-local evidence: incomplete control object or political-group identity.

### geographic_part_of — geographical part of

Named geographic area, neighborhood or district X is contained within geographic place Y.

Includes: area/section/neighborhood/district of or in; clear place-to-containing-place attachment. Excludes: organization subsidiary or location; residence/work/travel; an event in a place. Ambiguous unless resolved by case-local evidence: place names attached through an omitted institution.

### writes_for — contributed writing to publication

Person X wrote, reviewed or contributed as a critic for publication Y.

Includes: wrote/reviewed for or in a publication; explicit critic for publication with authorship role. Excludes: merely quoted or mentioned in publication; publication location; ordinary communication or employment without authorship. Ambiguous unless resolved by case-local evidence: say-in without author/quoted-speaker distinction.

### criticizes — criticized or accused

Person or institution X criticized, blamed or accused Y.

Includes: explicit criticize/blame/accuse/assail; a clearly critical directed allegation. Excludes: warning without criticism; generic communication or meeting; rivalry/comparison alone. Ambiguous unless resolved by case-local evidence: unclear accused person or attributed critic.

### competed_against — played or competed against

Competitor X played or competed against opposing competitor Y in a contest.

Includes: explicit played against; a completed win or loss against opponent; competition with clear opponent roles. Excludes: ordinary interaction; standings comparison without a contest; future schedule alone. Ambiguous unless resolved by case-local evidence: ambiguous game occurrence. Sensitivity-only for previously defeat-labeled relations unless a new primary assignment is explicitly frozen before grading. Not a union of unrelated meanings.

## Assignment and review requirements

All 200 retained primary assignments inherit and interpret the already declared full relation meanings; they do not transfer a predicate by numeric relation ID across runs. The prior label, definition and scope are preserved in the assignment record. A reviewer must inspect the full dictionary to verify the assignment before judging every fact. If the prior declaration is irreconcilable with that dictionary, raise a documented catalogue/assignment amendment before grading; do not quietly switch predicates after seeing a success rate.

Provisional old labels are evidence of prior work, not automatic final gold. Recheck cases affected by D01–D15 and record review provenance. A changed scope must be applied consistently to old and new copied censuses in this folder. Complete census ratios have no sampling uncertainty; uncertainty from A, choice of predicate, assistants judgments and global identity remains.
