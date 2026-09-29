# Handoff: replicating "The Physics of Text" with the archived sampler

## Maintained evaluation — consolidation 2026-09-29

Use [code/evaluation](code/evaluation/README.md) for NYT evaluation and the separate Figure 1 evaluator. Campaign configuration/calling is separated from algorithms. Top-20 and row-coverage NYT censuses share one parser, predicate loader, judgment validator, fact-scoring loop and reporter. Historical five-fact screens retain an explicitly separate weighted-sampling mode.

From the repository root, `node code/evaluation/cli.mjs list` lists presets; `check --preset nyt-top20` and `check --preset nyt-coverage` revalidate without writing. `render --preset NAME --output-dir NEW_EMPTY_DIR` builds a separate browseable snapshot. Existing study scripts remain compatible callers. No inference or grading was repeated.

The shared semantic checker reports validated primary and effective labels, explicit current/reference populations and full predicate versions. Its v2 output is separate from saved legacy diagnostics. Precision/evidence/grades remain unchanged; see [equivalence and preservation checks](reports/evaluation-consolidation-2026-09-29/README.md). The earlier proposed legacy-integrity patch remains unapplied.

## Current maintained implementation — consolidation 2026-09-28

For new corrected-sampler development, use [code/sampler](code/sampler/README.md).
The two identical entity-multiplicity-fix source trees now resolve to one canonical
src directory there; historical study commands remain available through adapters.
No Java source bytes or saved scientific outputs changed. The existing 91-test
suite and seeded output comparisons passed before/after consolidation. See
[validation and line accounting](experiments/sampler-consolidation-2026-09-28/README.md).
The sections below retain their earlier-stage history; resources/sampler-140626
and the controlled/baseline variants are not the latest maintained corrected tree.


Written for an AI coding agent picking this up cold. Read this, then
`resources/sampler-140626/CHANGES.md` and the linked defect derivations. The
2026-09-11 audit repaired five sampling defect families in the archived tree;
the later entity-count multiplicity repair lives in the maintained tree above.
The historical `nyt-2026-fixed-400` name predates that additional repair and does
not identify a fully corrected latent-entity run. Build dependencies and historical
source snapshots remain available for reproducing the saved experiments.

**Evaluation retirement — 2026-09-28.** Reports and saved grading data were removed
for four confirmed active-bug full-NYT runs: `nyt-2026`, `nyt-2026-fixed-400`, and
`latent_beta01_seed20260912` / `latent_beta01_seed20260913` in the September 12
investigation. The original extra subsidiary assessment and before-fix Figure 1
evaluations were also retired. Raw sampler outputs, including original summaries,
source/configuration provenance, bug documentation and regression tests remain.
Use the [10 retained full-NYT censuses](experiments/nyt-complete-evaluation-2026-09-14/comparison.md)
and the [four corrected β=0.001 models at five coverage targets](experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md)
for current evaluations. See the [cleanup record](reports/buggy-evaluation-cleanup-2026-09-28/README.md).

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

- The maintained [corrected sampler](code/sampler/README.md) includes the five
  earlier sampling repairs and the later entity-count multiplicity correction.
  Fixed-name runs disable the affected entity kernels; corrected latent runs
  include the extra correction. The relation-count prior remains a separate model
  issue, described in section 3.
- Current full-NYT evaluations cover 10 retained runs: fixed-name variants and
  corrected latent-entity variants. The [complete census comparison](experiments/nyt-complete-evaluation-2026-09-14/comparison.md)
  supplies the per-run facts and judgments. The [coverage comparison](experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md)
  evaluates four β=0.001 models at 57%, 60%, 70%, 80% and 90% input-row coverage.
  These are corpus-evidence judgments under declared predicates, not independent
  historical truth labels or a reproduction of the paper's undisclosed rubric.
- Original NYT outputs remain in `results/nyt-2026/` and
  `results/nyt-2026-fixed-400/` under the archived sampler. Their grading reports
  are retired because active sampler defects affected those runs. The latter
  contains the September 11 repairs but still exercised the entity multiplicity bug.
- [Corrected Figure 1 evaluation](resources/sampler-140626/results/figure1-2026-fixed/evaluation.md)
  remains available for all 40 corrected worlds. The [self-pair variant](resources/sampler-140626/results/figure1-2026-self-pairs-included/README.md)
  uses those same worlds, adds 60 certain positives per world, and explicitly places
  self-pairs first among score-one ties. The original before-fix raw PR arrays remain
  as evidence; their derived evaluations and before/after comparisons were removed.
  Saved posterior scores are unavailable, so legacy tie handling remains unresolved.
