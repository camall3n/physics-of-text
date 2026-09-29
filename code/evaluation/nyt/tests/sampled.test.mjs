import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createSampledEvaluator,selectReview} from '../sampled.mjs';

const repository=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'../../../..');
for(const campaign of ['nyt-precision-investigation-2026-09-12','nyt-latent-low-smoothing-2026-09-14']) {
  test(campaign+': all retained historical sampled results and selections remain exact',()=>{
    const experiment=path.join(repository,'experiments',campaign);
    const evaluator=createSampledEvaluator({experiment});
    const entries=JSON.parse(fs.readFileSync(path.join(experiment,'manual_review/unblinding.json'),'utf8')).audits;
    for(const entry of entries) {
      const folder=path.join(experiment,'manual_review',entry.audit_id);
      const {result,markdown}=evaluator.evaluateAudit(folder);
      assert.equal(JSON.stringify(result,null,2)+'\n',fs.readFileSync(path.join(folder,'assessment.json'),'utf8'));
      assert.equal(markdown,fs.readFileSync(path.join(folder,'assessment.md'),'utf8'));
      const selected=selectReview(fs.readFileSync(path.join(folder,'raw_map.tsv'),'utf8'));
      const saved=JSON.parse(fs.readFileSync(path.join(folder,'cases.json'),'utf8'));
      assert.deepEqual(selected.relations,saved.relations);
    }
  });
}
test('historical sampled factory rejects evidence outside its explicit campaign context',()=>{
  const evaluator=createSampledEvaluator({experiment:'/a-campaign'});
  assert.throws(()=>evaluator.evaluateAudit('/another-campaign/manual_review/audit_1'),/inside this investigation/);
  assert.throws(()=>evaluator.prepareRun('/another-campaign/run'),/inside this isolated investigation/);
});
test('historical selection parameters change selection size but not parsed population',()=>{
  const header='relation\tentity1\tentity2\targ1\targ2\tpath';
  const rows=[];
  for(let r=0;r<3;r++)for(let f=0;f<8;f++)
    rows.push(['rel_'+r,'Ent[ent_'+f+']','Ent[ent_100]','a'+f,'b','path'+r].join('\t'));
  const raw=header+'\n'+rows.join('\n')+'\n';
  const selected=selectReview(raw,{topRelations:2,perRelation:3});
  assert.equal(selected.metadata.total_expressed_facts,24);
  assert.equal(selected.metadata.population_facts,16);
  assert.equal(selected.metadata.sampled_facts,6);
  assert.equal(selected.relations.length,2);
  assert.equal(selected.relations.reduce((s,r)=>s+r.micro_weight,0),1);
});
