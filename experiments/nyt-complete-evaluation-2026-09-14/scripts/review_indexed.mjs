import {createIndexedReview} from '../../../code/evaluation/nyt/review/indexed.mjs';
import {census} from './evaluation_context.mjs';

createIndexedReview({census}).runIndexedReview();
