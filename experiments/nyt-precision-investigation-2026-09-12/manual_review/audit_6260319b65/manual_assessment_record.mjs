// One explicit manual decision per selected fact, after reading dictionaries and all case rows.
import fs from 'node:fs';import path from 'node:path';import {fileURLToPath} from 'node:url';import assert from 'node:assert/strict';
const folder=path.dirname(fileURLToPath(import.meta.url));
const data=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'),'utf8'));
const S='supported',E='incorrect',A='ambiguous';
function save(id,label,definition,scope,rows){const r=data.relations.find(r=>r.relation===id);assert.equal(rows.length,r.facts.length);
 const out={relation:id,label,definition,scope_notes:scope,facts:rows.map((x,i)=>({case_id:r.facts[i].case_id,judgment:x[0],reason:x[1],evidence_lines:x[2],issue_tags:x[3]??[],reviewer_question:x[4]??''}))};
 const file=path.join(folder,'annotations',id+'.json');const old=JSON.parse(fs.readFileSync(file,'utf8'));if(old.facts.some(c=>c.judgment))assert.deepEqual(old,out,'Later reviewer edit must be preserved');fs.writeFileSync(file,JSON.stringify(out,null,2)+'\n');}
const win='X defeated opposing competitor Y in at least one competitive contest, including an electoral contest; direction is winner to defeated opponent.';
const winScope='Preserves the prior defeated-opponent scope. Explicit beat, defeat, victory over, trounce or completed elimination qualifies. Playing, facing, losing, standings, trading or political criticism alone do not. Both a win and a loss across historical games can be true; mixed assignments remain flagged.';
const office='X holds or held an explicit managerial or leadership office in organization or institution Y, such as chairperson, head, chief, president, director or executive.';
const officeScope='Preserves the prior organizational leadership scope. Explicit office qualifies, including a public executive role. Founding, control, ownership, ordinary employment or athletic lead alone is insufficient. Truncated organizational arguments remain ambiguous when their referent is unclear.';
const pm='Person X holds or held an explicitly identified president or manager office in organization, team or institution Y.';
const pmScope='Preserves the earlier combined president/manager scope. Other named offices, generic leadership/running, ownership or athletic leadership alone are not substitutes. A personal principal in place of an omitted campaign or organization requires attachment review.';
save('rel_283','defeated opponent',win,winScope,[
 [S,'Giants explicitly beat and defeat Redskins and have a victory over them; losing and participation rows are mixed evidence.',[891,893,896],['mixed_evidence','modality_time']],
 [S,'Red Sox explicitly beat and defeat Yankees; standings, play and loss rows are different statements.',[861,868,2661,2668,6934],['mixed_evidence','modality_time']],
 [S,'Devils beat and defeat Rangers and have a victory over them; other rows describe a loss or play.',[6968,6969,6972],['mixed_evidence','modality_time']],
 [S,'Knicks have a victory over Bulls and beat them; one loss row does not negate a historical win.',[877,6041],['mixed_evidence','modality_time']],
 [S,'Rangers defeat, beat and eliminate Devils; play and lose rows express other events.',[2601,2603,2606],['mixed_evidence','modality_time']],
]);
save('rel_167','subsidiary or organizational unit of','Organization or business unit X is a subsidiary, organizational part, division or owned business of parent organization Y.',
 'Preserves the earlier subsidiary/unit scope. Explicit owned-by, unit, part or subsidiary evidence qualifies. Geography, ordinary employment and partial investment alone do not. A location standing for an unnamed office would remain ambiguous.',[
 [S,'ABC is explicitly a Walt Disney unit/part/subsidiary and owned by it.',[2571,2572,2573,2575,2576,2577,2579]],
 [S,'Fallon Worldwide is explicitly a Publicis part/unit and owned by it.',[4621,4623,4624,4628,4630]],
 [S,'NBC is explicitly a General Electric Company unit/part and owned by it; the parent construction agrees.',[2521,2522,2523,2524,2525,2528,2529,2530]],
 [S,'Foote is a unit and part of True North Communications and is owned by it.',[2492,2496,2499]],
 [S,'Young & Rubicam is a WPP unit/part and owned by it; acquisition context is additional evidence.',[6718,6719,6720]],
]);
save('rel_11','analyst at organization','X is an analyst working at, with or for organization Y.',
 'Preserves the earlier analyst role, not all employment or financial occupations. Explicit analyst affiliation qualifies. Another office alone is insufficient; economist-only or ambiguous role attachment would require review.',[
 [S,'Heinbach is explicitly a Merrill Lynch analyst in repeated for/with/at and noun-modifier constructions.',[1812,1813,1814,1816,7820,7821,7822,7824]],
 [S,'Maldutis is explicitly analyst at/for/with Salomon Brothers; director is a separate role.',[571,572,573],['mixed_evidence']],
 [S,'Black is explicitly analyst for and with Sanford C. Bernstein & Company.',[7845,7846]],
 [S,'Karlin is explicitly analyst with/for/at Research Department Inc.',[1808,1809,1810,1811]],
 [S,'Casesa is explicitly a Merrill Lynch analyst in all supplied constructions.',[575,576,577,578]],
]);
save('rel_388','defeated opponent',win,winScope,[
 [S,'Knicks beat Bulls and have a victory over them; loss and play rows are mixed.',[871,6047],['mixed_evidence','modality_time']],
 [S,'Yankees beat Florida Marlins and have a victory over them; losing and play rows concern different outcomes/events.',[6954,6956],['mixed_evidence','modality_time']],
 [S,'Yankees beat Red Sox and have victories over them; play rows are broader.',[2582,3135,3139,6902],['mixed_evidence']],
 [S,'Mariners have a victory over Yankees and eliminate them; participation and starter-context rows are mixed.',[6064,6065],['mixed_evidence']],
 [S,'Mr. Bush has a victory over and trounces Al Gore in competitive/electoral wording; losing and deriding are separate predicates.',[6941,6942],['mixed_evidence','modality_time']],
]);
save('rel_257','president or manager of',pm,pmScope,[
 [S,'Adams is explicitly Sinn Fein president in the supplied constructions.',[29,32,2916,2919,4986,4988,4991]],
 [S,'Lamoriello is explicitly Devils president; ruling the team alone would not establish the specified office.',[1635,1636,1642],['mixed_evidence']],
 [S,'Waksal is explicitly ImClone Systems president in both rows.',[1284,3921]],
 [S,'Layden is explicitly Knicks president; direct-for wording alone is not used to infer that title.',[1675,1678],['mixed_evidence']],
 [S,'Thorn is explicitly Nets president in all three rows.',[1615,1616,1619]],
]);
save('rel_278','managerial or leadership office in',office,officeScope,[
 [S,'Stein is explicitly City Council president; the assistant-related path is unnecessary to establish the office.',[2866,2868],['mixed_evidence']],
 [S,'Adams is explicitly president, leader and head of Sinn Fein.',[27,28,30,31,2914,2915,2917,4987,4989]],
 [S,'Greenberg is explicitly president of American International Group; executive wording corroborates the office family.',[1253,1257]],
 [S,'Farrakhan is explicitly leader of Nation of Islam in both rows.',[2944,4966]],
 [S,'Mandela is explicitly ANC leader, president and head; party affiliation alone would be weaker.',[5006,5007,5008,5009,5010,5013],['mixed_evidence']],
]);
save('rel_94','spokesperson for','Person X serves or served as spokesperson for organization or principal Y.',
 'Preserves the previous spokesperson scope. Explicit spokesperson-for/of, possessive or institutional noun-modifier constructions qualify. Another employee/official role or a geographical dateline does not silently supply a named spokesperson.',[
 [S,'Hughes is explicitly spokeswoman for Mr. Bush; director is a different office.',[3586],['mixed_evidence']],
 [S,'Regev is explicitly spokesman for Foreign Ministry in direct and appositive constructions.',[367,368,369]],
 [A,'Washington is both an apparent spokesman argument and the location of condemning, suggesting a dateline or attachment error rather than an identified person.',[7438,7444],['entity_identity','attachment'],'Which named State Department spokesperson is intended, and is Washington a dateline/place rather than that person?'],
 [S,'McCurry is explicitly White House spokesman in both rows.',[1366,1368]],
 [S,'Boucher is explicitly State Department spokesman in all four constructions.',[1356,1358,1361,1362]],
]);
save('rel_22','president or manager of',pm,pmScope,[
 [S,'Esposito is explicitly Rangers manager; running, transforming and trade context are mixed evidence.',[3397,3398],['broad_predicate','mixed_evidence']],
 [S,'Grunfeld is explicitly Knicks manager in both rows.',[1666,1670],['broad_predicate']],
 [S,'Harrelson is explicitly Mets manager; replacement-as-manager also supports historical service.',[3342,3343,3350],['broad_predicate','modality_time']],
 [A,'Mucha is called Mr. Pataki’s manager, but the organizational/campaign object is omitted and a person occupies the second argument.',[1182,3523],['attachment'],'Does manager mean manager of Pataki’s campaign or organization, and what organizational principal should replace the person argument?'],
 [S,'Phillips is explicitly Mets manager; the saying-after path is not role evidence.',[3184,3185,3186,3187],['broad_predicate','mixed_evidence']],
]);
save('rel_138','managerial or leadership office in',office,officeScope,[
 [S,'Dolan is explicitly Madison Square Garden chairman; control and strongman wording is broader context.',[5717],['mixed_evidence']],
 [S,'Murdoch is explicitly News Corporation chairman, executive, head and chief; ownership/company context is not needed.',[258,260,262,263,265,267],['mixed_evidence']],
 [S,'Murdoch is explicitly Fox chairman; network/channel/control rows alone would not establish the office.',[6010],['mixed_evidence']],
 [A,'Turoff is chairman/head/chief of Taxi, but Taxi is a generic truncated name that does not uniquely identify the governing organization.',[2909,2910,2911,2912,2913],['entity_identity'],'Which full organization name does Taxi stand for in these source sentences?'],
 [S,'Rohatyn is explicitly chairman/head of Municipal Assistance Corporation and heads it.',[238,239,243,244]],
]);
save('rel_259','business or organization based or located in','Business or organization X is based or physically located in geographic place Y.',
 'Preserves the earlier location predicate. Explicit based-in/firm-in/company-in paths qualify. Corporate or industry noun modifiers such as Bell or Internet are not assumed to be geographic places. A shortened firm name can be resolved locally by explicit firm constructions.',[
 [E,'Internet modifies firm/company as an industry or business domain, not a geographic location for Forrester Research.',[7361,7362],['other_predicate']],
 [S,'Real Capital Analytics is explicitly a firm/company in New York and based there.',[6869,6870,6871]],
 [S,'Petroleum Finance Company is explicitly in Washington and based there.',[7422,7425,7427]],
 [S,'Kohlberg is explicitly a firm based in New York; firm/house wording supplies the organizational use of the shortened name.',[7354]],
 [E,'Bell modifies company and employee context, giving corporate affiliation rather than a geographic place for Ameritech Corporation.',[6864,6865],['other_predicate']],
]);
save('rel_322','managerial or leadership office in',office,officeScope,[
 [S,'Fehr is explicitly Players Association director/head; the camp-operated-by path is unrelated.',[2926,2927,2931,2932],['mixed_evidence']],
 [S,'Fauci is explicitly director and heads/directs National Institute of Allergy and Infectious Diseases; researcher is a broader role.',[2954,2956,2957,2960],['mixed_evidence']],
 [S,'Mueller is explicitly F.B.I. director and takes that office in the supplied paths.',[8453,8454,8456,8462],['modality_time']],
 [S,'Lipsky is explicitly director at/for Salomon Brothers.',[2358,2359,2364]],
 [S,'Gangi is explicitly director of/for Correctional Association of New York.',[144,146,149]],
]);
save('rel_39','coach of','X is or was a coach of sporting team, school or program Y.',
 'Preserves the previous coach scope. Explicit coach descriptions qualify, including a school/team referred to by a shortened name. General team membership, management, employment or a vacancy alone does not.',[
 [S,'Fitch is explicitly Nets coach in several constructions; taking a position is corroborating context.',[6496,6497,6500,6501,6504],['mixed_evidence']],
 [S,'Sather is explicitly Rangers coach; the separate vacancy path is insufficient alone.',[1628],['mixed_evidence']],
 [S,'Campbell is explicitly Ranger coach in all supplied constructions; Ranger is locally the team name.',[7223,7224,7225,7226,7228]],
 [S,'Randolph is explicitly Yankees coach; membership and knowing/providing rows are broader evidence.',[6546,6547],['mixed_evidence']],
 [S,'Pitino is explicitly Knicks coach in all four constructions.',[6536,6537,6538,6539]],
]);
save('rel_194','geographic neighborhood or area within','Geographic area or neighborhood X is a part of or located within larger geographic place Y.',
 'New geographic-containment meaning supported by the dominant neighborhood/section/area paths. Explicit section, district, neighborhood or area of/in qualifies. Movement between places, organizational ownership and unrelated event location alone do not.',[
 [S,'Riverdale is explicitly a section, neighborhood and area of Bronx; movement and street context are mixed.',[1088,1092,1093,1094],['mixed_evidence']],
 [S,'Williamsburg is explicitly a section, area and neighborhood of/in Brooklyn.',[1108,1109,1110,1112,1117]],
 [S,'East New York is explicitly a section, area and neighborhood of/in Brooklyn.',[1078,1079,1080,1084,1086]],
 [S,'Bedford-Stuyvesant is explicitly a Brooklyn section/neighborhood/area/district; school, move and incident context is additional.',[1098,1099,1100,1101,1106],['mixed_evidence']],
 [S,'Crown Heights is explicitly a Brooklyn section/neighborhood/area; disturbance context is a different proposition.',[1128,1129,1130,1131,1133],['mixed_evidence']],
]);
save('rel_102','leader or organizational head of','X holds or held a leadership/head role in political body, party or organization Y.',
 'Preserves prior leader/head scope, including legislative leadership within a chamber. Republican may name a party group when the named person is explicitly its leader; a singular nationality or truncated political label such as Soviet/Bosnian Serb does not automatically identify the organization. Membership alone does not establish leadership.',[
 [S,'Gephardt is explicitly a leader in House and of its majority; telling House or speaking on its floor alone would not establish leadership.',[3045,3047],['mixed_evidence']],
 [S,'The Republican leader constructions identify Lott’s party leadership, consistent with the previous rubric for this named-person/party pairing.',[3758,3759]],
 [A,'Gorbachev is described as Soviet leader and leader of Soviet, but Soviet is a truncated or adjectival political principal.',[3688,3692,3693],['entity_identity'],'What full state, party or organization is denoted by Soviet in these leadership descriptions?'],
 [S,'Peres is explicitly Labor Party leader; the deadline/appearance path is not leadership evidence.',[5056,5057,5063,5064],['mixed_evidence']],
 [A,'Karadzic is described as a Bosnian Serb leader, but the singular/adjectival destination may omit the political group or state.',[3054,3057,3058,3063],['entity_identity'],'Does Bosnian Serb denote the Bosnian Serbs as a group, a specific institution, or an incomplete entity name?'],
]);
save('rel_128','managerial or leadership office in',office,officeScope,[
 [S,'Gates is explicitly Microsoft chairman and head; founder rows express a correlated but different predicate.',[5066,5068,5074,5696,5704],['mixed_evidence']],
 [S,'Bernanke is explicitly Federal Reserve chairman; appointment-history and conference-location rows are mixed context.',[5706,5707,5713],['mixed_evidence','modality_time']],
 [S,'Horton is explicitly Citizens Budget Commission president, director and chairman; professor wording alone would not establish those offices.',[37,40,45,46],['mixed_evidence']],
 [S,'Russianoff is explicitly director and president of New York Public Interest Research Group; counsel is another role.',[4430,4433],['mixed_evidence']],
 [S,'Fehr is explicitly Players Association director, head and president.',[2924,2925,2928,2929,2933]],
]);
save('rel_186','winner or champion of','X won competition, race, championship, prize or award Y.',
 'Preserves prior winner/champion scope, with Y the competition or award rather than another player/person. Explicit win/champion/victory-in qualifies. Going, reaching, missing or losing in an event alone does not; a historical win is sufficient.',[
 [S,'Becker is explicitly Wimbledon champion and wins Wimbledon.',[7984,7985]],
 [S,'Strange is explicitly United States Open champion and wins it.',[7974,7975,7977]],
 [E,'Knicks going to or missing Ewing concerns a player, not winning an event or award.',[3427,3435,4926,4934],['other_predicate']],
 [S,'Cash is explicitly Wimbledon champion and wins it; losing-in and semifinal context concern other events.',[7994,7995,7998],['mixed_evidence','modality_time']],
 [S,'Woods explicitly wins Masters and is its champion with a victory in it.',[2237,2238,2239,2240,2244]],
]);
save('rel_61','organizational leadership office in',office,
 officeScope+' Committee membership or service alone does not establish chairmanship. Generic Republican/Democrat arguments omit the individual and stay ambiguous under the earlier rubric.',[
 [A,'Republican is described as Senate Finance Committee chair/head and member, but no individual officeholder is identified.',[6344,6345,6346,6347,6348,6350],['entity_identity','mixed_evidence'],'Which named Republican is the Senate Finance Committee chair/head in these sentences?'],
 [A,'Republican has Finance Committee chair/head/member descriptions but is an unnamed affiliation rather than a unique person.',[6279,6280,6281,6282,6286,6287],['entity_identity','mixed_evidence'],'Which named Republican is this Finance Committee officeholder, and do all the rows refer to the same person?'],
 [A,'Republican is called House Ways and Means Committee chair/head, but the individual identity is omitted.',[6319,6320,6321,6322,6323,6327],['entity_identity','mixed_evidence'],'Which named Republican holds or held the House Ways and Means Committee chairmanship here?'],
 [A,'Democrat is described as House Armed Services Committee chair/head and member without identifying the individual.',[6334,6335,6336,6337,6341],['entity_identity','mixed_evidence'],'Which individual Democrat is the House Armed Services Committee leader in these sentences?'],
 [S,'Tyson heads Council of Economic Advisers and is its chairperson in explicit paths.',[2879,2881]],
]);
save('rel_80','athlete plays for team','Person X plays or played as an athlete for sporting team Y.',
 'Chosen after inspecting all 15 complete facts: athlete/team pairs dominate, with score-for, player, guard, wing and captain paths. The frequent lead path is polysemous. Coaches, corporate executives, teams leading opposing teams and division standings are separate meanings and do not qualify. No old relation ID is transferred.',[
 [E,'Jackson is dismissed as Knicks coach and puts them somewhere; these rows do not state that he played for Knicks as an athlete.',[6479,6485],['other_predicate']],
 [S,'MacLean scores for Devils and is their wing, directly supporting an athlete/team role; generic lead/put rows are weaker.',[4249,4255],['mixed_evidence']],
 [E,'Red Sox leading Yankees is one team ahead of an opponent, not a person playing for the other team.',[864,2664,6930],['other_predicate','direction']],
 [E,'Yankees leading Red Sox is opponent/standings wording, not an athlete employed by the other team.',[884,2584,3137,6900],['other_predicate','direction']],
 [E,'Iacocca leading Chrysler and having a successor as executive concerns corporate leadership, not an athlete/team role.',[5140,5141,5142],['other_predicate']],
]);
save('rel_193','defeated opponent',win,winScope,[
 [S,'Baltimore Orioles defeat and beat New York Yankees and have a victory over them; meeting context is different.',[1063,1064,1065],['mixed_evidence']],
 [S,'Mets explicitly defeat Cubs; losing-to and playoff/game context do not support the same outcome.',[6961],['mixed_evidence','modality_time']],
 [S,'Mr. Bush explicitly defeats and beats Al Gore; opponent, loss, advantage and vote-comparison rows are mixed.',[6938,6940],['mixed_evidence','modality_time']],
 [S,'Mariners explicitly beat Yankees; meeting, trading and other contextual paths are not victory evidence.',[6061],['mixed_evidence']],
 [S,'Atlanta Braves defeat and beat New York Mets and have a victory over them.',[1011,1012,1013]],
]);
save('rel_196','managerial or leadership office in',office,officeScope,[
 [S,'Sculley is explicitly Apple chairman, executive and head.',[5107,5108,5109,5113]],
 [S,'Scrushy is explicitly HealthSouth executive and chairman.',[1261,1263,1264,1270]],
 [S,'Lamoriello is explicitly Devils executive; a making-with path is unrelated.',[1639,1640],['mixed_evidence']],
 [S,'Spano is explicitly Westchester County executive; meeting and legislation context do not independently establish the office.',[8069,8070,8075],['mixed_evidence']],
 [S,'Suozzi is explicitly Nassau County executive and takes that office; nomination alone would not establish completed tenure.',[8049,8050,8052,8053,8054],['mixed_evidence','modality_time']],
]);
console.log('Recorded 100 individual manual judgments.');
