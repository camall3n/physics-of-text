import {runExperiment} from '../../../code/sampler/run.mjs';
import * as context from './build_entity_variant.mjs';

await runExperiment(context, process.argv.slice(2));