- The owner intends to port this to another language. Section 9 has notes for that.

There is no BLOG code anywhere in the tar, despite the paper's "10 lines of BLOG".
The Java sampler is a hand-derived Gibbs/MH sampler for one fixed model, written
because BLOG was too slow. Don't go looking for BLOG; don't install it.

## 2. Repository layout

```
HANDOFF.md                                this handoff
code/sampler/                             maintained corrected source and build/run adapters
experiments/nyt-complete-evaluation-2026-09-14/  retained 10-run full-NYT censuses
experiments/nyt-beta-0p001-coverage-2026-09-14/    four corrected models, five coverage targets
world.py                                  exploratory NumPy world sampler, not a full port
resources/
  russell-2016-the-physics-of-text.pdf   the paper
  wang-2015-sdds-mcmc.pdf                 the entity split-merge sampler (UAI 2015)
  yao-2011-structured-relation-discovery.pdf  source of the NYT preprocessing
  nyt_annotated_corpus-2007.pdf            NYT corpus reference
  sampler-140626/                         the code (June 2014 snapshot + our commits)
    CHANGES.md        what we changed and every bug found; read it
    build.sh          javac build/test/run (no Maven)
    src/main/java/org/ucb/generative_ie/   model, samplers, experiments
    src/test/java/...                      JUnit 4 tests
    data/Umass-sub-corpus/pluieTriples_2013_01_06_5.json   the 8516-sentence NYT subset
    data/06-19/pluieTriples-1.json         250-sentence slice used for the small run
    data/06-19/toyTriples.json             10-sentence toy (wrote/authored, love/like)
    test/Entity_resolution_Relation/config-*.json   run configs (see section 5)
    results/nyt-2026/                      our NYT run: config, MAP sentences TSV, logprobs, summary.txt
      evaluation/                         retained bug reports and code-audit evidence; grading retired
    results/figure1-2026/                  original raw PR data; derived evaluations retired
    results/nyt-2026-fixed-400/            partially repaired NYT raw outputs and provenance; grading retired
    results/figure1-2026-fixed/            corrected Figure 1 data, plots and evaluation
    results/figure1-2026-self-pairs-included/  corrected-run variant, 60 self-pairs added
    results/ (other), output-*/            tracked 2013-2014 outputs left by the authors
    target/                               tracked archived binaries, not a current build
    tmp/results.txt                       archived result file
    scripts/plot_precision_recall.py       plots Figure 1 (Python 3, NumPy, matplotlib)
    scripts/summarize_relations.py         largest relations with paths and pairs from a MAP listing
    scripts/graph_precision_recall.py      the authors' plot script (python2, needs scipy)
```

Absent in this checkout: `resources/sampler-140626.tar`, root `venv/`, and the
sampler's `output/` directory. The gitignored `target-javac/` now contains the
corrected source build from verification. If the original tar is obtained again,
do not commit it.
`world.py` also imports seaborn and executes at import time; it is an exploratory
script, not the Java experiment entry point.

Corpus format: JSON `{"sentences":[{"source","dest","depPath"}]}`. Each sentence is
two named-entity strings and a dependency path between them.

## 3. The model as implemented

**Required note for subsequent experiments: `maxRels` is not a neutral capacity
limit.** With M labelled relation slots and fixed entity count N, the current
no-sentence marginal count prior is
`P(K | N) ∝ LognormalWeight(K) × Binomial(K; M, q)`, where
`q = 1 − B(a,b+N²)/B(a,b)` and K counts relations with at least one fact.
For `a=1, b=N²`, q=1/2. Holding `numRels=200` fixed while changing `maxRels`
from 400 to 800 shifts the no-data mean K from about 199 to 399. Keeping 400
therefore retains a strong implicit count preference; it does **not** fix the
documented count-prior mismatch. Sentence evidence can change the posterior.
The historical partially repaired NYT run with **`maxRels=400` and the other saved
settings unchanged** remains in `results/nyt-2026-fixed-400/`. Its grading is retired
because the entity multiplicity defect was still active. Both earlier saved runs
used pool 400; they do not constitute a 400-versus-800 experiment or validate the
intended prior. Keep the pool fixed for further sampler comparisons. A prior correction must be a
separate, explicit model change: draw K first, choose occupied slots, and condition
their fact distributions on being nonempty (or use the equivalent normalized
joint). Dividing out only a combinatorial coefficient is not sufficient in general.
See [the detailed explanation and remaining issues](resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md).

