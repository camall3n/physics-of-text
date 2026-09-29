import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {json,fmt,pct,esc} from './common.mjs';
import {createAuditValidator} from './audit.mjs';
import {scoreCoverage} from './scoring.mjs';
import {createPriorComparisons} from './reports/prior_comparisons.mjs';

export function renderThresholdReports(result){
 const artifacts=new Map();
 for(const t of result.threshold_scores.thresholds){
  const stem='coverage_'+Math.round(t.target*100),strata=result.strata.filter(s=>s.rank<=t.k),facts=result.facts.filter(f=>f.relation_rank<=t.k);
  assert.equal(strata.length,t.k);assert.equal(facts.length,t.N);assert.equal(strata.reduce((n,s)=>n+s.N,0),t.N);
  const data={audit_id:result.metadata.audit_id,source_sha256:result.metadata.source_sha256,mode:'sentence_rows',evaluation:'Complete expressed ordered fact census at this specific prefix; no sampling or propagation from other cutoffs',threshold:t,counts:{N:t.N,S:t.S,E:t.E,A:t.A},precision:{lower:t.lower,upper:t.upper},unresolved_predicate_facts:t.unresolved_predicate_facts,unresolved_predicate_relations:t.unresolved_predicate_relations,strata,facts};
  artifacts.set(stem+'.json',fmt(data));
  const md=[`# ${result.metadata.audit_id}: ${pct(t.target)} row coverage`,'','[All cutoffs](assessment.md) · [Structured complete assessment]('+stem+'.json) · [Human overrides](human_review.json) · [Method](../../METHOD.md)','',`**Every one of ${t.N} facts in ranks 1–${t.k} has been evaluated.** The smallest whole-relation prefix reaches ${t.rows}/${t.total_rows} rows = ${pct(t.achieved_coverage)} actual coverage.`,'',`${t.S} supported, ${t.E} incorrect, ${t.A} ambiguous. Precision is **${t.S}/${t.N} = ${pct(t.lower)}** when ambiguity is counted incorrect, or **${t.S+t.A}/${t.N} = ${pct(t.upper)}** when ambiguity is counted supported. These are exact census fractions, not confidence intervals. Row coverage is not gold-fact recall.`,`Unresolved relation meanings account for ${t.unresolved_predicate_facts} facts in ${t.unresolved_predicate_relations} relations; these remain included in A and N.`,'',`Added block since the preceding cutoff (or the preserved top20 for the first cutoff): ranks ${t.marginal.from_exclusive_rank+1}–${t.marginal.to_inclusive_rank}; ${t.marginal.S} S, ${t.marginal.E} E, ${t.marginal.A} A, N=${t.marginal.N}${t.marginal.N?`; precision ${pct(t.marginal.lower)}–${pct(t.marginal.upper)}`:'; no added facts'}.`,'','## Only the selected relations','','Each link opens the full dictionary and every fact’s evidence, judgment and explanation. Relations outside this cutoff are absent from this index and the structured assessment.','','| Rank | Evaluated relation | Predicate | S | E | A | N | Precision endpoints |','|---:|---|---|---:|---:|---:|---:|---|',...strata.map(s=>`| ${s.rank} | [${s.relation}](reports/${s.relation}.md) | ${s.predicate_id} | ${s.S} | ${s.E} | ${s.A} | ${s.N} | ${pct(s.lower)}–${pct(s.upper)} |`),'','## Questions within this cutoff','',...facts.filter(f=>f.judgment==='ambiguous').map(f=>`- [${f.case_id}](reports/${f.relation}.md#${f.case_id}): ${f.reviewer_question}`),''];
  artifacts.set(stem+'.md',md.join('\n'));
 }
 return artifacts;
}

export function writeThresholdReports(absolute,result){
 for(const [file,content] of renderThresholdReports(result))fs.writeFileSync(path.join(absolute,file),content);
}

