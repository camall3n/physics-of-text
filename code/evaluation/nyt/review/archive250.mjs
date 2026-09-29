import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,fmt,sha} from '../common.mjs';
export function createArchive250Review(ROOT) {
const dir=path.join(ROOT,'supplemental/audit_archive250');
function recordArchive(relation,groups){
 const r=json(path.join(dir,'cases.json')).relations.find(r=>r.relation===relation);
 const p=json(path.join(ROOT,'analysis/predicate_catalogue.json')).predicates.find(p=>p.id==='managerial_office_in');
 const seen=new Map();for(const [indices,judgment,reason,tags=[],question='']of groups)for(const i of indices){
  assert(Number.isInteger(i)&&r.facts[i]&&!seen.has(i));assert(['supported','incorrect','ambiguous'].includes(judgment));assert(judgment!=='ambiguous'||question);
  const c=r.facts[i];seen.set(i,{case_id:c.case_id,judgment,reason:c.names.map(n=>n.value).join('; ')+': '+reason,evidence_lines:c.source_lines,issue_tags:tags,reviewer_question:question,provisional:false,reviewer:'root',review:{method:'Explicit manual judgment after reading the full dictionary and all case rows.'}});
 }
 assert.equal(seen.size,r.facts.length);
 const a={relation,predicate_id:p.id,label:p.label,definition:p.definition,scope_notes:p.scope_notes,facts:r.facts.map((_,i)=>seen.get(i)),predicate_provenance:{source:'../../analysis/predicate_catalogue.json',catalogue_sha256:sha(fs.readFileSync(path.join(ROOT,'analysis/predicate_catalogue.json'))),reason:'All 15 dictionaries were inspected before fact grading and contain a dominant mixture of explicit management titles. The same broad office predicate is declared for all 15, not a title-specific label selected per successful case. This broad-role supplemental archive result is separate from the full-corpus comparison.'}};
 fs.writeFileSync(path.join(dir,'annotations',relation+'.json'),fmt(a));console.log(relation,r.facts.length);
}

return {recordArchive};
}
