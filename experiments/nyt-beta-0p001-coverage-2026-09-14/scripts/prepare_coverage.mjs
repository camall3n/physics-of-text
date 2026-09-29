import {createPreparationCommands} from '../../../code/evaluation/nyt/commands/prepare.mjs';
import {census,coverage} from './evaluation_context.mjs';

createPreparationCommands({census,coverage}).runCoverageCLI();
