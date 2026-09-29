import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,fmt} from '../common.mjs';
export function createScopeRecorder(ROOT,{audit,reviewer='runner',fileName='runner_scope_assignments.json'}={}){
function add(entries){const file=path.join(ROOT,'analysis',fileName),out=fs.existsSync(file)?json(file):{audit_id:audit,status:'Dictionary-first assignment declarations; no case grades',declarations:[]};const cases=json(path.join(ROOT,'census',out.audit_id,'cases.json'));for(const [relation,predicate_id,supporting_path_indices,rationale]of entries){assert(!out.declarations.some(x=>x.relation===relation),'Repeated scope '+relation);const r=cases.relations.find(r=>r.relation===relation);assert(r&&r.rank>20);assert(supporting_path_indices.every(i=>i>=0&&i<r.paths.length));out.declarations.push({relation,predicate_id,supporting_path_indices,rationale,reviewer,rank:r.rank,complete_dictionary_read:true,argument_roles_inspected:true});}out.declarations.sort((a,b)=>a.rank-b.rank);fs.writeFileSync(file,fmt(out));console.log(out.declarations.length+' scopes recorded');}

return {add};
}
