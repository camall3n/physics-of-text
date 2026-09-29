// Coverage callers retain the declaration lock, identity tags, history and reviewer override.
import {fileURLToPath} from 'node:url';
import {createManualReview} from '../../../code/evaluation/nyt/review/record.mjs';
export {seq} from '../../../code/evaluation/nyt/review/record.mjs';
export const {record}=createManualReview({
  root:fileURLToPath(new URL('..',import.meta.url)),reviewer:'runner',allowReviewerOverride:true,
  identityTags:true,requireDeclaration:true,preserveHistory:true
});