Fixed pool of relations `r`, entities `e` (count N, inferred in the entity phase),
sentences `s` from the corpus.

```
N          ~ discrete log-normal centred on numEnts            WorldProb.logEntityNumber
g(K_used)  = log-normal count factor (not the marginal prior)   WorldProb.logRelationNumber
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
   and smart-merge/dumb-split moves on mention-to-entity assignments, plus collapsed
   Gibbs mention updates (`MentionRV`), each with weight 1. The split-merge moves are
   the SDDS sampler of the UAI 2015 paper. Their logic was preserved while performance
   bugs were fixed. This phase took most of the running time in the smaller runs.
2. **Relation phase** (`mcmc/WorldInferSteps`), a random scan over:
   - `FactBirthDeathStep`: MH birth/death of facts no sentence reports;
   - `SentenceOriginRV`: Gibbs on one sentence's origin (relation, then each argument
     entity) among existing facts;
   - `FactRelationMoveStep`: MH transfer of one fact and all its sentences to a relation
     lacking a fact for that entity pair. This is the move that lets relations form.
   - `RelationSplitMergeStep` (two kernels, weight 0.2 each): split a relation into two
     or merge two relations, smart-dumb/dumb-smart style. This is what makes the
     relation count mix.

Other things to know:

- `world/World`, `Facts`, `Sentences`, `Sentence`, `Mention`: state plus indexes.
  `Sentences.update` is the single mutation path when an origin changes; it maintains
  every histogram and index. Do not add a second path.
- `inference/ObserveProb` writes `logprobs.txt` (every term of the joint per iteration,
  plus `relations_used` and `relations_with_sentences`) and `map_world.txt`.
  `RelationTriggersObserver` now updates `bestProb` and retains the best
  collapsed-trigger snapshot. Historical `relation_triggers.txt` files were normally
  the last observed state because this update was missing. That defect did not affect
  the separate full-joint MAP TSV. Default observer filename guards are fixed too.
- `experiments/ConfigParser`: config fields are listed in section 5.
- `generator/WorldGenerator.sampleWorld()`: generates synthetic worlds for experiments
  and tests. `EntityResolution` instead uses `emptyWorld()` followed by
  `SentenceEvidence.evidenceToWorldByNoun()` to initialize from corpus noun strings.
- Legacy code includes the old proposal classes in `src/test/java/org/ucb/generative_ie/mh/`
  (Justin Uang's 2013 MH framework, superseded). **Do not skip the new
  `EntityProposalRegressionTest` and `MHAcceptanceNumericsTest` there.** Other legacy paths: `mh/BetaSparsityRV`,
  `generator/BetaSparsityGenerator`, `experiments/EntityNumberDistToy`, the `dpm`
  package (UAI paper's DPMM comparison), `RejectionSamplingInferer`.

## 5. Build, test, run

For new corrected runs, use the maintained source from the repository root:

```sh
node code/sampler/build.mjs
node code/sampler/run.mjs experiments/nyt-latent-low-smoothing-2026-09-14/runs/entityfix_latent_beta0001_seed20260912/config.json experiments/nyt-next-corrected
```

The example reuses a saved seeded configuration and requires a fresh output path;
choose an explicit configuration for each new experiment. The runner snapshots
source/runtime classes and defaults to the original 8,516-row corpus. See
[maintained build/run documentation](code/sampler/README.md) for arguments and
[model provenance](experiments/nyt-beta-0p001-coverage-2026-09-14/models/provenance.md)
for saved settings. Fresh runs require fresh case-level judgments.

The commands below describe the historical archived-source build and audits.
That tree contains the September 11 repairs but lacks the later active-entity
multiplicity correction; use it only when that historical implementation is intended.

`build.sh` compiles with `javac` against exact jar versions in
`${M2_REPO:-$HOME/.m2/repository}` when available, otherwise the checked-in fat JAR
supplies dependencies. Maven itself is not required. In this checkout:

- The active and only registered JDK is Temurin 25.0.4.1; Maven is not on `PATH`.
- `~/.m2/repository` is absent. The old build failed on missing JARs and requested
  unsupported Java-7 flags. The updated script falls back to the bundled dependencies
  and compiles for Java 8 (`--release 8` on modern JDKs).
- The checked-in `target/` binaries date from the original archive import; they
  do not contain the subsequent fixes. A current build belongs in `target-javac/`.

An isolated audit build is also available:
`node scripts/audit_sampler_code.mjs` compiles all current main/eligible test sources
with `--release 8`, using `target/generative_ie-1.0-SNAPSHOT-jar-with-dependencies.jar`
only as a dependency bundle. Newly compiled classes take precedence over old classes.
The runner builds in a temporary directory and records 85 passing tests and four
corrected probes in `results/nyt-2026/evaluation/code_fixes/`. Add `--verify-before`
to demonstrate 25 failures among 28 selected tests using the old production classes.
Historical defect outputs remain in `evaluation/code_audit/`. The September 11
NYT and Figure 1 outputs are stored separately from the original results; the
NYT run still predates the entity multiplicity correction.
See `evaluation/sampling_fixes.md` for coverage and counterfactual limits.

Four tests that need the dead `jahmm` dependency are skipped, along with their
`DpmSuite` suite. Working commands:

```
cd resources/sampler-140626
./build.sh                         # compile into target-javac/
./build.sh test                    # WorldProbTest only
./build.sh test org.ucb.generative_ie.mcmc.RelationMovesTest org.ucb.generative_ie.world.SentencesIndexTest
./build.sh run org.ucb.generative_ie.experiments.EntityResolution \
    test/Entity_resolution_Relation/config-toy.json data/06-19/toyTriples.json
