import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createBuildContext} from '../../../code/sampler/build.mjs';

// Compatibility adapter: source is shared; this study keeps its own build/output.
const study = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
export const {
  research, repository, variant, buildDirectory, dependencyJar,
  classes, testClasses, filesBelow, sha256, build
} = createBuildContext({
  research: study,
  buildDirectory: path.join(study, 'variants/entity-multiplicity-fix/build')
});
if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) build();
