import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {writeArchiveInventory} from '../../../code/evaluation/nyt/diagnostics/archive_inventory.mjs';

// Compatibility caller; maintained archive diagnostics live in code/evaluation/nyt.
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)) {
  const samplerRoot=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
  const result=writeArchiveInventory({samplerRoot,
    outputDirectory:path.join(samplerRoot,'results/nyt-2026/evaluation')});
  console.log(JSON.stringify(result,null,2));
}
