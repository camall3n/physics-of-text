import fs from 'node:fs';import path from 'node:path';import crypto from 'node:crypto';import assert from 'node:assert/strict';
const root=path.resolve(new URL('..',import.meta.url).pathname);
const read=p=>JSON.parse(fs.readFileSync(path.join(root,p),'utf8'));
const sha=p=>crypto.createHash('sha256').update(fs.readFileSync(p)).digest('hex');
const baseline=read('baseline_manifest.json'),originalErrors=[];
for(const [p,h] of Object.entries(baseline.files)){const file=path.join(baseline.source_sampler,p);if(!fs.existsSync(file)||sha(file)!==h)originalErrors.push(p);}
assert.deepEqual(originalErrors,[],'Original sampler sources/results changed');
const runs=[];
for(const id of fs.readdirSync(path.join(root,'runs')).sort()){
 const p=path.join(root,'runs',id,'run.json');if(!fs.existsSync(p))continue;const run=JSON.parse(fs.readFileSync(p));assert.equal(run.status,'complete',id);
 assert.equal(sha(run.corpus),run.corpus_sha256,id+' corpus');assert.equal(sha(run.dependency_jar),run.dependency_sha256,id+' dependency');assert.equal(sha(path.join(root,'runs',id,'source_snapshot.tar.gz')),run.source_archive_sha256,id+' source');
 const outputErrors=[];for(const [f,h] of Object.entries(run.outputs)){const file=path.join(root,'runs',id,f);if(!fs.existsSync(file)||sha(file)!==h)outputErrors.push(f);}assert.deepEqual(outputErrors,[],id+' modified outputs');
 assert.deepEqual(read('runs/'+id+'/config.json'),run.config,id+' config');runs.push({id,output_files_verified:Object.keys(run.outputs).length,corpus_sha256:run.corpus_sha256,source_archive_sha256:run.source_archive_sha256});
}
for(const seed of [20260912,20260913])assert.deepEqual(read('runs/latent_beta01_seed'+seed+'/config.json'),read('runs/entityfix_latent_beta01_seed'+seed+'/config.json'));
const filesBelow=d=>fs.readdirSync(d,{withFileTypes:true}).flatMap(e=>e.isDirectory()?filesBelow(path.join(d,e.name)):[path.join(d,e.name)]);
const a=path.join(root,'variants/controlled/src/main'),b=path.join(root,'variants/entity-multiplicity-fix/src/main');
const changedProduction=filesBelow(a).filter(f=>sha(f)!==sha(path.join(b,path.relative(a,f)))).map(f=>path.relative(a,f));
assert.deepEqual(changedProduction.sort(),['java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java','java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java']);
const report={verified_at:new Date().toISOString(),original_files_verified:Object.keys(baseline.files).length,original_files_changed:originalErrors,completed_runs:runs.length,runs,entity_fix_production_changes:changedProduction,paired_entity_fix_configs:'identical',status:'pass'};
fs.writeFileSync(path.join(root,'analysis/integrity_verification.json'),JSON.stringify(report,null,2)+'\n');console.log(JSON.stringify({status:report.status,original_files_verified:report.original_files_verified,completed_runs:runs.length,total_run_output_files:runs.reduce((s,r)=>s+r.output_files_verified,0),changedProduction}));
