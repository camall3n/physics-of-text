import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createCensusContext} from '../../../code/evaluation/nyt/census.mjs';
import {createReporter} from '../../../code/evaluation/nyt/reporter.mjs';
import {createCoverageContext} from '../../../code/evaluation/nyt/coverage.mjs';

// Campaign data locations and protocol choice; evaluation logic lives in code/evaluation/nyt.
const studyRoot=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const repoRoot=path.resolve(studyRoot,'../..');
export const census=createCensusContext({studyRoot,repoRoot,rejectRetiredEvaluations:false});
export const coverage=createCoverageContext({census,priorRoot:path.join(repoRoot,'experiments/nyt-complete-evaluation-2026-09-14')});
export const reporter=createReporter({census,selection:'row-coverage',coverage});
