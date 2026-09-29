import test from 'node:test';
import assert from 'node:assert/strict';
import {semanticSignature,effectiveJudgment,findDisagreements} from '../scripts/check_semantic_consistency.mjs';
const p={id:'test_scope',definition:'A specific directed relation.',scope_notes:'No broader meanings.'};
const c={entity1:'ent_1',entity2:'ent_2',evidence:[{arg1:'Alice',arg2:'Team',dependency_path:'plays_for'}]};
test('complete evidence signatures ignore run-local numbers and duplicate rows only',()=>{
 const d=structuredClone(c);d.entity1='ent_99';d.entity2='ent_100';d.evidence.push({...d.evidence[0]});assert.equal(semanticSignature(p,c),semanticSignature(p,d));d.evidence.push({arg1:'Other Person',arg2:'Team',dependency_path:'plays_for'});assert.notEqual(semanticSignature(p,c),semanticSignature(p,d));
});
test('identity equality and predicate scope remain part of consistency signature',()=>{
 assert.notEqual(semanticSignature(p,c),semanticSignature(p,{...c,entity2:c.entity1}));assert.notEqual(semanticSignature(p,c),semanticSignature({...p,scope_notes:'Different scope.'},c));
});
test('effective labels respect explicit overrides and do not treat provisional imports as final',()=>{
 assert.equal(effectiveJudgment({judgment:'supported',provisional:true},null),null);assert.equal(effectiveJudgment({judgment:'supported'},{judgment:''}).judgment,'supported');assert.equal(effectiveJudgment({judgment:'supported'},{judgment:'incorrect'}).judgment,'incorrect');
});
test('prior-only disagreements never masquerade as current conflicts',()=>{
 const sig=semanticSignature(p,c),record={signature:sig,predicate_id:p.id,origin:'prior_reference'};assert.equal(findDisagreements([{...record,judgment:'supported'},{...record,judgment:'incorrect'}]).disagreement_count,0);assert.equal(findDisagreements([{...record,judgment:'supported'},{...record,origin:'current',judgment:'incorrect'}]).disagreement_count,1);
});
