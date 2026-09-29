// Explicit manual adjudications after reading all complete signatures in the diagnostic.
// This is not a semantic classifier and must not select cases by a keyword rule.
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
const b=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const decisions=[
 ['audit_9c88162c7b22','rel_228__ent_108__ent_1047','director_of','ambiguous','supported','Direct director-for titles identify Better Long Island as the institutional principal. The shortened institutional label is accepted consistently with the preserved role-and-shorthand convention.','', ['institutional_shorthand']],
 ['audit_06dbdb9b03af','rel_1__ent_547__ent_789','located_in','supported','ambiguous','The sole have-working-in path omits who or what is working in Armonk. It does not clearly identify company premises, an office, or a base.','Does the complete sentence place an I.B.M. office or facility in Armonk, or only unspecified people/things working there?', ['attachment']],
 ['audit_dcb746fa83d6','rel_67__ent_93__ent_82','travels_to','ambiguous','supported','The unqualified go-to path states a journey to Birmingham. A separate story/bombing path does not explicitly mark that journey as a title or hypothetical event; apply the same literal movement convention as the preserved prior census.','', ['mixed_evidence']],
 ['audit_06dbdb9b03af','rel_206__ent_281__ent_82','travels_to','ambiguous','supported','The unqualified go-to path states a journey to Birmingham. A separate story/bombing path does not explicitly mark that journey as a title or hypothetical event; apply the same literal movement convention as the preserved prior census.','', ['mixed_evidence']],
 ['audit_dcb746fa83d6','rel_187__ent_1368__ent_1197','member_of','ambiguous','incorrect','The House-to-Senate bare join path connects counterpart legislative bodies and supplies no membership or accession role. Joining in action does not establish that one chamber is a member of the other.','', ['wrong_relation']],
 ['audit_dcb746fa83d6','rel_253__ent_901__ent_303','reviews_artistic_output_of','supported','ambiguous','The isolated review-of-Shakespeare-Theater path does not establish whether the object is an artistic producer/ensemble or a venue. The frozen predicate explicitly requires this distinction.','Does Shakespeare Theater identify the producer of the reviewed work, or only a venue being reviewed?', ['venue_producer_ambiguity']],
 ['audit_dcb746fa83d6','rel_180__ent_1386__ent_818','travels_to','incorrect','ambiguous','The bare return-to edge is accompanied by returning territory and a hand-over. The moving entity may be omitted territory rather than Britain; the retained paths do not resolve that attachment.','Does the return-to sentence describe British movement to China or Britain returning territory to China?', ['attachment']],
 ['audit_dcb746fa83d6','rel_241__ent_1299__ent_1107','has_political_leader','incorrect','ambiguous','The leader construction supplies Republicans instead of an identified individual officeholder. The frozen scope marks an unnamed political leader as ambiguous.','Which individual Senate leader is meant by the extracted Republicans argument?', ['unnamed_person']],
 ['audit_06dbdb9b03af','rel_112__ent_852__ent_613','economist_for','ambiguous','supported','Four explicit economist-at/for/of/with paths identify Bear as the employer/principal. Accept the coherent institutional shorthand under the preserved convention, without importing another fact.','', ['institutional_shorthand']],
 ['audit_9c88162c7b22','rel_334__ent_1048__ent_1049','director_of','ambiguous','supported','Explicit director-at/of/for paths identify Center for Science as the institutional principal. Accept the shortened institution consistently with the preserved role-and-shorthand convention.','', ['institutional_shorthand']],
 ['audit_e318fe663470','rel_290__ent_1162__ent_1088','located_in','supported','ambiguous','The sole firm-to-Cambridge connection is an untyped dependency. It does not supply a clear locative or geographic noun-modifier attachment; this matches the preserved complete-evidence reference.','Does the untyped dependency describe a firm located in Cambridge, or another relation to Cambridge?', ['attachment']],
 ['audit_e318fe663470','rel_368__ent_1151__ent_215','succeeded_person','supported','ambiguous','Replacement, substitution and taking a place are explicit, but the retained paths do not identify the role being taken over or establish its tenure. The senator context alone does not distinguish candidacy from an already held office.','Which role did Lautenberg take over from Torricelli, and do these rows establish taking that role rather than replacement as a candidate?', ['role_or_tenure_ambiguity']],
 ['audit_06dbdb9b03af','rel_51__ent_1151__ent_215','succeeded_person','supported','ambiguous','Replacement, substitution and taking a place are explicit, but the retained paths do not identify the role being taken over or establish its tenure. The senator context alone does not distinguish candidacy from an already held office.','Which role did Lautenberg take over from Torricelli, and do these rows establish taking that role rather than replacement as a candidate?', ['role_or_tenure_ambiguity']],
 ['audit_9c88162c7b22','rel_33__ent_183__ent_189','agreed_with','supported','ambiguous','Agreement-with is explicit, but the sole Administration argument does not identify which administration is the institutional principal.','Which administration entered the agreement with Congress?', ['unnamed_principal']],
];
const log=[];
for(const [audit,id,predicate,before,after,reason,question,tags] of decisions){
 const folder=path.join(b,'census',audit),rel=id.split('__')[0],f=path.join(folder,'annotations',rel+'.json');
 const d=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'))),r=d.relations.find(x=>x.relation===rel);assert(r.rank>20,'Never revise the frozen top20');
 const raw=fs.readFileSync(f,'utf8'),a=JSON.parse(raw);assert.equal(a.predicate_id,predicate);
 const c=r.facts.find(x=>x.case_id===id),j=a.facts.find(x=>x.case_id===id);assert(c&&j);
 if(j.adjudication?.script==='adjudicate_exact_evidence.mjs'){assert.equal(j.judgment,after);continue;}
 assert.equal(j.judgment,before,id);assert(after!=='ambiguous'||question);
 const history=path.join(folder,'annotation_history',rel);fs.mkdirSync(history,{recursive:true});
 fs.writeFileSync(path.join(history,'exact_evidence_before_'+id+'.json'),raw);
 log.push({audit,case_id:id,predicate_id:predicate,before:JSON.parse(JSON.stringify(j)),after,reason,question,tags});
 j.judgment=after;j.reason=c.names.map(n=>n.value).join('; ')+': '+reason;j.issue_tags=tags;j.reviewer_question=question;
 j.adjudication={reviewer:'root',script:'adjudicate_exact_evidence.mjs',method:'Manual complete-evidence consistency adjudication; definition and population unchanged.',reviewed_at:new Date().toISOString()};
 fs.writeFileSync(f,JSON.stringify(a,null,2)+'\n');
}
const logpath=path.join(b,'analysis','exact_evidence_adjudications.json');
if(log.length)fs.writeFileSync(logpath,JSON.stringify({method:'Explicit manually adjudicated cases, not automatic semantic propagation. Prior top20 untouched; every earlier annotation preserved in annotation_history.',changes:log},null,2)+'\n');
console.log(JSON.stringify({changed:log.length}));
