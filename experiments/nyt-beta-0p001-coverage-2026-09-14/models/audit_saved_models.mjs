import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import zlib from 'node:zlib';
import {fileURLToPath} from 'node:url';

// Read-only inspection of historical runs; writes only this directory's provenance.json.
const here=path.dirname(fileURLToPath(import.meta.url));
const repo=path.resolve(here,'../../..');
const hash=b=>crypto.createHash('sha256').update(b).digest('hex');
const sha=p=>hash(fs.readFileSync(p));
const json=p=>JSON.parse(fs.readFileSync(p,'utf8'));
const rows=p=>fs.readFileSync(p,'utf8').trimEnd().split('\n').slice(1).map(x=>x.split('\t'));
function tarFiles(p){
  const tar=zlib.gunzipSync(fs.readFileSync(p));const out={};
  for(let off=0;off+512<=tar.length;){
    const h=tar.subarray(off,off+512);if(h.every(x=>x===0))break;
    const str=(start,end)=>h.subarray(start,end).toString().split('\0')[0];
    const name=str(345,500)?str(345,500)+'/'+str(0,100):str(0,100);
    const size=parseInt(str(124,136).trim()||'0',8);const type=str(156,157);
    if(type===''||type==='0')out[name]=hash(tar.subarray(off+512,off+512+size));
    off+=512+Math.ceil(size/512)*512;
  }
  return out;
}
const entries=[
 ['fixed_name_20260912','experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260912','experiments/nyt-precision-investigation-2026-09-12/variants/controlled'],
 ['fixed_name_20260913','experiments/nyt-precision-investigation-2026-09-12/runs/verbatim_beta0001_seed20260913','experiments/nyt-precision-investigation-2026-09-12/variants/controlled'],
 ['latent_20260912','experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912','experiments/nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix'],
 ['latent_20260913','experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260913','experiments/nyt-latent-low-smoothing-2026-09-14/variants/entity-multiplicity-fix']
];
const result={inspected_at_utc:new Date().toISOString(),method:'Read saved configurations, source tar contents, manifests, complete output hashes and selected source methods. No historical writes or inference.',runs:[]};
for(const [id,relative,variant] of entries){
 const d=path.join(repo,relative),r=json(d+'/run.json'),cfg=json(d+'/config.json'),src=json(d+'/source_sha256.json'),arch=tarFiles(d+'/source_snapshot.tar.gz');
 // BSD tar stores macOS AppleDouble metadata as ._ siblings; these are not source.
 const appleMetadata=Object.keys(arch).filter(k=>path.basename(k).startsWith('._'));
 for(const k of appleMetadata)delete arch[k];
 const archivedMismatch=Object.keys({...src,...arch}).filter(k=>src[k]!==arch[k]);
 const currentMismatch=Object.keys(src).filter(k=>!fs.existsSync(path.join(repo,variant,k))||sha(path.join(repo,variant,k))!==src[k]);
 const outputMismatch=Object.entries(r.outputs).filter(([k,v])=>!fs.existsSync(d+'/'+k)||sha(d+'/'+k)!==v).map(([k])=>k);
 const data=json(r.corpus).sentences, ts=rows(d+'/map_world_sentences.tsv'),init=rows(d+'/initial_world_sentences.tsv'),post=rows(d+'/post_entity_world_sentences.tsv');
 const logs=json(d+'/logprobs.txt');let best=0;logs.total.forEach((v,i)=>{if(v>logs.total[best])best=i;});
 const drift=(a,b)=>a.reduce((n,x,i)=>n+Number(x[1]!==b[i][1])+Number(x[2]!==b[i][2]),0);
 const hashes={};for(const f of ['config.json','run.json','source_sha256.json','source_snapshot.tar.gz','build.json','map_world_sentences.tsv','map_world.txt','map_world_mentions.txt','initial_world_sentences.tsv','post_entity_world_sentences.tsv','final_world_sentences.tsv','summary.json','logprobs.txt','checkpoints.json'])hashes[f]=sha(d+'/'+f);
 const stats={rows:data.length,nouns:new Set(data.flatMap(x=>[x.source,x.dest])).size,paths:new Set(data.map(x=>x.depPath)).size,literal_ordered_pairs:new Set(data.map(x=>JSON.stringify([x.source,x.dest]))).size,distinct_literal_triples:new Set(data.map(x=>JSON.stringify([x.source,x.dest,x.depPath]))).size};
 const map={iteration_one_based:best+1,proposals_at_observation:(best+1)*cfg.stepsPerIteration,log_joint:logs.total[best],saved_header_log_joint:Number(fs.readFileSync(d+'/map_world.txt','utf8').split('\n')[0]),observations:logs.total.length,expressed_relations:new Set(ts.map(x=>x[0])).size,expressed_facts:new Set(ts.map(x=>JSON.stringify(x.slice(0,3)))).size,entity_objects:json(d+'/checkpoints.json')[0].entities,occupied_relations:logs.relations_used[best],argument_mentions_changed_from_initial:drift(init,ts),post_entity_argument_mentions_changed_from_initial:drift(init,post)};
 const errors=[];
 if(JSON.stringify(cfg)!==JSON.stringify(r.config))errors.push('config differs from run.json');
 if(archivedMismatch.length)errors.push('source archive mismatch');
 if(currentMismatch.length)errors.push('present linked source differs from saved manifest');
 if(outputMismatch.length)errors.push('recorded output mismatch');
 if(sha(r.corpus)!==r.corpus_sha256)errors.push('corpus mismatch');
 if(sha(r.dependency_jar)!==r.dependency_sha256)errors.push('dependency mismatch');
 if(hashes['source_snapshot.tar.gz']!==r.source_archive_sha256)errors.push('archive hash differs from run record');
 if(map.log_joint!==map.saved_header_log_joint)errors.push('MAP differs from trajectory maximum');
 if(ts.length!==data.length||ts.some((x,i)=>x[3]!==data[i].source||x[4]!==data[i].dest||x[5]!==data[i].depPath))errors.push('MAP evidence differs from corpus');
 result.runs.push({id,directory:relative,linked_source:variant,config:cfg,summary:json(d+'/summary.json'),corpus:{path:path.relative(repo,r.corpus),sha256:r.corpus_sha256,...stats},dependency:{path:path.relative(repo,r.dependency_jar),sha256:r.dependency_sha256},java:r.java,source_files:Object.keys(src).length,main_java_files:Object.keys(src).filter(k=>k.startsWith('src/main/')&&k.endsWith('.java')).length,verified_recorded_outputs:Object.keys(r.outputs).length,ignored_archive_appledouble_metadata:appleMetadata.length,archived_source_mismatches:archivedMismatch,current_linked_source_mismatches:currentMismatch,recorded_output_mismatches:outputMismatch,hashes,map,source_sha256:src,errors});
}
const [fixed,,latent]=result.runs;
result.production_source_differences=Object.keys({...fixed.source_sha256,...latent.source_sha256}).filter(k=>k.startsWith('src/main/')&&fixed.source_sha256[k]!==latent.source_sha256[k]).map(k=>({path:k,fixed:fixed.source_sha256[k],latent:latent.source_sha256[k]}));
result.config_differences_between_modes=Object.keys(fixed.config).filter(k=>fixed.config[k]!==latent.config[k]).map(k=>({key:k,fixed:fixed.config[k],latent:latent.config[k]}));
result.all_checks_passed=result.runs.every(r=>r.errors.length===0);
fs.writeFileSync(path.join(here,'provenance.json'),JSON.stringify(result,null,2)+'\n');
console.log(JSON.stringify({all_checks_passed:result.all_checks_passed,runs:result.runs.map(({id,source_files,main_java_files,verified_recorded_outputs,corpus,map,errors,hashes})=>({id,source_files,main_java_files,verified_recorded_outputs,corpus,map,errors,hashes})),production_source_differences:result.production_source_differences},null,2));
if(!result.all_checks_passed)process.exitCode=1;
