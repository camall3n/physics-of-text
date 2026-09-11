# Handoff: replicating "The Physics of Text" with the archived sampler

Written for an AI coding agent (Claude Fable or Codex) picking this up cold. Read this,
then `resources/sampler-140626/CHANGES.md`, then the code it points at. Everything
below was verified on 2026-09-11 unless marked otherwise.

## 1. Goal and current status

Goal: replicate the results of Russell, Lassen, Uang and Wang, *The Physics of Text:
Ontological Realism in Information Extraction* (2016), `resources/russell-2016-the-physics-of-text.pdf`.
The paper has two results:

- **Figure 1**: precision/recall of same-relation inference versus lexical entropy on
  synthetic worlds, averaged over 8 runs.
- **Section 4**: unsupervised relation discovery on an 8500-sentence NYT subset. About
  200 relations, a "subsidiary of" relation (relation 46) with 60 facts, roughly 95%
  precision on the 20 most common relations, after about 10 minutes of MCMC.

Status:

- The Java sampler in `resources/sampler-140626/` builds and runs without Maven, has a
  verified joint probability, and infers the number of relations. Two commits on
  `main` (6812ca1, 8a2939a) contain all of that work.
- Section 4 has been reproduced in miniature only: a 250-sentence slice yields clean
  relations ("director of", "chairman of", "president of", "leader") and a posterior
  of 24 to 28 relations. The full 8516-sentence run has not been attempted.
- Figure 1 has not been attempted. Its whole pipeline exists but is commented out.
- The owner intends to port this to another language. Section 9 has notes for that.

There is no BLOG code anywhere in the tar, despite the paper's "10 lines of BLOG".
The Java sampler is a hand-derived Gibbs/MH sampler for one fixed model, written
because BLOG was too slow. Don't go looking for BLOG; don't install it.

## 2. Repository layout

```
resources/
  russell-2016-the-physics-of-text.pdf   the paper
  wang-2015-sdds-mcmc.pdf                 the entity split-merge sampler (UAI 2015)
  yao-2011-structured-relation-discovery.pdf  source of the NYT preprocessing
  sampler-140626.tar                      original tar, UNTRACKED, never commit it
  sampler-140626/                         the code (June 2014 snapshot + our commits)
    CHANGES.md        what we changed and every bug found; read it
    build.sh          javac build/test/run (no Maven)
    src/main/java/org/ucb/generative_ie/   model, samplers, experiments
    src/test/java/...                      JUnit 4 tests
    data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json   the 8516-sentence NYT subset
    data/06-19/pluieTriples-1.json         250-sentence slice used for the small run
    data/06-19/toyTriples.json             10-sentence toy (wrote/authored, love/like)
    test/Entity_resolution_Relation/config-*.json   run configs (see section 5)
    results/, output/, output-*/           2013-2014 outputs left by the authors
    scripts/graph_precision_recall.py      plots Figure 1 (python2, needs scipy)
venv/                                      python3 venv (has pypdf, matplotlib, numpy; no scipy)
```

Corpus format: JSON `{"sentences":[{"source","dest","depPath"}]}`. Each sentence is
two named-entity strings and a dependency path between them.

## 3. The model as implemented

Fixed pool of relations `r`, entities `e` (count N, inferred in the entity phase),
sentences `s` from the corpus.

```
N          ~ discrete log-normal centred on numEnts            WorldProb.logEntityNumber
K_used     ~ discrete log-normal centred on numRels             WorldProb.logRelationNumber
sigma_r    ~ Beta(a, b) per relation, integrated out            (or a constant sigma)
holds(r,x,y) ~ Bernoulli(sigma_r) for every pair (x,y)          WorldProb.logProbFacts / logFactTerm
origin(s)  ~ Uniform(true facts)                                WorldProb.logSentencesOrigin
D_r        ~ Dirichlet(beta) over dependency paths, collapsed   WorldProb.logCollapsedTriggers
L_e        ~ Dirichlet(alpha) over noun strings, collapsed      WorldProb.logCollapsedNouns
trig(s)    ~ D_{rel(origin(s))};  arg1(s) ~ L_{ent1(origin(s))};  arg2(s) likewise
```

`WorldProb.logProb()` is the full joint. `WorldProb.logProbEntityWorld()` is the older
entity-only model (uniform entity per mention instead of facts and origins) that the
entity split-merge samplers were derived for; keep it, they need it.

The invariant every sampler relies on: every sentence's origin is an existing fact,
and no fact refers to a removed entity. `World.syncFacts()` restores it; `logProb()`
throws if a sentence's origin is missing.

## 4. Code map

Entry point: `experiments/EntityResolution.main(config.json, corpus.json)`.
It runs two phases on one `World`:

1. **Entity phase** (`mcmc/EntityInferSteps`, `mh/Entity*Step`): smart-split/dumb-merge
   and smart-merge/dumb-split moves on mention-to-entity assignments. This is the SDDS
   sampler of the UAI 2015 paper. We did not change its logic. It takes most of the
   running time.
2. **Relation phase** (`mcmc/WorldInferSteps`), a random scan over:
   - `FactBirthDeathStep`: MH birth/death of facts no sentence reports;
   - `SentenceOriginRV`: Gibbs on one sentence's origin (relation, then each argument
     entity) among existing facts;
   - `FactRelationMoveStep`: MH transfer of one fact and all its sentences to a relation
     lacking a fact for that entity pair. This is the move that lets relations form.

Other things to know:

- `world/World`, `Facts`, `Sentences`, `Sentence`, `Mention`: state plus indexes.
  `Sentences.update` is the single mutation path when an origin changes; it maintains
  every histogram and index. Do not add a second path.
- `inference/ObserveProb` writes `logprobs.txt` (every term of the joint per iteration,
  plus `relations_used` and `relations_with_sentences`) and `map_world.txt`.
  `RelationTriggersObserver` writes `relation_triggers.txt` at the best
  collapsed-trigger likelihood seen, which is a snapshot, not the final state.
- `experiments/ConfigParser`: config fields are listed in section 5.
- `generator/WorldGenerator.sampleWorld()`: samples a world from the model; used for
  the initial state and for tests.