/** Bind report orchestration to a campaign; validation remains read-only. */
export function createReporter({census,selection,coverage,writePriorComparisons=createPriorComparisons(census).writePriorComparisons}) {
 const {ROOT,within,factMarkdown,dictionaryMarkdown}=census;
 const validateAudit=createAuditValidator({census,selection,coverage});
function writeAuditReport(folder,options={}){
 const absolute=within(path.resolve(folder));const result=validateAudit(absolute,options);if(selection==='row-coverage')result.threshold_scores=scoreCoverage(result);const source=json(path.join(absolute,'cases.json'));
 const outputDirectory=options.outputDirectory?path.resolve(options.outputDirectory):absolute;
 const reports=path.join(outputDirectory,'reports');fs.mkdirSync(reports,{recursive:true});
 for(const s of result.strata){const r=source.relations.find(r=>r.relation===s.relation),cases=result.facts.filter(c=>c.relation===s.relation);
  const md=[`# ${result.metadata.audit_id} — ${s.relation}: ${s.label}`,'',`Predicate ID: ${s.predicate_id}`,'',s.definition,'',s.scope_notes,'',`Complete census: ${s.S} supported, ${s.E} incorrect, ${s.A} ambiguous; N=${s.N}. Precision ${s.S}/${s.N}=${pct(s.lower)} to ${s.S+s.A}/${s.N}=${pct(s.upper)}.`,'',...dictionaryMarkdown(r),'## Every evaluated fact',''];
  for(const c of cases)md.push(...factMarkdown(c),`**Judgment: ${c.judgment}** (${c.judgment_source}). ${c.reason}`,'',`Cited evidence lines: ${c.evidence_lines.map(n=>`[${n}](../raw_map.tsv:${n})`).join(', ')}.`,'',c.reviewer_question?`**Review question:** ${c.reviewer_question}`:'',c.issue_tags.length?`Issue tags: ${c.issue_tags.join(', ')}`:'','');
  fs.writeFileSync(path.join(reports,s.relation+'.md'),md.join('\n'));
 }
 fs.writeFileSync(path.join(outputDirectory,'assessment.json'),fmt(result));
 const c=result.counts,md=[`# Complete census: ${result.metadata.audit_id}`,'','[Method](../../METHOD.md) · [Structured assessment](assessment.json) · [Editable human overrides](human_review.json)','',`**${c.N}/${c.N} facts evaluated.** ${c.S} supported, ${c.E} incorrect, ${c.A} ambiguous. Exact census precision is **${c.S}/${c.N} = ${pct(result.precision.lower)}** with ambiguity counted incorrect, or **${c.S+c.A}/${c.N} = ${pct(result.precision.upper)}** with ambiguity counted supported.`,'','These are complete-population descriptive fractions for this saved run, conditional on the declared predicates and judgments. They are not confidence limits and do not include reviewer uncertainty, sampler variability or gold-standard recall. No sampling statistics are used.','',`Decided-only precision: ${result.precision.decided_precision===null?'undefined':pct(result.precision.decided_precision)}; decided coverage: ${pct(result.precision.decided_coverage)}. Macro precision (equal relation weights): ${pct(result.macro.lower)}–${pct(result.macro.upper)}.`, '', `Top-relation row coverage: ${result.metadata.top_relation_rows}/${result.metadata.corpus_sentences}; coverage is not recall. Total expressed relations/facts in the saved world: ${result.metadata.total_expressed_relations}/${result.metadata.total_expressed_facts}. Human overrides used: ${c.human_overrides}.`,'','| Rank | Full dictionary, every fact and evaluation | Predicate ID | S | E | A | N | Precision endpoints |','|---:|---|---|---:|---:|---:|---:|---|',...result.strata.map(s=>`| ${s.rank} | [${esc(s.label)} (${s.relation})](reports/${s.relation}.md) | ${s.predicate_id} | ${s.S} | ${s.E} | ${s.A} | ${s.N} | ${pct(s.lower)}–${pct(s.upper)} |`),'','## Questions for human review','',...result.facts.filter(f=>f.judgment==='ambiguous').map(f=>`- [${f.case_id}](reports/${f.relation}.md#${f.case_id}): ${f.reviewer_question}`),''];
 if(selection==='row-coverage'){
 const scores=result.threshold_scores,thresholdText=['## Requested row-coverage prefixes','','Every cutoff includes all facts in the smallest ranked prefix reaching the target. Whole relations can overshoot the requested coverage. Marginal scores cover only relations added since the previous cutoff; the first block starts after the preserved top20. Unresolved-predicate facts are included in A and N; their count is shown separately from case-level ambiguity.','','| Target | k | Rows | Actual coverage | S | E | A | N | S/N | (S+A)/N | Unresolved relation facts | Added ranks | Added S/E/A/N | Added precision |','|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---|---|---|',...scores.thresholds.map(t=>`| [${pct(t.target)}](coverage_${Math.round(t.target*100)}.md) | ${t.k} | ${t.rows}/${t.total_rows} | ${pct(t.achieved_coverage)} | ${t.S} | ${t.E} | ${t.A} | ${t.N} | ${pct(t.lower)} | ${pct(t.upper)} | ${t.unresolved_predicate_facts} | ${t.marginal.from_exclusive_rank+1}–${t.marginal.to_inclusive_rank} | ${t.marginal.S}/${t.marginal.E}/${t.marginal.A}/${t.marginal.N} | ${t.marginal.N?pct(t.marginal.lower)+'–'+pct(t.marginal.upper):'no added facts'} |`),'',`Preserved top20: ${scores.reference_top20.S} S, ${scores.reference_top20.E} E, ${scores.reference_top20.A} A, N=${scores.reference_top20.N}; ${pct(scores.reference_top20.lower)}–${pct(scores.reference_top20.upper)}. [Immutable previous assessment](prior_assessment.md).`,''];
 const tableIndex=md.findIndex(x=>x.startsWith('| Rank |'));md.splice(tableIndex,0,...thresholdText);
 }
 fs.writeFileSync(path.join(outputDirectory,'assessment.md'),md.join('\n'));
 if(selection==='row-coverage'){writeThresholdReports(outputDirectory,result);coverage.writeCoverageReadme(absolute,{complete:true,outputDirectory});}
 return result;
}
function compareTopRelations({manifestFile=path.join(ROOT,'census_manifest.json'),options={}}={}){
 const manifest=json(manifestFile);assert(manifest.audits.length);const ids=new Set();for(const a of manifest.audits){assert(!ids.has(a.audit_id),'Duplicate audit in manifest');ids.add(a.audit_id);}
 const checked=manifest.audits.map(a=>({a,result:validateAudit(path.join(ROOT,a.folder),options)}));
 const comparisons=checked.map(({a,result:r})=>({audit_id:a.audit_id,label:a.label,source_sha256:r.metadata.source_sha256,...r.counts,...r.precision,macro:r.macro,total_expressed_relations:r.metadata.total_expressed_relations,total_expressed_facts:r.metadata.total_expressed_facts,top_relation_rows:r.metadata.top_relation_rows,corpus_sentences:r.metadata.corpus_sentences,assessment:path.join(a.folder,'assessment.md')}));
 for(const {a}of checked)writeAuditReport(path.join(ROOT,a.folder),options);
 const output={complete:true,unit:'Exact per-run top-20 expressed latent fact census; runs not pooled',runs:comparisons};fs.writeFileSync(path.join(ROOT,'comparison.json'),fmt(output));
 fs.writeFileSync(path.join(ROOT,'comparison.md'),['# Complete NYT census comparison','','[Method](METHOD.md) · [Machine-readable comparison](comparison.json) · [Prior evaluation comparison](prior_comparison.md) · [Changed judgments](judgment_changes.md)','','Every reported run passed full-census validation. S/N and (S+A)/N are exact descriptive fractions under the declared judgments, not confidence intervals. Separate runs are not pooled; these fractions do not measure gold recall or reviewer uncertainty.','','| Run | S | E | A | N | S/N | (S+A)/N | Top-20 rows |','|---|---:|---:|---:|---:|---:|---:|---:|',...comparisons.map(c=>`| [${esc(c.label)}](${c.assessment}) | ${c.S} | ${c.E} | ${c.A} | ${c.N} | ${pct(c.lower)} | ${pct(c.upper)} | ${c.top_relation_rows}/${c.corpus_sentences} |`),''].join('\n'));writePriorComparisons(checked);return output;
}
function compareRowCoverage({manifestFile=path.join(ROOT,'census_manifest.json'),options={}}={}){
 const manifest=json(manifestFile);assert(manifest.audits.length);assert.equal(new Set(manifest.audits.map(a=>a.audit_id)).size,manifest.audits.length,'Duplicate manifest audit');
 // Validate every run before writing any final report; partial work never becomes a complete comparison.
 const checked=manifest.audits.map(a=>({a,result:validateAudit(path.join(ROOT,a.folder),options)}));
 const runs=checked.map(({a,result:r})=>({audit_id:a.audit_id,label:a.label,source_sha256:r.metadata.source_sha256,...scoreCoverage(r),maximum_population:r.counts,assessment:path.join(a.folder,'assessment.md')}));
 for(const {a}of checked)writeAuditReport(path.join(ROOT,a.folder),options);
 const output={complete:true,mode:'sentence_rows',unit:'Exact run-specific expressed ordered fact census at nested row-coverage prefixes; runs not pooled',runs};fs.writeFileSync(path.join(ROOT,'comparison.json'),fmt(output));
 const md=['# Precision at increasing input-row coverage','','[Method](METHOD.md) · [Structured comparison](comparison.json)','','All facts in every requested prefix have valid judgments. Precision endpoints S/N and (S+A)/N treat ambiguity as incorrect or supported; these are exact descriptive fractions, not confidence intervals. Row coverage is not gold-fact recall. Each run has its own inferred fact population.','','| Run | Target | k | Actual row coverage | S | E | A | N | S/N | (S+A)/N |','|---|---|---:|---:|---:|---:|---:|---:|---:|---:|',...runs.flatMap(r=>r.thresholds.map(t=>`| [${esc(r.label)}](${r.assessment}) | [${pct(t.target)}](${path.join(path.dirname(r.assessment),'coverage_'+Math.round(t.target*100)+'.md')}) | ${t.k} | ${t.rows}/${t.total_rows}=${pct(t.achieved_coverage)} | ${t.S} | ${t.E} | ${t.A} | ${t.N} | ${pct(t.lower)} | ${pct(t.upper)} |`)),'','## Preserved previous top20 scores','','| Run | S | E | A | N | S/N | (S+A)/N |','|---|---:|---:|---:|---:|---:|---:|',...runs.map(r=>{const t=r.reference_top20;return `| [${esc(r.label)}](${r.assessment}) | ${t.S} | ${t.E} | ${t.A} | ${t.N} | ${pct(t.lower)} | ${pct(t.upper)} |`; }),'','Each run assessment includes precision in the added relation blocks, per-relation counts, every judged fact, and editable human-review questions.',''];fs.writeFileSync(path.join(ROOT,'comparison.md'),md.join('\n'));return output;
}
function progress(){
 const rows=json(path.join(ROOT,'census_manifest.json')).audits.map(a=>{const d=json(path.join(ROOT,a.folder,'cases.json'));let confirmed=0,provisional=0,blank=0;for(const r of d.relations){const f=json(path.join(ROOT,a.folder,'annotations',r.relation+'.json'));for(const c of f.facts){if(!c.judgment)blank++;else if(c.provisional===true)provisional++;else confirmed++;}}return {audit_id:a.audit_id,label:a.label,N:d.metadata.population_facts,confirmed,provisional,blank};});
 const d={warning:'Workflow counts only; not validated census precision.',runs:rows};fs.writeFileSync(path.join(ROOT,'progress.json'),fmt(d));return d;
}
 const compareAll=selection==='row-coverage'?compareRowCoverage:compareTopRelations;
 return {validateAudit,writeAuditReport,writeThresholdReports,compareAll,progress};
}

/** Preserve the historical experiment-script command line interface. */
export function runReporterCli(reporter,args=process.argv.slice(2)) {
 if(args[0]==='--progress')console.log(fmt(reporter.progress()));
 else if(args.length){
  for(const folder of args){
   const result=reporter.writeAuditReport(folder);
   console.log(JSON.stringify({audit_id:result.metadata.audit_id,...result.counts,...result.precision}));
  }
 }else console.log(fmt(reporter.compareAll()));
}
