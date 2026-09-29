// Read-only historical audit caller.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {readRankRange} from '../../../code/evaluation/nyt/review/rank_range.mjs';
export const show=(start,end)=>readRankRange(fileURLToPath(new URL('..',import.meta.url)),{audit:'audit_9c88162c7b22',start,end});
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))show(...process.argv.slice(2).map(Number));
