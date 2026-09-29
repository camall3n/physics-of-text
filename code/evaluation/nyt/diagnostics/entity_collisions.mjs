// Read-only diagnostic: flags possible collisions; never assigns or changes labels.
import fs from 'node:fs';
import path from 'node:path';
export function collectEntityCollisionFlags(root){
const flags=[];
const manifest=JSON.parse(fs.readFileSync(path.join(root,'census_manifest.json')));
for(const entry of [...manifest.audits].sort((a,b)=>a.audit_id.localeCompare(b.audit_id))){
 const audit=entry.audit_id,folder=path.join(root,entry.folder);
 const c=JSON.parse(fs.readFileSync(path.join(folder,'cases.json')));
 for(const r of c.relations){
  const a=JSON.parse(fs.readFileSync(path.join(folder,'annotations',r.relation+'.json')));
  for(const [index,f]of r.facts.entries())if(f.entity1===f.entity2&&f.evidence.some(e=>e.arg1!==e.arg2)){
   const judgment=a.facts.find(x=>x.case_id===f.case_id);
   flags.push({audit_id:audit,relation:r.relation,index,case_id:f.case_id,entity:f.entity1,names:f.names,source_lines:f.source_lines,judgment:judgment?.judgment??null,reason:judgment?.reason??null,annotation:`census/${audit}/annotations/${r.relation}.json`,review_document:`census/${audit}/relations/${r.relation}.md`,flag:'Same latent entity in both argument positions with differing literal strings: inspect for alias versus incompatible entity collision.'});
  }
 }
}
return {method:'Literal diagnostic only. Different strings can be aliases; no automatic judgment or annotation changes.',count:flags.length,flags};
}
export function writeEntityCollisionFlags(root,{outputDirectory=root}={}){
 const result=collectEntityCollisionFlags(root);
 fs.mkdirSync(path.join(outputDirectory,'analysis'),{recursive:true});
 fs.writeFileSync(path.join(outputDirectory,'analysis/self_entity_collision_flags.json'),JSON.stringify(result,null,2)+'\n');
 return {count:result.count,output:'analysis/self_entity_collision_flags.json'};
}
