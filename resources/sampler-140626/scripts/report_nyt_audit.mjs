import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';

const sampler=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const dir=path.join(sampler,'results/nyt-2026/evaluation');
const read=p=>JSON.parse(fs.readFileSync(p,'utf8'));
const write=(name,s)=>fs.writeFileSync(path.join(dir,name),s);
const json=(name,o)=>write(name,JSON.stringify(o,null,2)+'\n');
const {metadata,cases}=read(path.join(dir,'cases.json'));
const raw=fs.readFileSync(path.join(dir,metadata.source));
if(crypto.createHash('sha256').update(raw).digest('hex')!==metadata.source_sha256)throw Error('Source changed: regenerate and re-audit before reporting.');
const byId=new Map(cases.map(c=>[c.case_id,c]));
const ids=[...metadata.top20,'rel_80'];
const allowed=['supported','incorrect','ambiguous'];
const annotations=ids.map(id=>read(path.join(dir,'annotations',id+'.json')));
const seen=new Set();
for(const a of annotations){
  if(!ids.includes(a.relation)||!a.label||!a.definition||!a.scope_notes)throw Error('Incomplete relation definition');
  for(const f of a.facts){
    const c=byId.get(f.case_id);
    if(!c||c.relation!==a.relation||seen.has(f.case_id))throw Error('Invalid/duplicate case '+f.case_id);
    if(!allowed.includes(f.judgment)||!f.reason||!Array.isArray(f.issue_tags))throw Error('Invalid annotation '+f.case_id);
    if(!f.evidence_lines?.length||f.evidence_lines.some(l=>!c.source_lines.includes(l)))throw Error('Invalid evidence lines '+f.case_id);
    if(f.judgment==='ambiguous'&&!f.reviewer_question?.trim())throw Error('Missing reviewer question '+f.case_id);
    seen.add(f.case_id);
  }
}
if(seen.size!==cases.length)throw Error(`Incomplete audit ${seen.size}/${cases.length}`);
const reviewPath=path.join(dir,'human_review.json');
const existing=fs.existsSync(reviewPath)?read(reviewPath):{instructions:'Set judgment to supported, incorrect, or ambiguous; leave blank to retain the assistant judgment. Add notes and your name/date. Do not change case_id. Every case can be overridden. Rebuild reports with node scripts/report_nyt_audit.mjs from the sampler directory.',reviews:[]};
const overrides=new Map();
for(const r of existing.reviews){
  if(!byId.has(r.case_id)||overrides.has(r.case_id)||r.judgment&&!allowed.includes(r.judgment))throw Error('Invalid human review '+r.case_id);
  overrides.set(r.case_id,r);
}
const joined=annotations.flatMap(a=>a.facts.map(f=>{
  const h=overrides.get(f.case_id);
  return {...byId.get(f.case_id),label:a.label,definition:a.definition,assistant:f,human:h||null,judgment:h?.judgment||f.judgment,judgment_source:h?.judgment?'human':'assistant'};
}));
const pct=x=>Number.isFinite(x)?(100*x).toFixed(1)+'%':'—';
const escape=s=>String(s??'').replaceAll('|','&#124;').replaceAll('\n',' ');
const stats=cs=>{
  const n=cs.length,s=cs.filter(c=>c.judgment==='supported').length,e=cs.filter(c=>c.judgment==='incorrect').length,a=n-s-e;
  return {n,supported:s,incorrect:e,ambiguous:a,lower:s/n,upper:(s+a)/n,decided_precision:s/(s+e),decided_coverage:(s+e)/n,human_overrides:cs.filter(c=>c.judgment_source==='human').length};
};
const rows=raw.toString().trimEnd().split('\n').slice(1).map((line,i)=>{
  const [relation,entity1,entity2,arg1,arg2,dependency_path]=line.split('\t');
  return {relation,entity1,entity2,arg1,arg2,dependency_path,line:i+2};
});
const total=stats(joined.filter(c=>c.rank));
const perRelation=annotations.map(a=>({relation:a.relation,label:a.label,definition:a.definition,scope_notes:a.scope_notes,...stats(joined.filter(c=>c.relation===a.relation)),sentences:rows.filter(r=>r.relation===a.relation).length}));
const range=s=>`${pct(s.lower)}–${pct(s.upper)}`;
write('predicate_choices.md',`# Relation meanings used in this audit\n\n[Audit index](README.md) · [Method](METHOD.md)\n\nThese definitions are evaluator choices inferred from dominant paths, not labels emitted by the sampler or supplied by the paper. Review them before interpreting the aggregate. Changing a definition requires re-evaluating that relation's facts; it cannot be implemented by simply changing its label.\n\nIn particular, rel_399 and rel_330 use leadership abstractions, rel_294 requires chairmanship, rel_365 requires an analyst role, and rel_92 explicitly combines president/manager roles. Sports opponent defeat is separated from winning an award/championship and from playing for a team. A broad employment or sports-association rubric would produce different results. No single natural-language naming of every mixed cluster is uniquely determined by the saved state.\n\n${annotations.map(a=>`## ${a.relation}: ${a.label}\n\n**Predicate:** ${a.definition}\n\n${typeof a.scope_notes==='string'?a.scope_notes:JSON.stringify(a.scope_notes)}\n\n[Inspect all facts](relations/${a.relation}.md)\n`).join('\n')}`);
const sourceLink=line=>`[TSV:${line}](../map_world_sentences.tsv#L${line})`;
const factSection=(c,review=false)=>{
  const f=c.assistant;
  const reviewQuestion=c.human?.question||f.reviewer_question||(c.judgment==='ambiguous'?`Does the evidence for ${c.names.map(n=>n.value).join('; ')} support “${c.definition}”? Record the unresolved issue and your decision.`:'');
  return `### ${c.case_id}\n\n**${c.names.map(n=>escape(n.value)+` (${n.count})`).join('; ')}**\n\nPredicate: ${c.definition}\n\nJudgment: **${c.judgment}** (${c.judgment_source}); ${c.sentence_count} sentence rows.\n\n**Assistant rationale (original judgment: ${f.judgment}):** ${f.reason}\n\n${f.issue_tags.length?'Issues: '+f.issue_tags.join(', ')+'.\n\n':''}${reviewQuestion?'**Review question:** '+reviewQuestion+'\n\n':''}${c.human?.judgment?'Human override: '+c.human.judgment+'. '+(c.human.notes||'')+'\n\n':''}${review?'Human decision: __________  Notes: __________\n\n':''}Evidence cited by evaluator: ${f.evidence_lines.map(sourceLink).join(', ')}.\n\n<details>\n<summary>All assigned rows and dependency paths</summary>\n\n| TSV line | First entity name | Second entity name | Dependency path |\n|---:|---|---|---|\n${c.evidence.map(e=>`| ${sourceLink(e.line)} | ${escape(e.arg1)} | ${escape(e.arg2)} | ${escape(e.dependency_path)} |`).join('\n')}\n\n</details>\n`;
};
fs.mkdirSync(path.join(dir,'relations'),{recursive:true});
for(const a of annotations){
  const cs=joined.filter(c=>c.relation===a.relation),s=stats(cs);
  // These reports sit one directory deeper than the review queue.
  const body=`# ${a.relation}: ${a.label}\n\n[Audit index](../README.md) · [Method](../METHOD.md)\n\n**Predicate:** ${a.definition}\n\n${typeof a.scope_notes==='string'?a.scope_notes:JSON.stringify(a.scope_notes)}\n\n${s.n} facts: ${s.supported} supported, ${s.incorrect} incorrect, ${s.ambiguous} ambiguous. Audit ambiguity range: **${range(s)}**. Decided-only: ${pct(s.decided_precision)} at ${pct(s.decided_coverage)} coverage. Human overrides: ${s.human_overrides}.\n\nThese are corpus-evidence judgments, not independently verified historical truth. A supported fact may contain unrelated assigned sentences.\n\n${cs.map(c=>factSection(c)).join('\n')}`;
  write(`relations/${a.relation}.md`,body.replaceAll('(../map_world_sentences.tsv','(../../map_world_sentences.tsv'));
}
const unresolved=joined.filter(c=>c.judgment==='ambiguous');
write('ambiguous_cases.md',`# Cases needing human review\n\n[Audit index](README.md) · [Method](METHOD.md)\n\n${unresolved.length} unresolved facts (${unresolved.filter(c=>c.rank).length} in the top 20; ${unresolved.filter(c=>!c.rank).length} additional rel_80 facts). Each case includes a specific question and all supplied rows. Names and paths may be truncated or malformed; most rows do not include the original full sentence.\n\nFor machine-readable corrections, edit the matching entry in [human_review.json](human_review.json), then regenerate the reports. Written notes here are for inspection; the generator does not parse them and will replace this Markdown file. Every supported/incorrect case can also be overridden in the JSON.\n\n${unresolved.map(c=>factSection(c,true)).join('\n')}`);
const humanReviews=joined.map(c=>({case_id:c.case_id,relation:c.relation,names:c.names.map(n=>n.value),judgment:'',notes:'',reviewer:'',reviewed_at:'',...overrides.get(c.case_id),assistant_judgment:c.assistant.judgment,assistant_question:c.assistant.reviewer_question,question:overrides.get(c.case_id)?.question||c.assistant.reviewer_question}));
json('human_review.json',{...existing,reviews:humanReviews});
json('evaluations.json',{metadata,method:'METHOD.md',top20:total,relations:perRelation,facts:joined});

// Explicit transcription and expansion of the paper's 16 shorthand paths.
const shorthand=[
'appos|->unit->prep->of->|pobj','appos|->part->prep->of->|pobj','nn|<-unit->prep->of->|pobj',
'partmod|->own->prep->by->|pobj','rcmod|->own->prep->by->|pobj','appos|->subsidiary->prep->of->|pobj',
'rcmod|->part->prep->of->|pobj','rcmod|->unit->prep->of->|pobj','poss|<-parent->|appos',
'appos|->division->prep->of->|pobj','pobj|<-of<-prep<-office->appos->part->prep->of->|pobj',
'pobj|<-of<-prep<-unit->appos->part->prep->of->|pobj','nn|<-division->prep->of->|pobj',
'appos|->unit->|nn','nsubjpass|<-own->prep->by->|pobj','nn|<-office->prep->of->|pobj'];
const paperPaths=shorthand.map(p=>{
  const [left,middle,right]=p.split('|');
  const expanded=`${left}|${middle.slice(0,2)}${left}${middle}${right}${middle.slice(-2)}|${right}`;
  const rr=rows.filter(r=>r.dependency_path===expanded);
  return {paper:p,expanded,total:rr.length,rel_325:rr.filter(r=>r.relation==='rel_325').length,rel_80:rr.filter(r=>r.relation==='rel_80').length,elsewhere:rr.filter(r=>!['rel_325','rel_80'].includes(r.relation)).length};
});
json('paper_path_comparison.json',paperPaths);
const pathTotal=paperPaths.reduce((s,p)=>s+p.total,0),mainPaths=paperPaths.reduce((s,p)=>s+p.rel_325,0),extraPaths=paperPaths.reduce((s,p)=>s+p.rel_80,0);
const main=perRelation.find(r=>r.relation==='rel_325'),extra=perRelation.find(r=>r.relation==='rel_80');
const entities=id=>new Set(rows.filter(r=>r.relation===id).map(r=>r.entity1+'\t'+r.entity2));
const lexical=id=>new Set(rows.filter(r=>r.relation===id).map(r=>r.arg1+'\t'+r.arg2));
const intersection=(a,b)=>[...a].filter(x=>b.has(x)).length;
const examplePairs=[['BBDO Worldwide','Omnicom Group'],['Fox','News Corporation']].map(([a,b])=>{
  const rr=rows.filter(r=>r.arg1===a&&r.arg2===b),freq={};for(const r of rr)freq[r.relation]=(freq[r.relation]||0)+1;
  return `| ${a} → ${b} | ${rr.length} | ${Object.entries(freq).sort((a,b)=>b[1]-a[1]).map(([r,n])=>r+': '+n).join('; ')} |`;
}).join('\n');
write('subsidiary_audit.md',`# Subsidiary cluster audit\n\n[Audit index](README.md) · [All rel_325 facts](relations/rel_325.md) · [All rel_80 facts](relations/rel_80.md) · [Human review queue](ambiguous_cases.md)\n\nThe saved world recovers a clear corporate ownership core, but splits it across clusters and includes unrelated facts. We audit **X is a subsidiary, division, or organizational unit of Y**. This is broader than legal incorporation; office metonymy is left unresolved.\n\n| Quantity | Main rel_325 | Secondary rel_80 |\n|---|---:|---:|\n| Assigned sentence rows | ${main.sentences} | ${extra.sentences} |\n| Distinct surface-name pairs | ${lexical('rel_325').size} | ${lexical('rel_80').size} |\n| Expressed latent facts | ${main.n} | ${extra.n} |\n| Supported | ${main.supported} | ${extra.supported} |\n| Incorrect | ${main.incorrect} | ${extra.incorrect} |\n| Ambiguous | ${main.ambiguous} | ${extra.ambiguous} |\n| Operational ambiguity range | ${range(main)} | ${range(extra)} |\n| Decided-only rate | ${pct(main.decided_precision)} | ${pct(extra.decided_precision)} |\n| Decided coverage | ${pct(main.decided_coverage)} | ${pct(extra.decided_coverage)} |\n\nThe two relations share ${intersection(lexical('rel_325'),lexical('rel_80'))} surface pairs and ${intersection(entities('rel_325'),entities('rel_80'))} latent entity pairs. Their 79 relation-specific facts are not 79 distinct corporate propositions. The paper's **60 facts** is a model output, not a gold recall denominator. Our 52 are expressed facts; per-cluster unexpressed facts are unavailable.\n\nClear mismatches include Steven A. Wood → Bank of America (director-at, TSV 518), Mr. Gorbachev → Reagan (meeting/talks, 8284 and five other rows), and General Electric → NBC (reverse ownership, 5982). Ambiguities include New York → BBDO Worldwide (office metonymy), Lorillard/Loews sharing entity IDs with Sanford C. Miller/Valley Hospital, and Hughes/General Motors mixing subsidiary and executive evidence.\n\n## Published examples and fragmentation\n\n| Surface pair | Corpus rows | Current assignments |\n|---|---:|---|\n${examplePairs}\n\n## Comparison with the paper's displayed dependency paths\n\nThe [paper](../../../../russell-2016-the-physics-of-text.pdf), Section 4, prints 16 paths for relation 46. The table below makes endpoint-label expansion explicit. It is a normalized transcription, not a character-for-character claim about PDF typography. All 16 occur in rel_325; ${paperPaths.filter(p=>p.rel_80>0).length} occur in rel_80.\n\nOf ${pathTotal} corpus rows using these exact expanded paths, ${mainPaths} (${pct(mainPaths/pathTotal)}) are in rel_325 and ${extraPaths} (${pct(extraPaths/pathTotal)}) in rel_80. Combined coverage is ${pct((mainPaths+extraPaths)/pathTotal)}. **This path-selected coverage is neither semantic precision nor recall over all subsidiary facts.**\n\n| Paper shorthand | Exact expanded corpus path | All rows | rel_325 | rel_80 | Elsewhere |\n|---|---|---:|---:|---:|---:|\n${paperPaths.map(p=>`| ${escape(p.paper)} | ${escape(p.expanded)} | ${p.total} | ${p.rel_325} | ${p.rel_80} | ${p.elsewhere} |`).join('\n')}\n\nThe earlier CHANGES counts 231/64 use a broader path selection and should not be substituted for this explicit 16-path comparison. The paper does not publish the complete subsidiary fact set, so exact fact overlap and partition distance to that run cannot be computed.\n`);

const table=perRelation.filter(r=>metadata.top20.includes(r.relation)).map((r,i)=>`| ${i+1} | [${r.relation}](relations/${r.relation}.md) | ${escape(r.label)} | ${r.sentences} | ${r.n} | ${r.supported} | ${r.incorrect} | ${r.ambiguous} | ${range(r)} |`).join('\n');
write('README.md',`# NYT replication: top-20 audit and archive comparison\n\nCompleted first-pass assistant audit of **all ${total.n} expressed latent facts** in the 20 largest MAP relations (${metadata.top20_sentences} sentence rows), plus ${extra.n} facts in the secondary subsidiary cluster. Human overrides applied: **${total.human_overrides}** in the top 20.\n\n**Top 20: ${total.supported} supported, ${total.incorrect} incorrect, ${total.ambiguous} ambiguous.** Under the stated corpus-evidence rubric, this gives an ambiguity range of **${range(total)}**. The decided-only rate is **${pct(total.decided_precision)}**, with **${pct(total.decided_coverage)}** of facts decided. These are fact-weighted results; rel_80 is excluded.\n\nThis does not establish the paper's roughly 95% manual precision. The paper's full labels and annotation rules are unavailable, our judgments use dependency triples rather than independent historical verification, and the rubric's predicate granularity matters. The range assigns all unresolved cases first to failures and then to successes; it is not a confidence interval or a bound on historical truth. No gold-standard recall or partition-distance score is available.\n\n## Inspect and correct\n\n- [Subsidiary comparison and audit](subsidiary_audit.md): ownership core, contamination, fragmentation, all 16 paper paths.\n- [Archived NYT comparison](archived_comparison.md): provenance, run sizes, selected fact overlaps and limitations.\n- [Sampling fixes and regression evidence](sampling_fixes.md): all five requested families corrected, tests, source locations and experimental implications.\n- [Additional sampling findings](additional_sampling_findings.md): related fixes, unresolved model and reproducibility issues.\n- [Why the score is low: original code audit](code_audit.md): pre-fix defects, preserved reproductions and evaluation effects.\n- [Ambiguous cases](ambiguous_cases.md): ${unresolved.length} cases with questions, names, source lines and full path evidence.\n- [Human review JSON](human_review.json): editable decisions for every fact; assistant annotations are preserved separately.\n- [Predicate choices](predicate_choices.md): all relation definitions and scope decisions in one place.\n- [Method](METHOD.md): unit, directional predicates, scope and judgment definitions.\n- [Full structured evaluations](evaluations.json): all cases, judgments, evidence and counts.\n\nA **supported** fact has at least one clear supporting triple. It may still have other assigned sentences expressing losses, meetings or different roles. Consequently these rates do not measure sentence-assignment purity. Local entity-name conflicts are flagged separately. Blank human decisions keep the assistant judgment; **ambiguous** retains an unresolved judgment.\n\n## Top 20, ordered by sentence count\n\nEach relation link contains its definition, boundary decisions and every fact. S = supported; E = incorrect; A = ambiguous. Counts concern expressed latent entity pairs within that relation, not deduplicated names.\n\n| Rank | Relation | Predicate label | Rows | Facts | S | E | A | S/N–(S+A)/N |\n|---:|---|---|---:|---:|---:|---:|---:|---|\n${table}\n\nAdditional rel_80: ${extra.supported} supported, ${extra.incorrect} incorrect, ${extra.ambiguous} ambiguous out of ${extra.n}; ${range(extra)}.\n\n## Reproducibility\n\nThe source is [map_world_sentences.tsv](../map_world_sentences.tsv), SHA-256 \`${metadata.source_sha256}\`. All 8,516 rows remain unchanged. Evidence line numbers include the TSV header. [cases.json](cases.json) preserves the extracted population; [annotations](annotations/) contains case-by-case assistant judgments. These judgments are interpretation, not output of a keyword classifier.\n\nFrom \`resources/sampler-140626\`, run:\n\n\`\`\`sh\nnode scripts/report_nyt_audit.mjs\n\`\`\`\n\nThis validates complete case coverage, allowed labels, evidence-row membership and reviewer questions, verifies the source checksum, preserves human-review entries and rebuilds summaries. To prepare cases for a different saved world, use \`node scripts/audit_nyt.mjs\`, then review all affected annotations before reporting. Do not treat an old annotation as valid for a changed source.\n`);
console.log(JSON.stringify({validated_cases:joined.length,top20:total,extra:stats(joined.filter(c=>!c.rank)),paper_paths:{rows:pathTotal,rel_325:mainPaths,rel_80:extraPaths},unresolved:unresolved.length},null,2));
