import fs from 'node:fs';
import crypto from 'node:crypto';

export const sha=x=>crypto.createHash('sha256').update(x).digest('hex');
export const json=file=>JSON.parse(fs.readFileSync(file,'utf8'));
export const fmt=x=>JSON.stringify(x,null,2)+'\n';
export const pct=x=>(100*x).toFixed(2)+'%';
export const esc=x=>String(x).replaceAll('&','&amp;').replaceAll('<','&lt;').replaceAll('>','&gt;').replaceAll('|','\\|').replaceAll('\n',' ');
