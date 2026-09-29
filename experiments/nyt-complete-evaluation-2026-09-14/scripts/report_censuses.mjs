import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {reporter} from './evaluation_context.mjs';
import {runReporterCli} from '../../../code/evaluation/nyt/reporter.mjs';
export const {validateAudit,writeAuditReport,compareAll,progress}=reporter;

if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))runReporterCli(reporter);
