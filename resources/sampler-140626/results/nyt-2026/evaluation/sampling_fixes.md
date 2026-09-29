# Sampling corrections and regression evidence

Implemented and checked on 2026-09-11. [Audit index](README.md) · [Original findings](code_audit.md) · [Additional findings](additional_sampling_findings.md) · [Test output](code_fixes/regression_tests.txt)

**All five requested sampling defect families are fixed in the working tree.** The earlier [code_audit](code_audit/) directory retains the failing behavior; regression results are under [code_fixes](code_fixes/).

**Experiment follow-up (status updated 2026-09-28):** the [NYT run with maxRels=400](../../nyt-2026-fixed-400/README.md) completed after these five fixes but still used the later-discovered entity multiplicity defect. Its evaluation and the pre-fix evaluations have been retired; raw outputs and bug evidence remain. [Retired evaluation status](../../nyt-2026-fixed-400/evaluation/README.md). The [corrected Figure 1 evaluation](../../figure1-2026-fixed/README.md) remains available. The pool-dependent count prior and finite-chain convergence limitations are unchanged. See the [handoff](../../../../../HANDOFF.md).

Source references below identify the corrected files and starting lines. “Old line” refers to revision `13c3605`; source locations move as code changes. Four requested families were inherited from archive import `9489d21`. Fact birth/death was introduced by the update in `8a2939a`. The archive is not verified to be the exact code used for the 2016 paper.

## 1. Fact-deletion proposal omitted unsuccessful searches

