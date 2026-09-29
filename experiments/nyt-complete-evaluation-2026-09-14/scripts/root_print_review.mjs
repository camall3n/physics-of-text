import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {ROOT} from './census_lib.mjs';
import {printReview} from '../../../code/evaluation/nyt/review/print_review.mjs';
export const show=(audit,ids)=>printReview(ROOT,audit,ids);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)){
 const [audit,...ids]=process.argv.slice(2);show(audit,ids);
}
