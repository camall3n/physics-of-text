// Historical manifests remain frozen; maintenance exceptions require exact before/after hashes.
import fs from 'node:fs';
import path from 'node:path';
import {ROOT,REPO,json,sha,fmt} from './census_lib.mjs';
import {MAINTENANCE_LEDGER,verifyProtectedManifest} from '../../../code/evaluation/verify_preservation.mjs';
const file=path.join(ROOT,'protected_manifest.json'),manifest=json(file);
const result={checked_at:new Date().toISOString(),manifest_sha256:sha(fs.readFileSync(file)),scope:manifest.scope,maintenance_ledger:MAINTENANCE_LEDGER,...verifyProtectedManifest({repo:REPO,manifest})};
if(!process.argv.includes('--check'))fs.writeFileSync(path.join(ROOT,'protected_verification.json'),fmt(result));
console.log(fmt(result));if(result.failures.length)process.exitCode=1;
