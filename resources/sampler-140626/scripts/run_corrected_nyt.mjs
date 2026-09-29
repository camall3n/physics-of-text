import fs from 'node:fs';
import path from 'node:path';
import cp from 'node:child_process';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
const sampler=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const run=path.resolve(sampler,process.argv[2]??'results/nyt-2026-fixed-400');
const previous=path.join(sampler,'results/nyt-2026');
const corpus=path.join(sampler,'data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json');
const jar=path.join(sampler,'target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar');
const classes=path.join(sampler,'target-javac/classes');
if(fs.existsSync(path.join(run,'run.json'))||fs.existsSync(path.join(run,'output')))throw Error('Run already exists; choose a new result directory.');
fs.mkdirSync(run,{recursive:true});
const config=JSON.parse(fs.readFileSync(path.join(previous,'config.json'),'utf8'));
if(config.maxRels!==400)throw Error('Expected comparison configuration with maxRels=400');
fs.writeFileSync(path.join(run,'config.json'),JSON.stringify(config,null,2)+'\n');
fs.writeFileSync(path.join(run,'logback.xml'),'<configuration><root level="OFF"/></configuration>\n');
const sha=filename=>crypto.createHash('sha256').update(fs.readFileSync(filename)).digest('hex');
const sourceFiles=cp.execFileSync('rg',['--files','src/main/java'],{cwd:sampler,encoding:'utf8'}).trim().split('\n').sort();
const fingerprints=Object.fromEntries(sourceFiles.map(p=>[p,sha(path.join(sampler,p))]));
fs.writeFileSync(path.join(run,'source_sha256.json'),JSON.stringify(fingerprints,null,2)+'\n');
cp.execFileSync('tar',['-czf',path.join(run,'source_snapshot.tar.gz'),'src/main/java','build.sh'],{cwd:sampler});
const javaArgs=['-ea','-Xmx4g','-Dlogback.configurationFile='+path.join(run,'logback.xml'),'-cp',classes+path.delimiter+jar,
 'org.ucb.generative_ie.experiments.EntityResolution',path.join(run,'config.json'),corpus];
const manifest={experiment:'NYT corrected sampler, maxRels=400',status:'running',startedAt:new Date().toISOString(),
 config,command:{executable:'java',args:javaArgs,cwd:run},java:cp.execFileSync('java',['--version'],{encoding:'utf8'}).trim(),
 gitHead:cp.execFileSync('git',['rev-parse','HEAD'],{cwd:sampler,encoding:'utf8'}).trim(),workingTreeFixes:true,
 corpus,corpus_sha256:sha(corpus),dependency_jar_sha256:sha(jar),previous_map_sha256:sha(path.join(previous,'map_world_sentences.tsv')),
 seedControl:'Incomplete: NYT entry point and step iterators construct unseeded Random instances; not a paired-seed ablation.',
 prior:'Existing pool-dependent prior retained. maxRels=400 is a comparison setting, not a prior correction.'};
const save=()=>fs.writeFileSync(path.join(run,'run.json'),JSON.stringify(manifest,null,2)+'\n');save();
const stdout=fs.openSync(path.join(run,'stdout.log'),'wx'),stderr=fs.openSync(path.join(run,'stderr.log'),'wx');
const started=Date.now();console.log('Starting '+run);
const child=cp.spawn('java',javaArgs,{cwd:run,stdio:['ignore',stdout,stderr]});
const result=await new Promise(resolve=>{child.on('error',error=>resolve({error:String(error)}));child.on('exit',(code,signal)=>resolve({code,signal}));});
fs.closeSync(stdout);fs.closeSync(stderr);
Object.assign(manifest,{finishedAt:new Date().toISOString(),elapsedSeconds:(Date.now()-started)/1000,...result,status:result.code===0?'complete':'failed'});
if(result.code===0){
 for(const name of fs.readdirSync(path.join(run,'output')))fs.renameSync(path.join(run,'output',name),path.join(run,name));
 fs.rmdirSync(path.join(run,'output'));
 manifest.outputs=Object.fromEntries(['logprobs.txt','map_world_sentences.tsv','map_world.txt','relation_triggers.txt'].filter(p=>fs.existsSync(path.join(run,p))).map(p=>[p,sha(path.join(run,p))]));
}
save();console.log(JSON.stringify({status:manifest.status,elapsedSeconds:manifest.elapsedSeconds,run},null,2));
if(result.code!==0)process.exitCode=1;
