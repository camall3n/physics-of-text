import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import {spawnSync} from 'node:child_process';
import {fileURLToPath} from 'node:url';

// Integration oracle: compare freshly rendered artifacts with the original saved
// artifacts, never with expected values produced by another new evaluator path.
const repo=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'../../..');
const cli=path.join(repo,'code/evaluation/cli.mjs');
const json=p=>JSON.parse(fs.readFileSync(p,'utf8'));
const experiments=path.join(repo,'experiments');
const configs=[
 {preset:'nyt-top20',name:'nyt-complete-evaluation-2026-09-14',kind:'census'},
 {preset:'nyt-coverage',name:'nyt-beta-0p001-coverage-2026-09-14',kind:'coverage'},
 {preset:'nyt-archive250',name:'nyt-complete-evaluation-2026-09-14',kind:'archive'},
 {preset:'sampled-sep12',name:'nyt-precision-investigation-2026-09-12',kind:'sampled'},
 {preset:'sampled-sep14',name:'nyt-latent-low-smoothing-2026-09-14',kind:'sampled'},
];
function run(args,{ok=true}={}){
 const r=spawnSync(process.execPath,[cli,...args],{cwd:repo,encoding:'utf8',maxBuffer:128*1024*1024,timeout:180000});
 assert.ifError(r.error);
 if(ok)assert.equal(r.status,0,r.stderr+'\n'+r.stdout.slice(-8000));
 else assert.notEqual(r.status,0,'Unsafe/invalid CLI command unexpectedly succeeded: '+args.join(' '));
 return r;
}
function auditFolders(config){
 const root=path.join(experiments,config.name);
 if(config.kind==='archive')return ['supplemental/audit_archive250'];
 if(config.kind==='sampled')return json(path.join(root,'manual_review/unblinding.json')).audits.map(a=>'manual_review/'+a.audit_id);
 return json(path.join(root,'census_manifest.json')).audits.map(a=>a.folder);
}
function compareFile(original,rendered){
 assert(fs.existsSync(rendered),'Missing rendered artifact: '+rendered);
 assert(fs.readFileSync(rendered).equals(fs.readFileSync(original)),'Rendered artifact bytes changed: '+original);
}
function walk(base){
 return fs.readdirSync(base,{withFileTypes:true}).flatMap(e=>{
  const p=path.join(base,e.name);
  return e.isDirectory()?walk(p):[p];
 });
}

function assertLocalLinks(file){
 const markdown=fs.readFileSync(file,'utf8');
 for(const match of markdown.matchAll(/\]\(([^\s)]+)\)/g)){
  const raw=match[1];
  if(raw.startsWith('#')||/^[a-z][a-z0-9+.-]*:\/\//i.test(raw)||raw.startsWith('mailto:'))continue;
  const relative=decodeURIComponent(raw.split('#')[0]).replace(/:\d+$/,'');
  if(!relative)continue;
  const target=path.resolve(path.dirname(file),relative);
  assert(fs.existsSync(target),'Broken rendered link: '+file+' -> '+raw);
 }
}

test('CLI exposes all documented NYT evaluation presets',()=>{
 const text=run(['list']).stdout;
 for(const c of configs)assert(text.includes(c.preset),'Missing preset '+c.preset);
});

for(const config of configs)test('CLI '+config.preset+' checks saved runs and renders identical assessments/relation/selection views',t=>{
 run(['check','--preset',config.preset]);
 const temp=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-evaluator-equivalence-'));
 t.after(()=>fs.rmSync(temp,{recursive:true,force:true}));
 const output=path.join(temp,'rendered');
 run(['render','--preset',config.preset,'--output-dir',output]);
 const root=path.join(experiments,config.name),folders=auditFolders(config);
 let matched=0;
 for(const folder of folders){
  for(const name of ['assessment.json','assessment.md']){
   compareFile(path.join(root,folder,name),path.join(output,folder,name));matched++;
  }
  if(config.kind!=='sampled'){
   const originalReports=path.join(root,folder,'reports');
   const names=fs.readdirSync(originalReports).filter(n=>/^rel_\d+\.md$/.test(n)).sort();
   const renderedReports=path.join(output,folder,'reports');
   assert.deepEqual(fs.readdirSync(renderedReports).filter(n=>/^rel_\d+\.md$/.test(n)).sort(),names);
   for(const name of names){compareFile(path.join(originalReports,name),path.join(renderedReports,name));matched++;}
  }
  if(config.kind==='coverage'){
   const targets=json(path.join(root,folder,'coverage.json')).targets;
   for(const target of targets)for(const suffix of ['json','md']){
    const file='coverage_'+Math.round(target.target*100)+'.'+suffix;
    compareFile(path.join(root,folder,file),path.join(output,folder,file));matched++;
   }
  }
 }
 // Also verify any campaign comparisons/indexes emitted by the new command.
 // The top-level README is a new bundle index, not the campaign README.
 // New explicit provenance files have no historical counterpart and are allowed.
 for(const generated of walk(output)){
  const relative=path.relative(output,generated),original=path.join(root,relative);
  if(relative!=='README.md'&&fs.existsSync(original)&&fs.statSync(original).isFile())compareFile(original,generated);
  if(/(?:^|\/)(?:README|assessment|coverage_\d+)\.md$/.test(relative)||/\/(?:reports|relations)\/rel_\d+\.md$/.test(relative))assertLocalLinks(generated);
 }
 assert(matched>=2*folders.length);
 t.diagnostic(JSON.stringify({preset:config.preset,audits:folders.length,required_artifacts_compared:matched}));
});

test('CLI refuses overwriting study data, code, and nonempty output directories',t=>{
 const temp=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-evaluator-output-safety-'));
 t.after(()=>fs.rmSync(temp,{recursive:true,force:true}));
 const marker=path.join(temp,'keep.txt');
 fs.writeFileSync(marker,'Existing content must remain unchanged.\n');
 for(const output of [temp,path.join(experiments,configs[0].name),path.join(repo,'code/evaluation')]){
  run(['render','--preset','nyt-archive250','--output-dir',output],{ok:false});
 }
 assert.equal(fs.readFileSync(marker,'utf8'),'Existing content must remain unchanged.\n');
 assert.deepEqual(fs.readdirSync(temp),['keep.txt']);
 const alias=path.join(temp,'alias');fs.symlinkSync(path.join(experiments,configs[0].name),alias,'dir');
 run(['render','--preset','nyt-archive250','--output-dir',path.join(alias,'forbidden-output')],{ok:false});
 assert(!fs.existsSync(path.join(alias,'forbidden-output')),'Symlink redirected output into experiment records');
});

test('CLI rejects unknown presets and selection switches without writing output',t=>{
 const temp=fs.mkdtempSync(path.join(os.tmpdir(),'nyt-evaluator-invalid-selection-'));
 t.after(()=>fs.rmSync(temp,{recursive:true,force:true}));
 const output=path.join(temp,'must-not-exist');
 run(['render','--preset','unknown-experiment','--output-dir',output],{ok:false});
 assert(!fs.existsSync(output));
 run(['render','--preset','nyt-top20','--output-dir',output,'--target','0.6'],{ok:false});
 assert(!fs.existsSync(output),'Undocumented selection override wrote output');
});
