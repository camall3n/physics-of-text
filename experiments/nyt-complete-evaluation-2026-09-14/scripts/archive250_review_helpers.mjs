// Historical archive-250 review policy; no grading occurs on import.
import {ROOT} from './census_lib.mjs';
import {createArchive250Review} from '../../../code/evaluation/nyt/review/archive250.mjs';
export const {recordArchive}=createArchive250Review(ROOT);
