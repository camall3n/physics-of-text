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

7. **`MentionRV` sampled a Dirichlet over every noun for every entity on every step**
   (`MentionRV`). It tested the relation-dictionary map for an entity key, which is
   never there, so it "initialised" every entity's noun dictionary with a fresh
   Dirichlet draw each time, over a million gamma draws per step at 1258 entities, and
   never used the result (the step conditions on histograms). It also copied every
   entity's histogram per step. Rewritten as the plain collapsed Gibbs step it was
   meant to be; same conditional, no allocation.

8. **Entity samplers built the full mention listing for debug logging on every
   proposal** (`mh/Entity*`). `logger.debug("...", showMentions())` formats lazily but
   the argument was built eagerly: a string of every mention in the corpus, per
   proposal. Replaced by `Sentences.showMentionsLazily()`.

10. **The observers rescanned the whole corpus per relation per path**
   (`RelationTriggersObserver`, `EntityMentionsObserver`). Building the
   `relation_triggers.txt` listing looped over every sentence once for each (relation,
   path) pair, and the entity listing once per (entity, noun) pair; and the relation
   observer never updated its best score, so it rewrote the file every iteration. At
   8516 sentences these two accounted for half of the running time. Both listings are
   now built in one pass.

9. **The entity phase preallocated one `FactRV` per entity pair per relation**
   (`EntityInferSteps`). It never drew from that list (the fact and sentence-origin
   step weights are zero in the entity phase), but at 1258 entities and a pool of 150
   relations the constructor tried to build 237 million objects and the run hung at
   several gigabytes before the first iteration. Fix: don't build them.

## Inferring the number of relations

The archive fixed the number of relations at `numRels`. The paper puts a broad prior on
it and reports about 200 discovered relations. Three changes make the count a
posterior quantity; every new move is checked against the joint in
`RelationMovesTest`, with constant sparsity and with the Beta prior.

1. **Per-relation sparsity with a Beta(a, b) prior, integrated out** (`World`,
   `WorldProb.logFactTerm`, `FactRV`). Config fields `sparsityA`, `sparsityB`; when
   absent the constant `sparsity` is used as before. This is the paper's model, and it is
   what makes an unused relation affordable: with constant sigma an empty relation
   costs (1 - sigma)^(N^2), which at NYT scale is e^-900.

2. **A relation pool and a prior on how much of it is used** (`World`, `WorldProb`).
   `maxRels` is the pool size (default `numRels`); `numRels` becomes the centre of a
   discrete log-normal prior on the number of relations that have at least one fact,
   the same prior form the entity model uses for N. The inferred relation count is
   reported as `relations_used` (relations with a fact) and `relations_with_sentences`
   (relations expressed somewhere in the text) in `logprobs.txt`.

3. **Moves that can actually change a sentence's relation** (`mcmc` package).
   - `FactRelationMoveStep` transfers a fact with all its sentences to a relation that
     has no fact for that entity pair. Without it a sentence could only switch to a
     relation that already had a fact for its pair, which at corpus scale never
     happens; this is a port of Justin Uang's 2013 `ChangeFactRelationProposal`, with
     the sparsity and relation-count terms added.
   - `FactBirthDeathStep` proposes adding a random potential fact or removing a random
     unreferenced one, with the Metropolis-Hastings correction. It replaces the Gibbs
     scan over all N^2 K potential facts, which needed one object per potential fact
     (900 million at the NYT config) and never revisited existing ones.
   - `WorldInferSteps` now draws these and the sentence-origin Gibbs step on demand.

### Results so far

Toy corpus (10 sentences, two true relations, pool of 8, `test/.../config-toy.json` plus
`sparsityA=1, sparsityB=64`): the posterior over relations with sentences depends on the
dictionary prior `beta`. With `beta=0.01` it is spread over 3 to 6 relations, because a
tiny Dirichlet concentration makes a relation with a single dependency path much more
likely than one with two, which outweighs the sparsity argument for merging `wrote` and
`authored`. With `beta=0.5` the mass moves to 2 or 3 and both intended merges appear.
The paper's bootstrapping argument therefore holds only when the dictionary prior is
not too sparse; `beta` needs to be chosen deliberately.

250-sentence NYT slice (`data/06-19/pluieTriples-1.json`, 265 nouns, 30 paths;
`test/Entity_resolution_Relation/config-250-inferK.json`: 265 entities, pool of 40,
prior centred on 10, `beta=0.1`, Beta(1, 265^2) sparsity, 3000 iterations, 5 minutes):
posterior over relations with sentences concentrated on 24 to 28, still drifting down
at the end of the run. The largest clusters are clean: `appos->director->prep->of` (25
sentences), `appos->chairman->prep->of` (25), `appos->leader->nn` (39),
`appos->president->prep->of` (21 in one relation, 9 in another). The duplicate
president-of relation shows the remaining weakness: merging two relations requires
moving their facts one at a time through unfavourable intermediate states. A
split-merge move over relations (the relation analogue of the entity SDDS samplers) is
the next step for mixing.

