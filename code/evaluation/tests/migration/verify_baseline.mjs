// Hash-only regression guard: no experiment data are regenerated or rewritten.
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';

const repo=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'../../../..');
const directory=path.join(repo,'reports/evaluation-consolidation-2026-09-29');
const baseline=JSON.parse(fs.readFileSync(path.join(directory,'before_manifest.json'),'utf8'));
const sha=raw=>crypto.createHash('sha256').update(raw).digest('hex');
const immutableCode=new Set([
 'experiments/nyt-precision-investigation-2026-09-12/scripts/verify_integrity.mjs',
 'experiments/nyt-latent-low-smoothing-2026-09-14/scripts/verify_integrity.mjs',
 'code/evaluation/verify_preservation.mjs',
]);
const ledgerPath='reports/buggy-evaluation-cleanup-2026-09-28/maintenance_changes.json';
function verifyMaintenanceExtension(){
 const originalRaw=fs.readFileSync(path.join(directory,'before_maintenance_changes.json'));
 assert.equal(sha(originalRaw),baseline.files[ledgerPath].sha256,'Original ledger snapshot changed');
 const original=JSON.parse(originalRaw),current=JSON.parse(fs.readFileSync(path.join(repo,ledgerPath),'utf8'));
 for(const [key,value]of Object.entries(original)){
  if(key==='changes')continue;
  if(key==='authorization')assert(current[key].includes(value),'Original authorization description removed');
  else assert.deepEqual(current[key],value,'Original ledger metadata changed: '+key);
 }
 const updates=[];
 for(const [relative,oldEntry]of Object.entries(original.changes)){
  assert(Object.hasOwn(current.changes,relative),'Original maintenance entry removed: '+relative);
  if(JSON.stringify(current.changes[relative])===JSON.stringify(oldEntry))continue;
  verifyTransition(relative,current.changes[relative],oldEntry);
 }
 for(const [relative,entry]of Object.entries(current.changes))
  if(!Object.hasOwn(original.changes,relative))verifyTransition(relative,entry,null);
 function verifyTransition(relative,entry,oldEntry){
  const before=baseline.files[relative];
  assert(before&&before.kind==='file'&&['implementation','documentation'].includes(before.category),
   'New maintenance exception is not a recorded source/doc file: '+relative);
  assert(!immutableCode.has(relative)&&!relative.endsWith('/analysis/manual_protocol.md'),
   'Protected integrity code or frozen protocol exception forbidden: '+relative);
  const filename=path.join(repo,relative);
  assert(fs.existsSync(filename)&&fs.lstatSync(filename).isFile(),'Deletion/symlink exception forbidden: '+relative);
  const actual=sha(fs.readFileSync(filename));
  assert.notEqual(actual,before.sha256,'Maintenance exception added without a source/doc change: '+relative);
  assert.equal(entry.current_sha256,actual,'Maintenance destination is not exact current content: '+relative);
  if(oldEntry)assert.equal(oldEntry.current_sha256,before.sha256,'Old maintenance destination differs from baseline: '+relative);
  const expectedPrevious=new Set([...(oldEntry?.previous_sha256??[]),before.sha256]);
  assert.deepEqual(new Set(entry.previous_sha256),expectedPrevious,'Previous hash history changed/extra hash admitted: '+relative);
  assert.equal(entry.previous_sha256.length,expectedPrevious.size,'Duplicate previous hashes: '+relative);
  assert(typeof entry.reason==='string'&&entry.reason.trim(),'Missing refactor reason: '+relative);
  if(oldEntry){
   assert(entry.reason.includes(oldEntry.reason),'Historical maintenance reason removed: '+relative);
   for(const [key,value]of Object.entries(oldEntry))
    if(!['previous_sha256','current_sha256','reason'].includes(key))assert.deepEqual(entry[key],value);
  }
  assert.deepEqual(Object.keys(entry).sort(),Object.keys(oldEntry??{previous_sha256:[],current_sha256:'',reason:''}).sort(),
   'Unexpected maintenance entry fields: '+relative);
  updates.push({path:relative,previous_sha256:before.sha256,current_sha256:actual});
 }
 return {complete:true,original_entries:Object.keys(original.changes).length,
   exact_source_documentation_transitions:updates,data_or_deletion_exceptions_added:0};
}
function canonicalSourceFiles(base=path.join(repo,'code/evaluation')){
 return fs.readdirSync(base,{withFileTypes:true}).flatMap(entry=>{
  if(entry.name==='__pycache__'||entry.name==='node_modules')return [];
  const file=path.join(base,entry.name);
  if(entry.isDirectory())return canonicalSourceFiles(file);
  return /\.(mjs|py|md|json|sh)$/.test(file)?[path.relative(repo,file).split(path.sep).join('/')]:[];
 }).sort();
}
function verifyFinalSources(){
 const manifest=JSON.parse(fs.readFileSync(path.join(directory,'after_source_manifest.json'),'utf8'));
 for(const [relative,entry]of Object.entries(manifest.files)){
  const file=path.join(repo,relative);
  assert(fs.existsSync(file)&&fs.lstatSync(file).isFile(),'Final source missing or replaced: '+relative);
  const raw=fs.readFileSync(file);
  assert.equal(raw.length,entry.bytes,'Final source size changed: '+relative);
  assert.equal(sha(raw),entry.sha256,'Final source hash changed: '+relative);
 }
 assert.deepEqual(canonicalSourceFiles(),Object.keys(manifest.files).filter(p=>p.startsWith('code/evaluation/')).sort(),
  'Canonical evaluator source inventory changed');
 return {complete:true,files:Object.keys(manifest.files).length};
}

