import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';

/** Bind command implementations to one study's explicit evaluation contexts. */
export function createPreparationCommands({census,coverage=null}) {
 const {ROOT,REPO,json,fmt,sha,stable,prepareCensus,assertRetainedEvaluation}=census;
 // The retained manifest is the roster. Historical unblinding files also include
 // retired runs and must never repopulate the current evaluation.
 function initialEntries(){
  return json(path.join(ROOT,'census_manifest.json')).audits.map(a=>({
   source:path.join(REPO,a.source),prior:a.prior_directory?path.join(REPO,a.prior_directory):undefined,audit_id:a.audit_id,label:a.label
  }));
 }
 function prepareAll(entries){
  // Validate the whole batch before any retained entry can write artifacts.
  for(const entry of entries)assertRetainedEvaluation(entry);
  const file=path.join(ROOT,'census_manifest.json');const manifest=fs.existsSync(file)?json(file):{schema_version:1,unit:'Every expressed latent fact in each run\'s top 20 relations by assigned row count',audits:[]};
  for(const entry of entries){const result=prepareCensus(entry);const old=manifest.audits.find(a=>a.audit_id===result.audit_id);if(old&&JSON.stringify(old)!==JSON.stringify(result))throw Error('Changed census manifest entry');if(!old)manifest.audits.push(result);console.log(JSON.stringify(result));}
  manifest.audits.sort((a,b)=>a.label.localeCompare(b.label));fs.writeFileSync(file,fmt(manifest));return manifest;
 }

 function prepareArchive250(){
  const original='resources/sampler-140626/test/Entity_resolution_Relation/all-poss-facts/output-250/map_world.txt';
  const raw=fs.readFileSync(path.join(REPO,original),'utf8');
  const rows=[],lineMap=[];
  for(const [i,line]of raw.split(/\r?\n/).entries()){
   if(!line.trimStart().startsWith('Sentence ['))continue;
   const m=line.match(/^\s*Sentence \[origin=Fact\[(Ent\[ent_\d+\]), (Ent\[ent_\d+\]), Rel\[(rel_\d+)\]\], arg1=(.*?), arg2=(.*?), trig=Trig\[(.*)\]\]$/);
   assert(m,`Cannot parse archive line ${i+1}`);assert(!m.slice(1).some(x=>x.includes('\t')));
   rows.push([m[3],m[1],m[2],m[4],m[5],m[6]].join('\t'));lineMap.push({tsv_line:rows.length+1,archive_line:i+1});
  }
  assert.equal(rows.length,250);
  const out=path.join(ROOT,'supplemental');fs.mkdirSync(out,{recursive:true});
  const input=path.join(out,'archive250_map.tsv');stable(input,'relation\tentity1\tentity2\targ1\targ2\tpath\n'+rows.join('\n')+'\n');
  stable(path.join(out,'archive250_provenance.json'),fmt({original,archive_sha256:sha(raw),conversion:'Every displayed Sentence line, in archive order; no invented or supplemented evidence.',rows:250,full_source:'resources/sampler-140626/data/06-19/pluieTriples-1.json',different_corpus:true,main_comparison:false,line_map:lineMap}));
  const entry=prepareCensus({source:input,audit_id:'audit_archive250',top_relations:20,label:'Archived 250-row MAP — different corpus'},{outRoot:out});
  assert.equal(entry.population_facts,223);assert.equal(entry.relations,15);return entry;
 }
 function prepareCoverageAll(){
  const {prepareCoverage,TARGETS}=coverage;
  const audits=json(path.join(ROOT,'source_runs.json')).runs.map(entry=>prepareCoverage(entry));
  stable(path.join(ROOT,'census_manifest.json'),fmt({schema_version:1,mode:'sentence_rows',targets:TARGETS,selection:'Smallest ranked prefix reaching each requested fraction of input rows',audits}));
  return audits;
 }
 function runCompleteCLI(args=process.argv.slice(2)){const arg=args[0];prepareAll(arg?json(path.resolve(arg)):initialEntries());}
 function runArchive250CLI(){console.log(fmt(prepareArchive250()));}
 function runCoverageCLI(){const audits=prepareCoverageAll();console.log(JSON.stringify(audits.map(a=>({audit_id:a.audit_id,N:a.population_facts,k:a.relations,inherited:a.inherited_exact_cases})),null,2));}
 return {initialEntries,prepareAll,prepareArchive250,prepareCoverageAll,runCompleteCLI,runArchive250CLI,runCoverageCLI};
}
