// Campaign caller; imported as a module it performs no writes.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {evaluator} from './sampled_evaluation_config.mjs';
export const {renderReviewIndex,buildReviewIndex}=evaluator;
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))
  console.log(JSON.stringify(buildReviewIndex()));