## Split-merge over relations

`mcmc/RelationSplitMergeStep` adds the relation analogue of the entity samplers, in the
smart-dumb/dumb-smart style of Wang and Russell (UAI 2015), within the fixed pool:

- a split takes a relation with at least two facts and an empty pool slot and divides
  the facts (each with its sentences) between them; a merge moves every fact of one
  non-empty relation into another, and is refused when they share an entity pair,
  which is exactly what a split can never produce, so the moves are reversible;
- kernel 1 pairs a smart split (facts allocated one at a time by the collapsed trigger
  predictive on each side, in a random order used as an auxiliary variable) with a
  dumb merge (uniform ordered pair); kernel 2 pairs a dumb split (uniform proper
  subset) with a smart merge (pairs weighted by the trigger likelihood gain);
- `RelationSplitMergeTest` checks the joint part of the acceptance against
  `WorldProb`, that the smart-merge probabilities sum to one, and that 2000 steps of
  both kernels keep every invariant and accept both splits and merges.

`WorldInferSteps` includes both kernels at weight 0.2 each, next to the three
single-fact moves at weight 1.

### Effect on the 250-sentence slice (same config as above)

| | fact moves only | with split-merge |
|---|---|---|
| relations with sentences, posterior | 24 to 28, still falling | 22 to 26, settled by iteration 300 |
| best total log probability | -4489 | -4454 |
| president-of | 21 + 9 in two relations | 32 in one |
| acceptance | n/a | splits 46%, merges 51% |

New clusters that only appear with split-merge: economist-at / professor-at /
analyst-at merged into one "works at" relation, chairman-of merged with the
chairman-nn form, spokesman-nn with chief-nn. Director-of is now the one that is
split in two (19 + 18), so fragmentation is reduced, not gone; longer runs and a
less sparse `beta` should help.

## Scaling to the NYT corpus

Profiling the 8516-sentence run with stack samples found the observers (bug 10 above)
and the smart-merge scoring sharing the time. The merge gain
logBetaProb(keep + absorbed) - logBetaProb(keep) is now computed from the absorbed
relation's entries only (`RelationSplitMergeStep.logMergeGain`, checked against the
full recomputation in `RelationSplitMergeTest`). Config gained `stepsPerIteration`
(the archive hard-coded 50 moves per iteration, far too few for thousands of
sentences) and `entityFraction`.

## Noun-aware initialisation and a linear smart merge

`SentenceEvidence.evidenceToWorldByNoun` replaces the archive's initialisation in
`EntityResolution`. The old path sampled every one of the N^2 K potential facts
(`WorldGenerator.sampleFacts`, billions of draws at NYT scale) and then gave each
sentence a uniformly random existing fact, so a sentence's initial entities had nothing
to do with its nouns. The new path starts from `WorldGenerator.emptyWorld()`, gives each
distinct noun string its own entity (spread at random if there are fewer entities than
nouns), each sentence a random relation from the pool, and creates exactly the facts
the sentences need. `SentencesIndexTest.nounAwareInitialisationIsConsistent` checks it.
`evidenceToWorld` is kept for tests.

The smart merge in `RelationSplitMergeStep` now picks the absorbed relation uniformly
and scores only the candidate keepers, O(M) per proposal instead of O(M^2); the
normalisation test still holds.

## Figure 1

`experiments/LexicalEntropyExperiment` is the commented-out 2013 `SampleEntropyTest`
on the current API: 5000 worlds sampled with 10 entities (one noun each), 2 relations,
5 dependency paths, sparsity 0.3, path-dictionary concentration 0.5, 60 sentences;
binned by lexical entropy; eight per bin inferred from their sentences alone (2000
iterations of 10 relation-phase moves, burn-in a quarter) with every sentence pair
queried for "same relation"; precision/recall against the generating world.
`scripts/plot_precision_recall.py` (python3, numpy) plots it. Output of the run on
2026-09-11 is in `results/figure1-2026/` (12 seconds of compute).

The curves order cleanly by entropy: at entropy 0.1, precision 0.96 out to recall 0.6;
at 0.3, 0.95 falling to 0.85 by recall 0.6; at 0.9, 0.65 at recall 0.1 falling to the
0.5 base rate. The paper's figure shows the same ordering but is stronger at the top:
it reports 0.9 precision at 0.1 recall for entropy 0.9. Candidate reasons: the 2013
run's exact sparsity, iteration count and burn-in are unknown, and its inference
used the old MH steps rather than the current moves.

## Things that are still not the paper

- The relation count is inferred within a fixed pool (`maxRels`), not unbounded.
- The entity phase takes most of the running time on the 250-sentence slice.

## Verified

`./build.sh test` with the classes listed in `build.sh` plus `SentencesIndexTest`,
`ModelFunctionsTest` and the other fast unit tests: 30 tests pass. The toy corpus
(`data/06-19/toyTriples.json`) run end to end recovers the two intended relations
(`wrote`/`authored` and `love`/`like`) with correct trigger counts and finite log
probabilities for every term.
