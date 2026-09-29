# Controlled NYT runner: isolation, reproducibility, and fixed argument identities

All changes described here live in `experiments/nyt-precision-investigation-2026-09-12/`. The previous sampler source, compiled outputs, and experiment results are untouched. `baseline/src/` is the reference snapshot; `variants/controlled/src/` is the runnable research copy.

## What changed and why

| Research file, under `variants/controlled/src/main/java/org/ucb/generative_ie/` | Change | Effect on the statistical model |
|---|---|---|
| `experiments/ControlledNYT.java` | New entry point requires explicit `seed`; provides independent initialization, entity scan, entity proposal, relation scan, relation proposal, and Gamma streams. Writes immutable initial/post-entity/final sentence assignments, the same MAP/trace reports, argument drift, proposal counts, and periodic sentence/fact snapshots. | Seeding and extra observation do not change the target. Unlike the old entry point, relation random numbers are not consumed by the entity phase. This enables repeatable comparisons, not exact replay of an old unseeded trajectory. |
| `mcmc/EntityInferSteps.java`, `mcmc/WorldInferSteps.java` | Add explicit scan RNG injection. Previously, each iteration constructed an independently unseeded `Random`. | Same scan probabilities and transitions when the optional new move is off. |
| `util/ProbMap.java` | Use `LinkedHashMap` for categorical weights. | Same normalized probabilities. CDF order is reproducible; the old enum-key `HashMap` order depended on JVM object identity hashes. Individual sample trajectories can therefore differ even with the same RNG seed. |
| `random/DirichletDistr.java` | Explicit research seed for a private Gamma stream and the existing all-underflow fallback. | Same Gamma law and existing fallback; this change is reproducibility plumbing. `emptyWorld()` really does sample dictionaries, although active NYT moves integrate dictionaries out. |
| `world/World.java`, `mcmc/SentenceOriginRV.java` | Add `freezeArgumentEntities`; when enabled, keep relation resampling and suppress both argument-entity Gibbs updates. The new entry point also skips all entity-phase moves. | This is an explicit conditional-model experiment, described below. It is not merely an implementation repair. |
| `mcmc/WorldInferSteps.java` | Optional `sentenceRelationMoveWeight`, default zero, adds the independently audited `SentenceRelationBirthDeathMove`. | This extra Metropolis–Hastings kernel is intended to retain the same target while improving traversal; its mathematics and exhaustive tests are documented by the kernel audit. Its positive weight changes the share of the fixed move budget spent on the existing kernels. |

The generator's unused `world.rng` is also set explicitly. Other legacy entry points are not promised reproducible: reproducibility here is for `ControlledNYT` and the active NYT paths it uses, with the recorded Java version and dependency bundle. Content-based entity/relation/fact/string hash codes are stable in this path. Separate-JVM replay tests check actual states and full traces, not only the presence of a seed field.

## The argument identity choice, mathematically

Let the observed triple at row \(s\) be \((n_{s1},t_s,n_{s2})\). Its latent originating fact is \(z_s=(r_s,e_{s1},e_{s2})\). Let \(F\) be the set of true latent facts and \(S\) the number of observed rows. The existing collapsed target includes

\[
\pi(F,z,N\mid n,t)\propto p(F\mid N)\,g(K)\,p(N)\,
 |F|^{-S}
 \prod_r D_{\beta}(c_{r,\cdot})
 \prod_e D_{\alpha}(d_{e,\cdot}),
\]

where \(D_a(c)=B(a\mathbf1+c)/B(a\mathbf1)\) is the Dirichlet-integrated likelihood, \(c\) counts dependency paths, \(d\) counts noun mentions, and the state requires every sentence origin to exist in \(F\). The relation-slot/count prior in this equation is deliberately unchanged; the separately documented pool-size problem remains.

The frozen variant fixes a deterministic initial mapping \(h\) from each distinct noun string to an entity. It samples

\[
\pi_{\mathrm{frozen}}(F,r\mid n,t)
 \propto \pi(F,z,N\mid n,t)
 \prod_{s,j}\mathbf1[e_{sj}=h(n_{sj})],
\]

