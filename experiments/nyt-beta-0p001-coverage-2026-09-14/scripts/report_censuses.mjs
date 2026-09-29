import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {reporter} from './evaluation_context.mjs';
import {runReporterCli} from '../../../code/evaluation/nyt/reporter.mjs';
export {validateJudgment} from '../../../code/evaluation/nyt/judgments.mjs';
export const {validateAudit,writeAuditReport,compareAll,progress,writeThresholdReports}=reporter;

if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))runReporterCli(reporter);
