import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';

const current=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const previous=path.resolve(current,'../nyt-precision-investigation-2026-09-12');
const hash=p=>crypto.createHash('sha256').update(fs.readFileSync(p)).digest('hex');
const key=(...parts)=>JSON.stringify(parts);
const histogram=values=>Object.fromEntries([...values.reduce((m,n)=>m.set(n,(m.get(n)||0)+1),new Map())].sort((a,b)=>a[0]-b[0]));
const add=(map,k,value)=>{if(!map.has(k))map.set(k,new Set());map.get(k).add(value);};

function metrics(rows){
 const pairs=new Map(),groups=new Map(),facts=new Map(),factRows=new Map(),groupRows=new Map(),associations=new Map();
 const rels=new Set(),observations=new Set();
 for(const row of rows){
  const {relation,entity1,entity2,arg1,arg2,trigger,line}=row;
  const literal=key(arg1,arg2),group=key(relation,arg1,arg2),fact=key(relation,entity1,entity2);
  add(pairs,literal,relation);add(groups,group,fact);add(facts,fact,literal);rels.add(relation);
  observations.add(key(arg1,arg2,trigger));
  if(!factRows.has(fact))factRows.set(fact,[]);factRows.get(fact).push(line);
  if(!groupRows.has(group))groupRows.set(group,[]);groupRows.get(group).push(line);
  if(!associations.has(key(group,fact)))associations.set(key(group,fact),[]);
  associations.get(key(group,fact)).push(line);
 }
 const multiGroups=[...groups].filter(([,set])=>set.size>1);
 const multiFacts=[...facts].filter(([,set])=>set.size>1);
 const splitExcess=[...groups.values()].reduce((s,set)=>s+set.size-1,0);
 const mergedExcess=[...facts.values()].reduce((s,set)=>s+set.size-1,0);
 assert.equal(splitExcess,associations.size-groups.size);
 assert.equal(mergedExcess,associations.size-facts.size);
 assert.equal(facts.size-groups.size,splitExcess-mergedExcess);
 const most=(items)=>items.sort((a,b)=>b[1].size-a[1].size||a[0].localeCompare(b[0])).slice(0,5);
 return {
  rows:rows.length,expressed_relations:rels.size,distinct_literal_pairs:pairs.size,
  relation_literal_pair_groups:groups.size,latent_facts:facts.size,distinct_group_fact_associations:associations.size,
  groups_with_multiple_latent_facts:multiGroups.length,
  excess_latent_fact_associations:splitExcess,
  rows_in_groups_with_multiple_latent_facts:multiGroups.reduce((s,[g])=>s+groupRows.get(g).length,0),
  latent_facts_with_multiple_literal_pairs:multiFacts.length,
  excess_literal_pair_associations:mergedExcess,
  rows_in_facts_with_multiple_literal_pairs:multiFacts.reduce((s,[f])=>s+factRows.get(f).length,0),
  literal_pairs_in_multiple_relations:[...pairs.values()].filter(set=>set.size>1).length,
  excess_relation_associations:groups.size-pairs.size,
  mean_relations_per_literal_pair:groups.size/pairs.size,
  distinct_observed_arg_path_triples:observations.size,
  repeated_observed_triple_rows:rows.length-observations.size,
  latent_fact_multiplicity_per_relation_literal_pair:histogram([...groups.values()].map(set=>set.size)),
  literal_pair_multiplicity_per_latent_fact:histogram([...facts.values()].map(set=>set.size)),
  relation_multiplicity_per_literal_pair:histogram([...pairs.values()].map(set=>set.size)),
  largest_split_group_examples:most(multiGroups).map(([g,fs])=>{
   const [relation,arg1,arg2]=JSON.parse(g);return {relation,arg1,arg2,latent_facts:fs.size,rows:groupRows.get(g).length,
    assignments:[...fs].sort().map(f=>({entity1:JSON.parse(f)[1],entity2:JSON.parse(f)[2],source_lines:associations.get(key(g,f))}))};
  }),
  largest_multiple_literal_pair_fact_examples:most(multiFacts).map(([f,ls])=>{
   const [relation,entity1,entity2]=JSON.parse(f);return {relation,entity1,entity2,literal_pairs:ls.size,rows:factRows.get(f).length,
    assignments:[...ls].sort().map(l=>{const [arg1,arg2]=JSON.parse(l);return {arg1,arg2,source_lines:associations.get(key(key(relation,arg1,arg2),f))};})};
  })
 };
}

