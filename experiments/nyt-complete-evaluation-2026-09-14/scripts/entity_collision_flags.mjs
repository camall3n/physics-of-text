// Diagnostic caller; importing it does not write.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {writeEntityCollisionFlags,collectEntityCollisionFlags} from '../../../code/evaluation/nyt/diagnostics/entity_collisions.mjs';
const root=fileURLToPath(new URL('..',import.meta.url));
export const collect=()=>collectEntityCollisionFlags(root);
export const write=options=>writeEntityCollisionFlags(root,options);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))console.log(JSON.stringify(write()));
