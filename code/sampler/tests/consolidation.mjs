import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {spawnSync} from 'node:child_process';
import {fileURLToPath, pathToFileURL} from 'node:url';

// This harness writes only beneath a newly named validation directory. It never
// invokes historical test wrappers, which overwrite their saved latest pointers.
const repository = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '../../..');
const studies = ['nyt-precision-investigation-2026-09-12', 'nyt-latent-low-smoothing-2026-09-14']
  .map(name => path.join(repository, 'experiments', name));
const dependencyJar = path.join(repository, 'resources/sampler-140626/target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar');
const [mode, outputArgument] = process.argv.slice(2);
if (!['prepare', 'verify'].includes(mode) || !outputArgument || process.argv.length !== 4)
  throw new Error('Usage: node code/sampler/tests/consolidation.mjs prepare|verify NEW-VALIDATION-DIRECTORY');
const output = path.resolve(outputArgument);
assert.ok(output.startsWith(path.join(repository, 'experiments') + path.sep), 'Validation directory must be inside experiments/');
assert.ok(!studies.some(study => output === study || output.startsWith(study + path.sep)), 'Do not write into a saved study');
const sha256 = file => crypto.createHash('sha256').update(fs.readFileSync(file)).digest('hex');
function filesBelow(directory) {
  return fs.readdirSync(directory, {withFileTypes: true}).sort((a,b) => a.name.localeCompare(b.name)).flatMap(entry => {
    const file = path.join(directory, entry.name);
    assert.ok(!entry.isSymbolicLink(), `Unexpected symlink inside materialized source/output: ${file}`);
    return entry.isDirectory() ? filesBelow(file) : [file];
  });
}
function hashes(directory, predicate = () => true) {
  return Object.fromEntries(filesBelow(directory).filter(predicate).map(file => [path.relative(directory,file),sha256(file)]));
}
function counts(files) {
  return files.reduce((total,file) => {
    const data=fs.readFileSync(file), text=data.toString('utf8'), lines=text.match(/[^\n]*\n|[^\n]+$/g)||[];
    total.files++; total.bytes+=data.length; total.physical_lines+=lines.length;
    total.nonblank_lines+=lines.filter(line=>line.trim()).length;
    return total;
  }, {files:0,bytes:0,physical_lines:0,nonblank_lines:0});
}
function writeJson(file,value) { fs.writeFileSync(file,JSON.stringify(value,null,2)+'\n'); }
function execute(command,args,{cwd=output,log}={}) {
  const result=spawnSync(command,args,{cwd,encoding:'utf8',maxBuffer:16e6});
  if(log) fs.writeFileSync(log,(result.stdout||'')+(result.stderr||''));
  assert.equal(result.error,undefined,`${command}: ${result.error}`);
  assert.equal(result.status,0,`${command} failed: ${result.stdout}\n${result.stderr}`);
  return result;
}
function suite(context,suiteClasses,destination) {
  fs.mkdirSync(destination,{recursive:true});
  fs.symlinkSync(path.join(repository,'resources/sampler-140626/data'),path.join(destination,'data'),'dir');
  const result=execute('java',['-ea','-cp',[context.classes,context.testClasses,dependencyJar].join(path.delimiter),
    'org.junit.runner.JUnitCore',...suiteClasses],{cwd:destination,log:path.join(destination,'junit.log')});
  assert.match(result.stdout,/OK \(91 tests\)/,'The original 91-test suite must all pass');
}
const scientificFile = file => !/^(?:run\.json|build\.json|source_sha256\.json|source_snapshot\.tar\.gz|logback\.xml|stdout\.log|stderr\.log)$/.test(file)
  && !file.startsWith('runtime_classes/');
