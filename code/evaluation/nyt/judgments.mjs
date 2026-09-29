import assert from 'node:assert/strict';

const allowed=new Set(['supported','incorrect','ambiguous']);
export const nonempty=value=>typeof value==='string'&&value.trim().length>0;

/** Validate the recorded decision and case-local citations; never infer a semantic label. */
export function validateJudgment(judgment,caseEvidence,{human=false}={}) {
  const id=caseEvidence.case_id;
  assert(allowed.has(judgment.judgment),`Missing/invalid judgment for ${id}`);
  assert(nonempty(judgment.reason),`Missing reason for ${id}`);
  assert(Array.isArray(judgment.evidence_lines)&&judgment.evidence_lines.length,`Missing citations for ${id}`);
  assert.equal(new Set(judgment.evidence_lines).size,judgment.evidence_lines.length,`Duplicate citations for ${id}`);
  const valid=new Set(caseEvidence.evidence.map(e=>e.line));
  for(const line of judgment.evidence_lines) {
    assert(Number.isInteger(line)&&valid.has(line),`Foreign/invalid citation ${line} for ${id}`);
  }
  assert(Array.isArray(judgment.issue_tags)&&judgment.issue_tags.every(t=>typeof t==='string'),`Invalid issue tags for ${id}`);
  assert(typeof judgment.reviewer_question==='string',`Missing question field for ${id}`);
  if(judgment.judgment==='ambiguous') {
    assert(nonempty(judgment.reviewer_question),`Ambiguous case lacks specific question: ${id}`);
  }
  if(human)assert(nonempty(judgment.reviewer),`Human override lacks reviewer: ${id}`);
}
