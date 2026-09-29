import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {sha as hash} from '../common.mjs';

/**
 * Descriptive archive/corpus inventory, independent of any semantic grading.
 * samplerRoot supplies original archive inputs; outputDirectory receives the three
 * generated inventory files. No archived relation assignments are evaluated.
 */
export function writeArchiveInventory({samplerRoot,outputDirectory}) {
  assert(typeof samplerRoot==='string'&&samplerRoot.trim(),'Explicit samplerRoot is required');
  assert(typeof outputDirectory==='string'&&outputDirectory.trim(),'Explicit outputDirectory is required');
  const sampler=path.resolve(samplerRoot);
const resultDir=path.join(sampler,'results'),out=path.resolve(outputDirectory);
const text=f=>fs.readFileSync(path.join(resultDir,f),'utf8');
const norm=s=>s.replace(/\s+/g,' ').trim();
const esc=s=>String(s).replaceAll('|','&#124;');
// Only corpus text is used from the saved TSV. Retired relation/entity assignments
// never enter this archive inventory or any generated comparison.
const rows=text('nyt-2026/map_world_sentences.tsv').trimEnd().split('\n').slice(1).map(line=>{
  const [,,,arg1,arg2,dependency_path]=line.split('\t');return {arg1,arg2,dependency_path};
});
const corpusPairs=new Set(rows.map(r=>r.arg1+'\t'+r.arg2));
function parseFacts(file){
  const s=text(file),re=/Fact\s*\[arg1=Noun\s*\[name=([\s\S]*?)\],\s*arg2=Noun\s*\[name=([\s\S]*?)\],\s*rel=Relation\s*\[name=(rel_\d+)\]\]/g;
  return [...s.matchAll(re)].map(m=>{
    const arg1=norm(m[1]),arg2=norm(m[2]),before=s.slice(0,m.index),prefix=before.slice(before.lastIndexOf('\n')+1).trim();
    return {archive_file:file,archive_line:before.split('\n').length,archive_relation:m[3],arg1,arg2,annotation_prefix:prefix};
  });
}
const listingFiles=['clusters_with_facts.txt','McCallum-corpus-sub/clusters_with_facts.txt','clusters_with_facts.log','cluster_facts_sample.txt','cluster_facts_sample_all.txt'];
const listings=listingFiles.map(file=>{
  const s=text(file),facts=parseFacts(file),prefixes={};for(const f of facts)prefixes[f.annotation_prefix||'(unmarked)']=(prefixes[f.annotation_prefix||'(unmarked)']||0)+1;
  return {file,sha256:hash(s),fact_entries:facts.length,distinct_relation_ids:new Set(facts.map(f=>f.archive_relation)).size,trigger_entries:(s.match(/Trigger\s*\[/g)||[]).length,pairs_present:facts.filter(f=>corpusPairs.has(f.arg1+'\t'+f.arg2)).length,prefixes,facts};
});
const logFiles=['output.txt',...[1,2,3,5].map(i=>`McCallum-corpus-sub/output-${i}.txt`)];
const logs=logFiles.map(file=>{
  const s=text(file),matches=[...s.matchAll(/Iteration:\s*\((\d+)\s*\/\s*(\d+)\)/g)];
  const last=s.slice(matches.at(-1)?.index||0);
  const blocks=last.split(/\r?\n\s*\r?\n/).filter(b=>b.includes('Trigger'));
  return {file,sha256:hash(s),nouns:Number(s.match(/Nouns:\s*(\d+)/)?.[1]),paths:Number(s.match(/Lexicon:\s*(\d+)/)?.[1]),argument_pairs:Number(s.match(/Arg Pairs:\s*(\d+)/)?.[1]),logged_iterations:matches.map(m=>+m[1]),iteration_denominator:matches[0]?+matches[0][2]:null,trigger_entries:(s.match(/Trigger\s*\[/g)||[]).length,fact_entries:(s.match(/Fact\s*\[/g)||[]).length,last_displayed_blocks:blocks.map((b,i)=>({display_position:i+1,triggers:[...b.matchAll(/Trigger\s*\[string=([^\]]+)\]\s*:\s*([\d.eE+-]+)/g)].map(m=>({path:m[1],printed_value:+m[2]}))}))};
});
const main=listings[0];
const groupIds=[...new Set(main.facts.map(f=>f.archive_relation))].sort((a,b)=>Number(a.slice(4))-Number(b.slice(4)));
const groups=groupIds.map(relation=>{
  const facts=main.facts.filter(f=>f.archive_relation===relation);
  return {archive_relation:relation,fact_entries:facts.length,matched_entries:facts.filter(f=>corpusPairs.has(f.arg1+'\t'+f.arg2)).length};
});
const multiset=xs=>{const m=new Map();for(const x of xs)m.set(x,(m.get(x)||0)+1);return m;};
const triple=(a,b,p)=>JSON.stringify([a,b,p]);
const currentTriples=multiset(rows.map(r=>triple(r.arg1,r.arg2,r.dependency_path)));
const smallerArchives=[['250','pluieTriples-1.json'],['2500','pluieTriples_fgreptest4.json']].map(([size,corpus])=>{
  const directory=`test/Entity_resolution_Relation/all-poss-facts/output-${size}`;
  const s=fs.readFileSync(path.join(sampler,directory,'map_world.txt'),'utf8');
  const blocks=s.split(/^Rel\[/m).slice(1),hist=new Map();
  for(const block of blocks){
    const id=block.match(/^(rel_\d+)/)[1];
    for(const m of block.matchAll(/^\s*Trig\[(.*)\]\s*:\s*(\d+)\s*$/gm)){
      const key=JSON.stringify([id,m[1]]),n=+m[2];
      if(hist.has(key)&&hist.get(key)!==n)throw Error('Conflicting archived trigger count');
      hist.set(key,n);
    }
  }
  const examples=[...s.matchAll(/^\s*Sentence \[origin=.*?, arg1=(.*?), arg2=(.*?), trig=Trig\[(.*)\]\]\s*$/gm)].map(m=>triple(m[1],m[2],m[3]));
  const source=JSON.parse(fs.readFileSync(path.join(sampler,'data/06-19',corpus),'utf8')).sentences;
  const expected=multiset(source.map(r=>triple(r.source,r.dest,r.depPath))),shown=multiset(examples);
  const excess=[...shown].reduce((sum,[k,n])=>sum+Math.max(0,n-(expected.get(k)||0)),0);
  const missing=[...expected].reduce((sum,[k,n])=>sum+Math.max(0,n-(shown.get(k)||0)),0);
  const trace=JSON.parse(fs.readFileSync(path.join(sampler,directory,'logprobs.txt'),'utf8'));
  return {directory,source_corpus:`data/06-19/${corpus}`,source_rows:source.length,relation_headers:blocks.length,histogram_total:[...hist.values()].reduce((a,b)=>a+b,0),displayed_rows:examples.length,cap10_expected_rows:[...hist.values()].reduce((a,b)=>a+Math.min(b,10),0),extra_triples_vs_source:excess,missing_triples_vs_source:missing,overlap_with_full_nyt_tsv:[...shown].reduce((sum,[k,n])=>sum+Math.min(n,currentTriples.get(k)||0),0),map_score:Number(s.split('\n')[0]),trace_max:Math.max(...trace.total),trace_lengths:Object.fromEntries(Object.entries(trace).map(([k,v])=>[k,v.length])),sha256:hash(s)};
});
const summary={method:'Archive-only inventory. Archive argument strings are whitespace-normalized only. Exact ordered pair presence and triple overlap use only the name/path corpus columns of the full-NYT TSV, ignoring all retired relation/entity assignments. No alias or semantic normalization; corpus overlap is not relation correctness or partition agreement.',logs,listings,groups,smallerArchives};
fs.mkdirSync(out,{recursive:true});
fs.writeFileSync(path.join(out,'archive_comparison.json'),JSON.stringify(summary,null,2)+'\n');
const sameCorpus=logs.find(l=>l.file.endsWith('output-5.txt'));
const lastBlocks=sameCorpus.last_displayed_blocks.map(b=>`| ${b.display_position} | ${b.triggers.slice(0,3).map(t=>esc(t.path)).join('<br>')} |`).join('\n');
const archiveRows=listings.map(l=>`| [${l.file}](../../${l.file}) | ${l.fact_entries} | ${l.distinct_relation_ids} | ${l.trigger_entries} | ${l.pairs_present}/${l.fact_entries} |`).join('\n');
const subsidiary=main.facts.filter(f=>f.archive_relation==='rel_23');
const allPairs=main.facts.map(f=>`| [${f.archive_line}](../../${f.archive_file}#L${f.archive_line}) | ${f.archive_relation} | ${esc(f.arg1)} → ${esc(f.arg2)} | ${esc(f.annotation_prefix||'(unmarked)')} |`).join('\n');
fs.writeFileSync(path.join(out,'archived_fact_pairs.md'),`# Every archived listed fact\n\n[Archive inventory](archived_comparison.md) · [Structured archive inventory](archive_comparison.json)\n\nAll ${main.fact_entries} entries from clusters_with_facts.txt, preserving duplicates, the relation ID printed on each fact, and the original annotation prefix. Names use whitespace-only normalization. The archive listing has no complete row assignments or established annotation legend.\n\n| Archive line | Archive relation | Ordered name pair | Printed annotation prefix |\n|---:|---|---|---|\n${allPairs}\n`);
const annotated=listings.find(l=>l.file==='cluster_facts_sample.txt');
const factKey=f=>`${f.archive_relation}\t${f.arg1}\t${f.arg2}`;
const txtKeys=new Set(main.facts.map(factKey)),logListing=listings.find(l=>l.file==='clusters_with_facts.log'),logKeys=new Set(logListing.facts.map(factKey));
const onlyTxt=main.facts.filter(f=>!logKeys.has(factKey(f))),onlyLog=logListing.facts.filter(f=>!txtKeys.has(factKey(f)));
const sameHash=listings[0].sha256===listings[1].sha256;
const sampleHash=listings[3].sha256===listings[4].sha256;
const doc=`# Archived NYT output inventory

[Every archived fact pair](archived_fact_pairs.md) · [Structured archive inventory](archive_comparison.json)

The archive contains related experiments and selected cluster listings. **No saved complete partition has verified provenance to the paper's published relation 46 / 60-fact run.** Relation IDs are arbitrary between runs. Neither matching example pairs nor a similar cluster name establishes that an archive file is the published run. This inventory preserves historical archive evidence whose active bug status is not established; evaluation mappings to the retired nyt-2026 run have been removed.

## Saved archive inventories

| Artifact/run | Sentence rows | Noun strings | Paths | Ordered name pairs | What is saved |
|---|---:|---:|---:|---:|---|
| User-attached results/output.txt | Not stated | 4,484 | 333 | 3,002 | Trigger snapshots; header names Umass-sub-corpus-06-12/pluieTriples_2013_06_12_3.json |
| McCallum output-1 | 116 | 46 | 65 | 25 | Trigger snapshots for 2013_01_06_1 subset |
| McCallum output-2 | 223 | 89 | 123 | 50 | Trigger snapshots for 2013_01_06_2 subset |
| McCallum output-3 | 451 | 177 | 204 | 100 | Trigger snapshots for 2013_01_06_3 subset |
| McCallum output-5 | 8,516 | 1,199 | 4,276 | 920 | Trigger snapshots for 2013_01_06_5 subset |

Input links and sentence totals for McCallum outputs come from [McCallum-corpus-sub/log](../../McCallum-corpus-sub/log), especially lines 29–35 for output-5. The attached [output.txt](../../output.txt) has a different corpus inventory. Pair-presence and triple-overlap counts below use only name/path corpus text from the saved full-NYT TSV; its relation and entity assignments are ignored.

All five archived output logs print checkpoints 0, 1000, …, 9000 with denominator 10000. They contain trigger weights but **zero explicit fact entries and no complete sentence assignment**. The four McCallum logs each contain 800 trigger entries; the attached output.txt contains 1200. These are repeated displays, not numbers of unique relations or paths. The 9000 display in output-5 contains ${sameCorpus.last_displayed_blocks.length} trigger blocks without stable relation labels. The number displayed is not the total occupied relation count.

The archive log reports 26,187.49 seconds (about 7.27 hours) for output-5. Hardware, code revision, update schedule and timing scope are not established well enough for a speedup comparison.

## Selected fact listings and duplicates

| File | Fact entries | Distinct relation IDs printed on facts | Trigger entries | Exact ordered pairs present in full-NYT corpus text |
|---|---:|---:|---:|---:|
${archiveRows}

The root and McCallum clusters_with_facts.txt files are ${sameHash?'byte-identical':'different'}; the two cluster_facts_sample files are ${sampleHash?'byte-identical':'different'}. Do not count these copies as independent runs or evaluations. Trigger counts include line-wrapped “Trigger [” entries; a same-line-only search undercounts them.

clusters_with_facts.log has 201 fact entries versus 208 in the .txt file. By exact (printed relation, name1, name2), there are ${onlyTxt.length} .txt-only entries and ${onlyLog.length} .log-only entries. The log has hand-added section headers, including a repeated cluster14 label; printed fact IDs sometimes differ within one displayed section. These artifacts are edited selections, not an authoritative complete relation partition.

## Archived subsidiary examples

The old listing's rel_23 has ten example facts and five displayed paths: part-of, unit-of (two syntactic forms), and owned-by (two forms). Its selected name pairs are:

| Archive line | Archived ordered pair |
|---:|---|
${subsidiary.map(f=>`| [${f.archive_line}](../../${f.archive_file}#L${f.archive_line}) | ${esc(f.arg1)} → ${esc(f.arg2)} |`).join('\n')}

These include the paper's two named examples, BBDO Worldwide/Omnicom Group and Fox/News Corporation. The old sample itself also includes **New York → BBDO Worldwide**. Appearance in an old list does not validate a fact. The ten selected examples are not the paper's complete 60-fact subsidiary output.

## Qualitative archive structure

The last displayed output-5 snapshot has these leading paths (display position is not a relation ID):

| Display position | First three printed paths |
|---:|---|
${lastBlocks}

The old displays mix related but distinct predicates: the beat-labeled sample includes beat, defeat, play and lose-to; the analyst-labeled sample includes economist paths. The last output-5 display combines organizational unit/part paths with based-in/company-location paths. The archive's estimator, smoothing, vocabulary and saved-state selection are not established well enough for direct comparison with later empirical path frequencies.

## What the archived annotations establish

cluster_facts_sample.txt selects eight labeled sections: win, leader-in, lead, beat, expert-at, analyst-at, president/state and president/sports. Its ${annotated.fact_entries} fact entries have prefixes ${Object.entries(annotated.prefixes).map(([k,n])=>'“'+k+'”: '+n).join(', ')}. Some #Fact rows appear in a section different from their printed relation ID, which may mark exclusions or cross-references. Only a minority have numeric marks, including one 0.5. There is no complete annotation legend or documented denominator. **Do not infer 95% precision by treating unmarked entries or # entries as successes/failures.**

These partial, differently annotated old outputs do not establish numerical improvement or deterioration against later evaluations. Leadership, chairmanship, analyst work and generic affiliation have different boundaries; broadening predicates would change a measured rate.

## Listed facts by archived relation ID

Exact pair presence refers only to the input corpus, without using later relation assignments. The old selection contains neither sentence IDs nor all facts.

| Archive relation | Listed entries | Exact ordered pairs present in full-NYT corpus text |
|---|---:|---:|
${groups.map(g=>`| ${g.archive_relation} | ${g.fact_entries} | ${g.matched_entries} |`).join('\n')}

Every main-listing pair and archive source line is in [archived_fact_pairs.md](archived_fact_pairs.md). Every parsed listing entry and original annotation prefix is preserved in [archive_comparison.json](archive_comparison.json). Exact string mismatches, including old line breaks around punctuation, remain unmatched; no entity-alias decisions are hidden. Without a full old row partition or a gold fact set, archive precision/recall and partition-distance measures would have an unjustified denominator.

Rebuild with \`node scripts/compare_nyt_archives.mjs\` from the sampler directory. All original archive files and the full-NYT corpus text are read-only inputs.
`;
const smallerSection=`## Additional archived partial-corpus MAP worlds\n\nThe imported test fixtures also preserve smaller NYT-derived runs. These are separate from the later inference-of-K experiments summarized in CHANGES.\n\n| Archived directory | Source rows | Relation headers | Displayed sentence rows | Missing source occurrences | Triple multiset intersection with full-NYT corpus text |\n|---|---:|---:|---:|---:|---:|\n${smallerArchives.map(a=>`| [output-${a.source_rows}](../../../${a.directory}/map_world.txt) | ${a.source_rows} | ${a.relation_headers} | ${a.displayed_rows} | ${a.missing_triples_vs_source} | ${a.overlap_with_full_nyt_tsv}/${a.displayed_rows} |`).join('\n')}\n\nThe 250-row listing exactly matches the (argument1, argument2, path) multiset in data/06-19/pluieTriples-1.json. The 2500-row listing is a subset of pluieTriples_fgreptest4.json with zero extra triples; its histogram totals 2,500 while its 2,461 printed examples follow a cap of ten per relation/path. The omitted 39 occurrences prevent a full sentence-partition reconstruction from that display. Both files start with a MAP score equal to the maximum of their respective 10,000-value total-score traces (five score channels).\n\nThe corpus names and multiset checks establish which data these fixtures describe; they do not identify the exact run configuration or connect them to the paper's full NYT run. Their 15/50 displayed relations are not estimates for the full 8,516-row corpus. Triple overlap is a multiset intersection: repeated triples contribute the smaller occurrence count in the two files. It is a corpus-intersection count, not a semantic or clustering score.\n\n`;
fs.writeFileSync(path.join(out,'archived_comparison.md'),doc.replace('## Selected fact listings and duplicates',smallerSection+'## Selected fact listings and duplicates'));
return {listings:listings.map(({facts,...x})=>x),last_output5_blocks:sameCorpus.last_displayed_blocks.length,txt_only_count:onlyTxt.length,log_only_count:onlyLog.length,smallerArchives};
}