function scientificHashes(directory) {
  return Object.fromEntries(Object.entries(hashes(directory)).filter(([file])=>scientificFile(file)));
}
function compareScientific(actual,expected,label) {
  const actualHashes=scientificHashes(actual),expectedHashes=scientificHashes(expected);
  // The runner copies config.json; the direct baseline receives a copied config too.
  assert.deepEqual(actualHashes,expectedHashes,`Scientific outputs differ: ${label}`);
  return {comparison:label,files:Object.keys(actualHashes).length,identical:true};
}
function sourceRecord(study) {
  const source=path.join(study,'variants/entity-multiplicity-fix/src');
  const files=filesBelow(source),java=files.filter(file=>file.endsWith('.java'));
  return {source:path.relative(repository,source),sha256:hashes(source),all:counts(files),java:counts(java),
    main_java:counts(java.filter(file=>file.includes('/main/java/'))),test_java:counts(java.filter(file=>file.includes('/test/java/'))),
    wrappers:Object.fromEntries(['build_entity_variant.mjs','run_entity_experiment.mjs','test_entity_variant.mjs'].map(name=>{
      const file=path.join(study,'scripts',name);return [name,{sha256:sha256(file),...counts([file])}];
    }))};
}

if(mode==='prepare') {
  if(fs.existsSync(output)) assert.ok(fs.readdirSync(output).every(name=>name==='preservation-before.json'),
    'Refusing to reuse a validation directory containing prior baseline files');
  const sources=studies.map(sourceRecord);
  assert.deepEqual(sources[0].sha256,sources[1].sha256,'Original corrected sources are not identical');
  assert.equal(Object.keys(sources[0].sha256).length,156,'Unexpected corrected source inventory');
  const oldTest=fs.readFileSync(path.join(studies[1],'scripts/test_entity_variant.mjs'),'utf8');
  const suiteClasses=[...oldTest.matchAll(/'(org\.ucb\.[^']+Test)'/g)].map(match=>match[1]);
  assert.equal(suiteClasses.length,26,'Expected the historical 26-class suite');
  fs.mkdirSync(output,{recursive:true});
  writeJson(path.join(output,'before_manifest.json'),{sources,suite_classes:suiteClasses,
    java:execute('java',['-version']).stderr.trim(),javac:execute('javac',['-version']).stdout.trim(),
    dependency_jar:path.relative(repository,dependencyJar),dependency_sha256:sha256(dependencyJar)});
  const before=path.join(output,'before'),classes=path.join(before,'classes'),testClasses=path.join(before,'test-classes');
  fs.mkdirSync(classes,{recursive:true});fs.mkdirSync(testClasses,{recursive:true});
  const source=path.join(studies[1],'variants/entity-multiplicity-fix/src');
  const main=filesBelow(path.join(source,'main/java')).filter(file=>file.endsWith('.java'));
  const tests=filesBelow(path.join(source,'test/java')).filter(file=>file.endsWith('.java')&&!/HMMTest|MathTest|LoggerTest|BernoulliExperimentTest|DpmSuite/.test(file));
  for(const [files,destination,name] of [[main,classes,'main'],[tests,testClasses,'tests']])
    execute('javac',['-nowarn','--release','8','-cp',[classes,testClasses,dependencyJar].join(path.delimiter),'-d',destination,...files],
      {log:path.join(before,`compile-${name}.log`)});
  fs.writeFileSync(path.join(classes,'logback.xml'),'<configuration><root level="OFF"/></configuration>\n');
  suite({classes,testClasses},suiteClasses,path.join(before,'junit'));
  const fixtures=path.join(output,'fixtures');fs.mkdirSync(fixtures);
  const sentences=Array.from({length:60},(_,i)=>({source:`person_${i%6}`,dest:`org_${i%4}`,depPath:`path_${Math.floor(i/6)%5}`}));
  const corpus=path.join(fixtures,'corpus.json');writeJson(corpus,{sentences});
  const cases=[];
  for(const beta of [.1,.001]) for(const frozen of [false,true]) cases.push({name:`beta-${beta}_frozen-${frozen}`,beta,frozen,bridge:0});
  cases.push({name:'beta-0.1_frozen-true_bridge-1',beta:.1,frozen:true,bridge:1});
  for(const item of cases) {
    const config={numRels:4,maxRels:8,numEnts:10,numIterations:100,stepsPerIteration:100,entityFraction:.1,
      alpha:.001,beta:item.beta,sparsity:.001,sparsityA:1,sparsityB:100,seed:20260912,freezeArgumentEntities:item.frozen,checkpointEvery:30};
    if(item.bridge)config.sentenceRelationMoveWeight=item.bridge;
    const configFile=path.join(fixtures,item.name+'.json');writeJson(configFile,config);
    const destination=path.join(before,'runs',item.name);fs.mkdirSync(destination,{recursive:true});
    fs.copyFileSync(configFile,path.join(destination,'config.json'));
    execute('java',['-ea','-Xmx4g',`-Dlogback.configurationFile=${path.join(classes,'logback.xml')}`,'-cp',[classes,dependencyJar].join(path.delimiter),
      'org.ucb.generative_ie.experiments.ControlledNYT',path.join(destination,'config.json'),corpus,destination],
      {cwd:destination,log:path.join(destination,'stdout.log')});
    const summary=JSON.parse(fs.readFileSync(path.join(destination,'summary.json'),'utf8'));
    assert.equal(summary.relation_proposals,9000);assert.equal(summary.entity_proposals,item.frozen?0:1000);
    if(item.frozen)assert.equal(summary.final_changed_argument_mentions,0);
    if(item.bridge)assert.ok(!summary.sentence_relation_move_report.startsWith('sentence relation bridge 0/0 '),'Bridge condition exercised no bridge moves');
  }
  writeJson(path.join(output,'cases.json'),cases);
  writeJson(path.join(output,'prepare_results.json'),{status:'passed',original_source_files:156,junit_tests:91,cases:cases.map(item=>item.name),
    compiled_main_sources:main.length,compiled_test_sources:tests.length,class_hashes:hashes(classes),test_class_hashes:hashes(testClasses)});
  console.log(`Preparation passed: ${output}; 91 JUnit tests, five baseline runs`);
} else {
  const manifest=JSON.parse(fs.readFileSync(path.join(output,'before_manifest.json'),'utf8'));
  const prepared=JSON.parse(fs.readFileSync(path.join(output,'prepare_results.json'),'utf8'));
  assert.equal(prepared.status,'passed');
  assert.equal(sha256(dependencyJar),manifest.dependency_sha256,'Dependency JAR changed');
  const after=path.join(output,'after');assert.ok(!fs.existsSync(after),'Refusing to reuse after-verification outputs');
  const {createBuildContext}=await import('../build.mjs');
  const {runExperiment}=await import('../run.mjs');
  const context=createBuildContext({research:output,buildDirectory:path.join(after,'build')});
  assert.equal(context.variant,path.join(repository,'code/sampler'));
  assert.deepEqual(hashes(path.join(context.variant,'src')),manifest.sources[0].sha256,'Canonical sources changed during consolidation');
  for(const study of studies) {
    assert.equal(fs.realpathSync(path.join(study,'variants/entity-multiplicity-fix/src')),fs.realpathSync(path.join(context.variant,'src')),'Historical source alias does not resolve to canonical source');
    const adapter=await import(pathToFileURL(path.join(study,'scripts/build_entity_variant.mjs')).href);
    assert.equal(adapter.research,study,'Adapter output scope changed');
    assert.equal(adapter.repository,repository);assert.equal(adapter.variant,context.variant);
    assert.equal(adapter.dependencyJar,dependencyJar);
    assert.equal(adapter.classes,path.join(study,'variants/entity-multiplicity-fix/build/classes'));
    assert.equal(adapter.testClasses,path.join(study,'variants/entity-multiplicity-fix/build/test-classes'));
  }
  await context.build();
  assert.deepEqual(hashes(context.classes),prepared.class_hashes,'Compiled main classes differ');
  assert.deepEqual(hashes(context.testClasses),prepared.test_class_hashes,'Compiled test classes differ');
  suite(context,manifest.suite_classes,path.join(after,'junit'));
  const cases=JSON.parse(fs.readFileSync(path.join(output,'cases.json'),'utf8')),comparisons=[];
  const corpus=path.join(output,'fixtures/corpus.json');
  for(const item of cases) {
    const destination=path.join(after,'runs',item.name),config=path.join(output,'fixtures',item.name+'.json');
    const run=await runExperiment(context,[config,destination,corpus]);
    if(run) assert.equal(run.status,'complete','Consolidated runner failed');
    comparisons.push(compareScientific(destination,path.join(output,'before/runs',item.name),`${item.name}: fresh before/after`));
    if(!item.bridge) {
      const study=item.beta===.1?studies[0]:studies[1],stamp=item.beta===.1?'entityfix-1789237190192':'entityfix-1789413029174';
      for(const suffix of [0,1])comparisons.push(compareScientific(destination,path.join(study,'tests',stamp,`${item.frozen?'frozen':'latent'}-${suffix}`),`${item.name}: saved golden ${suffix}`));
    }
    const tar=path.join(destination,'source_snapshot.tar.gz');
    const members=execute('tar',['-tzf',tar]).stdout.trim().split('\n');
    assert.ok(members.every(member=>member==='src/'||member.startsWith('src/')&&!member.split('/').includes('..')),'Unexpected archive member');
    const extracted=path.join(after,'archive-inspection',item.name);fs.mkdirSync(extracted,{recursive:true});
    execute('tar',['-xzf',tar,'-C',extracted]);
    assert.deepEqual(hashes(path.join(extracted,'src')),manifest.sources[0].sha256,'Run snapshot is not a complete materialized source tree');
    fs.rmSync(extracted,{recursive:true}); // Keep the verified archive, not another maintained source copy.
    assert.deepEqual(JSON.parse(fs.readFileSync(path.join(destination,'source_sha256.json'),'utf8')),
      Object.fromEntries(Object.entries(manifest.sources[0].sha256).map(([name,hash])=>['src/'+name,hash])),'Run source manifest changed');
  }
  // Runner protection is part of the behavior preserved by sharing its implementation.
  const first=cases[0],firstConfig=path.join(output,'fixtures',first.name+'.json');
  await assert.rejects(()=>runExperiment(context,[firstConfig,path.join(after,'runs',first.name),corpus]),/existing output|reuse/);
  const invalid=path.join(output,'fixtures/missing-seed.json'),badConfig=JSON.parse(fs.readFileSync(firstConfig,'utf8'));delete badConfig.seed;writeJson(invalid,badConfig);
  const invalidOutput=path.join(after,'missing-seed');
  await assert.rejects(()=>runExperiment(context,[invalid,invalidOutput,corpus]),/seed/);
  assert.ok(!fs.existsSync(invalidOutput),'Invalid config created an output directory');
  const results={status:'passed',source_files_unchanged:156,junit_tests_before:91,junit_tests_after:91,
    compiled_main_files_identical:Object.keys(prepared.class_hashes).length,compiled_test_files_identical:Object.keys(prepared.test_class_hashes).length,
    comparisons,materialized_source_archives_checked:cases.length,legacy_build_adapters_checked:studies.length,
    guards:['existing output rejected','missing seed rejected before output creation'],
    scope:'Source/class identity, 91-test suite, five short runs including fixed/latent entities, beta 0.1/0.001 and bridge, eight saved golden comparisons. No full NYT or Figure 1 rerun; historical Figure 1 has uncontrolled random streams.'};
  writeJson(path.join(output,'verification_results.json'),results);
  console.log(JSON.stringify(results,null,2));
}
