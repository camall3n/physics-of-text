// Explicit manual labels after all full path dictionaries and every selected evidence row were read.
// Predicates were frozen separately before case review. No keyword-based semantic labels.
import fs from 'node:fs';import path from 'node:path';import {fileURLToPath} from 'node:url';import assert from 'node:assert/strict';
const folder=path.dirname(fileURLToPath(import.meta.url)),data=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'))),decl=JSON.parse(fs.readFileSync(path.join(folder,'predicate_declarations.json'))).declarations;
const S='supported',E='incorrect',A='ambiguous',mixed=['mixed_evidence'];
function save(id,rows){const r=data.relations.find(r=>r.relation===id),d=decl.find(d=>d.relation===id);assert.equal(rows.length,r.facts.length);const out={...d,facts:rows.map((x,i)=>({case_id:r.facts[i].case_id,judgment:x[0],reason:x[1],evidence_lines:x[2],issue_tags:x[3]??[],reviewer_question:x[4]??''}))};const file=path.join(folder,'annotations',id+'.json'),old=JSON.parse(fs.readFileSync(file));for(const k of ['label','definition','scope_notes'])assert.equal(old[k],d[k],'Preserve predeclared predicate');if(old.facts.some(c=>c.judgment))assert.deepEqual(old,out,'Later manual changes must be preserved');fs.writeFileSync(file,JSON.stringify(out,null,2)+'\n');}
save('rel_169',[
[S,'J. Walter Thompson is explicitly a WPP Group unit/part and is owned by it.',[4583,4586,4588,6685,6686,6688,6690]],
[S,'Bozell Worldwide is explicitly a Bozell unit/part and is owned by it.',[2501,2503,2504,2507,2510]],
[S,'Hughes is explicitly a General Motors Corporation subsidiary in the supplied row.',[6613]],
[S,'United is explicitly a UAL Corporation owned part/unit/subsidiary.',[2485,2486,2490,6588,6591,6592,6593,6597]],
[S,'The supplied Kellogg-to-Halliburton row explicitly identifies a unit of Halliburton.',[6600]]]);
save('rel_125',[
[S,'Merlis is explicitly a Morgan Stanley & Company analyst for/with/at the firm.',[7852,7853,7854]],
[S,'Goldman is explicitly a Merrill Lynch analyst; watcher evidence is supplementary.',[7847,7848],mixed],
[S,'Heinbach is explicitly a Merrill Lynch analyst in noun and with constructions.',[1816,7821,7824]],
[S,'Healy is explicitly a Burnham Securities analyst at/with/for the firm.',[603,604,605]],
[A,'The same first latent entity is Tom Wolzien, Kenneth S. Abramowitz and Gary D. Black. All have analyst evidence at the same company, but they do not identify a single person for this inferred pair.',[599,600,601,1790,1792,7845],['entity_identity'],'Which person should this fact identify, and should Wolzien, Abramowitz and Black be split into separate entities?']]);
save('rel_324',[
[S,'Jets explicitly defeat and beat Oakland as an opposing team; loss is mixed historical evidence.',[3463,3468],mixed],
[E,'Foote is part of True North Communications in the only path; no competitive defeat.',[2495],['predicate_boundary']],
[S,'Red Sox explicitly defeat Yankees; other supplied rows describe losses.',[868,6934],mixed],
[S,'Atlanta Braves explicitly defeat and beat New York Mets and have a victory over them.',[1011,1012,1013]],
[S,'Yankees explicitly beat, defeat and sweep Red Sox and have a victory over them.',[887,2582,3135,3139,3140,3141]]]);
save('rel_333',[
[S,'Mr. Lee is explicitly Taiwan president; generic lead alone would be weaker.',[984],mixed],
[S,'Lamoriello is explicitly Devils president in possessive and noun constructions.',[1636,1642],mixed],
[S,'Sather is explicitly Rangers manager and president.',[1626,1627,1629,1633],mixed],
[S,'Samaranch is explicitly I.O.C. president in three constructions; successor context is additional.',[2856,2857,2858],mixed],
[S,'Skilling is explicitly Enron president in all three supplied rows.',[1301,1303,8087]]]);
save('rel_274',[
[A,'Milosevic has leader-of evidence, but Yugoslav is an incomplete/adjectival political-body argument; persuade/accuse paths do not resolve it.',[2826,2827,2828],['argument_scope','mixed_evidence'],'Does Yugoslav refer to the state Yugoslavia or a more specific omitted institution in the original leader-of sentence?'],
[S,'Peres is explicitly Labor Party leader in noun, of and possessive constructions.',[5056,5057,5063]],
[A,'The same latent pair combines Trimble/Ulster Unionist Party with Science fiction/Wild West. Leadership is supported for the named politician but the two ordered entity identities are inconsistent.',[2895,2898,2902,2903,6040],['entity_identity','mixed_evidence'],'Should Science fiction/Wild West be separated from David Trimble/Ulster Unionist Party, and which entity pair is intended here?'],
[S,'Daschle is explicitly Senate leader/co-chairman.',[3007,3008]],
[E,'Siegel is identified only as New York Civil Liberties Union lawyer, without the declared leadership/head office.',[99],['predicate_boundary']]]);
save('rel_38',[
[S,'Krzyzewski is explicitly Duke coach in noun, at, possessive and of constructions.',[7253,7254,7255,7256],mixed],
[S,'Calhoun is explicitly Connecticut coach and coaches its team.',[7183,7184,7185,7186,7191,7192]],
[S,'Parcells is explicitly Giants coach and coaches them; winning-with is separate evidence.',[4074,4075,4076,4079,4080,4082],mixed],
[S,'Thompson is explicitly Georgetown coach and coaches its team.',[7213,7214,7215,7216,7217],mixed],
[S,'Jackson is explicitly Knicks coach in both supplied rows.',[6476,6481]]]);
save('rel_6',[
[S,'Knicks explicitly beat Bulls; play and loss rows are mixed evidence.',[871,6041],mixed],
[E,'Mets only play Phillies in this fact; participation does not establish defeating them under the predeclared predicate.',[6909],['predicate_boundary']],
[S,'Mariners explicitly beat Yankees; the play row is broader.',[6061],mixed],
[S,'Nets explicitly outscore Knicks, supporting a competitive win; the play row alone is broader.',[944],mixed],
[S,'Mets explicitly beat Cubs; the play row is broader.',[6958],mixed]]);
save('rel_132',[
[S,'Burtless is explicitly Brookings Institution economist in at, with and noun constructions.',[2388,2390,2397]],
[S,'Steinberg is explicitly Merrill Lynch economist in all eight supplied constructions.',[2322,2323,2325,2326,2327,2328,2330,2331]],
[S,'Roach is explicitly Morgan Stanley & Company economist; principal, specialist and analyst are additional roles.',[2340,2342,2343,2344],mixed],
[S,'Bernstein is explicitly Economic Policy Institute economist; co-author is supplementary.',[2332,2333,2337],mixed],
[S,'Liro is explicitly S. G. Warburg & Company economist in all three supplied rows.',[721,722,723]]]);
save('rel_175',[
[S,'Cole is explicitly director for the named Study of Automotive Transportation program/unit.',[1760]],
[S,'Bergsten is explicitly director for Institute for International Economics; meeting evidence is separate.',[108],mixed],
[S,'Mueller is explicitly F.B.I. director and takes that office.',[8453,8454,8457],mixed],
[S,'Fink has explicit director-for and director-of-communication paths to Department of Buildings, despite spokeswoman/spokesman rows.',[1214,1219],mixed],
[S,'Amlung has explicit director-for and director-of-communication paths to United Federation of Teachers, despite spokeswoman/spokesman rows.',[1203,1204],mixed]]);
save('rel_32',[
[S,'Rohatyn is explicitly Municipal Assistance Corporation chairman in all four rows.',[238,240,241,243]],
[S,'Arafat is explicitly Palestine Liberation Organization chairman in both rows.',[230,5735]],
[S,'Harding is explicitly Liberal Party leader and chairman.',[5047,5048,5049]],
[S,'Hill is explicitly District Council leader/head, which is included in the declared office family.',[174,177]],
[S,'Greenspan is explicitly Fed chairman in all five rows.',[5076,5077,5656,5657,5664]]]);
save('rel_164',[
[S,'Casey is explicitly director of the named Central Intelligence body, with tenure/successor context.',[124,125,127,130],mixed],
[A,'Stephanopoulos is Mr. Clinton director in a possessive path, but the organization or campaign in which the office is held is omitted.',[3529],['argument_scope','attachment'],'Which Clinton campaign, office or organization does director refer to, and should that body replace Mr. Clinton as the second argument?'],
[S,'Phillips is explicitly Mets manager/director. The additional manager-of row contains leaked source metadata but agrees with the uncorrupted office paths.',[3187,3189,3192],['malformed_path']],
[S,'Akashi is explicitly head of United Nations/its operation; diplomat alone would not establish the declared office.',[7465,7466],mixed],
[S,'Fehr is explicitly Players Association director, head and president.',[2924,2925,2926,2927,2928,2933]]]);
save('rel_138',[
[E,'Ameritech has a Bell-company compound and relative-position path; Bell is a corporate family/name here, not a geographical base.',[6844,6853],['predicate_boundary']],
[S,'T. Rowe Price is explicitly a company in/based in Baltimore.',[5823,5828]],
[S,'Mcorp is explicitly a company/group/concern in Texas, with banks across it.',[5793,5795,5797,5799,5801,5802],mixed],
[S,'Soundscan is explicitly a company in/based in Hartsdale.',[5833,5836],mixed],
[S,'Forrester Research is explicitly a firm/company/concern in Cambridge.',[7127,7128,7132,7134,7135],mixed]]);
save('rel_340',[
[S,'Ullrich explicitly wins Tour and is its champion/winner. Finishing, missing or winning one stage alone would not establish the full-event win; those are mixed paths.',[7784,7785,7786,7788],['mixed_evidence','malformed_path']],
[S,'Giants explicitly win Super Bowl, corroborated by victory constructions.',[2218,2224,3437,3438]],
[S,'Marlins explicitly win World Series and have its victory.',[2257,2258,2259]],
[E,'Schwartz has a street-in-Brooklyn path and misses Brooklyn; no competition or award won.',[975,979],['predicate_boundary']],
[S,'Cubs explicitly win World Series in all four supplied rows; the fact rubric allows a historical win.',[2267,2268,7764,7765]]]);
save('rel_329',[
[S,'Mr. Lee is explicitly born in Taiwan; native/grow/director and visit paths are additional meanings.',[981,982],mixed],
[S,'Rushdie is explicitly born in Bombay and into a family there.',[8401,8402,8403,8406]],
[S,'Sheng is explicitly born in Shanghai; study and student acceptance are additional meanings.',[8422,8423,8425],mixed],
[S,'Leach is explicitly born in England in the supplied row.',[8421]],
[S,'Yu Cho is explicitly born in Korea in the supplied row.',[8418]]]);
save('rel_338',[
[S,'Steinberg is explicitly Jets manager; vice-president and candidate context are separate evidence.',[3244,3249,3250],mixed],
[S,'Bianchi is explicitly Knicks manager in both rows.',[3204,3209]],
[S,'This separately represented Steinberg/Jets fact explicitly identifies manager office.',[3245]],
[E,'Democrats take White House; political control is not an explicit president/manager office under this ordered predicate.',[6430],['predicate_boundary']],
[S,'Accorsi is explicitly Giants manager in all three supplied rows.',[3224,3225,3226]]]);
save('rel_352',[
[S,'American is explicitly an AMR Corporation unit/subsidiary with parent/company constructions.',[2555,2558,6578,6582],mixed],
[A,'Chicago has part-of-unit/part-of-DDB Worldwide paths, but a geographic city is standing for an unnamed office or business unit.',[4125,4127,4130],['argument_scope'],'Which Chicago office or organizational unit is meant, and should its full name replace the city argument?'],
[E,'Israel and Olmert are linked through government/raid and hang-subject paths, without subsidiary or organizational-unit evidence.',[7040,7041],['predicate_boundary']],
[S,'TBWA Worldwide is explicitly part of Omnicom Group; the longer commercial/division path is supplementary.',[6654],mixed],
[S,'Young & Rubicam is explicitly part of WPP Group and has acquisition-by evidence.',[6719,6725,6727],mixed]]);
save('rel_72',[
[S,'Harding is explicitly head of and leads Liberal Party.',[5051,5053]],
[S,'Raske is explicitly Greater New York Hospital Association president/head.',[12,15]],
[S,'Franks is explicitly United States Central Command head in both supplied rows.',[2886,2892]],
[S,'Harazin is explicitly Mets president; negotiator and salary negotiation are different meanings.',[3368],mixed],
[E,'Kristol is identified only as Weekly Standard editor. The supplied path does not establish an organizational head/leadership office under the declared scope.',[2476],['predicate_boundary']]]);
save('rel_239',[
[S,'Murdoch is explicitly News Corporation chairman, executive and chief.',[258,260,263,265,267],mixed],
[S,'Scrushy is explicitly HealthSouth chairman; founder alone would not qualify.',[1265],mixed],
[E,'Israel enters from Gaza; the row contains no managerial or leadership office.',[4109],['predicate_boundary']],
[S,'Eaton is explicitly Chrysler chairman/executive.',[5116,5117,5118,5120,5122],mixed],
[S,'Conway is explicitly M.T.A. chairman in both rows.',[5726,5728]]]);
save('rel_42',[
[S,'United is explicitly UAL Corporation unit/subsidiary and is owned by it.',[2481,2482,2483,2484,2487,2488,6589,6594,6595]],
[S,'United is explicitly UAL unit/subsidiary and is owned by it.',[2531,2533,2536,2539,2540]],
[S,'Electronic Data Systems Corporation is explicitly General Motors Corporation unit/subsidiary/arm, with sale context.',[6623,6624,6628,6629],mixed],
[S,'American Airlines is explicitly an AMR Corporation unit in the supplied row.',[2568]],
[S,'Conde Nast Publications is explicitly an Advance Publications unit in the supplied row.',[6694]]]);
save('rel_304',[
[S,'Jets explicitly beat Dolphins and have a victory over them.',[2632,2635]],
[S,'Seattle Mariners explicitly beat New York Yankees; loss and commentary paths are mixed.',[1056],mixed],
[S,'Florida Marlins explicitly defeat New York Mets.',[1037]],
[S,'Mets have a victory over Yankees; the loss row describes another historical result.',[914],mixed],
[A,'The same first latent entity combines Montreal Expos and San Diego Padres. Both have defeat/beat evidence against Mets, but they are different teams and do not identify one inferred subject.',[1047,1048,1059,1060],['entity_identity','mixed_evidence'],'Should Montreal Expos and San Diego Padres be separated, and which team is intended by this latent fact?']]);
console.log('Recorded100 explicit judgments under the20 predeclared predicates.');
