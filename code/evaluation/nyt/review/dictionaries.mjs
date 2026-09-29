import fs from 'node:fs';
import path from 'node:path';
import {parseMap} from '../parse_map.mjs';
export function renderDictionaries(base,repo){
const files={},summaries=[];
const runs=JSON.parse(fs.readFileSync(path.join(base,'source_runs.json'))).runs;
for(const run of runs){
 const parsed=parseMap(fs.readFileSync(path.join(repo,run.source),'utf8'));
 const metadata={audit_id:run.audit_id,label:run.label,source:run.source,source_sha256:run.source_sha256,total_rows:parsed.sentence_count,total_facts:parsed.fact_count,total_relations:parsed.relation_count};
 const records=parsed.relations.map(r=>({rank:r.rank,relation:r.relation,sentence_count:r.sentence_count,facts:r.facts.length,paths:r.paths}));
 files['analysis/'+run.audit_id+'_dictionaries.json']=JSON.stringify({metadata,relations:records},null,2)+'\n';
 files['analysis/'+run.audit_id+'_dictionaries.md']=`# Full ranked relation dictionaries: ${run.audit_id}\n\nRead-only extraction of every supplied dictionary path and its row count. No semantic labels or fact grades are generated. Source: \`${run.source}\`.\n\n`+records.map(r=>`## Rank ${r.rank}: ${r.relation} (${r.sentence_count} rows; ${r.facts} facts)\n\n`+r.paths.map((p,i)=>`- P${i} × ${p.count}: \`${p.value}\``).join('\n')).join('\n\n')+'\n';
 summaries.push([run.audit_id,parsed.relation_count,parsed.relations.reduce((n,r)=>n+r.paths.length,0),'paths']);
}

return {files,summaries};
}
export function writeDictionaries(base,repo,{outputDirectory=base}={}){
 const result=renderDictionaries(base,repo);
 for(const [relative,content] of Object.entries(result.files)){
  const file=path.join(outputDirectory,relative);fs.mkdirSync(path.dirname(file),{recursive:true});fs.writeFileSync(file,content);
 }
 for(const summary of result.summaries)console.log(...summary);
 return result.summaries;
}
