// Campaign calls/configuration only; maintained evaluator is code/evaluation/nyt/sampled.mjs.
import {fileURLToPath} from 'node:url';
import {createSampledEvaluator} from '../../../code/evaluation/nyt/sampled.mjs';
export const evaluator=createSampledEvaluator({
  experiment:fileURLToPath(new URL('..',import.meta.url)),
  retiredAuditIds:[],
  selection:{topRelations:20,perRelation:5,salt:'nyt-precision-screen-2026-09-12-v1'},
  indexText:{populationPhrase:'all 20 full',lineNumberDescription:'Source references are TSV line numbers, including the header on line 1; the first data row is line 2.'}
});
