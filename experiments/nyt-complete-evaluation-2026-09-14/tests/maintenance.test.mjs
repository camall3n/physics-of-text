import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import {ROOT,REPO,json,sha,prepareCensus,RETIRED_AUDIT_IDS,RETIRED_SOURCES} from '../scripts/census_lib.mjs';
import {initialEntries,prepareAll} from '../scripts/prepare_censuses.mjs';
import {loadMaintenanceLedger,verifyProtectedManifest} from '../../../code/evaluation/verify_preservation.mjs';

function fixture(t){
 const repo=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-maintenance-'));
 t.after(()=>fs.rmSync(repo,{recursive:true,force:true}));
 const original='protected original\n';fs.writeFileSync(path.join(repo,'file.txt'),original);
 const manifest={entries:[{path:'file.txt',bytes:Buffer.byteLength(original),sha256:sha(original)}]};
 const change={previous_sha256:[sha(original)],current_sha256:sha('amended\n'),reason:'Authorized fixture maintenance'};
 const ledger={schema_version:1,changes:{'file.txt':change}};
 return {repo,manifest,ledger,change,original,check:()=>verifyProtectedManifest({repo,manifest,ledger})};
}
test('retained preparation roster has ten runs and no retired source dependency',()=>{
 const entries=initialEntries(),manifest=json(path.join(ROOT,'census_manifest.json'));
 assert.equal(entries.length,10);assert.equal(manifest.audits.reduce((n,a)=>n+a.population_facts,0),6905);
 assert.deepEqual(entries.map(e=>e.audit_id),manifest.audits.map(a=>a.audit_id));
 for(const entry of entries){assert(!RETIRED_AUDIT_IDS.has(entry.audit_id));assert(!RETIRED_SOURCES.has(path.relative(REPO,entry.source)));assert(fs.existsSync(entry.source));assert(fs.existsSync(path.join(entry.prior,'cases.json')));}
});
test('retired sources and IDs reject direct preparation before writing any output',t=>{
 const outRoot=fs.mkdtempSync(path.join(ROOT,'tests','retired-fixture-'));t.after(()=>fs.rmSync(outRoot,{recursive:true,force:true}));
 for(const source of RETIRED_SOURCES)assert.throws(()=>prepareCensus({source:path.join(REPO,source)},{outRoot}),/Evaluation retired/);
 for(const audit_id of RETIRED_AUDIT_IDS)assert.throws(()=>prepareCensus({source:path.join(outRoot,'absent.tsv'),audit_id},{outRoot}),/Evaluation retired/);
 assert.deepEqual(fs.readdirSync(outRoot),[]);
});
test('a mixed stale batch is rejected before touching retained artifacts or manifest',()=>{
 const manifest=path.join(ROOT,'census_manifest.json'),before=fs.readFileSync(manifest);
 assert.throws(()=>prepareAll([{source:'/missing-retained-fixture.tsv',audit_id:'audit_fixture'},{source:path.join(REPO,[...RETIRED_SOURCES][0])}]),/Evaluation retired/);
 assert.deepEqual(fs.readFileSync(manifest),before);
});
test('unchanged historical manifests need no maintenance exception',t=>{
 const f=fixture(t);f.ledger.changes={};const r=f.check();assert.equal(r.unchanged,true);assert.equal(r.consistent_with_authorized_maintenance,true);assert.deepEqual(r.authorized_changes,[]);assert.deepEqual(r.failures,[]);
});
test('maintenance accepts only an exact authorized before/after hash transition',t=>{
 const f=fixture(t);fs.writeFileSync(path.join(f.repo,'file.txt'),'amended\n');
 let r=f.check();assert.equal(r.unchanged,false);assert.equal(r.consistent_with_authorized_maintenance,true);assert.equal(r.authorized_changes[0].kind,'modified');
 f.change.previous_sha256=[sha('unrelated baseline')];assert.equal(f.check().failures.length,1);
 f.change.previous_sha256=[f.manifest.entries[0].sha256];fs.appendFileSync(path.join(f.repo,'file.txt'),'extra');assert.equal(f.check().failures.length,1);
});
test('deliberate deletion is hash-bound and rejects any reappearance, including the original',t=>{
 const f=fixture(t);f.change.current_sha256=null;fs.unlinkSync(path.join(f.repo,'file.txt'));
 let r=f.check();assert.equal(r.consistent_with_authorized_maintenance,true);assert.equal(r.authorized_changes[0].kind,'deleted');
 f.change.previous_sha256=[sha('other')];assert.equal(f.check().failures.length,1);
 f.change.previous_sha256=[f.manifest.entries[0].sha256];fs.writeFileSync(path.join(f.repo,'file.txt'),f.original);assert.match(f.check().failures[0].error,/reappeared/);
});
test('undeclared deletion and symlink substitutions remain failures',t=>{
 const f=fixture(t);f.ledger.changes={};fs.unlinkSync(path.join(f.repo,'file.txt'));assert.equal(f.check().failures.length,1);
 fs.writeFileSync(path.join(f.repo,'other.txt'),f.original);fs.symlinkSync('other.txt',path.join(f.repo,'file.txt'));assert.match(f.check().failures[0].error,/File type changed/);
 f.manifest.entries=[{path:'file.txt',symlink:'other.txt'}];assert.equal(f.check().failures.length,0);
 fs.unlinkSync(path.join(f.repo,'file.txt'));fs.symlinkSync('absent.txt',path.join(f.repo,'file.txt'));assert.match(f.check().failures[0].error,/Symlink target changed/);
});
test('maintenance ledger rejects malformed hashes and repository escapes',t=>{
 const f=fixture(t),file='ledger.json',location=path.join(f.repo,file);
 fs.writeFileSync(location,JSON.stringify(f.ledger));assert.deepEqual(loadMaintenanceLedger(f.repo,file),f.ledger);
 f.change.current_sha256='not-a-hash';fs.writeFileSync(location,JSON.stringify(f.ledger));assert.throws(()=>loadMaintenanceLedger(f.repo,file),/Invalid current hash/);
 assert.throws(()=>loadMaintenanceLedger(f.repo,'../ledger.json'),/Path outside repository/);
});
