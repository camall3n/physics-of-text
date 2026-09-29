import path from 'node:path';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
import {census,coverage} from './evaluation_context.mjs';
const {ROOT,json}=census;
export const {declarePredicate}=coverage;

if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)){
 const [audit,file]=process.argv.slice(2);assert(audit&&file,'Usage: node declare_predicate.mjs AUDIT DECLARATIONS.json; JSON is {declarations:[{relation,predicate_id,rationale,reviewer}]}');
 for(const d of json(path.resolve(file)).declarations)declarePredicate(path.join(ROOT,'census',audit),d);
 console.log('Declared '+json(path.resolve(file)).declarations.length+' predicates for '+audit);
}
