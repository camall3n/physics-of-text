import {createVerificationCommands} from '../../../code/evaluation/nyt/commands/verify.mjs';
import {census,reporter} from './evaluation_context.mjs';

createVerificationCommands({census,reporter}).runSupplementalSourceVerificationCLI();
