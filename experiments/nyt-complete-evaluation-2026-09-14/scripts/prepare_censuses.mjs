import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createPreparationCommands} from '../../../code/evaluation/nyt/commands/prepare.mjs';
import {census} from './evaluation_context.mjs';

const {initialEntries,prepareAll,runCompleteCLI}=createPreparationCommands({census});
export {initialEntries,prepareAll};
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url))runCompleteCLI();
