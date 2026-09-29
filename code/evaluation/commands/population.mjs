// Registered population checks shared by check, render and consistency callers.
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
export function assertCampaignRoster(campaign) {
  assert(campaign.audits.length,'Campaign contains no audits');
  assert.equal(new Set(campaign.audits.map(a=>a.audit_id)).size,campaign.audits.length,'Duplicate audit');
  const folders=campaign.audits.map(a=>path.resolve(campaign.root,a.folder));
  assert.equal(new Set(folders).size,folders.length,'Duplicate audit folder');
  for(const folder of folders)assert(folder.startsWith(path.resolve(campaign.root)+path.sep),'Audit folder outside campaign');
}
export function assertPresetResult(campaign,audit,result,folder) {
  if(campaign.kind==='historical-sample'){
    assert.equal(result.audit_id,audit.audit_id,'Manifest audit identity differs');
    const metadata=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'),'utf8')).metadata;
    assert.equal(metadata.per_relation_requested,campaign.selection.perRelation,'Sample allocation differs from preset');
    assert.equal(metadata.selection_salt,campaign.selection.salt,'Sample salt differs from preset');
    assert.equal(metadata.top_relations,Math.min(campaign.selection.topRelations,metadata.total_expressed_relations),'Sample relation prefix differs from preset');
    return;
  }
  assert.equal(result.metadata.audit_id,audit.audit_id,'Manifest audit identity differs');
  if(campaign.selection.kind==='row-coverage')
    assert.deepEqual(result.coverage.targets.map(t=>t.target),campaign.selection.targets,'Coverage targets differ from preset');
  else assert.equal(result.metadata.top_relations_requested,campaign.selection.k,'Top-relation request differs from preset');
}