const finalSources=process.argv.includes('--final-sources')?verifyFinalSources():null;
const maintenanceExtension=verifyMaintenanceExtension();
const changedImplementation=[],changedDocumentation=[],failures=[];
let unchanged=0,preserved=0;
for(const [relative,previous] of Object.entries(baseline.files)){
 const filename=path.join(repo,relative);
 const mustPreserve=relative!==ledgerPath&&(previous.category==='preserved'||immutableCode.has(relative)||relative.endsWith('/analysis/manual_protocol.md'));
 if(mustPreserve)preserved++;
 let current=null;
 try{
  const stat=fs.lstatSync(filename);
  current=stat.isSymbolicLink()?{kind:'symlink',target:fs.readlinkSync(filename)}:
   stat.isFile()?{kind:'file',bytes:stat.size,sha256:sha(fs.readFileSync(filename))}:{kind:'other'};
 }catch(e){if(e.code!=='ENOENT')throw e;}
 const same=current?.kind===previous.kind&&(previous.kind==='symlink'?current.target===previous.target:current.bytes===previous.bytes&&current.sha256===previous.sha256);
 if(same){unchanged++;continue;}
 if(relative===ledgerPath)continue; // Independently checked against the original ledger above.
 const entry={path:relative,before:previous,after:current};
 if(mustPreserve)failures.push(entry);
 else if(previous.category==='implementation')changedImplementation.push(entry);
 else changedDocumentation.push(entry);
}
const result={complete:failures.length===0,final_source_validation:finalSources,maintenance_extension:maintenanceExtension,checked:Object.keys(baseline.files).length,unchanged,preserved_files_checked:preserved,failures,changed_implementation:changedImplementation,changed_documentation:changedDocumentation,
 note:'Implementation and campaign documentation changes are listed for review, not silently declared identical. Raw outputs, annotations, predicate declarations/catalogues, cases, source records, saved scores/reports/plots, frozen sampled protocols, historical manifests, and both unapproved legacy integrity scripts must remain byte-identical. The maintenance ledger may add only exact non-deletion source/documentation transitions checked against its original snapshot.'};
const output=process.argv.indexOf('--output');
if(output!==-1){
 assert(process.argv[output+1],'--output requires a filename');
 const target=path.resolve(directory,process.argv[output+1]);
 assert.equal(path.dirname(target),directory,'Write only a validation summary next to this script');
 fs.writeFileSync(target,JSON.stringify(result,null,2)+'\n');
}
console.log(JSON.stringify({complete:result.complete,checked:result.checked,unchanged,preserved_files_checked:preserved,failures:failures.map(x=>x.path),changed_implementation:changedImplementation.length,changed_documentation:changedDocumentation.length,maintenance_transitions:maintenanceExtension.exact_source_documentation_transitions.length,final_source_validation:finalSources},null,2));
assert.equal(failures.length,0,'Scientific inputs/results or protected integrity controls changed');
