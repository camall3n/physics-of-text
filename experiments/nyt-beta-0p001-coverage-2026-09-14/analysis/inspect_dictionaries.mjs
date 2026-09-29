// Campaign input/output selection only; no grading occurs.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {renderDictionaries,writeDictionaries} from '../../../code/evaluation/nyt/review/dictionaries.mjs';
const base=fileURLToPath(new URL('..',import.meta.url)),repo=path.resolve(base,'../..');
export const render=()=>renderDictionaries(base,repo);
export const write=options=>writeDictionaries(base,repo,options);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))write();
