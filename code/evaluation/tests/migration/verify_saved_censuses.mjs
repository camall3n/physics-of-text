import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import crypto from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const repo=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'../../../..');
const out=path.join(repo,'reports/evaluation-consolidation-2026-09-29');
const sha=x=>crypto.createHash('sha256').update(x).digest('hex');
const json=p=>JSON.parse(fs.readFileSync(p,'utf8'));
const campaigns=['nyt-complete-evaluation-2026-09-14','nyt-beta-0p001-coverage-2026-09-14'];
const results=[];
for(const name of campaigns){
 const root=path.join(repo,'experiments',name);
 const {validateAudit}=await import(pathToFileURL(path.join(root,'scripts/report_censuses.mjs')));
 const coverage=name.includes('coverage');
 const scoreCoverage=coverage?(await import(pathToFileURL(path.join(root,'scripts/threshold_scores.mjs')))).scoreCoverage:null;
 const audits=json(path.join(root,'census_manifest.json')).audits;
 if(!coverage)audits.push({audit_id:'audit_archive250',folder:'supplemental/audit_archive250'});
 for(const a of audits){
  const dir=path.join(root,a.folder),actual=validateAudit(dir);
  if(coverage)actual.threshold_scores=scoreCoverage(actual);
  const saved=json(path.join(dir,'assessment.json'));
  assert.deepEqual(actual,saved,'Saved assessment mismatch: '+name+'/'+a.audit_id);
  const thresholds=[];
  if(coverage)for(const t of actual.threshold_scores.thresholds){
   const d=json(path.join(dir,'coverage_'+Math.round(t.target*100)+'.json'));
   assert.deepEqual(d.facts,actual.facts.filter(f=>f.relation_rank<=t.k));
   assert.deepEqual(d.strata,actual.strata.filter(s=>s.rank<=t.k));
   assert.deepEqual(d.counts,{N:t.N,S:t.S,E:t.E,A:t.A});
   assert.deepEqual(d.threshold,t);
   thresholds.push({target:t.target,k:t.k,N:t.N,S:t.S,E:t.E,A:t.A});
  }
  results.push({campaign:name,audit_id:a.audit_id,counts:actual.counts,precision:actual.precision,relations:actual.strata.length,assessment_canonical_sha256:sha(JSON.stringify(actual)),thresholds});
 }
}
const answer={complete:true,census_audits:results.length,main_top20_facts:results.filter(r=>r.campaign===campaigns[0]&&r.audit_id!=='audit_archive250').reduce((s,r)=>s+r.counts.N,0),supplemental_facts:results.find(r=>r.audit_id==='audit_archive250').counts.N,coverage_facts:results.filter(r=>r.campaign===campaigns[1]).reduce((s,r)=>s+r.counts.N,0),threshold_views:results.reduce((s,r)=>s+r.thresholds.length,0),audits:results};
const filename=process.argv[2];
if(filename)fs.writeFileSync(path.join(out,filename),JSON.stringify(answer,null,2)+'\n');
console.log(JSON.stringify(answer,null,2));
