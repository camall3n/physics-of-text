// Compatibility diagnostic caller; no labels are inferred or changed.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {ROOT} from './census_lib.mjs';
import {collectIdentityDiagnostics,writeIdentityDiagnostics as write} from '../../../code/evaluation/nyt/diagnostics/evidence_identity.mjs';
export {identityFlag} from '../../../code/evaluation/nyt/diagnostics/evidence_identity.mjs';
export const collect=()=>collectIdentityDiagnostics(ROOT);
export const writeIdentityDiagnostics=options=>write(ROOT,options);
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))console.log(writeIdentityDiagnostics().length+' case-local identity flags');
