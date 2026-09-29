// Compatibility caller. Validated v2 diagnostic; no import-time writes.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {runConsistency} from '../../../code/evaluation/commands/consistency.mjs';
export {semanticSignature,effectiveJudgment,findDisagreements} from '../../../code/evaluation/nyt/consistency.mjs';
export const checkSemanticConsistency=options=>runConsistency('nyt-top20',options);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))
  console.log(JSON.stringify(await checkSemanticConsistency(),null,2));
