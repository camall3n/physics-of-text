import path from 'node:path';

export function createIndexedReview({census}) {
 const {ROOT,json}=census;
 function runIndexedReview(argv=process.argv){
  // Lossless compact evidence view: dictionary paths are printed once and referenced by index.
  const [audit,relation,startArg='0',countArg='10000']=argv.slice(2);if(!audit||!relation)throw Error('Usage: review_indexed.mjs AUDIT rel_X [zero-based start] [count]');
  const root=path.join(ROOT,'census',audit),r=json(path.join(root,'cases.json')).relations.find(x=>x.relation===relation),a=json(path.join(root,'annotations',relation+'.json'));if(!r)throw Error('Unknown relation');
  const start=Number(startArg),count=Number(countArg);if(!Number.isInteger(start)||start<0||!Number.isInteger(count)||count<1)throw Error('Invalid bounds');
  console.log(JSON.stringify({audit,relation,N:r.facts.length,predicate_id:a.predicate_id,definition:a.definition,scope_notes:a.scope_notes}));
  const ids=new Map(r.paths.map((p,i)=>[p.value,i]));if(!argv.includes('--no-dictionary'))for(let i=0;i<r.paths.length;i++)console.log(`P${i} [n=${r.paths[i].count}] ${r.paths[i].value}`);
  for(let i=start;i<Math.min(start+count,r.facts.length);i++){const c=r.facts[i],groups=new Map();console.log(`\nCASE ${i} ${c.case_id} [rows=${c.sentence_count}]`);for(const e of c.evidence){const key=JSON.stringify([e.arg1,e.arg2]);if(!groups.has(key))groups.set(key,new Map());const m=groups.get(key),p=ids.get(e.dependency_path);if(!m.has(p))m.set(p,[]);m.get(p).push(e.line);}for(const [key,paths]of groups)console.log(`${key} ${[...paths].map(([p,lines])=>`P${p}@${lines.join(',')}`).join(' ')} `);}
 }
 return {runIndexedReview};
}
