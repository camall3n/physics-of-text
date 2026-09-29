/** Invocation layer: select a registered campaign, validate, optionally render. */
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {loadCampaign,REPO} from '../campaigns.mjs';
import {scoreCoverage} from '../nyt/scoring.mjs';
import {assertCampaignRoster,assertPresetResult} from './population.mjs';
const read=file=>JSON.parse(fs.readFileSync(file,'utf8'));
const fmt=x=>JSON.stringify(x,null,2)+'\n';

function realDestination(file) {
  const resolved=path.resolve(file);
  if(fs.existsSync(resolved))return fs.realpathSync(resolved);
  return path.join(realDestination(path.dirname(resolved)),path.basename(resolved));
}
const inside=(file,root)=>file===root||file.startsWith(root+path.sep);
export function assertOutputDirectory(directory) {
  assert(typeof directory==='string'&&directory.trim(),'--output-dir is required for rendering');
  const output=realDestination(directory);
  for(const name of ['experiments','resources','code']){
    const protectedRoot=fs.realpathSync(path.join(REPO,name));
    assert(!inside(output,protectedRoot)&&!inside(protectedRoot,output),
      'Output overlaps source code or experiment records: '+output);
  }
  if(fs.existsSync(output)){
    assert(fs.statSync(output).isDirectory(),'Output must be a directory');
    assert.equal(fs.readdirSync(output).length,0,'Output directory must be empty');
  }
  return output;
}

export async function evaluateCampaign(id) {
  const campaign=await loadCampaign(id);
  assertCampaignRoster(campaign);
  const evaluated=campaign.audits.map(a=>{
    const folder=path.join(campaign.root,a.folder);
    if(campaign.kind==='historical-sample'){
      const evaluated=campaign.evaluator.evaluateAudit(folder);
      assertPresetResult(campaign,a,evaluated.result,folder);
      return {audit:a,folder,...evaluated};
    }
    const result=campaign.evaluator.validateAudit(folder);
    assertPresetResult(campaign,a,result,folder);
    if(campaign.selection.kind==='row-coverage')result.threshold_scores=scoreCoverage(result);
    return {audit:a,folder,result};
  });
  return {campaign,evaluated};
}
export async function checkCampaign(id) {
  const {campaign,evaluated}=await evaluateCampaign(id);
  for(const {folder,result} of evaluated)
    assert.deepEqual(result,read(path.join(folder,'assessment.json')),'Fresh assessment differs from saved: '+folder);
  let consistency=null;
  if(['nyt-top20','nyt-coverage'].includes(id)){
    const {runConsistency}=await import('./consistency.mjs');
    const diagnostic=await runConsistency(id);
    consistency={
      schema_version:diagnostic.schema_version,include_prior:diagnostic.include_prior,
      current_population:diagnostic.current_population,reference_populations:diagnostic.reference_populations,
      modes:Object.fromEntries(Object.entries(diagnostic.modes).map(([mode,m])=>[mode,{
        reviewed:m.reviewed,unreviewed:m.unreviewed,prior_references:m.prior_references,
        current_disagreements:m.current.disagreement_count,
        combined_disagreements:m.with_prior_references?.disagreement_count??null
      }]))
    };
  }
  return {preset:campaign.id,protocol:campaign.protocol,selection:campaign.selection,
    read_only:true,saved_assessments_identical:true,consistency,audits:evaluated.map(({audit,result,summary})=>({
      audit_id:audit.audit_id,...(campaign.kind==='census'?{counts:result.counts,precision:result.precision}:{summary})
    }))};
}
export async function renderCampaign(id,{outputDirectory}={}) {
  // Resolve preset and validate the whole campaign before any output mutation.
  const {campaign,evaluated}=await evaluateCampaign(id);
  const output=assertOutputDirectory(outputDirectory);
  fs.mkdirSync(output,{recursive:true});
  for(const name of ['METHOD.md','manual_protocol.md','analysis/manual_protocol.md']){
    const source=path.join(campaign.root,name);
    if(fs.existsSync(source)){
      const target=path.join(output,name);fs.mkdirSync(path.dirname(target),{recursive:true});
      fs.copyFileSync(source,target);
    }
  }
  for(const {audit,folder} of evaluated){
    const destination=path.join(output,audit.folder);
    fs.mkdirSync(destination,{recursive:true});
    // Copy only navigation companions; scientific results are freshly rendered.
    for(const name of ['README.md','raw_map.tsv','human_review.json','prior_assessment.md',
      'protocol.md','cases.json','source.json','prior_references.json','coverage.json',
      'ranked_cases.json','relations','annotations','declarations']){
      const source=path.join(folder,name);
      if(fs.existsSync(source))fs.cpSync(source,path.join(destination,name),{recursive:true});
    }
    if(campaign.kind==='historical-sample')
      campaign.evaluator.reportAudit(folder,{outputDirectory:destination});
    else campaign.evaluator.writeAuditReport(folder,{outputDirectory:destination});

  }
  fs.writeFileSync(path.join(output,'evaluation_run.json'),fmt({
    preset:campaign.id,protocol:campaign.protocol,selection:campaign.selection,
    source_root:campaign.root,audits:campaign.audits,
    note:'Re-rendered saved judgments. No new grading or inference. Inputs and original results unchanged.'
  }));
  fs.writeFileSync(path.join(output,'README.md'),[
    '# Evaluation render: '+campaign.id,'',campaign.description,'',
    'Protocol: '+campaign.protocol+'. Selection: `'+JSON.stringify(campaign.selection)+'`.','',
    'These reports re-render saved judgments. The original experiment is unchanged. Copied review forms are snapshots; edits here do not update the original evaluation.','',
    ...campaign.audits.map(a=>'- ['+a.audit_id+']('+a.folder+'/assessment.md)'), ''
  ].join('\n'));
  return {preset:campaign.id,output_directory:output,audits:evaluated.length};
}
