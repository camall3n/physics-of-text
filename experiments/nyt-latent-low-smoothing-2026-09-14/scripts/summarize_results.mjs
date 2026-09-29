// Campaign caller; trace/comparison rendering is maintained centrally.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {summarizeLatentLowSmoothing} from '../../../code/evaluation/nyt/studies/summarize_results.mjs';
export const summarize=()=>summarizeLatentLowSmoothing(fileURLToPath(new URL('..',import.meta.url)));
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))console.log(summarize());
