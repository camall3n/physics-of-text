import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {spawnSync} from 'node:child_process';
const here=path.dirname(fileURLToPath(import.meta.url));
const experiment=path.resolve(here,'../..');
const repository=path.resolve(experiment,'../..');
const dependency=path.join(repository,'resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar');
const out=path.join(here,'classes'); fs.mkdirSync(out,{recursive:true});
const sources=[];
function visit(dir) { for(const e of fs.readdirSync(dir,{withFileTypes:true})) { const p=path.join(dir,e.name); if(e.isDirectory()) visit(p); else if(p.endsWith('.java')) sources.push(p); } }
visit(path.join(experiment,'baseline/src/main/java')); sources.push(...['KernelAuditProbe','SentenceRelationBridgeProbe','EntityMultiplicityProbe','EntityProjectedChainProbe','EntityPartitionChainProbe'].map(name=>path.join(here,name+'.java')));
sources.push(path.join(experiment,'variants/controlled/src/main/java/org/ucb/generative_ie/mcmc/SentenceRelationBirthDeathMove.java'));
fs.writeFileSync(path.join(here,'logback-off.xml'),'<configuration><root level="OFF"/></configuration>\n');
const compilation=spawnSync('javac',['--release','8','-nowarn','-cp',dependency,'-d',out,...sources],{encoding:'utf8',maxBuffer:4e6});
fs.writeFileSync(path.join(here,'compile.log'),compilation.stdout+compilation.stderr);
if(compilation.status!==0) { process.stderr.write(compilation.stderr); process.exit(compilation.status??1); }
for (const name of ['KernelAuditProbe','SentenceRelationBridgeProbe','EntityMultiplicityProbe','EntityProjectedChainProbe','EntityPartitionChainProbe']) {
 const namespace=name.startsWith('Entity')?'mh':'mcmc';
 const run=spawnSync('java',['-ea','-Xmx1g',`-Dlogback.configurationFile=${path.join(here,'logback-off.xml')}`,'-cp',out+path.delimiter+dependency,'org.ucb.generative_ie.'+namespace+'.'+name],{encoding:'utf8',maxBuffer:4e6});
 fs.writeFileSync(path.join(here,name+'.txt'),run.stdout+run.stderr); process.stdout.write(run.stdout); process.stderr.write(run.stderr); if(run.status!==0) process.exit(run.status??1);
}
const fixedOut=path.join(here,'entity-fix-classes');fs.mkdirSync(fixedOut,{recursive:true});
const replacementNames=['EntitySmartSplitStep.java','EntitySmartMergeStep.java'];
const fixedSources=sources.filter(source=>!replacementNames.some(name=>source.endsWith('/'+name)));
for(const name of replacementNames)fixedSources.push(path.join(experiment,'variants/entity-multiplicity-fix/src/main/java/org/ucb/generative_ie/mh',name));
const fixedCompilation=spawnSync('javac',['--release','8','-nowarn','-cp',dependency,'-d',fixedOut,...fixedSources],{encoding:'utf8',maxBuffer:4e6});
fs.writeFileSync(path.join(here,'entity-fix-compile.log'),fixedCompilation.stdout+fixedCompilation.stderr);
if(fixedCompilation.status!==0){process.stderr.write(fixedCompilation.stderr);process.exit(fixedCompilation.status??1);}
const fixedRun=spawnSync('java',['-ea','-Xmx1g',`-Dlogback.configurationFile=${path.join(here,'logback-off.xml')}`,'-cp',fixedOut+path.delimiter+dependency,'org.ucb.generative_ie.mh.EntityPartitionChainProbe','--actual-fix'],{encoding:'utf8',maxBuffer:4e6});
fs.writeFileSync(path.join(here,'EntityPartitionChainProbe-fixed.txt'),fixedRun.stdout+fixedRun.stderr);process.stdout.write(fixedRun.stdout);process.stderr.write(fixedRun.stderr);process.exit(fixedRun.status??1);
