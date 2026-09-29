import {createPreparationCommands} from '../../../code/evaluation/nyt/commands/prepare.mjs';
import {census} from './evaluation_context.mjs';

createPreparationCommands({census}).runArchive250CLI();
