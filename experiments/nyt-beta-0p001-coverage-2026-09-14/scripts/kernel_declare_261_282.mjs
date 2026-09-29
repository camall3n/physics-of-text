import {declarePredicate} from './declare_predicate.mjs';
import fs from 'node:fs';
const b=new URL('../',import.meta.url).pathname;
const rows=[
[209,'geographic_part_of',[5,7,8,10],'Four explicit geographic section/intersection/in paths form the dominant coherent directed family; sports preparation, victory and loss paths are separate.'],
[212,'official_of',[0,6,7],'Explicit institutional official descriptions and official/aide context form the core; separate chair and adviser paths do not broaden this to generic affiliation.'],
[219,'defeated',[0],'Repeated outlast is the dominant clear competitive outcome predicate; civil-liberties institution paths are separate.'],
[220,'member_of',[0,1,2,8,10],'Repeated member and appointment paths identify institutional membership; generic speech to players is unrelated.'],
[231,'has_political_leader',[3,5,6],'Government led by and country leadership/secretary context identify the inverse political leadership family; departure and generic talks do not redefine it.'],
[297,'has_medical_condition',[0,1,3,5,6,9,10],'Disease, diagnostic symptoms and death-from paths coherently identify a medical condition; election and administrative record paths are separate.'],
[316,'analyst_for',[1,2],'Repeated professional following of industry/business for an employer is the dominant coherent four-row analyst family; official and invasion paths are unrelated.'],
[344,'coach_of',[1,2,5],'Three direct coach/continue-as-coach/retire-as-coach paths define the specific office; athletic statistics and consultant location do not broaden it.'],
[385,'coach_of',[4,5,6,7,10],'The five explicit coaching paths form the dominant directed title family; legislative director and lobbyist roles are separate.'],
[20,'unresolved_relation',[],'Central review approved no recoverable stable directed predicate: singleton withdrawal comments, meeting at an office, words, be-among, race/include and opposing cuts have no coherent dominant relation. All cases remain in evaluation.'],
[21,'organization_national_affiliation',[1,2,3,4,6],'National monopoly/producer/company descriptors and national-government attachment form a coherent larger family; a personal wing of a political organization is separate.'],
[27,'winner_of',[0,1,2,3,4,5],'All paths describe winning or being awarded sporting championships or an honor award; inherited winner_of explicitly includes both kinds of award.'],
[41,'candidate_for',[0,1],'Four repeated candidate/nominee rows form the clearest specific title family, tied in broad volume with several managerial roles; selecting candidacy preserves specific title rather than merging unrelated offices.'],
[48,'travels_to',[5,6,8],'Three crossing/making/sneaking into movement paths form the largest coherent explicit family, separate from two coach paths and legal defense paths; centrally approved.'],
[55,'organizational_leader_of',[6,7,8],'Leader resignation, leader-of and speaker office identify political institutional leadership; speeches on the floor alone do not establish leadership.'],
[97,'coach_of',[1,6,7],'Coach and football leadership with bench context form the coaching family; manager dismissal is a separate specific title.'],
[115,'has_lawyer',[0,1,2,3,4,5,6,8],'Repeated possessive lawyer paths explicitly identify the client-to-lawyer direction.'],
[137,'athlete_for',[2,6,7,8],'Lead/pace and rebound/triple-double plus team signing form the coherent player contribution family; transportation and generic movement remain separate.'],
[143,'has_diplomatic_relations_with',[0],'Five repeated ambassador-of-X-to-Y paths form a clear dominant diplomatic-accreditation family; leader and wartime paths are separate.'],
[148,'legal_specialist_in',[0,1,2,3,6],'Legal authority, lawyer specializing in issues, lawyer-on and specialist field paths form a coherent expertise family; generic media employer paths and geographic lawyer modifiers are outside it.']
];
fs.writeFileSync(b+'analysis/kernel_declarations_261_282.json',JSON.stringify({declarations:rows.map(([r,p,i,t])=>({relation:'rel_'+r,predicate_id:p,supporting_path_indices:i,rationale:t,reviewer:'nyt_kernel_audit'}))},null,2)+'\n');
for(const [r,p,i,t] of rows)declarePredicate(b+'census/audit_06dbdb9b03af',{relation:'rel_'+r,predicate_id:p,supporting_path_indices:i,rationale:t,reviewer:'nyt_kernel_audit'});