- Dead code you can ignore: everything in `src/test/java/org/ucb/generative_ie/mh/`
  (Justin Uang's 2013 MH framework, superseded), `mh/BetaSparsityRV`,
  `generator/BetaSparsityGenerator`, `experiments/EntityNumberDistToy`, the `dpm`
  package (UAI paper's DPMM comparison), `RejectionSamplingInferer`.

## 5. Build, test, run

No Maven. `build.sh` compiles with `javac` (Java 8 is on the machine) against jars
already in `~/.m2`. Four tests that need the dead `jahmm` dependency are skipped.

```
cd resources/sampler-140626
./build.sh                         # compile into target-javac/
./build.sh test                    # WorldProbTest only
./build.sh test org.ucb.generative_ie.mcmc.RelationMovesTest org.ucb.generative_ie.world.SentencesIndexTest
./build.sh run org.ucb.generative_ie.experiments.EntityResolution \
    test/Entity_resolution_Relation/config-toy.json data/06-19/toyTriples.json
```

Full fast suite (33 tests, all pass): `RelationMovesTest WorldProbTest SentencesIndexTest
ModelFunctionsTest LexEntropyTest SentenceEvidenceTest CounterTest LogProbMapTest
DirichletDistrTest RandomAccessHashSetTest UtilTest CorpusParserTest`.
`NormalProbMapTest` fails by construction in the original code; ignore it.

Config fields (`ConfigParser`):

| field | meaning |
|---|---|
| `numEnts` | initial entity count; prior centre for N |
| `numRels` | prior centre for relations in use |
| `maxRels` | relation pool size (0 = numRels, i.e. fixed count as in the archive) |
| `numIterations` | total; 1/5 entity phase, 4/5 relation phase; 50 moves each |
| `alpha`, `beta` | Dirichlet concentrations for noun and path dictionaries |
| `sparsity` | constant sigma, also used to sample the initial world |
| `sparsityA`, `sparsityB` | Beta prior on per-relation sparsity (0 = use constant) |

Configs on disk: `config-toy.json` (archive), `config-8000.json` (the authors' NYT-scale
config: 100 relations, 3000 entities, 50k iterations, alpha=beta=0.001,
sigma=1e-4), `config-250-inferK.json` (our 250-sentence run).

Gotchas:

- The run writes to `output/` **relative to the current directory**. Run from a scratch
  directory, or you will overwrite the archived `output/` files (which are gitignored
  but are the only copy).
- `DirichletDistrTest` writes `dirichlet.output` in the sampler root. Run
  `git checkout -- resources/sampler-140626/dirichlet.output` after running tests.
- Logging is DEBUG for anything not listed in `src/main/resources/logback.xml`; grep
  `DEBUG|TRACE|++Iteration` out of stdout.
- The 250-sentence run takes 5 minutes; the entity phase is most of it.

## 6. What was done (details in CHANGES.md)

Commit 6812ca1: reconstructed the relation part of the joint (it was commented out of
`logProb()`), and fixed six bugs in the archive that this exposed: facts and origins
drifting apart between phases, a mention index never cleared (phantom mentions in the
entity phase), the entity step mutating live histograms, the same step squaring the
noun likelihood, stale mention objects after relation-phase moves, and NaN edge cases.

Commit 8a2939a: made the relation count inferable: Beta sparsity integrated out,
relation pool with a log-normal prior on occupancy, the two new moves above, and
`RelationMovesTest`.

The verification pattern used throughout, and the one to keep using: every sampler
move exposes its log-odds or log-acceptance as a public method, and a test compares it
to the difference of `WorldProb.logProb()` between the two states (plus the log
proposal ratio for MH moves), to 1e-7, on a world sampled from `WorldGenerator`. If a
new move does not have such a test, assume it is wrong.

## 7. Results so far

Toy (10 sentences, 2 true relations): with `beta=0.01` the posterior over relations
with sentences spreads over 3 to 6; with `beta=0.5` it concentrates on 2 to 3 and
`wrote`/`authored` and `love`/`like` merge. Reason: a tiny Dirichlet concentration
makes a one-path relation much cheaper than a two-path one, which cancels the
sparsity argument for merging. **The paper's bootstrapping argument holds only if
`beta` is not tiny. Pick it deliberately.**

250-sentence NYT slice (`config-250-inferK.json`, `beta=0.1`, Beta(1, 265^2) sparsity,
pool 40, prior centre 10): posterior over relations with sentences 24 to 28, still
drifting down after 3000 iterations. Clean clusters for director-of (25 sentences),
chairman-of (25), leader (39), president-of (21); president-of duplicated in a second
relation (9), because merging two relations needs many single-fact moves through
unfavourable states.

## 8. Recommended next steps, in order

1. **Relation split-merge move.** The mixing bottleneck. Split: pick a relation, divide
   its facts (and their sentences) into two relations, one of them empty from the pool.
   Merge: move all facts of one relation into another (skipping pairs that would
   collide, or rejecting). Use `FactRelationMoveStep.logAcceptance` as the template for
   the terms (collapsed triggers, fact terms per relation, occupancy prior), and
   `EntitySmartSplitStep` for the smart/dumb proposal idea. Write the joint-difference
   test first.
2. **Noun-aware initialisation.** `SentenceEvidence.evidenceToWorld` assigns each
   sentence a uniformly random existing fact, ignoring its nouns, and
   `WorldGenerator.sampleFacts` loops over every pair times relation (billions at NYT
   scale). Replace with: one entity per distinct noun string (or a random one if
   `numEnts` is smaller), one fact per sentence with a random relation. Facts are then
   created through `Sentences.update`'s auto-add.
3. **NYT-scale run** on `pluieTriples_2013_01_06_5.json` with `config-8000.json` plus
   `maxRels` (try 400), `sparsityA=1`, `sparsityB=N^2`, `beta` around 0.1. Watch the
   entity phase's running time first; it is O(mentions) per smart move.
   Compare against the paper's relation-46 dictionary (listed in the paper) and the
   2013 outputs in `results/output.txt`, which show a "subsidiary of" cluster.
4. **Figure 1.** Port the commented body of
   `src/test/java/org/ucb/generative_ie/world/SampleEntropyTest.java` to the current
   API (WorldGenerator's 9-argument constructor, `MCMCInferer(n, world, evidence, rng, steps)`,
   `Inferer.addQuery`/`run(burnin)`; `SentenceSameRelations`, `PrecisionRecallCurve`,
   `LexEntropy` and `SampleEntropy` are unchanged). It writes `prec_recall.out`;
   `scripts/graph_precision_recall.py` plots it (python2 syntax, needs scipy).
5. Precision evaluation for Section 4: manual, per the paper. Emit the top-20 relations
   with their facts in a reviewable form.

## 9. Notes for a port to another language

What is worth keeping: the model in section 3, the collapsed conditionals in
`SentenceOriginRV`, `FactRV`, `FactRelationMoveStep`, `ModelFunctions.logMoveTriggersRatio`,
and the test discipline in section 6. What is not: the index bookkeeping in
`Sentences` (five multimaps and two histogram maps kept in sync by hand), the
`Mention`/`Sentence`/`Fact` object web, the observer classes, and the entity samplers'
static acceptance counters. A port should keep counts (facts per relation, trigger
histogram per relation, noun histogram per entity, sentences per fact) as the primary
state and derive everything else. `ModelFunctions.logGammaTmp` is just
`lgamma(base + extra) - lgamma(base)` computed by a product loop; replace it.

The entity samplers (`mh/Entity*`) are the hardest part to port faithfully; the UAI
2015 paper describes them, and `EntitySmartSplitStep` is the cleanest of the five.

## 10. Where things are on disk

- Small-run outputs from our sessions are in the session scratchpad only; regenerate
  them with the commands above. Nothing under `output/` in the repo is ours.
- The extracted paper text used for reference lives nowhere permanent; re-extract with
  `venv/bin/python3 -c "from pypdf import PdfReader; ..."` if needed.
