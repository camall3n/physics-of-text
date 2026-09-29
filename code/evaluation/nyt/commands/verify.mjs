import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';

/** Revalidate saved views without rewriting them when write is false. */
export function createVerificationCommands({census,reporter}) {
 const {ROOT,REPO,json,fmt,sha}=census;
 const {validateAudit}=reporter;
 function verifyReportArtifacts({write=true}={}){
  const main=json(path.join(ROOT,'census_manifest.json')).audits;
  const supplemental=['audit_archive250'].map(audit_id=>({audit_id,folder:'supplemental/'+audit_id}));
  const outputs=[];
  for(const a of [...main,...supplemental]){
   const folder=path.join(ROOT,a.folder),expected=validateAudit(folder),saved=json(path.join(folder,'assessment.json'));
   assert.equal(JSON.stringify(saved)===JSON.stringify(expected),true,`Stale structured assessment: ${a.audit_id}`);
   const cases=json(path.join(folder,'cases.json'));
   const reportFiles=fs.readdirSync(path.join(folder,'reports')).filter(f=>f.endsWith('.md')).sort();
   assert.deepEqual(reportFiles,cases.relations.map(r=>r.relation+'.md').sort());
   let headings=0,evidenceRows=0;
   for(const r of cases.relations){const md=fs.readFileSync(path.join(folder,'reports',r.relation+'.md'),'utf8');
    const ids=[...md.matchAll(/^### (rel_\d+__ent_\d+__ent_\d+)$/gm)].map(m=>m[1]);
    assert.deepEqual(ids,r.facts.map(f=>f.case_id),`Missing/repeated/reordered printed facts: ${a.audit_id}/${r.relation}`);
    assert.equal([...md.matchAll(/^\*\*Judgment: (supported|incorrect|ambiguous)\*\*/gm)].length,r.facts.length);
    const lines=[...md.matchAll(/^\| \[(\d+)\]\(/gm)].map(m=>Number(m[1])).sort((a,b)=>a-b);
    const expectedLines=r.facts.flatMap(f=>f.source_lines).sort((a,b)=>a-b);
    assert.deepEqual(lines,expectedLines,`Missing printed evidence: ${a.audit_id}/${r.relation}`);
    headings+=ids.length;evidenceRows+=lines.length;
   }
   assert.equal(headings,expected.counts.N);assert.equal(evidenceRows,expected.metadata.top_relation_rows);
   outputs.push({audit_id:a.audit_id,printed_facts:headings,printed_evidence_rows:evidenceRows,complete:true});
  }
  const comparison=json(path.join(ROOT,'comparison.json'));assert.equal(comparison.runs.length,main.length);
  for(const a of main){const row=comparison.runs.find(r=>r.audit_id===a.audit_id),assessment=json(path.join(ROOT,a.folder,'assessment.json'));assert(row);
   for(const k of ['N','S','E','A'])assert.equal(row[k],assessment.counts[k],`Stale comparison count ${a.audit_id}/${k}`);
   for(const k of ['lower','upper'])assert.equal(row[k],assessment.precision[k]);
  }
  const result={verified_at:new Date().toISOString(),complete:true,main_facts:outputs.slice(0,main.length).reduce((s,r)=>s+r.printed_facts,0),supplemental_facts:outputs.slice(main.length).reduce((s,r)=>s+r.printed_facts,0),method:'Revalidate source/annotations independently of saved assessments; compare every printed case heading, judgment count and evidence line against structured population; check all comparison counts.',audits:outputs};
  if(write)fs.writeFileSync(path.join(ROOT,'analysis/report_artifact_verification.json'),fmt(result));return result;
 }
 function verifySupplementalSources({write=true}={}){
  const out=path.join(ROOT,'supplemental');
  const a=json(path.join(out,'archive250_provenance.json'));
  const archive=fs.readFileSync(path.join(REPO,a.original),'utf8');assert.equal(sha(archive),a.archive_sha256);
  const archiveLines=archive.split(/\r?\n/),converted=fs.readFileSync(path.join(out,'archive250_map.tsv'),'utf8').trimEnd().split(/\r?\n/);
  assert.equal(a.line_map.length,250);assert.equal(converted.length,251);
  assert.equal(archiveLines.filter(l=>l.trimStart().startsWith('Sentence [')).length,a.line_map.length);
  for(const m of a.line_map){const [rel,e1,e2,arg1,arg2,trig]=converted[m.tsv_line-1].split('\t');
   assert.equal(archiveLines[m.archive_line-1].trim(),`Sentence [origin=Fact[${e1}, ${e2}, Rel[${rel}]], arg1=${arg1}, arg2=${arg2}, trig=Trig[${trig}]]`);
  }
  const result={verified_at:new Date().toISOString(),complete:true,archive250_rows:250,method:'Independently compare every converted archive250 TSV row to the exact source line; verify source hash; assert no eligible source line was omitted.'};
  if(write)fs.writeFileSync(path.join(out,'source_verification.json'),fmt(result));return result;
 }
 function verifyGeneratedViews({write=true}={}){
  // Verify complete published views against the strictly validated assessments.
  const comparison=json(path.join(ROOT,'comparison.json')),runs=[];
  assert.equal(comparison.complete,true);assert.equal(comparison.runs.length,4);
  for(const run of comparison.runs){
   const dir=path.join(ROOT,path.dirname(run.assessment)),validated=validateAudit(dir),saved=json(path.join(dir,'assessment.json'));
   assert.deepEqual(saved.facts,validated.facts,'Saved full assessment differs from final annotations');
   assert.deepEqual(saved.counts,validated.counts);assert.deepEqual(run.maximum_population,validated.counts);
   for(const c of validated.facts){const md=fs.readFileSync(path.join(dir,'reports',c.relation+'.md'),'utf8');assert(md.includes('### '+c.case_id),'Missing evaluated case heading');assert(md.includes('**Judgment: '+c.judgment+'**'),'Missing judgment rendering');}
   const cells=[];
   for(const t of run.thresholds){
    const stem='coverage_'+Math.round(t.target*100),file=path.join(dir,stem+'.json'),d=json(file),md=fs.readFileSync(path.join(dir,stem+'.md'),'utf8');
    const expectedFacts=validated.facts.filter(f=>f.relation_rank<=t.k),expectedStrata=validated.strata.filter(r=>r.rank<=t.k);
    assert.deepEqual(d.facts,expectedFacts,'Cutoff changed/omitted fact evidence or grade');assert.deepEqual(d.strata,expectedStrata,'Cutoff changed/omitted relation');assert.equal(d.facts.length,t.N);assert.equal(d.strata.length,t.k);assert.deepEqual(d.counts,{N:t.N,S:t.S,E:t.E,A:t.A});
    const linked=[...new Set([...md.matchAll(/\(reports\/(rel_\d+)\.md\)/g)].map(m=>m[1]))];assert.deepEqual(linked,expectedStrata.map(r=>r.relation),'Markdown cutoff has missing/foreign ranked links');
    for(const f of expectedFacts.filter(f=>f.judgment==='ambiguous'))assert(md.includes('#'+f.case_id+')'),'Missing selected review question');
    for(const f of validated.facts.filter(f=>f.relation_rank>t.k))assert(!md.includes('#'+f.case_id+')'),'Foreign review question from later cutoff');
    cells.push({target:t.target,k:t.k,N:t.N,S:t.S,E:t.E,A:t.A,json_sha256:sha(fs.readFileSync(file)),markdown_sha256:sha(md)});
   }
   const readme=fs.readFileSync(path.join(dir,'README.md'),'utf8');assert(readme.includes('additional facts completely reviewed'));assert(!readme.includes('require complete review'));
   runs.push({audit_id:run.audit_id,counts:validated.counts,old_top20_exactly_preserved:true,evaluated_relation_reports:validated.strata.length,cutoffs:cells});
  }
  const log=fs.readFileSync(path.join(ROOT,'analysis/pipeline_tests.tap'),'utf8'),testCounts=Object.fromEntries([...log.matchAll(/^# (tests|pass|fail|cancelled|skipped) (\d+)$/gm)].map(m=>[m[1],Number(m[2])])) ;
  assert(testCounts.tests>0);assert.equal(testCounts.fail,0);assert.equal(testCounts.pass,testCounts.tests);
  const semantic=json(path.join(ROOT,'analysis/semantic_consistency.json'));
  assert.equal(semantic.unreviewed,0);assert.equal(semantic.reviewed,8488);assert.equal(semantic.current.disagreement_count,0);assert.equal(semantic.with_prior_references.disagreement_count,0);
  const report={complete:true,current_fact_population:8488,cutoff_views:runs.reduce((n,r)=>n+r.cutoffs.length,0),relation_reports:runs.reduce((n,r)=>n+r.evaluated_relation_reports,0),tests:testCounts,tests_log:'pipeline_tests.tap',tests_log_sha256:sha(log),exact_evidence_consistency:{reviewed:semantic.reviewed,unreviewed:semantic.unreviewed,current_disagreements:semantic.current.disagreement_count,with_prior_disagreements:semantic.with_prior_references.disagreement_count},runs};
  assert.equal(report.cutoff_views,20);assert.equal(report.relation_reports,1144);if(write)fs.writeFileSync(path.join(ROOT,'analysis/final_pipeline_validation.json'),fmt(report));return report;
 }
 function runReportArtifactVerificationCLI(){console.log(fmt(verifyReportArtifacts()));}
 function runSupplementalSourceVerificationCLI(){console.log(fmt(verifySupplementalSources()));}
 function runGeneratedViewVerificationCLI(){const report=verifyGeneratedViews();console.log(JSON.stringify({complete:report.complete,N:report.current_fact_population,views:report.cutoff_views,relations:report.relation_reports,tests:report.tests}));}
 return {verifyReportArtifacts,verifySupplementalSources,verifyGeneratedViews,runReportArtifactVerificationCLI,runSupplementalSourceVerificationCLI,runGeneratedViewVerificationCLI};
}
