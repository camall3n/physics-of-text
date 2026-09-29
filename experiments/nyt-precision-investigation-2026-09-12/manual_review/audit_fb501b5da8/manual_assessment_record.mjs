// Explicit manual judgments, after inspection of path summaries and all selected evidence.
import fs from 'node:fs';import path from 'node:path';import {fileURLToPath} from 'node:url';import assert from 'node:assert/strict';
const folder=path.dirname(fileURLToPath(import.meta.url)),data=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'))),S='supported',E='incorrect',A='ambiguous';
function save(id,label,definition,scope,rows){const r=data.relations.find(r=>r.relation===id);assert.equal(rows.length,r.facts.length);const out={relation:id,label,definition,scope_notes:scope,facts:rows.map((x,i)=>({case_id:r.facts[i].case_id,judgment:x[0],reason:x[1],evidence_lines:x[2],issue_tags:x[3]??[],reviewer_question:x[4]??''}))};const file=path.join(folder,'annotations',id+'.json'),old=JSON.parse(fs.readFileSync(file));if(old.facts.some(c=>c.judgment))assert.deepEqual(old,out);fs.writeFileSync(file,JSON.stringify(out,null,2)+'\n');}
const office='X holds or held an explicit managerial or leadership office in organization or institution Y, including chair, chief, president, director, executive or head.';
const officeScope='Preserves prior office scope. Founder, owner, ordinary employee or athletic lead alone is insufficient; an explicit qualifying office in any supplied row supports the fact, with other meanings flagged.';
const mixed=['mixed_evidence'];
save('rel_237','managerial or leadership office in',office,officeScope,[
[S,'Martins is explicitly director and co-director of City Ballet.',[3509,3510,3513,3516],mixed],
[S,'Arafat is explicitly PLO leader, chairman and head.',[229,230,5029,5736,5737]],
[S,'Robertson is explicitly Christian Coalition head, president and leader; founding alone would not establish office.',[3855,3859,3860],mixed],
[S,'McIlvaine is explicitly Mets manager and president in current/past office constructions.',[1685,1686,1694,3255,3257,3263],['mixed_evidence','modality_time']],
[S,'Mr. Lee is explicitly Taiwan president and leads it; citizenship and travel are different predicates.',[984,987],mixed]]);
save('rel_190','directed communication to','X communicates a request, message, advice, testimony or information to addressee Y.','Preserves directed communication scope: explicit tell, ask, urge, advise, notify or send-message constructions qualify. Co-occurrence, criticism without address, marriage and support alone do not.',[
[S,'Greenspan tells, testifies to, urges and advises Congress.',[415,416,417,421],mixed],
[S,'Administration explicitly asks, tells, notifies, submits to and urges Congress.',[445,446,447,449,451],mixed],
[S,'Mr. Kerry explicitly tells Teresa Heinz Kerry; the wife-related rows alone are a different relation.',[4569],mixed],
[S,'Republicans explicitly urge Mr. Clinton; accusations and criticism are not independently treated as communication to him.',[5517],mixed],
[S,'White House explicitly asks, urges, tells and notifies Congress.',[2052,2054,2056,2059],mixed]]);
save('rel_330','defeated opponent','X defeated opponent Y in at least one competitive contest.','Preserves winner-to-opponent scope. Beat, defeat or victory-over qualify. Playing or losing alone do not; both win and loss may occur in different historical games.',[
[S,'Eagles beat Giants and have a victory over them; play/loss rows express other events.',[921,924,925],mixed],
[S,'Boston Red Sox defeat and beat New York Yankees and have a victory over them.',[1021,1022,1024],mixed],
[S,'Toronto Blue Jays defeat and beat New York Yankees and have a victory over them.',[1043,1045,1046],mixed],
[S,'Montreal Expos defeat and beat New York Mets.',[1047,1048],mixed],
[S,'San Diego Padres defeat and beat New York Mets.',[1059,1060],mixed]]);
save('rel_26','winner or champion of','X won competition, race, championship, prize or award Y.','Preserves earlier event/award scope. Y is the event or prize, not an opponent or office/territory controlled; travel, campaigning and physical presence do not qualify. Dictionary has a substantial competing travel/political component, retained as errors.',[
[E,'Colts move, leave for, play in and visit Indianapolis; no event or prize won is supplied.',[4810,4811,4813,4817],['predicate_boundary']],
[E,'White House is an office/institution sought or controlled by Democrats, not an event or award under this scope.',[6426,6427,6433],['predicate_boundary']],
[E,'Clinton campaigns, visits and serves as senator associated with New York; these rows do not establish an event or award won.',[4681,4682,4683,4686],['predicate_boundary']],
[S,'The organization shortened to Prevention of Nuclear War explicitly wins and receives the Nobel Peace Prize.',[7746,7747,7749,7751,7752],mixed],
[E,'Republicans win/control the White House politically; this is a competing office-control meaning.',[2774,2776,2781],['predicate_boundary']]]);
save('rel_275','organization based or located in','Organization X is based or physically located in place Y.','Preserves prior organization/location scope. Explicit base, headquarters or firm-in-place qualifies. Nationality adjective without recoverable place is ambiguous; birth, industry and ownership are separate predicates.',[
[E,'Internet describes Jupiter Media Metrix industry, traffic and conference subject, not a geographical base.',[7401,7402,7404,7405,7409],['predicate_boundary']],
[A,'Swiss modifies company/giant/maker and currency; it expresses nationality but leaves physical base unstated.',[3609,3610,3611,3612,3617],['argument_scope'],'Does the original text establish a physical Swiss base, or only nationality/ownership?'],
[S,'Petroleum Finance Company is explicitly a firm/group based in Washington.',[7422,7425,7426,7427,7429]],
[A,'German is a truncated adjective/place argument; a based-in path exists but does not preserve its full destination.',[3599,3601,3608],['argument_scope'],'What complete place is the object of based in for Bertelsmann, and does German refer to it?'],
[E,'Mr. Ghosn was born in Brazil; person birthplace is outside organizational location.',[1005,1007],['predicate_boundary']]]);
save('rel_319','managerial or leadership office in',office,officeScope,[
[E,'Burrud died at home in Sunset Beach; neither argument establishes organization leadership.',[2683],['predicate_boundary']],
[S,'Spano is explicitly Westchester County executive/chairman; meeting/location rows are broader.',[8069,8070,8075],mixed],
[S,'Greenspan is explicitly Federal Reserve Board chairman in repeated office constructions.',[198,199,200,5676,5677,5678],mixed],
[S,'Iacocca is explicitly Chrysler chairman and executive.',[5136,5137,5138,5144,5145],mixed],
[S,'Bogle is explicitly Vanguard chairman and executive; many other rows express founder instead.',[3845,3846],mixed]]);
save('rel_91','analyst at organization','Person X is an analyst at, with or for organization Y.','Preserves prior analyst role. Other titles or general expertise alone do not qualify; do not broaden to all professional affiliation.',[
[S,'Goldman is explicitly PaineWebber analyst for/with/at; director is an additional role.',[1794,1795,1796],mixed],
[E,'Gearan is described as director, spokesman and chief for White House, without analyst evidence.',[8514,8515,8516,8517],['predicate_boundary']],
[E,'Boucher is State Department spokesman, not an analyst in these rows.',[1356,1358,1362],['predicate_boundary']],
[E,'Ratajczak is director/specialist associated with Georgia State University; analyst is not established.',[534,537,539,540],['predicate_boundary']],
[S,'Morton is explicitly an analyst at/for/with Lynch, Jones & Ryan.',[7840,7841,7842,7844]]]);
save('rel_331','subsidiary or organizational unit of','Organization or business unit X is a subsidiary, division, owned business or organizational part of parent Y.','Preserves prior subsidiary/unit scope. Explicit unit, part, subsidiary or owned-by qualifies; an unnamed local office represented only by a city is ambiguous.',[
[S,'DDB Needham is explicitly Omnicom unit/part and owned by it.',[6709,6710,6711,6712,6713],mixed],
[S,'American Airlines is explicitly AMR unit/subsidiary/part and owned by it.',[2561,2562,2563,2564,2565,2566],mixed],
[S,'Lorillard Tobacco is explicitly Loews subsidiary and unit.',[6585,6586,6587]],
[S,'NBC is explicitly a General Electric Company subsidiary/unit and owned by it.',[2521,2522,2523,2524,2525],mixed],
[A,'New York has office-of and unit-of paths to Hill but also senator/campaign paths; city and Hill referents do not identify a unique corporate unit/parent.',[4180,4184,4188,4189],['entity_identity','argument_scope','mixed_evidence'],'Which New York office or unit and which Hill organization are meant, and do these rows refer to the same pair?']]);
save('rel_118','member of organization','Entity X joins, belongs to or is a member of organization or institutional body Y.','Selected coherent membership meaning after inspecting all 36 fact summaries; dictionary also contains major leave/return/political-control/venue components. Membership is narrower than general in/associated-with. Geographic presence, athletic event entry and office control alone do not qualify. This highly mixed relation has no unambiguous unique dominant predicate.',[
[E,'Yankees are kept in, return to, leave and move from New York; city location is not membership of an organization.',[5196,5198,5199,5202,5203],['predicate_boundary']],
[S,'China explicitly joins and has membership/admission in World Trade Organization.',[1922,1923,1924,1926,1930]],
[E,'Jets play and lease space at Giants Stadium; venue use is not organizational membership.',[4840,4842,4843,4844,4849],['predicate_boundary']],
[E,'Red Sox win/lose World Series and are in the event; this is event participation rather than organizational membership.',[2197,2199,2200,2201,2202],['predicate_boundary']],
[S,'Poland joins and is explicitly a member of European Union.',[1942,1943,1944,1945,1947]]]);
save('rel_385','managerial or leadership office in',office,officeScope,[
[S,'Russianoff has explicit director and president paths to New York Public Interest Research Group, despite predominantly lawyer/attorney evidence.',[4430,4433],mixed],
[S,'Trimble is explicitly Ulster Unionist Party leader.',[2895,2902,2903],mixed],
[S,'Bruno is explicitly Senate leader, including majority leadership.',[3014,3015,3016,3017,3018],mixed],
[S,'Dole is explicitly Senate leader, including minority leadership.',[2964,2965,2966,2968,2972,2973],mixed],
[E,'New York is the location of officers/agents/investigations involving FBI; it is not a managerial officeholder.',[4157,4159,4160],['predicate_boundary']]]);
save('rel_399','spokesperson for','Person X is spokesperson for organization, office or person Y.','Preserves spokesperson/speak-for role. Different professional roles and geographical association alone do not establish it.',[
[S,'Borakove is explicitly spokeswoman/spokesman for Medical Examiner and its office.',[1191,1192,1195,1198],mixed],
[S,'Steets is explicitly Entergy spokesman; manager is separate evidence.',[382,383,385],mixed],
[E,'Serbs are in, flee or are driven from Croatia; they are not its spokesperson in these rows.',[2146,2149,2151,2152],['predicate_boundary']],
[S,'Abrams is explicitly spokeswoman for Department of Housing Preservation and Development.',[1211,1212]],
[S,'Nielsen is explicitly spokeswoman/spokesman for The Times.',[1188,1189],mixed]]);
save('rel_45','lives in','Person or group X lives or has a residence in geographical place Y.','Preserves personal residence scope. Death, birth, work, visit or a relative residing somewhere is not sufficient. Dictionary contains substantial family and obituary contamination; do not broaden to all person-place association.',[
[E,'Roberts only dies in Dartford; death place does not establish residence.',[8203],['predicate_boundary']],
[E,'Diana dies/is killed in Paris; accident/death place does not establish residence.',[8160,8161,8163,8166,8168],['predicate_boundary']],
[S,'Mermelstein explicitly lives in Los Angeles; occupational/article rows are additional meanings.',[6090],mixed],
[A,'William has relative, lawyer, travel and restaurant paths. The sole live-in path attaches through wife, so the resident and the literal first argument are uncertain.',[4014,4017,4020,4022],['entity_identity','attachment','mixed_evidence'],'Does the original wife/live-in sentence say William himself lives in Manhattan, or only a relative?'],
[E,'Michael has family, meeting, school and birthplace paths to Manhattan but no supplied residence evidence.',[3945,3946,3950,3952,3953],['predicate_boundary']]]);
save('rel_130','president or manager of','Person X holds or held an explicitly named president or manager office in organization/team/institution Y.','Preserves combined president/manager scope; other offices or generic leadership alone do not qualify.',[
[S,'Cox is explicitly Braves manager and manages them.',[3234,3235,3236,3239],mixed],
[S,'Thomas is explicitly Knicks president in multiple constructions.',[1645,1647,1649,1653],mixed],
[S,'Checketts is explicitly Knicks president and manager.',[1705,1706,1707,1708],mixed],
[S,'Sather is explicitly Rangers president and manager; coach rows are separate.',[1625,1626,1627,1629,1632,1633],mixed],
[S,'Harazin is explicitly Mets president and manager.',[3362,3363,3364,3365,3366,3368],mixed]]);
save('rel_69','travels or moves to','Person, group or organization X travels, visits, arrives, returns or relocates to geographical place Y.','Declared from go/come/visit/arrive paths and all 27 fact summaries. Sports-contest, possession and company-name meanings compete substantially. Literal venue travel qualifies; playing an opponent or turning to a player does not.',[
[S,'Jets go to Oakland and play in it, establishing travel to a venue despite opponent-name metonymy in other rows.',[3459,3460],mixed],
[S,'Gorbachev comes to, arrives in and visits Washington.',[4731,4732,4738],mixed],
[S,'Cubans are brought to, arrive in, flee to and come to United States.',[4722,4723,4724,4726,4730]],
[E,'Mets compete with Florida Marlins; no geographical travel destination is established.',[6977,6978,6979,6981,6984],['predicate_boundary']],
[E,'John plays/loses to Manhattan or appears in complex institution/relative paths; no direct travel to the city is supplied.',[3967,3968,3970,3972,3973,3974],['predicate_boundary','entity_identity']]]);
save('rel_120','has political or institutional leader','Institution or political body X has person Y as president, leader or head, including legislative leadership.','Inverse of prior leader/office scope. General control by a party, legal representation and ordinary co-occurrence do not establish a named leadership office; a group argument standing for an unnamed leader requires review.',[
[E,'Simpson has Cochran as lawyer/counsel; legal representation is not institutional leadership.',[3827,3830,3831,3832],['predicate_boundary']],
[A,'Republicans control/hold Senate, but the leader-appos path may stand for an unnamed Republican officeholder rather than the whole party.',[4896,4898,4900,4901,4902],['argument_scope','entity_identity'],'Does the leader construction identify a named individual omitted by the Republicans argument, or assert the party itself as institutional leader?'],
[S,'Senate has Mitchell as explicit leader in noun, possessive and of constructions.',[7686,7688,7691,7692,7695],mixed],
[E,'Sears and Roebuck are linked only by an announce subject path, with no leader office.',[646],['predicate_boundary','entity_identity']],
[S,'Senate explicitly has Lott as leader, with additional whip and contextual paths.',[7636,7637,7638,7640,7642],mixed]]);
save('rel_1','coach of','Person X coaches or holds/held a coach office for team or athletic institution Y.','Preserves coach-specific scope; management or athletic participation without coach evidence is insufficient.',[
[S,'Carnesecca is explicitly coach at/of the St. John institution.',[6466,6471],mixed],
[S,'Krzyzewski is explicitly Duke coach in several constructions.',[7253,7254,7255,7256],mixed],
[S,'Jackson is explicitly Bulls coach and coaches them.',[6516,6517,6518,6519,6520],mixed],
[S,'Fitch is explicitly Nets coach.',[6496,6497,6500,6501,6504],mixed],
[S,'Jackson is explicitly Knicks coach, including dismissal from that role.',[6476,6477,6480,6481,6482,6485],mixed]]);
save('rel_52','owns or is parent of','Person or organization X owns business/organization/property Y or is its corporate parent.','Inverse of subsidiary/unit ownership family, allowing person owners and property. Officeholding, authorship and control without ownership alone are insufficient.',[
[S,'Walt Disney Company explicitly owns ABC and is its parent/owner.',[5930,5931,5932,5933,5934],mixed],
[S,'Murdoch explicitly owns Fox and is its owner; chairman/control alone would be weaker.',[6011,6018],mixed],
[E,'Gross writes/says material in The Times; authorship/publication is not ownership.',[7315,7316,7317],['predicate_boundary']],
[S,'Cablevision explicitly owns Madison Square Garden and is its owner.',[5920,5921,5922,5924],mixed],
[S,'Dolan explicitly owns Madison Square Garden in one row; other rows express chairman/control.',[5719],mixed]]);
save('rel_342','managerial or leadership office in',office,officeScope,[
[S,'Parsons is explicitly AOL Time Warner executive/chairman/officer.',[1316,1317,1318,1319,1320,1323],mixed],
[E,'Koreans are brought to Japan and have citizenship/litigation associations; no officeholding relation is supplied.',[2169,2173,2174,2176],['predicate_boundary']],
[A,'McKenzie has principal/performance evidence; the head-of path is connected through a dancer working with him and may attach leadership to someone else.',[3553,3554,3555],['attachment','predicate_boundary'],'Does the original head-of sentence identify Kevin McKenzie as Ballet Theater head, or a dancer who worked with him?'],
[S,'Greenspan is explicitly Federal Reserve chairman; confirmation context is supplementary.',[5647],mixed],
[S,'Skilling is explicitly Enron executive/president across repeated rows.',[1298,1299,1300,1302,1305,8084,8085,8088],mixed]]);
save('rel_43','organization based or located in','Organization X is based, headquartered or physically located in place Y.','Preserves organization-location scope. Direct based/headquarters/campus evidence qualifies; industry and corporate association do not.',[
[S,'Microsoft is explicitly based and headquartered in Redmond with campus evidence.',[778,780,781,782,4334,4335,4336,4337],mixed],
[S,'Jupiter Communications is explicitly a company based in New York.',[7170,7172],mixed],
[S,'Monsanto is based/headquartered in St. Louis; outside-place and litigation rows express additional relations.',[4374,4375,4376,4381],mixed],
[E,'Bell is a corporate partner/family in Pacific Telesis venture/breakup context, not a geographical base.',[6879,6880,6882],['predicate_boundary']],
[S,'International Data Corporation is explicitly based in Framingham.',[5817,5819,5820,7151,7153,7154]]]);
save('rel_291','athlete plays for team','Athlete X plays as a member of team Y.','Chosen after inspecting all 19 fact summaries: player/center/scoring-for paths disambiguate athletic lead. Team standings, coach/manager roles and organizational leadership remain separate; no broad lead-or-give disjunction.',[
[S,'Jordan scores points for and plays with Bulls.',[3116,3117,3119,3121],mixed],
[S,'Michael Jordan scores for Bulls and is explicitly their star/player.',[3145,3147,3148,3151,3153],mixed],
[E,'Herzog is Cardinals manager/master; the supplied evidence does not make him a playing athlete.',[3382,3385,3386,3388],['predicate_boundary']],
[S,'Ewing is explicitly Knicks center in repeated rows.',[3075,3079,4219,4223],mixed],
[E,'Yankees lead/overtake Red Sox in team standings; one team is not a player for the other.',[884,890,2584,2590,3137,3143,6900,6906],['predicate_boundary']]]);
console.log('Recorded 100 explicit manual judgments.');
