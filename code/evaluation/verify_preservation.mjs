// Preserve historical manifests and admit only exact, documented maintenance states.
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
export const MAINTENANCE_LEDGER='reports/buggy-evaluation-cleanup-2026-09-28/maintenance_changes.json';
const sha=data=>crypto.createHash('sha256').update(data).digest('hex');
const hashPattern=/^[a-f0-9]{64}$/;
function inside(repo,name){
 assert(typeof name==='string'&&!path.isAbsolute(name),'Expected repository-relative path');
 const absolute=path.resolve(repo,name);
 assert(absolute.startsWith(path.resolve(repo)+path.sep),'Path outside repository');
 assert.equal(path.relative(path.resolve(repo),absolute),name,'Noncanonical repository path');
 return absolute;
}
export function loadMaintenanceLedger(repo,file=MAINTENANCE_LEDGER){
 const location=inside(repo,file);
 if(!fs.existsSync(location))return {schema_version:1,changes:{}};
 const ledger=JSON.parse(fs.readFileSync(location,'utf8'));
 assert.equal(ledger.schema_version,1,'Unknown maintenance ledger schema');
 assert(ledger.changes&&typeof ledger.changes==='object'&&!Array.isArray(ledger.changes),'Invalid maintenance changes');
 for(const [name,change]of Object.entries(ledger.changes)){
  inside(repo,name);
  assert(Array.isArray(change.previous_sha256)&&change.previous_sha256.length&&change.previous_sha256.every(h=>typeof h==='string'&&hashPattern.test(h)),`Invalid prior hashes: ${name}`);
  assert(change.current_sha256===null||(typeof change.current_sha256==='string'&&hashPattern.test(change.current_sha256)),`Invalid current hash: ${name}`);
  assert(typeof change.reason==='string'&&change.reason.trim(),`Missing maintenance reason: ${name}`);
 }
 return ledger;
}
export function verifyProtectedManifest({repo,manifest,ledger=loadMaintenanceLedger(repo)}){
 const failures=[],authorized_changes=[];let bytes=0,regular=0,symlinks=0;
 for(const entry of manifest.entries){
  try{
   const file=inside(repo,entry.path);
   // Symlink exceptions are deliberately unsupported; the original target stays frozen.
   if(entry.symlink!==undefined){const stat=fs.lstatSync(file);assert(stat.isSymbolicLink(),'File type changed');assert.equal(fs.readlinkSync(file),entry.symlink,'Symlink target changed');symlinks++;continue;}
   const change=ledger.changes[entry.path];
   const applicable=change?.previous_sha256.includes(entry.sha256);
   let stat;try{stat=fs.lstatSync(file);}catch(error){if(error.code!=='ENOENT')throw error;}
   if(applicable&&change.current_sha256===null){
    assert.equal(stat,undefined,'Deliberately deleted artifact reappeared');
    authorized_changes.push({path:entry.path,kind:'deleted',previous_sha256:entry.sha256,current_sha256:null,reason:change.reason});continue;
   }
   assert(stat,'Missing protected file');assert(stat.isFile(),'File type changed');
   const raw=fs.readFileSync(file),current=sha(raw);bytes+=raw.length;regular++;
   if(applicable&&change.current_sha256!==entry.sha256){
    assert.equal(current,change.current_sha256,'File differs from authorized maintenance hash');
    authorized_changes.push({path:entry.path,kind:'modified',previous_sha256:entry.sha256,current_sha256:current,reason:change.reason});
   }else{
    assert.equal(raw.length,entry.bytes,'Protected size changed');assert.equal(current,entry.sha256,'Protected SHA-256 changed');
   }
  }catch(error){failures.push({path:entry.path,error:error.message});}
 }
 return {entries:manifest.entries.length,regular_files:regular,symlinks,bytes_read:bytes,unchanged:failures.length===0&&authorized_changes.length===0,consistent_with_authorized_maintenance:failures.length===0,authorized_changes,failures};
}
