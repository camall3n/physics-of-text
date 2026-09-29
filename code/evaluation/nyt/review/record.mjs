/**
 * Records supplied manual judgments; never infers labels from evidence.
 * Calling policy (reviewer, population, declaration lock and history) is explicit.
 * prepareRecord reads/validates and returns a plan; only record persists it.
 */
import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import crypto from 'node:crypto';
const hash=x=>crypto.createHash('sha256').update(x).digest('hex');
export const seq=(a,b)=>Array.from({length:b-a+1},(_,i)=>a+i);
export function createManualReview({root,population='census',reviewer:defaultReviewer='root',
  allowReviewerOverride=false,identityTags=false,requireDeclaration=false,preserveHistory=false,
  now=()=>new Date(),historyStamp=()=>Date.now()}) {
  root=path.resolve(root);
  function prepareRecord(audit,relation,groups,{mixed=[],broad=[],identity=[],reviewer=defaultReviewer}={}) {
    if(!allowReviewerOverride)reviewer=defaultReviewer;
    const folder=path.join(root,population,audit),caseRaw=fs.readFileSync(path.join(folder,'cases.json'));
    const r=JSON.parse(caseRaw).relations.find(r=>r.relation===relation);assert(r);
    const file=path.join(folder,'annotations',relation+'.json'),annotation=JSON.parse(fs.readFileSync(file));
    let declarationRaw;
    if(requireDeclaration){
      declarationRaw=fs.readFileSync(path.join(folder,'declarations',relation+'.json'),'utf8');
      const declaration=JSON.parse(declarationRaw);
      assert.equal(declaration.kind,'declared_before_case_grading','Prior top20 judgments must remain unchanged');
      assert.equal(annotation.predicate_declaration_sha256,hash(declarationRaw),'Declaration hash mismatch');
    }
    const entries=new Map();
    for(const [indices,judgment,reason,tags=[],question=''] of groups)for(const i of indices){
      assert(Number.isInteger(i)&&i>=0&&i<r.facts.length,'Bad index '+i);assert(!entries.has(i),'Repeated '+i);
      assert(['supported','incorrect','ambiguous'].includes(judgment));assert(reason);assert(judgment!=='ambiguous'||question);
      const c=r.facts[i],old=annotation.facts.find(f=>f.case_id===c.case_id);assert(old);
      const issue_tags=[...new Set([...tags,...(mixed.includes(i)?['mixed_evidence']:[]),...(broad.includes(i)?['broad_predicate']:[]),
        ...(identityTags&&identity.includes(i)?['identity_ambiguity']:[])])];
      entries.set(i,{...old,judgment,reason:c.names.map(n=>n.value).join('; ')+': '+reason,evidence_lines:c.source_lines,
        issue_tags,reviewer_question:question,provisional:false,review:{reviewer,
        method:'Explicit manual judgment after reading the full relation dictionary and every supplied case row; citations include the complete considered evidence.',
        reviewed_at:now().toISOString()}});
    }
    assert.equal(entries.size,r.facts.length,'Manual record must explicitly cover every case');
    annotation.facts=r.facts.map((_,i)=>entries.get(i));
    const manualRecord={audit,relation,cases_sha256:hash(caseRaw),reviewer,complete_dictionary_read:true,
      complete_case_evidence_read:true,groups:groups.map(g=>({indices:g[0],case_ids:g[0].map(i=>r.facts[i].case_id),
      judgment:g[1],reason:g[2],tags:g[3]??[],question:g[4]??''})),mixed,broad,
      ...(identityTags?{identity}:{}),...(requireDeclaration?{predicate_declaration_sha256:hash(declarationRaw)}:{})};
    return {audit,relation,folder,file,annotation,manualRecord};
  }
  function record(audit,relation,groups,options={}){
    const plan=prepareRecord(audit,relation,groups,options);
    if(preserveHistory&&fs.existsSync(plan.file)&&JSON.parse(fs.readFileSync(plan.file)).facts.some(f=>f.judgment)){
      const history=path.join(plan.folder,'annotation_history',relation);fs.mkdirSync(history,{recursive:true});
      fs.writeFileSync(path.join(history,historyStamp()+'.json'),fs.readFileSync(plan.file));
    }
    fs.writeFileSync(plan.file,JSON.stringify(plan.annotation,null,2)+'\n');
    const logdir=path.join(root,'analysis/manual_records');fs.mkdirSync(logdir,{recursive:true});
    fs.writeFileSync(path.join(logdir,audit+'__'+relation+'.json'),JSON.stringify(plan.manualRecord,null,2)+'\n');
    console.log(audit+'/'+relation+': '+plan.annotation.facts.length+' complete manual judgments');
  }
function show(audit,relations,{start=0,end=Infinity,dictionary=true}={}){
 const folder=path.join(root,population,audit),cs=JSON.parse(fs.readFileSync(path.join(folder,'cases.json')));
 for(const relation of relations){const r=cs.relations.find(x=>x.relation===relation),a=JSON.parse(fs.readFileSync(path.join(folder,'annotations',relation+'.json')));assert(r);if(dictionary)console.log(`\nAUDIT ${audit} ${relation}: ${a.label}\n${a.definition}\nSCOPE: ${a.scope_notes}\nFULL DICTIONARY:`,JSON.stringify(r.paths));
 for(const [i,c] of r.facts.entries()){if(i<start||i>end)continue;const triples=new Map();for(const e of c.evidence){const key=JSON.stringify([e.arg1,e.arg2,e.dependency_path]);if(!triples.has(key))triples.set(key,[]);triples.get(key).push(e.line)}console.log(`${i} ${c.case_id}: `+[...triples].map(([k,lines])=>`${k} @${lines.join(',')}`).join(' || '));}}
}

  return {prepareRecord,record,show};
}
