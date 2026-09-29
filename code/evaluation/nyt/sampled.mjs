/**
 * Historical NYT stratified-screen protocol, shared by the September 12/14 campaigns.
 * Selection: top relations by assigned rows, then lowest salted SHA256 fact keys.
 * Estimator: relation-population-weighted sample support; not a complete census.
 * Original annotation/protocol schema and hypergeometric/Bonferroni bounds are retained.
 * Campaign paths, retirement policy and historical rendering text are explicit context.
 */
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import crypto from 'node:crypto';
import {parseMap} from './parse_map.mjs';
export {parseMap};
export const SALT = 'nyt-precision-screen-2026-09-12-v1';
const hash=value=>crypto.createHash('sha256').update(value).digest('hex');
const sha256=hash;
const sum=xs=>xs.reduce((a,b)=>a+b,0);
const escape=s=>String(s).replaceAll('&','&amp;').replaceAll('<','&lt;').replaceAll('>','&gt;').replaceAll('|','\\|');

export function selectReview(raw, {perRelation=5,topRelations=20,salt=SALT}={}) {
  const parsed=parseMap(raw),source_sha256=hash(raw);
  const top=parsed.relations.slice(0,topRelations);
  const population_size=top.reduce((n,r)=>n+r.facts.length,0);
  const selected=top.map(r=>{
    const candidates=r.facts.map(c=>({...c,selection_hash:hash([salt,source_sha256,c.relation,c.entity1,c.entity2,c.first_line].join('\0'))}));
    candidates.sort((a,b)=>a.selection_hash.localeCompare(b.selection_hash)||a.case_id.localeCompare(b.case_id));
    const sample=candidates.slice(0,perRelation);
    return {relation:r.relation,rank:r.rank,sentence_count:r.sentence_count,population_facts:r.facts.length,
      sample_facts:sample.length,micro_weight:r.facts.length/population_size,macro_weight:1/top.length,
      selection_fraction:sample.length/r.facts.length,paths:r.paths,facts:sample};
  });
  assert(Math.abs(selected.reduce((n,r)=>n+r.micro_weight,0)-1)<1e-12);
  return {metadata:{source_sha256,selection_salt:salt,selection:'Lowest SHA256(salt, source hash, relation, ordered entity IDs, first source line), all separated by NUL',
    corpus_sentences:parsed.sentence_count,total_expressed_relations:parsed.relation_count,total_expressed_facts:parsed.fact_count,
    top_relations:top.length,per_relation_requested:perRelation,population_facts:population_size,
    sampled_facts:selected.reduce((n,r)=>n+r.sample_facts,0),unit:'Expressed ordered latent fact',
    ranking:'Descending assigned rows; numeric relation ID breaks ties',
    primary_estimator:'sum_r(population_facts_r / population_facts_all * supported_r / sample_facts_r)',
    ambiguity_estimator:'same weights, with (supported_r + ambiguous_r) / sample_facts_r',
    annotations:'Manual only. Do not transfer labels by relation ID or infer them using keywords.'},relations:selected};
}

function writeStable(file,content) {
  if(fs.existsSync(file)) {
    assert.equal(fs.readFileSync(file,'utf8'),content,`Refusing to overwrite changed review artifact ${file}`);
  } else fs.writeFileSync(file,content);
}
function evidenceMarkdown(c) {
  return [`### ${c.case_id}`, '', `**Observed names:** ${c.names.map(n=>`${escape(n.value)} (${n.count})`).join('; ')}`, '',
    `Ordered IDs: ${c.entity1} → ${c.entity2}. Assigned rows: ${c.sentence_count}.`, '',
    '| Source line | Literal first argument | Literal second argument | Full dependency path |','|---:|---|---|---|',
    ...c.evidence.map(e=>`| [${e.line}](../raw_map.tsv:${e.line}) | ${escape(e.arg1)} | ${escape(e.arg2)} | ${escape(e.dependency_path)} |`),''];
}

function logChoose(n,k) {
  if(k<0||k>n)return -Infinity;
  k=Math.min(k,n-k);let value=0;
  for(let i=1;i<=k;i++)value+=Math.log(n-k+i)-Math.log(i);
  return value;
}
function tail(N,K,n,k,upper) {
  let probability=0;
  for(let x=Math.max(0,n-(N-K));x<=Math.min(n,K);x++)
    if(upper?x>=k:x<=k)probability+=Math.exp(logChoose(K,x)+logChoose(N-K,n-x)-logChoose(N,n));
  return probability;
}

