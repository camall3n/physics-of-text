import path from 'node:path';
import {json} from '../common.mjs';
export function reviewBatch(ROOT,{audit,relation,startArg='1',countArg='20',evidenceOnly=false}){
if(!audit||!relation)throw Error('Usage: node scripts/review_batch.mjs AUDIT_ID rel_X [start=1] [count=20]; prints full dictionary and complete grouped evidence for that contiguous fact range');
const folder=path.join(ROOT,'census',audit),d=json(path.join(folder,'cases.json')),r=d.relations.find(r=>r.relation===relation);if(!r)throw Error('Relation absent');
const start=Number(startArg),count=Number(countArg);if(!Number.isInteger(start)||start<1||!Number.isInteger(count)||count<1)throw Error('Positive integer indices required');
const a=json(path.join(folder,'annotations',relation+'.json'));console.log(`# ${audit} ${relation}: all ${r.facts.length} facts; full dictionary\n`);console.log(JSON.stringify({predicate_id:a.predicate_id,label:a.label,definition:a.definition,scope_notes:a.scope_notes}));
for(const p of r.paths)console.log(`${p.count}\t${p.value}`);
console.log(`\nCONTIGUOUS FACTS ${start} through ${Math.min(start+count-1,r.facts.length)}. Every evidence row is retained; identical argument/path triples are grouped with all source-line numbers.\n`);
for(let i=start-1;i<Math.min(start-1+count,r.facts.length);i++){
 const c=r.facts[i],old=a.facts.find(f=>f.case_id===c.case_id),grouped=new Map();
 console.log(`CASE ${i+1}/${r.facts.length}: ${c.case_id}\nALL NAMES: ${c.names.map(n=>`${n.value} (${n.count})`).join('; ')}`);
 for(const e of c.evidence){const key=JSON.stringify([e.arg1,e.arg2,e.dependency_path]);if(!grouped.has(key))grouped.set(key,[]);grouped.get(key).push(e.line);}
 for(const [key,lines]of grouped){const [x,y,p]=JSON.parse(key);console.log(`[${lines.join(',')}] ${x} -> ${y} :: ${p}`);}
 if(!evidenceOnly)console.log('CURRENT ANNOTATION '+JSON.stringify(old)+'\n');else console.log('');
}

}
