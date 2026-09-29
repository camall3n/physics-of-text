import fs from 'node:fs';
import {json} from '../common.mjs';
export function printReview(ROOT,audit,ids){
const c=json(`${ROOT}/census/${audit}/cases.json`);
console.log('AUDIT',audit);
for(const id of ids){
 const r=c.relations.find(r=>r.relation===id),a=json(`${ROOT}/census/${audit}/annotations/${id}.json`);
 console.log('\nREL',id,'n',r.facts.length,a.predicate_id,a.definition,a.scope_notes);
 console.log(r.paths.map((p,i)=>`P${i} (${p.count}) ${p.value}`).join('\n'));
 r.facts.forEach((f,i)=>{
   const groups=new Map();for(const e of f.evidence){const key=JSON.stringify([e.arg1,e.arg2,'P'+r.paths.findIndex(p=>p.value===e.dependency_path)]);if(!groups.has(key))groups.set(key,[]);groups.get(key).push(e.line);}
   console.log(i,f.case_id,'PRIOR',a.facts[i].judgment||'-',[...groups].map(([k,v])=>k+'@'+v.join(',')).join(';'));
 });
}

}
