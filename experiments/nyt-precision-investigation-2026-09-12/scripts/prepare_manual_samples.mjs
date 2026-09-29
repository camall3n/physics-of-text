// Compatibility caller; no evaluation logic is maintained here.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {evaluator} from './sampled_evaluation_config.mjs';
export {SALT,parseMap} from '../../../code/evaluation/nyt/sampled.mjs';
export const {prepareRun,selectReview}=evaluator;
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)) {
  const args=process.argv.slice(2);
  if(!args.length)throw new Error('Usage: node scripts/prepare_manual_samples.mjs RUN_DIR [RUN_DIR ...]');
  for(const arg of args)console.log(JSON.stringify(prepareRun(arg)));
}
