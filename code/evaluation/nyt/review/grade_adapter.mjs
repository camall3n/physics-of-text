// Explicit S/E/A shorthand only; labels and indices must be supplied by the reviewer.
export function createGradeAdapter(record,{audit,reviewer='runner'}){
 return (relation,groups,options={})=>record(audit,relation,
  groups.map(([indices,label,...rest])=>[indices,{S:'supported',E:'incorrect',A:'ambiguous'}[label],...rest]),
  {reviewer,...options});
}
