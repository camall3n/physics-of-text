// Explicit historical reviewer/population policy; shared recording logic is maintained centrally.
import {fileURLToPath} from 'node:url';
import {createManualReview} from '../../../code/evaluation/nyt/review/record.mjs';
export {seq} from '../../../code/evaluation/nyt/review/record.mjs';
export const {record}=createManualReview({
  root:fileURLToPath(new URL('..',import.meta.url)),population:'census',reviewer:'root'
});
