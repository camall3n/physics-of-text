// Campaign-specific audit selection; recording logic and label adapter are shared.
import {record,seq} from '../scripts/manual_helpers.mjs';
import {createGradeAdapter} from '../../../code/evaluation/nyt/review/grade_adapter.mjs';
export {seq};
export const R=createGradeAdapter(record,{audit:'audit_9c88162c7b22',reviewer:'runner'});
