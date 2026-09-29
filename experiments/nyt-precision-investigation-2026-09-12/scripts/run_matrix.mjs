import fs from 'node:fs';
import path from 'node:path';
import {spawn} from 'node:child_process';
import {fileURLToPath} from 'node:url';
const folder=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const plan=JSON.parse(fs.readFileSync(path.join(folder,'experiment_plan.json'),'utf8'));
const statusFile=path.join(folder,'matrix_status.json');
if(fs.existsSync(statusFile))throw Error('Matrix already started; inspect existing runs rather than overwrite');
const state={started_at:new Date().toISOString(),parallelism:2,runs:plan.runs.map(r=>({...r,status:'pending'}))};
const save=()=>fs.writeFileSync(statusFile,JSON.stringify(state,null,2)+'\n');
save();let next=0;
async function worker(){
 while(next<state.runs.length){
  const entry=state.runs[next++];entry.status='running';entry.started_at=new Date().toISOString();save();
  console.log('Starting '+entry.id);
  const child=spawn(process.execPath,[path.join(folder,'scripts/run_experiment.mjs'),path.join(folder,entry.config),path.join(folder,entry.output)],{stdio:['ignore','pipe','pipe']});
  let output='';child.stdout.on('data',s=>output+=s);child.stderr.on('data',s=>output+=s);
  const result=await new Promise(resolve=>{child.on('error',e=>resolve({code:null,error:String(e)}));child.on('close',(code,signal)=>resolve({code,signal}));});
  Object.assign(entry,result,{status:result.code===0?'complete':'failed',finished_at:new Date().toISOString(),runner_output:output.trim()});save();
  console.log(entry.status+' '+entry.id+' '+output.trim());
 }
}
await Promise.all([worker(),worker()]);
state.finished_at=new Date().toISOString();save();
if(state.runs.some(r=>r.status!=='complete'))process.exitCode=1;
