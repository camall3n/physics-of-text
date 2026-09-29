import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {spawnSync} from 'node:child_process';
import crypto from 'node:crypto';

export const sampler = path.dirname(fileURLToPath(import.meta.url));
export const repository = path.resolve(sampler, '../..');
export const dependencyJar = path.join(repository, 'resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar');
export const sha256 = file => crypto.createHash('sha256').update(fs.readFileSync(file)).digest('hex');
export function filesBelow(directory) {
  return fs.readdirSync(directory, {withFileTypes:true}).sort((a,b)=>a.name.localeCompare(b.name)).flatMap(entry =>
    entry.isDirectory() ? filesBelow(path.join(directory,entry.name)) : [path.join(directory,entry.name)]);
}

// Historical adapters keep independent build/output directories while using
// this single source tree. Source keys remain src/... for saved-run manifests.
export function createBuildContext({research = repository, buildDirectory = path.join(sampler, 'build')} = {}) {
  research = path.resolve(research);
  buildDirectory = path.resolve(buildDirectory);
  const variant = sampler;
  const classes = path.join(buildDirectory, 'classes');
  const testClasses = path.join(buildDirectory, 'test-classes');
  function build() {
    fs.mkdirSync(buildDirectory, {recursive:true});
    for (const directory of [classes,testClasses]) {
      fs.rmSync(directory,{recursive:true,force:true});
      fs.mkdirSync(directory,{recursive:true});
    }
    const main = filesBelow(path.join(variant,'src/main/java')).filter(f=>f.endsWith('.java'));
    const tests = filesBelow(path.join(variant,'src/test/java')).filter(f=>f.endsWith('.java') && !/HMMTest|MathTest|LoggerTest|BernoulliExperimentTest|DpmSuite/.test(f));
    for (const [sources,destination] of [[main,classes],[tests,testClasses]]) {
      const result = spawnSync('javac',['-nowarn','--release','8','-cp',`${classes}:${testClasses}:${dependencyJar}`,'-d',destination,...sources],{encoding:'utf8'});
      if (result.status !== 0) throw new Error(result.stdout+result.stderr);
      if (result.stderr) process.stderr.write(result.stderr);
    }
    fs.writeFileSync(path.join(classes,'logback.xml'),'<configuration><root level="OFF"/></configuration>\n');
    const sourceHashes = Object.fromEntries(filesBelow(path.join(variant,'src')).map(f=>[path.relative(variant,f),sha256(f)]));
    fs.writeFileSync(path.join(buildDirectory,'source_sha256.json'),JSON.stringify(sourceHashes,null,2)+'\n');
    fs.writeFileSync(path.join(buildDirectory,'build.json'),JSON.stringify({built_at:new Date().toISOString(),main_sources:main.length,test_sources:tests.length,dependency_jar:dependencyJar,dependency_sha256:sha256(dependencyJar),javac:spawnSync('javac',['-version'],{encoding:'utf8'}).stdout.trim()},null,2)+'\n');
    console.log(`Compiled ${main.length} main and ${tests.length} test sources into ${path.relative(research,buildDirectory)}`);
  }
  return {research,repository,variant,buildDirectory,dependencyJar,classes,testClasses,filesBelow,sha256,build};
}

if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) createBuildContext().build();
