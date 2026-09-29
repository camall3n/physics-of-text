import fs from 'node:fs';import assert from 'node:assert/strict';import crypto from 'node:crypto';
const file='analysis/predicate_catalogue.json';const cat=JSON.parse(fs.readFileSync(file));
const additions=JSON.parse(fs.readFileSync('analysis/approved_predicate_extensions.json'));
const prior=cat.predicates.map(p=>JSON.stringify(p));const appended=[];
for(const input of additions.predicates){
 const p={...input,scope_notes:`Includes: ${input.includes.join('; ')}. Excludes: ${input.excludes.join('; ')}. Ambiguous unless resolved by case-local evidence: ${input.ambiguous.join('; ')}.${input.notes?' '+input.notes:''}`};
 const found=cat.predicates.find(x=>x.id===p.id);if(found){assert.deepEqual(found,p,`Existing definition cannot change: ${p.id}`);continue;}
 cat.predicates.push(p);appended.push({id:p.id,sha256:crypto.createHash('sha256').update(JSON.stringify(p)).digest('hex')});
}
prior.forEach((s,i)=>assert.equal(JSON.stringify(cat.predicates[i]),s));
if(appended.length){fs.writeFileSync(file+'.tmp',JSON.stringify(cat,null,2)+'\n');fs.renameSync(file+'.tmp',file);}
console.log(JSON.stringify({appended,total_predicates:cat.predicates.length}));