with \(N\) fixed at its initialized value. The entity-count factor and noun-dictionary likelihood are consequently constants for the relation/fact moves, though the common reporting code still includes these constants in the logged joint. Equal strings always remain the same entity; different strings remain different entities. This disables alias resolution and also prevents the sampler from merging unrelated proper names. Whether that matches the article's intended NYT treatment is a modeling question, not a result of the tests.

For a sentence with fixed pair \((a,b)\), a relation Gibbs step among currently existing facts has weights

\[
w_r=\mathbf1[(r,a,b)\in F]\,
\frac{c^{-s}_{r,t_s}+\beta}{C^{-s}_r+\beta T}.
\]

The new regression test enumerates those candidate joint probabilities independently with `WorldProb`, verifies that log-weight differences equal log-joint differences, and checks normalized weights sum to one. Freezing therefore keeps a valid conditional Gibbs update; it does not arbitrarily alter its probabilities. Fact birth/death, fact relation moves, and relation split/merge moves still operate as before and preserve the fixed argument assignment.

## Budget convention

The runner computes `configuredEntityIterations = round(numIterations * entityFraction)` and `relationIterations = numIterations - configuredEntityIterations`. Freezing makes the number of executed entity iterations zero but **does not reassign those iterations to the relation phase**. With `numIterations=1000`, `entityFraction=0.02`, and `stepsPerIteration=2000`, both conditions receive 1,960,000 relation proposals. The latent-argument condition additionally receives 40,000 entity proposals. This controls relation search effort while making the conditional-model difference explicit.

With a positive optional bridge weight \(w\), scan weights are fact birth/death 1, sentence-origin Gibbs 1, fact-relation move 1, smart relation split 0.2, smart relation merge 0.2, and bridge \(w\). Thus the bridge receives \(w/(3.4+w)\) of relation proposals in expectation; the old moves collectively receive \(3.4/(3.4+w)\). A weight-1 experiment is not an additive 29.4% increase in total work: its total proposal budget stays fixed.

## Config and reproduction

`seed` is required. `freezeArgumentEntities` defaults to false; `sentenceRelationMoveWeight` defaults to 0; `checkpointEvery` defaults to 100. All old numeric configuration fields retain their previous meanings. Frozen mode rejects an entity pool smaller than the number of distinct nouns, since otherwise the initializer would merge noun strings at random.

From the repository root:

```sh
node experiments/nyt-precision-investigation-2026-09-12/scripts/build_controlled.mjs
node experiments/nyt-precision-investigation-2026-09-12/scripts/test_controlled.mjs
node experiments/nyt-precision-investigation-2026-09-12/scripts/run_experiment.mjs CONFIG_JSON NEW_RUN_FOLDER
```

The optional third argument to `run_experiment.mjs` is a corpus JSON path; the default is the unchanged 8,516-row NYT corpus. Output must be a nonexistent directory inside this investigation. The script checks sources against the build manifest, copies compiled classes into each run's own `runtime_classes/` before launching, snapshots exact source/config, hashes the corpus and dependency bundle, records Java version and command, and hashes outputs on completion. Later source changes or rebuilds cannot change a running experiment's classes.

`checkpoints/sentences_*.tsv` plus `checkpoints/facts_*.json` preserve every sentence assignment and all true facts at those checkpoints, including unexpressed facts. They are inspection snapshots, **not resumable sampler checkpoints**: they do not serialize RNG state, entity allocation counters, or all collection ordering. Exact replay currently means restarting from the recorded config and seed.

## Tests

`scripts/test_controlled.mjs` saves each test attempt in a new `tests/controlled-*` directory and updates `tests/latest_controlled_test.txt` to its path. It runs 22 JUnit tests (five new controlled tests and 17 inherited relation/fact/Gibbs tests), then four independent Java processes: twice with latent arguments, twice frozen. The comparison requires exact checksums for initialized, post-entity, MAP, and final sentence TSVs, MAP descriptions, full log-probability traces, summaries, and checkpoint summaries.

New assertions cover both argument entities after every frozen sentence draw despite available alternatives, all fixed-argument world kernels across 15,000 proposals, non-frozen ability to move arguments, full-joint conditional probabilities, probability normalization, and deterministic Gamma/underflow fallback. The frozen process additionally must record zero argument drift and the same relation proposal count as the latent process. More tests for the optional bridge are separate from these baseline controls.
