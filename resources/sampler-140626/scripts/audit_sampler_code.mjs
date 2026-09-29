import fs from 'node:fs';
import path from 'node:path';
import cp from 'node:child_process';
import os from 'node:os';
import {fileURLToPath} from 'node:url';

// Compile current sources; the archived JAR supplies dependencies only.
// Historical failing-probe outputs in evaluation/code_audit remain untouched.
const sampler=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const output=path.join(sampler,'results/nyt-2026/evaluation/code_fixes');
const scratch=fs.mkdtempSync(path.join(os.tmpdir(),'physics-sampling-tests-'));
const jar=path.join(sampler,'target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar');
const beforeRevision='13c3605';
const verifyBefore=process.argv.includes('--verify-before');
const requested=process.argv.slice(2).filter(x=>x!=='--verify-before');
const regressionTests=[
  'mcmc.FactBirthDeathRegressionTest','mcmc.RelationNumericsTest',
  'mcmc.WorldInferStepsEmptyCorpusTest','mcmc.SentenceSamplingRegressionTest',
  'mh.EntityProposalRegressionTest','mh.MHAcceptanceNumericsTest',
  'util.ProbabilityNormalizationTest','inference.ModelFunctionsWorldParametersTest',
  'inference.InferenceOutputRegressionTest','inference.InfererBurninTest',
];
const existingTests=[
  'mcmc.RelationSplitMergeTest','mcmc.RelationMovesTest','world.WorldProbTest',
  'world.SentencesIndexTest','inference.ModelFunctionsTest','world.LexEntropyTest',
  'world.SentenceEvidenceTest','util.CounterTest','util.LogProbMapTest',
  'util.NormalProbMapTest','random.DirichletDistrTest','util.RandomAccessHashSetTest',
  'util.UtilTest','experiments.CorpusParserTest',
];
const classes=names=>names.map(x=>x.startsWith('org.')?x:'org.ucb.generative_ie.'+x);
fs.mkdirSync(output,{recursive:true});
for(const p of ['classes','test-classes'])fs.mkdirSync(path.join(scratch,p));
fs.symlinkSync(path.join(sampler,'data'),path.join(scratch,'data'),'dir');
const logging=path.join(scratch,'logback.xml');
fs.writeFileSync(logging,'<configuration><root level="OFF"/></configuration>\n');
const sources=folder=>cp.execFileSync('rg',['--files',path.join(sampler,folder)],{encoding:'utf8'}).trim().split('\n').filter(f=>f.endsWith('.java'));
const compile=(files,dest,classpath)=>cp.execFileSync('javac',['--release','8','-nowarn','-cp',classpath,'-d',path.join(scratch,dest),...files],{encoding:'utf8'});
const mainCP=path.join(scratch,'classes')+path.delimiter+jar;
const fullCP=path.join(scratch,'classes')+path.delimiter+path.join(scratch,'test-classes')+path.delimiter+jar;
const run=(file,clazz,args=[],classpath=fullCP,expectFailure=false)=>{
  const r=cp.spawnSync('java',['-ea','-Dlogback.configurationFile='+logging,'-cp',classpath,clazz,...args],{cwd:scratch,encoding:'utf8',maxBuffer:20*1024*1024});
  fs.writeFileSync(path.join(output,file),(r.stdout??'')+(r.stderr??'')+(r.error?.stack??''));
  if(expectFailure ? r.status!==1 : r.status!==0)throw Error(`${clazz} exited ${r.status}; see ${path.join(output,file)}`);
  console.log(`${clazz}: ${expectFailure?'expected regression failures; ':''}recorded ${file}`);
  if(clazz==='org.junit.runner.JUnitCore')console.log(r.stdout.match(/OK \(\d+ tests\)|Tests run:.*|FAILURES!!!/g)?.join('\n')??'');
};
try {
  compile(sources('src/main/java'),'classes',jar);
  // These archive-only tests import unavailable HMM/DPM or obsolete logging APIs.
  compile(sources('src/test/java').filter(f=>!/HMMTest|MathTest|LoggerTest|BernoulliExperimentTest|DpmSuite/.test(f)),'test-classes',mainCP);
  compile(sources('scripts/audit-probes'),'test-classes',mainCP);
  run(requested.length?'focused_tests.txt':'regression_tests.txt','org.junit.runner.JUnitCore',classes(requested.length?requested:[...existingTests,...regressionTests]));
  if(!requested.length){
    run('entity_probe.txt','org.ucb.generative_ie.mh.EntityAuditProbe');
    run('fact_proposal_probe.txt','FactProposalProbe');
    run('sentence_conditional_probe.txt','SentenceConditionalProbe');
    run('target_density_probe.txt','TargetDensityAuditProbe');
  }
  if(verifyBefore){
    const oldFiles=['util/LogProbMap.java','util/NormalProbMap.java','util/Util.java',
      'mh/EntitySmartSplitStep.java','mh/EntitySmartMergeStep.java','mh/GeneralMHStep.java',
      'mcmc/FactBirthDeathStep.java'];
    fs.mkdirSync(path.join(scratch,'before-classes'));
    const files=oldFiles.map(rel=>{
      const dest=path.join(scratch,'before-src',rel);fs.mkdirSync(path.dirname(dest),{recursive:true});
      fs.writeFileSync(dest,cp.execFileSync('git',['show',`${beforeRevision}:resources/sampler-140626/src/main/java/org/ucb/generative_ie/${rel}`],{cwd:sampler}));
      return dest;
    });
    compile(files,'before-classes',mainCP);
    run('before_regression_tests.txt','org.junit.runner.JUnitCore',classes([
      'util.ProbabilityNormalizationTest','mh.MHAcceptanceNumericsTest',
      'mh.EntityProposalRegressionTest','mcmc.FactBirthDeathRegressionTest',
      'mcmc.SentenceSamplingRegressionTest',
    ]),path.join(scratch,'before-classes')+path.delimiter+fullCP,true);
  }
  fs.writeFileSync(path.join(output,'run.json'),JSON.stringify({
    currentSources:true, historicalRevisionForCounterfactual:verifyBefore?beforeRevision:null,
    command:'node scripts/audit_sampler_code.mjs'+process.argv.slice(2).map(x=>' '+x).join(''),
    java:cp.execFileSync('java',['--version'],{encoding:'utf8'}).trim(),
    testClasses:classes(requested.length?requested:[...existingTests,...regressionTests]),
    excludedArchiveTests:['HMMTest','MathTest','LoggerTest','BernoulliExperimentTest','DpmSuite'],
    completedAt:new Date().toISOString(),
  },null,2)+'\n');
  console.log('Current-source regression checks completed; saved NYT inference outputs are unchanged.');
} finally { fs.rmSync(scratch,{recursive:true,force:true}); }
