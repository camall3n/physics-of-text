import fs from 'node:fs';
import path from 'node:path';
export function readRankRange(b,{audit,start,end}){
const root=path.join(b,'census',audit),cases=JSON.parse(fs.readFileSync(path.join(root,'cases.json')));
for(const r of cases.relations.filter(r=>r.rank>=start&&r.rank<=end)){
 const a=JSON.parse(fs.readFileSync(path.join(root,'annotations',r.relation+'.json')));console.log(`\nRANK ${r.rank} ${r.relation} N=${r.facts.length} ${a.predicate_id}\n${a.definition}\n${a.scope_notes}`);
 const ids=new Map(r.paths.map((p,i)=>[p.value,i]));r.paths.forEach((p,i)=>console.log(`P${i}(${p.count}) ${p.value}`));
 r.facts.forEach((c,i)=>{const groups=new Map();for(const e of c.evidence){const key=JSON.stringify([e.arg1,e.arg2]);if(!groups.has(key))groups.set(key,new Map());const m=groups.get(key),p=ids.get(e.dependency_path);if(!m.has(p))m.set(p,[]);m.get(p).push(e.line);}console.log(`CASE ${i} ${c.entity1}/${c.entity2} rows${c.sentence_count}: ${[...groups].map(([key,ps])=>key+' '+[...ps].map(([p,ls])=>'P'+p+'@'+ls.join(',')).join(' ')).join(' ; ')}`);});
}

}
