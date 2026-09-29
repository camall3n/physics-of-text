/** Campaign caller for the shared validated diagnostic. No output by default. */
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {loadCampaign} from '../campaigns.mjs';
import {loadValidatedPopulation,compareValidatedPopulations,renderConsistency} from '../nyt/consistency.mjs';
import {assertOutputDirectory} from './nyt.mjs';
import {assertCampaignRoster,assertPresetResult} from './population.mjs';
export async function runConsistency(id,{includePrior=true,outputDirectory}={}) {
  const campaign=await loadCampaign(id);
  assert(['nyt-top20','nyt-coverage'].includes(id),'Consistency requires a registered frozen predicate catalogue; historical modes are separate');
  const population=c=>{
    assertCampaignRoster(c);
    const byFolder=new Map(c.audits.map(a=>[path.resolve(c.root,a.folder),a]));
    return loadValidatedPopulation({
      id:c.id,root:c.root,audits:c.audits,
      validateAudit(folder){
        const result=c.evaluator.validateAudit(folder);
        assertPresetResult(c,byFolder.get(folder),result,folder);
        return result;
      }
    });
  };
  const current=population(campaign),references=[];
  if(includePrior)for(const reference of campaign.references??[])references.push(population(await loadCampaign(reference)));
  const result=compareValidatedPopulations({current,references,includePrior});
  if(outputDirectory){
    const out=assertOutputDirectory(outputDirectory);fs.mkdirSync(out,{recursive:true});
    fs.writeFileSync(path.join(out,'semantic_consistency_v2.json'),JSON.stringify(result,null,2)+'\n');
    fs.writeFileSync(path.join(out,'semantic_consistency_v2.md'),renderConsistency(result));
  }
  return result;
}
