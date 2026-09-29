import fs from 'node:fs';
import path from 'node:path';
import {ROOT,REPO,json,sha,fmt} from './census_lib.mjs';
import {MAINTENANCE_LEDGER,verifyProtectedManifest} from '../../../code/evaluation/verify_preservation.mjs';
const file=path.join(ROOT,'protected_manifest.json'),original=json(file);
const result={verified_at:new Date().toISOString(),protected_manifest_sha256:sha(fs.readFileSync(file)),scope:original.scope,maintenance_ledger:MAINTENANCE_LEDGER,...verifyProtectedManifest({repo:REPO,manifest:original})};
if(!process.argv.includes('--check'))fs.writeFileSync(path.join(ROOT,'analysis/preservation_verification.json'),fmt(result));
console.log(fmt(result));if(result.failures.length)process.exitCode=1;