// A hand-specified bipartite fixture includes both a split pair and a shared
// fact, plus a duplicate observation row, so these quantities cannot collapse
// into a single count accidentally. This fixture has G=3,F=3,A=4,L=2.
const fixture=[
 ['r1','e1','e2','Alice','X','p'],['r1','e3','e2','Alice','X','q'],
 ['r1','e1','e2','Ally','X','p'],['r2','e1','e2','Alice','X','p'],
 ['r1','e1','e2','Alice','X','p']
].map((r,i)=>({relation:r[0],entity1:r[1],entity2:r[2],arg1:r[3],arg2:r[4],trigger:r[5],line:i+2}));
const fm=metrics(fixture);
assert.deepEqual([fm.distinct_literal_pairs,fm.relation_literal_pair_groups,fm.latent_facts,fm.distinct_group_fact_associations,fm.groups_with_multiple_latent_facts,fm.excess_latent_fact_associations,fm.latent_facts_with_multiple_literal_pairs,fm.excess_literal_pair_associations,fm.repeated_observed_triple_rows],[2,3,3,4,1,1,1,1,2]);

const definitions=[
 {arm:'corrected latent beta=0.001',root:current,prefix:'entityfix_latent_beta0001'},
 {arm:'corrected latent beta=0.1',root:previous,prefix:'entityfix_latent_beta01'},
 {arm:'verbatim/frozen beta=0.001',root:previous,prefix:'verbatim_beta0001'}
];
const results=[],sets=new Map();let observationsReference;
for(const definition of definitions)for(const seed of [20260912,20260913]){
 const id=definition.prefix+'_seed'+seed,dir=path.join(definition.root,'runs',id),file=path.join(dir,'map_world_sentences.tsv');
 const run=JSON.parse(fs.readFileSync(path.join(dir,'run.json'),'utf8'));
 assert.equal(run.status,'complete');assert.equal(run.config.seed,seed);assert.equal(run.config.sentenceRelationMoveWeight,0);
 assert.equal(run.config.beta,definition.prefix==='entityfix_latent_beta01'?.1:.001);
 assert.equal(run.config.freezeArgumentEntities,definition.prefix==='verbatim_beta0001');
 assert.equal(hash(file),run.outputs['map_world_sentences.tsv']);
 const lines=fs.readFileSync(file,'utf8').split('\n');if(lines.at(-1)==='')lines.pop();
 assert.equal(lines.shift(),'relation\tentity1\tentity2\targ1\targ2\tpath');
 const rows=lines.map((line,i)=>{const r=line.split('\t');assert.equal(r.length,6);return {relation:r[0],entity1:r[1],entity2:r[2],arg1:r[3],arg2:r[4],trigger:r[5],line:i+2};});
 assert.equal(rows.length,8516);
 const observations=rows.map(r=>[r.arg1,r.arg2,r.trigger]);
 if(observationsReference)assert.deepEqual(observations,observationsReference);else observationsReference=observations;
 const relRows=new Map();for(const row of rows){if(!relRows.has(row.relation))relRows.set(row.relation,[]);relRows.get(row.relation).push(row);}
 const top=[...relRows].sort((a,b)=>b[1].length-a[1].length||a[0].localeCompare(b[0],undefined,{numeric:true})).slice(0,20);
 const topRows=top.flatMap(([,rs])=>rs),full=metrics(rows),top20=metrics(topRows);
 assert.equal(top20.latent_facts,top.reduce((sum,[,rs])=>sum+new Set(rs.map(r=>key(r.entity1,r.entity2))).size,0));
 if(run.config.freezeArgumentEntities){assert.equal(full.groups_with_multiple_latent_facts,0);assert.equal(full.latent_facts_with_multiple_literal_pairs,0);assert.equal(full.latent_facts,full.relation_literal_pair_groups);}
 sets.set(id,new Set(topRows.map(r=>key(r.arg1,r.arg2))));
 results.push({id,arm:definition.arm,seed,source:path.relative(current,file),source_sha256:hash(file),corpus_sha256:run.corpus_sha256,
  full,top20,coverage:{rows:top20.rows/full.rows,latent_facts:top20.latent_facts/full.latent_facts,literal_pairs:top20.distinct_literal_pairs/full.distinct_literal_pairs,relation_literal_pair_groups:top20.relation_literal_pair_groups/full.relation_literal_pair_groups},
  top20_relations:top.map(([relation,rs],i)=>({rank:i+1,relation,...metrics(rs)}))});
}
assert.equal(new Set(results.map(r=>r.corpus_sha256)).size,1);
assert.equal(new Set(results.map(r=>r.full.distinct_literal_pairs)).size,1);
const comparisons=[];
for(const seed of [20260912,20260913])for(const reference of ['entityfix_latent_beta01','verbatim_beta0001']){
 const a='entityfix_latent_beta0001_seed'+seed,b=reference+'_seed'+seed,A=sets.get(a),B=sets.get(b),intersection=[...A].filter(x=>B.has(x)).length;
 comparisons.push({seed,new_run:a,reference_run:b,new_top20_literal_pairs:A.size,reference_top20_literal_pairs:B.size,intersection,new_only:A.size-intersection,reference_only:B.size-intersection,jaccard:intersection/(A.size+B.size-intersection)});
}
const pairedLatentDifferences=[20260912,20260913].map(seed=>{
 const n=results.find(r=>r.id==='entityfix_latent_beta0001_seed'+seed).full;
 const o=results.find(r=>r.id==='entityfix_latent_beta01_seed'+seed).full;
 const d={seed,latent_facts:n.latent_facts-o.latent_facts,relation_literal_pair_groups:n.relation_literal_pair_groups-o.relation_literal_pair_groups,excess_latent_fact_associations:n.excess_latent_fact_associations-o.excess_latent_fact_associations,excess_literal_pair_associations:n.excess_literal_pair_associations-o.excess_literal_pair_associations};
 assert.equal(d.latent_facts,d.relation_literal_pair_groups+d.excess_latent_fact_associations-d.excess_literal_pair_associations);return d;
});
const output={generated_at:new Date().toISOString(),method:{unit:'Saved MAP rows. Literal arguments are exact ordered strings, with no alias normalization. Latent fact=(relation,entity1,entity2). Group=(relation,arg1,arg2).',scope:'Expressed facts only: unreferenced facts do not appear in MAP sentence rows.',top20:'Relations ranked by row count descending, numeric relation ID ascending for ties.',split_excess:'Sum over relation/literal-pair groups of (number of distinct latent facts minus one).',merged_literal_excess:'Sum over latent facts of (number of distinct literal pairs minus one).',coverage:'Proportion of full-corpus observed rows, expressed facts, exact literal pairs or relation/literal-pair groups appearing in the top 20.',limitation:'All fragmentation, multiplicity and overlap measures are diagnostic flags, not errors, recall, correctness or matched semantic relations.'},validation:{hand_specified_bipartite_fixture:true,all_8516_observations_identical_in_order:true,all_map_hashes_match_recorded_run_manifest:true,bipartite_accounting_identities:true,frozen_one_to_one_group_fact_mapping:true},results,comparisons,paired_latent_differences:pairedLatentDifferences};
const pct=x=>(100*x).toFixed(1)+'%',label=r=>`${r.arm}, seed ${String(r.seed).slice(-2)}`;
let md='# Literal-pair and latent-fact partition diagnostics\n\nThis comparison uses six saved MAP worlds on the same **8,516 observed rows**: the two new corrected latent-entity runs at `beta=0.001`, the paired corrected latent runs at `beta=0.1`, and the previous verbatim/frozen runs at `beta=0.001`. All use `maxRels=400` and no sentence/relation bridge. The latent pair changes only beta; the frozen reference also disables entity inference, so it is a different modeling/inference condition.\n\nThese are **diagnostic counts, not errors, recall or correctness**. A latent fact is an ordered `(relation, entity1, entity2)` tuple; a literal pair is the exact ordered `(arg1, arg2)` strings. Alias normalization is not applied. Only facts expressed by at least one row are counted.\n\n## Full-corpus counts\n\n| Condition | Relations | Literal pairs L | Relation/literal groups G | Latent facts F | Groups with >1 latent fact | Excess latent associations A−G | Facts with >1 literal pair | Excess literal associations A−F |\n|---|---:|---:|---:|---:|---:|---:|---:|---:|\n';
for(const r of results){const m=r.full;md+=`| ${label(r)} | ${m.expressed_relations} | ${m.distinct_literal_pairs} | ${m.relation_literal_pair_groups} | ${m.latent_facts} | ${m.groups_with_multiple_latent_facts} | ${m.excess_latent_fact_associations} | ${m.latent_facts_with_multiple_literal_pairs} | ${m.excess_literal_pair_associations} |\n`;}
md+='\n## Top-20 counts and coverage\n\nThe top 20 relations are selected separately within each run by observed-row count (ties by numeric relation ID). Thus top-20 membership and the fact population can change across conditions.\n\n| Condition | Rows (% of corpus) | Literal pairs (% of full) | Latent facts (% of full) | Relation/literal groups | Groups with >1 latent fact | Excess latent associations | Facts with >1 literal pair | Excess literal associations |\n|---|---:|---:|---:|---:|---:|---:|---:|---:|\n';
for(const r of results){const m=r.top20,c=r.coverage;md+=`| ${label(r)} | ${m.rows} (${pct(c.rows)}) | ${m.distinct_literal_pairs} (${pct(c.literal_pairs)}) | ${m.latent_facts} (${pct(c.latent_facts)}) | ${m.relation_literal_pair_groups} | ${m.groups_with_multiple_latent_facts} | ${m.excess_latent_fact_associations} | ${m.latent_facts_with_multiple_literal_pairs} | ${m.excess_literal_pair_associations} |\n`;}
md+='\n“Excess latent associations” counts additional distinct latent facts inside the same relation and literal pair, not repeated sentence rows. Write A for the number of distinct observed group–fact associations. A group linked to k latent facts contributes k−1 to A−G. A latent fact supported by k literal pairs contributes k−1 to A−F. The independently checked identity is **F−G=(A−G)−(A−F)**. Both phenomena can coexist, so comparing F and G alone can hide their cancellation.\n\n## Fragmentation across relations\n\nA literal pair can legitimately express multiple predicates; assigning it to several relation IDs is therefore a fragmentation flag rather than a demonstrated duplicate or error.\n\n| Condition | Full: pairs in >1 relation | Full: mean relations per literal pair | Top 20: pairs in >1 relation | Top 20: mean relations per literal pair |\n|---|---:|---:|---:|---:|\n';
for(const r of results)md+=`| ${label(r)} | ${r.full.literal_pairs_in_multiple_relations} | ${r.full.mean_relations_per_literal_pair.toFixed(3)} | ${r.top20.literal_pairs_in_multiple_relations} | ${r.top20.mean_relations_per_literal_pair.toFixed(3)} |\n`;
md+='\n## Top-20 population overlap\n\nThese intersections compare literal pairs appearing anywhere within each run’s top 20. They do not match relation meanings, assert entity equivalence, or form precision/recall measures. Jaccard is intersection divided by union.\n\n| Seed | New corrected latent beta=.001 vs reference | Shared pairs | New only | Reference only | Jaccard |\n|---|---|---:|---:|---:|---:|\n';
for(const c of comparisons)md+=`| ${String(c.seed).slice(-2)} | ${c.reference_run.startsWith('verbatim')?'verbatim/frozen beta=.001':'corrected latent beta=.1'} | ${c.intersection} | ${c.new_only} | ${c.reference_only} | ${pct(c.jaccard)} |\n`;
md+='\nIn both paired latent comparisons, the lower-beta MAP has more total expressed facts while its top 20 cover far fewer rows and literal pairs. The top-20 row coverage falls from 62.2%/62.3% to 18.2%/17.9%, and literal-pair coverage falls from 81.0%/82.5% to 37.6%/36.7%. Across the full corpus, the mean relations per literal pair rises from 2.277/2.361 to 3.011/3.117.\n\nThe extra full-corpus facts are primarily accounted for by additional relation/literal-pair groups, rather than increased within-relation splitting of the same literal pair. The exact difference decomposition is delta(F)=delta(G)+delta(A−G)−delta(A−F):\n\n| Seed | Extra latent facts | Extra relation/literal groups | Change in within-group split excess | Change in multiple-literal-pair excess |\n|---|---:|---:|---:|---:|\n';
for(const d of pairedLatentDifferences)md+=`| ${String(d.seed).slice(-2)} | ${d.latent_facts} | ${d.relation_literal_pair_groups} | ${d.excess_latent_fact_associations} | ${d.excess_literal_pair_associations} |\n`;
md+='\n## What changes precision comparability\n\nThe manual evaluation unit is a latent fact. If one `(relation, literal pair)` maps to several latent facts, that wording can contribute several evaluation units. Conversely, one latent fact supported by several literal pairs contributes one unit and can contain aliases, incompatible identities, or both. Neither pattern proves correctness or an implementation defect: identical names can denote different real entities, and distinct names can be aliases.\n\nLow beta can split observations among more relation IDs. The top 20 can then cover fewer source rows and a different subset of literal pairs even when the whole corpus is unchanged. A higher precision estimate on that selected population would not show that more facts were recovered correctly or that performance improved over the full corpus. Within-relation entity fragmentation and across-relation predicate fragmentation are separate effects.\n\nThe frozen controls have a one-to-one mapping between relation/literal groups and latent facts by construction. The corrected latent runs permit both splitting and merging of literal names, so their denominators are not automatically comparable to the frozen runs. Relation IDs have no shared semantic meaning across runs and are not aligned here. The separately reviewed top-20 predicates and the limited sampling uncertainty remain necessary when interpreting precision differences.\n\nDuplicate input evidence is another distinct issue. Across all six full-corpus worlds there are '+results[0].full.distinct_observed_arg_path_triples+' distinct exact `(arg1,arg2,path)` triples and '+results[0].full.repeated_observed_triple_rows+' additional rows repeating such a triple. Those same repetitions occur in every condition. They are not counted as extra group–fact associations unless assignments differ, but they contribute likelihood weight and determine the row-based top-20 ranking. No source-document identity is available in this TSV, so an exact repeated triple is not asserted to be a duplicated original sentence.\n\n## Reproduce and inspect\n\nRun `node scripts/partition_diagnostics.mjs` from this experiment directory. The script writes only [partition_diagnostics.json](partition_diagnostics.json) and this report. JSON includes complete count histograms, each top-20 relation’s metrics, five largest split-group and multiple-literal-pair fact examples per scope, and source TSV line numbers. Examples are selected by multiplicity, not by a semantic judgment.\n\nValidation checks the saved MAP hashes, all 8,516 observed triples in identical row order across six worlds, exact configuration mode/beta, a hand-specified bipartite fixture, group/fact accounting identities and the frozen one-to-one mapping. It does not establish convergence or semantic accuracy.\n';
fs.writeFileSync(path.join(current,'analysis/partition_diagnostics.json'),JSON.stringify(output,null,2)+'\n');
fs.writeFileSync(path.join(current,'analysis/partition_diagnostics.md'),md);
console.log(JSON.stringify({results:results.map(({id,full,top20,coverage})=>({id,full:{literal_pairs:full.distinct_literal_pairs,groups:full.relation_literal_pair_groups,facts:full.latent_facts,multi_groups:full.groups_with_multiple_latent_facts,split_excess:full.excess_latent_fact_associations,multi_literal_facts:full.latent_facts_with_multiple_literal_pairs},top20:{rows:top20.rows,literal_pairs:top20.distinct_literal_pairs,facts:top20.latent_facts,multi_groups:top20.groups_with_multiple_latent_facts,split_excess:top20.excess_latent_fact_associations,multi_literal_facts:top20.latent_facts_with_multiple_literal_pairs},coverage})),comparisons},null,2));
