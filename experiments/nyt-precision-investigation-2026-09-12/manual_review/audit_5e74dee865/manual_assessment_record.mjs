// Explicit manual judgments after reading every selected case and the relation dictionaries.
// This file contains no keyword classifier; each row below is an individual review decision.
import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import assert from 'node:assert/strict';
const folder=path.dirname(fileURLToPath(import.meta.url));
const cases=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'),'utf8'));
const S='supported',E='incorrect',A='ambiguous';
function save(id,label,definition,scope,rows) {
 const r=cases.relations.find(r=>r.relation===id);assert.equal(rows.length,r.facts.length);
 const value={relation:id,label,definition,scope_notes:scope,facts:rows.map((x,i)=>({case_id:r.facts[i].case_id,
  judgment:x[0],reason:x[1],evidence_lines:x[2],issue_tags:x[3]??[],reviewer_question:x[4]??''}))};
 const file=path.join(folder,'annotations',id+'.json');
 const existing=JSON.parse(fs.readFileSync(file,'utf8'));
 if(existing.facts.some(c=>c.judgment))assert.deepEqual(existing,value,'Refusing to replace a later reviewer edit');
 fs.writeFileSync(file,JSON.stringify(value,null,2)+'\n');
}
const winDefinition='X defeated opposing competitor Y in at least one competitive contest; direction is winner to defeated opponent.';
const winScope='Preserves the previous defeated-opponent predicate. Explicit beat, defeat, victory over or completed sweep qualify. Losing, playing, facing, trading or standings alone do not. Different historical games can supply both wins and losses; a clear win supports the fact but other assignments remain mixed evidence.';
save('rel_114','defeated opponent',winDefinition,winScope,[
 [S,'Mets defeating and beating Dodgers directly establish a win; losses, play and trade rows are mixed assignments.',[6918,6919,6921],['mixed_evidence','modality_time']],
 [S,'Both rows explicitly say Yankees beat Mets.',[902,2592]],
 [S,'Giants have explicit victories over Dallas Cowboys; other rows describe games or losses.',[2673,2677],['mixed_evidence','modality_time']],
 [S,'Boston Red Sox defeat/beat New York Yankees and have a victory over them; losing rows do not support the same event.',[1021,1022,1024],['mixed_evidence','modality_time']],
 [S,'Giants beat Jets and have a victory over them; play and loss rows are not evidence of winning.',[2622,2624],['mixed_evidence','modality_time']],
]);
save('rel_91','analyst at organization','X is an analyst working at, with or for organization Y.',
 'Preserves the prior analyst role rather than general employment. Explicit analyst affiliation qualifies; financial tracking can corroborate it. Economist-only or unclear attachment would be ambiguous, and another office alone would not suffice.',[
 [S,'Abramowitz is explicitly an analyst at, with and for Sanford C. Bernstein & Company.',[1790,1791,1792]],
 [S,'Murphy is explicitly an analyst for, with and at Morgan Stanley; airline-following rows corroborate the role.',[1817,1818,1819]],
 [S,'Spilka is explicitly an analyst with and at Harris Upham & Company.',[1829,1830]],
 [S,'Thompson is explicitly an analyst at and with Lexington Institute.',[579,580]],
 [S,'Kunstler is explicitly an analyst with, at and for J. P. Morgan; the additional H&Q attachment is unnecessary for support.',[1779,1780,1782,1783]],
]);
save('rel_343','defeated opponent',winDefinition,winScope,[
 [S,'Toronto Blue Jays defeat and beat New York Yankees; contract/offer evidence is a different relation.',[1043,1045,1046],['mixed_evidence']],
 [E,'Giants lose to Eagles, face them and have an opener against them; none of these rows establishes Giants defeating Eagles.',[2654,2657,2658,2659,2660],['direction','other_predicate']],
 [S,'Mets beat, defeat and sweep Braves; play and games-behind rows are broader or different evidence.',[6888,6892,6895],['mixed_evidence']],
 [S,'Mets beat and sweep Yankees and have a victory over them; a separate loss and facing/playing rows are mixed.',[911,914,915],['mixed_evidence','modality_time']],
 [S,'Eagles beat Giants and have a victory over them, despite other rows describing losses and participation.',[921,925],['mixed_evidence','modality_time']],
]);
save('rel_396','coach of','X is or was a coach of team, school or sporting program Y.',
 'Preserves the previous coach predicate. Explicit coach role or coaching action qualifies, including a university/team named by its place. Mere athletic participation, ownership or general management does not.',[
 [S,'Jackson is explicitly a Bulls coach and is said to coach Bulls.',[6516,6517,6518,6519]],
 [S,'The possessive coach construction identifies Sather as Rangers coach.',[1628]],
 [S,'Calhoun is explicitly coach at/of Connecticut and coaches its program; team wording fixes the sporting use of the place name.',[7183,7184,7185,7191]],
 [S,'Auriemma is explicitly UConn coach; the separate winning-at row is insufficient alone.',[7273,7274,7276],['mixed_evidence']],
 [S,'Holtz is explicitly Notre Dame coach in several constructions; team and season context corroborates the program.',[7233,7234,7236,7237],['mixed_evidence']],
]);
const pmDefinition='Person X holds or held an explicitly identified president or manager office in organization, team or institution Y.';
const pmScope='Preserves the earlier combined president/manager scope. Explicit historical office qualifies. Generic leader, running/control, director, chairman, founder, owner, coach or athlete leadership alone does not establish either specified office. Manager cases are marked as the deliberately broader role family.';
save('rel_332','president or manager of',pmDefinition,pmScope,[
 [S,'Feldman is explicitly president of United Federation of Teachers; generic leader evidence is not needed.',[17,25],['mixed_evidence']],
 [S,'Young is explicitly manager and president of Giants; the linebacker-question path is unrelated.',[3195,3197,3198],['mixed_evidence','broad_predicate']],
 [E,'Terry is called a leader and runs Operation Rescue, but neither row identifies the chosen president or manager office.',[3865,3870],['other_predicate']],
 [S,'Harazin is explicitly Mets president and manager in several constructions.',[3362,3363,3364,3368],['broad_predicate']],
 [S,'Bergsten is explicitly president of Institute for International Economics; running the institute is corroborating but insufficient alone.',[106],['mixed_evidence']],
]);
save('rel_126','president or manager of',pmDefinition,pmScope,[
 [S,'Accorsi is explicitly Giants manager in possessive, of and noun-modifier constructions.',[3224,3225,3226],['broad_predicate']],
 [S,'Herzog is explicitly Cardinals manager in both rows.',[3379,3380],['broad_predicate']],
 [S,'Grunfeld is explicitly Knicks president and manager; director wording alone would be insufficient.',[1665,1666,1667,1670],['broad_predicate','mixed_evidence']],
 [S,'Cashen is explicitly Mets manager and president.',[3352,3353,3354,3356],['broad_predicate']],
 [S,'Phillips is explicitly Mets manager; the director row expresses another role.',[3184,3185,3186,3187],['broad_predicate','mixed_evidence']],
]);
const leadershipDefinition='X holds or held an explicit managerial or leadership office in organization or institution Y, such as chairperson, head, chief, director, president or executive.';
const leadershipScope='Preserves the prior managerial/leadership office predicate. Explicit named office qualifies. Founding, ownership, ordinary employment or attendance alone do not; generic athletic lead is not an organizational office.';
save('rel_326','managerial or leadership office in',leadershipDefinition,leadershipScope,[
 [S,'Murdoch is explicitly chairman and head of News Corporation; control/company/empire paths add broader context.',[258,262,265],['mixed_evidence']],
 [S,'Bogle is explicitly chairman and executive of Vanguard Group; founder alone would not establish the office.',[3845,3846],['mixed_evidence']],
 [S,'Eisner is explicitly Disney chairman in both direct chairman constructions.',[5126,5129]],
 [S,'Eisner is explicitly chairman, executive and head of Walt Disney Company.',[1271,1272,1273,1276]],
 [S,'Gates is explicitly Microsoft chairman; the several founding rows concern a correlated but different predicate.',[3900,5096,5097,5686,5687],['mixed_evidence']],
]);
save('rel_58','leader or organizational head of','X holds or held a leadership/head role in political body or organization Y.',
 'Preserves the previous leader/head scope and includes recognized legislative leadership within a chamber, without requiring sole leadership of the whole body. Head/leader office qualifies; simple membership or founding alone does not.',[
 [S,'Gephardt is explicitly a House leader and leader of its majority.',[3044,3045,3047,3048]],
 [S,'Robertson is explicitly head and leader of Christian Coalition; the founding row is a different predicate.',[3855,3860],['mixed_evidence']],
 [S,'Arafat is explicitly leader and head of Palestine Liberation Organization across the supplied rows.',[229,231,232,2935]],
 [S,'Trimble is explicitly head/leader of Ulster Unionist Party and heads it; a challenge from hard-liners is additional context.',[2894,2895,2897,2902],['mixed_evidence']],
 [S,'Bruno is explicitly a State Senate leader, including its majority leadership.',[4996,4997,4998,4999,5000,5005]],
]);
save('rel_29','winner or champion of','X won competition, race, championship, prize or award Y.',
 'Preserves the earlier winner/champion scope, with Y the event or award, not the defeated opponent. Teams, people and racehorses can win. Participation or finishing alone is not sufficient; a historical win qualifies.',[
 [S,'Patriots explicitly win Super Bowl and are called its champions.',[2247,2252,2256]],
 [S,'All three rows explicitly state Mets winning World Series.',[2207,2214,3476]],
 [S,'Tabasco Cat is explicitly a Preakness winner and wins it; beginning in an event is broader evidence.',[7794,7795,7796],['mixed_evidence']],
 [S,'Real Quiet is explicitly winner of Kentucky Derby and wins it; finishing/outrun rows alone would not suffice.',[7736,7737,7738,7741],['mixed_evidence']],
 [S,'Strange is explicitly United States Open champion/winner and wins it; play and tournament-context rows are mixed.',[7974,7975,7976,7977,7978],['mixed_evidence']],
]);
const subsidiaryDefinition='Organization or business unit X is a subsidiary, division, organizational part of, or owned business of parent organization Y.';
const subsidiaryScope='Preserves the earlier subsidiary/unit/organizational-containment predicate. Explicit unit, subsidiary, division, part or owned-by evidence qualifies. Mere geography, employee affiliation or partial investment alone does not. A location name standing for an unnamed office is ambiguous rather than silently converted into an organization.';
save('rel_9','subsidiary or organizational unit of',subsidiaryDefinition,subsidiaryScope,[
 [S,'Young & Rubicam is explicitly a unit/part of and owned by WPP Group.',[6718,6719,6720]],
 [S,'American Airlines is explicitly an AMR unit and subsidiary and is owned by it; offer/loss paths are different evidence.',[2561,2562,2563,2564,2566],['mixed_evidence']],
 [S,'American is explicitly an AMR unit and owned by it; the direct business role resolves the local shortened airline name.',[2551,2553]],
 [S,'United is explicitly a UAL subsidiary and owned by it; the business constructions resolve the local shortened organization name.',[2484,2485,6591]],
 [S,'Fox is explicitly a News Corporation unit, division, subsidiary and owned business.',[2511,2512,2514,2515,2516,2517,2520]],
]);
save('rel_282','subsidiary or organizational unit of',subsidiaryDefinition,subsidiaryScope,[
 [S,'J. Walter Thompson is explicitly a WPP unit, division and part in both sets of rows.',[4582,4583,4585,4588,6684,6685,6687,6690]],
 [S,'Foote is explicitly a True North unit/part and owned by it; the agency apposition identifies an organizational referent.',[2491,2492,2495,2496,2498,2499]],
 [A,'New York is a location naming an office in one row; the unit path does not identify which organizational unit the literal argument denotes.',[4187,4189],['entity_identity','attachment'],'Does New York denote a specific Hill office/business unit here, and if so what is its name?'],
 [S,'Fallon Worldwide is owned by, a unit of and part of Publicis Groupe.',[4624,4628,4629,4630]],
 [S,'Lowe Group is a unit/part of and owned by Interpublic Group of Companies; the voting row does not express ownership.',[6634,6636,6637,6638],['mixed_evidence']],
]);
save('rel_8','owns or is parent of','Person or organization X owns business, asset or organization Y, or is Y’s organizational parent.',
 'This is the direction-reversed ownership family, distinct from subsidiary-of. Direct owns, owner or parent evidence qualifies. A mere partial stake or proposed acquisition is not silently treated as full ownership; direct ownership elsewhere can support the fact. Historical ownership qualifies.',[
 [S,'Kalikow is explicitly owner of The New York Post and owns it; acquisition is additional evidence.',[1485,1488,1489,1492]],
 [S,'General Electric explicitly owns NBC and is its owner and parent; strategy/context rows are mixed.',[5980,5984,5985,5988,5989],['mixed_evidence']],
 [S,'The supplied relative-clause path directly states that Dolan owns Madison Square Garden; this is a textual-support judgment without external verification.',[5719]],
 [S,'Cablevision directly owns Garden; the partial-percentage row alone would not establish this broader ownership fact.',[5990],['mixed_evidence']],
 [S,'General Electric Company explicitly owns NBC and is its parent; the meeting/remarks row is unrelated evidence.',[5960,5961,5962,5964,5969],['mixed_evidence']],
]);
save('rel_31','spokesperson for','Person X serves or served as spokesperson for organization or principal Y.',
 'Preserves the previous spokesperson scope, including an explicitly identified press spokesperson. Generic secretary, aide or employee alone is insufficient; a personal principal can have a spokesperson. Direct spokesperson evidence can support a mixed case.',[
 [S,'O’Leary is explicitly New York City Transit spokesman in three constructions.',[399,400,402]],
 [S,'McCurry is explicitly White House spokesman; secretary and other location wording alone would not establish the role.',[1366,1368],['mixed_evidence']],
 [S,'Clark is explicitly spokesman for Hynes; the attorney apposition preserves the personal principal.',[370,371]],
 [S,'Burns is explicitly State Department spokesman; official alone would be a weaker role.',[1389,1390,1391,1392,1393],['mixed_evidence']],
 [S,'Lockhart is explicitly White House spokesman; secretary alone is not used to infer the role.',[1406,1407,1408,1410],['mixed_evidence']],
]);
save('rel_127','organizational leadership office in',leadershipDefinition,
 leadershipScope+' Membership, serving or sitting on a committee alone does not imply its leadership. A generic Democrat/Republican argument omits the individual officeholder and remains ambiguous under the same earlier rubric.',[
 [A,'There is chairman/head evidence but Republican does not identify a unique person; membership rows may also describe different people.',[6279,6280,6281,6282,6286],['entity_identity','mixed_evidence'],'Which individual Republican is the chairman/head of Finance Committee in these source sentences?'],
 [A,'Democrat is an unnamed affiliation covering head/chair and member/service paths; it does not identify a single committee leader.',[6299,6300,6301,6302,6304,6308],['entity_identity','mixed_evidence'],'Which individual Democrat is the Armed Services Committee leader, and do the member and chair rows refer to that same person?'],
 [E,'Sotheby being on York Avenue describes location or property context, not a leadership office in an organization.',[6249,6250],['other_predicate']],
 [A,'Republican has chairman/head evidence for Senate Finance Committee, but the literal argument leaves the officeholder unidentified.',[6344,6345,6346,6347,6348,6350],['entity_identity','mixed_evidence'],'Which named Republican holds or held this Senate Finance Committee leadership office?'],
 [S,'Farrakhan succeeds as head of Nation of Islam and leads it, supporting historical leadership.',[2948,2949,4970],['modality_time']],
]);
save('rel_290','managerial or leadership office in',leadershipDefinition,leadershipScope,[
 [S,'Brecher is explicitly director of/for/at Citizens Budget Commission.',[1751,1752,1753]],
 [S,'Ruttenstein is explicitly a Bloomingdale director; being there alone would be weaker evidence.',[707,710,711],['mixed_evidence']],
 [S,'The single row explicitly makes Wood a director at Bank of America.',[518]],
 [S,'Siegel is explicitly director and president of New York Civil Liberties Union; lawyer alone would not establish management.',[94,97,100],['mixed_evidence']],
 [S,'DeWaal is explicitly director for/at/of Center for Science; the shortened institution name remains locally interpretable.',[1743,1744,1745]],
]);
save('rel_251','directed communication to','X directs a communication, request, instruction, urging or submitted material to recipient Y.',
 'Preserves the prior directed-communication scope. Tell, urge and submit-to qualify; a source speaking through its spokesperson has the spokesperson as intermediary, not automatically recipient. Meeting, visits and support alone are insufficient.',[
 [E,'State Department disclosure through spokesman Boucher concerns an intermediary or speaking source, not communication addressed to Boucher.',[5441,5444],['direction','other_predicate']],
 [S,'Bush explicitly urges, tells and submits to Congress in repeated rows.',[437,439,442,2004,2006,2009]],
 [S,'Clinton explicitly urges, tells and submits to Congress.',[2023,2027,2029,7896,7900,7902]],
 [S,'Bush Administration explicitly tells, urges and submits to Congress.',[466,467,473,2073,2074,2080]],
 [S,'Administration explicitly submits to and urges Congress; institutional speakers are permitted.',[449,451,2016,2018]],
]);
save('rel_260','managerial or leadership office in',leadershipDefinition,leadershipScope,[
 [S,'Seidman is explicitly chairman of Federal Deposit Insurance Corporation.',[278,287]],
 [S,'Arafat is explicitly chairman of Palestine Liberation Organization in all supplied constructions.',[230,236,2934,2936,2942]],
 [S,'Dolan is explicitly chairman of Madison Square Garden; the longer incident path is not needed.',[5716,5717,5723],['mixed_evidence']],
 [S,'Eaton is explicitly Chrysler chairman; going there is a different predicate.',[5116,5117,5122],['mixed_evidence']],
 [S,'Gates is explicitly Microsoft chairman in all four supplied rows.',[3899,3901,5098,5688]],
]);
save('rel_159','has spokesperson','Organization or principal X has person Y serving as its spokesperson.',
 'Reverse direction of spokesperson-for. Direct organization-modifying-spokesman plus appositive person evidence qualifies. Merely speaking at a building, secretary without press/spokesperson context, or kinship alone does not.',[
 [S,'State Department spokesman is appositively identified as Redman; the other speaking-context rows are not required.',[5386,5387],['mixed_evidence']],
 [S,'White House spokesman is explicitly McClellan; secretary, kinship and speaking-at rows are mixed evidence.',[5406,5413],['mixed_evidence']],
 [S,'State Department spokesman is explicitly Boucher in appositive/possessive patterns; speaking at a place alone would be insufficient.',[5376,5377,5381,5383],['mixed_evidence']],
 [S,'Pentagon spokesman is explicitly Williams; appositive and speaking-source patterns agree.',[5446,5447,5448]],
 [S,'White House spokesman is explicitly McCurry; secretary and speaking-at rows are broader evidence.',[5396,5398,5402],['mixed_evidence']],
]);
save('rel_99','professor or university teacher at','X is a professor or teaches at academic institution Y.',
 'The dominant professor/teach paths define an academic teaching affiliation. Expert, specialist, dean, researcher or analyst alone need not imply a professorship or teaching role. Explicit professor/teaches evidence supports a mixed case; a location or attendance alone does not.',[
 [S,'Siegel is explicitly Cooper Union professor, and the expert clause says he teaches there; other expert/scientist roles are broader.',[345,349,352,353],['mixed_evidence']],
 [S,'Black is explicitly professor at Emory University; scientist/expert/specialist rows are related but broader roles.',[332,337],['mixed_evidence']],
 [S,'The row explicitly identifies Caplan as professor at University of Pennsylvania.',[515]],
 [S,'Gillers is explicitly professor and teaches at New York University Law School; one malformed professor spelling is not needed.',[322,325,327],['mixed_evidence']],
 [S,'Berne is explicitly New York University professor; dean and policy-expert descriptions alone would be insufficient.',[753,757],['mixed_evidence']],
]);
save('rel_347','business or organization based or located in','Business or organization X is based or physically located in geographic place Y.',
 'Preserves the prior location predicate. Explicit based-in and company/firm-in constructions qualify. Geographic noun modification can indicate a place, but nationality adjectives without a recoverable place and Wall Street used only as an industry label remain ambiguous; ordinary business association alone does not suffice.',[
 [S,'Dataquest is explicitly based in San Jose and described as a company there in several rows.',[5805,5810,5812,7100,7104,7106]],
 [A,'A based-in path supports a location relation, but its literal destination German is truncated or adjectival rather than an unambiguous place name.',[3607,3608],['entity_identity','attachment'],'Does German stand for Germany or for another truncated location in the original sentence?'],
 [S,'Petroleum Finance Company is explicitly a firm/company in Washington and based there; adjective-only evidence is not needed.',[7422,7427,7429]],
 [S,'International Data Corporation is explicitly a firm/company in Framingham and based there.',[5813,5814,5815,7147,7149]],
 [A,'Wall Street modifies firm and house, which can denote financial-industry affiliation rather than a physical address; no explicit based/in path resolves it.',[7380,7381,7382],['attachment'],'Is Birinyi Associates physically located on Wall Street here, or is Wall Street only an industry descriptor?'],
]);
console.log('Recorded 100 individual manual judgments.');