```

The current 85-test suite includes these earlier 40 tests:
`RelationSplitMergeTest RelationMovesTest
WorldProbTest SentencesIndexTest ModelFunctionsTest LexEntropyTest SentenceEvidenceTest CounterTest LogProbMapTest
DirichletDistrTest RandomAccessHashSetTest UtilTest CorpusParserTest`.
It also includes the repaired `NormalProbMapTest` and 44 new regression tests.
Run all of them with `node scripts/audit_sampler_code.mjs`; see `code_fixes/run.json`
under `results/nyt-2026/evaluation/` for the exact class list. The old zero-weight
test now expects explicit rejection of an undefined distribution.

Config fields (`ConfigParser`):

| field | meaning |
|---|---|
| `numEnts` | initial entity count; prior centre for N |
| `numRels` | parameter of the log-normal count factor; not the mean of the full marginal count prior |
| `maxRels` | relation pool upper bound and a determinant of the marginal count prior; omitted or nonpositive uses `numRels` |
| `numIterations` | total, split between the phases by `entityFraction` |
| `entityFraction` | share of iterations in the entity phase (default 0.2; 0 skips it) |
| `stepsPerIteration` | MCMC moves per iteration (default 50; use about the sentence count at scale) |
| `alpha`, `beta` | Dirichlet concentrations for noun and path dictionaries |
| `sparsity` | constant sigma when no Beta prior is enabled; noun-aware initialization creates required facts directly |
| `sparsityA`, `sparsityB` | Beta prior on per-relation sparsity; enabled when `sparsityA > 0`, requiring `sparsityB > 0`; otherwise constant sigma |

Configs on disk: `config-toy.json` (archive), `config-8000.json` (the authors' NYT-scale
config: 100 relations, 3000 entities, 50k iterations, alpha=beta=0.001,
sigma=1e-4), `config-250-inferK.json` (our 250-sentence run), `config-nyt-inferK.json`
(our 8516-sentence run; see CHANGES.md for what it produced).

Scale reported after the entity-phase fixes: the 2500-sentence corpus
(`data/06-19/pluieTriples_fgreptest4.json`, 1258 noun strings, pool 150) ran 2000
iterations of 50 moves in under 3 minutes. The entity phase barely merges anything
(the noun-only entity model has no string similarity; the paper's
arguments were verbatim strings too), so `entityFraction` can be small.

Gotchas:

- The Java entry point writes to `output/` relative to its working directory.
  **`build.sh` first changes into its own directory**, so invoking it from a scratch
  directory still writes into the sampler checkout. For an isolated run, use a
  separate copy of the sampler, or invoke `java` directly from a scratch directory
  with absolute classpath, config, and corpus paths. `output/` is currently absent;
  later runs in the same location will overwrite earlier output files.
- `DirichletDistrTest` writes `dirichlet.output` in the sampler root. Run
  that test in a separate copy, or preserve and restore the file's pre-test contents.
- Logging is DEBUG for anything not listed in `src/main/resources/logback.xml`; grep
  `DEBUG|TRACE|++Iteration` out of stdout.
- Outputs: `logprobs.txt` (all joint terms per relation-phase iteration),
  `map_world.txt` (partial listing, up to ten sentence examples per path),
  `map_world_sentences.tsv` (every sentence with its relation; use this for evaluation),
  `relation_triggers.txt` (best collapsed-trigger snapshot after the observer fix,
  potentially different from the best full-joint MAP). `scripts/summarize_relations.py` reads the text listings and deduplicates
  their sentence examples; it does not read TSV or recover full-corpus counts from
  a truncated listing. Saved `summary.txt` and TSV files are preserved raw run
  evidence. Historical summaries may contain retired grading text; they are not
  current evaluation reports.
- Root `venv/` is absent. The configured project interpreter is now `.venv/bin/python`
  (Python 3.9.6), with NumPy 2.0.2 and matplotlib 3.9.4 installed for the new plots.
  `summarize_relations.py` uses only the standard library. Check the IDE's configured
  interpreter before invoking Python tools; the former `venv/` path is still invalid.

For historical archived-source reproduction, the isolated NYT workflow from the
sampler directory remains available (the runner refuses existing output). The
`run_corrected_nyt.mjs` name predates the entity multiplicity correction:

```sh
./build.sh
node scripts/run_corrected_nyt.mjs results/nyt-next-400
node scripts/audit_nyt_rerun.mjs results/nyt-next-400
# Supply fresh case-by-case annotations in that run's evaluation/annotations/.
node scripts/report_nyt_rerun.mjs results/nyt-next-400
```

The reporter validates source hashes, coverage, citations and human overrides.
It does not generate semantic judgments. Do not regenerate reports for the retired
active-bug runs. The retained census and coverage methods document their current
reporting workflows. Exact experiment commands and source fingerprints remain in
each saved run's metadata.

## 6. What was done (details in CHANGES.md)

Commit 6812ca1: reconstructed the relation part of the joint (it was commented out of
`logProb()`), and fixed six bugs in the archive that this exposed: facts and origins
drifting apart between phases, a mention index never cleared (phantom mentions in the
entity phase), the entity step mutating live histograms, the same step squaring the
noun likelihood, stale mention objects after relation-phase moves, and NaN edge cases.

Commit 8a2939a: made the relation count inferable: Beta sparsity integrated out,
relation pool with a log-normal prior on occupancy, the two new moves above, and
`RelationMovesTest`.

Commit 69022c1: `RelationSplitMergeStep` and `RelationSplitMergeTest`, split-merge over
relations with both SDDS kernels, wired into `WorldInferSteps` at weight 0.2 each.
CHANGES.md has the before/after table for the 250-sentence slice.

Commits 20553ed through 651bab8 (same day): noun-aware initialisation
(`SentenceEvidence.evidenceToWorldByNoun`, `WorldGenerator.emptyWorld`); four more
archive bugs that made the entity phase unrunnable at scale (CHANGES.md bugs 7 to
10: a 237-million-object preallocation, a Dirichlet draw over every noun per entity
per step, eager debug strings, observers rescanning the corpus per relation per
path); the Figure 1 experiment (`LexicalEntropyExperiment`); config options
`entityFraction` and `stepsPerIteration`; the MAP-world TSV dump and
`summarize_relations.py`; an incremental smart-merge score with a memoised
log-gamma table (`LogGammaTable`); and the saved NYT and Figure 1 results.

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

250-sentence NYT slice (`config-250-inferK.json`): posterior over relations with
sentences 22 to 26; clean clusters for president-of, chairman-of, leader, and a merged
economist/professor/analyst-at.

The earlier full-NYT results are retained as raw sampler evidence. Their complete
and sampled grading reports were retired for the four active-bug runs listed at
the top of this handoff, together with the original extra subsidiary assessment.
Do not use old precision summaries in raw logs as current evaluation results.

Current results are linked from the [10-run full-NYT comparison](experiments/nyt-complete-evaluation-2026-09-14/comparison.md)
and [four-model coverage comparison](experiments/nyt-beta-0p001-coverage-2026-09-14/comparison.md).
Each distinguishes supported, unsupported and ambiguous facts under its declared
predicate. The endpoints S/N and (S+A)/N describe unresolved labels, not confidence
intervals. Input-row coverage is not gold-fact recall. Corrected Figure 1 results
and the self-pair sensitivity analysis retain their original corrected numerical
outcomes; the [cleanup verification](reports/buggy-evaluation-cleanup-2026-09-28/FIGURE1.md)
records that preservation.

## 8. Recommended next steps, in order

Read section 3's pool-prior note and the retained sampling/entity defect
derivations before changing the model. Keep inference repairs, prior changes and
evaluation conventions separately identifiable.

1. **Review retained judgments.** Start with the 10-run census or four-model
   coverage table, then the relevant per-relation evidence and ambiguity questions.
   Follow that campaign's METHOD.md for human overrides and regeneration. Do not
   recreate retired grades or reuse run-local relation IDs automatically.
2. **Controlled randomness and longer chains.** Use the maintained seeded runner,
   save synthetic worlds for paired comparisons, and run multiple chains before
   claiming convergence or attributing result changes to individual repairs.
   Figure 1's older internal RNGs remain incompletely controlled. Keep the
   relation pool fixed when assessing an inference change.
3. **Figure 1 score ties and original settings.** `PrecisionRecallCurve` groups
   predictions by truth Boolean and ranks tied scores individually, so tie order
   can depend on truth. Save pair scores plus truth, group equal scores at a common
   threshold, and regression-test pair-order invariance. Existing PR arrays lack
   scores, so the retained corrected evaluations preserve the legacy metric.
   `LexicalEntropyExperiment` accepts `[output-file] [worlds-per-bin] [iterations]
   [steps-per-iteration]`; the corrected run used 8, 2000, 10, with 500 burn-in
   iterations and a two-relation pool. Self-pair reconstruction changes the
   candidate universe, not the inference or the score-tie limitation.
4. **Entity inference and semantic mixtures.** The noun-only entity phase uses a
   different target from the full fact phase and lacks string similarity or
   entity-type evidence. Compare fixed-name and corrected latent-entity variants,
   and inspect sentence purity separately from fact support. A supported fact can
   contain unrelated sentence assignments.
5. **Relation-count prior.** Pool 400 does not repair the mismatch; changing to 800
   changes the marginal count preference even below capacity. A count-first
   replacement requires a normalized model, every affected target ratio, and
   no-data count-distribution tests. Section 3 gives the formula and conditioning
   requirement.

## 9. Notes for a port to another language

What is worth keeping: the model in section 3, the collapsed conditionals in
`SentenceOriginRV`, `FactRV`, `FactRelationMoveStep`, the split-merge kernels in
`RelationSplitMergeStep` (with `logMergeGain` and `LogGammaTable`), and the test
discipline in section 6. What is not: the index bookkeeping in
`Sentences` (five multimaps and two histogram maps kept in sync by hand), the
`Mention`/`Sentence`/`Fact` object web, the observer classes, and the entity samplers'
static acceptance counters. A port should keep counts (facts per relation, trigger
histogram per relation, noun histogram per entity, sentences per fact) as the primary
state and derive everything else. `ModelFunctions.logGammaTmp` is just
`lgamma(base + extra) - lgamma(base)` computed by a product loop; replace it.

The entity samplers (`mh/Entity*`) are the hardest part to port faithfully; the UAI
2015 paper describes them, and `EntitySmartSplitStep` is the cleanest of the five.

## 10. Where things are on disk

- Earlier raw outputs remain under `resources/sampler-140626/results/nyt-2026/`,
  `nyt-2026-fixed-400/`, and `figure1-2026/`; retired grades were removed separately.
  Corrected Figure 1 evaluation remains in `figure1-2026-fixed/` and its self-pair
  sibling. Maintained NYT evaluations live under the two campaign directories
  linked above. Saved raw outputs, configs, source archives and bug evidence
  retain their provenance; use the cleanup record for authorized report changes.
  Other archived `results/`, `output-*/`, `target/`, and `tmp/results.txt` remain
  historical material. There is no `output/` directory in this checkout.
- Outputs of the later inference-of-K toy/250/2500 runs were not kept; their numbers
  are in CHANGES.md. Separate imported fixtures do exist under
  `test/Entity_resolution_Relation/all-poss-facts/output-{toy,250,2500}/`.
  The archived 250/2500 listings show 15/50 relation headers, respectively; the
  2500 listing truncates sentence examples. Do not confuse them with the later
  inferred-K runs or the paper's full NYT experiment. See the retained
  [archive scope](experiments/nyt-complete-evaluation-2026-09-14/analysis/archive_scope.md).
- The paper PDFs are present under `resources/`; the extracted paper text is not
  stored. Re-extract it with a configured interpreter and `pypdf` if needed;
  `venv/bin/python3` does not exist in this checkout.
