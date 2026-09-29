const fs=require('fs'),path=require('path');
const evidence=JSON.parse(fs.readFileSync(path.join(__dirname,'cases.json')));
module.exports=function(relation,label,definition,scope_notes,records){
const source=evidence.relations.find(r=>r.relation===`rel_${relation}`);
if(!source||records.length!==source.facts.length)throw Error('Bad relation/case count');
const facts=records.map((r,i)=>{const [suffix,judgment,reason,evidence_lines,issue_tags=[],reviewer_question='']=r; const c=source.facts[i];if(!c.case_id.endsWith(suffix))throw Error('Order mismatch '+suffix);if(!['supported','incorrect','ambiguous'].includes(judgment))throw Error('Bad judgment');if(!reason||!evidence_lines.length||evidence_lines.some(n=>!c.evidence.some(e=>e.line===n)))throw Error('Bad citation');if(judgment==='ambiguous'&&!reviewer_question)throw Error('Missing question');return {case_id:c.case_id,judgment,reason,evidence_lines,issue_tags,reviewer_question};});
const file=path.join(__dirname,'annotations',source.relation+'.json');
const old=JSON.parse(fs.readFileSync(file));if(old.facts.some(f=>f.judgment))throw Error('Refusing overwrite');
fs.writeFileSync(file,JSON.stringify({relation:source.relation,label,definition,scope_notes,facts},null,2)+'\n');};
