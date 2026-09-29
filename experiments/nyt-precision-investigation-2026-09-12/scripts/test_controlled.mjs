import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {spawnSync} from 'node:child_process';
import {research,classes,testClasses,dependencyJar,sha256,build} from './build_controlled.mjs';

build();
const tests=path.join(research,'tests',`controlled-${Date.now()}`); fs.mkdirSync(tests,{recursive:true});
const junit=spawnSync('java',['-ea','-cp',`${classes}:${testClasses}:${dependencyJar}`,'org.junit.runner.JUnitCore','org.ucb.generative_ie.mcmc.ControlledNYTRegressionTest','org.ucb.generative_ie.mcmc.SentenceSamplingRegressionTest','org.ucb.generative_ie.mcmc.RelationMovesTest','org.ucb.generative_ie.mcmc.RelationSplitMergeTest','org.ucb.generative_ie.mcmc.FactBirthDeathRegressionTest'],{encoding:'utf8'});
fs.writeFileSync(path.join(tests,'junit.log'),junit.stdout+junit.stderr);
assert.equal(junit.status,0,junit.stdout+junit.stderr);
const sentences=[];
for(let i=0;i<60;i++) sentences.push({source:`person_${i%6}`,dest:`org_${i%4}`,depPath:`path_${Math.floor(i/6)%5}`});
const corpus=path.join(tests,'corpus.json'); fs.writeFileSync(corpus,JSON.stringify({sentences},null,2)+'\n');
const results=[];
for(const freeze of [false,true]) {
  const config={numRels:4,maxRels:8,numEnts:10,numIterations:100,stepsPerIteration:100,entityFraction:.1,alpha:.001,beta:.1,sparsity:.001,sparsityA:1,sparsityB:100,seed:20260912,freezeArgumentEntities:freeze,checkpointEvery:30};
  const configPath=path.join(tests,`config-${freeze}.json`); fs.writeFileSync(configPath,JSON.stringify(config,null,2)+'\n');
  const runs=[];
  for(let i=0;i<2;i++) {
    const output=path.join(tests,`${freeze?'frozen':'latent'}-${i}`);
    const run=spawnSync('node',[path.join(research,'scripts/run_experiment.mjs'),configPath,output,corpus],{encoding:'utf8'});
    assert.equal(run.status,0,run.stdout+run.stderr); runs.push(output);
  }
  for(const filename of ['initial_world_sentences.tsv','post_entity_world_sentences.tsv','map_world_sentences.tsv','final_world_sentences.tsv','logprobs.txt','summary.json','checkpoints.json','map_world.txt','map_world_mentions.txt']) {
    assert.equal(sha256(path.join(runs[0],filename)),sha256(path.join(runs[1],filename)),`Replay mismatch: frozen=${freeze}, ${filename}`);
  }
  const summary=JSON.parse(fs.readFileSync(path.join(runs[0],'summary.json'),'utf8'));
  assert.equal(summary.relation_proposals,9000);
  if(freeze) { assert.equal(summary.entity_proposals,0); assert.equal(summary.final_changed_argument_mentions,0); }
  results.push({freezeArgumentEntities:freeze,summary,exact_replay:true});
}
fs.writeFileSync(path.join(tests,'results.json'),JSON.stringify(results,null,2)+'\n');
fs.writeFileSync(path.join(research,'tests/latest_controlled_test.txt'),path.relative(research,tests)+'\n');
console.log(junit.stdout.trim()); console.log(`Independent-JVM replay and frozen-argument checks passed: ${tests}`);
