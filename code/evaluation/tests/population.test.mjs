import test from 'node:test';
import assert from 'node:assert/strict';
import {assertCampaignRoster,assertPresetResult} from '../commands/population.mjs';
const campaign={root:'/campaign',kind:'census',selection:{kind:'row-coverage',targets:[.57,.6,.7,.8,.9]},
  audits:[{audit_id:'audit_a',folder:'census/audit_a'}]};
test('every caller rejects duplicate audit IDs, duplicate folders and external populations',()=>{
  assert.throws(()=>assertCampaignRoster({...campaign,audits:[...campaign.audits,...campaign.audits]}),/Duplicate audit/);
  assert.throws(()=>assertCampaignRoster({...campaign,audits:[...campaign.audits,{audit_id:'audit_b',folder:'census/../census/audit_a'}]}),/Duplicate audit folder/);
  assert.throws(()=>assertCampaignRoster({...campaign,audits:[{audit_id:'audit_a',folder:'../outside'}]}),/outside campaign/);
});
test('registered population checks reject drift even if each audit is internally valid',()=>{
  const audit=campaign.audits[0],result={metadata:{audit_id:'audit_a'},coverage:{targets:[.57,.6,.7,.8,.9].map(target=>({target}))}};
  assertPresetResult(campaign,audit,result);
  assert.throws(()=>assertPresetResult(campaign,{...audit,audit_id:'wrong'},result),/identity differs/);
  assert.throws(()=>assertPresetResult(campaign,audit,{...result,coverage:{targets:[{target:.5}]}}),/Coverage targets differ/);
  assert.throws(()=>assertPresetResult({...campaign,selection:{kind:'top-relations',k:20}},audit,{metadata:{audit_id:'audit_a',top_relations_requested:5}}),/Top-relation request differs/);
});
