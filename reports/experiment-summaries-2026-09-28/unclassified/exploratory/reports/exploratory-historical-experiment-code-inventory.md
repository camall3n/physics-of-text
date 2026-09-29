# Historical experiment source inventory without an established saved run

Classification remains uncertain: [scope and bug evidence](../BUGS.md) · [evaluation availability](../EVALUATION.md) · [index](../../../README.md).

Reviewed 2026-09-28 by source inspection only. This is an inventory of experimental intent and dormant entry points, not a record that the programs ran successfully. No code was executed or repaired.

## Scope and experiment designs

| Source | Design visible in the file | Evidence status |
|---|---|---|
| [SampleEntropyTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/world/SampleEntropyTest.java) | Commented precursor for Figure 1: 5,000 generated candidate worlds, 10 nouns/objects, 2 relations, 5 paths, sparsity 0.3, old dictionary alpha=0.5, 60 sentences; eight worlds in each of five entropy intervals, 5,000 inference iterations and quarter burn-in; unordered pairs include self-pairs. | Experiment body is entirely commented out. It is provenance for the 2026 port, not proof of a published or surviving original run. |
| [MCMCToyExperiment](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/experiments/MCMCToyExperiment.java) | Commented 10,000-iteration MCMC toy: two nouns A/B, two path observations of A→B, authorship relations, sparsity 0.3, old dictionary alpha=0.2, two sentences; query whether their complete origin facts agree; quarter burn-in. | Active run() throws UnsupportedOperationException. No matched output is established. |
| [RSToyExperiment](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/experiments/RSToyExperiment.java) | Commented rejection-sampling counterpart, 10,000 proposed worlds, same two-sentence setup and same-origin query. | Active run() throws UnsupportedOperationException. No matched output is established. |
| [ToyExperimentTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/experiments/ToyExperimentTest.java) | Commented four repetitions per method; reference probability same=0.671246236978, different=0.328753763022, attributed to simple_bootstrap.py; proposed mean tolerance 0.005. | These are source-quoted expected values, not observed results. The referenced simple_bootstrap.py was not located in the repository file inventory. |
| [EntityExperimentTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/generative_ie/experiments/EntityExperimentTest.java) | Active toy branch creates four entity names and nine mentions: Obama×3, Gates×4, Foo×1, Bar×1; nominal 50 iterations. A separate corpus path declares 1,000 iterations, 100 relations, sparsity 0.0001 and alpha=0.1. | The inference calls are commented out; the active toy primarily builds and prints inputs. Nominal settings are not evidence of a completed sampler run. Historical corpus references include author-specific absolute paths. |
| [BernoulliExperimentTest](../../../../../resources/sampler-140626/src/test/java/org/ucb/dpm/BernoulliExperimentTest.java) | Unseeded Bernoulli-mixture example: external five-component/15-coordinate mixture JSON, n=1,000, alpha=0.1, beta=0.001, sampler version 5, 100 iterations. | Likely family context for the eight output-d* directories, each separately reported. The external input is absent; matching directory parameters alone do not prove producer identity or valid completion. |

## Related saved component diagnostics

The [Dirichlet diagnostic](synthetic-dirichlet-draw-diagnostic.md) and [learned HMM example](synthetic-hmm-learned-model.md) have surviving numeric/model artifacts and their own reports. The [unattributed root log-probability trace](exploratory-unattributed-logprobs.md) is retained as unresolved evidence instead of being assigned to one of these sources. The [world.py exploration](exploratory-world-py.md) is also source-only.

The archived Bernoulli-mixture code clusters binary vectors. No LDA or fitted text-topic-model experiment was identified in the inspected source inventory. The presence of Dirichlet distributions or mixture code alone does not establish a topic-model experiment.

## Provenance, bug status and reproducibility

These sources use obsolete APIs, commented bodies, unsupported entry points or external absolute inputs. Those are visible source-state limitations, not retrospective proof that an earlier historical version never worked. Several instantiate unseeded Random; no per-run seed record or environment fingerprint is associated with these source-only examples. No specific archived executable is established as the exact program used by the paper.

The [modern verification record](../../../../../resources/sampler-140626/results/nyt-2026/evaluation/sampling_fixes.md) explicitly excludes long historical experiments and archive-only tests requiring unavailable HMM/DPM/obsolete logging APIs. Its passing regression count cannot be treated as validation of these dormant programs or as newly executed evidence. Known shared helper defects may be relevant to old consumers, but without a specific producing run their realized effect is unknown.

## Relation to the paper and later review

The entropy precursor supplies concrete historical settings and the self-pair convention relevant to interpreting Figure 1; the toy exact-inference comparison documents intended sanity checks. The entity and Bernoulli sources document development paths. None of the source-only entries independently establishes a paper result, semantic precision, convergence or successful reproduction.

Their review role is a record of experimental intent and available or missing provenance, separate from actual saved runs. This inventory makes no deletion decision.
