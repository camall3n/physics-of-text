import fs from 'node:fs';
const rows=[
[341,'met_with',[0,1,2,12],'Explicit meet/meeting and arrival for talks form the largest coherent family; coach roles are competing minority meanings.'],
[392,'geographic_part_of',[0,1,6,7,10],'Literal neighborhoods in larger New York boroughs form the largest geographic-containment family; chair nomination/office is distinct.'],
[395,'travels_to',[0,1,9],'Return/go destination movement dominates; sporting venue participation is a distinct competing family.'],
[8,'sells_to',[0,2],'Explicit sales and weapons-sale paths form the leading coherent family; shock, send and chair roles are not merged into it.'],
[35,'present_in',[0,1],'Speech-in geographic place is the largest identifiable family after inspecting person/place arguments; publication-in and athletic paths are distinct and will not establish geographic presence.'],
[44,'politically_controls',[0,1,4],'Political group control dominates the control paths; sports/corporate leadership and inverse individual leaders remain distinct.'],
[46,'president_of',[0,2,3,4,5,7,10,12,13],'Specific president office dominates, with a small organizational location and artistic-review minority.'],
[85,'managerial_office_in',[2,4,5,6,7,8,12,13],'Mixed co-director, balletmaster-in-chief and chair/department-director paths identify broad managerial office; no single title dominates this family. Spokesperson and ownership alone remain excluded.'],
[88,'has_minister',[0,1],'Explicit country-to-minister paths form the coherent inverse minister family; does not infer head-of-government from unspecified minister.'],
[109,'has_political_leader',[0,1,2,6,7],'All literal argument pairs are legislature-to-person and dominant paths identify legislative leadership.'],
[181,'died_in',[1,3],'Victim kill-object and passive killed-in paths provide four explicit death-place rows, exceeding three residence rows as the largest specific interpretable family. Active killing is not victim death; residence/shooting alone are not imported as death.'],
[202,'communicates_to',[0,1,2,3,4,6,9,11,12],'Testimony and addressed speech dominate; the receiving legislature or committee is the addressee.'],
[218,'has_coach',[3],'All literal first arguments are teams and second arguments named coaches; explicit possessive coach paths resolve the otherwise noisy reporting and malformed coach paths.'],
[256,'chairperson_of',[0,2,3],'Chair office/tenure family is uniquely interpretable amid dateline/place/agency and geographic disturbance paths; nominations alone still do not establish tenure.'],
[326,'travels_to',[0,9,10],'Leave-for destination movement is the leading repeated path; geographic team relocation is distinct from membership and political control.'],
[384,'lobbyist_for',[0,1,6],'Explicit lobbyist paths total five and form the largest specific role family; director of legislation, ownership and other roles remain separate.'],
[388,'known_as',[3,4,5,10,14],'Alias/known-as paths form the leading coherent family after checking literal retirement-system/Calpers roles; coaching, management and location remain competitors.'],
[50,'organizational_leader_of',[0,1,2,3,8,9,10],'Legislative leader/majority-leader paths dominate with the person-to-body direction.'],
[60,'located_in',[0,5,6,9,10,11,12],'Auction-house premises, building, gallery and headquarters at street location form the largest coherent family; personal White House affiliation and sports champion meanings remain distinct.'],
[69,'lawyer_for',[1,2,3,8,9,11,13],'Explicit attorney-for-public-jurisdiction role paths dominate; proposed Olympic destination and athlete/team movement are distinct.']
];
fs.writeFileSync('analysis/evaluation_declarations_161_180.json',JSON.stringify({declarations:rows.map(([r,predicate_id,supporting_path_indices,rationale])=>({relation:'rel_'+r,predicate_id,supporting_path_indices,rationale,reviewer:'evaluation',complete_dictionary_read:true,argument_roles_inspected:true}))},null,2)+'\n');
