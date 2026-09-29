import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { fileURLToPath } from 'node:url';

const sampler = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const source = path.join(sampler, 'results/nyt-2026/map_world_sentences.tsv');
const out = path.join(sampler, 'results/nyt-2026/evaluation');
const text = fs.readFileSync(source, 'utf8');
const lines = text.trimEnd().split('\n');
if (lines.shift() !== 'relation\tentity1\tentity2\targ1\targ2\tpath') throw Error('Unexpected TSV header');
const rows = lines.map((line, i) => {
  const columns = line.split('\t');
  if (columns.length !== 6) throw Error(`Malformed source row ${i + 2}`);
  const [relation, entity1, entity2, arg1, arg2, dependency_path] = columns;
  return { relation, entity1, entity2, arg1, arg2, dependency_path, line: i + 2 };
});
const relationRows = new Map();
for (const row of rows) {
  if (!relationRows.has(row.relation)) relationRows.set(row.relation, []);
  relationRows.get(row.relation).push(row);
}
const ranking = [...relationRows].sort((a,b) => b[1].length-a[1].length || Number(a[0].slice(4))-Number(b[0].slice(4)));
const top20 = ranking.slice(0,20).map(([id])=>id);
const selected = [...top20, 'rel_80'];
const frequency = values => [...values.reduce((m,v)=>m.set(v,(m.get(v)||0)+1),new Map())]
  .sort((a,b)=>b[1]-a[1] || a[0].localeCompare(b[0])).map(([value,count])=>({value,count}));
const cases = [];
for (const relation of selected) {
  const facts = new Map();
  for (const r of relationRows.get(relation)) {
    const key = `${r.entity1}\t${r.entity2}`;
    if (!facts.has(key)) facts.set(key, []);
    facts.get(key).push(r);
  }
  for (const factRows of [...facts.values()].sort((a,b)=>a[0].line-b[0].line)) {
    const {entity1,entity2}=factRows[0];
    cases.push({
      case_id: `${relation}__${entity1.slice(4,-1)}__${entity2.slice(4,-1)}`,
      relation, rank: top20.indexOf(relation)+1 || null, entity1, entity2,
      sentence_count: factRows.length,
      names: frequency(factRows.map(r=>`${r.arg1} → ${r.arg2}`)),
      paths: frequency(factRows.map(r=>r.dependency_path)),
      source_lines: factRows.map(r=>r.line),
      evidence: factRows,
    });
  }
}
fs.mkdirSync(path.join(out,'cases'),{recursive:true});
fs.mkdirSync(path.join(out,'annotations'),{recursive:true});
const metadata = {
  source: '../map_world_sentences.tsv', source_sha256: crypto.createHash('sha256').update(text).digest('hex'),
  corpus_sentences: rows.length, total_expressed_relations: ranking.length,
  unit: 'One expressed latent fact: (relation, entity1 ID, entity2 ID).',
  selection: 'Top 20 relations ranked by MAP sentence count; rel_80 added for subsidiary fragmentation audit.',
  top20, top20_sentences: rows.filter(r=>top20.includes(r.relation)).length,
  top20_facts: cases.filter(c=>top20.includes(c.relation)).length,
  subsidiary_extra_facts: cases.filter(c=>c.relation==='rel_80').length,
};
fs.writeFileSync(path.join(out,'cases.json'),JSON.stringify({metadata,cases},null,2)+'\n');
for (const relation of selected) {
  const subset=cases.filter(c=>c.relation===relation);
  fs.writeFileSync(path.join(out,'cases',`${relation}.json`),JSON.stringify(subset,null,2)+'\n');
  const compact=subset.map((c,i)=>`${i+1}. ${c.case_id} (${c.sentence_count} sentences; lines ${c.source_lines.join(',')})\nNames: ${c.names.map(n=>`${n.value} [${n.count}]`).join('; ')}\n${c.paths.map(p=>`  ${p.count} ${p.value}`).join('\n')}`).join('\n\n');
  fs.writeFileSync(path.join(out,'cases',`${relation}.txt`),compact+'\n');
}
console.log(JSON.stringify({metadata,relations:selected.map(relation=>({relation,sentences:relationRows.get(relation).length,facts:cases.filter(c=>c.relation===relation).length}))},null,2));