// Invert hypergeometric tails for a finite population, counting inclusive tails.
// tailAlpha is the error allocated to EACH of the lower/upper one-sided bounds.
export function finitePopulationBounds(N,n,k,tailAlpha=.025) {
  assert(Number.isInteger(N)&&Number.isInteger(n)&&Number.isInteger(k)&&0<n&&n<=N&&0<=k&&k<=n);
  assert(tailAlpha>0&&tailAlpha<.5);
  let lower=k,upper=N-n+k;
  for(let K=k;K<=N-n+k;K++)if(tail(N,K,n,k,true)>=tailAlpha){lower=K;break;}
  for(let K=N-n+k;K>=k;K--)if(tail(N,K,n,k,false)>=tailAlpha){upper=K;break;}
  return {lower_count:lower,upper_count:upper,lower:lower/N,upper:upper/N};
}

export function summarizeStrata(strata) {
  const H=strata.length,N=sum(strata.map(s=>s.population_facts));
  assert(H>0&&N>0);
  const tailAlpha=.05/(2*H);
  const rs=strata.map(s=>{
    const {population_facts:Nr,sample_facts:n,supported:S,incorrect:E,ambiguous:A}=s;
    assert.equal(S+E+A,n);assert(n<=Nr);
    const lower=S/n,upper=(S+A)/n,w=Nr/N;
    const variance=p=>n===Nr?0:(n<=1?null:w*w*(1-n/Nr)*p*(1-p)/(n-1));
    return {...s,micro_weight:w,macro_weight:1/H,lower,upper,
      lower_variance_component:variance(lower),upper_variance_component:variance(upper),
      strict_population_bounds:finitePopulationBounds(Nr,n,S,tailAlpha),
      optimistic_population_bounds:finitePopulationBounds(Nr,n,S+A,tailAlpha)};
  });
  const variance=key=>rs.some(r=>r[key]===null)?null:sum(rs.map(r=>r[key]));
  const lowVar=variance('lower_variance_component'),upVar=variance('upper_variance_component');
  return {population_facts:N,sampled_facts:sum(rs.map(r=>r.sample_facts)),relations:H,
    sample_counts:{supported:sum(rs.map(r=>r.supported)),incorrect:sum(rs.map(r=>r.incorrect)),ambiguous:sum(rs.map(r=>r.ambiguous))},
    micro:{lower:sum(rs.map(r=>r.micro_weight*r.lower)),upper:sum(rs.map(r=>r.micro_weight*r.upper))},
    macro:{lower:sum(rs.map(r=>r.lower))/H,upper:sum(rs.map(r=>r.upper))/H},
    exploratory_design_se:{lower:lowVar===null?null:Math.sqrt(lowVar),upper:upVar===null?null:Math.sqrt(upVar),
      limitation:'Plug-in finite-population stratified SE; n=5 strata can yield zero sample variance despite genuine uncertainty. Do not construct a Wald CI from this alone.'},
    conservative_sampling_bounds:{confidence:.95,tail_alpha_per_stratum_bound:tailAlpha,
      strict_lower:sum(rs.map(r=>r.micro_weight*r.strict_population_bounds.lower)),
      strict_upper:sum(rs.map(r=>r.micro_weight*r.strict_population_bounds.upper)),
      optimistic_lower:sum(rs.map(r=>r.micro_weight*r.optimistic_population_bounds.lower)),
      optimistic_upper:sum(rs.map(r=>r.micro_weight*r.optimistic_population_bounds.upper)),
      explanation:'Finite-population hypergeometric inversion; each endpoint interval uses Bonferroni across 20 strata. The strict lower and optimistic upper together also give a conservative 95% envelope covering sampling uncertainty plus ambiguity endpoints. Wide bounds are intentional. Coverage concerns the random sample of this saved run, conditional on fixed case judgments, not run-to-run randomness or reviewer validity.'},
    strata:rs};
}


