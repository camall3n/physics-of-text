import {record as base,seq} from './manual_helpers.mjs';
export {seq};
export const record=(audit,relation,groups,options={})=>base(audit,relation,groups,{...options,reviewer:'nyt_kernel_audit'});
