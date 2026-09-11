# Changes to the archived sampler (September 2026)

This directory is the June 2014 tar of the Java sampler behind Russell, Lassen, Uang
and Wang, *The Physics of Text: Ontological Realism in Information Extraction* (2016).
The goal of these changes is to replicate the paper's relation-discovery experiment
(Section 4) on the 8516-sentence NYT subset in `data/Umass-sub-corpus/`.

The entry point for that experiment is
`org.ucb.generative_ie.experiments.EntityResolution <config.json> <corpus.json>`, which
runs an entity-resolution phase (the split-merge samplers of Wang and Russell, UAI 2015)
followed by a relation-discovery phase (Gibbs steps on facts and sentence origins).
`test/Entity_resolution_Relation/config-8000.json` is the NYT-scale configuration left
by the original authors.

## Building without Maven

Maven is not installed and the `jahmm` repository in `pom.xml` is dead. All other
dependencies are already in `~/.m2`, so `build.sh` compiles with `javac` directly:

    ./build.sh                 # compile into target-javac/
    ./build.sh test            # run WorldProbTest (or pass test class names)
    ./build.sh run org.ucb.generative_ie.experiments.EntityResolution \
        test/Entity_resolution_Relation/config-toy.json data/06-19/toyTriples.json

The four tests that need `jahmm` (`HMMTest`, `MathTest`, `LoggerTest`,
`BernoulliExperimentTest`) are skipped. `NormalProbMapTest` fails by construction in
the original code (it samples from an all-zero map) and is unrelated.

## Reconstruction of the relation part of the joint probability

`WorldProb.logProb()` in the archive summed only the entity-model terms; every relation
term (`logProbFacts`, `logSentencesOrigin`, `logCollapsedTriggers`) was written but
commented out of the total. Consequences: the MAP world recorded by `ObserveProb`
during the relation phase was chosen by a probability that ignored relations, and the
debug assertion in `GeneralMHStep` could not check any relation move.

`WorldProb` now implements the joint of the model as `WorldGenerator` actually
generates it (paper Section 3, dictionaries integrated out):

    N            ~ discrete log-normal                     logEntityNumber()
    holds(r,x,y) ~ Bernoulli(sigma) for all r, x, y        logProbFacts()
    origin(s)    ~ Uniform(true facts)                     logSentencesOrigin()
    trig(s)      ~ Categorical(D_r), D_r ~ Dirichlet(beta) logCollapsedTriggers()
    arg(s)       ~ Categorical(L_e), L_e ~ Dirichlet(alpha) logCollapsedNouns()

`logProb()` returns this. The entity-only model used by the split-merge samplers is
kept as `logProbEntityWorld()`. Entities are labelled objects in the fact model, so the
permutation factor of the entity model (`logUnlabeledEntities`) is not part of the
fact-model joint; with it included the Gibbs steps would not be exact.

`WorldProbTest` checks each term against a hand calculation and, more importantly,
checks that the three relation-phase Gibbs conditionals equal ratios of this joint:

- `FactRV.logOddsExists()` versus `logProb()` with the fact toggled on and off;
- `SentenceOriginRV.relationLogWeights()` versus `logProb()` with the sentence moved
  to each candidate relation;
- `SentenceOriginRV.entityLogWeights(source)` versus `logProb()` with the sentence
  moved to each candidate entity.

`ObserveProb` now writes every term to `logprobs.txt` (`total`, `facts`, `origin`,
`collapsed_trigs`, `collapsed_nouns`, `entity_number`, `entity_only`).

## Bugs found and fixed on the way

All of these are in the archived code, not introduced by the reconstruction. Each is
covered by `WorldProbTest` or `SentencesIndexTest`.

1. **Facts and sentence origins drifted apart between phases**
   (`Sentence.setMention`, `World`, `EntityResolution`). When an entity sampler moved a
   mention to another entity it built a new origin `Fact` for the sentence but never
   added it to `World.facts`, and facts referring to removed entities stayed behind.
   The relation phase then sampled origins from a fact set that did not contain the
   sentences' own facts. The old `evidence.makeWorldPossible(world)` call that repaired
   this had been deleted. Fix: `Sentences.update` adds a newly assigned origin to the
   fact set, `World.syncFacts()` prunes facts of removed entities and adds missing
   origins, and `EntityResolution` calls it between the two phases. `logProb()` throws
   if a sentence's origin is not a fact.

2. **`Sentences.clear()` did not clear the mention index** (`Sentences`).
   `SentenceEvidence.evidenceToWorld` clears a world that `WorldGenerator.sampleWorld()`
   had already filled with random sentences, then adds the corpus sentences. The
   per-entity mention index kept the discarded sentences' mentions, so the entity phase
   ran with twice as many mentions as sentences, half of them phantoms. `EntityMap`
   was unaffected (it samples an empty world). Fix: clear `mentionsToEntity` too.

3. **The entity step of the relation phase corrupted the noun histograms**
   (`SentenceOriginRV.probEntityName`). It fetched the live noun histogram of an entity
   and called `remove(noun)` on it, permanently deleting one occurrence every time a
   probability was computed. Over a run this drained the histograms to nothing, which
   also corrupted `logCollapsedNouns`. Fix: the step now works on copies.

4. **The same step counted the noun likelihood twice**
   (`SentenceOriginRV.sampleEntityFact`). It multiplied the collapsed predictive
   probability of the noun by `probEntityName`, which computed the same predictive
   again. No joint has that factor squared. Fix: `entityLogWeights` uses the
   predictive once; the test above verifies it against the joint.

5. **Relation-phase entity moves left mentions stale** (`Sentence`, `Sentences`,
   `Mention`). `Sentence.setOrigin` updated the histograms but not the `Mention`
   objects or the per-entity mention index, so after the relation phase
   `Mention.getEntity()` and `getMentionsByEntity` disagreed with the sentence origins,
   and `getNonEmptyEntitySize` was wrong. There were two half-overlapping update paths
   (`Sentences.update` and `Sentences.updateMentions`). Fix: `setOrigin` is the single
   mutation path and `Sentences.update` maintains every index, including mentions.
   `updateMentions` is removed. This also fixed the doubled trigger counts that
   `RelationTriggersObserver` printed in `relation_triggers.txt`.

6. **`FactRV` produced NaN or an exception in edge cases** (`FactRV`). With no
   sentences it computed `0 * log(inf)`; with the fact being the only one it raised
   "Infinite value". Fix: `logOddsExists()` handles both.

## Things that are still not the paper

- The number of relations is fixed by `numRels` in the config; the paper describes a
  prior over it and reports roughly 200 discovered relations.
- Sparsity is a constant from the config (`ConstantSparsityGenerator`); the paper puts a
  Beta prior on it. `BetaSparsityGenerator` and `BetaSparsityRV` exist but are unused.
- Split-merge moves exist only for entities. Relations are sampled by single-site Gibbs
  steps. The paper's sentence about smart-dumb/dumb-smart split-merge refers to the
  entity phase.
- `WorldInferSteps` allocates a `FactRV` for every entity pair times relation up front.
  At NYT scale (3000 entities, 100 relations) that is 900 million objects and will not
  fit in memory; it needs to sample potential facts lazily before `config-8000.json`
  can be run.

## Verified

`./build.sh test` with the classes listed in `build.sh` plus `SentencesIndexTest`,
`ModelFunctionsTest` and the other fast unit tests: 30 tests pass. The toy corpus
(`data/06-19/toyTriples.json`) run end to end recovers the two intended relations
(`wrote`/`authored` and `love`/`like`) with correct trigger counts and finite log
probabilities for every term.
