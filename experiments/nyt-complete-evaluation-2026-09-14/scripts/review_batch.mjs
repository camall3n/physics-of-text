import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {ROOT} from './census_lib.mjs';
import {reviewBatch} from '../../../code/evaluation/nyt/review/batch.mjs';
export const show=options=>reviewBatch(ROOT,options);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)){
 const [audit,relation,startArg='1',countArg='20']=process.argv.slice(2);
 show({audit,relation,startArg,countArg,evidenceOnly:process.argv.includes('--evidence-only')});
}
