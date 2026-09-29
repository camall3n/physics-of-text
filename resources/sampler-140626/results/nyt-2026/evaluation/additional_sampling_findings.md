# Additional inference and output findings

Updated 2026-09-11. This report supplements [the original code audit](code_audit.md) and [the sampling fixes](sampling_fixes.md). It covers additional defects found while testing the five sampling defect families. The fixes below change current source; the saved NYT inference output and its annotations have not been regenerated. The earlier audit describes the pre-fix state and should be read as historical evidence.

## Confirmed additional fixes

| Defect and current source | Correction and regression evidence | Relevance to the saved NYT score |
|---|---|---|
| World-taking trigger helpers used noun `alpha`: [ModelFunctions:29](../../../src/main/java/org/ucb/generative_ie/inference/ModelFunctions.java#L29), [121](../../../src/main/java/org/ucb/generative_ie/inference/ModelFunctions.java#L121), [148](../../../src/main/java/org/ucb/generative_ie/inference/ModelFunctions.java#L148) | Both move overloads and the histogram-change overload now use trigger `beta`. Three tests compare their answers with independent `WorldProb.logCollapsedTriggers()` differences, using alpha=0.003 and beta=0.7. A one-way move formerly returned −8.2920558747 instead of −2.5902548075; a two-way move returned −14.1041943740 instead of −3.4775580025. | The active [FactRelationMoveStep:102](../../../src/main/java/org/ucb/generative_ie/mcmc/FactRelationMoveStep.java#L102) already supplies beta explicitly. The wrong overloads were identified in legacy callers, so this fix is not an established explanation for the saved NYT result. |
| Best trigger output was overwritten by later worse states: [RelationTriggersObserver:105](../../../src/main/java/org/ucb/generative_ie/inference/RelationTriggersObserver.java#L105) | Update `bestProb` after saving. A worse → better → worse sequence must retain the middle state's file. | This affects `relation_triggers.txt`. The evaluated `map_world_sentences.tsv` is saved by the separate full-joint MAP observer, whose best-score update was already correct. |
| Default output observers constructed `File(null)` before checking their optional filename: [RelationTriggersObserver:93](../../../src/main/java/org/ucb/generative_ie/inference/RelationTriggersObserver.java#L93), [ObserveProb:43](../../../src/main/java/org/ucb/generative_ie/inference/ObserveProb.java#L43), [EntityMentionsObserver:78](../../../src/main/java/org/ucb/generative_ie/inference/EntityMentionsObserver.java#L78) | Return before filesystem operations when no output directory is configured. Separate tests cover all three observers. Description-only calls remain available. | The NYT experiment constructs its observing instances with `output/`; default instances used by the MAP observer only build descriptions. These crashes did not produce the saved low score. |
| Progress reporting divided by zero for phases with 1–9 iterations: [MCMCInferer:71](../../../src/main/java/org/ucb/generative_ie/inference/MCMCInferer.java#L71) | Use `max(1, numIterations/10)` as the reporting interval. Tests cover 0–9 iterations and verify every requested proposal and observer notification. | Important for short checks and configurations with a short entity phase. The saved phases had 20 and 980 iterations, so this defect did not affect that completed run. |
| Query accumulation discarded one extra sample: [Inferer:42](../../../src/main/java/org/ucb/generative_ie/inference/Inferer.java#L42) | Count samples when `i >= burnin`; require `0 <= burnin <= numIterations`. Tests verify T=1, burn-in=0 retains one sample; T=10, burn-in=3 retains exactly indices 3–9; empty/all-burn-in runs retain zero; invalid inputs fail before sampling. Observers still see every draw. | This affects posterior query estimates, including Figure 1. At T=2,000 and burn-in=500, the old code retained 1,499 rather than 1,500 draws. NYT MAP observers ran on every iteration independently of this query filter, so this does not explain their semantic audit score. |

The trigger concentration is established by [WorldProb:214](../../../src/main/java/org/ucb/generative_ie/world/WorldProb.java#L214): relation paths use beta, while entity noun dictionaries use alpha. The helper correction follows the existing target; it does not introduce a new model.

## Verification

Thirteen focused regression tests pass with assertions enabled:

- [ModelFunctionsWorldParametersTest](../../../src/test/java/org/ucb/generative_ie/inference/ModelFunctionsWorldParametersTest.java): three likelihood-ratio tests, including cancellation in a two-way transfer.
- [InferenceOutputRegressionTest](../../../src/test/java/org/ucb/generative_ie/inference/InferenceOutputRegressionTest.java): six output and short-run tests.
- [InfererBurninTest](../../../src/test/java/org/ucb/generative_ie/inference/InfererBurninTest.java): four query-count and boundary tests.

Validation compiles all current main sources with `javac --release 8`, compiles these tests, and runs JUnit with the fresh classes before the archived fat JAR on the classpath. The JAR supplies dependencies; its old sampler classes are not the code under test. The initial helper/output regression set was also run against unmodified copies of the affected production classes and reproduced the expected failures.

The MAP regression saves fourteen sentence rows for one dependency path and verifies that all remain in the TSV, despite the human-readable description showing at most ten examples per path. It also verifies that every observed score enters the trace and that a later worse state does not replace the best snapshot.

An independent review of the accompanying `LogProbMap`, `NormalProbMap` and `Util` changes found no additional definite defect. Their ten normalization tests also passed. Maximum scaling, zero-mass boundaries and mutation after normalization were checked. The linear normalizer can overflow even when normalized probabilities remain valid; callers needing extreme-scale normalization constants should use log space.

## Unresolved model and experiment limitations

### Occupied relations do not have a lognormal prior alone

[WorldProb:188](../../../src/main/java/org/ucb/generative_ie/world/WorldProb.java#L188) applies a Beta–Bernoulli fact-set prior to every labelled relation slot, then [151](../../../src/main/java/org/ucb/generative_ie/world/WorldProb.java#L151) adds a lognormal factor for occupied slots. For a fixed entity count N, pool size M and no sentences, marginalizing all fact sets gives

`q = 1 − B(a,b+N²)/B(a,b)`

`P(K) ∝ Binomial(K; M,q) × Lognormal(K; configured parameters)`.

With a=1 and b=N², q=1/2. Keeping the configured lognormal mean at 200 while increasing M from 400 to 800 changes the empty-corpus mean occupied count from approximately 199.25 to 398.90. The [original audit](code_audit.md#a-separate-model-mismatch-introduced-by-the-update) records the numerical and exhaustive-world evidence. These calculations condition on fixed N; the saved configuration instead keeps b=1,199² while entity inference can change N.

This is a confirmed target/model-description mismatch, not another transition-ratio bug. The pool is not cosmetic. Correcting it requires choosing a consistent prior and representation and updating all affected probabilities. It was deliberately left unchanged in these fixes; its effect on precision remains unmeasured.

### A supplied seed does not control every draw

[WorldInferSteps:58](../../../src/main/java/org/ucb/generative_ie/mcmc/WorldInferSteps.java#L58) and [EntityInferSteps:81](../../../src/main/java/org/ucb/generative_ie/mcmc/EntityInferSteps.java#L81) create their own `Random` instances. [DirichletDistr:19](../../../src/main/java/org/ucb/generative_ie/random/DirichletDistr.java#L19) uses a static external Gamma RNG, with another unseeded RNG in its underflow fallback. [WorldGenerator:145](../../../src/main/java/org/ucb/generative_ie/generator/WorldGenerator.java#L145) calls this sampler without passing its supplied RNG. The NYT entry point itself uses an unseeded [Random:30](../../../src/main/java/org/ucb/generative_ie/experiments/EntityResolution.java#L30).

Consequently, merely adding or reusing one experiment seed does not make an end-to-end rerun reproducible. This is a reproducibility limitation; it does not by itself prove an incorrect stationary distribution or quantify lost precision.

### Dormant/default APIs need further work

- The [MCMCInferer constructor without explicit steps:23](../../../src/main/java/org/ucb/generative_ie/inference/MCMCInferer.java#L23) instantiates the placeholder `MCMCSteps`; its [iterator:45](../../../src/main/java/org/ucb/generative_ie/mcmc/MCMCSteps.java#L45) returns null steps. A nonempty run through that overload fails. The NYT and Figure 1 entry points supply concrete step collections. Choosing a default kernel would be a separate API decision.
- [World's copy constructor:55](../../../src/main/java/org/ucb/generative_ie/world/World.java#L55) copies facts and sentences but shares entity collections and weighted dictionaries. It is not an independent snapshot for mutations of those shared objects. The MAP writer serializes synchronously, and Figure 1 initializes an empty world rather than using this copy constructor, so no saved-output corruption was established from this limitation.
- Similar nominal proposal budgets do not establish convergence. The archived configuration implies about 2M relation and 500k entity proposals; the saved replication uses 1.96M relation and 40k entity proposals. Kernels, initialization and model assumptions also differ. There is no controlled multi-chain convergence result supporting the saved semantic score.

## Interpreting the roughly 95% versus 50% comparison

The existing top-20 audit has 487 supported, 502 incorrect and 94 ambiguous expressed latent facts. Its 45.0–53.6% range is the stated [corpus-evidence criterion](METHOD.md), not a confidence interval or a reproduction of the paper's unavailable judgment set. Predicate granularity and entity interpretation affect it. For example, chairman-only, analyst-only and corporate-base predicates are stricter than generic leadership, professional affiliation and national association.

Errors strongly concentrate in rare facts: 303 of 502 mismatches have at most two assigned rows. Facts with at least ten rows score 84 supported, 9 incorrect and 6 ambiguous out of 99. Selecting that subset changes the evaluation population; it does not recover the paper's reported precision. Supported facts contain 3,009 of 4,820 rows, but this is not sentence purity: 344 of the 487 supported facts carry mixed-evidence flags. These counts are detailed in [code_audit.md](code_audit.md#why-the-reported-score-looks-especially-low).

The saved TSV passed independent completeness and MAP-consistency checks: all 8,516 original triples appear in order, and its reconstructed noun/path likelihoods agree with the maximum trace entry within 4.6×10⁻⁹. Therefore the observer and helper fixes above should not be advertised as having explained or eliminated the semantic gap. The confirmed active sampling defects warrant correction and controlled reruns, while model choices and annotation choices require separate comparisons. No corrected NYT semantic-precision result is reported here.
