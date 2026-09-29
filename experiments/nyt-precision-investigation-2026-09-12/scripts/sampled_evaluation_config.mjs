// Campaign calls/configuration only; maintained evaluator is code/evaluation/nyt/sampled.mjs.
import {fileURLToPath} from 'node:url';
import {createSampledEvaluator} from '../../../code/evaluation/nyt/sampled.mjs';
export const evaluator=createSampledEvaluator({
  experiment:fileURLToPath(new URL('..',import.meta.url)),
  retiredAuditIds:['audit_edb22a4a92','audit_b7a9a3dfc8'],
  selection:{topRelations:20,perRelation:5,salt:'nyt-precision-screen-2026-09-12-v1'},
  indexText:{}
});
