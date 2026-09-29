// Historical evaluation reviewer attribution; shared explicit-judgment recording.
import {fileURLToPath} from 'node:url';
import {createManualReview} from '../../../code/evaluation/nyt/review/record.mjs';
export {seq} from '../../../code/evaluation/nyt/review/record.mjs';
export const {record}=createManualReview({
 root:fileURLToPath(new URL('..',import.meta.url)),reviewer:'evaluation'
});
