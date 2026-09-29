import fs from 'node:fs';import path from 'node:path';import crypto from 'node:crypto';import assert from 'node:assert/strict';
const root=path.resolve(new URL('..',import.meta.url).pathname),read=p=>JSON.parse(fs.readFileSync(p,'utf8')),sha=p=>crypto.createHash('sha256').update(fs.readFileSync(p)).digest('hex');
const protectedManifest=read(path.join(root,'protected_manifest.json')),errors=[];
for(const [relative,entry] of Object.entries(protectedManifest.files)){const p=path.join(protectedManifest.repository,relative);try{if(entry.symlink!==undefined){if(fs.readlinkSync(p)!==entry.symlink)errors.push(relative);}else if(sha(p)!==entry.sha256)errors.push(relative);}catch{errors.push(relative);}}
assert.deepEqual(errors,[],'A protected previous artifact changed');
const plan=read(path.join(root,'experiment_plan.json')),runs=[];
for(const entry of plan.runs){const p=path.join(root,entry.output),m=read(path.join(p,'run.json'));assert.equal(m.status,'complete');const ref=path.resolve(root,entry.paired_reference),old=read(path.join(ref,'run.json'));
 assert.deepEqual({...m.config,beta:.1},old.config);assert.equal(m.config.beta,.001);assert.equal(m.corpus_sha256,old.corpus_sha256);assert.equal(m.corpus_sha256,sha(m.corpus));assert.equal(m.dependency_sha256,old.dependency_sha256);assert.equal(m.dependency_sha256,sha(m.dependency_jar));
 assert.deepEqual(read(path.join(p,'source_sha256.json')),read(path.join(ref,'source_sha256.json')));assert.equal(m.source_archive_sha256,sha(path.join(p,'source_snapshot.tar.gz')));
 for(const [file,h] of Object.entries(m.outputs))assert.equal(sha(path.join(p,file)),h,entry.id+' '+file);
 for(const f of ['initial_world_sentences.tsv','post_entity_world_sentences.tsv'])assert.equal(sha(path.join(p,f)),sha(path.join(ref,f)),entry.id+' '+f);
 runs.push({id:entry.id,outputs_verified:Object.keys(m.outputs).length,only_config_difference:'beta 0.1 -> 0.001',source_identical_to_reference:true,initial_and_post_entity_assignments_identical:true});
}
const result={verified_at:new Date().toISOString(),status:'pass',protected_entries_verified:Object.keys(protectedManifest.files).length,protected_entries_changed:errors,runs};fs.writeFileSync(path.join(root,'analysis/integrity_verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