**Location:** [FactBirthDeathStep.java:108](../../../src/main/java/org/ucb/generative_ie/mcmc/FactBirthDeathStep.java#L108), `logDeathSearchSuccess`, and acceptance methods at lines 129 and 143. Old selection at line 65; old acceptance calculation at line 103. **Origin: updated implementation.**

The death branch tries at most 20 randomly selected existing facts, stopping at the first unreferenced one. With F existing facts and U unreferenced facts, its success probability is

` s(F,U) = 1 − (1 − U/F)^20 `.

The probability of proposing a particular removable fact is `0.5 × s(F,U)/U`. The previous acceptance formula used `0.5/U`, omitting the probability of aborting the search. The fix keeps the bounded search and adds `log s(F+1,U+1)` to the birth log-acceptance, and subtracts `log s(F,U)` from the death log-acceptance. `log1p` and `expm1` preserve tiny success probabilities. Invalid direct requests, such as deleting a referenced or absent fact, return an impossible-move log probability instead of throwing or producing NaN.

**Experimental implication:** at the saved NYT MAP, F=2,103 and U=43, so search success is only 0.3384557. Omitting this factor favors adding/retaining unused facts relative to the intended MH flow; those facts influence sentence-origin likelihoods and possible future assignments. This establishes a biased transition, not the size of a semantic precision loss.

**Regression evidence:** [FactBirthDeathRegressionTest](../../../src/test/java/org/ucb/generative_ie/mcmc/FactBirthDeathRegressionTest.java) independently sums all 20 possible stopping times and compares target-weighted flows using `WorldProb`. It covers constant and integrated Beta sparsity, referenced-heavy states including 999 referenced facts, reciprocal ratios, tiny U/F, impossible moves, and 200,000 actual forced-death draws. The [probe](code_fixes/fact_proposal_probe.txt) now gives equal forward/reverse flows, both 0.03125; observed deletion rate 0.161040 versus expected 0.161323. The corresponding old flows were 0.03125 and 0.02745073.

## 2. Smart-split reverse selection used inconsistent likelihood signs

**Location:** [EntitySmartSplitStep.java:373](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java#L373), `logProposalRatio`. Old selection at line 153; inconsistent reverse calculation at line 446. **Origin: inherited.**

This kernel selects a split parent with weight `1 / nounLikelihood(parent)`. Its reverse calculation formerly combined positive likelihoods with a normalizer built from inverse likelihoods. The correction recomputes the normalizer over the actual hypothetical post-merge entities, using **negative log likelihood everywhere**. Recomputing also avoids subtracting two nearly equal accumulated weights.

**Experimental implication:** the two-entity A/B fixture gave reverse/forward proposal ratio 0.008219178 instead of 0.6, a factor of 73. That changes entity merge acceptance and can change the entity partition passed into relation discovery. Direction and prevalence in the saved NYT trajectory are not available.

**Regression evidence:** [EntityProposalRegressionTest](../../../src/test/java/org/ucb/generative_ie/mh/EntityProposalRegressionTest.java) calculates small Dirichlet likelihoods independently as products of predictive probabilities, enumerates both ordered merge choices and complementary split assignments, and verifies the ratio 0.6. The split-allocation proposal still intentionally uses `10 × alpha`; tests distinguish that proposal parameter from the target's `alpha` and from trigger `beta`.

## 3. Aborted empty splits still changed the state

**Locations:** [EntitySmartSplitStep.java:178](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartSplitStep.java#L178) and [EntitySmartMergeStep.java:178](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java#L178), plus null guards in `applyProposal` at lines 402/427. Both old early returns were near line 185. **Origin: inherited.**

Returning after selecting an empty entity left a non-null proposal. Its ratio calculation described no entity-count change, but applying it added an entity. Both kernels now call `setNull()` and their application methods leave a null proposal unchanged. Merges with fewer than two entities are also null. Merging two empty entities is null because its reverse would be a forbidden empty-parent split. Splitting a populated parent into one populated and one empty daughter remains allowed, with its reverse merge tested.

**Experimental implication:** the old fixture changed N=2 to N=3 while reporting target ratio 1; the actual entity-target ratio was 0.501376. The fix removes an unintended entity-birth path. All entities at the saved MAP are expressed, but that does not establish whether empty entities occurred during inference.

**Regression evidence:** the entity tests check both kernels, null application, singleton populations, two-empty merges, and one-empty-daughter reversibility. The [corrected probe](code_fixes/entity_probe.txt) reports `null=true`, N=2→2, target ratio 1 for both aborted splits.

## 4. Log-weight accumulation confused log(1) with an empty sum

**Locations:** [LogProbMap.java:49](../../../src/main/java/org/ucb/generative_ie/util/LogProbMap.java#L49), normalization, and line 68, raw-weight sampling; [NormalProbMap.java:38](../../../src/main/java/org/ucb/generative_ie/util/NormalProbMap.java#L38); [Util.java:68](../../../src/main/java/org/ucb/generative_ie/util/Util.java#L68), array normalization, and line 144, log arithmetic. Old log-map accumulator sites were lines 44 and 92. **Origin: inherited.**

Numeric zero is a valid log weight. Using it as an initialization sentinel lost earlier weights whenever their partial linear sum reached 1. Two unit weights normalized to total probability 2. Three weights of 0.5 could sample the first candidate every time.

Both probability maps now scale by the largest weight before summation. Log-map normalization subtracts the maximum and then the small log-total, retaining relative probabilities even with huge common offsets. Raw and normalized sampling use the same categorical distribution. Zero-weight choices are skipped even when the random draw is exactly zero; exact CDF boundaries use the next positive interval. Multiplication invalidates normalization, and repeated normalization is idempotent. `Util.logAdd` handles negative-infinite log-zero, and `logSubtract` uses `expm1` for nearly equal operands.

The defined input domain is finite nonnegative linear weights, or finite log weights plus negative infinity for zero, with at least one positive weight. Empty/all-zero distributions and invalid values fail explicitly. Extremely small probabilities may underflow to zero in floating point; their mass is below representable precision. The linear total returned by `getNorm()` can overflow when the unnormalized total exceeds `Double.MAX_VALUE`, while normalized probabilities remain valid. Multiplying a normalized map applies the factor to its **currently stored weights**; it does not restore the earlier raw scale.

**Experimental implication:** this is directly relevant to Gibbs choices, not just an isolated arithmetic helper. In a valid one-sentence world with three equal-probability relations, old code chose one relation 30,000/30,000 times. After correction the [same probe](code_fixes/sentence_conditional_probe.txt) gives counts 10,025, 10,082, and 9,893. How often the old exact-sum trigger occurred in the full NYT run is unknown.

**Regression evidence:** [ProbabilityNormalizationTest](../../../src/test/java/org/ucb/generative_ie/util/ProbabilityNormalizationTest.java) checks probability sums within floating-point tolerance, individual probabilities against independent linear weights, CDF intervals, 500 seeded weight sets, zero masses, exact boundaries, mutation, invalid inputs, common log offsets up to ±10³⁰⁰, and linear subnormal/maximum weights. [SentenceSamplingRegressionTest](../../../src/test/java/org/ucb/generative_ie/mcmc/SentenceSamplingRegressionTest.java) runs 30,000 actual Gibbs draws in each of equal and unequal fixtures, comparing frequencies with normalized full-joint probabilities. Existing conditional-formula tests remain in the suite.

## 5. Reverse smart-merge normalizers contained a phantom candidate

**Location:** [EntitySmartMergeStep.java:375](../../../src/main/java/org/ucb/generative_ie/mh/EntitySmartMergeStep.java#L375), `logProposalRatio`, especially the conditional normalizers at lines 391–392. Old sites were lines 397 and 419. **Origin: inherited.**

Initializing a conditional log sum to zero introduced a unit-weight candidate when the loop had no other entities. These normalizers are separate from `LogProbMap`; correcting only that class was insufficient. Each reverse conditional now starts with the real opposite daughter and adds only other eligible entities. The first-entity normalizer is likewise recomputed over the proposed population, and both possible merge orders are summed.

**Experimental implication:** splitting a single A/B entity formerly gave ratio 0.08 instead of 2, a factor of 25. This changes how strongly the chain accepts an entity split. It does not by itself quantify NYT degradation.

**Regression evidence:** the entity suite verifies the ratio 2, independent forward/reverse probabilities across 192 sampled small-world proposals, unequal alpha/beta, entity-target differences, reciprocal proper split/merge ratios, and mention/histogram indexes after application. Target checks use the entity phase's noun-and-count target, not the relation phase's full fact target.

## Related defects caught and corrected

- **Ratio evaluation mutated the proposal.** Repeated calls added split multiplicity factors again. Entity proposal log-ratios are now cached and idempotent. Histograms and mention lists are snapshots so application cannot alter the stored proposal. Entity regressions query ratios repeatedly and after application.
- **MH overflow/underflow.** [GeneralMHStep.java:29](../../../src/main/java/org/ucb/generative_ie/mh/GeneralMHStep.java#L29) formerly multiplied exponentiated target and proposal ratios. A legitimate `exp(-1000) × exp(1000)` became `0 × infinity = NaN`. Active smart entity proposals now expose log ratios through [MHProposal](../../../src/main/java/org/ucb/generative_ie/mh/MHProposal.java), and acceptance compares `log(U)` with `min(0, logTargetRatio + logProposalRatio)`. [MHAcceptanceNumericsTest](../../../src/test/java/org/ucb/generative_ie/mh/MHAcceptanceNumericsTest.java) covers cancelling extremes, finite and zero acceptance, null moves, and fail-fast NaN handling. Legacy subclasses without log overrides still have their old ratio-range limitations.
- **Tiny reverse relation probabilities were truncated.** [RelationSplitMergeStep.java:467](../../../src/main/java/org/ucb/generative_ie/mcmc/RelationSplitMergeStep.java#L467) treated a log probability between −10⁻¹² and zero as exactly zero when computing its complement. It now uses stable `log(-expm1(x))`; [RelationNumericsTest](../../../src/test/java/org/ucb/generative_ie/mcmc/RelationNumericsTest.java) checks near-zero boundaries against independent expected values. An old result of negative infinity becomes −29.933606208922594 for the probe input.
- **Empty-corpus scheduling.** [WorldInferSteps.java:61](../../../src/main/java/org/ucb/generative_ie/mcmc/WorldInferSteps.java#L61) could select a nonexistent sentence and call `nextInt(0)`. Its origin-step weight is now zero for an empty corpus. [WorldInferStepsEmptyCorpusTest](../../../src/test/java/org/ucb/generative_ie/mcmc/WorldInferStepsEmptyCorpusTest.java) runs 400 moves under each sparsity model, checking finite target/acceptance and state consistency.
- **Wrong alpha/beta helper overloads, best-snapshot tracking, default observer filenames, short-run progress and burn-in counting** are fixed and covered by additional regressions. See [additional_sampling_findings.md](additional_sampling_findings.md) for locations, implications and remaining issues.

## Reproduce the verification

From `resources/sampler-140626`:

```sh
node scripts/audit_sampler_code.mjs --verify-before
```

The [runner](../../../scripts/audit_sampler_code.mjs) compiles all current main sources and eligible tests with Java 8 compatibility, placing fresh classes before the archived dependency JAR. It runs 85 tests and four diagnostic probes in a temporary directory. Long historical experiments and archive-only tests needing unavailable HMM/DPM/obsolete logging APIs are not part of this suite. Outputs, including the selected classes and Java version, are in [code_fixes](code_fixes/). The standard `build.sh` also supports the archived dependency bundle when the separate Maven cache is unavailable; its run classpath prioritizes current classes.

**Current result: 85 tests pass; all four probes pass.** With `--verify-before`, the runner then overlays the seven relevant pre-fix production classes from `13c3605` and reruns 28 selected regressions: **25 fail**. [Before output](code_fixes/before_regression_tests.txt). Two failures concern the new fact-search helper not existing in that revision; they are API differences, not independent defect evidence. The existing-API flow, null-move, ratio, normalization, MH-numerics and Gibbs-frequency failures demonstrate the old incorrect behavior. This counterfactual is a selected-class regression check, not a reconstruction of a full historical run.

A focused invocation is also available, for example:

```sh
node scripts/audit_sampler_code.mjs util.ProbabilityNormalizationTest mh.EntityProposalRegressionTest
```

The tests establish the checked formulas, categorical distributions and state invariants on these fixtures. They do not establish convergence or semantic accuracy on NYT.

## What remains relevant to the 95% versus roughly 50% comparison

The strongest unresolved implementation/model issue is the **relation-pool prior**: integrating facts gives `P(K) ∝ Binomial(K; M,q) × Lognormal(K)`, rather than the documented lognormal count prior alone. Doubling the pool can therefore materially alter the preferred occupied relation count even without hitting its cap. The exact-target probe continues to demonstrate this; it was deliberately not changed as part of a sampling correction. A coherent alternative requires choosing the model and changing the target and affected ratios together.

Other remaining factors are the noun-only latent entity model versus the paper's verbatim argument setup, much fewer entity proposals in the saved run, incomplete seed propagation, and the audit's different evidence/rubric. Of 502 mismatches, 303 have at most two assigned rows; facts with at least ten rows score 84.8–90.9% under the same ambiguity treatment. These overlapping frequency subsets help locate the errors but changing the population would not reproduce the paper's evaluation.

The next causal comparison should use the same corpus, budgets, initialization and rubric, controlled randomness across all components, and separate experiments for the sampling fixes, count prior and entity representation. Existing saved annotations apply to the saved pre-fix TSV only. A corrected run needs its own evaluation. See [additional findings](additional_sampling_findings.md) and [the original audit](code_audit.md) for the supporting evidence and unresolved limits.
