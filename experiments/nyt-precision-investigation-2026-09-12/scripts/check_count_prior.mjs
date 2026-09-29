import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
const root=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const logChoose=(n,k)=>{let v=0;for(let j=1;j<=k;j++)v+=Math.log(n-k+j)-Math.log(j);return v;};
const logCount=(k,mean)=>k<1?-Infinity:-Math.log(k)-.5*Math.log(2*Math.PI)-.5*(Math.log(k)-Math.log(mean)+.5)**2;
const logBinomial=(k,m,q)=>logChoose(m,k)+k*Math.log(q)+(m-k)*Math.log1p(-q);
function normalize(logs){const a=Math.max(...logs),ws=logs.map(x=>Math.exp(x-a)),s=ws.reduce((a,b)=>a+b,0);return ws.map(x=>x/s);}
function describe(ps){const mean=ps.reduce((s,p,k)=>s+p*k,0);return {mean,sd:Math.sqrt(ps.reduce((s,p,k)=>s+p*(k-mean)**2,0)),mode:ps.indexOf(Math.max(...ps))};}
function factSetLog(n,u,a,b){let v=0;for(let i=0;i<n;i++)v+=Math.log(a+i);for(let i=0;i<u-n;i++)v+=Math.log(b+i);for(let i=0;i<u;i++)v-=Math.log(a+b+i);return v;}
const u=4,m=3,a=1,b=4,q=1-Math.exp(factSetLog(0,u,a,b));
const raw=Array(m+1).fill(0),corrected=Array(m+1).fill(0);
for(let mask=0;mask<2**(m*u);mask++){
 let k=0,lf=0;for(let r=0;r<m;r++){let n=0;for(let j=0;j<u;j++)n+=(mask>>(r*u+j))&1;if(n)k++;lf+=factSetLog(n,u,a,b);}
 if(k===0)continue;const lp=lf+logCount(k,2);raw[k]+=Math.exp(lp);corrected[k]+=Math.exp(lp-logBinomial(k,m,q));
}
const norm=x=>x.map(v=>v/x.reduce((a,b)=>a+b,0));
const pRaw=norm(raw),pCorrected=norm(corrected),expectedRaw=normalize(raw.map((v,k)=>logCount(k,2)+logBinomial(k,m,q))),expectedCorrected=normalize(raw.map((v,k)=>logCount(k,2)));
for(let k=0;k<=m;k++){assert.ok(Math.abs(pRaw[k]-expectedRaw[k])<1e-12);assert.ok(Math.abs(pCorrected[k]-expectedCorrected[k])<1e-12);}
const rows=[];for(const n of [1199,1008])for(const pool of [400,800]){
 const qb=n*n/(1437601+n*n),ks=Array.from({length:pool+1},(_,k)=>k);
 rows.push({N:n,M:pool,a:1,b:1437601,q:qb,current:describe(normalize(ks.map(k=>logCount(k,200)+logBinomial(k,pool,qb)))),count_first_truncated:describe(normalize(ks.map(k=>logCount(k,200))))});
}
const result={note:'No production or experimental target changed. Independent no-sentence, fixed-N count-prior calculation.',exhaustive_test:{fact_configurations:2**(m*u),N:2,M:m,a,b,q,raw:pRaw,corrected:pCorrected,passed:true},full_scale:rows};
fs.writeFileSync(path.join(root,'analysis/count_prior_check.json'),JSON.stringify(result,null,2)+'\n');
console.log(JSON.stringify(result,null,2));
