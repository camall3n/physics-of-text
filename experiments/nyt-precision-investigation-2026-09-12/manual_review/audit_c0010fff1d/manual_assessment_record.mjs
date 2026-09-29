// Explicit manual judgments; no automatic semantic labeling.
import fs from 'node:fs';import path from 'node:path';import {fileURLToPath} from 'node:url';import assert from 'node:assert/strict';
const folder=path.dirname(fileURLToPath(import.meta.url)),data=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'))),S='supported',E='incorrect',A='ambiguous',mixed=['mixed_evidence'];
function save(id,label,definition,scope,rows){const r=data.relations.find(r=>r.relation===id);assert.equal(rows.length,r.facts.length);const out={relation:id,label,definition,scope_notes:scope,facts:rows.map((x,i)=>({case_id:r.facts[i].case_id,judgment:x[0],reason:x[1],evidence_lines:x[2],issue_tags:x[3]??[],reviewer_question:x[4]??''}))};const file=path.join(folder,'annotations',id+'.json'),old=JSON.parse(fs.readFileSync(file));if(old.facts.some(c=>c.judgment))assert.deepEqual(old,out);fs.writeFileSync(file,JSON.stringify(out,null,2)+'\n');}
const office='X holds or held an explicit managerial or leadership office in organization or institution Y, such as head, leader, president, manager, director, executive or chair.';
const os='Preserves prior managerial/leadership office scope, including public executive roles. Founding, ownership, ordinary employment, campaigning or sporting lead alone is insufficient. Competing predicates are retained as errors, not added to the definition.';
const defeat='X defeated opposing competitor Y in at least one competitive contest.';
const ds='Preserves winner-to-opponent scope. Beat, defeat and victory over qualify. Playing/facing, standings, losing, communication and professional affiliation alone do not. A historical win remains support when other rows describe losses.';
const win='X won competition, race, championship, prize or award Y.';
const ws='Preserves event/award winner scope. Y is the event or award, not a defeated opponent, political office, general venue or issuing organization unless the event referent is recoverable. Presence and participation alone do not qualify.';
const loc='Organization X is based, headquartered or physically located in geographical place Y.';
const ls='Preserves organization-location scope. Firm-in, based-in and headquarters evidence qualify; industry, a person birthplace, officeholders and unspecified nationality do not. Incompatible merged entity names require identity review.';
save('rel_87','managerial or leadership office in',office,os,[
[E,'Democrats only take White House; political control is not an explicit managerial office under this scope.',[6430],['predicate_boundary']],
[E,'Clark is spokesman for Hynes; neither row identifies a managerial office in an organization.',[370,371],['predicate_boundary']],
[S,'Thorn is explicitly Nets president and manager.',[1615,1616,1617,1619,1621],mixed],
[S,'Gearan is explicitly White House director and chief.',[8514,8517],mixed],
[S,'Messinger is explicitly president of the Manhattan borough.',[2812,2813,2816,2817],mixed]]);
save('rel_156','defeated opponent',defeat,ds+' The dictionary strongly mixes contest outcomes with directed communication; beat/defeat are its two most frequent paths. The chosen contest predicate is not uniquely compelled by this mixed cluster.',[
[E,'Mr. Clinton submits/sends to, persuades and works with Congress; these are communication/cooperation, not a competitive defeat.',[2045,2050,2051,7929,7931,7934],['predicate_boundary']],
[E,'Mr. Jordan tells and telephones Ms. Lewinsky; no defeat is expressed.',[8233,8236,8237],['predicate_boundary']],
[E,'Gephardt tells House and has speaker/task-force associations; no defeat is expressed.',[3046,3049,3050,3051],['predicate_boundary']],
[E,'Bensonhurst and Brooklyn occur in a racial/location dependency path, not a contest.',[1146],['predicate_boundary']],
[E,'Bush or the Bush administration asks and sends to Congress; no competitive defeat is expressed.',[2005,7863],['predicate_boundary']]]);
save('rel_298','economist at organization','Person X is an economist at, for, with or of organization Y.','Economist is the most frequent specific occupational path family. Professors, analysts, directors and other employment compete substantially; preserve the specific economist meaning instead of accepting any affiliation.',[
[S,'Roach is explicitly Morgan Stanley economist in at/for/of/with and possessive constructions.',[2347,2348,2349,2351,2352,2353,2354],mixed],
[E,'Rushdie is an author associated with India and book protests; he is not an economist at an organization in these rows.',[8392,8397,8398],['predicate_boundary']],
[E,'East New York endorses in Brooklyn in the supplied path; no economist affiliation.',[1087],['predicate_boundary']],
[E,'Greenspan is Federal Reserve chairman; the supplied fact has no economist role evidence.',[188,191,5646],['predicate_boundary']],
[E,'Mr. Bush has an office in and leaves for Washington; no economist affiliation.',[4103,7345],['predicate_boundary']]]);
save('rel_372','subsidiary or organizational unit of','Organization or business unit X is a subsidiary, division, owned business or organizational part of parent Y.','Preserves subsidiary/unit scope. Explicit unit, part, subsidiary or owned-by qualifies. Distinct latent facts with identical literal names remain separate under the preregistered population; this does not validate their splitting.',[
[S,'McCann-Erickson World Group is owned by Interpublic and explicitly its part/unit.',[6644,6645,6646,6647,6650]],
[S,'Conde Nast Publications is explicitly an Advance Publications unit.',[6694]],
[S,'This Fox fact is owned by and part of News Corporation.',[2513,2515],mixed],
[S,'This separate Fox fact is an owned division/subsidiary of News Corporation.',[2516,2517,2518,2520]],
[S,'DDB Worldwide is explicitly Omnicom Group part/unit, with office context in other rows.',[4631,4632,4636,4637],mixed]]);
save('rel_363','travels or moves to','Person, group or organization X travels, visits, arrives, returns or relocates to geographical place Y.','Preserves travel/relocation scope. Event participation, residence, death place, datelines and general association alone do not qualify; a relocation mentioned only as a potential move needs modal review.',[
[S,'Soviet Jews move/go/emigrate and are resettled in Israel.',[3479,3480,3484,3486,4781,4785,4786]],
[E,'Patriots reach/go to/play in Super Bowl as an event; no geographical travel destination is specified.',[2250,2253,2254,2255],['predicate_boundary']],
[E,'WASHINGTON is a dateline-like subject linked to United States officials; neither path establishes travel.',[676,678],['predicate_boundary','entity_identity']],
[E,'Edwards dies in Sarasota; death location is not evidence of travel to it.',[8202],['predicate_boundary']],
[A,'Yankees have a passive move-to-New-Jersey path but surrounding rows describe losing the team, attendance origins and designation for export; actuality of relocation is unresolved.',[4830,4834,4835,4837,4839],['modality_time','mixed_evidence'],'Does the original move-to sentence report an actual Yankees relocation, or a proposed/conditional move to New Jersey?']]);
save('rel_280','managerial or leadership office in',office,os,[
[E,'Sliwa is only identified as Guardian Angels founder; officeholding is not supplied.',[3889],['predicate_boundary']],
[S,'Rothman is explicitly director and heads Council of New York Cooperatives.',[180,182,183,186],mixed],
[S,'This Gates fact includes explicit Microsoft chairman evidence; founder is additional.',[5066],mixed],
[S,'This separate Gates fact has chairman/executive/head evidence alongside founder rows.',[5067,5071,5074,5698],mixed],
[S,'Kozlowski is explicitly Tyco executive, chairman and head; resignation supports a past role.',[1241,1242,1243,1244,1245,1246,1247],mixed]]);
save('rel_222','defeated opponent',defeat,ds,[
[E,'Bush endorses, supports and meets Sharon; no competitive defeat is supplied.',[8223,8224,8228,8230],['predicate_boundary']],
[E,'State Department has Boucher as spokesman, an inverse occupational relation.',[5376],['predicate_boundary']],
[E,'Giants have a game against Jets; playing alone does not establish a win.',[2626],['predicate_boundary']],
[E,'Republican has Ways and Means Committee chair/head/member evidence, not a competitive defeat.',[6289,6290,6292,6294,6297,6298],['predicate_boundary','entity_identity']],
[S,'East explicitly beats and defeats West and has a victory over it; contest context establishes opposing teams.',[6052,6054,6057],mixed]]);
save('rel_109','coach of','Person X coaches or holds/held coach office for team or athletic institution Y.','Preserves coach-specific scope. This dictionary contains substantial manager/president evidence too; those offices alone do not make someone a coach.',[
[S,'Sather is explicitly Rangers coach.',[1628]],
[E,'Feinberg dies at Mount Sinai Hospital; no coaching role.',[1769],['predicate_boundary']],
[S,'Jackson is explicitly Bulls coach and coaches them.',[6516,6517,6518,6519,6520]],
[E,'This latent pair merges Rabbi Spira/Maimonides death with Fitzgerald/United States attorney evidence; neither component establishes coaching.',[1778,8382,8383,8384,8387],['entity_identity','predicate_boundary']],
[E,'Checketts is Knicks president/manager; coach is not established by either row.',[1707,1708],['predicate_boundary']]]);
save('rel_84','organization based or located in',loc,ls,[
[S,'Futures Group is explicitly a firm in/based in Washington.',[7394,7396,7400],mixed],
[A,'Most rows place the Hicks firm in Dallas, but the same second entity also appears as Muse in an unrelated payment subject path; the fact has incompatible place/person-company referents.',[700,7413,7415,7417],['entity_identity','mixed_evidence'],'Should Dallas and Muse be separated, and which complete Hicks organization is intended by this latent pair?'],
[S,'Kohlberg is explicitly described as a firm based in New York.',[7354],mixed],
[E,'Rushdie has book/trial associations with India, not an organization location relation.',[8394,8396,8399],['predicate_boundary']],
[E,'Daniel has street/theatrical staging paths to Manhattan; neither establishes an organization based there.',[3997,4003],['predicate_boundary','entity_identity']]]);
save('rel_89','managerial or leadership office in',office,os,[
[S,'Parsons is explicitly AOL Time Warner executive in possessive and contextual constructions.',[1323,1324,1325],mixed],
[E,'Kohlberg acquires or is specialist in New York in these paths; no officeholding is supplied.',[7357,7360],['predicate_boundary']],
[S,'Greenspan is explicitly Federal Reserve Board chairman; nomination/replacement context is additional.',[198,200,5682],mixed],
[S,'Mr. Ferrer is explicitly Bronx borough president.',[2836,2837],mixed],
[A,'Milosevic has president-of evidence but Yugoslav is an adjectival/truncated argument rather than a clearly preserved political institution.',[2824,2828],['argument_scope'],'Does Yugoslav stand for the state Yugoslavia or a more specific omitted body in the original president-of sentence?']]);
save('rel_187','winner or champion of',win,ws,[
[A,'De La Hoya wins/retains a championship/title modified by World Boxing Council; Y literally names the sanctioning body, leaving the particular event/title omitted.',[8007,8010,8012,8013],['argument_scope'],'Should World Boxing Council be interpreted as a specific WBC title here, and which title is intended?'],
[S,'This Red Sox fact explicitly wins World Series title/championship; loss and reaching the event are separate.',[2199,2203],mixed],
[E,'Britain hands over to and has promise context with China; this is not a competition/award won.',[5171,5174],['predicate_boundary']],
[S,'This separate Red Sox fact explicitly wins World Series in several rows.',[2197,2198,2200],mixed],
[S,'Cash is explicitly Wimbledon champion/winner and wins it.',[7994,7995,7996,7997,7998,7999],mixed]]);
save('rel_258','managerial or leadership office in',office,os+' The full leading distribution includes leader/chief/chair office paths alongside a strong spokesman family, lawyers, accusations and residence. Office is declared without adding those competing roles.',[
[E,'Miller is lawyer in Queens; occupational location is not institutional leadership.',[2300,2301,2302,2303],['predicate_boundary']],
[E,'Bush leads Mr. Gore in a bare person-to-person competitive path; no institutional office is expressed.',[3084],['predicate_boundary']],
[E,'Burns is State Department spokesman/official; a managerial leadership office is not established.',[1390,1393,1394],['predicate_boundary']],
[A,'Milosevic has leader-of evidence but Yugoslav is an incomplete political-entity argument.',[2823,2827],['argument_scope'],'What complete state or organization is represented by Yugoslav in the leader-of construction?'],
[E,'Serbs are driven from Croatia; this is displacement rather than leadership.',[2152],['predicate_boundary']]]);
save('rel_196','organization based or located in',loc,ls,[
[S,'Morningstar is explicitly a firm/group/service in Chicago.',[5748,5752,7110,7112,7116],mixed],
[S,'I.B.M. is explicitly based/headquartered in Armonk in repeated rows.',[798,799,800,801,807,4394,4395,4396,4397,4403],mixed],
[S,'International Data Corporation is explicitly a company based in Framingham.',[5817]],
[S,'Qwest is explicitly based/headquartered in Denver.',[4364,4365,4366,4370],mixed],
[S,'Semiconductor Industry Association is explicitly based in Cupertino.',[848,849]]]);
save('rel_13','directed communication to','X communicates a request, information, message, advice or testimony to addressee Y.','Preserves ask/tell/urge/send/notify directed-communication scope. Co-occurrence, bare political criticism, possession and standings do not qualify. Non-alias source people merged in one entity require identity review even if both communicate.',[
[S,'Clinton calls on, submits to and persuades Congress.',[2026,2029,7898],mixed],
[E,'Senate and Republicans occur in a have-subject path, without communication.',[4897],['predicate_boundary']],
[E,'Yankees have standings/place evidence in American League East, without communication.',[2734,2740],['predicate_boundary']],
[A,'The same first latent entity is Bush and Mr. Greenspan. Both have communication evidence to Congress but are distinct people, so the inferred fact lacks a single resolved identity.',[416,423,437,442,444,2006,7855],['entity_identity','mixed_evidence'],'Can Bush and Mr. Greenspan be separated into their intended entity identities before assessing this communication fact?'],
[E,'Mr. Clinton assails Republicans; bare criticism does not establish an addressed communication under the declared scope.',[5550],['predicate_boundary']]]);
save('rel_323','winner or champion of',win,ws+' The distribution substantially mixes event winning with travel/presence and political control; do not broaden winner to all in/go-to associations.',[
[S,'Mets explicitly win World Series title in two rows.',[2216,3478],mixed],
[E,'Americans are present, serve, fight, visit, die or are missing in Vietnam; no event/award won.',[8170,8174,8175,8176,8177,8178,8179],['predicate_boundary']],
[E,'Nixon goes to and visits China; travel is the competing meaning.',[3417,3420,3422,3426],['predicate_boundary']],
[E,'Meyer owns Union Square Cafe, not an event/award victory.',[1436],['predicate_boundary']],
[E,'Sosnik is White House adviser/director; no event or award win.',[8509,8513],['predicate_boundary']]]);
save('rel_188','analyst at organization','Person X is an analyst at, with or for organization Y.','Preserves analyst-specific affiliation. Other offices, ownership, corporate unit and political control are outside scope.',[
[S,'Mehta is explicitly analyst with/at Mehta & Isaly; partner is a separate role.',[1784,1787],mixed],
[E,'Mara is Giants co-owner/officer; no analyst role is supplied.',[1698,1701,1704],['predicate_boundary']],
[E,'Bozell Worldwide is a Bozell unit, not a person analyst.',[2506],['predicate_boundary']],
[E,'State Department has Redman as spokesman in an inverse-role path, not an analyst affiliation.',[5395],['predicate_boundary']],
[E,'Republicans hold White House; this is political control, not analyst affiliation.',[2779],['predicate_boundary']]]);
save('rel_47','owns or is parent of','Person or organization X owns business, organization or property Y, or is its corporate parent.','Preserves ownership/parent scope, allowing personal owners and properties. Officeholding, political association, travel and criminal-case location do not suffice.',[
[S,'Cablevision explicitly owns Madison Square Garden and is its owner.',[5920,5921,5922,5924,5926],mixed],
[S,'Meyer is explicitly owner of Union Square Cafe.',[1435]],
[E,'Mr. Smith has crime, traffic-stop and charge-location paths in Brooklyn; ownership is not supplied.',[967,969,970],['predicate_boundary']],
[S,'Steinbrenner is explicitly Yankees owner and owns them.',[1495,1496,1497,1501,1504],mixed],
[E,'Democrats and Hillary Rodham Clinton have campaign/money associations, without ownership.',[7591,7594],['predicate_boundary']]]);
save('rel_197','director of organization','Person X holds or held an explicit director office in organization or institution Y.','Director-specific role declared from the leading dictionary family. Head/president, founder, ordinary employment and birthplace alone are not equivalent. Co-director qualifies; title modifiers without a complete referent require review.',[
[S,'Hoover is explicitly F.B.I. director in of/noun/possessive constructions.',[8494,8495,8497],mixed],
[E,'Spinola is president/head of Real Estate Board of New York, with no director role supplied.',[87,88,90,91,92,93],['predicate_boundary']],
[E,'Kraushaar follows for Merrill Lynch in the sole path; no director office.',[610],['predicate_boundary']],
[E,'Bobbitt was born and spent childhood in Ecuador; no director relation.',[8428,8429,8430,8431,8432],['predicate_boundary']],
[A,'One latent pair combines Mr. Lee/Taiwan birth-president-director-modifier evidence with Roberts/Dartford death evidence. Entity identities and the director modifier referent cannot be resolved.',[981,984,985,989,8203],['entity_identity','argument_scope','mixed_evidence'],'Which identities should replace this merged pair, and does the director-amod sentence establish Mr. Lee as director of any Taiwan institution?']]);
save('rel_134','has political or institutional leader','Political body or institution X has person Y as leader, president, minister or head.','Preserves inverse political-leadership scope. Explicit minister office is included. Forward person-to-body leadership, mere presence and resignation without an office are not the same ordered relation.',[
[S,'Britain has Blair as minister in explicit possessive/relative constructions.',[7007,7014],mixed],
[E,'Herzog resigns with Cardinals; the ordered pair is person-to-team and supplies no inverse leader relation.',[3381],['predicate_boundary','direction']],
[E,'Congress has office, delivery, sending and confrontation associations with Washington; the latter is not a named leader here.',[5180,5181,5182,5183,5184],['predicate_boundary']],
[E,'Bruno leads Senate majority in the forward direction; this cluster predicate requires institution first.',[3023],['direction']],
[S,'Senate has Daschle as leader in the leader-in-Senate construction.',[7648],mixed]]);
save('rel_221','spokesperson for','Person X is spokesperson for organization, office or person Y.','Preserves spokesperson/speak-for scope and direction. Other roles, reversed legal representation, corporate location and contest outcomes do not qualify.',[
[E,'Pearl Meyer & Partners is a firm/consultant in New York, not a spokesperson for it.',[7158,7160,7163],['predicate_boundary']],
[S,'Fink is explicitly Department of Buildings spokeswoman/spokesman in several constructions.',[1213,1215,1216,1217,1218],mixed],
[E,'Toronto Blue Jays have contract-offer and beat-Yankees evidence, not a spokesperson role.',[1044,1045],['predicate_boundary']],
[E,'Simpson has Shapiro as lawyer/counsel; legal representation is in the inverse direction and does not make Simpson Shapiro spokesperson.',[3817,3818,3820,3826],['predicate_boundary','direction']],
[S,'Patterson is explicitly Economic Development Corporation spokeswoman/spokesman.',[1223,1224,1225,1226]]]);
console.log('Recorded 100 explicit manual judgments.');
