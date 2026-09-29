// Read-only evidence flags, never semantic classifications.
import fs from 'node:fs';
import path from 'node:path';
import {json,fmt} from '../common.mjs';
export function identityFlag(c){
 const left=[...new Set(c.evidence.map(e=>e.arg1))],right=[...new Set(c.evidence.map(e=>e.arg2))],sameIdDifferentNames=c.entity1===c.entity2&&c.evidence.some(e=>e.arg1!==e.arg2);
 return left.length>1||right.length>1||sameIdDifferentNames?{case_id:c.case_id,left_names:left,right_names:right,same_entity_id_both_roles_with_different_literal_names:sameIdDifferentNames,source_lines:c.source_lines}:null;
}
export function collectIdentityDiagnostics(ROOT){
 const flags=[];
 for(const a of json(path.join(ROOT,'census_manifest.json')).audits){const d=json(path.join(ROOT,a.folder,'cases.json'));for(const r of d.relations)for(const c of r.facts){const flag=identityFlag(c);if(flag)flags.push({audit_id:a.audit_id,relation:r.relation,...flag,report:path.join(a.folder,'reports',r.relation+'.md')+'#'+c.case_id});}}
 return {note:'Inspection flags only: multiple names may be legitimate aliases; neither a grade nor an automatic reason to relabel. Same-ID incompatible role names are flagged even when each side has only one literal name.',count:flags.length,flags};
}
export function writeIdentityDiagnostics(root,{outputDirectory=root}={}){
 const result=collectIdentityDiagnostics(root);
 fs.mkdirSync(path.join(outputDirectory,'analysis'),{recursive:true});
 fs.writeFileSync(path.join(outputDirectory,'analysis/evidence_identity_flags.json'),fmt(result));return result.flags;
}