export function createSampledEvaluator({experiment,retiredAuditIds=[],selection={},indexText={}}) {
  experiment=path.resolve(experiment);
  const root=experiment,read=p=>JSON.parse(fs.readFileSync(path.join(root,p),'utf8'));
function prepareRun(runPath) {
  const absolute=path.resolve(runPath);
  assert(absolute.startsWith(experiment+path.sep),'Run must be inside this isolated investigation');
  const candidate=fs.statSync(absolute).isDirectory()?path.join(absolute,'map_world_sentences.tsv'):absolute;
  const source=fs.existsSync(candidate)?candidate:path.join(absolute,'output/map_world_sentences.tsv');
  assert(fs.existsSync(source),`MAP file missing for ${runPath}`);
  const runDirectory=fs.statSync(absolute).isDirectory()?absolute:path.dirname(absolute);
  const runManifest=JSON.parse(fs.readFileSync(path.join(runDirectory,'run.json'),'utf8'));
  assert(['completed','complete'].includes(runManifest.status),`Refusing to sample a run whose manifest status is ${runManifest.status}`);
  const raw=fs.readFileSync(source,'utf8'),review=selectReview(raw,selection);
  const auditId='audit_'+hash(path.relative(experiment,source)+'\0'+review.metadata.source_sha256).slice(0,10);
  assert(!retiredAuditIds.includes(auditId),'Evaluation retired: this saved run used the active entity-multiplicity defect; raw outputs remain preserved.');
  const root=path.join(experiment,'manual_review'),out=path.join(root,auditId);
  fs.mkdirSync(path.join(out,'relations'),{recursive:true});fs.mkdirSync(path.join(out,'annotations'),{recursive:true});
  const protocol=path.join(experiment,'analysis/manual_protocol.md');
  review.metadata.audit_id=auditId;
  review.metadata.protocol_sha256=hash(fs.readFileSync(protocol));
  review.metadata.copied_source='raw_map.tsv';
  writeStable(path.join(out,'raw_map.tsv'),raw);
  writeStable(path.join(out,'cases.json'),JSON.stringify(review,null,2)+'\n');
  for(const r of review.relations) {
    const md=[`# ${auditId} — ${r.relation}`, '',
      `Relation rank ${r.rank}; ${r.sentence_count} assigned rows; **${r.population_facts} expressed facts; ${r.sample_facts} sampled**. Micro weight: ${r.micro_weight.toFixed(10)}.`, '',
      '**Choose and record a directional predicate from the dictionary before grading the five sampled facts.** Keep competing meanings visible. See [protocol](../../../analysis/manual_protocol.md).', '',
      '## Complete dependency-path dictionary', '', '| Count | Dependency path |','|---:|---|',
      ...r.paths.map(p=>`| ${p.count} | ${escape(p.value)} |`),'',
      '## Selected facts, in fixed random order', '',...r.facts.flatMap(evidenceMarkdown)];
    writeStable(path.join(out,'relations',r.relation+'.md'),md.join('\n'));
    const annotations={relation:r.relation,label:'',definition:'',scope_notes:'',
      facts:r.facts.map(c=>({case_id:c.case_id,judgment:'',reason:'',evidence_lines:[],issue_tags:[],reviewer_question:''}))};
    const annotationFile=path.join(out,'annotations',r.relation+'.json');
    if(!fs.existsSync(annotationFile))fs.writeFileSync(annotationFile,JSON.stringify(annotations,null,2)+'\n');
  }
  const index=[`# Manual screening sample ${auditId}`, '',
    `[Protocol](../../analysis/manual_protocol.md) · [Complete structured evidence](cases.json) · [Copied original MAP rows](raw_map.tsv)`, '',
    `Sample: **${review.metadata.sampled_facts} facts from ${review.metadata.top_relations} relations**, population ${review.metadata.population_facts} expressed facts. Every selected case is unjudged at extraction. Configuration names are held in the separate unblinding manifest.`, '',
    'The primary estimator weights each relation by its complete fact count. The raw fraction of supported sample cases is a macro-like estimate under equal allocation; it is not automatically micro precision. Keep ambiguous cases in the denominator. Five cases per stratum provide limited statistical precision.', '',
    '| Rank | Relation evidence | Population facts | Sample | Micro weight | Annotation file |','|---:|---|---:|---:|---:|---|',
    ...review.relations.map(r=>`| ${r.rank} | [${r.relation}](relations/${r.relation}.md) | ${r.population_facts} | ${r.sample_facts} | ${r.micro_weight.toFixed(6)} | [JSON](annotations/${r.relation}.json) |`),''];
  writeStable(path.join(out,'README.md'),index.join('\n'));
  const manifestFile=path.join(root,'unblinding.json');
  const manifest=fs.existsSync(manifestFile)?JSON.parse(fs.readFileSync(manifestFile,'utf8')):{warning:'Contains variant/run identities. Keep outside the manual grading workflow where feasible.',audits:[]};
  const entry={audit_id:auditId,source:path.relative(experiment,source),source_sha256:review.metadata.source_sha256,
    protocol_sha256:review.metadata.protocol_sha256,population_facts:review.metadata.population_facts,sampled_facts:review.metadata.sampled_facts};
  const previous=manifest.audits.find(a=>a.audit_id===auditId);
  if(previous) assert.deepEqual(previous,entry);else manifest.audits.push(entry);
  manifest.audits.sort((a,b)=>a.audit_id.localeCompare(b.audit_id));
  fs.writeFileSync(manifestFile,JSON.stringify(manifest,null,2)+'\n');
  return {audit_id:auditId,folder:path.relative(experiment,out),sampled_facts:review.metadata.sampled_facts,population_facts:review.metadata.population_facts};
}
function evaluateAudit(folder) {
  const absolute=path.resolve(folder);
  assert(absolute.startsWith(path.join(experiment,'manual_review')+path.sep),'Audit must be inside this investigation manual_review folder');
  const casesFile=path.join(absolute,'cases.json'),rawFile=path.join(absolute,'raw_map.tsv');
  const cases=JSON.parse(fs.readFileSync(casesFile,'utf8'));
  assert.equal(sha256(fs.readFileSync(rawFile)),cases.metadata.source_sha256,'Copied MAP changed since selection');
  assert.equal(sha256(fs.readFileSync(path.join(experiment,'analysis/manual_protocol.md'))),cases.metadata.protocol_sha256,'Protocol changed since selection; review amendment explicitly before resuming');
  const judgments=[],strata=[];
  for(const relation of cases.relations) {
    const annotationFile=path.join(absolute,'annotations',relation.relation+'.json');
    const a=JSON.parse(fs.readFileSync(annotationFile,'utf8'));
    assert.equal(a.relation,relation.relation);
    for(const key of ['label','definition','scope_notes'])assert(typeof a[key]==='string'&&a[key].trim().length>0,`${a.relation}: missing ${key}`);
    assert.equal(a.facts.length,relation.sample_facts,`${a.relation}: wrong number of annotation cases`);
    assert.equal(new Set(a.facts.map(c=>c.case_id)).size,a.facts.length,`${a.relation}: duplicate judgments`);
    const selected=new Map(relation.facts.map(c=>[c.case_id,c]));
    const counts={supported:0,incorrect:0,ambiguous:0};
    for(const j of a.facts) {
      const c=selected.get(j.case_id);assert(c,`Unselected case ${j.case_id}`);
      assert(['supported','incorrect','ambiguous'].includes(j.judgment),`${j.case_id}: judgment missing/invalid`);
      assert(typeof j.reason==='string'&&j.reason.trim().length>0,`${j.case_id}: reason missing`);
      assert(Array.isArray(j.evidence_lines)&&j.evidence_lines.length>0,`${j.case_id}: citations missing`);
      assert(j.evidence_lines.every(line=>Number.isInteger(line)&&c.source_lines.includes(line)),`${j.case_id}: cites a line outside its evidence`);
      assert(Array.isArray(j.issue_tags),`${j.case_id}: issue_tags must be an array`);
      if(j.judgment==='ambiguous')assert(typeof j.reviewer_question==='string'&&j.reviewer_question.trim().length>0,`${j.case_id}: ambiguity requires a reviewer question`);
      counts[j.judgment]++;
      judgments.push({...c,judgment:j.judgment,reason:j.reason,evidence_lines:j.evidence_lines,
        issue_tags:j.issue_tags,reviewer_question:j.reviewer_question??'',predicate:a.label,definition:a.definition});
    }
    strata.push({relation:relation.relation,rank:relation.rank,label:a.label,definition:a.definition,scope_notes:a.scope_notes,
      population_facts:relation.population_facts,sample_facts:relation.sample_facts,...counts});
  }
  assert.equal(judgments.length,cases.metadata.sampled_facts);
  const result={audit_id:cases.metadata.audit_id,source_sha256:cases.metadata.source_sha256,
    cases_sha256:sha256(fs.readFileSync(casesFile)),protocol_sha256:cases.metadata.protocol_sha256,
    ...summarizeStrata(strata),facts:judgments};
  const percent=n=>(100*n).toFixed(1)+'%',range=(l,u)=>`${percent(l)}–${percent(u)}`;
  const escape=s=>s.replaceAll('|','\\|').replaceAll('\n',' ');
  const lines=[`# Manual precision screen: ${result.audit_id}`,'',
    '[Sample index](README.md) · [Structured assessment](assessment.json) · [Review protocol](../../analysis/manual_protocol.md)','',
    `**Estimated micro precision: ${range(result.micro.lower,result.micro.upper)}**, counting ambiguous cases first as incorrect and then as supported. This is an ambiguity range of estimates, not a confidence interval.`, '',
    `Sample counts: ${result.sample_counts.supported} supported, ${result.sample_counts.incorrect} incorrect, ${result.sample_counts.ambiguous} ambiguous; ${result.sampled_facts} assessed out of ${result.population_facts} facts. The estimate weights each relation by its total fact population; raw sample counts are not the micro denominator.`, '',
    `Macro precision estimate: ${range(result.macro.lower,result.macro.upper)}.`, '',
    `Conservative 95% finite-population sampling interval for the strict endpoint: **${range(result.conservative_sampling_bounds.strict_lower,result.conservative_sampling_bounds.strict_upper)}**; for the optimistic endpoint: **${range(result.conservative_sampling_bounds.optimistic_lower,result.conservative_sampling_bounds.optimistic_upper)}**. The envelope ${range(result.conservative_sampling_bounds.strict_lower,result.conservative_sampling_bounds.optimistic_upper)} includes both sampling uncertainty and the two ambiguity treatments. These deliberately wide bounds use hypergeometric inversion per stratum and Bonferroni correction. They do not cover variation between sampler seeds or errors in manual judgment.`, '',
    `Exploratory plug-in design SE: ${result.exploratory_design_se.lower===null?'undefined':percent(result.exploratory_design_se.lower)} strict, ${result.exploratory_design_se.upper===null?'undefined':percent(result.exploratory_design_se.upper)} optimistic. With only five cases per relation this can understate uncertainty; no Wald confidence interval is claimed.`, '',
    '| Rank | Relation / chosen predicate | Population | Sample S/E/A | Micro weight | Sample support range |',
    '|---:|---|---:|---:|---:|---:|',
    ...result.strata.map(s=>`| ${s.rank} | [${s.relation}](relations/${s.relation}.md): ${escape(s.label)} | ${s.population_facts} | ${s.supported}/${s.incorrect}/${s.ambiguous} | ${s.micro_weight.toFixed(4)} | ${range(s.lower,s.upper)} |`),'',
    '## Ambiguous cases for inspection','',
    ...judgments.filter(c=>c.judgment==='ambiguous').flatMap(c=>[`- [${c.case_id}](relations/${c.relation}.md): ${c.reviewer_question}`]),'',
    'Every sampled case has a manual judgment, reason and citations restricted to its own evidence. The input MAP hash, unchanged protocol hash, exact case coverage and stratum weights were checked. Predicate definitions and scope notes are in the structured assessment and annotation files.',''];
  return {result,markdown:lines.join('\n'),summary:{audit_id:result.audit_id,population_facts:result.population_facts,sampled_facts:result.sampled_facts,
    sample_counts:result.sample_counts,micro:result.micro,macro:result.macro,conservative_sampling_bounds:result.conservative_sampling_bounds}};
}
  function reportAudit(folder,{outputDirectory=folder}={}) {
    const {result,markdown,summary}=evaluateAudit(folder);
    const output=path.resolve(outputDirectory);
    fs.mkdirSync(output,{recursive:true});
    fs.writeFileSync(path.join(output,'assessment.json'),JSON.stringify(result,null,2)+'\n');
    fs.writeFileSync(path.join(output,'assessment.md'),markdown);
    return summary;
  }
  function renderReviewIndex() {
const unblind=read('manual_review/unblinding.json');let md='# NYT manual comparison and user inspection\n\nThis index reveals experiment identities. The individual audit folders were prepared under content-derived IDs to keep condition names out of the grading workflow where feasible. These are assistant evidence-based assessments for user review, not independent human labels or the paper’s unavailable ground truth.\n\nEvery audit contains '+(indexText.populationPhrase??'all20full')+' relation dictionaries and five sampled facts per relation (100 total), with each fact’s complete observed evidence. A single directional predicate and scope notes are declared per relation. `annotations/rel_*.json` contains the editable judgments and exact source row numbers; `assessment.md` gives the computed weighted precision and population counts.\n\nThe two precision endpoints count ambiguous facts as incorrect/correct. They are not confidence limits. The random-sample uncertainty is separate and can be large. Compare coverage and full population sizes as well as percentages.\n\n| Run | Audit and cases | Computed assessment | Sample S / E / A | Weighted precision |\n|---|---|---|---|---|\n';
let questions='# Ambiguous cases for user adjudication\n\nThese questions preserve the original assistant judgment and its evidence; they have not been resolved by assuming favorable answers. Follow each audit link for the full dictionary and predicate definition. '+(indexText.lineNumberDescription??'Row numbers refer to the unchanged corpus/MAP order, starting at1after the TSV header.')+' This file does not include every possible disagreement with the declared predicates; scope caveats for mixed clusters remain in each relation annotation.\n\n';
let complete=0,counts={supported:0,incorrect:0,ambiguous:0},scopes='# Predicate scope and reviewer caveats\n\nRelation discovery requires choosing what one cluster means before judging its facts. This can materially affect a score when a dictionary combines different meanings. The records below preserve all declared labels, definitions and scope notes, including competing interpretations; they are not an instruction to credit their union. Multiple assistant reviewers used the same protocol but have no independently calibrated human agreement score. A reviewer’s choice among near-tied meanings is a source of uncertainty beyond random sampling and the S/E/A endpoints.\n\n';
for(const a of [...unblind.audits].sort((a,b)=>a.source.localeCompare(b.source))){const run=a.source.split('/')[1],p='manual_review/'+a.audit_id,exists=fs.existsSync(path.join(root,p,'assessment.json'));let r=exists?read(p+'/assessment.json'):null;if(r){complete++;for(const k of Object.keys(counts))counts[k]+=r.sample_counts[k];}const pct=x=>(x*100).toFixed(2)+'%';md+=`| ${run} | [${a.audit_id}](${a.audit_id}/README.md) | ${r?'[assessment]('+a.audit_id+'/assessment.md)':'pending'} | ${r?[r.sample_counts.supported,r.sample_counts.incorrect,r.sample_counts.ambiguous].join(' / '):'pending'} | ${r?pct(r.micro.lower)+'–'+pct(r.micro.upper):'pending'} |\n`;
 const d=read(p+'/cases.json');let q=[];scopes+='## '+run+' — '+a.audit_id+'\n\n';
 for(const rel of d.relations){const ann=read(p+'/annotations/'+rel.relation+'.json');scopes+=`- **${rel.relation} (${ann.label||'pending'}):** ${ann.definition||'pending'} Scope: ${ann.scope_notes||'pending'} [Annotation](../${p}/annotations/${rel.relation}.json).\n`;
 for(const f of ann.facts){if(f.judgment==='ambiguous')q.push(`### ${f.case_id}\n\nPredicate: ${ann.label}. ${ann.definition}\n\n${f.reason}\n\n**Question:** ${f.reviewer_question}\n\nSource rows: ${f.evidence_lines.join(', ')}. [Editable annotation](../${p}/annotations/${rel.relation}.json). [Full case folder](../${p}/README.md).\n\n`);}}
 if(q.length)questions+='## '+run+' — '+a.audit_id+'\n\n'+q.join('');scopes+='\n';}
md+='\nCompleted assessments: **'+complete+' of '+unblind.audits.length+'**; '+Object.values(counts).reduce((a,b)=>a+b,0)+' judgments across completed runs ('+counts.supported+' supported, '+counts.incorrect+' incorrect, '+counts.ambiguous+' ambiguous). These totals are bookkeeping, not pooled precision across different models.\n\n[All ambiguity questions](../analysis/ambiguities_for_user.md) and [all predicate scope notes](../analysis/predicate_scope_notes.md) are collected separately for inspection.\n\nTo revise a judgment, edit its annotation JSON and rerun `node scripts/report_manual_samples.mjs manual_review/AUDIT_ID`, then `node scripts/summarize_experiments.mjs` and `node scripts/build_review_index.mjs` from the investigation directory. Keep original copies if comparing adjudication versions. The reporter validates case coverage, evidence line membership, scope declarations, questions for ambiguous cases, and source/protocol hashes.\n';

    return {files:{'manual_review/README.md':md,'analysis/ambiguities_for_user.md':questions,
      'analysis/predicate_scope_notes.md':scopes},summary:{complete,total:unblind.audits.length,counts}};
  }
  function buildReviewIndex({outputDirectory=root}={}) {
    const result=renderReviewIndex();
    for(const [relative,content] of Object.entries(result.files)) {
      const file=path.join(outputDirectory,relative);
      fs.mkdirSync(path.dirname(file),{recursive:true});fs.writeFileSync(file,content);
    }
    return result.summary;
  }
  return {selectReview:(raw,options={})=>selectReview(raw,{...selection,...options}),
    prepareRun,evaluateAudit,reportAudit,renderReviewIndex,buildReviewIndex};
}
