import fs from 'node:fs';import path from 'node:path';import crypto from 'node:crypto';import {fileURLToPath} from'node:url';
const b=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..'),audit='audit_e318fe663470';const d=JSON.parse(fs.readFileSync(`${b}/census/${audit}/cases.json`));const changes=[];const sha=x=>crypto.createHash('sha256').update(x).digest('hex');
for(const r of d.relations.filter(r=>r.rank>20)){
 const p=`${b}/census/${audit}/annotations/${r.relation}.json`,raw=fs.readFileSync(p),a=JSON.parse(raw);let n=0;
 for(const f of a.facts){if(f.review.reviewer==='runner'){f.review.reviewer='root';n++;}}
 if(n){const h=`${b}/census/${audit}/annotation_history/${r.relation}`;fs.mkdirSync(h,{recursive:true});fs.writeFileSync(h+'/reviewer_attribution_before.json',raw);fs.writeFileSync(p,JSON.stringify(a,null,2)+'\n');changes.push({relation:r.relation,facts:n,before_sha256:sha(raw),after_sha256:sha(fs.readFileSync(p))});}
 const m=`${b}/analysis/manual_records/${audit}__${r.relation}.json`,mr=JSON.parse(fs.readFileSync(m));if(mr.reviewer==='runner'){mr.reviewer='root';fs.writeFileSync(m,JSON.stringify(mr,null,2)+'\n');}
}
if(changes.length)fs.writeFileSync(b+'/analysis/root_reviewer_attribution_correction.json',JSON.stringify({reason:'The shared recording helper defaulted reviewer to runner. All new audit_e318fe663470 judgments were manually read and supplied by root. Corrected attribution only, preserving judgments, evidence, review times and previous annotation snapshots. Root recording recipes now explicitly select root.',changes},null,2)+'\n');
console.log(JSON.stringify({corrected_relations:changes.length,corrected_facts:changes.reduce((n,x)=>n+x.facts,0)}));
