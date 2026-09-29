// Compatibility caller; no evaluation logic is maintained here.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {evaluator} from './sampled_evaluation_config.mjs';
export {finitePopulationBounds,summarizeStrata} from '../../../code/evaluation/nyt/sampled.mjs';
export const {evaluateAudit,reportAudit}=evaluator;
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)) {
  const args=process.argv.slice(2),check=args[0]==='--check';
  if(check)args.shift();
  if(!args.length)throw new Error('Usage: node scripts/report_manual_samples.mjs manual_review/AUDIT [AUDIT ...]');
  for(const arg of args)console.log(JSON.stringify(check?evaluateAudit(arg).summary:reportAudit(arg)));
}
