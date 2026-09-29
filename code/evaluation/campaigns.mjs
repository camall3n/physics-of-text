/**
 * Campaign invocation/configuration, separate from reusable evaluators.
 * Every preset names a saved population, an explicit selection, and a protocol.
 */
import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {pathToFileURL} from 'node:url';
export const REPO=fileURLToPath(new URL('../..',import.meta.url));
const experiment=name=>path.join(REPO,'experiments',name);
const complete=experiment('nyt-complete-evaluation-2026-09-14');
const coverage=experiment('nyt-beta-0p001-coverage-2026-09-14');
const sampled12=experiment('nyt-precision-investigation-2026-09-12');
const sampled14=experiment('nyt-latent-low-smoothing-2026-09-14');
const presets=[
 {id:'nyt-top20',root:complete,kind:'census',protocol:'complete-census-v1',
  selection:{kind:'top-relations',k:20},manifest:'census_manifest.json',
  description:'Ten retained full-NYT runs; every fact in the top 20 relations.'},
 {id:'nyt-coverage',root:coverage,kind:'census',protocol:'coverage-census-v1',
  selection:{kind:'row-coverage',targets:[.57,.60,.70,.80,.90]},manifest:'census_manifest.json',
  references:['nyt-top20'],description:'Four corrected beta=.001 runs; complete nested prefixes by input-row coverage.'},
 {id:'nyt-archive250',root:complete,kind:'census',protocol:'complete-census-v1',
  selection:{kind:'top-relations',k:20},
  audits:[{audit_id:'audit_archive250',folder:'supplemental/audit_archive250',label:'Historical 250-row source'}],
  description:'Separate 250-row corpus; all 15 available relations, 223 facts. Never pooled with full NYT.'},
 {id:'sampled-sep12',root:sampled12,kind:'historical-sample',protocol:'stratified-screen-v1',manifest:'manual_review/unblinding.json',
  selection:{kind:'stratified-sample',topRelations:20,perRelation:5,salt:'nyt-precision-screen-2026-09-12-v1'},
  description:'Eight retained historical screens; population-weighted sample estimator, not census.'},
 {id:'sampled-sep14',root:sampled14,kind:'historical-sample',protocol:'stratified-screen-v1',manifest:'manual_review/unblinding.json',
  selection:{kind:'stratified-sample',topRelations:20,perRelation:5,salt:'nyt-precision-screen-2026-09-12-v1'},
  description:'Two historical latent low-smoothing screens; same historical estimator.'}
];
const freeze=value=>{
  if(value&&typeof value==='object'){for(const nested of Object.values(value))freeze(nested);Object.freeze(value);}
  return value;
};
export const PRESETS=freeze(presets);
export function getPreset(id) {
  const preset=PRESETS.find(p=>p.id===id);
  if(!preset)throw new Error('Unknown preset: '+id);
  return preset;
}
export async function loadCampaign(id) {
  const preset=getPreset(id);
  if(preset.kind==='census'){
    // These study-local modules bind roots/protection policies only. All
    // evaluation implementation lives in code/evaluation/nyt.
    const evaluator=await import(pathToFileURL(path.join(preset.root,'scripts/report_censuses.mjs')));
    const audits=preset.audits??JSON.parse(fs.readFileSync(path.join(preset.root,preset.manifest),'utf8')).audits;
    return {...preset,audits,evaluator};
  }
  const {evaluator}=await import(pathToFileURL(path.join(preset.root,'scripts/sampled_evaluation_config.mjs')));
  // The retained manifest defines the population; missing reports must not
  // silently remove audits from a supposedly complete check.
  const roster=JSON.parse(fs.readFileSync(path.join(preset.root,preset.manifest),'utf8')).audits;
  const audits=roster.map(a=>({...a,folder:'manual_review/'+a.audit_id,label:a.audit_id}))
    .sort((a,b)=>a.audit_id.localeCompare(b.audit_id));
  return {...preset,audits,evaluator};
}
