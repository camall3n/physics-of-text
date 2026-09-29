import fs from 'node:fs';
import {record} from './manual_helpers.mjs';
const a='audit_dcb746fa83d6',r='rel_146';
const old=JSON.parse(fs.readFileSync(`analysis/manual_records/${a}__${r}.json`));
const groups=old.groups.map(g=>[g.indices,g.judgment,g.reason,g.tags,g.question]);
const g=groups.find(g=>g[0].includes(11));
if(g[0].length!==1)throw Error('Unexpected grouping');
g[1]='supported';g[2]='The explicit live-in path establishes Alice Elliott Dark residence; the leading GENERATIONS heading is retained as an extraction artifact without invalidating the identifiable person, consistently with two inherited complete-census precedents.';g[3]=['metadata_artifact'];g[4]='';
record(a,r,groups,{mixed:old.mixed,broad:old.broad,identity:old.identity,reviewer:'evaluation'});
