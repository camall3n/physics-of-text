import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createCensusContext} from '../../../code/evaluation/nyt/census.mjs';
import {createReporter} from '../../../code/evaluation/nyt/reporter.mjs';
import {createPriorComparisons} from '../../../code/evaluation/nyt/reports/prior_comparisons.mjs';

// Campaign data locations and protocol choice; evaluation logic lives in code/evaluation/nyt.
const studyRoot=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const repoRoot=path.resolve(studyRoot,'../..');
export const census=createCensusContext({studyRoot,repoRoot,rejectRetiredEvaluations:true});
export const priorComparisons=createPriorComparisons(census);
export const reporter=createReporter({census,selection:'top-relations',writePriorComparisons:priorComparisons.writePriorComparisons});
