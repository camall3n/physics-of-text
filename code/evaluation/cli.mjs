#!/usr/bin/env node
// CLI parsing only. Reusable algorithms live in nyt/ and figure1/.
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {PRESETS} from './campaigns.mjs';
import {checkCampaign,renderCampaign} from './commands/nyt.mjs';
import {runConsistency} from './commands/consistency.mjs';
export const HELP=`Usage:
  node code/evaluation/cli.mjs list
  node code/evaluation/cli.mjs check --preset NAME
  node code/evaluation/cli.mjs render --preset NAME --output-dir NEW_EMPTY_DIR
  node code/evaluation/cli.mjs consistency --preset nyt-top20|nyt-coverage [--current-only] [--output-dir NEW_EMPTY_DIR]

check and consistency are read-only by default. render never writes into experiments.
Selections are frozen preset configuration; undocumented cutoff flags are rejected.
Figure 1: python3 code/evaluation/figure1/cli.py --help
`;
export async function main(args=process.argv.slice(2)) {
  const [command,...rest]=args;
  if(!command||command==='--help'||command==='help')return HELP;
  if(command==='list'){
    if(rest.length)throw Error('list accepts no options');
    return PRESETS.map(({id,kind,protocol,selection,description})=>({id,kind,protocol,selection,description}));
  }
  if(!['check','render','consistency'].includes(command))throw Error('Unknown command: '+command);
  const allowed=new Set(command==='check'?['--preset']:command==='render'?['--preset','--output-dir']:['--preset','--output-dir','--current-only']);
  const options={};
  for(let i=0;i<rest.length;i++){
    const key=rest[i];if(!allowed.has(key))throw Error('Unsupported option: '+key);
    if(Object.hasOwn(options,key))throw Error('Repeated option: '+key);
    if(key==='--current-only')options[key]=true;
    else {const value=rest[++i];if(!value||value.startsWith('--'))throw Error('Missing value: '+key);options[key]=value;}
  }
  if(!options['--preset'])throw Error('--preset is required');
  if(command==='check')return checkCampaign(options['--preset']);
  if(command==='render')return renderCampaign(options['--preset'],{outputDirectory:options['--output-dir']});
  return runConsistency(options['--preset'],{includePrior:!options['--current-only'],outputDirectory:options['--output-dir']});
}
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)){
  try {const result=await main();console.log(typeof result==='string'?result:JSON.stringify(result,null,2));}
  catch(error){console.error(error.message);process.exitCode=1;}
}
